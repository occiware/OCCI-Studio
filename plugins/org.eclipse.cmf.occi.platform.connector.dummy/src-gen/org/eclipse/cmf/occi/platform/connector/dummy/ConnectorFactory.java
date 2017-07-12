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
 * Generated at Wed Jul 12 08:51:23 CEST 2017 from platform:/plugin/org.eclipse.cmf.occi.platform/model/Platform.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.platform.connector.dummy;

/**
 * Connector EFactory for the OCCI extension:
 * - name: platform
 * - scheme: http://schemas.ogf.org/occi/platform#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.platform.impl.PlatformFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/platform#
	 * - term: application
	 * - title: Application
	 */
	@Override
	public org.eclipse.cmf.occi.platform.Application createApplication() {
		return new ApplicationConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/platform#
	 * - term: component
	 * - title: Component
	 */
	@Override
	public org.eclipse.cmf.occi.platform.Component createComponent() {
		return new ComponentConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/platform#
	 * - term: componentlink
	 * - title: ComponentLink
	 */
	@Override
	public org.eclipse.cmf.occi.platform.Componentlink createComponentlink() {
		return new ComponentlinkConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/platform#
	 * - term: app_tpl
	 * - title: Application Template
	 */
	@Override
	public org.eclipse.cmf.occi.platform.App_tpl createApp_tpl() {
		return new App_tplConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/platform#
	 * - term: res_tpl
	 * - title: Resource Template
	 */
	@Override
	public org.eclipse.cmf.occi.platform.Res_tpl createRes_tpl() {
		return new Res_tplConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/platform#
	 * - term: database
	 * - title: Database Mixin
	 */
	@Override
	public org.eclipse.cmf.occi.platform.Database createDatabase() {
		return new DatabaseConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/platform#
	 * - term: databaselink
	 * - title: Database Link
	 */
	@Override
	public org.eclipse.cmf.occi.platform.Databaselink createDatabaselink() {
		return new DatabaselinkConnector();
	}

}
