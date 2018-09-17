/*******************************************************************************
 * Copyright (c) 2015-17 Obeo, Inria
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.eclipse.cmf.occi.core/model/OCCI.ecore
 * using:
 *   /org.eclipse.cmf.occi.core/model/OCCI.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.core;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * OCCITables provides the dispatch tables for the occi for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class OCCITables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(OCCIPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", null, org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_PRIMid_String = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.ocl.pivot.ids.TypeId.STRING);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Action = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Action", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AnnotatedElement = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("AnnotatedElement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Annotation = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Annotation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ArrayType = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("ArrayType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Attribute = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Attribute", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_AttributeState = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("AttributeState", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_BooleanType = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("BooleanType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Category = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Category", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.eclipse.cmf.occi.core.OCCITables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Configuration = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Configuration", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Constraint = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Constraint", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_DataType = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("DataType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_EObjectType = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("EObjectType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_EnumerationLiteral = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("EnumerationLiteral", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_EnumerationType = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("EnumerationType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Extension = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Extension", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_FSM = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("FSM", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Kind = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Kind", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Link = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Link", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Mixin = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Mixin", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_MixinBase = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("MixinBase", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_OclElement = org.eclipse.cmf.occi.core.OCCITables.PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RecordField = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("RecordField", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_RecordType = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("RecordType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_State = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("State", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_StringType = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("StringType", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Transition = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Transition", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Type = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Type", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_AttributeName = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getDataTypeId("AttributeName", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EIntegerObject = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EIntegerObject", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Name = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getDataTypeId("Name", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_OCL = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getDataTypeId("OCL", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Scheme = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getDataTypeId("Scheme", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_URI = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getDataTypeId("URI", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_NumericTypeEnum = org.eclipse.cmf.occi.core.OCCITables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getEnumerationId("NumericTypeEnum");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_1 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.TuplePartId PARTid_ = org.eclipse.ocl.pivot.ids.IdManager.getTuplePartId(2, "status", org.eclipse.ocl.pivot.ids.TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.TuplePartId PARTid__0 = org.eclipse.ocl.pivot.ids.IdManager.getTuplePartId(0, "message", org.eclipse.ocl.pivot.ids.TypeId.STRING);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.TuplePartId PARTid__1 = org.eclipse.ocl.pivot.ids.IdManager.getTuplePartId(1, "severity", org.eclipse.ocl.pivot.ids.TypeId.INTEGER);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.TuplePartId PARTid__2 = org.eclipse.ocl.pivot.ids.IdManager.getTuplePartId(3, "status", org.eclipse.ocl.pivot.ids.TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.TuplePartId PARTid__3 = org.eclipse.ocl.pivot.ids.IdManager.getTuplePartId(2, "severity", org.eclipse.ocl.pivot.ids.TypeId.INTEGER);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.TuplePartId PARTid__4 = org.eclipse.ocl.pivot.ids.IdManager.getTuplePartId(1, "quickfix", org.eclipse.ocl.pivot.ids.TypeId.STRING);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_PRIMid_String = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.ocl.pivot.ids.TypeId.STRING);
	public static final /*@NonInvalid*/ java.lang.String STR_Action_c_c_CorrectScheme = "Action::CorrectScheme";
	public static final /*@NonInvalid*/ java.lang.String STR_Action_c_c_containedAction = "Action::containedAction";
	public static final /*@NonInvalid*/ java.lang.String STR_ArrayType_c_c_TypeDifferentContainer = "ArrayType::TypeDifferentContainer";
	public static final /*@NonInvalid*/ java.lang.String STR_Attribute_c_c_DefaultValueMustBeInstanceOfType = "Attribute::DefaultValueMustBeInstanceOfType";
	public static final /*@NonInvalid*/ java.lang.String STR_Category_c_c_AttributesNameUnique = "Category::AttributesNameUnique";
	public static final /*@NonInvalid*/ java.lang.String STR_Category_c_c_IdentityUnique = "Category::IdentityUnique";
	public static final /*@NonInvalid*/ java.lang.String STR_Category_c_c_SchemeEndsWithSharp = "Category::SchemeEndsWithSharp";
	public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllMixinsAreTags = "Configuration::AllMixinsAreTags";
	public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllResourcesKindsInUse = "Configuration::AllResourcesKindsInUse";
	public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllResourcesLinksKindsInUse = "Configuration::AllResourcesLinksKindsInUse";
	public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllResourcesLinksMixinsInUse = "Configuration::AllResourcesLinksMixinsInUse";
	public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllResourcesLinksTargetsInConfiguration = "Configuration::AllResourcesLinksTargetsInConfiguration";
	public static final /*@NonInvalid*/ java.lang.String STR_Configuration_c_c_AllResourcesMixinsInUse = "Configuration::AllResourcesMixinsInUse";
	public static final /*@NonInvalid*/ java.lang.String STR_DataType_c_c_DataTypeNameRegex = "DataType::DataTypeNameRegex";
	public static final /*@NonInvalid*/ java.lang.String STR_EObjectType_c_c_instanceClassNameMustHaveValue = "EObjectType::instanceClassNameMustHaveValue";
	public static final /*@NonInvalid*/ java.lang.String STR_Entity_c_c_AttributesNameUnique = "Entity::AttributesNameUnique";
	public static final /*@NonInvalid*/ java.lang.String STR_Entity_c_c_DifferentMixins = "Entity::DifferentMixins";
	public static final /*@NonInvalid*/ java.lang.String STR_Entity_c_c_IdUnique = "Entity::IdUnique";
	public static final /*@NonInvalid*/ java.lang.String STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin = "Entity::KindCompatibleWithOneAppliesOfEachMixin";
	public static final /*@NonInvalid*/ java.lang.String STR_EnumerationLiteral_c_c_EnumerationLiteralNameRegex = "EnumerationLiteral::EnumerationLiteralNameRegex";
	public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_KindParentLocalOrImported = "Extension::KindParentLocalOrImported";
	public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_KindsSchemeValid = "Extension::KindsSchemeValid";
	public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_MixinAppliesLocalOrImported = "Extension::MixinAppliesLocalOrImported";
	public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_MixinDependsLocalOrImported = "Extension::MixinDependsLocalOrImported";
	public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_MixinsSchemeValid = "Extension::MixinsSchemeValid";
	public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_SchemeUnique = "Extension::SchemeUnique";
	public static final /*@NonInvalid*/ java.lang.String STR_Extension_c_c_TermUnicity = "Extension::TermUnicity";
	public static final /*@NonInvalid*/ java.lang.String STR_FSM_c_c_AttributeTypeMustBeEEnum = "FSM::AttributeTypeMustBeEEnum";
	public static final /*@NonInvalid*/ java.lang.String STR_FSM_c_c_containedAttribute = "FSM::containedAttribute";
	public static final /*@NonInvalid*/ java.lang.String STR_Kind_c_c_AttributesNameNotAlreadyDefinedInParent = "Kind::AttributesNameNotAlreadyDefinedInParent";
	public static final /*@NonInvalid*/ java.lang.String STR_Kind_c_c_CorrectScheme = "Kind::CorrectScheme";
	public static final /*@NonInvalid*/ java.lang.String STR_Kind_c_c_EntityKindIsRootParent = "Kind::EntityKindIsRootParent";
	public static final /*@NonInvalid*/ java.lang.String STR_Kind_c_c_NoCyclicInheritance = "Kind::NoCyclicInheritance";
	public static final /*@NonInvalid*/ java.lang.String STR_Kind_c_c_sourceReferenceInvariant = "Kind::sourceReferenceInvariant";
	public static final /*@NonInvalid*/ java.lang.String STR_Kind_c_c_targetReferenceInvariant = "Kind::targetReferenceInvariant";
	public static final /*@NonInvalid*/ java.lang.String STR_Link_c_c_LinkKindIsInParent = "Link::LinkKindIsInParent";
	public static final /*@NonInvalid*/ java.lang.String STR_Link_c_c_sourceReferenceInvariant = "Link::sourceReferenceInvariant";
	public static final /*@NonInvalid*/ java.lang.String STR_Link_c_c_targetReferenceInvariant = "Link::targetReferenceInvariant";
	public static final /*@NonInvalid*/ java.lang.String STR_Mixin_c_c_AttributesNameNotAlreadyDefinedInDepends = "Mixin::AttributesNameNotAlreadyDefinedInDepends";
	public static final /*@NonInvalid*/ java.lang.String STR_Mixin_c_c_CorrectScheme = "Mixin::CorrectScheme";
	public static final /*@NonInvalid*/ java.lang.String STR_Mixin_c_c_NoCyclicInheritance = "Mixin::NoCyclicInheritance";
	public static final /*@NonInvalid*/ java.lang.String STR_RecordField_c_c_ContainerMustBeRecordType = "RecordField::ContainerMustBeRecordType";
	public static final /*@NonInvalid*/ java.lang.String STR_RecordField_c_c_RecordFieldNameRegex = "RecordField::RecordFieldNameRegex";
	public static final /*@NonInvalid*/ java.lang.String STR_RecordField_c_c_TypeDifferentContainer = "RecordField::TypeDifferentContainer";
	public static final /*@NonInvalid*/ java.lang.String STR_Resource_c_c_ResourceKindIsInParent = "Resource::ResourceKindIsInParent";
	public static final /*@NonInvalid*/ java.lang.String STR_State_c_c_StateLiteralAlreadyDefinedInFSMAttributeType = "State::StateLiteralAlreadyDefinedInFSMAttributeType";
	public static final /*@NonInvalid*/ java.lang.String STR_StringType_c_c_PatternMustBeNotEmpty = "StringType::PatternMustBeNotEmpty";
	public static final /*@NonInvalid*/ java.lang.String STR_The_32_action_32 = "The action ";
	public static final /*@NonInvalid*/ java.lang.String STR_The_32_action_32_of_32_Transition_32_instance_32_coming_32_from_32_the_32_34 = "The action of Transition instance coming from the \"";
	public static final /*@NonInvalid*/ java.lang.String STR_The_32_default_32_value_32_of_32_the_32_attribute_32 = "The default value of the attribute ";
	public static final /*@NonInvalid*/ java.lang.String STR_The_32_kind_32_of_32_the_32_source_32_reference_32_in_32_the_32_link_32_instance_32 = "The kind of the source reference in the link instance ";
	public static final /*@NonInvalid*/ java.lang.String STR_The_32_kind_32_of_32_the_32_target_32_reference_32_in_32_the_32_link_32_instance_32 = "The kind of the target reference in the link instance ";
	public static final /*@NonInvalid*/ java.lang.String STR_The_32_source_32_reference_32_of_32 = "The source reference of ";
	public static final /*@NonInvalid*/ java.lang.String STR_The_32_target_32_reference_32_of_32 = "The target reference of ";
	public static final /*@NonInvalid*/ java.lang.String STR_Transition_c_c_containedActionMustBeDeclaredInTheAppropriateType = "Transition::containedActionMustBeDeclaredInTheAppropriateType";
	public static final /*@NonInvalid*/ java.lang.String STR_Two_32_instances_32_of_32_the_32_same_32_mixin_32_are_32_not_32_allowed_32_on_32_the_32_same_32_Enti = "Two instances of the same mixin are not allowed on the same Entity ";
	public static final /*@NonInvalid*/ java.lang.String STR_Type_c_c_ActionTermUnicity = "Type::ActionTermUnicity";
	public static final /*@NonInvalid*/ java.lang.String STR_Type_c_c_ConstraintNameUnique = "Type::ConstraintNameUnique";
	public static final /*@NonInvalid*/ java.lang.String STR__32_Kind = " Kind";
	public static final /*@NonInvalid*/ java.lang.String STR__32_declared_32_in_32 = " declared in ";
	public static final /*@NonInvalid*/ java.lang.String STR__32_doesn_39_t_32_appear_32_in_32_the_32_FSM_32_of_32 = " doesn\'t appear in the FSM of ";
	public static final /*@NonInvalid*/ java.lang.String STR__32_is_32_wrong = " is wrong";
	public static final /*@NonInvalid*/ java.lang.String STR__32_kind_32_must_32_connect_32_a_32_child_32_of_32_34_link_34_32_Kind_32_to_32_a_32_child_32_of_32_34_resourc = " kind must connect a child of \"link\" Kind to a child of \"resource\" Kind";
	public static final /*@NonInvalid*/ java.lang.String STR__32_kind_s_mixin = " kind/mixin.";
	public static final /*@NonInvalid*/ java.lang.String STR__32_kind_s_mixin_32_cannot_32_be_32_used_32_in_32_the_32_FSM_32_of_32 = " kind/mixin cannot be used in the FSM of ";
	public static final /*@NonInvalid*/ java.lang.String STR__32_must_32_be_32_a_32_kind_32_of_32_the_32_source_32_of_32_the_32_kind_32_of_32_this_32_link = " must be a kind of the source of the kind of this link";
	public static final /*@NonInvalid*/ java.lang.String STR__32_must_32_be_32_a_32_kind_32_of_32_the_32_target_32_of_32_the_32_kind_32_of_32_this_32_link = " must be a kind of the target of the kind of this link";
	public static final /*@NonInvalid*/ java.lang.String STR__34_32_kind_s_mixin_32_instance_32_must_32_be_32_a_32_set = "\" kind/mixin instance must be a set";
	public static final /*@NonInvalid*/ java.lang.String STR__34_32_state_32_in_32_the_32_FSM_32_of_32_34 = "\" state in the FSM of \"";
	public static final /*@NonInvalid*/ java.lang.String STR__34_32_state_32_to_32_the_32_34 = "\" state to the \"";
	public static final /*@NonInvalid*/ java.lang.String STR__35 = "#";
	public static final /*@NonInvalid*/ java.lang.String STR__91_a_m_zA_m_Z_93_91_a_m_zA_m_Z0_m_9_93_a = "[a-zA-Z][a-zA-Z0-9]*";
	public static final /*@NonInvalid*/ java.lang.String STR__91_a_m_zA_m_Z__93_91_a_m_zA_m_Z0_m_9__93_a = "[a-zA-Z_][a-zA-Z0-9_]*";
	public static final /*@NonInvalid*/ java.lang.String STR__s_action_35 = "/action#";
	public static final /*@NonInvalid*/ java.lang.String STR_entity = "entity";
	public static final /*@NonInvalid*/ java.lang.String STR_false = "false";
	public static final /*@NonInvalid*/ java.lang.String STR_http_c_s_s_schemas_ogf_org_s_occi_s_core_35 = "http://schemas.ogf.org/occi/core#";
	public static final /*@NonInvalid*/ java.lang.String STR_link = "link";
	public static final /*@NonInvalid*/ java.lang.String STR_quickfix = "quickfix";
	public static final /*@NonInvalid*/ java.lang.String STR_quot = "/";
	public static final /*@NonInvalid*/ java.lang.String STR_resource = "resource";
	public static final /*@NonInvalid*/ java.lang.String STR_true = "true";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Action = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Action);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_ArrayType = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_ArrayType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Attribute = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Attribute);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Configuration = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Configuration);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Entity = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Entity);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Extension = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Extension);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_FSM = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_FSM);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Kind = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Kind);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Mixin = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Mixin);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_MixinBase = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_MixinBase);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_State = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_State);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_CLSSid_Transition = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Transition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId BAG_DATAid_AttributeName = org.eclipse.ocl.pivot.ids.TypeId.BAG.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.DATAid_AttributeName);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Action = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Action);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Annotation = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Annotation);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Attribute = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Attribute);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_AttributeState = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_AttributeState);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Constraint = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Constraint);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_DataType = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_DataType);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_EnumerationLiteral = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_EnumerationLiteral);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Extension = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Extension);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Kind = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Kind);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Link = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Link);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Mixin = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Mixin);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_MixinBase = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_MixinBase);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_RecordField = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_RecordField);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Resource = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Resource);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_State = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_State);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Transition = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Transition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Action = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Action);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Attribute = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Attribute);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Kind = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Kind);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Link = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Link);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Mixin = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Mixin);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_MixinBase = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_MixinBase);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_OclElement = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_OclElement);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Resource = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Resource);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_CLSSid_Transition = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Transition);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_AttributeName = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.DATAid_AttributeName);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_Name = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.DATAid_Name);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Category = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Category);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Entity = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Entity);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Extension = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Extension);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Kind = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Kind);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SET_CLSSid_Mixin = org.eclipse.ocl.pivot.ids.TypeId.SET.getSpecializedId(org.eclipse.cmf.occi.core.OCCITables.CLSSid_Mixin);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.TupleTypeId TUPLid_ = org.eclipse.ocl.pivot.ids.IdManager.getTupleTypeId("Tuple", org.eclipse.cmf.occi.core.OCCITables.PARTid__0, org.eclipse.cmf.occi.core.OCCITables.PARTid__1, org.eclipse.cmf.occi.core.OCCITables.PARTid_);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.TupleTypeId TUPLid__0 = org.eclipse.ocl.pivot.ids.IdManager.getTupleTypeId("Tuple", org.eclipse.cmf.occi.core.OCCITables.PARTid__0, org.eclipse.cmf.occi.core.OCCITables.PARTid__4, org.eclipse.cmf.occi.core.OCCITables.PARTid__3, org.eclipse.cmf.occi.core.OCCITables.PARTid__2);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			OCCITables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Action = new EcoreExecutorType(OCCIPackage.Literals.ACTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _AnnotatedElement = new EcoreExecutorType(OCCIPackage.Literals.ANNOTATED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Annotation = new EcoreExecutorType(OCCIPackage.Literals.ANNOTATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ArrayType = new EcoreExecutorType(OCCIPackage.Literals.ARRAY_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Attribute = new EcoreExecutorType(OCCIPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _AttributeName = new EcoreExecutorType("AttributeName", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _AttributeState = new EcoreExecutorType(OCCIPackage.Literals.ATTRIBUTE_STATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _BasicType = new EcoreExecutorType(OCCIPackage.Literals.BASIC_TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Boolean = new EcoreExecutorType(TypeId.BOOLEAN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _BooleanType = new EcoreExecutorType(OCCIPackage.Literals.BOOLEAN_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Category = new EcoreExecutorType(OCCIPackage.Literals.CATEGORY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _Configuration = new EcoreExecutorType(OCCIPackage.Literals.CONFIGURATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Constraint = new EcoreExecutorType(OCCIPackage.Literals.CONSTRAINT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _DataType = new EcoreExecutorType(OCCIPackage.Literals.DATA_TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _EObjectType = new EcoreExecutorType(OCCIPackage.Literals.EOBJECT_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Entity = new EcoreExecutorType(OCCIPackage.Literals.ENTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _EnumerationLiteral = new EcoreExecutorType(OCCIPackage.Literals.ENUMERATION_LITERAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _EnumerationType = new EcoreExecutorType(OCCIPackage.Literals.ENUMERATION_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Extension = new EcoreExecutorType(OCCIPackage.Literals.EXTENSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _FSM = new EcoreExecutorType(OCCIPackage.Literals.FSM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Integer = new EcoreExecutorType(TypeId.INTEGER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Kind = new EcoreExecutorType(OCCIPackage.Literals.KIND, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Link = new EcoreExecutorType(OCCIPackage.Literals.LINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Mixin = new EcoreExecutorType(OCCIPackage.Literals.MIXIN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _MixinBase = new EcoreExecutorType(OCCIPackage.Literals.MIXIN_BASE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Name = new EcoreExecutorType("Name", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _NumericType = new EcoreExecutorType(OCCIPackage.Literals.NUMERIC_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _NumericTypeEnum = new EcoreExecutorEnumeration(OCCIPackage.Literals.NUMERIC_TYPE_ENUM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _OCL = new EcoreExecutorType("OCL", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RecordField = new EcoreExecutorType(OCCIPackage.Literals.RECORD_FIELD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RecordType = new EcoreExecutorType(OCCIPackage.Literals.RECORD_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Resource = new EcoreExecutorType(OCCIPackage.Literals.RESOURCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Scheme = new EcoreExecutorType("Scheme", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _State = new EcoreExecutorType(OCCIPackage.Literals.STATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _String = new EcoreExecutorType(TypeId.STRING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _StringType = new EcoreExecutorType(OCCIPackage.Literals.STRING_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Transition = new EcoreExecutorType(OCCIPackage.Literals.TRANSITION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Type = new EcoreExecutorType(OCCIPackage.Literals.TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final /*@NonNull*/ EcoreExecutorType _URI = new EcoreExecutorType("URI", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_AnnotatedElement,
			_Annotation,
			_ArrayType,
			_Attribute,
			_AttributeName,
			_AttributeState,
			_BasicType,
			_Boolean,
			_BooleanType,
			_Category,
			_Configuration,
			_Constraint,
			_DataType,
			_EObjectType,
			_Entity,
			_EnumerationLiteral,
			_EnumerationType,
			_Extension,
			_FSM,
			_Integer,
			_Kind,
			_Link,
			_Mixin,
			_MixinBase,
			_Name,
			_NumericType,
			_NumericTypeEnum,
			_OCL,
			_RecordField,
			_RecordType,
			_Resource,
			_Scheme,
			_State,
			_String,
			_StringType,
			_Transition,
			_Type,
			_URI
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, OCCITables.Types._Action);
		private static final /*@NonNull*/ ExecutorFragment _Action__AnnotatedElement = new ExecutorFragment(Types._Action, OCCITables.Types._AnnotatedElement);
		private static final /*@NonNull*/ ExecutorFragment _Action__Category = new ExecutorFragment(Types._Action, OCCITables.Types._Category);
		private static final /*@NonNull*/ ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _AnnotatedElement__AnnotatedElement = new ExecutorFragment(Types._AnnotatedElement, OCCITables.Types._AnnotatedElement);
		private static final /*@NonNull*/ ExecutorFragment _AnnotatedElement__OclAny = new ExecutorFragment(Types._AnnotatedElement, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AnnotatedElement__OclElement = new ExecutorFragment(Types._AnnotatedElement, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Annotation__Annotation = new ExecutorFragment(Types._Annotation, OCCITables.Types._Annotation);
		private static final /*@NonNull*/ ExecutorFragment _Annotation__OclAny = new ExecutorFragment(Types._Annotation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Annotation__OclElement = new ExecutorFragment(Types._Annotation, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _ArrayType__ArrayType = new ExecutorFragment(Types._ArrayType, OCCITables.Types._ArrayType);
		private static final /*@NonNull*/ ExecutorFragment _ArrayType__DataType = new ExecutorFragment(Types._ArrayType, OCCITables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _ArrayType__OclAny = new ExecutorFragment(Types._ArrayType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ArrayType__OclElement = new ExecutorFragment(Types._ArrayType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Attribute__AnnotatedElement = new ExecutorFragment(Types._Attribute, OCCITables.Types._AnnotatedElement);
		private static final /*@NonNull*/ ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, OCCITables.Types._Attribute);
		private static final /*@NonNull*/ ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _AttributeName__AttributeName = new ExecutorFragment(Types._AttributeName, OCCITables.Types._AttributeName);
		private static final /*@NonNull*/ ExecutorFragment _AttributeName__OclAny = new ExecutorFragment(Types._AttributeName, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _AttributeState__AttributeState = new ExecutorFragment(Types._AttributeState, OCCITables.Types._AttributeState);
		private static final /*@NonNull*/ ExecutorFragment _AttributeState__OclAny = new ExecutorFragment(Types._AttributeState, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _AttributeState__OclElement = new ExecutorFragment(Types._AttributeState, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _BasicType__BasicType = new ExecutorFragment(Types._BasicType, OCCITables.Types._BasicType);
		private static final /*@NonNull*/ ExecutorFragment _BasicType__DataType = new ExecutorFragment(Types._BasicType, OCCITables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _BasicType__OclAny = new ExecutorFragment(Types._BasicType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _BasicType__OclElement = new ExecutorFragment(Types._BasicType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Boolean__Boolean = new ExecutorFragment(Types._Boolean, OCCITables.Types._Boolean);
		private static final /*@NonNull*/ ExecutorFragment _Boolean__OclAny = new ExecutorFragment(Types._Boolean, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _BooleanType__BasicType = new ExecutorFragment(Types._BooleanType, OCCITables.Types._BasicType);
		private static final /*@NonNull*/ ExecutorFragment _BooleanType__BooleanType = new ExecutorFragment(Types._BooleanType, OCCITables.Types._BooleanType);
		private static final /*@NonNull*/ ExecutorFragment _BooleanType__DataType = new ExecutorFragment(Types._BooleanType, OCCITables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _BooleanType__OclAny = new ExecutorFragment(Types._BooleanType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _BooleanType__OclElement = new ExecutorFragment(Types._BooleanType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Category__AnnotatedElement = new ExecutorFragment(Types._Category, OCCITables.Types._AnnotatedElement);
		private static final /*@NonNull*/ ExecutorFragment _Category__Category = new ExecutorFragment(Types._Category, OCCITables.Types._Category);
		private static final /*@NonNull*/ ExecutorFragment _Category__OclAny = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Category__OclElement = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Configuration__Configuration = new ExecutorFragment(Types._Configuration, OCCITables.Types._Configuration);
		private static final /*@NonNull*/ ExecutorFragment _Configuration__OclAny = new ExecutorFragment(Types._Configuration, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Configuration__OclElement = new ExecutorFragment(Types._Configuration, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Constraint__Constraint = new ExecutorFragment(Types._Constraint, OCCITables.Types._Constraint);
		private static final /*@NonNull*/ ExecutorFragment _Constraint__OclAny = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Constraint__OclElement = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, OCCITables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _EObjectType__BasicType = new ExecutorFragment(Types._EObjectType, OCCITables.Types._BasicType);
		private static final /*@NonNull*/ ExecutorFragment _EObjectType__DataType = new ExecutorFragment(Types._EObjectType, OCCITables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _EObjectType__EObjectType = new ExecutorFragment(Types._EObjectType, OCCITables.Types._EObjectType);
		private static final /*@NonNull*/ ExecutorFragment _EObjectType__OclAny = new ExecutorFragment(Types._EObjectType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _EObjectType__OclElement = new ExecutorFragment(Types._EObjectType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _EnumerationLiteral__EnumerationLiteral = new ExecutorFragment(Types._EnumerationLiteral, OCCITables.Types._EnumerationLiteral);
		private static final /*@NonNull*/ ExecutorFragment _EnumerationLiteral__OclAny = new ExecutorFragment(Types._EnumerationLiteral, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _EnumerationLiteral__OclElement = new ExecutorFragment(Types._EnumerationLiteral, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _EnumerationType__DataType = new ExecutorFragment(Types._EnumerationType, OCCITables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _EnumerationType__EnumerationType = new ExecutorFragment(Types._EnumerationType, OCCITables.Types._EnumerationType);
		private static final /*@NonNull*/ ExecutorFragment _EnumerationType__OclAny = new ExecutorFragment(Types._EnumerationType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _EnumerationType__OclElement = new ExecutorFragment(Types._EnumerationType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Extension__Extension = new ExecutorFragment(Types._Extension, OCCITables.Types._Extension);
		private static final /*@NonNull*/ ExecutorFragment _Extension__OclAny = new ExecutorFragment(Types._Extension, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Extension__OclElement = new ExecutorFragment(Types._Extension, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _FSM__FSM = new ExecutorFragment(Types._FSM, OCCITables.Types._FSM);
		private static final /*@NonNull*/ ExecutorFragment _FSM__OclAny = new ExecutorFragment(Types._FSM, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _FSM__OclElement = new ExecutorFragment(Types._FSM, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Integer__Integer = new ExecutorFragment(Types._Integer, OCCITables.Types._Integer);
		private static final /*@NonNull*/ ExecutorFragment _Integer__OclAny = new ExecutorFragment(Types._Integer, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Integer__OclComparable = new ExecutorFragment(Types._Integer, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _Integer__OclSummable = new ExecutorFragment(Types._Integer, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _Integer__Real = new ExecutorFragment(Types._Integer, OCLstdlibTables.Types._Real);

		private static final /*@NonNull*/ ExecutorFragment _Kind__AnnotatedElement = new ExecutorFragment(Types._Kind, OCCITables.Types._AnnotatedElement);
		private static final /*@NonNull*/ ExecutorFragment _Kind__Category = new ExecutorFragment(Types._Kind, OCCITables.Types._Category);
		private static final /*@NonNull*/ ExecutorFragment _Kind__Kind = new ExecutorFragment(Types._Kind, OCCITables.Types._Kind);
		private static final /*@NonNull*/ ExecutorFragment _Kind__OclAny = new ExecutorFragment(Types._Kind, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Kind__OclElement = new ExecutorFragment(Types._Kind, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Kind__Type = new ExecutorFragment(Types._Kind, OCCITables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _Link__Entity = new ExecutorFragment(Types._Link, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Link__Link = new ExecutorFragment(Types._Link, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Link__OclAny = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Link__OclElement = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Mixin__AnnotatedElement = new ExecutorFragment(Types._Mixin, OCCITables.Types._AnnotatedElement);
		private static final /*@NonNull*/ ExecutorFragment _Mixin__Category = new ExecutorFragment(Types._Mixin, OCCITables.Types._Category);
		private static final /*@NonNull*/ ExecutorFragment _Mixin__Mixin = new ExecutorFragment(Types._Mixin, OCCITables.Types._Mixin);
		private static final /*@NonNull*/ ExecutorFragment _Mixin__OclAny = new ExecutorFragment(Types._Mixin, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Mixin__OclElement = new ExecutorFragment(Types._Mixin, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Mixin__Type = new ExecutorFragment(Types._Mixin, OCCITables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _MixinBase__MixinBase = new ExecutorFragment(Types._MixinBase, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _MixinBase__OclAny = new ExecutorFragment(Types._MixinBase, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _MixinBase__OclElement = new ExecutorFragment(Types._MixinBase, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Name__Name = new ExecutorFragment(Types._Name, OCCITables.Types._Name);
		private static final /*@NonNull*/ ExecutorFragment _Name__OclAny = new ExecutorFragment(Types._Name, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _NumericType__BasicType = new ExecutorFragment(Types._NumericType, OCCITables.Types._BasicType);
		private static final /*@NonNull*/ ExecutorFragment _NumericType__DataType = new ExecutorFragment(Types._NumericType, OCCITables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _NumericType__NumericType = new ExecutorFragment(Types._NumericType, OCCITables.Types._NumericType);
		private static final /*@NonNull*/ ExecutorFragment _NumericType__OclAny = new ExecutorFragment(Types._NumericType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NumericType__OclElement = new ExecutorFragment(Types._NumericType, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _NumericTypeEnum__NumericTypeEnum = new ExecutorFragment(Types._NumericTypeEnum, OCCITables.Types._NumericTypeEnum);
		private static final /*@NonNull*/ ExecutorFragment _NumericTypeEnum__OclAny = new ExecutorFragment(Types._NumericTypeEnum, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _NumericTypeEnum__OclElement = new ExecutorFragment(Types._NumericTypeEnum, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _NumericTypeEnum__OclEnumeration = new ExecutorFragment(Types._NumericTypeEnum, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _NumericTypeEnum__OclType = new ExecutorFragment(Types._NumericTypeEnum, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _OCL__OCL = new ExecutorFragment(Types._OCL, OCCITables.Types._OCL);
		private static final /*@NonNull*/ ExecutorFragment _OCL__OclAny = new ExecutorFragment(Types._OCL, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _RecordField__AnnotatedElement = new ExecutorFragment(Types._RecordField, OCCITables.Types._AnnotatedElement);
		private static final /*@NonNull*/ ExecutorFragment _RecordField__Attribute = new ExecutorFragment(Types._RecordField, OCCITables.Types._Attribute);
		private static final /*@NonNull*/ ExecutorFragment _RecordField__OclAny = new ExecutorFragment(Types._RecordField, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RecordField__OclElement = new ExecutorFragment(Types._RecordField, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RecordField__RecordField = new ExecutorFragment(Types._RecordField, OCCITables.Types._RecordField);

		private static final /*@NonNull*/ ExecutorFragment _RecordType__DataType = new ExecutorFragment(Types._RecordType, OCCITables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _RecordType__OclAny = new ExecutorFragment(Types._RecordType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RecordType__OclElement = new ExecutorFragment(Types._RecordType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RecordType__RecordType = new ExecutorFragment(Types._RecordType, OCCITables.Types._RecordType);

		private static final /*@NonNull*/ ExecutorFragment _Resource__Entity = new ExecutorFragment(Types._Resource, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Resource__OclAny = new ExecutorFragment(Types._Resource, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Resource__OclElement = new ExecutorFragment(Types._Resource, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Resource__Resource = new ExecutorFragment(Types._Resource, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Scheme__OclAny = new ExecutorFragment(Types._Scheme, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Scheme__Scheme = new ExecutorFragment(Types._Scheme, OCCITables.Types._Scheme);

		private static final /*@NonNull*/ ExecutorFragment _State__OclAny = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _State__OclElement = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _State__State = new ExecutorFragment(Types._State, OCCITables.Types._State);

		private static final /*@NonNull*/ ExecutorFragment _String__OclAny = new ExecutorFragment(Types._String, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _String__OclComparable = new ExecutorFragment(Types._String, OCLstdlibTables.Types._OclComparable);
		private static final /*@NonNull*/ ExecutorFragment _String__OclSummable = new ExecutorFragment(Types._String, OCLstdlibTables.Types._OclSummable);
		private static final /*@NonNull*/ ExecutorFragment _String__String = new ExecutorFragment(Types._String, OCCITables.Types._String);

		private static final /*@NonNull*/ ExecutorFragment _StringType__BasicType = new ExecutorFragment(Types._StringType, OCCITables.Types._BasicType);
		private static final /*@NonNull*/ ExecutorFragment _StringType__DataType = new ExecutorFragment(Types._StringType, OCCITables.Types._DataType);
		private static final /*@NonNull*/ ExecutorFragment _StringType__OclAny = new ExecutorFragment(Types._StringType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _StringType__OclElement = new ExecutorFragment(Types._StringType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _StringType__StringType = new ExecutorFragment(Types._StringType, OCCITables.Types._StringType);

		private static final /*@NonNull*/ ExecutorFragment _Transition__OclAny = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Transition__OclElement = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Transition__Transition = new ExecutorFragment(Types._Transition, OCCITables.Types._Transition);

		private static final /*@NonNull*/ ExecutorFragment _Type__AnnotatedElement = new ExecutorFragment(Types._Type, OCCITables.Types._AnnotatedElement);
		private static final /*@NonNull*/ ExecutorFragment _Type__Category = new ExecutorFragment(Types._Type, OCCITables.Types._Category);
		private static final /*@NonNull*/ ExecutorFragment _Type__OclAny = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Type__OclElement = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Type__Type = new ExecutorFragment(Types._Type, OCCITables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _URI__OclAny = new ExecutorFragment(Types._URI, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _URI__URI = new ExecutorFragment(Types._URI, OCCITables.Types._URI);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::Fragments and all preceding sub-packages.
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

		public static final /*@NonNull*/ ParameterTypes _Boolean = TypeUtil.createParameterTypes(OCLstdlibTables.Types._Boolean);
		public static final /*@NonNull*/ ParameterTypes _Integer = TypeUtil.createParameterTypes(OCLstdlibTables.Types._Integer);
		public static final /*@NonNull*/ ParameterTypes _Integer___Integer = TypeUtil.createParameterTypes(OCLstdlibTables.Types._Integer, OCLstdlibTables.Types._Integer);
		public static final /*@NonNull*/ ParameterTypes _Kind = TypeUtil.createParameterTypes(OCCITables.Types._Kind);
		public static final /*@NonNull*/ ParameterTypes _Kind___Kind = TypeUtil.createParameterTypes(OCCITables.Types._Kind, OCCITables.Types._Kind);
		public static final /*@NonNull*/ ParameterTypes _OclAny___OclAny___OclAny___Integer___Boolean___Integer = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._Integer, OCLstdlibTables.Types._Boolean, OCLstdlibTables.Types._Integer);
		public static final /*@NonNull*/ ParameterTypes _OclAny___OclAny___OclAny___OclAny___String___Integer___OclAny___Integer = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._String, OCLstdlibTables.Types._Integer, OCLstdlibTables.Types._OclAny, OCLstdlibTables.Types._Integer);
		public static final /*@NonNull*/ ParameterTypes _OclSelf = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclSelf);
		public static final /*@NonNull*/ ParameterTypes _String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String);
		public static final /*@NonNull*/ ParameterTypes _String___Boolean = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String, OCLstdlibTables.Types._Boolean);
		public static final /*@NonNull*/ ParameterTypes _String___String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String, OCLstdlibTables.Types._String);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Boolean___lt__gt_ = new ExecutorOperation("<>", Parameters._OclSelf, Types._Boolean,
			0, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean___eq_ = new ExecutorOperation("=", Parameters._OclSelf, Types._Boolean,
			1, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__and = new ExecutorOperation("and", Parameters._Boolean, Types._Boolean,
			2, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanAndOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__implies = new ExecutorOperation("implies", Parameters._Boolean, Types._Boolean,
			3, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__not = new ExecutorOperation("not", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Boolean,
			4, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanNotOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__or = new ExecutorOperation("or", Parameters._Boolean, Types._Boolean,
			5, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanOrOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__xor = new ExecutorOperation("xor", Parameters._Boolean, Types._Boolean,
			6, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanXorOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__allInstances = new ExecutorOperation("allInstances", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Boolean,
			7, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanAllInstancesOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__and2 = new ExecutorOperation("and2", Parameters._Boolean, Types._Boolean,
			8, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanAndOperation2.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__implies2 = new ExecutorOperation("implies2", Parameters._Boolean, Types._Boolean,
			9, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation2.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__not2 = new ExecutorOperation("not2", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Boolean,
			10, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanNotOperation2.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__or2 = new ExecutorOperation("or2", Parameters._Boolean, Types._Boolean,
			11, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanOrOperation2.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Boolean,
			12, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Boolean__xor2 = new ExecutorOperation("xor2", Parameters._Boolean, Types._Boolean,
			13, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.logical.BooleanXorOperation2.INSTANCE);

		public static final /*@NonNull*/ ExecutorOperation _Entity__occiCreate = new ExecutorOperation("occiCreate", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Entity,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Entity__occiDelete = new ExecutorOperation("occiDelete", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Entity,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Entity__occiRetrieve = new ExecutorOperation("occiRetrieve", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Entity,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Entity__occiUpdate = new ExecutorOperation("occiUpdate", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Entity,
			3, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Integer___mul_ = new ExecutorOperation("*", Parameters._OclSelf, Types._Integer,
			0, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Integer___add_ = new ExecutorOperation("+", Parameters._OclSelf, Types._Integer,
			1, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Integer___neg_ = new ExecutorOperation("-", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Integer,
			2, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Integer___sub_ = new ExecutorOperation("-", Parameters._OclSelf, Types._Integer,
			3, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Integer___div_ = new ExecutorOperation("/", Parameters._OclSelf, Types._Integer,
			4, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Integer__abs = new ExecutorOperation("abs", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Integer,
			5, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericAbsOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Integer__div = new ExecutorOperation("div", Parameters._Integer, Types._Integer,
			6, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericDivOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Integer__max = new ExecutorOperation("max", Parameters._OclSelf, Types._Integer,
			7, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericMaxOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Integer__min = new ExecutorOperation("min", Parameters._OclSelf, Types._Integer,
			8, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericMinOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Integer__mod = new ExecutorOperation("mod", Parameters._Integer, Types._Integer,
			9, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.NumericModOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Integer__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Integer,
			10, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _Integer__toUnlimitedNatural = new ExecutorOperation("toUnlimitedNatural", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Integer,
			11, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.numeric.IntegerToUnlimitedNaturalOperation.INSTANCE);

		public static final /*@NonNull*/ ExecutorOperation _Kind__occiIsKindOf = new ExecutorOperation("occiIsKindOf", Parameters._Kind, Types._Kind,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Link__LinkSourceInvariant = new ExecutorOperation("LinkSourceInvariant", Parameters._Kind___Kind, Types._Link,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Link__LinkTargetInvariant = new ExecutorOperation("LinkTargetInvariant", Parameters._Kind___Kind, Types._Link,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _String___add_ = new ExecutorOperation("+", Parameters._String, Types._String,
			0, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringConcatOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___lt_ = new ExecutorOperation("<", Parameters._OclSelf, Types._String,
			1, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringLessThanOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___lt__eq_ = new ExecutorOperation("<=", Parameters._OclSelf, Types._String,
			2, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringLessThanEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___lt__gt_ = new ExecutorOperation("<>", Parameters._OclSelf, Types._String,
			3, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyNotEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___eq_ = new ExecutorOperation("=", Parameters._OclSelf, Types._String,
			4, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___gt_ = new ExecutorOperation(">", Parameters._OclSelf, Types._String,
			5, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringGreaterThanOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String___gt__eq_ = new ExecutorOperation(">=", Parameters._OclSelf, Types._String,
			6, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringGreaterThanEqualOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__at = new ExecutorOperation("at", Parameters._Integer, Types._String,
			7, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringAtOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__characters = new ExecutorOperation("characters", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			8, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringCharactersOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__compareTo = new ExecutorOperation("compareTo", Parameters._OclSelf, Types._String,
			9, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringCompareToOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__concat = new ExecutorOperation("concat", Parameters._String, Types._String,
			10, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringConcatOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__endsWith = new ExecutorOperation("endsWith", Parameters._String, Types._String,
			11, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringEndsWithOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__equalsIgnoreCase = new ExecutorOperation("equalsIgnoreCase", Parameters._String, Types._String,
			12, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringEqualsIgnoreCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__getSeverity = new ExecutorOperation("getSeverity", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			13, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__indexOf = new ExecutorOperation("indexOf", Parameters._String, Types._String,
			14, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringIndexOfOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__lastIndexOf = new ExecutorOperation("lastIndexOf", Parameters._String, Types._String,
			15, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringLastIndexOfOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__0_logDiagnostic = new ExecutorOperation("logDiagnostic", Parameters._OclAny___OclAny___OclAny___Integer___Boolean___Integer, Types._String,
			16, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__1_logDiagnostic = new ExecutorOperation("logDiagnostic", Parameters._OclAny___OclAny___OclAny___OclAny___String___Integer___OclAny___Integer, Types._String,
			17, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__matches = new ExecutorOperation("matches", Parameters._String, Types._String,
			18, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringMatchesOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__replaceAll = new ExecutorOperation("replaceAll", Parameters._String___String, Types._String,
			19, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringReplaceAllOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__replaceFirst = new ExecutorOperation("replaceFirst", Parameters._String___String, Types._String,
			20, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringReplaceFirstOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__size = new ExecutorOperation("size", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			21, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringSizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__startsWith = new ExecutorOperation("startsWith", Parameters._String, Types._String,
			22, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringStartsWithOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__substituteAll = new ExecutorOperation("substituteAll", Parameters._String___String, Types._String,
			23, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringSubstituteAllOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__substituteFirst = new ExecutorOperation("substituteFirst", Parameters._String___String, Types._String,
			24, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringSubstituteFirstOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__substring = new ExecutorOperation("substring", Parameters._Integer___Integer, Types._String,
			25, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringSubstringOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toBoolean = new ExecutorOperation("toBoolean", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			26, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToBooleanOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toInteger = new ExecutorOperation("toInteger", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			27, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToIntegerOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toLower = new ExecutorOperation("toLower", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			28, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toLowerCase = new ExecutorOperation("toLowerCase", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			29, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToLowerCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toReal = new ExecutorOperation("toReal", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			30, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToRealOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			31, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toUpper = new ExecutorOperation("toUpper", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			32, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__toUpperCase = new ExecutorOperation("toUpperCase", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			33, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringToUpperCaseOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__0_tokenize = new ExecutorOperation("tokenize", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			34, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringTokenizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__1_tokenize = new ExecutorOperation("tokenize", Parameters._String, Types._String,
			35, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringTokenizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__2_tokenize = new ExecutorOperation("tokenize", Parameters._String___Boolean, Types._String,
			36, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringTokenizeOperation.INSTANCE);
		public static final /*@NonNull*/ ExecutorOperation _String__trim = new ExecutorOperation("trim", TypeUtil.EMPTY_PARAMETER_TYPES, Types._String,
			37, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.string.StringTrimOperation.INSTANCE);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Action__Transition__action = new ExecutorPropertyWithImplementation("Transition", Types._Action, 0, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.TRANSITION__ACTION));
		public static final /*@NonNull*/ ExecutorProperty _Action__Type__actions = new ExecutorPropertyWithImplementation("Type", Types._Action, 1, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.TYPE__ACTIONS));

		public static final /*@NonNull*/ ExecutorProperty _AnnotatedElement__annotations = new EcoreExecutorProperty(OCCIPackage.Literals.ANNOTATED_ELEMENT__ANNOTATIONS, Types._AnnotatedElement, 0);

		public static final /*@NonNull*/ ExecutorProperty _Annotation__key = new EcoreExecutorProperty(OCCIPackage.Literals.ANNOTATION__KEY, Types._Annotation, 0);
		public static final /*@NonNull*/ ExecutorProperty _Annotation__value = new EcoreExecutorProperty(OCCIPackage.Literals.ANNOTATION__VALUE, Types._Annotation, 1);
		public static final /*@NonNull*/ ExecutorProperty _Annotation__AnnotatedElement__annotations = new ExecutorPropertyWithImplementation("AnnotatedElement", Types._Annotation, 2, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.ANNOTATED_ELEMENT__ANNOTATIONS));

		public static final /*@NonNull*/ ExecutorProperty _ArrayType__type = new EcoreExecutorProperty(OCCIPackage.Literals.ARRAY_TYPE__TYPE, Types._ArrayType, 0);

		public static final /*@NonNull*/ ExecutorProperty _Attribute__default = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__DEFAULT, Types._Attribute, 0);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__description = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__DESCRIPTION, Types._Attribute, 1);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__mutable = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__MUTABLE, Types._Attribute, 2);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__name = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__NAME, Types._Attribute, 3);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__required = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__REQUIRED, Types._Attribute, 4);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__type = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE__TYPE, Types._Attribute, 5);
		public static final /*@NonNull*/ ExecutorProperty _Attribute__Category__attributes = new ExecutorPropertyWithImplementation("Category", Types._Attribute, 6, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.CATEGORY__ATTRIBUTES));
		public static final /*@NonNull*/ ExecutorProperty _Attribute__FSM__attribute = new ExecutorPropertyWithImplementation("FSM", Types._Attribute, 7, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.FSM__ATTRIBUTE));

		public static final /*@NonNull*/ ExecutorProperty _AttributeState__name = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE_STATE__NAME, Types._AttributeState, 0);
		public static final /*@NonNull*/ ExecutorProperty _AttributeState__value = new EcoreExecutorProperty(OCCIPackage.Literals.ATTRIBUTE_STATE__VALUE, Types._AttributeState, 1);
		public static final /*@NonNull*/ ExecutorProperty _AttributeState__Entity__attributes = new ExecutorPropertyWithImplementation("Entity", Types._AttributeState, 2, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.ENTITY__ATTRIBUTES));
		public static final /*@NonNull*/ ExecutorProperty _AttributeState__MixinBase__attributes = new ExecutorPropertyWithImplementation("MixinBase", Types._AttributeState, 3, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.MIXIN_BASE__ATTRIBUTES));

		public static final /*@NonNull*/ ExecutorProperty _Category__attributes = new EcoreExecutorProperty(OCCIPackage.Literals.CATEGORY__ATTRIBUTES, Types._Category, 0);
		public static final /*@NonNull*/ ExecutorProperty _Category__description = new EcoreExecutorProperty(OCCIPackage.Literals.CATEGORY__DESCRIPTION, Types._Category, 1);
		public static final /*@NonNull*/ ExecutorProperty _Category__name = new EcoreExecutorProperty(OCCIPackage.Literals.CATEGORY__NAME, Types._Category, 2);
		public static final /*@NonNull*/ ExecutorProperty _Category__scheme = new EcoreExecutorProperty(OCCIPackage.Literals.CATEGORY__SCHEME, Types._Category, 3);
		public static final /*@NonNull*/ ExecutorProperty _Category__term = new EcoreExecutorProperty(OCCIPackage.Literals.CATEGORY__TERM, Types._Category, 4);
		public static final /*@NonNull*/ ExecutorProperty _Category__title = new EcoreExecutorProperty(OCCIPackage.Literals.CATEGORY__TITLE, Types._Category, 5);

		public static final /*@NonNull*/ ExecutorProperty _Configuration__description = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__DESCRIPTION, Types._Configuration, 0);
		public static final /*@NonNull*/ ExecutorProperty _Configuration__location = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__LOCATION, Types._Configuration, 1);
		public static final /*@NonNull*/ ExecutorProperty _Configuration__mixins = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__MIXINS, Types._Configuration, 2);
		public static final /*@NonNull*/ ExecutorProperty _Configuration__resources = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__RESOURCES, Types._Configuration, 3);
		public static final /*@NonNull*/ ExecutorProperty _Configuration__use = new EcoreExecutorProperty(OCCIPackage.Literals.CONFIGURATION__USE, Types._Configuration, 4);

		public static final /*@NonNull*/ ExecutorProperty _Constraint__body = new EcoreExecutorProperty(OCCIPackage.Literals.CONSTRAINT__BODY, Types._Constraint, 0);
		public static final /*@NonNull*/ ExecutorProperty _Constraint__description = new EcoreExecutorProperty(OCCIPackage.Literals.CONSTRAINT__DESCRIPTION, Types._Constraint, 1);
		public static final /*@NonNull*/ ExecutorProperty _Constraint__name = new EcoreExecutorProperty(OCCIPackage.Literals.CONSTRAINT__NAME, Types._Constraint, 2);
		public static final /*@NonNull*/ ExecutorProperty _Constraint__Type__constraints = new ExecutorPropertyWithImplementation("Type", Types._Constraint, 3, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.TYPE__CONSTRAINTS));

		public static final /*@NonNull*/ ExecutorProperty _DataType__documentation = new EcoreExecutorProperty(OCCIPackage.Literals.DATA_TYPE__DOCUMENTATION, Types._DataType, 0);
		public static final /*@NonNull*/ ExecutorProperty _DataType__name = new EcoreExecutorProperty(OCCIPackage.Literals.DATA_TYPE__NAME, Types._DataType, 1);
		public static final /*@NonNull*/ ExecutorProperty _DataType__ArrayType__type = new ExecutorPropertyWithImplementation("ArrayType", Types._DataType, 2, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.ARRAY_TYPE__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _DataType__Attribute__type = new ExecutorPropertyWithImplementation("Attribute", Types._DataType, 3, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.ATTRIBUTE__TYPE));
		public static final /*@NonNull*/ ExecutorProperty _DataType__Extension__types = new ExecutorPropertyWithImplementation("Extension", Types._DataType, 4, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.EXTENSION__TYPES));

		public static final /*@NonNull*/ ExecutorProperty _EObjectType__instanceClassName = new EcoreExecutorProperty(OCCIPackage.Literals.EOBJECT_TYPE__INSTANCE_CLASS_NAME, Types._EObjectType, 0);

		public static final /*@NonNull*/ ExecutorProperty _Entity__attributes = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__ATTRIBUTES, Types._Entity, 0);
		public static final /*@NonNull*/ ExecutorProperty _Entity__id = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__ID, Types._Entity, 1);
		public static final /*@NonNull*/ ExecutorProperty _Entity__kind = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__KIND, Types._Entity, 2);
		public static final /*@NonNull*/ ExecutorProperty _Entity__location = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__LOCATION, Types._Entity, 3);
		public static final /*@NonNull*/ ExecutorProperty _Entity__mixins = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__MIXINS, Types._Entity, 4);
		public static final /*@NonNull*/ ExecutorProperty _Entity__parts = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__PARTS, Types._Entity, 5);
		public static final /*@NonNull*/ ExecutorProperty _Entity__title = new EcoreExecutorProperty(OCCIPackage.Literals.ENTITY__TITLE, Types._Entity, 6);
		public static final /*@NonNull*/ ExecutorProperty _Entity__Kind__entities = new ExecutorPropertyWithImplementation("Kind", Types._Entity, 7, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.KIND__ENTITIES));
		public static final /*@NonNull*/ ExecutorProperty _Entity__Mixin__entities = new ExecutorPropertyWithImplementation("Mixin", Types._Entity, 8, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.MIXIN__ENTITIES));

		public static final /*@NonNull*/ ExecutorProperty _EnumerationLiteral__documentation = new EcoreExecutorProperty(OCCIPackage.Literals.ENUMERATION_LITERAL__DOCUMENTATION, Types._EnumerationLiteral, 0);
		public static final /*@NonNull*/ ExecutorProperty _EnumerationLiteral__enumerationType = new EcoreExecutorProperty(OCCIPackage.Literals.ENUMERATION_LITERAL__ENUMERATION_TYPE, Types._EnumerationLiteral, 1);
		public static final /*@NonNull*/ ExecutorProperty _EnumerationLiteral__name = new EcoreExecutorProperty(OCCIPackage.Literals.ENUMERATION_LITERAL__NAME, Types._EnumerationLiteral, 2);
		public static final /*@NonNull*/ ExecutorProperty _EnumerationLiteral__State__literal = new ExecutorPropertyWithImplementation("State", Types._EnumerationLiteral, 3, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.STATE__LITERAL));

		public static final /*@NonNull*/ ExecutorProperty _EnumerationType__literals = new EcoreExecutorProperty(OCCIPackage.Literals.ENUMERATION_TYPE__LITERALS, Types._EnumerationType, 0);

		public static final /*@NonNull*/ ExecutorProperty _Extension__description = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__DESCRIPTION, Types._Extension, 0);
		public static final /*@NonNull*/ ExecutorProperty _Extension__import = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__IMPORT, Types._Extension, 1);
		public static final /*@NonNull*/ ExecutorProperty _Extension__kinds = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__KINDS, Types._Extension, 2);
		public static final /*@NonNull*/ ExecutorProperty _Extension__mixins = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__MIXINS, Types._Extension, 3);
		public static final /*@NonNull*/ ExecutorProperty _Extension__name = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__NAME, Types._Extension, 4);
		public static final /*@NonNull*/ ExecutorProperty _Extension__scheme = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__SCHEME, Types._Extension, 5);
		public static final /*@NonNull*/ ExecutorProperty _Extension__specification = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__SPECIFICATION, Types._Extension, 6);
		public static final /*@NonNull*/ ExecutorProperty _Extension__types = new EcoreExecutorProperty(OCCIPackage.Literals.EXTENSION__TYPES, Types._Extension, 7);
		public static final /*@NonNull*/ ExecutorProperty _Extension__Configuration__use = new ExecutorPropertyWithImplementation("Configuration", Types._Extension, 8, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.CONFIGURATION__USE));
		public static final /*@NonNull*/ ExecutorProperty _Extension__Extension__import = new ExecutorPropertyWithImplementation("Extension", Types._Extension, 9, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.EXTENSION__IMPORT));

		public static final /*@NonNull*/ ExecutorProperty _FSM__attribute = new EcoreExecutorProperty(OCCIPackage.Literals.FSM__ATTRIBUTE, Types._FSM, 0);
		public static final /*@NonNull*/ ExecutorProperty _FSM__ownedState = new EcoreExecutorProperty(OCCIPackage.Literals.FSM__OWNED_STATE, Types._FSM, 1);
		public static final /*@NonNull*/ ExecutorProperty _FSM__Type__fsm = new ExecutorPropertyWithImplementation("Type", Types._FSM, 2, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.TYPE__FSM));

		public static final /*@NonNull*/ ExecutorProperty _Kind__entities = new EcoreExecutorProperty(OCCIPackage.Literals.KIND__ENTITIES, Types._Kind, 0);
		public static final /*@NonNull*/ ExecutorProperty _Kind__parent = new EcoreExecutorProperty(OCCIPackage.Literals.KIND__PARENT, Types._Kind, 1);
		public static final /*@NonNull*/ ExecutorProperty _Kind__source = new EcoreExecutorProperty(OCCIPackage.Literals.KIND__SOURCE, Types._Kind, 2);
		public static final /*@NonNull*/ ExecutorProperty _Kind__target = new EcoreExecutorProperty(OCCIPackage.Literals.KIND__TARGET, Types._Kind, 3);
		public static final /*@NonNull*/ ExecutorProperty _Kind__Entity__kind = new ExecutorPropertyWithImplementation("Entity", Types._Kind, 4, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.ENTITY__KIND));
		public static final /*@NonNull*/ ExecutorProperty _Kind__Extension__kinds = new ExecutorPropertyWithImplementation("Extension", Types._Kind, 5, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.EXTENSION__KINDS));
		public static final /*@NonNull*/ ExecutorProperty _Kind__Kind__parent = new ExecutorPropertyWithImplementation("Kind", Types._Kind, 6, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.KIND__PARENT));
		public static final /*@NonNull*/ ExecutorProperty _Kind__Kind__source = new ExecutorPropertyWithImplementation("Kind", Types._Kind, 7, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.KIND__SOURCE));
		public static final /*@NonNull*/ ExecutorProperty _Kind__Kind__target = new ExecutorPropertyWithImplementation("Kind", Types._Kind, 8, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.KIND__TARGET));
		public static final /*@NonNull*/ ExecutorProperty _Kind__Mixin__applies = new ExecutorPropertyWithImplementation("Mixin", Types._Kind, 9, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.MIXIN__APPLIES));

		public static final /*@NonNull*/ ExecutorProperty _Link__source = new EcoreExecutorProperty(OCCIPackage.Literals.LINK__SOURCE, Types._Link, 0);
		public static final /*@NonNull*/ ExecutorProperty _Link__target = new EcoreExecutorProperty(OCCIPackage.Literals.LINK__TARGET, Types._Link, 1);

		public static final /*@NonNull*/ ExecutorProperty _Mixin__applies = new EcoreExecutorProperty(OCCIPackage.Literals.MIXIN__APPLIES, Types._Mixin, 0);
		public static final /*@NonNull*/ ExecutorProperty _Mixin__depends = new EcoreExecutorProperty(OCCIPackage.Literals.MIXIN__DEPENDS, Types._Mixin, 1);
		public static final /*@NonNull*/ ExecutorProperty _Mixin__entities = new EcoreExecutorProperty(OCCIPackage.Literals.MIXIN__ENTITIES, Types._Mixin, 2);
		public static final /*@NonNull*/ ExecutorProperty _Mixin__Configuration__mixins = new ExecutorPropertyWithImplementation("Configuration", Types._Mixin, 3, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.CONFIGURATION__MIXINS));
		public static final /*@NonNull*/ ExecutorProperty _Mixin__Entity__mixins = new ExecutorPropertyWithImplementation("Entity", Types._Mixin, 4, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.ENTITY__MIXINS));
		public static final /*@NonNull*/ ExecutorProperty _Mixin__Extension__mixins = new ExecutorPropertyWithImplementation("Extension", Types._Mixin, 5, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.EXTENSION__MIXINS));
		public static final /*@NonNull*/ ExecutorProperty _Mixin__Mixin__depends = new ExecutorPropertyWithImplementation("Mixin", Types._Mixin, 6, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.MIXIN__DEPENDS));
		public static final /*@NonNull*/ ExecutorProperty _Mixin__MixinBase__mixin = new ExecutorPropertyWithImplementation("MixinBase", Types._Mixin, 7, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.MIXIN_BASE__MIXIN));

		public static final /*@NonNull*/ ExecutorProperty _MixinBase__attributes = new EcoreExecutorProperty(OCCIPackage.Literals.MIXIN_BASE__ATTRIBUTES, Types._MixinBase, 0);
		public static final /*@NonNull*/ ExecutorProperty _MixinBase__entity = new EcoreExecutorProperty(OCCIPackage.Literals.MIXIN_BASE__ENTITY, Types._MixinBase, 1);
		public static final /*@NonNull*/ ExecutorProperty _MixinBase__mixin = new EcoreExecutorProperty(OCCIPackage.Literals.MIXIN_BASE__MIXIN, Types._MixinBase, 2);

		public static final /*@NonNull*/ ExecutorProperty _NumericType__maxExclusive = new EcoreExecutorProperty(OCCIPackage.Literals.NUMERIC_TYPE__MAX_EXCLUSIVE, Types._NumericType, 0);
		public static final /*@NonNull*/ ExecutorProperty _NumericType__maxInclusive = new EcoreExecutorProperty(OCCIPackage.Literals.NUMERIC_TYPE__MAX_INCLUSIVE, Types._NumericType, 1);
		public static final /*@NonNull*/ ExecutorProperty _NumericType__minExclusive = new EcoreExecutorProperty(OCCIPackage.Literals.NUMERIC_TYPE__MIN_EXCLUSIVE, Types._NumericType, 2);
		public static final /*@NonNull*/ ExecutorProperty _NumericType__minInclusive = new EcoreExecutorProperty(OCCIPackage.Literals.NUMERIC_TYPE__MIN_INCLUSIVE, Types._NumericType, 3);
		public static final /*@NonNull*/ ExecutorProperty _NumericType__totalDigits = new EcoreExecutorProperty(OCCIPackage.Literals.NUMERIC_TYPE__TOTAL_DIGITS, Types._NumericType, 4);
		public static final /*@NonNull*/ ExecutorProperty _NumericType__type = new EcoreExecutorProperty(OCCIPackage.Literals.NUMERIC_TYPE__TYPE, Types._NumericType, 5);

		public static final /*@NonNull*/ ExecutorProperty _RecordField__RecordType__recordFields = new ExecutorPropertyWithImplementation("RecordType", Types._RecordField, 0, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.RECORD_TYPE__RECORD_FIELDS));

		public static final /*@NonNull*/ ExecutorProperty _RecordType__recordFields = new EcoreExecutorProperty(OCCIPackage.Literals.RECORD_TYPE__RECORD_FIELDS, Types._RecordType, 0);

		public static final /*@NonNull*/ ExecutorProperty _Resource__links = new EcoreExecutorProperty(OCCIPackage.Literals.RESOURCE__LINKS, Types._Resource, 0);
		public static final /*@NonNull*/ ExecutorProperty _Resource__rlinks = new EcoreExecutorProperty(OCCIPackage.Literals.RESOURCE__RLINKS, Types._Resource, 1);
		public static final /*@NonNull*/ ExecutorProperty _Resource__summary = new EcoreExecutorProperty(OCCIPackage.Literals.RESOURCE__SUMMARY, Types._Resource, 2);
		public static final /*@NonNull*/ ExecutorProperty _Resource__Configuration__resources = new ExecutorPropertyWithImplementation("Configuration", Types._Resource, 3, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.CONFIGURATION__RESOURCES));

		public static final /*@NonNull*/ ExecutorProperty _State__final = new EcoreExecutorProperty(OCCIPackage.Literals.STATE__FINAL, Types._State, 0);
		public static final /*@NonNull*/ ExecutorProperty _State__initial = new EcoreExecutorProperty(OCCIPackage.Literals.STATE__INITIAL, Types._State, 1);
		public static final /*@NonNull*/ ExecutorProperty _State__literal = new EcoreExecutorProperty(OCCIPackage.Literals.STATE__LITERAL, Types._State, 2);
		public static final /*@NonNull*/ ExecutorProperty _State__outgoingTransition = new EcoreExecutorProperty(OCCIPackage.Literals.STATE__OUTGOING_TRANSITION, Types._State, 3);
		public static final /*@NonNull*/ ExecutorProperty _State__owningFSM = new EcoreExecutorProperty(OCCIPackage.Literals.STATE__OWNING_FSM, Types._State, 4);
		public static final /*@NonNull*/ ExecutorProperty _State__Transition__target = new ExecutorPropertyWithImplementation("Transition", Types._State, 5, new EcoreLibraryOppositeProperty(OCCIPackage.Literals.TRANSITION__TARGET));

		public static final /*@NonNull*/ ExecutorProperty _StringType__length = new EcoreExecutorProperty(OCCIPackage.Literals.STRING_TYPE__LENGTH, Types._StringType, 0);
		public static final /*@NonNull*/ ExecutorProperty _StringType__maxLength = new EcoreExecutorProperty(OCCIPackage.Literals.STRING_TYPE__MAX_LENGTH, Types._StringType, 1);
		public static final /*@NonNull*/ ExecutorProperty _StringType__minLength = new EcoreExecutorProperty(OCCIPackage.Literals.STRING_TYPE__MIN_LENGTH, Types._StringType, 2);
		public static final /*@NonNull*/ ExecutorProperty _StringType__pattern = new EcoreExecutorProperty(OCCIPackage.Literals.STRING_TYPE__PATTERN, Types._StringType, 3);

		public static final /*@NonNull*/ ExecutorProperty _Transition__action = new EcoreExecutorProperty(OCCIPackage.Literals.TRANSITION__ACTION, Types._Transition, 0);
		public static final /*@NonNull*/ ExecutorProperty _Transition__source = new EcoreExecutorProperty(OCCIPackage.Literals.TRANSITION__SOURCE, Types._Transition, 1);
		public static final /*@NonNull*/ ExecutorProperty _Transition__target = new EcoreExecutorProperty(OCCIPackage.Literals.TRANSITION__TARGET, Types._Transition, 2);

		public static final /*@NonNull*/ ExecutorProperty _Type__actions = new EcoreExecutorProperty(OCCIPackage.Literals.TYPE__ACTIONS, Types._Type, 0);
		public static final /*@NonNull*/ ExecutorProperty _Type__constraints = new EcoreExecutorProperty(OCCIPackage.Literals.TYPE__CONSTRAINTS, Types._Type, 1);
		public static final /*@NonNull*/ ExecutorProperty _Type__fsm = new EcoreExecutorProperty(OCCIPackage.Literals.TYPE__FSM, Types._Type, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Action =
			{
				Fragments._Action__OclAny /* 0 */,
				Fragments._Action__OclElement /* 1 */,
				Fragments._Action__AnnotatedElement /* 2 */,
				Fragments._Action__Category /* 3 */,
				Fragments._Action__Action /* 4 */
			};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AnnotatedElement =
			{
				Fragments._AnnotatedElement__OclAny /* 0 */,
				Fragments._AnnotatedElement__OclElement /* 1 */,
				Fragments._AnnotatedElement__AnnotatedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __AnnotatedElement = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Annotation =
			{
				Fragments._Annotation__OclAny /* 0 */,
				Fragments._Annotation__OclElement /* 1 */,
				Fragments._Annotation__Annotation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Annotation = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ArrayType =
			{
				Fragments._ArrayType__OclAny /* 0 */,
				Fragments._ArrayType__OclElement /* 1 */,
				Fragments._ArrayType__DataType /* 2 */,
				Fragments._ArrayType__ArrayType /* 3 */
			};
		private static final int /*@NonNull*/ [] __ArrayType = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Attribute =
			{
				Fragments._Attribute__OclAny /* 0 */,
				Fragments._Attribute__OclElement /* 1 */,
				Fragments._Attribute__AnnotatedElement /* 2 */,
				Fragments._Attribute__Attribute /* 3 */
			};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AttributeName =
			{
				Fragments._AttributeName__OclAny /* 0 */,
				Fragments._AttributeName__AttributeName /* 1 */
			};
		private static final int /*@NonNull*/ [] __AttributeName = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _AttributeState =
			{
				Fragments._AttributeState__OclAny /* 0 */,
				Fragments._AttributeState__OclElement /* 1 */,
				Fragments._AttributeState__AttributeState /* 2 */
			};
		private static final int /*@NonNull*/ [] __AttributeState = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _BasicType =
			{
				Fragments._BasicType__OclAny /* 0 */,
				Fragments._BasicType__OclElement /* 1 */,
				Fragments._BasicType__DataType /* 2 */,
				Fragments._BasicType__BasicType /* 3 */
			};
		private static final int /*@NonNull*/ [] __BasicType = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Boolean =
			{
				Fragments._Boolean__OclAny /* 0 */,
				Fragments._Boolean__Boolean /* 1 */
			};
		private static final int /*@NonNull*/ [] __Boolean = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _BooleanType =
			{
				Fragments._BooleanType__OclAny /* 0 */,
				Fragments._BooleanType__OclElement /* 1 */,
				Fragments._BooleanType__DataType /* 2 */,
				Fragments._BooleanType__BasicType /* 3 */,
				Fragments._BooleanType__BooleanType /* 4 */
			};
		private static final int /*@NonNull*/ [] __BooleanType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Category =
			{
				Fragments._Category__OclAny /* 0 */,
				Fragments._Category__OclElement /* 1 */,
				Fragments._Category__AnnotatedElement /* 2 */,
				Fragments._Category__Category /* 3 */
			};
		private static final int /*@NonNull*/ [] __Category = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Configuration =
			{
				Fragments._Configuration__OclAny /* 0 */,
				Fragments._Configuration__OclElement /* 1 */,
				Fragments._Configuration__Configuration /* 2 */
			};
		private static final int /*@NonNull*/ [] __Configuration = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Constraint =
			{
				Fragments._Constraint__OclAny /* 0 */,
				Fragments._Constraint__OclElement /* 1 */,
				Fragments._Constraint__Constraint /* 2 */
			};
		private static final int /*@NonNull*/ [] __Constraint = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__DataType /* 2 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _EObjectType =
			{
				Fragments._EObjectType__OclAny /* 0 */,
				Fragments._EObjectType__OclElement /* 1 */,
				Fragments._EObjectType__DataType /* 2 */,
				Fragments._EObjectType__BasicType /* 3 */,
				Fragments._EObjectType__EObjectType /* 4 */
			};
		private static final int /*@NonNull*/ [] __EObjectType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Entity =
			{
				Fragments._Entity__OclAny /* 0 */,
				Fragments._Entity__OclElement /* 1 */,
				Fragments._Entity__Entity /* 2 */
			};
		private static final int /*@NonNull*/ [] __Entity = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _EnumerationLiteral =
			{
				Fragments._EnumerationLiteral__OclAny /* 0 */,
				Fragments._EnumerationLiteral__OclElement /* 1 */,
				Fragments._EnumerationLiteral__EnumerationLiteral /* 2 */
			};
		private static final int /*@NonNull*/ [] __EnumerationLiteral = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _EnumerationType =
			{
				Fragments._EnumerationType__OclAny /* 0 */,
				Fragments._EnumerationType__OclElement /* 1 */,
				Fragments._EnumerationType__DataType /* 2 */,
				Fragments._EnumerationType__EnumerationType /* 3 */
			};
		private static final int /*@NonNull*/ [] __EnumerationType = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Extension =
			{
				Fragments._Extension__OclAny /* 0 */,
				Fragments._Extension__OclElement /* 1 */,
				Fragments._Extension__Extension /* 2 */
			};
		private static final int /*@NonNull*/ [] __Extension = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _FSM =
			{
				Fragments._FSM__OclAny /* 0 */,
				Fragments._FSM__OclElement /* 1 */,
				Fragments._FSM__FSM /* 2 */
			};
		private static final int /*@NonNull*/ [] __FSM = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Integer =
			{
				Fragments._Integer__OclAny /* 0 */,
				Fragments._Integer__OclComparable /* 1 */,
				Fragments._Integer__OclSummable /* 1 */,
				Fragments._Integer__Real /* 2 */,
				Fragments._Integer__Integer /* 3 */
			};
		private static final int /*@NonNull*/ [] __Integer = { 1,2,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Kind =
			{
				Fragments._Kind__OclAny /* 0 */,
				Fragments._Kind__OclElement /* 1 */,
				Fragments._Kind__AnnotatedElement /* 2 */,
				Fragments._Kind__Category /* 3 */,
				Fragments._Kind__Type /* 4 */,
				Fragments._Kind__Kind /* 5 */
			};
		private static final int /*@NonNull*/ [] __Kind = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Link =
			{
				Fragments._Link__OclAny /* 0 */,
				Fragments._Link__OclElement /* 1 */,
				Fragments._Link__Entity /* 2 */,
				Fragments._Link__Link /* 3 */
			};
		private static final int /*@NonNull*/ [] __Link = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Mixin =
			{
				Fragments._Mixin__OclAny /* 0 */,
				Fragments._Mixin__OclElement /* 1 */,
				Fragments._Mixin__AnnotatedElement /* 2 */,
				Fragments._Mixin__Category /* 3 */,
				Fragments._Mixin__Type /* 4 */,
				Fragments._Mixin__Mixin /* 5 */
			};
		private static final int /*@NonNull*/ [] __Mixin = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _MixinBase =
			{
				Fragments._MixinBase__OclAny /* 0 */,
				Fragments._MixinBase__OclElement /* 1 */,
				Fragments._MixinBase__MixinBase /* 2 */
			};
		private static final int /*@NonNull*/ [] __MixinBase = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Name =
			{
				Fragments._Name__OclAny /* 0 */,
				Fragments._Name__Name /* 1 */
			};
		private static final int /*@NonNull*/ [] __Name = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NumericType =
			{
				Fragments._NumericType__OclAny /* 0 */,
				Fragments._NumericType__OclElement /* 1 */,
				Fragments._NumericType__DataType /* 2 */,
				Fragments._NumericType__BasicType /* 3 */,
				Fragments._NumericType__NumericType /* 4 */
			};
		private static final int /*@NonNull*/ [] __NumericType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _NumericTypeEnum =
			{
				Fragments._NumericTypeEnum__OclAny /* 0 */,
				Fragments._NumericTypeEnum__OclElement /* 1 */,
				Fragments._NumericTypeEnum__OclType /* 2 */,
				Fragments._NumericTypeEnum__OclEnumeration /* 3 */,
				Fragments._NumericTypeEnum__NumericTypeEnum /* 4 */
			};
		private static final int /*@NonNull*/ [] __NumericTypeEnum = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _OCL =
			{
				Fragments._OCL__OclAny /* 0 */,
				Fragments._OCL__OCL /* 1 */
			};
		private static final int /*@NonNull*/ [] __OCL = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RecordField =
			{
				Fragments._RecordField__OclAny /* 0 */,
				Fragments._RecordField__OclElement /* 1 */,
				Fragments._RecordField__AnnotatedElement /* 2 */,
				Fragments._RecordField__Attribute /* 3 */,
				Fragments._RecordField__RecordField /* 4 */
			};
		private static final int /*@NonNull*/ [] __RecordField = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RecordType =
			{
				Fragments._RecordType__OclAny /* 0 */,
				Fragments._RecordType__OclElement /* 1 */,
				Fragments._RecordType__DataType /* 2 */,
				Fragments._RecordType__RecordType /* 3 */
			};
		private static final int /*@NonNull*/ [] __RecordType = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Resource =
			{
				Fragments._Resource__OclAny /* 0 */,
				Fragments._Resource__OclElement /* 1 */,
				Fragments._Resource__Entity /* 2 */,
				Fragments._Resource__Resource /* 3 */
			};
		private static final int /*@NonNull*/ [] __Resource = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Scheme =
			{
				Fragments._Scheme__OclAny /* 0 */,
				Fragments._Scheme__Scheme /* 1 */
			};
		private static final int /*@NonNull*/ [] __Scheme = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _State =
			{
				Fragments._State__OclAny /* 0 */,
				Fragments._State__OclElement /* 1 */,
				Fragments._State__State /* 2 */
			};
		private static final int /*@NonNull*/ [] __State = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _String =
			{
				Fragments._String__OclAny /* 0 */,
				Fragments._String__OclComparable /* 1 */,
				Fragments._String__OclSummable /* 1 */,
				Fragments._String__String /* 2 */
			};
		private static final int /*@NonNull*/ [] __String = { 1,2,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _StringType =
			{
				Fragments._StringType__OclAny /* 0 */,
				Fragments._StringType__OclElement /* 1 */,
				Fragments._StringType__DataType /* 2 */,
				Fragments._StringType__BasicType /* 3 */,
				Fragments._StringType__StringType /* 4 */
			};
		private static final int /*@NonNull*/ [] __StringType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Transition =
			{
				Fragments._Transition__OclAny /* 0 */,
				Fragments._Transition__OclElement /* 1 */,
				Fragments._Transition__Transition /* 2 */
			};
		private static final int /*@NonNull*/ [] __Transition = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Type =
			{
				Fragments._Type__OclAny /* 0 */,
				Fragments._Type__OclElement /* 1 */,
				Fragments._Type__AnnotatedElement /* 2 */,
				Fragments._Type__Category /* 3 */,
				Fragments._Type__Type /* 4 */
			};
		private static final int /*@NonNull*/ [] __Type = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _URI =
			{
				Fragments._URI__OclAny /* 0 */,
				Fragments._URI__URI /* 1 */
			};
		private static final int /*@NonNull*/ [] __URI = { 1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._AnnotatedElement.initFragments(_AnnotatedElement, __AnnotatedElement);
			Types._Annotation.initFragments(_Annotation, __Annotation);
			Types._ArrayType.initFragments(_ArrayType, __ArrayType);
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._AttributeName.initFragments(_AttributeName, __AttributeName);
			Types._AttributeState.initFragments(_AttributeState, __AttributeState);
			Types._BasicType.initFragments(_BasicType, __BasicType);
			Types._Boolean.initFragments(_Boolean, __Boolean);
			Types._BooleanType.initFragments(_BooleanType, __BooleanType);
			Types._Category.initFragments(_Category, __Category);
			Types._Configuration.initFragments(_Configuration, __Configuration);
			Types._Constraint.initFragments(_Constraint, __Constraint);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._EObjectType.initFragments(_EObjectType, __EObjectType);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._EnumerationLiteral.initFragments(_EnumerationLiteral, __EnumerationLiteral);
			Types._EnumerationType.initFragments(_EnumerationType, __EnumerationType);
			Types._Extension.initFragments(_Extension, __Extension);
			Types._FSM.initFragments(_FSM, __FSM);
			Types._Integer.initFragments(_Integer, __Integer);
			Types._Kind.initFragments(_Kind, __Kind);
			Types._Link.initFragments(_Link, __Link);
			Types._Mixin.initFragments(_Mixin, __Mixin);
			Types._MixinBase.initFragments(_MixinBase, __MixinBase);
			Types._Name.initFragments(_Name, __Name);
			Types._NumericType.initFragments(_NumericType, __NumericType);
			Types._NumericTypeEnum.initFragments(_NumericTypeEnum, __NumericTypeEnum);
			Types._OCL.initFragments(_OCL, __OCL);
			Types._RecordField.initFragments(_RecordField, __RecordField);
			Types._RecordType.initFragments(_RecordType, __RecordType);
			Types._Resource.initFragments(_Resource, __Resource);
			Types._Scheme.initFragments(_Scheme, __Scheme);
			Types._State.initFragments(_State, __State);
			Types._String.initFragments(_String, __String);
			Types._StringType.initFragments(_StringType, __StringType);
			Types._Transition.initFragments(_Transition, __Transition);
			Types._Type.initFragments(_Type, __Type);
			Types._URI.initFragments(_URI, __URI);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__AnnotatedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__Category = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotatedElement__AnnotatedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotatedElement__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AnnotatedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Annotation__Annotation = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Annotation__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Annotation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayType__ArrayType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayType__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ArrayType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Attribute__AnnotatedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AttributeName__AttributeName = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AttributeName__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AttributeState__AttributeState = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AttributeState__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _AttributeState__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BasicType__BasicType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BasicType__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BasicType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BasicType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Boolean__Boolean = {
			OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._Boolean__and /* _'and'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__implies /* _'implies'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__not /* _'not'() */,
			OCLstdlibTables.Operations._Boolean__or /* _'or'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__xor /* _'xor'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._Boolean__and2 /* and2(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__implies2 /* implies2(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__not2 /* not2() */,
			OCLstdlibTables.Operations._Boolean__or2 /* or2(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__toString /* toString() */,
			OCLstdlibTables.Operations._Boolean__xor2 /* xor2(Boolean[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Boolean__OclAny = {
			OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf[?]) */,
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
			OCLstdlibTables.Operations._Boolean__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanType__BooleanType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanType__BasicType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanType__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BooleanType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Category__Category = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Category__AnnotatedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Category__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Category__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configuration__Configuration = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configuration__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Configuration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Constraint__Constraint = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Constraint__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Constraint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DataType__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DataType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _DataType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EObjectType__EObjectType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EObjectType__BasicType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EObjectType__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EObjectType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EObjectType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Entity__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Entity__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumerationLiteral__EnumerationLiteral = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumerationLiteral__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumerationLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumerationType__EnumerationType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumerationType__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumerationType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _EnumerationType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Extension__Extension = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Extension__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Extension__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FSM__FSM = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FSM__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _FSM__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Integer__Integer = {
			OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___neg_ /* _'-'() */,
			OCLstdlibTables.Operations._Integer___sub_ /* _'-'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__abs /* abs() */,
			OCLstdlibTables.Operations._Integer__div /* div(Integer[?]) */,
			OCLstdlibTables.Operations._Integer__max /* max(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__min /* min(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__mod /* mod(Integer[?]) */,
			OCLstdlibTables.Operations._Integer__toString /* toString() */,
			OCLstdlibTables.Operations._Integer__toUnlimitedNatural /* toUnlimitedNatural() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Integer__OclAny = {
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
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
			OCLstdlibTables.Operations._Integer__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Integer__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclComparable__compareTo /* compareTo(OclSelf[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Integer__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Integer__Real = {
			OCLstdlibTables.Operations._Integer___mul_ /* _'*'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___add_ /* _'+'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___neg_ /* _'-'() */,
			OCLstdlibTables.Operations._Integer___sub_ /* _'-'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer___div_ /* _'/'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__abs /* abs() */,
			OCLstdlibTables.Operations._Real__floor /* floor() */,
			OCLstdlibTables.Operations._Integer__max /* max(OclSelf[?]) */,
			OCLstdlibTables.Operations._Integer__min /* min(OclSelf[?]) */,
			OCLstdlibTables.Operations._Real__round /* round() */,
			OCLstdlibTables.Operations._Integer__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Kind__Kind = {
			OCCITables.Operations._Kind__occiIsKindOf /* occiIsKindOf(Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Kind__AnnotatedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Kind__Category = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Kind__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Kind__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Kind__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Link__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mixin__Mixin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mixin__AnnotatedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mixin__Category = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mixin__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mixin__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Mixin__Type = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MixinBase__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MixinBase__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _MixinBase__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Name__Name = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Name__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumericType__NumericType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumericType__BasicType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumericType__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumericType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumericType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumericTypeEnum__NumericTypeEnum = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumericTypeEnum__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumericTypeEnum__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumericTypeEnum__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _NumericTypeEnum__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OCL__OCL = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _OCL__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecordField__RecordField = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecordField__AnnotatedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecordField__Attribute = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecordField__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecordField__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecordType__RecordType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecordType__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecordType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RecordType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scheme__Scheme = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scheme__OclAny = {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _State__State = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _State__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _State__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _String__String = {
			OCLstdlibTables.Operations._String___add_ /* _'+'(String[?]) */,
			OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__at /* at(Integer[?]) */,
			OCLstdlibTables.Operations._String__characters /* characters() */,
			OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__concat /* concat(String[?]) */,
			OCLstdlibTables.Operations._String__endsWith /* endsWith(String[?]) */,
			OCLstdlibTables.Operations._String__equalsIgnoreCase /* equalsIgnoreCase(String[?]) */,
//			OCLstdlibTables.Operations._String__getSeverity /* getSeverity() */,
			OCLstdlibTables.Operations._String__indexOf /* indexOf(String[?]) */,
			OCLstdlibTables.Operations._String__lastIndexOf /* lastIndexOf(String[?]) */,
//			OCLstdlibTables.Operations._String__0_logDiagnostic /* logDiagnostic(OclAny[1],OclAny[?],OclAny[?],Integer[1],Boolean[?],Integer[1]) */,
//			OCLstdlibTables.Operations._String__1_logDiagnostic /* logDiagnostic(OclAny[1],OclAny[?],OclAny[?],OclAny[?],String[?],Integer[1],OclAny[?],Integer[1]) */,
			OCLstdlibTables.Operations._String__matches /* matches(String[?]) */,
			OCLstdlibTables.Operations._String__replaceAll /* replaceAll(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__replaceFirst /* replaceFirst(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__size /* size() */,
			OCLstdlibTables.Operations._String__startsWith /* startsWith(String[?]) */,
			OCLstdlibTables.Operations._String__substituteAll /* substituteAll(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__substituteFirst /* substituteFirst(String[?],String[?]) */,
			OCLstdlibTables.Operations._String__substring /* substring(Integer[?],Integer[?]) */,
			OCLstdlibTables.Operations._String__toBoolean /* toBoolean() */,
			OCLstdlibTables.Operations._String__toInteger /* toInteger() */,
			OCLstdlibTables.Operations._String__toLower /* toLower() */,
			OCLstdlibTables.Operations._String__toLowerCase /* toLowerCase() */,
			OCLstdlibTables.Operations._String__toReal /* toReal() */,
			OCLstdlibTables.Operations._String__toString /* toString() */,
			OCLstdlibTables.Operations._String__toUpper /* toUpper() */,
			OCLstdlibTables.Operations._String__toUpperCase /* toUpperCase() */,
			OCLstdlibTables.Operations._String__0_tokenize /* tokenize() */,
			OCLstdlibTables.Operations._String__1_tokenize /* tokenize(String[?]) */,
			OCLstdlibTables.Operations._String__2_tokenize /* tokenize(String[?],Boolean[?]) */,
			OCLstdlibTables.Operations._String__trim /* trim() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _String__OclAny = {
			OCLstdlibTables.Operations._String___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___eq_ /* _'='(OclSelf[?]) */,
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
			OCLstdlibTables.Operations._String__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _String__OclComparable = {
			OCLstdlibTables.Operations._String___lt_ /* _'<'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___lt__eq_ /* _'<='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt_ /* _'>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._String___gt__eq_ /* _'>='(OclSelf[?]) */,
			OCLstdlibTables.Operations._String__compareTo /* compareTo(OclSelf[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _String__OclSummable = {
			OCLstdlibTables.Operations._OclSummable__sum /* sum(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclSummable__zero /* zero() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringType__StringType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringType__BasicType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringType__DataType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringType__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _StringType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Transition__Transition = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Transition__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Transition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__Type = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__AnnotatedElement = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__Category = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _URI__URI = {};
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

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__AnnotatedElement.initOperations(_Action__AnnotatedElement);
			Fragments._Action__Category.initOperations(_Action__Category);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);

			Fragments._AnnotatedElement__AnnotatedElement.initOperations(_AnnotatedElement__AnnotatedElement);
			Fragments._AnnotatedElement__OclAny.initOperations(_AnnotatedElement__OclAny);
			Fragments._AnnotatedElement__OclElement.initOperations(_AnnotatedElement__OclElement);

			Fragments._Annotation__Annotation.initOperations(_Annotation__Annotation);
			Fragments._Annotation__OclAny.initOperations(_Annotation__OclAny);
			Fragments._Annotation__OclElement.initOperations(_Annotation__OclElement);

			Fragments._ArrayType__ArrayType.initOperations(_ArrayType__ArrayType);
			Fragments._ArrayType__DataType.initOperations(_ArrayType__DataType);
			Fragments._ArrayType__OclAny.initOperations(_ArrayType__OclAny);
			Fragments._ArrayType__OclElement.initOperations(_ArrayType__OclElement);

			Fragments._Attribute__AnnotatedElement.initOperations(_Attribute__AnnotatedElement);
			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);

			Fragments._AttributeName__AttributeName.initOperations(_AttributeName__AttributeName);
			Fragments._AttributeName__OclAny.initOperations(_AttributeName__OclAny);

			Fragments._AttributeState__AttributeState.initOperations(_AttributeState__AttributeState);
			Fragments._AttributeState__OclAny.initOperations(_AttributeState__OclAny);
			Fragments._AttributeState__OclElement.initOperations(_AttributeState__OclElement);

			Fragments._BasicType__BasicType.initOperations(_BasicType__BasicType);
			Fragments._BasicType__DataType.initOperations(_BasicType__DataType);
			Fragments._BasicType__OclAny.initOperations(_BasicType__OclAny);
			Fragments._BasicType__OclElement.initOperations(_BasicType__OclElement);

			Fragments._Boolean__Boolean.initOperations(_Boolean__Boolean);
			Fragments._Boolean__OclAny.initOperations(_Boolean__OclAny);

			Fragments._BooleanType__BasicType.initOperations(_BooleanType__BasicType);
			Fragments._BooleanType__BooleanType.initOperations(_BooleanType__BooleanType);
			Fragments._BooleanType__DataType.initOperations(_BooleanType__DataType);
			Fragments._BooleanType__OclAny.initOperations(_BooleanType__OclAny);
			Fragments._BooleanType__OclElement.initOperations(_BooleanType__OclElement);

			Fragments._Category__AnnotatedElement.initOperations(_Category__AnnotatedElement);
			Fragments._Category__Category.initOperations(_Category__Category);
			Fragments._Category__OclAny.initOperations(_Category__OclAny);
			Fragments._Category__OclElement.initOperations(_Category__OclElement);

			Fragments._Configuration__Configuration.initOperations(_Configuration__Configuration);
			Fragments._Configuration__OclAny.initOperations(_Configuration__OclAny);
			Fragments._Configuration__OclElement.initOperations(_Configuration__OclElement);

			Fragments._Constraint__Constraint.initOperations(_Constraint__Constraint);
			Fragments._Constraint__OclAny.initOperations(_Constraint__OclAny);
			Fragments._Constraint__OclElement.initOperations(_Constraint__OclElement);

			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);

			Fragments._EObjectType__BasicType.initOperations(_EObjectType__BasicType);
			Fragments._EObjectType__DataType.initOperations(_EObjectType__DataType);
			Fragments._EObjectType__EObjectType.initOperations(_EObjectType__EObjectType);
			Fragments._EObjectType__OclAny.initOperations(_EObjectType__OclAny);
			Fragments._EObjectType__OclElement.initOperations(_EObjectType__OclElement);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._EnumerationLiteral__EnumerationLiteral.initOperations(_EnumerationLiteral__EnumerationLiteral);
			Fragments._EnumerationLiteral__OclAny.initOperations(_EnumerationLiteral__OclAny);
			Fragments._EnumerationLiteral__OclElement.initOperations(_EnumerationLiteral__OclElement);

			Fragments._EnumerationType__DataType.initOperations(_EnumerationType__DataType);
			Fragments._EnumerationType__EnumerationType.initOperations(_EnumerationType__EnumerationType);
			Fragments._EnumerationType__OclAny.initOperations(_EnumerationType__OclAny);
			Fragments._EnumerationType__OclElement.initOperations(_EnumerationType__OclElement);

			Fragments._Extension__Extension.initOperations(_Extension__Extension);
			Fragments._Extension__OclAny.initOperations(_Extension__OclAny);
			Fragments._Extension__OclElement.initOperations(_Extension__OclElement);

			Fragments._FSM__FSM.initOperations(_FSM__FSM);
			Fragments._FSM__OclAny.initOperations(_FSM__OclAny);
			Fragments._FSM__OclElement.initOperations(_FSM__OclElement);

			Fragments._Integer__Integer.initOperations(_Integer__Integer);
			Fragments._Integer__OclAny.initOperations(_Integer__OclAny);
			Fragments._Integer__OclComparable.initOperations(_Integer__OclComparable);
			Fragments._Integer__OclSummable.initOperations(_Integer__OclSummable);
			Fragments._Integer__Real.initOperations(_Integer__Real);

			Fragments._Kind__AnnotatedElement.initOperations(_Kind__AnnotatedElement);
			Fragments._Kind__Category.initOperations(_Kind__Category);
			Fragments._Kind__Kind.initOperations(_Kind__Kind);
			Fragments._Kind__OclAny.initOperations(_Kind__OclAny);
			Fragments._Kind__OclElement.initOperations(_Kind__OclElement);
			Fragments._Kind__Type.initOperations(_Kind__Type);

			Fragments._Link__Entity.initOperations(_Link__Entity);
			Fragments._Link__Link.initOperations(_Link__Link);
			Fragments._Link__OclAny.initOperations(_Link__OclAny);
			Fragments._Link__OclElement.initOperations(_Link__OclElement);

			Fragments._Mixin__AnnotatedElement.initOperations(_Mixin__AnnotatedElement);
			Fragments._Mixin__Category.initOperations(_Mixin__Category);
			Fragments._Mixin__Mixin.initOperations(_Mixin__Mixin);
			Fragments._Mixin__OclAny.initOperations(_Mixin__OclAny);
			Fragments._Mixin__OclElement.initOperations(_Mixin__OclElement);
			Fragments._Mixin__Type.initOperations(_Mixin__Type);

			Fragments._MixinBase__MixinBase.initOperations(_MixinBase__MixinBase);
			Fragments._MixinBase__OclAny.initOperations(_MixinBase__OclAny);
			Fragments._MixinBase__OclElement.initOperations(_MixinBase__OclElement);

			Fragments._Name__Name.initOperations(_Name__Name);
			Fragments._Name__OclAny.initOperations(_Name__OclAny);

			Fragments._NumericType__BasicType.initOperations(_NumericType__BasicType);
			Fragments._NumericType__DataType.initOperations(_NumericType__DataType);
			Fragments._NumericType__NumericType.initOperations(_NumericType__NumericType);
			Fragments._NumericType__OclAny.initOperations(_NumericType__OclAny);
			Fragments._NumericType__OclElement.initOperations(_NumericType__OclElement);

			Fragments._NumericTypeEnum__NumericTypeEnum.initOperations(_NumericTypeEnum__NumericTypeEnum);
			Fragments._NumericTypeEnum__OclAny.initOperations(_NumericTypeEnum__OclAny);
			Fragments._NumericTypeEnum__OclElement.initOperations(_NumericTypeEnum__OclElement);
			Fragments._NumericTypeEnum__OclEnumeration.initOperations(_NumericTypeEnum__OclEnumeration);
			Fragments._NumericTypeEnum__OclType.initOperations(_NumericTypeEnum__OclType);

			Fragments._OCL__OCL.initOperations(_OCL__OCL);
			Fragments._OCL__OclAny.initOperations(_OCL__OclAny);

			Fragments._RecordField__AnnotatedElement.initOperations(_RecordField__AnnotatedElement);
			Fragments._RecordField__Attribute.initOperations(_RecordField__Attribute);
			Fragments._RecordField__OclAny.initOperations(_RecordField__OclAny);
			Fragments._RecordField__OclElement.initOperations(_RecordField__OclElement);
			Fragments._RecordField__RecordField.initOperations(_RecordField__RecordField);

			Fragments._RecordType__DataType.initOperations(_RecordType__DataType);
			Fragments._RecordType__OclAny.initOperations(_RecordType__OclAny);
			Fragments._RecordType__OclElement.initOperations(_RecordType__OclElement);
			Fragments._RecordType__RecordType.initOperations(_RecordType__RecordType);

			Fragments._Resource__Entity.initOperations(_Resource__Entity);
			Fragments._Resource__OclAny.initOperations(_Resource__OclAny);
			Fragments._Resource__OclElement.initOperations(_Resource__OclElement);
			Fragments._Resource__Resource.initOperations(_Resource__Resource);

			Fragments._Scheme__OclAny.initOperations(_Scheme__OclAny);
			Fragments._Scheme__Scheme.initOperations(_Scheme__Scheme);

			Fragments._State__OclAny.initOperations(_State__OclAny);
			Fragments._State__OclElement.initOperations(_State__OclElement);
			Fragments._State__State.initOperations(_State__State);

			Fragments._String__OclAny.initOperations(_String__OclAny);
			Fragments._String__OclComparable.initOperations(_String__OclComparable);
			Fragments._String__OclSummable.initOperations(_String__OclSummable);
			Fragments._String__String.initOperations(_String__String);

			Fragments._StringType__BasicType.initOperations(_StringType__BasicType);
			Fragments._StringType__DataType.initOperations(_StringType__DataType);
			Fragments._StringType__OclAny.initOperations(_StringType__OclAny);
			Fragments._StringType__OclElement.initOperations(_StringType__OclElement);
			Fragments._StringType__StringType.initOperations(_StringType__StringType);

			Fragments._Transition__OclAny.initOperations(_Transition__OclAny);
			Fragments._Transition__OclElement.initOperations(_Transition__OclElement);
			Fragments._Transition__Transition.initOperations(_Transition__Transition);

			Fragments._Type__AnnotatedElement.initOperations(_Type__AnnotatedElement);
			Fragments._Type__Category.initOperations(_Type__Category);
			Fragments._Type__OclAny.initOperations(_Type__OclAny);
			Fragments._Type__OclElement.initOperations(_Type__OclElement);
			Fragments._Type__Type.initOperations(_Type__Type);

			Fragments._URI__OclAny.initOperations(_URI__OclAny);
			Fragments._URI__URI.initOperations(_URI__URI);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Action = {
			OCCITables.Properties._AnnotatedElement__annotations,
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Category__description,
			OCCITables.Properties._Category__name,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AnnotatedElement = {
			OCCITables.Properties._AnnotatedElement__annotations
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Annotation = {
			OCCITables.Properties._Annotation__key,
			OCCITables.Properties._Annotation__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ArrayType = {
			OCCITables.Properties._DataType__documentation,
			OCCITables.Properties._DataType__name,
			OCCITables.Properties._ArrayType__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Attribute = {
			OCCITables.Properties._AnnotatedElement__annotations,
			OCCITables.Properties._Attribute__default,
			OCCITables.Properties._Attribute__description,
			OCCITables.Properties._Attribute__mutable,
			OCCITables.Properties._Attribute__name,
			OCCITables.Properties._Attribute__required,
			OCCITables.Properties._Attribute__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AttributeName = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _AttributeState = {
			OCCITables.Properties._AttributeState__name,
			OCCITables.Properties._AttributeState__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _BasicType = {
			OCCITables.Properties._DataType__documentation,
			OCCITables.Properties._DataType__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Boolean = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _BooleanType = {
			OCCITables.Properties._DataType__documentation,
			OCCITables.Properties._DataType__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Category = {
			OCCITables.Properties._AnnotatedElement__annotations,
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Category__description,
			OCCITables.Properties._Category__name,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Configuration = {
			OCCITables.Properties._Configuration__description,
			OCCITables.Properties._Configuration__location,
			OCCITables.Properties._Configuration__mixins,
			OCCITables.Properties._Configuration__resources,
			OCCITables.Properties._Configuration__use
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Constraint = {
			OCCITables.Properties._Constraint__body,
			OCCITables.Properties._Constraint__description,
			OCCITables.Properties._Constraint__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _DataType = {
			OCCITables.Properties._DataType__documentation,
			OCCITables.Properties._DataType__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _EObjectType = {
			OCCITables.Properties._DataType__documentation,
			OCCITables.Properties._EObjectType__instanceClassName,
			OCCITables.Properties._DataType__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Entity = {
			OCCITables.Properties._Entity__attributes,
			OCCITables.Properties._Entity__id,
			OCCITables.Properties._Entity__kind,
			OCCITables.Properties._Entity__location,
			OCCITables.Properties._Entity__mixins,
			OCCITables.Properties._Entity__parts,
			OCCITables.Properties._Entity__title
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _EnumerationLiteral = {
			OCCITables.Properties._EnumerationLiteral__documentation,
			OCCITables.Properties._EnumerationLiteral__enumerationType,
			OCCITables.Properties._EnumerationLiteral__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _EnumerationType = {
			OCCITables.Properties._DataType__documentation,
			OCCITables.Properties._EnumerationType__literals,
			OCCITables.Properties._DataType__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Extension = {
			OCCITables.Properties._Extension__description,
			OCCITables.Properties._Extension__import,
			OCCITables.Properties._Extension__kinds,
			OCCITables.Properties._Extension__mixins,
			OCCITables.Properties._Extension__name,
			OCCITables.Properties._Extension__scheme,
			OCCITables.Properties._Extension__specification,
			OCCITables.Properties._Extension__types
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _FSM = {
			OCCITables.Properties._FSM__attribute,
			OCCITables.Properties._FSM__ownedState
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Integer = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Kind = {
			OCCITables.Properties._Type__actions,
			OCCITables.Properties._AnnotatedElement__annotations,
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Type__constraints,
			OCCITables.Properties._Category__description,
			OCCITables.Properties._Kind__entities,
			OCCITables.Properties._Type__fsm,
			OCCITables.Properties._Category__name,
			OCCITables.Properties._Kind__parent,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Kind__source,
			OCCITables.Properties._Kind__target,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Link = {
			OCCITables.Properties._Entity__attributes,
			OCCITables.Properties._Entity__id,
			OCCITables.Properties._Entity__kind,
			OCCITables.Properties._Entity__location,
			OCCITables.Properties._Entity__mixins,
			OCCITables.Properties._Entity__parts,
			OCCITables.Properties._Link__source,
			OCCITables.Properties._Link__target,
			OCCITables.Properties._Entity__title
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Mixin = {
			OCCITables.Properties._Type__actions,
			OCCITables.Properties._AnnotatedElement__annotations,
			OCCITables.Properties._Mixin__applies,
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Type__constraints,
			OCCITables.Properties._Mixin__depends,
			OCCITables.Properties._Category__description,
			OCCITables.Properties._Mixin__entities,
			OCCITables.Properties._Type__fsm,
			OCCITables.Properties._Category__name,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _MixinBase = {
			OCCITables.Properties._MixinBase__attributes,
			OCCITables.Properties._MixinBase__entity,
			OCCITables.Properties._MixinBase__mixin
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Name = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NumericType = {
			OCCITables.Properties._DataType__documentation,
			OCCITables.Properties._NumericType__maxExclusive,
			OCCITables.Properties._NumericType__maxInclusive,
			OCCITables.Properties._NumericType__minExclusive,
			OCCITables.Properties._NumericType__minInclusive,
			OCCITables.Properties._DataType__name,
			OCCITables.Properties._NumericType__totalDigits,
			OCCITables.Properties._NumericType__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _NumericTypeEnum = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _OCL = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RecordField = {
			OCCITables.Properties._AnnotatedElement__annotations,
			OCCITables.Properties._Attribute__default,
			OCCITables.Properties._Attribute__description,
			OCCITables.Properties._Attribute__mutable,
			OCCITables.Properties._Attribute__name,
			OCCITables.Properties._Attribute__required,
			OCCITables.Properties._Attribute__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RecordType = {
			OCCITables.Properties._DataType__documentation,
			OCCITables.Properties._DataType__name,
			OCCITables.Properties._RecordType__recordFields
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Resource = {
			OCCITables.Properties._Entity__attributes,
			OCCITables.Properties._Entity__id,
			OCCITables.Properties._Entity__kind,
			OCCITables.Properties._Resource__links,
			OCCITables.Properties._Entity__location,
			OCCITables.Properties._Entity__mixins,
			OCCITables.Properties._Entity__parts,
			OCCITables.Properties._Resource__rlinks,
			OCCITables.Properties._Resource__summary,
			OCCITables.Properties._Entity__title
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Scheme = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _State = {
			OCCITables.Properties._State__final,
			OCCITables.Properties._State__initial,
			OCCITables.Properties._State__literal,
			OCCITables.Properties._State__outgoingTransition,
			OCCITables.Properties._State__owningFSM
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _String = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _StringType = {
			OCCITables.Properties._DataType__documentation,
			OCCITables.Properties._StringType__length,
			OCCITables.Properties._StringType__maxLength,
			OCCITables.Properties._StringType__minLength,
			OCCITables.Properties._DataType__name,
			OCCITables.Properties._StringType__pattern
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Transition = {
			OCCITables.Properties._Transition__action,
			OCCITables.Properties._Transition__source,
			OCCITables.Properties._Transition__target
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Type = {
			OCCITables.Properties._Type__actions,
			OCCITables.Properties._AnnotatedElement__annotations,
			OCCITables.Properties._Category__attributes,
			OCCITables.Properties._Type__constraints,
			OCCITables.Properties._Category__description,
			OCCITables.Properties._Type__fsm,
			OCCITables.Properties._Category__name,
			OCCITables.Properties._Category__scheme,
			OCCITables.Properties._Category__term,
			OCCITables.Properties._Category__title
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _URI = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._AnnotatedElement__AnnotatedElement.initProperties(_AnnotatedElement);
			Fragments._Annotation__Annotation.initProperties(_Annotation);
			Fragments._ArrayType__ArrayType.initProperties(_ArrayType);
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._AttributeName__AttributeName.initProperties(_AttributeName);
			Fragments._AttributeState__AttributeState.initProperties(_AttributeState);
			Fragments._BasicType__BasicType.initProperties(_BasicType);
			Fragments._Boolean__Boolean.initProperties(_Boolean);
			Fragments._BooleanType__BooleanType.initProperties(_BooleanType);
			Fragments._Category__Category.initProperties(_Category);
			Fragments._Configuration__Configuration.initProperties(_Configuration);
			Fragments._Constraint__Constraint.initProperties(_Constraint);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._EObjectType__EObjectType.initProperties(_EObjectType);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._EnumerationLiteral__EnumerationLiteral.initProperties(_EnumerationLiteral);
			Fragments._EnumerationType__EnumerationType.initProperties(_EnumerationType);
			Fragments._Extension__Extension.initProperties(_Extension);
			Fragments._FSM__FSM.initProperties(_FSM);
			Fragments._Integer__Integer.initProperties(_Integer);
			Fragments._Kind__Kind.initProperties(_Kind);
			Fragments._Link__Link.initProperties(_Link);
			Fragments._Mixin__Mixin.initProperties(_Mixin);
			Fragments._MixinBase__MixinBase.initProperties(_MixinBase);
			Fragments._Name__Name.initProperties(_Name);
			Fragments._NumericType__NumericType.initProperties(_NumericType);
			Fragments._NumericTypeEnum__NumericTypeEnum.initProperties(_NumericTypeEnum);
			Fragments._OCL__OCL.initProperties(_OCL);
			Fragments._RecordField__RecordField.initProperties(_RecordField);
			Fragments._RecordType__RecordType.initProperties(_RecordType);
			Fragments._Resource__Resource.initProperties(_Resource);
			Fragments._Scheme__Scheme.initProperties(_Scheme);
			Fragments._State__State.initProperties(_State);
			Fragments._String__String.initProperties(_String);
			Fragments._StringType__StringType.initProperties(_StringType);
			Fragments._Transition__Transition.initProperties(_Transition);
			Fragments._Type__Type.initProperties(_Type);
			Fragments._URI__URI.initProperties(_URI);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::FragmentProperties and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NumericTypeEnum__Byte = new EcoreExecutorEnumerationLiteral(OCCIPackage.Literals.NUMERIC_TYPE_ENUM.getEEnumLiteral("Byte"), Types._NumericTypeEnum, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NumericTypeEnum__Double = new EcoreExecutorEnumerationLiteral(OCCIPackage.Literals.NUMERIC_TYPE_ENUM.getEEnumLiteral("Double"), Types._NumericTypeEnum, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NumericTypeEnum__Float = new EcoreExecutorEnumerationLiteral(OCCIPackage.Literals.NUMERIC_TYPE_ENUM.getEEnumLiteral("Float"), Types._NumericTypeEnum, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NumericTypeEnum__Integer = new EcoreExecutorEnumerationLiteral(OCCIPackage.Literals.NUMERIC_TYPE_ENUM.getEEnumLiteral("Integer"), Types._NumericTypeEnum, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NumericTypeEnum__Long = new EcoreExecutorEnumerationLiteral(OCCIPackage.Literals.NUMERIC_TYPE_ENUM.getEEnumLiteral("Long"), Types._NumericTypeEnum, 4);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NumericTypeEnum__Short = new EcoreExecutorEnumerationLiteral(OCCIPackage.Literals.NUMERIC_TYPE_ENUM.getEEnumLiteral("Short"), Types._NumericTypeEnum, 5);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _NumericTypeEnum__BigDecimal = new EcoreExecutorEnumerationLiteral(OCCIPackage.Literals.NUMERIC_TYPE_ENUM.getEEnumLiteral("BigDecimal"), Types._NumericTypeEnum, 6);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _NumericTypeEnum = {
			_NumericTypeEnum__Byte,
			_NumericTypeEnum__Double,
			_NumericTypeEnum__Float,
			_NumericTypeEnum__Integer,
			_NumericTypeEnum__Long,
			_NumericTypeEnum__Short,
			_NumericTypeEnum__BigDecimal
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._NumericTypeEnum.initLiterals(_NumericTypeEnum);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OCCITables::EnumerationLiterals and all preceding sub-packages.
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
