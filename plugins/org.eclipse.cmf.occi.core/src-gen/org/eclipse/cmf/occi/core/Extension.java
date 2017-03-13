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
package org.eclipse.cmf.occi.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getKinds <em>Kinds</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getTypes <em>Types</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SchemeUnique KindsSchemeValid MixinsSchemeValid TermUnicity KindParentLocalOrImported MixinDependsLocalOrImported MixinAppliesLocalOrImported'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SchemeUnique='Extension.allInstances()->isUnique(scheme)' KindsSchemeValid='kinds->forAll(k | k.scheme = self.scheme)' MixinsSchemeValid='mixins->forAll(m | m.scheme.substring(1, scheme.size() - 1) = scheme.substring(1,\n\t\t\t\t\tscheme.size() - 1))' TermUnicity='kinds.term->intersection(mixins.term)->isEmpty()' KindParentLocalOrImported='kinds->forAll(parent <> null implies let parentExtension = parent.oclContainer()\n\t\t\tin parentExtension = self or import->includes(parentExtension))' MixinDependsLocalOrImported='mixins.depends->forAll(let extension = oclContainer()\n\t\t\tin extension = self or import->includes(extension))' MixinAppliesLocalOrImported='mixins.applies->forAll(let extension = oclContainer()\n\t\t\tin extension = self or import->includes(extension))'"
 * @generated
 */
public interface Extension extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Extension#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Scheme()
	 * @model dataType="org.eclipse.cmf.occi.core.Scheme" required="true"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Extension#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Description()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Extension#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Import()
	 * @model
	 * @generated
	 */
	EList<Extension> getImport();

	/**
	 * Returns the value of the '<em><b>Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kinds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinds</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Kinds()
	 * @model containment="true" keys="term"
	 * @generated
	 */
	EList<Kind> getKinds();

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Mixins()
	 * @model containment="true" keys="term"
	 * @generated
	 */
	EList<Mixin> getMixins();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<EClassifier> getTypes();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Specification()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Extension#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

} // Extension
