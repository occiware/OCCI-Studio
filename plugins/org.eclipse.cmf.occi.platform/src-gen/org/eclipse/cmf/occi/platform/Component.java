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

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Component
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.platform.Component#getOcciComponentState <em>Occi Component State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.Component#getOcciComponentStateMessage <em>Occi Component State Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Resource {
	/**
	 * Returns the value of the '<em><b>Occi Component State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.platform.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * State of the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Component State</em>' attribute.
	 * @see org.eclipse.cmf.occi.platform.Status
	 * @see #setOcciComponentState(Status)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getComponent_OcciComponentState()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Component!occiComponentState'"
	 * @generated
	 */
	Status getOcciComponentState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Component#getOcciComponentState <em>Occi Component State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Component State</em>' attribute.
	 * @see org.eclipse.cmf.occi.platform.Status
	 * @see #getOcciComponentState()
	 * @generated
	 */
	void setOcciComponentState(Status value);

	/**
	 * Returns the value of the '<em><b>Occi Component State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable explanation of the current instance state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Component State Message</em>' attribute.
	 * @see #setOcciComponentStateMessage(String)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getComponent_OcciComponentStateMessage()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Component!occiComponentStateMessage'"
	 * @generated
	 */
	String getOcciComponentStateMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Component#getOcciComponentStateMessage <em>Occi Component State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Component State Message</em>' attribute.
	 * @see #getOcciComponentStateMessage()
	 * @generated
	 */
	void setOcciComponentStateMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start the application.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Component!start()'"
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop the application.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Component!stop()'"
	 * @generated
	 */
	void stop();

} // Component
