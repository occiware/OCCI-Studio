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

import java.util.Map;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.FSM;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.State;
import org.eclipse.cmf.occi.core.Transition;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.cmf.occi.util.OCCIValidator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;




/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.impl.FSMImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.impl.FSMImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FSMImpl extends MinimalEObjectImpl.Container implements FSM {
	/**
	 * The cached value of the '{@link #getOwnedState() <em>Owned State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedState;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedState() {
		if (ownedState == null) {
			ownedState = new EObjectContainmentWithInverseEList<State>(State.class, this, OCCIPackage.FSM__OWNED_STATE, OCCIPackage.STATE__OWNING_FSM);
		}
		return ownedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.FSM__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.FSM__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validate(DiagnosticChain diagnostic, Map<Object, Object> context) {
		EList<Action> declaredActions = ((Type)eContainer()).getActions();
		EList<Action> usedActions = new BasicEList<Action>();
		for (State state: getOwnedState()){
			for(Transition tr: state.getOutgoingTransition()){
				if(tr.getAction() != null){
					if(! usedActions.contains(tr.getAction())){
						usedActions.add(tr.getAction());
					}
				}
			}
		}
		EList<Action> notUsedActions = new BasicEList<Action>();
		for(Action action:declaredActions){
			if(!usedActions.contains(action)){
				notUsedActions.add(action);
			}
		}
		
		boolean valid = true;
		if (diagnostic != null) {
			if (notUsedActions.size() != 0) {
				valid = false;
				for(Action action:notUsedActions){
				diagnostic.add(new BasicDiagnostic(Diagnostic.WARNING,
						OCCIValidator.DIAGNOSTIC_SOURCE,
						OCCIValidator.FSM__VALIDATE, "The declared action "+action.getName()+ " doesn't appear in the FSM of "+((Kind)action.eContainer()).getName()+" kind",
						new Object[] { this }));
				}
			}
		}
		return valid;
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
//		if (false) {
//			if (diagnostic != null) {
//				diagnostic.add
//					(new BasicDiagnostic
//						(Diagnostic.ERROR,
//						 OCCIValidator.DIAGNOSTIC_SOURCE,
//						 OCCIValidator.FSM__VALIDATE,
//						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validate", EObjectValidator.getObjectLabel(this, context) }),
//						 new Object [] { this }));
//			}
//			return false;
//		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AttributeTypeMustBeEEnum(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv AttributeTypeMustBeEEnum:
		 *   let severity : Integer[1] = 'FSM::AttributeTypeMustBeEEnum'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[1] = attribute.type.oclIsTypeOf(EnumerationType)
		 *       in
		 *         'FSM::AttributeTypeMustBeEEnum'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_FSM_c_c_AttributeTypeMustBeEEnum);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@Caught*/ /*@NonNull*/ Object CAUGHT_status;
		    try {
		        final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_EnumerationType = idResolver.getClass(OCCITables.CLSSid_EnumerationType, null);
		        final /*@Thrown*/ Attribute attribute = this.getAttribute();
		        final /*@Thrown*/ DataType type = attribute.getType();
		        final /*@Thrown*/ boolean status = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, type, TYP_occi_c_c_EnumerationType).booleanValue();
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_FSM_c_c_AttributeTypeMustBeEEnum, this, null, diagnostics, context, null, severity_0, CAUGHT_status, OCCITables.INT_0).booleanValue();
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCCIPackage.FSM__OWNED_STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedState()).basicAdd(otherEnd, msgs);
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
			case OCCIPackage.FSM__OWNED_STATE:
				return ((InternalEList<?>)getOwnedState()).basicRemove(otherEnd, msgs);
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
			case OCCIPackage.FSM__OWNED_STATE:
				return getOwnedState();
			case OCCIPackage.FSM__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
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
			case OCCIPackage.FSM__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends State>)newValue);
				return;
			case OCCIPackage.FSM__ATTRIBUTE:
				setAttribute((Attribute)newValue);
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
			case OCCIPackage.FSM__OWNED_STATE:
				getOwnedState().clear();
				return;
			case OCCIPackage.FSM__ATTRIBUTE:
				setAttribute((Attribute)null);
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
			case OCCIPackage.FSM__OWNED_STATE:
				return ownedState != null && !ownedState.isEmpty();
			case OCCIPackage.FSM__ATTRIBUTE:
				return attribute != null;
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
			case OCCIPackage.FSM___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case OCCIPackage.FSM___ATTRIBUTE_TYPE_MUST_BE_EENUM__DIAGNOSTICCHAIN_MAP:
				return AttributeTypeMustBeEEnum((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //FSMImpl
