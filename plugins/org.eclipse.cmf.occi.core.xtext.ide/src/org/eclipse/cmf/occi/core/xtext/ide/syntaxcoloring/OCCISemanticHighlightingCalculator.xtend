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

package org.eclipse.cmf.occi.core.xtext.ide.syntaxcoloring

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.cmf.occi.core.xtext.services.OCCIGrammarAccess
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.cmf.occi.core.OCCIPackage
import org.eclipse.cmf.occi.core.Attribute
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles
import org.eclipse.cmf.occi.core.Mixin
import org.eclipse.cmf.occi.core.MixinBase
import org.eclipse.cmf.occi.core.DataType
import org.eclipse.cmf.occi.core.Kind
import org.eclipse.cmf.occi.core.RecordField
import org.eclipse.cmf.occi.core.RecordType

class OCCISemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	@Inject package OCCIGrammarAccess grammar

	override protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
		CancelIndicator cancelIndicator) {
		switch (object) {
			// TODO To be completed
			RecordField: {
				highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.attribute_Name, HighlightingStyles.DEFAULT_ID)
				return true
			}
			Attribute: {
				highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.attribute_Name, HighlightingStyles.DEFAULT_ID)
				return true
			}
			Mixin: {
				highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.category_Name, HighlightingStyles.DEFAULT_ID)
				return true
			}
			MixinBase: {
				highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.mixinBase_Mixin, HighlightingStyles.DEFAULT_ID)
				return true
			}
			DataType: {
				highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.dataType_Name, HighlightingStyles.DEFAULT_ID)
				if (object instanceof RecordType) {
					for (field : (object as RecordType).recordFields) {
						highlightElement(field, acceptor, cancelIndicator)
					}
				}
				return true
			}
			Kind: {
				highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.kind_Source, HighlightingStyles.DEFAULT_ID)
				highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.kind_Target, HighlightingStyles.DEFAULT_ID)
				return true
			}
			default:
				false
		}
	}

}
