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

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;
import org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ipnetworkinterface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#IPAdressesMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>IP Adresses Must Be Unique</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class IpnetworkinterfaceTest extends TestCase {

	/**
	 * The fixture for this Ipnetworkinterface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ipnetworkinterface fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IpnetworkinterfaceTest.class);
	}

	/**
	 * Constructs a new Ipnetworkinterface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpnetworkinterfaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ipnetworkinterface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ipnetworkinterface fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ipnetworkinterface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ipnetworkinterface getFixture() {
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
		setFixture(InfrastructureFactory.eINSTANCE.createIpnetworkinterface());
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
	 * Tests the '{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testAppliesConstraint__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#IPAdressesMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>IP Adresses Must Be Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#IPAdressesMustBeUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testIPAdressesMustBeUnique__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

} //IpnetworkinterfaceTest
