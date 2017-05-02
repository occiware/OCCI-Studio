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

import java.lang.reflect.InvocationTargetException;

import java.net.URL;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.platform.Application;
import org.eclipse.cmf.occi.platform.PlatformPackage;
import org.eclipse.cmf.occi.platform.Status;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.ApplicationImpl#getOcciAppName <em>Occi App Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.ApplicationImpl#getOcciAppContext <em>Occi App Context</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.ApplicationImpl#getOcciAppUrl <em>Occi App Url</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.ApplicationImpl#getOcciAppState <em>Occi App State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.ApplicationImpl#getOcciAppStateMessage <em>Occi App State Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends ResourceImpl implements Application {
	/**
	 * The default value of the '{@link #getOcciAppName() <em>Occi App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAppName()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_APP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciAppName() <em>Occi App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAppName()
	 * @generated
	 * @ordered
	 */
	protected String occiAppName = OCCI_APP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciAppContext() <em>Occi App Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAppContext()
	 * @generated
	 * @ordered
	 */
	protected static final URL OCCI_APP_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciAppContext() <em>Occi App Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAppContext()
	 * @generated
	 * @ordered
	 */
	protected URL occiAppContext = OCCI_APP_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciAppUrl() <em>Occi App Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAppUrl()
	 * @generated
	 * @ordered
	 */
	protected static final URL OCCI_APP_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciAppUrl() <em>Occi App Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAppUrl()
	 * @generated
	 * @ordered
	 */
	protected URL occiAppUrl = OCCI_APP_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciAppState() <em>Occi App State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAppState()
	 * @generated
	 * @ordered
	 */
	protected static final Status OCCI_APP_STATE_EDEFAULT = Status.ACTIVE;

	/**
	 * The cached value of the '{@link #getOcciAppState() <em>Occi App State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAppState()
	 * @generated
	 * @ordered
	 */
	protected Status occiAppState = OCCI_APP_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciAppStateMessage() <em>Occi App State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAppStateMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_APP_STATE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciAppStateMessage() <em>Occi App State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAppStateMessage()
	 * @generated
	 * @ordered
	 */
	protected String occiAppStateMessage = OCCI_APP_STATE_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciAppName() {
		return occiAppName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAppName(String newOcciAppName) {
		String oldOcciAppName = occiAppName;
		occiAppName = newOcciAppName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.APPLICATION__OCCI_APP_NAME, oldOcciAppName, occiAppName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL getOcciAppContext() {
		return occiAppContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAppContext(URL newOcciAppContext) {
		URL oldOcciAppContext = occiAppContext;
		occiAppContext = newOcciAppContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.APPLICATION__OCCI_APP_CONTEXT, oldOcciAppContext, occiAppContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL getOcciAppUrl() {
		return occiAppUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAppUrl(URL newOcciAppUrl) {
		URL oldOcciAppUrl = occiAppUrl;
		occiAppUrl = newOcciAppUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.APPLICATION__OCCI_APP_URL, oldOcciAppUrl, occiAppUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getOcciAppState() {
		return occiAppState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAppState(Status newOcciAppState) {
		Status oldOcciAppState = occiAppState;
		occiAppState = newOcciAppState == null ? OCCI_APP_STATE_EDEFAULT : newOcciAppState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.APPLICATION__OCCI_APP_STATE, oldOcciAppState, occiAppState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciAppStateMessage() {
		return occiAppStateMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAppStateMessage(String newOcciAppStateMessage) {
		String oldOcciAppStateMessage = occiAppStateMessage;
		occiAppStateMessage = newOcciAppStateMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.APPLICATION__OCCI_APP_STATE_MESSAGE, oldOcciAppStateMessage, occiAppStateMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Application!start()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Application!stop()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.APPLICATION__OCCI_APP_NAME:
				return getOcciAppName();
			case PlatformPackage.APPLICATION__OCCI_APP_CONTEXT:
				return getOcciAppContext();
			case PlatformPackage.APPLICATION__OCCI_APP_URL:
				return getOcciAppUrl();
			case PlatformPackage.APPLICATION__OCCI_APP_STATE:
				return getOcciAppState();
			case PlatformPackage.APPLICATION__OCCI_APP_STATE_MESSAGE:
				return getOcciAppStateMessage();
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
			case PlatformPackage.APPLICATION__OCCI_APP_NAME:
				setOcciAppName((String)newValue);
				return;
			case PlatformPackage.APPLICATION__OCCI_APP_CONTEXT:
				setOcciAppContext((URL)newValue);
				return;
			case PlatformPackage.APPLICATION__OCCI_APP_URL:
				setOcciAppUrl((URL)newValue);
				return;
			case PlatformPackage.APPLICATION__OCCI_APP_STATE:
				setOcciAppState((Status)newValue);
				return;
			case PlatformPackage.APPLICATION__OCCI_APP_STATE_MESSAGE:
				setOcciAppStateMessage((String)newValue);
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
			case PlatformPackage.APPLICATION__OCCI_APP_NAME:
				setOcciAppName(OCCI_APP_NAME_EDEFAULT);
				return;
			case PlatformPackage.APPLICATION__OCCI_APP_CONTEXT:
				setOcciAppContext(OCCI_APP_CONTEXT_EDEFAULT);
				return;
			case PlatformPackage.APPLICATION__OCCI_APP_URL:
				setOcciAppUrl(OCCI_APP_URL_EDEFAULT);
				return;
			case PlatformPackage.APPLICATION__OCCI_APP_STATE:
				setOcciAppState(OCCI_APP_STATE_EDEFAULT);
				return;
			case PlatformPackage.APPLICATION__OCCI_APP_STATE_MESSAGE:
				setOcciAppStateMessage(OCCI_APP_STATE_MESSAGE_EDEFAULT);
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
			case PlatformPackage.APPLICATION__OCCI_APP_NAME:
				return OCCI_APP_NAME_EDEFAULT == null ? occiAppName != null : !OCCI_APP_NAME_EDEFAULT.equals(occiAppName);
			case PlatformPackage.APPLICATION__OCCI_APP_CONTEXT:
				return OCCI_APP_CONTEXT_EDEFAULT == null ? occiAppContext != null : !OCCI_APP_CONTEXT_EDEFAULT.equals(occiAppContext);
			case PlatformPackage.APPLICATION__OCCI_APP_URL:
				return OCCI_APP_URL_EDEFAULT == null ? occiAppUrl != null : !OCCI_APP_URL_EDEFAULT.equals(occiAppUrl);
			case PlatformPackage.APPLICATION__OCCI_APP_STATE:
				return occiAppState != OCCI_APP_STATE_EDEFAULT;
			case PlatformPackage.APPLICATION__OCCI_APP_STATE_MESSAGE:
				return OCCI_APP_STATE_MESSAGE_EDEFAULT == null ? occiAppStateMessage != null : !OCCI_APP_STATE_MESSAGE_EDEFAULT.equals(occiAppStateMessage);
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
			case PlatformPackage.APPLICATION___START:
				start();
				return null;
			case PlatformPackage.APPLICATION___STOP:
				stop();
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
		result.append(" (occiAppName: ");
		result.append(occiAppName);
		result.append(", occiAppContext: ");
		result.append(occiAppContext);
		result.append(", occiAppUrl: ");
		result.append(occiAppUrl);
		result.append(", occiAppState: ");
		result.append(occiAppState);
		result.append(", occiAppStateMessage: ");
		result.append(occiAppStateMessage);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
