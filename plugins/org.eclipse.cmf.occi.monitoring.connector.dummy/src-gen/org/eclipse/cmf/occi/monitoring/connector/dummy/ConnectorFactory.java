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

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/monitoring#
	 * - term: metric
	 * - title: Metric Mixin
	 */
	@Override
	public org.eclipse.cmf.occi.monitoring.Metric createMetric() {
		return new MetricConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/monitoring#
	 * - term: aggregator
	 * - title: Aggregator Mixin
	 */
	@Override
	public org.eclipse.cmf.occi.monitoring.Aggregator createAggregator() {
		return new AggregatorConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://schemas.ogf.org/occi/monitoring#
	 * - term: publisher
	 * - title: Published Mixin
	 */
	@Override
	public org.eclipse.cmf.occi.monitoring.Publisher createPublisher() {
		return new PublisherConnector();
	}

}
