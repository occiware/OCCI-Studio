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
import org.eclipse.cmf.occi.core.Kind
import org.eclipse.cmf.occi.core.Mixin
import org.eclipse.cmf.occi.core.Action
import org.eclipse.cmf.occi.core.Category
import org.eclipse.cmf.occi.core.Extension

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
	resource.allContents.forEach [ r |
      if(r instanceof Kind) {
      	val kind = r as Kind
      	if(kind.scheme === null) {
      		// Set the scheme of a Kind instance to the scheme of its owning Extension instance.
      		kind.scheme = (kind.eContainer as Extension).scheme
      	}
      }
//      if(r instanceof Mixin) {
//      	val mixin = r as Mixin
//      	if(mixin.scheme === null) {
//      		// Set the scheme of a Mixin instance to the scheme of its owning Extension instance.
//      		mixin.scheme = (mixin.eContainer as Extension).scheme
//      	}
//      }
      if(r instanceof Action) {
      	val action = r as Action
      	if(action.scheme === null) {
      		val ownerCategory = (action.eContainer as Category)
      		// Set the scheme of an Action instance related to the scheme of its owning Category instance.
      		action.scheme = ownerCategory.scheme.substring(0, ownerCategory.scheme.length-1) + '/' + ownerCategory.term + "/action#"
      	}
      }
    ]
	}
def EObject getEObjectfromEProxy(EObject model, EObject target) {
		if (target.eIsProxy()) {
			var URI proxyURI = (target as InternalEObject).eProxyURI();
			return model.eResource().getEObject(proxyURI.fragment());
		}
		return null;
	}
}

