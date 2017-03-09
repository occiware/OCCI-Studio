/**
 */
package org.eclipse.cmf.occi.core.occi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.Resource#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.Resource#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.Resource#getRlinks <em>Rlinks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ResourceKindIsInParent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ResourceKindIsInParent='kind->closure(parent)->exists(k |\n\t\t\t\tk.term = \'resource\' and k.scheme = \'http://schemas.ogf.org/occi/core#\')'"
 * @generated
 */
public interface Resource extends Entity {
	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getResource_Summary()
	 * @model dataType="org.eclipse.cmf.occi.core.occi.String"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.Resource#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.occi.Link}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.occi.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getResource_Links()
	 * @see org.eclipse.cmf.occi.core.occi.Link#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Rlinks</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.occi.Link}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.occi.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rlinks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rlinks</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getResource_Rlinks()
	 * @see org.eclipse.cmf.occi.core.occi.Link#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Link> getRlinks();

} // Resource
