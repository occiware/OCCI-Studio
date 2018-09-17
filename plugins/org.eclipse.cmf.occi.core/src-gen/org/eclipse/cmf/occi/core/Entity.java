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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DifferentMixins'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * parts.mixin-&gt;asSet()\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.MixinBase%&gt;&gt; parts = this.getParts();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_parts = idResolver.createOrderedSetOfAll(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.ORD_CLSSid_MixinBase, parts);\n/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSequenceAccumulatorValue(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.SEQ_CLSSid_Mixin);\n/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = BOXED_parts.iterator();\n/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; collect;\nwhile (true) {\n\tif (!ITERATOR__1.hasNext()) {\n\t\tcollect = accumulator;\n\t\tbreak;\n\t}\n\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.MixinBase%&gt; _1 = (&lt;%org.eclipse.cmf.occi.core.MixinBase%&gt;)ITERATOR__1.next();\n\t/**\n\t * mixin\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Mixin%&gt; mixin = _1.getMixin();\n\t//\n\taccumulator.add(mixin);\n}\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; asSet = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation%&gt;.INSTANCE.evaluate(collect);\nfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.Mixin%&gt;&gt; ECORE_asSet = ((&lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt;.IdResolverExtension)idResolver).ecoreValueOfAll(&lt;%org.eclipse.cmf.occi.core.Mixin%&gt;.class, asSet);\nreturn (&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.Mixin%&gt;&gt;)ECORE_asSet;'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv AttributesNameUnique:\n *   let severity : Integer[1] = \'Entity::AttributesNameUnique\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let result : Boolean[1] = attributes-&gt;isUnique(name)\n *       in\n *         \'Entity::AttributesNameUnique\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Entity_c_c_AttributesNameUnique);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.AttributeState%&gt;&gt; attributes = this.getAttributes();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_attributes = idResolver.createOrderedSetOfAll(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.ORD_CLSSid_AttributeState, attributes);\n\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSetAccumulatorValue(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.ORD_CLSSid_AttributeState);\n\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = BOXED_attributes.iterator();\n\t/*@NonInvalid\052/ boolean result;\n\twhile (true) {\n\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\tbreak;\n\t\t}\n\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.AttributeState%&gt; _1 = (&lt;%org.eclipse.cmf.occi.core.AttributeState%&gt;)ITERATOR__1.next();\n\t\t/**\n\t\t * name\n\t\t \052/\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; name = _1.getName();\n\t\t//\n\t\tif (accumulator.includes(name) == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\t\t\t// Abort after second find\n\t\t\tbreak;\n\t\t}\n\t\telse {\n\t\t\taccumulator.add(name);\n\t\t}\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Entity_c_c_AttributesNameUnique, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean AttributesNameUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv KindCompatibleWithOneAppliesOfEachMixin:\n *   let\n *     severity : Integer[1] = \'Entity::KindCompatibleWithOneAppliesOfEachMixin\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[?] = parts.mixin-&gt;forAll(m |\n *           m.applies-&gt;notEmpty() implies\n *           m.applies-&gt;exists(k | kind-&gt;closure(parent)-&gt;includes(k)))\n *       in\n *         \'Entity::KindCompatibleWithOneAppliesOfEachMixin\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n\tsymbol_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@Nullable\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.MixinBase%&gt;&gt; parts = this.getParts();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_parts = idResolver.createOrderedSetOfAll(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.ORD_CLSSid_MixinBase, parts);\n\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSequenceAccumulatorValue(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.SEQ_CLSSid_Mixin);\n\t\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = BOXED_parts.iterator();\n\t\t/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; collect;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\tcollect = accumulator;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.MixinBase%&gt; _1 = (&lt;%org.eclipse.cmf.occi.core.MixinBase%&gt;)ITERATOR__1.next();\n\t\t\t/**\n\t\t\t * mixin\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Mixin%&gt; mixin = _1.getMixin();\n\t\t\t//\n\t\t\taccumulator.add(mixin);\n\t\t}\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; accumulator_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_m = collect.iterator();\n\t\t/*@Thrown\052/ &lt;%java.lang.Boolean%&gt; result;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR_m.hasNext()) {\n\t\t\t\tif (accumulator_0 == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)accumulator_0;\n\t\t\t\t}\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Mixin%&gt; m = (&lt;%org.eclipse.cmf.occi.core.Mixin%&gt;)ITERATOR_m.next();\n\t\t\t/**\n\t\t\t *\n\t\t\t * m.applies-&gt;notEmpty() implies\n\t\t\t * m.applies-&gt;exists(k | kind-&gt;closure(parent)-&gt;includes(k))\n\t\t\t \052/\n\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_implies;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.Kind%&gt;&gt; applies_0 = m.getApplies();\n\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_applies_0 = idResolver.createOrderedSetOfAll(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.ORD_CLSSid_Kind, applies_0);\n\t\t\t\tfinal /*@NonInvalid\052/ boolean notEmpty = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation%&gt;.INSTANCE.evaluate(BOXED_applies_0).booleanValue();\n\t\t\t\t/*@Thrown\052/ boolean implies;\n\t\t\t\tif (notEmpty) {\n\t\t\t\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; accumulator_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_k = BOXED_applies_0.iterator();\n\t\t\t\t\t/*@Thrown\052/ boolean exists;\n\t\t\t\t\twhile (true) {\n\t\t\t\t\t\tif (!ITERATOR_k.hasNext()) {\n\t\t\t\t\t\t\tif (accumulator_1 == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\n\t\t\t\t\t\t\t\texists = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tthrow (&lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;)accumulator_1;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tbreak;\n\t\t\t\t\t\t}\n\t\t\t\t\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Kind%&gt; k = (&lt;%org.eclipse.cmf.occi.core.Kind%&gt;)ITERATOR_k.next();\n\t\t\t\t\t\t/**\n\t\t\t\t\t\t * kind-&gt;closure(parent)-&gt;includes(k)\n\t\t\t\t\t\t \052/\n\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.StandardLibrary%&gt; standardLibrary = idResolver.getStandardLibrary();\n\t\t\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_includes;\n\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Kind%&gt; kind_0 = this.getKind();\n\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; oclAsSet = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.SET_CLSSid_Kind, kind_0);\n\t\t\t\t\t\t\tfinal &lt;%org.eclipse.ocl.pivot.Class%&gt; TYPE_closure_0 = executor.getStaticTypeOf(oclAsSet);\n\t\t\t\t\t\t\tfinal &lt;%org.eclipse.ocl.pivot.library.LibraryIteration%&gt;.LibraryIterationExtension IMPL_closure_0 = (&lt;%org.eclipse.ocl.pivot.library.LibraryIteration%&gt;.LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, &lt;%org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables%&gt;.Operations._Set__closure);\n\t\t\t\t\t\t\tfinal /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.SET_CLSSid_Kind, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_Kind);\n\t\t\t\t\t\t\t/**\n\t\t\t\t\t\t\t * Implementation of the iterator body.\n\t\t\t\t\t\t\t \052/\n\t\t\t\t\t\t\tfinal /*@NonNull\052/ &lt;%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%&gt; BODY_closure_0 = new &lt;%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%&gt;()\n\t\t\t\t\t\t\t{\n\t\t\t\t\t\t\t\t/**\n\t\t\t\t\t\t\t\t * parent\n\t\t\t\t\t\t\t\t \052/\n\t\t\t\t\t\t\t\t@Override\n\t\t\t\t\t\t\t\tpublic /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor, final /*@NonNull\052/ &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt; typeId, final /*@Nullable\052/ Object oclAsSet, final /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; _1_0) {\n\t\t\t\t\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Kind%&gt; symbol_0 = (&lt;%org.eclipse.cmf.occi.core.Kind%&gt;)_1_0;\n\t\t\t\t\t\t\t\t\tif (symbol_0 == null) {\n\t\t\t\t\t\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::Kind::parent\\\'\");\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Kind%&gt; parent = symbol_0.getParent();\n\t\t\t\t\t\t\t\t\treturn parent;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t};\n\t\t\t\t\t\t\tfinal /*@NonNull\052/  &lt;%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%&gt; MGR_closure_0 = new &lt;%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%&gt;(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);\n\t\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; closure = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.ocl.pivot.values.SetValue%&gt;)IMPL_closure_0.evaluateIteration(MGR_closure_0));\n\t\t\t\t\t\t\tfinal /*@Thrown\052/ boolean includes = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%&gt;.INSTANCE.evaluate(closure, k).booleanValue();\n\t\t\t\t\t\t\tCAUGHT_includes = includes;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\t\t\tCAUGHT_includes = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t\t\t}\n\t\t\t\t\t\t//\n\t\t\t\t\t\tif (CAUGHT_includes == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\t\t\t\t\t// Normal successful body evaluation result\n\t\t\t\t\t\t\texists = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse if (CAUGHT_includes == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse if (CAUGHT_includes instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\t\t// Abnormal exception evaluation result\n\t\t\t\t\t\t\taccumulator_1 = CAUGHT_includes;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\t\t\t\taccumulator_1 = new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(&lt;%org.eclipse.ocl.pivot.messages.PivotMessages%&gt;.NonBooleanBody, \"exists\");\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t\timplies = exists;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\timplies = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\tCAUGHT_implies = implies;\n\t\t\t}\n\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\tCAUGHT_implies = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t}\n\t\t\t//\n\t\t\tif (CAUGHT_implies == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\n\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t}\n\t\t\telse if (CAUGHT_implies == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t}\n\t\t\telse if (CAUGHT_implies instanceof &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;) {\t\t// Abnormal exception evaluation result\n\t\t\t\taccumulator_0 = CAUGHT_implies;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t}\n\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\taccumulator_0 = new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(&lt;%org.eclipse.ocl.pivot.messages.PivotMessages%&gt;.NonBooleanBody, \"forAll\");\n\t\t\t}\n\t\t}\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n\tsymbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean KindCompatibleWithOneAppliesOfEachMixin(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv DifferentMixins:\n *   let severity : Integer[1] = \'Entity::DifferentMixins\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : OclAny[1] = let\n *           status : Boolean[?] = self.parts-&gt;forAll(mixinBase1, mixinBase2 | mixinBase1 &lt;&gt; mixinBase2 implies mixinBase1.mixin &lt;&gt; mixinBase2.mixin)\n *         in\n *           if status = true\n *           then true\n *           else\n *             Tuple{status = status, message = \'Two instances of the same mixin are not allowed on the same Entity \' +\n *               self.oclAsType(Entity).id, severity = -1, quickfix = \'quickfix\'\n *             }\n *           endif\n *       in\n *         \'Entity::DifferentMixins\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.StandardLibrary%&gt; standardLibrary = idResolver.getStandardLibrary();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Entity_c_c_DifferentMixins);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ &lt;%java.lang.Object%&gt; symbol_6;\nif (le) {\n\tsymbol_6 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_symbol_5;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.cmf.occi.core.MixinBase%&gt;&gt; parts = this.getParts();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_parts = idResolver.createOrderedSetOfAll(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.ORD_CLSSid_MixinBase, parts);\n\t\tfinal &lt;%org.eclipse.ocl.pivot.Class%&gt; TYPE_status_0 = executor.getStaticTypeOf(BOXED_parts);\n\t\tfinal &lt;%org.eclipse.ocl.pivot.library.LibraryIteration%&gt;.LibraryIterationExtension IMPL_status_0 = (&lt;%org.eclipse.ocl.pivot.library.LibraryIteration%&gt;.LibraryIterationExtension)TYPE_status_0.lookupImplementation(standardLibrary, &lt;%org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables%&gt;.Operations._Collection__0_forAll);\n\t\tfinal /*@NonNull\052/ Object ACC_status_0 = IMPL_status_0.createAccumulatorValue(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN);\n\t\t/**\n\t\t * Implementation of the iterator body.\n\t\t \052/\n\t\tfinal /*@NonNull\052/ &lt;%org.eclipse.ocl.pivot.library.AbstractTernaryOperation%&gt; BODY_status_0 = new &lt;%org.eclipse.ocl.pivot.library.AbstractTernaryOperation%&gt;()\n\t\t{\n\t\t\t/**\n\t\t\t * mixinBase1 &lt;&gt; mixinBase2 implies mixinBase1.mixin &lt;&gt; mixinBase2.mixin\n\t\t\t \052/\n\t\t\t@Override\n\t\t\tpublic /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor, final /*@NonNull\052/ &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt; typeId, final /*@Nullable\052/ Object BOXED_parts, final /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; mixinBase1, final /*@NonInvalid\052/ &lt;%java.lang.Object%&gt; mixinBase2) {\n\t\t\t\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_implies;\n\t\t\t\ttry {\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.MixinBase%&gt; symbol_0 = (&lt;%org.eclipse.cmf.occi.core.MixinBase%&gt;)mixinBase1;\n\t\t\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.MixinBase%&gt; symbol_1 = (&lt;%org.eclipse.cmf.occi.core.MixinBase%&gt;)mixinBase2;\n\t\t\t\t\tfinal /*@NonInvalid\052/ boolean ne = (symbol_0 != null) ? !symbol_0.equals(symbol_1) : (symbol_1 != null);\n\t\t\t\t\t/*@Thrown\052/ boolean implies;\n\t\t\t\t\tif (ne) {\n\t\t\t\t\t\tif (symbol_0 == null) {\n\t\t\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::MixinBase::mixin\\\'\");\n\t\t\t\t\t\t}\n\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Mixin%&gt; mixin = symbol_0.getMixin();\n\t\t\t\t\t\tif (symbol_1 == null) {\n\t\t\t\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore\\\'::MixinBase::mixin\\\'\");\n\t\t\t\t\t\t}\n\t\t\t\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Mixin%&gt; mixin_0 = symbol_1.getMixin();\n\t\t\t\t\t\tfinal /*@Thrown\052/ boolean ne_0 = !mixin.equals(mixin_0);\n\t\t\t\t\t\timplies = ne_0;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\timplies = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\tCAUGHT_implies = implies;\n\t\t\t\t}\n\t\t\t\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\t\t\t\tCAUGHT_implies = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\treturn CAUGHT_implies;\n\t\t\t}\n\t\t};\n\t\tfinal /*@NonNull\052/  &lt;%org.eclipse.ocl.pivot.internal.library.executor.ExecutorDoubleIterationManager%&gt; MGR_status_0 = new &lt;%org.eclipse.ocl.pivot.internal.library.executor.ExecutorDoubleIterationManager%&gt;(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, BODY_status_0, BOXED_parts, ACC_status_0);\n\t\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; status = (&lt;%java.lang.Boolean%&gt;)IMPL_status_0.evaluateIteration(MGR_status_0);\n\t\tfinal /*@Thrown\052/ boolean eq = status == Boolean.TRUE;\n\t\t/*@Thrown\052/ &lt;%java.lang.Object%&gt; symbol_5;\n\t\tif (eq) {\n\t\t\tsymbol_5 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_Entity_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_Entity, null);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; oclAsType = &lt;%org.eclipse.ocl.pivot.utilities.ClassUtil%&gt;.nonNullState((&lt;%org.eclipse.cmf.occi.core.Entity%&gt;)&lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%&gt;.INSTANCE.evaluate(executor, this, TYP_occi_c_c_Entity_0));\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; id = oclAsType.getId();\n\t\t\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; sum = &lt;%org.eclipse.ocl.pivot.library.string.StringConcatOperation%&gt;.INSTANCE.evaluate(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Two_32_instances_32_of_32_the_32_same_32_mixin_32_are_32_not_32_allowed_32_on_32_the_32_same_32_Enti, id);\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; diff = (&lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt;)&lt;%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%&gt;.INSTANCE.evaluate(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_1);\n\t\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.TupleValue%&gt; symbol_4 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createTupleOfEach(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.TUPLid__0, sum, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_quickfix, diff, status);\n\t\t\tsymbol_5 = symbol_4;\n\t\t}\n\t\tCAUGHT_symbol_5 = symbol_5;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_symbol_5 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Entity_c_c_DifferentMixins, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_5, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n\tsymbol_6 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_6;'"
	 * @generated
	 */
	boolean DifferentMixins(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv IdUnique:\n *   let severity : Integer[1] = \'Entity::IdUnique\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let result : Boolean[1] = Entity.allInstances()-&gt;isUnique(id)\n *       in\n *         \'Entity::IdUnique\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Entity_c_c_IdUnique);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_occi_c_c_Entity_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.CLSSid_Entity, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; allInstances = &lt;%org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.SET_CLSSid_Entity, TYP_occi_c_c_Entity_0);\n\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSetAccumulatorValue(&lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.SET_CLSSid_Entity);\n\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = allInstances.iterator();\n\t/*@NonInvalid\052/ boolean result;\n\twhile (true) {\n\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t\t\tbreak;\n\t\t}\n\t\t/*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; _1 = (&lt;%org.eclipse.cmf.occi.core.Entity%&gt;)ITERATOR__1.next();\n\t\t/**\n\t\t * id\n\t\t \052/\n\t\tfinal /*@NonInvalid\052/ &lt;%java.lang.String%&gt; id = _1.getId();\n\t\t//\n\t\tif (accumulator.includes(id) == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.FALSE_VALUE;\t\t\t// Abort after second find\n\t\t\tbreak;\n\t\t}\n\t\telse {\n\t\t\taccumulator.add(id);\n\t\t}\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.STR_Entity_c_c_IdUnique, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.core.OCCITables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean IdUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entity
