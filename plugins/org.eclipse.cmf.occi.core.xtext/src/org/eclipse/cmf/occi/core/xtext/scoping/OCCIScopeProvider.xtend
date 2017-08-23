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
 
package org.eclipse.cmf.occi.core.xtext.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.cmf.occi.core.ArrayType
import org.eclipse.cmf.occi.core.Kind
import org.eclipse.cmf.occi.core.Extension
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.resource.IEObjectDescription
import java.util.ArrayList
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.cmf.occi.core.DataType
import org.eclipse.cmf.occi.core.Mixin
import org.eclipse.cmf.occi.core.Attribute
import org.eclipse.cmf.occi.core.Type
import org.eclipse.cmf.occi.core.Action
import org.eclipse.cmf.occi.core.FSM
import org.eclipse.cmf.occi.core.State
import org.eclipse.cmf.occi.core.EnumerationType
import org.eclipse.cmf.occi.core.Transition
import org.eclipse.cmf.occi.core.OCCIPackage
import org.eclipse.cmf.occi.core.RecordType
import org.eclipse.cmf.occi.core.Configuration
import org.eclipse.cmf.occi.core.Resource
import org.eclipse.cmf.occi.core.MixinBase
import org.eclipse.cmf.occi.core.Entity
import org.eclipse.cmf.occi.core.Link

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class OCCIScopeProvider extends AbstractOCCIScopeProvider {

	override getScope(EObject object, EReference ref) {
		// Configuration : ('use' '(' use+=[Extension|STRING] ( "," use+=[Extension|STRING])* ')' )?
		if (object instanceof Configuration) {
			return scope_Configuration_use(object as Configuration, ref)
		}
		// Resource: kind=[Kind|QualifiedID]
		if (object instanceof Resource) {
			return scope_Resource_kind(object as Resource, ref)
		}
		if (object instanceof Link) {
			// Link: kind=[Kind|QualifiedID]
			if (ref == OCCIPackage.Literals.ENTITY__KIND) {
				return scope_Link_kind(object as Link, ref)
			}
			// Link: target=[Resource|STRING]
			if (ref == OCCIPackage.Literals.LINK__TARGET) {
				return scope_Link_target(object as Link, ref)
			}
		}
		// MixinBase: mixin=[Mixin|QualifiedID]
		if (object instanceof MixinBase) {
			return scope_MixinBase_mixin(object as MixinBase, ref)
		}
		// Extension: ^import+=[Extension|STRING]
		if (object instanceof Extension) {
			return scope_Extension_import(object as Extension, ref)
		}
		// Kind: parent=[Kind|QualifiedID]
		// Kind: source=[Kind|QualifiedID]
		// Kind: target=[Kind|QualifiedID]
		if (object instanceof Kind) {
			return scopeForKind(object as Kind, ref)
		}
		if (object instanceof Mixin) {
			// Mixin: depends+=[Mixin|QualifiedID]
			if (ref == OCCIPackage.Literals.MIXIN__DEPENDS) {
				return scope_Mixin_depends(object as Mixin, ref)
			}
			// Mixin: applies+=[Kind|QualifiedID]
			if (ref == OCCIPackage.Literals.MIXIN__APPLIES) {
				return scope_Mixin_applies(object as Mixin, ref)
			}
		}
		// Attribute: type=[DataType|QualifiedID]
		// RecordField : type=[DataType|QualifiedID]
		if (object instanceof Attribute) {
			return scope_Attribute_type(object as Attribute, ref)
		}
		// FSM: attribute=[Attribute|QualifiedID]
		if (object instanceof FSM) {
			return scope_FSM_attribute(object as FSM, ref)
		}
		// State: literal=[EnumerationLiteral|QualifiedID]
		if (object instanceof State) {
			return scope_State_literal(object as State, ref)
		}
		if (object instanceof Transition) {
			// Transition: action=[Action|QualifiedID]
			if (ref == OCCIPackage.Literals.TRANSITION__TARGET) {
				return scope_Transition_target(object as Transition, ref)
			}
			// Transition: target=[State|QualifiedID]
			if (ref == OCCIPackage.Literals.TRANSITION__ACTION) {
				return scope_Transition_action(object as Transition, ref)
			}
		}
		// ArrayType: type=[DataType|QualifiedID]
		if (object instanceof ArrayType) {
			return scope_ArrayType_type(object as ArrayType, ref)
		}
		super.getScope(object, ref)
	}

	def scope_Link_target(Link link, EReference reference) {
		var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
		var Configuration ext = (link.eContainer as Resource).eContainer as Configuration
		for (Resource resource : ext.resources) {
			res.add(EObjectDescription.create(resource.id, resource));
		}
		new SimpleScope(IScope.NULLSCOPE, res);
	}

	def scope_Link_kind(Link link, EReference reference) {
		var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
		var Configuration ext = (link.eContainer as Resource).eContainer as Configuration
		for (Extension importExtension : ext.use) {
			for (Kind k : importExtension.getKinds()) {
				res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.name), k));
			}
		}
		new SimpleScope(IScope.NULLSCOPE, res);
	}

	def scope_MixinBase_mixin(MixinBase base, EReference reference) {
		var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
		var Configuration config
		if ((base.eContainer as Entity).eContainer instanceof Configuration) {
			config = (base.eContainer as Entity).eContainer as Configuration
		} else {
			config = ((base.eContainer as Entity).eContainer as Resource).eContainer as Configuration
		}
		for (Mixin k : config.mixins) {
			res.add(EObjectDescription.create(k.name, k));
		}
		for (Extension useExtension : config.use) {
			for (Mixin kind : useExtension.mixins) {
				res.add(EObjectDescription.create(QualifiedName.create(useExtension.name, kind.name), kind));
			}
		}
		new SimpleScope(IScope.NULLSCOPE, res);
	}

	def scope_Resource_kind(Resource resource, EReference reference) {
		var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
		var Configuration ext = resource.eContainer as Configuration
		for (Extension importExtension : ext.use) {
			for (Kind k : importExtension.getKinds()) {
				res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.name), k));
			}
		}
		new SimpleScope(IScope.NULLSCOPE, res);
	}

	def scope_Transition_action(Transition transition, EReference reference) {
		var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
		var State s = transition.eContainer as State
		var FSM fsm = s.eContainer as FSM
		var Type t = fsm.eContainer as Type
		for (action : t.actions) {
			res.add(EObjectDescription.create(QualifiedName.create(action.name), action))
		}
		return new SimpleScope(IScope.NULLSCOPE, res)
	}

	def scope_Transition_target(Transition transition, EReference reference) {
		var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
		var State s = transition.eContainer as State
		var FSM fsm = s.eContainer as FSM
		for (state : fsm.ownedState) {
			if (state.literal !== null) {
				res.add(
					EObjectDescription.create(
						QualifiedName.create((state.literal.eContainer as EnumerationType).name, state.literal.name),
						state))
				}
			}
			new SimpleScope(IScope.NULLSCOPE, res)
		}

		def scope_State_literal(State state, EReference reference) {
			var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
			var FSM fsm = state.eContainer as FSM
			var Type typee = fsm.eContainer as Type
			var Extension ext = typee.eContainer as Extension
			for (type : ext.types.filter[t|t instanceof EnumerationType]) {
				for (literal : (type as EnumerationType).literals) {
					res.add(EObjectDescription.create(QualifiedName.create(type.name, literal.name), literal));
				}

			}
			new SimpleScope(IScope.NULLSCOPE, res);
		}

		def scope_FSM_attribute(FSM fsm, EReference reference) {
			var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
			var Type type = fsm.eContainer as Type
			for (attribute : type.attributes) {
				res.add(EObjectDescription.create(QualifiedName.create(attribute.name.split("\\.")), attribute));
			}
			new SimpleScope(IScope.NULLSCOPE, res);
		}

		def scope_Mixin_applies(Mixin mixin, EReference reference) {
			var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
			var Extension ext = mixin.eContainer as Extension
			for (Kind k : ext.getKinds()) {
				res.add(EObjectDescription.create(QualifiedName.create(ext.name, k.name), k));
			}
			for (Extension importExtension : ext.getImport()) {
				for (Kind kind : importExtension.getKinds()) {
					res.add(EObjectDescription.create(QualifiedName.create(importExtension.name, kind.name), kind));
				}
			}
			new SimpleScope(IScope.NULLSCOPE, res);
		}

		def scope_Mixin_depends(Mixin mixin, EReference reference) {
			var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
			var Extension ext = mixin.eContainer as Extension
			for (Mixin k : ext.mixins) {
				res.add(EObjectDescription.create(QualifiedName.create(k.name), k));
			}
			for (Extension importExtension : ext.getImport()) {
				for (Mixin k : importExtension.mixins) {
					res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.name), k));
				}
			}
			new SimpleScope(IScope.NULLSCOPE, res);
		}

		def IScope scope_Configuration_use(Configuration config, EReference ref) {
			scopeForExtensions(config.use);
		}

		def IScope scope_Extension_import(Extension ext, EReference ref) {
			scopeForExtensions(ext.getImport());
		}

		def IScope scopeForExtensions(EList<Extension> extensions) {
			var ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>

			for (exte : extensions) {
				result.add(EObjectDescription.create(QualifiedName.create(EcoreUtil.getURI(exte).toString()), exte))
			}
			new SimpleScope(IScope.NULLSCOPE, result)
		}

		def IScope scopeForKind(Kind kind, EReference ref) {
			var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
			var Extension ext = kind.eContainer as Extension
			for (Kind k : ext.getKinds()) {
				res.add(EObjectDescription.create(QualifiedName.create(k.name), k))
			}
			for (Extension importExtension : ext.getImport()) {
				for (Kind k : importExtension.getKinds()) {
					res.add(EObjectDescription.create(QualifiedName.create(importExtension.name, k.name), k))
				}
			}
			new SimpleScope(IScope.NULLSCOPE, res)
		}

		def IScope scope_ArrayType_type(ArrayType arrayType, EReference ref) {
			var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
			var Extension ext = arrayType.eContainer as Extension
			for (DataType k : ext.types) {
				res.add(EObjectDescription.create(QualifiedName.create(k.name), k))
			}
			for (Extension importExtension : ext.getImport()) {
				for (DataType k : importExtension.types) {
					res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.name), k))
				}
			}
			new SimpleScope(IScope.NULLSCOPE, res);
		}

		def IScope scope_Attribute_type(Attribute attribute, EReference ref) {
			if (attribute.eContainer instanceof Type) {
				new SimpleScope(IScope.NULLSCOPE, getTypes((attribute.eContainer as Type).eContainer as Extension));
			} else {
				if (attribute.eContainer instanceof Action) {
					new SimpleScope(IScope.NULLSCOPE,
						getTypes(((attribute.eContainer as Action).eContainer as Type).eContainer as Extension));
				} else {
					new SimpleScope(IScope.NULLSCOPE,
						getTypes((attribute.eContainer as RecordType).eContainer as Extension));
				}
			}

		}

		def ArrayList<IEObjectDescription> getTypes(Extension ext) {
			var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
			for (DataType k : ext.types) {
				res.add(EObjectDescription.create(QualifiedName.create(k.name), k))
			}
			for (Extension importExtension : ext.getImport()) {
				for (DataType k : importExtension.types) {
					res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.name), k))
				}
			}
			res
		}

	}
	