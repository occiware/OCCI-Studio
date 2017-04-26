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

import junit.textui.TestRunner;

import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#getEntities() <em>Entities</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#occiIsKindOf(org.eclipse.cmf.occi.core.Kind) <em>Occi Is Kind Of</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Correct Scheme</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#targetReferenceInvariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Reference Invariant</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#NoCyclicInheritance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Cyclic Inheritance</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#EntityKindIsRootParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Entity Kind Is Root Parent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#AttributesNameNotAlreadyDefinedInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attributes Name Not Already Defined In Parent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Kind#sourceReferenceInvariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Reference Invariant</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class KindTest extends TypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KindTest.class);
	}

	/**
	 * Constructs a new Kind test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Kind test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Kind getFixture() {
		return (Kind)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OCCIFactory.eINSTANCE.createKind());
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
	 * Tests the '{@link org.eclipse.cmf.occi.core.Kind#getEntities() <em>Entities</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.Kind#getEntities()
	 * @generated NOT
	 */
	public void testGetEntities() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.core.Kind#occiIsKindOf(org.eclipse.cmf.occi.core.Kind) <em>Occi Is Kind Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.Kind#occiIsKindOf(org.eclipse.cmf.occi.core.Kind)
	 * @generated NOT
	 */
	public void testOcciIsKindOf__Kind() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.core.Kind#NoCyclicInheritance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Cyclic Inheritance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.Kind#NoCyclicInheritance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testNoCyclicInheritance__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.core.Kind#AttributesNameNotAlreadyDefinedInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Attributes Name Not Already Defined In Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.Kind#AttributesNameNotAlreadyDefinedInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testAttributesNameNotAlreadyDefinedInParent__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.core.Kind#sourceReferenceInvariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Reference Invariant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.Kind#sourceReferenceInvariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testSourceReferenceInvariant__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.core.Kind#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Correct Scheme</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.Kind#CorrectScheme(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testCorrectScheme__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.core.Kind#targetReferenceInvariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Target Reference Invariant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.Kind#targetReferenceInvariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testTargetReferenceInvariant__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.core.Kind#EntityKindIsRootParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Entity Kind Is Root Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.Kind#EntityKindIsRootParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testEntityKindIsRootParent__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

} //KindTest
