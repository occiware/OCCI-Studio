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
package org.eclipse.cmf.occi.core.xtext

import org.eclipse.cmf.occi.core.xtext.scoping.OCCILinker
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService
import org.eclipse.cmf.occi.core.xtext.services.OCCITransientValueService
import org.eclipse.xtext.serializer.tokens.ICrossReferenceSerializer
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager
import org.eclipse.xtext.resource.IResourceDescription.Manager
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.cmf.occi.core.xtext.serializer.OCCICrossReferenceSerializer
import org.eclipse.cmf.occi.core.xtext.services.OCCICustomLegacyTransientValueService
import org.eclipse.cmf.occi.core.xtext.services.CustomDefaultEcoreElementFactory
import org.eclipse.cmf.occi.core.xtext.services.OCCIDerivedStateComputer

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class OCCIRuntimeModule extends AbstractOCCIRuntimeModule {
	
	override Class<? extends org.eclipse.xtext.linking.ILinker> bindILinker() { 
		OCCILinker
	}
	override Class<? extends ITransientValueService> bindITransientValueService() {
		OCCITransientValueService
	}
	
	def Class<? extends org.eclipse.xtext.serializer.sequencer.ITransientValueService> bindITransientValueServiceOld() {
		OCCICustomLegacyTransientValueService 
	}
	
	override bindIAstFactory() {
		CustomDefaultEcoreElementFactory
	}
	def Class<? extends ICrossReferenceSerializer> bindICrossReferenceSerializer() {
		OCCICrossReferenceSerializer
	}
	def Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		OCCIDerivedStateComputer 
	}
	
	def Class<? extends Manager> bindIResourceDescription$Manager() {
		DerivedStateAwareResourceDescriptionManager
	}
	
	override Class<? extends XtextResource> bindXtextResource() {
		DerivedStateAwareResource
	}
}
