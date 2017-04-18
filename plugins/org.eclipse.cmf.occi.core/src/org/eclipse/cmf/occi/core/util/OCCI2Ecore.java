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
package org.eclipse.cmf.occi.core.util;

/**
 * This class provides utility functions related to the mapping of OCCI to Ecore.
 * 
 * @author Faiez Zalila - Inria
 */
public class OCCI2Ecore
{
	/**
	 * Suffix added to the name space of EPackage.
	 */
	static final String ECORE_SUFFIX = "/ecore";

	/**
	 * This class can not be instantiated.
	 */
	private OCCI2Ecore()
	{
	}

	/**
	 * Converts an OCCI scheme to an Ecore name space.
	 * @param occiScheme the OCCI scheme.
	 * @return the Ecore name space.
	 */
	public static String convertOcciScheme2EcoreNamespace(final String occiScheme) {
		return occiScheme.substring(0, occiScheme.length()-1) + ECORE_SUFFIX;
	}

	/**
	 * Converts an Ecore name space to an OCCI scheme.
	 * @param ecoreNamespace the Ecore name space.
	 * @return the OCCI scheme.
	 */
	public static String convertEcoreNamespace2OcciScheme(final String ecoreNamespace) {
		return ecoreNamespace.substring(0, ecoreNamespace.length()-ECORE_SUFFIX.length()) + '#';
	}

	/**
	 * Converts an OCCI category term to an Ecore class name.
	 * @param term the OCCI category term.
	 * @return the Ecore class name.
	 */
	public static String convertOcciCategoryTerm2EcoreClassName(String term) {
		return term.substring(0,1).toUpperCase() + term.substring(1);
	}

	/**
	 * Convert an Ecore class name to an OCCI category term.
	 * @param eclassName the given Ecore class name.
	 * @return an OCCI category term.
	 */
	public static String convertEcoreClassName2OcciCategoryTerm(String eclassName)
	{
		return eclassName.substring(0, 1).toLowerCase() + eclassName.substring(1);
	}

	/**
	 * Convert an OCCI attribute name to an Ecore feature name.
	 * @param attributeName the given OCCI attribute name.
	 * @return the converted Ecore attribute name.
	 */
	public static String convertOcciAttributeName2EcoreAttributeName(final String attributeName)
	{
		String[] attributeNameArray = attributeName.split("\\.");
		String newattribute= "";
		for(int i = 0; i < attributeNameArray.length; i++){
			
			if(i == 0){
				newattribute += attributeNameArray[0];
			}
			else{
				newattribute += attributeNameArray[i].substring(0, 1).toUpperCase() + attributeNameArray[i].substring(1);;
			}
		}
		return newattribute;
	}
}
