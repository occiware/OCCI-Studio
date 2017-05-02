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

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.monitoring.MonitoringPackage;
import org.eclipse.cmf.occi.monitoring.Sensor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.impl.SensorImpl#getOcciSensorTimebase <em>Occi Sensor Timebase</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.impl.SensorImpl#getOcciSensorTimestart <em>Occi Sensor Timestart</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.impl.SensorImpl#getOcciSensorTimestop <em>Occi Sensor Timestop</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.impl.SensorImpl#getOcciSensorPeriod <em>Occi Sensor Period</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.impl.SensorImpl#getOcciSensorGranularity <em>Occi Sensor Granularity</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.monitoring.impl.SensorImpl#getOcciSensorAccuracy <em>Occi Sensor Accuracy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends ResourceImpl implements Sensor {
	/**
	 * The default value of the '{@link #getOcciSensorTimebase() <em>Occi Sensor Timebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorTimebase()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCI_SENSOR_TIMEBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciSensorTimebase() <em>Occi Sensor Timebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorTimebase()
	 * @generated
	 * @ordered
	 */
	protected String occiSensorTimebase = OCCI_SENSOR_TIMEBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciSensorTimestart() <em>Occi Sensor Timestart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorTimestart()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCI_SENSOR_TIMESTART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciSensorTimestart() <em>Occi Sensor Timestart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorTimestart()
	 * @generated
	 * @ordered
	 */
	protected Integer occiSensorTimestart = OCCI_SENSOR_TIMESTART_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciSensorTimestop() <em>Occi Sensor Timestop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorTimestop()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCI_SENSOR_TIMESTOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciSensorTimestop() <em>Occi Sensor Timestop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorTimestop()
	 * @generated
	 * @ordered
	 */
	protected Integer occiSensorTimestop = OCCI_SENSOR_TIMESTOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciSensorPeriod() <em>Occi Sensor Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCCI_SENSOR_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciSensorPeriod() <em>Occi Sensor Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciSensorPeriod()
	 * @generated
	 * @ordered
	 */
	protected Integer occiSensorPeriod = OCCI_SENSOR_PERIOD_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonitoringPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOcciSensorTimebase() {
		return occiSensorTimebase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciSensorTimebase(String newOcciSensorTimebase) {
		String oldOcciSensorTimebase = occiSensorTimebase;
		occiSensorTimebase = newOcciSensorTimebase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__OCCI_SENSOR_TIMEBASE, oldOcciSensorTimebase, occiSensorTimebase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciSensorTimestart() {
		return occiSensorTimestart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciSensorTimestart(Integer newOcciSensorTimestart) {
		Integer oldOcciSensorTimestart = occiSensorTimestart;
		occiSensorTimestart = newOcciSensorTimestart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTART, oldOcciSensorTimestart, occiSensorTimestart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciSensorTimestop() {
		return occiSensorTimestop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciSensorTimestop(Integer newOcciSensorTimestop) {
		Integer oldOcciSensorTimestop = occiSensorTimestop;
		occiSensorTimestop = newOcciSensorTimestop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTOP, oldOcciSensorTimestop, occiSensorTimestop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOcciSensorPeriod() {
		return occiSensorPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciSensorPeriod(Integer newOcciSensorPeriod) {
		Integer oldOcciSensorPeriod = occiSensorPeriod;
		occiSensorPeriod = newOcciSensorPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__OCCI_SENSOR_PERIOD, oldOcciSensorPeriod, occiSensorPeriod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__OCCI_SENSOR_GRANULARITY, oldOcciSensorGranularity, occiSensorGranularity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MonitoringPackage.SENSOR__OCCI_SENSOR_ACCURACY, oldOcciSensorAccuracy, occiSensorAccuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMEBASE:
				return getOcciSensorTimebase();
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTART:
				return getOcciSensorTimestart();
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTOP:
				return getOcciSensorTimestop();
			case MonitoringPackage.SENSOR__OCCI_SENSOR_PERIOD:
				return getOcciSensorPeriod();
			case MonitoringPackage.SENSOR__OCCI_SENSOR_GRANULARITY:
				return getOcciSensorGranularity();
			case MonitoringPackage.SENSOR__OCCI_SENSOR_ACCURACY:
				return getOcciSensorAccuracy();
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
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMEBASE:
				setOcciSensorTimebase((String)newValue);
				return;
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTART:
				setOcciSensorTimestart((Integer)newValue);
				return;
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTOP:
				setOcciSensorTimestop((Integer)newValue);
				return;
			case MonitoringPackage.SENSOR__OCCI_SENSOR_PERIOD:
				setOcciSensorPeriod((Integer)newValue);
				return;
			case MonitoringPackage.SENSOR__OCCI_SENSOR_GRANULARITY:
				setOcciSensorGranularity((Integer)newValue);
				return;
			case MonitoringPackage.SENSOR__OCCI_SENSOR_ACCURACY:
				setOcciSensorAccuracy((Integer)newValue);
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
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMEBASE:
				setOcciSensorTimebase(OCCI_SENSOR_TIMEBASE_EDEFAULT);
				return;
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTART:
				setOcciSensorTimestart(OCCI_SENSOR_TIMESTART_EDEFAULT);
				return;
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTOP:
				setOcciSensorTimestop(OCCI_SENSOR_TIMESTOP_EDEFAULT);
				return;
			case MonitoringPackage.SENSOR__OCCI_SENSOR_PERIOD:
				setOcciSensorPeriod(OCCI_SENSOR_PERIOD_EDEFAULT);
				return;
			case MonitoringPackage.SENSOR__OCCI_SENSOR_GRANULARITY:
				setOcciSensorGranularity(OCCI_SENSOR_GRANULARITY_EDEFAULT);
				return;
			case MonitoringPackage.SENSOR__OCCI_SENSOR_ACCURACY:
				setOcciSensorAccuracy(OCCI_SENSOR_ACCURACY_EDEFAULT);
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
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMEBASE:
				return OCCI_SENSOR_TIMEBASE_EDEFAULT == null ? occiSensorTimebase != null : !OCCI_SENSOR_TIMEBASE_EDEFAULT.equals(occiSensorTimebase);
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTART:
				return OCCI_SENSOR_TIMESTART_EDEFAULT == null ? occiSensorTimestart != null : !OCCI_SENSOR_TIMESTART_EDEFAULT.equals(occiSensorTimestart);
			case MonitoringPackage.SENSOR__OCCI_SENSOR_TIMESTOP:
				return OCCI_SENSOR_TIMESTOP_EDEFAULT == null ? occiSensorTimestop != null : !OCCI_SENSOR_TIMESTOP_EDEFAULT.equals(occiSensorTimestop);
			case MonitoringPackage.SENSOR__OCCI_SENSOR_PERIOD:
				return OCCI_SENSOR_PERIOD_EDEFAULT == null ? occiSensorPeriod != null : !OCCI_SENSOR_PERIOD_EDEFAULT.equals(occiSensorPeriod);
			case MonitoringPackage.SENSOR__OCCI_SENSOR_GRANULARITY:
				return OCCI_SENSOR_GRANULARITY_EDEFAULT == null ? occiSensorGranularity != null : !OCCI_SENSOR_GRANULARITY_EDEFAULT.equals(occiSensorGranularity);
			case MonitoringPackage.SENSOR__OCCI_SENSOR_ACCURACY:
				return OCCI_SENSOR_ACCURACY_EDEFAULT == null ? occiSensorAccuracy != null : !OCCI_SENSOR_ACCURACY_EDEFAULT.equals(occiSensorAccuracy);
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
		result.append(" (occiSensorTimebase: ");
		result.append(occiSensorTimebase);
		result.append(", occiSensorTimestart: ");
		result.append(occiSensorTimestart);
		result.append(", occiSensorTimestop: ");
		result.append(occiSensorTimestop);
		result.append(", occiSensorPeriod: ");
		result.append(occiSensorPeriod);
		result.append(", occiSensorGranularity: ");
		result.append(occiSensorGranularity);
		result.append(", occiSensorAccuracy: ");
		result.append(occiSensorAccuracy);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
