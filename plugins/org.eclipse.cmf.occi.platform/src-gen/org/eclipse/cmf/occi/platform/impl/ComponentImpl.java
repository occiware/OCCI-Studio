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

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.platform.Component;
import org.eclipse.cmf.occi.platform.PlatformPackage;
import org.eclipse.cmf.occi.platform.Status;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.ComponentImpl#getOcciComponentState <em>Occi Component State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.ComponentImpl#getOcciComponentStateMessage <em>Occi Component State Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ResourceImpl implements Component {
	/**
	 * The default value of the '{@link #getOcciComponentState() <em>Occi Component State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComponentState()
	 * @generated
	 * @ordered
	 */
	protected static final Status OCCI_COMPONENT_STATE_EDEFAULT = Status.ACTIVE;

	/**
	 * The cached value of the '{@link #getOcciComponentState() <em>Occi Component State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComponentState()
	 * @generated
	 * @ordered
	 */
	protected Status occiComponentState = OCCI_COMPONENT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciComponentStateMessage() <em>Occi Component State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComponentStateMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_COMPONENT_STATE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciComponentStateMessage() <em>Occi Component State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComponentStateMessage()
	 * @generated
	 * @ordered
	 */
	protected String occiComponentStateMessage = OCCI_COMPONENT_STATE_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getOcciComponentState() {
		return occiComponentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComponentState(Status newOcciComponentState) {
		Status oldOcciComponentState = occiComponentState;
		occiComponentState = newOcciComponentState == null ? OCCI_COMPONENT_STATE_EDEFAULT : newOcciComponentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE, oldOcciComponentState, occiComponentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciComponentStateMessage() {
		return occiComponentStateMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComponentStateMessage(String newOcciComponentStateMessage) {
		String oldOcciComponentStateMessage = occiComponentStateMessage;
		occiComponentStateMessage = newOcciComponentStateMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE_MESSAGE, oldOcciComponentStateMessage, occiComponentStateMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Component!start()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Component!stop()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE:
				return getOcciComponentState();
			case PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE_MESSAGE:
				return getOcciComponentStateMessage();
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
			case PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE:
				setOcciComponentState((Status)newValue);
				return;
			case PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE_MESSAGE:
				setOcciComponentStateMessage((String)newValue);
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
			case PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE:
				setOcciComponentState(OCCI_COMPONENT_STATE_EDEFAULT);
				return;
			case PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE_MESSAGE:
				setOcciComponentStateMessage(OCCI_COMPONENT_STATE_MESSAGE_EDEFAULT);
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
			case PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE:
				return occiComponentState != OCCI_COMPONENT_STATE_EDEFAULT;
			case PlatformPackage.COMPONENT__OCCI_COMPONENT_STATE_MESSAGE:
				return OCCI_COMPONENT_STATE_MESSAGE_EDEFAULT == null ? occiComponentStateMessage != null : !OCCI_COMPONENT_STATE_MESSAGE_EDEFAULT.equals(occiComponentStateMessage);
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
			case PlatformPackage.COMPONENT___START:
				start();
				return null;
			case PlatformPackage.COMPONENT___STOP:
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
		result.append(" (occiComponentState: ");
		result.append(occiComponentState);
		result.append(", occiComponentStateMessage: ");
		result.append(occiComponentStateMessage);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
