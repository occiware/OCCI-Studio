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
package org.eclipse.cmf.occi.infrastructure.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.infrastructure.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage
 * @generated
 */
public class InfrastructureValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InfrastructureValidator INSTANCE = new InfrastructureValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.infrastructure";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Vlan' of 'Network'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORK__UNIQUE_VLAN = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Networkinterface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORKINTERFACE__TARGET_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Ipnetwork'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IPNETWORK__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Ipnetworkinterface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IPNETWORKINTERFACE__APPLIES_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'IP Adresses Must Be Unique' of 'Ipnetworkinterface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IPNETWORKINTERFACE__IP_ADRESSES_MUST_BE_UNIQUE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Os tpl'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OS_TPL__APPLIES_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Resource tpl'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_TPL__APPLIES_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Ssh key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SSH_KEY__APPLIES_CONSTRAINT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'User data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER_DATA__APPLIES_CONSTRAINT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return InfrastructurePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case InfrastructurePackage.NETWORK:
				return validateNetwork((Network)value, diagnostics, context);
			case InfrastructurePackage.COMPUTE:
				return validateCompute((Compute)value, diagnostics, context);
			case InfrastructurePackage.STORAGE:
				return validateStorage((Storage)value, diagnostics, context);
			case InfrastructurePackage.STORAGELINK:
				return validateStoragelink((Storagelink)value, diagnostics, context);
			case InfrastructurePackage.NETWORKINTERFACE:
				return validateNetworkinterface((Networkinterface)value, diagnostics, context);
			case InfrastructurePackage.IPNETWORK:
				return validateIpnetwork((Ipnetwork)value, diagnostics, context);
			case InfrastructurePackage.IPNETWORKINTERFACE:
				return validateIpnetworkinterface((Ipnetworkinterface)value, diagnostics, context);
			case InfrastructurePackage.OS_TPL:
				return validateOs_tpl((Os_tpl)value, diagnostics, context);
			case InfrastructurePackage.RESOURCE_TPL:
				return validateResource_tpl((Resource_tpl)value, diagnostics, context);
			case InfrastructurePackage.SSH_KEY:
				return validateSsh_key((Ssh_key)value, diagnostics, context);
			case InfrastructurePackage.USER_DATA:
				return validateUser_data((User_data)value, diagnostics, context);
			case InfrastructurePackage.SUSPEND_METHOD:
				return validateSuspendMethod((SuspendMethod)value, diagnostics, context);
			case InfrastructurePackage.NETWORK_STATUS:
				return validateNetworkStatus((NetworkStatus)value, diagnostics, context);
			case InfrastructurePackage.COMPUTE_STATUS:
				return validateComputeStatus((ComputeStatus)value, diagnostics, context);
			case InfrastructurePackage.NETWORK_INTERFACE_STATUS:
				return validateNetworkInterfaceStatus((NetworkInterfaceStatus)value, diagnostics, context);
			case InfrastructurePackage.ARCHITECTURE:
				return validateArchitecture((Architecture)value, diagnostics, context);
			case InfrastructurePackage.STOP_METHOD:
				return validateStopMethod((StopMethod)value, diagnostics, context);
			case InfrastructurePackage.RESTART_METHOD:
				return validateRestartMethod((RestartMethod)value, diagnostics, context);
			case InfrastructurePackage.ALLOCATION:
				return validateAllocation((Allocation)value, diagnostics, context);
			case InfrastructurePackage.STORAGE_STATUS:
				return validateStorageStatus((StorageStatus)value, diagnostics, context);
			case InfrastructurePackage.STORAGE_LINK_STATUS:
				return validateStorageLinkStatus((StorageLinkStatus)value, diagnostics, context);
			case InfrastructurePackage.SAVE_METHOD:
				return validateSaveMethod((SaveMethod)value, diagnostics, context);
			case InfrastructurePackage.VLAN:
				return validateVlan((Integer)value, diagnostics, context);
			case InfrastructurePackage.TOKEN:
				return validateToken((String)value, diagnostics, context);
			case InfrastructurePackage.IP_ADDRESS:
				return validateIpAddress((String)value, diagnostics, context);
			case InfrastructurePackage.CORE:
				return validateCore((Integer)value, diagnostics, context);
			case InfrastructurePackage.GHZ:
				return validateGHz((Float)value, diagnostics, context);
			case InfrastructurePackage.GI_B:
				return validateGiB((Float)value, diagnostics, context);
			case InfrastructurePackage.IP_ADDRESS_RANGE:
				return validateIpAddressRange((String)value, diagnostics, context);
			case InfrastructurePackage.MAC:
				return validateMac((String)value, diagnostics, context);
			case InfrastructurePackage.SHARE:
				return validateShare((Integer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(network, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(network, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(network, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(network, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetwork_UniqueVlan(network, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueVlan constraint of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork_UniqueVlan(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return network.UniqueVlan(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompute(Compute compute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compute, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(compute, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(compute, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(compute, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(compute, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(compute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorage(Storage storage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(storage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(storage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(storage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(storage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(storage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoragelink(Storagelink storagelink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storagelink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(storagelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(storagelink, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkinterface(Networkinterface networkinterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networkinterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(networkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworkinterface_targetConstraint(networkinterface, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Networkinterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkinterface_targetConstraint(Networkinterface networkinterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return networkinterface.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpnetwork(Ipnetwork ipnetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ipnetwork, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ipnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ipnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ipnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ipnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ipnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ipnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ipnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ipnetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validateIpnetwork_appliesConstraint(ipnetwork, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Ipnetwork</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpnetwork_appliesConstraint(Ipnetwork ipnetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ipnetwork.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpnetworkinterface(Ipnetworkinterface ipnetworkinterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ipnetworkinterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ipnetworkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ipnetworkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ipnetworkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ipnetworkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ipnetworkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ipnetworkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ipnetworkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ipnetworkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateIpnetworkinterface_IPAdressesMustBeUnique(ipnetworkinterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateIpnetworkinterface_appliesConstraint(ipnetworkinterface, diagnostics, context);
		return result;
	}

	/**
	 * Validates the IPAdressesMustBeUnique constraint of '<em>Ipnetworkinterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpnetworkinterface_IPAdressesMustBeUnique(Ipnetworkinterface ipnetworkinterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ipnetworkinterface.IPAdressesMustBeUnique(diagnostics, context);
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Ipnetworkinterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpnetworkinterface_appliesConstraint(Ipnetworkinterface ipnetworkinterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ipnetworkinterface.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOs_tpl(Os_tpl os_tpl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(os_tpl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(os_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(os_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(os_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(os_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(os_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(os_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(os_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(os_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validateOs_tpl_appliesConstraint(os_tpl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Os tpl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOs_tpl_appliesConstraint(Os_tpl os_tpl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return os_tpl.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_tpl(Resource_tpl resource_tpl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resource_tpl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resource_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resource_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resource_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resource_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resource_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resource_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resource_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resource_tpl, diagnostics, context);
		if (result || diagnostics != null) result &= validateResource_tpl_appliesConstraint(resource_tpl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Resource tpl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_tpl_appliesConstraint(Resource_tpl resource_tpl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resource_tpl.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSsh_key(Ssh_key ssh_key, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ssh_key, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ssh_key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ssh_key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ssh_key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ssh_key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ssh_key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ssh_key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ssh_key, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ssh_key, diagnostics, context);
		if (result || diagnostics != null) result &= validateSsh_key_appliesConstraint(ssh_key, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Ssh key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSsh_key_appliesConstraint(Ssh_key ssh_key, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ssh_key.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_data(User_data user_data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(user_data, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(user_data, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_data_appliesConstraint(user_data, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>User data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser_data_appliesConstraint(User_data user_data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return user_data.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuspendMethod(SuspendMethod suspendMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkStatus(NetworkStatus networkStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputeStatus(ComputeStatus computeStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkInterfaceStatus(NetworkInterfaceStatus networkInterfaceStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchitecture(Architecture architecture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStopMethod(StopMethod stopMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestartMethod(RestartMethod restartMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllocation(Allocation allocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageStatus(StorageStatus storageStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageLinkStatus(StorageLinkStatus storageLinkStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSaveMethod(SaveMethod saveMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVlan(Integer vlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVlan_Min(vlan, diagnostics, context);
		if (result || diagnostics != null) result &= validateVlan_Max(vlan, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVlan_Min
	 */
	public static final Integer VLAN__MIN__VALUE = new Integer(0);

	/**
	 * Validates the Min constraint of '<em>Vlan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVlan_Min(Integer vlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = vlan.compareTo(VLAN__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(InfrastructurePackage.Literals.VLAN, vlan, VLAN__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVlan_Max
	 */
	public static final Integer VLAN__MAX__VALUE = new Integer(4095);

	/**
	 * Validates the Max constraint of '<em>Vlan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVlan_Max(Integer vlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = vlan.compareTo(VLAN__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(InfrastructurePackage.Literals.VLAN, vlan, VLAN__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToken(String token, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpAddress(String ipAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCore(Integer core, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCore_Min(core, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCore_Min
	 */
	public static final Integer CORE__MIN__VALUE = new Integer(0);

	/**
	 * Validates the Min constraint of '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCore_Min(Integer core, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = core.compareTo(CORE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(InfrastructurePackage.Literals.CORE, core, CORE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGHz(Float gHz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGHz_Min(gHz, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGHz_Min
	 */
	public static final Float GHZ__MIN__VALUE = new Float(0.0F);

	/**
	 * Validates the Min constraint of '<em>GHz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGHz_Min(Float gHz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = gHz.compareTo(GHZ__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(InfrastructurePackage.Literals.GHZ, gHz, GHZ__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGiB(Float giB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGiB_Min(giB, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGiB_Min
	 */
	public static final Float GI_B__MIN__VALUE = new Float(0.0F);

	/**
	 * Validates the Min constraint of '<em>Gi B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGiB_Min(Float giB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = giB.compareTo(GI_B__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(InfrastructurePackage.Literals.GI_B, giB, GI_B__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpAddressRange(String ipAddressRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMac(String mac, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShare(Integer share, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateShare_Min(share, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateShare_Min
	 */
	public static final Integer SHARE__MIN__VALUE = new Integer(0);

	/**
	 * Validates the Min constraint of '<em>Share</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShare_Min(Integer share, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = share.compareTo(SHARE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(InfrastructurePackage.Literals.SHARE, share, SHARE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //InfrastructureValidator
