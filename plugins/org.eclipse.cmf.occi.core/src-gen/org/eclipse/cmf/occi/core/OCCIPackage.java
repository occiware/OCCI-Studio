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
package org.eclipse.cmf.occi.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.cmf.occi.core.OCCIFactory
 * @model kind="package"
 * @generated
 */
public interface OCCIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "occi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/occi/core/ecore/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "occi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OCCIPackage eINSTANCE = org.eclipse.cmf.occi.impl.OCCIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.CategoryImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TERM = 1;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SCHEME = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ATTRIBUTES = 4;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = 0;

	/**
	 * The operation id for the '<em>Identity Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = 1;

	/**
	 * The operation id for the '<em>Scheme Ends With Sharp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP_1 = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.ConstraintImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BODY = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.TypeImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TERM = CATEGORY__TERM;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SCHEME = CATEGORY__SCHEME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TITLE = CATEGORY__TITLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ATTRIBUTES = CATEGORY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ACTIONS = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CONSTRAINTS = CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = CATEGORY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Identity Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = CATEGORY___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Scheme Ends With Sharp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP_1 = CATEGORY___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Action Term Unicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP_1 = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Constraint Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___CONSTRAINT_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = CATEGORY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.FSMImpl <em>FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.FSMImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getFSM()
	 * @generated
	 */
	int FSM = 3;

	/**
	 * The feature id for the '<em><b>Owned State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__OWNED_STATE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Attribute Type Must Be EEnum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM___ATTRIBUTE_TYPE_MUST_BE_EENUM__DIAGNOSTICCHAIN_MAP_1 = 0;

	/**
	 * The operation id for the '<em>Contained Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM___CONTAINED_ATTRIBUTE__DIAGNOSTICCHAIN_MAP_1 = 1;

	/**
	 * The number of operations of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.StateImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getState()
	 * @generated
	 */
	int STATE = 4;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INITIAL = 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FINAL = 2;

	/**
	 * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_FSM = 3;

	/**
	 * The feature id for the '<em><b>Outgoing Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Incoming Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITION = 5;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>State Literal Already Defined In FSM Attribute Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___STATE_LITERAL_ALREADY_DEFINED_IN_FSM_ATTRIBUTE_TYPE__DIAGNOSTICCHAIN_MAP_1 = 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.TransitionImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Contained Action Must Be Declared In The Appropriate Kind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___CONTAINED_ACTION_MUST_BE_DECLARED_IN_THE_APPROPRIATE_KIND__DIAGNOSTICCHAIN_MAP_1 = 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.AttributeImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MUTABLE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.KindImpl <em>Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.KindImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getKind()
	 * @generated
	 */
	int KIND = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__TERM = TYPE__TERM;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__SCHEME = TYPE__SCHEME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__TITLE = TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__ATTRIBUTES = TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__ACTIONS = TYPE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__CONSTRAINTS = TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__PARENT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__ENTITIES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND__FSM = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = TYPE___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Identity Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = TYPE___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Scheme Ends With Sharp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP_1 = TYPE___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Action Term Unicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP_1 = TYPE___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Constraint Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___CONSTRAINT_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = TYPE___CONSTRAINT_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>No Cyclic Inheritance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP_1 = TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Attributes Name Not Already Defined In Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT__DIAGNOSTICCHAIN_MAP_1 = TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Correct Scheme</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP_1 = TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Entity Kind Is Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND___ENTITY_KIND_IS_ROOT_PARENT__DIAGNOSTICCHAIN_MAP_1 = TYPE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_OPERATION_COUNT = TYPE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.ActionImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TERM = CATEGORY__TERM;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SCHEME = CATEGORY__SCHEME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TITLE = CATEGORY__TITLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ATTRIBUTES = CATEGORY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = CATEGORY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Identity Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = CATEGORY___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Scheme Ends With Sharp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP_1 = CATEGORY___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Contained Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___CONTAINED_ACTION__DIAGNOSTICCHAIN_MAP_1 = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Correct Scheme</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP_1 = CATEGORY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.MixinImpl <em>Mixin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.MixinImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getMixin()
	 * @generated
	 */
	int MIXIN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__TERM = TYPE__TERM;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__SCHEME = TYPE__SCHEME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__TITLE = TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__ATTRIBUTES = TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__ACTIONS = TYPE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__CONSTRAINTS = TYPE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__DEPENDS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__APPLIES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN__ENTITIES = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = TYPE___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Identity Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = TYPE___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Scheme Ends With Sharp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP_1 = TYPE___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Action Term Unicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP_1 = TYPE___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Constraint Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___CONSTRAINT_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = TYPE___CONSTRAINT_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Correct Scheme</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP_1 = TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>No Cyclic Inheritance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP_1 = TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Attributes Name Not Already Defined In Depends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS__DIAGNOSTICCHAIN_MAP_1 = TYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mixin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_OPERATION_COUNT = TYPE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.EntityImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KIND = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MIXINS = 5;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PARTS = 6;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___OCCI_CREATE = 0;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___OCCI_RETRIEVE = 1;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___OCCI_UPDATE = 2;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___OCCI_DELETE = 3;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = 4;

	/**
	 * The operation id for the '<em>Kind Compatible With One Applies Of Each Mixin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP_1 = 5;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = 6;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.MixinBaseImpl <em>Mixin Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.MixinBaseImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getMixinBase()
	 * @generated
	 */
	int MIXIN_BASE = 11;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_BASE__MIXIN = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_BASE__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_BASE__ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Mixin Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_BASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mixin Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXIN_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.AttributeStateImpl <em>Attribute State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.AttributeStateImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getAttributeState()
	 * @generated
	 */
	int ATTRIBUTE_STATE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.ResourceImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TITLE = ENTITY__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__KIND = ENTITY__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LOCATION = ENTITY__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ATTRIBUTES = ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MIXINS = ENTITY__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PARTS = ENTITY__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SUMMARY = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LINKS = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RLINKS = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___OCCI_CREATE = ENTITY___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___OCCI_RETRIEVE = ENTITY___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___OCCI_UPDATE = ENTITY___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___OCCI_DELETE = ENTITY___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Kind Compatible With One Applies Of Each Mixin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP_1 = ENTITY___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___ID_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Resource Kind Is In Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___RESOURCE_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP_1 = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.LinkImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ID = ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = ENTITY__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__KIND = ENTITY__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LOCATION = ENTITY__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ATTRIBUTES = ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__MIXINS = ENTITY__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PARTS = ENTITY__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_CREATE = ENTITY___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_RETRIEVE = ENTITY___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_UPDATE = ENTITY___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___OCCI_DELETE = ENTITY___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Attributes Name Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Kind Compatible With One Applies Of Each Mixin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP_1 = ENTITY___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Id Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___ID_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP_1;

	/**
	 * The operation id for the '<em>Link Kind Is In Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___LINK_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP_1 = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.ExtensionImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__SCHEME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Kinds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__KINDS = 4;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__MIXINS = 5;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__TYPES = 6;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__SPECIFICATION = 7;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Kinds Scheme Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___KINDS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP_1 = 0;

	/**
	 * The operation id for the '<em>Kind Parent Local Or Imported</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___KIND_PARENT_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP_1 = 1;

	/**
	 * The operation id for the '<em>Mixins Scheme Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___MIXINS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP_1 = 2;

	/**
	 * The operation id for the '<em>Term Unicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___TERM_UNICITY__DIAGNOSTICCHAIN_MAP_1 = 3;

	/**
	 * The operation id for the '<em>Mixin Applies Local Or Imported</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___MIXIN_APPLIES_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP_1 = 4;

	/**
	 * The operation id for the '<em>Scheme Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___SCHEME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = 5;

	/**
	 * The operation id for the '<em>Mixin Depends Local Or Imported</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___MIXIN_DEPENDS_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP_1 = 6;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.ConfigurationImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__USE = 2;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MIXINS = 4;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>All Mixins Are Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_MIXINS_ARE_TAGS__DIAGNOSTICCHAIN_MAP_1 = 0;

	/**
	 * The operation id for the '<em>All Resources Links Targets In Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP_1 = 1;

	/**
	 * The operation id for the '<em>All Resources Kinds In Use</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_RESOURCES_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP_1 = 2;

	/**
	 * The operation id for the '<em>All Resources Links Mixins In Use</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_RESOURCES_LINKS_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP_1 = 3;

	/**
	 * The operation id for the '<em>All Resources Mixins In Use</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_RESOURCES_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP_1 = 4;

	/**
	 * The operation id for the '<em>All Resources Links Kinds In Use</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION___ALL_RESOURCES_LINKS_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP_1 = 5;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.DataTypeImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DOCUMENTATION = 1;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.BasicTypeImpl <em>Basic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.BasicTypeImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__DOCUMENTATION = DATA_TYPE__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.StringTypeImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__NAME = BASIC_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__DOCUMENTATION = BASIC_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__PATTERN = BASIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__LENGTH = BASIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__MIN_LENGTH = BASIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__MAX_LENGTH = BASIC_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = BASIC_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = BASIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.BooleanTypeImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.NumericTypeImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getNumericType()
	 * @generated
	 */
	int NUMERIC_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.EObjectTypeImpl <em>EObject Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.EObjectTypeImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getEObjectType()
	 * @generated
	 */
	int EOBJECT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TYPE__NAME = BASIC_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TYPE__DOCUMENTATION = BASIC_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TYPE__INSTANCE_CLASS_NAME = BASIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TYPE__PATTERN = BASIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EObject Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TYPE_FEATURE_COUNT = BASIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EObject Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TYPE_OPERATION_COUNT = BASIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__NAME = BASIC_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__DOCUMENTATION = BASIC_TYPE__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = BASIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = BASIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__NAME = BASIC_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__DOCUMENTATION = BASIC_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__TYPE = BASIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Total Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__TOTAL_DIGITS = BASIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__MIN_EXCLUSIVE = BASIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__MAX_EXCLUSIVE = BASIC_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__MIN_INCLUSIVE = BASIC_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__MAX_INCLUSIVE = BASIC_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_FEATURE_COUNT = BASIC_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_OPERATION_COUNT = BASIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.EnumerationTypeImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__DOCUMENTATION = DATA_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__LITERALS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.EnumerationLiteralImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Enumeration Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__ENUMERATION_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.RecordTypeImpl <em>Record Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.RecordTypeImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getRecordType()
	 * @generated
	 */
	int RECORD_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__DOCUMENTATION = DATA_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Record Filed Declarations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE__RECORD_FILED_DECLARATIONS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.RecordFieldDeclarationImpl <em>Record Field Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.RecordFieldDeclarationImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getRecordFieldDeclaration()
	 * @generated
	 */
	int RECORD_FIELD_DECLARATION = 26;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FIELD_DECLARATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FIELD_DECLARATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Record Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FIELD_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Record Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FIELD_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.ArrayTypeImpl
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DOCUMENTATION = DATA_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.core.NumericTypeEnum <em>Numeric Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.NumericTypeEnum
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getNumericTypeEnum()
	 * @generated
	 */
	int NUMERIC_TYPE_ENUM = 28;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getURI()
	 * @generated
	 */
	int URI = 29;

	/**
	 * The meta object id for the '<em>OCL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getOCL()
	 * @generated
	 */
	int OCL = 30;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getString()
	 * @generated
	 */
	int STRING = 31;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 32;

	/**
	 * The meta object id for the '<em>Attribute Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getAttributeName()
	 * @generated
	 */
	int ATTRIBUTE_NAME = 33;

	/**
	 * The meta object id for the '<em>Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 34;

	/**
	 * The meta object id for the '<em>Scheme</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getScheme()
	 * @generated
	 */
	int SCHEME = 35;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.eclipse.cmf.occi.core.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.core.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Category#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.cmf.occi.core.Category#getTerm()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Category#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see org.eclipse.cmf.occi.core.Category#getScheme()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Scheme();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Category#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.cmf.occi.core.Category#getTitle()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.Category#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.cmf.occi.core.Category#getAttributes()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Attributes();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Category#AttributesNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attributes Name Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attributes Name Unique</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Category#AttributesNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCategory__AttributesNameUnique__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Category#IdentityUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Identity Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identity Unique</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Category#IdentityUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCategory__IdentityUnique__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Category#SchemeEndsWithSharp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Scheme Ends With Sharp</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scheme Ends With Sharp</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Category#SchemeEndsWithSharp(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCategory__SchemeEndsWithSharp__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.eclipse.cmf.occi.core.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.core.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Constraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.cmf.occi.core.Constraint#getDescription()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Constraint#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.cmf.occi.core.Constraint#getBody()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.cmf.occi.core.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.Type#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.cmf.occi.core.Type#getActions()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.Type#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.eclipse.cmf.occi.core.Type#getConstraints()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Constraints();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Type#ActionTermUnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Action Term Unicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action Term Unicity</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Type#ActionTermUnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getType__ActionTermUnicity__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Type#ConstraintNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint Name Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint Name Unique</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Type#ConstraintNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getType__ConstraintNameUnique__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.FSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM</em>'.
	 * @see org.eclipse.cmf.occi.core.FSM
	 * @generated
	 */
	EClass getFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.FSM#getOwnedState <em>Owned State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned State</em>'.
	 * @see org.eclipse.cmf.occi.core.FSM#getOwnedState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_OwnedState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cmf.occi.core.FSM#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.eclipse.cmf.occi.core.FSM#getAttribute()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_Attribute();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.FSM#AttributeTypeMustBeEEnum(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attribute Type Must Be EEnum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attribute Type Must Be EEnum</em>' operation.
	 * @see org.eclipse.cmf.occi.core.FSM#AttributeTypeMustBeEEnum(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFSM__AttributeTypeMustBeEEnum__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.FSM#containedAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contained Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contained Attribute</em>' operation.
	 * @see org.eclipse.cmf.occi.core.FSM#containedAttribute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFSM__ContainedAttribute__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.eclipse.cmf.occi.core.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cmf.occi.core.State#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see org.eclipse.cmf.occi.core.State#getLiteral()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Literal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.State#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see org.eclipse.cmf.occi.core.State#isInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Initial();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.State#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.eclipse.cmf.occi.core.State#isFinal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Final();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.cmf.occi.core.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning FSM</em>'.
	 * @see org.eclipse.cmf.occi.core.State#getOwningFSM()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.State#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Transition</em>'.
	 * @see org.eclipse.cmf.occi.core.State#getOutgoingTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransition();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cmf.occi.core.State#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transition</em>'.
	 * @see org.eclipse.cmf.occi.core.State#getIncomingTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransition();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.State#StateLiteralAlreadyDefinedInFSMAttributeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>State Literal Already Defined In FSM Attribute Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>State Literal Already Defined In FSM Attribute Type</em>' operation.
	 * @see org.eclipse.cmf.occi.core.State#StateLiteralAlreadyDefinedInFSMAttributeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getState__StateLiteralAlreadyDefinedInFSMAttributeType__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.eclipse.cmf.occi.core.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.cmf.occi.core.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see org.eclipse.cmf.occi.core.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cmf.occi.core.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.cmf.occi.core.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cmf.occi.core.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see org.eclipse.cmf.occi.core.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Action();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Transition#containedActionMustBeDeclaredInTheAppropriateKind(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contained Action Must Be Declared In The Appropriate Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contained Action Must Be Declared In The Appropriate Kind</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Transition#containedActionMustBeDeclaredInTheAppropriateKind(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTransition__ContainedActionMustBeDeclaredInTheAppropriateKind__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.eclipse.cmf.occi.core.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.core.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Attribute#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see org.eclipse.cmf.occi.core.Attribute#isMutable()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Mutable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Attribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.eclipse.cmf.occi.core.Attribute#isRequired()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.eclipse.cmf.occi.core.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.cmf.occi.core.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Description();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cmf.occi.core.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.cmf.occi.core.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind</em>'.
	 * @see org.eclipse.cmf.occi.core.Kind
	 * @generated
	 */
	EClass getKind();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cmf.occi.core.Kind#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.cmf.occi.core.Kind#getParent()
	 * @see #getKind()
	 * @generated
	 */
	EReference getKind_Parent();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cmf.occi.core.Kind#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see org.eclipse.cmf.occi.core.Kind#getEntities()
	 * @see #getKind()
	 * @generated
	 */
	EReference getKind_Entities();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.core.Kind#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fsm</em>'.
	 * @see org.eclipse.cmf.occi.core.Kind#getFsm()
	 * @see #getKind()
	 * @generated
	 */
	EReference getKind_Fsm();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Kind#NoCyclicInheritance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Cyclic Inheritance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Cyclic Inheritance</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Kind#NoCyclicInheritance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKind__NoCyclicInheritance__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Kind#AttributesNameNotAlreadyDefinedInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attributes Name Not Already Defined In Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attributes Name Not Already Defined In Parent</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Kind#AttributesNameNotAlreadyDefinedInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKind__AttributesNameNotAlreadyDefinedInParent__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Kind#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Correct Scheme</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Correct Scheme</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Kind#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKind__CorrectScheme__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Kind#EntityKindIsRootParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Entity Kind Is Root Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entity Kind Is Root Parent</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Kind#EntityKindIsRootParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKind__EntityKindIsRootParent__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.eclipse.cmf.occi.core.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Action#containedAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contained Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contained Action</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Action#containedAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAction__ContainedAction__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Action#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Correct Scheme</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Correct Scheme</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Action#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAction__CorrectScheme__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Mixin <em>Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixin</em>'.
	 * @see org.eclipse.cmf.occi.core.Mixin
	 * @generated
	 */
	EClass getMixin();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cmf.occi.core.Mixin#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends</em>'.
	 * @see org.eclipse.cmf.occi.core.Mixin#getDepends()
	 * @see #getMixin()
	 * @generated
	 */
	EReference getMixin_Depends();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cmf.occi.core.Mixin#getApplies <em>Applies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies</em>'.
	 * @see org.eclipse.cmf.occi.core.Mixin#getApplies()
	 * @see #getMixin()
	 * @generated
	 */
	EReference getMixin_Applies();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cmf.occi.core.Mixin#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see org.eclipse.cmf.occi.core.Mixin#getEntities()
	 * @see #getMixin()
	 * @generated
	 */
	EReference getMixin_Entities();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Mixin#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Correct Scheme</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Correct Scheme</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Mixin#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMixin__CorrectScheme__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Mixin#NoCyclicInheritance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Cyclic Inheritance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Cyclic Inheritance</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Mixin#NoCyclicInheritance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMixin__NoCyclicInheritance__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Mixin#AttributesNameNotAlreadyDefinedInDepends(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attributes Name Not Already Defined In Depends</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attributes Name Not Already Defined In Depends</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Mixin#AttributesNameNotAlreadyDefinedInDepends(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMixin__AttributesNameNotAlreadyDefinedInDepends__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.eclipse.cmf.occi.core.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.cmf.occi.core.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Entity#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.cmf.occi.core.Entity#getTitle()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Title();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cmf.occi.core.Entity#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kind</em>'.
	 * @see org.eclipse.cmf.occi.core.Entity#getKind()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Entity#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.cmf.occi.core.Entity#getLocation()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.cmf.occi.core.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cmf.occi.core.Entity#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mixins</em>'.
	 * @see org.eclipse.cmf.occi.core.Entity#getMixins()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Mixins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.Entity#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.eclipse.cmf.occi.core.Entity#getParts()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Parts();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Entity#occiCreate() <em>Occi Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Occi Create</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Entity#occiCreate()
	 * @generated
	 */
	EOperation getEntity__OcciCreate();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Entity#occiRetrieve() <em>Occi Retrieve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Occi Retrieve</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Entity#occiRetrieve()
	 * @generated
	 */
	EOperation getEntity__OcciRetrieve();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Entity#occiUpdate() <em>Occi Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Occi Update</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Entity#occiUpdate()
	 * @generated
	 */
	EOperation getEntity__OcciUpdate();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Entity#occiDelete() <em>Occi Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Occi Delete</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Entity#occiDelete()
	 * @generated
	 */
	EOperation getEntity__OcciDelete();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Entity#AttributesNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attributes Name Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attributes Name Unique</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Entity#AttributesNameUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__AttributesNameUnique__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Entity#KindCompatibleWithOneAppliesOfEachMixin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Kind Compatible With One Applies Of Each Mixin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kind Compatible With One Applies Of Each Mixin</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Entity#KindCompatibleWithOneAppliesOfEachMixin(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__KindCompatibleWithOneAppliesOfEachMixin__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Entity#IdUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id Unique</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Entity#IdUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntity__IdUnique__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.MixinBase <em>Mixin Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixin Base</em>'.
	 * @see org.eclipse.cmf.occi.core.MixinBase
	 * @generated
	 */
	EClass getMixinBase();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cmf.occi.core.MixinBase#getMixin <em>Mixin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mixin</em>'.
	 * @see org.eclipse.cmf.occi.core.MixinBase#getMixin()
	 * @see #getMixinBase()
	 * @generated
	 */
	EReference getMixinBase_Mixin();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.cmf.occi.core.MixinBase#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see org.eclipse.cmf.occi.core.MixinBase#getEntity()
	 * @see #getMixinBase()
	 * @generated
	 */
	EReference getMixinBase_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.MixinBase#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.cmf.occi.core.MixinBase#getAttributes()
	 * @see #getMixinBase()
	 * @generated
	 */
	EReference getMixinBase_Attributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.AttributeState <em>Attribute State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute State</em>'.
	 * @see org.eclipse.cmf.occi.core.AttributeState
	 * @generated
	 */
	EClass getAttributeState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.AttributeState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.core.AttributeState#getName()
	 * @see #getAttributeState()
	 * @generated
	 */
	EAttribute getAttributeState_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.AttributeState#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.cmf.occi.core.AttributeState#getValue()
	 * @see #getAttributeState()
	 * @generated
	 */
	EAttribute getAttributeState_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.eclipse.cmf.occi.core.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Resource#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.eclipse.cmf.occi.core.Resource#getSummary()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Summary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.Resource#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.eclipse.cmf.occi.core.Resource#getLinks()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Links();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cmf.occi.core.Resource#getRlinks <em>Rlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rlinks</em>'.
	 * @see org.eclipse.cmf.occi.core.Resource#getRlinks()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Rlinks();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Resource#ResourceKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Resource Kind Is In Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resource Kind Is In Parent</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Resource#ResourceKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResource__ResourceKindIsInParent__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.eclipse.cmf.occi.core.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.cmf.occi.core.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see org.eclipse.cmf.occi.core.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cmf.occi.core.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.cmf.occi.core.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Link#LinkKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Link Kind Is In Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Link Kind Is In Parent</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Link#LinkKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLink__LinkKindIsInParent__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.eclipse.cmf.occi.core.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Extension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.core.Extension#getName()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Extension#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see org.eclipse.cmf.occi.core.Extension#getScheme()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Scheme();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Extension#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.cmf.occi.core.Extension#getDescription()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cmf.occi.core.Extension#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Import</em>'.
	 * @see org.eclipse.cmf.occi.core.Extension#getImport()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.Extension#getKinds <em>Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kinds</em>'.
	 * @see org.eclipse.cmf.occi.core.Extension#getKinds()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Kinds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.Extension#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mixins</em>'.
	 * @see org.eclipse.cmf.occi.core.Extension#getMixins()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Mixins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.Extension#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.eclipse.cmf.occi.core.Extension#getTypes()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Types();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Extension#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.eclipse.cmf.occi.core.Extension#getSpecification()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Specification();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Extension#KindsSchemeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Kinds Scheme Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kinds Scheme Valid</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Extension#KindsSchemeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__KindsSchemeValid__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Extension#KindParentLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Kind Parent Local Or Imported</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kind Parent Local Or Imported</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Extension#KindParentLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__KindParentLocalOrImported__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Extension#MixinsSchemeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Mixins Scheme Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mixins Scheme Valid</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Extension#MixinsSchemeValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__MixinsSchemeValid__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Extension#TermUnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Term Unicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Term Unicity</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Extension#TermUnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__TermUnicity__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Extension#MixinAppliesLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Mixin Applies Local Or Imported</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mixin Applies Local Or Imported</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Extension#MixinAppliesLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__MixinAppliesLocalOrImported__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Extension#SchemeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Scheme Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scheme Unique</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Extension#SchemeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__SchemeUnique__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Extension#MixinDependsLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Mixin Depends Local Or Imported</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mixin Depends Local Or Imported</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Extension#MixinDependsLocalOrImported(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__MixinDependsLocalOrImported__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.eclipse.cmf.occi.core.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Configuration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.cmf.occi.core.Configuration#getDescription()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.Configuration#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.cmf.occi.core.Configuration#getLocation()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Location();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cmf.occi.core.Configuration#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use</em>'.
	 * @see org.eclipse.cmf.occi.core.Configuration#getUse()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Use();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.Configuration#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.eclipse.cmf.occi.core.Configuration#getResources()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.Configuration#getMixins <em>Mixins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mixins</em>'.
	 * @see org.eclipse.cmf.occi.core.Configuration#getMixins()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Mixins();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Configuration#AllMixinsAreTags(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Mixins Are Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Mixins Are Tags</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Configuration#AllMixinsAreTags(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllMixinsAreTags__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Configuration#AllResourcesLinksTargetsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Resources Links Targets In Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Resources Links Targets In Configuration</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Configuration#AllResourcesLinksTargetsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllResourcesLinksTargetsInConfiguration__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Configuration#AllResourcesKindsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Resources Kinds In Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Resources Kinds In Use</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Configuration#AllResourcesKindsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllResourcesKindsInUse__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Configuration#AllResourcesLinksMixinsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Resources Links Mixins In Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Resources Links Mixins In Use</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Configuration#AllResourcesLinksMixinsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllResourcesLinksMixinsInUse__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Configuration#AllResourcesMixinsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Resources Mixins In Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Resources Mixins In Use</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Configuration#AllResourcesMixinsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllResourcesMixinsInUse__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.core.Configuration#AllResourcesLinksKindsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All Resources Links Kinds In Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Resources Links Kinds In Use</em>' operation.
	 * @see org.eclipse.cmf.occi.core.Configuration#AllResourcesLinksKindsInUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConfiguration__AllResourcesLinksKindsInUse__DiagnosticChain_Map_1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.eclipse.cmf.occi.core.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.DataType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.cmf.occi.core.DataType#getDocumentation()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.core.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type</em>'.
	 * @see org.eclipse.cmf.occi.core.BasicType
	 * @generated
	 */
	EClass getBasicType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see org.eclipse.cmf.occi.core.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.StringType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.eclipse.cmf.occi.core.StringType#getPattern()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.StringType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.cmf.occi.core.StringType#getLength()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.StringType#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see org.eclipse.cmf.occi.core.StringType#getMinLength()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.StringType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.eclipse.cmf.occi.core.StringType#getMaxLength()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_MaxLength();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.EObjectType <em>EObject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Type</em>'.
	 * @see org.eclipse.cmf.occi.core.EObjectType
	 * @generated
	 */
	EClass getEObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.EObjectType#getInstanceClassName <em>Instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class Name</em>'.
	 * @see org.eclipse.cmf.occi.core.EObjectType#getInstanceClassName()
	 * @see #getEObjectType()
	 * @generated
	 */
	EAttribute getEObjectType_InstanceClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.EObjectType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.eclipse.cmf.occi.core.EObjectType#getPattern()
	 * @see #getEObjectType()
	 * @generated
	 */
	EAttribute getEObjectType_Pattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see org.eclipse.cmf.occi.core.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see org.eclipse.cmf.occi.core.NumericType
	 * @generated
	 */
	EClass getNumericType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.NumericType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.cmf.occi.core.NumericType#getType()
	 * @see #getNumericType()
	 * @generated
	 */
	EAttribute getNumericType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.NumericType#getTotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Digits</em>'.
	 * @see org.eclipse.cmf.occi.core.NumericType#getTotalDigits()
	 * @see #getNumericType()
	 * @generated
	 */
	EAttribute getNumericType_TotalDigits();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.NumericType#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Exclusive</em>'.
	 * @see org.eclipse.cmf.occi.core.NumericType#getMinExclusive()
	 * @see #getNumericType()
	 * @generated
	 */
	EAttribute getNumericType_MinExclusive();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.NumericType#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Exclusive</em>'.
	 * @see org.eclipse.cmf.occi.core.NumericType#getMaxExclusive()
	 * @see #getNumericType()
	 * @generated
	 */
	EAttribute getNumericType_MaxExclusive();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.NumericType#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Inclusive</em>'.
	 * @see org.eclipse.cmf.occi.core.NumericType#getMinInclusive()
	 * @see #getNumericType()
	 * @generated
	 */
	EAttribute getNumericType_MinInclusive();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.NumericType#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Inclusive</em>'.
	 * @see org.eclipse.cmf.occi.core.NumericType#getMaxInclusive()
	 * @see #getNumericType()
	 * @generated
	 */
	EAttribute getNumericType_MaxInclusive();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see org.eclipse.cmf.occi.core.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.core.EnumerationType#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclipse.cmf.occi.core.EnumerationType#getLiterals()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_Literals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see org.eclipse.cmf.occi.core.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.EnumerationLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.core.EnumerationLiteral#getName()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EAttribute getEnumerationLiteral_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.cmf.occi.core.EnumerationLiteral#getEnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enumeration Type</em>'.
	 * @see org.eclipse.cmf.occi.core.EnumerationLiteral#getEnumerationType()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EReference getEnumerationLiteral_EnumerationType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.RecordType <em>Record Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Type</em>'.
	 * @see org.eclipse.cmf.occi.core.RecordType
	 * @generated
	 */
	EClass getRecordType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.cmf.occi.core.RecordType#getRecordFiledDeclarations <em>Record Filed Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Record Filed Declarations</em>'.
	 * @see org.eclipse.cmf.occi.core.RecordType#getRecordFiledDeclarations()
	 * @see #getRecordType()
	 * @generated
	 */
	EReference getRecordType_RecordFiledDeclarations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.RecordFieldDeclaration <em>Record Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Field Declaration</em>'.
	 * @see org.eclipse.cmf.occi.core.RecordFieldDeclaration
	 * @generated
	 */
	EClass getRecordFieldDeclaration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cmf.occi.core.RecordFieldDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.cmf.occi.core.RecordFieldDeclaration#getType()
	 * @see #getRecordFieldDeclaration()
	 * @generated
	 */
	EReference getRecordFieldDeclaration_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.core.RecordFieldDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.core.RecordFieldDeclaration#getName()
	 * @see #getRecordFieldDeclaration()
	 * @generated
	 */
	EAttribute getRecordFieldDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.core.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see org.eclipse.cmf.occi.core.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.cmf.occi.core.ArrayType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.cmf.occi.core.ArrayType#getType()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Type();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.core.NumericTypeEnum <em>Numeric Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Numeric Type Enum</em>'.
	 * @see org.eclipse.cmf.occi.core.NumericTypeEnum
	 * @generated
	 */
	EEnum getNumericTypeEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='[A-Za-z][A-Za-z0-9+-\\.]*:(//(([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:]|%[0-9A-Fa-f]{2})*@)?(\\[(((([0-9A-Fa-f]{1,4}:){6}|::([0-9A-Fa-f]{1,4}:){5}|([0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){4}|(([0-9A-Fa-f]{1,4}:){0,1}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){3}|(([0-9A-Fa-f]{1,4}:){0,2}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){2}|(([0-9A-Fa-f]{1,4}:){0,3}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:)|(([0-9A-Fa-f]{1,4}:){0,4}[0-9A-Fa-f]{1,4})?::)([0-9A-Fa-f]{1,4}:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]))|(([0-9A-Fa-f]{1,4}:){0,5}[0-9A-Fa-f]{1,4})?::[0-9A-Fa-f]{1,4}|(([0-9A-Fa-f]{1,4}:){0,6}[0-9A-Fa-f]{1,4})?::)|[Vv][0-9A-Fa-f]+\\.[A-Za-z0-9\\-_~\\.!$&\'()*+,;=:]+)\\]|((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])|([A-Za-z0-9\\-_~\\.!$&\'()*+,;=]|%[0-9A-Fa-f]{2})*)(:[0-9]*)?(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*|/(([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})+(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*)?|([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})+(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*|.{0})(\\?([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@/?]|%[0-9A-Fa-f]{2})*)?(\\#([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@/?]|%[0-9A-Fa-f]{2})*)?'"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>OCL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OCL</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getOCL();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Attribute Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*'"
	 * @generated
	 */
	EDataType getAttributeName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='[a-zA-Z][a-zA-Z0-9_-]*'"
	 * @generated
	 */
	EDataType getName_();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scheme</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='[A-Za-z][A-Za-z0-9+-\\.]*:(//(([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:]|%[0-9A-Fa-f]{2})*@)?(\\[(((([0-9A-Fa-f]{1,4}:){6}|::([0-9A-Fa-f]{1,4}:){5}|([0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){4}|(([0-9A-Fa-f]{1,4}:){0,1}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){3}|(([0-9A-Fa-f]{1,4}:){0,2}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:){2}|(([0-9A-Fa-f]{1,4}:){0,3}[0-9A-Fa-f]{1,4})?::([0-9A-Fa-f]{1,4}:)|(([0-9A-Fa-f]{1,4}:){0,4}[0-9A-Fa-f]{1,4})?::)([0-9A-Fa-f]{1,4}:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]))|(([0-9A-Fa-f]{1,4}:){0,5}[0-9A-Fa-f]{1,4})?::[0-9A-Fa-f]{1,4}|(([0-9A-Fa-f]{1,4}:){0,6}[0-9A-Fa-f]{1,4})?::)|[Vv][0-9A-Fa-f]+\\.[A-Za-z0-9\\-_~\\.!$&\'()*+,;=:]+)\\]|((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9])|([A-Za-z0-9\\-_~\\.!$&\'()*+,;=]|%[0-9A-Fa-f]{2})*)(:[0-9]*)?(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*|/(([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})+(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*)?|([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})+(/([A-Za-z0-9\\-_~\\.!$&\'()*+,;=:@]|%[0-9A-Fa-f]{2})*)*|.{0})(\\#)'"
	 * @generated
	 */
	EDataType getScheme();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OCCIFactory getOCCIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.CategoryImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TERM = eINSTANCE.getCategory_Term();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__SCHEME = eINSTANCE.getCategory_Scheme();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TITLE = eINSTANCE.getCategory_Title();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ATTRIBUTES = eINSTANCE.getCategory_Attributes();

		/**
		 * The meta object literal for the '<em><b>Attributes Name Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getCategory__AttributesNameUnique__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Identity Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___IDENTITY_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getCategory__IdentityUnique__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Scheme Ends With Sharp</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___SCHEME_ENDS_WITH_SHARP__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getCategory__SchemeEndsWithSharp__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.ConstraintImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__DESCRIPTION = eINSTANCE.getConstraint_Description();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__BODY = eINSTANCE.getConstraint_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.TypeImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ACTIONS = eINSTANCE.getType_Actions();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__CONSTRAINTS = eINSTANCE.getType_Constraints();

		/**
		 * The meta object literal for the '<em><b>Action Term Unicity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getType__ActionTermUnicity__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Constraint Name Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE___CONSTRAINT_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getType__ConstraintNameUnique__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.FSMImpl <em>FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.FSMImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getFSM()
		 * @generated
		 */
		EClass FSM = eINSTANCE.getFSM();

		/**
		 * The meta object literal for the '<em><b>Owned State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__OWNED_STATE = eINSTANCE.getFSM_OwnedState();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__ATTRIBUTE = eINSTANCE.getFSM_Attribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Type Must Be EEnum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FSM___ATTRIBUTE_TYPE_MUST_BE_EENUM__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getFSM__AttributeTypeMustBeEEnum__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Contained Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FSM___CONTAINED_ATTRIBUTE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getFSM__ContainedAttribute__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.StateImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__LITERAL = eINSTANCE.getState_Literal();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__INITIAL = eINSTANCE.getState_Initial();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__FINAL = eINSTANCE.getState_Final();

		/**
		 * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITION = eINSTANCE.getState_OutgoingTransition();

		/**
		 * The meta object literal for the '<em><b>Incoming Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITION = eINSTANCE.getState_IncomingTransition();

		/**
		 * The meta object literal for the '<em><b>State Literal Already Defined In FSM Attribute Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___STATE_LITERAL_ALREADY_DEFINED_IN_FSM_ATTRIBUTE_TYPE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getState__StateLiteralAlreadyDefinedInFSMAttributeType__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.TransitionImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '<em><b>Contained Action Must Be Declared In The Appropriate Kind</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___CONTAINED_ACTION_MUST_BE_DECLARED_IN_THE_APPROPRIATE_KIND__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getTransition__ContainedActionMustBeDeclaredInTheAppropriateKind__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.AttributeImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MUTABLE = eINSTANCE.getAttribute_Mutable();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REQUIRED = eINSTANCE.getAttribute_Required();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.KindImpl <em>Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.KindImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getKind()
		 * @generated
		 */
		EClass KIND = eINSTANCE.getKind();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND__PARENT = eINSTANCE.getKind_Parent();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND__ENTITIES = eINSTANCE.getKind_Entities();

		/**
		 * The meta object literal for the '<em><b>Fsm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND__FSM = eINSTANCE.getKind_Fsm();

		/**
		 * The meta object literal for the '<em><b>No Cyclic Inheritance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KIND___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getKind__NoCyclicInheritance__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Attributes Name Not Already Defined In Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KIND___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getKind__AttributesNameNotAlreadyDefinedInParent__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Correct Scheme</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KIND___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getKind__CorrectScheme__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Entity Kind Is Root Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KIND___ENTITY_KIND_IS_ROOT_PARENT__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getKind__EntityKindIsRootParent__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.ActionImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Contained Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___CONTAINED_ACTION__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getAction__ContainedAction__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Correct Scheme</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getAction__CorrectScheme__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.MixinImpl <em>Mixin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.MixinImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getMixin()
		 * @generated
		 */
		EClass MIXIN = eINSTANCE.getMixin();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN__DEPENDS = eINSTANCE.getMixin_Depends();

		/**
		 * The meta object literal for the '<em><b>Applies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN__APPLIES = eINSTANCE.getMixin_Applies();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN__ENTITIES = eINSTANCE.getMixin_Entities();

		/**
		 * The meta object literal for the '<em><b>Correct Scheme</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIXIN___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getMixin__CorrectScheme__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>No Cyclic Inheritance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIXIN___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getMixin__NoCyclicInheritance__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Attributes Name Not Already Defined In Depends</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIXIN___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_DEPENDS__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getMixin__AttributesNameNotAlreadyDefinedInDepends__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.EntityImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__TITLE = eINSTANCE.getEntity_Title();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__KIND = eINSTANCE.getEntity_Kind();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__LOCATION = eINSTANCE.getEntity_Location();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__MIXINS = eINSTANCE.getEntity_Mixins();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PARTS = eINSTANCE.getEntity_Parts();

		/**
		 * The meta object literal for the '<em><b>Occi Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___OCCI_CREATE = eINSTANCE.getEntity__OcciCreate();

		/**
		 * The meta object literal for the '<em><b>Occi Retrieve</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___OCCI_RETRIEVE = eINSTANCE.getEntity__OcciRetrieve();

		/**
		 * The meta object literal for the '<em><b>Occi Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___OCCI_UPDATE = eINSTANCE.getEntity__OcciUpdate();

		/**
		 * The meta object literal for the '<em><b>Occi Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___OCCI_DELETE = eINSTANCE.getEntity__OcciDelete();

		/**
		 * The meta object literal for the '<em><b>Attributes Name Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___ATTRIBUTES_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getEntity__AttributesNameUnique__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Kind Compatible With One Applies Of Each Mixin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___KIND_COMPATIBLE_WITH_ONE_APPLIES_OF_EACH_MIXIN__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getEntity__KindCompatibleWithOneAppliesOfEachMixin__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Id Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___ID_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getEntity__IdUnique__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.MixinBaseImpl <em>Mixin Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.MixinBaseImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getMixinBase()
		 * @generated
		 */
		EClass MIXIN_BASE = eINSTANCE.getMixinBase();

		/**
		 * The meta object literal for the '<em><b>Mixin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN_BASE__MIXIN = eINSTANCE.getMixinBase_Mixin();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN_BASE__ENTITY = eINSTANCE.getMixinBase_Entity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXIN_BASE__ATTRIBUTES = eINSTANCE.getMixinBase_Attributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.AttributeStateImpl <em>Attribute State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.AttributeStateImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getAttributeState()
		 * @generated
		 */
		EClass ATTRIBUTE_STATE = eINSTANCE.getAttributeState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_STATE__NAME = eINSTANCE.getAttributeState_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_STATE__VALUE = eINSTANCE.getAttributeState_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.ResourceImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__SUMMARY = eINSTANCE.getResource_Summary();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__LINKS = eINSTANCE.getResource_Links();

		/**
		 * The meta object literal for the '<em><b>Rlinks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RLINKS = eINSTANCE.getResource_Rlinks();

		/**
		 * The meta object literal for the '<em><b>Resource Kind Is In Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESOURCE___RESOURCE_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getResource__ResourceKindIsInParent__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.LinkImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '<em><b>Link Kind Is In Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___LINK_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getLink__LinkKindIsInParent__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.ExtensionImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__NAME = eINSTANCE.getExtension_Name();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__SCHEME = eINSTANCE.getExtension_Scheme();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__DESCRIPTION = eINSTANCE.getExtension_Description();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__IMPORT = eINSTANCE.getExtension_Import();

		/**
		 * The meta object literal for the '<em><b>Kinds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__KINDS = eINSTANCE.getExtension_Kinds();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__MIXINS = eINSTANCE.getExtension_Mixins();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__TYPES = eINSTANCE.getExtension_Types();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__SPECIFICATION = eINSTANCE.getExtension_Specification();

		/**
		 * The meta object literal for the '<em><b>Kinds Scheme Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___KINDS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getExtension__KindsSchemeValid__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Kind Parent Local Or Imported</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___KIND_PARENT_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getExtension__KindParentLocalOrImported__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Mixins Scheme Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___MIXINS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getExtension__MixinsSchemeValid__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Term Unicity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___TERM_UNICITY__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getExtension__TermUnicity__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Mixin Applies Local Or Imported</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___MIXIN_APPLIES_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getExtension__MixinAppliesLocalOrImported__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Scheme Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___SCHEME_UNIQUE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getExtension__SchemeUnique__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>Mixin Depends Local Or Imported</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___MIXIN_DEPENDS_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getExtension__MixinDependsLocalOrImported__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.ConfigurationImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__DESCRIPTION = eINSTANCE.getConfiguration_Description();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__LOCATION = eINSTANCE.getConfiguration_Location();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__USE = eINSTANCE.getConfiguration_Use();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__RESOURCES = eINSTANCE.getConfiguration_Resources();

		/**
		 * The meta object literal for the '<em><b>Mixins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__MIXINS = eINSTANCE.getConfiguration_Mixins();

		/**
		 * The meta object literal for the '<em><b>All Mixins Are Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_MIXINS_ARE_TAGS__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getConfiguration__AllMixinsAreTags__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>All Resources Links Targets In Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getConfiguration__AllResourcesLinksTargetsInConfiguration__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>All Resources Kinds In Use</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_RESOURCES_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getConfiguration__AllResourcesKindsInUse__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>All Resources Links Mixins In Use</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_RESOURCES_LINKS_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getConfiguration__AllResourcesLinksMixinsInUse__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>All Resources Mixins In Use</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_RESOURCES_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getConfiguration__AllResourcesMixinsInUse__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '<em><b>All Resources Links Kinds In Use</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURATION___ALL_RESOURCES_LINKS_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP_1 = eINSTANCE.getConfiguration__AllResourcesLinksKindsInUse__DiagnosticChain_Map_1();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.DataTypeImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__DOCUMENTATION = eINSTANCE.getDataType_Documentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.BasicTypeImpl <em>Basic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.BasicTypeImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getBasicType()
		 * @generated
		 */
		EClass BASIC_TYPE = eINSTANCE.getBasicType();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.StringTypeImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__PATTERN = eINSTANCE.getStringType_Pattern();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__LENGTH = eINSTANCE.getStringType_Length();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__MIN_LENGTH = eINSTANCE.getStringType_MinLength();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__MAX_LENGTH = eINSTANCE.getStringType_MaxLength();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.EObjectTypeImpl <em>EObject Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.EObjectTypeImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getEObjectType()
		 * @generated
		 */
		EClass EOBJECT_TYPE = eINSTANCE.getEObjectType();

		/**
		 * The meta object literal for the '<em><b>Instance Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOBJECT_TYPE__INSTANCE_CLASS_NAME = eINSTANCE.getEObjectType_InstanceClassName();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EOBJECT_TYPE__PATTERN = eINSTANCE.getEObjectType_Pattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.BooleanTypeImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.NumericTypeImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getNumericType()
		 * @generated
		 */
		EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_TYPE__TYPE = eINSTANCE.getNumericType_Type();

		/**
		 * The meta object literal for the '<em><b>Total Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_TYPE__TOTAL_DIGITS = eINSTANCE.getNumericType_TotalDigits();

		/**
		 * The meta object literal for the '<em><b>Min Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_TYPE__MIN_EXCLUSIVE = eINSTANCE.getNumericType_MinExclusive();

		/**
		 * The meta object literal for the '<em><b>Max Exclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_TYPE__MAX_EXCLUSIVE = eINSTANCE.getNumericType_MaxExclusive();

		/**
		 * The meta object literal for the '<em><b>Min Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_TYPE__MIN_INCLUSIVE = eINSTANCE.getNumericType_MinInclusive();

		/**
		 * The meta object literal for the '<em><b>Max Inclusive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_TYPE__MAX_INCLUSIVE = eINSTANCE.getNumericType_MaxInclusive();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.EnumerationTypeImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__LITERALS = eINSTANCE.getEnumerationType_Literals();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.EnumerationLiteralImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL__NAME = eINSTANCE.getEnumerationLiteral_Name();

		/**
		 * The meta object literal for the '<em><b>Enumeration Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL__ENUMERATION_TYPE = eINSTANCE.getEnumerationLiteral_EnumerationType();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.RecordTypeImpl <em>Record Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.RecordTypeImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getRecordType()
		 * @generated
		 */
		EClass RECORD_TYPE = eINSTANCE.getRecordType();

		/**
		 * The meta object literal for the '<em><b>Record Filed Declarations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_TYPE__RECORD_FILED_DECLARATIONS = eINSTANCE.getRecordType_RecordFiledDeclarations();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.RecordFieldDeclarationImpl <em>Record Field Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.RecordFieldDeclarationImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getRecordFieldDeclaration()
		 * @generated
		 */
		EClass RECORD_FIELD_DECLARATION = eINSTANCE.getRecordFieldDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_FIELD_DECLARATION__TYPE = eINSTANCE.getRecordFieldDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_FIELD_DECLARATION__NAME = eINSTANCE.getRecordFieldDeclaration_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.ArrayTypeImpl
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__TYPE = eINSTANCE.getArrayType_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.core.NumericTypeEnum <em>Numeric Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.core.NumericTypeEnum
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getNumericTypeEnum()
		 * @generated
		 */
		EEnum NUMERIC_TYPE_ENUM = eINSTANCE.getNumericTypeEnum();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>OCL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getOCL()
		 * @generated
		 */
		EDataType OCL = eINSTANCE.getOCL();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Attribute Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getAttributeName()
		 * @generated
		 */
		EDataType ATTRIBUTE_NAME = eINSTANCE.getAttributeName();

		/**
		 * The meta object literal for the '<em>Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getName_()
		 * @generated
		 */
		EDataType NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em>Scheme</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.impl.OCCIPackageImpl#getScheme()
		 * @generated
		 */
		EDataType SCHEME = eINSTANCE.getScheme();

	}

} //OCCIPackage
