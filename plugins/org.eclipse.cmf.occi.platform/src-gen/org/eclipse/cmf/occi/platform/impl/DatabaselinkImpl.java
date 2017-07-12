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
package org.eclipse.cmf.occi.platform.impl;

import java.lang.reflect.InvocationTargetException;

import java.net.URI;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.platform.Databaselink;
import org.eclipse.cmf.occi.platform.PlatformPackage;
import org.eclipse.cmf.occi.platform.PlatformTables;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Databaselink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.DatabaselinkImpl#getOcciDatabaseUri <em>Occi Database Uri</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.DatabaselinkImpl#getOcciDatabaseUsername <em>Occi Database Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.platform.impl.DatabaselinkImpl#getOcciDatabaseToken <em>Occi Database Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaselinkImpl extends MixinBaseImpl implements Databaselink {
	/**
	 * The default value of the '{@link #getOcciDatabaseUri() <em>Occi Database Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseUri()
	 * @generated
	 * @ordered
	 */
	protected static final URI OCCI_DATABASE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciDatabaseUri() <em>Occi Database Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseUri()
	 * @generated
	 * @ordered
	 */
	protected URI occiDatabaseUri = OCCI_DATABASE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciDatabaseUsername() <em>Occi Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected static final URI OCCI_DATABASE_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciDatabaseUsername() <em>Occi Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected URI occiDatabaseUsername = OCCI_DATABASE_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOcciDatabaseToken() <em>Occi Database Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseToken()
	 * @generated
	 * @ordered
	 */
	protected static final URI OCCI_DATABASE_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciDatabaseToken() <em>Occi Database Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciDatabaseToken()
	 * @generated
	 * @ordered
	 */
	protected URI occiDatabaseToken = OCCI_DATABASE_TOKEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaselinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.DATABASELINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getOcciDatabaseUri() {
		return occiDatabaseUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciDatabaseUri(URI newOcciDatabaseUri) {
		URI oldOcciDatabaseUri = occiDatabaseUri;
		occiDatabaseUri = newOcciDatabaseUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DATABASELINK__OCCI_DATABASE_URI, oldOcciDatabaseUri, occiDatabaseUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getOcciDatabaseUsername() {
		return occiDatabaseUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciDatabaseUsername(URI newOcciDatabaseUsername) {
		URI oldOcciDatabaseUsername = occiDatabaseUsername;
		occiDatabaseUsername = newOcciDatabaseUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DATABASELINK__OCCI_DATABASE_USERNAME, oldOcciDatabaseUsername, occiDatabaseUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getOcciDatabaseToken() {
		return occiDatabaseToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciDatabaseToken(URI newOcciDatabaseToken) {
		URI oldOcciDatabaseToken = occiDatabaseToken;
		occiDatabaseToken = newOcciDatabaseToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.DATABASELINK__OCCI_DATABASE_TOKEN, oldOcciDatabaseToken, occiDatabaseToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let severity : Integer[1] = 'Databaselink::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Componentlink)
		 *       in
		 *         'Databaselink::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, PlatformTables.STR_Databaselink_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, PlatformTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_platform_c_c_Componentlink = idResolver.getClass(PlatformTables.CLSSid_Componentlink, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_platform_c_c_Componentlink).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, PlatformTables.STR_Databaselink_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, PlatformTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_URI:
				return getOcciDatabaseUri();
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_USERNAME:
				return getOcciDatabaseUsername();
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_TOKEN:
				return getOcciDatabaseToken();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_URI:
				setOcciDatabaseUri((URI)newValue);
				return;
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_USERNAME:
				setOcciDatabaseUsername((URI)newValue);
				return;
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_TOKEN:
				setOcciDatabaseToken((URI)newValue);
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
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_URI:
				setOcciDatabaseUri(OCCI_DATABASE_URI_EDEFAULT);
				return;
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_USERNAME:
				setOcciDatabaseUsername(OCCI_DATABASE_USERNAME_EDEFAULT);
				return;
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_TOKEN:
				setOcciDatabaseToken(OCCI_DATABASE_TOKEN_EDEFAULT);
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
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_URI:
				return OCCI_DATABASE_URI_EDEFAULT == null ? occiDatabaseUri != null : !OCCI_DATABASE_URI_EDEFAULT.equals(occiDatabaseUri);
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_USERNAME:
				return OCCI_DATABASE_USERNAME_EDEFAULT == null ? occiDatabaseUsername != null : !OCCI_DATABASE_USERNAME_EDEFAULT.equals(occiDatabaseUsername);
			case PlatformPackage.DATABASELINK__OCCI_DATABASE_TOKEN:
				return OCCI_DATABASE_TOKEN_EDEFAULT == null ? occiDatabaseToken != null : !OCCI_DATABASE_TOKEN_EDEFAULT.equals(occiDatabaseToken);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PlatformPackage.DATABASELINK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (occiDatabaseUri: ");
		result.append(occiDatabaseUri);
		result.append(", occiDatabaseUsername: ");
		result.append(occiDatabaseUsername);
		result.append(", occiDatabaseToken: ");
		result.append(occiDatabaseToken);
		result.append(')');
		return result.toString();
	}

} //DatabaselinkImpl
