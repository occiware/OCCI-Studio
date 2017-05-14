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

import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.Transition;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.core.Transition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionItemProvider 
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
	public TransitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		if(adapterFactory instanceof IChangeNotifier) {
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

			addTargetPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_target_feature", "_UI_Transition_type"),
				 OCCIPackage.Literals.TRANSITION__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_action_feature", "_UI_Transition_type"),
				 OCCIPackage.Literals.TRANSITION__ACTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Transition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		
		Transition tr = ((Transition) object);
		
		String text = getString("_UI_Transition_type")+" ";
		
		text+=" --[ ";
		
		if(tr.getAction() != null)
		{	if(tr.getAction().getName() != null)
				text += ((Transition) object).getAction().getName();
		}
		text+= " ]--> ";
		if(tr.getTarget() != null)
		{	if(tr.getTarget().getLiteral() != null)
				text += ((Transition) object).getTarget().getLiteral().getName();
		}
		return text;
			
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
		switch (notification.getFeatureID(Transition.class)) {
		case OCCIPackage.TRANSITION__ACTION:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		case OCCIPackage.TRANSITION__TARGET:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
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
		return OCCIEditPlugin.INSTANCE;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#dispose()
	 */
	public void dispose() {
		super.dispose();
		if(changeListener != null) {
			((IChangeNotifier)getAdapterFactory()).removeListener(changeListener);
		}
	}
	
	
	class ChangeListener implements INotifyChangedListener {
		public void notifyChanged(Notification notification) {
			// Action changed
			if(notification.getNotifier() != null &&  getTarget() != null && notification.getNotifier() == ((Transition) getTarget()).getAction()) {
				((IChangeNotifier) getAdapterFactory()).removeListener(this);
				fireNotifyChanged(new ViewerNotification(notification, getTarget(), false, true));
				((IChangeNotifier) getAdapterFactory()).addListener(this);
			}
			if(targets!=null){
			for (Notifier target : targets){
				if(notification.getNotifier() != null &&  target != null && notification.getNotifier() == ((Transition) target).getAction()) {
					((IChangeNotifier) getAdapterFactory()).removeListener(this);
					fireNotifyChanged(new ViewerNotification(notification, target, false, true));
					((IChangeNotifier) getAdapterFactory()).addListener(this);
				}
			}
			}
			//Target changed
			if(getTarget()!=null){
				if(((Transition) getTarget()).getTarget() !=null){
					if(((Transition) getTarget()).getTarget().getLiteral()!=null){
			if(notification.getNotifier() != null &&  getTarget() != null && notification.getNotifier() == ((Transition) getTarget()).getTarget().getLiteral()) {
				((IChangeNotifier) getAdapterFactory()).removeListener(this);
				fireNotifyChanged(new ViewerNotification(notification, getTarget(), false, true));
				((IChangeNotifier) getAdapterFactory()).addListener(this);
			}
			if(targets!=null){
			for (Notifier target : targets){
				if(notification.getNotifier() != null &&  target != null && notification.getNotifier() == ((Transition) getTarget()).getTarget().getLiteral()) {
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
}
