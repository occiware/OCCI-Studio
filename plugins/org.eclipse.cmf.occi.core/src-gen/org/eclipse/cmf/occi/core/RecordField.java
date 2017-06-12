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
 * A representation of the model object '<em><b>Record Field</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getRecordField()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ContainerMustBeRecordType'"
 * @generated
 */
public interface RecordField extends Attribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv TypeDifferentContainer:\n *   let\n *     severity : Integer[1] = \'RecordField::TypeDifferentContainer\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let result : Boolean[1] = self.type <> self.oclContainer\n *       in\n *         \'RecordField::TypeDifferentContainer\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_RecordField_c_c_TypeDifferentContainer);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.DataType%> type = this.getType();\n\tfinal /*@NonInvalid\052/ <%java.lang.Object%> oclContainer = this.eContainer();\n\tfinal /*@NonInvalid\052/ boolean result = (type != null) ? !type.equals(oclContainer) : (oclContainer != null);\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_RecordField_c_c_TypeDifferentContainer, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean TypeDifferentContainer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv ContainerMustBeRecordType:\n *   let\n *     severity : Integer[1] = \'RecordField::ContainerMustBeRecordType\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = self.oclContainer.oclIsTypeOf(RecordType)\n *       in\n *         \'RecordField::ContainerMustBeRecordType\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_RecordField_c_c_ContainerMustBeRecordType);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_RecordType = idResolver.getClass(<%org.eclipse.cmf.occi.core.OCCITables%>.CLSSid_RecordType, null);\n\t\tfinal /*@NonInvalid\052/ <%java.lang.Object%> oclContainer = this.eContainer();\n\t\tfinal /*@Thrown\052/ boolean result = <%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%>.INSTANCE.evaluate(executor, oclContainer, TYP_occi_c_c_RecordType).booleanValue();\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_RecordField_c_c_ContainerMustBeRecordType, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean ContainerMustBeRecordType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RecordField
