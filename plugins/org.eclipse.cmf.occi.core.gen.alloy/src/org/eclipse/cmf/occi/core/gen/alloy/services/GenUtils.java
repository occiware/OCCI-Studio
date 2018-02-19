package org.eclipse.cmf.occi.core.gen.alloy.services;

import java.util.Date;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Category;
import org.eclipse.cmf.occi.core.DataType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;

public class GenUtils
{
	/**
	 * Get the current date.
	 * @return the current date.
	 */
	public String getNow() {
		return new Date().toString();
	}

	/**
	 * Get the file path of an extension.
	 * @param extension the given extension.
	 * @return the file path of the given extension.
	 */
	public String getFilePath(Extension extension) {
		return extension.eResource().getURI().toString();
	}

	/**
	 * 
	 * @param category
	 * @param context
	 * @return
	 */
	public String getScope(Category category, Category context)
	{
		StringBuffer sb = new StringBuffer();
		if((Extension)category.eContainer() != (Extension)context.eContainer()) {
			sb.append(((Extension)category.eContainer()).getName()).append('/');
		}
		return sb.toString();
	}

	/**
	 * 
	 * @param kind
	 * @return
	 */
	public String getScope4KindParent(Kind kind)
	{
		return getScope(kind.getParent(), kind);
	}

	/**
	 * 
	 * @param attribute
	 * @param suffix
	 * @return
	 */
	public String getSigAttributeType(Attribute attribute, String suffix)
	{
		StringBuffer sb = new StringBuffer();
		DataType type = attribute.getType();
		Extension typeExtension = (Extension)type.eContainer();
		Extension attributeExtension = (Extension)attribute.eResource().getContents().get(0);
		if(typeExtension != attributeExtension) {
			if(! (suffix == null && type.getName().equals("String"))) {
				sb.append(typeExtension.getName()).append('/');
			}
		}
		sb.append(type.getName());
		if(suffix != null) {
			sb.append(suffix);
		}
		return sb.toString();
	}
	
	public String getKindParentSig(Kind kind) {
		if (kind.getParent() == null && "entity".equals(kind.getTerm())) {
			return "fclouds/Entity";
		} else {
			String termOfParent = kind.getParent().getTerm();
			String scopeParent = getScope4KindParent(kind);
			return  (scopeParent.isEmpty() ? "this/" : scopeParent) +
					(termOfParent.substring(0,1).toUpperCase() + termOfParent.substring(1));
		}
	}
	
	public String escape(String stringToBeEscaped) {
		return stringToBeEscaped.replace("\"", "\\\"").replace("\n", "\\n");
	}
}
