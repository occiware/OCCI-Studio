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
package org.eclipse.cmf.occi.core.xtext.formatting2

import com.google.inject.Inject
import org.eclipse.cmf.occi.core.AttributeState
import org.eclipse.cmf.occi.core.Configuration
import org.eclipse.cmf.occi.core.Link
import org.eclipse.cmf.occi.core.Mixin
import org.eclipse.cmf.occi.core.MixinBase
import org.eclipse.cmf.occi.core.Resource
import org.eclipse.cmf.occi.core.xtext.services.OCCIGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.cmf.occi.core.OCCIPackage

class OCCIFormatter extends AbstractFormatter2 {

	@Inject extension OCCIGrammarAccess

	def dispatch void format(Configuration configuration, extension IFormattableDocument document) {
		val klocation = configuration.regionFor.feature(OCCIPackage.Literals.CONFIGURATION__LOCATION)
		klocation.append[newLines = 2]
		val kuse = configuration.regionFor.keyword(")")
		kuse.append[newLines = 2]
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Resource resource : configuration.getResources()) {
			resource.format;
		}
		for (Mixin mixin : configuration.getMixins()) {
			mixin.format;
		}
	}

	def dispatch void format(Resource resource, extension IFormattableDocument document) {
		// add line after title feature
		val kkind = resource.regionFor.feature(OCCIPackage.Literals.ENTITY__TITLE)
		kkind.append[newLines = 1]
		val kattribute = resource.regionFor.feature(OCCIPackage.Literals.ENTITY__LOCATION)
		kattribute.append[newLines = 1]
		val ksummary = resource.regionFor.feature(OCCIPackage.Literals.RESOURCE__SUMMARY)
		ksummary.append[newLines = 1]
		for (MixinBase mixinBase : resource.getParts()) {
			mixinBase.format;
		}
		for (attribute : resource.attributes) {
			attribute.append[setNewLines(1, 1, 2)]
		}
		for (Link link : resource.getLinks()) {
			link.format;
		}
	}

	def dispatch void format(Link link, extension IFormattableDocument document) {
		// add line after title feature
		val kkind = link.regionFor.feature(OCCIPackage.Literals.ENTITY__TITLE)
		kkind.append[newLines = 1]
		val kattribute = link.regionFor.feature(OCCIPackage.Literals.ENTITY__LOCATION)
		kattribute.append[newLines = 1]
		val ktarget = link.regionFor.feature(OCCIPackage.Literals.LINK__TARGET)
		ktarget.append[newLines = 1]
		for (MixinBase mixinBase : link.getParts()) {
			mixinBase.format;
		}
		for (AttributeState attributeState : link.getAttributes()) {
			attributeState.format;
		}
	}

	def dispatch void format(AttributeState attributeState, extension IFormattableDocument document) {
		// add line after title feature
		val kvalue = attributeState.regionFor.feature(OCCIPackage.Literals.ATTRIBUTE_STATE__VALUE)
		kvalue.append[newLines = 1]
	}
// TODO: implement for Link, MixinBase, Extension, Kind, Mixin, Attribute, Action, FSM, State, EnumerationType, RecordType, RecordField
}
