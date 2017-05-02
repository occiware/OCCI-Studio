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
package org.eclipse.cmf.occi.crtp.util;

import java.util.Map;

import org.eclipse.cmf.occi.crtp.*;

import org.eclipse.cmf.occi.infrastructure.util.InfrastructureValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.crtp.CrtpPackage
 * @generated
 */
public class CrtpValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CrtpValidator INSTANCE = new CrtpValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.crtp";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Small'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SMALL__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Medium'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDIUM__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Large'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LARGE__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Mem small'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEM_SMALL__APPLIES_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Mem medium'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEM_MEDIUM__APPLIES_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Mem large'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEM_LARGE__APPLIES_CONSTRAINT = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureValidator infrastructureValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrtpValidator() {
		super();
		infrastructureValidator = InfrastructureValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CrtpPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CrtpPackage.SMALL:
				return validateSmall((Small)value, diagnostics, context);
			case CrtpPackage.MEDIUM:
				return validateMedium((Medium)value, diagnostics, context);
			case CrtpPackage.LARGE:
				return validateLarge((Large)value, diagnostics, context);
			case CrtpPackage.MEM_SMALL:
				return validateMem_small((Mem_small)value, diagnostics, context);
			case CrtpPackage.MEM_MEDIUM:
				return validateMem_medium((Mem_medium)value, diagnostics, context);
			case CrtpPackage.MEM_LARGE:
				return validateMem_large((Mem_large)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmall(Small small, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(small, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(small, diagnostics, context);
		if (result || diagnostics != null) result &= validateSmall_appliesConstraint(small, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmall_appliesConstraint(Small small, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return small.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedium(Medium medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medium, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medium, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedium_appliesConstraint(medium, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedium_appliesConstraint(Medium medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medium.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLarge(Large large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(large, diagnostics, context);
		if (result || diagnostics != null) result &= validateLarge_appliesConstraint(large, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLarge_appliesConstraint(Large large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return large.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMem_small(Mem_small mem_small, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mem_small, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mem_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mem_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mem_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mem_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mem_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mem_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mem_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mem_small, diagnostics, context);
		if (result || diagnostics != null) result &= validateMem_small_appliesConstraint(mem_small, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Mem small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMem_small_appliesConstraint(Mem_small mem_small, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mem_small.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMem_medium(Mem_medium mem_medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mem_medium, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mem_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mem_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mem_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mem_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mem_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mem_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mem_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mem_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validateMem_medium_appliesConstraint(mem_medium, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Mem medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMem_medium_appliesConstraint(Mem_medium mem_medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mem_medium.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMem_large(Mem_large mem_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mem_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mem_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mem_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mem_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mem_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mem_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mem_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mem_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mem_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateMem_large_appliesConstraint(mem_large, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Mem large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMem_large_appliesConstraint(Mem_large mem_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mem_large.appliesConstraint(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CrtpValidator
