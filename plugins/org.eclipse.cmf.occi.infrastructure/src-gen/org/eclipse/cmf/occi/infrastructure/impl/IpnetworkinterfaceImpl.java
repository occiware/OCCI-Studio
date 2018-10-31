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

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.infrastructure.Allocation;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface;

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

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ipnetworkinterface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.IpnetworkinterfaceImpl#getOcciNetworkinterfaceAddress <em>Occi Networkinterface Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.IpnetworkinterfaceImpl#getOcciNetworkinterfaceGateway <em>Occi Networkinterface Gateway</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.impl.IpnetworkinterfaceImpl#getOcciNetworkinterfaceAllocation <em>Occi Networkinterface Allocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IpnetworkinterfaceImpl extends MixinBaseImpl implements Ipnetworkinterface {
	/**
	 * The default value of the '{@link #getOcciNetworkinterfaceAddress() <em>Occi Networkinterface Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_NETWORKINTERFACE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciNetworkinterfaceAddress() <em>Occi Networkinterface Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceAddress()
	 * @generated
	 * @ordered
	 */
	protected String occiNetworkinterfaceAddress = OCCI_NETWORKINTERFACE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciNetworkinterfaceGateway() <em>Occi Networkinterface Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceGateway()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_NETWORKINTERFACE_GATEWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciNetworkinterfaceGateway() <em>Occi Networkinterface Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceGateway()
	 * @generated
	 * @ordered
	 */
	protected String occiNetworkinterfaceGateway = OCCI_NETWORKINTERFACE_GATEWAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciNetworkinterfaceAllocation() <em>Occi Networkinterface Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceAllocation()
	 * @generated
	 * @ordered
	 */
	protected static final Allocation OCCI_NETWORKINTERFACE_ALLOCATION_EDEFAULT = Allocation.DYNAMIC;

	/**
	 * The cached value of the '{@link #getOcciNetworkinterfaceAllocation() <em>Occi Networkinterface Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciNetworkinterfaceAllocation()
	 * @generated
	 * @ordered
	 */
	protected Allocation occiNetworkinterfaceAllocation = OCCI_NETWORKINTERFACE_ALLOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IpnetworkinterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.IPNETWORKINTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciNetworkinterfaceAddress() {
		return occiNetworkinterfaceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkinterfaceAddress(String newOcciNetworkinterfaceAddress) {
		String oldOcciNetworkinterfaceAddress = occiNetworkinterfaceAddress;
		occiNetworkinterfaceAddress = newOcciNetworkinterfaceAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ADDRESS, oldOcciNetworkinterfaceAddress, occiNetworkinterfaceAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciNetworkinterfaceGateway() {
		return occiNetworkinterfaceGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkinterfaceGateway(String newOcciNetworkinterfaceGateway) {
		String oldOcciNetworkinterfaceGateway = occiNetworkinterfaceGateway;
		occiNetworkinterfaceGateway = newOcciNetworkinterfaceGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_GATEWAY, oldOcciNetworkinterfaceGateway, occiNetworkinterfaceGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation getOcciNetworkinterfaceAllocation() {
		return occiNetworkinterfaceAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciNetworkinterfaceAllocation(Allocation newOcciNetworkinterfaceAllocation) {
		Allocation oldOcciNetworkinterfaceAllocation = occiNetworkinterfaceAllocation;
		occiNetworkinterfaceAllocation = newOcciNetworkinterfaceAllocation == null ? OCCI_NETWORKINTERFACE_ALLOCATION_EDEFAULT : newOcciNetworkinterfaceAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ALLOCATION, oldOcciNetworkinterfaceAllocation, occiNetworkinterfaceAllocation));
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
		 *   let
		 *     severity : Integer[1] = 'Ipnetworkinterface::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Networkinterface)
		 *       in
		 *         'Ipnetworkinterface::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, InfrastructureTables.STR_Ipnetworkinterface_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, InfrastructureTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Networkinterface = idResolver.getClass(InfrastructureTables.CLSSid_Networkinterface, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Networkinterface).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, InfrastructureTables.STR_Ipnetworkinterface_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, InfrastructureTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IPAdressesMustBeUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv IPAdressesMustBeUnique:
		 *   let
		 *     severity : Integer[1] = 'Ipnetworkinterface::IPAdressesMustBeUnique'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = Ipnetworkinterface.allInstances()
		 *         ->isUnique(occiNetworkinterfaceAddress)
		 *       in
		 *         'Ipnetworkinterface::IPAdressesMustBeUnique'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, InfrastructureTables.STR_Ipnetworkinterface_c_c_IPAdressesMustBeUnique);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, InfrastructureTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Ipnetworkinterface = idResolver.getClass(InfrastructureTables.CLSSid_Ipnetworkinterface, null);
			final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, InfrastructureTables.SET_CLSSid_Ipnetworkinterface, TYP_infrastructure_c_c_Ipnetworkinterface);
			/*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(InfrastructureTables.SET_CLSSid_Ipnetworkinterface);
			/*@NonNull*/ Iterator<Object> ITERATOR__1 = allInstances.iterator();
			/*@NonInvalid*/ boolean result;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					result = ValueUtil.TRUE_VALUE;
					break;
				}
				/*@NonInvalid*/ Ipnetworkinterface _1 = (Ipnetworkinterface)ITERATOR__1.next();
				/**
				 * occiNetworkinterfaceAddress
				 */
				final /*@NonInvalid*/ String occiNetworkinterfaceAddress = _1.getOcciNetworkinterfaceAddress();
				//
				if (accumulator.includes(occiNetworkinterfaceAddress) == ValueUtil.TRUE_VALUE) {
					result = ValueUtil.FALSE_VALUE;			// Abort after second find
					break;
				}
				else {
					accumulator.add(occiNetworkinterfaceAddress);
				}
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, InfrastructureTables.STR_Ipnetworkinterface_c_c_IPAdressesMustBeUnique, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, InfrastructureTables.INT_0).booleanValue();
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
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ADDRESS:
				return getOcciNetworkinterfaceAddress();
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_GATEWAY:
				return getOcciNetworkinterfaceGateway();
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ALLOCATION:
				return getOcciNetworkinterfaceAllocation();
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
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ADDRESS:
				setOcciNetworkinterfaceAddress((String)newValue);
				return;
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_GATEWAY:
				setOcciNetworkinterfaceGateway((String)newValue);
				return;
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ALLOCATION:
				setOcciNetworkinterfaceAllocation((Allocation)newValue);
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
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ADDRESS:
				setOcciNetworkinterfaceAddress(OCCI_NETWORKINTERFACE_ADDRESS_EDEFAULT);
				return;
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_GATEWAY:
				setOcciNetworkinterfaceGateway(OCCI_NETWORKINTERFACE_GATEWAY_EDEFAULT);
				return;
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ALLOCATION:
				setOcciNetworkinterfaceAllocation(OCCI_NETWORKINTERFACE_ALLOCATION_EDEFAULT);
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
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ADDRESS:
				return OCCI_NETWORKINTERFACE_ADDRESS_EDEFAULT == null ? occiNetworkinterfaceAddress != null : !OCCI_NETWORKINTERFACE_ADDRESS_EDEFAULT.equals(occiNetworkinterfaceAddress);
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_GATEWAY:
				return OCCI_NETWORKINTERFACE_GATEWAY_EDEFAULT == null ? occiNetworkinterfaceGateway != null : !OCCI_NETWORKINTERFACE_GATEWAY_EDEFAULT.equals(occiNetworkinterfaceGateway);
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ALLOCATION:
				return occiNetworkinterfaceAllocation != OCCI_NETWORKINTERFACE_ALLOCATION_EDEFAULT;
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
			case InfrastructurePackage.IPNETWORKINTERFACE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case InfrastructurePackage.IPNETWORKINTERFACE___IP_ADRESSES_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return IPAdressesMustBeUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (occiNetworkinterfaceAddress: ");
		result.append(occiNetworkinterfaceAddress);
		result.append(", occiNetworkinterfaceGateway: ");
		result.append(occiNetworkinterfaceGateway);
		result.append(", occiNetworkinterfaceAllocation: ");
		result.append(occiNetworkinterfaceAllocation);
		result.append(')');
		return result.toString();
	}

} //IpnetworkinterfaceImpl
