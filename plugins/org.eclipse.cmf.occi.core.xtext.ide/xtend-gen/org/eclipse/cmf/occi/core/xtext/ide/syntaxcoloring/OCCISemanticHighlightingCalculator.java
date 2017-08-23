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
package org.eclipse.cmf.occi.core.xtext.ide.syntaxcoloring;

import com.google.inject.Inject;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.RecordField;
import org.eclipse.cmf.occi.core.RecordType;
import org.eclipse.cmf.occi.core.xtext.services.OCCIGrammarAccess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.util.CancelIndicator;

@SuppressWarnings("all")
public class OCCISemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  @Inject
  OCCIGrammarAccess grammar;
  
  @Override
  protected boolean highlightElement(final EObject object, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _switchResult = false;
    boolean _matched = false;
    if (object instanceof RecordField) {
      _matched=true;
      this.highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.getAttribute_Name(), HighlightingStyles.DEFAULT_ID);
      return true;
    }
    if (!_matched) {
      if (object instanceof Attribute) {
        _matched=true;
        this.highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.getAttribute_Name(), HighlightingStyles.DEFAULT_ID);
        return true;
      }
    }
    if (!_matched) {
      if (object instanceof Mixin) {
        _matched=true;
        this.highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.getCategory_Name(), HighlightingStyles.DEFAULT_ID);
        return true;
      }
    }
    if (!_matched) {
      if (object instanceof MixinBase) {
        _matched=true;
        this.highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.getMixinBase_Mixin(), HighlightingStyles.DEFAULT_ID);
        return true;
      }
    }
    if (!_matched) {
      if (object instanceof DataType) {
        _matched=true;
        this.highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.getDataType_Name(), HighlightingStyles.DEFAULT_ID);
        if ((object instanceof RecordType)) {
          EList<RecordField> _recordFields = ((RecordType) object).getRecordFields();
          for (final RecordField field : _recordFields) {
            this.highlightElement(field, acceptor, cancelIndicator);
          }
        }
        return true;
      }
    }
    if (!_matched) {
      if (object instanceof Kind) {
        _matched=true;
        this.highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.getKind_Source(), HighlightingStyles.DEFAULT_ID);
        this.highlightFeature(acceptor, object, OCCIPackage.eINSTANCE.getKind_Target(), HighlightingStyles.DEFAULT_ID);
        return true;
      }
    }
    if (!_matched) {
      _switchResult = false;
    }
    return _switchResult;
  }
}
