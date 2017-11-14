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

import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.RecordField;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Record Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.RecordField#TypeDifferentContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Type Different Container</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.RecordField#RecordFieldNameRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Record Field Name Regex</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.RecordField#ContainerMustBeRecordType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Container Must Be Record Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RecordFieldTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecordFieldTest.class);
	}

	/**
	 * Constructs a new Record Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Record Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RecordField getFixture() {
		return (RecordField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OCCIFactory.eINSTANCE.createRecordField());
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
	 * Tests the '{@link org.eclipse.cmf.occi.core.RecordField#TypeDifferentContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Type Different Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.RecordField#TypeDifferentContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testTypeDifferentContainer__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.core.RecordField#RecordFieldNameRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Record Field Name Regex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.RecordField#RecordFieldNameRegex(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testRecordFieldNameRegex__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

	/**
	 * Tests the '{@link org.eclipse.cmf.occi.core.RecordField#ContainerMustBeRecordType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Container Must Be Record Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.RecordField#ContainerMustBeRecordType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testContainerMustBeRecordType__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		//fail();
	}

	/**
	 * Empty test to avoid "No tests found" JUnit failure.
	 */
	public void testEmpty() {
	}

} //RecordFieldTest
