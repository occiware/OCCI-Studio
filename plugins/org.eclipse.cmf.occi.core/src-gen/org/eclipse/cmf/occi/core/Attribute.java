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
package org.eclipse.cmf.occi.core;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DefaultValueMustBeInstanceOfType'"
 * @generated
 */
public interface Attribute extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.AttributeName" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Attribute!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mutable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutable</em>' attribute.
	 * @see #setMutable(boolean)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Mutable()
	 * @model default="true" dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Attribute!mutable'"
	 * @generated
	 */
	boolean isMutable();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#isMutable <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutable</em>' attribute.
	 * @see #isMutable()
	 * @generated
	 */
	void setMutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Required()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Attribute!required'"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Default()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Attribute!default'"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Description()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Attribute!description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Type()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Attribute!type'"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv DefaultValueMustBeInstanceOfType:\n *   let\n *     severity : Integer[1] = \'Attribute::DefaultValueMustBeInstanceOfType\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[1] = if default &lt;&gt; null\n *           then\n *             if type.oclIsTypeOf(BooleanType)\n *             then\n *               if default.toLower() = \'true\' or default.toLower() = \'false\'\n *               then true\n *               else false\n *               endif\n *             else\n *               if type.oclIsTypeOf(EnumerationType)\n *               then\n *                 if\n *                   type.oclAsType(EnumerationType)\n *                   .literals-&gt;collect(l | l.name)\n *                   -&gt;includes(default)\n *                 then true\n *                 else false\n *                 endif\n *               else true\n *               endif\n *             endif\n *           else true\n *           endif\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{status = status, message = \'The default value of the attribute \' + name + \' is wrong\', severity = -1, quickfix = \'quickfix\'\n *             }\n *           endif\n *       in\n *         \'Attribute::DefaultValueMustBeInstanceOfType\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Attribute_c_c_DefaultValueMustBeInstanceOfType);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_10;\nif (le) {\n\tsymbol_10 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; symbol_0 = this.getDefault();\n\tfinal /*@NonInvalid\052/ boolean ne = symbol_0 != null;\n\t/*@NonInvalid\052/ boolean status;\n\tif (ne) {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_BooleanType = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_BooleanType, null);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.DataType%&gt; type = this.getType();\n\t\tfinal /*@Thrown\052/ boolean oclIsTypeOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, type, TYP_occi_c_c_BooleanType).booleanValue();\n\t\t/*@NonInvalid\052/ boolean symbol_7;\n\t\tif (oclIsTypeOf) {\n\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_eq;\n\t\t\ttry {\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toLower = &lt;%org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation%&gt;.INSTANCE.evaluate(symbol_0);\n\t\t\t\tfinal /*@Thrown\052/ boolean eq = toLower.equals(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_true);\n\t\t\t\tCAUGHT_eq = eq;\n\t\t\t}\n\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\tCAUGHT_eq = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t}\n\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_eq_0;\n\t\t\ttry {\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; toLower_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation%&gt;.INSTANCE.evaluate(symbol_0);\n\t\t\t\tfinal /*@Thrown\052/ boolean eq_0 = toLower_0.equals(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_false);\n\t\t\t\tCAUGHT_eq_0 = eq_0;\n\t\t\t}\n\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\tCAUGHT_eq_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; or = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%&gt;.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_eq_0);\n\t\t\tif (or == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null if condition\");\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ boolean symbol_3;\n\t\t\tif (or) {\n\t\t\t\tsymbol_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tsymbol_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t}\n\t\t\tsymbol_7 = symbol_3;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_EnumerationType_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_EnumerationType, null);\n\t\t\tfinal /*@Thrown\052/ boolean oclIsTypeOf_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, type, TYP_occi_c_c_EnumerationType_0).booleanValue();\n\t\t\t/*@NonInvalid\052/ boolean symbol_6;\n\t\t\tif (oclIsTypeOf_0) {\n\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.EnumerationType%&gt; oclAsType = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.EnumerationType%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, type, TYP_occi_c_c_EnumerationType_0));\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.EnumerationLiteral%&gt;&gt; literals = oclAsType.getLiterals();\n\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_literals = idResolver.createOrderedSetOfAll(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.ORD_CLSSid_EnumerationLiteral, literals);\n\t\t\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSequenceAccumulatorValue(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.SEQ_DATAid_Name);\n\t\t\t\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_l = BOXED_literals.iterator();\n\t\t\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; collect;\n\t\t\t\twhile (true) {\n\t\t\t\t\tif (!ITERATOR_l.hasNext()) {\n\t\t\t\t\t\tcollect = accumulator;\n\t\t\t\t\t\tbreak;\n\t\t\t\t\t}\n\t\t\t\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.EnumerationLiteral%&gt; l = (&lt;%org.eclipse.cmf.occi.core.EnumerationLiteral%&gt;)ITERATOR_l.next();\n\t\t\t\t\t/**\n\t\t\t\t\t * l.name\n\t\t\t\t\t \052/\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; name = l.getName();\n\t\t\t\t\t//\n\t\t\t\t\taccumulator.add(name);\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(collect, symbol_0).booleanValue();\n\t\t\t\t/*@NonInvalid\052/ boolean symbol_5;\n\t\t\t\tif (includes) {\n\t\t\t\t\tsymbol_5 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tsymbol_5 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\tsymbol_6 = symbol_5;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tsymbol_6 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t}\n\t\t\tsymbol_7 = symbol_6;\n\t\t}\n\t\tstatus = symbol_7;\n\t}\n\telse {\n\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\t/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_9;\n\tif (status) {\n\t\tsymbol_9 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; name_0 = this.getName();\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_The_32_default_32_value_32_of_32_the_32_attribute_32, name_0);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR__32_is_32_wrong);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; diff = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%&gt;.INSTANCE.evaluate(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_1);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_8 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.TUPLid__0, sum_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_quickfix, diff, status);\n\t\tsymbol_9 = symbol_8;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Attribute_c_c_DefaultValueMustBeInstanceOfType, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_9, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n\tsymbol_10 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_10;'"
	 * @generated
	 */
	boolean DefaultValueMustBeInstanceOfType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Attribute
