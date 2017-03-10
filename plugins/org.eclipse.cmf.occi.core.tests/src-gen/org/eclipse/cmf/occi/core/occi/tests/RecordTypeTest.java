/**
 */
package org.eclipse.cmf.occi.core.occi.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.cmf.occi.core.occi.OcciFactory;
import org.eclipse.cmf.occi.core.occi.RecordType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordTypeTest extends TestCase {

	/**
	 * The fixture for this Record Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecordTypeTest.class);
	}

	/**
	 * Constructs a new Record Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Record Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RecordType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Record Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordType getFixture() {
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
		setFixture(OcciFactory.eINSTANCE.createRecordType());
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

} //RecordTypeTest
