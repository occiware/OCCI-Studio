/**
 */
package occi.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>occi</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OcciTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OcciTests("occi Tests");
		suite.addTestSuite(KindTest.class);
		suite.addTestSuite(MixinTest.class);
		suite.addTestSuite(ResourceTest.class);
		suite.addTestSuite(LinkTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OcciTests(String name) {
		super(name);
	}

} //OcciTests
