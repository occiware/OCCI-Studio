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
package org.eclipse.cmf.occi.sla;

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
 * @see org.eclipse.cmf.occi.sla.SlaFactory
 * @model kind="package"
 * @generated
 */
public interface SlaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sla";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/occi/sla/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sla";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlaPackage eINSTANCE = org.eclipse.cmf.occi.sla.impl.SlaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.sla.impl.AgreementImpl <em>Agreement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.sla.impl.AgreementImpl
	 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreement()
	 * @generated
	 */
	int AGREEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Agreement State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__OCCI_AGREEMENT_STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Agreement Agreed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__OCCI_AGREEMENT_AGREED_AT = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Agreement Effective From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_FROM = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Agreement Effective Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_UNTIL = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT___ACCEPT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Reject</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT___REJECT = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT___SUSPEND = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT___RESUME = OCCIPackage.RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT___TERMINATE = OCCIPackage.RESOURCE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Agreement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.sla.impl.Agreement_linkImpl <em>Agreement link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.sla.impl.Agreement_linkImpl
	 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreement_link()
	 * @generated
	 */
	int AGREEMENT_LINK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__ID = OCCIPackage.LINK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__TITLE = OCCIPackage.LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__KIND = OCCIPackage.LINK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__LOCATION = OCCIPackage.LINK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__ATTRIBUTES = OCCIPackage.LINK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__MIXINS = OCCIPackage.LINK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__PARTS = OCCIPackage.LINK__PARTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__SOURCE = OCCIPackage.LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK__TARGET = OCCIPackage.LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Agreement link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK_FEATURE_COUNT = OCCIPackage.LINK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK___OCCI_CREATE = OCCIPackage.LINK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK___OCCI_RETRIEVE = OCCIPackage.LINK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK___OCCI_UPDATE = OCCIPackage.LINK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK___OCCI_DELETE = OCCIPackage.LINK___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Agreement link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_LINK_OPERATION_COUNT = OCCIPackage.LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.sla.impl.Agreement_tplImpl <em>Agreement tpl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.sla.impl.Agreement_tplImpl
	 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreement_tpl()
	 * @generated
	 */
	int AGREEMENT_TPL = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TPL__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TPL__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TPL__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Agreement tpl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TPL_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TPL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agreement tpl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TPL_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.sla.impl.Agreement_termImpl <em>Agreement term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.sla.impl.Agreement_termImpl
	 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreement_term()
	 * @generated
	 */
	int AGREEMENT_TERM = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Agreement term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agreement term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREEMENT_TERM_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.sla.AgreementStatus <em>Agreement Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.sla.AgreementStatus
	 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreementStatus()
	 * @generated
	 */
	int AGREEMENT_STATUS = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.sla.AgreementTermType <em>Agreement Term Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.sla.AgreementTermType
	 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreementTermType()
	 * @generated
	 */
	int AGREEMENT_TERM_TYPE = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.sla.AgreementTermStatus <em>Agreement Term Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.sla.AgreementTermStatus
	 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreementTermStatus()
	 * @generated
	 */
	int AGREEMENT_TERM_STATUS = 6;

	/**
	 * The meta object id for the '<em>Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.sla.Agreement <em>Agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement
	 * @generated
	 */
	EClass getAgreement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementState <em>Occi Agreement State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Agreement State</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementState()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_OcciAgreementState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementAgreedAt <em>Occi Agreement Agreed At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Agreement Agreed At</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementAgreedAt()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_OcciAgreementAgreedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementEffectiveFrom <em>Occi Agreement Effective From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Agreement Effective From</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementEffectiveFrom()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_OcciAgreementEffectiveFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementEffectiveUntil <em>Occi Agreement Effective Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Agreement Effective Until</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementEffectiveUntil()
	 * @see #getAgreement()
	 * @generated
	 */
	EAttribute getAgreement_OcciAgreementEffectiveUntil();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.sla.Agreement#accept() <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see org.eclipse.cmf.occi.sla.Agreement#accept()
	 * @generated
	 */
	EOperation getAgreement__Accept();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.sla.Agreement#reject() <em>Reject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reject</em>' operation.
	 * @see org.eclipse.cmf.occi.sla.Agreement#reject()
	 * @generated
	 */
	EOperation getAgreement__Reject();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.sla.Agreement#suspend() <em>Suspend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspend</em>' operation.
	 * @see org.eclipse.cmf.occi.sla.Agreement#suspend()
	 * @generated
	 */
	EOperation getAgreement__Suspend();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.sla.Agreement#resume() <em>Resume</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume</em>' operation.
	 * @see org.eclipse.cmf.occi.sla.Agreement#resume()
	 * @generated
	 */
	EOperation getAgreement__Resume();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.sla.Agreement#terminate() <em>Terminate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Terminate</em>' operation.
	 * @see org.eclipse.cmf.occi.sla.Agreement#terminate()
	 * @generated
	 */
	EOperation getAgreement__Terminate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.sla.Agreement_link <em>Agreement link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement link</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement_link
	 * @generated
	 */
	EClass getAgreement_link();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.sla.Agreement_tpl <em>Agreement tpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement tpl</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement_tpl
	 * @generated
	 */
	EClass getAgreement_tpl();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.sla.Agreement_tpl#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.sla.Agreement_tpl#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAgreement_tpl__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.sla.Agreement_term <em>Agreement term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agreement term</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement_term
	 * @generated
	 */
	EClass getAgreement_term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermType <em>Occi Agreement Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Agreement Term Type</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermType()
	 * @see #getAgreement_term()
	 * @generated
	 */
	EAttribute getAgreement_term_OcciAgreementTermType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermState <em>Occi Agreement Term State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Agreement Term State</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermState()
	 * @see #getAgreement_term()
	 * @generated
	 */
	EAttribute getAgreement_term_OcciAgreementTermState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermDesc <em>Occi Agreement Term Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Agreement Term Desc</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermDesc()
	 * @see #getAgreement_term()
	 * @generated
	 */
	EAttribute getAgreement_term_OcciAgreementTermDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermRemedy <em>Occi Agreement Term Remedy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occi Agreement Term Remedy</em>'.
	 * @see org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermRemedy()
	 * @see #getAgreement_term()
	 * @generated
	 */
	EAttribute getAgreement_term_OcciAgreementTermRemedy();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.sla.Agreement_term#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.eclipse.cmf.occi.sla.Agreement_term#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAgreement_term__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.sla.AgreementStatus <em>Agreement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agreement Status</em>'.
	 * @see org.eclipse.cmf.occi.sla.AgreementStatus
	 * @generated
	 */
	EEnum getAgreementStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.sla.AgreementTermType <em>Agreement Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agreement Term Type</em>'.
	 * @see org.eclipse.cmf.occi.sla.AgreementTermType
	 * @generated
	 */
	EEnum getAgreementTermType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.cmf.occi.sla.AgreementTermStatus <em>Agreement Term Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agreement Term Status</em>'.
	 * @see org.eclipse.cmf.occi.sla.AgreementTermStatus
	 * @generated
	 */
	EEnum getAgreementTermStatus();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='^(\\d{4}((-)?(0[1-9]|1[0-2])((-)?(0[1-9]|[1-2][0-9]|3[0-1])(T(24:00(:00(\\.[0]+)?)?|(([0-1][0-9]|2[0-3])(:)[0-5][0-9])((:)[0-5][0-9](\\.[\\d]+)?)?)((\\+|-)(14:00|(0[0-9]|1[0-3])(:)[0-5][0-9])|Z))?)?)?)$'"
	 * @generated
	 */
	EDataType getDateTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SlaFactory getSlaFactory();

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
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.sla.impl.AgreementImpl <em>Agreement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.sla.impl.AgreementImpl
		 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreement()
		 * @generated
		 */
		EClass AGREEMENT = eINSTANCE.getAgreement();

		/**
		 * The meta object literal for the '<em><b>Occi Agreement State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__OCCI_AGREEMENT_STATE = eINSTANCE.getAgreement_OcciAgreementState();

		/**
		 * The meta object literal for the '<em><b>Occi Agreement Agreed At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__OCCI_AGREEMENT_AGREED_AT = eINSTANCE.getAgreement_OcciAgreementAgreedAt();

		/**
		 * The meta object literal for the '<em><b>Occi Agreement Effective From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_FROM = eINSTANCE.getAgreement_OcciAgreementEffectiveFrom();

		/**
		 * The meta object literal for the '<em><b>Occi Agreement Effective Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_UNTIL = eINSTANCE.getAgreement_OcciAgreementEffectiveUntil();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGREEMENT___ACCEPT = eINSTANCE.getAgreement__Accept();

		/**
		 * The meta object literal for the '<em><b>Reject</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGREEMENT___REJECT = eINSTANCE.getAgreement__Reject();

		/**
		 * The meta object literal for the '<em><b>Suspend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGREEMENT___SUSPEND = eINSTANCE.getAgreement__Suspend();

		/**
		 * The meta object literal for the '<em><b>Resume</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGREEMENT___RESUME = eINSTANCE.getAgreement__Resume();

		/**
		 * The meta object literal for the '<em><b>Terminate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGREEMENT___TERMINATE = eINSTANCE.getAgreement__Terminate();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.sla.impl.Agreement_linkImpl <em>Agreement link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.sla.impl.Agreement_linkImpl
		 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreement_link()
		 * @generated
		 */
		EClass AGREEMENT_LINK = eINSTANCE.getAgreement_link();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.sla.impl.Agreement_tplImpl <em>Agreement tpl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.sla.impl.Agreement_tplImpl
		 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreement_tpl()
		 * @generated
		 */
		EClass AGREEMENT_TPL = eINSTANCE.getAgreement_tpl();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGREEMENT_TPL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAgreement_tpl__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.sla.impl.Agreement_termImpl <em>Agreement term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.sla.impl.Agreement_termImpl
		 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreement_term()
		 * @generated
		 */
		EClass AGREEMENT_TERM = eINSTANCE.getAgreement_term();

		/**
		 * The meta object literal for the '<em><b>Occi Agreement Term Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE = eINSTANCE.getAgreement_term_OcciAgreementTermType();

		/**
		 * The meta object literal for the '<em><b>Occi Agreement Term State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE = eINSTANCE.getAgreement_term_OcciAgreementTermState();

		/**
		 * The meta object literal for the '<em><b>Occi Agreement Term Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC = eINSTANCE.getAgreement_term_OcciAgreementTermDesc();

		/**
		 * The meta object literal for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY = eINSTANCE.getAgreement_term_OcciAgreementTermRemedy();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGREEMENT_TERM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAgreement_term__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.sla.AgreementStatus <em>Agreement Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.sla.AgreementStatus
		 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreementStatus()
		 * @generated
		 */
		EEnum AGREEMENT_STATUS = eINSTANCE.getAgreementStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.sla.AgreementTermType <em>Agreement Term Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.sla.AgreementTermType
		 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreementTermType()
		 * @generated
		 */
		EEnum AGREEMENT_TERM_TYPE = eINSTANCE.getAgreementTermType();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.sla.AgreementTermStatus <em>Agreement Term Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.sla.AgreementTermStatus
		 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getAgreementTermStatus()
		 * @generated
		 */
		EEnum AGREEMENT_TERM_STATUS = eINSTANCE.getAgreementTermStatus();

		/**
		 * The meta object literal for the '<em>Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.cmf.occi.sla.impl.SlaPackageImpl#getDateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getDateTime();

	}

} //SlaPackage
