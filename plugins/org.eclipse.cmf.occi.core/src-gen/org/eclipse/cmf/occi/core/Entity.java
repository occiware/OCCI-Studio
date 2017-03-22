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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IdUnique AttributesNameUnique KindCompatibleWithOneAppliesOfEachMixin'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Entity!id'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Entity!title'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Entity!kind'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Entity!location'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Entity!attributes'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * parts.mixin->asSet()\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@Thrown\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.MixinBase%>> parts = this.getParts();\nfinal /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_parts = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_MixinBase, parts);\n/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.eclipse.cmf.occi.OCCITables%>.SEQ_CLSSid_Mixin);\n/*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_parts.iterator();\n/*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\nwhile (true) {\n    if (!ITERATOR__1.hasNext()) {\n        collect = accumulator;\n        break;\n    }\n    /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.MixinBase%> _1 = (<%org.eclipse.cmf.occi.core.MixinBase%>)ITERATOR__1.next();\n    /**\n     * mixin\n     \052/\n    final /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Mixin%> mixin = _1.getMixin();\n    //\n    accumulator.add(mixin);\n}\nfinal /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%> asSet = <%org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation%>.INSTANCE.evaluate(collect);\nfinal /*@Thrown\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Mixin%>> ECORE_asSet = ((<%org.eclipse.ocl.pivot.ids.IdResolver%>.IdResolverExtension)idResolver).ecoreValueOfAll(<%org.eclipse.cmf.occi.core.Mixin%>.class, asSet);\nreturn (<%org.eclipse.emf.common.util.EList%><<%org.eclipse.cmf.occi.core.Mixin%>>)ECORE_asSet;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Entity!parts'"
	 * @generated
	 */
	EList<MixinBase> getParts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Entity!occiCreate()'"
	 * @generated
	 */
	void occiCreate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Entity!occiRetrieve()'"
	 * @generated
	 */
	void occiRetrieve();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Entity!occiUpdate()'"
	 * @generated
	 */
	void occiUpdate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/core/ecore/2.0!Entity!occiDelete()'"
	 * @generated
	 */
	void occiDelete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv AttributesNameUnique:\n *   let severity : Integer[1] = \'Entity::AttributesNameUnique\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let status : OclAny[1] = attributes->isUnique(name)\n *       in\n *         \'Entity::AttributesNameUnique\'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Entity_c_c_AttributesNameUnique);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@Thrown\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.AttributeState%>> attributes = this.getAttributes();\n        final /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_attributes = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_AttributeState, attributes);\n        /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSetAccumulatorValue(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_AttributeState);\n        /*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_attributes.iterator();\n        /*@Thrown\052/ boolean status;\n        while (true) {\n            if (!ITERATOR__1.hasNext()) {\n                status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n                break;\n            }\n            /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.AttributeState%> _1 = (<%org.eclipse.cmf.occi.core.AttributeState%>)ITERATOR__1.next();\n            /**\n             * name\n             \052/\n            final /*@Thrown\052/ <%java.lang.String%> name = _1.getName();\n            //\n            if (accumulator.includes(name) == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n                status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n                break;\n            }\n            else {\n                accumulator.add(name);\n            }\n        }\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Entity_c_c_AttributesNameUnique, this, null, diagnostics, context, null, severity_0, CAUGHT_status, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean AttributesNameUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv KindCompatibleWithOneAppliesOfEachMixin:\n *   let\n *     severity : Integer[1] = \'Entity::KindCompatibleWithOneAppliesOfEachMixin\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let\n *         status : OclAny[?] = parts.mixin->forAll(m |\n *           m.applies->notEmpty() implies\n *           m.applies->exists(k | kind->closure(parent)->includes(k)))\n *       in\n *         \'Entity::KindCompatibleWithOneAppliesOfEachMixin\'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_1;\nif (le) {\n    symbol_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@Thrown\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.MixinBase%>> parts = this.getParts();\n        final /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_parts = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_MixinBase, parts);\n        /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSequenceAccumulatorValue(<%org.eclipse.cmf.occi.OCCITables%>.SEQ_CLSSid_Mixin);\n        /*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = BOXED_parts.iterator();\n        /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SequenceValue%> collect;\n        while (true) {\n            if (!ITERATOR__1.hasNext()) {\n                collect = accumulator;\n                break;\n            }\n            /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.MixinBase%> _1 = (<%org.eclipse.cmf.occi.core.MixinBase%>)ITERATOR__1.next();\n            /**\n             * mixin\n             \052/\n            final /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Mixin%> mixin = _1.getMixin();\n            //\n            accumulator.add(mixin);\n        }\n        /*@Thrown\052/ <%java.lang.Object%> accumulator_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n        /*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR_m = collect.iterator();\n        /*@Thrown\052/ <%java.lang.Boolean%> status;\n        while (true) {\n            if (!ITERATOR_m.hasNext()) {\n                if (accumulator_0 == null) {\n                    status = null;\n                }\n                else if (accumulator_0 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n                    status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n                }\n                else {\n                    throw (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator_0;\n                }\n                break;\n            }\n            /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Mixin%> m = (<%org.eclipse.cmf.occi.core.Mixin%>)ITERATOR_m.next();\n            /**\n             * \n             * m.applies->notEmpty() implies\n             * m.applies->exists(k | kind->closure(parent)->includes(k))\n             \052/\n            /*@Caught\052/ /*@Nullable\052/ <%java.lang.Object%> CAUGHT_implies;\n            try {\n                /*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_notEmpty;\n                try {\n                    final /*@Thrown\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Kind%>> applies = m.getApplies();\n                    final /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_applies = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Kind, applies);\n                    final /*@Thrown\052/ boolean notEmpty = <%org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation%>.INSTANCE.evaluate(BOXED_applies).booleanValue();\n                    CAUGHT_notEmpty = notEmpty;\n                }\n                catch (<%java.lang.Exception%> e) {\n                    CAUGHT_notEmpty = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n                }\n                /*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_exists;\n                try {\n                    final /*@Thrown\052/ <%java.util.List%><<%org.eclipse.cmf.occi.core.Kind%>> applies_0 = m.getApplies();\n                    final /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.OrderedSetValue%> BOXED_applies_0 = idResolver.createOrderedSetOfAll(<%org.eclipse.cmf.occi.OCCITables%>.ORD_CLSSid_Kind, applies_0);\n                    /*@Thrown\052/ <%java.lang.Object%> accumulator_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n                    /*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR_k = BOXED_applies_0.iterator();\n                    /*@Thrown\052/ boolean exists;\n                    while (true) {\n                        if (!ITERATOR_k.hasNext()) {\n                            if (accumulator_1 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n                                exists = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n                            }\n                            else {\n                                throw (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator_1;\n                            }\n                            break;\n                        }\n                        /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> k = (<%org.eclipse.cmf.occi.core.Kind%>)ITERATOR_k.next();\n                        /**\n                         * kind->closure(parent)->includes(k)\n                         \052/\n                        final /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.StandardLibrary%> standardLibrary = idResolver.getStandardLibrary();\n                        /*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_includes;\n                        try {\n                            final /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> kind = this.getKind();\n                            final /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%> oclAsSet = <%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.SET_CLSSid_Kind, kind);\n                            final <%org.eclipse.ocl.pivot.Class%> TYPE_closure_0 = executor.getStaticTypeOf(oclAsSet);\n                            final <%org.eclipse.ocl.pivot.library.LibraryIteration%>.LibraryIterationExtension IMPL_closure_0 = (<%org.eclipse.ocl.pivot.library.LibraryIteration%>.LibraryIterationExtension)TYPE_closure_0.lookupImplementation(standardLibrary, <%org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables%>.Operations._Set__closure);\n                            final /*@NonNull\052/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor, <%org.eclipse.cmf.occi.OCCITables%>.SET_CLSSid_Kind, <%org.eclipse.cmf.occi.OCCITables%>.CLSSid_Kind);\n                            /**\n                             * Implementation of the iterator body.\n                             \052/\n                            final /*@NonNull\052/ <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%> BODY_closure_0 = new <%org.eclipse.ocl.pivot.library.AbstractBinaryOperation%>()\n                            {\n                                /**\n                                 * parent\n                                 \052/\n                                @Override\n                                public /*@Nullable\052/ Object evaluate(final /*@NonNull\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor, final /*@NonNull\052/ <%org.eclipse.ocl.pivot.ids.TypeId%> typeId, final /*@Nullable\052/ Object oclAsSet, final /*@NonInvalid\052/ <%java.lang.Object%> _1_0) {\n                                    final /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Kind%> symbol_0 = (<%org.eclipse.cmf.occi.core.Kind%>)_1_0;\n                                    if (symbol_0 == null) {\n                                        throw new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null source for \\\'\\\'http://schemas.ogf.org/occi/core/ecore/2.0\\\'::Kind::parent\\\'\");\n                                    }\n                                    final /*@Thrown\052/ <%org.eclipse.cmf.occi.core.Kind%> parent = symbol_0.getParent();\n                                    return parent;\n                                }\n                            };\n                            final /*@NonNull\052/  <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%> MGR_closure_0 = new <%org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager%>(executor, <%org.eclipse.cmf.occi.OCCITables%>.SET_CLSSid_Kind, BODY_closure_0, oclAsSet, ACC_closure_0);\n                            final /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%> closure = <%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState((<%org.eclipse.ocl.pivot.values.SetValue%>)IMPL_closure_0.evaluateIteration(MGR_closure_0));\n                            final /*@Thrown\052/ boolean includes = <%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(closure, k).booleanValue();\n                            CAUGHT_includes = includes;\n                        }\n                        catch (<%java.lang.Exception%> e) {\n                            CAUGHT_includes = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n                        }\n                        //\n                        if (CAUGHT_includes == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t\t// Normal successful body evaluation result\n                            exists = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n                            break;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately \n                        }\n                        else if (CAUGHT_includes == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t// Normal unsuccessful body evaluation result\n                            ;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n                        }\n                        else if (CAUGHT_includes instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n                            accumulator_1 = CAUGHT_includes;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n                        }\n                        else {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n                            accumulator_1 = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"exists\");\n                        }\n                    }\n                    CAUGHT_exists = exists;\n                }\n                catch (<%java.lang.Exception%> e) {\n                    CAUGHT_exists = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n                }\n                final /*@Thrown\052/ <%java.lang.Boolean%> implies = <%org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation%>.INSTANCE.evaluate(CAUGHT_notEmpty, CAUGHT_exists);\n                CAUGHT_implies = implies;\n            }\n            catch (<%java.lang.Exception%> e) {\n                CAUGHT_implies = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n            }\n            //\n            if (CAUGHT_implies == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t\t// Normal unsuccessful body evaluation result\n                status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n                break;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately \n            }\n            else if (CAUGHT_implies == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t// Normal successful body evaluation result\n                ;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n            }\n            else if (CAUGHT_implies == null) {\t\t\t\t\t\t\t\t// Abnormal null body evaluation result\n                if (accumulator_0 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n                    accumulator_0 = null;\t\t\t\t\t\t\t\t\t\t// Cache a null failure\n                }\n            }\n            else if (CAUGHT_implies instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n                accumulator_0 = CAUGHT_implies;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n            }\n            else {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n                accumulator_0 = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"forAll\");\n            }\n        }\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Entity_c_c_KindCompatibleWithOneAppliesOfEachMixin, this, null, diagnostics, context, null, severity_0, CAUGHT_status, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n    symbol_1 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_1;'"
	 * @generated
	 */
	boolean KindCompatibleWithOneAppliesOfEachMixin(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * \n * inv IdUnique:\n *   let severity : Integer[1] = \'Entity::IdUnique\'.getSeverity()\n *   in\n *     if severity <= 0\n *     then true\n *     else\n *       let status : OclAny[1] = Entity.allInstances()->isUnique(id)\n *       in\n *         \'Entity::IdUnique\'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%>.getExecutor(this);\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.STR_Entity_c_c_IdUnique);\nfinal /*@NonInvalid\052/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n    symbol_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n}\nelse {\n    /*@Caught\052/ /*@NonNull\052/ <%java.lang.Object%> CAUGHT_status;\n    try {\n        final /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.Class%> TYP_occi_c_c_Entity_0 = idResolver.getClass(<%org.eclipse.cmf.occi.OCCITables%>.CLSSid_Entity, null);\n        final /*@NonInvalid\052/ <%org.eclipse.ocl.pivot.values.SetValue%> allInstances = <%org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.cmf.occi.OCCITables%>.SET_CLSSid_Entity, TYP_occi_c_c_Entity_0);\n        /*@Thrown\052/ <%org.eclipse.ocl.pivot.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createSetAccumulatorValue(<%org.eclipse.cmf.occi.OCCITables%>.SET_CLSSid_Entity);\n        /*@NonNull\052/ <%java.util.Iterator%><<%java.lang.Object%>> ITERATOR__1 = allInstances.iterator();\n        /*@Thrown\052/ boolean status;\n        while (true) {\n            if (!ITERATOR__1.hasNext()) {\n                status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n                break;\n            }\n            /*@NonInvalid\052/ <%org.eclipse.cmf.occi.core.Entity%> _1 = (<%org.eclipse.cmf.occi.core.Entity%>)ITERATOR__1.next();\n            /**\n             * id\n             \052/\n            final /*@Thrown\052/ <%java.lang.String%> id = _1.getId();\n            //\n            if (accumulator.includes(id) == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n                status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\t\t\t// Abort after second find\n                break;\n            }\n            else {\n                accumulator.add(id);\n            }\n        }\n        CAUGHT_status = status;\n    }\n    catch (<%java.lang.Exception%> e) {\n        CAUGHT_status = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n    }\n    final /*@NonInvalid\052/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, <%org.eclipse.cmf.occi.OCCITables%>.STR_Entity_c_c_IdUnique, this, null, diagnostics, context, null, severity_0, CAUGHT_status, <%org.eclipse.cmf.occi.OCCITables%>.INT_0).booleanValue();\n    symbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean IdUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entity
