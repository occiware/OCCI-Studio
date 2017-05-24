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

import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.StopMethod; 
import org.eclipse.cmf.occi.infrastructure.RestartMethod; 
import org.eclipse.cmf.occi.infrastructure.SuspendMethod; 
import org.eclipse.cmf.occi.infrastructure.SaveMethod; 
/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 * - term: compute
 * - title: Compute Resource
 */
public class ComputeConnector extends org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ComputeConnector.class);

	// Start of user code Computeconnector_constructor
	/**
	 * Constructs a compute connector.
	 */
	ComputeConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ComputeocciCreate
	/**
	 * Called when this Compute instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Compute_occiRetrieve_method
	/**
	 * Called when this Compute instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Compute_occiUpdate_method
	/**
	 * Called when this Compute instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ComputeocciDelete_method
	/**
	 * Called when this Compute instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Compute actions.
	//
	// Start of user code Compute_Kind_Start_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: start
     * - title: Start the system
	 */
	@Override
	public void start()
	{
		LOGGER.debug("Action start() called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {

		case ComputeStatus.SUSPENDED_VALUE:
			LOGGER.debug("Fire transition(state=suspended, action=\"start\")...");
			// TODO Implement transition(state=suspended, action="start")
			if(true){
				setOcciComputeState(ComputeStatus.ACTIVE);
			}
			else	
				if(true){
					setOcciComputeState(ComputeStatus.ERROR);
				}
			break;


		case ComputeStatus.INACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=inactive, action=\"start\")...");
			// TODO Implement transition(state=inactive, action="start")
			if(true){
				setOcciComputeState(ComputeStatus.ACTIVE);
			}
			else	
				if(true){
					setOcciComputeState(ComputeStatus.ERROR);
				}
			break;

		default:
			break;
		}
	}
	// End of user code

	// Start of user code Compute_Kind_Stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: stop
     * - title: Stop the system (graceful, acpioff or poweroff)
	 */
	@Override
	public void stop(final StopMethod method)
	{
		LOGGER.debug("Action stop(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {

		case ComputeStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"stop\")...");
			// TODO Implement transition(state=active, action="stop")
			if(true){
				setOcciComputeState(ComputeStatus.ERROR);
			}
			else	
				if(true){
					setOcciComputeState(ComputeStatus.INACTIVE);
				}
			break;

		default:
			break;
		}
	}
	// End of user code

	// Start of user code Compute_Kind_Restart_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: restart
     * - title: Restart the system (graceful, warm or cold)
	 */
	@Override
	public void restart(final RestartMethod method)
	{
		LOGGER.debug("Action restart(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {
		default:
			break;
		}
	}
	// End of user code

	// Start of user code Compute_Kind_Suspend_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: suspend
     * - title: Suspend the system (hibernate or in RAM)
	 */
	@Override
	public void suspend(final SuspendMethod method)
	{
		LOGGER.debug("Action suspend(" + "method=" + method + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {

		case ComputeStatus.ACTIVE_VALUE:
			LOGGER.debug("Fire transition(state=active, action=\"suspend\")...");
			// TODO Implement transition(state=active, action="suspend")
			if(true){
				setOcciComputeState(ComputeStatus.SUSPENDED);
			}
			else	
				if(true){
					setOcciComputeState(ComputeStatus.ERROR);
				}
			break;

		default:
			break;
		}
	}
	// End of user code

	// Start of user code Compute_Kind_Save_action
	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/infrastructure/compute/action#
     * - term: save
     * - title: Save the system (hot, deferred)
	 */
	@Override
	public void save(final SaveMethod method, final String name)
	{
		LOGGER.debug("Action save(" + "method=" + method + "name=" + name + ") called on " + this);

		// Compute State Machine.
		switch(getOcciComputeState().getValue()) {
		default:
			break;
		}
	}
	// End of user code

}	
