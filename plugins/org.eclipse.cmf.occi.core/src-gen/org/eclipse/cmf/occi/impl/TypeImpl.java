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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.Constraint;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.impl.TypeImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.TypeImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeImpl extends CategoryImpl implements Type {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, OCCIPackage.TYPE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, OCCIPackage.TYPE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ActionTermUnicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ActionTermUnicity:
		 *   let severity : Integer[1] = 'Type::ActionTermUnicity'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : Boolean[1] = actions->isUnique(term)
		 *       in
		 *         'Type::ActionTermUnicity'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Type_c_c_ActionTermUnicity);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Action> actions = this.getActions();
				final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Action, actions);
				/*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.ORD_CLSSid_Action);
				/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_actions.iterator();
				/*@Thrown*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = ValueUtil.TRUE_VALUE;
						break;
					}
					/*@NonInvalid*/ Action _1 = (Action)ITERATOR__1.next();
					/**
					 * term
					 */
					final /*@NonInvalid*/ String term = _1.getTerm();
					//
					if (accumulator.includes(term) == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.FALSE_VALUE;			// Abort after second find
						break;
					}
					else {
						accumulator.add(term);
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Type_c_c_ActionTermUnicity, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ConstraintNameUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ConstraintNameUnique:
		 *   let severity : Integer[1] = 'Type::ConstraintNameUnique'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : Boolean[1] = constraints->isUnique(name)
		 *       in
		 *         'Type::ConstraintNameUnique'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Type_c_c_ConstraintNameUnique);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_result;
			try {
				final /*@NonInvalid*/ List<Constraint> constraints = this.getConstraints();
				final /*@NonInvalid*/ OrderedSetValue BOXED_constraints = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Constraint, constraints);
				/*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(OCCITables.ORD_CLSSid_Constraint);
				/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_constraints.iterator();
				/*@Thrown*/ boolean result;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						result = ValueUtil.TRUE_VALUE;
						break;
					}
					/*@NonInvalid*/ Constraint _1 = (Constraint)ITERATOR__1.next();
					/**
					 * name
					 */
					final /*@NonInvalid*/ String name = _1.getName();
					//
					if (accumulator.includes(name) == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.FALSE_VALUE;			// Abort after second find
						break;
					}
					else {
						accumulator.add(name);
					}
				}
				CAUGHT_result = result;
			}
			catch (Exception e) {
				CAUGHT_result = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Type_c_c_ConstraintNameUnique, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OCCITables.INT_0).booleanValue();
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
			case OCCIPackage.TYPE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case OCCIPackage.TYPE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case OCCIPackage.TYPE__ACTIONS:
				return getActions();
			case OCCIPackage.TYPE__CONSTRAINTS:
				return getConstraints();
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
			case OCCIPackage.TYPE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case OCCIPackage.TYPE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
			case OCCIPackage.TYPE__ACTIONS:
				getActions().clear();
				return;
			case OCCIPackage.TYPE__CONSTRAINTS:
				getConstraints().clear();
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
			case OCCIPackage.TYPE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case OCCIPackage.TYPE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
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
			case OCCIPackage.TYPE___ACTION_TERM_UNICITY__DIAGNOSTICCHAIN_MAP:
				return ActionTermUnicity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.TYPE___CONSTRAINT_NAME_UNIQUE__DIAGNOSTICCHAIN_MAP:
				return ConstraintNameUnique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TypeImpl
