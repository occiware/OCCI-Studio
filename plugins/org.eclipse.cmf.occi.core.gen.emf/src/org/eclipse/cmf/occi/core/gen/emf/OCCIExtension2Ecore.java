/*******************************************************************************
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   William Piers <william.piers@obeo.fr>
 *     Philippe Merle <philippe.merle@inria.fr>
 *     Faiez Zalila <faiez.zalila@inria.fr>
 *******************************************************************************/
package org.eclipse.cmf.occi.core.gen.emf;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toMap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.ArrayType;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.BasicType;
import org.eclipse.cmf.occi.core.BooleanType;
import org.eclipse.cmf.occi.core.Category;
import org.eclipse.cmf.occi.core.Constraint;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.NumericType;
import org.eclipse.cmf.occi.core.RecordField;
import org.eclipse.cmf.occi.core.RecordType;
import org.eclipse.cmf.occi.core.StringType;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.cmf.occi.core.util.Occi2Ecore;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.google.common.collect.Lists;

/**
 * Convert an OCCI Extension to Ecore.
 */
public class OCCIExtension2Ecore {
	/**
	 * Store mapping from OCCI Kind to Ecore EClass.
	 */
	private Map<Type, EClass> occiKind2emfEclass = new HashMap<Type, EClass>();

	/**
	 * Get the EClass associated to an OCCI Kind.
	 * 
	 * @param kind the given OCCI kind.
	 * @return the EClass.
	 */
	private EClass getMappedEClass(Type type) {
		EClass res = null;
		if (type != null) {
			// retrieve from currently converted kinds
			res = occiKind2emfEclass.get(type);
			if (res == null) {
				// retrieve from installed extensions.
				EPackage p = ConverterUtils.getEPackage(type);
				res = (EClass) p.getEClassifier(ConverterUtils.toU1Case(ConverterUtils.formatName(type.getTerm())));
				// Cache it for optimizing next searches.
				occiKind2emfEclass.put(type, res);
			}
		}
		return res;
	}

	/**
	 * Store mapping from OCCI EDataType to Ecore EClassifier.
	 */
	private Map<DataType, EClassifier> occiType2emfType = new HashMap<DataType, EClassifier>();

	/**
	 * Get the EMF data type associated to an OCCI data type.
	 * 
	 * @param type the given OCCI data type.
	 * @return the EMF data type.
	 */
	private EClassifier getMappedType(DataType type) {
		EClassifier res = null;
		if (type == null) {
			res = EcorePackage.eINSTANCE.getEString();
		} else {
			// retrieve from currently converted data types
			res = occiType2emfType.get(type);
			if (res == null) {
				if (((Extension) type.eContainer()).getScheme().equals("http://schemas.ogf.org/occi/core#")) {
					if(type.getName().equals("String"))
						res = EcorePackage.eINSTANCE.getEString();
					if(type.getName().equals("Boolean"))
						res = EcorePackage.eINSTANCE.getEBoolean();
					if(type.getName().equals("Integer"))
						res = EcorePackage.eINSTANCE.getEInt();
				} else {
					// retrieve from installed extensions.
					EPackage p = ConverterUtils.getEPackage(type);
					res = p.getEClassifier(type.getName());
					// Cache it for optimizing next searches.
				}
				occiType2emfType.put(type, res);
			}
		}
		//System.out.println("occiType2emfType "+occiType2emfType);
		return res;
	}

	/**
	 * Convert an OCCI extension to an Ecore package.
	 * 
	 * @param extension the OCCI extension to convert.
	 * @return the resulting Ecore package.
	 */
	public EPackage convertExtension(Extension extension) {
		// Create the Ecore package.
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		// Set the name of the Ecore package.
		String formattedName = formatExtensionName(extension);
		ePackage.setName(formattedName);
		// Set the name space prefix of the Ecore package.
		ePackage.setNsPrefix(formattedName);
		// Set the URI of the Ecore package.
		ePackage.setNsURI(Occi2Ecore.convertOcciScheme2EcoreNamespace(extension.getScheme()));

		// fetch occi package
		// but won't solve issue if user wants to use types from installed
		// models
		// EClass root = EcoreFactory.eINSTANCE.createEClass();
		// ePackage.getEClassifiers().add(root);
		// root.setName(ConverterUtils.toU1Case(extension.getName()+"Configuration"));
		// root.getESuperTypes().add(OCCIPackage.eINSTANCE.getConfiguration());

		// Convert all data types of the OCCI extension to data types of the
		// Ecore package.

		for (DataType type : extension.getTypes()) {
			// // Create the EMF type from the OCCI data type.
			EClassifier createdEMFType = null;
			if (type instanceof StringType) {
				createdEMFType = createStringType((StringType) type);
			}
			if (type instanceof NumericType) {
				createdEMFType = createNumericType((NumericType) type);
			}
			if (type instanceof BooleanType) {
				createdEMFType = createBooleanType((BooleanType) type);
			}
			if (type instanceof EnumerationType) {
				createdEMFType = createEnumerationType((EnumerationType) type);
			}
			if (type instanceof EObjectType) {
				createdEMFType = createEObjectType((EObjectType) type);
			}
			if (type instanceof ArrayType) {
				createdEMFType = createArrayType((ArrayType) type);
			}
			if (type instanceof RecordType) {
				createdEMFType = createRecordType((RecordType) type);
			}
			// Cache the copied data type to search it later.
			occiType2emfType.put(type, createdEMFType);
			// Add the data type to the Ecore package.
			ePackage.getEClassifiers().add(createdEMFType);
		}
		// Resolve types of arrays attributes and record attributes
		// Why here: pattern matching
		for (DataType type : extension.getTypes()) {
			if (type instanceof ArrayType) {
				completeArrayTypeFeatures((ArrayType) type, (EClass) occiType2emfType.get(type), ePackage);
			}
			if (type instanceof RecordType) {
				completeRecordTypeFeatures((RecordType) type, (EClass) occiType2emfType.get(type));
			}
		}
		// Convert all OCCI kinds.
		for (Kind kind : extension.getKinds()) {
			// Convert each OCCI kind to an Ecore class.
			EClass convertKind = convertKind(kind);
			// Add the Ecore class to the Ecore package.
			if (convertKind != null) {
				ePackage.getEClassifiers().add(convertKind);
			}
		}

		// Convert all OCCI mixins.
		for (Mixin mixin : extension.getMixins()) {
			EClass convertMixin = convertMixin(mixin);
			if (convertMixin != null) {
				ePackage.getEClassifiers().add(convertMixin);
			}
		}

		// Resolve inheritance between OCCI kinds.
		for (Kind kind : extension.getKinds()) {
			// System.out.println("kind "+kind);
			// Get the Ecore class of this OCCI kind.
			EClass mappedEClass = getMappedEClass(kind);
			// System.out.println("getMappedEClass(kind) "+getMappedEClass(kind));
			// If kind has a parent kind then
			if (kind.getParent() != null) {
				// Get the Ecore class of the OCCI kind's parent.
				EClass mappedParentEClass = getMappedEClass(kind.getParent());
				// System.out.println("kind.getParent() "+kind.getParent());
				// System.out.println("getMappedEClass(kind.getParent())
				// "+getMappedEClass(kind.getParent()));
				// System.out.println("--------------------");
				if (mappedParentEClass != null) {
					// The Ecore class of the kind's parent is a super type of
					// the Ecore class of the OCCI kind.
					// System.out.println("mappedParentEClass " + mappedParentEClass +
					// mappedEClass.getEPackage());
					mappedEClass.getESuperTypes().add(mappedParentEClass);
				} else {
					// Should never happen!
					throw new IllegalArgumentException("Not found: " + kind.getParent());
				}
			}
		}

		// Resolve inheritance between OCCI mixins.
		for (Mixin mixin : extension.getMixins()) {
			// System.out.println("mixin "+mixin);
			// Get the Ecore class of this OCCI kind.
			// System.out.println("mappedParentEClass " + mixin);
			EClass mappedEClass = getMappedEClass(mixin);
			// System.out.println("getMappedEClass(mixin) "+getMappedEClass(mixin));
			// System.out.println("mappedParentEClass " + mappedEClass);

			// If kind has a parent kind then
			if (mixin.getDepends() != null) {
				// Get the Ecore class of the OCCI kind's parent.
				for (Mixin superMixin : mixin.getDepends()) {
					EClass mappedParentEClass = getMappedEClass(superMixin);
					// System.out.println("superMixin "+superMixin);
					// System.out.println("mappedParentEClass "+mappedParentEClass);
					if (mappedParentEClass != null) {
						// The Ecore class of the kind's parent is a super type of
						// the Ecore class of the OCCI kind.
						// System.out.println("mappedParentEClass " + mappedParentEClass +
						// mappedEClass.getEPackage());
						mappedEClass.getESuperTypes().add(mappedParentEClass);
					} else {
						// Should never happen!
						throw new IllegalArgumentException("Not found: " + superMixin);
					}
				}
			}
			addSuperTypeFromOCCI(mappedEClass, "MixinBase");
		}
//				System.out.println(occiKind2emfEclass);
		return ePackage;
	}

	// add inheritance to depends
//			for (Mixin superMixin : mixin.getDepends()) {
//				EClass mappedParentEClass = getMappedEClass(superMixin);
//				if (mappedParentEClass != null) {
//					// The Ecore class of the depend is a super type of
//					// the Ecore class of the OCCI mixin.
//					eClass.getESuperTypes().add(mappedParentEClass);
//				} else {
//					// Should never happen!
//					throw new IllegalArgumentException("Not found: " + superMixin);
//				}
//			}

	public static String formatExtensionName(Extension extension) {
		return ConverterUtils
				.formatName(extension.getName().replaceFirst("OCCI ", "").replaceFirst("OCCIware ", "").toLowerCase())
				.replaceAll("-", "_");
	}

	protected EClass convertMixin(Mixin mixin) {
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(ConverterUtils.toU1Case(ConverterUtils.formatName(mixin.getTerm())));
		occiKind2emfEclass.put(mixin, eClass);

		for (Attribute attribute : mixin.getAttributes()) {
			EStructuralFeature convertAttribute = convertAttribute(attribute);
			if (convertAttribute != null) {
				eClass.getEStructuralFeatures().add(convertAttribute);
			}
		}
		for (Action action : mixin.getActions()) {
			EOperation convertAction = convertAction(action);
			if (convertAction != null) {
				eClass.getEOperations().add(convertAction);
			}
		}
		// Add OCL constraints
		convertConstraints(eClass, mixin);
		if (mixin.getApplies().size() > 0) {
			if (mixin.getConstraints().size() > 0) {
				// So, it exists emf and ocl annotations
				EAnnotation annotation_emf = eClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore");
				annotation_emf.getDetails().put("constraints",
						annotation_emf.getDetails().get("constraints") + " appliesConstraint");

				EAnnotation annotation_ocl = eClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
				annotation_ocl.getDetails().put("appliesConstraint", createAppliesContraintBody(mixin));
			} else {
				// EMF Annotation
				EAnnotation annotation_emf = EcoreFactory.eINSTANCE.createEAnnotation();
				annotation_emf.setSource("http://www.eclipse.org/emf/2002/Ecore");
				// OCL Annotation
				EAnnotation annotation_ocl = EcoreFactory.eINSTANCE.createEAnnotation();
				annotation_ocl.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");

				annotation_ocl.getDetails().put("appliesConstraint", createAppliesContraintBody(mixin));
				annotation_emf.getDetails().put("constraints", "appliesConstraint");
				eClass.getEAnnotations().add(annotation_emf);
				eClass.getEAnnotations().add(annotation_ocl);
			}
		}
		return eClass;
	}

	private String createAppliesContraintBody(Mixin mixin) {
		String appliesBody = "";
		for (Kind kind : mixin.getApplies()) {
			if (!(mixin.getApplies().get(0) == kind))
				appliesBody += " or ";
			appliesBody += "self.entity.oclIsKindOf(";
			if (((Extension) kind.eContainer()).getScheme().equals("http://schemas.ogf.org/occi/core#"))
				appliesBody += "occi";
			else
				appliesBody += formatExtensionName((Extension) kind.eContainer());
			appliesBody += "::";
			appliesBody += ConverterUtils.toU1Case(ConverterUtils.formatName(kind.getTerm()));
			appliesBody += ")";
		}
		return appliesBody;
	}

	private Resource createAndLoadOCCIEcoreResource(String pathToDDLEcore) {
		// creating a proper URI is vitally important since this is how
		// referenced objects in the is ecore file will be found from the ecore
		// file that we produce.
		ResourceSet resSet = new ResourceSetImpl();
		final URI uri = URI.createPlatformPluginURI(pathToDDLEcore, true);
		Resource res = resSet.createResource(uri);
		try {
			res.load(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}

	private void addSuperTypeFromOCCI(EClass subClass, String esuperClassName) {
		Resource oCCIEcoreResource = createAndLoadOCCIEcoreResource("org.eclipse.cmf.occi.core/model/OCCI.ecore");
		// of course, in production code we would fail here if there were no
		// contents or they weren't of type EPackage.
		final EPackage oCCIEPackage = (EPackage) oCCIEcoreResource.getContents().get(0);
		final EClass eSuperClass = (EClass) oCCIEPackage.getEClassifier(esuperClassName);
		subClass.getESuperTypes().add(eSuperClass);
	}

	private EEnum createEnumerationType(EnumerationType type) {
		EEnum eenum = EcoreFactory.eINSTANCE.createEEnum();
		eenum.setName(type.getName());
		int value = 0;
		for (EnumerationLiteral literal : type.getLiterals()) {
			EEnumLiteral eenumliteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
			eenum.getELiterals().add(eenumliteral);
			eenumliteral.setName(literal.getName());
			eenumliteral.setLiteral(literal.getName());
			eenumliteral.setValue(value);
			value++;
			if (literal.getDocumentation() != null) {
				attachInfo(eenumliteral, literal.getDocumentation());
			}
		}
		if (type.getDocumentation() != null) {
			attachInfo(eenum, type.getDocumentation());
		}
		return eenum;
	}

	private EDataType createEObjectType(EObjectType type) {
		EDataType edatatype = EcoreFactory.eINSTANCE.createEDataType();
		edatatype.setName(type.getName());
		edatatype.setInstanceTypeName(type.getInstanceClassName());
		if (type.getDocumentation() != null) {
			attachInfo(edatatype, type.getDocumentation());
		}
		return edatatype;
	}

	private EDataType createBooleanType(BooleanType type) {
		EDataType edatatype = EcoreFactory.eINSTANCE.createEDataType();
		edatatype.setName(type.getName());
		edatatype.setInstanceTypeName("java.lang.Boolean");
		if (type.getDocumentation() != null) {
			attachInfo(edatatype, type.getDocumentation());
		}
		return edatatype;
	}

	private EDataType createNumericType(NumericType type) {
		EDataType edatatype = EcoreFactory.eINSTANCE.createEDataType();
		edatatype.setName(type.getName());
		switch (type.getType()) {
		case BYTE:
			edatatype.setInstanceTypeName("java.lang.Byte");
			break;
		case DOUBLE:
			edatatype.setInstanceTypeName("java.lang.Double");
			break;
		case FLOAT:
			edatatype.setInstanceTypeName("java.lang.Float");
			break;
		case INTEGER:
			edatatype.setInstanceTypeName("java.lang.Integer");
			break;
		case LONG:
			edatatype.setInstanceTypeName("java.lang.Long");
			break;
		case SHORT:
			edatatype.setInstanceTypeName("java.lang.Short");
			break;
		case BIG_DECIMAL:
			edatatype.setInstanceTypeName("java.math.BigDecimal");
			break;
		default:
			break;
		}
		if (type.isSetTotalDigits() || type.isSetMinInclusive() || type.isSetMinExclusive() || type.isSetMaxInclusive()
				|| type.isSetMaxExclusive()) {
			EAnnotation eannotation = EcoreFactory.eINSTANCE.createEAnnotation();
			edatatype.getEAnnotations().add(eannotation);
			eannotation.setSource("http:///org/eclipse/emf/ecore/util/ExtendedMetaData");
			if (type.isSetTotalDigits())
				eannotation.getDetails().put("totalDigits", Integer.toString(type.getTotalDigits()));
			if (type.isSetMinInclusive())
				eannotation.getDetails().put("minInclusive", type.getMinInclusive());
			if (type.isSetMinExclusive())
				eannotation.getDetails().put("minExclusive", type.getMinExclusive());
			if (type.isSetMaxInclusive())
				eannotation.getDetails().put("maxInclusive", type.getMaxInclusive());
			if (type.isSetMaxExclusive())
				eannotation.getDetails().put("maxExclusive", type.getMaxExclusive());
		}
		if (type.getDocumentation() != null) {
			attachInfo(edatatype, type.getDocumentation());
		}
		return edatatype;
	}

	private EDataType createStringType(StringType type) {
		EDataType edatatype = EcoreFactory.eINSTANCE.createEDataType();
		edatatype.setName(type.getName());
		edatatype.setInstanceTypeName("java.lang.String");
		if (type.getDocumentation() != null) {
			attachInfo(edatatype, type.getDocumentation());
		}
		if (type.isSetLength() || type.isSetMaxLength() || type.isSetMinLength() || type.getPattern() != null) {
			EAnnotation eannotation = EcoreFactory.eINSTANCE.createEAnnotation();
			edatatype.getEAnnotations().add(eannotation);
			eannotation.setSource("http:///org/eclipse/emf/ecore/util/ExtendedMetaData");
			if (type.isSetLength())
				eannotation.getDetails().put("length", Integer.toString(type.getLength()));
			if (type.isSetMaxLength())
				eannotation.getDetails().put("maxLength", Integer.toString(type.getMaxLength()));
			if (type.isSetMinLength())
				eannotation.getDetails().put("minLength", Integer.toString(type.getMinLength()));
			if (type.getPattern() != null) {
				if (type.getPattern() != "")
					eannotation.getDetails().put("pattern", type.getPattern());
			}
		}
		return edatatype;
	}

	private EClass createArrayType(ArrayType arrayType) {
		// System.out.println("maaaaap " + occiType2emfType);
		EClass type = EcoreFactory.eINSTANCE.createEClass();
		type.setName(arrayType.getName());
		if (arrayType.getDocumentation() != null) {
			attachInfo(type, arrayType.getDocumentation());
		}
		return type;
	}

	private void completeArrayTypeFeatures(ArrayType arrayType, EClass type, EPackage ePackage) {
		if (!(arrayType.getType() instanceof RecordType || arrayType.getType() instanceof ArrayType)) {
			// if the type of ArrayType is a primitive type then we create an
			// attribute
			EAttribute values = EcoreFactory.eINSTANCE.createEAttribute();
			type.getEStructuralFeatures().add(values);
			values.setName("values");
			values.setUpperBound(-1);
			// Set the unique of the Ecore reference to false.
			values.setUnique(false);
			values.setEType(getMappedType(arrayType.getType()));

		} else {
			// otherwise, we create a reference to the generated EClass
			EReference values = EcoreFactory.eINSTANCE.createEReference();
			type.getEStructuralFeatures().add(values);
			values.setName(arrayType.getName().toLowerCase() + "Values");
			values.setUpperBound(-1);
			values.setEType(getMappedType(arrayType.getType()));
			values.setContainment(true);
		}

	}

	private EClass createRecordType(RecordType recordType) {
		// System.out.println("maaaaap " + occiType2emfType);
		EClass type = EcoreFactory.eINSTANCE.createEClass();
		type.setName(recordType.getName());
		if (recordType.getDocumentation() != null) {
			attachInfo(type, recordType.getDocumentation());
		}
		return type;
	}

	private void completeRecordTypeFeatures(RecordType recordType, EClass type) {

		for (RecordField rf : recordType.getRecordFields()) {
			// if the type of the recordField is different to arraytype or a recordtype
			// it will be translated into a EMF attribute
			if (!(rf.getType() instanceof RecordType || rf.getType() instanceof ArrayType)) {
				EAttribute attribute = EcoreFactory.eINSTANCE.createEAttribute();
				type.getEStructuralFeatures().add(attribute);
				attribute.setName(rf.getName());
				attribute.setLowerBound(1);
				attribute.setEType(getMappedType(rf.getType()));

				// Set the default value of the Ecore attribute.
				String defaultValue = rf.getDefault();
				if (defaultValue != null && !defaultValue.isEmpty()) {
					attribute.setDefaultValue(defaultValue);
				}
				// The Ecore attribute is required when the OCCI attribute is required.
				if (attribute.isRequired()) {
					attribute.setLowerBound(1);
				}
				attachInfo(attribute, rf.getDescription());

			} else {
				// otherwise, il will be translated into an EMF reference
				EReference reference = EcoreFactory.eINSTANCE.createEReference();
				type.getEStructuralFeatures().add(reference);
				reference.setName(rf.getName());

				// The Ecore attribute is required when the OCCI attribute is required.
				if (rf.isRequired()) {
					reference.setLowerBound(1);
				}

				reference.setUpperBound(1);
				reference.setEType(getMappedType(rf.getType()));
				reference.setContainment(true);

				// Set the default value of the Ecore attribute.
				// Default values for EMF EReference is not supported
				// see
				// https://www.eclipse.org/forums/index.php?t=msg&th=131049&goto=406266&#msg_406266
//				String defaultValue = rf.getDefault();
//				if (defaultValue != null && !defaultValue.isEmpty()) {
//					reference.setDefaultValue(defaultValue);
//				}

				attachInfo(reference, rf.getDescription());

			}
		}
	}

	/**
	 * Convert an OCCI kind to an Ecore class.
	 * 
	 * @param kind the OCCI kind to convert.
	 * @return the resulting Ecore class.
	 */
	protected EClass convertKind(Kind kind) {
		// Create the Ecore class.
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		// Set the name of the Ecore class.
		eClass.setName(ConverterUtils.toU1Case(ConverterUtils.formatName(kind.getTerm())));
		// Convert all attributes of the OCCI kind.
		for (Attribute attribute : kind.getAttributes()) {
			// Convert each OCCI attribute to an Ecore attribute.
			EStructuralFeature convertAttribute = convertAttribute(attribute);
			if (convertAttribute != null) {
				// Add the Ecore attribute as a structural feature of the Ecore
				// class.
				eClass.getEStructuralFeatures().add(convertAttribute);
			}
		}
		// Convert all actions of the OCCI kind.
		for (Action action : kind.getActions()) {
			// Convert each OCCI action to an Ecore operation.
			EOperation convertAction = convertAction(action);
			if (convertAction != null) {
				// Add the Ecore action as an operation of the Ecore class.
				eClass.getEOperations().add(convertAction);
			}
		}
		attachInfo(eClass, kind.getTitle());
		// Keep the Ecore class into a cache to search it later.
		occiKind2emfEclass.put(kind, eClass);

		// Convert all constraints of the OCCI kind.
		convertConstraints(eClass, kind);

		if (kind.getSource().size() > 0) {
			addSourceConstraint(kind, eClass);
		}
		if (kind.getTarget().size() > 0) {
			addTargetConstraint(kind, eClass);
		}
		return eClass;
	}

	private void addTargetConstraint(Kind kind, EClass eClass) {
		if (eClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot") != null) {
			// So, it exists emf and ocl annotations
			EAnnotation annotation_emf = eClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore");
			annotation_emf.getDetails().put("constraints",
					annotation_emf.getDetails().get("constraints") + " targetConstraint");

			EAnnotation annotation_ocl = eClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
			annotation_ocl.getDetails().put("targetConstraint", createTargetConstraintBody(kind));
		} else {
			// EMF Annotation
			EAnnotation annotation_emf = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation_emf.setSource("http://www.eclipse.org/emf/2002/Ecore");
			// OCL Annotation
			EAnnotation annotation_ocl = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation_ocl.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");

			annotation_ocl.getDetails().put("targetConstraint", createTargetConstraintBody(kind));
			annotation_emf.getDetails().put("constraints", "targetConstraint");
			eClass.getEAnnotations().add(annotation_emf);
			eClass.getEAnnotations().add(annotation_ocl);
		}

	}

	private String createTargetConstraintBody(Kind kind) {
		StringBuilder constraint = new StringBuilder();
		for (Kind targetKind : kind.getTarget()) {
			String epackage_name = formatExtensionName((Extension) targetKind.eContainer());
			if (kind.getTarget().get(0) == targetKind) {
				constraint.append("self.target.oclIsKindOf(" + epackage_name + "::"
						+ ConverterUtils.toU1Case(ConverterUtils.formatName(targetKind.getTerm())) + ")");
			} else {
				constraint.append(" or self.target.oclIsKindOf(" + epackage_name + "::"
						+ ConverterUtils.toU1Case(ConverterUtils.formatName(targetKind.getTerm())) + ")");

			}
		}
		return constraint.toString();
	}

	private void addSourceConstraint(Kind kind, EClass eClass) {

		if (eClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot") != null) {
			// So, it exists emf and ocl annotations
			EAnnotation annotation_emf = eClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore");
			annotation_emf.getDetails().put("constraints",
					annotation_emf.getDetails().get("constraints") + " sourceConstraint");

			EAnnotation annotation_ocl = eClass.getEAnnotation("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
			annotation_ocl.getDetails().put("sourceConstraint", createSourceConstraintBody(kind));
		} else {
			// EMF Annotation
			EAnnotation annotation_emf = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation_emf.setSource("http://www.eclipse.org/emf/2002/Ecore");
			// OCL Annotation
			EAnnotation annotation_ocl = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation_ocl.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");

			annotation_ocl.getDetails().put("sourceConstraint", createSourceConstraintBody(kind));
			annotation_emf.getDetails().put("constraints", "sourceConstraint");
			eClass.getEAnnotations().add(annotation_emf);
			eClass.getEAnnotations().add(annotation_ocl);
		}

	}

	private String createSourceConstraintBody(Kind kind) {
		StringBuilder constraint = new StringBuilder();
		for (Kind sourceKind : kind.getSource()) {
			String epackage_name = formatExtensionName((Extension) sourceKind.eContainer());
			if (kind.getSource().get(0) == sourceKind) {
				constraint.append("self.source.oclIsKindOf(" + epackage_name + "::"
						+ ConverterUtils.toU1Case(ConverterUtils.formatName(sourceKind.getTerm())) + ")");
			} else {
				constraint.append(" or self.source.oclIsKindOf(" + epackage_name + "::"
						+ ConverterUtils.toU1Case(ConverterUtils.formatName(sourceKind.getTerm())) + ")");

			}
		}
		return constraint.toString();
	}

	protected void convertConstraints(EClass eClass, Type type) {
		if (type.getConstraints().size() > 0) {
			// EMF Annotation
			EAnnotation annotation_emf = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation_emf.setSource("http://www.eclipse.org/emf/2002/Ecore");
			String value = "";
			// OCL Annotation
			EAnnotation annotation_ocl = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation_ocl.setSource("http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot");
			for (Constraint constraint : type.getConstraints()) {
				annotation_ocl.getDetails().put(constraint.getName(),
						convertbody(constraint.getBody(), (Extension) type.eContainer()));
				if (value.equals("")) {
					value += constraint.getName();
				} else {
					value += " ";
					value += constraint.getName();
				}
				// convertbody(constraint.getBody(), (Extension)
				// type.eContainer());
			}
			annotation_emf.getDetails().put("constraints", value);
			eClass.getEAnnotations().add(annotation_emf);
			eClass.getEAnnotations().add(annotation_ocl);
		}
	}

	public String convertbody(String body, Extension extension) {
		// System.out.println(body);
		List<EObject> attributesList = Lists.newArrayList(extension.eAllContents()).stream()
				.filter(eobject -> eobject instanceof Attribute).collect(Collectors.toList());

		HashMap<String, String> attributesMap = new HashMap<String, String>();

		for (EObject attribute : attributesList) {
			attributesMap.put(((Attribute) attribute).getName(),
					Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(((Attribute) attribute).getName()));
		}
		Map<String, String> attributesSorted = attributesMap.entrySet().stream()
				.sorted(comparingInt(e -> e.getKey().length()))
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
					throw new AssertionError();
				}, LinkedHashMap::new));
		ArrayList<String> attributesKeys = new ArrayList<String>(attributesSorted.keySet());
		for (int i = attributesKeys.size() - 1; i >= 0; i--) {
			// System.out.println("bottom "+attributesSorted.get(attributesKeys.get(i)));
			body = body.replace(attributesKeys.get(i), attributesSorted.get(attributesKeys.get(i)));
		}
		// System.out.println(body);

		/*
		 * This part convert the Category OCCI ids of Ecore ids for example from
		 * IpNetworkInterface to Ipnetworkinterface
		 */
		List<EObject> categoriesList = Lists.newArrayList(extension.eAllContents()).stream()
				.filter(eobject -> eobject instanceof Category).collect(Collectors.toList());

		HashMap<String, String> categoriesMap = new HashMap<String, String>();

		for (EObject category : categoriesList) {
			categoriesMap.put(((Category) category).getName(),
					ConverterUtils.toU1Case(ConverterUtils.formatName(((Category) category).getTerm())));
			// System.out.println(((Category) category).getName());
			// System.out.println(ConverterUtils.toU1Case(ConverterUtils.formatName(((Category)
			// category).getTerm())));
		}
		Map<String, String> categoriesSorted = categoriesMap.entrySet().stream()
				.sorted(comparingInt(e -> e.getKey().length()))
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
					throw new AssertionError();
				}, LinkedHashMap::new));
		// System.out.println("sorted "+categoriesSorted);
		ArrayList<String> keys = new ArrayList<String>(categoriesSorted.keySet());
		for (int i = keys.size() - 1; i >= 0; i--) {
			// System.out.println("bottom "+categoriesSorted.get(keys.get(i)));
			body = body.replace(keys.get(i), categoriesSorted.get(keys.get(i)));
		}
		// System.out.println(body);

		return body;
	}

	/**
	 * Convert an OCCI action to an Ecore operation.
	 * 
	 * @param action the OCCI action to convert.
	 * @return the resulting Ecore operation.
	 */
	protected EOperation convertAction(Action action) {
		// Create the Ecore operation.
		EOperation eOperation = EcoreFactory.eINSTANCE.createEOperation();
		// Set the name of the Ecore operation.
		eOperation.setName(ConverterUtils.formatName(action.getTerm()));
		// Convert all attributes of the OCCI action.
		for (Attribute attribute : action.getAttributes()) {
			// Each OCCI attribute of the OCCI action is converted to an Ecore
			// parameter of the Ecore operation.
			EParameter convertParameter = convertParameter(attribute);
			if (convertParameter != null) {
				// Add the Ecore parameter to the Ecore operation.
				eOperation.getEParameters().add(convertParameter);
			}
		}
		attachInfo(eOperation, action.getTitle());

		return eOperation;
	}

	/**
	 * Convert an OCCI action's attribute to an Ecore operation parameter.
	 * 
	 * @param attribute the OCCI attribute to convert.
	 * @return the resulting Ecore operation parameter.
	 */
	protected EParameter convertParameter(Attribute attribute) {
		// Create an Ecore parameter.
		EParameter eParam = EcoreFactory.eINSTANCE.createEParameter();
		// Set the name of the Ecore parameter.
		eParam.setName(Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attribute.getName()));

		// Set the type of the Ecore parameter.
		eParam.setEType(getMappedType(attribute.getType()));

		// If the OCCI attribute is required then the Ecore parameter is also
		// required.
		if (attribute.isRequired()) {
			eParam.setLowerBound(1);
		}
		attachInfo(eParam, attribute.getDescription());

		return eParam;
	}

	/**
	 * Convert an OCCI attribute to an Ecore attribute.
	 * 
	 * @param attribute the OCCI attribute to convert.
	 * @return the resulting Ecore attribute.
	 */
	protected EStructuralFeature convertAttribute(Attribute attribute) {
		if (attribute.getType() instanceof BasicType || attribute.getType() instanceof EnumerationType) {
			// Create an Ecore attribute.
			EAttribute eAttr = EcoreFactory.eINSTANCE.createEAttribute();
			// Set the name of the Ecore attribute.
			eAttr.setName(Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attribute.getName()));
			// Set the type of the Ecore attribute.
			eAttr.setEType(getMappedType(attribute.getType()));
			// Set the default value of the Ecore attribute.
			String defaultValue = attribute.getDefault();
			if (defaultValue != null && !defaultValue.isEmpty()) {
				eAttr.setDefaultValue(defaultValue);
			}
			// The Ecore attribute is required when the OCCI attribute is required.
			if (attribute.isRequired()) {
				eAttr.setLowerBound(1);
			}
			attachInfo(eAttr, attribute.getDescription());
			return eAttr;
		} else {
			// Create an Ecore reference.
			EReference eRef = EcoreFactory.eINSTANCE.createEReference();
			// Set the name of the Ecore reference.
			eRef.setName(Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attribute.getName()));
			// Set the type of the Ecore reference.
			eRef.setEType(getMappedType(attribute.getType()));
			// Set the containment of the Ecore reference to true.
			eRef.setContainment(true);
			// The Ecore reference is required when the OCCI attribute is required.
			if (attribute.isRequired()) {
				eRef.setLowerBound(1);
			}
			attachInfo(eRef, attribute.getDescription());
			return eRef;
		}
	}

	private void attachInfo(EModelElement element, String value) {

		EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource("http://www.eclipse.org/emf/2002/GenModel");
		element.getEAnnotations().add(annotation);
		if (value != null)
			annotation.getDetails().put("documentation", value);
		else
			annotation.getDetails().put("documentation", "");
	}
}
