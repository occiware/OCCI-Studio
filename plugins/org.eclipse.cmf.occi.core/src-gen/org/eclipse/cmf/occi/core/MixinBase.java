/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.core;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link org.eclipse.cmf.occi.core.MixinBase#getMixin <em>Mixin</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.MixinBase#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.MixinBase#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getMixinBase()
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
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getMixinBase_Mixin()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!MixinBase!mixin'"
	 * @generated
	 */
	Mixin getMixin();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.MixinBase#getMixin <em>Mixin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mixin</em>' reference.
	 * @see #getMixin()
	 * @generated
	 */
	void setMixin(Mixin value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.Entity#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getMixinBase_Entity()
	 * @see org.eclipse.cmf.occi.core.Entity#getParts
	 * @model opposite="parts" required="true" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!MixinBase!entity'"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.MixinBase#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.AttributeState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getMixinBase_Attributes()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!MixinBase!attributes'"
	 * @generated
	 */
	EList<AttributeState> getAttributes();

} // MixinBase
