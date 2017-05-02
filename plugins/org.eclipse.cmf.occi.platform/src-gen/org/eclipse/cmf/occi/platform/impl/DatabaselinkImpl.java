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

import org.eclipse.cmf.occi.platform.Databaselink;
import org.eclipse.cmf.occi.platform.PlatformPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databaselink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.DatabaselinkImpl#getOcciDatabaseUri <em>Occi Database Uri</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.DatabaselinkImpl#getOcciDatabaseUsername <em>Occi Database Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.DatabaselinkImpl#getOcciDatabaseToken <em>Occi Database Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaselinkImpl extends MixinBaseImpl implements Databaselink {
	/**
	 * The default value of the '{@link #getOcciDatabaseUri() <em>Occi Database Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseUri()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_DATABASE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciDatabaseUri() <em>Occi Database Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseUri()
	 * @generated
	 * @ordered
	 */
	protected String occiDatabaseUri = OCCI_DATABASE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciDatabaseUsername() <em>Occi Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_DATABASE_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciDatabaseUsername() <em>Occi Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected String occiDatabaseUsername = OCCI_DATABASE_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciDatabaseToken() <em>Occi Database Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseToken()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_DATABASE_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciDatabaseToken() <em>Occi Database Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseToken()
	 * @generated
	 * @ordered
	 */
	protected String occiDatabaseToken = OCCI_DATABASE_TOKEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaselinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.DATABASELINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciDatabaseUri() {
		return occiDatabaseUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciDatabaseUri(String newOcciDatabaseUri) {
		String oldOcciDatabaseUri = occiDatabaseUri;
		occiDatabaseUri = newOcciDatabaseUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DATABASELINK__OCCI_DATABASE_URI, oldOcciDatabaseUri, occiDatabaseUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciDatabaseUsername() {
		return occiDatabaseUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciDatabaseUsername(String newOcciDatabaseUsername) {
		String oldOcciDatabaseUsername = occiDatabaseUsername;
		occiDatabaseUsername = newOcciDatabaseUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DATABASELINK__OCCI_DATABASE_USERNAME, oldOcciDatabaseUsername, occiDatabaseUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciDatabaseToken() {
		return occiDatabaseToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciDatabaseToken(String newOcciDatabaseToken) {
		String oldOcciDatabaseToken = occiDatabaseToken;
		occiDatabaseToken = newOcciDatabaseToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DATABASELINK__OCCI_DATABASE_TOKEN, oldOcciDatabaseToken, occiDatabaseToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_URI:
				return getOcciDatabaseUri();
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_USERNAME:
				return getOcciDatabaseUsername();
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_TOKEN:
				return getOcciDatabaseToken();
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
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_URI:
				setOcciDatabaseUri((String)newValue);
				return;
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_USERNAME:
				setOcciDatabaseUsername((String)newValue);
				return;
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_TOKEN:
				setOcciDatabaseToken((String)newValue);
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
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_URI:
				setOcciDatabaseUri(OCCI_DATABASE_URI_EDEFAULT);
				return;
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_USERNAME:
				setOcciDatabaseUsername(OCCI_DATABASE_USERNAME_EDEFAULT);
				return;
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_TOKEN:
				setOcciDatabaseToken(OCCI_DATABASE_TOKEN_EDEFAULT);
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
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_URI:
				return OCCI_DATABASE_URI_EDEFAULT == null ? occiDatabaseUri != null : !OCCI_DATABASE_URI_EDEFAULT.equals(occiDatabaseUri);
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_USERNAME:
				return OCCI_DATABASE_USERNAME_EDEFAULT == null ? occiDatabaseUsername != null : !OCCI_DATABASE_USERNAME_EDEFAULT.equals(occiDatabaseUsername);
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_TOKEN:
				return OCCI_DATABASE_TOKEN_EDEFAULT == null ? occiDatabaseToken != null : !OCCI_DATABASE_TOKEN_EDEFAULT.equals(occiDatabaseToken);
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
		result.append(" (occiDatabaseUri: ");
		result.append(occiDatabaseUri);
		result.append(", occiDatabaseUsername: ");
		result.append(occiDatabaseUsername);
		result.append(", occiDatabaseToken: ");
		result.append(occiDatabaseToken);
		result.append(')');
		return result.toString();
	}

} //DatabaselinkImpl
