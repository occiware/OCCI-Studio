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


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.core.Attribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeItemProvider 
	extends AnnotatedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addMutablePropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_name_feature", "_UI_Attribute_type"),
				 OCCIPackage.Literals.ATTRIBUTE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mutable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMutablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_mutable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_mutable_feature", "_UI_Attribute_type"),
				 OCCIPackage.Literals.ATTRIBUTE__MUTABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_required_feature", "_UI_Attribute_type"),
				 OCCIPackage.Literals.ATTRIBUTE__REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_default_feature", "_UI_Attribute_type"),
				 OCCIPackage.Literals.ATTRIBUTE__DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_description_feature", "_UI_Attribute_type"),
				 OCCIPackage.Literals.ATTRIBUTE__DESCRIPTION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	protected void addTypePropertyDescriptor(Object object) {
		final IItemLabelProvider lp = new IItemLabelProvider() {
			public String getText(Object object) {
				if (object instanceof DataType) {
//					if (((DataType) object).eContainer() instanceof EPackage) {
//						return ((EPackage) ((DataType) object).eContainer()).getNsURI() + '#'
//								+ ((DataType) object).getName();
//					} 
//					else 
						if (((DataType) object).eContainer() instanceof Extension) {
						String scheme = ((Extension) ((DataType) object).eContainer()).getScheme();
						if (!scheme.endsWith("#")) {
							scheme += "#";
						}
						return scheme + ((DataType) object).getName();
					}
					//return ((DataType) object).getName() + '[' + ((DataType) object).getInstanceTypeName() + ']';
				}
				return "";
			}

			public Object getImage(Object object) {
				return null;
			}
		};
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Attribute_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Attribute_type_feature",
								"_UI_Attribute_type"),
						OCCIPackage.Literals.ATTRIBUTE__TYPE, true, false, true, null, null, null) {

					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						List<DataType> list = new ArrayList<DataType>();
						for (Object choice : super.getChoiceOfValues(object)) {
							if (choice instanceof DataType && ((DataType) choice).eContainer() != null
									&& ((((DataType) choice).eContainer() instanceof Extension)
											|| (((EPackage) ((DataType) choice).eContainer()).getNsURI()
													.equals(OCCIPackage.eINSTANCE.getNsURI())))) {
								list.add((DataType) choice);
							}
						}
						return list;
					}

					@Override
					public IItemLabelProvider getLabelProvider(Object object) {
						if (object instanceof Attribute) {
							return lp;
						}
						return super.getLabelProvider(object);
					}

				});
	}
//	protected void addTypePropertyDescriptor(Object object) {
//	itemPropertyDescriptors.add
//		(createItemPropertyDescriptor
//			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//			 getResourceLocator(),
//			 getString("_UI_Attribute_type_feature"),
//			 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_type_feature", "_UI_Attribute_type"),
//			 OCCIPackage.Literals.ATTRIBUTE__TYPE,
//			 true,
//			 false,
//			 true,
//			 null,
//			 null,
//			 null));
//}

	/**
	 * This returns Attribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Attribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Attribute)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Attribute_type") :
			getString("_UI_Attribute_type") + " " + label;
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

		switch (notification.getFeatureID(Attribute.class)) {
			case OCCIPackage.ATTRIBUTE__NAME:
			case OCCIPackage.ATTRIBUTE__MUTABLE:
			case OCCIPackage.ATTRIBUTE__REQUIRED:
			case OCCIPackage.ATTRIBUTE__DEFAULT:
			case OCCIPackage.ATTRIBUTE__DESCRIPTION:
			case OCCIPackage.ATTRIBUTE__TYPE:
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

}
