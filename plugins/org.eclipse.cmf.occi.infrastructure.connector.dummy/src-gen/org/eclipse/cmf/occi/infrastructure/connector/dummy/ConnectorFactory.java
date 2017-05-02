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

/**
 * Connector EFactory for the OCCI extension:
 * - name: infrastructure
 * - scheme: http://schemas.ogf.org/occi/infrastructure#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.infrastructure.impl.InfrastructureFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/infrastructure#
	 * - term: network
	 * - title: Network Resource
	 */
	@Override
	public org.eclipse.cmf.occi.infrastructure.Network createNetwork() {
		return new NetworkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/infrastructure#
	 * - term: compute
	 * - title: Compute Resource
	 */
	@Override
	public org.eclipse.cmf.occi.infrastructure.Compute createCompute() {
		return new ComputeConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/infrastructure#
	 * - term: storage
	 * - title: Storage Resource
	 */
	@Override
	public org.eclipse.cmf.occi.infrastructure.Storage createStorage() {
		return new StorageConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/infrastructure#
	 * - term: storagelink
	 * - title: StorageLink Link
	 */
	@Override
	public org.eclipse.cmf.occi.infrastructure.Storagelink createStoragelink() {
		return new StoragelinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/infrastructure#
	 * - term: networkinterface
	 * - title: NetworkInterface Link
	 */
	@Override
	public org.eclipse.cmf.occi.infrastructure.Networkinterface createNetworkinterface() {
		return new NetworkinterfaceConnector();
	}

}
