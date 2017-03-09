/**
 */
package occi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link occi.Mixin#getActions <em>Actions</em>}</li>
 *   <li>{@link occi.Mixin#getDepends <em>Depends</em>}</li>
 *   <li>{@link occi.Mixin#getApplies <em>Applies</em>}</li>
 *   <li>{@link occi.Mixin#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see occi.OcciPackage#getMixin()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ActionTermUnicity CorrectScheme NoCyclicInheritance AttributesNameNotAlreadyDefinedInDepends'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ActionTermUnicity='actions->isUnique(term)' CorrectScheme='\n\t\t  /* Previously let ownerScheme = owner.oclAsType(Extension).scheme in scheme.substring(1,ownerScheme.size()-1) = ownerScheme.substring(1,ownerScheme.size()-1) \052/\n\t\t  let owner = self.oclContainer()\n\t\t  in if owner.oclIsTypeOf(Extension) then\n\t\t       let ownerScheme = owner.oclAsType(Extension).scheme\n\t\t       in scheme.substring(1,ownerScheme.size()-1) = ownerScheme.substring(1,ownerScheme.size()-1)\n\t\t     else\n\t\t       true\n\t\t     endif' NoCyclicInheritance='depends->closure(depends)->excludes(self)' AttributesNameNotAlreadyDefinedInDepends='attributes.name->excludesAll(depends->closure(depends).attributes.name)'"
 * @generated
 */
public interface Mixin extends Category {
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
	 * @see occi.OcciPackage#getMixin_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link occi.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see occi.OcciPackage#getMixin_Depends()
	 * @model
	 * @generated
	 */
	EList<Mixin> getDepends();

	/**
	 * Returns the value of the '<em><b>Applies</b></em>' reference list.
	 * The list contents are of type {@link occi.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies</em>' reference list.
	 * @see occi.OcciPackage#getMixin_Applies()
	 * @model
	 * @generated
	 */
	EList<Kind> getApplies();

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
	 * @see occi.OcciPackage#getMixin_Entities()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Entity.allInstances()->select(mixins->includes(self))'"
	 * @generated
	 */
	EList<Entity> getEntities();

} // Mixin
