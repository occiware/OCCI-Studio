/**
 */
package org.eclipse.cmf.occi.core.occi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EEnumLiteral;
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
 *   <li>{@link org.eclipse.cmf.occi.core.occi.State#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.State#getOwningFSM <em>Owning FSM</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.State#getOutgoingTransition <em>Outgoing Transition</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.State#getIncomingTransition <em>Incoming Transition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StateLiteralAlreadyDefinedInFSMAttributeType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot StateLiteralAlreadyDefinedInFSMAttributeType='owningFSM.attribute.type.oclAsType(ecore::EEnum)=literal.eEnum'"
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
	 * @see #setLiteral(EEnumLiteral)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getState_Literal()
	 * @model
	 * @generated
	 */
	EEnumLiteral getLiteral();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.State#getLiteral <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(EEnumLiteral value);

	/**
	 * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.occi.FSM#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning FSM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning FSM</em>' container reference.
	 * @see #setOwningFSM(FSM)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getState_OwningFSM()
	 * @see org.eclipse.cmf.occi.core.occi.FSM#getOwnedState
	 * @model opposite="ownedState" required="true" transient="false"
	 * @generated
	 */
	FSM getOwningFSM();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.State#getOwningFSM <em>Owning FSM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning FSM</em>' container reference.
	 * @see #getOwningFSM()
	 * @generated
	 */
	void setOwningFSM(FSM value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.occi.Transition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.occi.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transition</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getState_OutgoingTransition()
	 * @see org.eclipse.cmf.occi.core.occi.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoingTransition();

	/**
	 * Returns the value of the '<em><b>Incoming Transition</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.occi.Transition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.occi.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transition</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getState_IncomingTransition()
	 * @see org.eclipse.cmf.occi.core.occi.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransition();

} // State
