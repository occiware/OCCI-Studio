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
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Entity#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IdUnique'"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Id()
	 * @model dataType="org.eclipse.cmf.occi.core.URI" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Entity!id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Entity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Title()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Entity!title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Entity#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' reference.
	 * @see #setKind(Kind)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Kind()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Entity!kind'"
	 * @generated
	 */
	Kind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Entity#getKind <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind value);

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
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Location()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Entity!location'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Entity#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.AttributeState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Attributes()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Entity!attributes'"
	 * @generated
	 */
	EList<AttributeState> getAttributes();

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Mixins()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * parts.mixin->asSet()\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.MixinBase%>> parts = this.getParts();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_parts = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.core.OCCITables%>.ORD_CLSSid_MixinBase, parts);\n/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.eclipse.cmf.occi.core.OCCITables%>.SEQ_CLSSid_Mixin);\n/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_parts.iterator();\n/*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\nwhile (true) {\n\tif (!ITERATOR__1.hasNext()) {\n\t\tcollect = accumulator;\n\t\tbreak;\n\t}\n\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.MixinBase%> _1 = (<%org.eclipse.cmf.occi.core.MixinBase%>)ITERATOR__1.next();\n\t/**\n\t * mixin\n\t \052/\n\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Mixin%> mixin = _1.getMixin();\n\t//\n\taccumulator.add(mixin);\n}\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.SetValue%> asSet = <%org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation%>.INSTANCE.evaluate(collect);\nfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Mixin%>> ECORE_asSet = ((<%org.eclipse.ocl.pivot.ids.IdResolver%>.IdResolverExtension)idResolver).ecoreValueOfAll(<%org.eclipse.cmf.occi.core.Mixin%>.class, asSet);\nreturn (<%org.eclipse.emf.common.util.EList%><<%org.eclipse.cmf.occi.core.Mixin%>>)ECORE_asSet;'"
	 * @generated
	 */
	EList<Mixin> getMixins();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.MixinBase}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.cmf.occi.core.MixinBase#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEntity_Parts()
	 * @see org.eclipse.cmf.occi.core.MixinBase#getEntity
	 * @model opposite="entity" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Entity!parts'"
	 * @generated
	 */
	EList<MixinBase> getParts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Entity!occiCreate()'"
	 * @generated
	 */
	void occiCreate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Entity!occiRetrieve()'"
	 * @generated
	 */
	void occiRetrieve();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Entity!occiUpdate()'"
	 * @generated
	 */
	void occiUpdate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore!Entity!occiDelete()'"
	 * @generated
	 */
	void occiDelete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv AttributesNameUnique:\n *   let severity : Integer[1] = \'Entity::AttributesNameUnique\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let result : Boolean[1] = attributes->isUnique(name)\n *       in\n *         \'Entity::AttributesNameUnique\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_Entity_c_c_AttributesNameUnique);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.AttributeState%>> attributes = this.getAttributes();\n\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_attributes = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.core.OCCITables%>.ORD_CLSSid_AttributeState, attributes);\n\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSetAccumulatorValue(<%org.eclipse.cmf.occi.core.OCCITables%>.ORD_CLSSid_AttributeState);\n\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_attributes.iterator();\n\t/*@NonInvalid\052/ boolean result;\n\twhile (true) {\n\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\tbreak;\n\t\t}\n\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.AttributeState%> _1 = (<%org.eclipse.cmf.occi.core.AttributeState%>)ITERATOR__1.next();\n\t\t/**\n\t\t * name\n\t\t \052/\n\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> name = _1.getName();\n\t\t//\n\t\tif (accumulator.includes(name) == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n\t\t\tbreak;\n\t\t}\n\t\telse {\n\t\t\taccumulator.add(name);\n\t\t}\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_Entity_c_c_AttributesNameUnique, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean AttributesNameUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv KindCompatibleWithOneAppliesOfEachMixin:\n *   let\n *     severity : Integer[1] = \'Entity::KindCompatibleWithOneAppliesOfEachMixin\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[?] = parts.mixin->forAll(m |\n *           m.applies->notEmpty() implies\n *           m.applies->exists(k | kind->closure(parent)->includes(k)))\n *       in\n *         \'Entity::KindCompatibleWithOneAppliesOfEachMixin\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n\tsymbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.MixinBase%>> parts = this.getParts();\n\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_parts = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.core.OCCITables%>.ORD_CLSSid_MixinBase, parts);\n\t\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.eclipse.cmf.occi.core.OCCITables%>.SEQ_CLSSid_Mixin);\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_parts.iterator();\n\t\t/*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\tcollect = accumulator;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.MixinBase%> _1 = (<%org.eclipse.cmf.occi.core.MixinBase%>)ITERATOR__1.next();\n\t\t\t/**\n\t\t\t * mixin\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Mixin%> mixin = _1.getMixin();\n\t\t\t//\n\t\t\taccumulator.add(mixin);\n\t\t}\n\t\t/*@Thrown\052/ <%java.lang.Object%> accumulator_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR_m = collect.iterator();\n\t\t/*@Thrown\052/ <%java.lang.Boolean%> result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR_m.hasNext()) {\n\t\t\t\tif (accumulator_0 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator_0;\n\t\t\t\t}\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Mixin%> m = (<%org.eclipse.cmf.occi.core.Mixin%>)ITERATOR_m.next();\n\t\t\t/**\n\t\t\t *\n\t\t\t * m.applies->notEmpty() implies\n\t\t\t * m.applies->exists(k | kind->closure(parent)->includes(k))\n\t\t\t \052/\n\t\t\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_implies;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Kind%>> applies_0 = m.getApplies();\n\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_applies_0 = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.core.OCCITables%>.ORD_CLSSid_Kind, applies_0);\n\t\t\t\tfinal /*@NonInvalid\052/ boolean notEmpty = <%org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation%>.INSTANCE.evaluate(BOXED_applies_0).booleanValue();\n\t\t\t\t/*@Thrown\052/ boolean implies;\n\t\t\t\tif (notEmpty) {\n\t\t\t\t\t/*@Thrown\052/ <%java.lang.Object%> accumulator_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR_k = BOXED_applies_0.iterator();\n\t\t\t\t\t/*@Thrown\052/ boolean exists;\n\t\t\t\t\twhile (true) {\n\t\t\t\t\t\tif (!ITERATOR_k.hasNext()) {\n\t\t\t\t\t\t\tif (accumulator_1 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\t\t\t\texists = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator_1;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tbreak;\n\t\t\t\t\t\t}\n\t\t\t\t\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> k = (<%org.eclipse.cmf.occi.core.Kind%>)ITERATOR_k.next();\n\t\t\t\t\t\t/**\n\t\t\t\t\t\t * kind->closure(parent)->includes(k)\n\t\t\t\t\t\t \052/\n\t\t\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.StandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\n\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_includes;\n\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> kind_0 = this.getKind();\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.SetValue%> oclAsSet = <%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.SET_CLSSid_Kind, kind_0);\n\t\t\t\t\t\t\tfinal <%org.eclipse.ocl.pivot.Class%> TYPE_closure_0 = executor.getStaticTypeOf(oclAsSet);\n\t\t\t\t\t\t\tfinal <%org.eclipse.ocl.pivot.library.LibraryIteration%>.LibraryIterationExtension IMPL_closure_0 = (<%org.eclipse.ocl.pivot.library.LibraryIteration%>.LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables%>.Operations._Set__closure);\n\t\t\t\t\t\t\tfinal /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.SET_CLSSid_Kind, <%org.eclipse.cmf.occi.core.OCCITables%>.CLSSid_Kind);\n\t\t\t\t\t\t\t/**\n\t\t\t\t\t\t\t * Implementation of the iterator body.\n\t\t\t\t\t\t\t \052/\n\t\t\t\t\t\t\tfinal /*@NonNull\052/ <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%>()\n\t\t\t\t\t\t\t{\n\t\t\t\t\t\t\t\t/**\n\t\t\t\t\t\t\t\t * parent\n\t\t\t\t\t\t\t\t \052/\n\t\t\t\t\t\t\t\t@Override\n\t\t\t\t\t\t\t\tpublic /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor, final /*@NonNull\052/ <%org.eclipse.ocl.pivot.ids.TypeId%> typeId, final /*@Nullable\052/ Object oclAsSet, final /*@NonInvalid\052/ <%java.lang.Object%> _1_0) {\n\t\t\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> symbol_0 = (<%org.eclipse.cmf.occi.core.Kind%>)_1_0;\n\t\t\t\t\t\t\t\t\tif (symbol_0 == null) {\n\t\t\t\t\t\t\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Kind::parent\\\'\");\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> parent = symbol_0.getParent();\n\t\t\t\t\t\t\t\t\treturn parent;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t};\n\t\t\t\t\t\t\tfinal /*@NonNull\052/  <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%>(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);\n\t\t\t\t\t\t\tfinal /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%> closure = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.ocl.pivot.values.SetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0));\n\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean includes = <%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(closure, k).booleanValue();\n\t\t\t\t\t\t\tCAUGHT_includes = includes;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\t\t\tCAUGHT_includes = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t\t\t}\n\t\t\t\t\t\t//\n\t\t\t\t\t\tif (CAUGHT_includes == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t\t// Normal successful body evaluation result\n\t\t\t\t\t\t\texists = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse if (CAUGHT_includes == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse if (CAUGHT_includes instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n\t\t\t\t\t\t\taccumulator_1 = CAUGHT_includes;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\t\t\t\taccumulator_1 = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"exists\");\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t\timplies = exists;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\timplies = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\tCAUGHT_implies = implies;\n\t\t\t}\n\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\tCAUGHT_implies = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t}\n\t\t\t//\n\t\t\tif (CAUGHT_implies == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t}\n\t\t\telse if (CAUGHT_implies == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t}\n\t\t\telse if (CAUGHT_implies instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n\t\t\t\taccumulator_0 = CAUGHT_implies;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t}\n\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\taccumulator_0 = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"forAll\");\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (<%java.lang.Exception%> e) {\n\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n\tsymbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean KindCompatibleWithOneAppliesOfEachMixin(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv IdUnique:\n *   let severity : Integer[1] = \'Entity::IdUnique\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let result : Boolean[1] = Entity.allInstances()->isUnique(id)\n *       in\n *         \'Entity::IdUnique\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_Entity_c_c_IdUnique);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_Entity_0 = idResolver.getClass(<%org.eclipse.cmf.occi.core.OCCITables%>.CLSSid_Entity, null);\n\tfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.SetValue%> allInstances = <%org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.core.OCCITables%>.SET_CLSSid_Entity, TYP_occi_c_c_Entity_0);\n\t/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSetAccumulatorValue(<%org.eclipse.cmf.occi.core.OCCITables%>.SET_CLSSid_Entity);\n\t/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = allInstances.iterator();\n\t/*@NonInvalid\052/ boolean result;\n\twhile (true) {\n\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\tbreak;\n\t\t}\n\t\t/*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Entity%> _1 = (<%org.eclipse.cmf.occi.core.Entity%>)ITERATOR__1.next();\n\t\t/**\n\t\t * id\n\t\t \052/\n\t\tfinal /*@NonInvalid\052/ <%java.lang.String%> id = _1.getId();\n\t\t//\n\t\tif (accumulator.includes(id) == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n\t\t\tbreak;\n\t\t}\n\t\telse {\n\t\t\taccumulator.add(id);\n\t\t}\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.core.OCCITables%>.STR_Entity_c_c_IdUnique, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, <%org.eclipse.cmf.occi.core.OCCITables%>.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean IdUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entity
