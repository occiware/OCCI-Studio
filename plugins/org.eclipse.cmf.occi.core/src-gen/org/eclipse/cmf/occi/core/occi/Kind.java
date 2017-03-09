/**
 */
package org.eclipse.cmf.occi.core.occi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.Kind#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.Kind#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.Kind#getFsm <em>Fsm</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getKind()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CorrectScheme NoCyclicInheritance EntityKindIsRootParent AttributesNameNotAlreadyDefinedInParent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot CorrectScheme='scheme = self.oclContainer().oclAsType(Extension).scheme' NoCyclicInheritance='parent->closure(parent)->excludes(self)' EntityKindIsRootParent='self->closure(parent)->exists(k |\n\t\t\t\t\tk.term = \'entity\' and k.scheme = \'http://schemas.ogf.org/occi/core#\' and k.parent = null)' AttributesNameNotAlreadyDefinedInParent='attributes.name->excludesAll(parent->closure(parent).attributes.name)'"
 * @generated
 */
public interface Kind extends Type {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Kind)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getKind_Parent()
	 * @model
	 * @generated
	 */
	Kind getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.Kind#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Kind value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.occi.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getKind_Entities()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Entity.allInstances()->select(kind = self)'"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Fsm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm</em>' containment reference.
	 * @see #setFsm(FSM)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getKind_Fsm()
	 * @model containment="true"
	 * @generated
	 */
	FSM getFsm();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.Kind#getFsm <em>Fsm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fsm</em>' containment reference.
	 * @see #getFsm()
	 * @generated
	 */
	void setFsm(FSM value);

} // Kind
