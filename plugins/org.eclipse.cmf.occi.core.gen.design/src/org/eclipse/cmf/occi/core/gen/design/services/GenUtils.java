/*******************************************************************************
 * Copyright (c) 2016 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Philippe Merle <philippe.merle@inria.fr>
 *******************************************************************************/
package org.eclipse.cmf.occi.core.gen.design.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OcciCoreConstants;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.cmf.occi.core.util.Occi2Ecore;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class GenUtils
{
	/**
	 * Get a color.
	 */
	private static Map<String, Extension> namespace2extension = new HashMap<String, Extension>();

	/**
	 * Store mapping from EClass to OCCI Kind.
	 */
	private static Map<EClass, Kind> eclass2kind = new HashMap<EClass, Kind>();
	
	public String getColor(EEnumLiteral eEnumLiteral)
	{
		int value = eEnumLiteral.getValue();
		if(value >= colors.length) return "light_gray";
		return colors[value];
	}

	private static String colors[] = new String[] { "light_green", "light_red", "light_orange"};
	
	public static Kind resolveKind(final EClass entityEClass)
	 {
		 Boolean put = true;
		 Extension extension = null;
		 String kindTermToSearch = Occi2Ecore.convertEcoreClassName2OcciCategoryTerm(entityEClass.getName());

		 // Search the kind associated to the entity's eClass.
		 Kind entityKind = eclass2kind.get(entityEClass);
		 // If kind not found then
		 if (entityKind == null) {
			 //System.out.println("beforeKind "+entityKind);
			 //System.out.println("beforeKind "+namespace2extension);
			 // Search the extension associated to the ePackage of the entity's eClass.
			 String metamodelURI = entityEClass.getEPackage().getNsURI();
			 extension = namespace2extension.get(metamodelURI);
			 // If extension not found then
			 if (extension == null) {
				 // Search URI of the extension into the OCCI extension registry.
				 String scheme = Occi2Ecore.convertEcoreNamespace2OcciScheme(metamodelURI);
				 String extensionURI = OcciRegistry.getInstance().getExtensionURI(scheme);
				 // If extension URI not found then
				 if(extensionURI == null) {
					 // This is no way to resolve the kind of the given entity :-(
					 // TODO: perhaps compute extensionURI of the ePackage of the entity's eClass.
					 put= false;
					 // Use OCCI Core resource, link or entity kind instances.
					 extensionURI = OcciRegistry.getInstance().getExtensionURI(OcciCoreConstants.OCCI_CORE_SCHEME);
				 }
				 // Here extensionURI is set.
				 assert(extensionURI != null);

				 // Compute the resource set where loading the extension.
				 ResourceSet resourceSet = new ResourceSetImpl();
				 // Load the extension.
				 Resource extensionResource = resourceSet.getResource(URI.createURI(extensionURI), true);
				 extension = (Extension) extensionResource.getContents().get(0);
				 // Map the metamodelURI to the found extension for optimizing next searches.
				 if(put)
				 namespace2extension.put(metamodelURI, extension);
			 }
			 // Here extension was loaded.
			 assert(extension != null);
			 // Search the entity's kind into the found extension.
			 //System.out.println("extension "+extension.getKinds());
			 entityKind = OcciHelper.getKindByTerm(extension, kindTermToSearch);
			 if(entityKind != null) {
				 // Map the entity's eClass to the found kind for optimizing next searches.
				 eclass2kind.put(entityEClass, entityKind);
			 }
		 }
		// Return the found entity's kind.
		return entityKind;
	 }
	public static Extension resolveExtension(final EPackage ePackage)
	 {
		Boolean put = true;
		Extension extension = null;
		 
		String metamodelURI = ePackage.getNsURI();
		extension = namespace2extension.get(metamodelURI);
		// If extension not found then
		//System.out.println("beforeExtension "+namespace2extension);
		//System.out.println("beforeExtension "+extension);
		if (extension == null) {
			// Search URI of the extension into the OCCI extension registry.
			String scheme = Occi2Ecore.convertEcoreNamespace2OcciScheme(metamodelURI);
			String extensionURI = OcciRegistry.getInstance().getExtensionURI(scheme);
			// If extension URI not found then
			if(extensionURI == null) {
				// This is no way to resolve the kind of the given entity :-(
				// TODO: perhaps compute extensionURI of the ePackage of the entity's eClass.
				put= false;
				// Use OCCI Core resource, link or entity kind instances.
				extensionURI = OcciRegistry.getInstance().getExtensionURI(OcciCoreConstants.OCCI_CORE_SCHEME);
			}
			// Here extensionURI is set.
			assert(extensionURI != null);
			// Compute the resource set where loading the extension.
			ResourceSet resourceSet = new ResourceSetImpl();
			// Load the extension.
			Resource extensionResource = resourceSet.getResource(URI.createURI(extensionURI), true);
			extension = (Extension) extensionResource.getContents().get(0);
			// Map the metamodelURI to the found extension for optimizing next searches.
			if(put)
				namespace2extension.put(metamodelURI, extension);
			}
		// Return the found entity's kind.
		//System.out.println("afterExtension "+namespace2extension);
		//System.out.println("afterExtension "+extension);
		return extension;
	 }
	public static ArrayList<Mixin> getRelatedMixins (final Kind kind) {
		ArrayList<Mixin> allRelatedMixins = new ArrayList<Mixin>();
		Extension extension = (Extension) kind.eContainer();
		allRelatedMixins.addAll(getAllRelatedMixins(kind, extension));
		return allRelatedMixins;
	}
	
	public static ArrayList<Mixin> getAllRelatedMixins (final Kind kind, Extension extension) {
		ArrayList<Mixin> allRelatedMixins = new ArrayList<Mixin>();
		for (Mixin mixin : extension.getMixins()) {
			if(mixin.getApplies().contains(kind)) {
				//System.out.println("mixin "+mixin + " kind " + kind);
				allRelatedMixins.add(mixin);
			}
		}
		if(kind.getParent() != null) {
			allRelatedMixins.addAll(getAllRelatedMixins(kind.getParent(), extension));
		}
		return allRelatedMixins;
	}
	
	public static String occiTerm2EClass(Type type) {
	 return	toU1Case(formatName(type.getTerm()));
	}
	public static String formatName(String name) {
		String temp = name.replaceAll(" ", "_");
		if (temp.startsWith("occi.")) {
			String[] split = temp.split("\\.");
			temp = split[split.length - 1];
		}
		return temp;
	}

	public static String toU1Case(String temp) {
		temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
		return temp;
	}
	
	public static String convertOcciAttributeName2EcoreAttributeName(final Attribute attribute)
	{
		String[] attributeNameArray = attribute.getName().split("\\.");
		String newattribute= "";
		for(int i = 0; i < attributeNameArray.length; i++){
			
			if(i == 0){
				newattribute += attributeNameArray[0];
			}
			else{
				newattribute += toUpperCaseFirst(attributeNameArray[i]);
			}
		}
		return newattribute;
	}
	/**
	 * Upper case the first character.
	 */
	private static String toUpperCaseFirst(String string)
	{
		return string.substring(0, 1).toUpperCase() +string.substring(1);
	}
}
