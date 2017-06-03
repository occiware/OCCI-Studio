package org.eclipse.cmf.occi.core.xtext;

import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.serializer.sequencer.LegacyTransientValueService;

import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

public class CustomLegacyTransientValueService extends LegacyTransientValueService {
	
	@Override
	public ValueTransient isValueTransient(EObject semanticObject, EStructuralFeature feature) {
		if (feature == OCCIPackage.Literals.ATTRIBUTE__MUTABLE && semanticObject.eContainer() instanceof Type) {
			if ((boolean)semanticObject.eGet(feature)) {
				return ValueTransient.NO;
			}
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

}
