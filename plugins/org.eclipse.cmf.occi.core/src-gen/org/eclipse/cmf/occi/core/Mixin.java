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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Mixin#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Mixin#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Mixin#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getMixin()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CorrectScheme NoCyclicInheritance AttributesNameNotAlreadyDefinedInDepends'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot CorrectScheme='\n\n\t\t\t/* Previously let ownerScheme = owner.oclAsType(Extension).scheme in scheme.substring(1,ownerScheme.size()-1) = ownerScheme.substring(1,ownerScheme.size()-1) \052/\n\t\t\tlet owner = self.oclContainer()\n\t\t\tin if owner.oclIsTypeOf(Extension)\n\t\t\t\tthen\n\t\t\tlet ownerScheme = owner.oclAsType(Extension).scheme\n\t\tin scheme.substring(1, ownerScheme.size() - 1) = ownerScheme.substring(1, ownerScheme.size() - 1) else true\n\t\t\tendif' NoCyclicInheritance='depends->closure(depends)->excludes(self)' AttributesNameNotAlreadyDefinedInDepends='attributes.name->excludesAll(depends->closure(depends).attributes.name)'"
 * @generated
 */
public interface Mixin extends Type {
	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getMixin_Depends()
	 * @model
	 * @generated
	 */
	EList<Mixin> getDepends();

	/**
	 * Returns the value of the '<em><b>Applies</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getMixin_Applies()
	 * @model
	 * @generated
	 */
	EList<Kind> getApplies();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getMixin_Entities()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Entity.allInstances()->select(parts.mixin->includes(self))'"
	 * @generated
	 */
	EList<Entity> getEntities();

} // Mixin
