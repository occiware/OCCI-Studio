/**
 */
package org.eclipse.cmf.occi.core.occi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.cmf.occi.core.occi.OcciPackage#getAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CorrectScheme'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot CorrectScheme='let category = oclContainer().oclAsType(Category)\n\t\t\tin scheme = category.scheme.substring(1, category.scheme.size() - 1) + \'/\' + category.term + \'/action#\''"
 * @generated
 */
public interface Action extends Category {
} // Action
