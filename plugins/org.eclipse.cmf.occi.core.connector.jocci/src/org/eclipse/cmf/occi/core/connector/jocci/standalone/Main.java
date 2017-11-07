/*******************************************************************************
 * Copyright (c) 2015-2017 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  - Philippe Merle <philippe.merle@inria.fr>
 *  - Faiez Zalila <faiez.zalila@inria.fr>
 *******************************************************************************/
package org.eclipse.cmf.occi.core.connector.jocci.standalone;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.connector.jocci.services.Importer;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;


/**
 *
 * @author Philippe Merle <Philippe.Merle@inria.fr>
 */
public class Main
{
	//
	// This Java program runs outside of an Eclipse IDE.
	// Then it is required to do some initializations manually.
	//
	static {
		// Init EMF to dealt with OCCI files.
		Registry.INSTANCE.getExtensionToFactoryMap().put("occie", new OCCIResourceFactoryImpl());
		Registry.INSTANCE.getExtensionToFactoryMap().put("occic", new OCCIResourceFactoryImpl());
		Registry.INSTANCE.getExtensionToFactoryMap().put("*", new OCCIResourceFactoryImpl());

		// Register the OCCI package into EMF.
		OCCIPackage.eINSTANCE.toString();	

		// Register OCCI extensions.
		OcciRegistry.getInstance().registerExtension("http://schemas.ogf.org/occi/infrastructure#", "../org.eclipse.cmf.occi.infrastructure/model/Infrastructure.occie");
	}

	public static void main(String[] args) throws Exception
	{
		String serverURL =
				"http://rocci-server-1-1-x.herokuapp.com" // rOCCI
//				"http://192.168.99.100:8080" // erocci
			;

		// Obtain the factory to create OCCI objects.
		OCCIFactory factory = OCCIFactory.eINSTANCE;

		// Create an OCCI configuration.
		org.eclipse.cmf.occi.core.Configuration targetConfiguration = factory.createConfiguration();

		Importer.importFromOcciServer(targetConfiguration, serverURL);

		print(targetConfiguration);
		
		// Create a new resource set.
//		OCCIResourceSet resourceSet = new OCCIResourceSet();

		// create a resource
//		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI("configuration.occic"));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
//		resource.getContents().add(targetConfiguration);

		// now save the content.
//		resource.save(Collections.EMPTY_MAP);
	}

	/**
	 * Print a given OCCI configuration.
	 * @param configuration the given OCCI configuration.
	 */
	public static void print(Configuration configuration)
	{
		System.out.println("Configuration");
		System.out.println("  - used extensions:");
		for(Extension extension : configuration.getUse()) {
			System.out.println("    * Extension " + extension.getName() + " " + extension.getScheme());
		}
		System.out.println("  - resources:");
		for(Resource resource : configuration.getResources()) {
			System.out.println("    * Resource id " + resource.getId());
			Kind resourceKind = resource.getKind();
			System.out.println("      - Kind " + resourceKind.getScheme() + resourceKind.getTerm());
			System.out.println("      - mixins:");
			for(Mixin mixin : resource.getMixins()) {
				System.out.println("        * Mixin " + mixin.getScheme() + mixin.getTerm());
			}
			System.out.println("      - attributes:");
			for(AttributeState as : resource.getAttributes()) {
				System.out.println("        * AttributeState " + as.getName() + "=" + as.getValue());
			}
			System.out.println("      - links:");
			for(Link link : resource.getLinks()) {
				System.out.println("        * Link id " + link.getId());
				Kind linkKind = link.getKind();
				System.out.println("         - Kind " + linkKind.getScheme() + linkKind.getTerm());
				System.out.println("         - mixins:");
				for(Mixin mixin : link.getMixins()) {
					System.out.println("        * Mixin " + mixin.getScheme() + mixin.getTerm());
				}
				System.out.println("         - attributes:");
				for(AttributeState as : link.getAttributes()) {
					System.out.println("           * AttributeState " + as.getName() + "=" + as.getValue());
				}
				Resource source = link.getSource();
				System.out.println("        - source id " + source.getId());
				Resource target = link.getTarget();
				if(target != null) {
					System.out.println("        - target id " + target.getId());
				} else {
					System.out.println("        - no target");
				}
			}
		}
	}
}
