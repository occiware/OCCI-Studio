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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.Resource;
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

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.core.Entity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	private static final String CORE_EXT_LINK_KIND_ID = "http://schemas.ogf.org/occi/core#link";
	private static final String CORE_EXT_RESOURCE_KIND_ID = "http://schemas.ogf.org/occi/core#resource";
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addKindPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addMixinsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_id_feature", "_UI_Entity_type"),
				 OCCIPackage.Literals.ENTITY__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_title_feature", "_UI_Entity_type"),
				 OCCIPackage.Literals.ENTITY__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addKindPropertyDescriptor(Object object) {
		final IItemLabelProvider lp = new IItemLabelProvider() {
			public String getText(Object object) {
				if (object != null) {
					return ((Kind) object).getScheme() + ((Kind) object).getTerm();
				}
				return "";
			}

			public Object getImage(Object object) {
				return null;
			}
		};
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Entity_kind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Entity_kind_feature", "_UI_Entity_type"),
						OCCIPackage.Literals.ENTITY__KIND, true, false, true, null, null, null) {
					@Override
					public IItemLabelProvider getLabelProvider(Object object) {
						if (object instanceof Entity) {
							return lp;
						}
						return super.getLabelProvider(object);
					}

					@SuppressWarnings("unchecked")
					@Override
					public Collection<?> getChoiceOfValues(final Object object) {
						Set<Kind> choices = new HashSet<Kind>();
						if (object instanceof Resource) {
							for (Extension ext : ((Configuration) ((Resource) object).eContainer()).getUse()) {
								choices.addAll(getAllKinds(ext));
							}
						} else if (object instanceof Link) {
							for (Extension ext : ((Configuration) ((Link) object).eContainer().eContainer()).getUse()) {
								choices.addAll(getAllKinds(ext));
							}
						}
						return Lists.newArrayList(Iterables.filter(choices, new Predicate() {
							public boolean apply(Object input) {
								if (object instanceof Resource) {
									return isOfGivenKind((Kind) input, CORE_EXT_RESOURCE_KIND_ID);
								} else if (object instanceof Link) {
									return isOfGivenKind((Kind) input, CORE_EXT_LINK_KIND_ID);
								}
								return false;
							}
						}));
					}

				});

	}
	private static boolean isOfGivenKind(Kind kind, String id) {
		return ((kind.getScheme() + kind.getTerm()).equals(id))
				|| (kind.getParent() != null && isOfGivenKind(kind.getParent(), id));
	}

	private static Collection<? extends Kind> getAllKinds(Extension ext) {
		Set<Kind> kinds = new HashSet<Kind>();
		for (Extension imp : ext.getImport()) {
			kinds.addAll(getAllKinds(imp));
		}
		kinds.addAll(ext.getKinds());
		return kinds;
	}
//	protected void addKindPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_Entity_kind_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_kind_feature", "_UI_Entity_type"),
//				 OCCIPackage.Literals.ENTITY__KIND,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
//	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_location_feature", "_UI_Entity_type"),
				 OCCIPackage.Literals.ENTITY__LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mixins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMixinsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_mixins_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_mixins_feature", "_UI_Entity_type"),
				 OCCIPackage.Literals.ENTITY__MIXINS,
				 false,
				 false,
				 false,
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
			childrenFeatures.add(OCCIPackage.Literals.ENTITY__ATTRIBUTES);
			childrenFeatures.add(OCCIPackage.Literals.ENTITY__PARTS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Entity)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Entity_type") :
			getString("_UI_Entity_type") + " " + label;
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

		switch (notification.getFeatureID(Entity.class)) {
			case OCCIPackage.ENTITY__ID:
			case OCCIPackage.ENTITY__TITLE:
			case OCCIPackage.ENTITY__LOCATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OCCIPackage.ENTITY__ATTRIBUTES:
			case OCCIPackage.ENTITY__PARTS:
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
				(OCCIPackage.Literals.ENTITY__ATTRIBUTES,
				 OCCIFactory.eINSTANCE.createAttributeState()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 OCCIFactory.eINSTANCE.createMixinBase()));
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

}
