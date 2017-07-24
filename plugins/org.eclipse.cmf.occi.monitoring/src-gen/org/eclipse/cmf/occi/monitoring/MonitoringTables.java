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
 *   /org.eclipse.cmf.occi.monitoring/model/monitoring.ecore
 * using:
 *   /org.eclipse.cmf.occi.monitoring/model/monitoring.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.monitoring;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.monitoring.MonitoringTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * MonitoringTables provides the dispatch tables for the monitoring for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class MonitoringTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MonitoringPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", null, org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/monitoring/ecore", null, org.eclipse.cmf.occi.monitoring.MonitoringPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Aggregator = org.eclipse.cmf.occi.monitoring.MonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore.getClassId("Aggregator", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.monitoring.MonitoringTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Collector = org.eclipse.cmf.occi.monitoring.MonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore.getClassId("Collector", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.monitoring.MonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Metric = org.eclipse.cmf.occi.monitoring.MonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore.getClassId("Metric", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Publisher = org.eclipse.cmf.occi.monitoring.MonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore.getClassId("Publisher", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Sensor = org.eclipse.cmf.occi.monitoring.MonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore.getClassId("Sensor", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_DateTime = org.eclipse.cmf.occi.monitoring.MonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore.getDataTypeId("DateTime", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Second = org.eclipse.cmf.occi.monitoring.MonitoringTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_monitoring_s_ecore.getDataTypeId("Second", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Aggregator_c_c_appliesConstraint = "Aggregator::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Metric_c_c_appliesConstraint = "Metric::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Publisher_c_c_appliesConstraint = "Publisher::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MonitoringTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MonitoringTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Aggregator = new EcoreExecutorType(MonitoringPackage.Literals.AGGREGATOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Collector = new EcoreExecutorType(MonitoringPackage.Literals.COLLECTOR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _DateTime = new EcoreExecutorType("DateTime", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Metric = new EcoreExecutorType(MonitoringPackage.Literals.METRIC, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Publisher = new EcoreExecutorType(MonitoringPackage.Literals.PUBLISHER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Second = new EcoreExecutorType("Second", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sensor = new EcoreExecutorType(MonitoringPackage.Literals.SENSOR, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Aggregator,
			_Collector,
			_DateTime,
			_Metric,
			_Publisher,
			_Second,
			_Sensor
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MonitoringTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Aggregator__Aggregator = new ExecutorFragment(Types._Aggregator, MonitoringTables.Types._Aggregator);
		private static final /*@NonNull*/ ExecutorFragment _Aggregator__MixinBase = new ExecutorFragment(Types._Aggregator, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Aggregator__OclAny = new ExecutorFragment(Types._Aggregator, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Aggregator__OclElement = new ExecutorFragment(Types._Aggregator, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Collector__Collector = new ExecutorFragment(Types._Collector, MonitoringTables.Types._Collector);
		private static final /*@NonNull*/ ExecutorFragment _Collector__Entity = new ExecutorFragment(Types._Collector, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Collector__Link = new ExecutorFragment(Types._Collector, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Collector__OclAny = new ExecutorFragment(Types._Collector, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Collector__OclElement = new ExecutorFragment(Types._Collector, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _DateTime__DateTime = new ExecutorFragment(Types._DateTime, MonitoringTables.Types._DateTime);
		private static final /*@NonNull*/ ExecutorFragment _DateTime__OclAny = new ExecutorFragment(Types._DateTime, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Metric__Metric = new ExecutorFragment(Types._Metric, MonitoringTables.Types._Metric);
		private static final /*@NonNull*/ ExecutorFragment _Metric__MixinBase = new ExecutorFragment(Types._Metric, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Metric__OclAny = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Metric__OclElement = new ExecutorFragment(Types._Metric, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Publisher__MixinBase = new ExecutorFragment(Types._Publisher, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Publisher__OclAny = new ExecutorFragment(Types._Publisher, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Publisher__OclElement = new ExecutorFragment(Types._Publisher, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Publisher__Publisher = new ExecutorFragment(Types._Publisher, MonitoringTables.Types._Publisher);

		private static final /*@NonNull*/ ExecutorFragment _Second__OclAny = new ExecutorFragment(Types._Second, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Second__Second = new ExecutorFragment(Types._Second, MonitoringTables.Types._Second);

		private static final /*@NonNull*/ ExecutorFragment _Sensor__Entity = new ExecutorFragment(Types._Sensor, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Sensor__OclAny = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sensor__OclElement = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sensor__Resource = new ExecutorFragment(Types._Sensor, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Sensor__Sensor = new ExecutorFragment(Types._Sensor, MonitoringTables.Types._Sensor);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MonitoringTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of MonitoringTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of MonitoringTables::Operations and all preceding sub-packages.
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


		public static final /*@NonNull*/ ExecutorProperty _Collector__occiCollectorPeriod = new EcoreExecutorProperty(MonitoringPackage.Literals.COLLECTOR__OCCI_COLLECTOR_PERIOD, Types._Collector, 0);
		public static final /*@NonNull*/ ExecutorProperty _Collector__occiSensorAccuracy = new EcoreExecutorProperty(MonitoringPackage.Literals.COLLECTOR__OCCI_SENSOR_ACCURACY, Types._Collector, 1);
		public static final /*@NonNull*/ ExecutorProperty _Collector__occiSensorGranularity = new EcoreExecutorProperty(MonitoringPackage.Literals.COLLECTOR__OCCI_SENSOR_GRANULARITY, Types._Collector, 2);

		public static final /*@NonNull*/ ExecutorProperty _Sensor__occiSensorAccuracy = new EcoreExecutorProperty(MonitoringPackage.Literals.SENSOR__OCCI_SENSOR_ACCURACY, Types._Sensor, 0);
		public static final /*@NonNull*/ ExecutorProperty _Sensor__occiSensorGranularity = new EcoreExecutorProperty(MonitoringPackage.Literals.SENSOR__OCCI_SENSOR_GRANULARITY, Types._Sensor, 1);
		public static final /*@NonNull*/ ExecutorProperty _Sensor__occiSensorPeriod = new EcoreExecutorProperty(MonitoringPackage.Literals.SENSOR__OCCI_SENSOR_PERIOD, Types._Sensor, 2);
		public static final /*@NonNull*/ ExecutorProperty _Sensor__occiSensorTimebase = new EcoreExecutorProperty(MonitoringPackage.Literals.SENSOR__OCCI_SENSOR_TIMEBASE, Types._Sensor, 3);
		public static final /*@NonNull*/ ExecutorProperty _Sensor__occiSensorTimestart = new EcoreExecutorProperty(MonitoringPackage.Literals.SENSOR__OCCI_SENSOR_TIMESTART, Types._Sensor, 4);
		public static final /*@NonNull*/ ExecutorProperty _Sensor__occiSensorTimestop = new EcoreExecutorProperty(MonitoringPackage.Literals.SENSOR__OCCI_SENSOR_TIMESTOP, Types._Sensor, 5);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MonitoringTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Aggregator =
		{
			Fragments._Aggregator__OclAny /* 0 */,
			Fragments._Aggregator__OclElement /* 1 */,
			Fragments._Aggregator__MixinBase /* 2 */,
			Fragments._Aggregator__Aggregator /* 3 */
		};
		private static final int /*@NonNull*/ [] __Aggregator = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Collector =
		{
			Fragments._Collector__OclAny /* 0 */,
			Fragments._Collector__OclElement /* 1 */,
			Fragments._Collector__Entity /* 2 */,
			Fragments._Collector__Link /* 3 */,
			Fragments._Collector__Collector /* 4 */
		};
		private static final int /*@NonNull*/ [] __Collector = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DateTime =
		{
			Fragments._DateTime__OclAny /* 0 */,
			Fragments._DateTime__DateTime /* 1 */
		};
		private static final int /*@NonNull*/ [] __DateTime = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Metric =
		{
			Fragments._Metric__OclAny /* 0 */,
			Fragments._Metric__OclElement /* 1 */,
			Fragments._Metric__MixinBase /* 2 */,
			Fragments._Metric__Metric /* 3 */
		};
		private static final int /*@NonNull*/ [] __Metric = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Publisher =
		{
			Fragments._Publisher__OclAny /* 0 */,
			Fragments._Publisher__OclElement /* 1 */,
			Fragments._Publisher__MixinBase /* 2 */,
			Fragments._Publisher__Publisher /* 3 */
		};
		private static final int /*@NonNull*/ [] __Publisher = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Second =
		{
			Fragments._Second__OclAny /* 0 */,
			Fragments._Second__Second /* 1 */
		};
		private static final int /*@NonNull*/ [] __Second = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sensor =
		{
			Fragments._Sensor__OclAny /* 0 */,
			Fragments._Sensor__OclElement /* 1 */,
			Fragments._Sensor__Entity /* 2 */,
			Fragments._Sensor__Resource /* 3 */,
			Fragments._Sensor__Sensor /* 4 */
		};
		private static final int /*@NonNull*/ [] __Sensor = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Aggregator.initFragments(_Aggregator, __Aggregator);
			Types._Collector.initFragments(_Collector, __Collector);
			Types._DateTime.initFragments(_DateTime, __DateTime);
			Types._Metric.initFragments(_Metric, __Metric);
			Types._Publisher.initFragments(_Publisher, __Publisher);
			Types._Second.initFragments(_Second, __Second);
			Types._Sensor.initFragments(_Sensor, __Sensor);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MonitoringTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Aggregator__Aggregator = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Aggregator__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Aggregator__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Aggregator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Collector__Collector = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Collector__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Collector__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Collector__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Collector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DateTime__DateTime = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DateTime__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__Metric = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Metric__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publisher__Publisher = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publisher__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publisher__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Publisher__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Second__Second = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Second__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__Sensor = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensor__Resource = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Aggregator__Aggregator.initOperations(_Aggregator__Aggregator);
			Fragments._Aggregator__MixinBase.initOperations(_Aggregator__MixinBase);
			Fragments._Aggregator__OclAny.initOperations(_Aggregator__OclAny);
			Fragments._Aggregator__OclElement.initOperations(_Aggregator__OclElement);

			Fragments._Collector__Collector.initOperations(_Collector__Collector);
			Fragments._Collector__Entity.initOperations(_Collector__Entity);
			Fragments._Collector__Link.initOperations(_Collector__Link);
			Fragments._Collector__OclAny.initOperations(_Collector__OclAny);
			Fragments._Collector__OclElement.initOperations(_Collector__OclElement);

			Fragments._DateTime__DateTime.initOperations(_DateTime__DateTime);
			Fragments._DateTime__OclAny.initOperations(_DateTime__OclAny);

			Fragments._Metric__Metric.initOperations(_Metric__Metric);
			Fragments._Metric__MixinBase.initOperations(_Metric__MixinBase);
			Fragments._Metric__OclAny.initOperations(_Metric__OclAny);
			Fragments._Metric__OclElement.initOperations(_Metric__OclElement);

			Fragments._Publisher__MixinBase.initOperations(_Publisher__MixinBase);
			Fragments._Publisher__OclAny.initOperations(_Publisher__OclAny);
			Fragments._Publisher__OclElement.initOperations(_Publisher__OclElement);
			Fragments._Publisher__Publisher.initOperations(_Publisher__Publisher);

			Fragments._Second__OclAny.initOperations(_Second__OclAny);
			Fragments._Second__Second.initOperations(_Second__Second);

			Fragments._Sensor__Entity.initOperations(_Sensor__Entity);
			Fragments._Sensor__OclAny.initOperations(_Sensor__OclAny);
			Fragments._Sensor__OclElement.initOperations(_Sensor__OclElement);
			Fragments._Sensor__Resource.initOperations(_Sensor__Resource);
			Fragments._Sensor__Sensor.initOperations(_Sensor__Sensor);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MonitoringTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Aggregator = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Collector = {
			MonitoringTables.Properties._Collector__occiCollectorPeriod,
			MonitoringTables.Properties._Collector__occiSensorAccuracy,
			MonitoringTables.Properties._Collector__occiSensorGranularity
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DateTime = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Metric = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Publisher = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Second = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sensor = {
			MonitoringTables.Properties._Sensor__occiSensorAccuracy,
			MonitoringTables.Properties._Sensor__occiSensorGranularity,
			MonitoringTables.Properties._Sensor__occiSensorPeriod,
			MonitoringTables.Properties._Sensor__occiSensorTimebase,
			MonitoringTables.Properties._Sensor__occiSensorTimestart,
			MonitoringTables.Properties._Sensor__occiSensorTimestop
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Aggregator__Aggregator.initProperties(_Aggregator);
			Fragments._Collector__Collector.initProperties(_Collector);
			Fragments._DateTime__DateTime.initProperties(_DateTime);
			Fragments._Metric__Metric.initProperties(_Metric);
			Fragments._Publisher__Publisher.initProperties(_Publisher);
			Fragments._Second__Second.initProperties(_Second);
			Fragments._Sensor__Sensor.initProperties(_Sensor);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MonitoringTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of MonitoringTables::EnumerationLiterals and all preceding sub-packages.
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
