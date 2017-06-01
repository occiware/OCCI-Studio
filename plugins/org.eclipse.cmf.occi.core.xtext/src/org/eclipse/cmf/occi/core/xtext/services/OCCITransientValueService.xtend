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

class OCCITransientValueService extends DefaultTransientValueService {

	override boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		//println("owner "+owner)
		//println("feature "+feature)
		if (feature == OCCIPackage.Literals.ATTRIBUTE__MUTABLE) {
			// println("mutable "+owner)
			var Boolean value = owner.eGet(feature) as Boolean
			println("mutable value " + value)
			if (value === null) {
				return false;
			} else if (value == Boolean.FALSE) {
				return true;
			}
		}
		if (feature == OCCIPackage.Literals.ATTRIBUTE__REQUIRED) {
			if(owner.eContainer instanceof Action){
				return true;
			}
			//println("rrequired " + owner.eContainer)
			var Boolean value = owner.eGet(feature) as Boolean
			// println("mutable value "+value)
			if (value === null) {
				return true
			} else {
				return false
			}
		// //println("rrrequired "+value)
		}
		if (feature == OCCIPackage.Literals.ATTRIBUTE__DESCRIPTION) {
			// println("rrequired "+owner)
			var String value = owner.eGet(feature) as String
			// println("mutable value "+value)
			if (value === null) {
				return false
			} else {
				return true
			}
		// //println("rrrequired "+value)
		}
//		if (feature == OCCIPackage.Literals.STATE__INCOMING_TRANSITION) {
//
//			return super.isTransient(owner, feature, index)
//
//		// //println("rrrequired "+value)
//		}
		if (feature == OCCIPackage.Literals.STATE__OWNING_FSM) {

			return super.isTransient(owner, feature, index)

		// //println("rrrequired "+value)
		}
		if (feature == OCCIPackage.Literals.ENUMERATION_LITERAL__ENUMERATION_TYPE) {

			return super.isTransient(owner, feature, index)

		// //println("rrrequired "+value)
		}
		if (feature == OCCIPackage.Literals.TRANSITION__SOURCE) {
			 return true
		}
		return super.isTransient(owner, feature, index)

	}
}
