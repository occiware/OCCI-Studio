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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.emf.dt.EmfRegistryManager;
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
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RegisterAllMetamodelAction implements IObjectActionDelegate {
	private ISelection selection;
	private Shell shell;

	/**
	 * Constructor for Action1.
	 */
	public RegisterAllMetamodelAction() {
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
		Iterator<?> it = ((IStructuredSelection) selection).iterator();
		while (it.hasNext()) {
			IProject selectedProject = (IProject) it.next();
			IFolder modelFolder = selectedProject.getFolder("model");
			if (modelFolder.exists()) {
				try {
					for (IResource i : modelFolder.members()) {
						if (((IFile)i).getFileExtension().equals("ecore")) {
							String fileName = i.getFullPath().toOSString();
							EmfRegistryManager.getInstance().addMetamodel(fileName);
							System.out.println("Registered " +fileName + " metamodel");
						}
					}
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

//			IFile file = (IFile) it.next();
//			//String fileName = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toPortableString() + file.getFullPath().toOSString();
//			String fileName = file.getFullPath().toOSString();
//			//String fileName = file.getRawLocation().toOSString();
//			try {
//				EmfRegistryManager.getInstance().addMetamodel(fileName);
//				//LogUtil.logInfo("Metamodel " + fileName + " registered successfully");
//			}
//			catch (Exception ex) {
//				//LogUtil.log("Metamodel " + fileName + " could not be registered", ex);
//			}
		}

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
