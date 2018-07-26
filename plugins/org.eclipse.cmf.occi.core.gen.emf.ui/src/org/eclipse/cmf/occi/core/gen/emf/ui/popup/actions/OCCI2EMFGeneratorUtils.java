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
package org.eclipse.cmf.occi.core.gen.emf.ui.popup.actions;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenAnnotation;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.ui.tools.api.project.ViewpointSpecificationProject;
import org.eclipse.ui.PlatformUI;
import org.eclipse.cmf.occi.core.gen.emf.ConverterUtils;

public class OCCI2EMFGeneratorUtils {
	public static GenPackage createGenModel(final EPackage rootPackage, final String ecoreLocation, String basePackage,
			Collection<GenPackage> usedGenPackages) throws IOException {
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.setCopyrightText(
				"Copyright (c) 2015-2017 Obeo, Inria\n" +
				"All rights reserved. This program and the accompanying materials\n" +
				"are made available under the terms of the Eclipse Public License v1.0\n" +
				"which accompanies this distribution, and is available at\n" +
				"http://www.eclipse.org/legal/epl-v10.html\n" +
				"	\n" +
				"Contributors:\n" +
				"- William Piers <william.piers@obeo.fr>\n" +
				"- Philippe Merle <philippe.merle@inria.fr>\n"+
				"- Faiez Zalila <faiez.zalila@inria.fr>"
		);
		// Added to generate java code corresponding to OCL constraints defined in the OCCI extension
		GenAnnotation genannotation = GenModelFactory.eINSTANCE.createGenAnnotation();
		genannotation.setSource("http://www.eclipse.org/OCL/GenModel");
		genannotation.getDetails().put("Use Delegates", "false");
		genModel.getGenAnnotations().add(genannotation);
		
		String modelPluginId = new Path(ecoreLocation).removeLastSegments(2).lastSegment().toString();
		String editPluginId = modelPluginId + ".edit";
		String editorPluginId = modelPluginId + ".editor";
		String testsPluginId = modelPluginId + ".tests";
		genModel.setModelDirectory('/' + modelPluginId + "/src-gen");
		genModel.setEditDirectory('/' + editPluginId + "/src-gen");
		genModel.setEditorDirectory('/' + editorPluginId + "/src-gen");
		genModel.setTestsDirectory('/' + testsPluginId + "/src");
		genModel.getForeignModel().add(new Path(ecoreLocation).lastSegment());
		genModel.setModelName(ConverterUtils.toU1Case(rootPackage.getName()));
		genModel.setModelPluginID(modelPluginId);
		genModel.setEditPluginID(editPluginId);
		genModel.setEditorPluginID(editorPluginId);
		genModel.setTestsPluginID(testsPluginId);
		genModel.setRootExtendsInterface("org.eclipse.emf.ecore.EObject");
		// Activate code generation for Ecore reflective and dynamic invocation of OCCI actions.
		genModel.setOperationReflection(true);
		genModel.getUsedGenPackages().addAll(usedGenPackages);
		genModel.initialize(Collections.singleton(rootPackage));
		GenPackage genPackage = genModel.getGenPackages().get(0);
		genPackage.setPrefix(ConverterUtils.toU1Case(rootPackage.getNsPrefix()));
		genPackage.setBasePackage(basePackage);
		//genPackage.setLoadInitialization(false);
		URI genModelURI = URI
				.createFileURI(new Path(ecoreLocation).removeFileExtension().addFileExtension("genmodel").toString());
		final XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
		genModelResource.getContents().add(genModel);
		genModelResource.save(Collections.EMPTY_MAP);
		return genPackage;
	}
}
