/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.platform;

import java.net.URI;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Databaselink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseUri <em>Occi Database Uri</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseUsername <em>Occi Database Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseToken <em>Occi Database Token</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getDatabaselink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Databaselink extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Occi Database Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connection URI for the database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Database Uri</em>' attribute.
	 * @see #setOcciDatabaseUri(URI)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getDatabaselink_OcciDatabaseUri()
	 * @model dataType="org.eclipse.cmf.occi.platform.URI" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Databaselink!occiDatabaseUri'"
	 * @generated
	 */
	URI getOcciDatabaseUri();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseUri <em>Occi Database Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Database Uri</em>' attribute.
	 * @see #getOcciDatabaseUri()
	 * @generated
	 */
	void setOcciDatabaseUri(URI value);

	/**
	 * Returns the value of the '<em><b>Occi Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Username.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Database Username</em>' attribute.
	 * @see #setOcciDatabaseUsername(URI)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getDatabaselink_OcciDatabaseUsername()
	 * @model dataType="org.eclipse.cmf.occi.platform.URI"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Databaselink!occiDatabaseUsername'"
	 * @generated
	 */
	URI getOcciDatabaseUsername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseUsername <em>Occi Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Database Username</em>' attribute.
	 * @see #getOcciDatabaseUsername()
	 * @generated
	 */
	void setOcciDatabaseUsername(URI value);

	/**
	 * Returns the value of the '<em><b>Occi Database Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Token.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Database Token</em>' attribute.
	 * @see #setOcciDatabaseToken(URI)
	 * @see org.eclipse.cmf.occi.platform.PlatformPackage#getDatabaselink_OcciDatabaseToken()
	 * @model dataType="org.eclipse.cmf.occi.platform.URI"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/platform/ecore!Databaselink!occiDatabaseToken'"
	 * @generated
	 */
	URI getOcciDatabaseToken();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.platform.Databaselink#getOcciDatabaseToken <em>Occi Database Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Database Token</em>' attribute.
	 * @see #getOcciDatabaseToken()
	 * @generated
	 */
	void setOcciDatabaseToken(URI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Databaselink::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Componentlink)\n *       in\n *         \'Databaselink::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.platform.PlatformTables%&gt;.STR_Databaselink_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.platform.PlatformTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_platform_c_c_Componentlink = idResolver.getClass(&lt;%org.eclipse.cmf.occi.platform.PlatformTables%&gt;.CLSSid_Componentlink, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Componentlink).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.platform.PlatformTables%&gt;.STR_Databaselink_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.platform.PlatformTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Databaselink
