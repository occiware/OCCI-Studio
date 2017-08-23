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
package org.eclipse.cmf.occi.core.xtext.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.xtext.services.OCCIGrammarAccess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class OCCIFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private OCCIGrammarAccess _oCCIGrammarAccess;
  
  protected void _format(final Configuration configuration, @Extension final IFormattableDocument document) {
    final ISemanticRegion klocation = this.textRegionExtensions.regionFor(configuration).feature(OCCIPackage.Literals.CONFIGURATION__LOCATION);
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(klocation, _function);
    final ISemanticRegion kuse = this.textRegionExtensions.regionFor(configuration).keyword(")");
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    document.append(kuse, _function_1);
    EList<Resource> _resources = configuration.getResources();
    for (final Resource resource : _resources) {
      document.<Resource>format(resource);
    }
    EList<Mixin> _mixins = configuration.getMixins();
    for (final Mixin mixin : _mixins) {
      document.<Mixin>format(mixin);
    }
  }
  
  protected void _format(final Resource resource, @Extension final IFormattableDocument document) {
    final ISemanticRegion kkind = this.textRegionExtensions.regionFor(resource).feature(OCCIPackage.Literals.ENTITY__TITLE);
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(1);
    };
    document.append(kkind, _function);
    final ISemanticRegion kattribute = this.textRegionExtensions.regionFor(resource).feature(OCCIPackage.Literals.ENTITY__LOCATION);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(1);
    };
    document.append(kattribute, _function_1);
    final ISemanticRegion ksummary = this.textRegionExtensions.regionFor(resource).feature(OCCIPackage.Literals.RESOURCE__SUMMARY);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(1);
    };
    document.append(ksummary, _function_2);
    EList<MixinBase> _parts = resource.getParts();
    for (final MixinBase mixinBase : _parts) {
      document.<MixinBase>format(mixinBase);
    }
    EList<AttributeState> _attributes = resource.getAttributes();
    for (final AttributeState attribute : _attributes) {
      final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
        it.setNewLines(1, 1, 2);
      };
      document.<AttributeState>append(attribute, _function_3);
    }
    EList<Link> _links = resource.getLinks();
    for (final Link link : _links) {
      document.<Link>format(link);
    }
  }
  
  protected void _format(final Link link, @Extension final IFormattableDocument document) {
    final ISemanticRegion kkind = this.textRegionExtensions.regionFor(link).feature(OCCIPackage.Literals.ENTITY__TITLE);
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(1);
    };
    document.append(kkind, _function);
    final ISemanticRegion kattribute = this.textRegionExtensions.regionFor(link).feature(OCCIPackage.Literals.ENTITY__LOCATION);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(1);
    };
    document.append(kattribute, _function_1);
    final ISemanticRegion ktarget = this.textRegionExtensions.regionFor(link).feature(OCCIPackage.Literals.LINK__TARGET);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setNewLines(1);
    };
    document.append(ktarget, _function_2);
    EList<MixinBase> _parts = link.getParts();
    for (final MixinBase mixinBase : _parts) {
      document.<MixinBase>format(mixinBase);
    }
    EList<AttributeState> _attributes = link.getAttributes();
    for (final AttributeState attributeState : _attributes) {
      document.<AttributeState>format(attributeState);
    }
  }
  
  protected void _format(final AttributeState attributeState, @Extension final IFormattableDocument document) {
    final ISemanticRegion kvalue = this.textRegionExtensions.regionFor(attributeState).feature(OCCIPackage.Literals.ATTRIBUTE_STATE__VALUE);
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(1);
    };
    document.append(kvalue, _function);
  }
  
  public void format(final Object link, final IFormattableDocument document) {
    if (link instanceof XtextResource) {
      _format((XtextResource)link, document);
      return;
    } else if (link instanceof Link) {
      _format((Link)link, document);
      return;
    } else if (link instanceof Resource) {
      _format((Resource)link, document);
      return;
    } else if (link instanceof AttributeState) {
      _format((AttributeState)link, document);
      return;
    } else if (link instanceof Configuration) {
      _format((Configuration)link, document);
      return;
    } else if (link instanceof EObject) {
      _format((EObject)link, document);
      return;
    } else if (link == null) {
      _format((Void)null, document);
      return;
    } else if (link != null) {
      _format(link, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(link, document).toString());
    }
  }
}
