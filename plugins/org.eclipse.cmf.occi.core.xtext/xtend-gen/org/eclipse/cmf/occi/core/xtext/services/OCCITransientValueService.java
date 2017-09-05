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
package org.eclipse.cmf.occi.core.xtext.services;

import com.google.common.base.Objects;
import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class OCCITransientValueService extends DefaultTransientValueService {
  @Override
  public boolean isTransient(final EObject owner, final EStructuralFeature feature, final int index) {
    boolean _equals = Objects.equal(feature, OCCIPackage.Literals.ATTRIBUTE__MUTABLE);
    if (_equals) {
      Object _eGet = owner.eGet(feature);
      Boolean value = ((Boolean) _eGet);
      boolean _equals_1 = Objects.equal(value, Boolean.FALSE);
      if (_equals_1) {
        return true;
      } else {
        return false;
      }
    }
    boolean _equals_2 = Objects.equal(feature, OCCIPackage.Literals.ATTRIBUTE__REQUIRED);
    if (_equals_2) {
      EObject _eContainer = owner.eContainer();
      if ((_eContainer instanceof Action)) {
        InputOutput.<String>println(("required action " + owner));
        return true;
      }
    }
    boolean _equals_3 = Objects.equal(feature, OCCIPackage.Literals.ATTRIBUTE__DESCRIPTION);
    if (_equals_3) {
      EObject _eContainer_1 = owner.eContainer();
      if ((_eContainer_1 instanceof Action)) {
        return true;
      }
    }
    boolean _equals_4 = Objects.equal(feature, OCCIPackage.Literals.CATEGORY__SCHEME);
    if (_equals_4) {
      if (((owner instanceof Action) || (owner instanceof Kind))) {
        return true;
      }
    }
    return super.isTransient(owner, feature, index);
  }
}
