/**
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
 */
package org.eclipse.cmf.occi.core.xtext.ui;

import org.eclipse.cmf.occi.core.xtext.ide.syntaxcoloring.OCCISemanticHighlightingCalculator;
import org.eclipse.cmf.occi.core.xtext.ui.AbstractOCCIUiModule;
import org.eclipse.cmf.occi.core.xtext.ui.OCCIDocumentProvider;
import org.eclipse.cmf.occi.core.xtext.ui.OCCIResourceForEditorInputFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class OCCIUiModule extends AbstractOCCIUiModule {
  public Class<? extends XtextDocumentProvider> bindXtextDocumentProvider() {
    return OCCIDocumentProvider.class;
  }
  
  @Override
  public Class<? extends IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
    return OCCIResourceForEditorInputFactory.class;
  }
  
  public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
    return OCCISemanticHighlightingCalculator.class;
  }
  
  public OCCIUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
