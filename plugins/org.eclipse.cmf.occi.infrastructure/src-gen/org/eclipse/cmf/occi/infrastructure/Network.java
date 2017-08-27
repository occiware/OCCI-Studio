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

import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Network Resource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkVlan <em>Occi Network Vlan</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkLabel <em>Occi Network Label</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkState <em>Occi Network State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkStateMessage <em>Occi Network State Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getNetwork()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueVlan'"
 * @generated
 */
public interface Network extends Resource {
	/**
	 * Returns the value of the '<em><b>Occi Network Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 802.1q VLAN Identifier (e.g., 343)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Network Vlan</em>' attribute.
	 * @see #setOcciNetworkVlan(Integer)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getNetwork_OcciNetworkVlan()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.Vlan"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Network!occiNetworkVlan'"
	 * @generated
	 */
	Integer getOcciNetworkVlan();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkVlan <em>Occi Network Vlan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Network Vlan</em>' attribute.
	 * @see #getOcciNetworkVlan()
	 * @generated
	 */
	void setOcciNetworkVlan(Integer value);

	/**
	 * Returns the value of the '<em><b>Occi Network Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tag based VLANs (e.g., external-dmz)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Network Label</em>' attribute.
	 * @see #setOcciNetworkLabel(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getNetwork_OcciNetworkLabel()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.Token"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Network!occiNetworkLabel'"
	 * @generated
	 */
	String getOcciNetworkLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkLabel <em>Occi Network Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Network Label</em>' attribute.
	 * @see #getOcciNetworkLabel()
	 * @generated
	 */
	void setOcciNetworkLabel(String value);

	/**
	 * Returns the value of the '<em><b>Occi Network State</b></em>' attribute.
	 * The default value is <code>"inactive"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.infrastructure.NetworkStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current state of the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Network State</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.NetworkStatus
	 * @see #setOcciNetworkState(NetworkStatus)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getNetwork_OcciNetworkState()
	 * @model default="inactive" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Network!occiNetworkState'"
	 * @generated
	 */
	NetworkStatus getOcciNetworkState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkState <em>Occi Network State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Network State</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.NetworkStatus
	 * @see #getOcciNetworkState()
	 * @generated
	 */
	void setOcciNetworkState(NetworkStatus value);

	/**
	 * Returns the value of the '<em><b>Occi Network State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable explanation of the current instance state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Network State Message</em>' attribute.
	 * @see #setOcciNetworkStateMessage(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getNetwork_OcciNetworkStateMessage()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Network!occiNetworkStateMessage'"
	 * @generated
	 */
	String getOcciNetworkStateMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Network#getOcciNetworkStateMessage <em>Occi Network State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Network State Message</em>' attribute.
	 * @see #getOcciNetworkStateMessage()
	 * @generated
	 */
	void setOcciNetworkStateMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Up a network.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Network!up()'"
	 * @generated
	 */
	void up();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Down a network.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Network!down()'"
	 * @generated
	 */
	void down();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv UniqueVlan:\n *   let severity : Integer[1] = \'Network::UniqueVlan\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = Network.allInstances()\n *         -&gt;isUnique(occiNetworkVlan)\n *       in\n *         \'Network::UniqueVlan\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.STR_Network_c_c_UniqueVlan);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Network = idResolver.getClass(&lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.CLSSid_Network, null);\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; allInstances = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.SET_CLSSid_Network, TYP_infrastructure_c_c_Network);\n\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSetAccumulatorValue(&lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.SET_CLSSid_Network);\n\t\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = allInstances.iterator();\n\t\t/*@Thrown\052/ boolean result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.infrastructure.Network%&gt; _1 = (&lt;%org.eclipse.cmf.occi.infrastructure.Network%&gt;)ITERATOR__1.next();\n\t\t\t/**\n\t\t\t * occiNetworkVlan\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.Integer%&gt; occiNetworkVlan = _1.getOcciNetworkVlan();\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_occiNetworkVlan = occiNetworkVlan == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(occiNetworkVlan);\n\t\t\t//\n\t\t\tif (accumulator.includes(BOXED_occiNetworkVlan) == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\t\t\t// Abort after second find\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\telse {\n\t\t\t\taccumulator.add(BOXED_occiNetworkVlan);\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.STR_Network_c_c_UniqueVlan, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean UniqueVlan(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Network
