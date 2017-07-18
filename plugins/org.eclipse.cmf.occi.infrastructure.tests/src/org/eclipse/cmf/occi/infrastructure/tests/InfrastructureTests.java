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
package org.eclipse.cmf.occi.infrastructure.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>infrastructure</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new InfrastructureTests("infrastructure Tests");
		suite.addTestSuite(NetworkTest.class);
		suite.addTestSuite(ComputeTest.class);
		suite.addTestSuite(StorageTest.class);
		suite.addTestSuite(StoragelinkTest.class);
		suite.addTestSuite(NetworkinterfaceTest.class);
		suite.addTestSuite(IpnetworkTest.class);
		suite.addTestSuite(IpnetworkinterfaceTest.class);
		suite.addTestSuite(Os_tplTest.class);
		suite.addTestSuite(Resource_tplTest.class);
		suite.addTestSuite(Ssh_keyTest.class);
		suite.addTestSuite(User_dataTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureTests(String name) {
		super(name);
	}

} //InfrastructureTests
