/**
 */
package occi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link occi.Configuration#getDescription <em>Description</em>}</li>
 *   <li>{@link occi.Configuration#getLocation <em>Location</em>}</li>
 *   <li>{@link occi.Configuration#getUse <em>Use</em>}</li>
 *   <li>{@link occi.Configuration#getResources <em>Resources</em>}</li>
 *   <li>{@link occi.Configuration#getMixins <em>Mixins</em>}</li>
 * </ul>
 *
 * @see occi.OcciPackage#getConfiguration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllResourcesKindsInUse AllResourcesMixinsInUse AllResourcesLinksKindsInUse AllResourcesLinksMixinsInUse AllResourcesLinksTargetsInConfiguration AllMixinsAreTags'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AllResourcesKindsInUse='use->includesAll(resources.kind.oclContainer())' AllResourcesMixinsInUse='\n\t\t  /* Previously use->includesAll(resources.mixins.oclContainer()) \052/\n\t\t  resources.mixins->forAll(mo | let mixinOwner = mo.oclContainer()\n\t\t  \t                            in if mixinOwner.oclIsTypeOf(Extension) then\n\t\t  \t                                 self.use->includes(mixinOwner.oclAsType(Extension))\n\t\t  \t                                else\n\t\t  \t                                  self.mixins->includes(mo)\n\t\t  \t                                 endif\n\t\t  \t                      )' AllResourcesLinksKindsInUse='use->includesAll(resources.links.kind.oclContainer())' AllResourcesLinksMixinsInUse='\n\t\t  /* Previously use->includesAll(resources.links.mixins.oclContainer()) \052/\n\t\t  resources.links.mixins->forAll(mo | let mixinOwner = mo.oclContainer()\n\t\t  \t                                  in if mixinOwner.oclIsTypeOf(Extension) then\n\t\t  \t                                    self.use->includes(mixinOwner.oclAsType(Extension))\n\t\t  \t                                  else\n\t\t  \t                                    self.mixins->includes(mo)\n\t\t  \t                                  endif\n\t\t  \t                            )' AllResourcesLinksTargetsInConfiguration='resources.links.target->forAll(r | r.oclContainer() = self)' AllMixinsAreTags='mixins->forAll(attributes->isEmpty() and actions->isEmpty() and depends->isEmpty())'"
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see occi.OcciPackage#getConfiguration_Description()
	 * @model dataType="occi.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link occi.Configuration#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see occi.OcciPackage#getConfiguration_Location()
	 * @model dataType="occi.String"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link occi.Configuration#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link occi.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see occi.OcciPackage#getConfiguration_Use()
	 * @model
	 * @generated
	 */
	EList<Extension> getUse();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link occi.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see occi.OcciPackage#getConfiguration_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' containment reference list.
	 * The list contents are of type {@link occi.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' containment reference list.
	 * @see occi.OcciPackage#getConfiguration_Mixins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mixin> getMixins();

} // Configuration
