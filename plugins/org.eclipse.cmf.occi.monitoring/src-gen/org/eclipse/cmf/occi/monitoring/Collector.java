/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.monitoring;

import org.eclipse.cmf.occi.core.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Collector Link
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.Collector#getOcciCollectorPeriod <em>Occi Collector Period</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.Collector#getOcciSensorAccuracy <em>Occi Sensor Accuracy</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.Collector#getOcciSensorGranularity <em>Occi Sensor Granularity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage#getCollector()
 * @model
 * @generated
 */
public interface Collector extends Link {
	/**
	 * Returns the value of the '<em><b>Occi Collector Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time between two following measurements (seconds)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Collector Period</em>' attribute.
	 * @see #setOcciCollectorPeriod(Integer)
	 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage#getCollector_OcciCollectorPeriod()
	 * @model dataType="org.eclipse.cmf.occi.monitoring.Second" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/monitoring/ecore!Collector!occiCollectorPeriod'"
	 * @generated
	 */
	Integer getOcciCollectorPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.monitoring.Collector#getOcciCollectorPeriod <em>Occi Collector Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Collector Period</em>' attribute.
	 * @see #getOcciCollectorPeriod()
	 * @generated
	 */
	void setOcciCollectorPeriod(Integer value);

	/**
	 * Returns the value of the '<em><b>Occi Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accuracy of time measument (seconds)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Sensor Accuracy</em>' attribute.
	 * @see #setOcciSensorAccuracy(Integer)
	 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage#getCollector_OcciSensorAccuracy()
	 * @model dataType="org.eclipse.cmf.occi.monitoring.Second"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/monitoring/ecore!Collector!occiSensorAccuracy'"
	 * @generated
	 */
	Integer getOcciSensorAccuracy();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.monitoring.Collector#getOcciSensorAccuracy <em>Occi Sensor Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Sensor Accuracy</em>' attribute.
	 * @see #getOcciSensorAccuracy()
	 * @generated
	 */
	void setOcciSensorAccuracy(Integer value);

	/**
	 * Returns the value of the '<em><b>Occi Sensor Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Granularity of time measument (seconds)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Sensor Granularity</em>' attribute.
	 * @see #setOcciSensorGranularity(Integer)
	 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage#getCollector_OcciSensorGranularity()
	 * @model dataType="org.eclipse.cmf.occi.monitoring.Second"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/monitoring/ecore!Collector!occiSensorGranularity'"
	 * @generated
	 */
	Integer getOcciSensorGranularity();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.monitoring.Collector#getOcciSensorGranularity <em>Occi Sensor Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Sensor Granularity</em>' attribute.
	 * @see #getOcciSensorGranularity()
	 * @generated
	 */
	void setOcciSensorGranularity(Integer value);

} // Collector
