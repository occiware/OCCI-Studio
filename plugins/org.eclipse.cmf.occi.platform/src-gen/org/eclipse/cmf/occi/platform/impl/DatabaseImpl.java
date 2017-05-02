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
package org.eclipse.cmf.occi.platform.impl;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.platform.Database;
import org.eclipse.cmf.occi.platform.PlatformPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.DatabaseImpl#getOcciDatabaseVersion <em>Occi Database Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends MixinBaseImpl implements Database {
	/**
	 * The default value of the '{@link #getOcciDatabaseVersion() <em>Occi Database Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_DATABASE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciDatabaseVersion() <em>Occi Database Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseVersion()
	 * @generated
	 * @ordered
	 */
	protected String occiDatabaseVersion = OCCI_DATABASE_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciDatabaseVersion() {
		return occiDatabaseVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciDatabaseVersion(String newOcciDatabaseVersion) {
		String oldOcciDatabaseVersion = occiDatabaseVersion;
		occiDatabaseVersion = newOcciDatabaseVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DATABASE__OCCI_DATABASE_VERSION, oldOcciDatabaseVersion, occiDatabaseVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.DATABASE__OCCI_DATABASE_VERSION:
				return getOcciDatabaseVersion();
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
			case PlatformPackage.DATABASE__OCCI_DATABASE_VERSION:
				setOcciDatabaseVersion((String)newValue);
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
			case PlatformPackage.DATABASE__OCCI_DATABASE_VERSION:
				setOcciDatabaseVersion(OCCI_DATABASE_VERSION_EDEFAULT);
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
			case PlatformPackage.DATABASE__OCCI_DATABASE_VERSION:
				return OCCI_DATABASE_VERSION_EDEFAULT == null ? occiDatabaseVersion != null : !OCCI_DATABASE_VERSION_EDEFAULT.equals(occiDatabaseVersion);
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
		result.append(" (occiDatabaseVersion: ");
		result.append(occiDatabaseVersion);
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
