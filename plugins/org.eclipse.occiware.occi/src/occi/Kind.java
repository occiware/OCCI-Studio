/**
 */
package occi;

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
 *   <li>{@link occi.Kind#getParent <em>Parent</em>}</li>
 *   <li>{@link occi.Kind#getActions <em>Actions</em>}</li>
 *   <li>{@link occi.Kind#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see occi.OcciPackage#getKind()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ActionTermUnicity CorrectScheme NoCyclicInheritance EntityKindIsRootParent AttributesNameNotAlreadyDefinedInParent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ActionTermUnicity='actions->isUnique(term)' CorrectScheme='scheme = self.oclContainer().oclAsType(Extension).scheme' NoCyclicInheritance='parent->closure(parent)->excludes(self)' EntityKindIsRootParent='self->closure(parent)->exists(k | k.term = \'entity\' and k.scheme = \'http://schemas.ogf.org/occi/core#\' and k.parent = null)' AttributesNameNotAlreadyDefinedInParent='attributes.name->excludesAll(parent->closure(parent).attributes.name)'"
 * @generated
 */
public interface Kind extends Category {
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
	 * @see occi.OcciPackage#getKind_Parent()
	 * @model
	 * @generated
	 */
	Kind getParent();

	/**
	 * Sets the value of the '{@link occi.Kind#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Kind value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link occi.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see occi.OcciPackage#getKind_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link occi.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see occi.OcciPackage#getKind_Entities()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Entity.allInstances()->select(kind = self)'"
	 * @generated
	 */
	EList<Entity> getEntities();

} // Kind
