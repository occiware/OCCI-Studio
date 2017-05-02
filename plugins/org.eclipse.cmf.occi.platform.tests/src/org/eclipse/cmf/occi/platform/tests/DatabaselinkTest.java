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
package org.eclipse.cmf.occi.platform.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.cmf.occi.platform.Databaselink;
import org.eclipse.cmf.occi.platform.PlatformFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Databaselink</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaselinkTest extends TestCase {

	/**
	 * The fixture for this Databaselink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Databaselink fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DatabaselinkTest.class);
	}

	/**
	 * Constructs a new Databaselink test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaselinkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Databaselink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Databaselink fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Databaselink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Databaselink getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatformFactory.eINSTANCE.createDatabaselink());
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

} //DatabaselinkTest
