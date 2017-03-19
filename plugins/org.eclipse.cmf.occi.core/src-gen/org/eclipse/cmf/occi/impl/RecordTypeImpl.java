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
package org.eclipse.cmf.occi.impl;

import java.util.Collection;

import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.RecordFieldDeclaration;
import org.eclipse.cmf.occi.core.RecordType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.impl.RecordTypeImpl#getRecordFiledDeclarations <em>Record Filed Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordTypeImpl extends DataTypeImpl implements RecordType {
	/**
	 * The cached value of the '{@link #getRecordFiledDeclarations() <em>Record Filed Declarations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordFiledDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordFieldDeclaration> recordFiledDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCCIPackage.Literals.RECORD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordFieldDeclaration> getRecordFiledDeclarations() {
		if (recordFiledDeclarations == null) {
			recordFiledDeclarations = new EObjectResolvingEList<RecordFieldDeclaration>(RecordFieldDeclaration.class, this, OCCIPackage.RECORD_TYPE__RECORD_FILED_DECLARATIONS);
		}
		return recordFiledDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCCIPackage.RECORD_TYPE__RECORD_FILED_DECLARATIONS:
				return getRecordFiledDeclarations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OCCIPackage.RECORD_TYPE__RECORD_FILED_DECLARATIONS:
				getRecordFiledDeclarations().clear();
				getRecordFiledDeclarations().addAll((Collection<? extends RecordFieldDeclaration>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OCCIPackage.RECORD_TYPE__RECORD_FILED_DECLARATIONS:
				getRecordFiledDeclarations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OCCIPackage.RECORD_TYPE__RECORD_FILED_DECLARATIONS:
				return recordFiledDeclarations != null && !recordFiledDeclarations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordTypeImpl
