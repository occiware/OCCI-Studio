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
 
 package org.eclipse.cmf.occi.core.xtext.services

import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EObject
import org.eclipse.cmf.occi.core.OCCIPackage
import org.eclipse.cmf.occi.core.Type
import org.eclipse.cmf.occi.core.DataType
import org.eclipse.cmf.occi.core.State
import org.eclipse.emf.common.util.EList
import org.eclipse.cmf.occi.core.Transition
import org.eclipse.cmf.occi.core.Action
import org.eclipse.cmf.occi.core.Attribute
import org.eclipse.cmf.occi.core.Kind
import org.eclipse.cmf.occi.core.Mixin

class OCCITransientValueService extends DefaultTransientValueService {

	override boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
//		//println("owner "+owner)
//		if(owner instanceof Attribute){
//			if (feature == OCCIPackage.Literals.ATTRIBUTE__MUTABLE) {
//			println("owner "+(owner as Attribute));
//			
//		}
//		}
//		//println("feature "+feature)
		if (feature == OCCIPackage.Literals.ATTRIBUTE__MUTABLE) {
			 //println("mutable "+owner)
			 //println("mutable "+(owner as Attribute).mutable);
			var Boolean value = owner.eGet(feature) as Boolean
			//println("mutable value " + owner)
			if (value == Boolean.FALSE) {
				return true;
			}
			else{
				return false;
			}
		}
		if (feature == OCCIPackage.Literals.ATTRIBUTE__REQUIRED) {
			if(owner.eContainer instanceof Action){
				println("required action "+owner)
				return true;
			}
			//println("rrequired " + owner.eContainer)
//			var Boolean value = owner.eGet(feature) as Boolean
//			 println("required value "+value)
//			if (value === null) {
//				return true
//			} else {
//				return false
//			}
		// //println("rrrequired "+value)
		}
		if (feature == OCCIPackage.Literals.ATTRIBUTE__DESCRIPTION) {
			if (owner.eContainer instanceof Action){
			return true
			
		}
//		// //println("rrrequired "+value)
		}
//	if (feature == OCCIPackage.Literals.STATE__OWNING_FSM) {
//
//			return super.isTransient(owner, feature, index)
//
//		// //println("rrrequired "+value)
//		}
//		if (feature == OCCIPackage.Literals.ENUMERATION_LITERAL__ENUMERATION_TYPE) {
//
//			return super.isTransient(owner, feature, index)
//
//		// //println("rrrequired "+value)
//		}
//		if (feature == OCCIPackage.Literals.TRANSITION__SOURCE) {
//			 return true
//		}
	if (feature == OCCIPackage.Literals.CATEGORY__SCHEME) {
			if (owner instanceof Action|| owner instanceof Kind /* || owner instanceof Mixin*/){
			return true
			
		}
		
		}
		return super.isTransient(owner, feature, index)

	}
}
