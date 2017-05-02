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
 * Generated at Tue May 02 11:32:03 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.monitoring/model/monitoring.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.monitoring.connector.dummy;

/**
 * Connector EFactory for the OCCI extension:
 * - name: monitoring
 * - scheme: http://schemas.ogf.org/occi/monitoring#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.monitoring.impl.MonitoringFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/monitoring#
	 * - term: sensor
	 * - title: Sensor Resource
	 */
	@Override
	public org.eclipse.cmf.occi.monitoring.Sensor createSensor() {
		return new SensorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/monitoring#
	 * - term: collector
	 * - title: Collector Link
	 */
	@Override
	public org.eclipse.cmf.occi.monitoring.Collector createCollector() {
		return new CollectorConnector();
	}

}
