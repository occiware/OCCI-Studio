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
import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Resource#ResourceKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Resource Kind Is In Parent</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ResourceTest extends EntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceTest.class);
	}

	/**
	 * Constructs a new Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Resource getFixture() {
		return (Resource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OCCIFactory.eINSTANCE.createResource());
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
	 * Tests the '{@link org.eclipse.cmf.occi.core.Resource#ResourceKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Resource Kind Is In Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.Resource#ResourceKindIsInParent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 */
	public void testResourceKindIsInParent__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		// fail();
	}

} //ResourceTest
