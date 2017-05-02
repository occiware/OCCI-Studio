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

import org.eclipse.cmf.occi.core.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storagelink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StorageLink Link
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkDeviceid <em>Occi Storagelink Deviceid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkMountpoint <em>Occi Storagelink Mountpoint</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkState <em>Occi Storagelink State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkStateMessage <em>Occi Storagelink State Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getStoragelink()
 * @model
 * @generated
 */
public interface Storagelink extends Link {
	/**
	 * Returns the value of the '<em><b>Occi Storagelink Deviceid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device identifier as defined by the OCCI service provider
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Storagelink Deviceid</em>' attribute.
	 * @see #setOcciStoragelinkDeviceid(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getStoragelink_OcciStoragelinkDeviceid()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Storagelink!occiStoragelinkDeviceid'"
	 * @generated
	 */
	String getOcciStoragelinkDeviceid();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkDeviceid <em>Occi Storagelink Deviceid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Storagelink Deviceid</em>' attribute.
	 * @see #getOcciStoragelinkDeviceid()
	 * @generated
	 */
	void setOcciStoragelinkDeviceid(String value);

	/**
	 * Returns the value of the '<em><b>Occi Storagelink Mountpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Point to where the storage is mounted in the guest OS
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Storagelink Mountpoint</em>' attribute.
	 * @see #setOcciStoragelinkMountpoint(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getStoragelink_OcciStoragelinkMountpoint()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Storagelink!occiStoragelinkMountpoint'"
	 * @generated
	 */
	String getOcciStoragelinkMountpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkMountpoint <em>Occi Storagelink Mountpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Storagelink Mountpoint</em>' attribute.
	 * @see #getOcciStoragelinkMountpoint()
	 * @generated
	 */
	void setOcciStoragelinkMountpoint(String value);

	/**
	 * Returns the value of the '<em><b>Occi Storagelink State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.infrastructure.StorageLinkStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current status of the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Storagelink State</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.StorageLinkStatus
	 * @see #setOcciStoragelinkState(StorageLinkStatus)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getStoragelink_OcciStoragelinkState()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Storagelink!occiStoragelinkState'"
	 * @generated
	 */
	StorageLinkStatus getOcciStoragelinkState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkState <em>Occi Storagelink State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Storagelink State</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.StorageLinkStatus
	 * @see #getOcciStoragelinkState()
	 * @generated
	 */
	void setOcciStoragelinkState(StorageLinkStatus value);

	/**
	 * Returns the value of the '<em><b>Occi Storagelink State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable explanation of the current instance state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Storagelink State Message</em>' attribute.
	 * @see #setOcciStoragelinkStateMessage(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getStoragelink_OcciStoragelinkStateMessage()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Storagelink!occiStoragelinkStateMessage'"
	 * @generated
	 */
	String getOcciStoragelinkStateMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Storagelink#getOcciStoragelinkStateMessage <em>Occi Storagelink State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Storagelink State Message</em>' attribute.
	 * @see #getOcciStoragelinkStateMessage()
	 * @generated
	 */
	void setOcciStoragelinkStateMessage(String value);

} // Storagelink
