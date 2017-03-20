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
package org.eclipse.cmf.occi.tests;

import junit.textui.TestRunner;

import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.OCCIFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EObject Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EObjectTypeTest extends BasicTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EObjectTypeTest.class);
	}

	/**
	 * Constructs a new EObject Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this EObject Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EObjectType getFixture() {
		return (EObjectType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OCCIFactory.eINSTANCE.createEObjectType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EObjectTypeTest
