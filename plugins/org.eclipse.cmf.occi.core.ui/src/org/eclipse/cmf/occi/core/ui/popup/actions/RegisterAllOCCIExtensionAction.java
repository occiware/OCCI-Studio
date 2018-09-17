/*******************************************************************************
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *******************************************************************************/
package org.eclipse.cmf.occi.core.ui.popup.actions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RegisterAllOCCIExtensionAction implements IObjectActionDelegate {
	private ISelection selection;
	private Shell shell;

	/**
	 * Constructor for Action1.
	 */
	public RegisterAllOCCIExtensionAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		Boolean at_leat_one_extension_is_registred = false;
		Iterator<?> it = ((IStructuredSelection) selection).iterator();
		String message = "\n";
		while (it.hasNext()) {

			IProject selectedProject = (IProject) it.next();
			if (selectedProject instanceof IProject) {
				// Generate plugin.xml
				IFile pluginXML = PDEProject.getPluginXml(selectedProject);
				if (pluginXML.exists()) {
					if (getOccieExtensionPointNode(pluginXML) != null) {
						try {
							ResourceSet resSet = new ResourceSetImpl();
							final URI uri = URI.createURI("platform:/resource/" + selectedProject.getName() + "/"
									+ getExtensionURI(pluginXML), true);
							Resource res = resSet.createResource(uri);
							// to ensure that uri is correct and the resource exists
							res.load(Collections.emptyMap());
							final Extension extension = (Extension) res.getContents().get(0);
							if (!extension.getScheme().equals(getExtensionScheme(pluginXML))) {
								throw new RuntimeException("Invalid scheme "+ getExtensionScheme(pluginXML) +" in plugin.xml of " + selectedProject.getName() + " project");
							}
							// the registry statement
							OcciRegistry.getInstance().registerExtension(getExtensionScheme(pluginXML), uri.toString());
							closeOtherSessions(selectedProject);
							message = message.concat(getExtensionScheme(pluginXML)).concat(" ["+uri+"]").concat("\n");
							at_leat_one_extension_is_registred = true;

						} catch (IOException e) {
							MessageDialog.openError(shell, "Invalid plugin.xml", e.getMessage());
						} catch (RuntimeException e) {
							MessageDialog.openError(shell, "Invalid extension scheme", e.getMessage());
						}
					}
				}
			}
		}
		if (at_leat_one_extension_is_registred)
			MessageDialog.openInformation(shell, Messages.RegisterExtensionAction_ExtRegistration,
					Messages.RegisterExtensionAction_RegisteredExtension + message);

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	private static void closeOtherSessions(IProject currentProject) {
		List<Session> sessions = new ArrayList<Session>(SessionManager.INSTANCE.getSessions());
		Session currentSession = null;
		ModelingProject modelingProject = ModelingProject.asModelingProject(currentProject).get();
		if (modelingProject != null) {
			currentSession = modelingProject.getSession();
		}
		for (Session session : sessions) {
			if (!session.equals(currentSession)) {
				session.close(null);
			}
		}
	}

	private String getExtensionScheme(IFile pluginXML) {

		if (getOccieExtensionPointNode(pluginXML) != null) {
			for (int count2 = 0; count2 < getOccieExtensionPointNode(pluginXML).getChildNodes().getLength(); count2++) {
				Node tempNode2 = getOccieExtensionPointNode(pluginXML).getChildNodes().item(count2);
				if (tempNode2.getNodeType() == Node.ELEMENT_NODE) {
					if (tempNode2.getNodeName().equals("occie")) {
						return tempNode2.getAttributes().getNamedItem("scheme").getNodeValue();
					}
				}
			}
		}
		return "";
	}

	private String getExtensionURI(IFile pluginXML) {

		if (getOccieExtensionPointNode(pluginXML) != null) {
			for (int count2 = 0; count2 < getOccieExtensionPointNode(pluginXML).getChildNodes().getLength(); count2++) {
				Node tempNode2 = getOccieExtensionPointNode(pluginXML).getChildNodes().item(count2);
				if (tempNode2.getNodeType() == Node.ELEMENT_NODE) {
					if (tempNode2.getNodeName().equals("occie")) {
						return tempNode2.getAttributes().getNamedItem("file").getNodeValue();
					}
				}
			}
		}
		return "";
	}

	private Node getOccieExtensionPointNode(IFile pluginXML) {
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
											// System.out.println(" tempNode1
											// "+tempNode1.getAttributes().getNamedItem("point"));
											String obj = "org.eclipse.cmf.occi.core.occie";
											if (tempNode1.getAttributes().getNamedItem("point").getNodeValue()
													.equals(obj)) {
												return tempNode1;
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
		return null;

	}

}
