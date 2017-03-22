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

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIKindResolver;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.util.OCCI2Ecore;
import org.eclipse.cmf.occi.util.OCCIHelper;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.impl.EntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.EntityImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.EntityImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.EntityImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.EntityImpl#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.EntityImpl#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(EntityImpl.class);
	
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind kind;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeState> attributes;

	/**
	 * The cached setting delegate for the '{@link #getMixins() <em>Mixins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MIXINS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)OCCIPackage.Literals.ENTITY__MIXINS).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<MixinBase> parts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EntityImpl() {
		super();
		System.out.println("EntityImpl");
		// Generate a new ID for this entity.
		setId(UUID.randomUUID().toString());
		// If kind is not set then
		if (kind == null) {
			try {
				// Try to resolve it automatically.
				kind = OCCIKindResolver.resolveKind(this);
			} catch (Exception exc) {
				LOGGER.warn("SHOULD NEVER HAPPEN!", exc);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ENTITY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (Kind)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.ENTITY__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Kind newKind) {
		Kind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ENTITY__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ENTITY__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeState> getAttributes() {
		  System.out.println("getAttributes");
			if (attributes == null) {
				attributes = new EObjectContainmentEList<AttributeState>(AttributeState.class, this,
						OCCIPackage.ENTITY__ATTRIBUTES);
			}
			
			//
			// Synchronize OCCI attributes from EMF attributes.
			//

			// Array to store doublons of OCCI attribute states.
			final ArrayList<AttributeState> toRemove = new ArrayList<AttributeState>();

			// Compute a map of all current OCCI attribute state instances.
			final HashMap<String, AttributeState> map = new HashMap<String, AttributeState>();
			for(AttributeState attributeState : attributes) {
				String attributeStateName = attributeState.getName();
				AttributeState oldAttributeState = map.get(attributeStateName);
				if(oldAttributeState != null) {
					toRemove.add(oldAttributeState);
				}
				map.put(attributeStateName, attributeState);
			}

			// Remove doublons of OCCI attribute state instances.
			for(AttributeState attributeState : toRemove) {
				attributes.remove(attributeState);
			}
			
	//
	// Since attribute occi.core.id was added to entity kind, following code is not necessary.
	//

			// Add a default attribute occi.core.id (mandatory ref. GFD.185 section 3.1 p6).
			// only if occi.core.id does not exist.
//			boolean occiCoreIdExist = false;
//			for (AttributeState attributeState : attributes) {
//				if (attributeState.getName().equals("occi.core.id")) {
//					occiCoreIdExist = true;
//					break;
//				}
//			}
//			if (!occiCoreIdExist) {
//				AttributeState attrState = OCCIFactory.eINSTANCE.createAttributeState();
//				attrState.setName("occi.core.id");
//				attrState.setValue(getId());
//				attributes.add(attrState);
//			}

			// Iterate over all OCCI attributes of this entity.
			for(Attribute attribute : OCCIHelper.getAllAttributes(this)) {
				final String attributeName = attribute.getName();
				// Search the Ecore structural feature associated to this OCCI attribute.
				final EStructuralFeature eStructuralFeature = eClass().getEStructuralFeature(OCCI2Ecore.convertOcciAttributeName2EcoreAttributeName(attributeName));
				// If this is an Ecore attribute then
				if(eStructuralFeature != null && eStructuralFeature instanceof EAttribute) {
					final int featureId = eStructuralFeature.getFeatureID();
					// If this Ecore attribute is set then
					if(eIsSet(featureId)) {
						// Search the associated attribute state from the map.
						AttributeState attributeState = map.get(attributeName);
						// If not found then create it.
						if(attributeState == null) {
							attributeState = new AttributeStateImpl();
							attributeState.setName(attributeName);
							try {
								attributes.add(attributeState);
							} catch (Exception e) {
								// FIXME: Don't understand why an exception is thrown!!!
								LOGGER.warn("Exception when add attribute state '" + attributeName + "': " + e.getMessage() + "!!!");
							}
						}
						// Get the Ecore attribute value.
						final String valueAsString = eGet(featureId, true, true).toString();
						// If this value has changed then
						if(!valueAsString.equals(attributeState.getValue())) {
							// Set the attribute set value.
							try {
								attributeState.setValue(valueAsString);
							} catch (Exception e) {
								// FIXME: Don't understand why an exception is thrown!!!
								LOGGER.warn("Exception when set attribute state '" + attributeName + "': " + e.getMessage() + "!!!");
							}
						}
					}
				}
			}
			
			return attributes;
		}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Mixin> getMixins() {
		return (EList<Mixin>)MIXINS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MixinBase> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentWithInverseEList<MixinBase>(MixinBase.class, this, OCCIPackage.ENTITY__PARTS, OCCIPackage.MIXIN_BASE__ENTITY);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void occiCreate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void occiRetrieve() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void occiUpdate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void occiDelete() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.ENTITY__PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParts()).basicAdd(otherEnd, msgs);
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
			case OCCIPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case OCCIPackage.ENTITY__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
			case OCCIPackage.ENTITY__ID:
				return getId();
			case OCCIPackage.ENTITY__TITLE:
				return getTitle();
			case OCCIPackage.ENTITY__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case OCCIPackage.ENTITY__LOCATION:
				return getLocation();
			case OCCIPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case OCCIPackage.ENTITY__MIXINS:
				return getMixins();
			case OCCIPackage.ENTITY__PARTS:
				return getParts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCCIPackage.ENTITY__ID:
				setId((String)newValue);
				return;
			case OCCIPackage.ENTITY__TITLE:
				setTitle((String)newValue);
				return;
			case OCCIPackage.ENTITY__KIND:
				setKind((Kind)newValue);
				return;
			case OCCIPackage.ENTITY__LOCATION:
				setLocation((String)newValue);
				return;
			case OCCIPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeState>)newValue);
				return;
			case OCCIPackage.ENTITY__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends MixinBase>)newValue);
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
			case OCCIPackage.ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case OCCIPackage.ENTITY__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OCCIPackage.ENTITY__KIND:
				setKind((Kind)null);
				return;
			case OCCIPackage.ENTITY__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case OCCIPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case OCCIPackage.ENTITY__PARTS:
				getParts().clear();
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
			case OCCIPackage.ENTITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OCCIPackage.ENTITY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OCCIPackage.ENTITY__KIND:
				return kind != null;
			case OCCIPackage.ENTITY__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case OCCIPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case OCCIPackage.ENTITY__MIXINS:
				return MIXINS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case OCCIPackage.ENTITY__PARTS:
				return parts != null && !parts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OCCIPackage.ENTITY___OCCI_CREATE:
				occiCreate();
				return null;
			case OCCIPackage.ENTITY___OCCI_RETRIEVE:
				occiRetrieve();
				return null;
			case OCCIPackage.ENTITY___OCCI_UPDATE:
				occiUpdate();
				return null;
			case OCCIPackage.ENTITY___OCCI_DELETE:
				occiDelete();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
