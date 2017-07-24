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
 *   /org.eclipse.cmf.occi.platform/model/Platform.ecore
 * using:
 *   /org.eclipse.cmf.occi.platform/model/Platform.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.platform;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.platform.PlatformTables;
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
 * PlatformTables provides the dispatch tables for the platform for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class PlatformTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(PlatformPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", null, org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/platform/ecore", null, org.eclipse.cmf.occi.platform.PlatformPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_App_tpl = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getClassId("App_tpl", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Application = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getClassId("Application", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Component = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getClassId("Component", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Componentlink = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getClassId("Componentlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Database = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getClassId("Database", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Databaselink = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getClassId("Databaselink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Res_tpl = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getClassId("Res_tpl", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_URI = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getDataTypeId("URI", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_URL = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getDataTypeId("URL", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_Status = org.eclipse.cmf.occi.platform.PlatformTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_platform_s_ecore.getEnumerationId("Status");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_App_tpl_c_c_appliesConstraint = "App_tpl::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Database_c_c_appliesConstraint = "Database::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Databaselink_c_c_appliesConstraint = "Databaselink::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Res_tpl_c_c_appliesConstraint = "Res_tpl::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			PlatformTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _App_tpl = new EcoreExecutorType(PlatformPackage.Literals.APP_TPL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Application = new EcoreExecutorType(PlatformPackage.Literals.APPLICATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Component = new EcoreExecutorType(PlatformPackage.Literals.COMPONENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Componentlink = new EcoreExecutorType(PlatformPackage.Literals.COMPONENTLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Database = new EcoreExecutorType(PlatformPackage.Literals.DATABASE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Databaselink = new EcoreExecutorType(PlatformPackage.Literals.DATABASELINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Res_tpl = new EcoreExecutorType(PlatformPackage.Literals.RES_TPL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Status = new EcoreExecutorEnumeration(PlatformPackage.Literals.STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _URI = new EcoreExecutorType("URI", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _URL = new EcoreExecutorType("URL", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_App_tpl,
			_Application,
			_Component,
			_Componentlink,
			_Database,
			_Databaselink,
			_Res_tpl,
			_Status,
			_URI,
			_URL
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _App_tpl__App_tpl = new ExecutorFragment(Types._App_tpl, PlatformTables.Types._App_tpl);
		private static final /*@NonNull*/ ExecutorFragment _App_tpl__MixinBase = new ExecutorFragment(Types._App_tpl, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _App_tpl__OclAny = new ExecutorFragment(Types._App_tpl, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _App_tpl__OclElement = new ExecutorFragment(Types._App_tpl, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Application__Application = new ExecutorFragment(Types._Application, PlatformTables.Types._Application);
		private static final /*@NonNull*/ ExecutorFragment _Application__Entity = new ExecutorFragment(Types._Application, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Application__OclAny = new ExecutorFragment(Types._Application, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Application__OclElement = new ExecutorFragment(Types._Application, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Application__Resource = new ExecutorFragment(Types._Application, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Component__Component = new ExecutorFragment(Types._Component, PlatformTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Component__Entity = new ExecutorFragment(Types._Component, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Component__OclAny = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Component__OclElement = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Component__Resource = new ExecutorFragment(Types._Component, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Componentlink__Componentlink = new ExecutorFragment(Types._Componentlink, PlatformTables.Types._Componentlink);
		private static final /*@NonNull*/ ExecutorFragment _Componentlink__Entity = new ExecutorFragment(Types._Componentlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Componentlink__Link = new ExecutorFragment(Types._Componentlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Componentlink__OclAny = new ExecutorFragment(Types._Componentlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Componentlink__OclElement = new ExecutorFragment(Types._Componentlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Database__Database = new ExecutorFragment(Types._Database, PlatformTables.Types._Database);
		private static final /*@NonNull*/ ExecutorFragment _Database__MixinBase = new ExecutorFragment(Types._Database, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Database__OclAny = new ExecutorFragment(Types._Database, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Database__OclElement = new ExecutorFragment(Types._Database, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Databaselink__Databaselink = new ExecutorFragment(Types._Databaselink, PlatformTables.Types._Databaselink);
		private static final /*@NonNull*/ ExecutorFragment _Databaselink__MixinBase = new ExecutorFragment(Types._Databaselink, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Databaselink__OclAny = new ExecutorFragment(Types._Databaselink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Databaselink__OclElement = new ExecutorFragment(Types._Databaselink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Res_tpl__MixinBase = new ExecutorFragment(Types._Res_tpl, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Res_tpl__OclAny = new ExecutorFragment(Types._Res_tpl, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Res_tpl__OclElement = new ExecutorFragment(Types._Res_tpl, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Res_tpl__Res_tpl = new ExecutorFragment(Types._Res_tpl, PlatformTables.Types._Res_tpl);

		private static final /*@NonNull*/ ExecutorFragment _Status__OclAny = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Status__OclElement = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Status__OclEnumeration = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Status__OclType = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Status__Status = new ExecutorFragment(Types._Status, PlatformTables.Types._Status);

		private static final /*@NonNull*/ ExecutorFragment _URI__OclAny = new ExecutorFragment(Types._URI, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _URI__OclComparable = new ExecutorFragment(Types._URI, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _URI__URI = new ExecutorFragment(Types._URI, PlatformTables.Types._URI);

		private static final /*@NonNull*/ ExecutorFragment _URL__OclAny = new ExecutorFragment(Types._URL, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _URL__URL = new ExecutorFragment(Types._URL, PlatformTables.Types._URL);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::Fragments and all preceding sub-packages.
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

		public static final /*@NonNull*/ ParameterTypes _OclSelf = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclSelf);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Application__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Application,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Application__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Application,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Component__start = new ExecutorOperation("start", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Component,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Component__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Component,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _URI__compareTo = new ExecutorOperation("compareTo", Parameters._OclSelf, Types._URI,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Application__occiAppContext = new EcoreExecutorProperty(PlatformPackage.Literals.APPLICATION__OCCI_APP_CONTEXT, Types._Application, 0);
		public static final /*@NonNull*/ ExecutorProperty _Application__occiAppName = new EcoreExecutorProperty(PlatformPackage.Literals.APPLICATION__OCCI_APP_NAME, Types._Application, 1);
		public static final /*@NonNull*/ ExecutorProperty _Application__occiAppState = new EcoreExecutorProperty(PlatformPackage.Literals.APPLICATION__OCCI_APP_STATE, Types._Application, 2);
		public static final /*@NonNull*/ ExecutorProperty _Application__occiAppStateMessage = new EcoreExecutorProperty(PlatformPackage.Literals.APPLICATION__OCCI_APP_STATE_MESSAGE, Types._Application, 3);
		public static final /*@NonNull*/ ExecutorProperty _Application__occiAppUrl = new EcoreExecutorProperty(PlatformPackage.Literals.APPLICATION__OCCI_APP_URL, Types._Application, 4);

		public static final /*@NonNull*/ ExecutorProperty _Component__occiComponentState = new EcoreExecutorProperty(PlatformPackage.Literals.COMPONENT__OCCI_COMPONENT_STATE, Types._Component, 0);
		public static final /*@NonNull*/ ExecutorProperty _Component__occiComponentStateMessage = new EcoreExecutorProperty(PlatformPackage.Literals.COMPONENT__OCCI_COMPONENT_STATE_MESSAGE, Types._Component, 1);

		public static final /*@NonNull*/ ExecutorProperty _Database__occiDatabaseVersion = new EcoreExecutorProperty(PlatformPackage.Literals.DATABASE__OCCI_DATABASE_VERSION, Types._Database, 0);

		public static final /*@NonNull*/ ExecutorProperty _Databaselink__occiDatabaseToken = new EcoreExecutorProperty(PlatformPackage.Literals.DATABASELINK__OCCI_DATABASE_TOKEN, Types._Databaselink, 0);
		public static final /*@NonNull*/ ExecutorProperty _Databaselink__occiDatabaseUri = new EcoreExecutorProperty(PlatformPackage.Literals.DATABASELINK__OCCI_DATABASE_URI, Types._Databaselink, 1);
		public static final /*@NonNull*/ ExecutorProperty _Databaselink__occiDatabaseUsername = new EcoreExecutorProperty(PlatformPackage.Literals.DATABASELINK__OCCI_DATABASE_USERNAME, Types._Databaselink, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _App_tpl =
		{
			Fragments._App_tpl__OclAny /* 0 */,
			Fragments._App_tpl__OclElement /* 1 */,
			Fragments._App_tpl__MixinBase /* 2 */,
			Fragments._App_tpl__App_tpl /* 3 */
		};
		private static final int /*@NonNull*/ [] __App_tpl = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Application =
		{
			Fragments._Application__OclAny /* 0 */,
			Fragments._Application__OclElement /* 1 */,
			Fragments._Application__Entity /* 2 */,
			Fragments._Application__Resource /* 3 */,
			Fragments._Application__Application /* 4 */
		};
		private static final int /*@NonNull*/ [] __Application = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Component =
		{
			Fragments._Component__OclAny /* 0 */,
			Fragments._Component__OclElement /* 1 */,
			Fragments._Component__Entity /* 2 */,
			Fragments._Component__Resource /* 3 */,
			Fragments._Component__Component /* 4 */
		};
		private static final int /*@NonNull*/ [] __Component = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Componentlink =
		{
			Fragments._Componentlink__OclAny /* 0 */,
			Fragments._Componentlink__OclElement /* 1 */,
			Fragments._Componentlink__Entity /* 2 */,
			Fragments._Componentlink__Link /* 3 */,
			Fragments._Componentlink__Componentlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Componentlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Database =
		{
			Fragments._Database__OclAny /* 0 */,
			Fragments._Database__OclElement /* 1 */,
			Fragments._Database__MixinBase /* 2 */,
			Fragments._Database__Database /* 3 */
		};
		private static final int /*@NonNull*/ [] __Database = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Databaselink =
		{
			Fragments._Databaselink__OclAny /* 0 */,
			Fragments._Databaselink__OclElement /* 1 */,
			Fragments._Databaselink__MixinBase /* 2 */,
			Fragments._Databaselink__Databaselink /* 3 */
		};
		private static final int /*@NonNull*/ [] __Databaselink = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Res_tpl =
		{
			Fragments._Res_tpl__OclAny /* 0 */,
			Fragments._Res_tpl__OclElement /* 1 */,
			Fragments._Res_tpl__MixinBase /* 2 */,
			Fragments._Res_tpl__Res_tpl /* 3 */
		};
		private static final int /*@NonNull*/ [] __Res_tpl = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Status =
		{
			Fragments._Status__OclAny /* 0 */,
			Fragments._Status__OclElement /* 1 */,
			Fragments._Status__OclType /* 2 */,
			Fragments._Status__OclEnumeration /* 3 */,
			Fragments._Status__Status /* 4 */
		};
		private static final int /*@NonNull*/ [] __Status = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _URI =
		{
			Fragments._URI__OclAny /* 0 */,
			Fragments._URI__OclComparable /* 1 */,
			Fragments._URI__URI /* 2 */
		};
		private static final int /*@NonNull*/ [] __URI = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _URL =
		{
			Fragments._URL__OclAny /* 0 */,
			Fragments._URL__URL /* 1 */
		};
		private static final int /*@NonNull*/ [] __URL = { 1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._App_tpl.initFragments(_App_tpl, __App_tpl);
			Types._Application.initFragments(_Application, __Application);
			Types._Component.initFragments(_Component, __Component);
			Types._Componentlink.initFragments(_Componentlink, __Componentlink);
			Types._Database.initFragments(_Database, __Database);
			Types._Databaselink.initFragments(_Databaselink, __Databaselink);
			Types._Res_tpl.initFragments(_Res_tpl, __Res_tpl);
			Types._Status.initFragments(_Status, __Status);
			Types._URI.initFragments(_URI, __URI);
			Types._URL.initFragments(_URL, __URL);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _App_tpl__App_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _App_tpl__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _App_tpl__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _App_tpl__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__Application = {
			PlatformTables.Operations._Application__start /* start() */,
			PlatformTables.Operations._Application__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__Component = {
			PlatformTables.Operations._Component__start /* start() */,
			PlatformTables.Operations._Component__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Componentlink__Componentlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Componentlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Componentlink__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Componentlink__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Componentlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Database__Database = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Database__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Database__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Database__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Databaselink__Databaselink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Databaselink__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Databaselink__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Databaselink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Res_tpl__Res_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Res_tpl__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Res_tpl__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Res_tpl__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Status__Status = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Status__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Status__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Status__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Status__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _URI__URI = {
			PlatformTables.Operations._URI__compareTo /* compareTo(OclSelf[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _URI__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _URI__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable__compareTo /* compareTo(OclSelf[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _URL__URL = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _URL__OclAny = {
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
			Fragments._App_tpl__App_tpl.initOperations(_App_tpl__App_tpl);
			Fragments._App_tpl__MixinBase.initOperations(_App_tpl__MixinBase);
			Fragments._App_tpl__OclAny.initOperations(_App_tpl__OclAny);
			Fragments._App_tpl__OclElement.initOperations(_App_tpl__OclElement);

			Fragments._Application__Application.initOperations(_Application__Application);
			Fragments._Application__Entity.initOperations(_Application__Entity);
			Fragments._Application__OclAny.initOperations(_Application__OclAny);
			Fragments._Application__OclElement.initOperations(_Application__OclElement);
			Fragments._Application__Resource.initOperations(_Application__Resource);

			Fragments._Component__Component.initOperations(_Component__Component);
			Fragments._Component__Entity.initOperations(_Component__Entity);
			Fragments._Component__OclAny.initOperations(_Component__OclAny);
			Fragments._Component__OclElement.initOperations(_Component__OclElement);
			Fragments._Component__Resource.initOperations(_Component__Resource);

			Fragments._Componentlink__Componentlink.initOperations(_Componentlink__Componentlink);
			Fragments._Componentlink__Entity.initOperations(_Componentlink__Entity);
			Fragments._Componentlink__Link.initOperations(_Componentlink__Link);
			Fragments._Componentlink__OclAny.initOperations(_Componentlink__OclAny);
			Fragments._Componentlink__OclElement.initOperations(_Componentlink__OclElement);

			Fragments._Database__Database.initOperations(_Database__Database);
			Fragments._Database__MixinBase.initOperations(_Database__MixinBase);
			Fragments._Database__OclAny.initOperations(_Database__OclAny);
			Fragments._Database__OclElement.initOperations(_Database__OclElement);

			Fragments._Databaselink__Databaselink.initOperations(_Databaselink__Databaselink);
			Fragments._Databaselink__MixinBase.initOperations(_Databaselink__MixinBase);
			Fragments._Databaselink__OclAny.initOperations(_Databaselink__OclAny);
			Fragments._Databaselink__OclElement.initOperations(_Databaselink__OclElement);

			Fragments._Res_tpl__MixinBase.initOperations(_Res_tpl__MixinBase);
			Fragments._Res_tpl__OclAny.initOperations(_Res_tpl__OclAny);
			Fragments._Res_tpl__OclElement.initOperations(_Res_tpl__OclElement);
			Fragments._Res_tpl__Res_tpl.initOperations(_Res_tpl__Res_tpl);

			Fragments._Status__OclAny.initOperations(_Status__OclAny);
			Fragments._Status__OclElement.initOperations(_Status__OclElement);
			Fragments._Status__OclEnumeration.initOperations(_Status__OclEnumeration);
			Fragments._Status__OclType.initOperations(_Status__OclType);
			Fragments._Status__Status.initOperations(_Status__Status);

			Fragments._URI__OclAny.initOperations(_URI__OclAny);
			Fragments._URI__OclComparable.initOperations(_URI__OclComparable);
			Fragments._URI__URI.initOperations(_URI__URI);

			Fragments._URL__OclAny.initOperations(_URL__OclAny);
			Fragments._URL__URL.initOperations(_URL__URL);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _App_tpl = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Application = {
			PlatformTables.Properties._Application__occiAppContext,
			PlatformTables.Properties._Application__occiAppName,
			PlatformTables.Properties._Application__occiAppState,
			PlatformTables.Properties._Application__occiAppStateMessage,
			PlatformTables.Properties._Application__occiAppUrl
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Component = {
			PlatformTables.Properties._Component__occiComponentState,
			PlatformTables.Properties._Component__occiComponentStateMessage
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Componentlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Database = {
			PlatformTables.Properties._Database__occiDatabaseVersion
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Databaselink = {
			PlatformTables.Properties._Databaselink__occiDatabaseToken,
			PlatformTables.Properties._Databaselink__occiDatabaseUri,
			PlatformTables.Properties._Databaselink__occiDatabaseUsername
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Res_tpl = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Status = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _URI = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _URL = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._App_tpl__App_tpl.initProperties(_App_tpl);
			Fragments._Application__Application.initProperties(_Application);
			Fragments._Component__Component.initProperties(_Component);
			Fragments._Componentlink__Componentlink.initProperties(_Componentlink);
			Fragments._Database__Database.initProperties(_Database);
			Fragments._Databaselink__Databaselink.initProperties(_Databaselink);
			Fragments._Res_tpl__Res_tpl.initProperties(_Res_tpl);
			Fragments._Status__Status.initProperties(_Status);
			Fragments._URI__URI.initProperties(_URI);
			Fragments._URL__URL.initProperties(_URL);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::FragmentProperties and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Status__active = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.STATUS.getEEnumLiteral("active"), Types._Status, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Status__inactive = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.STATUS.getEEnumLiteral("inactive"), Types._Status, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Status__error = new EcoreExecutorEnumerationLiteral(PlatformPackage.Literals.STATUS.getEEnumLiteral("error"), Types._Status, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Status = {
			_Status__active,
			_Status__inactive,
			_Status__error
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Status.initLiterals(_Status);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PlatformTables::EnumerationLiterals and all preceding sub-packages.
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
