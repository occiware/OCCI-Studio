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
package org.eclipse.cmf.occi.core.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesAllOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ConfigurationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ConfigurationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ConfigurationImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ConfigurationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ConfigurationImpl#getMixins <em>Mixins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> use;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getMixins() <em>Mixins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixins()
	 * @generated
	 * @ordered
	 */
	protected EList<Mixin> mixins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.CONFIGURATION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.CONFIGURATION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getUse() {
		if (use == null) {
			use = new EObjectResolvingEList<Extension>(Extension.class, this, OCCIPackage.CONFIGURATION__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Resource>(Resource.class, this, OCCIPackage.CONFIGURATION__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectContainmentEList<Mixin>(Mixin.class, this, OCCIPackage.CONFIGURATION__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllMixinsAreTags(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AllMixinsAreTags:
		 *   let severity : Integer[1] = 'Configuration::AllMixinsAreTags'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = mixins->forAll(
		 *           attributes->isEmpty() and
		 *           actions->isEmpty() and
		 *           depends->isEmpty())
		 *       in
		 *         'Configuration::AllMixinsAreTags'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Configuration_c_c_AllMixinsAreTags);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<Mixin> mixins = this.getMixins();
			final /*@NonInvalid*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
			/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
			/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_mixins.iterator();
			/*@NonInvalid*/ Boolean result;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					if (accumulator == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						throw (InvalidValueException)accumulator;
					}
					break;
				}
				/*@NonInvalid*/ Mixin _1 = (Mixin)ITERATOR__1.next();
				/**
				 * attributes->isEmpty() and actions->isEmpty() and depends->isEmpty()
				 */
				final /*@NonInvalid*/ List<Attribute> attributes = _1.getAttributes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes);
				final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_attributes).booleanValue();
				/*@NonInvalid*/ boolean and;
				if (isEmpty) {
					final /*@NonInvalid*/ List<Action> actions = _1.getActions();
					final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Action, actions);
					final /*@NonInvalid*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_actions).booleanValue();
					and = isEmpty_0;
				}
				else {
					and = ValueUtil.FALSE_VALUE;
				}
				/*@NonInvalid*/ boolean and_0;
				if (and) {
					final /*@NonInvalid*/ List<Mixin> depends = _1.getDepends();
					final /*@NonInvalid*/ OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
					final /*@NonInvalid*/ boolean isEmpty_1 = CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_depends).booleanValue();
					and_0 = isEmpty_1;
				}
				else {
					and_0 = ValueUtil.FALSE_VALUE;
				}
				//
				if (and_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
					result = ValueUtil.FALSE_VALUE;
					break;														// Stop immediately
				}
				else if (and_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
					;															// Carry on
				}
				else {															// Impossible badly typed result
					accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
				}
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllMixinsAreTags, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OCCITables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllResourcesLinksTargetsInConfiguration(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AllResourcesLinksTargetsInConfiguration:
		 *   let
		 *     severity : Integer[1] = 'Configuration::AllResourcesLinksTargetsInConfiguration'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = resources.links.target->forAll(r |
		 *           r.oclContainer() = self)
		 *       in
		 *         'Configuration::AllResourcesLinksTargetsInConfiguration'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Configuration_c_c_AllResourcesLinksTargetsInConfiguration);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<Resource> resources = this.getResources();
			final /*@NonInvalid*/ OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
			/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Link);
			/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_resources.iterator();
			/*@NonInvalid*/ SequenceValue collect_0;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect_0 = accumulator;
					break;
				}
				/*@NonInvalid*/ Resource _1 = (Resource)ITERATOR__1.next();
				/**
				 * links
				 */
				final /*@NonInvalid*/ List<Link> links = _1.getLinks();
				final /*@NonInvalid*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Link, links);
				//
				for (Object value : BOXED_links.flatten().getElements()) {
					accumulator.add(value);
				}
			}
			/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Resource);
			/*@NonNull*/ Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
			/*@NonInvalid*/ SequenceValue collect;
			while (true) {
				if (!ITERATOR__1_0.hasNext()) {
					collect = accumulator_0;
					break;
				}
				/*@NonInvalid*/ Link _1_0 = (Link)ITERATOR__1_0.next();
				/**
				 * target
				 */
				final /*@NonInvalid*/ Resource target = _1_0.getTarget();
				//
				accumulator_0.add(target);
			}
			/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
			/*@NonNull*/ Iterator<Object> ITERATOR_r = collect.iterator();
			/*@NonInvalid*/ Boolean result;
			while (true) {
				if (!ITERATOR_r.hasNext()) {
					if (accumulator_1 == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						throw (InvalidValueException)accumulator_1;
					}
					break;
				}
				/*@NonInvalid*/ Resource r = (Resource)ITERATOR_r.next();
				/**
				 * r.oclContainer() = self
				 */
				final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, r);
				final /*@NonInvalid*/ boolean eq = this.equals(oclContainer);
				//
				if (eq == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
					result = ValueUtil.FALSE_VALUE;
					break;														// Stop immediately
				}
				else if (eq == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
					;															// Carry on
				}
				else {															// Impossible badly typed result
					accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
				}
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesLinksTargetsInConfiguration, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OCCITables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllResourcesKindsInUse(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AllResourcesKindsInUse:
		 *   let
		 *     severity : Integer[1] = 'Configuration::AllResourcesKindsInUse'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[1] = use->includesAll(resources.kind.oclContainer())
		 *       in
		 *         'Configuration::AllResourcesKindsInUse'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Configuration_c_c_AllResourcesKindsInUse);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Extension> use = this.getUse();
				final /*@NonInvalid*/ OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
				final /*@NonInvalid*/ List<Resource> resources = this.getResources();
				final /*@NonInvalid*/ OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Kind);
				/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_resources.iterator();
				/*@NonInvalid*/ SequenceValue collect_0;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect_0 = accumulator;
						break;
					}
					/*@NonInvalid*/ Resource _1 = (Resource)ITERATOR__1.next();
					/**
					 * kind
					 */
					final /*@NonInvalid*/ Kind kind_0 = _1.getKind();
					//
					accumulator.add(kind_0);
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_OclElement);
				/*@NonNull*/ Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
				/*@Thrown*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						collect = accumulator_0;
						break;
					}
					/*@NonInvalid*/ Kind _1_0 = (Kind)ITERATOR__1_0.next();
					/**
					 * oclContainer()
					 */
					final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, _1_0);
					//
					if (oclContainer instanceof CollectionValue) {
						for (Object value : ((CollectionValue)oclContainer).flatten().getElements()) {
							accumulator_0.add(value);
						}
					}
					else {
						accumulator_0.add(oclContainer);
					}
				}
				final /*@Thrown*/ boolean result = CollectionIncludesAllOperation.INSTANCE.evaluate(BOXED_use, collect).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesKindsInUse, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllResourcesLinksMixinsInUse(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AllResourcesLinksMixinsInUse:
		 *   let
		 *     severity : Integer[1] = 'Configuration::AllResourcesLinksMixinsInUse'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = resources.links.parts.mixin->forAll(mo |
		 *           let mixinOwner : OclElement[?] = mo.oclContainer()
		 *           in
		 *             if mixinOwner.oclIsTypeOf(Extension)
		 *             then
		 *               self.use->includes(mixinOwner.oclAsType(Extension))
		 *             else self.mixins->includes(mo)
		 *             endif)
		 *       in
		 *         'Configuration::AllResourcesLinksMixinsInUse'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Configuration_c_c_AllResourcesLinksMixinsInUse);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
			symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Resource> resources = this.getResources();
				final /*@NonInvalid*/ OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Link);
				/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_resources.iterator();
				/*@NonInvalid*/ SequenceValue collect_1;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect_1 = accumulator;
						break;
					}
					/*@NonInvalid*/ Resource _1 = (Resource)ITERATOR__1.next();
					/**
					 * links
					 */
					final /*@NonInvalid*/ List<Link> links = _1.getLinks();
					final /*@NonInvalid*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Link, links);
					//
					for (Object value : BOXED_links.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR__1_0 = collect_1.iterator();
				/*@NonInvalid*/ SequenceValue collect_0;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						collect_0 = accumulator_0;
						break;
					}
					/*@NonInvalid*/ Link _1_0 = (Link)ITERATOR__1_0.next();
					/**
					 * parts
					 */
					final /*@NonInvalid*/ List<MixinBase> parts = _1_0.getParts();
					final /*@NonInvalid*/ OrderedSetValue BOXED_parts = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_MixinBase, parts);
					//
					for (Object value : BOXED_parts.flatten().getElements()) {
						accumulator_0.add(value);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Mixin);
				/*@NonNull*/ Iterator<Object> ITERATOR__1_1 = collect_0.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1_1.hasNext()) {
						collect = accumulator_1;
						break;
					}
					/*@NonInvalid*/ MixinBase _1_1 = (MixinBase)ITERATOR__1_1.next();
					/**
					 * mixin
					 */
					final /*@NonInvalid*/ Mixin mixin = _1_1.getMixin();
					//
					accumulator_1.add(mixin);
				}
				/*@Thrown*/ Object accumulator_2 = ValueUtil.TRUE_VALUE;
				/*@NonNull*/ Iterator<Object> ITERATOR_mo = collect.iterator();
				/*@Thrown*/ Boolean result;
				while (true) {
					if (!ITERATOR_mo.hasNext()) {
						if (accumulator_2 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator_2;
						}
						break;
					}
					/*@NonInvalid*/ Mixin mo = (Mixin)ITERATOR_mo.next();
					/**
					 *
					 * let mixinOwner : OclElement[?] = mo.oclContainer()
					 * in
					 *   if mixinOwner.oclIsTypeOf(Extension)
					 *   then
					 *     self.use->includes(mixinOwner.oclAsType(Extension))
					 *   else self.mixins->includes(mo)
					 *   endif
					 */
					/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_0;
					try {
						final /*@NonInvalid*/ Object mixinOwner = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, mo);
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Extension_0 = idResolver.getClass(OCCITables.CLSSid_Extension, null);
						final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, mixinOwner, TYP_occi_c_c_Extension_0).booleanValue();
						/*@Thrown*/ boolean symbol_0;
						if (oclIsTypeOf) {
							final /*@NonInvalid*/ List<Extension> use = this.getUse();
							final /*@NonInvalid*/ OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
							final /*@Thrown*/ Extension oclAsType = ClassUtil.nonNullState((Extension)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, mixinOwner, TYP_occi_c_c_Extension_0));
							final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_use, oclAsType).booleanValue();
							symbol_0 = includes;
						}
						else {
							final /*@NonInvalid*/ List<Mixin> mixins = this.getMixins();
							final /*@NonInvalid*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
							final /*@NonInvalid*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_mixins, mo).booleanValue();
							symbol_0 = includes_0;
						}
						CAUGHT_symbol_0 = symbol_0;
					}
					catch (Exception e) {
						CAUGHT_symbol_0 = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_symbol_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_symbol_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_symbol_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator_2 = CAUGHT_symbol_0;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator_2 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesLinksMixinsInUse, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllResourcesMixinsInUse(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AllResourcesMixinsInUse:
		 *   let
		 *     severity : Integer[1] = 'Configuration::AllResourcesMixinsInUse'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = resources.parts.mixin->forAll(mo |
		 *           let mixinOwner : OclElement[?] = mo.oclContainer()
		 *           in
		 *             if mixinOwner.oclIsTypeOf(Extension)
		 *             then
		 *               self.use->includes(mixinOwner.oclAsType(Extension))
		 *             else self.mixins->includes(mo)
		 *             endif)
		 *       in
		 *         'Configuration::AllResourcesMixinsInUse'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Configuration_c_c_AllResourcesMixinsInUse);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
			symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Resource> resources = this.getResources();
				final /*@NonInvalid*/ OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_MixinBase);
				/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_resources.iterator();
				/*@NonInvalid*/ SequenceValue collect_0;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect_0 = accumulator;
						break;
					}
					/*@NonInvalid*/ Resource _1 = (Resource)ITERATOR__1.next();
					/**
					 * parts
					 */
					final /*@NonInvalid*/ List<MixinBase> parts = _1.getParts();
					final /*@NonInvalid*/ OrderedSetValue BOXED_parts = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_MixinBase, parts);
					//
					for (Object value : BOXED_parts.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Mixin);
				/*@NonNull*/ Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						collect = accumulator_0;
						break;
					}
					/*@NonInvalid*/ MixinBase _1_0 = (MixinBase)ITERATOR__1_0.next();
					/**
					 * mixin
					 */
					final /*@NonInvalid*/ Mixin mixin = _1_0.getMixin();
					//
					accumulator_0.add(mixin);
				}
				/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
				/*@NonNull*/ Iterator<Object> ITERATOR_mo = collect.iterator();
				/*@Thrown*/ Boolean result;
				while (true) {
					if (!ITERATOR_mo.hasNext()) {
						if (accumulator_1 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator_1;
						}
						break;
					}
					/*@NonInvalid*/ Mixin mo = (Mixin)ITERATOR_mo.next();
					/**
					 *
					 * let mixinOwner : OclElement[?] = mo.oclContainer()
					 * in
					 *   if mixinOwner.oclIsTypeOf(Extension)
					 *   then
					 *     self.use->includes(mixinOwner.oclAsType(Extension))
					 *   else self.mixins->includes(mo)
					 *   endif
					 */
					/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_0;
					try {
						final /*@NonInvalid*/ Object mixinOwner = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, mo);
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Extension_0 = idResolver.getClass(OCCITables.CLSSid_Extension, null);
						final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, mixinOwner, TYP_occi_c_c_Extension_0).booleanValue();
						/*@Thrown*/ boolean symbol_0;
						if (oclIsTypeOf) {
							final /*@NonInvalid*/ List<Extension> use = this.getUse();
							final /*@NonInvalid*/ OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
							final /*@Thrown*/ Extension oclAsType = ClassUtil.nonNullState((Extension)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, mixinOwner, TYP_occi_c_c_Extension_0));
							final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_use, oclAsType).booleanValue();
							symbol_0 = includes;
						}
						else {
							final /*@NonInvalid*/ List<Mixin> mixins = this.getMixins();
							final /*@NonInvalid*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
							final /*@NonInvalid*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_mixins, mo).booleanValue();
							symbol_0 = includes_0;
						}
						CAUGHT_symbol_0 = symbol_0;
					}
					catch (Exception e) {
						CAUGHT_symbol_0 = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_symbol_0 == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_symbol_0 == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_symbol_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator_1 = CAUGHT_symbol_0;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesMixinsInUse, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AllResourcesLinksKindsInUse(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AllResourcesLinksKindsInUse:
		 *   let
		 *     severity : Integer[1] = 'Configuration::AllResourcesLinksKindsInUse'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[1] = use->includesAll(
		 *           resources.links.kind.oclContainer())
		 *       in
		 *         'Configuration::AllResourcesLinksKindsInUse'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Configuration_c_c_AllResourcesLinksKindsInUse);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Extension> use = this.getUse();
				final /*@NonInvalid*/ OrderedSetValue BOXED_use = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, use);
				final /*@NonInvalid*/ List<Resource> resources = this.getResources();
				final /*@NonInvalid*/ OrderedSetValue BOXED_resources = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Resource, resources);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Link);
				/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_resources.iterator();
				/*@NonInvalid*/ SequenceValue collect_1;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect_1 = accumulator;
						break;
					}
					/*@NonInvalid*/ Resource _1 = (Resource)ITERATOR__1.next();
					/**
					 * links
					 */
					final /*@NonInvalid*/ List<Link> links = _1.getLinks();
					final /*@NonInvalid*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Link, links);
					//
					for (Object value : BOXED_links.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Kind);
				/*@NonNull*/ Iterator<Object> ITERATOR__1_0 = collect_1.iterator();
				/*@NonInvalid*/ SequenceValue collect_0;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						collect_0 = accumulator_0;
						break;
					}
					/*@NonInvalid*/ Link _1_0 = (Link)ITERATOR__1_0.next();
					/**
					 * kind
					 */
					final /*@NonInvalid*/ Kind kind_0 = _1_0.getKind();
					//
					accumulator_0.add(kind_0);
				}
				/*@Thrown*/ SequenceValue.Accumulator accumulator_1 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_OclElement);
				/*@NonNull*/ Iterator<Object> ITERATOR__1_1 = collect_0.iterator();
				/*@Thrown*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1_1.hasNext()) {
						collect = accumulator_1;
						break;
					}
					/*@NonInvalid*/ Kind _1_1 = (Kind)ITERATOR__1_1.next();
					/**
					 * oclContainer()
					 */
					final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, _1_1);
					//
					if (oclContainer instanceof CollectionValue) {
						for (Object value : ((CollectionValue)oclContainer).flatten().getElements()) {
							accumulator_1.add(value);
						}
					}
					else {
						accumulator_1.add(oclContainer);
					}
				}
				final /*@Thrown*/ boolean result = CollectionIncludesAllOperation.INSTANCE.evaluate(BOXED_use, collect).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Configuration_c_c_AllResourcesLinksKindsInUse, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.CONFIGURATION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case OCCIPackage.CONFIGURATION__MIXINS:
				return ((InternalEList<?>)getMixins()).basicRemove(otherEnd, msgs);
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
			case OCCIPackage.CONFIGURATION__DESCRIPTION:
				return getDescription();
			case OCCIPackage.CONFIGURATION__LOCATION:
				return getLocation();
			case OCCIPackage.CONFIGURATION__USE:
				return getUse();
			case OCCIPackage.CONFIGURATION__RESOURCES:
				return getResources();
			case OCCIPackage.CONFIGURATION__MIXINS:
				return getMixins();
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
			case OCCIPackage.CONFIGURATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OCCIPackage.CONFIGURATION__LOCATION:
				setLocation((String)newValue);
				return;
			case OCCIPackage.CONFIGURATION__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends Extension>)newValue);
				return;
			case OCCIPackage.CONFIGURATION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case OCCIPackage.CONFIGURATION__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends Mixin>)newValue);
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
			case OCCIPackage.CONFIGURATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OCCIPackage.CONFIGURATION__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case OCCIPackage.CONFIGURATION__USE:
				getUse().clear();
				return;
			case OCCIPackage.CONFIGURATION__RESOURCES:
				getResources().clear();
				return;
			case OCCIPackage.CONFIGURATION__MIXINS:
				getMixins().clear();
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
			case OCCIPackage.CONFIGURATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OCCIPackage.CONFIGURATION__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case OCCIPackage.CONFIGURATION__USE:
				return use != null && !use.isEmpty();
			case OCCIPackage.CONFIGURATION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case OCCIPackage.CONFIGURATION__MIXINS:
				return mixins != null && !mixins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OCCIPackage.CONFIGURATION___ALL_MIXINS_ARE_TAGS__DIAGNOSTICCHAIN_MAP:
				return AllMixinsAreTags((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_LINKS_TARGETS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP:
				return AllResourcesLinksTargetsInConfiguration((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesKindsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_LINKS_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesLinksMixinsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_MIXINS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesMixinsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.CONFIGURATION___ALL_RESOURCES_LINKS_KINDS_IN_USE__DIAGNOSTICCHAIN_MAP:
				return AllResourcesLinksKindsInUse((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //ConfigurationImpl
