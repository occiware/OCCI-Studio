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

import org.eclipse.cmf.occi.infrastructure.Architecture;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.RestartMethod;
import org.eclipse.cmf.occi.infrastructure.SaveMethod;
import org.eclipse.cmf.occi.infrastructure.StopMethod;
import org.eclipse.cmf.occi.infrastructure.SuspendMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#getOcciComputeArchitecture <em>Occi Compute Architecture</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#getOcciComputeCores <em>Occi Compute Cores</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#getOcciComputeHostname <em>Occi Compute Hostname</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#getOcciComputeShare <em>Occi Compute Share</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#getOcciComputeSpeed <em>Occi Compute Speed</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#getOcciComputeMemory <em>Occi Compute Memory</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#getOcciComputeState <em>Occi Compute State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#getOcciComputeStateMessage <em>Occi Compute State Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputeImpl extends ResourceImpl implements Compute {
	/**
	 * The default value of the '{@link #getOcciComputeArchitecture() <em>Occi Compute Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final Architecture OCCI_COMPUTE_ARCHITECTURE_EDEFAULT = Architecture.X86;

	/**
	 * The cached value of the '{@link #getOcciComputeArchitecture() <em>Occi Compute Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeArchitecture()
	 * @generated
	 * @ordered
	 */
	protected Architecture occiComputeArchitecture = OCCI_COMPUTE_ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciComputeCores() <em>Occi Compute Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCI_COMPUTE_CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciComputeCores() <em>Occi Compute Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeCores()
	 * @generated
	 * @ordered
	 */
	protected Integer occiComputeCores = OCCI_COMPUTE_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciComputeHostname() <em>Occi Compute Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_COMPUTE_HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciComputeHostname() <em>Occi Compute Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeHostname()
	 * @generated
	 * @ordered
	 */
	protected String occiComputeHostname = OCCI_COMPUTE_HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciComputeShare() <em>Occi Compute Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeShare()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCI_COMPUTE_SHARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciComputeShare() <em>Occi Compute Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeShare()
	 * @generated
	 * @ordered
	 */
	protected Integer occiComputeShare = OCCI_COMPUTE_SHARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciComputeSpeed() <em>Occi Compute Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Float OCCI_COMPUTE_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciComputeSpeed() <em>Occi Compute Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeSpeed()
	 * @generated
	 * @ordered
	 */
	protected Float occiComputeSpeed = OCCI_COMPUTE_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciComputeMemory() <em>Occi Compute Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Float OCCI_COMPUTE_MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciComputeMemory() <em>Occi Compute Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeMemory()
	 * @generated
	 * @ordered
	 */
	protected Float occiComputeMemory = OCCI_COMPUTE_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciComputeState() <em>Occi Compute State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeState()
	 * @generated
	 * @ordered
	 */
	protected static final ComputeStatus OCCI_COMPUTE_STATE_EDEFAULT = ComputeStatus.INACTIVE;

	/**
	 * The cached value of the '{@link #getOcciComputeState() <em>Occi Compute State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeState()
	 * @generated
	 * @ordered
	 */
	protected ComputeStatus occiComputeState = OCCI_COMPUTE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciComputeStateMessage() <em>Occi Compute State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeStateMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_COMPUTE_STATE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciComputeStateMessage() <em>Occi Compute State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeStateMessage()
	 * @generated
	 * @ordered
	 */
	protected String occiComputeStateMessage = OCCI_COMPUTE_STATE_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.COMPUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture getOcciComputeArchitecture() {
		return occiComputeArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeArchitecture(Architecture newOcciComputeArchitecture) {
		Architecture oldOcciComputeArchitecture = occiComputeArchitecture;
		occiComputeArchitecture = newOcciComputeArchitecture == null ? OCCI_COMPUTE_ARCHITECTURE_EDEFAULT : newOcciComputeArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE, oldOcciComputeArchitecture, occiComputeArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciComputeCores() {
		return occiComputeCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeCores(Integer newOcciComputeCores) {
		Integer oldOcciComputeCores = occiComputeCores;
		occiComputeCores = newOcciComputeCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES, oldOcciComputeCores, occiComputeCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciComputeHostname() {
		return occiComputeHostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeHostname(String newOcciComputeHostname) {
		String oldOcciComputeHostname = occiComputeHostname;
		occiComputeHostname = newOcciComputeHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME, oldOcciComputeHostname, occiComputeHostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciComputeShare() {
		return occiComputeShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeShare(Integer newOcciComputeShare) {
		Integer oldOcciComputeShare = occiComputeShare;
		occiComputeShare = newOcciComputeShare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE, oldOcciComputeShare, occiComputeShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getOcciComputeSpeed() {
		return occiComputeSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeSpeed(Float newOcciComputeSpeed) {
		Float oldOcciComputeSpeed = occiComputeSpeed;
		occiComputeSpeed = newOcciComputeSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED, oldOcciComputeSpeed, occiComputeSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getOcciComputeMemory() {
		return occiComputeMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeMemory(Float newOcciComputeMemory) {
		Float oldOcciComputeMemory = occiComputeMemory;
		occiComputeMemory = newOcciComputeMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY, oldOcciComputeMemory, occiComputeMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeStatus getOcciComputeState() {
		return occiComputeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeState(ComputeStatus newOcciComputeState) {
		ComputeStatus oldOcciComputeState = occiComputeState;
		occiComputeState = newOcciComputeState == null ? OCCI_COMPUTE_STATE_EDEFAULT : newOcciComputeState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE, oldOcciComputeState, occiComputeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciComputeStateMessage() {
		return occiComputeStateMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeStateMessage(String newOcciComputeStateMessage) {
		String oldOcciComputeStateMessage = occiComputeStateMessage;
		occiComputeStateMessage = newOcciComputeStateMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE, oldOcciComputeStateMessage, occiComputeStateMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!start()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop(final StopMethod method) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!stop(http://schemas.ogf.org/occi/infrastructure/ecore!StopMethod)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void restart(final RestartMethod method) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!restart(http://schemas.ogf.org/occi/infrastructure/ecore!RestartMethod)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void suspend(final SuspendMethod method) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!suspend(http://schemas.ogf.org/occi/infrastructure/ecore!SuspendMethod)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save(final SaveMethod method, final String name) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!save(http://schemas.ogf.org/occi/infrastructure/ecore!SaveMethod,String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE:
				return getOcciComputeArchitecture();
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES:
				return getOcciComputeCores();
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME:
				return getOcciComputeHostname();
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE:
				return getOcciComputeShare();
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED:
				return getOcciComputeSpeed();
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY:
				return getOcciComputeMemory();
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE:
				return getOcciComputeState();
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE:
				return getOcciComputeStateMessage();
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
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE:
				setOcciComputeArchitecture((Architecture)newValue);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES:
				setOcciComputeCores((Integer)newValue);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME:
				setOcciComputeHostname((String)newValue);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE:
				setOcciComputeShare((Integer)newValue);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED:
				setOcciComputeSpeed((Float)newValue);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY:
				setOcciComputeMemory((Float)newValue);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE:
				setOcciComputeState((ComputeStatus)newValue);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE:
				setOcciComputeStateMessage((String)newValue);
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
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE:
				setOcciComputeArchitecture(OCCI_COMPUTE_ARCHITECTURE_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES:
				setOcciComputeCores(OCCI_COMPUTE_CORES_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME:
				setOcciComputeHostname(OCCI_COMPUTE_HOSTNAME_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE:
				setOcciComputeShare(OCCI_COMPUTE_SHARE_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED:
				setOcciComputeSpeed(OCCI_COMPUTE_SPEED_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY:
				setOcciComputeMemory(OCCI_COMPUTE_MEMORY_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE:
				setOcciComputeState(OCCI_COMPUTE_STATE_EDEFAULT);
				return;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE:
				setOcciComputeStateMessage(OCCI_COMPUTE_STATE_MESSAGE_EDEFAULT);
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
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE:
				return occiComputeArchitecture != OCCI_COMPUTE_ARCHITECTURE_EDEFAULT;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES:
				return OCCI_COMPUTE_CORES_EDEFAULT == null ? occiComputeCores != null : !OCCI_COMPUTE_CORES_EDEFAULT.equals(occiComputeCores);
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME:
				return OCCI_COMPUTE_HOSTNAME_EDEFAULT == null ? occiComputeHostname != null : !OCCI_COMPUTE_HOSTNAME_EDEFAULT.equals(occiComputeHostname);
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE:
				return OCCI_COMPUTE_SHARE_EDEFAULT == null ? occiComputeShare != null : !OCCI_COMPUTE_SHARE_EDEFAULT.equals(occiComputeShare);
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED:
				return OCCI_COMPUTE_SPEED_EDEFAULT == null ? occiComputeSpeed != null : !OCCI_COMPUTE_SPEED_EDEFAULT.equals(occiComputeSpeed);
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY:
				return OCCI_COMPUTE_MEMORY_EDEFAULT == null ? occiComputeMemory != null : !OCCI_COMPUTE_MEMORY_EDEFAULT.equals(occiComputeMemory);
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE:
				return occiComputeState != OCCI_COMPUTE_STATE_EDEFAULT;
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE:
				return OCCI_COMPUTE_STATE_MESSAGE_EDEFAULT == null ? occiComputeStateMessage != null : !OCCI_COMPUTE_STATE_MESSAGE_EDEFAULT.equals(occiComputeStateMessage);
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
			case InfrastructurePackage.COMPUTE___START:
				start();
				return null;
			case InfrastructurePackage.COMPUTE___STOP__STOPMETHOD:
				stop((StopMethod)arguments.get(0));
				return null;
			case InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD:
				restart((RestartMethod)arguments.get(0));
				return null;
			case InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD:
				suspend((SuspendMethod)arguments.get(0));
				return null;
			case InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING:
				save((SaveMethod)arguments.get(0), (String)arguments.get(1));
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
		result.append(" (occiComputeArchitecture: ");
		result.append(occiComputeArchitecture);
		result.append(", occiComputeCores: ");
		result.append(occiComputeCores);
		result.append(", occiComputeHostname: ");
		result.append(occiComputeHostname);
		result.append(", occiComputeShare: ");
		result.append(occiComputeShare);
		result.append(", occiComputeSpeed: ");
		result.append(occiComputeSpeed);
		result.append(", occiComputeMemory: ");
		result.append(occiComputeMemory);
		result.append(", occiComputeState: ");
		result.append(occiComputeState);
		result.append(", occiComputeStateMessage: ");
		result.append(occiComputeStateMessage);
		result.append(')');
		return result.toString();
	}

} //ComputeImpl
