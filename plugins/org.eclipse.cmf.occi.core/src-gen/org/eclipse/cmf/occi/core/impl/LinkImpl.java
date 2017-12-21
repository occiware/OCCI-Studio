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

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
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

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.LinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.LinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends EntityImpl implements Link {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Resource target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSource() {
		if (eContainerFeatureID() != OCCIPackage.LINK__SOURCE) return null;
		return (Resource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Resource newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, OCCIPackage.LINK__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Resource newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != OCCIPackage.LINK__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, OCCIPackage.RESOURCE__LINKS, Resource.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Resource)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Resource newTarget, NotificationChain msgs) {
		Resource oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCCIPackage.LINK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Resource newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, OCCIPackage.RESOURCE__RLINKS, Resource.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, OCCIPackage.RESOURCE__RLINKS, Resource.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.LINK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LinkTargetInvariant(final Kind resourcekind, final Kind linkInstanceKind) {
		/**
		 *
		 * if linkInstanceKind.target->size() > 0
		 * then
		 *   linkInstanceKind.target->exists(aTarget |
		 *     resourcekind.occiIsKindOf(aTarget))
		 * else
		 *   if linkInstanceKind.parent <> null
		 *   then LinkTargetInvariant(resourcekind, linkInstanceKind.parent)
		 *   else true
		 *   endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		if (linkInstanceKind == null) {
			throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Kind::target\'");
		}
		final /*@Thrown*/ List<Kind> target_0 = linkInstanceKind.getTarget();
		final /*@Thrown*/ OrderedSetValue BOXED_target_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, target_0);
		final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_target_0);
		final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, OCCITables.INT_0).booleanValue();
		/*@Thrown*/ boolean symbol_1;
		if (gt) {
			/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
			/*@NonNull*/ Iterator<Object> ITERATOR_aTarget = BOXED_target_0.iterator();
			/*@Thrown*/ boolean exists;
			while (true) {
				if (!ITERATOR_aTarget.hasNext()) {
					if (accumulator == ValueUtil.FALSE_VALUE) {
						exists = ValueUtil.FALSE_VALUE;
					}
					else {
						throw (InvalidValueException)accumulator;
					}
					break;
				}
				/*@NonInvalid*/ Kind aTarget = (Kind)ITERATOR_aTarget.next();
				/**
				 * resourcekind.occiIsKindOf(aTarget)
				 */
				/*@Caught*/ /*@NonNull*/ Object CAUGHT_occiIsKindOf;
				try {
					if (resourcekind == null) {
						throw new InvalidValueException("Null source for \'occi::Kind::occiIsKindOf(occi::Kind[?]) : Boolean[1]\'");
					}
					final /*@Thrown*/ boolean occiIsKindOf = resourcekind.occiIsKindOf(aTarget);
					CAUGHT_occiIsKindOf = occiIsKindOf;
				}
				catch (Exception e) {
					CAUGHT_occiIsKindOf = ValueUtil.createInvalidValue(e);
				}
				//
				if (CAUGHT_occiIsKindOf == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
					exists = ValueUtil.TRUE_VALUE;
					break;														// Stop immediately
				}
				else if (CAUGHT_occiIsKindOf == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
					;															// Carry on
				}
				else if (CAUGHT_occiIsKindOf instanceof InvalidValueException) {		// Abnormal exception evaluation result
					accumulator = CAUGHT_occiIsKindOf;									// Cache an exception failure
				}
				else {															// Impossible badly typed result
					accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
				}
			}
			symbol_1 = exists;
		}
		else {
			final /*@Thrown*/ Kind parent_0 = linkInstanceKind.getParent();
			final /*@Thrown*/ boolean ne = parent_0 != null;
			/*@Thrown*/ boolean symbol_0;
			if (ne) {
				final /*@Thrown*/ boolean LinkTargetInvariant = this.LinkTargetInvariant(resourcekind, parent_0);
				symbol_0 = LinkTargetInvariant;
			}
			else {
				symbol_0 = ValueUtil.TRUE_VALUE;
			}
			symbol_1 = symbol_0;
		}
		return symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LinkSourceInvariant(final Kind resourcekind, final Kind linkInstanceKind) {
		/**
		 *
		 * if linkInstanceKind.source->size() > 0
		 * then
		 *   linkInstanceKind.source->exists(aSource |
		 *     resourcekind.occiIsKindOf(aSource))
		 * else
		 *   if linkInstanceKind.parent <> null
		 *   then LinkSourceInvariant(resourcekind, linkInstanceKind.parent)
		 *   else true
		 *   endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		if (linkInstanceKind == null) {
			throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Kind::source\'");
		}
		final /*@Thrown*/ List<Kind> source_0 = linkInstanceKind.getSource();
		final /*@Thrown*/ OrderedSetValue BOXED_source_0 = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Kind, source_0);
		final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_source_0);
		final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, OCCITables.INT_0).booleanValue();
		/*@Thrown*/ boolean symbol_1;
		if (gt) {
			/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
			/*@NonNull*/ Iterator<Object> ITERATOR_aSource = BOXED_source_0.iterator();
			/*@Thrown*/ boolean exists;
			while (true) {
				if (!ITERATOR_aSource.hasNext()) {
					if (accumulator == ValueUtil.FALSE_VALUE) {
						exists = ValueUtil.FALSE_VALUE;
					}
					else {
						throw (InvalidValueException)accumulator;
					}
					break;
				}
				/*@NonInvalid*/ Kind aSource = (Kind)ITERATOR_aSource.next();
				/**
				 * resourcekind.occiIsKindOf(aSource)
				 */
				/*@Caught*/ /*@NonNull*/ Object CAUGHT_occiIsKindOf;
				try {
					if (resourcekind == null) {
						throw new InvalidValueException("Null source for \'occi::Kind::occiIsKindOf(occi::Kind[?]) : Boolean[1]\'");
					}
					final /*@Thrown*/ boolean occiIsKindOf = resourcekind.occiIsKindOf(aSource);
					CAUGHT_occiIsKindOf = occiIsKindOf;
				}
				catch (Exception e) {
					CAUGHT_occiIsKindOf = ValueUtil.createInvalidValue(e);
				}
				//
				if (CAUGHT_occiIsKindOf == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
					exists = ValueUtil.TRUE_VALUE;
					break;														// Stop immediately
				}
				else if (CAUGHT_occiIsKindOf == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
					;															// Carry on
				}
				else if (CAUGHT_occiIsKindOf instanceof InvalidValueException) {		// Abnormal exception evaluation result
					accumulator = CAUGHT_occiIsKindOf;									// Cache an exception failure
				}
				else {															// Impossible badly typed result
					accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
				}
			}
			symbol_1 = exists;
		}
		else {
			final /*@Thrown*/ Kind parent_0 = linkInstanceKind.getParent();
			final /*@Thrown*/ boolean ne = parent_0 != null;
			/*@Thrown*/ boolean symbol_0;
			if (ne) {
				final /*@Thrown*/ boolean LinkSourceInvariant = this.LinkSourceInvariant(resourcekind, parent_0);
				symbol_0 = LinkSourceInvariant;
			}
			else {
				symbol_0 = ValueUtil.TRUE_VALUE;
			}
			symbol_1 = symbol_0;
		}
		return symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean sourceReferenceInvariant(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv sourceReferenceInvariant:
		 *   let severity : Integer[1] = 'Link::sourceReferenceInvariant'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = LinkSourceInvariant(self.source.kind,
		 *             self.oclAsType(Entity).kind)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{status = status, message = 'The kind of the source reference in the link instance ' +
		 *               self.oclAsType(Entity).title + ' must be a kind of the source of the kind of this link', severity = -1, quickfix = 'quickfix'
		 *             }
		 *           endif
		 *       in
		 *         'Link::sourceReferenceInvariant'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Link_c_c_sourceReferenceInvariant);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Entity_0 = idResolver.getClass(OCCITables.CLSSid_Entity, null);
				final /*@Thrown*/ Entity oclAsType = ClassUtil.nonNullState((Entity)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, this, TYP_occi_c_c_Entity_0));
				final /*@NonInvalid*/ Resource source = this.getSource();
				final /*@NonInvalid*/ Kind kind_0 = source.getKind();
				final /*@Thrown*/ Kind kind_1 = oclAsType.getKind();
				final /*@Thrown*/ boolean status = this.LinkSourceInvariant(kind_0, kind_1);
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@Thrown*/ String title = oclAsType.getTitle();
					final /*@Thrown*/ String sum = StringConcatOperation.INSTANCE.evaluate(OCCITables.STR_The_32_kind_32_of_32_the_32_source_32_reference_32_in_32_the_32_link_32_instance_32, title);
					final /*@Thrown*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, OCCITables.STR__32_must_32_be_32_a_32_kind_32_of_32_the_32_source_32_of_32_the_32_kind_32_of_32_this_32_link);
					final /*@NonInvalid*/ IntegerValue diff = (IntegerValue)NumericNegateOperation.INSTANCE.evaluate(OCCITables.INT_1);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(OCCITables.TUPLid__0, sum_0, OCCITables.STR_quickfix, diff, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Link_c_c_sourceReferenceInvariant, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, OCCITables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean targetReferenceInvariant(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv targetReferenceInvariant:
		 *   let severity : Integer[1] = 'Link::targetReferenceInvariant'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = LinkTargetInvariant(self.target.kind,
		 *             self.oclAsType(Entity).kind)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{status = status, message = 'The kind of the target reference in the link instance ' +
		 *               self.oclAsType(Entity).title + ' must be a kind of the target of the kind of this link', severity = -1, quickfix = 'quickfix'
		 *             }
		 *           endif
		 *       in
		 *         'Link::targetReferenceInvariant'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Link_c_c_targetReferenceInvariant);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Entity_0 = idResolver.getClass(OCCITables.CLSSid_Entity, null);
				final /*@Thrown*/ Entity oclAsType = ClassUtil.nonNullState((Entity)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, this, TYP_occi_c_c_Entity_0));
				final /*@NonInvalid*/ Resource target = this.getTarget();
				final /*@NonInvalid*/ Kind kind_0 = target.getKind();
				final /*@Thrown*/ Kind kind_1 = oclAsType.getKind();
				final /*@Thrown*/ boolean status = this.LinkTargetInvariant(kind_0, kind_1);
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@Thrown*/ String title = oclAsType.getTitle();
					final /*@Thrown*/ String sum = StringConcatOperation.INSTANCE.evaluate(OCCITables.STR_The_32_kind_32_of_32_the_32_target_32_reference_32_in_32_the_32_link_32_instance_32, title);
					final /*@Thrown*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, OCCITables.STR__32_must_32_be_32_a_32_kind_32_of_32_the_32_target_32_of_32_the_32_kind_32_of_32_this_32_link);
					final /*@NonInvalid*/ IntegerValue diff = (IntegerValue)NumericNegateOperation.INSTANCE.evaluate(OCCITables.INT_1);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(OCCITables.TUPLid__0, sum_0, OCCITables.STR_quickfix, diff, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Link_c_c_targetReferenceInvariant, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, OCCITables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LinkKindIsInParent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv LinkKindIsInParent:
		 *   let severity : Integer[1] = 'Link::LinkKindIsInParent'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[?] = kind->closure(parent)
		 *         ->exists(k | k.term = 'link' and k.scheme = 'http://schemas.ogf.org/occi/core#')
		 *       in
		 *         'Link::LinkKindIsInParent'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Link_c_c_LinkKindIsInParent);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
			symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ Kind kind_0 = this.getKind();
				final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, OCCITables.SET_CLSSid_Kind, kind_0);
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
							throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Kind::parent\'");
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
					 * k.term = 'link' and k.scheme = 'http://schemas.ogf.org/occi/core#'
					 */
					/*@Caught*/ /*@Nullable*/ Object CAUGHT_and;
					try {
						/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq;
						try {
							if (k == null) {
								throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Category::term\'");
							}
							final /*@Thrown*/ String term = k.getTerm();
							final /*@Thrown*/ boolean eq = term.equals(OCCITables.STR_link);
							CAUGHT_eq = eq;
						}
						catch (Exception e) {
							CAUGHT_eq = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq_0;
						try {
							if (k == null) {
								throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Category::scheme\'");
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
					//
					if (CAUGHT_and == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_and == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_and == null) {								// Abnormal null body evaluation result
						if (accumulator == ValueUtil.FALSE_VALUE) {
							accumulator = null;										// Cache a null failure
						}
					}
					else if (CAUGHT_and instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator = CAUGHT_and;									// Cache an exception failure
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
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Link_c_c_LinkKindIsInParent, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.LINK__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((Resource)otherEnd, msgs);
			case OCCIPackage.LINK__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, OCCIPackage.RESOURCE__RLINKS, Resource.class, msgs);
				return basicSetTarget((Resource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.LINK__SOURCE:
				return basicSetSource(null, msgs);
			case OCCIPackage.LINK__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OCCIPackage.LINK__SOURCE:
				return eInternalContainer().eInverseRemove(this, OCCIPackage.RESOURCE__LINKS, Resource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCCIPackage.LINK__SOURCE:
				return getSource();
			case OCCIPackage.LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case OCCIPackage.LINK__SOURCE:
				setSource((Resource)newValue);
				return;
			case OCCIPackage.LINK__TARGET:
				setTarget((Resource)newValue);
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
			case OCCIPackage.LINK__SOURCE:
				setSource((Resource)null);
				return;
			case OCCIPackage.LINK__TARGET:
				setTarget((Resource)null);
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
			case OCCIPackage.LINK__SOURCE:
				return getSource() != null;
			case OCCIPackage.LINK__TARGET:
				return target != null;
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
			case OCCIPackage.LINK___LINK_TARGET_INVARIANT__KIND_KIND:
				return LinkTargetInvariant((Kind)arguments.get(0), (Kind)arguments.get(1));
			case OCCIPackage.LINK___LINK_SOURCE_INVARIANT__KIND_KIND:
				return LinkSourceInvariant((Kind)arguments.get(0), (Kind)arguments.get(1));
			case OCCIPackage.LINK___SOURCE_REFERENCE_INVARIANT__DIAGNOSTICCHAIN_MAP:
				return sourceReferenceInvariant((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.LINK___TARGET_REFERENCE_INVARIANT__DIAGNOSTICCHAIN_MAP:
				return targetReferenceInvariant((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.LINK___LINK_KIND_IS_IN_PARENT__DIAGNOSTICCHAIN_MAP:
				return LinkKindIsInParent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LinkImpl
