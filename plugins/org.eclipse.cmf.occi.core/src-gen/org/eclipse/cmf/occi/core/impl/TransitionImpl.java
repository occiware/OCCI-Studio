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

import java.util.List;
import java.util.Map;
import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.FSM;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.core.State;
import org.eclipse.cmf.occi.core.Transition;

import org.eclipse.cmf.occi.core.Type;
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
import org.eclipse.ocl.pivot.values.InvalidValueException;
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
 *   <li>{@link org.eclipse.cmf.occi.core.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.TransitionImpl#getAction <em>Action</em>}</li>
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
	public void setTarget(State newTarget) {
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.TRANSITION__TARGET, oldTarget, target));
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
	public boolean containedActionMustBeDeclaredInTheAppropriateType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv containedActionMustBeDeclaredInTheAppropriateType:
		 *   let
		 *     severity : Integer[1] = 'Transition::containedActionMustBeDeclaredInTheAppropriateType'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = if self.action <> null
		 *           then
		 *             self.oclContainer()
		 *             .oclAsType(State)
		 *             .oclContainer()
		 *             .oclAsType(FSM)
		 *             .oclContainer()
		 *             .oclAsType(Type)
		 *             .actions->includes(self.action)
		 *           else false
		 *           endif
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{
		 *               status = status, message = if self.action <> null
		 *               then 'The action ' + self.action.name + ' declared in ' +
		 *                 self.action.oclContainer()
		 *                 .oclAsType(Type).name + ' kind/mixin cannot be used in the FSM of ' +
		 *                 self.oclContainer()
		 *                 .oclAsType(State)
		 *                 .oclContainer()
		 *                 .oclAsType(FSM)
		 *                 .oclContainer()
		 *                 .oclAsType(Type).name + ' kind/mixin.'
		 *               else 'The action of Transition instance coming from the "' + source.literal.name + '" state to the "' + target.literal.name + '" state in the FSM of "' +
		 *                 source.owningFSM.oclContainer()
		 *                 .oclAsType(Type).name + '" kind/mixin instance must be a set'
		 *               endif, severity = -1
		 *             }
		 *           endif
		 *       in
		 *         'Transition::containedActionMustBeDeclaredInTheAppropriateType'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Transition_c_c_containedActionMustBeDeclaredInTheAppropriateType);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_3;
		if (le) {
			symbol_3 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_2;
			try {
				final /*@NonInvalid*/ Action action = this.getAction();
				final /*@NonInvalid*/ boolean ne = action != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_FSM = idResolver.getClass(OCCITables.CLSSid_FSM, null);
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_State = idResolver.getClass(OCCITables.CLSSid_State, null);
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Type_0 = idResolver.getClass(OCCITables.CLSSid_Type, null);
					final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
					final /*@Thrown*/ State oclAsType = ClassUtil.nonNullState((State)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_State));
					final /*@Thrown*/ Object oclContainer_0 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, oclAsType);
					final /*@Thrown*/ FSM oclAsType_0 = ClassUtil.nonNullState((FSM)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_0, TYP_occi_c_c_FSM));
					final /*@Thrown*/ Object oclContainer_1 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, oclAsType_0);
					final /*@Thrown*/ Type oclAsType_1 = ClassUtil.nonNullState((Type)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_1, TYP_occi_c_c_Type_0));
					final /*@Thrown*/ List<Action> actions = oclAsType_1.getActions();
					final /*@Thrown*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Action, actions);
					final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_actions, action).booleanValue();
					status = includes;
				}
				else {
					status = ValueUtil.FALSE_VALUE;
				}
				/*@Thrown*/ Object symbol_2;
				if (status) {
					symbol_2 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Type_3 = idResolver.getClass(OCCITables.CLSSid_Type, null);
					/*@Thrown*/ String symbol_0;
					if (ne) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_FSM_0 = idResolver.getClass(OCCITables.CLSSid_FSM, null);
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_State_0 = idResolver.getClass(OCCITables.CLSSid_State, null);
						if (action == null) {
							throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::Category::name\'");
						}
						final /*@Thrown*/ String name = action.getName();
						final /*@Thrown*/ String sum = StringConcatOperation.INSTANCE.evaluate(OCCITables.STR_The_32_action_32, name);
						final /*@Thrown*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, OCCITables.STR__32_declared_32_in_32);
						final /*@Thrown*/ Object oclContainer_2 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, action);
						final /*@Thrown*/ Type oclAsType_2 = ClassUtil.nonNullState((Type)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_2, TYP_occi_c_c_Type_3));
						final /*@Thrown*/ String name_0 = oclAsType_2.getName();
						final /*@Thrown*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, name_0);
						final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, OCCITables.STR__32_kind_s_mixin_32_cannot_32_be_32_used_32_in_32_the_32_FSM_32_of_32);
						final /*@NonInvalid*/ Object oclContainer_3 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
						final /*@Thrown*/ State oclAsType_3 = ClassUtil.nonNullState((State)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_3, TYP_occi_c_c_State_0));
						final /*@Thrown*/ Object oclContainer_4 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, oclAsType_3);
						final /*@Thrown*/ FSM oclAsType_4 = ClassUtil.nonNullState((FSM)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_4, TYP_occi_c_c_FSM_0));
						final /*@Thrown*/ Object oclContainer_5 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, oclAsType_4);
						final /*@Thrown*/ Type oclAsType_5 = ClassUtil.nonNullState((Type)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_5, TYP_occi_c_c_Type_3));
						final /*@Thrown*/ String name_1 = oclAsType_5.getName();
						final /*@Thrown*/ String sum_3 = StringConcatOperation.INSTANCE.evaluate(sum_2, name_1);
						final /*@Thrown*/ String sum_4 = StringConcatOperation.INSTANCE.evaluate(sum_3, OCCITables.STR__32_kind_s_mixin);
						symbol_0 = sum_4;
					}
					else {
						final /*@NonInvalid*/ State source_0 = this.getSource();
						final /*@NonInvalid*/ EnumerationLiteral literal = source_0.getLiteral();
						if (literal == null) {
							throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::EnumerationLiteral::name\'");
						}
						final /*@Thrown*/ String name_2 = literal.getName();
						final /*@Thrown*/ String sum_5 = StringConcatOperation.INSTANCE.evaluate(OCCITables.STR_The_32_action_32_of_32_Transition_32_instance_32_coming_32_from_32_the_32_34, name_2);
						final /*@Thrown*/ String sum_6 = StringConcatOperation.INSTANCE.evaluate(sum_5, OCCITables.STR__34_32_state_32_to_32_the_32_34);
						final /*@NonInvalid*/ State target = this.getTarget();
						final /*@NonInvalid*/ EnumerationLiteral literal_0 = target.getLiteral();
						if (literal_0 == null) {
							throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::EnumerationLiteral::name\'");
						}
						final /*@Thrown*/ String name_3 = literal_0.getName();
						final /*@Thrown*/ String sum_7 = StringConcatOperation.INSTANCE.evaluate(sum_6, name_3);
						final /*@Thrown*/ String sum_8 = StringConcatOperation.INSTANCE.evaluate(sum_7, OCCITables.STR__34_32_state_32_in_32_the_32_FSM_32_of_32_34);
						final /*@NonInvalid*/ FSM owningFSM = source_0.getOwningFSM();
						final /*@NonInvalid*/ Object oclContainer_6 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, owningFSM);
						final /*@Thrown*/ Type oclAsType_6 = ClassUtil.nonNullState((Type)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_6, TYP_occi_c_c_Type_3));
						final /*@Thrown*/ String name_4 = oclAsType_6.getName();
						final /*@Thrown*/ String sum_9 = StringConcatOperation.INSTANCE.evaluate(sum_8, name_4);
						final /*@Thrown*/ String sum_10 = StringConcatOperation.INSTANCE.evaluate(sum_9, OCCITables.STR__34_32_kind_s_mixin_32_instance_32_must_32_be_32_a_32_set);
						symbol_0 = sum_10;
					}
					final /*@NonInvalid*/ IntegerValue diff = (IntegerValue)NumericNegateOperation.INSTANCE.evaluate(OCCITables.INT_1);
					final /*@Thrown*/ TupleValue symbol_1 = ValueUtil.createTupleOfEach(OCCITables.TUPLid_, symbol_0, diff, status);
					symbol_2 = symbol_1;
				}
				CAUGHT_symbol_2 = symbol_2;
			}
			catch (Exception e) {
				CAUGHT_symbol_2 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Transition_c_c_containedActionMustBeDeclaredInTheAppropriateType, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_2, OCCITables.INT_0).booleanValue();
			symbol_3 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_3;
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
			case OCCIPackage.TRANSITION___CONTAINED_ACTION_MUST_BE_DECLARED_IN_THE_APPROPRIATE_TYPE__DIAGNOSTICCHAIN_MAP:
				return containedActionMustBeDeclaredInTheAppropriateType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransitionImpl
