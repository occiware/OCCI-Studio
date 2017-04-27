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
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Link#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Link#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LinkKindIsInParent'"
 * @generated
 */
public interface Link extends Entity {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.Resource#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Resource)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getLink_Source()
	 * @see org.eclipse.cmf.occi.core.Resource#getLinks
	 * @model opposite="links" required="true" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Link!source'"
	 * @generated
	 */
	Resource getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Link#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Resource value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.Resource#getRlinks <em>Rlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Resource)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getLink_Target()
	 * @see org.eclipse.cmf.occi.core.Resource#getRlinks
	 * @model opposite="rlinks" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Link!target'"
	 * @generated
	 */
	Resource getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Resource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv sourceReferenceInvariant:\n *   let severity : Integer[1] = \'Link::sourceReferenceInvariant\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[1] = self.source.kind.occiIsKindOf(\n *             self.oclAsType(Entity).kind.source)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{status = status, message = \'The kind of the source reference in the link instance \' +\n *               self.oclAsType(Entity).title + \' must be a kind of the source of the kind of this link\', severity = -1, quickfix = \'quickfix\'\n *             }\n *           endif\n *       in\n *         \'Link::sourceReferenceInvariant\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Link_c_c_sourceReferenceInvariant);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ <%java.lang.Object%> symbol_2;\nif (le) {\n\tsymbol_2 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_Entity_0 = idResolver.getClass(<%org.eclipse.cmf.occi.OCCITables%>.CLSSid_Entity, null);\n\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Entity%> oclAsType = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.cmf.occi.core.Entity%>)<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(executor, this, TYP_occi_c_c_Entity_0));\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Resource%> source = this.getSource();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> kind_0 = source.getKind();\n\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> kind_1 = oclAsType.getKind();\n\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> source_0 = kind_1.getSource();\n\t\tfinal /*@Thrown\052/ boolean status = kind_0.occiIsKindOf(source_0);\n\t\t/*@Thrown\052/ <%java.lang.Object%> symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> title = oclAsType.getTitle();\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> sum = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(<%org.eclipse.cmf.occi.OCCITables%>.STR_The_32_kind_32_of_32_the_32_source_32_reference_32_in_32_the_32_link_32_instance_32, title);\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> sum_0 = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum, <%org.eclipse.cmf.occi.OCCITables%>.STR__32_must_32_be_32_a_32_kind_32_of_32_the_32_source_32_of_32_the_32_kind_32_of_32_this_32_link);\n\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> diff = (<%org.eclipse.ocl.pivot.values.IntegerValue%>)<%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%>.INSTANCE.evaluate(<%org.eclipse.cmf.occi.OCCITables%>.INT_1);\n\t\t\tfinal /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.TupleValue%> symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createTupleOfEach(<%org.eclipse.cmf.occi.OCCITables%>.TUPLid__0, sum_0, <%org.eclipse.cmf.occi.OCCITables%>.STR_quickfix, diff, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_symbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Link_c_c_sourceReferenceInvariant, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean sourceReferenceInvariant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv targetReferenceInvariant:\n *   let severity : Integer[1] = \'Link::targetReferenceInvariant\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[1] = self.target.kind.occiIsKindOf(\n *             self.oclAsType(Entity).kind.target)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{status = status, message = \'The kind of the target reference in the link instance \' +\n *               self.oclAsType(Entity).title + \' must be a kind of the target of the kind of this link\', severity = -1, quickfix = \'quickfix\'\n *             }\n *           endif\n *       in\n *         \'Link::targetReferenceInvariant\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Link_c_c_targetReferenceInvariant);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ <%java.lang.Object%> symbol_2;\nif (le) {\n\tsymbol_2 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_symbol_1;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_Entity_0 = idResolver.getClass(<%org.eclipse.cmf.occi.OCCITables%>.CLSSid_Entity, null);\n\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Entity%> oclAsType = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.cmf.occi.core.Entity%>)<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(executor, this, TYP_occi_c_c_Entity_0));\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Resource%> target = this.getTarget();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> kind_0 = target.getKind();\n\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> kind_1 = oclAsType.getKind();\n\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> target_0 = kind_1.getTarget();\n\t\tfinal /*@Thrown\052/ boolean status = kind_0.occiIsKindOf(target_0);\n\t\t/*@Thrown\052/ <%java.lang.Object%> symbol_1;\n\t\tif (status) {\n\t\t\tsymbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> title = oclAsType.getTitle();\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> sum = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(<%org.eclipse.cmf.occi.OCCITables%>.STR_The_32_kind_32_of_32_the_32_target_32_reference_32_in_32_the_32_link_32_instance_32, title);\n\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> sum_0 = <%org.eclipse.ocl.pivot.library.string.StringConcatOperation%>.INSTANCE.evaluate(sum, <%org.eclipse.cmf.occi.OCCITables%>.STR__32_must_32_be_32_a_32_kind_32_of_32_the_32_target_32_of_32_the_32_kind_32_of_32_this_32_link);\n\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> diff = (<%org.eclipse.ocl.pivot.values.IntegerValue%>)<%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%>.INSTANCE.evaluate(<%org.eclipse.cmf.occi.OCCITables%>.INT_1);\n\t\t\tfinal /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.TupleValue%> symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createTupleOfEach(<%org.eclipse.cmf.occi.OCCITables%>.TUPLid__0, sum_0, <%org.eclipse.cmf.occi.OCCITables%>.STR_quickfix, diff, status);\n\t\t\tsymbol_1 = symbol_0;\n\t\t}\n\t\tCAUGHT_symbol_1 = symbol_1;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_symbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Link_c_c_targetReferenceInvariant, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_2 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_2;'"
	 * @generated
	 */
	boolean targetReferenceInvariant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv LinkKindIsInParent:\n *   let severity : Integer[1] = \'Link::LinkKindIsInParent\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[?] = kind->closure(parent)\n *         ->exists(k | k.term = \'link\' and k.scheme = \'http://schemas.ogf.org/occi/core#\')\n *       in\n *         \'Link::LinkKindIsInParent\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.StandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Link_c_c_LinkKindIsInParent);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n\tsymbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> kind_0 = this.getKind();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.SetValue%> oclAsSet = <%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.SET_CLSSid_Kind, kind_0);\n\t\tfinal <%org.eclipse.ocl.pivot.Class%> TYPE_closure_0 = executor.getStaticTypeOf(oclAsSet);\n\t\tfinal <%org.eclipse.ocl.pivot.library.LibraryIteration%>.LibraryIterationExtension IMPL_closure_0 = (<%org.eclipse.ocl.pivot.library.LibraryIteration%>.LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables%>.Operations._Set__closure);\n\t\tfinal /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, <%org.eclipse.cmf.occi.OCCITables%>.SET_CLSSid_Kind, <%org.eclipse.cmf.occi.OCCITables%>.CLSSid_Kind);\n\t\t/**\n\t\t * Implementation of the iterator body.\n\t\t \052/\n\t\tfinal /*@NonNull\052/ <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%>()\n\t\t{\n\t\t\t/**\n\t\t\t * parent\n\t\t\t \052/\n\t\t\t@Override\n\t\t\tpublic /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor, final /*@NonNull\052/ <%org.eclipse.ocl.pivot.ids.TypeId%> typeId, final /*@Nullable\052/ Object oclAsSet, final /*@NonInvalid\052/ <%java.lang.Object%> _1) {\n\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> symbol_0 = (<%org.eclipse.cmf.occi.core.Kind%>)_1;\n\t\t\t\tif (symbol_0 == null) {\n\t\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Kind::parent\\\'\");\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> parent = symbol_0.getParent();\n\t\t\t\treturn parent;\n\t\t\t}\n\t\t};\n\t\tfinal /*@NonNull\052/  <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%>(executor, <%org.eclipse.cmf.occi.OCCITables%>.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);\n\t\tfinal /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%> closure = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.ocl.pivot.values.SetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0));\n\t\t/*@Thrown\052/ <%java.lang.Object%> accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t/*@Nullable\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR_k = closure.iterator();\n\t\t/*@Thrown\052/ <%java.lang.Boolean%> result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR_k.hasNext()) {\n\t\t\t\tif (accumulator == null) {\n\t\t\t\t\tresult = null;\n\t\t\t\t}\n\t\t\t\telse if (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator;\n\t\t\t\t}\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> k = (<%org.eclipse.cmf.occi.core.Kind%>)ITERATOR_k.next();\n\t\t\t/**\n\t\t\t * k.term = \'link\' and k.scheme = \'http://schemas.ogf.org/occi/core#\'\n\t\t\t \052/\n\t\t\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_and;\n\t\t\ttry {\n\t\t\t\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_eq;\n\t\t\t\ttry {\n\t\t\t\t\tif (k == null) {\n\t\t\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Category::term\\\'\");\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> term = k.getTerm();\n\t\t\t\t\tfinal /*@Thrown\052/ boolean eq = term.equals(<%org.eclipse.cmf.occi.OCCITables%>.STR_link);\n\t\t\t\t\tCAUGHT_eq = eq;\n\t\t\t\t}\n\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\tCAUGHT_eq = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_eq_0;\n\t\t\t\ttry {\n\t\t\t\t\tif (k == null) {\n\t\t\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Category::scheme\\\'\");\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> scheme = k.getScheme();\n\t\t\t\t\tfinal /*@Thrown\052/ boolean eq_0 = scheme.equals(<%org.eclipse.cmf.occi.OCCITables%>.STR_http_c_s_s_schemas_ogf_org_s_occi_s_core_35);\n\t\t\t\t\tCAUGHT_eq_0 = eq_0;\n\t\t\t\t}\n\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\tCAUGHT_eq_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown\052/ <%java.lang.Boolean%> and = <%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%>.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_eq_0);\n\t\t\t\tCAUGHT_and = and;\n\t\t\t}\n\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\tCAUGHT_and = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t}\n\t\t\t//\n\t\t\tif (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t\t// Normal successful body evaluation result\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t}\n\t\t\telse if (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t}\n\t\t\telse if (CAUGHT_and == null) {\t\t\t\t\t\t\t\t// Abnormal null body evaluation result\n\t\t\t\tif (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\taccumulator = null;\t\t\t\t\t\t\t\t\t\t// Cache a null failure\n\t\t\t\t}\n\t\t\t}\n\t\t\telse if (CAUGHT_and instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n\t\t\t\taccumulator = CAUGHT_and;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t}\n\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\taccumulator = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"exists\");\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Link_c_c_LinkKindIsInParent, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean LinkKindIsInParent(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Link
