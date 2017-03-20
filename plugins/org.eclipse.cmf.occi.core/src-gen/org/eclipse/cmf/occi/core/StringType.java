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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.StringType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.StringType#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.StringType#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.StringType#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getStringType()
 * @model
 * @generated
 */
public interface StringType extends BasicType {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getStringType_Pattern()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.StringType#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #setLength(int)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getStringType_Length()
	 * @model unsettable="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.StringType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #isSetLength()
	 * @see #unsetLength()
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cmf.occi.core.StringType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLength()
	 * @see #getLength()
	 * @see #setLength(int)
	 * @generated
	 */
	void unsetLength();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cmf.occi.core.StringType#getLength <em>Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Length</em>' attribute is set.
	 * @see #unsetLength()
	 * @see #getLength()
	 * @see #setLength(int)
	 * @generated
	 */
	boolean isSetLength();

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #isSetMinLength()
	 * @see #unsetMinLength()
	 * @see #setMinLength(int)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getStringType_MinLength()
	 * @model unsettable="true"
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.StringType#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #isSetMinLength()
	 * @see #unsetMinLength()
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cmf.occi.core.StringType#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinLength()
	 * @see #getMinLength()
	 * @see #setMinLength(int)
	 * @generated
	 */
	void unsetMinLength();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cmf.occi.core.StringType#getMinLength <em>Min Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Length</em>' attribute is set.
	 * @see #unsetMinLength()
	 * @see #getMinLength()
	 * @see #setMinLength(int)
	 * @generated
	 */
	boolean isSetMinLength();

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #isSetMaxLength()
	 * @see #unsetMaxLength()
	 * @see #setMaxLength(int)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getStringType_MaxLength()
	 * @model unsettable="true"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.StringType#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #isSetMaxLength()
	 * @see #unsetMaxLength()
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cmf.occi.core.StringType#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxLength()
	 * @see #getMaxLength()
	 * @see #setMaxLength(int)
	 * @generated
	 */
	void unsetMaxLength();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cmf.occi.core.StringType#getMaxLength <em>Max Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Length</em>' attribute is set.
	 * @see #unsetMaxLength()
	 * @see #getMaxLength()
	 * @see #setMaxLength(int)
	 * @generated
	 */
	boolean isSetMaxLength();

} // StringType
