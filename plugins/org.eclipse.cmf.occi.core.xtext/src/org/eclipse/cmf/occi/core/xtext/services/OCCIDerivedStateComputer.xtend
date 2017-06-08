package org.eclipse.cmf.occi.core.xtext.services

import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.cmf.occi.core.Configuration
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.cmf.occi.core.OCCIPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.cmf.occi.core.Link
import org.eclipse.emf.common.util.URI

class OCCIDerivedStateComputer implements IDerivedStateComputer {

	override discardDerivedState(DerivedStateAwareResource resource) {
		if (!resource.contents.empty) {
			if (resource.contents.head instanceof Configuration) {
				val configuration = resource.contents.head as Configuration
				for (resourceOcci : configuration.resources) {
					resourceOcci.rlinks.clear
				}
			}
		}
	}

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (!resource.contents.empty) {
			if (resource.contents.head instanceof Configuration) {
				val configuration = resource.contents.head as Configuration
				for (resourceOcci : configuration.resources) {
					for (resourceOcci2 : configuration.resources) {
						for (link : resourceOcci2.links) {
							val id = NodeModelUtils.findNodesForFeature(link, OCCIPackage.Literals.LINK__TARGET).head?.
								text?.trim
							if ("\""+resourceOcci.id+"\"" == id) {
								val EObject proxy = EcoreUtil.create(OCCIPackage.Literals.LINK)
								(proxy as InternalEObject).eSetProxyURI(EcoreUtil.getURI(resourceOcci))
								(proxy as InternalEObject).eSetProxyURI(EcoreUtil.getURI(link))
								//println("=============")
								//println("proxy before "+proxy)
								//println("proxy after "+getEObjectfromEProxy(resourceOcci,proxy))
								resourceOcci.rlinks += getEObjectfromEProxy(resourceOcci,proxy) as Link
								//println("=============")
							}
						}
					}
				}
			}
		}
	}
def EObject getEObjectfromEProxy(EObject model, EObject target) {
		if (target.eIsProxy()) {
			var URI proxyURI = (target as InternalEObject).eProxyURI();
			return model.eResource().getEObject(proxyURI.fragment());
		}
		return null;
	}
}

