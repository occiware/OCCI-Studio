package org.eclipse.cmf.occi.core.design.wizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.cmf.occi.core.design.wizard.messages"; //$NON-NLS-1$
	public static String NewExtensionWizard_ModelCreationError;
	public static String NewExtensionWizard_ProjectCreationError;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
