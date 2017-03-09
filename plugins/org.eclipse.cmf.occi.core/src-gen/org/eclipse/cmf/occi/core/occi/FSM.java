/**
 */
package org.eclipse.cmf.occi.core.occi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.FSM#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.FSM#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.FSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.FSM#getFinalState <em>Final State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.FSM#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getFSM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AttributeTypeMustBeEEnum'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AttributeTypeMustBeEEnum='attribute.type.oclIsTypeOf(ecore::EEnum)'"
 * @generated
 */
public interface FSM extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getFSM_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.occi.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.FSM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.occi.State}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.occi.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getFSM_OwnedState()
	 * @see org.eclipse.cmf.occi.core.occi.State#getOwningFSM
	 * @model opposite="owningFSM" containment="true"
	 * @generated
	 */
	EList<State> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getFSM_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.FSM#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.occi.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getFSM_FinalState()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getFinalState();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getFSM_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.FSM#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // FSM
