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

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sensor Resource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorTimebase <em>Occi Sensor Timebase</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorTimestart <em>Occi Sensor Timestart</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorTimestop <em>Occi Sensor Timestop</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorPeriod <em>Occi Sensor Period</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorGranularity <em>Occi Sensor Granularity</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorAccuracy <em>Occi Sensor Accuracy</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Resource {
	/**
	 * Returns the value of the '<em><b>Occi Sensor Timebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base time reference (ISO8601)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Sensor Timebase</em>' attribute.
	 * @see #setOcciSensorTimebase(String)
	 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage#getSensor_OcciSensorTimebase()
	 * @model dataType="org.eclipse.cmf.occi.monitoring.DateTime"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/monitoring/ecore!Sensor!occiSensorTimebase'"
	 * @generated
	 */
	String getOcciSensorTimebase();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorTimebase <em>Occi Sensor Timebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Sensor Timebase</em>' attribute.
	 * @see #getOcciSensorTimebase()
	 * @generated
	 */
	void setOcciSensorTimebase(String value);

	/**
	 * Returns the value of the '<em><b>Occi Sensor Timestart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start time offset (seconds)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Sensor Timestart</em>' attribute.
	 * @see #setOcciSensorTimestart(Integer)
	 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage#getSensor_OcciSensorTimestart()
	 * @model dataType="org.eclipse.cmf.occi.monitoring.Second"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/monitoring/ecore!Sensor!occiSensorTimestart'"
	 * @generated
	 */
	Integer getOcciSensorTimestart();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorTimestart <em>Occi Sensor Timestart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Sensor Timestart</em>' attribute.
	 * @see #getOcciSensorTimestart()
	 * @generated
	 */
	void setOcciSensorTimestart(Integer value);

	/**
	 * Returns the value of the '<em><b>Occi Sensor Timestop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop time offset (seconds)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Sensor Timestop</em>' attribute.
	 * @see #setOcciSensorTimestop(Integer)
	 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage#getSensor_OcciSensorTimestop()
	 * @model dataType="org.eclipse.cmf.occi.monitoring.Second"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/monitoring/ecore!Sensor!occiSensorTimestop'"
	 * @generated
	 */
	Integer getOcciSensorTimestop();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorTimestop <em>Occi Sensor Timestop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Sensor Timestop</em>' attribute.
	 * @see #getOcciSensorTimestop()
	 * @generated
	 */
	void setOcciSensorTimestop(Integer value);

	/**
	 * Returns the value of the '<em><b>Occi Sensor Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time between two following measurements (seconds)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Sensor Period</em>' attribute.
	 * @see #setOcciSensorPeriod(Integer)
	 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage#getSensor_OcciSensorPeriod()
	 * @model dataType="org.eclipse.cmf.occi.monitoring.Second" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/monitoring/ecore!Sensor!occiSensorPeriod'"
	 * @generated
	 */
	Integer getOcciSensorPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorPeriod <em>Occi Sensor Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Sensor Period</em>' attribute.
	 * @see #getOcciSensorPeriod()
	 * @generated
	 */
	void setOcciSensorPeriod(Integer value);

	/**
	 * Returns the value of the '<em><b>Occi Sensor Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Granularity of time measument (seconds)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Sensor Granularity</em>' attribute.
	 * @see #setOcciSensorGranularity(Integer)
	 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage#getSensor_OcciSensorGranularity()
	 * @model dataType="org.eclipse.cmf.occi.monitoring.Second"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/monitoring/ecore!Sensor!occiSensorGranularity'"
	 * @generated
	 */
	Integer getOcciSensorGranularity();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorGranularity <em>Occi Sensor Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Sensor Granularity</em>' attribute.
	 * @see #getOcciSensorGranularity()
	 * @generated
	 */
	void setOcciSensorGranularity(Integer value);

	/**
	 * Returns the value of the '<em><b>Occi Sensor Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accuracy of time measument (seconds)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Sensor Accuracy</em>' attribute.
	 * @see #setOcciSensorAccuracy(Integer)
	 * @see org.eclipse.cmf.occi.monitoring.MonitoringPackage#getSensor_OcciSensorAccuracy()
	 * @model dataType="org.eclipse.cmf.occi.monitoring.Second"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/monitoring/ecore!Sensor!occiSensorAccuracy'"
	 * @generated
	 */
	Integer getOcciSensorAccuracy();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.monitoring.Sensor#getOcciSensorAccuracy <em>Occi Sensor Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Sensor Accuracy</em>' attribute.
	 * @see #getOcciSensorAccuracy()
	 * @generated
	 */
	void setOcciSensorAccuracy(Integer value);

} // Sensor
