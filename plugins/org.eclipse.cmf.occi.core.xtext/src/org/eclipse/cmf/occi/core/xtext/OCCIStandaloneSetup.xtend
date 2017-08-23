/*******************************************************************************
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   William Piers <william.piers@obeo.fr>
 *     Philippe Merle <philippe.merle@inria.fr>
 *     Faiez Zalila <faiez.zalila@inria.fr>
 *******************************************************************************/
package org.eclipse.cmf.occi.core.xtext

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.cmf.occi.core.OCCIPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class OCCIStandaloneSetup extends OCCIStandaloneSetupGenerated {

	def static void doSetup() {
		new OCCIStandaloneSetup().createInjectorAndDoEMFRegistration()
	}

	override register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey(OCCIPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(OCCIPackage.eNS_URI, OCCIPackage.eINSTANCE);
		}
		super.register(injector)
	}
}
