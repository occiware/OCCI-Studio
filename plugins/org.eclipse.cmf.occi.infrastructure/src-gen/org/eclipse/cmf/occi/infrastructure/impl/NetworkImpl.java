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

import java.util.Iterator;
import java.util.Map;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.cmf.occi.infrastructure.Network;
import org.eclipse.cmf.occi.infrastructure.NetworkStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl#getOcciNetworkVlan <em>Occi Network Vlan</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl#getOcciNetworkLabel <em>Occi Network Label</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl#getOcciNetworkState <em>Occi Network State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl#getOcciNetworkStateMessage <em>Occi Network State Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends ResourceImpl implements Network {
	/**
	 * The default value of the '{@link #getOcciNetworkVlan() <em>Occi Network Vlan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkVlan()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCI_NETWORK_VLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciNetworkVlan() <em>Occi Network Vlan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkVlan()
	 * @generated
	 * @ordered
	 */
	protected Integer occiNetworkVlan = OCCI_NETWORK_VLAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciNetworkLabel() <em>Occi Network Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_NETWORK_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciNetworkLabel() <em>Occi Network Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkLabel()
	 * @generated
	 * @ordered
	 */
	protected String occiNetworkLabel = OCCI_NETWORK_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciNetworkState() <em>Occi Network State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkState()
	 * @generated
	 * @ordered
	 */
	protected static final NetworkStatus OCCI_NETWORK_STATE_EDEFAULT = NetworkStatus.INACTIVE;

	/**
	 * The cached value of the '{@link #getOcciNetworkState() <em>Occi Network State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkState()
	 * @generated
	 * @ordered
	 */
	protected NetworkStatus occiNetworkState = OCCI_NETWORK_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciNetworkStateMessage() <em>Occi Network State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkStateMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_NETWORK_STATE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciNetworkStateMessage() <em>Occi Network State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkStateMessage()
	 * @generated
	 * @ordered
	 */
	protected String occiNetworkStateMessage = OCCI_NETWORK_STATE_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciNetworkVlan() {
		return occiNetworkVlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkVlan(Integer newOcciNetworkVlan) {
		Integer oldOcciNetworkVlan = occiNetworkVlan;
		occiNetworkVlan = newOcciNetworkVlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK__OCCI_NETWORK_VLAN, oldOcciNetworkVlan, occiNetworkVlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciNetworkLabel() {
		return occiNetworkLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkLabel(String newOcciNetworkLabel) {
		String oldOcciNetworkLabel = occiNetworkLabel;
		occiNetworkLabel = newOcciNetworkLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK__OCCI_NETWORK_LABEL, oldOcciNetworkLabel, occiNetworkLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkStatus getOcciNetworkState() {
		return occiNetworkState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkState(NetworkStatus newOcciNetworkState) {
		NetworkStatus oldOcciNetworkState = occiNetworkState;
		occiNetworkState = newOcciNetworkState == null ? OCCI_NETWORK_STATE_EDEFAULT : newOcciNetworkState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE, oldOcciNetworkState, occiNetworkState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciNetworkStateMessage() {
		return occiNetworkStateMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkStateMessage(String newOcciNetworkStateMessage) {
		String oldOcciNetworkStateMessage = occiNetworkStateMessage;
		occiNetworkStateMessage = newOcciNetworkStateMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE_MESSAGE, oldOcciNetworkStateMessage, occiNetworkStateMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void up() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Network!up()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void down() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Network!down()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueVlan(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv UniqueVlan:
		 *   let severity : Integer[1] = 'Network::UniqueVlan'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = Network.allInstances()
		 *         ->isUnique(occiNetworkVlan)
		 *       in
		 *         'Network::UniqueVlan'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, InfrastructureTables.STR_Network_c_c_UniqueVlan);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, InfrastructureTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Network = idResolver.getClass(InfrastructureTables.CLSSid_Network, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, InfrastructureTables.SET_CLSSid_Network, TYP_infrastructure_c_c_Network);
				/*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(InfrastructureTables.SET_CLSSid_Network);
				/*@NonNull*/ Iterator<Object> ITERATOR__1 = allInstances.iterator();
				/*@Thrown*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = ValueUtil.TRUE_VALUE;
						break;
					}
					/*@NonInvalid*/ Network _1 = (Network)ITERATOR__1.next();
					/**
					 * occiNetworkVlan
					 */
					final /*@NonInvalid*/ Integer occiNetworkVlan = _1.getOcciNetworkVlan();
					final /*@NonInvalid*/ IntegerValue BOXED_occiNetworkVlan = occiNetworkVlan == null ? null : ValueUtil.integerValueOf(occiNetworkVlan);
					//
					if (accumulator.includes(BOXED_occiNetworkVlan) == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.FALSE_VALUE;			// Abort after second find
						break;
					}
					else {
						accumulator.add(BOXED_occiNetworkVlan);
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, InfrastructureTables.STR_Network_c_c_UniqueVlan, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, InfrastructureTables.INT_0).booleanValue();
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
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_VLAN:
				return getOcciNetworkVlan();
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_LABEL:
				return getOcciNetworkLabel();
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE:
				return getOcciNetworkState();
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE_MESSAGE:
				return getOcciNetworkStateMessage();
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
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_VLAN:
				setOcciNetworkVlan((Integer)newValue);
				return;
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_LABEL:
				setOcciNetworkLabel((String)newValue);
				return;
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE:
				setOcciNetworkState((NetworkStatus)newValue);
				return;
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE_MESSAGE:
				setOcciNetworkStateMessage((String)newValue);
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
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_VLAN:
				setOcciNetworkVlan(OCCI_NETWORK_VLAN_EDEFAULT);
				return;
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_LABEL:
				setOcciNetworkLabel(OCCI_NETWORK_LABEL_EDEFAULT);
				return;
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE:
				setOcciNetworkState(OCCI_NETWORK_STATE_EDEFAULT);
				return;
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE_MESSAGE:
				setOcciNetworkStateMessage(OCCI_NETWORK_STATE_MESSAGE_EDEFAULT);
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
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_VLAN:
				return OCCI_NETWORK_VLAN_EDEFAULT == null ? occiNetworkVlan != null : !OCCI_NETWORK_VLAN_EDEFAULT.equals(occiNetworkVlan);
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_LABEL:
				return OCCI_NETWORK_LABEL_EDEFAULT == null ? occiNetworkLabel != null : !OCCI_NETWORK_LABEL_EDEFAULT.equals(occiNetworkLabel);
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE:
				return occiNetworkState != OCCI_NETWORK_STATE_EDEFAULT;
			case InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE_MESSAGE:
				return OCCI_NETWORK_STATE_MESSAGE_EDEFAULT == null ? occiNetworkStateMessage != null : !OCCI_NETWORK_STATE_MESSAGE_EDEFAULT.equals(occiNetworkStateMessage);
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
			case InfrastructurePackage.NETWORK___UP:
				up();
				return null;
			case InfrastructurePackage.NETWORK___DOWN:
				down();
				return null;
			case InfrastructurePackage.NETWORK___UNIQUE_VLAN__DIAGNOSTICCHAIN_MAP:
				return UniqueVlan((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (occiNetworkVlan: ");
		result.append(occiNetworkVlan);
		result.append(", occiNetworkLabel: ");
		result.append(occiNetworkLabel);
		result.append(", occiNetworkState: ");
		result.append(occiNetworkState);
		result.append(", occiNetworkStateMessage: ");
		result.append(occiNetworkStateMessage);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
