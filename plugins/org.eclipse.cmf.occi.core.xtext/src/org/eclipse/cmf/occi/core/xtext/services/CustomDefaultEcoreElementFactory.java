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

package org.eclipse.cmf.occi.core.xtext.services;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.DefaultEcoreElementFactory;

public class CustomDefaultEcoreElementFactory extends DefaultEcoreElementFactory {
	@Override
	public EObject create(EClassifier classifier) {
		EObject created = super.create(classifier);
		if (created instanceof Attribute) {
			((Attribute) created).setMutable(false);
		}
		return created;
	}
}
