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

import org.eclipse.cmf.occi.infrastructure.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class InfrastructureFactoryImpl extends EFactoryImpl implements InfrastructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InfrastructureFactory init() {
		try {
			InfrastructureFactory theInfrastructureFactory = (InfrastructureFactory)EPackage.Registry.INSTANCE.getEFactory(InfrastructurePackage.eNS_URI);
			if (theInfrastructureFactory != null) {
				return theInfrastructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InfrastructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureFactoryImpl() {
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
			case InfrastructurePackage.NETWORK: return createNetwork();
			case InfrastructurePackage.COMPUTE: return createCompute();
			case InfrastructurePackage.STORAGE: return createStorage();
			case InfrastructurePackage.STORAGELINK: return createStoragelink();
			case InfrastructurePackage.NETWORKINTERFACE: return createNetworkinterface();
			case InfrastructurePackage.IPNETWORK: return createIpnetwork();
			case InfrastructurePackage.IPNETWORKINTERFACE: return createIpnetworkinterface();
			case InfrastructurePackage.OS_TPL: return createOs_tpl();
			case InfrastructurePackage.RESOURCE_TPL: return createResource_tpl();
			case InfrastructurePackage.SSH_KEY: return createSsh_key();
			case InfrastructurePackage.USER_DATA: return createUser_data();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InfrastructurePackage.SUSPEND_METHOD:
				return createSuspendMethodFromString(eDataType, initialValue);
			case InfrastructurePackage.NETWORK_STATUS:
				return createNetworkStatusFromString(eDataType, initialValue);
			case InfrastructurePackage.COMPUTE_STATUS:
				return createComputeStatusFromString(eDataType, initialValue);
			case InfrastructurePackage.NETWORK_INTERFACE_STATUS:
				return createNetworkInterfaceStatusFromString(eDataType, initialValue);
			case InfrastructurePackage.ARCHITECTURE:
				return createArchitectureFromString(eDataType, initialValue);
			case InfrastructurePackage.STOP_METHOD:
				return createStopMethodFromString(eDataType, initialValue);
			case InfrastructurePackage.RESTART_METHOD:
				return createRestartMethodFromString(eDataType, initialValue);
			case InfrastructurePackage.ALLOCATION:
				return createAllocationFromString(eDataType, initialValue);
			case InfrastructurePackage.STORAGE_STATUS:
				return createStorageStatusFromString(eDataType, initialValue);
			case InfrastructurePackage.STORAGE_LINK_STATUS:
				return createStorageLinkStatusFromString(eDataType, initialValue);
			case InfrastructurePackage.SAVE_METHOD:
				return createSaveMethodFromString(eDataType, initialValue);
			case InfrastructurePackage.VLAN:
				return createVlanFromString(eDataType, initialValue);
			case InfrastructurePackage.TOKEN:
				return createTokenFromString(eDataType, initialValue);
			case InfrastructurePackage.IP_ADDRESS:
				return createIpAddressFromString(eDataType, initialValue);
			case InfrastructurePackage.CORE:
				return createCoreFromString(eDataType, initialValue);
			case InfrastructurePackage.GHZ:
				return createGHzFromString(eDataType, initialValue);
			case InfrastructurePackage.GI_B:
				return createGiBFromString(eDataType, initialValue);
			case InfrastructurePackage.IP_ADDRESS_RANGE:
				return createIpAddressRangeFromString(eDataType, initialValue);
			case InfrastructurePackage.MAC:
				return createMacFromString(eDataType, initialValue);
			case InfrastructurePackage.SHARE:
				return createShareFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InfrastructurePackage.SUSPEND_METHOD:
				return convertSuspendMethodToString(eDataType, instanceValue);
			case InfrastructurePackage.NETWORK_STATUS:
				return convertNetworkStatusToString(eDataType, instanceValue);
			case InfrastructurePackage.COMPUTE_STATUS:
				return convertComputeStatusToString(eDataType, instanceValue);
			case InfrastructurePackage.NETWORK_INTERFACE_STATUS:
				return convertNetworkInterfaceStatusToString(eDataType, instanceValue);
			case InfrastructurePackage.ARCHITECTURE:
				return convertArchitectureToString(eDataType, instanceValue);
			case InfrastructurePackage.STOP_METHOD:
				return convertStopMethodToString(eDataType, instanceValue);
			case InfrastructurePackage.RESTART_METHOD:
				return convertRestartMethodToString(eDataType, instanceValue);
			case InfrastructurePackage.ALLOCATION:
				return convertAllocationToString(eDataType, instanceValue);
			case InfrastructurePackage.STORAGE_STATUS:
				return convertStorageStatusToString(eDataType, instanceValue);
			case InfrastructurePackage.STORAGE_LINK_STATUS:
				return convertStorageLinkStatusToString(eDataType, instanceValue);
			case InfrastructurePackage.SAVE_METHOD:
				return convertSaveMethodToString(eDataType, instanceValue);
			case InfrastructurePackage.VLAN:
				return convertVlanToString(eDataType, instanceValue);
			case InfrastructurePackage.TOKEN:
				return convertTokenToString(eDataType, instanceValue);
			case InfrastructurePackage.IP_ADDRESS:
				return convertIpAddressToString(eDataType, instanceValue);
			case InfrastructurePackage.CORE:
				return convertCoreToString(eDataType, instanceValue);
			case InfrastructurePackage.GHZ:
				return convertGHzToString(eDataType, instanceValue);
			case InfrastructurePackage.GI_B:
				return convertGiBToString(eDataType, instanceValue);
			case InfrastructurePackage.IP_ADDRESS_RANGE:
				return convertIpAddressRangeToString(eDataType, instanceValue);
			case InfrastructurePackage.MAC:
				return convertMacToString(eDataType, instanceValue);
			case InfrastructurePackage.SHARE:
				return convertShareToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compute createCompute() {
		ComputeImpl compute = new ComputeImpl();
		return compute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storagelink createStoragelink() {
		StoragelinkImpl storagelink = new StoragelinkImpl();
		return storagelink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Networkinterface createNetworkinterface() {
		NetworkinterfaceImpl networkinterface = new NetworkinterfaceImpl();
		return networkinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ipnetwork createIpnetwork() {
		IpnetworkImpl ipnetwork = new IpnetworkImpl();
		return ipnetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ipnetworkinterface createIpnetworkinterface() {
		IpnetworkinterfaceImpl ipnetworkinterface = new IpnetworkinterfaceImpl();
		return ipnetworkinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Os_tpl createOs_tpl() {
		Os_tplImpl os_tpl = new Os_tplImpl();
		return os_tpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource_tpl createResource_tpl() {
		Resource_tplImpl resource_tpl = new Resource_tplImpl();
		return resource_tpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ssh_key createSsh_key() {
		Ssh_keyImpl ssh_key = new Ssh_keyImpl();
		return ssh_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User_data createUser_data() {
		User_dataImpl user_data = new User_dataImpl();
		return user_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuspendMethod createSuspendMethodFromString(EDataType eDataType, String initialValue) {
		SuspendMethod result = SuspendMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSuspendMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkStatus createNetworkStatusFromString(EDataType eDataType, String initialValue) {
		NetworkStatus result = NetworkStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetworkStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeStatus createComputeStatusFromString(EDataType eDataType, String initialValue) {
		ComputeStatus result = ComputeStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComputeStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterfaceStatus createNetworkInterfaceStatusFromString(EDataType eDataType, String initialValue) {
		NetworkInterfaceStatus result = NetworkInterfaceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetworkInterfaceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture createArchitectureFromString(EDataType eDataType, String initialValue) {
		Architecture result = Architecture.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArchitectureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopMethod createStopMethodFromString(EDataType eDataType, String initialValue) {
		StopMethod result = StopMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStopMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartMethod createRestartMethodFromString(EDataType eDataType, String initialValue) {
		RestartMethod result = RestartMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestartMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation createAllocationFromString(EDataType eDataType, String initialValue) {
		Allocation result = Allocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageStatus createStorageStatusFromString(EDataType eDataType, String initialValue) {
		StorageStatus result = StorageStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorageStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageLinkStatus createStorageLinkStatusFromString(EDataType eDataType, String initialValue) {
		StorageLinkStatus result = StorageLinkStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorageLinkStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaveMethod createSaveMethodFromString(EDataType eDataType, String initialValue) {
		SaveMethod result = SaveMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSaveMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createVlanFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVlanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTokenFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTokenToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIpAddressFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIpAddressToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createCoreFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoreToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createGHzFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGHzToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createGiBFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGiBToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIpAddressRangeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIpAddressRangeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMacFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMacToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createShareFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShareToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructurePackage getInfrastructurePackage() {
		return (InfrastructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InfrastructurePackage getPackage() {
		return InfrastructurePackage.eINSTANCE;
	}

} //InfrastructureFactoryImpl
