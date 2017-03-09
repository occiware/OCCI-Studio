/**
 */
package org.eclipse.cmf.occi.core.occi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.Link#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.Link#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LinkKindIsInParent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot LinkKindIsInParent='kind->closure(parent)->exists(k |\n\t\t\t\tk.term = \'link\' and k.scheme = \'http://schemas.ogf.org/occi/core#\')'"
 * @generated
 */
public interface Link extends Entity {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.occi.Resource#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Resource)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getLink_Source()
	 * @see org.eclipse.cmf.occi.core.occi.Resource#getLinks
	 * @model opposite="links" required="true" transient="false"
	 * @generated
	 */
	Resource getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.Link#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Resource value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.occi.Resource#getRlinks <em>Rlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Resource)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getLink_Target()
	 * @see org.eclipse.cmf.occi.core.occi.Resource#getRlinks
	 * @model opposite="rlinks" required="true"
	 * @generated
	 */
	Resource getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Resource value);

} // Link
