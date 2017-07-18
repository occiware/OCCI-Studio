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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.crtp.CrtpFactory;
import org.eclipse.cmf.occi.crtp.CrtpPackage;
import org.eclipse.cmf.occi.crtp.Large;
import org.eclipse.cmf.occi.crtp.Medium;
import org.eclipse.cmf.occi.crtp.Mem_large;
import org.eclipse.cmf.occi.crtp.Mem_medium;
import org.eclipse.cmf.occi.crtp.Mem_small;
import org.eclipse.cmf.occi.crtp.Small;

import org.eclipse.cmf.occi.crtp.util.CrtpValidator;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class CrtpPackageImpl extends EPackageImpl implements CrtpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mem_smallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mem_mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mem_largeEClass = null;

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
	 * @see org.eclipse.cmf.occi.crtp.CrtpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CrtpPackageImpl() {
		super(eNS_URI, CrtpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CrtpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CrtpPackage init() {
		if (isInited) return (CrtpPackage)EPackage.Registry.INSTANCE.getEPackage(CrtpPackage.eNS_URI);

		// Obtain or create and register package
		CrtpPackageImpl theCrtpPackage = (CrtpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CrtpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CrtpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCrtpPackage.createPackageContents();

		// Initialize created meta-data
		theCrtpPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCrtpPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CrtpValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCrtpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CrtpPackage.eNS_URI, theCrtpPackage);
		return theCrtpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmall() {
		return smallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmall_OcciComputeCores() {
		return (EAttribute)smallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmall_OcciComputeMemory() {
		return (EAttribute)smallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmall_OcciComputeEphemeralStorageSize() {
		return (EAttribute)smallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSmall__AppliesConstraint__DiagnosticChain_Map() {
		return smallEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedium() {
		return mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_OcciComputeCores() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_OcciComputeMemory() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_OcciComputeEphemeralStorageSize() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMedium__AppliesConstraint__DiagnosticChain_Map() {
		return mediumEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLarge() {
		return largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLarge_OcciComputeCores() {
		return (EAttribute)largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLarge_OcciComputeMemory() {
		return (EAttribute)largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLarge_OcciComputeEphemeralStorageSize() {
		return (EAttribute)largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLarge__AppliesConstraint__DiagnosticChain_Map() {
		return largeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMem_small() {
		return mem_smallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_small_OcciComputeCores() {
		return (EAttribute)mem_smallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_small_OcciComputeMemory() {
		return (EAttribute)mem_smallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_small_OcciComputeEphemeralStorageSize() {
		return (EAttribute)mem_smallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMem_small__AppliesConstraint__DiagnosticChain_Map() {
		return mem_smallEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMem_medium() {
		return mem_mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_medium_OcciComputeCores() {
		return (EAttribute)mem_mediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_medium_OcciComputeMemory() {
		return (EAttribute)mem_mediumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_medium_OcciComputeEphemeralStorageSize() {
		return (EAttribute)mem_mediumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMem_medium__AppliesConstraint__DiagnosticChain_Map() {
		return mem_mediumEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMem_large() {
		return mem_largeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_large_OcciComputeCores() {
		return (EAttribute)mem_largeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_large_OcciComputeMemory() {
		return (EAttribute)mem_largeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMem_large_OcciComputeEphemeralStorageSize() {
		return (EAttribute)mem_largeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMem_large__AppliesConstraint__DiagnosticChain_Map() {
		return mem_largeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrtpFactory getCrtpFactory() {
		return (CrtpFactory)getEFactoryInstance();
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
		smallEClass = createEClass(SMALL);
		createEAttribute(smallEClass, SMALL__OCCI_COMPUTE_CORES);
		createEAttribute(smallEClass, SMALL__OCCI_COMPUTE_MEMORY);
		createEAttribute(smallEClass, SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);
		createEOperation(smallEClass, SMALL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		mediumEClass = createEClass(MEDIUM);
		createEAttribute(mediumEClass, MEDIUM__OCCI_COMPUTE_CORES);
		createEAttribute(mediumEClass, MEDIUM__OCCI_COMPUTE_MEMORY);
		createEAttribute(mediumEClass, MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);
		createEOperation(mediumEClass, MEDIUM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		largeEClass = createEClass(LARGE);
		createEAttribute(largeEClass, LARGE__OCCI_COMPUTE_CORES);
		createEAttribute(largeEClass, LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(largeEClass, LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);
		createEOperation(largeEClass, LARGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		mem_smallEClass = createEClass(MEM_SMALL);
		createEAttribute(mem_smallEClass, MEM_SMALL__OCCI_COMPUTE_CORES);
		createEAttribute(mem_smallEClass, MEM_SMALL__OCCI_COMPUTE_MEMORY);
		createEAttribute(mem_smallEClass, MEM_SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);
		createEOperation(mem_smallEClass, MEM_SMALL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		mem_mediumEClass = createEClass(MEM_MEDIUM);
		createEAttribute(mem_mediumEClass, MEM_MEDIUM__OCCI_COMPUTE_CORES);
		createEAttribute(mem_mediumEClass, MEM_MEDIUM__OCCI_COMPUTE_MEMORY);
		createEAttribute(mem_mediumEClass, MEM_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);
		createEOperation(mem_mediumEClass, MEM_MEDIUM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		mem_largeEClass = createEClass(MEM_LARGE);
		createEAttribute(mem_largeEClass, MEM_LARGE__OCCI_COMPUTE_CORES);
		createEAttribute(mem_largeEClass, MEM_LARGE__OCCI_COMPUTE_MEMORY);
		createEAttribute(mem_largeEClass, MEM_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE);
		createEOperation(mem_largeEClass, MEM_LARGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
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
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		smallEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		smallEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());
		mediumEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mediumEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());
		largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		largeEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());
		mem_smallEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mem_smallEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());
		mem_mediumEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mem_mediumEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());
		mem_largeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mem_largeEClass.getESuperTypes().add(theInfrastructurePackage.getResource_tpl());

		// Initialize classes, features, and operations; add parameters
		initEClass(smallEClass, Small.class, "Small", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmall_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "1", 0, 1, Small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmall_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "1.0", 0, 1, Small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmall_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "10.0", 1, 1, Small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSmall__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mediumEClass, Medium.class, "Medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedium_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedium_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "2.0", 0, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedium_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "20.0", 1, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMedium__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(largeEClass, Large.class, "Large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLarge_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, Large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLarge_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "4.0", 0, 1, Large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLarge_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "40.0", 1, 1, Large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLarge__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mem_smallEClass, Mem_small.class, "Mem_small", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMem_small_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "1", 0, 1, Mem_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMem_small_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "4.0", 0, 1, Mem_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMem_small_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "10.0", 1, 1, Mem_small.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMem_small__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mem_mediumEClass, Mem_medium.class, "Mem_medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMem_medium_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "2", 0, 1, Mem_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMem_medium_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "8.0", 0, 1, Mem_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMem_medium_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "20.0", 1, 1, Mem_medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMem_medium__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mem_largeEClass, Mem_large.class, "Mem_large", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMem_large_OcciComputeCores(), theInfrastructurePackage.getCore(), "occiComputeCores", "4", 0, 1, Mem_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMem_large_OcciComputeMemory(), theInfrastructurePackage.getGiB(), "occiComputeMemory", "16.0", 0, 1, Mem_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMem_large_OcciComputeEphemeralStorageSize(), theInfrastructurePackage.getGiB(), "occiComputeEphemeralStorageSize", "40.0", 1, 1, Mem_large.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMem_large__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
		  (smallEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (mediumEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (largeEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (mem_smallEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (mem_mediumEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (mem_largeEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

} //CrtpPackageImpl
