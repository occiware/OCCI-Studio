/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.cmf.occi.core.xtext;

import org.eclipse.cmf.occi.core.xtext.AbstractOCCIRuntimeModule;
import org.eclipse.cmf.occi.core.xtext.scoping.OCCILinker;
import org.eclipse.cmf.occi.core.xtext.serializer.OCCICrossReferenceSerializer;
import org.eclipse.cmf.occi.core.xtext.services.CustomDefaultEcoreElementFactory;
import org.eclipse.cmf.occi.core.xtext.services.OCCICustomLegacyTransientValueService;
import org.eclipse.cmf.occi.core.xtext.services.OCCIDerivedStateComputer;
import org.eclipse.cmf.occi.core.xtext.services.OCCITransientValueService;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.tokens.ICrossReferenceSerializer;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class OCCIRuntimeModule extends AbstractOCCIRuntimeModule {
  @Override
  public Class<? extends ILinker> bindILinker() {
    return OCCILinker.class;
  }
  
  @Override
  public Class<? extends ITransientValueService> bindITransientValueService() {
    return OCCITransientValueService.class;
  }
  
  public Class<? extends org.eclipse.xtext.serializer.sequencer.ITransientValueService> bindITransientValueServiceOld() {
    return OCCICustomLegacyTransientValueService.class;
  }
  
  @Override
  public Class<? extends IAstFactory> bindIAstFactory() {
    return CustomDefaultEcoreElementFactory.class;
  }
  
  public Class<? extends ICrossReferenceSerializer> bindICrossReferenceSerializer() {
    return OCCICrossReferenceSerializer.class;
  }
  
  public Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
    return OCCIDerivedStateComputer.class;
  }
  
  public Class<? extends IResourceDescription.Manager> bindIResourceDescription$Manager() {
    return DerivedStateAwareResourceDescriptionManager.class;
  }
  
  @Override
  public Class<? extends XtextResource> bindXtextResource() {
    return DerivedStateAwareResource.class;
  }
}