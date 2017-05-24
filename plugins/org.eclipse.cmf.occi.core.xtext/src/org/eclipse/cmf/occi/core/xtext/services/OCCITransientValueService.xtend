package org.eclipse.cmf.occi.core.xtext.services

import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EObject
import org.eclipse.cmf.occi.core.OCCIPackage
import org.eclipse.cmf.occi.core.Type
import org.eclipse.cmf.occi.core.DataType

class OCCITransientValueService extends DefaultTransientValueService {

	override boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		//println("before mutable "+owner)
		//println("before feature "+feature)
		if (feature == OCCIPackage.Literals.ATTRIBUTE__MUTABLE) {
			//println("mutable "+owner)
			var Boolean value = owner.eGet(feature) as Boolean
			//println("mutable value "+value)
			if (value == null) {
				return false
			} else if (value == Boolean.FALSE) {
				return true;
			}
		}
		if (feature == OCCIPackage.Literals.ATTRIBUTE__REQUIRED) {
			//println("rrequired "+owner)
			var Boolean value = owner.eGet(feature) as Boolean
			//println("mutable value "+value)
			if (value == null) {
				return false
			} else {
				return true;
			}
			////println("rrrequired "+value)
		}
		if (feature == OCCIPackage.Literals.ATTRIBUTE__DESCRIPTION) {
			//println("rrequired "+owner)
			var String value = owner.eGet(feature) as String
			//println("mutable value "+value)
			if (value==null) {
				return false
			} else {
				return true;
			}
			////println("rrrequired "+value)
		}
//		if (feature == OCCIPackage.Literals.ATTRIBUTE__TYPE) {
//			return true
//		}
//		else{
//			
//		}
		//
		////println("isTransient ");
		return super.isTransient(owner, feature, index);
	}
}
