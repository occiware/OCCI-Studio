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
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.OCCITables;
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

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIntersectionOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.logical.BooleanOrOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.library.string.StringSubstringOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ExtensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ExtensionImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ExtensionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ExtensionImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ExtensionImpl#getKinds <em>Kinds</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ExtensionImpl#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ExtensionImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.ExtensionImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionImpl extends MinimalEObjectImpl.Container implements Extension {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

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
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Extension> import_;

	/**
	 * The cached value of the '{@link #getKinds() <em>Kinds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinds()
	 * @generated
	 * @ordered
	 */
	protected EList<Kind> kinds;

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
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> types;

	/**
	 * The default value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected String specification = SPECIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.EXTENSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.EXTENSION__SCHEME, oldScheme, scheme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.EXTENSION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getImport() {
		if (import_ == null) {
			import_ = new EObjectResolvingEList<Extension>(Extension.class, this, OCCIPackage.EXTENSION__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kind> getKinds() {
		if (kinds == null) {
			kinds = new EObjectContainmentEList<Kind>(Kind.class, this, OCCIPackage.EXTENSION__KINDS);
		}
		return kinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mixin> getMixins() {
		if (mixins == null) {
			mixins = new EObjectContainmentEList<Mixin>(Mixin.class, this, OCCIPackage.EXTENSION__MIXINS);
		}
		return mixins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<DataType>(DataType.class, this, OCCIPackage.EXTENSION__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(String newSpecification) {
		String oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.EXTENSION__SPECIFICATION, oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean KindsSchemeValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv KindsSchemeValid:
		 *   let severity : Integer[1] = 'Extension::KindsSchemeValid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : Boolean[?] = kinds->forAll(k | k.scheme = self.scheme)
		 *       in
		 *         'Extension::KindsSchemeValid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Extension_c_c_KindsSchemeValid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<Kind> kinds = this.getKinds();
			final /*@NonInvalid*/ OrderedSetValue BOXED_kinds = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, kinds);
			/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
			/*@NonNull*/ Iterator<Object> ITERATOR_k = BOXED_kinds.iterator();
			/*@NonInvalid*/ Boolean result;
			while (true) {
				if (!ITERATOR_k.hasNext()) {
					if (accumulator == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						throw (InvalidValueException)accumulator;
					}
					break;
				}
				/*@NonInvalid*/ Kind k = (Kind)ITERATOR_k.next();
				/**
				 * k.scheme = self.scheme
				 */
				final /*@NonInvalid*/ String scheme = k.getScheme();
				final /*@NonInvalid*/ String scheme_0 = this.getScheme();
				final /*@NonInvalid*/ boolean eq = scheme.equals(scheme_0);
				//
				if (eq == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
					result = ValueUtil.FALSE_VALUE;
					break;														// Stop immediately
				}
				else if (eq == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
					;															// Carry on
				}
				else {															// Impossible badly typed result
					accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
				}
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_KindsSchemeValid, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OCCITables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean KindParentLocalOrImported(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv KindParentLocalOrImported:
		 *   let
		 *     severity : Integer[1] = 'Extension::KindParentLocalOrImported'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = kinds->forAll(parent <> null implies
		 *           let parentExtension : OclElement[?] = parent.oclContainer()
		 *           in parentExtension = self or
		 *             import->includes(parentExtension))
		 *       in
		 *         'Extension::KindParentLocalOrImported'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Extension_c_c_KindParentLocalOrImported);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
			symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Kind> kinds = this.getKinds();
				final /*@NonInvalid*/ OrderedSetValue BOXED_kinds = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, kinds);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_kinds.iterator();
				/*@Thrown*/ Boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						if (accumulator == null) {
							result = null;
						}
						else if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Kind _1 = (Kind)ITERATOR__1.next();
					/**
					 * parent <> null implies
					 * let parentExtension : OclElement[?] = parent.oclContainer()
					 * in parentExtension = self or import->includes(parentExtension)
					 */
					/*@Caught*/ /*@Nullable*/ Object CAUGHT_implies;
					try {
						final /*@NonInvalid*/ Kind parent = _1.getParent();
						final /*@NonInvalid*/ boolean ne = parent != null;
						/*@Thrown*/ Boolean implies;
						if (ne) {
							/*@Caught*/ /*@Nullable*/ Object CAUGHT_parentExtension;
							try {
								final /*@Thrown*/ Object parentExtension = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, parent);
								CAUGHT_parentExtension = parentExtension;
							}
							catch (Exception e) {
								CAUGHT_parentExtension = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq;
							try {
								if (CAUGHT_parentExtension instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_parentExtension;
								}
								final /*@Thrown*/ boolean eq = this.equals(CAUGHT_parentExtension);
								CAUGHT_eq = eq;
							}
							catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ /*@NonNull*/ Object CAUGHT_includes;
							try {
								final /*@NonInvalid*/ List<Extension> symbol_0 = this.getImport();
								final /*@NonInvalid*/ OrderedSetValue BOXED_symbol_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, symbol_0);
								if (CAUGHT_parentExtension instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_parentExtension;
								}
								final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_symbol_0, CAUGHT_parentExtension).booleanValue();
								CAUGHT_includes = includes;
							}
							catch (Exception e) {
								CAUGHT_includes = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_includes);
							implies = or;
						}
						else {
							implies = ValueUtil.TRUE_VALUE;
						}
						CAUGHT_implies = implies;
					}
					catch (Exception e) {
						CAUGHT_implies = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_implies == null) {								// Abnormal null body evaluation result
						if (accumulator == ValueUtil.TRUE_VALUE) {
							accumulator = null;										// Cache a null failure
						}
					}
					else if (CAUGHT_implies instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator = CAUGHT_implies;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_KindParentLocalOrImported, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MixinsSchemeValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv MixinsSchemeValid:
		 *   let severity : Integer[1] = 'Extension::MixinsSchemeValid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = mixins->forAll(m |
		 *           m.scheme.substring(1, scheme.size() - 1) =
		 *           scheme.substring(1, scheme.size() - 1))
		 *       in
		 *         'Extension::MixinsSchemeValid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Extension_c_c_MixinsSchemeValid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Mixin> mixins = this.getMixins();
				final /*@NonInvalid*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				/*@NonNull*/ Iterator<Object> ITERATOR_m = BOXED_mixins.iterator();
				/*@Thrown*/ Boolean result;
				while (true) {
					if (!ITERATOR_m.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Mixin m = (Mixin)ITERATOR_m.next();
					/**
					 *
					 * m.scheme.substring(1, scheme.size() - 1) =
					 * scheme.substring(1, scheme.size() - 1)
					 */
					/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq;
					try {
						final /*@NonInvalid*/ String scheme_1 = this.getScheme();
						final /*@NonInvalid*/ IntegerValue size_0 = StringSizeOperation.INSTANCE.evaluate(scheme_1);
						final /*@NonInvalid*/ IntegerValue diff_0 = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size_0, OCCITables.INT_1);
						final /*@NonInvalid*/ String scheme = m.getScheme();
						final /*@Thrown*/ String substring = StringSubstringOperation.INSTANCE.evaluate(scheme, OCCITables.INT_1, diff_0);
						final /*@Thrown*/ String substring_0 = StringSubstringOperation.INSTANCE.evaluate(scheme_1, OCCITables.INT_1, diff_0);
						final /*@Thrown*/ boolean eq = substring.equals(substring_0);
						CAUGHT_eq = eq;
					}
					catch (Exception e) {
						CAUGHT_eq = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_eq instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator = CAUGHT_eq;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_MixinsSchemeValid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TermUnicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv TermUnicity:
		 *   let severity : Integer[1] = 'Extension::TermUnicity'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[1] = kinds.term->intersection(mixins.term)
		 *         ->isEmpty()
		 *       in
		 *         'Extension::TermUnicity'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Extension_c_c_TermUnicity);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<Kind> kinds = this.getKinds();
			final /*@NonInvalid*/ OrderedSetValue BOXED_kinds = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, kinds);
			/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
			/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_kinds.iterator();
			/*@NonInvalid*/ SequenceValue collect;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect = accumulator;
					break;
				}
				/*@NonInvalid*/ Kind _1 = (Kind)ITERATOR__1.next();
				/**
				 * term
				 */
				final /*@NonInvalid*/ String term = _1.getTerm();
				//
				accumulator.add(term);
			}
			final /*@NonInvalid*/ List<Mixin> mixins = this.getMixins();
			final /*@NonInvalid*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
			/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_PRIMid_String);
			/*@NonNull*/ Iterator<Object> ITERATOR__1_0 = BOXED_mixins.iterator();
			/*@NonInvalid*/ SequenceValue collect_0;
			while (true) {
				if (!ITERATOR__1_0.hasNext()) {
					collect_0 = accumulator_0;
					break;
				}
				/*@NonInvalid*/ Mixin _1_0 = (Mixin)ITERATOR__1_0.next();
				/**
				 * term
				 */
				final /*@NonInvalid*/ String term_0 = _1_0.getTerm();
				//
				accumulator_0.add(term_0);
			}
			final /*@NonInvalid*/ BagValue intersection = (BagValue)CollectionIntersectionOperation.INSTANCE.evaluate(collect, collect_0);
			final /*@NonInvalid*/ boolean result = CollectionIsEmptyOperation.INSTANCE.evaluate(intersection).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_TermUnicity, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OCCITables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MixinAppliesLocalOrImported(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv MixinAppliesLocalOrImported:
		 *   let
		 *     severity : Integer[1] = 'Extension::MixinAppliesLocalOrImported'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = mixins.applies->forAll(
		 *           let extension : OclElement[?] = oclContainer()
		 *           in extension = self or import->includes(extension))
		 *       in
		 *         'Extension::MixinAppliesLocalOrImported'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Extension_c_c_MixinAppliesLocalOrImported);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
			symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Mixin> mixins = this.getMixins();
				final /*@NonInvalid*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Kind);
				/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_mixins.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Mixin _1 = (Mixin)ITERATOR__1.next();
					/**
					 * applies
					 */
					final /*@NonInvalid*/ List<Kind> applies = _1.getApplies();
					final /*@NonInvalid*/ OrderedSetValue BOXED_applies = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, applies);
					//
					for (Object value : BOXED_applies.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
				/*@NonNull*/ Iterator<Object> ITERATOR__1_0 = collect.iterator();
				/*@Thrown*/ Boolean result;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						if (accumulator_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator_0;
						}
						break;
					}
					/*@NonInvalid*/ Kind _1_0 = (Kind)ITERATOR__1_0.next();
					/**
					 *
					 * let extension : OclElement[?] = oclContainer()
					 * in extension = self or import->includes(extension)
					 */
					/*@Caught*/ /*@NonNull*/ Object CAUGHT_or;
					try {
						final /*@NonInvalid*/ Object extension = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, _1_0);
						final /*@NonInvalid*/ boolean eq = this.equals(extension);
						/*@Thrown*/ boolean or;
						if (eq) {
							or = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ List<Extension> symbol_0 = this.getImport();
							final /*@NonInvalid*/ OrderedSetValue BOXED_symbol_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, symbol_0);
							final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_symbol_0, extension).booleanValue();
							or = includes;
						}
						CAUGHT_or = or;
					}
					catch (Exception e) {
						CAUGHT_or = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_or == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_or == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_or instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator_0 = CAUGHT_or;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_MixinAppliesLocalOrImported, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SchemeUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SchemeUnique:
		 *   let severity : Integer[1] = 'Extension::SchemeUnique'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[1] = Extension.allInstances()
		 *         ->isUnique(scheme)
		 *       in
		 *         'Extension::SchemeUnique'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Extension_c_c_SchemeUnique);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Extension_0 = idResolver.getClass(OCCITables.CLSSid_Extension, null);
			final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, OCCITables.SET_CLSSid_Extension, TYP_occi_c_c_Extension_0);
			/*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.SET_CLSSid_Extension);
			/*@NonNull*/ Iterator<Object> ITERATOR__1 = allInstances.iterator();
			/*@NonInvalid*/ boolean result;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					result = ValueUtil.TRUE_VALUE;
					break;
				}
				/*@NonInvalid*/ Extension _1 = (Extension)ITERATOR__1.next();
				/**
				 * scheme
				 */
				final /*@NonInvalid*/ String scheme = _1.getScheme();
				//
				if (accumulator.includes(scheme) == ValueUtil.TRUE_VALUE) {
					result = ValueUtil.FALSE_VALUE;			// Abort after second find
					break;
				}
				else {
					accumulator.add(scheme);
				}
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_SchemeUnique, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, OCCITables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MixinDependsLocalOrImported(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv MixinDependsLocalOrImported:
		 *   let
		 *     severity : Integer[1] = 'Extension::MixinDependsLocalOrImported'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = mixins.depends->forAll(
		 *           let extension : OclElement[?] = oclContainer()
		 *           in extension = self or import->includes(extension))
		 *       in
		 *         'Extension::MixinDependsLocalOrImported'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Extension_c_c_MixinDependsLocalOrImported);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
			symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Mixin> mixins = this.getMixins();
				final /*@NonInvalid*/ OrderedSetValue BOXED_mixins = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, mixins);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Mixin);
				/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_mixins.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Mixin _1 = (Mixin)ITERATOR__1.next();
					/**
					 * depends
					 */
					final /*@NonInvalid*/ List<Mixin> depends = _1.getDepends();
					final /*@NonInvalid*/ OrderedSetValue BOXED_depends = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Mixin, depends);
					//
					for (Object value : BOXED_depends.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
				/*@NonNull*/ Iterator<Object> ITERATOR__1_0 = collect.iterator();
				/*@Thrown*/ Boolean result;
				while (true) {
					if (!ITERATOR__1_0.hasNext()) {
						if (accumulator_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator_0;
						}
						break;
					}
					/*@NonInvalid*/ Mixin _1_0 = (Mixin)ITERATOR__1_0.next();
					/**
					 *
					 * let extension : OclElement[?] = oclContainer()
					 * in extension = self or import->includes(extension)
					 */
					/*@Caught*/ /*@NonNull*/ Object CAUGHT_or;
					try {
						final /*@NonInvalid*/ Object extension = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, _1_0);
						final /*@NonInvalid*/ boolean eq = this.equals(extension);
						/*@Thrown*/ boolean or;
						if (eq) {
							or = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ List<Extension> symbol_0 = this.getImport();
							final /*@NonInvalid*/ OrderedSetValue BOXED_symbol_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Extension, symbol_0);
							final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_symbol_0, extension).booleanValue();
							or = includes;
						}
						CAUGHT_or = or;
					}
					catch (Exception e) {
						CAUGHT_or = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_or == ValueUtil.FALSE_VALUE) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_or == ValueUtil.TRUE_VALUE) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_or instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator_0 = CAUGHT_or;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Extension_c_c_MixinDependsLocalOrImported, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.EXTENSION__KINDS:
				return ((InternalEList<?>)getKinds()).basicRemove(otherEnd, msgs);
			case OCCIPackage.EXTENSION__MIXINS:
				return ((InternalEList<?>)getMixins()).basicRemove(otherEnd, msgs);
			case OCCIPackage.EXTENSION__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case OCCIPackage.EXTENSION__NAME:
				return getName();
			case OCCIPackage.EXTENSION__SCHEME:
				return getScheme();
			case OCCIPackage.EXTENSION__DESCRIPTION:
				return getDescription();
			case OCCIPackage.EXTENSION__IMPORT:
				return getImport();
			case OCCIPackage.EXTENSION__KINDS:
				return getKinds();
			case OCCIPackage.EXTENSION__MIXINS:
				return getMixins();
			case OCCIPackage.EXTENSION__TYPES:
				return getTypes();
			case OCCIPackage.EXTENSION__SPECIFICATION:
				return getSpecification();
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
			case OCCIPackage.EXTENSION__NAME:
				setName((String)newValue);
				return;
			case OCCIPackage.EXTENSION__SCHEME:
				setScheme((String)newValue);
				return;
			case OCCIPackage.EXTENSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OCCIPackage.EXTENSION__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Extension>)newValue);
				return;
			case OCCIPackage.EXTENSION__KINDS:
				getKinds().clear();
				getKinds().addAll((Collection<? extends Kind>)newValue);
				return;
			case OCCIPackage.EXTENSION__MIXINS:
				getMixins().clear();
				getMixins().addAll((Collection<? extends Mixin>)newValue);
				return;
			case OCCIPackage.EXTENSION__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case OCCIPackage.EXTENSION__SPECIFICATION:
				setSpecification((String)newValue);
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
			case OCCIPackage.EXTENSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCCIPackage.EXTENSION__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case OCCIPackage.EXTENSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OCCIPackage.EXTENSION__IMPORT:
				getImport().clear();
				return;
			case OCCIPackage.EXTENSION__KINDS:
				getKinds().clear();
				return;
			case OCCIPackage.EXTENSION__MIXINS:
				getMixins().clear();
				return;
			case OCCIPackage.EXTENSION__TYPES:
				getTypes().clear();
				return;
			case OCCIPackage.EXTENSION__SPECIFICATION:
				setSpecification(SPECIFICATION_EDEFAULT);
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
			case OCCIPackage.EXTENSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCCIPackage.EXTENSION__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
			case OCCIPackage.EXTENSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OCCIPackage.EXTENSION__IMPORT:
				return import_ != null && !import_.isEmpty();
			case OCCIPackage.EXTENSION__KINDS:
				return kinds != null && !kinds.isEmpty();
			case OCCIPackage.EXTENSION__MIXINS:
				return mixins != null && !mixins.isEmpty();
			case OCCIPackage.EXTENSION__TYPES:
				return types != null && !types.isEmpty();
			case OCCIPackage.EXTENSION__SPECIFICATION:
				return SPECIFICATION_EDEFAULT == null ? specification != null : !SPECIFICATION_EDEFAULT.equals(specification);
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
			case OCCIPackage.EXTENSION___KINDS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP:
				return KindsSchemeValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___KIND_PARENT_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP:
				return KindParentLocalOrImported((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___MIXINS_SCHEME_VALID__DIAGNOSTICCHAIN_MAP:
				return MixinsSchemeValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___TERM_UNICITY__DIAGNOSTICCHAIN_MAP:
				return TermUnicity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___MIXIN_APPLIES_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP:
				return MixinAppliesLocalOrImported((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___SCHEME_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return SchemeUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.EXTENSION___MIXIN_DEPENDS_LOCAL_OR_IMPORTED__DIAGNOSTICCHAIN_MAP:
				return MixinDependsLocalOrImported((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(", description: ");
		result.append(description);
		result.append(", specification: ");
		result.append(specification);
		result.append(')');
		return result.toString();
	}

} //ExtensionImpl
