package org.eclipse.cmf.occi.core.xtext.services;

import com.google.common.base.Objects;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class OCCIDerivedStateComputer implements IDerivedStateComputer {
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    boolean _isEmpty = resource.getContents().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EObject _head = IterableExtensions.<EObject>head(resource.getContents());
      if ((_head instanceof Configuration)) {
        EObject _head_1 = IterableExtensions.<EObject>head(resource.getContents());
        final Configuration configuration = ((Configuration) _head_1);
        EList<Resource> _resources = configuration.getResources();
        for (final Resource resourceOcci : _resources) {
          resourceOcci.getRlinks().clear();
        }
      }
    }
  }
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    boolean _isEmpty = resource.getContents().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EObject _head = IterableExtensions.<EObject>head(resource.getContents());
      if ((_head instanceof Configuration)) {
        EObject _head_1 = IterableExtensions.<EObject>head(resource.getContents());
        final Configuration configuration = ((Configuration) _head_1);
        EList<Resource> _resources = configuration.getResources();
        for (final Resource resourceOcci : _resources) {
          EList<Resource> _resources_1 = configuration.getResources();
          for (final Resource resourceOcci2 : _resources_1) {
            EList<Link> _links = resourceOcci2.getLinks();
            for (final Link link : _links) {
              {
                INode _head_2 = IterableExtensions.<INode>head(NodeModelUtils.findNodesForFeature(link, OCCIPackage.Literals.LINK__TARGET));
                String _text = null;
                if (_head_2!=null) {
                  _text=_head_2.getText();
                }
                String _trim = null;
                if (_text!=null) {
                  _trim=_text.trim();
                }
                final String id = _trim;
                String _id = resourceOcci.getId();
                String _plus = ("\"" + _id);
                String _plus_1 = (_plus + "\"");
                boolean _equals = Objects.equal(_plus_1, id);
                if (_equals) {
                  final EObject proxy = EcoreUtil.create(OCCIPackage.Literals.LINK);
                  ((InternalEObject) proxy).eSetProxyURI(EcoreUtil.getURI(resourceOcci));
                  ((InternalEObject) proxy).eSetProxyURI(EcoreUtil.getURI(link));
                  EList<Link> _rlinks = resourceOcci.getRlinks();
                  EObject _eObjectfromEProxy = this.getEObjectfromEProxy(resourceOcci, proxy);
                  _rlinks.add(((Link) _eObjectfromEProxy));
                }
              }
            }
          }
        }
      }
    }
  }
  
  public EObject getEObjectfromEProxy(final EObject model, final EObject target) {
    boolean _eIsProxy = target.eIsProxy();
    if (_eIsProxy) {
      URI proxyURI = ((InternalEObject) target).eProxyURI();
      return model.eResource().getEObject(proxyURI.fragment());
    }
    return null;
  }
}
