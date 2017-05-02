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
package org.eclipse.cmf.occi.infrastructure;

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Storage Resource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageSize <em>Occi Storage Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageState <em>Occi Storage State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageStateMessage <em>Occi Storage State Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getStorage()
 * @model
 * @generated
 */
public interface Storage extends Resource {
	/**
	 * Returns the value of the '<em><b>Occi Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Storage size of the instance in gigabytes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Storage Size</em>' attribute.
	 * @see #setOcciStorageSize(Float)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getStorage_OcciStorageSize()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.GiB" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Storage!occiStorageSize'"
	 * @generated
	 */
	Float getOcciStorageSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageSize <em>Occi Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Storage Size</em>' attribute.
	 * @see #getOcciStorageSize()
	 * @generated
	 */
	void setOcciStorageSize(Float value);

	/**
	 * Returns the value of the '<em><b>Occi Storage State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.infrastructure.StorageStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current status of the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Storage State</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.StorageStatus
	 * @see #setOcciStorageState(StorageStatus)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getStorage_OcciStorageState()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Storage!occiStorageState'"
	 * @generated
	 */
	StorageStatus getOcciStorageState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageState <em>Occi Storage State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Storage State</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.StorageStatus
	 * @see #getOcciStorageState()
	 * @generated
	 */
	void setOcciStorageState(StorageStatus value);

	/**
	 * Returns the value of the '<em><b>Occi Storage State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable explanation of the current instance state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Storage State Message</em>' attribute.
	 * @see #setOcciStorageStateMessage(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getStorage_OcciStorageStateMessage()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Storage!occiStorageStateMessage'"
	 * @generated
	 */
	String getOcciStorageStateMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Storage#getOcciStorageStateMessage <em>Occi Storage State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Storage State Message</em>' attribute.
	 * @see #getOcciStorageStateMessage()
	 * @generated
	 */
	void setOcciStorageStateMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set storage online
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Storage!online()'"
	 * @generated
	 */
	void online();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set storage offline
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Storage!offline()'"
	 * @generated
	 */
	void offline();

} // Storage
