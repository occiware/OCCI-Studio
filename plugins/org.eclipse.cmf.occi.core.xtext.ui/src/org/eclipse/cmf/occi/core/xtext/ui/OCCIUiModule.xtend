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

package org.eclipse.cmf.occi.core.xtext.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.cmf.occi.core.xtext.ide.syntaxcoloring.OCCISemanticHighlightingCalculator

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class OCCIUiModule extends AbstractOCCIUiModule {

	def Class<? extends XtextDocumentProvider> bindXtextDocumentProvider() {
		OCCIDocumentProvider
	}

	override Class<? extends IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
		return OCCIResourceForEditorInputFactory
	}
	
	def Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator () {
        OCCISemanticHighlightingCalculator  
    }

}
