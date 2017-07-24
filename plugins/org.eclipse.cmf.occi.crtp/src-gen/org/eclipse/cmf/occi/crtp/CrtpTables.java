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
 *   /org.eclipse.cmf.occi.crtp/model/crtp.ecore
 * using:
 *   /org.eclipse.cmf.occi.crtp/model/crtp.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.crtp;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.crtp.CrtpTables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * CrtpTables provides the dispatch tables for the crtp for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class CrtpTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CrtpPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", null, org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_compute_s_template_s_1_1_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/compute/template/1.1/ecore", null, org.eclipse.cmf.occi.crtp.CrtpPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/infrastructure/ecore", null, org.eclipse.cmf.occi.infrastructure.InfrastructurePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.crtp.CrtpTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Compute = org.eclipse.cmf.occi.crtp.CrtpTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getClassId("Compute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.crtp.CrtpTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Large = org.eclipse.cmf.occi.crtp.CrtpTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_compute_s_template_s_1_1_s_ecore.getClassId("Large", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Medium = org.eclipse.cmf.occi.crtp.CrtpTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_compute_s_template_s_1_1_s_ecore.getClassId("Medium", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Mem_large = org.eclipse.cmf.occi.crtp.CrtpTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_compute_s_template_s_1_1_s_ecore.getClassId("Mem_large", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Mem_medium = org.eclipse.cmf.occi.crtp.CrtpTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_compute_s_template_s_1_1_s_ecore.getClassId("Mem_medium", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Mem_small = org.eclipse.cmf.occi.crtp.CrtpTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_compute_s_template_s_1_1_s_ecore.getClassId("Mem_small", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Small = org.eclipse.cmf.occi.crtp.CrtpTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_compute_s_template_s_1_1_s_ecore.getClassId("Small", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Core = org.eclipse.cmf.occi.crtp.CrtpTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("Core", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_GiB = org.eclipse.cmf.occi.crtp.CrtpTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_infrastructure_s_ecore.getDataTypeId("GiB", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Large_c_c_appliesConstraint = "Large::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Medium_c_c_appliesConstraint = "Medium::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Mem_large_c_c_appliesConstraint = "Mem_large::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Mem_medium_c_c_appliesConstraint = "Mem_medium::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Mem_small_c_c_appliesConstraint = "Mem_small::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Small_c_c_appliesConstraint = "Small::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CrtpTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CrtpTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Large = new EcoreExecutorType(CrtpPackage.Literals.LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Medium = new EcoreExecutorType(CrtpPackage.Literals.MEDIUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mem_large = new EcoreExecutorType(CrtpPackage.Literals.MEM_LARGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mem_medium = new EcoreExecutorType(CrtpPackage.Literals.MEM_MEDIUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mem_small = new EcoreExecutorType(CrtpPackage.Literals.MEM_SMALL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Small = new EcoreExecutorType(CrtpPackage.Literals.SMALL, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Large,
			_Medium,
			_Mem_large,
			_Mem_medium,
			_Mem_small,
			_Small
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CrtpTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Large__Large = new ExecutorFragment(Types._Large, CrtpTables.Types._Large);
		private static final /*@NonNull*/ ExecutorFragment _Large__MixinBase = new ExecutorFragment(Types._Large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Large__OclAny = new ExecutorFragment(Types._Large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Large__OclElement = new ExecutorFragment(Types._Large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Large__Resource_tpl = new ExecutorFragment(Types._Large, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Medium__Medium = new ExecutorFragment(Types._Medium, CrtpTables.Types._Medium);
		private static final /*@NonNull*/ ExecutorFragment _Medium__MixinBase = new ExecutorFragment(Types._Medium, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Medium__OclAny = new ExecutorFragment(Types._Medium, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Medium__OclElement = new ExecutorFragment(Types._Medium, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Medium__Resource_tpl = new ExecutorFragment(Types._Medium, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Mem_large__Mem_large = new ExecutorFragment(Types._Mem_large, CrtpTables.Types._Mem_large);
		private static final /*@NonNull*/ ExecutorFragment _Mem_large__MixinBase = new ExecutorFragment(Types._Mem_large, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mem_large__OclAny = new ExecutorFragment(Types._Mem_large, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mem_large__OclElement = new ExecutorFragment(Types._Mem_large, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Mem_large__Resource_tpl = new ExecutorFragment(Types._Mem_large, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Mem_medium__Mem_medium = new ExecutorFragment(Types._Mem_medium, CrtpTables.Types._Mem_medium);
		private static final /*@NonNull*/ ExecutorFragment _Mem_medium__MixinBase = new ExecutorFragment(Types._Mem_medium, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mem_medium__OclAny = new ExecutorFragment(Types._Mem_medium, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mem_medium__OclElement = new ExecutorFragment(Types._Mem_medium, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Mem_medium__Resource_tpl = new ExecutorFragment(Types._Mem_medium, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Mem_small__Mem_small = new ExecutorFragment(Types._Mem_small, CrtpTables.Types._Mem_small);
		private static final /*@NonNull*/ ExecutorFragment _Mem_small__MixinBase = new ExecutorFragment(Types._Mem_small, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Mem_small__OclAny = new ExecutorFragment(Types._Mem_small, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mem_small__OclElement = new ExecutorFragment(Types._Mem_small, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Mem_small__Resource_tpl = new ExecutorFragment(Types._Mem_small, InfrastructureTables.Types._Resource_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Small__MixinBase = new ExecutorFragment(Types._Small, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Small__OclAny = new ExecutorFragment(Types._Small, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Small__OclElement = new ExecutorFragment(Types._Small, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Small__Resource_tpl = new ExecutorFragment(Types._Small, InfrastructureTables.Types._Resource_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Small__Small = new ExecutorFragment(Types._Small, CrtpTables.Types._Small);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CrtpTables::Fragments and all preceding sub-packages.
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


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CrtpTables::Parameters and all preceding sub-packages.
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

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CrtpTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Large__occiComputeCores = new EcoreExecutorProperty(CrtpPackage.Literals.LARGE__OCCI_COMPUTE_CORES, Types._Large, 0);
		public static final /*@NonNull*/ ExecutorProperty _Large__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(CrtpPackage.Literals.LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._Large, 1);
		public static final /*@NonNull*/ ExecutorProperty _Large__occiComputeMemory = new EcoreExecutorProperty(CrtpPackage.Literals.LARGE__OCCI_COMPUTE_MEMORY, Types._Large, 2);

		public static final /*@NonNull*/ ExecutorProperty _Medium__occiComputeCores = new EcoreExecutorProperty(CrtpPackage.Literals.MEDIUM__OCCI_COMPUTE_CORES, Types._Medium, 0);
		public static final /*@NonNull*/ ExecutorProperty _Medium__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(CrtpPackage.Literals.MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._Medium, 1);
		public static final /*@NonNull*/ ExecutorProperty _Medium__occiComputeMemory = new EcoreExecutorProperty(CrtpPackage.Literals.MEDIUM__OCCI_COMPUTE_MEMORY, Types._Medium, 2);

		public static final /*@NonNull*/ ExecutorProperty _Mem_large__occiComputeCores = new EcoreExecutorProperty(CrtpPackage.Literals.MEM_LARGE__OCCI_COMPUTE_CORES, Types._Mem_large, 0);
		public static final /*@NonNull*/ ExecutorProperty _Mem_large__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(CrtpPackage.Literals.MEM_LARGE__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._Mem_large, 1);
		public static final /*@NonNull*/ ExecutorProperty _Mem_large__occiComputeMemory = new EcoreExecutorProperty(CrtpPackage.Literals.MEM_LARGE__OCCI_COMPUTE_MEMORY, Types._Mem_large, 2);

		public static final /*@NonNull*/ ExecutorProperty _Mem_medium__occiComputeCores = new EcoreExecutorProperty(CrtpPackage.Literals.MEM_MEDIUM__OCCI_COMPUTE_CORES, Types._Mem_medium, 0);
		public static final /*@NonNull*/ ExecutorProperty _Mem_medium__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(CrtpPackage.Literals.MEM_MEDIUM__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._Mem_medium, 1);
		public static final /*@NonNull*/ ExecutorProperty _Mem_medium__occiComputeMemory = new EcoreExecutorProperty(CrtpPackage.Literals.MEM_MEDIUM__OCCI_COMPUTE_MEMORY, Types._Mem_medium, 2);

		public static final /*@NonNull*/ ExecutorProperty _Mem_small__occiComputeCores = new EcoreExecutorProperty(CrtpPackage.Literals.MEM_SMALL__OCCI_COMPUTE_CORES, Types._Mem_small, 0);
		public static final /*@NonNull*/ ExecutorProperty _Mem_small__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(CrtpPackage.Literals.MEM_SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._Mem_small, 1);
		public static final /*@NonNull*/ ExecutorProperty _Mem_small__occiComputeMemory = new EcoreExecutorProperty(CrtpPackage.Literals.MEM_SMALL__OCCI_COMPUTE_MEMORY, Types._Mem_small, 2);

		public static final /*@NonNull*/ ExecutorProperty _Small__occiComputeCores = new EcoreExecutorProperty(CrtpPackage.Literals.SMALL__OCCI_COMPUTE_CORES, Types._Small, 0);
		public static final /*@NonNull*/ ExecutorProperty _Small__occiComputeEphemeralStorageSize = new EcoreExecutorProperty(CrtpPackage.Literals.SMALL__OCCI_COMPUTE_EPHEMERAL_STORAGE_SIZE, Types._Small, 1);
		public static final /*@NonNull*/ ExecutorProperty _Small__occiComputeMemory = new EcoreExecutorProperty(CrtpPackage.Literals.SMALL__OCCI_COMPUTE_MEMORY, Types._Small, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CrtpTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Large =
		{
			Fragments._Large__OclAny /* 0 */,
			Fragments._Large__OclElement /* 1 */,
			Fragments._Large__MixinBase /* 2 */,
			Fragments._Large__Resource_tpl /* 3 */,
			Fragments._Large__Large /* 4 */
		};
		private static final int /*@NonNull*/ [] __Large = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Medium =
		{
			Fragments._Medium__OclAny /* 0 */,
			Fragments._Medium__OclElement /* 1 */,
			Fragments._Medium__MixinBase /* 2 */,
			Fragments._Medium__Resource_tpl /* 3 */,
			Fragments._Medium__Medium /* 4 */
		};
		private static final int /*@NonNull*/ [] __Medium = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mem_large =
		{
			Fragments._Mem_large__OclAny /* 0 */,
			Fragments._Mem_large__OclElement /* 1 */,
			Fragments._Mem_large__MixinBase /* 2 */,
			Fragments._Mem_large__Resource_tpl /* 3 */,
			Fragments._Mem_large__Mem_large /* 4 */
		};
		private static final int /*@NonNull*/ [] __Mem_large = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mem_medium =
		{
			Fragments._Mem_medium__OclAny /* 0 */,
			Fragments._Mem_medium__OclElement /* 1 */,
			Fragments._Mem_medium__MixinBase /* 2 */,
			Fragments._Mem_medium__Resource_tpl /* 3 */,
			Fragments._Mem_medium__Mem_medium /* 4 */
		};
		private static final int /*@NonNull*/ [] __Mem_medium = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mem_small =
		{
			Fragments._Mem_small__OclAny /* 0 */,
			Fragments._Mem_small__OclElement /* 1 */,
			Fragments._Mem_small__MixinBase /* 2 */,
			Fragments._Mem_small__Resource_tpl /* 3 */,
			Fragments._Mem_small__Mem_small /* 4 */
		};
		private static final int /*@NonNull*/ [] __Mem_small = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Small =
		{
			Fragments._Small__OclAny /* 0 */,
			Fragments._Small__OclElement /* 1 */,
			Fragments._Small__MixinBase /* 2 */,
			Fragments._Small__Resource_tpl /* 3 */,
			Fragments._Small__Small /* 4 */
		};
		private static final int /*@NonNull*/ [] __Small = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Large.initFragments(_Large, __Large);
			Types._Medium.initFragments(_Medium, __Medium);
			Types._Mem_large.initFragments(_Mem_large, __Mem_large);
			Types._Mem_medium.initFragments(_Mem_medium, __Mem_medium);
			Types._Mem_small.initFragments(_Mem_small, __Mem_small);
			Types._Small.initFragments(_Small, __Small);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CrtpTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Large__Large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Medium__Medium = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Medium__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Medium__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Medium__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Medium__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_large__Mem_large = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_large__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_large__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_large__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_large__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_medium__Mem_medium = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_medium__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_medium__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_medium__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_medium__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_small__Mem_small = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_small__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_small__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_small__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mem_small__Resource_tpl = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Small__Small = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Small__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Small__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Small__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Small__Resource_tpl = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Large__Large.initOperations(_Large__Large);
			Fragments._Large__MixinBase.initOperations(_Large__MixinBase);
			Fragments._Large__OclAny.initOperations(_Large__OclAny);
			Fragments._Large__OclElement.initOperations(_Large__OclElement);
			Fragments._Large__Resource_tpl.initOperations(_Large__Resource_tpl);

			Fragments._Medium__Medium.initOperations(_Medium__Medium);
			Fragments._Medium__MixinBase.initOperations(_Medium__MixinBase);
			Fragments._Medium__OclAny.initOperations(_Medium__OclAny);
			Fragments._Medium__OclElement.initOperations(_Medium__OclElement);
			Fragments._Medium__Resource_tpl.initOperations(_Medium__Resource_tpl);

			Fragments._Mem_large__Mem_large.initOperations(_Mem_large__Mem_large);
			Fragments._Mem_large__MixinBase.initOperations(_Mem_large__MixinBase);
			Fragments._Mem_large__OclAny.initOperations(_Mem_large__OclAny);
			Fragments._Mem_large__OclElement.initOperations(_Mem_large__OclElement);
			Fragments._Mem_large__Resource_tpl.initOperations(_Mem_large__Resource_tpl);

			Fragments._Mem_medium__Mem_medium.initOperations(_Mem_medium__Mem_medium);
			Fragments._Mem_medium__MixinBase.initOperations(_Mem_medium__MixinBase);
			Fragments._Mem_medium__OclAny.initOperations(_Mem_medium__OclAny);
			Fragments._Mem_medium__OclElement.initOperations(_Mem_medium__OclElement);
			Fragments._Mem_medium__Resource_tpl.initOperations(_Mem_medium__Resource_tpl);

			Fragments._Mem_small__Mem_small.initOperations(_Mem_small__Mem_small);
			Fragments._Mem_small__MixinBase.initOperations(_Mem_small__MixinBase);
			Fragments._Mem_small__OclAny.initOperations(_Mem_small__OclAny);
			Fragments._Mem_small__OclElement.initOperations(_Mem_small__OclElement);
			Fragments._Mem_small__Resource_tpl.initOperations(_Mem_small__Resource_tpl);

			Fragments._Small__MixinBase.initOperations(_Small__MixinBase);
			Fragments._Small__OclAny.initOperations(_Small__OclAny);
			Fragments._Small__OclElement.initOperations(_Small__OclElement);
			Fragments._Small__Resource_tpl.initOperations(_Small__Resource_tpl);
			Fragments._Small__Small.initOperations(_Small__Small);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CrtpTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Large = {
			CrtpTables.Properties._Large__occiComputeCores,
			CrtpTables.Properties._Large__occiComputeEphemeralStorageSize,
			CrtpTables.Properties._Large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Medium = {
			CrtpTables.Properties._Medium__occiComputeCores,
			CrtpTables.Properties._Medium__occiComputeEphemeralStorageSize,
			CrtpTables.Properties._Medium__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mem_large = {
			CrtpTables.Properties._Mem_large__occiComputeCores,
			CrtpTables.Properties._Mem_large__occiComputeEphemeralStorageSize,
			CrtpTables.Properties._Mem_large__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mem_medium = {
			CrtpTables.Properties._Mem_medium__occiComputeCores,
			CrtpTables.Properties._Mem_medium__occiComputeEphemeralStorageSize,
			CrtpTables.Properties._Mem_medium__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mem_small = {
			CrtpTables.Properties._Mem_small__occiComputeCores,
			CrtpTables.Properties._Mem_small__occiComputeEphemeralStorageSize,
			CrtpTables.Properties._Mem_small__occiComputeMemory
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Small = {
			CrtpTables.Properties._Small__occiComputeCores,
			CrtpTables.Properties._Small__occiComputeEphemeralStorageSize,
			CrtpTables.Properties._Small__occiComputeMemory
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Large__Large.initProperties(_Large);
			Fragments._Medium__Medium.initProperties(_Medium);
			Fragments._Mem_large__Mem_large.initProperties(_Mem_large);
			Fragments._Mem_medium__Mem_medium.initProperties(_Mem_medium);
			Fragments._Mem_small__Mem_small.initProperties(_Mem_small);
			Fragments._Small__Small.initProperties(_Small);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CrtpTables::FragmentProperties and all preceding sub-packages.
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

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CrtpTables::EnumerationLiterals and all preceding sub-packages.
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
