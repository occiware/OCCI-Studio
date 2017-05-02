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

import org.eclipse.cmf.occi.core.provider.ResourceItemProvider;

import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.infrastructure.Compute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputeItemProvider extends ResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeItemProvider(AdapterFactory adapterFactory) {
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

			addOcciComputeArchitecturePropertyDescriptor(object);
			addOcciComputeCoresPropertyDescriptor(object);
			addOcciComputeHostnamePropertyDescriptor(object);
			addOcciComputeSharePropertyDescriptor(object);
			addOcciComputeSpeedPropertyDescriptor(object);
			addOcciComputeMemoryPropertyDescriptor(object);
			addOcciComputeStatePropertyDescriptor(object);
			addOcciComputeStateMessagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Occi Compute Architecture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciComputeArchitecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Compute_occiComputeArchitecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Compute_occiComputeArchitecture_feature", "_UI_Compute_type"),
				 InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_ARCHITECTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Compute Cores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciComputeCoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Compute_occiComputeCores_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Compute_occiComputeCores_feature", "_UI_Compute_type"),
				 InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_CORES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Compute Hostname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciComputeHostnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Compute_occiComputeHostname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Compute_occiComputeHostname_feature", "_UI_Compute_type"),
				 InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_HOSTNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Compute Share feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciComputeSharePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Compute_occiComputeShare_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Compute_occiComputeShare_feature", "_UI_Compute_type"),
				 InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_SHARE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Compute Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciComputeSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Compute_occiComputeSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Compute_occiComputeSpeed_feature", "_UI_Compute_type"),
				 InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Compute Memory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciComputeMemoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Compute_occiComputeMemory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Compute_occiComputeMemory_feature", "_UI_Compute_type"),
				 InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_MEMORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Compute State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciComputeStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Compute_occiComputeState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Compute_occiComputeState_feature", "_UI_Compute_type"),
				 InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occi Compute State Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOcciComputeStateMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Compute_occiComputeStateMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Compute_occiComputeStateMessage_feature", "_UI_Compute_type"),
				 InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Compute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Compute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Compute)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Compute_type") :
			getString("_UI_Compute_type") + " " + label;
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

		switch (notification.getFeatureID(Compute.class)) {
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE:
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES:
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME:
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE:
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED:
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY:
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE:
			case InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE:
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

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 InfrastructureFactory.eINSTANCE.createStoragelink()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.RESOURCE__LINKS,
				 InfrastructureFactory.eINSTANCE.createNetworkinterface()));
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
