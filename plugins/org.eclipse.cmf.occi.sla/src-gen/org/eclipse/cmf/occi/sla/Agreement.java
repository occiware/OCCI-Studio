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

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Service Level Agreement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementState <em>Occi Agreement State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementAgreedAt <em>Occi Agreement Agreed At</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementEffectiveFrom <em>Occi Agreement Effective From</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementEffectiveUntil <em>Occi Agreement Effective Until</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.sla.SlaPackage#getAgreement()
 * @model
 * @generated
 */
public interface Agreement extends Resource {
	/**
	 * Returns the value of the '<em><b>Occi Agreement State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.sla.AgreementStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current state of the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Agreement State</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementStatus
	 * @see #setOcciAgreementState(AgreementStatus)
	 * @see org.eclipse.cmf.occi.sla.SlaPackage#getAgreement_OcciAgreementState()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!occiAgreementState'"
	 * @generated
	 */
	AgreementStatus getOcciAgreementState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementState <em>Occi Agreement State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Agreement State</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementStatus
	 * @see #getOcciAgreementState()
	 * @generated
	 */
	void setOcciAgreementState(AgreementStatus value);

	/**
	 * Returns the value of the '<em><b>Occi Agreement Agreed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point in time when the agreement was made
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Agreement Agreed At</em>' attribute.
	 * @see #setOcciAgreementAgreedAt(String)
	 * @see org.eclipse.cmf.occi.sla.SlaPackage#getAgreement_OcciAgreementAgreedAt()
	 * @model dataType="org.eclipse.cmf.occi.sla.DateTime"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!occiAgreementAgreedAt'"
	 * @generated
	 */
	String getOcciAgreementAgreedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementAgreedAt <em>Occi Agreement Agreed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Agreement Agreed At</em>' attribute.
	 * @see #getOcciAgreementAgreedAt()
	 * @generated
	 */
	void setOcciAgreementAgreedAt(String value);

	/**
	 * Returns the value of the '<em><b>Occi Agreement Effective From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point in time when the agreement’s effectiveness begins
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Agreement Effective From</em>' attribute.
	 * @see #setOcciAgreementEffectiveFrom(String)
	 * @see org.eclipse.cmf.occi.sla.SlaPackage#getAgreement_OcciAgreementEffectiveFrom()
	 * @model dataType="org.eclipse.cmf.occi.sla.DateTime"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!occiAgreementEffectiveFrom'"
	 * @generated
	 */
	String getOcciAgreementEffectiveFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementEffectiveFrom <em>Occi Agreement Effective From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Agreement Effective From</em>' attribute.
	 * @see #getOcciAgreementEffectiveFrom()
	 * @generated
	 */
	void setOcciAgreementEffectiveFrom(String value);

	/**
	 * Returns the value of the '<em><b>Occi Agreement Effective Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point in time when the agreement’s effectiveness ends
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Agreement Effective Until</em>' attribute.
	 * @see #setOcciAgreementEffectiveUntil(String)
	 * @see org.eclipse.cmf.occi.sla.SlaPackage#getAgreement_OcciAgreementEffectiveUntil()
	 * @model dataType="org.eclipse.cmf.occi.sla.DateTime"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!occiAgreementEffectiveUntil'"
	 * @generated
	 */
	String getOcciAgreementEffectiveUntil();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.sla.Agreement#getOcciAgreementEffectiveUntil <em>Occi Agreement Effective Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Agreement Effective Until</em>' attribute.
	 * @see #getOcciAgreementEffectiveUntil()
	 * @generated
	 */
	void setOcciAgreementEffectiveUntil(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!accept()'"
	 * @generated
	 */
	void accept();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!reject()'"
	 * @generated
	 */
	void reject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!suspend()'"
	 * @generated
	 */
	void suspend();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!resume()'"
	 * @generated
	 */
	void resume();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement!terminate()'"
	 * @generated
	 */
	void terminate();

} // Agreement
