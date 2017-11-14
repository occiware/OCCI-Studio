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
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.EnumerationLiteral#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.EnumerationLiteral#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.EnumerationLiteral#getEnumerationType <em>Enumeration Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEnumerationLiteral()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EnumerationLiteralNameRegex'"
 * @generated
 */
public interface EnumerationLiteral extends EObject {
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
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEnumerationLiteral_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.Name" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!EnumerationLiteral!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.EnumerationLiteral#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEnumerationLiteral_Documentation()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!EnumerationLiteral!documentation'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.EnumerationLiteral#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Enumeration Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.EnumerationType#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Type</em>' container reference.
	 * @see #setEnumerationType(EnumerationType)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEnumerationLiteral_EnumerationType()
	 * @see org.eclipse.cmf.occi.core.EnumerationType#getLiterals
	 * @model opposite="literals" required="true" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!EnumerationLiteral!enumerationType'"
	 * @generated
	 */
	EnumerationType getEnumerationType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.EnumerationLiteral#getEnumerationType <em>Enumeration Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Type</em>' container reference.
	 * @see #getEnumerationType()
	 * @generated
	 */
	void setEnumerationType(EnumerationType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv EnumerationLiteralNameRegex:\n *   let\n *     severity : Integer[1] = \'EnumerationLiteral::EnumerationLiteralNameRegex\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = self.name.matches(\'[a-zA-Z_][a-zA-Z0-9_]*\')\n *       in\n *         \'EnumerationLiteral::EnumerationLiteralNameRegex\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_EnumerationLiteral_c_c_EnumerationLiteralNameRegex);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; name = this.getName();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, name, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR__91_a_m_zA_m_Z__93_91_a_m_zA_m_Z0_m_9__93_a).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_EnumerationLiteral_c_c_EnumerationLiteralNameRegex, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean EnumerationLiteralNameRegex(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EnumerationLiteral
