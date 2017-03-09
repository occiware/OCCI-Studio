/**
 */
package org.eclipse.cmf.occi.core.occi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.Type#getActions <em>Actions</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.Type#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getType()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ActionTermUnicity ConstraintNameUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ActionTermUnicity='actions->isUnique(term)' ConstraintNameUnique='constraints->isUnique(name)'"
 * @generated
 */
public interface Type extends Category {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.occi.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getType_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.occi.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getType_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // Type
