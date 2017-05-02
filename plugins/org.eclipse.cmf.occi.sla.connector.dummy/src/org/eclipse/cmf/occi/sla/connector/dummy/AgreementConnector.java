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

import org.eclipse.cmf.occi.sla.AgreementStatus;
/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://schemas.ogf.org/occi/sla#
 * - term: agreement
 * - title: A Service Level Agreement
 */
public class AgreementConnector extends org.eclipse.cmf.occi.sla.impl.AgreementImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(AgreementConnector.class);

	/**
	 * Constructs a agreement connector.
	 */
	AgreementConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// Start of user code Agreementconnector constructor
		// TODO: Implement this constructor.
		// End of user code
	}

	//
	// OCCI CRUD callback operations.
	//

	/**
	 * Called when this Agreement instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// Start of user code AgreementocciCreate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Agreement instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// Start of user code AgreementocciRetrieve
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Agreement instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// Start of user code AgreementocciUpdate
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	/**
	 * Called when this Agreement instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// Start of user code AgreementocciDelete
		// TODO: Implement this callback or remove this method.
		// End of user code
	}

	//
	// Agreement actions.
	//

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/sla/agreement/action#
     * - term: accept
     * - title: 
	 */
	@Override
	public void accept()
	{
		LOGGER.debug("Action accept() called on " + this);

		// Agreement State Machine.
		switch(getOcciAgreementState().getValue()) {
		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/sla/agreement/action#
     * - term: reject
     * - title: 
	 */
	@Override
	public void reject()
	{
		LOGGER.debug("Action reject() called on " + this);

		// Agreement State Machine.
		switch(getOcciAgreementState().getValue()) {
		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/sla/agreement/action#
     * - term: suspend
     * - title: 
	 */
	@Override
	public void suspend()
	{
		LOGGER.debug("Action suspend() called on " + this);

		// Agreement State Machine.
		switch(getOcciAgreementState().getValue()) {
		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/sla/agreement/action#
     * - term: resume
     * - title: 
	 */
	@Override
	public void resume()
	{
		LOGGER.debug("Action resume() called on " + this);

		// Agreement State Machine.
		switch(getOcciAgreementState().getValue()) {
		default:
			break;
		}
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://schemas.ogf.org/occi/sla/agreement/action#
     * - term: terminate
     * - title: 
	 */
	@Override
	public void terminate()
	{
		LOGGER.debug("Action terminate() called on " + this);

		// Agreement State Machine.
		switch(getOcciAgreementState().getValue()) {
		default:
			break;
		}
	}

}	
