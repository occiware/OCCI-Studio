/*******************************************************************************
 * Copyright (c) 2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *******************************************************************************/
package org.eclipse.cmf.examples;

import java.io.File;

import org.eclipse.swt.graphics.Image;

/**
 * Stores the examples in-memory.
 *
 * @author William Piers
 * @author Faiez Zalila	
 *         <a href="mailto:william.piers@obeo.fr">william.piers@obeo.fr</a>
 *         <a href="mailto:faiez.zalila@inria.fr">faiez.zalila@inria.fr</a>
 */
public interface IExample {

	String getName();

	String getDescription();

	String getProjectName();

	Image getScreenshot();

	File getAird();

	File getSemantic();

}
