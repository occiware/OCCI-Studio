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
package org.eclipse.cmf.occi.core.xtext.scoping;

import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.linking.lazy.LazyLinker;
import org.eclipse.xtext.nodemodel.INode;

public class OCCILinker extends LazyLinker {
	@Override
	protected EObject createProxy(EObject obj, INode node, EReference eRef) {
		if (eRef.equals(OCCIPackage.eINSTANCE.getExtension_Import())
				|| eRef.equals(OCCIPackage.eINSTANCE.getConfiguration_Use())) {
			EClass referenceType = getProxyType(obj, eRef);
			final EObject proxy = EcoreUtil.create(referenceType);
			((InternalEObject) proxy)
					.eSetProxyURI(URI.createURI(node.getText().replaceAll("'", "").replaceAll("\"", "")));
			return proxy;
		}
		return super.createProxy(obj, node, eRef);
	}
}
