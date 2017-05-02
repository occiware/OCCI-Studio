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
package org.eclipse.cmf.occi.crtp.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.crtp.CrtpPackage;
import org.eclipse.cmf.occi.crtp.CrtpTables;
import org.eclipse.cmf.occi.crtp.Large;

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
 * An implementation of the model object '<em><b>Large</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.crtp.impl.LargeImpl#getOcciComputeCores <em>Occi Compute Cores</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.crtp.impl.LargeImpl#getOcciComputeMemory <em>Occi Compute Memory</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.crtp.impl.LargeImpl#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LargeImpl extends MixinBaseImpl implements Large {
	/**
	 * The default value of the '{@link #getOcciComputeCores() <em>Occi Compute Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCI_COMPUTE_CORES_EDEFAULT = new Integer(4);

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
	 * The default value of the '{@link #getOcciComputeMemory() <em>Occi Compute Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Float OCCI_COMPUTE_MEMORY_EDEFAULT = new Float(4.0F);

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
	 * The default value of the '{@link #getOcciComputeEphemeralStorageSize() <em>Occi Compute Ephemeral Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeEphemeralStorageSize()
	 * @generated
	 * @ordered
	 */
	protected static final Float OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE_EDEFAULT = new Float(40.0F);

	/**
	 * The cached value of the '{@link #getOcciComputeEphemeralStorageSize() <em>Occi Compute Ephemeral Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeEphemeralStorageSize()
	 * @generated
	 * @ordered
	 */
	protected Float occiComputeEphemeralStorageSize = OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LargeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CrtpPackage.Literals.LARGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrtpPackage.LARGE__OCCI_COMPUTE_CORES, oldOcciComputeCores, occiComputeCores));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CrtpPackage.LARGE__OCCI_COMPUTE_MEMORY, oldOcciComputeMemory, occiComputeMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getOcciComputeEphemeralStorageSize() {
		return occiComputeEphemeralStorageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeEphemeralStorageSize(Float newOcciComputeEphemeralStorageSize) {
		Float oldOcciComputeEphemeralStorageSize = occiComputeEphemeralStorageSize;
		occiComputeEphemeralStorageSize = newOcciComputeEphemeralStorageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CrtpPackage.LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, oldOcciComputeEphemeralStorageSize, occiComputeEphemeralStorageSize));
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
		 *   let severity : Integer[1] = 'Large::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Compute)
		 *       in
		 *         'Large::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CrtpTables.STR_Large_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CrtpTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Compute_0 = idResolver.getClass(CrtpTables.CLSSid_Compute, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Compute_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CrtpTables.STR_Large_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CrtpTables.INT_0).booleanValue();
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
			case CrtpPackage.LARGE__OCCI_COMPUTE_CORES:
				return getOcciComputeCores();
			case CrtpPackage.LARGE__OCCI_COMPUTE_MEMORY:
				return getOcciComputeMemory();
			case CrtpPackage.LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE:
				return getOcciComputeEphemeralStorageSize();
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
			case CrtpPackage.LARGE__OCCI_COMPUTE_CORES:
				setOcciComputeCores((Integer)newValue);
				return;
			case CrtpPackage.LARGE__OCCI_COMPUTE_MEMORY:
				setOcciComputeMemory((Float)newValue);
				return;
			case CrtpPackage.LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE:
				setOcciComputeEphemeralStorageSize((Float)newValue);
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
			case CrtpPackage.LARGE__OCCI_COMPUTE_CORES:
				setOcciComputeCores(OCCI_COMPUTE_CORES_EDEFAULT);
				return;
			case CrtpPackage.LARGE__OCCI_COMPUTE_MEMORY:
				setOcciComputeMemory(OCCI_COMPUTE_MEMORY_EDEFAULT);
				return;
			case CrtpPackage.LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE:
				setOcciComputeEphemeralStorageSize(OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE_EDEFAULT);
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
			case CrtpPackage.LARGE__OCCI_COMPUTE_CORES:
				return OCCI_COMPUTE_CORES_EDEFAULT == null ? occiComputeCores != null : !OCCI_COMPUTE_CORES_EDEFAULT.equals(occiComputeCores);
			case CrtpPackage.LARGE__OCCI_COMPUTE_MEMORY:
				return OCCI_COMPUTE_MEMORY_EDEFAULT == null ? occiComputeMemory != null : !OCCI_COMPUTE_MEMORY_EDEFAULT.equals(occiComputeMemory);
			case CrtpPackage.LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE:
				return OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE_EDEFAULT == null ? occiComputeEphemeralStorageSize != null : !OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE_EDEFAULT.equals(occiComputeEphemeralStorageSize);
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
			case CrtpPackage.LARGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (occiComputeCores: ");
		result.append(occiComputeCores);
		result.append(", occiComputeMemory: ");
		result.append(occiComputeMemory);
		result.append(", occiComputeEphemeralStorageSize: ");
		result.append(occiComputeEphemeralStorageSize);
		result.append(')');
		return result.toString();
	}

} //LargeImpl
