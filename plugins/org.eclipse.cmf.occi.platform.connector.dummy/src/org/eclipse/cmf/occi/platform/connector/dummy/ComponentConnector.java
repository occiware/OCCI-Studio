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
 * - term: component
 * - title: Component
 */
public class ComponentConnector extends org.eclipse.cmf.occi.platform.impl.ComponentImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentConnector.class);

	/**
	 * Constructs a component connector.
	 */
	ComponentConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// Start of user code Componentconnector constructor
		// TODO: Implement this constructor.
		// End of user code
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Component instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// Start of user code ComponentocciCreate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Component instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// Start of user code ComponentocciRetrieve
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Component instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// Start of user code ComponentocciUpdate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Component instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// Start of user code ComponentocciDelete
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	//
	// Component actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/platform/component/action#
     * - term: start
     * - title: Start the application.
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"start\")...");
			// TODO Implement transition(state=inactive, action="start")
			setOcciComponentState(Status.ACTIVE);
			break;

		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/platform/component/action#
     * - term: stop
     * - title: Stop the application.
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// Component State Machine.
		switch(getOcciComponentState().getValue()) {

		case Status.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"stop\")...");
			// TODO Implement transition(state=active, action="stop")
			setOcciComponentState(Status.INACTIVE);
			break;

		default:
			break;
		}
	}

}	
