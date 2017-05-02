/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Tue May 02 10:22:21 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.infrastructure/model/Infrastructure.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.infrastructure.connector.dummy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.cmf.occi.infrastructure.StorageStatus;
/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: storage
 * - title: Storage Resource
 */
public class StorageConnector extends org.eclipse.cmf.occi.infrastructure.impl.StorageImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StorageConnector.class);

	/**
	 * Constructs a storage connector.
	 */
	StorageConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// Start of user code Storageconnector constructor
		// TODO: Implement this constructor.
		// End of user code
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Storage instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// Start of user code StorageocciCreate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Storage instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// Start of user code StorageocciRetrieve
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Storage instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// Start of user code StorageocciUpdate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Storage instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// Start of user code StorageocciDelete
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	//
	// Storage actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/storage/action#
     * - term: online
     * - title: Set storage online
	 */
	@Override
	public void online()
	{
		LOGGER.debug("Action online() called on " + this);

		// Storage State Machine.
		switch(getOcciStorageState().getValue()) {

		case StorageStatus.OFFLINE_VALUE:
			LOGGER.debug("Fire transition(state=offline, action=\"online\")...");
			// TODO Implement transition(state=offline, action="online")
			if(true)
			setOcciStorageState(StorageStatus.ERROR);
			else
			if(true)
			setOcciStorageState(StorageStatus.ONLINE);
			break;

		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/storage/action#
     * - term: offline
     * - title: Set storage offline
	 */
	@Override
	public void offline()
	{
		LOGGER.debug("Action offline() called on " + this);

		// Storage State Machine.
		switch(getOcciStorageState().getValue()) {

		case StorageStatus.ONLINE_VALUE:
			LOGGER.debug("Fire transition(state=online, action=\"offline\")...");
			// TODO Implement transition(state=online, action="offline")
			if(true)
			setOcciStorageState(StorageStatus.ERROR);
			else
			if(true)
			setOcciStorageState(StorageStatus.OFFLINE);
			break;

		default:
			break;
		}
	}

}	
