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
package org.eclipse.cmf.occi.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.FSM;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludesAllOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.impl.KindImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.KindImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.KindImpl#getFsm <em>Fsm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KindImpl extends TypeImpl implements Kind {
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Kind parent;

	/**
	 * The cached value of the '{@link #getFsm() <em>Fsm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFsm()
	 * @generated
	 * @ordered
	 */
	protected FSM fsm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KindImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.KIND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Kind)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.KIND__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Kind newParent) {
		Kind oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.KIND__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entity> getEntities() {
		/**
		 * Entity.allInstances()->select(kind = self)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Entity_0 = idResolver.getClass(OCCITables.CLSSid_Entity, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, OCCITables.SET_CLSSid_Entity, TYP_occi_c_c_Entity_0);
		/*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.SET_CLSSid_Entity);
		/*@NonNull*/ Iterator<Object> ITERATOR__1 = allInstances.iterator();
		/*@Thrown*/ SetValue select;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Entity _1 = (Entity)ITERATOR__1.next();
			/**
			 * kind = self
			 */
			final /*@NonInvalid*/ Kind kind = _1.getKind();
			final /*@NonInvalid*/ boolean eq = kind.equals(this);
			//
			if (eq == ValueUtil.TRUE_VALUE) {
				accumulator.add(_1);
			}
		}
		final /*@Thrown*/ List<Entity> ECORE_select = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Entity.class, select);
		return (EList<Entity>)ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM getFsm() {
		return fsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFsm(FSM newFsm, NotificationChain msgs) {
		FSM oldFsm = fsm;
		fsm = newFsm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCCIPackage.KIND__FSM, oldFsm, newFsm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFsm(FSM newFsm) {
		if (newFsm != fsm) {
			NotificationChain msgs = null;
			if (fsm != null)
				msgs = ((InternalEObject)fsm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCCIPackage.KIND__FSM, null, msgs);
			if (newFsm != null)
				msgs = ((InternalEObject)newFsm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OCCIPackage.KIND__FSM, null, msgs);
			msgs = basicSetFsm(newFsm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.KIND__FSM, newFsm, newFsm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoCyclicInheritance(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv NoCyclicInheritance:
		 *   let severity : Integer[1] = 'Kind::NoCyclicInheritance'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[1] = parent->closure(parent)
		 *         ->excludes(self)
		 *       in
		 *         'Kind::NoCyclicInheritance'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Kind_c_c_NoCyclicInheritance);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
			symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ Kind parent = this.getParent();
				final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, OCCITables.SET_CLSSid_Kind, parent);
				final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOf(oclAsSet);
				final LibraryIteration.LibraryIterationExtension IMPL_closure_0 = (LibraryIteration.LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Set__closure);
				final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, OCCITables.SET_CLSSid_Kind, OCCITables.CLSSid_Kind);
				/**
				 * Implementation of the iterator body.
				 */
				final /*@NonNull*/ AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
					/**
					 * parent
					 */
					@Override
					public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Executor executor, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object oclAsSet, final /*@NonInvalid*/ Object _1) {
						final /*@NonInvalid*/ Kind symbol_0 = (Kind)_1;
						if (symbol_0 == null) {
							throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore/2.0\'::Kind::parent\'");
						}
						final /*@Thrown*/ Kind parent_0 = symbol_0.getParent();
						return parent_0;
					}
				};
				final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor, OCCITables.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);
				final /*@Thrown*/ SetValue closure = ClassUtil.nonNullState((SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
				final /*@Thrown*/ boolean result = CollectionExcludesOperation.INSTANCE.evaluate(closure, this).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Kind_c_c_NoCyclicInheritance, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AttributesNameNotAlreadyDefinedInParent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv AttributesNameNotAlreadyDefinedInParent:
		 *   let
		 *     severity : Integer[1] = 'Kind::AttributesNameNotAlreadyDefinedInParent'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[1] = attributes.name->excludesAll(
		 *           parent->closure(parent).attributes.name)
		 *       in
		 *         'Kind::AttributesNameNotAlreadyDefinedInParent'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Kind_c_c_AttributesNameNotAlreadyDefinedInParent);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
			symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Attribute> attributes = this.getAttributes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes);
				/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_DATAid_AttributeName);
				/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_attributes.iterator();
				/*@Thrown*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Attribute _1 = (Attribute)ITERATOR__1.next();
					/**
					 * name
					 */
					final /*@NonInvalid*/ String name = _1.getName();
					//
					accumulator.add(name);
				}
				final /*@NonInvalid*/ Kind parent = this.getParent();
				final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, OCCITables.SET_CLSSid_Kind, parent);
				final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOf(oclAsSet);
				final LibraryIteration.LibraryIterationExtension IMPL_closure_0 = (LibraryIteration.LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Set__closure);
				final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, OCCITables.SET_CLSSid_Kind, OCCITables.CLSSid_Kind);
				/**
				 * Implementation of the iterator body.
				 */
				final /*@NonNull*/ AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
					/**
					 * parent
					 */
					@Override
					public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Executor executor, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object oclAsSet, final /*@NonInvalid*/ Object _1_0) {
						final /*@NonInvalid*/ Kind symbol_0 = (Kind)_1_0;
						if (symbol_0 == null) {
							throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore/2.0\'::Kind::parent\'");
						}
						final /*@Thrown*/ Kind parent_0 = symbol_0.getParent();
						return parent_0;
					}
				};
				final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor, OCCITables.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);
				final /*@Thrown*/ SetValue closure = ClassUtil.nonNullState((SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
				/*@Thrown*/ BagValue.Accumulator accumulator_0 = ValueUtil.createBagAccumulatorValue(OCCITables.BAG_CLSSid_Attribute);
				/*@Nullable*/ Iterator<Object> ITERATOR__1_1 = closure.iterator();
				/*@Thrown*/ BagValue collect_1;
				while (true) {
					if (!ITERATOR__1_1.hasNext()) {
						collect_1 = accumulator_0;
						break;
					}
					/*@NonInvalid*/ Kind _1_1 = (Kind)ITERATOR__1_1.next();
					/**
					 * attributes
					 */
					if (_1_1 == null) {
						throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore/2.0\'::Category::attributes\'");
					}
					final /*@Thrown*/ List<Attribute> attributes_0 = _1_1.getAttributes();
					final /*@Thrown*/ OrderedSetValue BOXED_attributes_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Attribute, attributes_0);
					//
					for (Object value : BOXED_attributes_0.flatten().getElements()) {
						accumulator_0.add(value);
					}
				}
				/*@Thrown*/ BagValue.Accumulator accumulator_1 = ValueUtil.createBagAccumulatorValue(OCCITables.BAG_DATAid_AttributeName);
				/*@NonNull*/ Iterator<Object> ITERATOR__1_2 = collect_1.iterator();
				/*@Thrown*/ BagValue collect_0;
				while (true) {
					if (!ITERATOR__1_2.hasNext()) {
						collect_0 = accumulator_1;
						break;
					}
					/*@NonInvalid*/ Attribute _1_2 = (Attribute)ITERATOR__1_2.next();
					/**
					 * name
					 */
					final /*@NonInvalid*/ String name_0 = _1_2.getName();
					//
					accumulator_1.add(name_0);
				}
				final /*@Thrown*/ boolean result = CollectionExcludesAllOperation.INSTANCE.evaluate(collect, collect_0).booleanValue();
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Kind_c_c_AttributesNameNotAlreadyDefinedInParent, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CorrectScheme(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv CorrectScheme:
		 *   let severity : Integer[1] = 'Kind::CorrectScheme'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : Boolean[1] = scheme =
		 *         self.oclContainer()
		 *         .oclAsType(Extension).scheme
		 *       in
		 *         'Kind::CorrectScheme'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Kind_c_c_CorrectScheme);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Extension = idResolver.getClass(OCCITables.CLSSid_Extension, null);
				final /*@NonInvalid*/ String scheme = this.getScheme();
				final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
				final /*@Thrown*/ Extension oclAsType = ClassUtil.nonNullState((Extension)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_Extension));
				final /*@Thrown*/ String scheme_0 = oclAsType.getScheme();
				final /*@Thrown*/ boolean result = scheme.equals(scheme_0);
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Kind_c_c_CorrectScheme, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean EntityKindIsRootParent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv EntityKindIsRootParent:
		 *   let severity : Integer[1] = 'Kind::EntityKindIsRootParent'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = self->closure(parent)
		 *         ->exists(k | k.term = 'entity' and k.scheme = 'http://schemas.ogf.org/occi/core#' and k.parent = null)
		 *       in
		 *         'Kind::EntityKindIsRootParent'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Kind_c_c_EntityKindIsRootParent);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
			symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, OCCITables.SET_CLSSid_Kind, this);
				final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOf(oclAsSet);
				final LibraryIteration.LibraryIterationExtension IMPL_closure_0 = (LibraryIteration.LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Set__closure);
				final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, OCCITables.SET_CLSSid_Kind, OCCITables.CLSSid_Kind);
				/**
				 * Implementation of the iterator body.
				 */
				final /*@NonNull*/ AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
					/**
					 * parent
					 */
					@Override
					public /*@Nullable*/ Object evaluate(final /*@NonNull*/ Executor executor, final /*@NonNull*/ TypeId typeId, final /*@Nullable*/ Object oclAsSet, final /*@NonInvalid*/ Object _1) {
						final /*@NonInvalid*/ Kind symbol_0 = (Kind)_1;
						if (symbol_0 == null) {
							throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore/2.0\'::Kind::parent\'");
						}
						final /*@Thrown*/ Kind parent = symbol_0.getParent();
						return parent;
					}
				};
				final /*@NonNull*/  ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor, OCCITables.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);
				final /*@Thrown*/ SetValue closure = ClassUtil.nonNullState((SetValue)IMPL_closure_0.evaluateIteration(MGR_closure_0));
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				/*@Nullable*/ Iterator<Object> ITERATOR_k = closure.iterator();
				/*@Thrown*/ Boolean result;
				while (true) {
					if (!ITERATOR_k.hasNext()) {
						if (accumulator == null) {
							result = null;
						}
						else if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Kind k = (Kind)ITERATOR_k.next();
					/**
					 * k.term = 'entity' and k.scheme = 'http://schemas.ogf.org/occi/core#' and k.parent = null
					 */
					/*@Caught*/ /*@Nullable*/ Object CAUGHT_and_0;
					try {
						/*@Caught*/ /*@Nullable*/ Object CAUGHT_and;
						try {
							/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq;
							try {
								if (k == null) {
									throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore/2.0\'::Category::term\'");
								}
								final /*@Thrown*/ String term = k.getTerm();
								final /*@Thrown*/ boolean eq = term.equals(OCCITables.STR_entity);
								CAUGHT_eq = eq;
							}
							catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq_0;
							try {
								if (k == null) {
									throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore/2.0\'::Category::scheme\'");
								}
								final /*@Thrown*/ String scheme = k.getScheme();
								final /*@Thrown*/ boolean eq_0 = scheme.equals(OCCITables.STR_http_c_s_s_schemas_ogf_org_s_occi_s_core_35);
								CAUGHT_eq_0 = eq_0;
							}
							catch (Exception e) {
								CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_eq_0);
							CAUGHT_and = and;
						}
						catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq_1;
						try {
							if (k == null) {
								throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore/2.0\'::Kind::parent\'");
							}
							final /*@Thrown*/ Kind parent_0 = k.getParent();
							final /*@Thrown*/ boolean eq_1 = parent_0 == null;
							CAUGHT_eq_1 = eq_1;
						}
						catch (Exception e) {
							CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and_0 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and, CAUGHT_eq_1);
						CAUGHT_and_0 = and_0;
					}
					catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_and_0 == null) {								// Abnormal null body evaluation result
						if (accumulator == ValueUtil.FALSE_VALUE) {
							accumulator = null;										// Cache a null failure
						}
					}
					else if (CAUGHT_and_0 instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator = CAUGHT_and_0;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Kind_c_c_EntityKindIsRootParent, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
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
			case OCCIPackage.KIND__FSM:
				return basicSetFsm(null, msgs);
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
			case OCCIPackage.KIND__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case OCCIPackage.KIND__ENTITIES:
				return getEntities();
			case OCCIPackage.KIND__FSM:
				return getFsm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCCIPackage.KIND__PARENT:
				setParent((Kind)newValue);
				return;
			case OCCIPackage.KIND__FSM:
				setFsm((FSM)newValue);
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
			case OCCIPackage.KIND__PARENT:
				setParent((Kind)null);
				return;
			case OCCIPackage.KIND__FSM:
				setFsm((FSM)null);
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
			case OCCIPackage.KIND__PARENT:
				return parent != null;
			case OCCIPackage.KIND__ENTITIES:
				return !getEntities().isEmpty();
			case OCCIPackage.KIND__FSM:
				return fsm != null;
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
			case OCCIPackage.KIND___NO_CYCLIC_INHERITANCE__DIAGNOSTICCHAIN_MAP_1:
				return NoCyclicInheritance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.KIND___ATTRIBUTES_NAME_NOT_ALREADY_DEFINED_IN_PARENT__DIAGNOSTICCHAIN_MAP_1:
				return AttributesNameNotAlreadyDefinedInParent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.KIND___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP_1:
				return CorrectScheme((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.KIND___ENTITY_KIND_IS_ROOT_PARENT__DIAGNOSTICCHAIN_MAP_1:
				return EntityKindIsRootParent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //KindImpl
