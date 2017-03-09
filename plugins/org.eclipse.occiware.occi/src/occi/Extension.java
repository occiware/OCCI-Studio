/**
 */
package occi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link occi.Extension#getName <em>Name</em>}</li>
 *   <li>{@link occi.Extension#getScheme <em>Scheme</em>}</li>
 *   <li>{@link occi.Extension#getDescription <em>Description</em>}</li>
 *   <li>{@link occi.Extension#getImport <em>Import</em>}</li>
 *   <li>{@link occi.Extension#getKinds <em>Kinds</em>}</li>
 *   <li>{@link occi.Extension#getMixins <em>Mixins</em>}</li>
 *   <li>{@link occi.Extension#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see occi.OcciPackage#getExtension()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SchemeUnique KindsSchemeValid MixinsSchemeValid TermUnicity KindParentLocalOrImported MixinDependsLocalOrImported MixinAppliesLocalOrImported'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SchemeUnique='Extension.allInstances()->isUnique(scheme)' KindsSchemeValid='kinds->forAll(k | k.scheme = self.scheme)' MixinsSchemeValid='mixins->forAll(m | m.scheme.substring(1,scheme.size()-1) = scheme.substring(1,scheme.size()-1))' TermUnicity='kinds.term->intersection(mixins.term)->isEmpty()' KindParentLocalOrImported='kinds->forAll(parent <> null implies let parentExtension = parent.oclContainer() in parentExtension = self or import->includes(parentExtension))' MixinDependsLocalOrImported='mixins.depends->forAll(let extension = oclContainer() in extension = self or import->includes(extension))' MixinAppliesLocalOrImported='mixins.applies->forAll(let extension = oclContainer() in extension = self or import->includes(extension))'"
 * @generated
 */
public interface Extension extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see occi.OcciPackage#getExtension_Name()
	 * @model dataType="occi.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link occi.Extension#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see occi.OcciPackage#getExtension_Scheme()
	 * @model dataType="occi.String" required="true"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link occi.Extension#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

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
	 * @see occi.OcciPackage#getExtension_Description()
	 * @model dataType="occi.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link occi.Extension#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference list.
	 * The list contents are of type {@link occi.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference list.
	 * @see occi.OcciPackage#getExtension_Import()
	 * @model
	 * @generated
	 */
	EList<Extension> getImport();

	/**
	 * Returns the value of the '<em><b>Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link occi.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kinds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinds</em>' containment reference list.
	 * @see occi.OcciPackage#getExtension_Kinds()
	 * @model containment="true" keys="term"
	 * @generated
	 */
	EList<Kind> getKinds();

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
	 * @see occi.OcciPackage#getExtension_Mixins()
	 * @model containment="true" keys="term"
	 * @generated
	 */
	EList<Mixin> getMixins();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see occi.OcciPackage#getExtension_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDataType> getTypes();

} // Extension
