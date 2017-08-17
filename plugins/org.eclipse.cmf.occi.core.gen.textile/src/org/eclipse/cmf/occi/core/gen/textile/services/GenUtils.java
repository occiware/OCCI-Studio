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
package org.eclipse.cmf.occi.core.gen.textile.services;

import java.util.Date;
import org.eclipse.cmf.occi.core.Extension;

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
}
