/*******************************************************************************
 * Copyright (c) 2016-2017 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   - Philippe Merle <philippe.merle@inria.fr>
 *   - Faiez Zalila <faiez.zalila@inria.fr>
 *******************************************************************************/
package org.eclipse.cmf.occi.core.gen.connector.services;

import java.util.Date;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Type;
import org.eclipse.cmf.occi.core.util.Occi2Ecore;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

public class GenUtils
{
	/**
	 * Get the current date.
	 * @return the current date.
	 */
	public String getNow()
	{
		return new Date().toString();
	}

	/**
	 * Get the file path of an extension.
	 * @param extension the given extension.
	 * @return the file path of the given extension.
	 */
	public String getFilePath(Extension extension)
	{
		return extension.eResource().getURI().toString();
	}

	/**
	 * Get the Java package associated to an extension.
	 * 
	 */
	// TODO: Not used currently
	private String getJavaPackage(Extension extension)
	{
		// Get the EPackage associated to this Extension.
		EPackage ePackage = getEPackage(extension);
		// Get the name of the Java package containing the EPackage.
		String javaPackage = ePackage.getClass().getPackage().getName();
		// Remove .impl
		int index = javaPackage.lastIndexOf('.');
		return index == -1 ? javaPackage : javaPackage.substring(0, index);
	}

	/**
	 * Get the EPackage associated to an extension.
	 */
	private EPackage getEPackage(Extension extension)
	{
		String occiExtensionScheme = extension.getScheme();
		String ecoreNamespace = Occi2Ecore.convertOcciScheme2EcoreNamespace(occiExtensionScheme);
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(ecoreNamespace);
		return ePackage;
	}

	/**
	 * Get the Java type of an OCCI attribute.
	 */
	public String getJavaTypeName(Attribute attribute)
	{
		// Get the data type of this attribute.
		DataType attributeType = (DataType) attribute.getType();
		//System.out.println("attributeType "+attributeType);
		// Get the extension containing this attribute type.
		Extension extension = (Extension)(attributeType.eContainer());
		//System.out.println("extension "+extension);
		// Get the Epackage for this extension.
		EPackage ePackage = getEPackage(extension);
		//System.out.println("ePackage "+ePackage);
		// Get the data type.
		EDataType eDataType = (EDataType)ePackage.getEClassifier(attributeType.getName());
		// Return the instance class name of this data type.
		return eDataType.getName();
	}
	public String getJavaAttributeName(Attribute attribute) {
		//System.out.println("attribute "+attribute);
		//System.out.println("Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attribute.getName()) "+Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attribute.getName()));
		return Occi2Ecore.convertOcciAttributeName2EcoreAttributeName(attribute.getName());
	}
	
	public String getExtendedPackage(Type type) {
		Extension extension = (Extension)type.eContainer();
		String extensionFile = OcciRegistry.getInstance().getFileURI(extension.getScheme());
		String[] args = extensionFile.split("\\/");
		return args[args.length-3];
	}
}
