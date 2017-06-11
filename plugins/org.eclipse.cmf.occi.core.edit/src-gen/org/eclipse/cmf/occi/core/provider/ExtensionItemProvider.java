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
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.core.Extension} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExtensionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addSchemePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addImportPropertyDescriptor(object);
			addSpecificationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Extension_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Extension_name_feature", "_UI_Extension_type"),
				 OCCIPackage.Literals.EXTENSION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scheme feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSchemePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Extension_scheme_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Extension_scheme_feature", "_UI_Extension_type"),
				 OCCIPackage.Literals.EXTENSION__SCHEME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Extension_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Extension_description_feature", "_UI_Extension_type"),
				 OCCIPackage.Literals.EXTENSION__DESCRIPTION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Import feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Extension_import_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Extension_import_feature", "_UI_Extension_type"),
				 OCCIPackage.Literals.EXTENSION__IMPORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}
//	protected void addImportPropertyDescriptor(Object object) {
//		itemPropertyDescriptors
//				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
//						getResourceLocator(), getString("_UI_Extension_import_feature"),
//						getString("_UI_PropertyDescriptor_description", "_UI_Extension_import_feature",
//								"_UI_Extension_type"),
//						OCCIPackage.Literals.EXTENSION__IMPORT, true, false, true, null, null, null) {
//					@Override
//					public Collection<?> getChoiceOfValues(Object object) {
//						List<Object> result = new ArrayList<Object>();
//						ResourceSet resourceSet = new ResourceSetImpl();
//						ArrayList<String> imports = new ArrayList<String>();
//						for (Extension extension : ((Extension) object).getImport()) {
//							imports.add(extension.getScheme().substring(0, extension.getScheme().length() - 1));
//						}
//						//System.out.println("imports " + imports);
//						for (Entry<URI, URI> entry : URIConverter.URI_MAP.entrySet()) {
//							if (entry.getValue().toString().endsWith("occie")) {
//								if (!(imports.contains(entry.getKey().toString()))) {
//									// The objects in the result list must have
//									// the type of the concerned reference.
//									// for example, for this case, the objects
//									// of the result list must be instanceof
//									// Extension class (and not uri, or string)
//									// because the import reference has the
//									// Extension type.
//									Extension ext = (Extension) OcciHelper.getRootElement(resourceSet,
//											entry.getKey().toString());
//									if (!(ext.getScheme().equals(((Extension) object).getScheme()))) {
//										//System.out.println("extension " + ext.eResource().getURI());
//										result.add(ext);
//									}
//								}
//							}
//						}
//						return result;
//					}
//				});
//	}

	/**
	 * This adds a property descriptor for the Specification feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Extension_specification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Extension_specification_feature", "_UI_Extension_type"),
				 OCCIPackage.Literals.EXTENSION__SPECIFICATION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OCCIPackage.Literals.EXTENSION__KINDS);
			childrenFeatures.add(OCCIPackage.Literals.EXTENSION__MIXINS);
			childrenFeatures.add(OCCIPackage.Literals.EXTENSION__TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Extension.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Extension"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Extension)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Extension_type") :
			getString("_UI_Extension_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Extension.class)) {
			case OCCIPackage.EXTENSION__NAME:
			case OCCIPackage.EXTENSION__SCHEME:
			case OCCIPackage.EXTENSION__DESCRIPTION:
			case OCCIPackage.EXTENSION__SPECIFICATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OCCIPackage.EXTENSION__KINDS:
			case OCCIPackage.EXTENSION__MIXINS:
			case OCCIPackage.EXTENSION__TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.EXTENSION__KINDS,
				 OCCIFactory.eINSTANCE.createKind()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.EXTENSION__MIXINS,
				 OCCIFactory.eINSTANCE.createMixin()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.EXTENSION__TYPES,
				 OCCIFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.EXTENSION__TYPES,
				 OCCIFactory.eINSTANCE.createEObjectType()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.EXTENSION__TYPES,
				 OCCIFactory.eINSTANCE.createBooleanType()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.EXTENSION__TYPES,
				 OCCIFactory.eINSTANCE.createNumericType()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.EXTENSION__TYPES,
				 OCCIFactory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.EXTENSION__TYPES,
				 OCCIFactory.eINSTANCE.createRecordType()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.EXTENSION__TYPES,
				 OCCIFactory.eINSTANCE.createArrayType()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OCCIEditPlugin.INSTANCE;
	}

}
