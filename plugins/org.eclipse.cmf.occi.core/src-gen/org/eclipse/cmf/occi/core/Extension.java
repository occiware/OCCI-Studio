/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.core;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getKinds <em>Kinds</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getTypes <em>Types</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Extension#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MixinDependsLocalOrImported'"
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
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.Name" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Extension!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Extension#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Scheme()
	 * @model dataType="org.eclipse.cmf.occi.core.Scheme" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Extension!scheme'"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Extension#getScheme <em>Scheme</em>}' attribute.
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
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Description()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Extension!description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Extension#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Import()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Extension!import'"
	 * @generated
	 */
	EList<Extension> getImport();

	/**
	 * Returns the value of the '<em><b>Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kinds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinds</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Kinds()
	 * @model containment="true" keys="term"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Extension!kinds'"
	 * @generated
	 */
	EList<Kind> getKinds();

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Mixins()
	 * @model containment="true" keys="term"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Extension!mixins'"
	 * @generated
	 */
	EList<Mixin> getMixins();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Types()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Extension!types'"
	 * @generated
	 */
	EList<DataType> getTypes();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getExtension_Specification()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Extension!specification'"
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Extension#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv KindsSchemeValid:\n *   let severity : Integer[1] = \'Extension::KindsSchemeValid\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let result : Boolean[?] = kinds->forAll(k | k.scheme = self.scheme)\n *       in\n *         \'Extension::KindsSchemeValid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_KindsSchemeValid);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Kind%>> kinds = this.getKinds();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_kinds = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Kind, kinds);\n\t\t/*@Thrown\052/ <%java.lang.Object%> accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR_k = BOXED_kinds.iterator();\n\t\t/*@Thrown\052/ <%java.lang.Boolean%> result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR_k.hasNext()) {\n\t\t\t\tif (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator;\n\t\t\t\t}\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> k = (<%org.eclipse.cmf.occi.core.Kind%>)ITERATOR_k.next();\n\t\t\t/**\n\t\t\t * k.scheme = self.scheme\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> scheme = k.getScheme();\n\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> scheme_0 = this.getScheme();\n\t\t\tfinal /*@NonInvalid\052/ boolean eq = scheme.equals(scheme_0);\n\t\t\t//\n\t\t\tif (eq == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t}\n\t\t\telse if (eq == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t}\n\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\taccumulator = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"forAll\");\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_KindsSchemeValid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean KindsSchemeValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv KindParentLocalOrImported:\n *   let\n *     severity : Integer[1] = \'Extension::KindParentLocalOrImported\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[?] = kinds->forAll(parent <> null implies\n *           let parentExtension : OclElement[?] = parent.oclContainer()\n *           in parentExtension = self or\n *             import->includes(parentExtension))\n *       in\n *         \'Extension::KindParentLocalOrImported\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_KindParentLocalOrImported);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n\tsymbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Kind%>> kinds = this.getKinds();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_kinds = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Kind, kinds);\n\t\t/*@Thrown\052/ <%java.lang.Object%> accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_kinds.iterator();\n\t\t/*@Thrown\052/ <%java.lang.Boolean%> result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\tif (accumulator == null) {\n\t\t\t\t\tresult = null;\n\t\t\t\t}\n\t\t\t\telse if (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator;\n\t\t\t\t}\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> _1 = (<%org.eclipse.cmf.occi.core.Kind%>)ITERATOR__1.next();\n\t\t\t/**\n\t\t\t * parent <> null implies\n\t\t\t * let parentExtension : OclElement[?] = parent.oclContainer()\n\t\t\t * in parentExtension = self or import->includes(parentExtension)\n\t\t\t \052/\n\t\t\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_implies;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> parent = _1.getParent();\n\t\t\t\tfinal /*@NonInvalid\052/ boolean ne = parent != null;\n\t\t\t\t/*@Thrown\052/ <%java.lang.Boolean%> implies;\n\t\t\t\tif (ne) {\n\t\t\t\t\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_parentExtension;\n\t\t\t\t\ttry {\n\t\t\t\t\t\tfinal /*@Thrown\052/ <%java.lang.Object%> parentExtension = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, parent);\n\t\t\t\t\t\tCAUGHT_parentExtension = parentExtension;\n\t\t\t\t\t}\n\t\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\t\tCAUGHT_parentExtension = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t\t}\n\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_eq;\n\t\t\t\t\ttry {\n\t\t\t\t\t\tif (CAUGHT_parentExtension instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_parentExtension;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tfinal /*@Thrown\052/ boolean eq = this.equals(CAUGHT_parentExtension);\n\t\t\t\t\t\tCAUGHT_eq = eq;\n\t\t\t\t\t}\n\t\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\t\tCAUGHT_eq = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t\t}\n\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_includes;\n\t\t\t\t\ttry {\n\t\t\t\t\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Extension%>> symbol_0 = this.getImport();\n\t\t\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_symbol_0 = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Extension, symbol_0);\n\t\t\t\t\t\tif (CAUGHT_parentExtension instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_parentExtension;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tfinal /*@Thrown\052/ boolean includes = <%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(BOXED_symbol_0, CAUGHT_parentExtension).booleanValue();\n\t\t\t\t\t\tCAUGHT_includes = includes;\n\t\t\t\t\t}\n\t\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\t\tCAUGHT_includes = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown\052/ <%java.lang.Boolean%> or = <%org.eclipse.ocl.pivot.library.logical.BooleanOrOperation%>.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_includes);\n\t\t\t\t\timplies = or;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\timplies = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\tCAUGHT_implies = implies;\n\t\t\t}\n\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\tCAUGHT_implies = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t}\n\t\t\t//\n\t\t\tif (CAUGHT_implies == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t}\n\t\t\telse if (CAUGHT_implies == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t}\n\t\t\telse if (CAUGHT_implies == null) {\t\t\t\t\t\t\t\t// Abnormal null body evaluation result\n\t\t\t\tif (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\taccumulator = null;\t\t\t\t\t\t\t\t\t\t// Cache a null failure\n\t\t\t\t}\n\t\t\t}\n\t\t\telse if (CAUGHT_implies instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n\t\t\t\taccumulator = CAUGHT_implies;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t}\n\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\taccumulator = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"forAll\");\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_KindParentLocalOrImported, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean KindParentLocalOrImported(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv MixinsSchemeValid:\n *   let severity : Integer[1] = \'Extension::MixinsSchemeValid\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[?] = mixins->forAll(m |\n *           m.scheme.substring(1, scheme.size() - 1) =\n *           scheme.substring(1, scheme.size() - 1))\n *       in\n *         \'Extension::MixinsSchemeValid\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_MixinsSchemeValid);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Mixin%>> mixins = this.getMixins();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_mixins = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Mixin, mixins);\n\t\t/*@Thrown\052/ <%java.lang.Object%> accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR_m = BOXED_mixins.iterator();\n\t\t/*@Thrown\052/ <%java.lang.Boolean%> result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR_m.hasNext()) {\n\t\t\t\tif (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator;\n\t\t\t\t}\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Mixin%> m = (<%org.eclipse.cmf.occi.core.Mixin%>)ITERATOR_m.next();\n\t\t\t/**\n\t\t\t *\n\t\t\t * m.scheme.substring(1, scheme.size() - 1) =\n\t\t\t * scheme.substring(1, scheme.size() - 1)\n\t\t\t \052/\n\t\t\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_eq;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> scheme_1 = this.getScheme();\n\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> size_0 = <%org.eclipse.ocl.pivot.library.string.StringSizeOperation%>.INSTANCE.evaluate(scheme_1);\n\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> diff_0 = (<%org.eclipse.ocl.pivot.values.IntegerValue%>)<%org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation%>.INSTANCE.evaluate(size_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_1);\n\t\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> scheme = m.getScheme();\n\t\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> substring = <%org.eclipse.ocl.pivot.library.string.StringSubstringOperation%>.INSTANCE.evaluate(scheme, <%org.eclipse.cmf.occi.OCCITables%>.INT_1, diff_0);\n\t\t\t\tfinal /*@Thrown\052/ <%java.lang.String%> substring_0 = <%org.eclipse.ocl.pivot.library.string.StringSubstringOperation%>.INSTANCE.evaluate(scheme_1, <%org.eclipse.cmf.occi.OCCITables%>.INT_1, diff_0);\n\t\t\t\tfinal /*@Thrown\052/ boolean eq = substring.equals(substring_0);\n\t\t\t\tCAUGHT_eq = eq;\n\t\t\t}\n\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\tCAUGHT_eq = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t}\n\t\t\t//\n\t\t\tif (CAUGHT_eq == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t}\n\t\t\telse if (CAUGHT_eq == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t}\n\t\t\telse if (CAUGHT_eq instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n\t\t\t\taccumulator = CAUGHT_eq;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t}\n\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\taccumulator = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"forAll\");\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_MixinsSchemeValid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean MixinsSchemeValid(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv TermUnicity:\n *   let severity : Integer[1] = \'Extension::TermUnicity\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = kinds.term->intersection(mixins.term)\n *         ->isEmpty()\n *       in\n *         \'Extension::TermUnicity\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_TermUnicity);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Kind%>> kinds = this.getKinds();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_kinds = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Kind, kinds);\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.eclipse.cmf.occi.OCCITables%>.SEQ_PRIMid_String);\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_kinds.iterator();\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\tcollect = accumulator;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> _1 = (<%org.eclipse.cmf.occi.core.Kind%>)ITERATOR__1.next();\n\t\t\t/**\n\t\t\t * term\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> term = _1.getTerm();\n\t\t\t//\n\t\t\taccumulator.add(term);\n\t\t}\n\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Mixin%>> mixins = this.getMixins();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_mixins = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Mixin, mixins);\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.eclipse.cmf.occi.OCCITables%>.SEQ_PRIMid_String);\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1_0 = BOXED_mixins.iterator();\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect_0;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1_0.hasNext()) {\n\t\t\t\tcollect_0 = accumulator_0;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Mixin%> _1_0 = (<%org.eclipse.cmf.occi.core.Mixin%>)ITERATOR__1_0.next();\n\t\t\t/**\n\t\t\t * term\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> term_0 = _1_0.getTerm();\n\t\t\t//\n\t\t\taccumulator_0.add(term_0);\n\t\t}\n\t\tfinal /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.BagValue%> intersection = (<%org.eclipse.ocl.pivot.values.BagValue%>)<%org.eclipse.ocl.pivot.library.collection.CollectionIntersectionOperation%>.INSTANCE.evaluate(collect, collect_0);\n\t\tfinal /*@Thrown\052/ boolean result = <%org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation%>.INSTANCE.evaluate(intersection).booleanValue();\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_TermUnicity, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean TermUnicity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv MixinAppliesLocalOrImported:\n *   let\n *     severity : Integer[1] = \'Extension::MixinAppliesLocalOrImported\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[?] = mixins.applies->forAll(\n *           let extension : OclElement[?] = oclContainer()\n *           in extension = self or import->includes(extension))\n *       in\n *         \'Extension::MixinAppliesLocalOrImported\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_MixinAppliesLocalOrImported);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n\tsymbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Mixin%>> mixins = this.getMixins();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_mixins = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Mixin, mixins);\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.eclipse.cmf.occi.OCCITables%>.SEQ_CLSSid_Kind);\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_mixins.iterator();\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\tcollect = accumulator;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Mixin%> _1 = (<%org.eclipse.cmf.occi.core.Mixin%>)ITERATOR__1.next();\n\t\t\t/**\n\t\t\t * applies\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Kind%>> applies = _1.getApplies();\n\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_applies = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Kind, applies);\n\t\t\t//\n\t\t\tfor (Object value : BOXED_applies.flatten().getElements()) {\n\t\t\t\taccumulator.add(value);\n\t\t\t}\n\t\t}\n\t\t/*@Thrown\052/ <%java.lang.Object%> accumulator_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1_0 = collect.iterator();\n\t\t/*@Thrown\052/ <%java.lang.Boolean%> result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1_0.hasNext()) {\n\t\t\t\tif (accumulator_0 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator_0;\n\t\t\t\t}\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> _1_0 = (<%org.eclipse.cmf.occi.core.Kind%>)ITERATOR__1_0.next();\n\t\t\t/**\n\t\t\t *\n\t\t\t * let extension : OclElement[?] = oclContainer()\n\t\t\t * in extension = self or import->includes(extension)\n\t\t\t \052/\n\t\t\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_or;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid\052/ <%java.lang.Object%> extension = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, _1_0);\n\t\t\t\tfinal /*@NonInvalid\052/ boolean eq = this.equals(extension);\n\t\t\t\t/*@Thrown\052/ boolean or;\n\t\t\t\tif (eq) {\n\t\t\t\t\tor = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Extension%>> symbol_0 = this.getImport();\n\t\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_symbol_0 = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Extension, symbol_0);\n\t\t\t\t\tfinal /*@Thrown\052/ boolean includes = <%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(BOXED_symbol_0, extension).booleanValue();\n\t\t\t\t\tor = includes;\n\t\t\t\t}\n\t\t\t\tCAUGHT_or = or;\n\t\t\t}\n\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\tCAUGHT_or = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t}\n\t\t\t//\n\t\t\tif (CAUGHT_or == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t}\n\t\t\telse if (CAUGHT_or == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t}\n\t\t\telse if (CAUGHT_or instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n\t\t\t\taccumulator_0 = CAUGHT_or;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t}\n\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\taccumulator_0 = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"forAll\");\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_MixinAppliesLocalOrImported, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean MixinAppliesLocalOrImported(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SchemeUnique:\n *   let severity : Integer[1] = \'Extension::SchemeUnique\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = Extension.allInstances()\n *         ->isUnique(scheme)\n *       in\n *         \'Extension::SchemeUnique\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_SchemeUnique);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_Extension_0 = idResolver.getClass(<%org.eclipse.cmf.occi.OCCITables%>.CLSSid_Extension, null);\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.SetValue%> allInstances = <%org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.SET_CLSSid_Extension, TYP_occi_c_c_Extension_0);\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSetAccumulatorValue(<%org.eclipse.cmf.occi.OCCITables%>.SET_CLSSid_Extension);\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = allInstances.iterator();\n\t\t/*@Thrown\052/ boolean result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Extension%> _1 = (<%org.eclipse.cmf.occi.core.Extension%>)ITERATOR__1.next();\n\t\t\t/**\n\t\t\t * scheme\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> scheme = _1.getScheme();\n\t\t\t//\n\t\t\tif (accumulator.includes(scheme) == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\telse {\n\t\t\t\taccumulator.add(scheme);\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_SchemeUnique, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean SchemeUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv MixinDependsLocalOrImported:\n *   let\n *     severity : Integer[1] = \'Extension::MixinDependsLocalOrImported\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[?] = mixins.depends->forAll(\n *           let extension : OclElement[?] = oclContainer()\n *           in extension = self or import->includes(extension))\n *       in\n *         \'Extension::MixinDependsLocalOrImported\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_MixinDependsLocalOrImported);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n\tsymbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Mixin%>> mixins = this.getMixins();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_mixins = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Mixin, mixins);\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.eclipse.cmf.occi.OCCITables%>.SEQ_CLSSid_Mixin);\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_mixins.iterator();\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\tcollect = accumulator;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Mixin%> _1 = (<%org.eclipse.cmf.occi.core.Mixin%>)ITERATOR__1.next();\n\t\t\t/**\n\t\t\t * depends\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Mixin%>> depends = _1.getDepends();\n\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_depends = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Mixin, depends);\n\t\t\t//\n\t\t\tfor (Object value : BOXED_depends.flatten().getElements()) {\n\t\t\t\taccumulator.add(value);\n\t\t\t}\n\t\t}\n\t\t/*@Thrown\052/ <%java.lang.Object%> accumulator_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1_0 = collect.iterator();\n\t\t/*@Thrown\052/ <%java.lang.Boolean%> result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1_0.hasNext()) {\n\t\t\t\tif (accumulator_0 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator_0;\n\t\t\t\t}\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Mixin%> _1_0 = (<%org.eclipse.cmf.occi.core.Mixin%>)ITERATOR__1_0.next();\n\t\t\t/**\n\t\t\t *\n\t\t\t * let extension : OclElement[?] = oclContainer()\n\t\t\t * in extension = self or import->includes(extension)\n\t\t\t \052/\n\t\t\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_or;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid\052/ <%java.lang.Object%> extension = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, _1_0);\n\t\t\t\tfinal /*@NonInvalid\052/ boolean eq = this.equals(extension);\n\t\t\t\t/*@Thrown\052/ boolean or;\n\t\t\t\tif (eq) {\n\t\t\t\t\tor = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Extension%>> symbol_0 = this.getImport();\n\t\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_symbol_0 = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Extension, symbol_0);\n\t\t\t\t\tfinal /*@Thrown\052/ boolean includes = <%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(BOXED_symbol_0, extension).booleanValue();\n\t\t\t\t\tor = includes;\n\t\t\t\t}\n\t\t\t\tCAUGHT_or = or;\n\t\t\t}\n\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\tCAUGHT_or = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t}\n\t\t\t//\n\t\t\tif (CAUGHT_or == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t}\n\t\t\telse if (CAUGHT_or == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t}\n\t\t\telse if (CAUGHT_or instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n\t\t\t\taccumulator_0 = CAUGHT_or;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t}\n\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\taccumulator_0 = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"forAll\");\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Extension_c_c_MixinDependsLocalOrImported, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n\tsymbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean MixinDependsLocalOrImported(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Extension
