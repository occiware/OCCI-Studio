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
package org.eclipse.cmf.occi.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.cmf.occi.core.NumericType;
import org.eclipse.cmf.occi.core.NumericTypeEnum;
import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.util.OCCIValidator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Numeric
 * Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.impl.NumericTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.NumericTypeImpl#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.NumericTypeImpl#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.NumericTypeImpl#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.NumericTypeImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.NumericTypeImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericTypeImpl extends BasicTypeImpl implements NumericType {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NumericTypeEnum TYPE_EDEFAULT = NumericTypeEnum.BYTE;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NumericTypeEnum type = TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTotalDigits()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_DIGITS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTotalDigits()
	 * @generated
	 * @ordered
	 */
	protected int totalDigits = TOTAL_DIGITS_EDEFAULT;
	/**
	 * This is true if the Total Digits attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean totalDigitsESet;
	/**
	 * The default value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EXCLUSIVE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinExclusive()
	 * @generated
	 * @ordered
	 */
	protected String minExclusive = MIN_EXCLUSIVE_EDEFAULT;
	/**
	 * This is true if the Min Exclusive attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean minExclusiveESet;
	/**
	 * The default value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EXCLUSIVE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxExclusive()
	 * @generated
	 * @ordered
	 */
	protected String maxExclusive = MAX_EXCLUSIVE_EDEFAULT;
	/**
	 * This is true if the Max Exclusive attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean maxExclusiveESet;
	/**
	 * The default value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_INCLUSIVE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinInclusive()
	 * @generated
	 * @ordered
	 */
	protected String minInclusive = MIN_INCLUSIVE_EDEFAULT;
	/**
	 * This is true if the Min Inclusive attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean minInclusiveESet;
	/**
	 * The default value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_INCLUSIVE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected String maxInclusive = MAX_INCLUSIVE_EDEFAULT;
	/**
	 * This is true if the Max Inclusive attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean maxInclusiveESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.NUMERIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NumericTypeEnum getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(NumericTypeEnum newType) {
		NumericTypeEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.NUMERIC_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalDigits() {
		return totalDigits;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDigits(int newTotalDigits) {
		int oldTotalDigits = totalDigits;
		totalDigits = newTotalDigits;
		boolean oldTotalDigitsESet = totalDigitsESet;
		totalDigitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.NUMERIC_TYPE__TOTAL_DIGITS, oldTotalDigits, totalDigits, !oldTotalDigitsESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalDigits() {
		int oldTotalDigits = totalDigits;
		boolean oldTotalDigitsESet = totalDigitsESet;
		totalDigits = TOTAL_DIGITS_EDEFAULT;
		totalDigitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCCIPackage.NUMERIC_TYPE__TOTAL_DIGITS, oldTotalDigits, TOTAL_DIGITS_EDEFAULT, oldTotalDigitsESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalDigits() {
		return totalDigitsESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinExclusive() {
		return minExclusive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinExclusive(String newMinExclusive) {
		String oldMinExclusive = minExclusive;
		minExclusive = newMinExclusive;
		boolean oldMinExclusiveESet = minExclusiveESet;
		minExclusiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.NUMERIC_TYPE__MIN_EXCLUSIVE, oldMinExclusive, minExclusive, !oldMinExclusiveESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinExclusive() {
		String oldMinExclusive = minExclusive;
		boolean oldMinExclusiveESet = minExclusiveESet;
		minExclusive = MIN_EXCLUSIVE_EDEFAULT;
		minExclusiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCCIPackage.NUMERIC_TYPE__MIN_EXCLUSIVE, oldMinExclusive, MIN_EXCLUSIVE_EDEFAULT, oldMinExclusiveESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinExclusive() {
		return minExclusiveESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxExclusive() {
		return maxExclusive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxExclusive(String newMaxExclusive) {
		String oldMaxExclusive = maxExclusive;
		maxExclusive = newMaxExclusive;
		boolean oldMaxExclusiveESet = maxExclusiveESet;
		maxExclusiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.NUMERIC_TYPE__MAX_EXCLUSIVE, oldMaxExclusive, maxExclusive, !oldMaxExclusiveESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxExclusive() {
		String oldMaxExclusive = maxExclusive;
		boolean oldMaxExclusiveESet = maxExclusiveESet;
		maxExclusive = MAX_EXCLUSIVE_EDEFAULT;
		maxExclusiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCCIPackage.NUMERIC_TYPE__MAX_EXCLUSIVE, oldMaxExclusive, MAX_EXCLUSIVE_EDEFAULT, oldMaxExclusiveESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxExclusive() {
		return maxExclusiveESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinInclusive() {
		return minInclusive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInclusive(String newMinInclusive) {
		String oldMinInclusive = minInclusive;
		minInclusive = newMinInclusive;
		boolean oldMinInclusiveESet = minInclusiveESet;
		minInclusiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.NUMERIC_TYPE__MIN_INCLUSIVE, oldMinInclusive, minInclusive, !oldMinInclusiveESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinInclusive() {
		String oldMinInclusive = minInclusive;
		boolean oldMinInclusiveESet = minInclusiveESet;
		minInclusive = MIN_INCLUSIVE_EDEFAULT;
		minInclusiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCCIPackage.NUMERIC_TYPE__MIN_INCLUSIVE, oldMinInclusive, MIN_INCLUSIVE_EDEFAULT, oldMinInclusiveESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinInclusive() {
		return minInclusiveESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxInclusive() {
		return maxInclusive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInclusive(String newMaxInclusive) {
		String oldMaxInclusive = maxInclusive;
		maxInclusive = newMaxInclusive;
		boolean oldMaxInclusiveESet = maxInclusiveESet;
		maxInclusiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.NUMERIC_TYPE__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive, !oldMaxInclusiveESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxInclusive() {
		String oldMaxInclusive = maxInclusive;
		boolean oldMaxInclusiveESet = maxInclusiveESet;
		maxInclusive = MAX_INCLUSIVE_EDEFAULT;
		maxInclusiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OCCIPackage.NUMERIC_TYPE__MAX_INCLUSIVE, oldMaxInclusive, MAX_INCLUSIVE_EDEFAULT, oldMaxInclusiveESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxInclusive() {
		return maxInclusiveESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validate(DiagnosticChain diagnostic, Map<Object, Object> context) {
		boolean valid = true;
		switch (type) {
		case INTEGER: {
			if (isSetMaxExclusive()) {
				try {
					Integer.parseInt(maxExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMaxInclusive()) {
				try {
					Integer.parseInt(maxInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinExclusive()) {
				try {
					Integer.parseInt(minExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinInclusive()) {
				try {
					Integer.parseInt(minInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			return valid;
		}
		case BYTE: {
			if (isSetMaxExclusive()) {
				try {
					Byte.parseByte(maxExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMaxInclusive()) {
				try {
					Byte.parseByte(maxInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinExclusive()) {
				try {
					Byte.parseByte(minExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinInclusive()) {
				try {
					Byte.parseByte(minInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			return valid;
		}
		case DOUBLE: {
			if (isSetMaxExclusive()) {
				try {
					Double.parseDouble(maxExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMaxInclusive()) {
				try {
					Double.parseDouble(maxInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinExclusive()) {
				try {
					Double.parseDouble(minExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinInclusive()) {
				try {
					Double.parseDouble(minInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			return valid;
		}
		case FLOAT: {
			if (isSetMaxExclusive()) {
				try {
					Float.parseFloat(maxExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMaxInclusive()) {
				try {
					Float.parseFloat(maxInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinExclusive()) {
				try {
					Float.parseFloat(minExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinInclusive()) {
				try {
					Float.parseFloat(minInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			return valid;
		}
		case LONG: {
			if (isSetMaxExclusive()) {
				try {
					Long.parseLong(maxExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMaxInclusive()) {
				try {
					Long.parseLong(maxInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinExclusive()) {
				try {
					Long.parseLong(minExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinInclusive()) {
				try {
					Long.parseLong(minInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
		}
		case SHORT: {
			if (isSetMaxExclusive()) {
				try {
					Short.parseShort(maxExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMaxInclusive()) {
				try {
					Short.parseShort(maxInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The maxInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinExclusive()) {
				try {
					Short.parseShort(minExclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minExclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			if (isSetMinInclusive()) {
				try {
					Short.parseShort(minInclusive);
				} catch (NumberFormatException nfe) {
					valid = false;
					diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR, OCCIValidator.DIAGNOSTIC_SOURCE,
							OCCIValidator.NUMERIC_TYPE__VALIDATE, "The minInclusive attribute value of "+type.getName()+" type is invalid", new Object[] { this }));
				}
			}
			return valid;
		}
		}
		return valid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCCIPackage.NUMERIC_TYPE__TYPE:
				return getType();
			case OCCIPackage.NUMERIC_TYPE__TOTAL_DIGITS:
				return getTotalDigits();
			case OCCIPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
				return getMinExclusive();
			case OCCIPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
				return getMaxExclusive();
			case OCCIPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
				return getMinInclusive();
			case OCCIPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
				return getMaxInclusive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCCIPackage.NUMERIC_TYPE__TYPE:
				setType((NumericTypeEnum)newValue);
				return;
			case OCCIPackage.NUMERIC_TYPE__TOTAL_DIGITS:
				setTotalDigits((Integer)newValue);
				return;
			case OCCIPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
				setMinExclusive((String)newValue);
				return;
			case OCCIPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
				setMaxExclusive((String)newValue);
				return;
			case OCCIPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
				setMinInclusive((String)newValue);
				return;
			case OCCIPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
				setMaxInclusive((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OCCIPackage.NUMERIC_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OCCIPackage.NUMERIC_TYPE__TOTAL_DIGITS:
				unsetTotalDigits();
				return;
			case OCCIPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
				unsetMinExclusive();
				return;
			case OCCIPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
				unsetMaxExclusive();
				return;
			case OCCIPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
				unsetMinInclusive();
				return;
			case OCCIPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
				unsetMaxInclusive();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OCCIPackage.NUMERIC_TYPE__TYPE:
				return type != TYPE_EDEFAULT;
			case OCCIPackage.NUMERIC_TYPE__TOTAL_DIGITS:
				return isSetTotalDigits();
			case OCCIPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
				return isSetMinExclusive();
			case OCCIPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
				return isSetMaxExclusive();
			case OCCIPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
				return isSetMinInclusive();
			case OCCIPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
				return isSetMaxInclusive();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OCCIPackage.NUMERIC_TYPE___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", totalDigits: ");
		if (totalDigitsESet) result.append(totalDigits); else result.append("<unset>");
		result.append(", minExclusive: ");
		if (minExclusiveESet) result.append(minExclusive); else result.append("<unset>");
		result.append(", maxExclusive: ");
		if (maxExclusiveESet) result.append(maxExclusive); else result.append("<unset>");
		result.append(", minInclusive: ");
		if (minInclusiveESet) result.append(minInclusive); else result.append("<unset>");
		result.append(", maxInclusive: ");
		if (maxInclusiveESet) result.append(maxInclusive); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // NumericTypeImpl
