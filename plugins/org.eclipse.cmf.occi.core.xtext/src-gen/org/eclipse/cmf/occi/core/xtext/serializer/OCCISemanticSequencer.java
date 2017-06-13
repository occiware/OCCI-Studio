/*
 * generated by Xtext 2.11.0
 */
package org.eclipse.cmf.occi.core.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.cmf.occi.core.Annotation;
import org.eclipse.cmf.occi.core.ArrayType;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.BooleanType;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Constraint;
import org.eclipse.cmf.occi.core.EObjectType;
import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.FSM;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.NumericType;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.RecordField;
import org.eclipse.cmf.occi.core.RecordType;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.State;
import org.eclipse.cmf.occi.core.StringType;
import org.eclipse.cmf.occi.core.Transition;
import org.eclipse.cmf.occi.core.xtext.services.OCCIGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class OCCISemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OCCIGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OCCIPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OCCIPackage.ACTION:
				sequence_Action(context, (org.eclipse.cmf.occi.core.Action) semanticObject); 
				return; 
			case OCCIPackage.ANNOTATION:
				sequence_Annotation(context, (Annotation) semanticObject); 
				return; 
			case OCCIPackage.ARRAY_TYPE:
				sequence_ArrayType(context, (ArrayType) semanticObject); 
				return; 
			case OCCIPackage.ATTRIBUTE:
				if (rule == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getParameterDeclRule()) {
					sequence_ParameterDecl(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case OCCIPackage.ATTRIBUTE_STATE:
				sequence_AttributeState(context, (AttributeState) semanticObject); 
				return; 
			case OCCIPackage.BOOLEAN_TYPE:
				sequence_BooleanType(context, (BooleanType) semanticObject); 
				return; 
			case OCCIPackage.CONFIGURATION:
				sequence_Configuration(context, (Configuration) semanticObject); 
				return; 
			case OCCIPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case OCCIPackage.EOBJECT_TYPE:
				sequence_EObjectType(context, (EObjectType) semanticObject); 
				return; 
			case OCCIPackage.ENUMERATION_LITERAL:
				sequence_EnumerationLiteral(context, (EnumerationLiteral) semanticObject); 
				return; 
			case OCCIPackage.ENUMERATION_TYPE:
				sequence_EnumerationType(context, (EnumerationType) semanticObject); 
				return; 
			case OCCIPackage.EXTENSION:
				sequence_Extension(context, (Extension) semanticObject); 
				return; 
			case OCCIPackage.FSM:
				sequence_FSM(context, (FSM) semanticObject); 
				return; 
			case OCCIPackage.KIND:
				sequence_Kind(context, (Kind) semanticObject); 
				return; 
			case OCCIPackage.LINK:
				sequence_Link(context, (Link) semanticObject); 
				return; 
			case OCCIPackage.MIXIN:
				sequence_Mixin(context, (Mixin) semanticObject); 
				return; 
			case OCCIPackage.MIXIN_BASE:
				sequence_MixinBase(context, (MixinBase) semanticObject); 
				return; 
			case OCCIPackage.NUMERIC_TYPE:
				sequence_NumericType(context, (NumericType) semanticObject); 
				return; 
			case OCCIPackage.RECORD_FIELD:
				sequence_RecordField(context, (RecordField) semanticObject); 
				return; 
			case OCCIPackage.RECORD_TYPE:
				sequence_RecordType(context, (RecordType) semanticObject); 
				return; 
			case OCCIPackage.RESOURCE:
				sequence_Resource(context, (Resource) semanticObject); 
				return; 
			case OCCIPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case OCCIPackage.STRING_TYPE:
				sequence_StringType(context, (StringType) semanticObject); 
				return; 
			case OCCIPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (
	 *         name=NameID 
	 *         (attributes+=ParameterDecl attributes+=ParameterDecl*)? 
	 *         scheme=STRING 
	 *         title=STRING? 
	 *         (annotations+=Annotation annotations+=Annotation*)?
	 *     )
	 */
	protected void sequence_Action(ISerializationContext context, org.eclipse.cmf.occi.core.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Annotation returns Annotation
	 *
	 * Constraint:
	 *     (key=STRING value=STRING)
	 */
	protected void sequence_Annotation(ISerializationContext context, Annotation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OCCIPackage.Literals.ANNOTATION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OCCIPackage.Literals.ANNOTATION__KEY));
			if (transientValues.isValueTransient(semanticObject, OCCIPackage.Literals.ANNOTATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OCCIPackage.Literals.ANNOTATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_2_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns ArrayType
	 *     ArrayType returns ArrayType
	 *
	 * Constraint:
	 *     (name=TypeID type=[DataType|QualifiedID] documentation=STRING?)
	 */
	protected void sequence_ArrayType(ISerializationContext context, ArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeState returns AttributeState
	 *
	 * Constraint:
	 *     (name=QualifiedID value=STRING)
	 */
	protected void sequence_AttributeState(ISerializationContext context, AttributeState semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OCCIPackage.Literals.ATTRIBUTE_STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OCCIPackage.Literals.ATTRIBUTE_STATE__NAME));
			if (transientValues.isValueTransient(semanticObject, OCCIPackage.Literals.ATTRIBUTE_STATE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OCCIPackage.Literals.ATTRIBUTE_STATE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeStateAccess().getNameQualifiedIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeStateAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         mutable?='mutable'? 
	 *         required?='required'? 
	 *         name=QualifiedID 
	 *         type=[DataType|QualifiedID]? 
	 *         default=STRING? 
	 *         description=STRING? 
	 *         (annotations+=Annotation annotations+=Annotation*)?
	 *     )
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns BooleanType
	 *     BooleanType returns BooleanType
	 *
	 * Constraint:
	 *     (name=TypeID documentation=STRING?)
	 */
	protected void sequence_BooleanType(ISerializationContext context, BooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Grammar returns Configuration
	 *     Configuration returns Configuration
	 *
	 * Constraint:
	 *     (description=STRING? location=STRING? use+=[Extension|STRING]* resources+=Resource* mixins+=Mixin*)
	 */
	protected void sequence_Configuration(ISerializationContext context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns Constraint
	 *
	 * Constraint:
	 *     (name=NameID description=STRING? body=STRING)
	 */
	protected void sequence_Constraint(ISerializationContext context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns EObjectType
	 *     EObjectType returns EObjectType
	 *
	 * Constraint:
	 *     (name=TypeID instanceClassName=STRING? documentation=STRING?)
	 */
	protected void sequence_EObjectType(ISerializationContext context, EObjectType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumerationLiteral returns EnumerationLiteral
	 *
	 * Constraint:
	 *     (name=TypeID documentation=STRING?)
	 */
	protected void sequence_EnumerationLiteral(ISerializationContext context, EnumerationLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns EnumerationType
	 *     EnumerationType returns EnumerationType
	 *
	 * Constraint:
	 *     (name=TypeID literals+=EnumerationLiteral literals+=EnumerationLiteral* documentation=STRING?)
	 */
	protected void sequence_EnumerationType(ISerializationContext context, EnumerationType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Grammar returns Extension
	 *     Extension returns Extension
	 *
	 * Constraint:
	 *     (
	 *         name=NameID 
	 *         scheme=STRING 
	 *         description=STRING? 
	 *         specification=STRING? 
	 *         import+=[Extension|STRING]* 
	 *         (kinds+=Kind | mixins+=Mixin | types+=DataType)*
	 *     )
	 */
	protected void sequence_Extension(ISerializationContext context, Extension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FSM returns FSM
	 *
	 * Constraint:
	 *     (attribute=[Attribute|QualifiedID] (ownedState+=State ownedState+=State*)?)
	 */
	protected void sequence_FSM(ISerializationContext context, FSM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Kind returns Kind
	 *
	 * Constraint:
	 *     (
	 *         name=NameID 
	 *         parent=[Kind|QualifiedID]? 
	 *         source=[Kind|QualifiedID]? 
	 *         target=[Kind|QualifiedID]? 
	 *         title=STRING? 
	 *         scheme=STRING 
	 *         (attributes+=Attribute | actions+=Action | constraints+=Constraint)* 
	 *         fsm=FSM? 
	 *         (annotations+=Annotation annotations+=Annotation*)?
	 *     )
	 */
	protected void sequence_Kind(ISerializationContext context, Kind semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Link returns Link
	 *
	 * Constraint:
	 *     (
	 *         id=STRING 
	 *         kind=[Kind|QualifiedID] 
	 *         title=STRING? 
	 *         location=STRING? 
	 *         target=[Resource|STRING] 
	 *         attributes+=AttributeState* 
	 *         parts+=MixinBase*
	 *     )
	 */
	protected void sequence_Link(ISerializationContext context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MixinBase returns MixinBase
	 *
	 * Constraint:
	 *     (mixin=[Mixin|QualifiedID] attributes+=AttributeState*)
	 */
	protected void sequence_MixinBase(ISerializationContext context, MixinBase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Mixin returns Mixin
	 *
	 * Constraint:
	 *     (
	 *         name=NameID 
	 *         (depends+=[Mixin|QualifiedID] depends+=[Mixin|QualifiedID]*)? 
	 *         (applies+=[Kind|QualifiedID] applies+=[Kind|QualifiedID]*)? 
	 *         title=STRING? 
	 *         scheme=STRING 
	 *         (attributes+=Attribute | actions+=Action | constraints+=Constraint)* 
	 *         (annotations+=Annotation annotations+=Annotation*)?
	 *     )
	 */
	protected void sequence_Mixin(ISerializationContext context, Mixin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns NumericType
	 *     NumericType returns NumericType
	 *
	 * Constraint:
	 *     (
	 *         name=TypeID 
	 *         type=NumericTypeEnum 
	 *         totalDigits=EIntegerObject? 
	 *         minExclusive=STRING? 
	 *         maxExclusive=STRING? 
	 *         minInclusive=STRING? 
	 *         maxInclusive=STRING? 
	 *         documentation=STRING?
	 *     )
	 */
	protected void sequence_NumericType(ISerializationContext context, NumericType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterDecl returns Attribute
	 *
	 * Constraint:
	 *     (name=QualifiedID type=[DataType|QualifiedID] default=STRING?)
	 */
	protected void sequence_ParameterDecl(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RecordField returns RecordField
	 *
	 * Constraint:
	 *     (
	 *         mutable?='mutable'? 
	 *         required?='required'? 
	 *         name=QualifiedID 
	 *         type=[DataType|QualifiedID] 
	 *         default=STRING? 
	 *         description=STRING? 
	 *         (annotations+=Annotation annotations+=Annotation*)?
	 *     )
	 */
	protected void sequence_RecordField(ISerializationContext context, RecordField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns RecordType
	 *     RecordType returns RecordType
	 *
	 * Constraint:
	 *     (name=TypeID recordFields+=RecordField recordFields+=RecordField* documentation=STRING?)
	 */
	protected void sequence_RecordType(ISerializationContext context, RecordType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Resource returns Resource
	 *
	 * Constraint:
	 *     (
	 *         id=STRING 
	 *         kind=[Kind|QualifiedID] 
	 *         title=STRING? 
	 *         location=STRING? 
	 *         summary=STRING? 
	 *         parts+=MixinBase* 
	 *         attributes+=AttributeState* 
	 *         links+=Link*
	 *     )
	 */
	protected void sequence_Resource(ISerializationContext context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (initial?='initial'? final?='final'? literal=[EnumerationLiteral|QualifiedID] (outgoingTransition+=Transition outgoingTransition+=Transition*)?)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns StringType
	 *     StringType returns StringType
	 *
	 * Constraint:
	 *     (
	 *         name=TypeID 
	 *         pattern=STRING? 
	 *         length=EIntegerObject? 
	 *         minLength=EIntegerObject? 
	 *         maxLength=EIntegerObject? 
	 *         documentation=STRING?
	 *     )
	 */
	protected void sequence_StringType(ISerializationContext context, StringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (action=[Action|QualifiedID]? target=[State|QualifiedID])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
