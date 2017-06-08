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
