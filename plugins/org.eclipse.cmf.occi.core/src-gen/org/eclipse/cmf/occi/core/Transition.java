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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Transition#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTransition()
 * @model extendedMetaData="name='State'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='containedActionMustBeDeclaredInTheAppropriateType'"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.State#getOutgoingTransition <em>Outgoing Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(State)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTransition_Source()
	 * @see org.eclipse.cmf.occi.core.State#getOutgoingTransition
	 * @model opposite="outgoingTransition" required="true" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Transition!source'"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTransition_Target()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Transition!target'"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTransition_Action()
	 * @model extendedMetaData="name='State'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Transition!action'"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Transition#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv containedActionMustBeDeclaredInTheAppropriateType:\n *   let\n *     severity : Integer[1] = \'Transition::containedActionMustBeDeclaredInTheAppropriateType\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[1] = if self.action &lt;&gt; null\n *           then\n *             self.oclContainer()\n *             .oclAsType(State)\n *             .oclContainer()\n *             .oclAsType(FSM)\n *             .oclContainer()\n *             .oclAsType(Type)\n *             .actions-&gt;includes(self.action)\n *           else false\n *           endif\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{\n *               status = status, message = if self.action &lt;&gt; null\n *               then \'The action \' + self.action.name + \' declared in \' +\n *                 self.action.oclContainer()\n *                 .oclAsType(Type).name + \' kind/mixin cannot be used in the FSM of \' +\n *                 self.oclContainer()\n *                 .oclAsType(State)\n *                 .oclContainer()\n *                 .oclAsType(FSM)\n *                 .oclContainer()\n *                 .oclAsType(Type).name + \' kind/mixin.\'\n *               else \'The action of Transition instance coming from the \"\' + source.literal.name + \'\" state to the \"\' + target.literal.name + \'\" state in the FSM of \"\' +\n *                 source.owningFSM.oclContainer()\n *                 .oclAsType(Type).name + \'\" kind/mixin instance must be a set\'\n *               endif, severity = -1\n *             }\n *           endif\n *       in\n *         \'Transition::containedActionMustBeDeclaredInTheAppropriateType\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Transition_c_c_containedActionMustBeDeclaredInTheAppropriateType);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_3;\nif (le) {\n\tsymbol_3 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_2;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Action%&gt; action_0 = this.getAction();\n\t\tfinal /*@NonInvalid\052/ boolean ne = action_0 != null;\n\t\t/*@Thrown\052/ boolean status;\n\t\tif (ne) {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_FSM = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_FSM, null);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_State = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_State, null);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_Type_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_Type, null);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; oclContainer = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, this);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.State%&gt; oclAsType = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.State%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_State));\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Object%&gt; oclContainer_0 = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, oclAsType);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.FSM%&gt; oclAsType_0 = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.FSM%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer_0, TYP_occi_c_c_FSM));\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Object%&gt; oclContainer_1 = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, oclAsType_0);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Type%&gt; oclAsType_1 = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Type%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer_1, TYP_occi_c_c_Type_0));\n\t\t\tfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.Action%&gt;&gt; actions = oclAsType_1.getActions();\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_actions = idResolver.createOrderedSetOfAll(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.ORD_CLSSid_Action, actions);\n\t\t\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(BOXED_actions, action_0).booleanValue();\n\t\t\tstatus = includes;\n\t\t}\n\t\telse {\n\t\t\tstatus = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_2;\n\t\tif (status) {\n\t\t\tsymbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_Type_3 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_Type, null);\n\t\t\t/*@Thrown\052/ &lt;%java.lang.String%&gt; symbol_0;\n\t\t\tif (ne) {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_FSM_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_FSM, null);\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_State_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_State, null);\n\t\t\t\tif (action_0 == null) {\n\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Category::name\\\'\");\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; name = action_0.getName();\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_The_32_action_32, name);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_0 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR__32_declared_32_in_32);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Object%&gt; oclContainer_2 = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, action_0);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Type%&gt; oclAsType_2 = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Type%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer_2, TYP_occi_c_c_Type_3));\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; name_0 = oclAsType_2.getName();\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_1 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_0, name_0);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_2 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_1, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR__32_kind_s_mixin_32_cannot_32_be_32_used_32_in_32_the_32_FSM_32_of_32);\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; oclContainer_3 = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, this);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.State%&gt; oclAsType_3 = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.State%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer_3, TYP_occi_c_c_State_0));\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Object%&gt; oclContainer_4 = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, oclAsType_3);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.FSM%&gt; oclAsType_4 = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.FSM%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer_4, TYP_occi_c_c_FSM_0));\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.Object%&gt; oclContainer_5 = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, oclAsType_4);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Type%&gt; oclAsType_5 = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Type%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer_5, TYP_occi_c_c_Type_3));\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; name_1 = oclAsType_5.getName();\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_3 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_2, name_1);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_4 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_3, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR__32_kind_s_mixin);\n\t\t\t\tsymbol_0 = sum_4;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.State%&gt; source_0 = this.getSource();\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.EnumerationLiteral%&gt; literal = source_0.getLiteral();\n\t\t\t\tif (literal == null) {\n\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::EnumerationLiteral::name\\\'\");\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; name_2 = literal.getName();\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_5 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_The_32_action_32_of_32_Transition_32_instance_32_coming_32_from_32_the_32_34, name_2);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_6 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_5, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR__34_32_state_32_to_32_the_32_34);\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.State%&gt; target = this.getTarget();\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.EnumerationLiteral%&gt; literal_0 = target.getLiteral();\n\t\t\t\tif (literal_0 == null) {\n\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::EnumerationLiteral::name\\\'\");\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; name_3 = literal_0.getName();\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_7 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_6, name_3);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_8 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_7, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR__34_32_state_32_in_32_the_32_FSM_32_of_32_34);\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.FSM%&gt; owningFSM = source_0.getOwningFSM();\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; oclContainer_6 = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%&gt;.INSTANCE.evaluate(executor, owningFSM);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Type%&gt; oclAsType_6 = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Type%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, oclContainer_6, TYP_occi_c_c_Type_3));\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; name_4 = oclAsType_6.getName();\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_9 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_8, name_4);\n\t\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum_10 = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(sum_9, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR__34_32_kind_s_mixin_32_instance_32_must_32_be_32_a_32_set);\n\t\t\t\tsymbol_0 = sum_10;\n\t\t\t}\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; diff = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%&gt;.INSTANCE.evaluate(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_1);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.TUPLid_, symbol_0, diff, status);\n\t\t\tsymbol_2 = symbol_1;\n\t\t}\n\t\tCAUGHT_symbol_2 = symbol_2;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_2 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Transition_c_c_containedActionMustBeDeclaredInTheAppropriateType, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_2, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n\tsymbol_3 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_3;'"
	 * @generated
	 */
	boolean containedActionMustBeDeclaredInTheAppropriateType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Transition
