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
		// System.out.println("obj "+obj);
		// System.out.println("node "+node);
		// System.out.println("eRef "+eRef);
		if (eRef.equals(OCCIPackage.eINSTANCE.getExtension_Import())
				|| eRef.equals(OCCIPackage.eINSTANCE.getConfiguration_Use())) {
			EClass referenceType = getProxyType(obj, eRef);
			final EObject proxy = EcoreUtil.create(referenceType);
			((InternalEObject) proxy)
					.eSetProxyURI(URI.createURI(node.getText().replaceAll("'", "").replaceAll("\"", "")));

			// System.out.println("node.getText() "+node.getText());
			// System.out.println("proxy "+proxy);
			return proxy;
		}
//		final EObject proxy = super.createProxy(obj, node, eRef);
//		if (eRef.getEOpposite() != null) {
//			System.out.println("getEOpposite proxy " + proxy);
//			return EcoreUtil.resolve(proxy, obj);
//		}
		return super.createProxy(obj, node, eRef);
	}
}
