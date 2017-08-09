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
package org.eclipse.cmf.occi.core.gen.curl.services;

import java.util.Date;
import org.eclipse.cmf.occi.core.Configuration;

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
	 * Get the current OS.
	 * @return the current Os.
	 */
	public String getOs() {
		System.out.println(System.getProperty("os.name").toLowerCase());
		return System.getProperty("os.name").toLowerCase(); 
	}
	/**
	 * Get the file path of a configuration.
	 * @param extension the given configuration.
	 * @return the file path of the given configuration.
	 */
	public String getFilePath(Configuration configuration) {
		return configuration.eResource().getURI().toString();
	}

	/**
	 * Get the filename of a given configuration.
	 * @param configuration a given configuration.
	 * @return the filename of the given configuration.
	 */
	public String configurationFileName(Configuration configuration) {
		return configuration.eResource().getURI().lastSegment();
	}
}
