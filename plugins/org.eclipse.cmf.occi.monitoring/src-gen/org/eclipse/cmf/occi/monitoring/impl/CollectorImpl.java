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
package org.eclipse.cmf.occi.monitoring.impl;

import org.eclipse.cmf.occi.core.impl.LinkImpl;

import org.eclipse.cmf.occi.monitoring.Collector;
import org.eclipse.cmf.occi.monitoring.MonitoringPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.impl.CollectorImpl#getOcciCollectorPeriod <em>Occi Collector Period</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.impl.CollectorImpl#getOcciSensorAccuracy <em>Occi Sensor Accuracy</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.impl.CollectorImpl#getOcciSensorGranularity <em>Occi Sensor Granularity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectorImpl extends LinkImpl implements Collector {
	/**
	 * The default value of the '{@link #getOcciCollectorPeriod() <em>Occi Collector Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciCollectorPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCI_COLLECTOR_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciCollectorPeriod() <em>Occi Collector Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciCollectorPeriod()
	 * @generated
	 * @ordered
	 */
	protected Integer occiCollectorPeriod = OCCI_COLLECTOR_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciSensorAccuracy() <em>Occi Sensor Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCI_SENSOR_ACCURACY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciSensorAccuracy() <em>Occi Sensor Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorAccuracy()
	 * @generated
	 * @ordered
	 */
	protected Integer occiSensorAccuracy = OCCI_SENSOR_ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciSensorGranularity() <em>Occi Sensor Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorGranularity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCI_SENSOR_GRANULARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciSensorGranularity() <em>Occi Sensor Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorGranularity()
	 * @generated
	 * @ordered
	 */
	protected Integer occiSensorGranularity = OCCI_SENSOR_GRANULARITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitoringPackage.Literals.COLLECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciCollectorPeriod() {
		return occiCollectorPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciCollectorPeriod(Integer newOcciCollectorPeriod) {
		Integer oldOcciCollectorPeriod = occiCollectorPeriod;
		occiCollectorPeriod = newOcciCollectorPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.COLLECTOR__OCCI_COLLECTOR_PERIOD, oldOcciCollectorPeriod, occiCollectorPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciSensorAccuracy() {
		return occiSensorAccuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciSensorAccuracy(Integer newOcciSensorAccuracy) {
		Integer oldOcciSensorAccuracy = occiSensorAccuracy;
		occiSensorAccuracy = newOcciSensorAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.COLLECTOR__OCCI_SENSOR_ACCURACY, oldOcciSensorAccuracy, occiSensorAccuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciSensorGranularity() {
		return occiSensorGranularity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciSensorGranularity(Integer newOcciSensorGranularity) {
		Integer oldOcciSensorGranularity = occiSensorGranularity;
		occiSensorGranularity = newOcciSensorGranularity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.COLLECTOR__OCCI_SENSOR_GRANULARITY, oldOcciSensorGranularity, occiSensorGranularity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MonitoringPackage.COLLECTOR__OCCI_COLLECTOR_PERIOD:
				return getOcciCollectorPeriod();
			case MonitoringPackage.COLLECTOR__OCCI_SENSOR_ACCURACY:
				return getOcciSensorAccuracy();
			case MonitoringPackage.COLLECTOR__OCCI_SENSOR_GRANULARITY:
				return getOcciSensorGranularity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MonitoringPackage.COLLECTOR__OCCI_COLLECTOR_PERIOD:
				setOcciCollectorPeriod((Integer)newValue);
				return;
			case MonitoringPackage.COLLECTOR__OCCI_SENSOR_ACCURACY:
				setOcciSensorAccuracy((Integer)newValue);
				return;
			case MonitoringPackage.COLLECTOR__OCCI_SENSOR_GRANULARITY:
				setOcciSensorGranularity((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MonitoringPackage.COLLECTOR__OCCI_COLLECTOR_PERIOD:
				setOcciCollectorPeriod(OCCI_COLLECTOR_PERIOD_EDEFAULT);
				return;
			case MonitoringPackage.COLLECTOR__OCCI_SENSOR_ACCURACY:
				setOcciSensorAccuracy(OCCI_SENSOR_ACCURACY_EDEFAULT);
				return;
			case MonitoringPackage.COLLECTOR__OCCI_SENSOR_GRANULARITY:
				setOcciSensorGranularity(OCCI_SENSOR_GRANULARITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MonitoringPackage.COLLECTOR__OCCI_COLLECTOR_PERIOD:
				return OCCI_COLLECTOR_PERIOD_EDEFAULT == null ? occiCollectorPeriod != null : !OCCI_COLLECTOR_PERIOD_EDEFAULT.equals(occiCollectorPeriod);
			case MonitoringPackage.COLLECTOR__OCCI_SENSOR_ACCURACY:
				return OCCI_SENSOR_ACCURACY_EDEFAULT == null ? occiSensorAccuracy != null : !OCCI_SENSOR_ACCURACY_EDEFAULT.equals(occiSensorAccuracy);
			case MonitoringPackage.COLLECTOR__OCCI_SENSOR_GRANULARITY:
				return OCCI_SENSOR_GRANULARITY_EDEFAULT == null ? occiSensorGranularity != null : !OCCI_SENSOR_GRANULARITY_EDEFAULT.equals(occiSensorGranularity);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (occiCollectorPeriod: ");
		result.append(occiCollectorPeriod);
		result.append(", occiSensorAccuracy: ");
		result.append(occiSensorAccuracy);
		result.append(", occiSensorGranularity: ");
		result.append(occiSensorGranularity);
		result.append(')');
		return result.toString();
	}

} //CollectorImpl
