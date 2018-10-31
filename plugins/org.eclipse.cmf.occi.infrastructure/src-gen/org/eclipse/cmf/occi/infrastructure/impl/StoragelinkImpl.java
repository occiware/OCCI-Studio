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

import org.eclipse.cmf.occi.core.impl.LinkImpl;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.StorageLinkStatus;
import org.eclipse.cmf.occi.infrastructure.Storagelink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storagelink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.StoragelinkImpl#getOcciStoragelinkDeviceid <em>Occi Storagelink Deviceid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.StoragelinkImpl#getOcciStoragelinkMountpoint <em>Occi Storagelink Mountpoint</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.StoragelinkImpl#getOcciStoragelinkState <em>Occi Storagelink State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.StoragelinkImpl#getOcciStoragelinkStateMessage <em>Occi Storagelink State Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoragelinkImpl extends LinkImpl implements Storagelink {
	/**
	 * The default value of the '{@link #getOcciStoragelinkDeviceid() <em>Occi Storagelink Deviceid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStoragelinkDeviceid()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_STORAGELINK_DEVICEID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciStoragelinkDeviceid() <em>Occi Storagelink Deviceid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStoragelinkDeviceid()
	 * @generated
	 * @ordered
	 */
	protected String occiStoragelinkDeviceid = OCCI_STORAGELINK_DEVICEID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciStoragelinkMountpoint() <em>Occi Storagelink Mountpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStoragelinkMountpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_STORAGELINK_MOUNTPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciStoragelinkMountpoint() <em>Occi Storagelink Mountpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStoragelinkMountpoint()
	 * @generated
	 * @ordered
	 */
	protected String occiStoragelinkMountpoint = OCCI_STORAGELINK_MOUNTPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciStoragelinkState() <em>Occi Storagelink State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStoragelinkState()
	 * @generated
	 * @ordered
	 */
	protected static final StorageLinkStatus OCCI_STORAGELINK_STATE_EDEFAULT = StorageLinkStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getOcciStoragelinkState() <em>Occi Storagelink State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStoragelinkState()
	 * @generated
	 * @ordered
	 */
	protected StorageLinkStatus occiStoragelinkState = OCCI_STORAGELINK_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciStoragelinkStateMessage() <em>Occi Storagelink State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStoragelinkStateMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_STORAGELINK_STATE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciStoragelinkStateMessage() <em>Occi Storagelink State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciStoragelinkStateMessage()
	 * @generated
	 * @ordered
	 */
	protected String occiStoragelinkStateMessage = OCCI_STORAGELINK_STATE_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoragelinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.STORAGELINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciStoragelinkDeviceid() {
		return occiStoragelinkDeviceid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciStoragelinkDeviceid(String newOcciStoragelinkDeviceid) {
		String oldOcciStoragelinkDeviceid = occiStoragelinkDeviceid;
		occiStoragelinkDeviceid = newOcciStoragelinkDeviceid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_DEVICEID, oldOcciStoragelinkDeviceid, occiStoragelinkDeviceid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciStoragelinkMountpoint() {
		return occiStoragelinkMountpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciStoragelinkMountpoint(String newOcciStoragelinkMountpoint) {
		String oldOcciStoragelinkMountpoint = occiStoragelinkMountpoint;
		occiStoragelinkMountpoint = newOcciStoragelinkMountpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_MOUNTPOINT, oldOcciStoragelinkMountpoint, occiStoragelinkMountpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageLinkStatus getOcciStoragelinkState() {
		return occiStoragelinkState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciStoragelinkState(StorageLinkStatus newOcciStoragelinkState) {
		StorageLinkStatus oldOcciStoragelinkState = occiStoragelinkState;
		occiStoragelinkState = newOcciStoragelinkState == null ? OCCI_STORAGELINK_STATE_EDEFAULT : newOcciStoragelinkState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE, oldOcciStoragelinkState, occiStoragelinkState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciStoragelinkStateMessage() {
		return occiStoragelinkStateMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciStoragelinkStateMessage(String newOcciStoragelinkStateMessage) {
		String oldOcciStoragelinkStateMessage = occiStoragelinkStateMessage;
		occiStoragelinkStateMessage = newOcciStoragelinkStateMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE_MESSAGE, oldOcciStoragelinkStateMessage, occiStoragelinkStateMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_DEVICEID:
				return getOcciStoragelinkDeviceid();
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_MOUNTPOINT:
				return getOcciStoragelinkMountpoint();
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE:
				return getOcciStoragelinkState();
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE_MESSAGE:
				return getOcciStoragelinkStateMessage();
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
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_DEVICEID:
				setOcciStoragelinkDeviceid((String)newValue);
				return;
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_MOUNTPOINT:
				setOcciStoragelinkMountpoint((String)newValue);
				return;
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE:
				setOcciStoragelinkState((StorageLinkStatus)newValue);
				return;
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE_MESSAGE:
				setOcciStoragelinkStateMessage((String)newValue);
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
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_DEVICEID:
				setOcciStoragelinkDeviceid(OCCI_STORAGELINK_DEVICEID_EDEFAULT);
				return;
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_MOUNTPOINT:
				setOcciStoragelinkMountpoint(OCCI_STORAGELINK_MOUNTPOINT_EDEFAULT);
				return;
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE:
				setOcciStoragelinkState(OCCI_STORAGELINK_STATE_EDEFAULT);
				return;
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE_MESSAGE:
				setOcciStoragelinkStateMessage(OCCI_STORAGELINK_STATE_MESSAGE_EDEFAULT);
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
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_DEVICEID:
				return OCCI_STORAGELINK_DEVICEID_EDEFAULT == null ? occiStoragelinkDeviceid != null : !OCCI_STORAGELINK_DEVICEID_EDEFAULT.equals(occiStoragelinkDeviceid);
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_MOUNTPOINT:
				return OCCI_STORAGELINK_MOUNTPOINT_EDEFAULT == null ? occiStoragelinkMountpoint != null : !OCCI_STORAGELINK_MOUNTPOINT_EDEFAULT.equals(occiStoragelinkMountpoint);
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE:
				return occiStoragelinkState != OCCI_STORAGELINK_STATE_EDEFAULT;
			case InfrastructurePackage.STORAGELINK__OCCI_STORAGELINK_STATE_MESSAGE:
				return OCCI_STORAGELINK_STATE_MESSAGE_EDEFAULT == null ? occiStoragelinkStateMessage != null : !OCCI_STORAGELINK_STATE_MESSAGE_EDEFAULT.equals(occiStoragelinkStateMessage);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (occiStoragelinkDeviceid: ");
		result.append(occiStoragelinkDeviceid);
		result.append(", occiStoragelinkMountpoint: ");
		result.append(occiStoragelinkMountpoint);
		result.append(", occiStoragelinkState: ");
		result.append(occiStoragelinkState);
		result.append(", occiStoragelinkStateMessage: ");
		result.append(occiStoragelinkStateMessage);
		result.append(')');
		return result.toString();
	}

} //StoragelinkImpl
