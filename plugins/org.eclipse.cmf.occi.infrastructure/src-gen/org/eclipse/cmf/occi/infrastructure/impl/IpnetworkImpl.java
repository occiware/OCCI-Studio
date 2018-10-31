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

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.infrastructure.Allocation;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.cmf.occi.infrastructure.Ipnetwork;

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
 * An implementation of the model object '<em><b>Ipnetwork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.IpnetworkImpl#getOcciNetworkAddress <em>Occi Network Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.IpnetworkImpl#getOcciNetworkGateway <em>Occi Network Gateway</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.IpnetworkImpl#getOcciNetworkAllocation <em>Occi Network Allocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IpnetworkImpl extends MixinBaseImpl implements Ipnetwork {
	/**
	 * The default value of the '{@link #getOcciNetworkAddress() <em>Occi Network Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_NETWORK_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciNetworkAddress() <em>Occi Network Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkAddress()
	 * @generated
	 * @ordered
	 */
	protected String occiNetworkAddress = OCCI_NETWORK_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciNetworkGateway() <em>Occi Network Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkGateway()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_NETWORK_GATEWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciNetworkGateway() <em>Occi Network Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkGateway()
	 * @generated
	 * @ordered
	 */
	protected String occiNetworkGateway = OCCI_NETWORK_GATEWAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciNetworkAllocation() <em>Occi Network Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkAllocation()
	 * @generated
	 * @ordered
	 */
	protected static final Allocation OCCI_NETWORK_ALLOCATION_EDEFAULT = Allocation.DYNAMIC;

	/**
	 * The cached value of the '{@link #getOcciNetworkAllocation() <em>Occi Network Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkAllocation()
	 * @generated
	 * @ordered
	 */
	protected Allocation occiNetworkAllocation = OCCI_NETWORK_ALLOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IpnetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.IPNETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciNetworkAddress() {
		return occiNetworkAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkAddress(String newOcciNetworkAddress) {
		String oldOcciNetworkAddress = occiNetworkAddress;
		occiNetworkAddress = newOcciNetworkAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.IPNETWORK__OCCI_NETWORK_ADDRESS, oldOcciNetworkAddress, occiNetworkAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciNetworkGateway() {
		return occiNetworkGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkGateway(String newOcciNetworkGateway) {
		String oldOcciNetworkGateway = occiNetworkGateway;
		occiNetworkGateway = newOcciNetworkGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.IPNETWORK__OCCI_NETWORK_GATEWAY, oldOcciNetworkGateway, occiNetworkGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation getOcciNetworkAllocation() {
		return occiNetworkAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkAllocation(Allocation newOcciNetworkAllocation) {
		Allocation oldOcciNetworkAllocation = occiNetworkAllocation;
		occiNetworkAllocation = newOcciNetworkAllocation == null ? OCCI_NETWORK_ALLOCATION_EDEFAULT : newOcciNetworkAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.IPNETWORK__OCCI_NETWORK_ALLOCATION, oldOcciNetworkAllocation, occiNetworkAllocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let severity : Integer[1] = 'Ipnetwork::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : occi::Boolean[1] = self.entity.oclIsKindOf(Network)
		 *       in
		 *         'Ipnetwork::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, InfrastructureTables.STR_Ipnetwork_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, InfrastructureTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Network_0 = idResolver.getClass(InfrastructureTables.CLSSid_Network, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Network_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, InfrastructureTables.STR_Ipnetwork_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, InfrastructureTables.INT_0).booleanValue();
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
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_ADDRESS:
				return getOcciNetworkAddress();
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_GATEWAY:
				return getOcciNetworkGateway();
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_ALLOCATION:
				return getOcciNetworkAllocation();
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
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_ADDRESS:
				setOcciNetworkAddress((String)newValue);
				return;
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_GATEWAY:
				setOcciNetworkGateway((String)newValue);
				return;
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_ALLOCATION:
				setOcciNetworkAllocation((Allocation)newValue);
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
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_ADDRESS:
				setOcciNetworkAddress(OCCI_NETWORK_ADDRESS_EDEFAULT);
				return;
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_GATEWAY:
				setOcciNetworkGateway(OCCI_NETWORK_GATEWAY_EDEFAULT);
				return;
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_ALLOCATION:
				setOcciNetworkAllocation(OCCI_NETWORK_ALLOCATION_EDEFAULT);
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
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_ADDRESS:
				return OCCI_NETWORK_ADDRESS_EDEFAULT == null ? occiNetworkAddress != null : !OCCI_NETWORK_ADDRESS_EDEFAULT.equals(occiNetworkAddress);
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_GATEWAY:
				return OCCI_NETWORK_GATEWAY_EDEFAULT == null ? occiNetworkGateway != null : !OCCI_NETWORK_GATEWAY_EDEFAULT.equals(occiNetworkGateway);
			case InfrastructurePackage.IPNETWORK__OCCI_NETWORK_ALLOCATION:
				return occiNetworkAllocation != OCCI_NETWORK_ALLOCATION_EDEFAULT;
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
			case InfrastructurePackage.IPNETWORK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (occiNetworkAddress: ");
		result.append(occiNetworkAddress);
		result.append(", occiNetworkGateway: ");
		result.append(occiNetworkGateway);
		result.append(", occiNetworkAllocation: ");
		result.append(occiNetworkAllocation);
		result.append(')');
		return result.toString();
	}

} //IpnetworkImpl
