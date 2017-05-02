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
package org.eclipse.cmf.occi.platform;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Databaselink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseUri <em>Occi Database Uri</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseUsername <em>Occi Database Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseToken <em>Occi Database Token</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getDatabaselink()
 * @model
 * @generated
 */
public interface Databaselink extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Occi Database Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connection URI for the database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Database Uri</em>' attribute.
	 * @see #setOcciDatabaseUri(String)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getDatabaselink_OcciDatabaseUri()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Databaselink!occiDatabaseUri'"
	 * @generated
	 */
	String getOcciDatabaseUri();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseUri <em>Occi Database Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Database Uri</em>' attribute.
	 * @see #getOcciDatabaseUri()
	 * @generated
	 */
	void setOcciDatabaseUri(String value);

	/**
	 * Returns the value of the '<em><b>Occi Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Username.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Database Username</em>' attribute.
	 * @see #setOcciDatabaseUsername(String)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getDatabaselink_OcciDatabaseUsername()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Databaselink!occiDatabaseUsername'"
	 * @generated
	 */
	String getOcciDatabaseUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseUsername <em>Occi Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Database Username</em>' attribute.
	 * @see #getOcciDatabaseUsername()
	 * @generated
	 */
	void setOcciDatabaseUsername(String value);

	/**
	 * Returns the value of the '<em><b>Occi Database Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Token.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Database Token</em>' attribute.
	 * @see #setOcciDatabaseToken(String)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getDatabaselink_OcciDatabaseToken()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Databaselink!occiDatabaseToken'"
	 * @generated
	 */
	String getOcciDatabaseToken();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseToken <em>Occi Database Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Database Token</em>' attribute.
	 * @see #getOcciDatabaseToken()
	 * @generated
	 */
	void setOcciDatabaseToken(String value);

} // Databaselink
