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
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Type#getActions <em>Actions</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Type#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getType()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConstraintNameUnique'"
 * @generated
 */
public interface Type extends Category {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getType_Actions()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Type!actions'"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getType_Constraints()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Type!constraints'"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv ActionTermUnicity:\n *   let severity : Integer[1] = \'Type::ActionTermUnicity\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let result : Boolean[1] = actions->isUnique(term)\n *       in\n *         \'Type::ActionTermUnicity\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Type_c_c_ActionTermUnicity);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Action%>> actions = this.getActions();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_actions = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Action, actions);\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSetAccumulatorValue(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Action);\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_actions.iterator();\n\t\t/*@Thrown\052/ boolean result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Action%> _1 = (<%org.eclipse.cmf.occi.core.Action%>)ITERATOR__1.next();\n\t\t\t/**\n\t\t\t * term\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> term = _1.getTerm();\n\t\t\t//\n\t\t\tif (accumulator.includes(term) == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\telse {\n\t\t\t\taccumulator.add(term);\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Type_c_c_ActionTermUnicity, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean ActionTermUnicity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv ConstraintNameUnique:\n *   let severity : Integer[1] = \'Type::ConstraintNameUnique\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let result : Boolean[1] = constraints->isUnique(name)\n *       in\n *         \'Type::ConstraintNameUnique\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Type_c_c_ConstraintNameUnique);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Constraint%>> constraints = this.getConstraints();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_constraints = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Constraint, constraints);\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSetAccumulatorValue(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Constraint);\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_constraints.iterator();\n\t\t/*@Thrown\052/ boolean result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Constraint%> _1 = (<%org.eclipse.cmf.occi.core.Constraint%>)ITERATOR__1.next();\n\t\t\t/**\n\t\t\t * name\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> name = _1.getName();\n\t\t\t//\n\t\t\tif (accumulator.includes(name) == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\telse {\n\t\t\t\taccumulator.add(name);\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Type_c_c_ConstraintNameUnique, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean ConstraintNameUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Type
