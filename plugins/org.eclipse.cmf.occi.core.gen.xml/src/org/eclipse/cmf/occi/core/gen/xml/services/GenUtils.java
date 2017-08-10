/*******************************************************************************
 * Copyright (c) 2015-2017 Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Philippe Merle <philippe.merle@inria.fr>
 *     Faiez Zalila <faiez.zalila@inria.fr>
 *******************************************************************************/
package org.eclipse.cmf.occi.core.gen.xml.services;

import java.util.Date;

import org.eclipse.cmf.occi.core.BooleanType;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.NumericType;
import org.eclipse.cmf.occi.core.NumericTypeEnum;
import org.eclipse.cmf.occi.core.StringType;
import org.eclipse.emf.ecore.EDataType;

public class GenUtils {
	/**
	 * Get the current date.
	 * 
	 * @return the current date.
	 */
	public String getNow() {
		return new Date().toString();
	}

	/**
	 * Get the file path of an extension.
	 * 
	 * @param extension
	 *            the given extension.
	 * @return the file path of the given extension.
	 */
	public String getFilePath(Extension extension) {
		return extension.eResource().getURI().toString();
	}

	/**
	 * Escape a string to XML string.
	 * 
	 * @param string
	 *            the original string.
	 * @result the escaped XML string.
	 */
	public String toEscapedXmlString(String string) {
		if (string == null) {
			return null;
		}
		StringBuilder escapedXML = new StringBuilder();
		for (char c : string.toCharArray()) {
			switch (c) {
			case '<':
				escapedXML.append("&lt;");
				break;
			case '>':
				escapedXML.append("&gt;");
				break;
			case '\"':
				escapedXML.append("&quot;");
				break;
			case '&':
				escapedXML.append("&amp;");
				break;
			case '\'':
				escapedXML.append("&apos;");
				break;
			default:
				if (c > 0x7e) {
					escapedXML.append("&#" + ((int) c) + ";");
				} else {
					escapedXML.append(c);
				}
			}
		}
		return escapedXML.toString();
	}

	/**
	 * XML Schema namespace.
	 */
	static final String XML_SCHEMA_NAMESPACE = "xs:";

	/**
	 * Conversion map from Java types to XML Schema types.
	 */
	// static HashMap<String, String> javaTypesToXmlSchemaTypes = new
	// HashMap<String,String>();
	// static {
	// javaTypesToXmlSchemaTypes.put("char", XML_SCHEMA_NAMESPACE + "string"); //
	// TODO: find a better type that string.
	// javaTypesToXmlSchemaTypes.put("byte", XML_SCHEMA_NAMESPACE + "byte");
	// javaTypesToXmlSchemaTypes.put("short", XML_SCHEMA_NAMESPACE + "short");
	//// TODO: It should be better to map to xs:int instead of xs:integer but erocci
	// does not support xs:int
	//// javaTypesToXmlSchemaTypes.put("int", XML_SCHEMA_NAMESPACE + "int");
	// javaTypesToXmlSchemaTypes.put("int", XML_SCHEMA_NAMESPACE + "integer");
	// javaTypesToXmlSchemaTypes.put("long", XML_SCHEMA_NAMESPACE + "long");
	// javaTypesToXmlSchemaTypes.put("float", XML_SCHEMA_NAMESPACE + "float");
	// javaTypesToXmlSchemaTypes.put("double", XML_SCHEMA_NAMESPACE + "double");
	// javaTypesToXmlSchemaTypes.put("boolean", XML_SCHEMA_NAMESPACE + "boolean");
	// javaTypesToXmlSchemaTypes.put("java.lang.String", XML_SCHEMA_NAMESPACE +
	// "string");
	// // TODO: add other conversions like Date, URI, etc.
	// };

	/**
	 * Converts an OCCI data type to an XML Schema type.
	 * 
	 * @param datatype
	 *            the given OCCI data type.
	 * @return the resulting XML Schema type.
	 */
	public String toXmlSchemaType(DataType datatype) {
		// // Enumerations are converted to XML Schema strings.
		// if(datatype instanceof EEnum) {
		// return XML_SCHEMA_NAMESPACE + "string";
		// }
		// // For EDataType, Java instance class names are converted to XML Schema
		// types.
		// String xmlType =
		// javaTypesToXmlSchemaTypes.get(datatype.getInstanceClassName());
		//
		// // Check if the XML type was found.
		// if(xmlType != null) {
		// return xmlType;
		// }
		if (datatype instanceof NumericType) {
			if (((NumericType) datatype).getType().getValue() == NumericTypeEnum.BYTE_VALUE) {
				return XML_SCHEMA_NAMESPACE + "byte";
			}
			if (((NumericType) datatype).getType().getValue() == NumericTypeEnum.SHORT_VALUE) {
				return XML_SCHEMA_NAMESPACE + "short";
			}
			if (((NumericType) datatype).getType().getValue() == NumericTypeEnum.INTEGER_VALUE) {
				return XML_SCHEMA_NAMESPACE + "integer";
			}
			if (((NumericType) datatype).getType().getValue() == NumericTypeEnum.LONG_VALUE) {
				return XML_SCHEMA_NAMESPACE + "long";
			}
			if (((NumericType) datatype).getType().getValue() == NumericTypeEnum.FLOAT_VALUE) {
				return XML_SCHEMA_NAMESPACE + "float";
			}
			if (((NumericType) datatype).getType().getValue() == NumericTypeEnum.DOUBLE_VALUE) {
				return XML_SCHEMA_NAMESPACE + "double";
			}
			if (((NumericType) datatype).getType().getValue() == NumericTypeEnum.BIG_DECIMAL_VALUE) {
				return XML_SCHEMA_NAMESPACE + "integer";
			}
		}
		if (datatype instanceof EObjectType) {
			if (((EObjectType) datatype).getInstanceClassName().equals("int")) {
				return XML_SCHEMA_NAMESPACE + "integer";
			}
			if (((EObjectType) datatype).getInstanceClassName().equals("char")) {
				return XML_SCHEMA_NAMESPACE + "string";
			}
			if (((EObjectType) datatype).getInstanceClassName().equals("java.lang.String")) {
				return XML_SCHEMA_NAMESPACE + "string";
			}
		}
		if (datatype instanceof BooleanType) {
			return XML_SCHEMA_NAMESPACE + "boolean";
		}
		// XML type was not found then return xs:string currently.
		return XML_SCHEMA_NAMESPACE + "string";
	}
}
