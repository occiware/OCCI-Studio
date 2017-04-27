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
 * A representation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.NumericType#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.NumericType#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.NumericType#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.NumericType#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.NumericType#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.NumericType#getMaxInclusive <em>Max Inclusive</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getNumericType()
 * @model
 * @generated
 */
public interface NumericType extends BasicType {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.core.NumericTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.core.NumericTypeEnum
	 * @see #setType(NumericTypeEnum)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getNumericType_Type()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!NumericType!type'"
	 * @generated
	 */
	NumericTypeEnum getType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.core.NumericTypeEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(NumericTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Total Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Digits</em>' attribute.
	 * @see #isSetTotalDigits()
	 * @see #unsetTotalDigits()
	 * @see #setTotalDigits(Integer)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getNumericType_TotalDigits()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!NumericType!totalDigits'"
	 * @generated
	 */
	Integer getTotalDigits();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getTotalDigits <em>Total Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Digits</em>' attribute.
	 * @see #isSetTotalDigits()
	 * @see #unsetTotalDigits()
	 * @see #getTotalDigits()
	 * @generated
	 */
	void setTotalDigits(Integer value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getTotalDigits <em>Total Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalDigits()
	 * @see #getTotalDigits()
	 * @see #setTotalDigits(Integer)
	 * @generated
	 */
	void unsetTotalDigits();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getTotalDigits <em>Total Digits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Digits</em>' attribute is set.
	 * @see #unsetTotalDigits()
	 * @see #getTotalDigits()
	 * @see #setTotalDigits(Integer)
	 * @generated
	 */
	boolean isSetTotalDigits();

	/**
	 * Returns the value of the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Exclusive</em>' attribute.
	 * @see #isSetMinExclusive()
	 * @see #unsetMinExclusive()
	 * @see #setMinExclusive(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getNumericType_MinExclusive()
	 * @model unsettable="true" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!NumericType!minExclusive'"
	 * @generated
	 */
	String getMinExclusive();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMinExclusive <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Exclusive</em>' attribute.
	 * @see #isSetMinExclusive()
	 * @see #unsetMinExclusive()
	 * @see #getMinExclusive()
	 * @generated
	 */
	void setMinExclusive(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMinExclusive <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinExclusive()
	 * @see #getMinExclusive()
	 * @see #setMinExclusive(String)
	 * @generated
	 */
	void unsetMinExclusive();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMinExclusive <em>Min Exclusive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Exclusive</em>' attribute is set.
	 * @see #unsetMinExclusive()
	 * @see #getMinExclusive()
	 * @see #setMinExclusive(String)
	 * @generated
	 */
	boolean isSetMinExclusive();

	/**
	 * Returns the value of the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Exclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Exclusive</em>' attribute.
	 * @see #isSetMaxExclusive()
	 * @see #unsetMaxExclusive()
	 * @see #setMaxExclusive(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getNumericType_MaxExclusive()
	 * @model unsettable="true" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!NumericType!maxExclusive'"
	 * @generated
	 */
	String getMaxExclusive();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMaxExclusive <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Exclusive</em>' attribute.
	 * @see #isSetMaxExclusive()
	 * @see #unsetMaxExclusive()
	 * @see #getMaxExclusive()
	 * @generated
	 */
	void setMaxExclusive(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMaxExclusive <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxExclusive()
	 * @see #getMaxExclusive()
	 * @see #setMaxExclusive(String)
	 * @generated
	 */
	void unsetMaxExclusive();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMaxExclusive <em>Max Exclusive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Exclusive</em>' attribute is set.
	 * @see #unsetMaxExclusive()
	 * @see #getMaxExclusive()
	 * @see #setMaxExclusive(String)
	 * @generated
	 */
	boolean isSetMaxExclusive();

	/**
	 * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Inclusive</em>' attribute.
	 * @see #isSetMinInclusive()
	 * @see #unsetMinInclusive()
	 * @see #setMinInclusive(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getNumericType_MinInclusive()
	 * @model unsettable="true" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!NumericType!minInclusive'"
	 * @generated
	 */
	String getMinInclusive();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMinInclusive <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Inclusive</em>' attribute.
	 * @see #isSetMinInclusive()
	 * @see #unsetMinInclusive()
	 * @see #getMinInclusive()
	 * @generated
	 */
	void setMinInclusive(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMinInclusive <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinInclusive()
	 * @see #getMinInclusive()
	 * @see #setMinInclusive(String)
	 * @generated
	 */
	void unsetMinInclusive();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMinInclusive <em>Min Inclusive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Inclusive</em>' attribute is set.
	 * @see #unsetMinInclusive()
	 * @see #getMinInclusive()
	 * @see #setMinInclusive(String)
	 * @generated
	 */
	boolean isSetMinInclusive();

	/**
	 * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Inclusive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Inclusive</em>' attribute.
	 * @see #isSetMaxInclusive()
	 * @see #unsetMaxInclusive()
	 * @see #setMaxInclusive(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getNumericType_MaxInclusive()
	 * @model unsettable="true" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!NumericType!maxInclusive'"
	 * @generated
	 */
	String getMaxInclusive();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Inclusive</em>' attribute.
	 * @see #isSetMaxInclusive()
	 * @see #unsetMaxInclusive()
	 * @see #getMaxInclusive()
	 * @generated
	 */
	void setMaxInclusive(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxInclusive()
	 * @see #getMaxInclusive()
	 * @see #setMaxInclusive(String)
	 * @generated
	 */
	void unsetMaxInclusive();

	/**
	 * Returns whether the value of the '{@link org.eclipse.cmf.occi.core.NumericType#getMaxInclusive <em>Max Inclusive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Inclusive</em>' attribute is set.
	 * @see #unsetMaxInclusive()
	 * @see #getMaxInclusive()
	 * @see #setMaxInclusive(String)
	 * @generated
	 */
	boolean isSetMaxInclusive();
} // NumericType
