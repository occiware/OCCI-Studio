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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class RegisterOCCIExtensionAction implements IObjectActionDelegate {
	private ISelection selection;
	private Shell shell;
	
	/**
	 * Constructor for Action1.
	 */
	public RegisterOCCIExtensionAction() {
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
		if (selection != null) {
			IFile selectedFile = (IFile) ((IStructuredSelection) selection)
					.getFirstElement();

			// Use a platform:/resource/ URI
			URI uri = URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true);

			ResourceSet rs = new ResourceSetImpl();
			Resource r = rs.getResource(uri, true);

			Extension extension = (Extension) r.getContents().get(0);
			OcciRegistry.getInstance().registerExtension(extension.getScheme(),
					uri.toString());
			closeOtherSessions(selectedFile.getProject());
			MessageDialog.openInformation(shell,
					Messages.RegisterExtensionAction_ExtRegistration,
					Messages.RegisterExtensionAction_RegisteredExtension
							+ extension.getScheme());
		}
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

}
