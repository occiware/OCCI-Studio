/**
 */
package org.eclipse.cmf.occi.core.occi.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.cmf.occi.core.occi.Constraint;
import org.eclipse.cmf.occi.core.occi.OcciFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintTest extends TestCase {

	/**
	 * The fixture for this Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Constraint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstraintTest.class);
	}

	/**
	 * Constructs a new Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Constraint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Constraint getFixture() {
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
		setFixture(OcciFactory.eINSTANCE.createConstraint());
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

} //ConstraintTest
