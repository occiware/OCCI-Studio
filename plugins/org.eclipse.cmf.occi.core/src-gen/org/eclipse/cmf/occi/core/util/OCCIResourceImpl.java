/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.core.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl
 * @generated
 */
public class OCCIResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public OCCIResourceImpl(URI uri) {
		super(uri);
	}
	@Override
	public void doSave(OutputStream outputStream, Map<?,?> options) throws
	IOException {
	this.getDefaultSaveOptions().put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT,
	Boolean.TRUE);
	super.doSave(outputStream, options);
	}
} //OCCIResourceImpl
