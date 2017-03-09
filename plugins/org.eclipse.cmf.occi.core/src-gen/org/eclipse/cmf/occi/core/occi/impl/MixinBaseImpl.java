/**
 */
package org.eclipse.cmf.occi.core.occi.impl;

import org.eclipse.cmf.occi.core.occi.Entity;
import org.eclipse.cmf.occi.core.occi.Mixin;
import org.eclipse.cmf.occi.core.occi.MixinBase;
import org.eclipse.cmf.occi.core.occi.OcciPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mixin Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.impl.MixinBaseImpl#getMixin <em>Mixin</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.impl.MixinBaseImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MixinBaseImpl extends MinimalEObjectImpl.Container implements MixinBase {
	/**
	 * The cached value of the '{@link #getMixin() <em>Mixin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixin()
	 * @generated
	 * @ordered
	 */
	protected Mixin mixin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MixinBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OcciPackage.Literals.MIXIN_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mixin getMixin() {
		if (mixin != null && mixin.eIsProxy()) {
			InternalEObject oldMixin = (InternalEObject)mixin;
			mixin = (Mixin)eResolveProxy(oldMixin);
			if (mixin != oldMixin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OcciPackage.MIXIN_BASE__MIXIN, oldMixin, mixin));
			}
		}
		return mixin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mixin basicGetMixin() {
		return mixin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMixin(Mixin newMixin) {
		Mixin oldMixin = mixin;
		mixin = newMixin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcciPackage.MIXIN_BASE__MIXIN, oldMixin, mixin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (eContainerFeatureID() != OcciPackage.MIXIN_BASE__ENTITY) return null;
		return (Entity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEntity, OcciPackage.MIXIN_BASE__ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		if (newEntity != eInternalContainer() || (eContainerFeatureID() != OcciPackage.MIXIN_BASE__ENTITY && newEntity != null)) {
			if (EcoreUtil.isAncestor(this, newEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, OcciPackage.ENTITY__PARTS, Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OcciPackage.MIXIN_BASE__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcciPackage.MIXIN_BASE__ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEntity((Entity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OcciPackage.MIXIN_BASE__ENTITY:
				return basicSetEntity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OcciPackage.MIXIN_BASE__ENTITY:
				return eInternalContainer().eInverseRemove(this, OcciPackage.ENTITY__PARTS, Entity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OcciPackage.MIXIN_BASE__MIXIN:
				if (resolve) return getMixin();
				return basicGetMixin();
			case OcciPackage.MIXIN_BASE__ENTITY:
				return getEntity();
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
			case OcciPackage.MIXIN_BASE__MIXIN:
				setMixin((Mixin)newValue);
				return;
			case OcciPackage.MIXIN_BASE__ENTITY:
				setEntity((Entity)newValue);
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
			case OcciPackage.MIXIN_BASE__MIXIN:
				setMixin((Mixin)null);
				return;
			case OcciPackage.MIXIN_BASE__ENTITY:
				setEntity((Entity)null);
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
			case OcciPackage.MIXIN_BASE__MIXIN:
				return mixin != null;
			case OcciPackage.MIXIN_BASE__ENTITY:
				return getEntity() != null;
		}
		return super.eIsSet(featureID);
	}

} //MixinBaseImpl
