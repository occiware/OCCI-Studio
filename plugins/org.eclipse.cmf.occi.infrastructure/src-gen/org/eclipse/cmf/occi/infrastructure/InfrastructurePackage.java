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
package org.eclipse.cmf.occi.infrastructure;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.cmf.occi.infrastructure.InfrastructureFactory
 * @model kind="package"
 * @generated
 */
public interface InfrastructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "infrastructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/occi/infrastructure/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "infrastructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfrastructurePackage eINSTANCE = org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Network Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OCCI_NETWORK_VLAN = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Network Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OCCI_NETWORK_LABEL = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Network State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OCCI_NETWORK_STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Network State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OCCI_NETWORK_STATE_MESSAGE = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___UP = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___DOWN = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Vlan</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___UNIQUE_VLAN__DIAGNOSTICCHAIN_MAP = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl <em>Compute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getCompute()
	 * @generated
	 */
	int COMPUTE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__OCCI_COMPUTE_ARCHITECTURE = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__OCCI_COMPUTE_CORES = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__OCCI_COMPUTE_HOSTNAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__OCCI_COMPUTE_SHARE = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__OCCI_COMPUTE_SPEED = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__OCCI_COMPUTE_MEMORY = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__OCCI_COMPUTE_STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__OCCI_COMPUTE_STATE_MESSAGE = OCCIPackage.RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE___START = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE___STOP__STOPMETHOD = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE___RESTART__RESTARTMETHOD = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE___SUSPEND__SUSPENDMETHOD = OCCIPackage.RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE___SAVE__SAVEMETHOD_STRING = OCCIPackage.RESOURCE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.impl.StorageImpl
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__OCCI_STORAGE_SIZE = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Storage State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__OCCI_STORAGE_STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Storage State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__OCCI_STORAGE_STATE_MESSAGE = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___ONLINE = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___OFFLINE = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.impl.StoragelinkImpl <em>Storagelink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.impl.StoragelinkImpl
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getStoragelink()
	 * @generated
	 */
	int STORAGELINK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Occi Storagelink Deviceid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__OCCI_STORAGELINK_DEVICEID = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Storagelink Mountpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__OCCI_STORAGELINK_MOUNTPOINT = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Storagelink State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__OCCI_STORAGELINK_STATE = OCCIPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Storagelink State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK__OCCI_STORAGELINK_STATE_MESSAGE = OCCIPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Storagelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The number of operations of the '<em>Storagelink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGELINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkinterfaceImpl <em>Networkinterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.impl.NetworkinterfaceImpl
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkinterface()
	 * @generated
	 */
	int NETWORKINTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC = OCCIPackage.LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE = OCCIPackage.LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE = OCCIPackage.LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Networkinterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Link Target Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE___LINK_TARGET_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Link Source Invariant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE___LINK_SOURCE_INVARIANT__KIND_KIND = OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND;

	/**
	 * The operation id for the '<em>Target Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Networkinterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKINTERFACE_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.impl.IpnetworkImpl <em>Ipnetwork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.impl.IpnetworkImpl
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getIpnetwork()
	 * @generated
	 */
	int IPNETWORK = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORK__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORK__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORK__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Network Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORK__OCCI_NETWORK_ADDRESS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Network Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORK__OCCI_NETWORK_GATEWAY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Network Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORK__OCCI_NETWORK_ALLOCATION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ipnetwork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORK_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ipnetwork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORK_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.impl.IpnetworkinterfaceImpl <em>Ipnetworkinterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.impl.IpnetworkinterfaceImpl
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getIpnetworkinterface()
	 * @generated
	 */
	int IPNETWORKINTERFACE = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORKINTERFACE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORKINTERFACE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORKINTERFACE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ADDRESS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_GATEWAY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Networkinterface Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ALLOCATION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ipnetworkinterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORKINTERFACE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORKINTERFACE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>IP Adresses Must Be Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORKINTERFACE___IP_ADRESSES_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ipnetworkinterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPNETWORKINTERFACE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.impl.Os_tplImpl <em>Os tpl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.impl.Os_tplImpl
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getOs_tpl()
	 * @generated
	 */
	int OS_TPL = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Os tpl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Os tpl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_TPL_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.impl.Resource_tplImpl <em>Resource tpl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.impl.Resource_tplImpl
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getResource_tpl()
	 * @generated
	 */
	int RESOURCE_TPL = 8;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TPL__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TPL__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TPL__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Resource tpl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TPL_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TPL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource tpl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TPL_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.impl.Ssh_keyImpl <em>Ssh key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.impl.Ssh_keyImpl
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getSsh_key()
	 * @generated
	 */
	int SSH_KEY = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_KEY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_KEY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_KEY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Credentials Ssh Publickey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_KEY__OCCI_CREDENTIALS_SSH_PUBLICKEY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ssh key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_KEY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_KEY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ssh key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_KEY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.impl.User_dataImpl <em>User data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.impl.User_dataImpl
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getUser_data()
	 * @generated
	 */
	int USER_DATA = 10;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Compute Userdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__OCCI_COMPUTE_USERDATA = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>User data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.SuspendMethod <em>Suspend Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.SuspendMethod
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getSuspendMethod()
	 * @generated
	 */
	int SUSPEND_METHOD = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.NetworkStatus <em>Network Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.NetworkStatus
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkStatus()
	 * @generated
	 */
	int NETWORK_STATUS = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.ComputeStatus <em>Compute Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.ComputeStatus
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getComputeStatus()
	 * @generated
	 */
	int COMPUTE_STATUS = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus <em>Network Interface Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkInterfaceStatus()
	 * @generated
	 */
	int NETWORK_INTERFACE_STATUS = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.Architecture <em>Architecture</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.Architecture
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.StopMethod <em>Stop Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.StopMethod
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getStopMethod()
	 * @generated
	 */
	int STOP_METHOD = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.RestartMethod <em>Restart Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.RestartMethod
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getRestartMethod()
	 * @generated
	 */
	int RESTART_METHOD = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.Allocation <em>Allocation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.Allocation
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.StorageStatus <em>Storage Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.StorageStatus
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getStorageStatus()
	 * @generated
	 */
	int STORAGE_STATUS = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.StorageLinkStatus <em>Storage Link Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.StorageLinkStatus
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getStorageLinkStatus()
	 * @generated
	 */
	int STORAGE_LINK_STATUS = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.infrastructure.SaveMethod <em>Save Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.SaveMethod
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getSaveMethod()
	 * @generated
	 */
	int SAVE_METHOD = 21;

	/**
	 * The meta object id for the '<em>Vlan</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getVlan()
	 * @generated
	 */
	int VLAN = 22;

	/**
	 * The meta object id for the '<em>Token</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 23;

	/**
	 * The meta object id for the '<em>Ip Address</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getIpAddress()
	 * @generated
	 */
	int IP_ADDRESS = 24;

	/**
	 * The meta object id for the '<em>Core</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getCore()
	 * @generated
	 */
	int CORE = 25;

	/**
	 * The meta object id for the '<em>GHz</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getGHz()
	 * @generated
	 */
	int GHZ = 26;

	/**
	 * The meta object id for the '<em>Gi B</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getGiB()
	 * @generated
	 */
	int GI_B = 27;

	/**
	 * The meta object id for the '<em>Ip Address Range</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getIpAddressRange()
	 * @generated
	 */
	int IP_ADDRESS_RANGE = 28;

	/**
	 * The meta object id for the '<em>Mac</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getMac()
	 * @generated
	 */
	int MAC = 29;

	/**
	 * The meta object id for the '<em>Share</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getShare()
	 * @generated
	 */
	int SHARE = 30;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.infrastructure.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkVlan <em>Occi Network Vlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Network Vlan</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkVlan()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_OcciNetworkVlan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkLabel <em>Occi Network Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Network Label</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkLabel()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_OcciNetworkLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkState <em>Occi Network State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Network State</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkState()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_OcciNetworkState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkStateMessage <em>Occi Network State Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Network State Message</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkStateMessage()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_OcciNetworkStateMessage();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Network#up() <em>Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Up</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Network#up()
	 * @generated
	 */
	EOperation getNetwork__Up();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Network#down() <em>Down</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Down</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Network#down()
	 * @generated
	 */
	EOperation getNetwork__Down();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Network#UniqueVlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Vlan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Vlan</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Network#UniqueVlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNetwork__UniqueVlan__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.infrastructure.Compute <em>Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute
	 * @generated
	 */
	EClass getCompute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeArchitecture <em>Occi Compute Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Architecture</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeArchitecture()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_OcciComputeArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeCores <em>Occi Compute Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Cores</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeCores()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_OcciComputeCores();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeHostname <em>Occi Compute Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Hostname</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeHostname()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_OcciComputeHostname();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeShare <em>Occi Compute Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Share</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeShare()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_OcciComputeShare();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeSpeed <em>Occi Compute Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Speed</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeSpeed()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_OcciComputeSpeed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeMemory <em>Occi Compute Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Memory</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeMemory()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_OcciComputeMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeState <em>Occi Compute State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute State</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeState()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_OcciComputeState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeStateMessage <em>Occi Compute State Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute State Message</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeStateMessage()
	 * @see #getCompute()
	 * @generated
	 */
	EAttribute getCompute_OcciComputeStateMessage();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Compute#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#start()
	 * @generated
	 */
	EOperation getCompute__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Compute#stop(org.eclipse.cmf.occi.infrastructure.StopMethod) <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#stop(org.eclipse.cmf.occi.infrastructure.StopMethod)
	 * @generated
	 */
	EOperation getCompute__Stop__StopMethod();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Compute#restart(org.eclipse.cmf.occi.infrastructure.RestartMethod) <em>Restart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Restart</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#restart(org.eclipse.cmf.occi.infrastructure.RestartMethod)
	 * @generated
	 */
	EOperation getCompute__Restart__RestartMethod();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Compute#suspend(org.eclipse.cmf.occi.infrastructure.SuspendMethod) <em>Suspend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspend</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#suspend(org.eclipse.cmf.occi.infrastructure.SuspendMethod)
	 * @generated
	 */
	EOperation getCompute__Suspend__SuspendMethod();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Compute#save(org.eclipse.cmf.occi.infrastructure.SaveMethod, java.lang.String) <em>Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute#save(org.eclipse.cmf.occi.infrastructure.SaveMethod, java.lang.String)
	 * @generated
	 */
	EOperation getCompute__Save__SaveMethod_String();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.infrastructure.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageSize <em>Occi Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Storage Size</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageSize()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_OcciStorageSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageState <em>Occi Storage State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Storage State</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageState()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_OcciStorageState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageStateMessage <em>Occi Storage State Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Storage State Message</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageStateMessage()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_OcciStorageStateMessage();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Storage#online() <em>Online</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Online</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Storage#online()
	 * @generated
	 */
	EOperation getStorage__Online();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Storage#offline() <em>Offline</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Offline</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Storage#offline()
	 * @generated
	 */
	EOperation getStorage__Offline();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.infrastructure.Storagelink <em>Storagelink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storagelink</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Storagelink
	 * @generated
	 */
	EClass getStoragelink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkDeviceid <em>Occi Storagelink Deviceid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Storagelink Deviceid</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkDeviceid()
	 * @see #getStoragelink()
	 * @generated
	 */
	EAttribute getStoragelink_OcciStoragelinkDeviceid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkMountpoint <em>Occi Storagelink Mountpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Storagelink Mountpoint</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkMountpoint()
	 * @see #getStoragelink()
	 * @generated
	 */
	EAttribute getStoragelink_OcciStoragelinkMountpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkState <em>Occi Storagelink State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Storagelink State</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkState()
	 * @see #getStoragelink()
	 * @generated
	 */
	EAttribute getStoragelink_OcciStoragelinkState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkStateMessage <em>Occi Storagelink State Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Storagelink State Message</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkStateMessage()
	 * @see #getStoragelink()
	 * @generated
	 */
	EAttribute getStoragelink_OcciStoragelinkStateMessage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.infrastructure.Networkinterface <em>Networkinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networkinterface</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Networkinterface
	 * @generated
	 */
	EClass getNetworkinterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceInterface <em>Occi Networkinterface Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Networkinterface Interface</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceInterface()
	 * @see #getNetworkinterface()
	 * @generated
	 */
	EAttribute getNetworkinterface_OcciNetworkinterfaceInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceMac <em>Occi Networkinterface Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Networkinterface Mac</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceMac()
	 * @see #getNetworkinterface()
	 * @generated
	 */
	EAttribute getNetworkinterface_OcciNetworkinterfaceMac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceState <em>Occi Networkinterface State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Networkinterface State</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceState()
	 * @see #getNetworkinterface()
	 * @generated
	 */
	EAttribute getNetworkinterface_OcciNetworkinterfaceState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceStateMessage <em>Occi Networkinterface State Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Networkinterface State Message</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceStateMessage()
	 * @see #getNetworkinterface()
	 * @generated
	 */
	EAttribute getNetworkinterface_OcciNetworkinterfaceStateMessage();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Networkinterface#targetConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNetworkinterface__TargetConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.infrastructure.Ipnetwork <em>Ipnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ipnetwork</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetwork
	 * @generated
	 */
	EClass getIpnetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkAddress <em>Occi Network Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Network Address</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkAddress()
	 * @see #getIpnetwork()
	 * @generated
	 */
	EAttribute getIpnetwork_OcciNetworkAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkGateway <em>Occi Network Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Network Gateway</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkGateway()
	 * @see #getIpnetwork()
	 * @generated
	 */
	EAttribute getIpnetwork_OcciNetworkGateway();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkAllocation <em>Occi Network Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Network Allocation</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkAllocation()
	 * @see #getIpnetwork()
	 * @generated
	 */
	EAttribute getIpnetwork_OcciNetworkAllocation();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Ipnetwork#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetwork#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIpnetwork__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface <em>Ipnetworkinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ipnetworkinterface</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface
	 * @generated
	 */
	EClass getIpnetworkinterface();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceAddress <em>Occi Networkinterface Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Networkinterface Address</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceAddress()
	 * @see #getIpnetworkinterface()
	 * @generated
	 */
	EAttribute getIpnetworkinterface_OcciNetworkinterfaceAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceGateway <em>Occi Networkinterface Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Networkinterface Gateway</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceGateway()
	 * @see #getIpnetworkinterface()
	 * @generated
	 */
	EAttribute getIpnetworkinterface_OcciNetworkinterfaceGateway();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceAllocation <em>Occi Networkinterface Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Networkinterface Allocation</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceAllocation()
	 * @see #getIpnetworkinterface()
	 * @generated
	 */
	EAttribute getIpnetworkinterface_OcciNetworkinterfaceAllocation();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIpnetworkinterface__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#IPAdressesMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>IP Adresses Must Be Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>IP Adresses Must Be Unique</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#IPAdressesMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIpnetworkinterface__IPAdressesMustBeUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.infrastructure.Os_tpl <em>Os tpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Os tpl</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Os_tpl
	 * @generated
	 */
	EClass getOs_tpl();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Os_tpl#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Os_tpl#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOs_tpl__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.infrastructure.Resource_tpl <em>Resource tpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource tpl</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Resource_tpl
	 * @generated
	 */
	EClass getResource_tpl();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Resource_tpl#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Resource_tpl#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResource_tpl__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.infrastructure.Ssh_key <em>Ssh key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ssh key</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Ssh_key
	 * @generated
	 */
	EClass getSsh_key();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.Ssh_key#getOcciCredentialsSshPublickey <em>Occi Credentials Ssh Publickey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Credentials Ssh Publickey</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Ssh_key#getOcciCredentialsSshPublickey()
	 * @see #getSsh_key()
	 * @generated
	 */
	EAttribute getSsh_key_OcciCredentialsSshPublickey();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.Ssh_key#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.Ssh_key#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSsh_key__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.infrastructure.User_data <em>User data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User data</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.User_data
	 * @generated
	 */
	EClass getUser_data();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.infrastructure.User_data#getOcciComputeUserdata <em>Occi Compute Userdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Compute Userdata</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.User_data#getOcciComputeUserdata()
	 * @see #getUser_data()
	 * @generated
	 */
	EAttribute getUser_data_OcciComputeUserdata();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.infrastructure.User_data#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.infrastructure.User_data#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUser_data__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.infrastructure.SuspendMethod <em>Suspend Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Suspend Method</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.SuspendMethod
	 * @generated
	 */
	EEnum getSuspendMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.infrastructure.NetworkStatus <em>Network Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Status</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.NetworkStatus
	 * @generated
	 */
	EEnum getNetworkStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.infrastructure.ComputeStatus <em>Compute Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compute Status</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.ComputeStatus
	 * @generated
	 */
	EEnum getComputeStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus <em>Network Interface Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Interface Status</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus
	 * @generated
	 */
	EEnum getNetworkInterfaceStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.infrastructure.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Architecture</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Architecture
	 * @generated
	 */
	EEnum getArchitecture();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.infrastructure.StopMethod <em>Stop Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stop Method</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.StopMethod
	 * @generated
	 */
	EEnum getStopMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.infrastructure.RestartMethod <em>Restart Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restart Method</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.RestartMethod
	 * @generated
	 */
	EEnum getRestartMethod();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.infrastructure.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allocation</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.Allocation
	 * @generated
	 */
	EEnum getAllocation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.infrastructure.StorageStatus <em>Storage Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Status</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.StorageStatus
	 * @generated
	 */
	EEnum getStorageStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.infrastructure.StorageLinkStatus <em>Storage Link Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Link Status</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.StorageLinkStatus
	 * @generated
	 */
	EEnum getStorageLinkStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.infrastructure.SaveMethod <em>Save Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Save Method</em>'.
	 * @see org.eclipse.cmf.occi.infrastructure.SaveMethod
	 * @generated
	 */
	EEnum getSaveMethod();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Vlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vlan</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="minInclusive='0' maxInclusive='4095'"
	 * @generated
	 */
	EDataType getVlan();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Token</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getToken();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip Address</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getIpAddress();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Core</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="minExclusive='0'"
	 * @generated
	 */
	EDataType getCore();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>GHz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GHz</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="minExclusive='0'"
	 * @generated
	 */
	EDataType getGHz();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Gi B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gi B</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="minExclusive='0'"
	 * @generated
	 */
	EDataType getGiB();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ip Address Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip Address Range</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getIpAddressRange();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mac</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getMac();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Share</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="minInclusive='0'"
	 * @generated
	 */
	EDataType getShare();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfrastructureFactory getInfrastructureFactory();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Occi Network Vlan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__OCCI_NETWORK_VLAN = eINSTANCE.getNetwork_OcciNetworkVlan();

		/**
		 * The meta object literal for the '<em><b>Occi Network Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__OCCI_NETWORK_LABEL = eINSTANCE.getNetwork_OcciNetworkLabel();

		/**
		 * The meta object literal for the '<em><b>Occi Network State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__OCCI_NETWORK_STATE = eINSTANCE.getNetwork_OcciNetworkState();

		/**
		 * The meta object literal for the '<em><b>Occi Network State Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__OCCI_NETWORK_STATE_MESSAGE = eINSTANCE.getNetwork_OcciNetworkStateMessage();

		/**
		 * The meta object literal for the '<em><b>Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NETWORK___UP = eINSTANCE.getNetwork__Up();

		/**
		 * The meta object literal for the '<em><b>Down</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NETWORK___DOWN = eINSTANCE.getNetwork__Down();

		/**
		 * The meta object literal for the '<em><b>Unique Vlan</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NETWORK___UNIQUE_VLAN__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNetwork__UniqueVlan__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl <em>Compute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getCompute()
		 * @generated
		 */
		EClass COMPUTE = eINSTANCE.getCompute();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__OCCI_COMPUTE_ARCHITECTURE = eINSTANCE.getCompute_OcciComputeArchitecture();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__OCCI_COMPUTE_CORES = eINSTANCE.getCompute_OcciComputeCores();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__OCCI_COMPUTE_HOSTNAME = eINSTANCE.getCompute_OcciComputeHostname();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Share</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__OCCI_COMPUTE_SHARE = eINSTANCE.getCompute_OcciComputeShare();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__OCCI_COMPUTE_SPEED = eINSTANCE.getCompute_OcciComputeSpeed();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__OCCI_COMPUTE_MEMORY = eINSTANCE.getCompute_OcciComputeMemory();

		/**
		 * The meta object literal for the '<em><b>Occi Compute State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__OCCI_COMPUTE_STATE = eINSTANCE.getCompute_OcciComputeState();

		/**
		 * The meta object literal for the '<em><b>Occi Compute State Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTE__OCCI_COMPUTE_STATE_MESSAGE = eINSTANCE.getCompute_OcciComputeStateMessage();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE___START = eINSTANCE.getCompute__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE___STOP__STOPMETHOD = eINSTANCE.getCompute__Stop__StopMethod();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE___RESTART__RESTARTMETHOD = eINSTANCE.getCompute__Restart__RestartMethod();

		/**
		 * The meta object literal for the '<em><b>Suspend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE___SUSPEND__SUSPENDMETHOD = eINSTANCE.getCompute__Suspend__SuspendMethod();

		/**
		 * The meta object literal for the '<em><b>Save</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTE___SAVE__SAVEMETHOD_STRING = eINSTANCE.getCompute__Save__SaveMethod_String();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.impl.StorageImpl
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Occi Storage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__OCCI_STORAGE_SIZE = eINSTANCE.getStorage_OcciStorageSize();

		/**
		 * The meta object literal for the '<em><b>Occi Storage State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__OCCI_STORAGE_STATE = eINSTANCE.getStorage_OcciStorageState();

		/**
		 * The meta object literal for the '<em><b>Occi Storage State Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__OCCI_STORAGE_STATE_MESSAGE = eINSTANCE.getStorage_OcciStorageStateMessage();

		/**
		 * The meta object literal for the '<em><b>Online</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORAGE___ONLINE = eINSTANCE.getStorage__Online();

		/**
		 * The meta object literal for the '<em><b>Offline</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORAGE___OFFLINE = eINSTANCE.getStorage__Offline();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.impl.StoragelinkImpl <em>Storagelink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.impl.StoragelinkImpl
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getStoragelink()
		 * @generated
		 */
		EClass STORAGELINK = eINSTANCE.getStoragelink();

		/**
		 * The meta object literal for the '<em><b>Occi Storagelink Deviceid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGELINK__OCCI_STORAGELINK_DEVICEID = eINSTANCE.getStoragelink_OcciStoragelinkDeviceid();

		/**
		 * The meta object literal for the '<em><b>Occi Storagelink Mountpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGELINK__OCCI_STORAGELINK_MOUNTPOINT = eINSTANCE.getStoragelink_OcciStoragelinkMountpoint();

		/**
		 * The meta object literal for the '<em><b>Occi Storagelink State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGELINK__OCCI_STORAGELINK_STATE = eINSTANCE.getStoragelink_OcciStoragelinkState();

		/**
		 * The meta object literal for the '<em><b>Occi Storagelink State Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGELINK__OCCI_STORAGELINK_STATE_MESSAGE = eINSTANCE.getStoragelink_OcciStoragelinkStateMessage();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.impl.NetworkinterfaceImpl <em>Networkinterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.impl.NetworkinterfaceImpl
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkinterface()
		 * @generated
		 */
		EClass NETWORKINTERFACE = eINSTANCE.getNetworkinterface();

		/**
		 * The meta object literal for the '<em><b>Occi Networkinterface Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE = eINSTANCE.getNetworkinterface_OcciNetworkinterfaceInterface();

		/**
		 * The meta object literal for the '<em><b>Occi Networkinterface Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC = eINSTANCE.getNetworkinterface_OcciNetworkinterfaceMac();

		/**
		 * The meta object literal for the '<em><b>Occi Networkinterface State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE = eINSTANCE.getNetworkinterface_OcciNetworkinterfaceState();

		/**
		 * The meta object literal for the '<em><b>Occi Networkinterface State Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE = eINSTANCE.getNetworkinterface_OcciNetworkinterfaceStateMessage();

		/**
		 * The meta object literal for the '<em><b>Target Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NETWORKINTERFACE___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNetworkinterface__TargetConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.impl.IpnetworkImpl <em>Ipnetwork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.impl.IpnetworkImpl
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getIpnetwork()
		 * @generated
		 */
		EClass IPNETWORK = eINSTANCE.getIpnetwork();

		/**
		 * The meta object literal for the '<em><b>Occi Network Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPNETWORK__OCCI_NETWORK_ADDRESS = eINSTANCE.getIpnetwork_OcciNetworkAddress();

		/**
		 * The meta object literal for the '<em><b>Occi Network Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPNETWORK__OCCI_NETWORK_GATEWAY = eINSTANCE.getIpnetwork_OcciNetworkGateway();

		/**
		 * The meta object literal for the '<em><b>Occi Network Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPNETWORK__OCCI_NETWORK_ALLOCATION = eINSTANCE.getIpnetwork_OcciNetworkAllocation();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPNETWORK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIpnetwork__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.impl.IpnetworkinterfaceImpl <em>Ipnetworkinterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.impl.IpnetworkinterfaceImpl
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getIpnetworkinterface()
		 * @generated
		 */
		EClass IPNETWORKINTERFACE = eINSTANCE.getIpnetworkinterface();

		/**
		 * The meta object literal for the '<em><b>Occi Networkinterface Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ADDRESS = eINSTANCE.getIpnetworkinterface_OcciNetworkinterfaceAddress();

		/**
		 * The meta object literal for the '<em><b>Occi Networkinterface Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_GATEWAY = eINSTANCE.getIpnetworkinterface_OcciNetworkinterfaceGateway();

		/**
		 * The meta object literal for the '<em><b>Occi Networkinterface Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ALLOCATION = eINSTANCE.getIpnetworkinterface_OcciNetworkinterfaceAllocation();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPNETWORKINTERFACE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIpnetworkinterface__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>IP Adresses Must Be Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPNETWORKINTERFACE___IP_ADRESSES_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIpnetworkinterface__IPAdressesMustBeUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.impl.Os_tplImpl <em>Os tpl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.impl.Os_tplImpl
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getOs_tpl()
		 * @generated
		 */
		EClass OS_TPL = eINSTANCE.getOs_tpl();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OS_TPL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOs_tpl__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.impl.Resource_tplImpl <em>Resource tpl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.impl.Resource_tplImpl
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getResource_tpl()
		 * @generated
		 */
		EClass RESOURCE_TPL = eINSTANCE.getResource_tpl();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE_TPL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getResource_tpl__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.impl.Ssh_keyImpl <em>Ssh key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.impl.Ssh_keyImpl
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getSsh_key()
		 * @generated
		 */
		EClass SSH_KEY = eINSTANCE.getSsh_key();

		/**
		 * The meta object literal for the '<em><b>Occi Credentials Ssh Publickey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSH_KEY__OCCI_CREDENTIALS_SSH_PUBLICKEY = eINSTANCE.getSsh_key_OcciCredentialsSshPublickey();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SSH_KEY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSsh_key__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.impl.User_dataImpl <em>User data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.impl.User_dataImpl
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getUser_data()
		 * @generated
		 */
		EClass USER_DATA = eINSTANCE.getUser_data();

		/**
		 * The meta object literal for the '<em><b>Occi Compute Userdata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__OCCI_COMPUTE_USERDATA = eINSTANCE.getUser_data_OcciComputeUserdata();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_DATA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUser_data__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.SuspendMethod <em>Suspend Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.SuspendMethod
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getSuspendMethod()
		 * @generated
		 */
		EEnum SUSPEND_METHOD = eINSTANCE.getSuspendMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.NetworkStatus <em>Network Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.NetworkStatus
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkStatus()
		 * @generated
		 */
		EEnum NETWORK_STATUS = eINSTANCE.getNetworkStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.ComputeStatus <em>Compute Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.ComputeStatus
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getComputeStatus()
		 * @generated
		 */
		EEnum COMPUTE_STATUS = eINSTANCE.getComputeStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus <em>Network Interface Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getNetworkInterfaceStatus()
		 * @generated
		 */
		EEnum NETWORK_INTERFACE_STATUS = eINSTANCE.getNetworkInterfaceStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.Architecture <em>Architecture</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.Architecture
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getArchitecture()
		 * @generated
		 */
		EEnum ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.StopMethod <em>Stop Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.StopMethod
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getStopMethod()
		 * @generated
		 */
		EEnum STOP_METHOD = eINSTANCE.getStopMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.RestartMethod <em>Restart Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.RestartMethod
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getRestartMethod()
		 * @generated
		 */
		EEnum RESTART_METHOD = eINSTANCE.getRestartMethod();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.Allocation <em>Allocation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.Allocation
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getAllocation()
		 * @generated
		 */
		EEnum ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.StorageStatus <em>Storage Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.StorageStatus
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getStorageStatus()
		 * @generated
		 */
		EEnum STORAGE_STATUS = eINSTANCE.getStorageStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.StorageLinkStatus <em>Storage Link Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.StorageLinkStatus
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getStorageLinkStatus()
		 * @generated
		 */
		EEnum STORAGE_LINK_STATUS = eINSTANCE.getStorageLinkStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.infrastructure.SaveMethod <em>Save Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.infrastructure.SaveMethod
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getSaveMethod()
		 * @generated
		 */
		EEnum SAVE_METHOD = eINSTANCE.getSaveMethod();

		/**
		 * The meta object literal for the '<em>Vlan</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getVlan()
		 * @generated
		 */
		EDataType VLAN = eINSTANCE.getVlan();

		/**
		 * The meta object literal for the '<em>Token</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getToken()
		 * @generated
		 */
		EDataType TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em>Ip Address</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getIpAddress()
		 * @generated
		 */
		EDataType IP_ADDRESS = eINSTANCE.getIpAddress();

		/**
		 * The meta object literal for the '<em>Core</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getCore()
		 * @generated
		 */
		EDataType CORE = eINSTANCE.getCore();

		/**
		 * The meta object literal for the '<em>GHz</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getGHz()
		 * @generated
		 */
		EDataType GHZ = eINSTANCE.getGHz();

		/**
		 * The meta object literal for the '<em>Gi B</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getGiB()
		 * @generated
		 */
		EDataType GI_B = eINSTANCE.getGiB();

		/**
		 * The meta object literal for the '<em>Ip Address Range</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getIpAddressRange()
		 * @generated
		 */
		EDataType IP_ADDRESS_RANGE = eINSTANCE.getIpAddressRange();

		/**
		 * The meta object literal for the '<em>Mac</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getMac()
		 * @generated
		 */
		EDataType MAC = eINSTANCE.getMac();

		/**
		 * The meta object literal for the '<em>Share</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.cmf.occi.infrastructure.impl.InfrastructurePackageImpl#getShare()
		 * @generated
		 */
		EDataType SHARE = eINSTANCE.getShare();

	}

} //InfrastructurePackage
