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
 * Generated at Wed May 24 09:07:16 CEST 2017 from platform:/plugin/org.eclipse.cmf.occi.monitoring/model/monitoring.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.monitoring.connector.dummy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/monitoring#
 * - term: sensor
 * - title: Sensor Resource
 */
public class SensorConnector extends org.eclipse.cmf.occi.monitoring.impl.SensorImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(SensorConnector.class);

	// Start of user code Sensorconnector_constructor
	/**
	 * Constructs a sensor connector.
	 */
	SensorConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code SensorocciCreate
		// TODO: Implement this callback or remove this method.
		// End of user code

	// Start of user code Sensor_occiRetrieve_method
	/**
	 * Called when this Sensor instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Sensor_occiUpdate_method
	/**
	 * Called when this Sensor instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code SensorocciDelete_method
	/**
	 * Called when this Sensor instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Sensor actions.
	//
}	
