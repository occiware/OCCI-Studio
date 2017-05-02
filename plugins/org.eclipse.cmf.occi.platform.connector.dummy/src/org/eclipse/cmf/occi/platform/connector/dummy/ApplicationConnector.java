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
 * Generated at Mon May 01 01:35:53 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.platform/model/Platform.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.platform.connector.dummy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.cmf.occi.platform.Status;
/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/platform#
 * - term: application
 * - title: Application
 */
public class ApplicationConnector extends org.eclipse.cmf.occi.platform.impl.ApplicationImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationConnector.class);

	/**
	 * Constructs a application connector.
	 */
	ApplicationConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// Start of user code Applicationconnector constructor
		// TODO: Implement this constructor.
		// End of user code
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Application instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// Start of user code ApplicationocciCreate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Application instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// Start of user code ApplicationocciRetrieve
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Application instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// Start of user code ApplicationocciUpdate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Application instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// Start of user code ApplicationocciDelete
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	//
	// Application actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/platform/application/action#
     * - term: start
     * - title: Start the application.
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// Application State Machine.
		switch(getOcciAppState().getValue()) {

		case Status.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"start\")...");
			// TODO Implement transition(state=inactive, action="start")
			setOcciAppState(Status.ACTIVE);
			break;

		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/platform/application/action#
     * - term: stop
     * - title: Stop the application.
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// Application State Machine.
		switch(getOcciAppState().getValue()) {

		case Status.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"stop\")...");
			// TODO Implement transition(state=active, action="stop")
			setOcciAppState(Status.INACTIVE);
			break;

		default:
			break;
		}
	}

}	
