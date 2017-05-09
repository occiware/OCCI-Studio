package org.eclipse.cmf.occi.core.design;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.cmf.occi.core.design.messages"; //$NON-NLS-1$
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
