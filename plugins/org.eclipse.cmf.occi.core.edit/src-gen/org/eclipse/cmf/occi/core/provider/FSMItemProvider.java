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
package org.eclipse.cmf.occi.core.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.core.FSM;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.core.FSM} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FSMItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	
	private ChangeListener changeListener;
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FSMItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		if (adapterFactory instanceof IChangeNotifier) {
			IChangeNotifier cn = (IChangeNotifier) adapterFactory;
			changeListener = new ChangeListener();
			cn.addListener(changeListener);
		}
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

			addAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FSM_attribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FSM_attribute_feature", "_UI_FSM_type"),
				 OCCIPackage.Literals.FSM__ATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OCCIPackage.Literals.FSM__OWNED_STATE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FSM.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FSM"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		if (((FSM) object).getAttribute() != null){
			if(((FSM) object).getAttribute().getType() != null)
			return getString("_UI_FSM_type") + " " + ((FSM) object).getAttribute().getName() + " "
					+ ((FSM) object).getAttribute().getType().getName();
			else
				return getString("_UI_FSM_type");
			}
		else
			return getString("_UI_FSM_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		switch (notification.getFeatureID(FSM.class)) {
		case OCCIPackage.FSM__OWNED_STATE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		case OCCIPackage.FSM__ATTRIBUTE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
				(OCCIPackage.Literals.FSM__OWNED_STATE,
				 OCCIFactory.eINSTANCE.createState()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OCCIEditPlugin.INSTANCE;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#dispose()
	 */
	public void dispose() {
		super.dispose();
		if (changeListener != null) {
			((IChangeNotifier) getAdapterFactory()).removeListener(changeListener);
		}
	}

	class ChangeListener implements INotifyChangedListener {
		public void notifyChanged(Notification notification) {
			// The first notifies when the attribute of FSM changes
			// The FSM says: Hey! my attribute is changed
			// The type changes automatically when the attribute changes

			if (notification.getNotifier() != null && getTarget() != null
					&& notification.getNotifier() == ((FSM) getTarget())) {
				((IChangeNotifier) getAdapterFactory()).removeListener(this);
				fireNotifyChanged(new ViewerNotification(notification, getTarget(), false, true));
				((IChangeNotifier) getAdapterFactory()).addListener(this);
			}
			// other targets
			if (targets != null) {
				for (Notifier target : targets) {
					if (notification.getNotifier() != null && target != null
							&& notification.getNotifier() == ((FSM) getTarget())) {
						((IChangeNotifier) getAdapterFactory()).removeListener(this);
						fireNotifyChanged(new ViewerNotification(notification, target, false, true));
						((IChangeNotifier) getAdapterFactory()).addListener(this);
					}
				}
			}
			// This part notifies when the attribute name changes or its type
			// changes. So the notifier is the Attribute
			// The Attribute say: Hey! my name is changed, or, Hey! my type is
			// changed
			// last target
			if (notification.getNotifier() != null && getTarget() != null
					&& notification.getNotifier() == ((FSM) getTarget()).getAttribute()) {
				((IChangeNotifier) getAdapterFactory()).removeListener(this);
				fireNotifyChanged(new ViewerNotification(notification, getTarget(), false, true));
				((IChangeNotifier) getAdapterFactory()).addListener(this);
			}
			// other targets
			if (targets != null) {
				for (Notifier target : targets) {
					if (notification.getNotifier() != null && target != null
							&& notification.getNotifier() == ((FSM) getTarget()).getAttribute()) {
						((IChangeNotifier) getAdapterFactory()).removeListener(this);
						fireNotifyChanged(new ViewerNotification(notification, target, false, true));
						((IChangeNotifier) getAdapterFactory()).addListener(this);
					}
				}
			}
			// However in this part, the type notifies when its name changes.
			// The type say: Hey, my name is changed
			// last target
			if (((FSM) getTarget()) != null) {
				if (((FSM) getTarget()).getAttribute() != null) {
					if (notification.getNotifier() != null && getTarget() != null
							&& notification.getNotifier() == ((FSM) getTarget()).getAttribute().getType()) {
						((IChangeNotifier) getAdapterFactory()).removeListener(this);
						fireNotifyChanged(new ViewerNotification(notification, getTarget(), false, true));
						((IChangeNotifier) getAdapterFactory()).addListener(this);
					}
					// other targets
					if (targets != null) {
						for (Notifier target : targets) {
							if (notification.getNotifier() != null && target != null
									&& notification.getNotifier() == ((FSM) getTarget()).getAttribute().getType()) {
								((IChangeNotifier) getAdapterFactory()).removeListener(this);
								fireNotifyChanged(new ViewerNotification(notification, target, false, true));
								((IChangeNotifier) getAdapterFactory()).addListener(this);
							}
						}
					}
				}
			}
		}
	}
}
