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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.TypeAnnotation#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.TypeAnnotation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTypeAnnotation()
 * @model
 * @generated
 */
public interface TypeAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.core.TypeAnnotationKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see org.eclipse.cmf.occi.core.TypeAnnotationKey
	 * @see #setKey(TypeAnnotationKey)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTypeAnnotation_Key()
	 * @model required="true"
	 * @generated
	 */
	TypeAnnotationKey getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.TypeAnnotation#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see org.eclipse.cmf.occi.core.TypeAnnotationKey
	 * @see #getKey()
	 * @generated
	 */
	void setKey(TypeAnnotationKey value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTypeAnnotation_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.TypeAnnotation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // TypeAnnotation
