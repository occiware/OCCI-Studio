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
 * - Philippe Merle <philippe.merle@inria.fr>
 */
package org.eclipse.cmf.occi.core.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.OCCIFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.EnumerationLiteral#EnumerationLiteralNameRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Enumeration Literal Name Regex</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EnumerationLiteralTest extends TestCase {

	/**
	 * The fixture for this Enumeration Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteral fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumerationLiteralTest.class);
	}

	/**
	 * Constructs a new Enumeration Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteralTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Enumeration Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EnumerationLiteral fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Enumeration Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteral getFixture() {
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
		setFixture(OCCIFactory.eINSTANCE.createEnumerationLiteral());
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
	 * Tests the '{@link org.eclipse.cmf.occi.core.EnumerationLiteral#EnumerationLiteralNameRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Enumeration Literal Name Regex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.EnumerationLiteral#EnumerationLiteralNameRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testEnumerationLiteralNameRegex__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

	/**
	 * Empty test to avoid "No tests found" JUnit failure.
	 */
	public void testEmpty() {
	}

} //EnumerationLiteralTest
