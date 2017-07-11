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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.sla.Agreement;
import org.eclipse.cmf.occi.sla.AgreementStatus;
import org.eclipse.cmf.occi.sla.AgreementTermStatus;
import org.eclipse.cmf.occi.sla.AgreementTermType;
import org.eclipse.cmf.occi.sla.Agreement_link;
import org.eclipse.cmf.occi.sla.Agreement_term;
import org.eclipse.cmf.occi.sla.Agreement_tpl;
import org.eclipse.cmf.occi.sla.SlaFactory;
import org.eclipse.cmf.occi.sla.SlaPackage;

import org.eclipse.cmf.occi.sla.util.SlaValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlaPackageImpl extends EPackageImpl implements SlaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreement_linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreement_tplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agreement_termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agreementStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agreementTermTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agreementTermStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.cmf.occi.sla.SlaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SlaPackageImpl() {
		super(eNS_URI, SlaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SlaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SlaPackage init() {
		if (isInited) return (SlaPackage)EPackage.Registry.INSTANCE.getEPackage(SlaPackage.eNS_URI);

		// Obtain or create and register package
		SlaPackageImpl theSlaPackage = (SlaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SlaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SlaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSlaPackage.createPackageContents();

		// Initialize created meta-data
		theSlaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSlaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SlaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSlaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SlaPackage.eNS_URI, theSlaPackage);
		return theSlaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreement() {
		return agreementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_OcciAgreementState() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_OcciAgreementAgreedAt() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_OcciAgreementEffectiveFrom() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_OcciAgreementEffectiveUntil() {
		return (EAttribute)agreementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement__Accept() {
		return agreementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement__Reject() {
		return agreementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement__Suspend() {
		return agreementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement__Resume() {
		return agreementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement__Terminate() {
		return agreementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreement_link() {
		return agreement_linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreement_tpl() {
		return agreement_tplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement_tpl__AppliesConstraint__DiagnosticChain_Map() {
		return agreement_tplEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgreement_term() {
		return agreement_termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_term_OcciAgreementTermType() {
		return (EAttribute)agreement_termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_term_OcciAgreementTermState() {
		return (EAttribute)agreement_termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_term_OcciAgreementTermDesc() {
		return (EAttribute)agreement_termEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgreement_term_OcciAgreementTermRemedy() {
		return (EAttribute)agreement_termEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgreement_term__AppliesConstraint__DiagnosticChain_Map() {
		return agreement_termEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgreementStatus() {
		return agreementStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgreementTermType() {
		return agreementTermTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgreementTermStatus() {
		return agreementTermStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTime() {
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlaFactory getSlaFactory() {
		return (SlaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		agreementEClass = createEClass(AGREEMENT);
		createEAttribute(agreementEClass, AGREEMENT__OCCI_AGREEMENT_STATE);
		createEAttribute(agreementEClass, AGREEMENT__OCCI_AGREEMENT_AGREED_AT);
		createEAttribute(agreementEClass, AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_FROM);
		createEAttribute(agreementEClass, AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_UNTIL);
		createEOperation(agreementEClass, AGREEMENT___ACCEPT);
		createEOperation(agreementEClass, AGREEMENT___REJECT);
		createEOperation(agreementEClass, AGREEMENT___SUSPEND);
		createEOperation(agreementEClass, AGREEMENT___RESUME);
		createEOperation(agreementEClass, AGREEMENT___TERMINATE);

		agreement_linkEClass = createEClass(AGREEMENT_LINK);

		agreement_tplEClass = createEClass(AGREEMENT_TPL);
		createEOperation(agreement_tplEClass, AGREEMENT_TPL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		agreement_termEClass = createEClass(AGREEMENT_TERM);
		createEAttribute(agreement_termEClass, AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE);
		createEAttribute(agreement_termEClass, AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE);
		createEAttribute(agreement_termEClass, AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC);
		createEAttribute(agreement_termEClass, AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY);
		createEOperation(agreement_termEClass, AGREEMENT_TERM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		// Create enums
		agreementStatusEEnum = createEEnum(AGREEMENT_STATUS);
		agreementTermTypeEEnum = createEEnum(AGREEMENT_TERM_TYPE);
		agreementTermStatusEEnum = createEEnum(AGREEMENT_TERM_STATUS);

		// Create data types
		dateTimeEDataType = createEDataType(DATE_TIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		agreementEClass.getESuperTypes().add(theOCCIPackage.getResource());
		agreement_linkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		agreement_tplEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		agreement_termEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(agreementEClass, Agreement.class, "Agreement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreement_OcciAgreementState(), this.getAgreementStatus(), "occiAgreementState", null, 1, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_OcciAgreementAgreedAt(), this.getDateTime(), "occiAgreementAgreedAt", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_OcciAgreementEffectiveFrom(), this.getDateTime(), "occiAgreementEffectiveFrom", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_OcciAgreementEffectiveUntil(), this.getDateTime(), "occiAgreementEffectiveUntil", null, 0, 1, Agreement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAgreement__Accept(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgreement__Reject(), null, "reject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgreement__Suspend(), null, "suspend", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgreement__Resume(), null, "resume", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgreement__Terminate(), null, "terminate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(agreement_linkEClass, Agreement_link.class, "Agreement_link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agreement_tplEClass, Agreement_tpl.class, "Agreement_tpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAgreement_tpl__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(agreement_termEClass, Agreement_term.class, "Agreement_term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgreement_term_OcciAgreementTermType(), this.getAgreementTermType(), "occiAgreementTermType", null, 1, 1, Agreement_term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_term_OcciAgreementTermState(), this.getAgreementTermStatus(), "occiAgreementTermState", null, 1, 1, Agreement_term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_term_OcciAgreementTermDesc(), theOCCIPackage.getString(), "occiAgreementTermDesc", null, 0, 1, Agreement_term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgreement_term_OcciAgreementTermRemedy(), theOCCIPackage.getString(), "occiAgreementTermRemedy", null, 0, 1, Agreement_term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAgreement_term__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(agreementStatusEEnum, AgreementStatus.class, "AgreementStatus");
		addEEnumLiteral(agreementStatusEEnum, AgreementStatus.PENDING);
		addEEnumLiteral(agreementStatusEEnum, AgreementStatus.ACCEPTED);
		addEEnumLiteral(agreementStatusEEnum, AgreementStatus.REJECTED);
		addEEnumLiteral(agreementStatusEEnum, AgreementStatus.SUSPENDED);
		addEEnumLiteral(agreementStatusEEnum, AgreementStatus.TERMINATED);

		initEEnum(agreementTermTypeEEnum, AgreementTermType.class, "AgreementTermType");
		addEEnumLiteral(agreementTermTypeEEnum, AgreementTermType.SERVICE);
		addEEnumLiteral(agreementTermTypeEEnum, AgreementTermType.SLO);

		initEEnum(agreementTermStatusEEnum, AgreementTermStatus.class, "AgreementTermStatus");
		addEEnumLiteral(agreementTermStatusEEnum, AgreementTermStatus.UNDEFINED);
		addEEnumLiteral(agreementTermStatusEEnum, AgreementTermStatus.FULFILLED);
		addEEnumLiteral(agreementTermStatusEEnum, AgreementTermStatus.VIOLATED);

		// Initialize data types
		initEDataType(dateTimeEDataType, String.class, "DateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (agreement_tplEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (agreement_termEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (dateTimeEDataType, 
		   source, 
		   new String[] {
			 "pattern", "^(\\d{4}((-)?(0[1-9]|1[0-2])((-)?(0[1-9]|[1-2][0-9]|3[0-1])(T(24:00(:00(\\.[0]+)?)?|(([0-1][0-9]|2[0-3])(:)[0-5][0-9])((:)[0-5][0-9](\\.[\\d]+)?)?)((\\+|-)(14:00|(0[0-9]|1[0-3])(:)[0-5][0-9])|Z))?)?)?)$"
		   });
	}

} //SlaPackageImpl
