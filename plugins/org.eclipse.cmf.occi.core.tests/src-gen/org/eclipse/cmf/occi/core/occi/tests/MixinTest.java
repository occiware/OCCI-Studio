/**
 */
package org.eclipse.cmf.occi.core.occi.tests;

import junit.textui.TestRunner;

import org.eclipse.cmf.occi.core.occi.Mixin;
import org.eclipse.cmf.occi.core.occi.OcciFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mixin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.Mixin#getEntities() <em>Entities</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MixinTest extends TypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MixinTest.class);
	}

	/**
	 * Constructs a new Mixin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mixin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mixin getFixture() {
		return (Mixin)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OcciFactory.eINSTANCE.createMixin());
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
	 * Tests the '{@link org.eclipse.cmf.occi.core.occi.Mixin#getEntities() <em>Entities</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.core.occi.Mixin#getEntities()
	 * @generated
	 */
	public void testGetEntities() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //MixinTest
