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

import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.RecordType;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.serializer.sequencer.LegacyTransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ListTransient;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

public class OCCICustomLegacyTransientValueService extends LegacyTransientValueService {

	@Override
	public ValueTransient isValueTransient(EObject semanticObject, EStructuralFeature feature) {

		if (feature == OCCIPackage.Literals.ATTRIBUTE__MUTABLE) {
			if (semanticObject.eContainer() instanceof Type || semanticObject.eContainer() instanceof RecordType) {
				if ((boolean)semanticObject.eGet(feature)) {
					return ValueTransient.NO;
				}
			}
		}
		if (feature == OCCIPackage.Literals.RESOURCE__RLINKS) {
			return ValueTransient.YES;
		}
		return super.isValueTransient(semanticObject, feature);
	}

	@Override
	protected boolean defaultValueIsSerializeable(EStructuralFeature feature) {
		if (feature == OCCIPackage.Literals.ATTRIBUTE__MUTABLE) {
			return true;
		}
		return super.defaultValueIsSerializeable(feature);
	}


	@Override
	public ListTransient isListTransient(EObject semanticObject, EStructuralFeature feature) {
		//System.out.println("occi "+semanticObject);
		if (feature == OCCIPackage.Literals.RESOURCE__RLINKS) {
			return ListTransient.YES;
		}
		return super.isListTransient(semanticObject, feature);
	}


}
