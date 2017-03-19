/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.State#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.State#isInitial <em>Initial</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.State#isFinal <em>Final</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.State#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.State#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.State#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StateLiteralAlreadyDefinedInFSMAttributeType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot StateLiteralAlreadyDefinedInFSMAttributeType='owningFSM.attribute.type=self.literal.enumerationType'"
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' reference.
	 * @see #setLiteral(EnumerationLiteral)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getState_Literal()
	 * @model
	 * @generated
	 */
	EnumerationLiteral getLiteral();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.State#getLiteral <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(EnumerationLiteral value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(boolean)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getState_Initial()
	 * @model default="false" dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.State#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getState_Final()
	 * @model default="false" dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.State#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.FSM#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning FSM</em>' container reference.
	 * @see #setOwningFSM(FSM)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getState_OwningFSM()
	 * @see org.eclipse.cmf.occi.core.FSM#getOwnedState
	 * @model opposite="ownedState" required="true" transient="false"
	 * @generated
	 */
	FSM getOwningFSM();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.State#getOwningFSM <em>Owning FSM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning FSM</em>' container reference.
	 * @see #getOwningFSM()
	 * @generated
	 */
	void setOwningFSM(FSM value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Transition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getState_OutgoingTransition()
	 * @see org.eclipse.cmf.occi.core.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoingTransition();

	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Transition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getState_IncomingTransition()
	 * @see org.eclipse.cmf.occi.core.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransition();

} // State
