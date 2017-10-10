package org.eclipse.cmf.occi.core.gen.design.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.design.utils.WizardUtils;
import org.eclipse.cmf.occi.core.gen.emf.ConverterUtils;
import org.eclipse.cmf.occi.core.util.Occi2Ecore;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DesignerGeneratorAction implements IObjectActionDelegate {

	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(DesignerGeneratorAction.class);

	private static final String ECORE_PLATFORM_URI = "platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore";

	private static final String CORE_GEN_PACKAGE_URI = "platform:/plugin/org.eclipse.cmf.occi.core/model/OCCI.genmodel";

	private ISelection selection;

	private ResourceSet resourceSet = new ResourceSetImpl();

	private Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();;

	/**
	 * Constructor for Action1.
	 */
	public DesignerGeneratorAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		IFile occieFile = (IFile) ((IStructuredSelection) selection).getFirstElement();
		try {
			String designName = occieFile.getName().replace(".occie", ".odesign");
			String designProjectName = occieFile.getProject().getName() + ".design";
			registerExtension(occieFile);
			IProject project = generateDesignProject(occieFile.getLocation().toString(), designName, designProjectName,
					new NullProgressMonitor());// TODO fix monitor

			// generateDesignTestProject(project, extensionName, new
			// NullProgressMonitor());// TODO
			// fix
			// monitor

		} catch (IOException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
	}

	private void registerExtension(IFile occieFile) {
		String extensionPath = occieFile.getFullPath().toString();
		URI uri = URI.createPlatformResourceURI(extensionPath, true);

		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(uri, true);

		Extension extension = (Extension) r.getContents().get(0);
		if (!OcciRegistry.getInstance().getRegisteredExtensions().contains(extension.getScheme())) {
			OcciRegistry.getInstance().registerExtension(extension.getScheme(), uri.toString());
			LOGGER.debug("Registered OCCI extension " + extension.getScheme());
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	private IProject generateDesignProject(String occieLocation, String designName, String designProjectName,
			final IProgressMonitor monitor) throws CoreException, IOException {

		// Load the ecore file.
		String ecoreLocation = occieLocation.replace(".occie", ".ecore");
		URI ecoreURI = URI.createFileURI(ecoreLocation);
		// Create a new resource set.
		ResourceSet resourceSet = new ResourceSetImpl();
		// Load the OCCI resource.
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(ecoreURI, true);
		// Return the first element.
		EPackage ePackage = (EPackage) resource.getContents().get(0);

		String extensionScheme = Occi2Ecore.convertEcoreNamespace2OcciScheme(ePackage.getNsURI());

		// Register the ePackage to avoid an error when trying to open the generated
		// .odesign file,
		EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);

		
		URI occieURI = URI.createFileURI(occieLocation);
		
		/*
		 * Create design project
		 */
		IProject project = DesignerGeneratorUtils.genDesignProject(designProjectName, designName, extensionScheme,
				new ProgressMonitorDialog(shell));

		/*
		 * Create design model
		 */
		org.eclipse.cmf.occi.core.gen.design.main.Generate generator = new org.eclipse.cmf.occi.core.gen.design.main.Generate(
				occieURI, project.getFolder("description").getLocation().toFile(), new ArrayList<String>());
		generator.doGenerate(BasicMonitor.toMonitor(monitor));
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		return project;
	}

	private void generateDesignTestProject(IProject project, String extensionName, final IProgressMonitor monitor)
			throws CoreException, IOException, WorkbenchException {
		/*
		 * Create design test project
		 */
		IProject testProject = DesignerGeneratorUtils.genDesignTestProject(project, monitor);

		/*
		 * Create design representation
		 */
		final Resource resource = resourceSet.createResource(URI.createURI(
				"platform:/resource/" + testProject.getFullPath() + "/sample." + extensionName.toLowerCase()));
		resource.getContents().add(OCCIFactory.eINSTANCE.createConfiguration());
		resource.save(Collections.EMPTY_MAP);

		// switch perspective
		PlatformUI.getWorkbench().showPerspective("org.eclipse.sirius.ui.tools.perspective.modeling",
				PlatformUI.getWorkbench().getActiveWorkbenchWindow());

		final Session session = ModelingProject.asModelingProject(testProject).get().getSession();
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
					@Override
					protected void doExecute() {
						session.addSemanticResource(resource.getURI(), monitor);
					}
				});

		WizardUtils.enableViewpoint(session,
				"viewpoint:/" + project.getName() + '/' + ConverterUtils.toU1Case(extensionName) + "Configuration");
		String diagramInstanceName = "Sample " + extensionName;
		EObject root = WizardUtils.getRoot(session, resource.getURI());
		WizardUtils.openDiagram(monitor, testProject, "Configuration Diagram", diagramInstanceName, root);

		project.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

}
