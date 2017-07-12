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

import java.net.URL;

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Application
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.platform.Application#getOcciAppName <em>Occi App Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.Application#getOcciAppContext <em>Occi App Context</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.Application#getOcciAppUrl <em>Occi App Url</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.Application#getOcciAppState <em>Occi App State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.Application#getOcciAppStateMessage <em>Occi App State Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends Resource {
	/**
	 * Returns the value of the '<em><b>Occi App Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi App Name</em>' attribute.
	 * @see #setOcciAppName(String)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getApplication_OcciAppName()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Application!occiAppName'"
	 * @generated
	 */
	String getOcciAppName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Application#getOcciAppName <em>Occi App Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi App Name</em>' attribute.
	 * @see #getOcciAppName()
	 * @generated
	 */
	void setOcciAppName(String value);

	/**
	 * Returns the value of the '<em><b>Occi App Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL for contextualizing the app.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi App Context</em>' attribute.
	 * @see #setOcciAppContext(URL)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getApplication_OcciAppContext()
	 * @model dataType="org.eclipse.cmf.occi.platform.URL" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Application!occiAppContext'"
	 * @generated
	 */
	URL getOcciAppContext();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Application#getOcciAppContext <em>Occi App Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi App Context</em>' attribute.
	 * @see #getOcciAppContext()
	 * @generated
	 */
	void setOcciAppContext(URL value);

	/**
	 * Returns the value of the '<em><b>Occi App Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DNS entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi App Url</em>' attribute.
	 * @see #setOcciAppUrl(URL)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getApplication_OcciAppUrl()
	 * @model dataType="org.eclipse.cmf.occi.platform.URL" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Application!occiAppUrl'"
	 * @generated
	 */
	URL getOcciAppUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Application#getOcciAppUrl <em>Occi App Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi App Url</em>' attribute.
	 * @see #getOcciAppUrl()
	 * @generated
	 */
	void setOcciAppUrl(URL value);

	/**
	 * Returns the value of the '<em><b>Occi App State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.platform.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * State of the application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi App State</em>' attribute.
	 * @see org.eclipse.cmf.occi.platform.Status
	 * @see #setOcciAppState(Status)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getApplication_OcciAppState()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Application!occiAppState'"
	 * @generated
	 */
	Status getOcciAppState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Application#getOcciAppState <em>Occi App State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi App State</em>' attribute.
	 * @see org.eclipse.cmf.occi.platform.Status
	 * @see #getOcciAppState()
	 * @generated
	 */
	void setOcciAppState(Status value);

	/**
	 * Returns the value of the '<em><b>Occi App State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable explanation of the current instance state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi App State Message</em>' attribute.
	 * @see #setOcciAppStateMessage(String)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getApplication_OcciAppStateMessage()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Application!occiAppStateMessage'"
	 * @generated
	 */
	String getOcciAppStateMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Application#getOcciAppStateMessage <em>Occi App State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi App State Message</em>' attribute.
	 * @see #getOcciAppStateMessage()
	 * @generated
	 */
	void setOcciAppStateMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start the application.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Application!start()'"
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop the application.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Application!stop()'"
	 * @generated
	 */
	void stop();

} // Application
