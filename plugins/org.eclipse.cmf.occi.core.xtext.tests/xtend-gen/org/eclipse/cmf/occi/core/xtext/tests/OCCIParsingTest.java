/**
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
 */
package org.eclipse.cmf.occi.core.xtext.tests;

import com.google.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.xtext.tests.OCCIInjectorProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(OCCIInjectorProvider.class)
@SuppressWarnings("all")
public class OCCIParsingTest {
  @Inject
  @Extension
  private ParseHelper<org.eclipse.cmf.occi.core.Extension> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testCorrectParsing() {
    try {
      EPackage.Registry.INSTANCE.put(OCCIPackage.eNS_URI, OCCIPackage.eINSTANCE);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("extension infrastructure : \"http://schemas.ogf.org/occi/infrastructure#\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("description \"OCCI Infrastructure Model\" specification");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"https://www.ogf.org/documents/GFD.224.pdf\" kind Network { title");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"Network Resource\" scheme \"http://schemas.ogf.org/occi/infrastructure#\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("attribute occi.network.vlan : type Vlan {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("attribute occi.network.label : type Token {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("attribute required occi.network.state : type NetworkStatus = \"inactive\" {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("attribute occi.network.state.message : type Token {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("action Up scheme \"http://schemas.ogf.org/occi/infrastructure/network/action#\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("action Down scheme \"http://schemas.ogf.org/occi/infrastructure/network/action#\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("title \"\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("constraint UniqueVlan description \"chaque network a un vlan différent\" body");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"Network.allInstances()->isUnique(occi.network.vlan)\" fsm FSM {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("attribute occi.network.state states {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("State {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("initial final literal NetworkStatus.inactive transitions ( action Down to NetworkStatus.active)");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("},");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("State {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("literal NetworkStatus.active");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("},");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("State {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("literal NetworkStatus.error");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("NumericType Vlan type Integer ( minInclusive \"0\" maxInclusive \"4095\" )");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("StringType Token ( ) EnumerationType NetworkStatus ( literals ( active ( ),");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("inactive ( ),");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("error ( ) ) )");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this.parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void loadModel() {
    try {
      EPackage.Registry.INSTANCE.put(OCCIPackage.eNS_URI, OCCIPackage.eINSTANCE);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("extension infrastructure : \"http://schemas.ogf.org/occi/infrastructure#\"");
      _builder.newLine();
      _builder.append("description \"OCCI Infrastructure Model\" specification");
      _builder.newLine();
      _builder.append("\"https://www.ogf.org/documents/GFD.224.pdf\"  kind Network  { title");
      _builder.newLine();
      _builder.append("\"Network Resource\" scheme \"http://schemas.ogf.org/occi/infrastructure#\"");
      _builder.newLine();
      _builder.append("attribute occi.network.vlan : type Vlan {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("attribute occi.network.label : type Token {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("attribute required occi.network.state : type NetworkStatus = \"inactive\" {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("attribute occi.network.state.message : type Token {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("action Up scheme \"http://schemas.ogf.org/occi/infrastructure/network/action#\"");
      _builder.newLine();
      _builder.append("action Down scheme \"http://schemas.ogf.org/occi/infrastructure/network/action#\"");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("title \"\"");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("constraint UniqueVlan description \"chaque network a un vlan différent\" body");
      _builder.newLine();
      _builder.append("\"Network.allInstances()->isUnique(occi.network.vlan)\" fsm FSM {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("attribute occi.network.state states {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("State {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("initial final literal NetworkStatus.inactive transitions ( action Down to NetworkStatus.active)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("},");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("State {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("literal NetworkStatus.active");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("},");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("State {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("literal NetworkStatus.error");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("NumericType Vlan type Integer ( minInclusive \"0\" maxInclusive \"4095\" )");
      _builder.newLine();
      _builder.append("StringType Token ( ) EnumerationType NetworkStatus ( literals ( active ( ),");
      _builder.newLine();
      _builder.append("inactive ( ),");
      _builder.newLine();
      _builder.append("error ( ) ) )");
      _builder.newLine();
      final org.eclipse.cmf.occi.core.Extension result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
      InputOutput.<List<Issue>>println(this._validationTestHelper.validate(result));
      final ResourceSetImpl RS2 = new ResourceSetImpl();
      final Resource r2 = RS2.createResource(URI.createURI("dummy.xmi"));
      EcoreUtil.resolveAll(result.eResource().getResourceSet());
      r2.getContents().add(result);
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      r2.save(baos, null);
      byte[] _byteArray = baos.toByteArray();
      String _string = new String(_byteArray, StandardCharsets.UTF_8);
      InputOutput.<String>println(_string);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
