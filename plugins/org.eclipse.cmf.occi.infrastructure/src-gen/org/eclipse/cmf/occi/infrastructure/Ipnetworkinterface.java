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
 * A representation of the model object '<em><b>Ipnetworkinterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceAddress <em>Occi Networkinterface Address</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceGateway <em>Occi Networkinterface Gateway</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceAllocation <em>Occi Networkinterface Allocation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getIpnetworkinterface()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IPAdressesMustBeUnique'"
 * @generated
 */
public interface Ipnetworkinterface extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Occi Networkinterface Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internet Protocol (IP) network address (e.g., 192.168.0.1/24, fc00::/7) of the link
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Networkinterface Address</em>' attribute.
	 * @see #setOcciNetworkinterfaceAddress(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getIpnetworkinterface_OcciNetworkinterfaceAddress()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.IpAddress" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Ipnetworkinterface!occiNetworkinterfaceAddress'"
	 * @generated
	 */
	String getOcciNetworkinterfaceAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceAddress <em>Occi Networkinterface Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Networkinterface Address</em>' attribute.
	 * @see #getOcciNetworkinterfaceAddress()
	 * @generated
	 */
	void setOcciNetworkinterfaceAddress(String value);

	/**
	 * Returns the value of the '<em><b>Occi Networkinterface Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internet Protocol (IP) network address (e.g., 192.168.0.1/24, fc00::/7)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Networkinterface Gateway</em>' attribute.
	 * @see #setOcciNetworkinterfaceGateway(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getIpnetworkinterface_OcciNetworkinterfaceGateway()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.IpAddress"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Ipnetworkinterface!occiNetworkinterfaceGateway'"
	 * @generated
	 */
	String getOcciNetworkinterfaceGateway();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceGateway <em>Occi Networkinterface Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Networkinterface Gateway</em>' attribute.
	 * @see #getOcciNetworkinterfaceGateway()
	 * @generated
	 */
	void setOcciNetworkinterfaceGateway(String value);

	/**
	 * Returns the value of the '<em><b>Occi Networkinterface Allocation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.infrastructure.Allocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address mechanism: dynamic e.g., uses the dynamic host configuration protocol, static e.g., uses user supplied static network configurations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Networkinterface Allocation</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.Allocation
	 * @see #setOcciNetworkinterfaceAllocation(Allocation)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getIpnetworkinterface_OcciNetworkinterfaceAllocation()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Ipnetworkinterface!occiNetworkinterfaceAllocation'"
	 * @generated
	 */
	Allocation getOcciNetworkinterfaceAllocation();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface#getOcciNetworkinterfaceAllocation <em>Occi Networkinterface Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Networkinterface Allocation</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.Allocation
	 * @see #getOcciNetworkinterfaceAllocation()
	 * @generated
	 */
	void setOcciNetworkinterfaceAllocation(Allocation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let\n *     severity : Integer[1] = \'Ipnetworkinterface::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Networkinterface)\n *       in\n *         \'Ipnetworkinterface::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.STR_Ipnetworkinterface_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Networkinterface = idResolver.getClass(&lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.CLSSid_Networkinterface, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Networkinterface).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.STR_Ipnetworkinterface_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv IPAdressesMustBeUnique:\n *   let\n *     severity : Integer[1] = \'Ipnetworkinterface::IPAdressesMustBeUnique\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = Ipnetworkinterface.allInstances()\n *         -&gt;isUnique(occiNetworkinterfaceAddress)\n *       in\n *         \'Ipnetworkinterface::IPAdressesMustBeUnique\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.STR_Ipnetworkinterface_c_c_IPAdressesMustBeUnique);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Ipnetworkinterface = idResolver.getClass(&lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.CLSSid_Ipnetworkinterface, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; allInstances = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.SET_CLSSid_Ipnetworkinterface, TYP_infrastructure_c_c_Ipnetworkinterface);\n\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSetAccumulatorValue(&lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.SET_CLSSid_Ipnetworkinterface);\n\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = allInstances.iterator();\n\t/*@NonInvalid\052/ boolean result;\n\twhile (true) {\n\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\tbreak;\n\t\t}\n\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface%&gt; _1 = (&lt;%org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface%&gt;)ITERATOR__1.next();\n\t\t/**\n\t\t * occiNetworkinterfaceAddress\n\t\t \052/\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; occiNetworkinterfaceAddress = _1.getOcciNetworkinterfaceAddress();\n\t\t//\n\t\tif (accumulator.includes(occiNetworkinterfaceAddress) == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\t\t\t// Abort after second find\n\t\t\tbreak;\n\t\t}\n\t\telse {\n\t\t\taccumulator.add(occiNetworkinterfaceAddress);\n\t\t}\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.STR_Ipnetworkinterface_c_c_IPAdressesMustBeUnique, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.infrastructure.InfrastructureTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean IPAdressesMustBeUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Ipnetworkinterface
