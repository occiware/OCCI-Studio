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
 * Generated at Tue May 02 13:07:04 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.sla/model/sla.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.sla.connector.dummy;

/**
 * Connector EFactory for the OCCI extension:
 * - name: sla
 * - scheme: http://schemas.ogf.org/occi/sla#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.sla.impl.SlaFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/sla#
	 * - term: agreement
	 * - title: A Service Level Agreement
	 */
	@Override
	public org.eclipse.cmf.occi.sla.Agreement createAgreement() {
		return new AgreementConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/sla#
	 * - term: agreement_link
	 * - title: Link between a SLA and its associated resource
	 */
	@Override
	public org.eclipse.cmf.occi.sla.Agreement_link createAgreement_link() {
		return new Agreement_linkConnector();
	}

}
