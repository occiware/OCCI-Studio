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
package org.eclipse.cmf.occi.infrastructure;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ipnetwork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkAddress <em>Occi Network Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkGateway <em>Occi Network Gateway</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkAllocation <em>Occi Network Allocation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getIpnetwork()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Ipnetwork extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Occi Network Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internet Protocol (IP) network address (e.g., 192.168.0.1/24, fc00::/7)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Network Address</em>' attribute.
	 * @see #setOcciNetworkAddress(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getIpnetwork_OcciNetworkAddress()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.IpAddressRange"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Ipnetwork!occiNetworkAddress'"
	 * @generated
	 */
	String getOcciNetworkAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkAddress <em>Occi Network Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Network Address</em>' attribute.
	 * @see #getOcciNetworkAddress()
	 * @generated
	 */
	void setOcciNetworkAddress(String value);

	/**
	 * Returns the value of the '<em><b>Occi Network Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internet Protocol (IP) network address (e.g., 192.168.0.1, fc00::)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Network Gateway</em>' attribute.
	 * @see #setOcciNetworkGateway(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getIpnetwork_OcciNetworkGateway()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.IpAddress"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Ipnetwork!occiNetworkGateway'"
	 * @generated
	 */
	String getOcciNetworkGateway();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkGateway <em>Occi Network Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Network Gateway</em>' attribute.
	 * @see #getOcciNetworkGateway()
	 * @generated
	 */
	void setOcciNetworkGateway(String value);

	/**
	 * Returns the value of the '<em><b>Occi Network Allocation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.infrastructure.Allocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address allocation mechanism: dynamic e.g., uses the dynamic host configuration protocol, static e.g., uses user supplied static network configurations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Network Allocation</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.Allocation
	 * @see #setOcciNetworkAllocation(Allocation)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getIpnetwork_OcciNetworkAllocation()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Ipnetwork!occiNetworkAllocation'"
	 * @generated
	 */
	Allocation getOcciNetworkAllocation();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Ipnetwork#getOcciNetworkAllocation <em>Occi Network Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Network Allocation</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.Allocation
	 * @see #getOcciNetworkAllocation()
	 * @generated
	 */
	void setOcciNetworkAllocation(Allocation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Ipnetwork::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let result : occi::Boolean[1] = self.entity.oclIsKindOf(Network)\n *       in\n *         \'Ipnetwork::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.STR_Ipnetwork_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Network_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.CLSSid_Network, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Network_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.STR_Ipnetwork_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Ipnetwork
