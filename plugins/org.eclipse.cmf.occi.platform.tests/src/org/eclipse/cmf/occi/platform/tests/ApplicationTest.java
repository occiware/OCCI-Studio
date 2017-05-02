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

import org.eclipse.cmf.occi.platform.Application;
import org.eclipse.cmf.occi.platform.PlatformFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.platform.Application#start() <em>Start</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.Application#stop() <em>Stop</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ApplicationTest extends TestCase {

	/**
	 * The fixture for this Application test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Application fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApplicationTest.class);
	}

	/**
	 * Constructs a new Application test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Application test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Application fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Application test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Application getFixture() {
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
		setFixture(PlatformFactory.eINSTANCE.createApplication());
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

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.platform.Application#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.platform.Application#start()
	 * @generated
	 */
	public void testStart() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.platform.Application#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.platform.Application#stop()
	 * @generated
	 */
	public void testStop() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ApplicationTest
