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
package org.eclipse.cmf.occi.monitoring.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.monitoring.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage
 * @generated
 */
public class MonitoringValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MonitoringValidator INSTANCE = new MonitoringValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.monitoring";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Metric'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int METRIC__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Aggregator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGGREGATOR__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Publisher'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PUBLISHER__APPLIES_CONSTRAINT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

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
	public MonitoringValidator() {
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
	  return MonitoringPackage.eINSTANCE;
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
			case MonitoringPackage.SENSOR:
				return validateSensor((Sensor)value, diagnostics, context);
			case MonitoringPackage.COLLECTOR:
				return validateCollector((Collector)value, diagnostics, context);
			case MonitoringPackage.METRIC:
				return validateMetric((Metric)value, diagnostics, context);
			case MonitoringPackage.AGGREGATOR:
				return validateAggregator((Aggregator)value, diagnostics, context);
			case MonitoringPackage.PUBLISHER:
				return validatePublisher((Publisher)value, diagnostics, context);
			case MonitoringPackage.SECOND:
				return validateSecond((Integer)value, diagnostics, context);
			case MonitoringPackage.DATE_TIME:
				return validateDateTime((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sensor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(sensor, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(sensor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollector(Collector collector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(collector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(collector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(collector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(collector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(collector, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(collector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetric(Metric metric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(metric, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetric_appliesConstraint(metric, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetric_appliesConstraint(Metric metric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return metric.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregator(Aggregator aggregator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aggregator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aggregator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aggregator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aggregator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aggregator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aggregator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aggregator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aggregator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aggregator, diagnostics, context);
		if (result || diagnostics != null) result &= validateAggregator_appliesConstraint(aggregator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Aggregator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregator_appliesConstraint(Aggregator aggregator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return aggregator.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisher(Publisher publisher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(publisher, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(publisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(publisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(publisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(publisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(publisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(publisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(publisher, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(publisher, diagnostics, context);
		if (result || diagnostics != null) result &= validatePublisher_appliesConstraint(publisher, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisher_appliesConstraint(Publisher publisher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return publisher.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecond(Integer second, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime(String dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTime_Pattern(dateTime, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDateTime_Pattern
	 */
	public static final  PatternMatcher [][] DATE_TIME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("^(\\d{4}((-)?(0[1-9]|1[0-2])((-)?(0[1-9]|[1-2][0-9]|3[0-1])(T(24:00(:00(\\.[0]+)?)?|(([0-1][0-9]|2[0-3])(:)[0-5][0-9])((:)[0-5][0-9](\\.[\\d]+)?)?)((\\+|-)(14:00|(0[0-9]|1[0-3])(:)[0-5][0-9])|Z))?)?)?)$")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTime_Pattern(String dateTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(MonitoringPackage.Literals.DATE_TIME, dateTime, DATE_TIME__PATTERN__VALUES, diagnostics, context);
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

} //MonitoringValidator
