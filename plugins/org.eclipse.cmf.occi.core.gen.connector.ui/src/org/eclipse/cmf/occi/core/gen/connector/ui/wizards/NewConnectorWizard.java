/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.core.gen.connector.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.OcciCoreConstants;
import org.eclipse.cmf.occi.core.gen.connector.services.GenUtils;
import org.eclipse.cmf.occi.core.gen.connector.ui.Activator;
import org.eclipse.cmf.occi.core.gen.connector.ui.common.GenerateAll;
import org.eclipse.cmf.occi.core.gen.emf.OCCIExtension2Ecore;
import org.eclipse.cmf.occi.core.util.Occi2Ecore;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jface.dialogs.MessageDialog;
// FIXME import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.pde.internal.ui.wizards.tools.ConvertProjectToPluginOperation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * The wizard to create a new OCCI connector project.
 *
 * @author Philippe Merle - Inria
 */
public class NewConnectorWizard extends BasicNewProjectResourceWizard {

	private CheckboxTableViewer refExtensionViewer;

	private final class NewExtensionWizardPage extends WizardNewProjectCreationPage {

		private NewExtensionWizardPage(String pageName) {
			super(pageName);
		}

		@Override
		public void createControl(Composite parent) {
			super.createControl(parent);
			Composite control = (Composite) getControl();

			Composite extensionGroup = new Composite(control, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			extensionGroup.setLayout(layout);
			extensionGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			Label refOccieLabel = new Label(extensionGroup, SWT.NONE);
			refOccieLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true));
			refOccieLabel.setText(Messages.NewConnectorWizard_RefExtensionLabel);
			refOccieLabel.setFont(parent.getFont());

			Composite composite = new Composite(extensionGroup, SWT.NULL);
			GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
			composite.setLayoutData(layoutData);
			TableColumnLayout tableLayout = new TableColumnLayout();
			composite.setLayout(tableLayout);

			Table table = new Table(composite,
					SWT.CHECK | SWT.SINGLE | SWT.BORDER | SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL);
			refExtensionViewer = new CheckboxTableViewer(table);

			refExtensionViewer.setContentProvider(ArrayContentProvider.getInstance());

			refExtensionViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					setPageComplete(validatePage());
				}
			});

			Collection<String> registeredExtensions = new ArrayList<String>(
					OcciRegistry.getInstance().getRegisteredExtensions());
			// removed the OCCI core extension as it is added by default.
			registeredExtensions.remove(OcciCoreConstants.OCCI_CORE_SCHEME);
			refExtensionViewer.setInput(registeredExtensions);
		}

		@Override
		protected boolean validatePage() {
			// TODO add error messages
			return super.validatePage() && refExtensionViewer.getCheckedElements().length == 1 ;//&& newProjectPage.getProjectName().matches("([a-z\\_]{1}[a-z0-9\\_]*(\\.[a-z\\_]{1}[a-z0-9\\_]*)*)");
		}
	}

	protected NewExtensionWizardPage newProjectPage;

	/**
	 * Create a default model then select it in the explorer and switch to
	 * modeling perspective. The project, the rootObjectName and the
	 * newUmlModelFileName must be initialized before calling the performFinish
	 * method. {@inheritDoc}
	 */
	@Override
	public boolean performFinish() {
		try {
			getContainer().run(false, false, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					try {
						String selectExtensionScheme = (String)refExtensionViewer.getCheckedElements()[0];
						createConnectorJavaProject(newProjectPage.getProjectName(), selectExtensionScheme, monitor);
					} catch (CoreException e) {
						Activator.getDefault().getLog()
								.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
					}
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			//Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
			MessageDialog.openError(null, "OCCI Studio problem", e.getMessage());
		}
		return true;
	}

	private void createConnectorJavaProject(String connectorProjectName, String extensionScheme, IProgressMonitor monitor) throws CoreException, InterruptedException
	{
		String extensionFile = OcciRegistry.getInstance().getFileURI(extensionScheme);
		String[] args = extensionFile.split("\\/");
		
		//Added to get the extension and thus convert the extension name to epackage name
		//if(EPackage.Registry.INSTANCE.getEPackage(Occi2Ecore.convertOcciScheme2EcoreNamespace(extensionScheme))==null)
		//	throw new InterruptedException("The metamodel of the OCCI " +getExtension(extensionFile).getName() +" extension is not registered");
		// Get the file containing the OCCI extension.

		// This connector project will require the bundle containing the OCCI extension.
		// Warning extensionFile must be a platform URI (plugin or resource).
		String tmp = extensionFile.substring("platform:/".length()); 
		tmp = tmp.substring(tmp.indexOf('/')+1);
		String requireBundle = tmp.substring(0, tmp.indexOf('/'));
		// FIXME we suppose that the project name is equals to the bundle name. 
		IProject requireProject = ResourcesPlugin.getWorkspace().getRoot().getProject(requireBundle);

		// See https://sdqweb.ipd.kit.edu/wiki/JDT_Tutorial:_Creating_Eclipse_Java_Projects_Programmatically

		// Create an Eclipse project.
		IProject connectorProject = ResourcesPlugin.getWorkspace().getRoot().getProject(connectorProjectName);
		connectorProject.create(null);
		connectorProject.open(null);

		// Because we need a java project, we have to set the Java nature to the created project:
		IProjectDescription description = connectorProject.getDescription();
		description.setNatureIds(new String[] { JavaCore.NATURE_ID });
		connectorProject.setDescription(description, null);

		// Now we can create our Java project
		IJavaProject javaProject = JavaCore.create(connectorProject); 

		// However, it's not enough if we want to add Java source code to the project. We have to set the Java build path:

		// (1) We first specify the output location of the compiler (the bin folder):
		IFolder binFolder = connectorProject.getFolder("bin");
		binFolder.create(false, true, null);
		javaProject.setOutputLocation(binFolder.getFullPath(), null);

		// (2) Define the class path entries.
		IClasspathEntry[] entries = new IClasspathEntry[ (requireProject.exists()) ? 3 : 2];

		// Add JRE System Library.
		entries[0] = JavaRuntime.getDefaultJREContainerEntry();

		// (3) We have not yet the source folder created:
		IFolder sourceFolder = connectorProject.getFolder("src-gen");
		sourceFolder.create(false, true, null);

		// (4) Now the created source folder should be added to the class entries of the project, otherwise compilation will fail:
		IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
		entries[1] = JavaCore.newSourceEntry(root.getPath());

        // Add the extension project.
		if(requireProject.exists()) {
			entries[2] = JavaCore.newSourceEntry(requireProject.getFullPath());
		}

		// (5) Set the Java build path.
		javaProject.setRawClasspath(entries, null);

		// Convert this project to a plugin project.
		try {
			new ConvertProjectToPluginOperation(new IProject[] { connectorProject }, false).run(monitor);
		} catch (InvocationTargetException | InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Generate META-INF/MANIFEST.MF
		IFile manifest = PDEProject.getManifest(connectorProject);
		String manifestContent =
			"Manifest-Version: 1.0\n" +
			"Bundle-ManifestVersion: 2\n" +
			"Bundle-Name: " + connectorProjectName + "\n" +
			"Bundle-SymbolicName: " + connectorProjectName + ";singleton:=true\n" +
			"Bundle-Version: 1.0.0.qualifier\n" +
			"Bundle-ClassPath: .\n" +
			"Bundle-Vendor: OCCIware\n" +
//			"Bundle-Localization: plugin\n" + // FIXME generate plugin.properties
			"Bundle-RequiredExecutionEnvironment: JavaSE-1.8\n" +
			"Bundle-ActivationPolicy: lazy\n" +
			"Require-Bundle: org.slf4j.api,\n" +
			" org.eclipse.cmf.occi.core,\n" +
			" " + requireBundle + ",\n" + 
			" org.eclipse.osgi,\n" + 
			" org.eclipse.swt,\n" + 
			" org.eclipse.ui.workbench,\n" + 
			" org.eclipse.equinox.app,\n" + 
			" org.apache.log4j\n" +
			"Export-Package: " + connectorProjectName + "\n"+
			"Bundle-Activator: "+ connectorProjectName +".Activator\n"+
			"Import-Package: org.eclipse.core.runtime\n"+
			"Automatic-Module-Name: "+connectorProjectName+
			"\n";
		manifest.setContents(new ByteArrayInputStream(manifestContent.getBytes()), true, false, monitor);

		// Generate build.properties
		IFile build = PDEProject.getBuildProperties(connectorProject);
		String buildContent =
				"# Copyright (c) 2016-2017 Inria\n" +
				"#\n" +
				"# All rights reserved. This program and the accompanying materials\n" +
				"# are made available under the terms of the Eclipse Public License v1.0\n" +
				"# which accompanies this distribution, and is available at\n" +
				"# http://www.eclipse.org/legal/epl-v10.html\n" +
				"#\n" +
				"# Contributors:\n" +
				"# - Philippe Merle <philippe.merle@inria.fr>\n" +
				"# - Faiez Zalila <faiez.zalila@inria.fr>\n" +
				"#\n" +
				"\n" +
				"source.. = src-gen/\n" +
				"output.. = bin/\n" +
				"bin.includes = META-INF/, plugin.xml, .\n";
		build.setContents(new ByteArrayInputStream(buildContent.getBytes()), true, false, monitor);

		// Generate plugin.xml
		IFile pluginXML = PDEProject.getPluginXml(connectorProject);
		String pluginContent =
			"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
			"<?eclipse version=\"3.0\"?>\n" +
			"<!--\n" +
			"  Copyright (c) 2016-2017 Inria\n" +
			"\n" +
			"  All rights reserved. This program and the accompanying materials\n" +
			"  are made available under the terms of the Eclipse Public License v1.0\n" +
			"  which accompanies this distribution, and is available at\n" +
			"  http://www.eclipse.org/legal/epl-v10.html\n" +
			"\n" +
			"  Contributors:\n" +
			"  - Philippe Merle <philippe.merle@inria.fr>\n" +
			"  - Faiez Zalila <faiez.zalila@inria.fr>\n" +
			"-->\n" +
			"<plugin>\n" +
			"\n" +
			"   <!-- Register the factory of this connector. -->\n" +
			"   <extension point=\"org.eclipse.emf.ecore.factory_override\">\n" +
			"      <factory\n" +
			"            uri=\"" + Occi2Ecore.convertOcciScheme2EcoreNamespace(extensionScheme) + "\"\n" +
			"            class=\"" + connectorProjectName + ".ConnectorFactory\"/>\n" +
			"   </extension>\n" +
			"\n" +
			"</plugin>\n";
		pluginXML.create(new ByteArrayInputStream(pluginContent.getBytes()), true, monitor);
		
		// Generate log4j.properties
		IFile logger = PDEProject.getBundleRelativeFile(connectorProject, new Path("log4j").addFileExtension("properties"));
		String loggerContent = "##\n" + 
				" # Copyright (c) 2016-2018 Inria\n" + 
				" #  \n" + 
				" # All rights reserved. This program and the accompanying materials\n" + 
				" # are made available under the terms of the Eclipse Public License v1.0\n" + 
				" # which accompanies this distribution, and is available at\n" + 
				" # http://www.eclipse.org/legal/epl-v10.html\n" + 
				" # \n" + 
				" # Contributor:\n" + 
				" # - Faiez Zalila <faiez.zalila@inria.fr>\n" + 
				" #\n" + 
				" # Generated at "+new Date().toString()+" by org.eclipse.cmf.occi.core.gen.connector\n" + 
				"##\n" + 
				"# Set root logger level to DEBUG and its only appender to A1.\n" + 
				"log4j.rootLogger=DEBUG, A1\n" + 
				"\n" + 
				"# A1 is set to be a ConsoleAppender.\n" + 
				"log4j.appender.A1=org.apache.log4j.ConsoleAppender\n" + 
				"\n" + 
				"# A1 uses PatternLayout.\n" + 
				"log4j.appender.A1.layout=org.apache.log4j.PatternLayout\n" + 
				"log4j.appender.A1.layout.ConversionPattern=%-4r [%t]  %-5p %c %x - %m%n";
		logger.create(new ByteArrayInputStream(loggerContent.getBytes()), true, monitor);
		
		// Generate Java code for the connector.
		try {
			URI modelURI = URI.createURI(extensionFile, true);
			
			// Generate Java code for the connector.
			IContainer target = connectorProject.getFolder("src-gen");
			
			// Compute the arguments of the generator.
			ArrayList<String> arguments = new ArrayList<String>();
			
			// The full name of the package to generate.
			arguments.add(connectorProjectName);
			
			// The full name of the package to extend. Changed instead of requireBundle
			//arguments.add(OCCIExtension2Ecore.formatExtensionName(extension));
			arguments.add(args[args.length-3]);
			
			// Call the generator.
			GenerateAll generator = new GenerateAll(modelURI, target, arguments);
			generator.doGenerate(monitor);
		} catch (IOException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		} finally {
			connectorProject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		}
	}

	private Extension getExtension(String extensionFile) {
		URI model = URI.createURI(extensionFile, true);
		
		//Added to get the extension and thus convert the extension name to epackage name
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(model, true);
		return (Extension) resource.getContents().get(0); 
		
	}

	@Override
	public void addPages() {
		// we're not calling the super as we want to control the project
		// creation, we don't want the default
		// page.
		// super.addPages();

		newProjectPage = new NewExtensionWizardPage(Messages.NewConnectorWizard_PageName);
		newProjectPage.setInitialProjectName(""); //$NON-NLS-1$
		newProjectPage.setTitle(Messages.NewConnectorWizard_PageTitle);
		newProjectPage.setDescription(Messages.NewConnectorWizard_PageDescription);
		addPage(newProjectPage);
	}
}
