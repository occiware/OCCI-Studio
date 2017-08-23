/**
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
 */
package org.eclipse.cmf.occi.core.xtext.scoping;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.ArrayType;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.FSM;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.RecordType;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.State;
import org.eclipse.cmf.occi.core.Transition;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.cmf.occi.core.xtext.scoping.AbstractOCCIScopeProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class OCCIScopeProvider extends AbstractOCCIScopeProvider {
  @Override
  public IScope getScope(final EObject object, final EReference ref) {
    IScope _xblockexpression = null;
    {
      if ((object instanceof Configuration)) {
        return this.scope_Configuration_use(((Configuration) object), ref);
      }
      if ((object instanceof Resource)) {
        return this.scope_Resource_kind(((Resource) object), ref);
      }
      if ((object instanceof Link)) {
        boolean _equals = Objects.equal(ref, OCCIPackage.Literals.ENTITY__KIND);
        if (_equals) {
          return this.scope_Link_kind(((Link) object), ref);
        }
        boolean _equals_1 = Objects.equal(ref, OCCIPackage.Literals.LINK__TARGET);
        if (_equals_1) {
          return this.scope_Link_target(((Link) object), ref);
        }
      }
      if ((object instanceof MixinBase)) {
        return this.scope_MixinBase_mixin(((MixinBase) object), ref);
      }
      if ((object instanceof Extension)) {
        return this.scope_Extension_import(((Extension) object), ref);
      }
      if ((object instanceof Kind)) {
        return this.scopeForKind(((Kind) object), ref);
      }
      if ((object instanceof Mixin)) {
        boolean _equals_2 = Objects.equal(ref, OCCIPackage.Literals.MIXIN__DEPENDS);
        if (_equals_2) {
          return this.scope_Mixin_depends(((Mixin) object), ref);
        }
        boolean _equals_3 = Objects.equal(ref, OCCIPackage.Literals.MIXIN__APPLIES);
        if (_equals_3) {
          return this.scope_Mixin_applies(((Mixin) object), ref);
        }
      }
      if ((object instanceof Attribute)) {
        return this.scope_Attribute_type(((Attribute) object), ref);
      }
      if ((object instanceof FSM)) {
        return this.scope_FSM_attribute(((FSM) object), ref);
      }
      if ((object instanceof State)) {
        return this.scope_State_literal(((State) object), ref);
      }
      if ((object instanceof Transition)) {
        boolean _equals_4 = Objects.equal(ref, OCCIPackage.Literals.TRANSITION__TARGET);
        if (_equals_4) {
          return this.scope_Transition_target(((Transition) object), ref);
        }
        boolean _equals_5 = Objects.equal(ref, OCCIPackage.Literals.TRANSITION__ACTION);
        if (_equals_5) {
          return this.scope_Transition_action(((Transition) object), ref);
        }
      }
      if ((object instanceof ArrayType)) {
        return this.scope_ArrayType_type(((ArrayType) object), ref);
      }
      _xblockexpression = super.getScope(object, ref);
    }
    return _xblockexpression;
  }
  
  public SimpleScope scope_Link_target(final Link link, final EReference reference) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      EObject _eContainer = link.eContainer();
      EObject _eContainer_1 = ((Resource) _eContainer).eContainer();
      Configuration ext = ((Configuration) _eContainer_1);
      EList<Resource> _resources = ext.getResources();
      for (final Resource resource : _resources) {
        res.add(EObjectDescription.create(resource.getId(), resource));
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, res);
    }
    return _xblockexpression;
  }
  
  public SimpleScope scope_Link_kind(final Link link, final EReference reference) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      EObject _eContainer = link.eContainer();
      EObject _eContainer_1 = ((Resource) _eContainer).eContainer();
      Configuration ext = ((Configuration) _eContainer_1);
      EList<Extension> _use = ext.getUse();
      for (final Extension importExtension : _use) {
        EList<Kind> _kinds = importExtension.getKinds();
        for (final Kind k : _kinds) {
          res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.getName()), k));
        }
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, res);
    }
    return _xblockexpression;
  }
  
  public SimpleScope scope_MixinBase_mixin(final MixinBase base, final EReference reference) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      Configuration config = null;
      EObject _eContainer = base.eContainer();
      EObject _eContainer_1 = ((Entity) _eContainer).eContainer();
      if ((_eContainer_1 instanceof Configuration)) {
        EObject _eContainer_2 = base.eContainer();
        EObject _eContainer_3 = ((Entity) _eContainer_2).eContainer();
        config = ((Configuration) _eContainer_3);
      } else {
        EObject _eContainer_4 = base.eContainer();
        EObject _eContainer_5 = ((Entity) _eContainer_4).eContainer();
        EObject _eContainer_6 = ((Resource) _eContainer_5).eContainer();
        config = ((Configuration) _eContainer_6);
      }
      EList<Mixin> _mixins = config.getMixins();
      for (final Mixin k : _mixins) {
        res.add(EObjectDescription.create(k.getName(), k));
      }
      EList<Extension> _use = config.getUse();
      for (final Extension useExtension : _use) {
        EList<Mixin> _mixins_1 = useExtension.getMixins();
        for (final Mixin kind : _mixins_1) {
          res.add(EObjectDescription.create(QualifiedName.create(useExtension.getName(), kind.getName()), kind));
        }
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, res);
    }
    return _xblockexpression;
  }
  
  public SimpleScope scope_Resource_kind(final Resource resource, final EReference reference) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      EObject _eContainer = resource.eContainer();
      Configuration ext = ((Configuration) _eContainer);
      EList<Extension> _use = ext.getUse();
      for (final Extension importExtension : _use) {
        EList<Kind> _kinds = importExtension.getKinds();
        for (final Kind k : _kinds) {
          res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k.getName()), k));
        }
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, res);
    }
    return _xblockexpression;
  }
  
  public SimpleScope scope_Transition_action(final Transition transition, final EReference reference) {
    ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
    EObject _eContainer = transition.eContainer();
    State s = ((State) _eContainer);
    EObject _eContainer_1 = s.eContainer();
    FSM fsm = ((FSM) _eContainer_1);
    EObject _eContainer_2 = fsm.eContainer();
    Type t = ((Type) _eContainer_2);
    EList<Action> _actions = t.getActions();
    for (final Action action : _actions) {
      res.add(EObjectDescription.create(QualifiedName.create(action.getName()), action));
    }
    return new SimpleScope(IScope.NULLSCOPE, res);
  }
  
  public SimpleScope scope_Transition_target(final Transition transition, final EReference reference) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      EObject _eContainer = transition.eContainer();
      State s = ((State) _eContainer);
      EObject _eContainer_1 = s.eContainer();
      FSM fsm = ((FSM) _eContainer_1);
      EList<State> _ownedState = fsm.getOwnedState();
      for (final State state : _ownedState) {
        EnumerationLiteral _literal = state.getLiteral();
        boolean _tripleNotEquals = (_literal != null);
        if (_tripleNotEquals) {
          EObject _eContainer_2 = state.getLiteral().eContainer();
          res.add(
            EObjectDescription.create(
              QualifiedName.create(((EnumerationType) _eContainer_2).getName(), state.getLiteral().getName()), state));
        }
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, res);
    }
    return _xblockexpression;
  }
  
  public SimpleScope scope_State_literal(final State state, final EReference reference) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      EObject _eContainer = state.eContainer();
      FSM fsm = ((FSM) _eContainer);
      EObject _eContainer_1 = fsm.eContainer();
      Type typee = ((Type) _eContainer_1);
      EObject _eContainer_2 = typee.eContainer();
      Extension ext = ((Extension) _eContainer_2);
      final Function1<DataType, Boolean> _function = (DataType t) -> {
        return Boolean.valueOf((t instanceof EnumerationType));
      };
      Iterable<DataType> _filter = IterableExtensions.<DataType>filter(ext.getTypes(), _function);
      for (final DataType type : _filter) {
        EList<EnumerationLiteral> _literals = ((EnumerationType) type).getLiterals();
        for (final EnumerationLiteral literal : _literals) {
          res.add(EObjectDescription.create(QualifiedName.create(type.getName(), literal.getName()), literal));
        }
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, res);
    }
    return _xblockexpression;
  }
  
  public SimpleScope scope_FSM_attribute(final FSM fsm, final EReference reference) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      EObject _eContainer = fsm.eContainer();
      Type type = ((Type) _eContainer);
      EList<Attribute> _attributes = type.getAttributes();
      for (final Attribute attribute : _attributes) {
        res.add(EObjectDescription.create(QualifiedName.create(attribute.getName().split("\\.")), attribute));
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, res);
    }
    return _xblockexpression;
  }
  
  public SimpleScope scope_Mixin_applies(final Mixin mixin, final EReference reference) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      EObject _eContainer = mixin.eContainer();
      Extension ext = ((Extension) _eContainer);
      EList<Kind> _kinds = ext.getKinds();
      for (final Kind k : _kinds) {
        res.add(EObjectDescription.create(QualifiedName.create(ext.getName(), k.getName()), k));
      }
      EList<Extension> _import = ext.getImport();
      for (final Extension importExtension : _import) {
        EList<Kind> _kinds_1 = importExtension.getKinds();
        for (final Kind kind : _kinds_1) {
          res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), kind.getName()), kind));
        }
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, res);
    }
    return _xblockexpression;
  }
  
  public SimpleScope scope_Mixin_depends(final Mixin mixin, final EReference reference) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      EObject _eContainer = mixin.eContainer();
      Extension ext = ((Extension) _eContainer);
      EList<Mixin> _mixins = ext.getMixins();
      for (final Mixin k : _mixins) {
        res.add(EObjectDescription.create(QualifiedName.create(k.getName()), k));
      }
      EList<Extension> _import = ext.getImport();
      for (final Extension importExtension : _import) {
        EList<Mixin> _mixins_1 = importExtension.getMixins();
        for (final Mixin k_1 : _mixins_1) {
          res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k_1.getName()), k_1));
        }
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, res);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Configuration_use(final Configuration config, final EReference ref) {
    return this.scopeForExtensions(config.getUse());
  }
  
  public IScope scope_Extension_import(final Extension ext, final EReference ref) {
    return this.scopeForExtensions(ext.getImport());
  }
  
  public IScope scopeForExtensions(final EList<Extension> extensions) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
      for (final Extension exte : extensions) {
        result.add(EObjectDescription.create(QualifiedName.create(EcoreUtil.getURI(exte).toString()), exte));
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, result);
    }
    return _xblockexpression;
  }
  
  public IScope scopeForKind(final Kind kind, final EReference ref) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      EObject _eContainer = kind.eContainer();
      Extension ext = ((Extension) _eContainer);
      EList<Kind> _kinds = ext.getKinds();
      for (final Kind k : _kinds) {
        res.add(EObjectDescription.create(QualifiedName.create(k.getName()), k));
      }
      EList<Extension> _import = ext.getImport();
      for (final Extension importExtension : _import) {
        EList<Kind> _kinds_1 = importExtension.getKinds();
        for (final Kind k_1 : _kinds_1) {
          res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k_1.getName()), k_1));
        }
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, res);
    }
    return _xblockexpression;
  }
  
  public IScope scope_ArrayType_type(final ArrayType arrayType, final EReference ref) {
    SimpleScope _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      EObject _eContainer = arrayType.eContainer();
      Extension ext = ((Extension) _eContainer);
      EList<DataType> _types = ext.getTypes();
      for (final DataType k : _types) {
        res.add(EObjectDescription.create(QualifiedName.create(k.getName()), k));
      }
      EList<Extension> _import = ext.getImport();
      for (final Extension importExtension : _import) {
        EList<DataType> _types_1 = importExtension.getTypes();
        for (final DataType k_1 : _types_1) {
          res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k_1.getName()), k_1));
        }
      }
      _xblockexpression = new SimpleScope(IScope.NULLSCOPE, res);
    }
    return _xblockexpression;
  }
  
  public IScope scope_Attribute_type(final Attribute attribute, final EReference ref) {
    SimpleScope _xifexpression = null;
    EObject _eContainer = attribute.eContainer();
    if ((_eContainer instanceof Type)) {
      EObject _eContainer_1 = attribute.eContainer();
      EObject _eContainer_2 = ((Type) _eContainer_1).eContainer();
      ArrayList<IEObjectDescription> _types = this.getTypes(((Extension) _eContainer_2));
      _xifexpression = new SimpleScope(IScope.NULLSCOPE, _types);
    } else {
      SimpleScope _xifexpression_1 = null;
      EObject _eContainer_3 = attribute.eContainer();
      if ((_eContainer_3 instanceof Action)) {
        EObject _eContainer_4 = attribute.eContainer();
        EObject _eContainer_5 = ((Action) _eContainer_4).eContainer();
        EObject _eContainer_6 = ((Type) _eContainer_5).eContainer();
        ArrayList<IEObjectDescription> _types_1 = this.getTypes(((Extension) _eContainer_6));
        _xifexpression_1 = new SimpleScope(IScope.NULLSCOPE, _types_1);
      } else {
        EObject _eContainer_7 = attribute.eContainer();
        EObject _eContainer_8 = ((RecordType) _eContainer_7).eContainer();
        ArrayList<IEObjectDescription> _types_2 = this.getTypes(((Extension) _eContainer_8));
        _xifexpression_1 = new SimpleScope(IScope.NULLSCOPE, _types_2);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public ArrayList<IEObjectDescription> getTypes(final Extension ext) {
    ArrayList<IEObjectDescription> _xblockexpression = null;
    {
      ArrayList<IEObjectDescription> res = new ArrayList<IEObjectDescription>();
      EList<DataType> _types = ext.getTypes();
      for (final DataType k : _types) {
        res.add(EObjectDescription.create(QualifiedName.create(k.getName()), k));
      }
      EList<Extension> _import = ext.getImport();
      for (final Extension importExtension : _import) {
        EList<DataType> _types_1 = importExtension.getTypes();
        for (final DataType k_1 : _types_1) {
          res.add(EObjectDescription.create(QualifiedName.create(importExtension.getName(), k_1.getName()), k_1));
        }
      }
      _xblockexpression = res;
    }
    return _xblockexpression;
  }
}
