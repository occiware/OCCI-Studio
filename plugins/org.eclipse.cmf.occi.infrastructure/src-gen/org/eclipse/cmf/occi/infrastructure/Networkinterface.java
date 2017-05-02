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

import org.eclipse.cmf.occi.core.Link;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Networkinterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NetworkInterface Link
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceInterface <em>Occi Networkinterface Interface</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceMac <em>Occi Networkinterface Mac</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceState <em>Occi Networkinterface State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceStateMessage <em>Occi Networkinterface State Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getNetworkinterface()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='targetConstraint'"
 * @generated
 */
public interface Networkinterface extends Link {
	/**
	 * Returns the value of the '<em><b>Occi Networkinterface Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier that relates the link to the link's device interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Networkinterface Interface</em>' attribute.
	 * @see #setOcciNetworkinterfaceInterface(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getNetworkinterface_OcciNetworkinterfaceInterface()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Networkinterface!occiNetworkinterfaceInterface'"
	 * @generated
	 */
	String getOcciNetworkinterfaceInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceInterface <em>Occi Networkinterface Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Networkinterface Interface</em>' attribute.
	 * @see #getOcciNetworkinterfaceInterface()
	 * @generated
	 */
	void setOcciNetworkinterfaceInterface(String value);

	/**
	 * Returns the value of the '<em><b>Occi Networkinterface Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MAC address associated with the link's device interface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Networkinterface Mac</em>' attribute.
	 * @see #setOcciNetworkinterfaceMac(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getNetworkinterface_OcciNetworkinterfaceMac()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.Mac" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Networkinterface!occiNetworkinterfaceMac'"
	 * @generated
	 */
	String getOcciNetworkinterfaceMac();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceMac <em>Occi Networkinterface Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Networkinterface Mac</em>' attribute.
	 * @see #getOcciNetworkinterfaceMac()
	 * @generated
	 */
	void setOcciNetworkinterfaceMac(String value);

	/**
	 * Returns the value of the '<em><b>Occi Networkinterface State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current status of the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Networkinterface State</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus
	 * @see #setOcciNetworkinterfaceState(NetworkInterfaceStatus)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getNetworkinterface_OcciNetworkinterfaceState()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Networkinterface!occiNetworkinterfaceState'"
	 * @generated
	 */
	NetworkInterfaceStatus getOcciNetworkinterfaceState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceState <em>Occi Networkinterface State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Networkinterface State</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus
	 * @see #getOcciNetworkinterfaceState()
	 * @generated
	 */
	void setOcciNetworkinterfaceState(NetworkInterfaceStatus value);

	/**
	 * Returns the value of the '<em><b>Occi Networkinterface State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable explanation of the current instance state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Networkinterface State Message</em>' attribute.
	 * @see #setOcciNetworkinterfaceStateMessage(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getNetworkinterface_OcciNetworkinterfaceStateMessage()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Networkinterface!occiNetworkinterfaceStateMessage'"
	 * @generated
	 */
	String getOcciNetworkinterfaceStateMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Networkinterface#getOcciNetworkinterfaceStateMessage <em>Occi Networkinterface State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Networkinterface State Message</em>' attribute.
	 * @see #getOcciNetworkinterfaceStateMessage()
	 * @generated
	 */
	void setOcciNetworkinterfaceStateMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv targetConstraint:\n *   let\n *     severity : Integer[1] = \'Networkinterface::targetConstraint\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let result : occi::Boolean[1] = self.target.oclIsKindOf(Network)\n *       in\n *         \'Networkinterface::targetConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%>.STR_Networkinterface_c_c_targetConstraint);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_infrastructure_c_c_Network_0 = idResolver.getClass(<%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%>.CLSSid_Network, null);\n\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Resource%> target = this.getTarget();\n\tfinal /*@NonInvalid\052/ boolean result = <%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%>.INSTANCE.evaluate(executor, target, TYP_infrastructure_c_c_Network_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%>.STR_Networkinterface_c_c_targetConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, <%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean targetConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Networkinterface
