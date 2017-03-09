/**
 */
package occi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link occi.Category#getTerm <em>Term</em>}</li>
 *   <li>{@link occi.Category#getScheme <em>Scheme</em>}</li>
 *   <li>{@link occi.Category#getTitle <em>Title</em>}</li>
 *   <li>{@link occi.Category#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see occi.OcciPackage#getCategory()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IdentityUnique SchemeEndsWithSharp AttributesNameUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IdentityUnique='Category.allInstances()->isUnique(scheme + term)' SchemeEndsWithSharp='scheme.substring(scheme.size(),scheme.size()) = \'#\'' AttributesNameUnique='attributes->isUnique(name)'"
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see #setTerm(String)
	 * @see occi.OcciPackage#getCategory_Term()
	 * @model dataType="occi.String" required="true"
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link occi.Category#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see occi.OcciPackage#getCategory_Scheme()
	 * @model dataType="occi.String" required="true"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link occi.Category#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

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
	 * @see occi.OcciPackage#getCategory_Title()
	 * @model dataType="occi.String"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link occi.Category#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link occi.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see occi.OcciPackage#getCategory_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Category
