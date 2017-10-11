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
package org.eclipse.cmf.occi.core.gen.design.extended.ui;

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

public class DesignerGeneratorUtils {

	public static IProject genDesignProject(String projectName, String modelFileName, String extensionScheme, ProgressMonitorDialog dialog)
			throws CoreException, IOException {
		final IPath projectLocationPath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
		IProject project = ViewpointSpecificationProject.createNewViewpointSpecificationProject(
				PlatformUI.getWorkbench(), projectName, projectLocationPath, modelFileName,
				ViewpointSpecificationProject.INITIAL_OBJECT_NAME, ViewpointSpecificationProject.ENCODING_DEFAULT,
				dialog);

		// add dependency to the metamodel
		IFile manifest = PDEProject.getManifest(project);
		StringBuilder buffer = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(manifest.getContents()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			buffer.append(inputLine + "\n");
			if (inputLine.startsWith("Require-Bundle:")) {
				buffer.append(" org.eclipse.cmf.occi.core,\n");
				buffer.append(" org.eclipse.cmf.occi.core.design,\n");
			}
		}
		in.close();
		manifest.setContents(new ByteArrayInputStream(buffer.toString().getBytes()), 0, dialog.getProgressMonitor());

		String modelName = modelFileName.substring(0, modelFileName.indexOf('.'));

		// add extension to plugin.xml
		IFile pluginXml = PDEProject.getPluginXml(project);
		buffer = new StringBuilder();
		in = new BufferedReader(new InputStreamReader(pluginXml.getContents()));
		while ((inputLine = in.readLine()) != null) {
			if (inputLine.startsWith("</plugin>")) {
				buffer.append("   <!-- Popup menu for creating a ").append(modelName).append(" configuration file. -->\n");
				buffer.append("   <extension point=\"org.eclipse.ui.newWizards\">\n");
				buffer.append("      <category\n");
				buffer.append("            id=\"org.eclipse.cmf.occi.core.category.ID\"\n");
				buffer.append("            name=\"OCCI Studio\"/>\n");
				buffer.append("      <wizard\n");
				buffer.append("            category=\"org.eclipse.cmf.occi.core.occi-studio.category.ID\"\n");
				buffer.append("            class=\"").append(projectName).append(".wizard.NewConfigurationWizard\"\n");
				buffer.append("            icon=\"platform:/plugin/org.eclipse.cmf.occi.core.edit/icons/full/obj16/Configuration.gif\"\n");				
				buffer.append("            id=\"").append(projectName).append(".wizard.NewConfigurationWizard\"\n");
				buffer.append("            name=\"").append("Extended ").append(modelName).append(" Configuration File\"/>\n");
				buffer.append("   </extension>\n");
			}
			buffer.append(inputLine + "\n");
		}
		in.close();
		pluginXml.setContents(new ByteArrayInputStream(buffer.toString().getBytes()), 0, dialog.getProgressMonitor());		

		buffer = new StringBuilder();
		buffer.append("/*******************************************************************************\n");
		buffer.append(" * Copyright (c) 2015-2017 Obeo, Inria\n");
		buffer.append(" * All rights reserved. This program and the accompanying materials\n");
		buffer.append(" * are made available under the terms of the Eclipse Public License v1.0\n");
		buffer.append(" * which accompanies this distribution, and is available at\n");
		buffer.append(" * http://www.eclipse.org/legal/epl-v10.html\n");
		buffer.append(" *\n");
		buffer.append(" * Contributors:\n");
		buffer.append(" * - William Piers <william.piers@obeo.fr>\n");
		buffer.append(" * - Philippe Merle <philippe.merle@inria.fr>\n");
		buffer.append(" * - Faiez Zalila <faiez.zalila@inria.fr>\n");
		buffer.append(" *******************************************************************************/\n");
		buffer.append("\n");
		buffer.append("package ").append(projectName).append(".wizard;\n");
		buffer.append("\n");
		buffer.append("import org.eclipse.cmf.occi.core.design.utils.NewDiagramWizard;\n");
		buffer.append("\n");
		buffer.append("/**\n");
		buffer.append(" * This is a simple wizard for creating a new ").append(modelName).append(" model file.\n");
		buffer.append(" */\n");
		buffer.append("\n");

		buffer.append("public class NewConfigurationWizard extends NewDiagramWizard\n");
		buffer.append("{\n");
		buffer.append("\tpublic NewConfigurationWizard()\n");
		buffer.append("\t{\n");
		String tmp = modelName.substring(0,1).toUpperCase() + modelName.substring(1);
		buffer.append("\t\tsuper(\"").append(extensionScheme).append("\", \"viewpoint:/").append(projectName).append("/").append(tmp).append("Configuration\", \"").append(modelName).append("\", \"").append(tmp).append("Configuration Diagram\");\n");
		buffer.append("\t}\n");
		buffer.append("}\n");
		IFolder folder = project.getFolder("src/" + projectName.replaceAll("\\.",  "/") + "/wizard");
		folder.create(false, false, dialog.getProgressMonitor());
		IFile newConfigurationWizard = folder.getFile("NewConfigurationWizard.java");
		newConfigurationWizard.create(new ByteArrayInputStream(buffer.toString().getBytes()), 0, dialog.getProgressMonitor());		
		return project;
	}

	public static IProject genDesignTestProject(IProject designProject, IProgressMonitor monitor) throws CoreException {
		final IPath projectLocationPath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
		return ModelingProjectManager.INSTANCE.createNewModelingProject(designProject.getName() + ".tests",
				projectLocationPath, true, monitor);
	}
}
