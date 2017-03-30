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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='containedActionMustBeDeclaredInTheAppropriateKind'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Transition!source'"
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
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.State#getIncomingTransition <em>Incoming Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getTransition_Target()
	 * @see org.eclipse.cmf.occi.core.State#getIncomingTransition
	 * @model opposite="incomingTransition" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Transition!target'"
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
	 * @model required="true"
	 *        extendedMetaData="name='State'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Transition!action'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv containedActionMustBeDeclaredInTheAppropriateKind:\n *   let\n *     severity : Integer[1] = \'Transition::containedActionMustBeDeclaredInTheAppropriateKind\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[1] = self.oclContainer()\n *           .oclAsType(State)\n *           .oclContainer()\n *           .oclAsType(FSM)\n *           .oclContainer()\n *           .oclAsType(Kind)\n *           .actions->includes(self.action)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{status = status, message = \'The action \' + self.action.name + \' declared in \' +\n *               self.action.oclContainer()\n *               .oclAsType(Kind).name + \' Kind cannot be used in the FSM of \' +\n *               self.oclContainer()\n *               .oclAsType(State)\n *               .oclContainer()\n *               .oclAsType(FSM)\n *               .oclContainer()\n *               .oclAsType(Kind).name + \' Kind.\', severity = -1\n *             }\n *           endif\n *       in\n *         \'Transition::containedActionMustBeDeclaredInTheAppropriateKind\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Transition_c_c_containedActionMustBeDeclaredInTheAppropriateKind);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ <%java.lang.Object%> symbol_2;\nif (le) {\n\tsymbol_2 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_FSM = idResolver.getClass(<%org.eclipse.cmf.occi.OCCITables%>.CLSSid_FSM, null);\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_Kind_0 = idResolver.getClass(<%org.eclipse.cmf.occi.OCCITables%>.CLSSid_Kind, null);\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_State = idResolver.getClass(<%org.eclipse.cmf.occi.OCCITables%>.CLSSid_State, null);\n\t\tfinal /*@NonInvalid\052/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, this);\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Action%> action = this.getAction();\n\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.State%> oclAsType = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.cmf.occi.core.State%>)<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_State));\n\t\tfinal /*@Thrown\052/ <%java.lang.Object%> oclContainer_0 = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, oclAsType);\n\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.FSM%> oclAsType_0 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.cmf.occi.core.FSM%>)<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(executor, oclContainer_0, TYP_occi_c_c_FSM));\n\t\tfinal /*@Thrown\052/ <%java.lang.Object%> oclContainer_1 = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, oclAsType_0);\n\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> oclAsType_1 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.cmf.occi.core.Kind%>)<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(executor, oclContainer_1, TYP_occi_c_c_Kind_0));\n\t\tfinal /*@Thrown\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Action%>> actions = oclAsType_1.getActions();\n\t\tfinal /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_actions = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Action, actions);\n\t\tfinal /*@Thrown\052/ boolean status = <%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(BOXED_actions, action).booleanValue();\n\t\t/*@Thrown\052/ <%java.lang.Object%> symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> name = action.getName();\n\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> sum = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(<%org.eclipse.cmf.occi.OCCITables%>.STR_The_32_action_32, name);\n\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> sum_0 = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum, <%org.eclipse.cmf.occi.OCCITables%>.STR__32_declared_32_in_32);\n\t\t\tfinal /*@NonInvalid\052/ <%java.lang.Object%> oclContainer_2 = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, action);\n\t\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> oclAsType_2 = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.cmf.occi.core.Kind%>)<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(executor, oclContainer_2, TYP_occi_c_c_Kind_0));\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> name_0 = oclAsType_2.getName();\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> sum_1 = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum_0, name_0);\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> sum_2 = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum_1, <%org.eclipse.cmf.occi.OCCITables%>.STR__32_Kind_32_cannot_32_be_32_used_32_in_32_the_32_FSM_32_of_32);\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> name_1 = oclAsType_1.getName();\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> sum_3 = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum_2, name_1);\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> sum_4 = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum_3, <%org.eclipse.cmf.occi.OCCITables%>.STR__32_Kind);\n\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> diff = (<%org.eclipse.ocl.pivot.values.IntegerValue%>)<%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%>.INSTANCE.evaluate(<%org.eclipse.cmf.occi.OCCITables%>.INT_1);\n\t\t\tfinal /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.TupleValue%> symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createTupleOfEach(<%org.eclipse.cmf.occi.OCCITables%>.TUPLid_, sum_4, diff, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_symbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Transition_c_c_containedActionMustBeDeclaredInTheAppropriateKind, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean containedActionMustBeDeclaredInTheAppropriateKind(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Transition
