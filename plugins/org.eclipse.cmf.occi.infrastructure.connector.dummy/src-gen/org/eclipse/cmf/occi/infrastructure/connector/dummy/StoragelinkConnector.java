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

import org.eclipse.cmf.occi.infrastructure.StorageLinkStatus;
/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: storagelink
 * - title: StorageLink Link
 */
public class StoragelinkConnector extends org.eclipse.cmf.occi.infrastructure.impl.StoragelinkImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(StoragelinkConnector.class);

	/**
	 * Constructs a storagelink connector.
	 */
	StoragelinkConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// Start of user code Storagelinkconnector constructor
		// TODO: Implement this constructor.
		// End of user code
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Storagelink instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// Start of user code StoragelinkocciCreate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Storagelink instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// Start of user code StoragelinkocciRetrieve
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Storagelink instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// Start of user code StoragelinkocciUpdate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Storagelink instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// Start of user code StoragelinkocciDelete
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	//
	// Storagelink actions.
	//

}	
