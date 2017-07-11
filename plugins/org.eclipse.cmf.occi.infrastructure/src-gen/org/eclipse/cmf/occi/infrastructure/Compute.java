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
package org.eclipse.cmf.occi.infrastructure;

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Compute Resource
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeArchitecture <em>Occi Compute Architecture</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeCores <em>Occi Compute Cores</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeHostname <em>Occi Compute Hostname</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeShare <em>Occi Compute Share</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeSpeed <em>Occi Compute Speed</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeMemory <em>Occi Compute Memory</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeState <em>Occi Compute State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeStateMessage <em>Occi Compute State Message</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getCompute()
 * @model
 * @generated
 */
public interface Compute extends Resource {
	/**
	 * Returns the value of the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.infrastructure.Architecture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CPU Architecture of the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Architecture</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.Architecture
	 * @see #setOcciComputeArchitecture(Architecture)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getCompute_OcciComputeArchitecture()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!occiComputeArchitecture'"
	 * @generated
	 */
	Architecture getOcciComputeArchitecture();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeArchitecture <em>Occi Compute Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Architecture</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.Architecture
	 * @see #getOcciComputeArchitecture()
	 * @generated
	 */
	void setOcciComputeArchitecture(Architecture value);

	/**
	 * Returns the value of the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of CPU cores assigned to the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Cores</em>' attribute.
	 * @see #setOcciComputeCores(Integer)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getCompute_OcciComputeCores()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.Core"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!occiComputeCores'"
	 * @generated
	 */
	Integer getOcciComputeCores();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeCores <em>Occi Compute Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Cores</em>' attribute.
	 * @see #getOcciComputeCores()
	 * @generated
	 */
	void setOcciComputeCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fully Qualified DNS hostname for the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Hostname</em>' attribute.
	 * @see #setOcciComputeHostname(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getCompute_OcciComputeHostname()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!occiComputeHostname'"
	 * @generated
	 */
	String getOcciComputeHostname();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeHostname <em>Occi Compute Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Hostname</em>' attribute.
	 * @see #getOcciComputeHostname()
	 * @generated
	 */
	void setOcciComputeHostname(String value);

	/**
	 * Returns the value of the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative number of CPU shares for the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Share</em>' attribute.
	 * @see #setOcciComputeShare(Integer)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getCompute_OcciComputeShare()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.Share"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!occiComputeShare'"
	 * @generated
	 */
	Integer getOcciComputeShare();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeShare <em>Occi Compute Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Share</em>' attribute.
	 * @see #getOcciComputeShare()
	 * @generated
	 */
	void setOcciComputeShare(Integer value);

	/**
	 * Returns the value of the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CPU Clock frequency (speed) in gigahertz
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Speed</em>' attribute.
	 * @see #setOcciComputeSpeed(Float)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getCompute_OcciComputeSpeed()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.GHz"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!occiComputeSpeed'"
	 * @generated
	 */
	Float getOcciComputeSpeed();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeSpeed <em>Occi Compute Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Speed</em>' attribute.
	 * @see #getOcciComputeSpeed()
	 * @generated
	 */
	void setOcciComputeSpeed(Float value);

	/**
	 * Returns the value of the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum RAM in gigabytes allocated to the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Memory</em>' attribute.
	 * @see #setOcciComputeMemory(Float)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getCompute_OcciComputeMemory()
	 * @model dataType="org.eclipse.cmf.occi.infrastructure.GiB"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!occiComputeMemory'"
	 * @generated
	 */
	Float getOcciComputeMemory();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeMemory <em>Occi Compute Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Memory</em>' attribute.
	 * @see #getOcciComputeMemory()
	 * @generated
	 */
	void setOcciComputeMemory(Float value);

	/**
	 * Returns the value of the '<em><b>Occi Compute State</b></em>' attribute.
	 * The default value is <code>"inactive"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.infrastructure.ComputeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current state of the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute State</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.ComputeStatus
	 * @see #setOcciComputeState(ComputeStatus)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getCompute_OcciComputeState()
	 * @model default="inactive" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!occiComputeState'"
	 * @generated
	 */
	ComputeStatus getOcciComputeState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeState <em>Occi Compute State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute State</em>' attribute.
	 * @see org.eclipse.cmf.occi.infrastructure.ComputeStatus
	 * @see #getOcciComputeState()
	 * @generated
	 */
	void setOcciComputeState(ComputeStatus value);

	/**
	 * Returns the value of the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable explanation of the current instance state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute State Message</em>' attribute.
	 * @see #setOcciComputeStateMessage(String)
	 * @see org.eclipse.cmf.occi.infrastructure.InfrastructurePackage#getCompute_OcciComputeStateMessage()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!occiComputeStateMessage'"
	 * @generated
	 */
	String getOcciComputeStateMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.infrastructure.Compute#getOcciComputeStateMessage <em>Occi Compute State Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute State Message</em>' attribute.
	 * @see #getOcciComputeStateMessage()
	 * @generated
	 */
	void setOcciComputeStateMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start the system
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!start()'"
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop the system (graceful, acpioff or poweroff)
	 * @param method 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!stop(http://schemas.ogf.org/occi/infrastructure/ecore!StopMethod)'"
	 * @generated
	 */
	void stop(StopMethod method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restart the system (graceful, warm or cold)
	 * @param method 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!restart(http://schemas.ogf.org/occi/infrastructure/ecore!RestartMethod)'"
	 * @generated
	 */
	void restart(RestartMethod method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Suspend the system (hibernate or in RAM)
	 * @param method 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!suspend(http://schemas.ogf.org/occi/infrastructure/ecore!SuspendMethod)'"
	 * @generated
	 */
	void suspend(SuspendMethod method);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Save the system (hot, deferred)
	 * @param method 
	 * @param name 
	 * <!-- end-model-doc -->
	 * @model nameDataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/infrastructure/ecore!Compute!save(http://schemas.ogf.org/occi/infrastructure/ecore!SaveMethod,String)'"
	 * @generated
	 */
	void save(SaveMethod method, String name);

} // Compute
