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
package org.eclipse.cmf.occi.infrastructure.impl;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.Allocation;
import org.eclipse.cmf.occi.infrastructure.Architecture;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.InfrastructureFactory;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;
import org.eclipse.cmf.occi.infrastructure.Ipnetwork;
import org.eclipse.cmf.occi.infrastructure.Ipnetworkinterface;
import org.eclipse.cmf.occi.infrastructure.Network;
import org.eclipse.cmf.occi.infrastructure.NetworkInterfaceStatus;
import org.eclipse.cmf.occi.infrastructure.NetworkStatus;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.eclipse.cmf.occi.infrastructure.Os_tpl;
import org.eclipse.cmf.occi.infrastructure.Resource_tpl;
import org.eclipse.cmf.occi.infrastructure.RestartMethod;
import org.eclipse.cmf.occi.infrastructure.SaveMethod;
import org.eclipse.cmf.occi.infrastructure.Ssh_key;
import org.eclipse.cmf.occi.infrastructure.StopMethod;
import org.eclipse.cmf.occi.infrastructure.Storage;
import org.eclipse.cmf.occi.infrastructure.StorageLinkStatus;
import org.eclipse.cmf.occi.infrastructure.StorageStatus;
import org.eclipse.cmf.occi.infrastructure.Storagelink;
import org.eclipse.cmf.occi.infrastructure.SuspendMethod;
import org.eclipse.cmf.occi.infrastructure.User_data;

import org.eclipse.cmf.occi.infrastructure.util.InfrastructureValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructurePackageImpl extends EPackageImpl implements InfrastructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storagelinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkinterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipnetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipnetworkinterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass os_tplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resource_tplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssh_keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass user_dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum suspendMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum computeStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkInterfaceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum architectureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stopMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restartMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storageStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storageLinkStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum saveMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vlanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tokenEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipAddressEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coreEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gHzEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType giBEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipAddressRangeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType macEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shareEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfrastructurePackageImpl() {
		super(eNS_URI, InfrastructureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link InfrastructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InfrastructurePackage init() {
		if (isInited) return (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInfrastructurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = registeredInfrastructurePackage instanceof InfrastructurePackageImpl ? (InfrastructurePackageImpl)registeredInfrastructurePackage : new InfrastructurePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInfrastructurePackage.createPackageContents();

		// Initialize created meta-data
		theInfrastructurePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theInfrastructurePackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return InfrastructureValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theInfrastructurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfrastructurePackage.eNS_URI, theInfrastructurePackage);
		return theInfrastructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_OcciNetworkVlan() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_OcciNetworkLabel() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_OcciNetworkState() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_OcciNetworkStateMessage() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetwork__Up() {
		return networkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetwork__Down() {
		return networkEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetwork__UniqueVlan__DiagnosticChain_Map() {
		return networkEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompute() {
		return computeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_OcciComputeArchitecture() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_OcciComputeCores() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_OcciComputeHostname() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_OcciComputeShare() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_OcciComputeSpeed() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_OcciComputeMemory() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_OcciComputeState() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompute_OcciComputeStateMessage() {
		return (EAttribute)computeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompute__Start() {
		return computeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompute__Stop__StopMethod() {
		return computeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompute__Restart__RestartMethod() {
		return computeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompute__Suspend__SuspendMethod() {
		return computeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompute__Save__SaveMethod_String() {
		return computeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_OcciStorageSize() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_OcciStorageState() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_OcciStorageStateMessage() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStorage__Online() {
		return storageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStorage__Offline() {
		return storageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoragelink() {
		return storagelinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoragelink_OcciStoragelinkDeviceid() {
		return (EAttribute)storagelinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoragelink_OcciStoragelinkMountpoint() {
		return (EAttribute)storagelinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoragelink_OcciStoragelinkState() {
		return (EAttribute)storagelinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStoragelink_OcciStoragelinkStateMessage() {
		return (EAttribute)storagelinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkinterface() {
		return networkinterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkinterface_OcciNetworkinterfaceInterface() {
		return (EAttribute)networkinterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkinterface_OcciNetworkinterfaceMac() {
		return (EAttribute)networkinterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkinterface_OcciNetworkinterfaceState() {
		return (EAttribute)networkinterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkinterface_OcciNetworkinterfaceStateMessage() {
		return (EAttribute)networkinterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetworkinterface__TargetConstraint__DiagnosticChain_Map() {
		return networkinterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIpnetwork() {
		return ipnetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpnetwork_OcciNetworkAddress() {
		return (EAttribute)ipnetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpnetwork_OcciNetworkGateway() {
		return (EAttribute)ipnetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpnetwork_OcciNetworkAllocation() {
		return (EAttribute)ipnetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIpnetwork__AppliesConstraint__DiagnosticChain_Map() {
		return ipnetworkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIpnetworkinterface() {
		return ipnetworkinterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpnetworkinterface_OcciNetworkinterfaceAddress() {
		return (EAttribute)ipnetworkinterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpnetworkinterface_OcciNetworkinterfaceGateway() {
		return (EAttribute)ipnetworkinterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIpnetworkinterface_OcciNetworkinterfaceAllocation() {
		return (EAttribute)ipnetworkinterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIpnetworkinterface__AppliesConstraint__DiagnosticChain_Map() {
		return ipnetworkinterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIpnetworkinterface__IPAdressesMustBeUnique__DiagnosticChain_Map() {
		return ipnetworkinterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOs_tpl() {
		return os_tplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOs_tpl__AppliesConstraint__DiagnosticChain_Map() {
		return os_tplEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource_tpl() {
		return resource_tplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResource_tpl__AppliesConstraint__DiagnosticChain_Map() {
		return resource_tplEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSsh_key() {
		return ssh_keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSsh_key_OcciCredentialsSshPublickey() {
		return (EAttribute)ssh_keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSsh_key__AppliesConstraint__DiagnosticChain_Map() {
		return ssh_keyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser_data() {
		return user_dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_data_OcciComputeUserdata() {
		return (EAttribute)user_dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser_data__AppliesConstraint__DiagnosticChain_Map() {
		return user_dataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSuspendMethod() {
		return suspendMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkStatus() {
		return networkStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComputeStatus() {
		return computeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNetworkInterfaceStatus() {
		return networkInterfaceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArchitecture() {
		return architectureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStopMethod() {
		return stopMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestartMethod() {
		return restartMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllocation() {
		return allocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStorageStatus() {
		return storageStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStorageLinkStatus() {
		return storageLinkStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSaveMethod() {
		return saveMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVlan() {
		return vlanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getToken() {
		return tokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIpAddress() {
		return ipAddressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCore() {
		return coreEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGHz() {
		return gHzEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGiB() {
		return giBEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIpAddressRange() {
		return ipAddressRangeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMac() {
		return macEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShare() {
		return shareEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureFactory getInfrastructureFactory() {
		return (InfrastructureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__OCCI_NETWORK_VLAN);
		createEAttribute(networkEClass, NETWORK__OCCI_NETWORK_LABEL);
		createEAttribute(networkEClass, NETWORK__OCCI_NETWORK_STATE);
		createEAttribute(networkEClass, NETWORK__OCCI_NETWORK_STATE_MESSAGE);
		createEOperation(networkEClass, NETWORK___UP);
		createEOperation(networkEClass, NETWORK___DOWN);
		createEOperation(networkEClass, NETWORK___UNIQUE_VLAN__DIAGNOSTICCHAIN_MAP);

		computeEClass = createEClass(COMPUTE);
		createEAttribute(computeEClass, COMPUTE__OCCI_COMPUTE_ARCHITECTURE);
		createEAttribute(computeEClass, COMPUTE__OCCI_COMPUTE_CORES);
		createEAttribute(computeEClass, COMPUTE__OCCI_COMPUTE_HOSTNAME);
		createEAttribute(computeEClass, COMPUTE__OCCI_COMPUTE_SHARE);
		createEAttribute(computeEClass, COMPUTE__OCCI_COMPUTE_SPEED);
		createEAttribute(computeEClass, COMPUTE__OCCI_COMPUTE_MEMORY);
		createEAttribute(computeEClass, COMPUTE__OCCI_COMPUTE_STATE);
		createEAttribute(computeEClass, COMPUTE__OCCI_COMPUTE_STATE_MESSAGE);
		createEOperation(computeEClass, COMPUTE___START);
		createEOperation(computeEClass, COMPUTE___STOP__STOPMETHOD);
		createEOperation(computeEClass, COMPUTE___RESTART__RESTARTMETHOD);
		createEOperation(computeEClass, COMPUTE___SUSPEND__SUSPENDMETHOD);
		createEOperation(computeEClass, COMPUTE___SAVE__SAVEMETHOD_STRING);

		storageEClass = createEClass(STORAGE);
		createEAttribute(storageEClass, STORAGE__OCCI_STORAGE_SIZE);
		createEAttribute(storageEClass, STORAGE__OCCI_STORAGE_STATE);
		createEAttribute(storageEClass, STORAGE__OCCI_STORAGE_STATE_MESSAGE);
		createEOperation(storageEClass, STORAGE___ONLINE);
		createEOperation(storageEClass, STORAGE___OFFLINE);

		storagelinkEClass = createEClass(STORAGELINK);
		createEAttribute(storagelinkEClass, STORAGELINK__OCCI_STORAGELINK_DEVICEID);
		createEAttribute(storagelinkEClass, STORAGELINK__OCCI_STORAGELINK_MOUNTPOINT);
		createEAttribute(storagelinkEClass, STORAGELINK__OCCI_STORAGELINK_STATE);
		createEAttribute(storagelinkEClass, STORAGELINK__OCCI_STORAGELINK_STATE_MESSAGE);

		networkinterfaceEClass = createEClass(NETWORKINTERFACE);
		createEAttribute(networkinterfaceEClass, NETWORKINTERFACE__OCCI_NETWORKINTERFACE_INTERFACE);
		createEAttribute(networkinterfaceEClass, NETWORKINTERFACE__OCCI_NETWORKINTERFACE_MAC);
		createEAttribute(networkinterfaceEClass, NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE);
		createEAttribute(networkinterfaceEClass, NETWORKINTERFACE__OCCI_NETWORKINTERFACE_STATE_MESSAGE);
		createEOperation(networkinterfaceEClass, NETWORKINTERFACE___TARGET_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		ipnetworkEClass = createEClass(IPNETWORK);
		createEAttribute(ipnetworkEClass, IPNETWORK__OCCI_NETWORK_ADDRESS);
		createEAttribute(ipnetworkEClass, IPNETWORK__OCCI_NETWORK_GATEWAY);
		createEAttribute(ipnetworkEClass, IPNETWORK__OCCI_NETWORK_ALLOCATION);
		createEOperation(ipnetworkEClass, IPNETWORK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		ipnetworkinterfaceEClass = createEClass(IPNETWORKINTERFACE);
		createEAttribute(ipnetworkinterfaceEClass, IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ADDRESS);
		createEAttribute(ipnetworkinterfaceEClass, IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_GATEWAY);
		createEAttribute(ipnetworkinterfaceEClass, IPNETWORKINTERFACE__OCCI_NETWORKINTERFACE_ALLOCATION);
		createEOperation(ipnetworkinterfaceEClass, IPNETWORKINTERFACE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(ipnetworkinterfaceEClass, IPNETWORKINTERFACE___IP_ADRESSES_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP);

		os_tplEClass = createEClass(OS_TPL);
		createEOperation(os_tplEClass, OS_TPL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		resource_tplEClass = createEClass(RESOURCE_TPL);
		createEOperation(resource_tplEClass, RESOURCE_TPL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		ssh_keyEClass = createEClass(SSH_KEY);
		createEAttribute(ssh_keyEClass, SSH_KEY__OCCI_CREDENTIALS_SSH_PUBLICKEY);
		createEOperation(ssh_keyEClass, SSH_KEY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		user_dataEClass = createEClass(USER_DATA);
		createEAttribute(user_dataEClass, USER_DATA__OCCI_COMPUTE_USERDATA);
		createEOperation(user_dataEClass, USER_DATA___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		// Create enums
		suspendMethodEEnum = createEEnum(SUSPEND_METHOD);
		networkStatusEEnum = createEEnum(NETWORK_STATUS);
		computeStatusEEnum = createEEnum(COMPUTE_STATUS);
		networkInterfaceStatusEEnum = createEEnum(NETWORK_INTERFACE_STATUS);
		architectureEEnum = createEEnum(ARCHITECTURE);
		stopMethodEEnum = createEEnum(STOP_METHOD);
		restartMethodEEnum = createEEnum(RESTART_METHOD);
		allocationEEnum = createEEnum(ALLOCATION);
		storageStatusEEnum = createEEnum(STORAGE_STATUS);
		storageLinkStatusEEnum = createEEnum(STORAGE_LINK_STATUS);
		saveMethodEEnum = createEEnum(SAVE_METHOD);

		// Create data types
		vlanEDataType = createEDataType(VLAN);
		tokenEDataType = createEDataType(TOKEN);
		ipAddressEDataType = createEDataType(IP_ADDRESS);
		coreEDataType = createEDataType(CORE);
		gHzEDataType = createEDataType(GHZ);
		giBEDataType = createEDataType(GI_B);
		ipAddressRangeEDataType = createEDataType(IP_ADDRESS_RANGE);
		macEDataType = createEDataType(MAC);
		shareEDataType = createEDataType(SHARE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		networkEClass.getESuperTypes().add(theOCCIPackage.getResource());
		computeEClass.getESuperTypes().add(theOCCIPackage.getResource());
		storageEClass.getESuperTypes().add(theOCCIPackage.getResource());
		storagelinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		networkinterfaceEClass.getESuperTypes().add(theOCCIPackage.getLink());
		ipnetworkEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ipnetworkinterfaceEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		os_tplEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		resource_tplEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ssh_keyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		user_dataEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_OcciNetworkVlan(), this.getVlan(), "occiNetworkVlan", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_OcciNetworkLabel(), this.getToken(), "occiNetworkLabel", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_OcciNetworkState(), this.getNetworkStatus(), "occiNetworkState", "inactive", 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_OcciNetworkStateMessage(), theOCCIPackage.getString(), "occiNetworkStateMessage", null, 0, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNetwork__Up(), null, "up", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNetwork__Down(), null, "down", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getNetwork__UniqueVlan__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "UniqueVlan", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(computeEClass, Compute.class, "Compute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompute_OcciComputeArchitecture(), this.getArchitecture(), "occiComputeArchitecture", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_OcciComputeCores(), this.getCore(), "occiComputeCores", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_OcciComputeHostname(), theOCCIPackage.getString(), "occiComputeHostname", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_OcciComputeShare(), this.getShare(), "occiComputeShare", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_OcciComputeSpeed(), this.getGHz(), "occiComputeSpeed", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_OcciComputeMemory(), this.getGiB(), "occiComputeMemory", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_OcciComputeState(), this.getComputeStatus(), "occiComputeState", "inactive", 1, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompute_OcciComputeStateMessage(), theOCCIPackage.getString(), "occiComputeStateMessage", null, 0, 1, Compute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompute__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompute__Stop__StopMethod(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStopMethod(), "method", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompute__Restart__RestartMethod(), null, "restart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRestartMethod(), "method", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompute__Suspend__SuspendMethod(), null, "suspend", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSuspendMethod(), "method", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompute__Save__SaveMethod_String(), null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSaveMethod(), "method", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorage_OcciStorageSize(), this.getGiB(), "occiStorageSize", null, 1, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorage_OcciStorageState(), this.getStorageStatus(), "occiStorageState", null, 1, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorage_OcciStorageStateMessage(), theOCCIPackage.getString(), "occiStorageStateMessage", null, 0, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStorage__Online(), null, "online", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStorage__Offline(), null, "offline", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storagelinkEClass, Storagelink.class, "Storagelink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStoragelink_OcciStoragelinkDeviceid(), theOCCIPackage.getString(), "occiStoragelinkDeviceid", null, 1, 1, Storagelink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragelink_OcciStoragelinkMountpoint(), theOCCIPackage.getString(), "occiStoragelinkMountpoint", null, 0, 1, Storagelink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragelink_OcciStoragelinkState(), this.getStorageLinkStatus(), "occiStoragelinkState", null, 1, 1, Storagelink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStoragelink_OcciStoragelinkStateMessage(), theOCCIPackage.getString(), "occiStoragelinkStateMessage", null, 0, 1, Storagelink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkinterfaceEClass, Networkinterface.class, "Networkinterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkinterface_OcciNetworkinterfaceInterface(), theOCCIPackage.getString(), "occiNetworkinterfaceInterface", null, 1, 1, Networkinterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkinterface_OcciNetworkinterfaceMac(), this.getMac(), "occiNetworkinterfaceMac", null, 1, 1, Networkinterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkinterface_OcciNetworkinterfaceState(), this.getNetworkInterfaceStatus(), "occiNetworkinterfaceState", null, 1, 1, Networkinterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkinterface_OcciNetworkinterfaceStateMessage(), theOCCIPackage.getString(), "occiNetworkinterfaceStateMessage", null, 0, 1, Networkinterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNetworkinterface__TargetConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "targetConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ipnetworkEClass, Ipnetwork.class, "Ipnetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIpnetwork_OcciNetworkAddress(), this.getIpAddressRange(), "occiNetworkAddress", null, 0, 1, Ipnetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpnetwork_OcciNetworkGateway(), this.getIpAddress(), "occiNetworkGateway", null, 0, 1, Ipnetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpnetwork_OcciNetworkAllocation(), this.getAllocation(), "occiNetworkAllocation", null, 0, 1, Ipnetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getIpnetwork__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ipnetworkinterfaceEClass, Ipnetworkinterface.class, "Ipnetworkinterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIpnetworkinterface_OcciNetworkinterfaceAddress(), this.getIpAddress(), "occiNetworkinterfaceAddress", null, 1, 1, Ipnetworkinterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpnetworkinterface_OcciNetworkinterfaceGateway(), this.getIpAddress(), "occiNetworkinterfaceGateway", null, 0, 1, Ipnetworkinterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpnetworkinterface_OcciNetworkinterfaceAllocation(), this.getAllocation(), "occiNetworkinterfaceAllocation", null, 1, 1, Ipnetworkinterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getIpnetworkinterface__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIpnetworkinterface__IPAdressesMustBeUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "IPAdressesMustBeUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(os_tplEClass, Os_tpl.class, "Os_tpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getOs_tpl__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resource_tplEClass, Resource_tpl.class, "Resource_tpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getResource_tpl__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ssh_keyEClass, Ssh_key.class, "Ssh_key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSsh_key_OcciCredentialsSshPublickey(), theOCCIPackage.getString(), "occiCredentialsSshPublickey", null, 1, 1, Ssh_key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSsh_key__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(user_dataEClass, User_data.class, "User_data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_data_OcciComputeUserdata(), theOCCIPackage.getString(), "occiComputeUserdata", null, 1, 1, User_data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUser_data__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(suspendMethodEEnum, SuspendMethod.class, "SuspendMethod");
		addEEnumLiteral(suspendMethodEEnum, SuspendMethod.HIBERNATE);
		addEEnumLiteral(suspendMethodEEnum, SuspendMethod.SUSPEND);

		initEEnum(networkStatusEEnum, NetworkStatus.class, "NetworkStatus");
		addEEnumLiteral(networkStatusEEnum, NetworkStatus.ACTIVE);
		addEEnumLiteral(networkStatusEEnum, NetworkStatus.INACTIVE);
		addEEnumLiteral(networkStatusEEnum, NetworkStatus.ERROR);

		initEEnum(computeStatusEEnum, ComputeStatus.class, "ComputeStatus");
		addEEnumLiteral(computeStatusEEnum, ComputeStatus.ACTIVE);
		addEEnumLiteral(computeStatusEEnum, ComputeStatus.INACTIVE);
		addEEnumLiteral(computeStatusEEnum, ComputeStatus.SUSPENDED);
		addEEnumLiteral(computeStatusEEnum, ComputeStatus.ERROR);

		initEEnum(networkInterfaceStatusEEnum, NetworkInterfaceStatus.class, "NetworkInterfaceStatus");
		addEEnumLiteral(networkInterfaceStatusEEnum, NetworkInterfaceStatus.ACTIVE);
		addEEnumLiteral(networkInterfaceStatusEEnum, NetworkInterfaceStatus.INACTIVE);
		addEEnumLiteral(networkInterfaceStatusEEnum, NetworkInterfaceStatus.ERROR);

		initEEnum(architectureEEnum, Architecture.class, "Architecture");
		addEEnumLiteral(architectureEEnum, Architecture.X86);
		addEEnumLiteral(architectureEEnum, Architecture.X64);

		initEEnum(stopMethodEEnum, StopMethod.class, "StopMethod");
		addEEnumLiteral(stopMethodEEnum, StopMethod.GRACEFUL);
		addEEnumLiteral(stopMethodEEnum, StopMethod.ACPIOFF);
		addEEnumLiteral(stopMethodEEnum, StopMethod.POWEROFF);

		initEEnum(restartMethodEEnum, RestartMethod.class, "RestartMethod");
		addEEnumLiteral(restartMethodEEnum, RestartMethod.GRACEFUL);
		addEEnumLiteral(restartMethodEEnum, RestartMethod.WARM);
		addEEnumLiteral(restartMethodEEnum, RestartMethod.COLD);

		initEEnum(allocationEEnum, Allocation.class, "Allocation");
		addEEnumLiteral(allocationEEnum, Allocation.DYNAMIC);
		addEEnumLiteral(allocationEEnum, Allocation.STATIC);

		initEEnum(storageStatusEEnum, StorageStatus.class, "StorageStatus");
		addEEnumLiteral(storageStatusEEnum, StorageStatus.ONLINE);
		addEEnumLiteral(storageStatusEEnum, StorageStatus.OFFLINE);
		addEEnumLiteral(storageStatusEEnum, StorageStatus.ERROR);

		initEEnum(storageLinkStatusEEnum, StorageLinkStatus.class, "StorageLinkStatus");
		addEEnumLiteral(storageLinkStatusEEnum, StorageLinkStatus.ACTIVE);
		addEEnumLiteral(storageLinkStatusEEnum, StorageLinkStatus.INACTIVE);
		addEEnumLiteral(storageLinkStatusEEnum, StorageLinkStatus.ERROR);

		initEEnum(saveMethodEEnum, SaveMethod.class, "SaveMethod");
		addEEnumLiteral(saveMethodEEnum, SaveMethod.HOT);
		addEEnumLiteral(saveMethodEEnum, SaveMethod.DEFERRED);

		// Initialize data types
		initEDataType(vlanEDataType, Integer.class, "Vlan", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tokenEDataType, String.class, "Token", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipAddressEDataType, String.class, "IpAddress", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coreEDataType, Integer.class, "Core", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gHzEDataType, Float.class, "GHz", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(giBEDataType, Float.class, "GiB", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipAddressRangeEDataType, String.class, "IpAddressRange", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(macEDataType, String.class, "Mac", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shareEDataType, Integer.class, "Share", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (networkEClass,
		   source,
		   new String[] {
			   "constraints", "UniqueVlan"
		   });
		addAnnotation
		  (networkinterfaceEClass,
		   source,
		   new String[] {
			   "constraints", "targetConstraint"
		   });
		addAnnotation
		  (ipnetworkEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (ipnetworkinterfaceEClass,
		   source,
		   new String[] {
			   "constraints", "IPAdressesMustBeUnique"
		   });
		addAnnotation
		  (os_tplEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (resource_tplEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (ssh_keyEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (user_dataEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (vlanEDataType,
		   source,
		   new String[] {
			   "minInclusive", "0",
			   "maxInclusive", "4095"
		   });
		addAnnotation
		  (coreEDataType,
		   source,
		   new String[] {
			   "minExclusive", "0"
		   });
		addAnnotation
		  (gHzEDataType,
		   source,
		   new String[] {
			   "minExclusive", "0"
		   });
		addAnnotation
		  (giBEDataType,
		   source,
		   new String[] {
			   "minExclusive", "0"
		   });
		addAnnotation
		  (shareEDataType,
		   source,
		   new String[] {
			   "minInclusive", "0"
		   });
	}

} //InfrastructurePackageImpl
