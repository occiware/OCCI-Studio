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
package org.eclipse.cmf.occi.core.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.StringType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.StringTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.StringTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.StringTypeImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.StringTypeImpl#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringTypeImpl extends BasicTypeImpl implements StringType {
	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Integer length = LENGTH_EDEFAULT;

	/**
	 * This is true if the Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lengthESet;

	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected Integer minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * This is true if the Min Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minLengthESet;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Integer maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * This is true if the Max Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxLengthESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.STRING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.STRING_TYPE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Integer newLength) {
		Integer oldLength = length;
		length = newLength;
		boolean oldLengthESet = lengthESet;
		lengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.STRING_TYPE__LENGTH, oldLength, length, !oldLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLength() {
		Integer oldLength = length;
		boolean oldLengthESet = lengthESet;
		length = LENGTH_EDEFAULT;
		lengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCCIPackage.STRING_TYPE__LENGTH, oldLength, LENGTH_EDEFAULT, oldLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLength() {
		return lengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLength(Integer newMinLength) {
		Integer oldMinLength = minLength;
		minLength = newMinLength;
		boolean oldMinLengthESet = minLengthESet;
		minLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.STRING_TYPE__MIN_LENGTH, oldMinLength, minLength, !oldMinLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinLength() {
		Integer oldMinLength = minLength;
		boolean oldMinLengthESet = minLengthESet;
		minLength = MIN_LENGTH_EDEFAULT;
		minLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCCIPackage.STRING_TYPE__MIN_LENGTH, oldMinLength, MIN_LENGTH_EDEFAULT, oldMinLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinLength() {
		return minLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(Integer newMaxLength) {
		Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		boolean oldMaxLengthESet = maxLengthESet;
		maxLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.STRING_TYPE__MAX_LENGTH, oldMaxLength, maxLength, !oldMaxLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxLength() {
		Integer oldMaxLength = maxLength;
		boolean oldMaxLengthESet = maxLengthESet;
		maxLength = MAX_LENGTH_EDEFAULT;
		maxLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCCIPackage.STRING_TYPE__MAX_LENGTH, oldMaxLength, MAX_LENGTH_EDEFAULT, oldMaxLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxLength() {
		return maxLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCCIPackage.STRING_TYPE__PATTERN:
				return getPattern();
			case OCCIPackage.STRING_TYPE__LENGTH:
				return getLength();
			case OCCIPackage.STRING_TYPE__MIN_LENGTH:
				return getMinLength();
			case OCCIPackage.STRING_TYPE__MAX_LENGTH:
				return getMaxLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCCIPackage.STRING_TYPE__PATTERN:
				setPattern((String)newValue);
				return;
			case OCCIPackage.STRING_TYPE__LENGTH:
				setLength((Integer)newValue);
				return;
			case OCCIPackage.STRING_TYPE__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case OCCIPackage.STRING_TYPE__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OCCIPackage.STRING_TYPE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case OCCIPackage.STRING_TYPE__LENGTH:
				unsetLength();
				return;
			case OCCIPackage.STRING_TYPE__MIN_LENGTH:
				unsetMinLength();
				return;
			case OCCIPackage.STRING_TYPE__MAX_LENGTH:
				unsetMaxLength();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OCCIPackage.STRING_TYPE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case OCCIPackage.STRING_TYPE__LENGTH:
				return isSetLength();
			case OCCIPackage.STRING_TYPE__MIN_LENGTH:
				return isSetMinLength();
			case OCCIPackage.STRING_TYPE__MAX_LENGTH:
				return isSetMaxLength();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pattern: ");
		result.append(pattern);
		result.append(", length: ");
		if (lengthESet) result.append(length); else result.append("<unset>");
		result.append(", minLength: ");
		if (minLengthESet) result.append(minLength); else result.append("<unset>");
		result.append(", maxLength: ");
		if (maxLengthESet) result.append(maxLength); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StringTypeImpl
