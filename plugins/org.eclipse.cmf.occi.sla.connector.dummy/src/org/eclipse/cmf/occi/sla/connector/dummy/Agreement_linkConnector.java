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
 * Generated at Mon May 01 01:36:28 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.sla/model/sla.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.sla.connector.dummy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/sla#
 * - term: agreement_link
 * - title: Link between a SLA and its associated resource
 */
public class Agreement_linkConnector extends org.eclipse.cmf.occi.sla.impl.Agreement_linkImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(Agreement_linkConnector.class);

	/**
	 * Constructs a agreement_link connector.
	 */
	Agreement_linkConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// Start of user code Agreement_linkconnector constructor
		// TODO: Implement this constructor.
		// End of user code
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Agreement_link instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// Start of user code Agreement_linkocciCreate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Agreement_link instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// Start of user code Agreement_linkocciRetrieve
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Agreement_link instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// Start of user code Agreement_linkocciUpdate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Agreement_link instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// Start of user code Agreement_linkocciDelete
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	//
	// Agreement_link actions.
	//

}	
