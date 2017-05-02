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
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.platform.Database#getOcciDatabaseVersion <em>Occi Database Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Occi Database Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of the database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Database Version</em>' attribute.
	 * @see #setOcciDatabaseVersion(String)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getDatabase_OcciDatabaseVersion()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Database!occiDatabaseVersion'"
	 * @generated
	 */
	String getOcciDatabaseVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Database#getOcciDatabaseVersion <em>Occi Database Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Database Version</em>' attribute.
	 * @see #getOcciDatabaseVersion()
	 * @generated
	 */
	void setOcciDatabaseVersion(String value);

} // Database
