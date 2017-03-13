/*******************************************************************************
 * Copyright (c) 2017 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  - Faiez Zalila <faiez.zalila@inria.fr>
 *******************************************************************************/
package org.eclipse.cmf.occi.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.util.OCCI2Ecore;
import org.eclipse.cmf.occi.util.OCCIHelper;

public class OCCIKindResolver
{
	/**
	 * Store mapping from EMF namespace to OCCI Extension.
	 */
	private static Map<String, Extension> namespace2extension = new HashMap<String, Extension>();

	/**
	 * Store mapping from EClass to OCCI Kind.
	 */
	private static Map<EClass, Kind> eclass2kind = new HashMap<EClass, Kind>();

	/**
	 * Resolve the kind of a given entity.
	 * @param entity the given entity.
	 * @return the resolved kind.
	 */
	 public static Kind resolveKind(final Entity entity)
	 {
		 // Get the Eclass of the given entity.
		 EClass entityEClass = entity.eClass();

		 Extension extension = null;
		 String kindTermToSearch = OCCI2Ecore.convertEcoreClassName2OcciCategoryTerm(entityEClass.getName());

		 // Search the kind associated to the entity's eClass.
		 Kind entityKind = eclass2kind.get(entityEClass);
		 // If kind not found then
		 if (entityKind == null) {
			 // Search the extension associated to the ePackage of the entity's eClass.
			 String metamodelURI = entityEClass.getEPackage().getNsURI();
			 extension = namespace2extension.get(metamodelURI);
			 // If extension not found then
			 if (extension == null) {
				 // Search URI of the extension into the OCCI extension registry.
				 String scheme = OCCI2Ecore.convertEcoreNamespace2OcciScheme(metamodelURI);
				 String extensionURI = OCCIRegistry.getInstance().getExtensionURI(scheme);
				 // If extension URI not found then
				 if(extensionURI == null) {
					 // This is no way to resolve the kind of the given entity :-(
					 // TODO: perhaps compute extensionURI of the ePackage of the entity's eClass.

					 // Use OCCI Core resource, link or entity kind instances.
					 extensionURI = OCCIRegistry.getInstance().getExtensionURI(OCCICoreConstants.OCCI_CORE_SCHEME);
					 if(entity instanceof org.eclipse.cmf.occi.core.Resource) {
						 kindTermToSearch = OCCICoreConstants.OCCI_CORE_RESOURCE_TERM;
					 } else if(entity instanceof Link) {
						 kindTermToSearch = OCCICoreConstants.OCCI_CORE_LINK_TERM;						 
					 } else {
						 kindTermToSearch = OCCICoreConstants.OCCI_CORE_ENTITY_TERM;
						 throw new Error("Should never happens! entity=" + entity);
					 }
				 }

				 // Here extensionURI is set.
				 assert(extensionURI != null);

				 // Compute the resource set where loading the extension.
				 ResourceSet resourceSet = null;
				 Resource entityResource = entity.eResource();
				 // If entity not in a resource.
				 if(entityResource != null) {
					 // Reuse the resource set containing the resource containing the given entity.
					 resourceSet = entityResource.getResourceSet();
				 } else {
					 // Create a new resource set.
					 resourceSet = new ResourceSetImpl();
				 }
				 // Load the extension.
				 Resource extensionResource = resourceSet.getResource(URI.createURI(extensionURI), true);
				 extension = (Extension) extensionResource.getContents().get(0);

				 // Map the metamodelURI to the found extension for optimizing next searches.
				 namespace2extension.put(metamodelURI, extension);
			 }

			 // Here extension was loaded.
			 assert(extension != null);

			 // Search the entity's kind into the found extension.
			 entityKind = OCCIHelper.getKindByTerm(extension, kindTermToSearch);
			 if(entityKind != null) {
				 // Map the entity's eClass to the found kind for optimizing next searches.
				 eclass2kind.put(entityEClass, entityKind);
			 }
		 }

		 // Update the configuration of the entity.
		 Configuration owningConfiguration = OCCIHelper.getConfiguration(entity);
		 if(extension != null && owningConfiguration != null) {
			 EList<Extension> useList = owningConfiguration.getUse();
			 if (!useList.contains(extension)) {
				 // add the found extension to the use of the configuration owning the given entity.
				 try {
					 useList.add(extension);
				 } catch(Exception exc) {
					// TODO: Should never happen :-(
					exc.printStackTrace(System.err);
				 }
			 }
		 }
		// Return the found entity's kind.
		return entityKind;
	 }
}
