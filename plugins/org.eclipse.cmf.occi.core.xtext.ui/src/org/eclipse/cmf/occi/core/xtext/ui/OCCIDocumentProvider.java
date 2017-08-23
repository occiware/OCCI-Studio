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

package org.eclipse.cmf.occi.core.xtext.ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.xtext.OCCIStandaloneSetup;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

public class OCCIDocumentProvider extends XtextDocumentProvider {
//	static {
//		OCCIStandaloneSetup.doSetup();
//	}

	@Override
	protected void setDocumentContent(IDocument document, InputStream contentStream, String encoding)
			throws CoreException {
		//System.out.println("Hello "+document);
		ResourceSet resourceSet = createResourceSet();
		Resource xmiResource = resourceSet.createResource(URI.createURI("temp.xmi"));
		Resource xtextResource = resourceSet.createResource(URI.createURI("temp.occi"));
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			//System.out.println("contentStream "+contentStream);
			EcoreUtil.resolveAll(resourceSet);
			xmiResource.load(contentStream, Collections.emptyMap());
			xtextResource.getContents().addAll(xmiResource.getContents());
			xtextResource.save(os, Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new CoreException(
					new Status(IStatus.ERROR, "org.occiware.clouddesigner.occi.xtext.ui", "Failed to save", e));
		} finally {
			try {
				os.close();
				contentStream.close();
			} catch (IOException e) {
				throw new CoreException(
						new Status(IStatus.ERROR, "org.occiware.clouddesigner.occi.xtext.ui", "Failed to load", e));
			}
		}
		document.set(new String(os.toByteArray()));
	}

	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite)
			throws CoreException {
		try {
			//System.out.println("doSaveDocument ");
			ResourceSet resourceSet = createResourceSet();
			XtextResource xtextResource = (XtextResource) resourceSet.createResource(URI.createURI("temp.occi"));
			InputStream is = new ByteArrayInputStream(document.get().getBytes());
			xtextResource.load(is, Collections.EMPTY_MAP);
			is.close();
			URI uri = URI.createPlatformResourceURI(
					((org.eclipse.ui.part.FileEditorInput) element).getFile().getFullPath().toString(), true);
			//resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			//System.out.println("uriii "+uri);
			Resource xmiResource = resourceSet.getResource(uri, true);
			((XMLResource) xmiResource).getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER,
					new URIHandlerImpl.PlatformSchemeAware());
			xmiResource.getContents().clear();
			xmiResource.getContents().addAll(xtextResource.getContents());
			// SUPER IMPORTANT to avoid to have references to temp.occi
			EcoreUtil.resolveAll(xmiResource);			
			xmiResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new CoreException(
					new Status(IStatus.ERROR, "org.occiware.clouddesigner.occi.xtext.ui", "Failed to save", e));
		}
	}

	private ResourceSet createResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(OCCIPackage.eNS_URI, OCCIPackage.eINSTANCE);
		return resourceSet;
	}

}
