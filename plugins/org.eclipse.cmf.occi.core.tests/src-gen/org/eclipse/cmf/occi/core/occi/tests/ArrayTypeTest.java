/**
 */
package org.eclipse.cmf.occi.core.occi.tests;

import junit.textui.TestRunner;

import org.eclipse.cmf.occi.core.occi.ArrayType;
import org.eclipse.cmf.occi.core.occi.OcciFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrayTypeTest extends DataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArrayTypeTest.class);
	}

	/**
	 * Constructs a new Array Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Array Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArrayType getFixture() {
		return (ArrayType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OcciFactory.eINSTANCE.createArrayType());
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

} //ArrayTypeTest
