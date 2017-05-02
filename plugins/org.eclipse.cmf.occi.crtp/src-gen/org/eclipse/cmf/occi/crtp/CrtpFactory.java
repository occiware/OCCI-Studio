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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.crtp.CrtpPackage
 * @generated
 */
public interface CrtpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CrtpFactory eINSTANCE = org.eclipse.cmf.occi.crtp.impl.CrtpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Small</em>'.
	 * @generated
	 */
	Small createSmall();

	/**
	 * Returns a new object of class '<em>Medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medium</em>'.
	 * @generated
	 */
	Medium createMedium();

	/**
	 * Returns a new object of class '<em>Large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Large</em>'.
	 * @generated
	 */
	Large createLarge();

	/**
	 * Returns a new object of class '<em>Mem small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mem small</em>'.
	 * @generated
	 */
	Mem_small createMem_small();

	/**
	 * Returns a new object of class '<em>Mem medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mem medium</em>'.
	 * @generated
	 */
	Mem_medium createMem_medium();

	/**
	 * Returns a new object of class '<em>Mem large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mem large</em>'.
	 * @generated
	 */
	Mem_large createMem_large();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CrtpPackage getCrtpPackage();

} //CrtpFactory
