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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Annotation Key</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTypeAnnotationKey()
 * @model
 * @generated
 */
public enum TypeAnnotationKey implements Enumerator {
	/**
	 * The '<em><b>Total Digits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTAL_DIGITS_VALUE
	 * @generated
	 * @ordered
	 */
	TOTAL_DIGITS(0, "totalDigits", "totalDigits"),

	/**
	 * The '<em><b>Min Exclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_EXCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_EXCLUSIVE(1, "minExclusive", "minExclusive"),

	/**
	 * The '<em><b>Max Exclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_EXCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_EXCLUSIVE(2, "maxExclusive", "maxExclusive"),

	/**
	 * The '<em><b>Min Inclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_INCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_INCLUSIVE(3, "minInclusive", "minInclusive"),

	/**
	 * The '<em><b>Max Inclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_INCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_INCLUSIVE(4, "maxInclusive", "maxInclusive"),

	/**
	 * The '<em><b>Length</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	LENGTH(5, "length", "length"),

	/**
	 * The '<em><b>Min Length</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	MIN_LENGTH(6, "minLength", "minLength"),

	/**
	 * The '<em><b>Max Length</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_LENGTH(7, "maxLength", "maxLength");

	/**
	 * The '<em><b>Total Digits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Total Digits</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOTAL_DIGITS
	 * @model name="totalDigits"
	 * @generated
	 * @ordered
	 */
	public static final int TOTAL_DIGITS_VALUE = 0;

	/**
	 * The '<em><b>Min Exclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min Exclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN_EXCLUSIVE
	 * @model name="minExclusive"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_EXCLUSIVE_VALUE = 1;

	/**
	 * The '<em><b>Max Exclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Max Exclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_EXCLUSIVE
	 * @model name="maxExclusive"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_EXCLUSIVE_VALUE = 2;

	/**
	 * The '<em><b>Min Inclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min Inclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN_INCLUSIVE
	 * @model name="minInclusive"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_INCLUSIVE_VALUE = 3;

	/**
	 * The '<em><b>Max Inclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Max Inclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_INCLUSIVE
	 * @model name="maxInclusive"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_INCLUSIVE_VALUE = 4;

	/**
	 * The '<em><b>Length</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Length</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LENGTH
	 * @model name="length"
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_VALUE = 5;

	/**
	 * The '<em><b>Min Length</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min Length</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN_LENGTH
	 * @model name="minLength"
	 * @generated
	 * @ordered
	 */
	public static final int MIN_LENGTH_VALUE = 6;

	/**
	 * The '<em><b>Max Length</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Max Length</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_LENGTH
	 * @model name="maxLength"
	 * @generated
	 * @ordered
	 */
	public static final int MAX_LENGTH_VALUE = 7;

	/**
	 * An array of all the '<em><b>Type Annotation Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeAnnotationKey[] VALUES_ARRAY =
		new TypeAnnotationKey[] {
			TOTAL_DIGITS,
			MIN_EXCLUSIVE,
			MAX_EXCLUSIVE,
			MIN_INCLUSIVE,
			MAX_INCLUSIVE,
			LENGTH,
			MIN_LENGTH,
			MAX_LENGTH,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Annotation Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeAnnotationKey> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Annotation Key</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeAnnotationKey get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAnnotationKey result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Annotation Key</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeAnnotationKey getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAnnotationKey result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Annotation Key</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeAnnotationKey get(int value) {
		switch (value) {
			case TOTAL_DIGITS_VALUE: return TOTAL_DIGITS;
			case MIN_EXCLUSIVE_VALUE: return MIN_EXCLUSIVE;
			case MAX_EXCLUSIVE_VALUE: return MAX_EXCLUSIVE;
			case MIN_INCLUSIVE_VALUE: return MIN_INCLUSIVE;
			case MAX_INCLUSIVE_VALUE: return MAX_INCLUSIVE;
			case LENGTH_VALUE: return LENGTH;
			case MIN_LENGTH_VALUE: return MIN_LENGTH;
			case MAX_LENGTH_VALUE: return MAX_LENGTH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeAnnotationKey(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeAnnotationKey
