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
package org.eclipse.cmf.occi.platform.util;

import java.net.URI;
import java.net.URL;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.platform.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.platform.PlatformPackage
 * @generated
 */
public class PlatformValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PlatformValidator INSTANCE = new PlatformValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.platform";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'App tpl'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APP_TPL__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Res tpl'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RES_TPL__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Database'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATABASE__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Databaselink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATABASELINK__APPLIES_CONSTRAINT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

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
	protected OCCIValidator occiValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PlatformPackage.eINSTANCE;
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
			case PlatformPackage.APPLICATION:
				return validateApplication((Application)value, diagnostics, context);
			case PlatformPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case PlatformPackage.COMPONENTLINK:
				return validateComponentlink((Componentlink)value, diagnostics, context);
			case PlatformPackage.APP_TPL:
				return validateApp_tpl((App_tpl)value, diagnostics, context);
			case PlatformPackage.RES_TPL:
				return validateRes_tpl((Res_tpl)value, diagnostics, context);
			case PlatformPackage.DATABASE:
				return validateDatabase((Database)value, diagnostics, context);
			case PlatformPackage.DATABASELINK:
				return validateDatabaselink((Databaselink)value, diagnostics, context);
			case PlatformPackage.STATUS:
				return validateStatus((Status)value, diagnostics, context);
			case PlatformPackage.URL:
				return validateURL((URL)value, diagnostics, context);
			case PlatformPackage.URI:
				return validateURI((URI)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(application, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(application, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(application, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(component, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(component, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentlink(Componentlink componentlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(componentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(componentlink, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApp_tpl(App_tpl app_tpl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(app_tpl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(app_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(app_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(app_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(app_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(app_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(app_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(app_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(app_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validateApp_tpl_appliesConstraint(app_tpl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>App tpl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApp_tpl_appliesConstraint(App_tpl app_tpl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return app_tpl.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRes_tpl(Res_tpl res_tpl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(res_tpl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(res_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(res_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(res_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(res_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(res_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(res_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(res_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(res_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validateRes_tpl_appliesConstraint(res_tpl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Res tpl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRes_tpl_appliesConstraint(Res_tpl res_tpl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return res_tpl.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabase(Database database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(database, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(database, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(database, diagnostics, context);
		if (result || diagnostics != null) result &= validateDatabase_appliesConstraint(database, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabase_appliesConstraint(Database database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return database.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaselink(Databaselink databaselink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(databaselink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(databaselink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(databaselink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(databaselink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(databaselink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(databaselink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(databaselink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(databaselink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(databaselink, diagnostics, context);
		if (result || diagnostics != null) result &= validateDatabaselink_appliesConstraint(databaselink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Databaselink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaselink_appliesConstraint(Databaselink databaselink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return databaselink.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURL(URL url, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI(URI uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //PlatformValidator
