package org.eclipse.cmf.occi.core.xtext;

import java.util.List;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.FSM;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.State;
import org.eclipse.cmf.occi.core.Transition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.linking.lazy.SyntheticLinkingSupport;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;

import com.google.inject.Inject;

public class OCCIDerivedStateComputer implements IDerivedStateComputer {

	@Inject
	SyntheticLinkingSupport sls;

	@Override
	public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (!resource.getContents().isEmpty()) {
			Extension ext = (Extension) resource.getContents().get(0);
			for (Kind k : ext.getKinds()) {
				if(k.getFsm() != null){
				FSM fsm = (FSM) k.getFsm();
				for (State s : fsm.getOwnedState()) {
					System.out.println("start state " + s);
					for (Transition t : s.getOutgoingTransition()) {
						List<INode> nodes = NodeModelUtils.findNodesForFeature(t,
								OCCIPackage.Literals.TRANSITION__TARGET);
						if (!nodes.isEmpty()) {
							String text = nodes.get(0).getText().trim();
							System.out.println("text0 " + text);
							for (State s_cible : fsm.getOwnedState()) {
								if (s_cible.getLiteral().getName().equals(text)) {
									System.out.println("s_cible " + s_cible);
									s_cible.getIncomingTransition().add(t);
									System.out.println(
											"s_cible.getIncomingTransition() " + s_cible.getIncomingTransition());
								}
							}
						}
					}
					System.out.println("finish state " + s);
				}}
			}
		}

	}

	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {
		// TODO Auto-generated method stub

	}

	// @Override
	// public void discardDerivedState(DerivedStateAwareResource resource) {
	// if (!resource.getContents().isEmpty()) {
	// Extension extension = (Extension) resource.getContents().get(0);
	// for (Kind kind : extension.getKinds()) {
	// if (kind.getFsm() != null) {
	// for (State s : kind.getFsm().getOwnedState()) {
	// s.getIncomingTransition().clear();
	// }
	// }
	// }
	// }
	//
	// }

}
