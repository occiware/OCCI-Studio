/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.eclipse.cmf.occi.infrastructure/model/Infrastructure.ecore
 * using:
 *   /org.eclipse.cmf.occi.infrastructure/model/Infrastructure.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.infrastructure;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * InfrastructureTables provides the dispatch tables for the infrastructure for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class InfrastructureTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(InfrastructurePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Compute = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Compute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Ipnetwork = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Ipnetwork", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Ipnetworkinterface = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Ipnetworkinterface", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Network = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Network", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Networkinterface = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Networkinterface", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Os_tpl = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Os_tpl", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource_tpl = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Resource_tpl", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Ssh_key = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Ssh_key", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_User_data = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("User_data", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Core = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("Core", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_GHz = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("GHz", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_GiB = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("GiB", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_IpAddress = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("IpAddress", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_IpAddressRange = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("IpAddressRange", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Mac = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("Mac", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Share = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("Share", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Token = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("Token", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Vlan = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("Vlan", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_Allocation = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getEnumerationId("Allocation");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_Architecture = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getEnumerationId("Architecture");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ComputeStatus = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getEnumerationId("ComputeStatus");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_NetworkInterfaceStatus = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getEnumerationId("NetworkInterfaceStatus");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_NetworkStatus = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getEnumerationId("NetworkStatus");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_StorageLinkStatus = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getEnumerationId("StorageLinkStatus");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_StorageStatus = org.eclipse.cmf.occi.infrastructure.InfrastructureTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getEnumerationId("StorageStatus");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Ipnetwork_c_c_appliesConstraint = "Ipnetwork::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Ipnetworkinterface_c_c_IPAdressesMustBeUnique = "Ipnetworkinterface::IPAdressesMustBeUnique";
	public static final /*@NonInvalid*/ java.lang.String STR_Ipnetworkinterface_c_c_appliesConstraint = "Ipnetworkinterface::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Network_c_c_UniqueVlan = "Network::UniqueVlan";
	public static final /*@NonInvalid*/ java.lang.String STR_Networkinterface_c_c_targetConstraint = "Networkinterface::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Os_tpl_c_c_appliesConstraint = "Os_tpl::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Resource_tpl_c_c_appliesConstraint = "Resource_tpl::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Ssh_key_c_c_appliesConstraint = "Ssh_key::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_User_data_c_c_appliesConstraint = "User_data::appliesConstraint";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Ipnetworkinterface = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.eclipse.cmf.occi.infrastructure.InfrastructureTables.CLSSid_Ipnetworkinterface);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Network = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.eclipse.cmf.occi.infrastructure.InfrastructureTables.CLSSid_Network);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			InfrastructureTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumeration _Allocation = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.ALLOCATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Architecture = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.ARCHITECTURE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Compute = new EcoreExecutorType(InfrastructurePackage.Literals.COMPUTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ComputeStatus = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.COMPUTE_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Core = new EcoreExecutorType("Core", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _GHz = new EcoreExecutorType("GHz", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _GiB = new EcoreExecutorType("GiB", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _IpAddress = new EcoreExecutorType("IpAddress", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _IpAddressRange = new EcoreExecutorType("IpAddressRange", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ipnetwork = new EcoreExecutorType(InfrastructurePackage.Literals.IPNETWORK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ipnetworkinterface = new EcoreExecutorType(InfrastructurePackage.Literals.IPNETWORKINTERFACE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mac = new EcoreExecutorType("Mac", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Network = new EcoreExecutorType(InfrastructurePackage.Literals.NETWORK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _NetworkInterfaceStatus = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.NETWORK_INTERFACE_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _NetworkStatus = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.NETWORK_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Networkinterface = new EcoreExecutorType(InfrastructurePackage.Literals.NETWORKINTERFACE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Os_tpl = new EcoreExecutorType(InfrastructurePackage.Literals.OS_TPL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Resource_tpl = new EcoreExecutorType(InfrastructurePackage.Literals.RESOURCE_TPL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _RestartMethod = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.RESTART_METHOD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _SaveMethod = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.SAVE_METHOD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Share = new EcoreExecutorType("Share", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ssh_key = new EcoreExecutorType(InfrastructurePackage.Literals.SSH_KEY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _StopMethod = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.STOP_METHOD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Storage = new EcoreExecutorType(InfrastructurePackage.Literals.STORAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _StorageLinkStatus = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.STORAGE_LINK_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _StorageStatus = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.STORAGE_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Storagelink = new EcoreExecutorType(InfrastructurePackage.Literals.STORAGELINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _SuspendMethod = new EcoreExecutorEnumeration(InfrastructurePackage.Literals.SUSPEND_METHOD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Token = new EcoreExecutorType("Token", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _User_data = new EcoreExecutorType(InfrastructurePackage.Literals.USER_DATA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vlan = new EcoreExecutorType("Vlan", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Allocation,
			_Architecture,
			_Compute,
			_ComputeStatus,
			_Core,
			_GHz,
			_GiB,
			_IpAddress,
			_IpAddressRange,
			_Ipnetwork,
			_Ipnetworkinterface,
			_Mac,
			_Network,
			_NetworkInterfaceStatus,
			_NetworkStatus,
			_Networkinterface,
			_Os_tpl,
			_Resource_tpl,
			_RestartMethod,
			_SaveMethod,
			_Share,
			_Ssh_key,
			_StopMethod,
			_Storage,
			_StorageLinkStatus,
			_StorageStatus,
			_Storagelink,
			_SuspendMethod,
			_Token,
			_User_data,
			_Vlan
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Allocation__Allocation = new ExecutorFragment(Types._Allocation, InfrastructureTables.Types._Allocation);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__OclAny = new ExecutorFragment(Types._Allocation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__OclElement = new ExecutorFragment(Types._Allocation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__OclEnumeration = new ExecutorFragment(Types._Allocation, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Allocation__OclType = new ExecutorFragment(Types._Allocation, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Architecture__Architecture = new ExecutorFragment(Types._Architecture, InfrastructureTables.Types._Architecture);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__OclAny = new ExecutorFragment(Types._Architecture, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__OclElement = new ExecutorFragment(Types._Architecture, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__OclEnumeration = new ExecutorFragment(Types._Architecture, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Architecture__OclType = new ExecutorFragment(Types._Architecture, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Compute__Compute = new ExecutorFragment(Types._Compute, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Compute__Entity = new ExecutorFragment(Types._Compute, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Compute__OclAny = new ExecutorFragment(Types._Compute, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Compute__OclElement = new ExecutorFragment(Types._Compute, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Compute__Resource = new ExecutorFragment(Types._Compute, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__ComputeStatus = new ExecutorFragment(Types._ComputeStatus, InfrastructureTables.Types._ComputeStatus);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__OclAny = new ExecutorFragment(Types._ComputeStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__OclElement = new ExecutorFragment(Types._ComputeStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__OclEnumeration = new ExecutorFragment(Types._ComputeStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ComputeStatus__OclType = new ExecutorFragment(Types._ComputeStatus, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Core__Core = new ExecutorFragment(Types._Core, InfrastructureTables.Types._Core);
		private static final /*@NonNull*/ ExecutorFragment _Core__OclAny = new ExecutorFragment(Types._Core, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _GHz__GHz = new ExecutorFragment(Types._GHz, InfrastructureTables.Types._GHz);
		private static final /*@NonNull*/ ExecutorFragment _GHz__OclAny = new ExecutorFragment(Types._GHz, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _GiB__GiB = new ExecutorFragment(Types._GiB, InfrastructureTables.Types._GiB);
		private static final /*@NonNull*/ ExecutorFragment _GiB__OclAny = new ExecutorFragment(Types._GiB, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _IpAddress__IpAddress = new ExecutorFragment(Types._IpAddress, InfrastructureTables.Types._IpAddress);
		private static final /*@NonNull*/ ExecutorFragment _IpAddress__OclAny = new ExecutorFragment(Types._IpAddress, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _IpAddressRange__IpAddressRange = new ExecutorFragment(Types._IpAddressRange, InfrastructureTables.Types._IpAddressRange);
		private static final /*@NonNull*/ ExecutorFragment _IpAddressRange__OclAny = new ExecutorFragment(Types._IpAddressRange, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Ipnetwork__Ipnetwork = new ExecutorFragment(Types._Ipnetwork, InfrastructureTables.Types._Ipnetwork);
		private static final /*@NonNull*/ ExecutorFragment _Ipnetwork__MixinBase = new ExecutorFragment(Types._Ipnetwork, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ipnetwork__OclAny = new ExecutorFragment(Types._Ipnetwork, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ipnetwork__OclElement = new ExecutorFragment(Types._Ipnetwork, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Ipnetworkinterface__Ipnetworkinterface = new ExecutorFragment(Types._Ipnetworkinterface, InfrastructureTables.Types._Ipnetworkinterface);
		private static final /*@NonNull*/ ExecutorFragment _Ipnetworkinterface__MixinBase = new ExecutorFragment(Types._Ipnetworkinterface, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ipnetworkinterface__OclAny = new ExecutorFragment(Types._Ipnetworkinterface, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ipnetworkinterface__OclElement = new ExecutorFragment(Types._Ipnetworkinterface, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Mac__Mac = new ExecutorFragment(Types._Mac, InfrastructureTables.Types._Mac);
		private static final /*@NonNull*/ ExecutorFragment _Mac__OclAny = new ExecutorFragment(Types._Mac, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Network__Entity = new ExecutorFragment(Types._Network, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Network__Network = new ExecutorFragment(Types._Network, InfrastructureTables.Types._Network);
		private static final /*@NonNull*/ ExecutorFragment _Network__OclAny = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Network__OclElement = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Network__Resource = new ExecutorFragment(Types._Network, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__NetworkInterfaceStatus = new ExecutorFragment(Types._NetworkInterfaceStatus, InfrastructureTables.Types._NetworkInterfaceStatus);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__OclAny = new ExecutorFragment(Types._NetworkInterfaceStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__OclElement = new ExecutorFragment(Types._NetworkInterfaceStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__OclEnumeration = new ExecutorFragment(Types._NetworkInterfaceStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _NetworkInterfaceStatus__OclType = new ExecutorFragment(Types._NetworkInterfaceStatus, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__NetworkStatus = new ExecutorFragment(Types._NetworkStatus, InfrastructureTables.Types._NetworkStatus);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__OclAny = new ExecutorFragment(Types._NetworkStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__OclElement = new ExecutorFragment(Types._NetworkStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__OclEnumeration = new ExecutorFragment(Types._NetworkStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _NetworkStatus__OclType = new ExecutorFragment(Types._NetworkStatus, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Networkinterface__Entity = new ExecutorFragment(Types._Networkinterface, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Networkinterface__Link = new ExecutorFragment(Types._Networkinterface, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Networkinterface__Networkinterface = new ExecutorFragment(Types._Networkinterface, InfrastructureTables.Types._Networkinterface);
		private static final /*@NonNull*/ ExecutorFragment _Networkinterface__OclAny = new ExecutorFragment(Types._Networkinterface, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Networkinterface__OclElement = new ExecutorFragment(Types._Networkinterface, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Os_tpl__MixinBase = new ExecutorFragment(Types._Os_tpl, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Os_tpl__OclAny = new ExecutorFragment(Types._Os_tpl, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Os_tpl__OclElement = new ExecutorFragment(Types._Os_tpl, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Os_tpl__Os_tpl = new ExecutorFragment(Types._Os_tpl, InfrastructureTables.Types._Os_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Resource_tpl__MixinBase = new ExecutorFragment(Types._Resource_tpl, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Resource_tpl__OclAny = new ExecutorFragment(Types._Resource_tpl, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Resource_tpl__OclElement = new ExecutorFragment(Types._Resource_tpl, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Resource_tpl__Resource_tpl = new ExecutorFragment(Types._Resource_tpl, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__OclAny = new ExecutorFragment(Types._RestartMethod, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__OclElement = new ExecutorFragment(Types._RestartMethod, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__OclEnumeration = new ExecutorFragment(Types._RestartMethod, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__OclType = new ExecutorFragment(Types._RestartMethod, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _RestartMethod__RestartMethod = new ExecutorFragment(Types._RestartMethod, InfrastructureTables.Types._RestartMethod);

		private static final /*@NonNull*/ ExecutorFragment _SaveMethod__OclAny = new ExecutorFragment(Types._SaveMethod, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SaveMethod__OclElement = new ExecutorFragment(Types._SaveMethod, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SaveMethod__OclEnumeration = new ExecutorFragment(Types._SaveMethod, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _SaveMethod__OclType = new ExecutorFragment(Types._SaveMethod, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _SaveMethod__SaveMethod = new ExecutorFragment(Types._SaveMethod, InfrastructureTables.Types._SaveMethod);

		private static final /*@NonNull*/ ExecutorFragment _Share__OclAny = new ExecutorFragment(Types._Share, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Share__Share = new ExecutorFragment(Types._Share, InfrastructureTables.Types._Share);

		private static final /*@NonNull*/ ExecutorFragment _Ssh_key__MixinBase = new ExecutorFragment(Types._Ssh_key, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ssh_key__OclAny = new ExecutorFragment(Types._Ssh_key, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ssh_key__OclElement = new ExecutorFragment(Types._Ssh_key, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ssh_key__Ssh_key = new ExecutorFragment(Types._Ssh_key, InfrastructureTables.Types._Ssh_key);

		private static final /*@NonNull*/ ExecutorFragment _StopMethod__OclAny = new ExecutorFragment(Types._StopMethod, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__OclElement = new ExecutorFragment(Types._StopMethod, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__OclEnumeration = new ExecutorFragment(Types._StopMethod, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__OclType = new ExecutorFragment(Types._StopMethod, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _StopMethod__StopMethod = new ExecutorFragment(Types._StopMethod, InfrastructureTables.Types._StopMethod);

		private static final /*@NonNull*/ ExecutorFragment _Storage__Entity = new ExecutorFragment(Types._Storage, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Storage__OclAny = new ExecutorFragment(Types._Storage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Storage__OclElement = new ExecutorFragment(Types._Storage, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Storage__Resource = new ExecutorFragment(Types._Storage, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Storage__Storage = new ExecutorFragment(Types._Storage, InfrastructureTables.Types._Storage);

		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__OclAny = new ExecutorFragment(Types._StorageLinkStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__OclElement = new ExecutorFragment(Types._StorageLinkStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__OclEnumeration = new ExecutorFragment(Types._StorageLinkStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__OclType = new ExecutorFragment(Types._StorageLinkStatus, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _StorageLinkStatus__StorageLinkStatus = new ExecutorFragment(Types._StorageLinkStatus, InfrastructureTables.Types._StorageLinkStatus);

		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__OclAny = new ExecutorFragment(Types._StorageStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__OclElement = new ExecutorFragment(Types._StorageStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__OclEnumeration = new ExecutorFragment(Types._StorageStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__OclType = new ExecutorFragment(Types._StorageStatus, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _StorageStatus__StorageStatus = new ExecutorFragment(Types._StorageStatus, InfrastructureTables.Types._StorageStatus);

		private static final /*@NonNull*/ ExecutorFragment _Storagelink__Entity = new ExecutorFragment(Types._Storagelink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Storagelink__Link = new ExecutorFragment(Types._Storagelink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Storagelink__OclAny = new ExecutorFragment(Types._Storagelink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Storagelink__OclElement = new ExecutorFragment(Types._Storagelink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Storagelink__Storagelink = new ExecutorFragment(Types._Storagelink, InfrastructureTables.Types._Storagelink);

		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__OclAny = new ExecutorFragment(Types._SuspendMethod, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__OclElement = new ExecutorFragment(Types._SuspendMethod, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__OclEnumeration = new ExecutorFragment(Types._SuspendMethod, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__OclType = new ExecutorFragment(Types._SuspendMethod, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _SuspendMethod__SuspendMethod = new ExecutorFragment(Types._SuspendMethod, InfrastructureTables.Types._SuspendMethod);

		private static final /*@NonNull*/ ExecutorFragment _Token__OclAny = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Token__Token = new ExecutorFragment(Types._Token, InfrastructureTables.Types._Token);

		private static final /*@NonNull*/ ExecutorFragment _User_data__MixinBase = new ExecutorFragment(Types._User_data, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _User_data__OclAny = new ExecutorFragment(Types._User_data, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _User_data__OclElement = new ExecutorFragment(Types._User_data, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _User_data__User_data = new ExecutorFragment(Types._User_data, InfrastructureTables.Types._User_data);

		private static final /*@NonNull*/ ExecutorFragment _Vlan__OclAny = new ExecutorFragment(Types._Vlan, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vlan__Vlan = new ExecutorFragment(Types._Vlan, InfrastructureTables.Types._Vlan);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final /*@NonNull*/ ParameterTypes _RestartMethod = TypeUtil.createParameterTypes(InfrastructureTables.Types._RestartMethod);
		public static final /*@NonNull*/ ParameterTypes _SaveMethod___String = TypeUtil.createParameterTypes(InfrastructureTables.Types._SaveMethod, OCCITables.Types._String);
		public static final /*@NonNull*/ ParameterTypes _StopMethod = TypeUtil.createParameterTypes(InfrastructureTables.Types._StopMethod);
		public static final /*@NonNull*/ ParameterTypes _SuspendMethod = TypeUtil.createParameterTypes(InfrastructureTables.Types._SuspendMethod);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Compute__restart = new ExecutorOperation("restart", Parameters._RestartMethod, Types._Compute,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Compute__save = new ExecutorOperation("save", Parameters._SaveMethod___String, Types._Compute,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Compute__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Compute,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Compute__stop = new ExecutorOperation("stop", Parameters._StopMethod, Types._Compute,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Compute__suspend = new ExecutorOperation("suspend", Parameters._SuspendMethod, Types._Compute,
			4, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Network__down = new ExecutorOperation("down", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Network,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Network__up = new ExecutorOperation("up", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Network,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Storage__offline = new ExecutorOperation("offline", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Storage,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Storage__online = new ExecutorOperation("online", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Storage,
			1, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _Compute__occiComputeArchitecture = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_ARCHITECTURE, Types._Compute, 0);
		public static final /*@NonNull*/ ExecutorProperty _Compute__occiComputeCores = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_CORES, Types._Compute, 1);
		public static final /*@NonNull*/ ExecutorProperty _Compute__occiComputeHostname = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_HOSTNAME, Types._Compute, 2);
		public static final /*@NonNull*/ ExecutorProperty _Compute__occiComputeMemory = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_MEMORY, Types._Compute, 3);
		public static final /*@NonNull*/ ExecutorProperty _Compute__occiComputeShare = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_SHARE, Types._Compute, 4);
		public static final /*@NonNull*/ ExecutorProperty _Compute__occiComputeSpeed = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_SPEED, Types._Compute, 5);
		public static final /*@NonNull*/ ExecutorProperty _Compute__occiComputeState = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_STATE, Types._Compute, 6);
		public static final /*@NonNull*/ ExecutorProperty _Compute__occiComputeStateMessage = new EcoreExecutorProperty(InfrastructurePackage.Literals.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE, Types._Compute, 7);

		public static final /*@NonNull*/ ExecutorProperty _Ipnetwork__occiNetworkAddress = new EcoreExecutorProperty(InfrastructurePackage.Literals.IPNETWORK__OCCI_NETWORK_ADDRESS, Types._Ipnetwork, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ipnetwork__occiNetworkAllocation = new EcoreExecutorProperty(InfrastructurePackage.Literals.IPNETWORK__OCCI_NETWORK_ALLOCATION, Types._Ipnetwork, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ipnetwork__occiNetworkGateway = new EcoreExecutorProperty(InfrastructurePackage.Literals.IPNETWORK__OCCI_NETWORK_GATEWAY, Types._Ipnetwork, 2);

		public static final /*@NonNull*/ ExecutorProperty _Ipnetworkinterface__occiNetworkinterfaceAddress = new EcoreExecutorProperty(InfrastructurePackage.Literals.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ADDRESS, Types._Ipnetworkinterface, 0);
		public static final /*@NonNull*/ ExecutorProperty _Ipnetworkinterface__occiNetworkinterfaceAllocation = new EcoreExecutorProperty(InfrastructurePackage.Literals.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ALLOCATION, Types._Ipnetworkinterface, 1);
		public static final /*@NonNull*/ ExecutorProperty _Ipnetworkinterface__occiNetworkinterfaceGateway = new EcoreExecutorProperty(InfrastructurePackage.Literals.IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_GATEWAY, Types._Ipnetworkinterface, 2);

		public static final /*@NonNull*/ ExecutorProperty _Network__occiNetworkLabel = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORK__OCCI_NETWORK_LABEL, Types._Network, 0);
		public static final /*@NonNull*/ ExecutorProperty _Network__occiNetworkState = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORK__OCCI_NETWORK_STATE, Types._Network, 1);
		public static final /*@NonNull*/ ExecutorProperty _Network__occiNetworkStateMessage = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORK__OCCI_NETWORK_STATE_MESSAGE, Types._Network, 2);
		public static final /*@NonNull*/ ExecutorProperty _Network__occiNetworkVlan = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORK__OCCI_NETWORK_VLAN, Types._Network, 3);

		public static final /*@NonNull*/ ExecutorProperty _Networkinterface__occiNetworkinterfaceInterface = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE, Types._Networkinterface, 0);
		public static final /*@NonNull*/ ExecutorProperty _Networkinterface__occiNetworkinterfaceMac = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC, Types._Networkinterface, 1);
		public static final /*@NonNull*/ ExecutorProperty _Networkinterface__occiNetworkinterfaceState = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE, Types._Networkinterface, 2);
		public static final /*@NonNull*/ ExecutorProperty _Networkinterface__occiNetworkinterfaceStateMessage = new EcoreExecutorProperty(InfrastructurePackage.Literals.NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE, Types._Networkinterface, 3);

		public static final /*@NonNull*/ ExecutorProperty _Ssh_key__occiCredentialsSshPublickey = new EcoreExecutorProperty(InfrastructurePackage.Literals.SSH_KEY__OCCI_CREDENTIALS_SSH_PUBLICKEY, Types._Ssh_key, 0);

		public static final /*@NonNull*/ ExecutorProperty _Storage__occiStorageSize = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGE__OCCI_STORAGE_SIZE, Types._Storage, 0);
		public static final /*@NonNull*/ ExecutorProperty _Storage__occiStorageState = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGE__OCCI_STORAGE_STATE, Types._Storage, 1);
		public static final /*@NonNull*/ ExecutorProperty _Storage__occiStorageStateMessage = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGE__OCCI_STORAGE_STATE_MESSAGE, Types._Storage, 2);

		public static final /*@NonNull*/ ExecutorProperty _Storagelink__occiStoragelinkDeviceid = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGELINK__OCCI_STORAGELINK_DEVICEID, Types._Storagelink, 0);
		public static final /*@NonNull*/ ExecutorProperty _Storagelink__occiStoragelinkMountpoint = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGELINK__OCCI_STORAGELINK_MOUNTPOINT, Types._Storagelink, 1);
		public static final /*@NonNull*/ ExecutorProperty _Storagelink__occiStoragelinkState = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGELINK__OCCI_STORAGELINK_STATE, Types._Storagelink, 2);
		public static final /*@NonNull*/ ExecutorProperty _Storagelink__occiStoragelinkStateMessage = new EcoreExecutorProperty(InfrastructurePackage.Literals.STORAGELINK__OCCI_STORAGELINK_STATE_MESSAGE, Types._Storagelink, 3);

		public static final /*@NonNull*/ ExecutorProperty _User_data__occiComputeUserdata = new EcoreExecutorProperty(InfrastructurePackage.Literals.USER_DATA__OCCI_COMPUTE_USERDATA, Types._User_data, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Allocation =
			{
				Fragments._Allocation__OclAny /* 0 */,
				Fragments._Allocation__OclElement /* 1 */,
				Fragments._Allocation__OclType /* 2 */,
				Fragments._Allocation__OclEnumeration /* 3 */,
				Fragments._Allocation__Allocation /* 4 */
			};
		private static final int /*@NonNull*/ [] __Allocation = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Architecture =
			{
				Fragments._Architecture__OclAny /* 0 */,
				Fragments._Architecture__OclElement /* 1 */,
				Fragments._Architecture__OclType /* 2 */,
				Fragments._Architecture__OclEnumeration /* 3 */,
				Fragments._Architecture__Architecture /* 4 */
			};
		private static final int /*@NonNull*/ [] __Architecture = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Compute =
			{
				Fragments._Compute__OclAny /* 0 */,
				Fragments._Compute__OclElement /* 1 */,
				Fragments._Compute__Entity /* 2 */,
				Fragments._Compute__Resource /* 3 */,
				Fragments._Compute__Compute /* 4 */
			};
		private static final int /*@NonNull*/ [] __Compute = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ComputeStatus =
			{
				Fragments._ComputeStatus__OclAny /* 0 */,
				Fragments._ComputeStatus__OclElement /* 1 */,
				Fragments._ComputeStatus__OclType /* 2 */,
				Fragments._ComputeStatus__OclEnumeration /* 3 */,
				Fragments._ComputeStatus__ComputeStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __ComputeStatus = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Core =
			{
				Fragments._Core__OclAny /* 0 */,
				Fragments._Core__Core /* 1 */
			};
		private static final int /*@NonNull*/ [] __Core = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _GHz =
			{
				Fragments._GHz__OclAny /* 0 */,
				Fragments._GHz__GHz /* 1 */
			};
		private static final int /*@NonNull*/ [] __GHz = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _GiB =
			{
				Fragments._GiB__OclAny /* 0 */,
				Fragments._GiB__GiB /* 1 */
			};
		private static final int /*@NonNull*/ [] __GiB = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _IpAddress =
			{
				Fragments._IpAddress__OclAny /* 0 */,
				Fragments._IpAddress__IpAddress /* 1 */
			};
		private static final int /*@NonNull*/ [] __IpAddress = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _IpAddressRange =
			{
				Fragments._IpAddressRange__OclAny /* 0 */,
				Fragments._IpAddressRange__IpAddressRange /* 1 */
			};
		private static final int /*@NonNull*/ [] __IpAddressRange = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ipnetwork =
			{
				Fragments._Ipnetwork__OclAny /* 0 */,
				Fragments._Ipnetwork__OclElement /* 1 */,
				Fragments._Ipnetwork__MixinBase /* 2 */,
				Fragments._Ipnetwork__Ipnetwork /* 3 */
			};
		private static final int /*@NonNull*/ [] __Ipnetwork = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ipnetworkinterface =
			{
				Fragments._Ipnetworkinterface__OclAny /* 0 */,
				Fragments._Ipnetworkinterface__OclElement /* 1 */,
				Fragments._Ipnetworkinterface__MixinBase /* 2 */,
				Fragments._Ipnetworkinterface__Ipnetworkinterface /* 3 */
			};
		private static final int /*@NonNull*/ [] __Ipnetworkinterface = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mac =
			{
				Fragments._Mac__OclAny /* 0 */,
				Fragments._Mac__Mac /* 1 */
			};
		private static final int /*@NonNull*/ [] __Mac = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Network =
			{
				Fragments._Network__OclAny /* 0 */,
				Fragments._Network__OclElement /* 1 */,
				Fragments._Network__Entity /* 2 */,
				Fragments._Network__Resource /* 3 */,
				Fragments._Network__Network /* 4 */
			};
		private static final int /*@NonNull*/ [] __Network = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NetworkInterfaceStatus =
			{
				Fragments._NetworkInterfaceStatus__OclAny /* 0 */,
				Fragments._NetworkInterfaceStatus__OclElement /* 1 */,
				Fragments._NetworkInterfaceStatus__OclType /* 2 */,
				Fragments._NetworkInterfaceStatus__OclEnumeration /* 3 */,
				Fragments._NetworkInterfaceStatus__NetworkInterfaceStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __NetworkInterfaceStatus = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NetworkStatus =
			{
				Fragments._NetworkStatus__OclAny /* 0 */,
				Fragments._NetworkStatus__OclElement /* 1 */,
				Fragments._NetworkStatus__OclType /* 2 */,
				Fragments._NetworkStatus__OclEnumeration /* 3 */,
				Fragments._NetworkStatus__NetworkStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __NetworkStatus = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Networkinterface =
			{
				Fragments._Networkinterface__OclAny /* 0 */,
				Fragments._Networkinterface__OclElement /* 1 */,
				Fragments._Networkinterface__Entity /* 2 */,
				Fragments._Networkinterface__Link /* 3 */,
				Fragments._Networkinterface__Networkinterface /* 4 */
			};
		private static final int /*@NonNull*/ [] __Networkinterface = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Os_tpl =
			{
				Fragments._Os_tpl__OclAny /* 0 */,
				Fragments._Os_tpl__OclElement /* 1 */,
				Fragments._Os_tpl__MixinBase /* 2 */,
				Fragments._Os_tpl__Os_tpl /* 3 */
			};
		private static final int /*@NonNull*/ [] __Os_tpl = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Resource_tpl =
			{
				Fragments._Resource_tpl__OclAny /* 0 */,
				Fragments._Resource_tpl__OclElement /* 1 */,
				Fragments._Resource_tpl__MixinBase /* 2 */,
				Fragments._Resource_tpl__Resource_tpl /* 3 */
			};
		private static final int /*@NonNull*/ [] __Resource_tpl = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RestartMethod =
			{
				Fragments._RestartMethod__OclAny /* 0 */,
				Fragments._RestartMethod__OclElement /* 1 */,
				Fragments._RestartMethod__OclType /* 2 */,
				Fragments._RestartMethod__OclEnumeration /* 3 */,
				Fragments._RestartMethod__RestartMethod /* 4 */
			};
		private static final int /*@NonNull*/ [] __RestartMethod = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SaveMethod =
			{
				Fragments._SaveMethod__OclAny /* 0 */,
				Fragments._SaveMethod__OclElement /* 1 */,
				Fragments._SaveMethod__OclType /* 2 */,
				Fragments._SaveMethod__OclEnumeration /* 3 */,
				Fragments._SaveMethod__SaveMethod /* 4 */
			};
		private static final int /*@NonNull*/ [] __SaveMethod = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Share =
			{
				Fragments._Share__OclAny /* 0 */,
				Fragments._Share__Share /* 1 */
			};
		private static final int /*@NonNull*/ [] __Share = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ssh_key =
			{
				Fragments._Ssh_key__OclAny /* 0 */,
				Fragments._Ssh_key__OclElement /* 1 */,
				Fragments._Ssh_key__MixinBase /* 2 */,
				Fragments._Ssh_key__Ssh_key /* 3 */
			};
		private static final int /*@NonNull*/ [] __Ssh_key = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _StopMethod =
			{
				Fragments._StopMethod__OclAny /* 0 */,
				Fragments._StopMethod__OclElement /* 1 */,
				Fragments._StopMethod__OclType /* 2 */,
				Fragments._StopMethod__OclEnumeration /* 3 */,
				Fragments._StopMethod__StopMethod /* 4 */
			};
		private static final int /*@NonNull*/ [] __StopMethod = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Storage =
			{
				Fragments._Storage__OclAny /* 0 */,
				Fragments._Storage__OclElement /* 1 */,
				Fragments._Storage__Entity /* 2 */,
				Fragments._Storage__Resource /* 3 */,
				Fragments._Storage__Storage /* 4 */
			};
		private static final int /*@NonNull*/ [] __Storage = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _StorageLinkStatus =
			{
				Fragments._StorageLinkStatus__OclAny /* 0 */,
				Fragments._StorageLinkStatus__OclElement /* 1 */,
				Fragments._StorageLinkStatus__OclType /* 2 */,
				Fragments._StorageLinkStatus__OclEnumeration /* 3 */,
				Fragments._StorageLinkStatus__StorageLinkStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __StorageLinkStatus = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _StorageStatus =
			{
				Fragments._StorageStatus__OclAny /* 0 */,
				Fragments._StorageStatus__OclElement /* 1 */,
				Fragments._StorageStatus__OclType /* 2 */,
				Fragments._StorageStatus__OclEnumeration /* 3 */,
				Fragments._StorageStatus__StorageStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __StorageStatus = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Storagelink =
			{
				Fragments._Storagelink__OclAny /* 0 */,
				Fragments._Storagelink__OclElement /* 1 */,
				Fragments._Storagelink__Entity /* 2 */,
				Fragments._Storagelink__Link /* 3 */,
				Fragments._Storagelink__Storagelink /* 4 */
			};
		private static final int /*@NonNull*/ [] __Storagelink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _SuspendMethod =
			{
				Fragments._SuspendMethod__OclAny /* 0 */,
				Fragments._SuspendMethod__OclElement /* 1 */,
				Fragments._SuspendMethod__OclType /* 2 */,
				Fragments._SuspendMethod__OclEnumeration /* 3 */,
				Fragments._SuspendMethod__SuspendMethod /* 4 */
			};
		private static final int /*@NonNull*/ [] __SuspendMethod = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Token =
			{
				Fragments._Token__OclAny /* 0 */,
				Fragments._Token__Token /* 1 */
			};
		private static final int /*@NonNull*/ [] __Token = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _User_data =
			{
				Fragments._User_data__OclAny /* 0 */,
				Fragments._User_data__OclElement /* 1 */,
				Fragments._User_data__MixinBase /* 2 */,
				Fragments._User_data__User_data /* 3 */
			};
		private static final int /*@NonNull*/ [] __User_data = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vlan =
			{
				Fragments._Vlan__OclAny /* 0 */,
				Fragments._Vlan__Vlan /* 1 */
			};
		private static final int /*@NonNull*/ [] __Vlan = { 1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Allocation.initFragments(_Allocation, __Allocation);
			Types._Architecture.initFragments(_Architecture, __Architecture);
			Types._Compute.initFragments(_Compute, __Compute);
			Types._ComputeStatus.initFragments(_ComputeStatus, __ComputeStatus);
			Types._Core.initFragments(_Core, __Core);
			Types._GHz.initFragments(_GHz, __GHz);
			Types._GiB.initFragments(_GiB, __GiB);
			Types._IpAddress.initFragments(_IpAddress, __IpAddress);
			Types._IpAddressRange.initFragments(_IpAddressRange, __IpAddressRange);
			Types._Ipnetwork.initFragments(_Ipnetwork, __Ipnetwork);
			Types._Ipnetworkinterface.initFragments(_Ipnetworkinterface, __Ipnetworkinterface);
			Types._Mac.initFragments(_Mac, __Mac);
			Types._Network.initFragments(_Network, __Network);
			Types._NetworkInterfaceStatus.initFragments(_NetworkInterfaceStatus, __NetworkInterfaceStatus);
			Types._NetworkStatus.initFragments(_NetworkStatus, __NetworkStatus);
			Types._Networkinterface.initFragments(_Networkinterface, __Networkinterface);
			Types._Os_tpl.initFragments(_Os_tpl, __Os_tpl);
			Types._Resource_tpl.initFragments(_Resource_tpl, __Resource_tpl);
			Types._RestartMethod.initFragments(_RestartMethod, __RestartMethod);
			Types._SaveMethod.initFragments(_SaveMethod, __SaveMethod);
			Types._Share.initFragments(_Share, __Share);
			Types._Ssh_key.initFragments(_Ssh_key, __Ssh_key);
			Types._StopMethod.initFragments(_StopMethod, __StopMethod);
			Types._Storage.initFragments(_Storage, __Storage);
			Types._StorageLinkStatus.initFragments(_StorageLinkStatus, __StorageLinkStatus);
			Types._StorageStatus.initFragments(_StorageStatus, __StorageStatus);
			Types._Storagelink.initFragments(_Storagelink, __Storagelink);
			Types._SuspendMethod.initFragments(_SuspendMethod, __SuspendMethod);
			Types._Token.initFragments(_Token, __Token);
			Types._User_data.initFragments(_User_data, __User_data);
			Types._Vlan.initFragments(_Vlan, __Vlan);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Allocation__Allocation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Allocation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Allocation__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Allocation__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Allocation__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Architecture__Architecture = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Architecture__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Architecture__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Architecture__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Architecture__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Compute__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Compute__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Compute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Compute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Compute__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComputeStatus__ComputeStatus = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComputeStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComputeStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComputeStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ComputeStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Core__Core = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Core__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GHz__GHz = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GHz__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GiB__GiB = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GiB__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IpAddress__IpAddress = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IpAddress__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IpAddressRange__IpAddressRange = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _IpAddressRange__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ipnetwork__Ipnetwork = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ipnetwork__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ipnetwork__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ipnetwork__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ipnetworkinterface__Ipnetworkinterface = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ipnetworkinterface__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ipnetworkinterface__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ipnetworkinterface__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mac__Mac = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mac__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__Network = {
			InfrastructureTables.Operations._Network__down /* down() */,
			InfrastructureTables.Operations._Network__up /* up() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NetworkInterfaceStatus__NetworkInterfaceStatus = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NetworkInterfaceStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NetworkInterfaceStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NetworkInterfaceStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NetworkInterfaceStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NetworkStatus__NetworkStatus = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NetworkStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NetworkStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NetworkStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NetworkStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkinterface__Networkinterface = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkinterface__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkinterface__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkinterface__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkinterface__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Os_tpl__Os_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Os_tpl__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Os_tpl__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Os_tpl__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource_tpl__Resource_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource_tpl__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource_tpl__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource_tpl__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RestartMethod__RestartMethod = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RestartMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RestartMethod__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RestartMethod__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RestartMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SaveMethod__SaveMethod = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SaveMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SaveMethod__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SaveMethod__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SaveMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Share__Share = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Share__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ssh_key__Ssh_key = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ssh_key__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ssh_key__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ssh_key__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StopMethod__StopMethod = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StopMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StopMethod__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StopMethod__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StopMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storage__Storage = {
			InfrastructureTables.Operations._Storage__offline /* offline() */,
			InfrastructureTables.Operations._Storage__online /* online() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storage__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storage__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StorageLinkStatus__StorageLinkStatus = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StorageLinkStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StorageLinkStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StorageLinkStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StorageLinkStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StorageStatus__StorageStatus = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StorageStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StorageStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StorageStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StorageStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagelink__Storagelink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagelink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagelink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagelink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagelink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuspendMethod__SuspendMethod = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuspendMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuspendMethod__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuspendMethod__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _SuspendMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Token__Token = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Token__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _User_data__User_data = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _User_data__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _User_data__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _User_data__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vlan__Vlan = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vlan__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Allocation__Allocation.initOperations(_Allocation__Allocation);
			Fragments._Allocation__OclAny.initOperations(_Allocation__OclAny);
			Fragments._Allocation__OclElement.initOperations(_Allocation__OclElement);
			Fragments._Allocation__OclEnumeration.initOperations(_Allocation__OclEnumeration);
			Fragments._Allocation__OclType.initOperations(_Allocation__OclType);

			Fragments._Architecture__Architecture.initOperations(_Architecture__Architecture);
			Fragments._Architecture__OclAny.initOperations(_Architecture__OclAny);
			Fragments._Architecture__OclElement.initOperations(_Architecture__OclElement);
			Fragments._Architecture__OclEnumeration.initOperations(_Architecture__OclEnumeration);
			Fragments._Architecture__OclType.initOperations(_Architecture__OclType);

			Fragments._Compute__Compute.initOperations(_Compute__Compute);
			Fragments._Compute__Entity.initOperations(_Compute__Entity);
			Fragments._Compute__OclAny.initOperations(_Compute__OclAny);
			Fragments._Compute__OclElement.initOperations(_Compute__OclElement);
			Fragments._Compute__Resource.initOperations(_Compute__Resource);

			Fragments._ComputeStatus__ComputeStatus.initOperations(_ComputeStatus__ComputeStatus);
			Fragments._ComputeStatus__OclAny.initOperations(_ComputeStatus__OclAny);
			Fragments._ComputeStatus__OclElement.initOperations(_ComputeStatus__OclElement);
			Fragments._ComputeStatus__OclEnumeration.initOperations(_ComputeStatus__OclEnumeration);
			Fragments._ComputeStatus__OclType.initOperations(_ComputeStatus__OclType);

			Fragments._Core__Core.initOperations(_Core__Core);
			Fragments._Core__OclAny.initOperations(_Core__OclAny);

			Fragments._GHz__GHz.initOperations(_GHz__GHz);
			Fragments._GHz__OclAny.initOperations(_GHz__OclAny);

			Fragments._GiB__GiB.initOperations(_GiB__GiB);
			Fragments._GiB__OclAny.initOperations(_GiB__OclAny);

			Fragments._IpAddress__IpAddress.initOperations(_IpAddress__IpAddress);
			Fragments._IpAddress__OclAny.initOperations(_IpAddress__OclAny);

			Fragments._IpAddressRange__IpAddressRange.initOperations(_IpAddressRange__IpAddressRange);
			Fragments._IpAddressRange__OclAny.initOperations(_IpAddressRange__OclAny);

			Fragments._Ipnetwork__Ipnetwork.initOperations(_Ipnetwork__Ipnetwork);
			Fragments._Ipnetwork__MixinBase.initOperations(_Ipnetwork__MixinBase);
			Fragments._Ipnetwork__OclAny.initOperations(_Ipnetwork__OclAny);
			Fragments._Ipnetwork__OclElement.initOperations(_Ipnetwork__OclElement);

			Fragments._Ipnetworkinterface__Ipnetworkinterface.initOperations(_Ipnetworkinterface__Ipnetworkinterface);
			Fragments._Ipnetworkinterface__MixinBase.initOperations(_Ipnetworkinterface__MixinBase);
			Fragments._Ipnetworkinterface__OclAny.initOperations(_Ipnetworkinterface__OclAny);
			Fragments._Ipnetworkinterface__OclElement.initOperations(_Ipnetworkinterface__OclElement);

			Fragments._Mac__Mac.initOperations(_Mac__Mac);
			Fragments._Mac__OclAny.initOperations(_Mac__OclAny);

			Fragments._Network__Entity.initOperations(_Network__Entity);
			Fragments._Network__Network.initOperations(_Network__Network);
			Fragments._Network__OclAny.initOperations(_Network__OclAny);
			Fragments._Network__OclElement.initOperations(_Network__OclElement);
			Fragments._Network__Resource.initOperations(_Network__Resource);

			Fragments._NetworkInterfaceStatus__NetworkInterfaceStatus.initOperations(_NetworkInterfaceStatus__NetworkInterfaceStatus);
			Fragments._NetworkInterfaceStatus__OclAny.initOperations(_NetworkInterfaceStatus__OclAny);
			Fragments._NetworkInterfaceStatus__OclElement.initOperations(_NetworkInterfaceStatus__OclElement);
			Fragments._NetworkInterfaceStatus__OclEnumeration.initOperations(_NetworkInterfaceStatus__OclEnumeration);
			Fragments._NetworkInterfaceStatus__OclType.initOperations(_NetworkInterfaceStatus__OclType);

			Fragments._NetworkStatus__NetworkStatus.initOperations(_NetworkStatus__NetworkStatus);
			Fragments._NetworkStatus__OclAny.initOperations(_NetworkStatus__OclAny);
			Fragments._NetworkStatus__OclElement.initOperations(_NetworkStatus__OclElement);
			Fragments._NetworkStatus__OclEnumeration.initOperations(_NetworkStatus__OclEnumeration);
			Fragments._NetworkStatus__OclType.initOperations(_NetworkStatus__OclType);

			Fragments._Networkinterface__Entity.initOperations(_Networkinterface__Entity);
			Fragments._Networkinterface__Link.initOperations(_Networkinterface__Link);
			Fragments._Networkinterface__Networkinterface.initOperations(_Networkinterface__Networkinterface);
			Fragments._Networkinterface__OclAny.initOperations(_Networkinterface__OclAny);
			Fragments._Networkinterface__OclElement.initOperations(_Networkinterface__OclElement);

			Fragments._Os_tpl__MixinBase.initOperations(_Os_tpl__MixinBase);
			Fragments._Os_tpl__OclAny.initOperations(_Os_tpl__OclAny);
			Fragments._Os_tpl__OclElement.initOperations(_Os_tpl__OclElement);
			Fragments._Os_tpl__Os_tpl.initOperations(_Os_tpl__Os_tpl);

			Fragments._Resource_tpl__MixinBase.initOperations(_Resource_tpl__MixinBase);
			Fragments._Resource_tpl__OclAny.initOperations(_Resource_tpl__OclAny);
			Fragments._Resource_tpl__OclElement.initOperations(_Resource_tpl__OclElement);
			Fragments._Resource_tpl__Resource_tpl.initOperations(_Resource_tpl__Resource_tpl);

			Fragments._RestartMethod__OclAny.initOperations(_RestartMethod__OclAny);
			Fragments._RestartMethod__OclElement.initOperations(_RestartMethod__OclElement);
			Fragments._RestartMethod__OclEnumeration.initOperations(_RestartMethod__OclEnumeration);
			Fragments._RestartMethod__OclType.initOperations(_RestartMethod__OclType);
			Fragments._RestartMethod__RestartMethod.initOperations(_RestartMethod__RestartMethod);

			Fragments._SaveMethod__OclAny.initOperations(_SaveMethod__OclAny);
			Fragments._SaveMethod__OclElement.initOperations(_SaveMethod__OclElement);
			Fragments._SaveMethod__OclEnumeration.initOperations(_SaveMethod__OclEnumeration);
			Fragments._SaveMethod__OclType.initOperations(_SaveMethod__OclType);
			Fragments._SaveMethod__SaveMethod.initOperations(_SaveMethod__SaveMethod);

			Fragments._Share__OclAny.initOperations(_Share__OclAny);
			Fragments._Share__Share.initOperations(_Share__Share);

			Fragments._Ssh_key__MixinBase.initOperations(_Ssh_key__MixinBase);
			Fragments._Ssh_key__OclAny.initOperations(_Ssh_key__OclAny);
			Fragments._Ssh_key__OclElement.initOperations(_Ssh_key__OclElement);
			Fragments._Ssh_key__Ssh_key.initOperations(_Ssh_key__Ssh_key);

			Fragments._StopMethod__OclAny.initOperations(_StopMethod__OclAny);
			Fragments._StopMethod__OclElement.initOperations(_StopMethod__OclElement);
			Fragments._StopMethod__OclEnumeration.initOperations(_StopMethod__OclEnumeration);
			Fragments._StopMethod__OclType.initOperations(_StopMethod__OclType);
			Fragments._StopMethod__StopMethod.initOperations(_StopMethod__StopMethod);

			Fragments._Storage__Entity.initOperations(_Storage__Entity);
			Fragments._Storage__OclAny.initOperations(_Storage__OclAny);
			Fragments._Storage__OclElement.initOperations(_Storage__OclElement);
			Fragments._Storage__Resource.initOperations(_Storage__Resource);
			Fragments._Storage__Storage.initOperations(_Storage__Storage);

			Fragments._StorageLinkStatus__OclAny.initOperations(_StorageLinkStatus__OclAny);
			Fragments._StorageLinkStatus__OclElement.initOperations(_StorageLinkStatus__OclElement);
			Fragments._StorageLinkStatus__OclEnumeration.initOperations(_StorageLinkStatus__OclEnumeration);
			Fragments._StorageLinkStatus__OclType.initOperations(_StorageLinkStatus__OclType);
			Fragments._StorageLinkStatus__StorageLinkStatus.initOperations(_StorageLinkStatus__StorageLinkStatus);

			Fragments._StorageStatus__OclAny.initOperations(_StorageStatus__OclAny);
			Fragments._StorageStatus__OclElement.initOperations(_StorageStatus__OclElement);
			Fragments._StorageStatus__OclEnumeration.initOperations(_StorageStatus__OclEnumeration);
			Fragments._StorageStatus__OclType.initOperations(_StorageStatus__OclType);
			Fragments._StorageStatus__StorageStatus.initOperations(_StorageStatus__StorageStatus);

			Fragments._Storagelink__Entity.initOperations(_Storagelink__Entity);
			Fragments._Storagelink__Link.initOperations(_Storagelink__Link);
			Fragments._Storagelink__OclAny.initOperations(_Storagelink__OclAny);
			Fragments._Storagelink__OclElement.initOperations(_Storagelink__OclElement);
			Fragments._Storagelink__Storagelink.initOperations(_Storagelink__Storagelink);

			Fragments._SuspendMethod__OclAny.initOperations(_SuspendMethod__OclAny);
			Fragments._SuspendMethod__OclElement.initOperations(_SuspendMethod__OclElement);
			Fragments._SuspendMethod__OclEnumeration.initOperations(_SuspendMethod__OclEnumeration);
			Fragments._SuspendMethod__OclType.initOperations(_SuspendMethod__OclType);
			Fragments._SuspendMethod__SuspendMethod.initOperations(_SuspendMethod__SuspendMethod);

			Fragments._Token__OclAny.initOperations(_Token__OclAny);
			Fragments._Token__Token.initOperations(_Token__Token);

			Fragments._User_data__MixinBase.initOperations(_User_data__MixinBase);
			Fragments._User_data__OclAny.initOperations(_User_data__OclAny);
			Fragments._User_data__OclElement.initOperations(_User_data__OclElement);
			Fragments._User_data__User_data.initOperations(_User_data__User_data);

			Fragments._Vlan__OclAny.initOperations(_Vlan__OclAny);
			Fragments._Vlan__Vlan.initOperations(_Vlan__Vlan);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Allocation = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Architecture = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Compute = {
			InfrastructureTables.Properties._Compute__occiComputeArchitecture,
			InfrastructureTables.Properties._Compute__occiComputeCores,
			InfrastructureTables.Properties._Compute__occiComputeHostname,
			InfrastructureTables.Properties._Compute__occiComputeMemory,
			InfrastructureTables.Properties._Compute__occiComputeShare,
			InfrastructureTables.Properties._Compute__occiComputeSpeed,
			InfrastructureTables.Properties._Compute__occiComputeState,
			InfrastructureTables.Properties._Compute__occiComputeStateMessage
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ComputeStatus = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Core = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _GHz = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _GiB = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _IpAddress = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _IpAddressRange = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ipnetwork = {
			InfrastructureTables.Properties._Ipnetwork__occiNetworkAddress,
			InfrastructureTables.Properties._Ipnetwork__occiNetworkAllocation,
			InfrastructureTables.Properties._Ipnetwork__occiNetworkGateway
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ipnetworkinterface = {
			InfrastructureTables.Properties._Ipnetworkinterface__occiNetworkinterfaceAddress,
			InfrastructureTables.Properties._Ipnetworkinterface__occiNetworkinterfaceAllocation,
			InfrastructureTables.Properties._Ipnetworkinterface__occiNetworkinterfaceGateway
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mac = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Network = {
			InfrastructureTables.Properties._Network__occiNetworkLabel,
			InfrastructureTables.Properties._Network__occiNetworkState,
			InfrastructureTables.Properties._Network__occiNetworkStateMessage,
			InfrastructureTables.Properties._Network__occiNetworkVlan
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NetworkInterfaceStatus = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NetworkStatus = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Networkinterface = {
			InfrastructureTables.Properties._Networkinterface__occiNetworkinterfaceInterface,
			InfrastructureTables.Properties._Networkinterface__occiNetworkinterfaceMac,
			InfrastructureTables.Properties._Networkinterface__occiNetworkinterfaceState,
			InfrastructureTables.Properties._Networkinterface__occiNetworkinterfaceStateMessage
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Os_tpl = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RestartMethod = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SaveMethod = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Share = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ssh_key = {
			InfrastructureTables.Properties._Ssh_key__occiCredentialsSshPublickey
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _StopMethod = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Storage = {
			InfrastructureTables.Properties._Storage__occiStorageSize,
			InfrastructureTables.Properties._Storage__occiStorageState,
			InfrastructureTables.Properties._Storage__occiStorageStateMessage
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _StorageLinkStatus = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _StorageStatus = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Storagelink = {
			InfrastructureTables.Properties._Storagelink__occiStoragelinkDeviceid,
			InfrastructureTables.Properties._Storagelink__occiStoragelinkMountpoint,
			InfrastructureTables.Properties._Storagelink__occiStoragelinkState,
			InfrastructureTables.Properties._Storagelink__occiStoragelinkStateMessage
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _SuspendMethod = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Token = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _User_data = {
			InfrastructureTables.Properties._User_data__occiComputeUserdata
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vlan = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Allocation__Allocation.initProperties(_Allocation);
			Fragments._Architecture__Architecture.initProperties(_Architecture);
			Fragments._Compute__Compute.initProperties(_Compute);
			Fragments._ComputeStatus__ComputeStatus.initProperties(_ComputeStatus);
			Fragments._Core__Core.initProperties(_Core);
			Fragments._GHz__GHz.initProperties(_GHz);
			Fragments._GiB__GiB.initProperties(_GiB);
			Fragments._IpAddress__IpAddress.initProperties(_IpAddress);
			Fragments._IpAddressRange__IpAddressRange.initProperties(_IpAddressRange);
			Fragments._Ipnetwork__Ipnetwork.initProperties(_Ipnetwork);
			Fragments._Ipnetworkinterface__Ipnetworkinterface.initProperties(_Ipnetworkinterface);
			Fragments._Mac__Mac.initProperties(_Mac);
			Fragments._Network__Network.initProperties(_Network);
			Fragments._NetworkInterfaceStatus__NetworkInterfaceStatus.initProperties(_NetworkInterfaceStatus);
			Fragments._NetworkStatus__NetworkStatus.initProperties(_NetworkStatus);
			Fragments._Networkinterface__Networkinterface.initProperties(_Networkinterface);
			Fragments._Os_tpl__Os_tpl.initProperties(_Os_tpl);
			Fragments._Resource_tpl__Resource_tpl.initProperties(_Resource_tpl);
			Fragments._RestartMethod__RestartMethod.initProperties(_RestartMethod);
			Fragments._SaveMethod__SaveMethod.initProperties(_SaveMethod);
			Fragments._Share__Share.initProperties(_Share);
			Fragments._Ssh_key__Ssh_key.initProperties(_Ssh_key);
			Fragments._StopMethod__StopMethod.initProperties(_StopMethod);
			Fragments._Storage__Storage.initProperties(_Storage);
			Fragments._StorageLinkStatus__StorageLinkStatus.initProperties(_StorageLinkStatus);
			Fragments._StorageStatus__StorageStatus.initProperties(_StorageStatus);
			Fragments._Storagelink__Storagelink.initProperties(_Storagelink);
			Fragments._SuspendMethod__SuspendMethod.initProperties(_SuspendMethod);
			Fragments._Token__Token.initProperties(_Token);
			Fragments._User_data__User_data.initProperties(_User_data);
			Fragments._Vlan__Vlan.initProperties(_Vlan);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Allocation__dynamic = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.ALLOCATION.getEEnumLiteral("dynamic"), Types._Allocation, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Allocation__static = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.ALLOCATION.getEEnumLiteral("static"), Types._Allocation, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Allocation = {
			_Allocation__dynamic,
			_Allocation__static
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Architecture__x86 = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.ARCHITECTURE.getEEnumLiteral("x86"), Types._Architecture, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Architecture__x64 = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.ARCHITECTURE.getEEnumLiteral("x64"), Types._Architecture, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Architecture = {
			_Architecture__x86,
			_Architecture__x64
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ComputeStatus__active = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.COMPUTE_STATUS.getEEnumLiteral("active"), Types._ComputeStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ComputeStatus__inactive = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.COMPUTE_STATUS.getEEnumLiteral("inactive"), Types._ComputeStatus, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ComputeStatus__suspended = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.COMPUTE_STATUS.getEEnumLiteral("suspended"), Types._ComputeStatus, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ComputeStatus__error = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.COMPUTE_STATUS.getEEnumLiteral("error"), Types._ComputeStatus, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ComputeStatus = {
			_ComputeStatus__active,
			_ComputeStatus__inactive,
			_ComputeStatus__suspended,
			_ComputeStatus__error
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NetworkInterfaceStatus__active = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.NETWORK_INTERFACE_STATUS.getEEnumLiteral("active"), Types._NetworkInterfaceStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NetworkInterfaceStatus__inactive = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.NETWORK_INTERFACE_STATUS.getEEnumLiteral("inactive"), Types._NetworkInterfaceStatus, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NetworkInterfaceStatus__error = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.NETWORK_INTERFACE_STATUS.getEEnumLiteral("error"), Types._NetworkInterfaceStatus, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _NetworkInterfaceStatus = {
			_NetworkInterfaceStatus__active,
			_NetworkInterfaceStatus__inactive,
			_NetworkInterfaceStatus__error
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NetworkStatus__active = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.NETWORK_STATUS.getEEnumLiteral("active"), Types._NetworkStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NetworkStatus__inactive = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.NETWORK_STATUS.getEEnumLiteral("inactive"), Types._NetworkStatus, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NetworkStatus__error = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.NETWORK_STATUS.getEEnumLiteral("error"), Types._NetworkStatus, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _NetworkStatus = {
			_NetworkStatus__active,
			_NetworkStatus__inactive,
			_NetworkStatus__error
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _RestartMethod__graceful = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.RESTART_METHOD.getEEnumLiteral("graceful"), Types._RestartMethod, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _RestartMethod__warm = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.RESTART_METHOD.getEEnumLiteral("warm"), Types._RestartMethod, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _RestartMethod__cold = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.RESTART_METHOD.getEEnumLiteral("cold"), Types._RestartMethod, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _RestartMethod = {
			_RestartMethod__graceful,
			_RestartMethod__warm,
			_RestartMethod__cold
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SaveMethod__hot = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.SAVE_METHOD.getEEnumLiteral("hot"), Types._SaveMethod, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SaveMethod__deferred = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.SAVE_METHOD.getEEnumLiteral("deferred"), Types._SaveMethod, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SaveMethod = {
			_SaveMethod__hot,
			_SaveMethod__deferred
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StopMethod__graceful = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STOP_METHOD.getEEnumLiteral("graceful"), Types._StopMethod, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StopMethod__acpioff = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STOP_METHOD.getEEnumLiteral("acpioff"), Types._StopMethod, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StopMethod__poweroff = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STOP_METHOD.getEEnumLiteral("poweroff"), Types._StopMethod, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _StopMethod = {
			_StopMethod__graceful,
			_StopMethod__acpioff,
			_StopMethod__poweroff
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageLinkStatus__active = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_LINK_STATUS.getEEnumLiteral("active"), Types._StorageLinkStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageLinkStatus__inactive = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_LINK_STATUS.getEEnumLiteral("inactive"), Types._StorageLinkStatus, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageLinkStatus__error = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_LINK_STATUS.getEEnumLiteral("error"), Types._StorageLinkStatus, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _StorageLinkStatus = {
			_StorageLinkStatus__active,
			_StorageLinkStatus__inactive,
			_StorageLinkStatus__error
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageStatus__online = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_STATUS.getEEnumLiteral("online"), Types._StorageStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageStatus__offline = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_STATUS.getEEnumLiteral("offline"), Types._StorageStatus, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _StorageStatus__error = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.STORAGE_STATUS.getEEnumLiteral("error"), Types._StorageStatus, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _StorageStatus = {
			_StorageStatus__online,
			_StorageStatus__offline,
			_StorageStatus__error
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SuspendMethod__hibernate = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.SUSPEND_METHOD.getEEnumLiteral("hibernate"), Types._SuspendMethod, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _SuspendMethod__suspend = new EcoreExecutorEnumerationLiteral(InfrastructurePackage.Literals.SUSPEND_METHOD.getEEnumLiteral("suspend"), Types._SuspendMethod, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SuspendMethod = {
			_SuspendMethod__hibernate,
			_SuspendMethod__suspend
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Allocation.initLiterals(_Allocation);
			Types._Architecture.initLiterals(_Architecture);
			Types._ComputeStatus.initLiterals(_ComputeStatus);
			Types._NetworkInterfaceStatus.initLiterals(_NetworkInterfaceStatus);
			Types._NetworkStatus.initLiterals(_NetworkStatus);
			Types._RestartMethod.initLiterals(_RestartMethod);
			Types._SaveMethod.initLiterals(_SaveMethod);
			Types._StopMethod.initLiterals(_StopMethod);
			Types._StorageLinkStatus.initLiterals(_StorageLinkStatus);
			Types._StorageStatus.initLiterals(_StorageStatus);
			Types._SuspendMethod.initLiterals(_SuspendMethod);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of InfrastructureTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
