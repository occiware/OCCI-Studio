/**
 */
package org.eclipse.cmf.occi.core.occi.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.cmf.occi.core.occi.FSM;
import org.eclipse.cmf.occi.core.occi.OcciFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FSMTest extends TestCase {

	/**
	 * The fixture for this FSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSM fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FSMTest.class);
	}

	/**
	 * Constructs a new FSM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSMTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this FSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FSM fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this FSM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSM getFixture() {
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
		setFixture(OcciFactory.eINSTANCE.createFSM());
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

} //FSMTest
