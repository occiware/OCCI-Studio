/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.core.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.core.OCCIPackage
 * @generated
 */
public class OCCIValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OCCIValidator INSTANCE = new OCCIValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.core";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attributes Name Unique' of 'Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CATEGORY__ATTRIBUTES_NAME_UNIQUE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Identity Unique' of 'Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CATEGORY__IDENTITY_UNIQUE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Scheme Ends With Sharp' of 'Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CATEGORY__SCHEME_ENDS_WITH_SHARP = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Action Term Unicity' of 'Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TYPE__ACTION_TERM_UNICITY = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Constraint Name Unique' of 'Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TYPE__CONSTRAINT_NAME_UNIQUE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attribute Type Must Be EEnum' of 'FSM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FSM__ATTRIBUTE_TYPE_MUST_BE_EENUM = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Contained Attribute' of 'FSM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FSM__CONTAINED_ATTRIBUTE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'State Literal Already Defined In FSM Attribute Type' of 'State'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATE__STATE_LITERAL_ALREADY_DEFINED_IN_FSM_ATTRIBUTE_TYPE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Contained Action Must Be Declared In The Appropriate Type' of 'Transition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSITION__CONTAINED_ACTION_MUST_BE_DECLARED_IN_THE_APPROPRIATE_TYPE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Default Value Must Be Instance Of Type' of 'Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATTRIBUTE__DEFAULT_VALUE_MUST_BE_INSTANCE_OF_TYPE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Cyclic Inheritance' of 'Kind'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KIND__NO_CYCLIC_INHERITANCE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attributes Name Not Already Defined In Parent' of 'Kind'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KIND__ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Reference Invariant' of 'Kind'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KIND__SOURCE_REFERENCE_INVARIANT = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Correct Scheme' of 'Kind'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KIND__CORRECT_SCHEME = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Reference Invariant' of 'Kind'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KIND__TARGET_REFERENCE_INVARIANT = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Entity Kind Is Root Parent' of 'Kind'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KIND__ENTITY_KIND_IS_ROOT_PARENT = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Contained Action' of 'Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTION__CONTAINED_ACTION = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Correct Scheme' of 'Action'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTION__CORRECT_SCHEME = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Correct Scheme' of 'Mixin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIXIN__CORRECT_SCHEME = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Cyclic Inheritance' of 'Mixin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIXIN__NO_CYCLIC_INHERITANCE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attributes Name Not Already Defined In Depends' of 'Mixin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIXIN__ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Attributes Name Unique' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__ATTRIBUTES_NAME_UNIQUE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Kind Compatible With One Applies Of Each Mixin' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Different Mixins' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__DIFFERENT_MIXINS = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id Unique' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__ID_UNIQUE = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Kind Is In Parent' of 'Resource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE__RESOURCE_KIND_IS_IN_PARENT = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Reference Invariant' of 'Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK__SOURCE_REFERENCE_INVARIANT = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Reference Invariant' of 'Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK__TARGET_REFERENCE_INVARIANT = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Link Kind Is In Parent' of 'Link'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINK__LINK_KIND_IS_IN_PARENT = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Kinds Scheme Valid' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__KINDS_SCHEME_VALID = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Kind Parent Local Or Imported' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__KIND_PARENT_LOCAL_OR_IMPORTED = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Mixins Scheme Valid' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__MIXINS_SCHEME_VALID = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Term Unicity' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__TERM_UNICITY = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Mixin Applies Local Or Imported' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__MIXIN_APPLIES_LOCAL_OR_IMPORTED = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Scheme Unique' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__SCHEME_UNIQUE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Mixin Depends Local Or Imported' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__MIXIN_DEPENDS_LOCAL_OR_IMPORTED = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Mixins Are Tags' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_MIXINS_ARE_TAGS = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Resources Links Targets In Configuration' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Resources Kinds In Use' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_RESOURCES_KINDS_IN_USE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Resources Links Mixins In Use' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_RESOURCES_LINKS_MIXINS_IN_USE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Resources Mixins In Use' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_RESOURCES_MIXINS_IN_USE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All Resources Links Kinds In Use' of 'Configuration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONFIGURATION__ALL_RESOURCES_LINKS_KINDS_IN_USE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Type Name Regex' of 'Data Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_TYPE__DATA_TYPE_NAME_REGEX = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Pattern Must Be Not Empty' of 'String Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRING_TYPE__PATTERN_MUST_BE_NOT_EMPTY = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Instance Class Name Must Have Value' of 'EObject Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EOBJECT_TYPE__INSTANCE_CLASS_NAME_MUST_HAVE_VALUE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Enumeration Literal Name Regex' of 'Enumeration Literal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENUMERATION_LITERAL__ENUMERATION_LITERAL_NAME_REGEX = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Different Container' of 'Record Field'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECORD_FIELD__TYPE_DIFFERENT_CONTAINER = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Record Field Name Regex' of 'Record Field'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECORD_FIELD__RECORD_FIELD_NAME_REGEX = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Container Must Be Record Type' of 'Record Field'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECORD_FIELD__CONTAINER_MUST_BE_RECORD_TYPE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type Different Container' of 'Array Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ARRAY_TYPE__TYPE_DIFFERENT_CONTAINER = 50;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 50;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCCIValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OCCIPackage.eINSTANCE;
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
			case OCCIPackage.ANNOTATED_ELEMENT:
				return validateAnnotatedElement((AnnotatedElement)value, diagnostics, context);
			case OCCIPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case OCCIPackage.CATEGORY:
				return validateCategory((Category)value, diagnostics, context);
			case OCCIPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case OCCIPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case OCCIPackage.FSM:
				return validateFSM((FSM)value, diagnostics, context);
			case OCCIPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case OCCIPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case OCCIPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case OCCIPackage.KIND:
				return validateKind((Kind)value, diagnostics, context);
			case OCCIPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case OCCIPackage.MIXIN:
				return validateMixin((Mixin)value, diagnostics, context);
			case OCCIPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case OCCIPackage.MIXIN_BASE:
				return validateMixinBase((MixinBase)value, diagnostics, context);
			case OCCIPackage.ATTRIBUTE_STATE:
				return validateAttributeState((AttributeState)value, diagnostics, context);
			case OCCIPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case OCCIPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case OCCIPackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case OCCIPackage.CONFIGURATION:
				return validateConfiguration((Configuration)value, diagnostics, context);
			case OCCIPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case OCCIPackage.BASIC_TYPE:
				return validateBasicType((BasicType)value, diagnostics, context);
			case OCCIPackage.STRING_TYPE:
				return validateStringType((StringType)value, diagnostics, context);
			case OCCIPackage.EOBJECT_TYPE:
				return validateEObjectType((EObjectType)value, diagnostics, context);
			case OCCIPackage.BOOLEAN_TYPE:
				return validateBooleanType((BooleanType)value, diagnostics, context);
			case OCCIPackage.NUMERIC_TYPE:
				return validateNumericType((NumericType)value, diagnostics, context);
			case OCCIPackage.ENUMERATION_TYPE:
				return validateEnumerationType((EnumerationType)value, diagnostics, context);
			case OCCIPackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case OCCIPackage.RECORD_TYPE:
				return validateRecordType((RecordType)value, diagnostics, context);
			case OCCIPackage.RECORD_FIELD:
				return validateRecordField((RecordField)value, diagnostics, context);
			case OCCIPackage.ARRAY_TYPE:
				return validateArrayType((ArrayType)value, diagnostics, context);
			case OCCIPackage.NUMERIC_TYPE_ENUM:
				return validateNumericTypeEnum((NumericTypeEnum)value, diagnostics, context);
			case OCCIPackage.URI:
				return validateURI((String)value, diagnostics, context);
			case OCCIPackage.OCL:
				return validateOCL((String)value, diagnostics, context);
			case OCCIPackage.STRING:
				return validateString((String)value, diagnostics, context);
			case OCCIPackage.INTEGER:
				return validateInteger((Integer)value, diagnostics, context);
			case OCCIPackage.BOOLEAN:
				return validateBoolean((Boolean)value, diagnostics, context);
			case OCCIPackage.ATTRIBUTE_NAME:
				return validateAttributeName((String)value, diagnostics, context);
			case OCCIPackage.NAME:
				return validateName((String)value, diagnostics, context);
			case OCCIPackage.SCHEME:
				return validateScheme((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotatedElement(AnnotatedElement annotatedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotatedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(category, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(category, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SchemeEndsWithSharp constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_SchemeEndsWithSharp(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return category.SchemeEndsWithSharp(diagnostics, context);
	}

	/**
	 * Validates the AttributesNameUnique constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_AttributesNameUnique(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return category.AttributesNameUnique(diagnostics, context);
	}

	/**
	 * Validates the IdentityUnique constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_IdentityUnique(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return category.IdentityUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(type, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ConstraintNameUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ActionTermUnicity(type, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConstraintNameUnique constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType_ConstraintNameUnique(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return type.ConstraintNameUnique(diagnostics, context);
	}

	/**
	 * Validates the ActionTermUnicity constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType_ActionTermUnicity(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return type.ActionTermUnicity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFSM(FSM fsm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fsm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fsm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fsm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fsm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fsm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fsm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fsm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fsm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fsm, diagnostics, context);
		if (result || diagnostics != null) result &= validateFSM_containedAttribute(fsm, diagnostics, context);
		if (result || diagnostics != null) result &= validateFSM_AttributeTypeMustBeEEnum(fsm, diagnostics, context);
		return result;
	}

	/**
	 * Validates the containedAttribute constraint of '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFSM_containedAttribute(FSM fsm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fsm.containedAttribute(diagnostics, context);
	}

	/**
	 * Validates the AttributeTypeMustBeEEnum constraint of '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFSM_AttributeTypeMustBeEEnum(FSM fsm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fsm.AttributeTypeMustBeEEnum(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_StateLiteralAlreadyDefinedInFSMAttributeType(state, diagnostics, context);
		return result;
	}

	/**
	 * Validates the StateLiteralAlreadyDefinedInFSMAttributeType constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_StateLiteralAlreadyDefinedInFSMAttributeType(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return state.StateLiteralAlreadyDefinedInFSMAttributeType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_containedActionMustBeDeclaredInTheAppropriateType(transition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the containedActionMustBeDeclaredInTheAppropriateType constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_containedActionMustBeDeclaredInTheAppropriateType(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transition.containedActionMustBeDeclaredInTheAppropriateType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_DefaultValueMustBeInstanceOfType(attribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DefaultValueMustBeInstanceOfType constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_DefaultValueMustBeInstanceOfType(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return attribute.DefaultValueMustBeInstanceOfType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(kind, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ConstraintNameUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ActionTermUnicity(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_sourceReferenceInvariant(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_CorrectScheme(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_targetReferenceInvariant(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_NoCyclicInheritance(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_EntityKindIsRootParent(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_AttributesNameNotAlreadyDefinedInParent(kind, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sourceReferenceInvariant constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_sourceReferenceInvariant(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kind.sourceReferenceInvariant(diagnostics, context);
	}

	/**
	 * Validates the EntityKindIsRootParent constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_EntityKindIsRootParent(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kind.EntityKindIsRootParent(diagnostics, context);
	}

	/**
	 * Validates the NoCyclicInheritance constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_NoCyclicInheritance(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kind.NoCyclicInheritance(diagnostics, context);
	}

	/**
	 * Validates the AttributesNameNotAlreadyDefinedInParent constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_AttributesNameNotAlreadyDefinedInParent(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kind.AttributesNameNotAlreadyDefinedInParent(diagnostics, context);
	}

	/**
	 * Validates the CorrectScheme constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_CorrectScheme(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kind.CorrectScheme(diagnostics, context);
	}

	/**
	 * Validates the targetReferenceInvariant constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_targetReferenceInvariant(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kind.targetReferenceInvariant(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_CorrectScheme(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_containedAction(action, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CorrectScheme constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_CorrectScheme(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return action.CorrectScheme(diagnostics, context);
	}

	/**
	 * Validates the containedAction constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_containedAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return action.containedAction(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mixin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ConstraintNameUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ActionTermUnicity(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_AttributesNameNotAlreadyDefinedInDepends(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_CorrectScheme(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_NoCyclicInheritance(mixin, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AttributesNameNotAlreadyDefinedInDepends constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_AttributesNameNotAlreadyDefinedInDepends(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mixin.AttributesNameNotAlreadyDefinedInDepends(diagnostics, context);
	}

	/**
	 * Validates the CorrectScheme constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_CorrectScheme(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mixin.CorrectScheme(diagnostics, context);
	}

	/**
	 * Validates the NoCyclicInheritance constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_NoCyclicInheritance(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mixin.NoCyclicInheritance(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_DifferentMixins(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_IdUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_KindCompatibleWithOneAppliesOfEachMixin(entity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DifferentMixins constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_DifferentMixins(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entity.DifferentMixins(diagnostics, context);
	}

	/**
	 * Validates the IdUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_IdUnique(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entity.IdUnique(diagnostics, context);
	}

	/**
	 * Validates the AttributesNameUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_AttributesNameUnique(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entity.AttributesNameUnique(diagnostics, context);
	}

	/**
	 * Validates the KindCompatibleWithOneAppliesOfEachMixin constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_KindCompatibleWithOneAppliesOfEachMixin(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entity.KindCompatibleWithOneAppliesOfEachMixin(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixinBase(MixinBase mixinBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mixinBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeState(AttributeState attributeState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_DifferentMixins(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_IdUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_KindCompatibleWithOneAppliesOfEachMixin(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateResource_ResourceKindIsInParent(resource, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResourceKindIsInParent constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_ResourceKindIsInParent(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resource.ResourceKindIsInParent(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(link, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_DifferentMixins(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_IdUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_KindCompatibleWithOneAppliesOfEachMixin(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateLink_LinkKindIsInParent(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateLink_sourceReferenceInvariant(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateLink_targetReferenceInvariant(link, diagnostics, context);
		return result;
	}

	/**
	 * Validates the LinkKindIsInParent constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_LinkKindIsInParent(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return link.LinkKindIsInParent(diagnostics, context);
	}

	/**
	 * Validates the sourceReferenceInvariant constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_sourceReferenceInvariant(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return link.sourceReferenceInvariant(diagnostics, context);
	}

	/**
	 * Validates the targetReferenceInvariant constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_targetReferenceInvariant(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return link.targetReferenceInvariant(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_MixinDependsLocalOrImported(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_KindsSchemeValid(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_KindParentLocalOrImported(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_MixinsSchemeValid(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_TermUnicity(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_MixinAppliesLocalOrImported(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_SchemeUnique(extension, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MixinDependsLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinDependsLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.MixinDependsLocalOrImported(diagnostics, context);
	}

	/**
	 * Validates the KindsSchemeValid constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_KindsSchemeValid(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.KindsSchemeValid(diagnostics, context);
	}

	/**
	 * Validates the KindParentLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_KindParentLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.KindParentLocalOrImported(diagnostics, context);
	}

	/**
	 * Validates the MixinsSchemeValid constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinsSchemeValid(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.MixinsSchemeValid(diagnostics, context);
	}

	/**
	 * Validates the TermUnicity constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_TermUnicity(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.TermUnicity(diagnostics, context);
	}

	/**
	 * Validates the MixinAppliesLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinAppliesLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.MixinAppliesLocalOrImported(diagnostics, context);
	}

	/**
	 * Validates the SchemeUnique constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_SchemeUnique(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extension.SchemeUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configuration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesLinksKindsInUse(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllMixinsAreTags(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesLinksTargetsInConfiguration(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesKindsInUse(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesLinksMixinsInUse(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesMixinsInUse(configuration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllResourcesLinksKindsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesLinksKindsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.AllResourcesLinksKindsInUse(diagnostics, context);
	}

	/**
	 * Validates the AllMixinsAreTags constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllMixinsAreTags(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.AllMixinsAreTags(diagnostics, context);
	}

	/**
	 * Validates the AllResourcesLinksTargetsInConfiguration constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesLinksTargetsInConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.AllResourcesLinksTargetsInConfiguration(diagnostics, context);
	}

	/**
	 * Validates the AllResourcesKindsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesKindsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.AllResourcesKindsInUse(diagnostics, context);
	}

	/**
	 * Validates the AllResourcesLinksMixinsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesLinksMixinsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.AllResourcesLinksMixinsInUse(diagnostics, context);
	}

	/**
	 * Validates the AllResourcesMixinsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesMixinsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return configuration.AllResourcesMixinsInUse(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataType_DataTypeNameRegex(dataType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DataTypeNameRegex constraint of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType_DataTypeNameRegex(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataType.DataTypeNameRegex(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicType(BasicType basicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(basicType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(basicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(basicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(basicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(basicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(basicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(basicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(basicType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(basicType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataType_DataTypeNameRegex(basicType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stringType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataType_DataTypeNameRegex(stringType, diagnostics, context);
		if (result || diagnostics != null) result &= validateStringType_PatternMustBeNotEmpty(stringType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PatternMustBeNotEmpty constraint of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType_PatternMustBeNotEmpty(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stringType.PatternMustBeNotEmpty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEObjectType(EObjectType eObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eObjectType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eObjectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eObjectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eObjectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eObjectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eObjectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eObjectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eObjectType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eObjectType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataType_DataTypeNameRegex(eObjectType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEObjectType_instanceClassNameMustHaveValue(eObjectType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the instanceClassNameMustHaveValue constraint of '<em>EObject Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEObjectType_instanceClassNameMustHaveValue(EObjectType eObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eObjectType.instanceClassNameMustHaveValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanType(BooleanType booleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(booleanType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataType_DataTypeNameRegex(booleanType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericType(NumericType numericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numericType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(numericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(numericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(numericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(numericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(numericType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numericType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataType_DataTypeNameRegex(numericType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationType(EnumerationType enumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataType_DataTypeNameRegex(enumerationType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumerationLiteral_EnumerationLiteralNameRegex(enumerationLiteral, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EnumerationLiteralNameRegex constraint of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral_EnumerationLiteralNameRegex(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return enumerationLiteral.EnumerationLiteralNameRegex(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordType(RecordType recordType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recordType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(recordType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recordType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recordType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recordType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(recordType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(recordType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(recordType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recordType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataType_DataTypeNameRegex(recordType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordField(RecordField recordField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recordField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(recordField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recordField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recordField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recordField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(recordField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(recordField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(recordField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recordField, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_DefaultValueMustBeInstanceOfType(recordField, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecordField_ContainerMustBeRecordType(recordField, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecordField_TypeDifferentContainer(recordField, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecordField_RecordFieldNameRegex(recordField, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ContainerMustBeRecordType constraint of '<em>Record Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordField_ContainerMustBeRecordType(RecordField recordField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return recordField.ContainerMustBeRecordType(diagnostics, context);
	}

	/**
	 * Validates the TypeDifferentContainer constraint of '<em>Record Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordField_TypeDifferentContainer(RecordField recordField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return recordField.TypeDifferentContainer(diagnostics, context);
	}

	/**
	 * Validates the RecordFieldNameRegex constraint of '<em>Record Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordField_RecordFieldNameRegex(RecordField recordField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return recordField.RecordFieldNameRegex(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayType(ArrayType arrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arrayType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(arrayType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(arrayType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(arrayType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(arrayType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(arrayType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(arrayType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(arrayType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(arrayType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataType_DataTypeNameRegex(arrayType, diagnostics, context);
		if (result || diagnostics != null) result &= validateArrayType_TypeDifferentContainer(arrayType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TypeDifferentContainer constraint of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayType_TypeDifferentContainer(ArrayType arrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return arrayType.TypeDifferentContainer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericTypeEnum(NumericTypeEnum numericTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateURI_Pattern(uri, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateURI_Pattern
	 */
	public static final  PatternMatcher [][] URI__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z][A-Za-z0-9+-\\.]*:(//(([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:]|%[0-9A-Fa-f]{2})*@)?(\\[(((([0-9A-Fa-f]{1,4}:){6}|::([0-9A-Fa-f]{1,4}:){5}|([0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){4}|(([0-9A-Fa-f]{1,4}:){0,1}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){3}|(([0-9A-Fa-f]{1,4}:){0,2}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){2}|(([0-9A-Fa-f]{1,4}:){0,3}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:)|(([0-9A-Fa-f]{1,4}:){0,4}[0-9A-Fa-f]{1,4})?::)([0-9A-Fa-f]{1,4}:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]))|(([0-9A-Fa-f]{1,4}:){0,5}[0-9A-Fa-f]{1,4})?::[0-9A-Fa-f]{1,4}|(([0-9A-Fa-f]{1,4}:){0,6}[0-9A-Fa-f]{1,4})?::)|[Vv][0-9A-Fa-f]+\\.[A-Za-z0-9\\-_~\\.!$&\'()*+,;=:]+)\\]|((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])|([A-Za-z0-9\\-_~\\.!$&\'()*+,;=]|%[0-9A-Fa-f]{2})*)(:[0-9]*)?(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*|/(([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})+(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*)?|([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})+(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*|.{0})(\\?([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@/?]|%[0-9A-Fa-f]{2})*)?(\\#([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@/?]|%[0-9A-Fa-f]{2})*)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI_Pattern(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OCCIPackage.Literals.URI, uri, URI__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCL(String ocl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeName(String attributeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAttributeName_Pattern(attributeName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAttributeName_Pattern
	 */
	public static final  PatternMatcher [][] ATTRIBUTE_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Attribute Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeName_Pattern(String attributeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OCCIPackage.Literals.ATTRIBUTE_NAME, attributeName, ATTRIBUTE_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName(String name, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateName_Pattern(name, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateName_Pattern
	 */
	public static final  PatternMatcher [][] NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z][a-zA-Z0-9_-]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateName_Pattern(String name, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OCCIPackage.Literals.NAME, name, NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheme(String scheme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScheme_Pattern(scheme, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScheme_Pattern
	 */
	public static final  PatternMatcher [][] SCHEME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z][A-Za-z0-9+-\\.]*:(//(([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:]|%[0-9A-Fa-f]{2})*@)?(\\[(((([0-9A-Fa-f]{1,4}:){6}|::([0-9A-Fa-f]{1,4}:){5}|([0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){4}|(([0-9A-Fa-f]{1,4}:){0,1}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){3}|(([0-9A-Fa-f]{1,4}:){0,2}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){2}|(([0-9A-Fa-f]{1,4}:){0,3}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:)|(([0-9A-Fa-f]{1,4}:){0,4}[0-9A-Fa-f]{1,4})?::)([0-9A-Fa-f]{1,4}:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]))|(([0-9A-Fa-f]{1,4}:){0,5}[0-9A-Fa-f]{1,4})?::[0-9A-Fa-f]{1,4}|(([0-9A-Fa-f]{1,4}:){0,6}[0-9A-Fa-f]{1,4})?::)|[Vv][0-9A-Fa-f]+\\.[A-Za-z0-9\\-_~\\.!$&\'()*+,;=:]+)\\]|((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])|([A-Za-z0-9\\-_~\\.!$&\'()*+,;=]|%[0-9A-Fa-f]{2})*)(:[0-9]*)?(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*|/(([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})+(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*)?|([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})+(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*|.{0})(\\#)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheme_Pattern(String scheme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OCCIPackage.Literals.SCHEME, scheme, SCHEME__PATTERN__VALUES, diagnostics, context);
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

} //OCCIValidator
