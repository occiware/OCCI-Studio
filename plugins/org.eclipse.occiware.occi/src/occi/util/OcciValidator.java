/**
 */
package occi.util;

import java.util.Map;

import occi.*;

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
 * @see occi.OcciPackage
 * @generated
 */
public class OcciValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OcciValidator INSTANCE = new OcciValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "occi";

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
	public OcciValidator() {
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
	  return OcciPackage.eINSTANCE;
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
			case OcciPackage.CATEGORY:
				return validateCategory((Category)value, diagnostics, context);
			case OcciPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case OcciPackage.KIND:
				return validateKind((Kind)value, diagnostics, context);
			case OcciPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case OcciPackage.MIXIN:
				return validateMixin((Mixin)value, diagnostics, context);
			case OcciPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case OcciPackage.ATTRIBUTE_STATE:
				return validateAttributeState((AttributeState)value, diagnostics, context);
			case OcciPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case OcciPackage.LINK:
				return validateLink((Link)value, diagnostics, context);
			case OcciPackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case OcciPackage.CONFIGURATION:
				return validateConfiguration((Configuration)value, diagnostics, context);
			case OcciPackage.URI:
				return validateURI((String)value, diagnostics, context);
			case OcciPackage.STRING:
				return validateString((String)value, diagnostics, context);
			case OcciPackage.BOOLEAN:
				return validateBoolean((Boolean)value, diagnostics, context);
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
				(OcciPackage.Literals.CATEGORY,
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
	protected static final String CATEGORY__SCHEME_ENDS_WITH_SHARP__EEXPRESSION = "scheme.substring(scheme.size(),scheme.size()) = '#'";

	/**
	 * Validates the SchemeEndsWithSharp constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_SchemeEndsWithSharp(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.CATEGORY,
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
				(OcciPackage.Literals.CATEGORY,
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
		if (result || diagnostics != null) result &= validateKind_ActionTermUnicity(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_CorrectScheme(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_NoCyclicInheritance(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_EntityKindIsRootParent(kind, diagnostics, context);
		if (result || diagnostics != null) result &= validateKind_AttributesNameNotAlreadyDefinedInParent(kind, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ActionTermUnicity constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KIND__ACTION_TERM_UNICITY__EEXPRESSION = "actions->isUnique(term)";

	/**
	 * Validates the ActionTermUnicity constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_ActionTermUnicity(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.KIND,
				 kind,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ActionTermUnicity",
				 KIND__ACTION_TERM_UNICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
				(OcciPackage.Literals.KIND,
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
				(OcciPackage.Literals.KIND,
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
	protected static final String KIND__ENTITY_KIND_IS_ROOT_PARENT__EEXPRESSION = "self->closure(parent)->exists(k | k.term = 'entity' and k.scheme = 'http://schemas.ogf.org/occi/core#' and k.parent = null)";

	/**
	 * Validates the EntityKindIsRootParent constraint of '<em>Kind</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKind_EntityKindIsRootParent(Kind kind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.KIND,
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
				(OcciPackage.Literals.KIND,
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
	protected static final String ACTION__CORRECT_SCHEME__EEXPRESSION = "let category = oclContainer().oclAsType(Category) in scheme = category.scheme.substring(1,category.scheme.size()-1) + '/' + category.term + '/action#'";

	/**
	 * Validates the CorrectScheme constraint of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction_CorrectScheme(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.ACTION,
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
		if (result || diagnostics != null) result &= validateMixin_ActionTermUnicity(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_CorrectScheme(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_NoCyclicInheritance(mixin, diagnostics, context);
		if (result || diagnostics != null) result &= validateMixin_AttributesNameNotAlreadyDefinedInDepends(mixin, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ActionTermUnicity constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MIXIN__ACTION_TERM_UNICITY__EEXPRESSION = "actions->isUnique(term)";

	/**
	 * Validates the ActionTermUnicity constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_ActionTermUnicity(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.MIXIN,
				 mixin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ActionTermUnicity",
				 MIXIN__ACTION_TERM_UNICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CorrectScheme constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MIXIN__CORRECT_SCHEME__EEXPRESSION = "\n" +
		"\t\t  /* Previously let ownerScheme = owner.oclAsType(Extension).scheme in scheme.substring(1,ownerScheme.size()-1) = ownerScheme.substring(1,ownerScheme.size()-1) */\n" +
		"\t\t  let owner = self.oclContainer()\n" +
		"\t\t  in if owner.oclIsTypeOf(Extension) then\n" +
		"\t\t       let ownerScheme = owner.oclAsType(Extension).scheme\n" +
		"\t\t       in scheme.substring(1,ownerScheme.size()-1) = ownerScheme.substring(1,ownerScheme.size()-1)\n" +
		"\t\t     else\n" +
		"\t\t       true\n" +
		"\t\t     endif";

	/**
	 * Validates the CorrectScheme constraint of '<em>Mixin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMixin_CorrectScheme(Mixin mixin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.MIXIN,
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
				(OcciPackage.Literals.MIXIN,
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
				(OcciPackage.Literals.MIXIN,
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
				(OcciPackage.Literals.ENTITY,
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
				(OcciPackage.Literals.ENTITY,
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
	protected static final String ENTITY__KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__EEXPRESSION = "mixins->forAll(m | m.applies->notEmpty() implies m.applies->exists(k | kind->closure(parent)->includes(k)))";

	/**
	 * Validates the KindCompatibleWithOneAppliesOfEachMixin constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_KindCompatibleWithOneAppliesOfEachMixin(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.ENTITY,
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
	protected static final String RESOURCE__RESOURCE_KIND_IS_IN_PARENT__EEXPRESSION = "kind->closure(parent)->exists(k | k.term = 'resource' and k.scheme = 'http://schemas.ogf.org/occi/core#')";

	/**
	 * Validates the ResourceKindIsInParent constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_ResourceKindIsInParent(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.RESOURCE,
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
	protected static final String LINK__LINK_KIND_IS_IN_PARENT__EEXPRESSION = "kind->closure(parent)->exists(k | k.term = 'link' and k.scheme = 'http://schemas.ogf.org/occi/core#')";

	/**
	 * Validates the LinkKindIsInParent constraint of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLink_LinkKindIsInParent(Link link, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.LINK,
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
				(OcciPackage.Literals.EXTENSION,
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
				(OcciPackage.Literals.EXTENSION,
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
	protected static final String EXTENSION__MIXINS_SCHEME_VALID__EEXPRESSION = "mixins->forAll(m | m.scheme.substring(1,scheme.size()-1) = scheme.substring(1,scheme.size()-1))";

	/**
	 * Validates the MixinsSchemeValid constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinsSchemeValid(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.EXTENSION,
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
				(OcciPackage.Literals.EXTENSION,
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
	protected static final String EXTENSION__KIND_PARENT_LOCAL_OR_IMPORTED__EEXPRESSION = "kinds->forAll(parent <> null implies let parentExtension = parent.oclContainer() in parentExtension = self or import->includes(parentExtension))";

	/**
	 * Validates the KindParentLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_KindParentLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.EXTENSION,
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
	protected static final String EXTENSION__MIXIN_DEPENDS_LOCAL_OR_IMPORTED__EEXPRESSION = "mixins.depends->forAll(let extension = oclContainer() in extension = self or import->includes(extension))";

	/**
	 * Validates the MixinDependsLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinDependsLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.EXTENSION,
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
	protected static final String EXTENSION__MIXIN_APPLIES_LOCAL_OR_IMPORTED__EEXPRESSION = "mixins.applies->forAll(let extension = oclContainer() in extension = self or import->includes(extension))";

	/**
	 * Validates the MixinAppliesLocalOrImported constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_MixinAppliesLocalOrImported(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.EXTENSION,
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
				(OcciPackage.Literals.CONFIGURATION,
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
		"\t\t  /* Previously use->includesAll(resources.mixins.oclContainer()) */\n" +
		"\t\t  resources.mixins->forAll(mo | let mixinOwner = mo.oclContainer()\n" +
		"\t\t  \t                            in if mixinOwner.oclIsTypeOf(Extension) then\n" +
		"\t\t  \t                                 self.use->includes(mixinOwner.oclAsType(Extension))\n" +
		"\t\t  \t                                else\n" +
		"\t\t  \t                                  self.mixins->includes(mo)\n" +
		"\t\t  \t                                 endif\n" +
		"\t\t  \t                      )";

	/**
	 * Validates the AllResourcesMixinsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesMixinsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.CONFIGURATION,
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
				(OcciPackage.Literals.CONFIGURATION,
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
		"\t\t  /* Previously use->includesAll(resources.links.mixins.oclContainer()) */\n" +
		"\t\t  resources.links.mixins->forAll(mo | let mixinOwner = mo.oclContainer()\n" +
		"\t\t  \t                                  in if mixinOwner.oclIsTypeOf(Extension) then\n" +
		"\t\t  \t                                    self.use->includes(mixinOwner.oclAsType(Extension))\n" +
		"\t\t  \t                                  else\n" +
		"\t\t  \t                                    self.mixins->includes(mo)\n" +
		"\t\t  \t                                  endif\n" +
		"\t\t  \t                            )";

	/**
	 * Validates the AllResourcesLinksMixinsInUse constraint of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfiguration_AllResourcesLinksMixinsInUse(Configuration configuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OcciPackage.Literals.CONFIGURATION,
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
				(OcciPackage.Literals.CONFIGURATION,
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
				(OcciPackage.Literals.CONFIGURATION,
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
				XMLTypeUtil.createPatternMatcher("http://\\S*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI_Pattern(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OcciPackage.Literals.URI, uri, URI__PATTERN__VALUES, diagnostics, context);
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

} //OcciValidator
