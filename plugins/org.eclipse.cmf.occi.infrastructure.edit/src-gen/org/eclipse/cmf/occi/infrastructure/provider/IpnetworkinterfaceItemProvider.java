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

import org.eclipse.cmf.occi.core.provider.MixinBaseItemProvider;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IpnetworkinterfaceItemProvider extends MixinBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpnetworkinterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addOcciNetworkinterfaceAddressPropertyDescriptor(object);
			addOcciNetworkinterfaceGatewayPropertyDescriptor(object);
			addOcciNetworkinterfaceAllocationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Occi Networkinterface Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciNetworkinterfaceAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ipnetworkinterface_occiNetworkinterfaceAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ipnetworkinterface_occiNetworkinterfaceAddress_feature", "_UI_Ipnetworkinterface_type"),
				 InfrastructurePackage.Literals.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Networkinterface Gateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciNetworkinterfaceGatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ipnetworkinterface_occiNetworkinterfaceGateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ipnetworkinterface_occiNetworkinterfaceGateway_feature", "_UI_Ipnetworkinterface_type"),
				 InfrastructurePackage.Literals.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_GATEWAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Networkinterface Allocation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciNetworkinterfaceAllocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ipnetworkinterface_occiNetworkinterfaceAllocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ipnetworkinterface_occiNetworkinterfaceAllocation_feature", "_UI_Ipnetworkinterface_type"),
				 InfrastructurePackage.Literals.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ALLOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Ipnetworkinterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Ipnetworkinterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Ipnetworkinterface)object).getOcciNetworkinterfaceAddress();
		return label == null || label.length() == 0 ?
			getString("_UI_Ipnetworkinterface_type") :
			getString("_UI_Ipnetworkinterface_type") + " " + label;
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

		switch (notification.getFeatureID(Ipnetworkinterface.class)) {
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ADDRESS:
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_GATEWAY:
			case InfrastructurePackage.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ALLOCATION:
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
