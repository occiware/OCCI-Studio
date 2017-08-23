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

package org.eclipse.cmf.occi.core.xtext.serializer;

import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.tokens.CrossReferenceSerializer;

public class OCCICrossReferenceSerializer extends CrossReferenceSerializer {

	@Override
	public String serializeCrossRef(EObject semanticObject, CrossReference crossref, EObject target, INode node,
			Acceptor errors) {
		if (((InternalEObject) target).eProxyURI() != null) {
			if (((InternalEObject) target).eProxyURI().toString().startsWith("#")) {
				return super.serializeCrossRef(semanticObject, crossref, getEObjectfromEProxy(semanticObject, target),
						node, errors);
			}
		}

		return super.serializeCrossRef(semanticObject, crossref, target, node, errors);

	}

	public EObject getEObjectfromEProxy(EObject model, EObject target) {
		if (target.eIsProxy()) {
			URI proxyURI = ((InternalEObject) target).eProxyURI();
			return model.eResource().getEObject(proxyURI.fragment());
		}
		return null;
	}
}
