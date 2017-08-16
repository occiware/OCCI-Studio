/*******************************************************************************
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   William Piers <william.piers@obeo.fr>
 *     Philippe Merle <philippe.merle@inria.fr>
 *     Faiez Zalila <faiez.zalila@inria.fr>
 *******************************************************************************/
package org.eclipse.cmf.occi.core.ui.popup.actions;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.cmf.occi.core.ui.messages"; //$NON-NLS-1$
	public static String LoadExtensionDialog_ExtensionRegistry;
	public static String LoadExtensionDialog_SelectExtension;
	public static String LoadExtensionDialog_SelectRegisteredExtension;
	public static String NewConfigurationWizard_DefaultModelName;
	public static String NewConfigurationWizard_FileExtError;
	public static String NewConfigurationWizard_PageDescription;
	public static String NewConfigurationWizard_PageTitle;
	public static String NewConfigurationWizard_WindowTitle;
	public static String NewExtensionWizard_ExtensionNameLabel;
	public static String NewExtensionWizard_ExtensionSchemeLabel;
	public static String NewExtensionWizard_ModelCreationError;
	public static String NewExtensionWizard_PageDescription;
	public static String NewExtensionWizard_PageName;
	public static String NewExtensionWizard_PageTitle;
	public static String NewExtensionWizard_ProjectCreationError;
	public static String NewExtensionWizard_RepresentationCreationError;
	public static String RegisterExtensionAction_ExtRegistration;
	public static String RegisterExtensionAction_RegisteredExtension;
	public static String NewExtensionWizard_RefExtensionLabel;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
