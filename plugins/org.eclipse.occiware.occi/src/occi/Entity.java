/**
 */
package occi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link occi.Entity#getId <em>Id</em>}</li>
 *   <li>{@link occi.Entity#getTitle <em>Title</em>}</li>
 *   <li>{@link occi.Entity#getKind <em>Kind</em>}</li>
 *   <li>{@link occi.Entity#getMixins <em>Mixins</em>}</li>
 *   <li>{@link occi.Entity#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see occi.OcciPackage#getEntity()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IdUnique AttributesNameUnique KindCompatibleWithOneAppliesOfEachMixin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IdUnique='Entity.allInstances()->isUnique(id)' AttributesNameUnique='attributes->isUnique(name)' KindCompatibleWithOneAppliesOfEachMixin='mixins->forAll(m | m.applies->notEmpty() implies m.applies->exists(k | kind->closure(parent)->includes(k)))'"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see occi.OcciPackage#getEntity_Id()
	 * @model dataType="occi.URI" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link occi.Entity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see occi.OcciPackage#getEntity_Title()
	 * @model dataType="occi.String"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link occi.Entity#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(Kind)
	 * @see occi.OcciPackage#getEntity_Kind()
	 * @model required="true"
	 * @generated
	 */
	Kind getKind();

	/**
	 * Sets the value of the '{@link occi.Entity#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind value);

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' reference list.
	 * The list contents are of type {@link occi.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' reference list.
	 * @see occi.OcciPackage#getEntity_Mixins()
	 * @model
	 * @generated
	 */
	EList<Mixin> getMixins();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link occi.AttributeState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see occi.OcciPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeState> getAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void occiCreate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void occiRetrieve();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void occiUpdate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void occiDelete();

} // Entity
