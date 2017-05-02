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
 * Generated at Tue May 02 12:57:08 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.platform/model/Platform.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.platform.connector.dummy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/platform#
 * - term: componentlink
 * - title: ComponentLink
 */
public class ComponentlinkConnector extends org.eclipse.cmf.occi.platform.impl.ComponentlinkImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentlinkConnector.class);

	/**
	 * Constructs a componentlink connector.
	 */
	ComponentlinkConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// Start of user code Componentlinkconnector constructor
		// TODO: Implement this constructor.
		// End of user code
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Componentlink instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// Start of user code ComponentlinkocciCreate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Componentlink instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// Start of user code ComponentlinkocciRetrieve
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Componentlink instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// Start of user code ComponentlinkocciUpdate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Componentlink instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// Start of user code ComponentlinkocciDelete
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	//
	// Componentlink actions.
	//

}	
