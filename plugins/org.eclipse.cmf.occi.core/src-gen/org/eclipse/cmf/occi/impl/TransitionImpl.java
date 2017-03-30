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
import java.util.List;
import java.util.Map;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.FSM;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.State;
import org.eclipse.cmf.occi.core.Transition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.TransitionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource() {
		if (eContainerFeatureID() != OCCIPackage.TRANSITION__SOURCE) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(State newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, OCCIPackage.TRANSITION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != OCCIPackage.TRANSITION__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, OCCIPackage.STATE__OUTGOING_TRANSITION, State.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(State newTarget, NotificationChain msgs) {
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCCIPackage.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, OCCIPackage.STATE__INCOMING_TRANSITION, State.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, OCCIPackage.STATE__INCOMING_TRANSITION, State.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.TRANSITION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (Action)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.TRANSITION__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.TRANSITION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containedActionMustBeDeclaredInTheAppropriateKind(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv containedActionMustBeDeclaredInTheAppropriateKind:
		 *   let
		 *     severity : Integer[1] = 'Transition::containedActionMustBeDeclaredInTheAppropriateKind'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = self.oclContainer()
		 *           .oclAsType(State)
		 *           .oclContainer()
		 *           .oclAsType(FSM)
		 *           .oclContainer()
		 *           .oclAsType(Kind)
		 *           .actions->includes(self.action)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{status = status, message = 'The action ' + self.action.name + ' declared in ' +
		 *               self.action.oclContainer()
		 *               .oclAsType(Kind).name + ' Kind cannot be used in the FSM of ' +
		 *               self.oclContainer()
		 *               .oclAsType(State)
		 *               .oclContainer()
		 *               .oclAsType(FSM)
		 *               .oclContainer()
		 *               .oclAsType(Kind).name + ' Kind.', severity = -1
		 *             }
		 *           endif
		 *       in
		 *         'Transition::containedActionMustBeDeclaredInTheAppropriateKind'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Transition_c_c_containedActionMustBeDeclaredInTheAppropriateKind);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_FSM = idResolver.getClass(OCCITables.CLSSid_FSM, null);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Kind_0 = idResolver.getClass(OCCITables.CLSSid_Kind, null);
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_State = idResolver.getClass(OCCITables.CLSSid_State, null);
				final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
				final /*@NonInvalid*/ Action action = this.getAction();
				final /*@Thrown*/ State oclAsType = ClassUtil.nonNullState((State)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_State));
				final /*@Thrown*/ Object oclContainer_0 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, oclAsType);
				final /*@Thrown*/ FSM oclAsType_0 = ClassUtil.nonNullState((FSM)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_0, TYP_occi_c_c_FSM));
				final /*@Thrown*/ Object oclContainer_1 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, oclAsType_0);
				final /*@Thrown*/ Kind oclAsType_1 = ClassUtil.nonNullState((Kind)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_1, TYP_occi_c_c_Kind_0));
				final /*@Thrown*/ List<Action> actions = oclAsType_1.getActions();
				final /*@Thrown*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Action, actions);
				final /*@Thrown*/ boolean status = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_actions, action).booleanValue();
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ String name = action.getName();
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(OCCITables.STR_The_32_action_32, name);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, OCCITables.STR__32_declared_32_in_32);
					final /*@NonInvalid*/ Object oclContainer_2 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, action);
					final /*@Thrown*/ Kind oclAsType_2 = ClassUtil.nonNullState((Kind)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_2, TYP_occi_c_c_Kind_0));
					final /*@Thrown*/ String name_0 = oclAsType_2.getName();
					final /*@Thrown*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, name_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, OCCITables.STR__32_Kind_32_cannot_32_be_32_used_32_in_32_the_32_FSM_32_of_32);
					final /*@Thrown*/ String name_1 = oclAsType_1.getName();
					final /*@Thrown*/ String sum_3 = StringConcatOperation.INSTANCE.evaluate(sum_2, name_1);
					final /*@Thrown*/ String sum_4 = StringConcatOperation.INSTANCE.evaluate(sum_3, OCCITables.STR__32_Kind);
					final /*@NonInvalid*/ IntegerValue diff = (IntegerValue)NumericNegateOperation.INSTANCE.evaluate(OCCITables.INT_1);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(OCCITables.TUPLid_, sum_4, diff, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Transition_c_c_containedActionMustBeDeclaredInTheAppropriateKind, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, OCCITables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.TRANSITION__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((State)otherEnd, msgs);
			case OCCIPackage.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, OCCIPackage.STATE__INCOMING_TRANSITION, State.class, msgs);
				return basicSetTarget((State)otherEnd, msgs);
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
			case OCCIPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case OCCIPackage.TRANSITION__TARGET:
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
			case OCCIPackage.TRANSITION__SOURCE:
				return eInternalContainer().eInverseRemove(this, OCCIPackage.STATE__OUTGOING_TRANSITION, State.class, msgs);
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
			case OCCIPackage.TRANSITION__SOURCE:
				return getSource();
			case OCCIPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case OCCIPackage.TRANSITION__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
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
			case OCCIPackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case OCCIPackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case OCCIPackage.TRANSITION__ACTION:
				setAction((Action)newValue);
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
			case OCCIPackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case OCCIPackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case OCCIPackage.TRANSITION__ACTION:
				setAction((Action)null);
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
			case OCCIPackage.TRANSITION__SOURCE:
				return getSource() != null;
			case OCCIPackage.TRANSITION__TARGET:
				return target != null;
			case OCCIPackage.TRANSITION__ACTION:
				return action != null;
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
			case OCCIPackage.TRANSITION___CONTAINED_ACTION_MUST_BE_DECLARED_IN_THE_APPROPRIATE_KIND__DIAGNOSTICCHAIN_MAP_1:
				return containedActionMustBeDeclaredInTheAppropriateKind((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransitionImpl
