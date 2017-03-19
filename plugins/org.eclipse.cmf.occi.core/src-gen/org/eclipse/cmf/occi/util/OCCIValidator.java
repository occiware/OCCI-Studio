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
package org.eclipse.cmf.occi.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.*;

import org.eclipse.emf.common.util.Diagnostic;
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
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

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
			case OCCIPackage.BOOLEAN_TYPE:
				return validateBooleanType((BooleanType)value, diagnostics, context);
			case OCCIPackage.NUMERIC_TYPE:
				return validateNumericType((NumericType)value, diagnostics, context);
			case OCCIPackage.INTEGER_TYPE:
				return validateIntegerType((IntegerType)value, diagnostics, context);
			case OCCIPackage.FLOAT_TYPE:
				return validateFloatType((FloatType)value, diagnostics, context);
			case OCCIPackage.ENUMERATION_TYPE:
				return validateEnumerationType((EnumerationType)value, diagnostics, context);
			case OCCIPackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case OCCIPackage.RECORD_TYPE:
				return validateRecordType((RecordType)value, diagnostics, context);
			case OCCIPackage.RECORD_FIELD_DECLARATION:
				return validateRecordFieldDeclaration((RecordFieldDeclaration)value, diagnostics, context);
			case OCCIPackage.ARRAY_TYPE:
				return validateArrayType((ArrayType)value, diagnostics, context);
			case OCCIPackage.TYPE_ANNOTATION:
				return validateTypeAnnotation((TypeAnnotation)value, diagnostics, context);
			case OCCIPackage.TYPE_ANNOTATION_KEY:
				return validateTypeAnnotationKey((TypeAnnotationKey)value, diagnostics, context);
			case OCCIPackage.URI:
				return validateURI((String)value, diagnostics, context);
			case OCCIPackage.OCL:
				return validateOCL((String)value, diagnostics, context);
			case OCCIPackage.STRING:
				return validateString((String)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(category, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IdentityUnique constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CATEGORY__IDENTITY_UNIQUE__EEXPRESSION = "Category.allInstances()->isUnique(scheme + term)";

	/**
	 * Validates the IdentityUnique constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_IdentityUnique(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.CATEGORY,
				 category,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IdentityUnique",
				 CATEGORY__IDENTITY_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SchemeEndsWithSharp constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CATEGORY__SCHEME_ENDS_WITH_SHARP__EEXPRESSION = "scheme.substring(scheme.size(), scheme.size()) = '#'";

	/**
	 * Validates the SchemeEndsWithSharp constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_SchemeEndsWithSharp(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.CATEGORY,
				 category,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SchemeEndsWithSharp",
				 CATEGORY__SCHEME_ENDS_WITH_SHARP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AttributesNameUnique constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CATEGORY__ATTRIBUTES_NAME_UNIQUE__EEXPRESSION = "attributes->isUnique(name)";

	/**
	 * Validates the AttributesNameUnique constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_AttributesNameUnique(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.CATEGORY,
				 category,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AttributesNameUnique",
				 CATEGORY__ATTRIBUTES_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ActionTermUnicity(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ConstraintNameUnique(type, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ActionTermUnicity constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TYPE__ACTION_TERM_UNICITY__EEXPRESSION = "actions->isUnique(term)";

	/**
	 * Validates the ActionTermUnicity constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType_ActionTermUnicity(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.TYPE,
				 type,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ActionTermUnicity",
				 TYPE__ACTION_TERM_UNICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ConstraintNameUnique constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TYPE__CONSTRAINT_NAME_UNIQUE__EEXPRESSION = "constraints->isUnique(name)";

	/**
	 * Validates the ConstraintNameUnique constraint of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType_ConstraintNameUnique(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.TYPE,
				 type,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConstraintNameUnique",
				 TYPE__CONSTRAINT_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateFSM_AttributeTypeMustBeEEnum(fsm, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AttributeTypeMustBeEEnum constraint of '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FSM__ATTRIBUTE_TYPE_MUST_BE_EENUM__EEXPRESSION = "attribute.type.oclIsTypeOf(EnumerationType)";

	/**
	 * Validates the AttributeTypeMustBeEEnum constraint of '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFSM_AttributeTypeMustBeEEnum(FSM fsm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.FSM,
				 fsm,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AttributeTypeMustBeEEnum",
				 FSM__ATTRIBUTE_TYPE_MUST_BE_EENUM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
	 * The cached validation expression for the StateLiteralAlreadyDefinedInFSMAttributeType constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__STATE_LITERAL_ALREADY_DEFINED_IN_FSM_ATTRIBUTE_TYPE__EEXPRESSION = "owningFSM.attribute.type=self.literal.enumerationType";

	/**
	 * Validates the StateLiteralAlreadyDefinedInFSMAttributeType constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_StateLiteralAlreadyDefinedInFSMAttributeType(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "StateLiteralAlreadyDefinedInFSMAttributeType",
				 STATE__STATE_LITERAL_ALREADY_DEFINED_IN_FSM_ATTRIBUTE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ActionTermUnicity(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ConstraintNameUnique(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_CorrectScheme(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_NoCyclicInheritance(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_EntityKindIsRootParent(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_AttributesNameNotAlreadyDefinedInParent(kind, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CorrectScheme constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KIND__CORRECT_SCHEME__EEXPRESSION = "scheme = self.oclContainer().oclAsType(Extension).scheme";

	/**
	 * Validates the CorrectScheme constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_CorrectScheme(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.KIND,
				 kind,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CorrectScheme",
				 KIND__CORRECT_SCHEME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoCyclicInheritance constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KIND__NO_CYCLIC_INHERITANCE__EEXPRESSION = "parent->closure(parent)->excludes(self)";

	/**
	 * Validates the NoCyclicInheritance constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_NoCyclicInheritance(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.KIND,
				 kind,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoCyclicInheritance",
				 KIND__NO_CYCLIC_INHERITANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the EntityKindIsRootParent constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KIND__ENTITY_KIND_IS_ROOT_PARENT__EEXPRESSION = "self->closure(parent)->exists(k |\n" +
		"\t\t\t\t\tk.term = 'entity' and k.scheme = 'http://schemas.ogf.org/occi/core#' and k.parent = null)";

	/**
	 * Validates the EntityKindIsRootParent constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_EntityKindIsRootParent(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.KIND,
				 kind,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EntityKindIsRootParent",
				 KIND__ENTITY_KIND_IS_ROOT_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AttributesNameNotAlreadyDefinedInParent constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KIND__ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT__EEXPRESSION = "attributes.name->excludesAll(parent->closure(parent).attributes.name)";

	/**
	 * Validates the AttributesNameNotAlreadyDefinedInParent constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_AttributesNameNotAlreadyDefinedInParent(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.KIND,
				 kind,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AttributesNameNotAlreadyDefinedInParent",
				 KIND__ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateAction_CorrectScheme(action, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CorrectScheme constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTION__CORRECT_SCHEME__EEXPRESSION = "let category = oclContainer().oclAsType(Category)\n" +
		"\t\t\tin scheme = category.scheme.substring(1, category.scheme.size() - 1) + '/' + category.term + '/action#'";

	/**
	 * Validates the CorrectScheme constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_CorrectScheme(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.ACTION,
				 action,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CorrectScheme",
				 ACTION__CORRECT_SCHEME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateCategory_IdentityUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_SchemeEndsWithSharp(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_AttributesNameUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ActionTermUnicity(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateType_ConstraintNameUnique(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_CorrectScheme(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_NoCyclicInheritance(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_AttributesNameNotAlreadyDefinedInDepends(mixin, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CorrectScheme constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MIXIN__CORRECT_SCHEME__EEXPRESSION = "\n" +
		"\n" +
		"\t\t\t/* Previously let ownerScheme = owner.oclAsType(Extension).scheme in scheme.substring(1,ownerScheme.size()-1) = ownerScheme.substring(1,ownerScheme.size()-1) */\n" +
		"\t\t\tlet owner = self.oclContainer()\n" +
		"\t\t\tin if owner.oclIsTypeOf(Extension)\n" +
		"\t\t\t\tthen\n" +
		"\t\t\tlet ownerScheme = owner.oclAsType(Extension).scheme\n" +
		"\t\tin scheme.substring(1, ownerScheme.size() - 1) = ownerScheme.substring(1, ownerScheme.size() - 1) else true\n" +
		"\t\t\tendif";

	/**
	 * Validates the CorrectScheme constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_CorrectScheme(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.MIXIN,
				 mixin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CorrectScheme",
				 MIXIN__CORRECT_SCHEME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoCyclicInheritance constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MIXIN__NO_CYCLIC_INHERITANCE__EEXPRESSION = "depends->closure(depends)->excludes(self)";

	/**
	 * Validates the NoCyclicInheritance constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_NoCyclicInheritance(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.MIXIN,
				 mixin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoCyclicInheritance",
				 MIXIN__NO_CYCLIC_INHERITANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AttributesNameNotAlreadyDefinedInDepends constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MIXIN__ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS__EEXPRESSION = "attributes.name->excludesAll(depends->closure(depends).attributes.name)";

	/**
	 * Validates the AttributesNameNotAlreadyDefinedInDepends constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_AttributesNameNotAlreadyDefinedInDepends(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.MIXIN,
				 mixin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AttributesNameNotAlreadyDefinedInDepends",
				 MIXIN__ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateEntity_IdUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_KindCompatibleWithOneAppliesOfEachMixin(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IdUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__ID_UNIQUE__EEXPRESSION = "Entity.allInstances()->isUnique(id)";

	/**
	 * Validates the IdUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_IdUnique(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IdUnique",
				 ENTITY__ID_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AttributesNameUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__ATTRIBUTES_NAME_UNIQUE__EEXPRESSION = "attributes->isUnique(name)";

	/**
	 * Validates the AttributesNameUnique constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_AttributesNameUnique(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AttributesNameUnique",
				 ENTITY__ATTRIBUTES_NAME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the KindCompatibleWithOneAppliesOfEachMixin constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__EEXPRESSION = "parts.mixin->forAll(m |\n" +
		"\t\t\t\tm.applies->notEmpty() implies m.applies->exists(k | kind->closure(parent)->includes(k)))";

	/**
	 * Validates the KindCompatibleWithOneAppliesOfEachMixin constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_KindCompatibleWithOneAppliesOfEachMixin(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "KindCompatibleWithOneAppliesOfEachMixin",
				 ENTITY__KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateEntity_IdUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_KindCompatibleWithOneAppliesOfEachMixin(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateResource_ResourceKindIsInParent(resource, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ResourceKindIsInParent constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE__RESOURCE_KIND_IS_IN_PARENT__EEXPRESSION = "kind->closure(parent)->exists(k |\n" +
		"\t\t\t\tk.term = 'resource' and k.scheme = 'http://schemas.ogf.org/occi/core#')";

	/**
	 * Validates the ResourceKindIsInParent constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_ResourceKindIsInParent(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.RESOURCE,
				 resource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ResourceKindIsInParent",
				 RESOURCE__RESOURCE_KIND_IS_IN_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateEntity_IdUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_AttributesNameUnique(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_KindCompatibleWithOneAppliesOfEachMixin(link, diagnostics, context);
		if (result || diagnostics != null) result &= validateLink_LinkKindIsInParent(link, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LinkKindIsInParent constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK__LINK_KIND_IS_IN_PARENT__EEXPRESSION = "kind->closure(parent)->exists(k |\n" +
		"\t\t\t\tk.term = 'link' and k.scheme = 'http://schemas.ogf.org/occi/core#')";

	/**
	 * Validates the LinkKindIsInParent constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_LinkKindIsInParent(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.LINK,
				 link,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "LinkKindIsInParent",
				 LINK__LINK_KIND_IS_IN_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateExtension_SchemeUnique(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_KindsSchemeValid(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_MixinsSchemeValid(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_TermUnicity(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_KindParentLocalOrImported(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_MixinDependsLocalOrImported(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_MixinAppliesLocalOrImported(extension, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SchemeUnique constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION__SCHEME_UNIQUE__EEXPRESSION = "Extension.allInstances()->isUnique(scheme)";

	/**
	 * Validates the SchemeUnique constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_SchemeUnique(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.EXTENSION,
				 extension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SchemeUnique",
				 EXTENSION__SCHEME_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the KindsSchemeValid constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION__KINDS_SCHEME_VALID__EEXPRESSION = "kinds->forAll(k | k.scheme = self.scheme)";

	/**
	 * Validates the KindsSchemeValid constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_KindsSchemeValid(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.EXTENSION,
				 extension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "KindsSchemeValid",
				 EXTENSION__KINDS_SCHEME_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MixinsSchemeValid constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION__MIXINS_SCHEME_VALID__EEXPRESSION = "mixins->forAll(m | m.scheme.substring(1, scheme.size() - 1) = scheme.substring(1,\n" +
		"\t\t\t\t\tscheme.size() - 1))";

	/**
	 * Validates the MixinsSchemeValid constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinsSchemeValid(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.EXTENSION,
				 extension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MixinsSchemeValid",
				 EXTENSION__MIXINS_SCHEME_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the TermUnicity constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION__TERM_UNICITY__EEXPRESSION = "kinds.term->intersection(mixins.term)->isEmpty()";

	/**
	 * Validates the TermUnicity constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_TermUnicity(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.EXTENSION,
				 extension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "TermUnicity",
				 EXTENSION__TERM_UNICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the KindParentLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION__KIND_PARENT_LOCAL_OR_IMPORTED__EEXPRESSION = "kinds->forAll(parent <> null implies let parentExtension = parent.oclContainer()\n" +
		"\t\t\tin parentExtension = self or import->includes(parentExtension))";

	/**
	 * Validates the KindParentLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_KindParentLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.EXTENSION,
				 extension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "KindParentLocalOrImported",
				 EXTENSION__KIND_PARENT_LOCAL_OR_IMPORTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MixinDependsLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION__MIXIN_DEPENDS_LOCAL_OR_IMPORTED__EEXPRESSION = "mixins.depends->forAll(let extension = oclContainer()\n" +
		"\t\t\tin extension = self or import->includes(extension))";

	/**
	 * Validates the MixinDependsLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinDependsLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.EXTENSION,
				 extension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MixinDependsLocalOrImported",
				 EXTENSION__MIXIN_DEPENDS_LOCAL_OR_IMPORTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MixinAppliesLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION__MIXIN_APPLIES_LOCAL_OR_IMPORTED__EEXPRESSION = "mixins.applies->forAll(let extension = oclContainer()\n" +
		"\t\t\tin extension = self or import->includes(extension))";

	/**
	 * Validates the MixinAppliesLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinAppliesLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.EXTENSION,
				 extension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MixinAppliesLocalOrImported",
				 EXTENSION__MIXIN_APPLIES_LOCAL_OR_IMPORTED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesKindsInUse(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesMixinsInUse(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesLinksKindsInUse(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesLinksMixinsInUse(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllResourcesLinksTargetsInConfiguration(configuration, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfiguration_AllMixinsAreTags(configuration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AllResourcesKindsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION__ALL_RESOURCES_KINDS_IN_USE__EEXPRESSION = "use->includesAll(resources.kind.oclContainer())";

	/**
	 * Validates the AllResourcesKindsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesKindsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.CONFIGURATION,
				 configuration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllResourcesKindsInUse",
				 CONFIGURATION__ALL_RESOURCES_KINDS_IN_USE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllResourcesMixinsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION__ALL_RESOURCES_MIXINS_IN_USE__EEXPRESSION = "\n" +
		"\n" +
		"\t\t/* Previously use->includesAll(resources.mixins.oclContainer()) */\n" +
		"\t\t\tresources.parts.mixin->forAll(mo |\n" +
		"\t\t\tlet mixinOwner = mo.oclContainer()\n" +
		"\t\t\tin if mixinOwner.oclIsTypeOf(Extension)\n" +
		"\t\t\t\tthen self.use->includes(mixinOwner.oclAsType(Extension)) else self.mixins->includes(mo) endif)";

	/**
	 * Validates the AllResourcesMixinsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesMixinsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.CONFIGURATION,
				 configuration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllResourcesMixinsInUse",
				 CONFIGURATION__ALL_RESOURCES_MIXINS_IN_USE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllResourcesLinksKindsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION__ALL_RESOURCES_LINKS_KINDS_IN_USE__EEXPRESSION = "use->includesAll(resources.links.kind.oclContainer())";

	/**
	 * Validates the AllResourcesLinksKindsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesLinksKindsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.CONFIGURATION,
				 configuration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllResourcesLinksKindsInUse",
				 CONFIGURATION__ALL_RESOURCES_LINKS_KINDS_IN_USE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllResourcesLinksMixinsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION__ALL_RESOURCES_LINKS_MIXINS_IN_USE__EEXPRESSION = "\n" +
		"\n" +
		"\t\t/* Previously use->includesAll(resources.links.mixins.oclContainer()) */\n" +
		"\t\t\tresources.links.parts.mixin->forAll(mo |\n" +
		"\t\t\tlet mixinOwner = mo.oclContainer()\n" +
		"\t\t\tin if mixinOwner.oclIsTypeOf(Extension)\n" +
		"\t\t\t\tthen self.use->includes(mixinOwner.oclAsType(Extension)) else self.mixins->includes(mo) endif)";

	/**
	 * Validates the AllResourcesLinksMixinsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesLinksMixinsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.CONFIGURATION,
				 configuration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllResourcesLinksMixinsInUse",
				 CONFIGURATION__ALL_RESOURCES_LINKS_MIXINS_IN_USE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllResourcesLinksTargetsInConfiguration constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION__ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION__EEXPRESSION = "resources.links.target->forAll(r | r.oclContainer() = self)";

	/**
	 * Validates the AllResourcesLinksTargetsInConfiguration constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesLinksTargetsInConfiguration(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.CONFIGURATION,
				 configuration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllResourcesLinksTargetsInConfiguration",
				 CONFIGURATION__ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllMixinsAreTags constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION__ALL_MIXINS_ARE_TAGS__EEXPRESSION = "mixins->forAll(attributes->isEmpty() and actions->isEmpty() and depends->isEmpty())";

	/**
	 * Validates the AllMixinsAreTags constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllMixinsAreTags(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OCCIPackage.Literals.CONFIGURATION,
				 configuration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllMixinsAreTags",
				 CONFIGURATION__ALL_MIXINS_ARE_TAGS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicType(BasicType basicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanType(BooleanType booleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericType(NumericType numericType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerType(IntegerType integerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatType(FloatType floatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationType(EnumerationType enumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordType(RecordType recordType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recordType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordFieldDeclaration(RecordFieldDeclaration recordFieldDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recordFieldDeclaration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayType(ArrayType arrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeAnnotation(TypeAnnotation typeAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeAnnotationKey(TypeAnnotationKey typeAnnotationKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
