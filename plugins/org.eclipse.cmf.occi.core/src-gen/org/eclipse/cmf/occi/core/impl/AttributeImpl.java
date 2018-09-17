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
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanOrOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.AttributeImpl#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.AttributeImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.AttributeImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.AttributeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.impl.AttributeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends AnnotatedElementImpl implements Attribute {
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
	 * The default value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutable()
	 * @generated
	 * @ordered
	 */
	protected boolean mutable = MUTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMutable() {
		return mutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutable(boolean newMutable) {
		boolean oldMutable = mutable;
		mutable = newMutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ATTRIBUTE__MUTABLE, oldMutable, mutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ATTRIBUTE__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ATTRIBUTE__DEFAULT, oldDefault, default_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ATTRIBUTE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCCIPackage.ATTRIBUTE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCCIPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DefaultValueMustBeInstanceOfType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DefaultValueMustBeInstanceOfType:
		 *   let
		 *     severity : Integer[1] = 'Attribute::DefaultValueMustBeInstanceOfType'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = if default <> null
		 *           then
		 *             if type.oclIsTypeOf(BooleanType)
		 *             then
		 *               if default.toLower() = 'true' or default.toLower() = 'false'
		 *               then true
		 *               else false
		 *               endif
		 *             else
		 *               if type.oclIsTypeOf(EnumerationType)
		 *               then
		 *                 if
		 *                   type.oclAsType(EnumerationType)
		 *                   .literals->collect(l | l.name)
		 *                   ->includes(default)
		 *                 then true
		 *                 else false
		 *                 endif
		 *               else true
		 *               endif
		 *             endif
		 *           else true
		 *           endif
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{status = status, message = 'The default value of the attribute ' + name + ' is wrong', severity = -1, quickfix = 'quickfix'
		 *             }
		 *           endif
		 *       in
		 *         'Attribute::DefaultValueMustBeInstanceOfType'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OCCITables.STR_Attribute_c_c_DefaultValueMustBeInstanceOfType);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OCCITables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_10;
		if (le) {
			symbol_10 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String symbol_0 = this.getDefault();
			final /*@NonInvalid*/ boolean ne = symbol_0 != null;
			/*@NonInvalid*/ boolean status;
			if (ne) {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_BooleanType = idResolver.getClass(OCCITables.CLSSid_BooleanType, null);
				final /*@NonInvalid*/ DataType type = this.getType();
				final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, type, TYP_occi_c_c_BooleanType).booleanValue();
				/*@NonInvalid*/ boolean symbol_7;
				if (oclIsTypeOf) {
					/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq;
					try {
						final /*@Thrown*/ String toLower = StringToLowerCaseOperation.INSTANCE.evaluate(symbol_0);
						final /*@Thrown*/ boolean eq = toLower.equals(OCCITables.STR_true);
						CAUGHT_eq = eq;
					}
					catch (Exception e) {
						CAUGHT_eq = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq_0;
					try {
						final /*@Thrown*/ String toLower_0 = StringToLowerCaseOperation.INSTANCE.evaluate(symbol_0);
						final /*@Thrown*/ boolean eq_0 = toLower_0.equals(OCCITables.STR_false);
						CAUGHT_eq_0 = eq_0;
					}
					catch (Exception e) {
						CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_eq_0);
					if (or == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@NonInvalid*/ boolean symbol_3;
					if (or) {
						symbol_3 = ValueUtil.TRUE_VALUE;
					}
					else {
						symbol_3 = ValueUtil.FALSE_VALUE;
					}
					symbol_7 = symbol_3;
				}
				else {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_EnumerationType_0 = idResolver.getClass(OCCITables.CLSSid_EnumerationType, null);
					final /*@Thrown*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, type, TYP_occi_c_c_EnumerationType_0).booleanValue();
					/*@NonInvalid*/ boolean symbol_6;
					if (oclIsTypeOf_0) {
						final /*@Thrown*/ EnumerationType oclAsType = ClassUtil.nonNullState((EnumerationType)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, type, TYP_occi_c_c_EnumerationType_0));
						final /*@Thrown*/ List<EnumerationLiteral> literals = oclAsType.getLiterals();
						final /*@Thrown*/ OrderedSetValue BOXED_literals = idResolver.createOrderedSetOfAll(OCCITables.ORD_CLSSid_EnumerationLiteral, literals);
						/*@Thrown*/ SequenceValue.Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(OCCITables.SEQ_DATAid_Name);
						/*@NonNull*/ Iterator<Object> ITERATOR_l = BOXED_literals.iterator();
						/*@Thrown*/ SequenceValue collect;
						while (true) {
							if (!ITERATOR_l.hasNext()) {
								collect = accumulator;
								break;
							}
							/*@NonInvalid*/ EnumerationLiteral l = (EnumerationLiteral)ITERATOR_l.next();
							/**
							 * l.name
							 */
							final /*@NonInvalid*/ String name = l.getName();
							//
							accumulator.add(name);
						}
						final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(collect, symbol_0).booleanValue();
						/*@NonInvalid*/ boolean symbol_5;
						if (includes) {
							symbol_5 = ValueUtil.TRUE_VALUE;
						}
						else {
							symbol_5 = ValueUtil.FALSE_VALUE;
						}
						symbol_6 = symbol_5;
					}
					else {
						symbol_6 = ValueUtil.TRUE_VALUE;
					}
					symbol_7 = symbol_6;
				}
				status = symbol_7;
			}
			else {
				status = ValueUtil.TRUE_VALUE;
			}
			/*@NonInvalid*/ Object symbol_9;
			if (status) {
				symbol_9 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ String name_0 = this.getName();
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(OCCITables.STR_The_32_default_32_value_32_of_32_the_32_attribute_32, name_0);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, OCCITables.STR__32_is_32_wrong);
				final /*@NonInvalid*/ IntegerValue diff = (IntegerValue)NumericNegateOperation.INSTANCE.evaluate(OCCITables.INT_1);
				final /*@NonInvalid*/ TupleValue symbol_8 = ValueUtil.createTupleOfEach(OCCITables.TUPLid__0, sum_0, OCCITables.STR_quickfix, diff, status);
				symbol_9 = symbol_8;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, OCCITables.STR_Attribute_c_c_DefaultValueMustBeInstanceOfType, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_9, OCCITables.INT_0).booleanValue();
			symbol_10 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCCIPackage.ATTRIBUTE__NAME:
				return getName();
			case OCCIPackage.ATTRIBUTE__MUTABLE:
				return isMutable();
			case OCCIPackage.ATTRIBUTE__REQUIRED:
				return isRequired();
			case OCCIPackage.ATTRIBUTE__DEFAULT:
				return getDefault();
			case OCCIPackage.ATTRIBUTE__DESCRIPTION:
				return getDescription();
			case OCCIPackage.ATTRIBUTE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case OCCIPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case OCCIPackage.ATTRIBUTE__MUTABLE:
				setMutable((Boolean)newValue);
				return;
			case OCCIPackage.ATTRIBUTE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case OCCIPackage.ATTRIBUTE__DEFAULT:
				setDefault((String)newValue);
				return;
			case OCCIPackage.ATTRIBUTE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OCCIPackage.ATTRIBUTE__TYPE:
				setType((DataType)newValue);
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
			case OCCIPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCCIPackage.ATTRIBUTE__MUTABLE:
				setMutable(MUTABLE_EDEFAULT);
				return;
			case OCCIPackage.ATTRIBUTE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case OCCIPackage.ATTRIBUTE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case OCCIPackage.ATTRIBUTE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OCCIPackage.ATTRIBUTE__TYPE:
				setType((DataType)null);
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
			case OCCIPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCCIPackage.ATTRIBUTE__MUTABLE:
				return mutable != MUTABLE_EDEFAULT;
			case OCCIPackage.ATTRIBUTE__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case OCCIPackage.ATTRIBUTE__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case OCCIPackage.ATTRIBUTE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OCCIPackage.ATTRIBUTE__TYPE:
				return type != null;
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
			case OCCIPackage.ATTRIBUTE___DEFAULT_VALUE_MUST_BE_INSTANCE_OF_TYPE__DIAGNOSTICCHAIN_MAP:
				return DefaultValueMustBeInstanceOfType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", mutable: ");
		result.append(mutable);
		result.append(", required: ");
		result.append(required);
		result.append(", default: ");
		result.append(default_);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
