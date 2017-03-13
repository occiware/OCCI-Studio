/**
 */
package org.eclipse.cmf.occi.core.occi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.occi.RecordType#getRecordFiledDeclarations <em>Record Filed Declarations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getRecordType()
 * @model
 * @generated
 */
public interface RecordType extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Record Filed Declarations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.occi.RecordFieldDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Filed Declarations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Filed Declarations</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getRecordType_RecordFiledDeclarations()
	 * @model required="true"
	 * @generated
	 */
	EList<RecordFieldDeclaration> getRecordFiledDeclarations();

} // RecordType
