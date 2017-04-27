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
 * A representation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.RecordType#getRecordFields <em>Record Fields</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getRecordType()
 * @model
 * @generated
 */
public interface RecordType extends DataType {
	/**
	 * Returns the value of the '<em><b>Record Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.RecordField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Fields</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getRecordType_RecordFields()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!RecordType!recordFields'"
	 * @generated
	 */
	EList<RecordField> getRecordFields();

} // RecordType
