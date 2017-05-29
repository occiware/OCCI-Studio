/*
 * generated by Xtext 2.10.0
 */
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

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class OCCIScopeProvider extends AbstractOCCIScopeProvider {

	override getScope(EObject object, EReference ref) {
		//println("getScope " + object)
		if (object instanceof Extension) {
			scope_Extension_import(object as Extension, ref)
		} else {
			if (object instanceof Kind) {
				scope_Kind_parent(object as Kind, ref)
			} else {
				if (object instanceof ArrayType) {
					scope_ArrayType_type(object as ArrayType, ref)
				} else {
					// //println(object)
					// //println(ref)
					if (object instanceof Mixin) {
						if (ref.name.equals("depends")) {
							scope_Mixin_depends(object as Mixin, ref)
						} else {
							// //println("ref" +ref)
							scope_Mixin_applies(object as Mixin, ref)
						}
					} else {
						if (object instanceof Attribute) {
							scope_Attribute_type(object as Attribute, ref)
						} else {
							if (object instanceof FSM) {
								scope_FSM_attribute(object as FSM, ref)
							} else {
								if (object instanceof State) {
									scope_State_literal(object as State, ref)
								} else {
									if (object instanceof Transition) {
										if (ref.name.equals("target")) {
											//println("target " +ref)
											scope_Transition_target(object as Transition, ref)
										} else {
											scope_Transition_action(object as Transition, ref)
										}
									}
									else{
										super.getScope(object, ref)
									}
								}
							}
						}
					}
				}
			}
		}
	}

	def scope_Transition_action(Transition transition, EReference reference) {
		//println("ccccc ")
		var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
		var State s = transition.eContainer as State
		var FSM fsm = s.eContainer as FSM
		var Kind k = fsm.eContainer as Kind
		for (action : k.actions) {
			res.add(
				EObjectDescription.create(QualifiedName.create(action.name), action))
				}
				//println("res " + res)
				return new SimpleScope(IScope.NULLSCOPE, res)
			}

			def scope_Transition_target(Transition transition, EReference reference) {
				//println("scope_Transition_target ")
				var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
				var State s = transition.eContainer as State
				var FSM fsm = s.eContainer as FSM
				for (state : fsm.ownedState) {
					//println("state.literal.name " + state.literal.name)
					//println("state.literal " + state.literal )
					res.add(
						EObjectDescription.create(
							QualifiedName.create((state.literal.eContainer as EnumerationType).name,
								state.literal.name), state))
				}
				//println("res " + res)
				return new SimpleScope(IScope.NULLSCOPE, res)
			}

			def scope_State_literal(State state, EReference reference) {
				var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
				var FSM fsm = state.eContainer as FSM
				var Kind kind = fsm.eContainer as Kind
				var Extension ext = kind.eContainer as Extension
				for (type : ext.types.filter[t|t instanceof EnumerationType]) {
					for (literal : (type as EnumerationType).literals) {
						res.add(EObjectDescription.create(QualifiedName.create(type.name, literal.name), literal));
					}

				}
				//println("ccccc " + res)
				new SimpleScope(IScope.NULLSCOPE, res);
			}

			def scope_FSM_attribute(FSM fsm, EReference reference) {
				var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
				var Kind kind = fsm.eContainer as Kind

				for (attribute : kind.attributes) {
					res.add(EObjectDescription.create(QualifiedName.create(attribute.name.split("\\.")), attribute));
				}
				//println("ccccc " + res)
				new SimpleScope(IScope.NULLSCOPE, res);
			}

			def scope_Mixin_applies(Mixin mixin, EReference reference) {
				// //println("ccccc ")
				var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
				var Extension ext = mixin.eContainer as Extension
				for (Kind k : ext.getKinds()) {
					// //println("ext.name "+ext.name)
					// //println("k.name "+k.name)
					res.add(EObjectDescription.create(QualifiedName.create(ext.name, k.name), k));
				}
				for (Extension importExtension : ext.getImport()) {
					// //println("applies importExtension " + importExtension)
					for (Kind kind : importExtension.getKinds()) {
						// //println("applies qua " + importExtension.name)
						// //println("applies term " + kind.name)
						res.add(EObjectDescription.create(QualifiedName.create(importExtension.name, kind.name), kind));
					}
				}
				//println("mixin applies " + res)
				return new SimpleScope(IScope.NULLSCOPE, res);
			}

			def scope_Mixin_depends(Mixin mixin, EReference reference) {
				// //println("ccccc ")
				var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
				var Extension ext = mixin.eContainer as Extension
				for (Mixin k : ext.mixins) {
					res.add(EObjectDescription.create(QualifiedName.create(k.name), k));
				}
				for (Extension importExtension : ext.getImport()) {
					// //println("importExtension " + importExtension)
					for (Mixin k : importExtension.mixins) {
						// //println("qua " + QualifiedName.create(importExtension.getName()))
						// //println("term " + k.term)
						// //println("k " + k)
						res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.name), k));
					}
				}
				return new SimpleScope(IScope.NULLSCOPE, res);
			}

			def IScope scopeForExtensions(EList<Extension> extensions) {
				// //println("ccccc ")
				var ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>

				for (exte : extensions) {
					result.add(EObjectDescription.create(QualifiedName.create(EcoreUtil.getURI(exte).toString()), exte))
				}
				new SimpleScope(IScope.NULLSCOPE, result)
			}

			def IScope scope_Extension_import(Extension ext, EReference ref) {
				// //println("ccccc ")
				return scopeForExtensions(ext.getImport());
			}

			def IScope scope_Kind_parent(Kind kind, EReference ref) {
				// //println("ccccc ")
				var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
				var Extension ext = kind.eContainer as Extension
				for (Kind k : ext.getKinds()) {
					res.add(EObjectDescription.create(QualifiedName.create(k.getTerm()), k));
				}
				for (Extension importExtension : ext.getImport()) {
					// //println("importExtension " + importExtension)
					for (Kind k : importExtension.getKinds()) {
						// //println("qua " + QualifiedName.create(importExtension.getName()))
						// //println("term " + k.term)
						// //println("k " + k)
						res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.name), k));
					}
				}
				return new SimpleScope(IScope.NULLSCOPE, res);
			}

			def IScope scope_ArrayType_type(ArrayType arrayType, EReference ref) {
				// //println("ccccc ")
				var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
				var Extension ext = arrayType.eContainer as Extension
				for (DataType k : ext.types) {
					res.add(EObjectDescription.create(QualifiedName.create(k.name), k))
				}
				for (Extension importExtension : ext.getImport()) {
					// //println("importExtension " + importExtension)
					for (DataType k : importExtension.types) {
						res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.name), k))
					}
				}
				return new SimpleScope(IScope.NULLSCOPE, res);
			}

			def IScope scope_Attribute_type(Attribute attribute, EReference ref) {
				// //println("attributes ")
				var ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>
				if (attribute.eContainer instanceof Type) {
					var Extension ext = (attribute.eContainer as Type).eContainer as Extension
					for (DataType k : ext.types) {
						res.add(EObjectDescription.create(QualifiedName.create(k.name), k))
					}
					for (Extension importExtension : ext.getImport()) {
						// //println("importExtension " + importExtension)
						for (DataType k : importExtension.types) {
							res.add(
								EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.name), k))
						}
					}
					return new SimpleScope(IScope.NULLSCOPE, res);
				} else {
					var Extension ext = ((attribute.eContainer as Action).eContainer as Type).eContainer as Extension
					for (DataType k : ext.types) {
						res.add(EObjectDescription.create(QualifiedName.create(k.name), k))
					}
					for (Extension importExtension : ext.getImport()) {
						// //println("importExtension " + importExtension)
						for (DataType k : importExtension.types) {
							res.add(
								EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.name), k))
						}
					}
					return new SimpleScope(IScope.NULLSCOPE, res);
				}

			}

		}
		