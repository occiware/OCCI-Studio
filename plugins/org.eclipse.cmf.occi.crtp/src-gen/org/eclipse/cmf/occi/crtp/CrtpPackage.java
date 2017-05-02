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
package org.eclipse.cmf.occi.crtp;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.crtp.CrtpFactory
 * @model kind="package"
 * @generated
 */
public interface CrtpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "crtp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/occi/infrastructure/compute/template/1.1/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "crtp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CrtpPackage eINSTANCE = org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.crtp.impl.SmallImpl <em>Small</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.crtp.impl.SmallImpl
	 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getSmall()
	 * @generated
	 */
	int SMALL = 0;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__OCCI_COMPUTE_CORES = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__OCCI_COMPUTE_MEMORY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.crtp.impl.MediumImpl <em>Medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.crtp.impl.MediumImpl
	 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getMedium()
	 * @generated
	 */
	int MEDIUM = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__OCCI_COMPUTE_CORES = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__OCCI_COMPUTE_MEMORY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.crtp.impl.LargeImpl <em>Large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.crtp.impl.LargeImpl
	 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getLarge()
	 * @generated
	 */
	int LARGE = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE__OCCI_COMPUTE_CORES = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE__OCCI_COMPUTE_MEMORY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LARGE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.crtp.impl.Mem_smallImpl <em>Mem small</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.crtp.impl.Mem_smallImpl
	 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getMem_small()
	 * @generated
	 */
	int MEM_SMALL = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SMALL__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SMALL__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SMALL__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SMALL__OCCI_COMPUTE_CORES = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SMALL__OCCI_COMPUTE_MEMORY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mem small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SMALL_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SMALL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mem small</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SMALL_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.crtp.impl.Mem_mediumImpl <em>Mem medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.crtp.impl.Mem_mediumImpl
	 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getMem_medium()
	 * @generated
	 */
	int MEM_MEDIUM = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_MEDIUM__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_MEDIUM__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_MEDIUM__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_MEDIUM__OCCI_COMPUTE_CORES = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_MEDIUM__OCCI_COMPUTE_MEMORY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mem medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_MEDIUM_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_MEDIUM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mem medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_MEDIUM_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.crtp.impl.Mem_largeImpl <em>Mem large</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.crtp.impl.Mem_largeImpl
	 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getMem_large()
	 * @generated
	 */
	int MEM_LARGE = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_LARGE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_LARGE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_LARGE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_LARGE__OCCI_COMPUTE_CORES = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_LARGE__OCCI_COMPUTE_MEMORY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mem large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_LARGE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_LARGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mem large</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_LARGE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.crtp.Small <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Small
	 * @generated
	 */
	EClass getSmall();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Small#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Small#getOcciComputeCores()
	 * @see #getSmall()
	 * @generated
	 */
	EAttribute getSmall_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Small#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Small#getOcciComputeMemory()
	 * @see #getSmall()
	 * @generated
	 */
	EAttribute getSmall_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Small#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Small#getOcciComputeEphemeralStorageSize()
	 * @see #getSmall()
	 * @generated
	 */
	EAttribute getSmall_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.crtp.Small#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.crtp.Small#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSmall__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.crtp.Medium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medium</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Medium
	 * @generated
	 */
	EClass getMedium();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Medium#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Medium#getOcciComputeCores()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Medium#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Medium#getOcciComputeMemory()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Medium#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Medium#getOcciComputeEphemeralStorageSize()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.crtp.Medium#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.crtp.Medium#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMedium__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.crtp.Large <em>Large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Large</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Large
	 * @generated
	 */
	EClass getLarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Large#getOcciComputeCores()
	 * @see #getLarge()
	 * @generated
	 */
	EAttribute getLarge_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Large#getOcciComputeMemory()
	 * @see #getLarge()
	 * @generated
	 */
	EAttribute getLarge_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Large#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Large#getOcciComputeEphemeralStorageSize()
	 * @see #getLarge()
	 * @generated
	 */
	EAttribute getLarge_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.crtp.Large#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.crtp.Large#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLarge__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.crtp.Mem_small <em>Mem small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mem small</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_small
	 * @generated
	 */
	EClass getMem_small();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Mem_small#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_small#getOcciComputeCores()
	 * @see #getMem_small()
	 * @generated
	 */
	EAttribute getMem_small_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Mem_small#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_small#getOcciComputeMemory()
	 * @see #getMem_small()
	 * @generated
	 */
	EAttribute getMem_small_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Mem_small#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_small#getOcciComputeEphemeralStorageSize()
	 * @see #getMem_small()
	 * @generated
	 */
	EAttribute getMem_small_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.crtp.Mem_small#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.crtp.Mem_small#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMem_small__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.crtp.Mem_medium <em>Mem medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mem medium</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_medium
	 * @generated
	 */
	EClass getMem_medium();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Mem_medium#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_medium#getOcciComputeCores()
	 * @see #getMem_medium()
	 * @generated
	 */
	EAttribute getMem_medium_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Mem_medium#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_medium#getOcciComputeMemory()
	 * @see #getMem_medium()
	 * @generated
	 */
	EAttribute getMem_medium_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Mem_medium#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_medium#getOcciComputeEphemeralStorageSize()
	 * @see #getMem_medium()
	 * @generated
	 */
	EAttribute getMem_medium_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.crtp.Mem_medium#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.crtp.Mem_medium#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMem_medium__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.crtp.Mem_large <em>Mem large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mem large</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_large
	 * @generated
	 */
	EClass getMem_large();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Mem_large#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_large#getOcciComputeCores()
	 * @see #getMem_large()
	 * @generated
	 */
	EAttribute getMem_large_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Mem_large#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_large#getOcciComputeMemory()
	 * @see #getMem_large()
	 * @generated
	 */
	EAttribute getMem_large_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.crtp.Mem_large#getOcciComputeEphemeralStorageSize <em>Occi Compute Ephemeral Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Ephemeral Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.crtp.Mem_large#getOcciComputeEphemeralStorageSize()
	 * @see #getMem_large()
	 * @generated
	 */
	EAttribute getMem_large_OcciComputeEphemeralStorageSize();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.crtp.Mem_large#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.crtp.Mem_large#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMem_large__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CrtpFactory getCrtpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.crtp.impl.SmallImpl <em>Small</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.crtp.impl.SmallImpl
		 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getSmall()
		 * @generated
		 */
		EClass SMALL = eINSTANCE.getSmall();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL__OCCI_COMPUTE_CORES = eINSTANCE.getSmall_OcciComputeCores();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL__OCCI_COMPUTE_MEMORY = eINSTANCE.getSmall_OcciComputeMemory();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = eINSTANCE.getSmall_OcciComputeEphemeralStorageSize();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SMALL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSmall__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.crtp.impl.MediumImpl <em>Medium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.crtp.impl.MediumImpl
		 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getMedium()
		 * @generated
		 */
		EClass MEDIUM = eINSTANCE.getMedium();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__OCCI_COMPUTE_CORES = eINSTANCE.getMedium_OcciComputeCores();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__OCCI_COMPUTE_MEMORY = eINSTANCE.getMedium_OcciComputeMemory();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = eINSTANCE.getMedium_OcciComputeEphemeralStorageSize();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEDIUM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMedium__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.crtp.impl.LargeImpl <em>Large</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.crtp.impl.LargeImpl
		 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getLarge()
		 * @generated
		 */
		EClass LARGE = eINSTANCE.getLarge();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LARGE__OCCI_COMPUTE_CORES = eINSTANCE.getLarge_OcciComputeCores();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LARGE__OCCI_COMPUTE_MEMORY = eINSTANCE.getLarge_OcciComputeMemory();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = eINSTANCE.getLarge_OcciComputeEphemeralStorageSize();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LARGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLarge__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.crtp.impl.Mem_smallImpl <em>Mem small</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.crtp.impl.Mem_smallImpl
		 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getMem_small()
		 * @generated
		 */
		EClass MEM_SMALL = eINSTANCE.getMem_small();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_SMALL__OCCI_COMPUTE_CORES = eINSTANCE.getMem_small_OcciComputeCores();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_SMALL__OCCI_COMPUTE_MEMORY = eINSTANCE.getMem_small_OcciComputeMemory();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = eINSTANCE.getMem_small_OcciComputeEphemeralStorageSize();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEM_SMALL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMem_small__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.crtp.impl.Mem_mediumImpl <em>Mem medium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.crtp.impl.Mem_mediumImpl
		 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getMem_medium()
		 * @generated
		 */
		EClass MEM_MEDIUM = eINSTANCE.getMem_medium();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_MEDIUM__OCCI_COMPUTE_CORES = eINSTANCE.getMem_medium_OcciComputeCores();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_MEDIUM__OCCI_COMPUTE_MEMORY = eINSTANCE.getMem_medium_OcciComputeMemory();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = eINSTANCE.getMem_medium_OcciComputeEphemeralStorageSize();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEM_MEDIUM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMem_medium__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.crtp.impl.Mem_largeImpl <em>Mem large</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.crtp.impl.Mem_largeImpl
		 * @see org.eclipse.cmf.occi.crtp.impl.CrtpPackageImpl#getMem_large()
		 * @generated
		 */
		EClass MEM_LARGE = eINSTANCE.getMem_large();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_LARGE__OCCI_COMPUTE_CORES = eINSTANCE.getMem_large_OcciComputeCores();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_LARGE__OCCI_COMPUTE_MEMORY = eINSTANCE.getMem_large_OcciComputeMemory();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Ephemeral Storage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEM_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE = eINSTANCE.getMem_large_OcciComputeEphemeralStorageSize();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEM_LARGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMem_large__AppliesConstraint__DiagnosticChain_Map();

	}

} //CrtpPackage
