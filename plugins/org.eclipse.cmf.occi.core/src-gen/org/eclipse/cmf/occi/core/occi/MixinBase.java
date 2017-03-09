/**
 */
package org.eclipse.cmf.occi.core.occi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixin Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.MixinBase#getMixin <em>Mixin</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.MixinBase#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getMixinBase()
 * @model
 * @generated
 */
public interface MixinBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixin</em>' reference.
	 * @see #setMixin(Mixin)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getMixinBase_Mixin()
	 * @model required="true"
	 * @generated
	 */
	Mixin getMixin();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.MixinBase#getMixin <em>Mixin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mixin</em>' reference.
	 * @see #getMixin()
	 * @generated
	 */
	void setMixin(Mixin value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.occi.Entity#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getMixinBase_Entity()
	 * @see org.eclipse.cmf.occi.core.occi.Entity#getParts
	 * @model opposite="parts" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.occi.MixinBase#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // MixinBase
