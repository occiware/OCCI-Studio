/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.sla.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.sla.Agreement;
import org.eclipse.cmf.occi.sla.AgreementStatus;
import org.eclipse.cmf.occi.sla.SlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.sla.impl.AgreementImpl#getOcciAgreementState <em>Occi Agreement State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.impl.AgreementImpl#getOcciAgreementAgreedAt <em>Occi Agreement Agreed At</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.impl.AgreementImpl#getOcciAgreementEffectiveFrom <em>Occi Agreement Effective From</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.impl.AgreementImpl#getOcciAgreementEffectiveUntil <em>Occi Agreement Effective Until</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementImpl extends ResourceImpl implements Agreement {
	/**
	 * The default value of the '{@link #getOcciAgreementState() <em>Occi Agreement State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementState()
	 * @generated
	 * @ordered
	 */
	protected static final AgreementStatus OCCI_AGREEMENT_STATE_EDEFAULT = AgreementStatus.PENDING;

	/**
	 * The cached value of the '{@link #getOcciAgreementState() <em>Occi Agreement State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementState()
	 * @generated
	 * @ordered
	 */
	protected AgreementStatus occiAgreementState = OCCI_AGREEMENT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciAgreementAgreedAt() <em>Occi Agreement Agreed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementAgreedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_AGREEMENT_AGREED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciAgreementAgreedAt() <em>Occi Agreement Agreed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementAgreedAt()
	 * @generated
	 * @ordered
	 */
	protected String occiAgreementAgreedAt = OCCI_AGREEMENT_AGREED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciAgreementEffectiveFrom() <em>Occi Agreement Effective From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementEffectiveFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_AGREEMENT_EFFECTIVE_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciAgreementEffectiveFrom() <em>Occi Agreement Effective From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementEffectiveFrom()
	 * @generated
	 * @ordered
	 */
	protected String occiAgreementEffectiveFrom = OCCI_AGREEMENT_EFFECTIVE_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciAgreementEffectiveUntil() <em>Occi Agreement Effective Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementEffectiveUntil()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_AGREEMENT_EFFECTIVE_UNTIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciAgreementEffectiveUntil() <em>Occi Agreement Effective Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementEffectiveUntil()
	 * @generated
	 * @ordered
	 */
	protected String occiAgreementEffectiveUntil = OCCI_AGREEMENT_EFFECTIVE_UNTIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlaPackage.Literals.AGREEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementStatus getOcciAgreementState() {
		return occiAgreementState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAgreementState(AgreementStatus newOcciAgreementState) {
		AgreementStatus oldOcciAgreementState = occiAgreementState;
		occiAgreementState = newOcciAgreementState == null ? OCCI_AGREEMENT_STATE_EDEFAULT : newOcciAgreementState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlaPackage.AGREEMENT__OCCI_AGREEMENT_STATE, oldOcciAgreementState, occiAgreementState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciAgreementAgreedAt() {
		return occiAgreementAgreedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAgreementAgreedAt(String newOcciAgreementAgreedAt) {
		String oldOcciAgreementAgreedAt = occiAgreementAgreedAt;
		occiAgreementAgreedAt = newOcciAgreementAgreedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlaPackage.AGREEMENT__OCCI_AGREEMENT_AGREED_AT, oldOcciAgreementAgreedAt, occiAgreementAgreedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciAgreementEffectiveFrom() {
		return occiAgreementEffectiveFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAgreementEffectiveFrom(String newOcciAgreementEffectiveFrom) {
		String oldOcciAgreementEffectiveFrom = occiAgreementEffectiveFrom;
		occiAgreementEffectiveFrom = newOcciAgreementEffectiveFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlaPackage.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_FROM, oldOcciAgreementEffectiveFrom, occiAgreementEffectiveFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciAgreementEffectiveUntil() {
		return occiAgreementEffectiveUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAgreementEffectiveUntil(String newOcciAgreementEffectiveUntil) {
		String oldOcciAgreementEffectiveUntil = occiAgreementEffectiveUntil;
		occiAgreementEffectiveUntil = newOcciAgreementEffectiveUntil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlaPackage.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_UNTIL, oldOcciAgreementEffectiveUntil, occiAgreementEffectiveUntil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!accept()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reject() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!reject()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void suspend() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!suspend()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resume() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!resume()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void terminate() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!terminate()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_STATE:
				return getOcciAgreementState();
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_AGREED_AT:
				return getOcciAgreementAgreedAt();
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_FROM:
				return getOcciAgreementEffectiveFrom();
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_UNTIL:
				return getOcciAgreementEffectiveUntil();
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
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_STATE:
				setOcciAgreementState((AgreementStatus)newValue);
				return;
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_AGREED_AT:
				setOcciAgreementAgreedAt((String)newValue);
				return;
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_FROM:
				setOcciAgreementEffectiveFrom((String)newValue);
				return;
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_UNTIL:
				setOcciAgreementEffectiveUntil((String)newValue);
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
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_STATE:
				setOcciAgreementState(OCCI_AGREEMENT_STATE_EDEFAULT);
				return;
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_AGREED_AT:
				setOcciAgreementAgreedAt(OCCI_AGREEMENT_AGREED_AT_EDEFAULT);
				return;
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_FROM:
				setOcciAgreementEffectiveFrom(OCCI_AGREEMENT_EFFECTIVE_FROM_EDEFAULT);
				return;
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_UNTIL:
				setOcciAgreementEffectiveUntil(OCCI_AGREEMENT_EFFECTIVE_UNTIL_EDEFAULT);
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
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_STATE:
				return occiAgreementState != OCCI_AGREEMENT_STATE_EDEFAULT;
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_AGREED_AT:
				return OCCI_AGREEMENT_AGREED_AT_EDEFAULT == null ? occiAgreementAgreedAt != null : !OCCI_AGREEMENT_AGREED_AT_EDEFAULT.equals(occiAgreementAgreedAt);
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_FROM:
				return OCCI_AGREEMENT_EFFECTIVE_FROM_EDEFAULT == null ? occiAgreementEffectiveFrom != null : !OCCI_AGREEMENT_EFFECTIVE_FROM_EDEFAULT.equals(occiAgreementEffectiveFrom);
			case SlaPackage.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_UNTIL:
				return OCCI_AGREEMENT_EFFECTIVE_UNTIL_EDEFAULT == null ? occiAgreementEffectiveUntil != null : !OCCI_AGREEMENT_EFFECTIVE_UNTIL_EDEFAULT.equals(occiAgreementEffectiveUntil);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SlaPackage.AGREEMENT___ACCEPT:
				accept();
				return null;
			case SlaPackage.AGREEMENT___REJECT:
				reject();
				return null;
			case SlaPackage.AGREEMENT___SUSPEND:
				suspend();
				return null;
			case SlaPackage.AGREEMENT___RESUME:
				resume();
				return null;
			case SlaPackage.AGREEMENT___TERMINATE:
				terminate();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (occiAgreementState: ");
		result.append(occiAgreementState);
		result.append(", occiAgreementAgreedAt: ");
		result.append(occiAgreementAgreedAt);
		result.append(", occiAgreementEffectiveFrom: ");
		result.append(occiAgreementEffectiveFrom);
		result.append(", occiAgreementEffectiveUntil: ");
		result.append(occiAgreementEffectiveUntil);
		result.append(')');
		return result.toString();
	}

} //AgreementImpl
