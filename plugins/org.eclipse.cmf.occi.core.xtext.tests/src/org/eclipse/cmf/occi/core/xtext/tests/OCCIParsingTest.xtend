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
package org.eclipse.cmf.occi.core.xtext.tests

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.emf.ecore.EPackage
import org.eclipse.cmf.occi.core.OCCIPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import java.io.ByteArrayOutputStream
import java.nio.charset.StandardCharsets
import org.eclipse.emf.ecore.util.EcoreUtil

@RunWith(XtextRunner)
@InjectWith(OCCIInjectorProvider)
class OCCIParsingTest { 
	@Inject extension 
	ParseHelper<org.eclipse.cmf.occi.core.Extension> parseHelper
	
	@Inject extension ValidationTestHelper 

	@Test
	def void testCorrectParsing() {
		EPackage.Registry.INSTANCE.put(OCCIPackage.eNS_URI, OCCIPackage::eINSTANCE)
		'''
						extension infrastructure : "http://schemas.ogf.org/occi/infrastructure#"
									description "OCCI Infrastructure Model" specification
									"https://www.ogf.org/documents/GFD.224.pdf" kind Network { title
									"Network Resource" scheme "http://schemas.ogf.org/occi/infrastructure#"
									attribute occi.network.vlan : type Vlan {
									}
									attribute occi.network.label : type Token {
									}
									attribute required occi.network.state : type NetworkStatus = "inactive" {
									}
									attribute occi.network.state.message : type Token {
									}
									action Up scheme "http://schemas.ogf.org/occi/infrastructure/network/action#"
									action Down scheme "http://schemas.ogf.org/occi/infrastructure/network/action#"
									{
										title ""
									}
									constraint UniqueVlan description "chaque network a un vlan différent" body
									"Network.allInstances()->isUnique(occi.network.vlan)" fsm FSM {
										attribute occi.network.state states {
											State {
												initial final literal NetworkStatus.inactive transitions ( action Down to NetworkStatus.active)
											},
											State {
												literal NetworkStatus.active
											},
											State {
												literal NetworkStatus.error
											}
										}
									}
									NumericType Vlan type Integer ( minInclusive "0" maxInclusive "4095" )
									StringType Token ( ) EnumerationType NetworkStatus ( literals ( active ( ),
									inactive ( ),
									error ( ) ) )
		'''.parse.assertNoErrors
	}
	@Test
	def void loadModel() {
		EPackage.Registry.INSTANCE.put(OCCIPackage.eNS_URI, OCCIPackage::eINSTANCE)
		val result = parseHelper.parse('''
			extension infrastructure : "http://schemas.ogf.org/occi/infrastructure#"
			description "OCCI Infrastructure Model" specification
			"https://www.ogf.org/documents/GFD.224.pdf"  kind Network  { title
			"Network Resource" scheme "http://schemas.ogf.org/occi/infrastructure#"
			attribute occi.network.vlan : type Vlan {
			}
			attribute occi.network.label : type Token {
			}
			attribute required occi.network.state : type NetworkStatus = "inactive" {
			}
			attribute occi.network.state.message : type Token {
			}
			action Up scheme "http://schemas.ogf.org/occi/infrastructure/network/action#"
			action Down scheme "http://schemas.ogf.org/occi/infrastructure/network/action#"
			{
				title ""
			}
			constraint UniqueVlan description "chaque network a un vlan différent" body
			"Network.allInstances()->isUnique(occi.network.vlan)" fsm FSM {
				attribute occi.network.state states {
					State {
						initial final literal NetworkStatus.inactive transitions ( action Down to NetworkStatus.active)
					},
					State {
						literal NetworkStatus.active
					},
					State {
						literal NetworkStatus.error
					}
				}
			}
			NumericType Vlan type Integer ( minInclusive "0" maxInclusive "4095" )
			StringType Token ( ) EnumerationType NetworkStatus ( literals ( active ( ),
			inactive ( ),
			error ( ) ) )
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
		println(result.validate)
//		println('''
//		«FOR s : result.ownedState»
//			«s.name»: 
//			«FOR t : s.outgoingTransition»
//				«t.target.name»
//			«ENDFOR»
//			«s.name»: «s.incomingTransition»
//		«ENDFOR»
//		''')
		
		val RS2 = new ResourceSetImpl
		val r2 = RS2.createResource(URI.createURI("dummy.xmi"))
		EcoreUtil.resolveAll(result.eResource.resourceSet)
		r2.contents.add(result)
		val baos = new ByteArrayOutputStream
		r2.save(baos, null)
		println(new String(baos.toByteArray, StandardCharsets.UTF_8))
	}
}
