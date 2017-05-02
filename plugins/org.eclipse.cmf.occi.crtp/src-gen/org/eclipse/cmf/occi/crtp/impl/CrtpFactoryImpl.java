/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.crtp.impl;

import org.eclipse.cmf.occi.crtp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrtpFactoryImpl extends EFactoryImpl implements CrtpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CrtpFactory init() {
		try {
			CrtpFactory theCrtpFactory = (CrtpFactory)EPackage.Registry.INSTANCE.getEFactory(CrtpPackage.eNS_URI);
			if (theCrtpFactory != null) {
				return theCrtpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CrtpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrtpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CrtpPackage.SMALL: return createSmall();
			case CrtpPackage.MEDIUM: return createMedium();
			case CrtpPackage.LARGE: return createLarge();
			case CrtpPackage.MEM_SMALL: return createMem_small();
			case CrtpPackage.MEM_MEDIUM: return createMem_medium();
			case CrtpPackage.MEM_LARGE: return createMem_large();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Small createSmall() {
		SmallImpl small = new SmallImpl();
		return small;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medium createMedium() {
		MediumImpl medium = new MediumImpl();
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Large createLarge() {
		LargeImpl large = new LargeImpl();
		return large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mem_small createMem_small() {
		Mem_smallImpl mem_small = new Mem_smallImpl();
		return mem_small;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mem_medium createMem_medium() {
		Mem_mediumImpl mem_medium = new Mem_mediumImpl();
		return mem_medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mem_large createMem_large() {
		Mem_largeImpl mem_large = new Mem_largeImpl();
		return mem_large;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrtpPackage getCrtpPackage() {
		return (CrtpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CrtpPackage getPackage() {
		return CrtpPackage.eINSTANCE;
	}

} //CrtpFactoryImpl
