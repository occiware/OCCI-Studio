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
package org.eclipse.cmf.occi.core.gen.connector.ui.popupMenus;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.cmf.occi.core.Extension;
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
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.pde.internal.ui.wizards.tools.ConvertProjectToPluginOperation;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Connector code generation.
 */
public class RegenerateConnectorAction implements IObjectActionDelegate {

	// added selection attribute
	private Shell shell;
	private ISelection selection;

	public RegenerateConnectorAction() {
		super();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.shell = targetPart.getSite().getShell();
		// MessageDialog.openError(shell, "OCCI Studio problem", "test");
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
		IRunnableWithProgress operation = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor) throws InterruptedException {
				IProject project = (IProject) ((IStructuredSelection) selection).getFirstElement();
				try {
					createConnectorJavaProject(project.getName(), monitor);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		try {
			PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
		} catch (InvocationTargetException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		} catch (InterruptedException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
			MessageDialog.openError(shell, "OCCI Studio problem", e.getMessage());
		}
	}

	private void createConnectorJavaProject(String connectorProjectName, IProgressMonitor monitor)
			throws CoreException, InterruptedException {
		
		// Create an Eclipse project.
		IProject connectorProject = ResourcesPlugin.getWorkspace().getRoot().getProject(connectorProjectName);
		
		// connectorProject.create(null);
		connectorProject.open(null);

		// Generate plugin.xml
		IFile pluginXML = PDEProject.getPluginXml(connectorProject);
		if(!pluginXML.exists())
			throw new InterruptedException("The selected project is not a Plug-in Project");
		if (!getExtensionFactoryClass(pluginXML).equals("ConnectorFactory"))
			throw new InterruptedException("The selected project is not a Connector Project");

		// Get the file containing the OCCI extension.
		String extensionScheme = getExtensionScheme(pluginXML);	
		String extensionFile = OcciRegistry.getInstance().getFileURI(extensionScheme);
		if (extensionFile==null)
			throw new InterruptedException("The OCCI extension is not registered");
		String[] args = extensionFile.split("\\/");
		// This connector project will require the bundle containing the OCCI
		// extension.
		// Warning extensionFile must be a platform URI (plugin or resource).
		String tmp = extensionFile.substring("platform:/".length());
		tmp = tmp.substring(tmp.indexOf('/') + 1);
		String requireBundle = tmp.substring(0, tmp.indexOf('/'));
		// FIXME we suppose that the project name is equals to the bundle name.
		IProject requireProject = ResourcesPlugin.getWorkspace().getRoot().getProject(requireBundle);

		// See
		// https://sdqweb.ipd.kit.edu/wiki/JDT_Tutorial:_Creating_Eclipse_Java_Projects_Programmatically

		// Because we need a java project, we have to set the Java nature to the
		// created project:
		IProjectDescription description = connectorProject.getDescription();
		description.setNatureIds(new String[] { JavaCore.NATURE_ID });
		connectorProject.setDescription(description, null);

		// Now we can create our Java project
		IJavaProject javaProject = JavaCore.create(connectorProject);

		// However, it's not enough if we want to add Java source code to the
		// project. We have to set the Java build path:

		// (1) We first specify the output location of the compiler (the bin
		// folder):
		IFolder binFolder = connectorProject.getFolder("bin");
		javaProject.setOutputLocation(binFolder.getFullPath(), null);

		// (2) Define the class path entries.
		IClasspathEntry[] entries = new IClasspathEntry[(requireProject.exists()) ? 3 : 2];

		// Add JRE System Library.
		entries[0] = JavaRuntime.getDefaultJREContainerEntry();

		// (3) We have not yet the source folder created:
		IFolder sourceFolder = connectorProject.getFolder("src-gen");

		// (4) Now the created source folder should be added to the class
		// entries of the project, otherwise compilation will fail:
		IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
		entries[1] = JavaCore.newSourceEntry(root.getPath());

		// Add the extension project.
		if (requireProject.exists()) {
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
		String manifestContent = "Manifest-Version: 1.0\n" + "Bundle-ManifestVersion: 2\n" + "Bundle-Name: "
				+ connectorProjectName + "\n" + "Bundle-SymbolicName: " + connectorProjectName + ";singleton:=true\n"
				+ "Bundle-Version: 1.0.0.qualifier\n" + "Bundle-ClassPath: .\n" + "Bundle-Vendor: OCCIware\n" +
				// "Bundle-Localization: plugin\n" + // FIXME generate
				// plugin.properties
				"Bundle-RequiredExecutionEnvironment: JavaSE-1.8\n" + "Bundle-ActivationPolicy: lazy\n"
				+ "Require-Bundle: org.slf4j.api,\n" + " org.eclipse.cmf.occi.core,\n" + " " + requireBundle + ",\n" + 
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
		String buildContent = "# Copyright (c) 2016-2017 Inria\n" + "#\n"
				+ "# All rights reserved. This program and the accompanying materials\n"
				+ "# are made available under the terms of the Eclipse Public License v1.0\n"
				+ "# which accompanies this distribution, and is available at\n"
				+ "# http://www.eclipse.org/legal/epl-v10.html\n" + "#\n" + "# Contributors:\n"
				+ "# - Philippe Merle <philippe.merle@inria.fr>\n"
				+ "# - Faiez Zalila <faiez.zalila@inria.fr>\n" + "#\n" + "\n" 
				+ "source.. = src-gen/\n"
				+ "output.. = bin/\n" + "bin.includes = META-INF/, plugin.xml, .\n";
		build.setContents(new ByteArrayInputStream(buildContent.getBytes()), true, false, monitor);

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
		pluginXML.setContents(new ByteArrayInputStream(pluginContent.getBytes()), true, false, monitor);
		
		
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
		if(!logger.exists())
			{
				logger.create(new ByteArrayInputStream(loggerContent.getBytes()), true, monitor);
			}
	
		// Generate Java code for the connector.
		try {
			URI modelURI = URI.createURI(extensionFile, true);

			// Added to get the extension and thus convert the extension name to
			// epackage name
			//ResourceSet resSet = new ResourceSetImpl();
			//Resource resource = resSet.getResource(modelURI, true);
			//Extension extension = (Extension) resource.getContents().get(0);

			// Generate Java code for the connector.
			IContainer target = connectorProject.getFolder("src-gen");

			// Compute the arguments of the generator.
			ArrayList<String> arguments = new ArrayList<String>();

			// The full name of the package to generate.
			arguments.add(connectorProjectName);

			// The full name of the package to extend. Changed instead of
			// requireBundle
			//arguments.add(OCCIExtension2Ecore.formatExtensionName(extension));
			arguments.add(args[args.length-3]);
			
//			if(EPackage.Registry.INSTANCE.getEPackage(getExtensionMetamodelURI(pluginXML))==null)
//				throw new InterruptedException("The metamodel of the OCCI "+OCCIExtension2Ecore.formatExtensionName(extension) +" extension is not registered");
			
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

	private String getExtensionScheme(IFile pluginXML) {
		try {
			IPath location = pluginXML.getLocation();
			if (location != null) {
				File file = location.toFile();

				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(file);

				if (doc.hasChildNodes()) {
					NodeList nodeList = doc.getChildNodes();
					for (int count = 0; count < nodeList.getLength(); count++) {
						Node tempNode = nodeList.item(count);
						if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
							if (tempNode.getNodeName().equals("plugin")) {
								for (int count1 = 0; count1 < tempNode.getChildNodes().getLength(); count1++) {
									Node tempNode1 = tempNode.getChildNodes().item(count1);
									if (tempNode1.getNodeType() == Node.ELEMENT_NODE) {
										if (tempNode1.getNodeName().equals("extension")) {
											for (int count11 = 0; count11 < tempNode1.getChildNodes()
													.getLength(); count11++) {
												Node tempNode11 = tempNode1.getChildNodes().item(count11);
												if (tempNode11.getNodeType() == Node.ELEMENT_NODE) {
													if (tempNode11.getNodeName().equals("factory")) {
														if (tempNode11.hasAttributes()) {
															NamedNodeMap nodeMap = tempNode11.getAttributes();
															for (int i = 0; i < nodeMap.getLength(); i++) {
																Node node = nodeMap.item(i);
																if (node.getNodeName().equals("uri")) {
																	return node.getNodeValue()
																			.substring(0,
																					node.getNodeValue().length()
																							- ("/ecore".length()))
																			.concat("#");
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}
	private String getExtensionMetamodelURI(IFile pluginXML) {
		try {
			IPath location = pluginXML.getLocation();
			if (location != null) {
				File file = location.toFile();

				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(file);

				if (doc.hasChildNodes()) {
					NodeList nodeList = doc.getChildNodes();
					for (int count = 0; count < nodeList.getLength(); count++) {
						Node tempNode = nodeList.item(count);
						if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
							if (tempNode.getNodeName().equals("plugin")) {
								for (int count1 = 0; count1 < tempNode.getChildNodes().getLength(); count1++) {
									Node tempNode1 = tempNode.getChildNodes().item(count1);
									if (tempNode1.getNodeType() == Node.ELEMENT_NODE) {
										if (tempNode1.getNodeName().equals("extension")) {
											for (int count11 = 0; count11 < tempNode1.getChildNodes()
													.getLength(); count11++) {
												Node tempNode11 = tempNode1.getChildNodes().item(count11);
												if (tempNode11.getNodeType() == Node.ELEMENT_NODE) {
													if (tempNode11.getNodeName().equals("factory")) {
														if (tempNode11.hasAttributes()) {
															NamedNodeMap nodeMap = tempNode11.getAttributes();
															for (int i = 0; i < nodeMap.getLength(); i++) {
																Node node = nodeMap.item(i);
																if (node.getNodeName().equals("uri")) {
																	return node.getNodeValue();
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}
	private String getExtensionFactoryClass(IFile pluginXML) {
		try {
			IPath location = pluginXML.getLocation();
			if (location != null) {
				File file = location.toFile();

				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(file);

				if (doc.hasChildNodes()) {
					NodeList nodeList = doc.getChildNodes();
					for (int count = 0; count < nodeList.getLength(); count++) {
						Node tempNode = nodeList.item(count);
						if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
							if (tempNode.getNodeName().equals("plugin")) {
								for (int count1 = 0; count1 < tempNode.getChildNodes().getLength(); count1++) {
									Node tempNode1 = tempNode.getChildNodes().item(count1);
									if (tempNode1.getNodeType() == Node.ELEMENT_NODE) {
										if (tempNode1.getNodeName().equals("extension")) {
											for (int count11 = 0; count11 < tempNode1.getChildNodes()
													.getLength(); count11++) {
												Node tempNode11 = tempNode1.getChildNodes().item(count11);
												if (tempNode11.getNodeType() == Node.ELEMENT_NODE) {
													if (tempNode11.getNodeName().equals("factory")) {
														if (tempNode11.hasAttributes()) {
															NamedNodeMap nodeMap = tempNode11.getAttributes();
															for (int i = 0; i < nodeMap.getLength(); i++) {
																Node node = nodeMap.item(i);
																if (node.getNodeName().equals("class")) {
																	String[] args = node.getNodeValue().split("\\.");
																	return args[args.length - 1];
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "";
	}

	private static String getValue(String tag, Element element) {
		NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();
	}

	private static void printNote(NodeList nodeList) {

		for (int count = 0; count < nodeList.getLength(); count++) {

			Node tempNode = nodeList.item(count);

			// make sure it's element node.
			if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

				// get node name and value
				System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
				System.out.println("Node Value =" + tempNode.getTextContent());

				if (tempNode.hasAttributes()) {

					// get attributes names and values
					NamedNodeMap nodeMap = tempNode.getAttributes();

					for (int i = 0; i < nodeMap.getLength(); i++) {

						Node node = nodeMap.item(i);
						System.out.println("attr name : " + node.getNodeName());
						System.out.println("attr value : " + node.getNodeValue());

					}

				}

				if (tempNode.hasChildNodes()) {

					// loop again if has child nodes
					printNote(tempNode.getChildNodes());

				}

				System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");

			}

		}

	}
}