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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.sla.SlaPackage
 * @generated
 */
public interface SlaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlaFactory eINSTANCE = org.eclipse.cmf.occi.sla.impl.SlaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Agreement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agreement</em>'.
	 * @generated
	 */
	Agreement createAgreement();

	/**
	 * Returns a new object of class '<em>Agreement link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agreement link</em>'.
	 * @generated
	 */
	Agreement_link createAgreement_link();

	/**
	 * Returns a new object of class '<em>Agreement tpl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agreement tpl</em>'.
	 * @generated
	 */
	Agreement_tpl createAgreement_tpl();

	/**
	 * Returns a new object of class '<em>Agreement term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agreement term</em>'.
	 * @generated
	 */
	Agreement_term createAgreement_term();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SlaPackage getSlaPackage();

} //SlaFactory
