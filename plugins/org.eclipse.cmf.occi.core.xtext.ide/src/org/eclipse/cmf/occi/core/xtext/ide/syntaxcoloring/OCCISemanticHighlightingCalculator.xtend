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

class OCCISemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
		@Inject package OCCIGrammarAccess grammar

	override protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		switch (object) {
			Attribute: {
				highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.attribute_Name, HighlightingStyles.DEFAULT_ID)
				return true
			}
			default: false
		}
	}
	
}