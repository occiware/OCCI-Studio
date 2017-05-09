package org.eclipse.cmf.occi.core.design.utils;

import org.eclipse.cmf.occi.core.design.Messages;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewFilePage extends WizardNewFileCreationPage {

	private String fileExt;

	/**
	 * Pass in the selection.
	 */
	public NewFilePage(IStructuredSelection selection, String fileExt) {
		super("NewFilePage", selection);
		this.fileExt = fileExt;
	}

	/**
	 * The framework calls this to see if the file is correct.
	 */
	@Override
	protected boolean validatePage() {
		if (super.validatePage()) {
			String extension = new Path(getFileName()).getFileExtension();
			if (extension == null || !fileExt.equals(extension)) {
				setErrorMessage(Messages.NewConfigurationWizard_FileExtError + fileExt);
				return false;
			}
			return true;
		}
		return false;
	}

}