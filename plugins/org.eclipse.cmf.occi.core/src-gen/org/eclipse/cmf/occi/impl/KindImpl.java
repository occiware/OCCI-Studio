/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.impl;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.FSM;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.impl.KindImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.KindImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.KindImpl#getFsm <em>Fsm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KindImpl extends TypeImpl implements Kind {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Kind parent;

	/**
	 * The cached setting delegate for the '{@link #getEntities() <em>Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ENTITIES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)OCCIPackage.Literals.KIND__ENTITIES).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getFsm() <em>Fsm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm()
	 * @generated
	 * @ordered
	 */
	protected FSM fsm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.KIND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Kind)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.KIND__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Kind newParent) {
		Kind oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.KIND__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entity> getEntities() {
		return (EList<Entity>)ENTITIES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM getFsm() {
		return fsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFsm(FSM newFsm, NotificationChain msgs) {
		FSM oldFsm = fsm;
		fsm = newFsm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCCIPackage.KIND__FSM, oldFsm, newFsm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFsm(FSM newFsm) {
		if (newFsm != fsm) {
			NotificationChain msgs = null;
			if (fsm != null)
				msgs = ((InternalEObject)fsm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCCIPackage.KIND__FSM, null, msgs);
			if (newFsm != null)
				msgs = ((InternalEObject)newFsm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OCCIPackage.KIND__FSM, null, msgs);
			msgs = basicSetFsm(newFsm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.KIND__FSM, newFsm, newFsm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.KIND__FSM:
				return basicSetFsm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCCIPackage.KIND__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OCCIPackage.KIND__ENTITIES:
				return getEntities();
			case OCCIPackage.KIND__FSM:
				return getFsm();
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
			case OCCIPackage.KIND__PARENT:
				setParent((Kind)newValue);
				return;
			case OCCIPackage.KIND__FSM:
				setFsm((FSM)newValue);
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
			case OCCIPackage.KIND__PARENT:
				setParent((Kind)null);
				return;
			case OCCIPackage.KIND__FSM:
				setFsm((FSM)null);
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
			case OCCIPackage.KIND__PARENT:
				return parent != null;
			case OCCIPackage.KIND__ENTITIES:
				return ENTITIES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case OCCIPackage.KIND__FSM:
				return fsm != null;
		}
		return super.eIsSet(featureID);
	}

} //KindImpl
