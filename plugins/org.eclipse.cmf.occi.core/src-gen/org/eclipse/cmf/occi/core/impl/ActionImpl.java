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
import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.Category;
import org.eclipse.cmf.occi.core.FSM;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.core.State;
import org.eclipse.cmf.occi.core.Transition;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.library.string.StringSubstringOperation;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ActionImpl extends CategoryImpl implements Action {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containedAction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv containedAction:
		 *   let severity : Integer[1] = 'Action::containedAction'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = if self.oclContainer.oclIsTypeOf(Kind)
		 *           then
		 *             if self.oclContainer().oclAsType(Kind).fsm <> null
		 *             then
		 *               self.oclContainer()
		 *               .oclAsType(Kind)
		 *               .fsm.ownedState.outgoingTransition.action->includes(self)
		 *             else true
		 *             endif
		 *           else true
		 *           endif
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{status = status, message = 'The action ' + name + ' doesn\'t appear in the FSM of ' +
		 *               self.oclContainer()
		 *               .oclAsType(Kind).name + ' Kind', severity = 1, quickfix = 'quickfix'
		 *             }
		 *           endif
		 *       in
		 *         'Action::containedAction'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Action_c_c_containedAction);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_3;
		if (le) {
			symbol_3 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_2;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Kind_0 = idResolver.getClass(OCCITables.CLSSid_Kind, null);
				final /*@NonInvalid*/ Object oclContainer = this.eContainer();
				final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_Kind_0).booleanValue();
				/*@Thrown*/ boolean status;
				if (oclIsTypeOf) {
					final /*@NonInvalid*/ Object oclContainer_0 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
					final /*@Thrown*/ Kind oclAsType = ClassUtil.nonNullState((Kind)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_0, TYP_occi_c_c_Kind_0));
					final /*@Thrown*/ FSM fsm = oclAsType.getFsm();
					final /*@Thrown*/ boolean ne = fsm != null;
					/*@Thrown*/ boolean symbol_0;
					if (ne) {
						if (fsm == null) {
							throw new InvalidValueException("Null source for \'\'http://schemas.ogf.org/occi/core/ecore\'::FSM::ownedState\'");
						}
						final /*@Thrown*/ List<State> ownedState = fsm.getOwnedState();
						final /*@Thrown*/ OrderedSetValue BOXED_ownedState = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_State, ownedState);
						/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Transition);
						/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_ownedState.iterator();
						/*@Thrown*/ SequenceValue collect_0;
						while (true) {
							if (!ITERATOR__1.hasNext()) {
								collect_0 = accumulator;
								break;
							}
							/*@NonInvalid*/ State _1 = (State)ITERATOR__1.next();
							/**
							 * outgoingTransition
							 */
							final /*@NonInvalid*/ List<Transition> outgoingTransition = _1.getOutgoingTransition();
							final /*@NonInvalid*/ OrderedSetValue BOXED_outgoingTransition = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_Transition, outgoingTransition);
							//
							for (Object value : BOXED_outgoingTransition.flatten().getElements()) {
								accumulator.add(value);
							}
						}
						/*@Thrown*/ SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_CLSSid_Action);
						/*@NonNull*/ Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
						/*@Thrown*/ SequenceValue collect;
						while (true) {
							if (!ITERATOR__1_0.hasNext()) {
								collect = accumulator_0;
								break;
							}
							/*@NonInvalid*/ Transition _1_0 = (Transition)ITERATOR__1_0.next();
							/**
							 * action
							 */
							final /*@NonInvalid*/ Action action = _1_0.getAction();
							//
							accumulator_0.add(action);
						}
						final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(collect, this).booleanValue();
						symbol_0 = includes;
					}
					else {
						symbol_0 = ValueUtil.TRUE_VALUE;
					}
					status = symbol_0;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_2;
				if (status) {
					symbol_2 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ String name = this.getName();
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(OCCITables.STR_The_32_action_32, name);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, OCCITables.STR__32_doesn_39_t_32_appear_32_in_32_the_32_FSM_32_of_32);
					final /*@NonInvalid*/ Object oclContainer_2 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
					final /*@Thrown*/ Kind oclAsType_1 = ClassUtil.nonNullState((Kind)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_2, TYP_occi_c_c_Kind_0));
					final /*@Thrown*/ String name_0 = oclAsType_1.getName();
					final /*@Thrown*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, name_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, OCCITables.STR__32_Kind);
					final /*@Thrown*/ TupleValue symbol_1 = ValueUtil.createTupleOfEach(OCCITables.TUPLid__0, sum_2, OCCITables.STR_quickfix, OCCITables.INT_1, status);
					symbol_2 = symbol_1;
				}
				CAUGHT_symbol_2 = symbol_2;
			}
			catch (Exception e) {
				CAUGHT_symbol_2 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Action_c_c_containedAction, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_2, OCCITables.INT_0).booleanValue();
			symbol_3 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_3;
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
		 *   let severity : Integer[1] = 'Action::CorrectScheme'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : Boolean[1] = let
		 *           category : Category[1] = oclContainer()
		 *           .oclAsType(Category)
		 *         in scheme =
		 *           category.scheme.substring(1, category.scheme.size() - 1) + '/' + category.term + '/action#'
		 *       in
		 *         'Action::CorrectScheme'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Action_c_c_CorrectScheme);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq;
			try {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Category_0 = idResolver.getClass(OCCITables.CLSSid_Category, null);
				final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
				final /*@Thrown*/ Category category = ClassUtil.nonNullState((Category)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_Category_0));
				final /*@Thrown*/ String scheme_0 = category.getScheme();
				final /*@NonInvalid*/ String scheme = this.getScheme();
				final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(scheme_0);
				final /*@Thrown*/ IntegerValue diff = (IntegerValue)NumericMinusOperation.INSTANCE.evaluate(size, OCCITables.INT_1);
				final /*@Thrown*/ String substring = StringSubstringOperation.INSTANCE.evaluate(scheme_0, OCCITables.INT_1, diff);
				final /*@Thrown*/ String sum = StringConcatOperation.INSTANCE.evaluate(substring, OCCITables.STR_quot);
				final /*@Thrown*/ String term = category.getTerm();
				final /*@Thrown*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, term);
				final /*@Thrown*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, OCCITables.STR__s_action_35);
				final /*@Thrown*/ boolean eq = scheme.equals(sum_1);
				CAUGHT_eq = eq;
			}
			catch (Exception e) {
				CAUGHT_eq = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Action_c_c_CorrectScheme, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_eq, OCCITables.INT_0).booleanValue();
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OCCIPackage.ACTION___CONTAINED_ACTION__DIAGNOSTICCHAIN_MAP:
				return containedAction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.ACTION___CORRECT_SCHEME__DIAGNOSTICCHAIN_MAP:
				return CorrectScheme((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionImpl
