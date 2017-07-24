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
 *   /org.eclipse.cmf.occi.sla/model/sla.ecore
 * using:
 *   /org.eclipse.cmf.occi.sla/model/sla.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.sla;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.sla.SlaTables;
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
 * SlaTables provides the dispatch tables for the sla for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class SlaTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SlaPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", null, org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_sla_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/sla/ecore", null, org.eclipse.cmf.occi.sla.SlaPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Agreement = org.eclipse.cmf.occi.sla.SlaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_sla_s_ecore.getClassId("Agreement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Agreement_term = org.eclipse.cmf.occi.sla.SlaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_sla_s_ecore.getClassId("Agreement_term", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Agreement_tpl = org.eclipse.cmf.occi.sla.SlaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_sla_s_ecore.getClassId("Agreement_tpl", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.sla.SlaTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.sla.SlaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_DateTime = org.eclipse.cmf.occi.sla.SlaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_sla_s_ecore.getDataTypeId("DateTime", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_AgreementStatus = org.eclipse.cmf.occi.sla.SlaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_sla_s_ecore.getEnumerationId("AgreementStatus");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_AgreementTermStatus = org.eclipse.cmf.occi.sla.SlaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_sla_s_ecore.getEnumerationId("AgreementTermStatus");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_AgreementTermType = org.eclipse.cmf.occi.sla.SlaTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_sla_s_ecore.getEnumerationId("AgreementTermType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Agreement_term_c_c_appliesConstraint = "Agreement_term::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Agreement_tpl_c_c_appliesConstraint = "Agreement_tpl::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SlaTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SlaTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Agreement = new EcoreExecutorType(SlaPackage.Literals.AGREEMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _AgreementStatus = new EcoreExecutorEnumeration(SlaPackage.Literals.AGREEMENT_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _AgreementTermStatus = new EcoreExecutorEnumeration(SlaPackage.Literals.AGREEMENT_TERM_STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _AgreementTermType = new EcoreExecutorEnumeration(SlaPackage.Literals.AGREEMENT_TERM_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Agreement_link = new EcoreExecutorType(SlaPackage.Literals.AGREEMENT_LINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Agreement_term = new EcoreExecutorType(SlaPackage.Literals.AGREEMENT_TERM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Agreement_tpl = new EcoreExecutorType(SlaPackage.Literals.AGREEMENT_TPL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _DateTime = new EcoreExecutorType("DateTime", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Agreement,
			_AgreementStatus,
			_AgreementTermStatus,
			_AgreementTermType,
			_Agreement_link,
			_Agreement_term,
			_Agreement_tpl,
			_DateTime
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SlaTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Agreement__Agreement = new ExecutorFragment(Types._Agreement, SlaTables.Types._Agreement);
		private static final /*@NonNull*/ ExecutorFragment _Agreement__Entity = new ExecutorFragment(Types._Agreement, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Agreement__OclAny = new ExecutorFragment(Types._Agreement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Agreement__OclElement = new ExecutorFragment(Types._Agreement, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Agreement__Resource = new ExecutorFragment(Types._Agreement, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _AgreementStatus__AgreementStatus = new ExecutorFragment(Types._AgreementStatus, SlaTables.Types._AgreementStatus);
		private static final /*@NonNull*/ ExecutorFragment _AgreementStatus__OclAny = new ExecutorFragment(Types._AgreementStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AgreementStatus__OclElement = new ExecutorFragment(Types._AgreementStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _AgreementStatus__OclEnumeration = new ExecutorFragment(Types._AgreementStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _AgreementStatus__OclType = new ExecutorFragment(Types._AgreementStatus, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _AgreementTermStatus__AgreementTermStatus = new ExecutorFragment(Types._AgreementTermStatus, SlaTables.Types._AgreementTermStatus);
		private static final /*@NonNull*/ ExecutorFragment _AgreementTermStatus__OclAny = new ExecutorFragment(Types._AgreementTermStatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AgreementTermStatus__OclElement = new ExecutorFragment(Types._AgreementTermStatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _AgreementTermStatus__OclEnumeration = new ExecutorFragment(Types._AgreementTermStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _AgreementTermStatus__OclType = new ExecutorFragment(Types._AgreementTermStatus, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _AgreementTermType__AgreementTermType = new ExecutorFragment(Types._AgreementTermType, SlaTables.Types._AgreementTermType);
		private static final /*@NonNull*/ ExecutorFragment _AgreementTermType__OclAny = new ExecutorFragment(Types._AgreementTermType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AgreementTermType__OclElement = new ExecutorFragment(Types._AgreementTermType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _AgreementTermType__OclEnumeration = new ExecutorFragment(Types._AgreementTermType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _AgreementTermType__OclType = new ExecutorFragment(Types._AgreementTermType, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Agreement_link__Agreement_link = new ExecutorFragment(Types._Agreement_link, SlaTables.Types._Agreement_link);
		private static final /*@NonNull*/ ExecutorFragment _Agreement_link__Entity = new ExecutorFragment(Types._Agreement_link, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Agreement_link__Link = new ExecutorFragment(Types._Agreement_link, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Agreement_link__OclAny = new ExecutorFragment(Types._Agreement_link, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Agreement_link__OclElement = new ExecutorFragment(Types._Agreement_link, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Agreement_term__Agreement_term = new ExecutorFragment(Types._Agreement_term, SlaTables.Types._Agreement_term);
		private static final /*@NonNull*/ ExecutorFragment _Agreement_term__MixinBase = new ExecutorFragment(Types._Agreement_term, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Agreement_term__OclAny = new ExecutorFragment(Types._Agreement_term, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Agreement_term__OclElement = new ExecutorFragment(Types._Agreement_term, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Agreement_tpl__Agreement_tpl = new ExecutorFragment(Types._Agreement_tpl, SlaTables.Types._Agreement_tpl);
		private static final /*@NonNull*/ ExecutorFragment _Agreement_tpl__MixinBase = new ExecutorFragment(Types._Agreement_tpl, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Agreement_tpl__OclAny = new ExecutorFragment(Types._Agreement_tpl, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Agreement_tpl__OclElement = new ExecutorFragment(Types._Agreement_tpl, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _DateTime__DateTime = new ExecutorFragment(Types._DateTime, SlaTables.Types._DateTime);
		private static final /*@NonNull*/ ExecutorFragment _DateTime__OclAny = new ExecutorFragment(Types._DateTime, OCLstdlibTables.Types._OclAny);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SlaTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of SlaTables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Agreement__accept = new ExecutorOperation("accept", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agreement,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agreement__reject = new ExecutorOperation("reject", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agreement,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agreement__resume = new ExecutorOperation("resume", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agreement,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agreement__suspend = new ExecutorOperation("suspend", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agreement,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agreement__terminate = new ExecutorOperation("terminate", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agreement,
			4, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SlaTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Agreement__occiAgreementAgreedAt = new EcoreExecutorProperty(SlaPackage.Literals.AGREEMENT__OCCI_AGREEMENT_AGREED_AT, Types._Agreement, 0);
		public static final /*@NonNull*/ ExecutorProperty _Agreement__occiAgreementEffectiveFrom = new EcoreExecutorProperty(SlaPackage.Literals.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_FROM, Types._Agreement, 1);
		public static final /*@NonNull*/ ExecutorProperty _Agreement__occiAgreementEffectiveUntil = new EcoreExecutorProperty(SlaPackage.Literals.AGREEMENT__OCCI_AGREEMENT_EFFECTIVE_UNTIL, Types._Agreement, 2);
		public static final /*@NonNull*/ ExecutorProperty _Agreement__occiAgreementState = new EcoreExecutorProperty(SlaPackage.Literals.AGREEMENT__OCCI_AGREEMENT_STATE, Types._Agreement, 3);

		public static final /*@NonNull*/ ExecutorProperty _Agreement_term__occiAgreementTermDesc = new EcoreExecutorProperty(SlaPackage.Literals.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC, Types._Agreement_term, 0);
		public static final /*@NonNull*/ ExecutorProperty _Agreement_term__occiAgreementTermRemedy = new EcoreExecutorProperty(SlaPackage.Literals.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY, Types._Agreement_term, 1);
		public static final /*@NonNull*/ ExecutorProperty _Agreement_term__occiAgreementTermState = new EcoreExecutorProperty(SlaPackage.Literals.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE, Types._Agreement_term, 2);
		public static final /*@NonNull*/ ExecutorProperty _Agreement_term__occiAgreementTermType = new EcoreExecutorProperty(SlaPackage.Literals.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE, Types._Agreement_term, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SlaTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Agreement =
		{
			Fragments._Agreement__OclAny /* 0 */,
			Fragments._Agreement__OclElement /* 1 */,
			Fragments._Agreement__Entity /* 2 */,
			Fragments._Agreement__Resource /* 3 */,
			Fragments._Agreement__Agreement /* 4 */
		};
		private static final int /*@NonNull*/ [] __Agreement = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AgreementStatus =
		{
			Fragments._AgreementStatus__OclAny /* 0 */,
			Fragments._AgreementStatus__OclElement /* 1 */,
			Fragments._AgreementStatus__OclType /* 2 */,
			Fragments._AgreementStatus__OclEnumeration /* 3 */,
			Fragments._AgreementStatus__AgreementStatus /* 4 */
		};
		private static final int /*@NonNull*/ [] __AgreementStatus = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AgreementTermStatus =
		{
			Fragments._AgreementTermStatus__OclAny /* 0 */,
			Fragments._AgreementTermStatus__OclElement /* 1 */,
			Fragments._AgreementTermStatus__OclType /* 2 */,
			Fragments._AgreementTermStatus__OclEnumeration /* 3 */,
			Fragments._AgreementTermStatus__AgreementTermStatus /* 4 */
		};
		private static final int /*@NonNull*/ [] __AgreementTermStatus = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AgreementTermType =
		{
			Fragments._AgreementTermType__OclAny /* 0 */,
			Fragments._AgreementTermType__OclElement /* 1 */,
			Fragments._AgreementTermType__OclType /* 2 */,
			Fragments._AgreementTermType__OclEnumeration /* 3 */,
			Fragments._AgreementTermType__AgreementTermType /* 4 */
		};
		private static final int /*@NonNull*/ [] __AgreementTermType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Agreement_link =
		{
			Fragments._Agreement_link__OclAny /* 0 */,
			Fragments._Agreement_link__OclElement /* 1 */,
			Fragments._Agreement_link__Entity /* 2 */,
			Fragments._Agreement_link__Link /* 3 */,
			Fragments._Agreement_link__Agreement_link /* 4 */
		};
		private static final int /*@NonNull*/ [] __Agreement_link = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Agreement_term =
		{
			Fragments._Agreement_term__OclAny /* 0 */,
			Fragments._Agreement_term__OclElement /* 1 */,
			Fragments._Agreement_term__MixinBase /* 2 */,
			Fragments._Agreement_term__Agreement_term /* 3 */
		};
		private static final int /*@NonNull*/ [] __Agreement_term = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Agreement_tpl =
		{
			Fragments._Agreement_tpl__OclAny /* 0 */,
			Fragments._Agreement_tpl__OclElement /* 1 */,
			Fragments._Agreement_tpl__MixinBase /* 2 */,
			Fragments._Agreement_tpl__Agreement_tpl /* 3 */
		};
		private static final int /*@NonNull*/ [] __Agreement_tpl = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DateTime =
		{
			Fragments._DateTime__OclAny /* 0 */,
			Fragments._DateTime__DateTime /* 1 */
		};
		private static final int /*@NonNull*/ [] __DateTime = { 1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Agreement.initFragments(_Agreement, __Agreement);
			Types._AgreementStatus.initFragments(_AgreementStatus, __AgreementStatus);
			Types._AgreementTermStatus.initFragments(_AgreementTermStatus, __AgreementTermStatus);
			Types._AgreementTermType.initFragments(_AgreementTermType, __AgreementTermType);
			Types._Agreement_link.initFragments(_Agreement_link, __Agreement_link);
			Types._Agreement_term.initFragments(_Agreement_term, __Agreement_term);
			Types._Agreement_tpl.initFragments(_Agreement_tpl, __Agreement_tpl);
			Types._DateTime.initFragments(_DateTime, __DateTime);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SlaTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement__Agreement = {
			SlaTables.Operations._Agreement__accept /* accept() */,
			SlaTables.Operations._Agreement__reject /* reject() */,
			SlaTables.Operations._Agreement__resume /* resume() */,
			SlaTables.Operations._Agreement__suspend /* suspend() */,
			SlaTables.Operations._Agreement__terminate /* terminate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementStatus__AgreementStatus = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementStatus__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementTermStatus__AgreementTermStatus = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementTermStatus__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementTermStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementTermStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementTermStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementTermType__AgreementTermType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementTermType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementTermType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementTermType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AgreementTermType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_link__Agreement_link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_link__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_link__Link = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_link__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_link__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_term__Agreement_term = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_term__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_term__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_term__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_tpl__Agreement_tpl = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_tpl__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_tpl__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agreement_tpl__OclElement = {
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

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Agreement__Agreement.initOperations(_Agreement__Agreement);
			Fragments._Agreement__Entity.initOperations(_Agreement__Entity);
			Fragments._Agreement__OclAny.initOperations(_Agreement__OclAny);
			Fragments._Agreement__OclElement.initOperations(_Agreement__OclElement);
			Fragments._Agreement__Resource.initOperations(_Agreement__Resource);

			Fragments._AgreementStatus__AgreementStatus.initOperations(_AgreementStatus__AgreementStatus);
			Fragments._AgreementStatus__OclAny.initOperations(_AgreementStatus__OclAny);
			Fragments._AgreementStatus__OclElement.initOperations(_AgreementStatus__OclElement);
			Fragments._AgreementStatus__OclEnumeration.initOperations(_AgreementStatus__OclEnumeration);
			Fragments._AgreementStatus__OclType.initOperations(_AgreementStatus__OclType);

			Fragments._AgreementTermStatus__AgreementTermStatus.initOperations(_AgreementTermStatus__AgreementTermStatus);
			Fragments._AgreementTermStatus__OclAny.initOperations(_AgreementTermStatus__OclAny);
			Fragments._AgreementTermStatus__OclElement.initOperations(_AgreementTermStatus__OclElement);
			Fragments._AgreementTermStatus__OclEnumeration.initOperations(_AgreementTermStatus__OclEnumeration);
			Fragments._AgreementTermStatus__OclType.initOperations(_AgreementTermStatus__OclType);

			Fragments._AgreementTermType__AgreementTermType.initOperations(_AgreementTermType__AgreementTermType);
			Fragments._AgreementTermType__OclAny.initOperations(_AgreementTermType__OclAny);
			Fragments._AgreementTermType__OclElement.initOperations(_AgreementTermType__OclElement);
			Fragments._AgreementTermType__OclEnumeration.initOperations(_AgreementTermType__OclEnumeration);
			Fragments._AgreementTermType__OclType.initOperations(_AgreementTermType__OclType);

			Fragments._Agreement_link__Agreement_link.initOperations(_Agreement_link__Agreement_link);
			Fragments._Agreement_link__Entity.initOperations(_Agreement_link__Entity);
			Fragments._Agreement_link__Link.initOperations(_Agreement_link__Link);
			Fragments._Agreement_link__OclAny.initOperations(_Agreement_link__OclAny);
			Fragments._Agreement_link__OclElement.initOperations(_Agreement_link__OclElement);

			Fragments._Agreement_term__Agreement_term.initOperations(_Agreement_term__Agreement_term);
			Fragments._Agreement_term__MixinBase.initOperations(_Agreement_term__MixinBase);
			Fragments._Agreement_term__OclAny.initOperations(_Agreement_term__OclAny);
			Fragments._Agreement_term__OclElement.initOperations(_Agreement_term__OclElement);

			Fragments._Agreement_tpl__Agreement_tpl.initOperations(_Agreement_tpl__Agreement_tpl);
			Fragments._Agreement_tpl__MixinBase.initOperations(_Agreement_tpl__MixinBase);
			Fragments._Agreement_tpl__OclAny.initOperations(_Agreement_tpl__OclAny);
			Fragments._Agreement_tpl__OclElement.initOperations(_Agreement_tpl__OclElement);

			Fragments._DateTime__DateTime.initOperations(_DateTime__DateTime);
			Fragments._DateTime__OclAny.initOperations(_DateTime__OclAny);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SlaTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Agreement = {
			SlaTables.Properties._Agreement__occiAgreementAgreedAt,
			SlaTables.Properties._Agreement__occiAgreementEffectiveFrom,
			SlaTables.Properties._Agreement__occiAgreementEffectiveUntil,
			SlaTables.Properties._Agreement__occiAgreementState
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AgreementStatus = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AgreementTermStatus = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AgreementTermType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Agreement_link = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Agreement_term = {
			SlaTables.Properties._Agreement_term__occiAgreementTermDesc,
			SlaTables.Properties._Agreement_term__occiAgreementTermRemedy,
			SlaTables.Properties._Agreement_term__occiAgreementTermState,
			SlaTables.Properties._Agreement_term__occiAgreementTermType
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Agreement_tpl = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DateTime = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Agreement__Agreement.initProperties(_Agreement);
			Fragments._AgreementStatus__AgreementStatus.initProperties(_AgreementStatus);
			Fragments._AgreementTermStatus__AgreementTermStatus.initProperties(_AgreementTermStatus);
			Fragments._AgreementTermType__AgreementTermType.initProperties(_AgreementTermType);
			Fragments._Agreement_link__Agreement_link.initProperties(_Agreement_link);
			Fragments._Agreement_term__Agreement_term.initProperties(_Agreement_term);
			Fragments._Agreement_tpl__Agreement_tpl.initProperties(_Agreement_tpl);
			Fragments._DateTime__DateTime.initProperties(_DateTime);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SlaTables::FragmentProperties and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AgreementStatus__Pending = new EcoreExecutorEnumerationLiteral(SlaPackage.Literals.AGREEMENT_STATUS.getEEnumLiteral("Pending"), Types._AgreementStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AgreementStatus__Accepted = new EcoreExecutorEnumerationLiteral(SlaPackage.Literals.AGREEMENT_STATUS.getEEnumLiteral("Accepted"), Types._AgreementStatus, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AgreementStatus__Rejected = new EcoreExecutorEnumerationLiteral(SlaPackage.Literals.AGREEMENT_STATUS.getEEnumLiteral("Rejected"), Types._AgreementStatus, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AgreementStatus__Suspended = new EcoreExecutorEnumerationLiteral(SlaPackage.Literals.AGREEMENT_STATUS.getEEnumLiteral("Suspended"), Types._AgreementStatus, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AgreementStatus__Terminated = new EcoreExecutorEnumerationLiteral(SlaPackage.Literals.AGREEMENT_STATUS.getEEnumLiteral("Terminated"), Types._AgreementStatus, 4);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AgreementStatus = {
			_AgreementStatus__Pending,
			_AgreementStatus__Accepted,
			_AgreementStatus__Rejected,
			_AgreementStatus__Suspended,
			_AgreementStatus__Terminated
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AgreementTermStatus__Undefined = new EcoreExecutorEnumerationLiteral(SlaPackage.Literals.AGREEMENT_TERM_STATUS.getEEnumLiteral("Undefined"), Types._AgreementTermStatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AgreementTermStatus__Fulfilled = new EcoreExecutorEnumerationLiteral(SlaPackage.Literals.AGREEMENT_TERM_STATUS.getEEnumLiteral("Fulfilled"), Types._AgreementTermStatus, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AgreementTermStatus__Violated = new EcoreExecutorEnumerationLiteral(SlaPackage.Literals.AGREEMENT_TERM_STATUS.getEEnumLiteral("Violated"), Types._AgreementTermStatus, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AgreementTermStatus = {
			_AgreementTermStatus__Undefined,
			_AgreementTermStatus__Fulfilled,
			_AgreementTermStatus__Violated
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AgreementTermType__SERVICE = new EcoreExecutorEnumerationLiteral(SlaPackage.Literals.AGREEMENT_TERM_TYPE.getEEnumLiteral("SERVICE"), Types._AgreementTermType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _AgreementTermType__SLO = new EcoreExecutorEnumerationLiteral(SlaPackage.Literals.AGREEMENT_TERM_TYPE.getEEnumLiteral("SLO"), Types._AgreementTermType, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AgreementTermType = {
			_AgreementTermType__SERVICE,
			_AgreementTermType__SLO
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._AgreementStatus.initLiterals(_AgreementStatus);
			Types._AgreementTermStatus.initLiterals(_AgreementTermStatus);
			Types._AgreementTermType.initLiterals(_AgreementTermType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SlaTables::EnumerationLiterals and all preceding sub-packages.
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
