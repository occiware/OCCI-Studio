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
 * Generated at Tue May 23 13:55:26 CEST 2017 from platform:/plugin/org.eclipse.cmf.occi.infrastructure/model/Infrastructure.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.infrastructure.connector.dummy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.cmf.occi.infrastructure.NetworkStatus;
/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: network
 * - title: Network Resource
 */
public class NetworkConnector extends org.eclipse.cmf.occi.infrastructure.impl.NetworkImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(NetworkConnector.class);

	// Start of user code Networkconnector_constructor
	/**
	 * Constructs a network connector.
	 */
	NetworkConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code NetworkocciCreate
	/**
	 * Called when this Network instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Network_occiRetrieve_method
	/**
	 * Called when this Network instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Network_occiUpdate_method
	/**
	 * Called when this Network instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code NetworkocciDelete_method
	/**
	 * Called when this Network instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Network actions.
	//
	// Start of user code Network_Kind_Up_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/network/action#
     * - term: up
     * - title: 
	 */
	@Override
	public void up()
	{
		LOGGER.debug("Action up() called on " + this);

		// Network State Machine.
		switch(getOcciNetworkState().getValue()) {

		case NetworkStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"up\")...");
			// TODO Implement transition(state=inactive, action="up")
			if(true){
				setOcciNetworkState(NetworkStatus.ACTIVE);
			}
			else	
				if(true){
					setOcciNetworkState(NetworkStatus.ERROR);
				}
			break;

		default:
			break;
		}
	}
	// End of user code

	// Start of user code Network_Kind_Down_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/network/action#
     * - term: down
     * - title: 
	 */
	@Override
	public void down()
	{
		LOGGER.debug("Action down() called on " + this);

		// Network State Machine.
		switch(getOcciNetworkState().getValue()) {

		case NetworkStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"down\")...");
			// TODO Implement transition(state=active, action="down")
			if(true){
				setOcciNetworkState(NetworkStatus.ERROR);
			}
			else	
				if(true){
					setOcciNetworkState(NetworkStatus.INACTIVE);
				}
			break;

		default:
			break;
		}
	}
	// End of user code

}	
