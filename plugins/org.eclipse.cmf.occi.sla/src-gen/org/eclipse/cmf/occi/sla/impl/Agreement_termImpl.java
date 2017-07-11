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
package org.eclipse.cmf.occi.sla.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.sla.AgreementTermStatus;
import org.eclipse.cmf.occi.sla.AgreementTermType;
import org.eclipse.cmf.occi.sla.Agreement_term;
import org.eclipse.cmf.occi.sla.SlaPackage;
import org.eclipse.cmf.occi.sla.SlaTables;

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
 * An implementation of the model object '<em><b>Agreement term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.sla.impl.Agreement_termImpl#getOcciAgreementTermType <em>Occi Agreement Term Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.impl.Agreement_termImpl#getOcciAgreementTermState <em>Occi Agreement Term State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.impl.Agreement_termImpl#getOcciAgreementTermDesc <em>Occi Agreement Term Desc</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.impl.Agreement_termImpl#getOcciAgreementTermRemedy <em>Occi Agreement Term Remedy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Agreement_termImpl extends MixinBaseImpl implements Agreement_term {
	/**
	 * The default value of the '{@link #getOcciAgreementTermType() <em>Occi Agreement Term Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementTermType()
	 * @generated
	 * @ordered
	 */
	protected static final AgreementTermType OCCI_AGREEMENT_TERM_TYPE_EDEFAULT = AgreementTermType.SERVICE;
	/**
	 * The cached value of the '{@link #getOcciAgreementTermType() <em>Occi Agreement Term Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementTermType()
	 * @generated
	 * @ordered
	 */
	protected AgreementTermType occiAgreementTermType = OCCI_AGREEMENT_TERM_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getOcciAgreementTermState() <em>Occi Agreement Term State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementTermState()
	 * @generated
	 * @ordered
	 */
	protected static final AgreementTermStatus OCCI_AGREEMENT_TERM_STATE_EDEFAULT = AgreementTermStatus.UNDEFINED;
	/**
	 * The cached value of the '{@link #getOcciAgreementTermState() <em>Occi Agreement Term State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementTermState()
	 * @generated
	 * @ordered
	 */
	protected AgreementTermStatus occiAgreementTermState = OCCI_AGREEMENT_TERM_STATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getOcciAgreementTermDesc() <em>Occi Agreement Term Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementTermDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_AGREEMENT_TERM_DESC_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOcciAgreementTermDesc() <em>Occi Agreement Term Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementTermDesc()
	 * @generated
	 * @ordered
	 */
	protected String occiAgreementTermDesc = OCCI_AGREEMENT_TERM_DESC_EDEFAULT;
	/**
	 * The default value of the '{@link #getOcciAgreementTermRemedy() <em>Occi Agreement Term Remedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementTermRemedy()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_AGREEMENT_TERM_REMEDY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOcciAgreementTermRemedy() <em>Occi Agreement Term Remedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciAgreementTermRemedy()
	 * @generated
	 * @ordered
	 */
	protected String occiAgreementTermRemedy = OCCI_AGREEMENT_TERM_REMEDY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Agreement_termImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlaPackage.Literals.AGREEMENT_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementTermType getOcciAgreementTermType() {
		return occiAgreementTermType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAgreementTermType(AgreementTermType newOcciAgreementTermType) {
		AgreementTermType oldOcciAgreementTermType = occiAgreementTermType;
		occiAgreementTermType = newOcciAgreementTermType == null ? OCCI_AGREEMENT_TERM_TYPE_EDEFAULT : newOcciAgreementTermType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE, oldOcciAgreementTermType, occiAgreementTermType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementTermStatus getOcciAgreementTermState() {
		return occiAgreementTermState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAgreementTermState(AgreementTermStatus newOcciAgreementTermState) {
		AgreementTermStatus oldOcciAgreementTermState = occiAgreementTermState;
		occiAgreementTermState = newOcciAgreementTermState == null ? OCCI_AGREEMENT_TERM_STATE_EDEFAULT : newOcciAgreementTermState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE, oldOcciAgreementTermState, occiAgreementTermState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciAgreementTermDesc() {
		return occiAgreementTermDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAgreementTermDesc(String newOcciAgreementTermDesc) {
		String oldOcciAgreementTermDesc = occiAgreementTermDesc;
		occiAgreementTermDesc = newOcciAgreementTermDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC, oldOcciAgreementTermDesc, occiAgreementTermDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciAgreementTermRemedy() {
		return occiAgreementTermRemedy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciAgreementTermRemedy(String newOcciAgreementTermRemedy) {
		String oldOcciAgreementTermRemedy = occiAgreementTermRemedy;
		occiAgreementTermRemedy = newOcciAgreementTermRemedy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY, oldOcciAgreementTermRemedy, occiAgreementTermRemedy));
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
		 *     severity : Integer[1] = 'Agreement_term::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Agreement)
		 *       in
		 *         'Agreement_term::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SlaTables.STR_Agreement_term_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SlaTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_sla_c_c_Agreement_0 = idResolver.getClass(SlaTables.CLSSid_Agreement, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_sla_c_c_Agreement_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SlaTables.STR_Agreement_term_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, SlaTables.INT_0).booleanValue();
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
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE:
				return getOcciAgreementTermType();
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE:
				return getOcciAgreementTermState();
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC:
				return getOcciAgreementTermDesc();
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY:
				return getOcciAgreementTermRemedy();
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
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE:
				setOcciAgreementTermType((AgreementTermType)newValue);
				return;
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE:
				setOcciAgreementTermState((AgreementTermStatus)newValue);
				return;
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC:
				setOcciAgreementTermDesc((String)newValue);
				return;
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY:
				setOcciAgreementTermRemedy((String)newValue);
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
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE:
				setOcciAgreementTermType(OCCI_AGREEMENT_TERM_TYPE_EDEFAULT);
				return;
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE:
				setOcciAgreementTermState(OCCI_AGREEMENT_TERM_STATE_EDEFAULT);
				return;
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC:
				setOcciAgreementTermDesc(OCCI_AGREEMENT_TERM_DESC_EDEFAULT);
				return;
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY:
				setOcciAgreementTermRemedy(OCCI_AGREEMENT_TERM_REMEDY_EDEFAULT);
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
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE:
				return occiAgreementTermType != OCCI_AGREEMENT_TERM_TYPE_EDEFAULT;
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE:
				return occiAgreementTermState != OCCI_AGREEMENT_TERM_STATE_EDEFAULT;
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC:
				return OCCI_AGREEMENT_TERM_DESC_EDEFAULT == null ? occiAgreementTermDesc != null : !OCCI_AGREEMENT_TERM_DESC_EDEFAULT.equals(occiAgreementTermDesc);
			case SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY:
				return OCCI_AGREEMENT_TERM_REMEDY_EDEFAULT == null ? occiAgreementTermRemedy != null : !OCCI_AGREEMENT_TERM_REMEDY_EDEFAULT.equals(occiAgreementTermRemedy);
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
			case SlaPackage.AGREEMENT_TERM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (occiAgreementTermType: ");
		result.append(occiAgreementTermType);
		result.append(", occiAgreementTermState: ");
		result.append(occiAgreementTermState);
		result.append(", occiAgreementTermDesc: ");
		result.append(occiAgreementTermDesc);
		result.append(", occiAgreementTermRemedy: ");
		result.append(occiAgreementTermRemedy);
		result.append(')');
		return result.toString();
	}

} //Agreement_termImpl
