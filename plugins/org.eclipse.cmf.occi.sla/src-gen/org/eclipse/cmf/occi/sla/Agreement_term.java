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
package org.eclipse.cmf.occi.sla;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermType <em>Occi Agreement Term Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermState <em>Occi Agreement Term State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermDesc <em>Occi Agreement Term Desc</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermRemedy <em>Occi Agreement Term Remedy</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.sla.SlaPackage#getAgreement_term()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Agreement_term extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.sla.AgreementTermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the term that is being defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Agreement Term Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementTermType
	 * @see #setOcciAgreementTermType(AgreementTermType)
	 * @see org.eclipse.cmf.occi.sla.SlaPackage#getAgreement_term_OcciAgreementTermType()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement_term!occiAgreementTermType'"
	 * @generated
	 */
	AgreementTermType getOcciAgreementTermType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermType <em>Occi Agreement Term Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Agreement Term Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementTermType
	 * @see #getOcciAgreementTermType()
	 * @generated
	 */
	void setOcciAgreementTermType(AgreementTermType value);

	/**
	 * Returns the value of the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.sla.AgreementTermStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state of fulfillment of the specific term.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Agreement Term State</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementTermStatus
	 * @see #setOcciAgreementTermState(AgreementTermStatus)
	 * @see org.eclipse.cmf.occi.sla.SlaPackage#getAgreement_term_OcciAgreementTermState()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement_term!occiAgreementTermState'"
	 * @generated
	 */
	AgreementTermStatus getOcciAgreementTermState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermState <em>Occi Agreement Term State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Agreement Term State</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementTermStatus
	 * @see #getOcciAgreementTermState()
	 * @generated
	 */
	void setOcciAgreementTermState(AgreementTermStatus value);

	/**
	 * Returns the value of the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the agreement term defined with this mixin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Agreement Term Desc</em>' attribute.
	 * @see #setOcciAgreementTermDesc(String)
	 * @see org.eclipse.cmf.occi.sla.SlaPackage#getAgreement_term_OcciAgreementTermDesc()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement_term!occiAgreementTermDesc'"
	 * @generated
	 */
	String getOcciAgreementTermDesc();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermDesc <em>Occi Agreement Term Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Agreement Term Desc</em>' attribute.
	 * @see #getOcciAgreementTermDesc()
	 * @generated
	 */
	void setOcciAgreementTermDesc(String value);

	/**
	 * Returns the value of the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remedy value (e.g., price penalty) or action e.g., command) when an SLO term is being violated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Agreement Term Remedy</em>' attribute.
	 * @see #setOcciAgreementTermRemedy(String)
	 * @see org.eclipse.cmf.occi.sla.SlaPackage#getAgreement_term_OcciAgreementTermRemedy()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/sla/ecore!Agreement_term!occiAgreementTermRemedy'"
	 * @generated
	 */
	String getOcciAgreementTermRemedy();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.sla.Agreement_term#getOcciAgreementTermRemedy <em>Occi Agreement Term Remedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Agreement Term Remedy</em>' attribute.
	 * @see #getOcciAgreementTermRemedy()
	 * @generated
	 */
	void setOcciAgreementTermRemedy(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let\n *     severity : Integer[1] = \'Agreement_term::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Agreement)\n *       in\n *         \'Agreement_term::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.sla.SlaTables%&gt;.STR_Agreement_term_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.sla.SlaTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_sla_c_c_Agreement_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.sla.SlaTables%&gt;.CLSSid_Agreement, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_sla_c_c_Agreement_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.sla.SlaTables%&gt;.STR_Agreement_term_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.sla.SlaTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Agreement_term
