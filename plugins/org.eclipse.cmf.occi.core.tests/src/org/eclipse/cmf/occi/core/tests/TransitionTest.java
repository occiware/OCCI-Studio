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

import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Transition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Transition#containedActionMustBeDeclaredInTheAppropriateType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contained Action Must Be Declared In The Appropriate Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TransitionTest extends TestCase {

	/**
	 * The fixture for this Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransitionTest.class);
	}

	/**
	 * Constructs a new Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Transition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transition getFixture() {
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
		setFixture(OCCIFactory.eINSTANCE.createTransition());
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
	 * Tests the '{@link org.eclipse.cmf.occi.core.Transition#containedActionMustBeDeclaredInTheAppropriateType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contained Action Must Be Declared In The Appropriate Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.Transition#containedActionMustBeDeclaredInTheAppropriateType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testContainedActionMustBeDeclaredInTheAppropriateType__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.core.Transition#containedActionMustBeDeclaredInTheAppropriateKind(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Contained Action Must Be Declared In The Appropriate Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.Transition#containedActionMustBeDeclaredInTheAppropriateKind(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testContainedActionMustBeDeclaredInTheAppropriateKind__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

} //TransitionTest
