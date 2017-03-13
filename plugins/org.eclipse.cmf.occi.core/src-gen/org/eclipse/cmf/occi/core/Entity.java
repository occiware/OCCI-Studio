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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IdUnique AttributesNameUnique KindCompatibleWithOneAppliesOfEachMixin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IdUnique='Entity.allInstances()->isUnique(id)' AttributesNameUnique='attributes->isUnique(name)' KindCompatibleWithOneAppliesOfEachMixin='parts.mixin->forAll(m |\n\t\t\t\tm.applies->notEmpty() implies m.applies->exists(k | kind->closure(parent)->includes(k)))'"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Id()
	 * @model dataType="org.eclipse.cmf.occi.core.URI" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Entity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Title()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Entity#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(Kind)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Kind()
	 * @model required="true"
	 * @generated
	 */
	Kind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Entity#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Location()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Entity#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.AttributeState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeState> getAttributes();

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Mixins()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='parts.mixin->asSet()'"
	 * @generated
	 */
	EList<Mixin> getMixins();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.MixinBase}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.MixinBase#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Parts()
	 * @see org.eclipse.cmf.occi.core.MixinBase#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<MixinBase> getParts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void occiCreate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void occiRetrieve();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void occiUpdate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void occiDelete();

} // Entity
