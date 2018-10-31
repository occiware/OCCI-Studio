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

import java.util.Map;

import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.core.impl.LinkImpl;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Networkinterface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkinterfaceImpl#getOcciNetworkinterfaceInterface <em>Occi Networkinterface Interface</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkinterfaceImpl#getOcciNetworkinterfaceMac <em>Occi Networkinterface Mac</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkinterfaceImpl#getOcciNetworkinterfaceState <em>Occi Networkinterface State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkinterfaceImpl#getOcciNetworkinterfaceStateMessage <em>Occi Networkinterface State Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkinterfaceImpl extends LinkImpl implements Networkinterface {
	/**
	 * The default value of the '{@link #getOcciNetworkinterfaceInterface() <em>Occi Networkinterface Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_NETWORKINTERFACE_INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciNetworkinterfaceInterface() <em>Occi Networkinterface Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceInterface()
	 * @generated
	 * @ordered
	 */
	protected String occiNetworkinterfaceInterface = OCCI_NETWORKINTERFACE_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciNetworkinterfaceMac() <em>Occi Networkinterface Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceMac()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_NETWORKINTERFACE_MAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciNetworkinterfaceMac() <em>Occi Networkinterface Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceMac()
	 * @generated
	 * @ordered
	 */
	protected String occiNetworkinterfaceMac = OCCI_NETWORKINTERFACE_MAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciNetworkinterfaceState() <em>Occi Networkinterface State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceState()
	 * @generated
	 * @ordered
	 */
	protected static final NetworkInterfaceStatus OCCI_NETWORKINTERFACE_STATE_EDEFAULT = NetworkInterfaceStatus.ACTIVE;

	/**
	 * The cached value of the '{@link #getOcciNetworkinterfaceState() <em>Occi Networkinterface State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceState()
	 * @generated
	 * @ordered
	 */
	protected NetworkInterfaceStatus occiNetworkinterfaceState = OCCI_NETWORKINTERFACE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciNetworkinterfaceStateMessage() <em>Occi Networkinterface State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceStateMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_NETWORKINTERFACE_STATE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciNetworkinterfaceStateMessage() <em>Occi Networkinterface State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceStateMessage()
	 * @generated
	 * @ordered
	 */
	protected String occiNetworkinterfaceStateMessage = OCCI_NETWORKINTERFACE_STATE_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkinterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.NETWORKINTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciNetworkinterfaceInterface() {
		return occiNetworkinterfaceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkinterfaceInterface(String newOcciNetworkinterfaceInterface) {
		String oldOcciNetworkinterfaceInterface = occiNetworkinterfaceInterface;
		occiNetworkinterfaceInterface = newOcciNetworkinterfaceInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE, oldOcciNetworkinterfaceInterface, occiNetworkinterfaceInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciNetworkinterfaceMac() {
		return occiNetworkinterfaceMac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkinterfaceMac(String newOcciNetworkinterfaceMac) {
		String oldOcciNetworkinterfaceMac = occiNetworkinterfaceMac;
		occiNetworkinterfaceMac = newOcciNetworkinterfaceMac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC, oldOcciNetworkinterfaceMac, occiNetworkinterfaceMac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterfaceStatus getOcciNetworkinterfaceState() {
		return occiNetworkinterfaceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkinterfaceState(NetworkInterfaceStatus newOcciNetworkinterfaceState) {
		NetworkInterfaceStatus oldOcciNetworkinterfaceState = occiNetworkinterfaceState;
		occiNetworkinterfaceState = newOcciNetworkinterfaceState == null ? OCCI_NETWORKINTERFACE_STATE_EDEFAULT : newOcciNetworkinterfaceState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE, oldOcciNetworkinterfaceState, occiNetworkinterfaceState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciNetworkinterfaceStateMessage() {
		return occiNetworkinterfaceStateMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkinterfaceStateMessage(String newOcciNetworkinterfaceStateMessage) {
		String oldOcciNetworkinterfaceStateMessage = occiNetworkinterfaceStateMessage;
		occiNetworkinterfaceStateMessage = newOcciNetworkinterfaceStateMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE, oldOcciNetworkinterfaceStateMessage, occiNetworkinterfaceStateMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean targetConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv targetConstraint:
		 *   let
		 *     severity : Integer[1] = 'Networkinterface::targetConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : occi::Boolean[1] = self.target.oclIsKindOf(Network)
		 *       in
		 *         'Networkinterface::targetConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, InfrastructureTables.STR_Networkinterface_c_c_targetConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, InfrastructureTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Network_0 = idResolver.getClass(InfrastructureTables.CLSSid_Network, null);
			final /*@NonInvalid*/ Resource target = this.getTarget();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, target, TYP_infrastructure_c_c_Network_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, InfrastructureTables.STR_Networkinterface_c_c_targetConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, InfrastructureTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE:
				return getOcciNetworkinterfaceInterface();
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC:
				return getOcciNetworkinterfaceMac();
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE:
				return getOcciNetworkinterfaceState();
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE:
				return getOcciNetworkinterfaceStateMessage();
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
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE:
				setOcciNetworkinterfaceInterface((String)newValue);
				return;
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC:
				setOcciNetworkinterfaceMac((String)newValue);
				return;
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE:
				setOcciNetworkinterfaceState((NetworkInterfaceStatus)newValue);
				return;
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE:
				setOcciNetworkinterfaceStateMessage((String)newValue);
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
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE:
				setOcciNetworkinterfaceInterface(OCCI_NETWORKINTERFACE_INTERFACE_EDEFAULT);
				return;
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC:
				setOcciNetworkinterfaceMac(OCCI_NETWORKINTERFACE_MAC_EDEFAULT);
				return;
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE:
				setOcciNetworkinterfaceState(OCCI_NETWORKINTERFACE_STATE_EDEFAULT);
				return;
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE:
				setOcciNetworkinterfaceStateMessage(OCCI_NETWORKINTERFACE_STATE_MESSAGE_EDEFAULT);
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
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE:
				return OCCI_NETWORKINTERFACE_INTERFACE_EDEFAULT == null ? occiNetworkinterfaceInterface != null : !OCCI_NETWORKINTERFACE_INTERFACE_EDEFAULT.equals(occiNetworkinterfaceInterface);
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC:
				return OCCI_NETWORKINTERFACE_MAC_EDEFAULT == null ? occiNetworkinterfaceMac != null : !OCCI_NETWORKINTERFACE_MAC_EDEFAULT.equals(occiNetworkinterfaceMac);
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE:
				return occiNetworkinterfaceState != OCCI_NETWORKINTERFACE_STATE_EDEFAULT;
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE:
				return OCCI_NETWORKINTERFACE_STATE_MESSAGE_EDEFAULT == null ? occiNetworkinterfaceStateMessage != null : !OCCI_NETWORKINTERFACE_STATE_MESSAGE_EDEFAULT.equals(occiNetworkinterfaceStateMessage);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InfrastructurePackage.NETWORKINTERFACE___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return targetConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (occiNetworkinterfaceInterface: ");
		result.append(occiNetworkinterfaceInterface);
		result.append(", occiNetworkinterfaceMac: ");
		result.append(occiNetworkinterfaceMac);
		result.append(", occiNetworkinterfaceState: ");
		result.append(occiNetworkinterfaceState);
		result.append(", occiNetworkinterfaceStateMessage: ");
		result.append(occiNetworkinterfaceStateMessage);
		result.append(')');
		return result.toString();
	}

} //NetworkinterfaceImpl
