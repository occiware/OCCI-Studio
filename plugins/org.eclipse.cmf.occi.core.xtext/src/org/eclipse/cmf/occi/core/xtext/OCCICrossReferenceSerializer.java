package org.eclipse.cmf.occi.core.xtext;

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
			System.out.println("proxyURI.fragment()) "+proxyURI);
			System.out.println("proxyURI.fragment()) "+proxyURI.fragment());
			return model.eResource().getEObject(proxyURI.fragment());
		}
		return null;
	}
}
