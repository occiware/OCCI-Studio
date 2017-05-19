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
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Resource#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Resource#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Resource#getRlinks <em>Rlinks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ResourceKindIsInParent'"
 * @generated
 */
public interface Resource extends Entity {
	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getResource_Summary()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Resource!summary'"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Resource#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Link}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getResource_Links()
	 * @see org.eclipse.cmf.occi.core.Link#getSource
	 * @model opposite="source" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Resource!links'"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Rlinks</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Link}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rlinks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rlinks</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getResource_Rlinks()
	 * @see org.eclipse.cmf.occi.core.Link#getTarget
	 * @model opposite="target"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Resource!rlinks'"
	 * @generated
	 */
	EList<Link> getRlinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv ResourceKindIsInParent:\n *   let severity : Integer[1] = \'Resource::ResourceKindIsInParent\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[?] = kind->closure(parent)\n *         ->exists(k | k.term = \'resource\' and k.scheme = \'http://schemas.ogf.org/occi/core#\')\n *       in\n *         \'Resource::ResourceKindIsInParent\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.StandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_Resource_c_c_ResourceKindIsInParent);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n\tsymbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> kind_0 = this.getKind();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.SetValue%> oclAsSet = <%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.SET_CLSSid_Kind, kind_0);\n\t\tfinal <%org.eclipse.ocl.pivot.Class%> TYPE_closure_0 = executor.getStaticTypeOf(oclAsSet);\n\t\tfinal <%org.eclipse.ocl.pivot.library.LibraryIteration%>.LibraryIterationExtension IMPL_closure_0 = (<%org.eclipse.ocl.pivot.library.LibraryIteration%>.LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables%>.Operations._Set__closure);\n\t\tfinal /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.SET_CLSSid_Kind, <%org.eclipse.cmf.occi.core.OCCITables%>.CLSSid_Kind);\n\t\t/**\n\t\t * Implementation of the iterator body.\n\t\t \052/\n\t\tfinal /*@NonNull\052/ <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%>()\n\t\t{\n\t\t\t/**\n\t\t\t * parent\n\t\t\t \052/\n\t\t\t@Override\n\t\t\tpublic /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor, final /*@NonNull\052/ <%org.eclipse.ocl.pivot.ids.TypeId%> typeId, final /*@Nullable\052/ Object oclAsSet, final /*@NonInvalid\052/ <%java.lang.Object%> _1) {\n\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> symbol_0 = (<%org.eclipse.cmf.occi.core.Kind%>)_1;\n\t\t\t\tif (symbol_0 == null) {\n\t\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Kind::parent\\\'\");\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> parent = symbol_0.getParent();\n\t\t\t\treturn parent;\n\t\t\t}\n\t\t};\n\t\tfinal /*@NonNull\052/  <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%>(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);\n\t\tfinal /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%> closure = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.ocl.pivot.values.SetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0));\n\t\t/*@Thrown\052/ <%java.lang.Object%> accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t/*@Nullable\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR_k = closure.iterator();\n\t\t/*@Thrown\052/ <%java.lang.Boolean%> result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR_k.hasNext()) {\n\t\t\t\tif (accumulator == null) {\n\t\t\t\t\tresult = null;\n\t\t\t\t}\n\t\t\t\telse if (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator;\n\t\t\t\t}\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> k = (<%org.eclipse.cmf.occi.core.Kind%>)ITERATOR_k.next();\n\t\t\t/**\n\t\t\t * k.term = \'resource\' and k.scheme = \'http://schemas.ogf.org/occi/core#\'\n\t\t\t \052/\n\t\t\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_and;\n\t\t\ttry {\n\t\t\t\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_eq;\n\t\t\t\ttry {\n\t\t\t\t\tif (k == null) {\n\t\t\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Category::term\\\'\");\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> term = k.getTerm();\n\t\t\t\t\tfinal /*@Thrown\052/ boolean eq = term.equals(<%org.eclipse.cmf.occi.core.OCCITables%>.STR_resource);\n\t\t\t\t\tCAUGHT_eq = eq;\n\t\t\t\t}\n\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\tCAUGHT_eq = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_eq_0;\n\t\t\t\ttry {\n\t\t\t\t\tif (k == null) {\n\t\t\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Category::scheme\\\'\");\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> scheme = k.getScheme();\n\t\t\t\t\tfinal /*@Thrown\052/ boolean eq_0 = scheme.equals(<%org.eclipse.cmf.occi.core.OCCITables%>.STR_http_c_s_s_schemas_ogf_org_s_occi_s_core_35);\n\t\t\t\t\tCAUGHT_eq_0 = eq_0;\n\t\t\t\t}\n\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\tCAUGHT_eq_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ <%java.lang.Boolean%> and = <%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%>.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_eq_0);\n\t\t\t\tCAUGHT_and = and;\n\t\t\t}\n\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\tCAUGHT_and = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t}\n\t\t\t//\n\t\t\tif (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t\t// Normal successful body evaluation result\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t}\n\t\t\telse if (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t}\n\t\t\telse if (CAUGHT_and == null) {\t\t\t\t\t\t\t\t// Abnormal null body evaluation result\n\t\t\t\tif (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\taccumulator = null;\t\t\t\t\t\t\t\t\t\t// Cache a null failure\n\t\t\t\t}\n\t\t\t}\n\t\t\telse if (CAUGHT_and instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n\t\t\t\taccumulator = CAUGHT_and;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t}\n\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\taccumulator = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"exists\");\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_Resource_c_c_ResourceKindIsInParent, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n\tsymbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean ResourceKindIsInParent(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Resource
