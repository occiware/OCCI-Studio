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
package org.eclipse.cmf.occi.infrastructure.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.Storage;
import org.eclipse.cmf.occi.infrastructure.StorageStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.StorageImpl#getOcciStorageSize <em>Occi Storage Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.StorageImpl#getOcciStorageState <em>Occi Storage State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.StorageImpl#getOcciStorageStateMessage <em>Occi Storage State Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageImpl extends ResourceImpl implements Storage {
	/**
	 * The default value of the '{@link #getOcciStorageSize() <em>Occi Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStorageSize()
	 * @generated
	 * @ordered
	 */
	protected static final Float OCCI_STORAGE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciStorageSize() <em>Occi Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStorageSize()
	 * @generated
	 * @ordered
	 */
	protected Float occiStorageSize = OCCI_STORAGE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciStorageState() <em>Occi Storage State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStorageState()
	 * @generated
	 * @ordered
	 */
	protected static final StorageStatus OCCI_STORAGE_STATE_EDEFAULT = StorageStatus.ONLINE;

	/**
	 * The cached value of the '{@link #getOcciStorageState() <em>Occi Storage State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStorageState()
	 * @generated
	 * @ordered
	 */
	protected StorageStatus occiStorageState = OCCI_STORAGE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciStorageStateMessage() <em>Occi Storage State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStorageStateMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_STORAGE_STATE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciStorageStateMessage() <em>Occi Storage State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStorageStateMessage()
	 * @generated
	 * @ordered
	 */
	protected String occiStorageStateMessage = OCCI_STORAGE_STATE_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.STORAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getOcciStorageSize() {
		return occiStorageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciStorageSize(Float newOcciStorageSize) {
		Float oldOcciStorageSize = occiStorageSize;
		occiStorageSize = newOcciStorageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.STORAGE__OCCI_STORAGE_SIZE, oldOcciStorageSize, occiStorageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageStatus getOcciStorageState() {
		return occiStorageState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciStorageState(StorageStatus newOcciStorageState) {
		StorageStatus oldOcciStorageState = occiStorageState;
		occiStorageState = newOcciStorageState == null ? OCCI_STORAGE_STATE_EDEFAULT : newOcciStorageState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE, oldOcciStorageState, occiStorageState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciStorageStateMessage() {
		return occiStorageStateMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciStorageStateMessage(String newOcciStorageStateMessage) {
		String oldOcciStorageStateMessage = occiStorageStateMessage;
		occiStorageStateMessage = newOcciStorageStateMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE_MESSAGE, oldOcciStorageStateMessage, occiStorageStateMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void online() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Storage!online()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void offline() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Storage!offline()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_SIZE:
				return getOcciStorageSize();
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE:
				return getOcciStorageState();
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE_MESSAGE:
				return getOcciStorageStateMessage();
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
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_SIZE:
				setOcciStorageSize((Float)newValue);
				return;
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE:
				setOcciStorageState((StorageStatus)newValue);
				return;
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE_MESSAGE:
				setOcciStorageStateMessage((String)newValue);
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
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_SIZE:
				setOcciStorageSize(OCCI_STORAGE_SIZE_EDEFAULT);
				return;
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE:
				setOcciStorageState(OCCI_STORAGE_STATE_EDEFAULT);
				return;
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE_MESSAGE:
				setOcciStorageStateMessage(OCCI_STORAGE_STATE_MESSAGE_EDEFAULT);
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
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_SIZE:
				return OCCI_STORAGE_SIZE_EDEFAULT == null ? occiStorageSize != null : !OCCI_STORAGE_SIZE_EDEFAULT.equals(occiStorageSize);
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE:
				return occiStorageState != OCCI_STORAGE_STATE_EDEFAULT;
			case InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE_MESSAGE:
				return OCCI_STORAGE_STATE_MESSAGE_EDEFAULT == null ? occiStorageStateMessage != null : !OCCI_STORAGE_STATE_MESSAGE_EDEFAULT.equals(occiStorageStateMessage);
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
			case InfrastructurePackage.STORAGE___ONLINE:
				online();
				return null;
			case InfrastructurePackage.STORAGE___OFFLINE:
				offline();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (occiStorageSize: ");
		result.append(occiStorageSize);
		result.append(", occiStorageState: ");
		result.append(occiStorageState);
		result.append(", occiStorageStateMessage: ");
		result.append(occiStorageStateMessage);
		result.append(')');
		return result.toString();
	}

} //StorageImpl
