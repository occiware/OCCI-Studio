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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.FSM#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.FSM#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getFSM()
 * @model extendedMetaData="name='State'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='containedAttribute'"
 * @generated
 */
public interface FSM extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.State}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getFSM_OwnedState()
	 * @see org.eclipse.cmf.occi.core.State#getOwningFSM
	 * @model opposite="owningFSM" containment="true"
	 *        extendedMetaData="name='State'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!FSM!ownedState'"
	 * @generated
	 */
	EList<State> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getFSM_Attribute()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!FSM!attribute'"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.FSM#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv AttributeTypeMustBeEEnum:\n *   let severity : Integer[1] = \'FSM::AttributeTypeMustBeEEnum\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = attribute.type.oclIsTypeOf(EnumerationType)\n *       in\n *         \'FSM::AttributeTypeMustBeEEnum\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_FSM_c_c_AttributeTypeMustBeEEnum);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_EnumerationType = idResolver.getClass(<%org.eclipse.cmf.occi.OCCITables%>.CLSSid_EnumerationType, null);\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Attribute%> attribute = this.getAttribute();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.DataType%> type = attribute.getType();\n\t\tfinal /*@Thrown\052/ boolean result = <%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%>.INSTANCE.evaluate(executor, type, TYP_occi_c_c_EnumerationType).booleanValue();\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_FSM_c_c_AttributeTypeMustBeEEnum, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean AttributeTypeMustBeEEnum(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv containedAttribute:\n *   let severity : Integer[1] = \'FSM::containedAttribute\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = self.oclContainer()\n *         .oclAsType(Kind)\n *         .attributes->includes(self.attribute)\n *       in\n *         \'FSM::containedAttribute\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_FSM_c_c_containedAttribute);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_Kind = idResolver.getClass(<%org.eclipse.cmf.occi.OCCITables%>.CLSSid_Kind, null);\n\t\tfinal /*@NonInvalid\052/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, this);\n\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> oclAsType = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.cmf.occi.core.Kind%>)<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_Kind));\n\t\tfinal /*@Thrown\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Attribute%>> attributes = oclAsType.getAttributes();\n\t\tfinal /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_attributes = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Attribute, attributes);\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Attribute%> attribute = this.getAttribute();\n\t\tfinal /*@Thrown\052/ boolean result = <%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(BOXED_attributes, attribute).booleanValue();\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_FSM_c_c_containedAttribute, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean containedAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

} // FSM
