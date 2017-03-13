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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CorrectScheme'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot CorrectScheme='let category = oclContainer().oclAsType(Category)\n\t\t\tin scheme = category.scheme.substring(1, category.scheme.size() - 1) + \'/\' + category.term + \'/action#\''"
 * @generated
 */
public interface Action extends Category {
} // Action
