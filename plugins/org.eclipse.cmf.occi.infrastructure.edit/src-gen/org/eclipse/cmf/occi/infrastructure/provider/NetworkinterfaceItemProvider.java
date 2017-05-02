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
package org.eclipse.cmf.occi.infrastructure.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.core.provider.LinkItemProvider;

import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.infrastructure.Networkinterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkinterfaceItemProvider extends LinkItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkinterfaceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOcciNetworkinterfaceInterfacePropertyDescriptor(object);
			addOcciNetworkinterfaceMacPropertyDescriptor(object);
			addOcciNetworkinterfaceStatePropertyDescriptor(object);
			addOcciNetworkinterfaceStateMessagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Occi Networkinterface Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciNetworkinterfaceInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Networkinterface_occiNetworkinterfaceInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Networkinterface_occiNetworkinterfaceInterface_feature", "_UI_Networkinterface_type"),
				 InfrastructurePackage.Literals.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Networkinterface Mac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciNetworkinterfaceMacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Networkinterface_occiNetworkinterfaceMac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Networkinterface_occiNetworkinterfaceMac_feature", "_UI_Networkinterface_type"),
				 InfrastructurePackage.Literals.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Networkinterface State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciNetworkinterfaceStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Networkinterface_occiNetworkinterfaceState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Networkinterface_occiNetworkinterfaceState_feature", "_UI_Networkinterface_type"),
				 InfrastructurePackage.Literals.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Networkinterface State Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciNetworkinterfaceStateMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Networkinterface_occiNetworkinterfaceStateMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Networkinterface_occiNetworkinterfaceStateMessage_feature", "_UI_Networkinterface_type"),
				 InfrastructurePackage.Literals.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Networkinterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Networkinterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Networkinterface)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Networkinterface_type") :
			getString("_UI_Networkinterface_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Networkinterface.class)) {
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE:
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC:
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE:
			case InfrastructurePackage.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createIpnetwork()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createIpnetworkinterface()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createOs_tpl()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createResource_tpl()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createSsh_key()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 InfrastructureFactory.eINSTANCE.createUser_data()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return InfrastructureEditPlugin.INSTANCE;
	}

}
