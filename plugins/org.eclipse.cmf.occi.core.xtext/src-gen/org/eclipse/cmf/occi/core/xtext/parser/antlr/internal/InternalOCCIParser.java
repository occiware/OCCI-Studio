package org.eclipse.cmf.occi.core.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.cmf.occi.core.xtext.services.OCCIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOCCIParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_QUALIFIED_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'extension'", "':'", "'description'", "'specification'", "'import'", "'as'", "'kind'", "'extends'", "'source'", "'target'", "'annotations'", "'{'", "','", "'}'", "'title'", "'scheme'", "'fsm'", "'mixin'", "'depends'", "'('", "')'", "'applies'", "'annotation'", "'key'", "'value'", "'attribute'", "'mutable'", "'required'", "'type'", "'='", "'action'", "'constraint'", "'body'", "'FSM'", "'states'", "'State'", "'initial'", "'final'", "'literal'", "'transitions'", "'to'", "'StringType'", "'documentation'", "'pattern'", "'length'", "'minLength'", "'maxLength'", "'EObjectType'", "'instanceClassName'", "'BooleanType'", "'NumericType'", "'totalDigits'", "'minExclusive'", "'maxExclusive'", "'minInclusive'", "'maxInclusive'", "'EnumerationType'", "'literals'", "'RecordType'", "'fields'", "'field'", "'ArrayType'", "'-'", "'Byte'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'BigDecimal'"
    };
    public static final int T__50=50;
    public static final int RULE_QUALIFIED_ID=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalOCCIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOCCIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOCCIParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOCCI.g"; }



     	private OCCIGrammarAccess grammarAccess;

        public InternalOCCIParser(TokenStream input, OCCIGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Grammar";
       	}

       	@Override
       	protected OCCIGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGrammar"
    // InternalOCCI.g:65:1: entryRuleGrammar returns [EObject current=null] : iv_ruleGrammar= ruleGrammar EOF ;
    public final EObject entryRuleGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammar = null;


        try {
            // InternalOCCI.g:65:48: (iv_ruleGrammar= ruleGrammar EOF )
            // InternalOCCI.g:66:2: iv_ruleGrammar= ruleGrammar EOF
            {
             newCompositeNode(grammarAccess.getGrammarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrammar=ruleGrammar();

            state._fsp--;

             current =iv_ruleGrammar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // InternalOCCI.g:72:1: ruleGrammar returns [EObject current=null] : this_Extension_0= ruleExtension ;
    public final EObject ruleGrammar() throws RecognitionException {
        EObject current = null;

        EObject this_Extension_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:78:2: (this_Extension_0= ruleExtension )
            // InternalOCCI.g:79:2: this_Extension_0= ruleExtension
            {

            		newCompositeNode(grammarAccess.getGrammarAccess().getExtensionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Extension_0=ruleExtension();

            state._fsp--;


            		current = this_Extension_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleExtension"
    // InternalOCCI.g:90:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // InternalOCCI.g:90:50: (iv_ruleExtension= ruleExtension EOF )
            // InternalOCCI.g:91:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // InternalOCCI.g:97:1: ruleExtension returns [EObject current=null] : (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_scheme_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_specification_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_ID_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_kinds_12_0 = null;

        EObject lv_mixins_13_0 = null;

        EObject lv_types_14_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:103:2: ( (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* ) )
            // InternalOCCI.g:104:2: (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* )
            {
            // InternalOCCI.g:104:2: (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* )
            // InternalOCCI.g:105:3: otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionAccess().getExtensionKeyword_0());
            		
            // InternalOCCI.g:109:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:110:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:110:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:111:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getExtensionAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleNameID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtensionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.NameID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:132:3: ( (lv_scheme_3_0= RULE_STRING ) )
            // InternalOCCI.g:133:4: (lv_scheme_3_0= RULE_STRING )
            {
            // InternalOCCI.g:133:4: (lv_scheme_3_0= RULE_STRING )
            // InternalOCCI.g:134:5: lv_scheme_3_0= RULE_STRING
            {
            lv_scheme_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_scheme_3_0, grammarAccess.getExtensionAccess().getSchemeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scheme",
            						lv_scheme_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:150:3: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOCCI.g:151:4: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalOCCI.g:155:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalOCCI.g:156:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:156:5: (lv_description_5_0= RULE_STRING )
                    // InternalOCCI.g:157:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getExtensionAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtensionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:174:3: (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOCCI.g:175:4: otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getExtensionAccess().getSpecificationKeyword_5_0());
                    			
                    // InternalOCCI.g:179:4: ( (lv_specification_7_0= RULE_STRING ) )
                    // InternalOCCI.g:180:5: (lv_specification_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:180:5: (lv_specification_7_0= RULE_STRING )
                    // InternalOCCI.g:181:6: lv_specification_7_0= RULE_STRING
                    {
                    lv_specification_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_specification_7_0, grammarAccess.getExtensionAccess().getSpecificationSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtensionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"specification",
                    							lv_specification_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:198:3: (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOCCI.g:199:4: otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )?
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getImportKeyword_6_0());
            	    			
            	    // InternalOCCI.g:203:4: ( (otherlv_9= RULE_STRING ) )
            	    // InternalOCCI.g:204:5: (otherlv_9= RULE_STRING )
            	    {
            	    // InternalOCCI.g:204:5: (otherlv_9= RULE_STRING )
            	    // InternalOCCI.g:205:6: otherlv_9= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExtensionRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    						newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getImportExtensionCrossReference_6_1_0());
            	    					

            	    }


            	    }

            	    // InternalOCCI.g:216:4: (otherlv_10= 'as' this_ID_11= RULE_ID )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==17) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalOCCI.g:217:5: otherlv_10= 'as' this_ID_11= RULE_ID
            	            {
            	            otherlv_10=(Token)match(input,17,FOLLOW_10); 

            	            					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getAsKeyword_6_2_0());
            	            				
            	            this_ID_11=(Token)match(input,RULE_ID,FOLLOW_8); 

            	            					newLeafNode(this_ID_11, grammarAccess.getExtensionAccess().getIDTerminalRuleCall_6_2_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalOCCI.g:227:3: ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt5=1;
                    }
                    break;
                case 29:
                    {
                    alt5=2;
                    }
                    break;
                case 53:
                case 59:
                case 61:
                case 62:
                case 68:
                case 70:
                case 73:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalOCCI.g:228:4: ( (lv_kinds_12_0= ruleKind ) )
            	    {
            	    // InternalOCCI.g:228:4: ( (lv_kinds_12_0= ruleKind ) )
            	    // InternalOCCI.g:229:5: (lv_kinds_12_0= ruleKind )
            	    {
            	    // InternalOCCI.g:229:5: (lv_kinds_12_0= ruleKind )
            	    // InternalOCCI.g:230:6: lv_kinds_12_0= ruleKind
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_kinds_12_0=ruleKind();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExtensionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"kinds",
            	    							lv_kinds_12_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.Kind");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOCCI.g:248:4: ( (lv_mixins_13_0= ruleMixin ) )
            	    {
            	    // InternalOCCI.g:248:4: ( (lv_mixins_13_0= ruleMixin ) )
            	    // InternalOCCI.g:249:5: (lv_mixins_13_0= ruleMixin )
            	    {
            	    // InternalOCCI.g:249:5: (lv_mixins_13_0= ruleMixin )
            	    // InternalOCCI.g:250:6: lv_mixins_13_0= ruleMixin
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_mixins_13_0=ruleMixin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExtensionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"mixins",
            	    							lv_mixins_13_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.Mixin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOCCI.g:268:4: ( (lv_types_14_0= ruleDataType ) )
            	    {
            	    // InternalOCCI.g:268:4: ( (lv_types_14_0= ruleDataType ) )
            	    // InternalOCCI.g:269:5: (lv_types_14_0= ruleDataType )
            	    {
            	    // InternalOCCI.g:269:5: (lv_types_14_0= ruleDataType )
            	    // InternalOCCI.g:270:6: lv_types_14_0= ruleDataType
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getTypesDataTypeParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_types_14_0=ruleDataType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExtensionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_14_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.DataType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleKind"
    // InternalOCCI.g:292:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // InternalOCCI.g:292:45: (iv_ruleKind= ruleKind EOF )
            // InternalOCCI.g:293:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // InternalOCCI.g:299:1: ruleKind returns [EObject current=null] : (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '{' (otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) )? otherlv_17= 'scheme' ( (lv_scheme_18_0= RULE_STRING ) ) ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )* (otherlv_22= 'fsm' ( (lv_fsm_23_0= ruleFSM ) ) )? ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_title_16_0=null;
        Token otherlv_17=null;
        Token lv_scheme_18_0=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_10_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_attributes_19_0 = null;

        EObject lv_actions_20_0 = null;

        EObject lv_constraints_21_0 = null;

        EObject lv_fsm_23_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:305:2: ( (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '{' (otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) )? otherlv_17= 'scheme' ( (lv_scheme_18_0= RULE_STRING ) ) ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )* (otherlv_22= 'fsm' ( (lv_fsm_23_0= ruleFSM ) ) )? ) )
            // InternalOCCI.g:306:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '{' (otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) )? otherlv_17= 'scheme' ( (lv_scheme_18_0= RULE_STRING ) ) ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )* (otherlv_22= 'fsm' ( (lv_fsm_23_0= ruleFSM ) ) )? )
            {
            // InternalOCCI.g:306:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '{' (otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) )? otherlv_17= 'scheme' ( (lv_scheme_18_0= RULE_STRING ) ) ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )* (otherlv_22= 'fsm' ( (lv_fsm_23_0= ruleFSM ) ) )? )
            // InternalOCCI.g:307:3: otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '{' (otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) )? otherlv_17= 'scheme' ( (lv_scheme_18_0= RULE_STRING ) ) ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )* (otherlv_22= 'fsm' ( (lv_fsm_23_0= ruleFSM ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getKindAccess().getKindKeyword_0());
            		
            // InternalOCCI.g:311:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:312:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:312:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:313:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getKindAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleNameID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKindRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.NameID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:330:3: (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOCCI.g:331:4: otherlv_2= 'extends' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getKindAccess().getExtendsKeyword_2_0());
                    			
                    // InternalOCCI.g:335:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:336:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:336:5: ( ruleQualifiedID )
                    // InternalOCCI.g:337:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getParentKindCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:352:3: (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOCCI.g:353:4: otherlv_4= 'source' ( ( ruleQualifiedID ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getKindAccess().getSourceKeyword_3_0());
                    			
                    // InternalOCCI.g:357:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:358:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:358:5: ( ruleQualifiedID )
                    // InternalOCCI.g:359:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getSourceKindCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:374:3: (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOCCI.g:375:4: otherlv_6= 'target' ( ( ruleQualifiedID ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getKindAccess().getTargetKeyword_4_0());
                    			
                    // InternalOCCI.g:379:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:380:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:380:5: ( ruleQualifiedID )
                    // InternalOCCI.g:381:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getTargetKindCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:396:3: (otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOCCI.g:397:4: otherlv_8= 'annotations' otherlv_9= '{' ( (lv_annotations_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getKindAccess().getAnnotationsKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalOCCI.g:405:4: ( (lv_annotations_10_0= ruleAnnotation ) )
                    // InternalOCCI.g:406:5: (lv_annotations_10_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:406:5: (lv_annotations_10_0= ruleAnnotation )
                    // InternalOCCI.g:407:6: lv_annotations_10_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_annotations_10_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKindRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_10_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:424:4: (otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalOCCI.g:425:5: otherlv_11= ',' ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_18); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getKindAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalOCCI.g:429:5: ( (lv_annotations_12_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:430:6: (lv_annotations_12_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:430:6: (lv_annotations_12_0= ruleAnnotation )
                    	    // InternalOCCI.g:431:7: lv_annotations_12_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_annotations_12_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_12_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_14, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalOCCI.g:458:3: (otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOCCI.g:459:4: otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getKindAccess().getTitleKeyword_7_0());
                    			
                    // InternalOCCI.g:463:4: ( (lv_title_16_0= RULE_STRING ) )
                    // InternalOCCI.g:464:5: (lv_title_16_0= RULE_STRING )
                    {
                    // InternalOCCI.g:464:5: (lv_title_16_0= RULE_STRING )
                    // InternalOCCI.g:465:6: lv_title_16_0= RULE_STRING
                    {
                    lv_title_16_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_title_16_0, grammarAccess.getKindAccess().getTitleSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getKindAccess().getSchemeKeyword_8());
            		
            // InternalOCCI.g:486:3: ( (lv_scheme_18_0= RULE_STRING ) )
            // InternalOCCI.g:487:4: (lv_scheme_18_0= RULE_STRING )
            {
            // InternalOCCI.g:487:4: (lv_scheme_18_0= RULE_STRING )
            // InternalOCCI.g:488:5: lv_scheme_18_0= RULE_STRING
            {
            lv_scheme_18_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_scheme_18_0, grammarAccess.getKindAccess().getSchemeSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKindRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scheme",
            						lv_scheme_18_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:504:3: ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )*
            loop12:
            do {
                int alt12=4;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    alt12=1;
                    }
                    break;
                case 42:
                    {
                    alt12=2;
                    }
                    break;
                case 43:
                    {
                    alt12=3;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalOCCI.g:505:4: ( (lv_attributes_19_0= ruleAttribute ) )
            	    {
            	    // InternalOCCI.g:505:4: ( (lv_attributes_19_0= ruleAttribute ) )
            	    // InternalOCCI.g:506:5: (lv_attributes_19_0= ruleAttribute )
            	    {
            	    // InternalOCCI.g:506:5: (lv_attributes_19_0= ruleAttribute )
            	    // InternalOCCI.g:507:6: lv_attributes_19_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_10_0_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_attributes_19_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getKindRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_19_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOCCI.g:525:4: ( (lv_actions_20_0= ruleAction ) )
            	    {
            	    // InternalOCCI.g:525:4: ( (lv_actions_20_0= ruleAction ) )
            	    // InternalOCCI.g:526:5: (lv_actions_20_0= ruleAction )
            	    {
            	    // InternalOCCI.g:526:5: (lv_actions_20_0= ruleAction )
            	    // InternalOCCI.g:527:6: lv_actions_20_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getKindAccess().getActionsActionParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_actions_20_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getKindRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_20_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOCCI.g:545:4: ( (lv_constraints_21_0= ruleConstraint ) )
            	    {
            	    // InternalOCCI.g:545:4: ( (lv_constraints_21_0= ruleConstraint ) )
            	    // InternalOCCI.g:546:5: (lv_constraints_21_0= ruleConstraint )
            	    {
            	    // InternalOCCI.g:546:5: (lv_constraints_21_0= ruleConstraint )
            	    // InternalOCCI.g:547:6: lv_constraints_21_0= ruleConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getKindAccess().getConstraintsConstraintParserRuleCall_10_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_constraints_21_0=ruleConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getKindRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constraints",
            	    							lv_constraints_21_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.Constraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalOCCI.g:565:3: (otherlv_22= 'fsm' ( (lv_fsm_23_0= ruleFSM ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOCCI.g:566:4: otherlv_22= 'fsm' ( (lv_fsm_23_0= ruleFSM ) )
                    {
                    otherlv_22=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_22, grammarAccess.getKindAccess().getFsmKeyword_11_0());
                    			
                    // InternalOCCI.g:570:4: ( (lv_fsm_23_0= ruleFSM ) )
                    // InternalOCCI.g:571:5: (lv_fsm_23_0= ruleFSM )
                    {
                    // InternalOCCI.g:571:5: (lv_fsm_23_0= ruleFSM )
                    // InternalOCCI.g:572:6: lv_fsm_23_0= ruleFSM
                    {

                    						newCompositeNode(grammarAccess.getKindAccess().getFsmFSMParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fsm_23_0=ruleFSM();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKindRule());
                    						}
                    						set(
                    							current,
                    							"fsm",
                    							lv_fsm_23_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.FSM");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleMixin"
    // InternalOCCI.g:594:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // InternalOCCI.g:594:46: (iv_ruleMixin= ruleMixin EOF )
            // InternalOCCI.g:595:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // InternalOCCI.g:601:1: ruleMixin returns [EObject current=null] : (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )? otherlv_20= '{' otherlv_21= 'scheme' ( (lv_scheme_22_0= RULE_STRING ) ) (otherlv_23= 'title' ( (lv_title_24_0= RULE_STRING ) ) )? ( ( (lv_attributes_25_0= ruleAttribute ) ) | ( (lv_actions_26_0= ruleAction ) ) | ( (lv_constraints_27_0= ruleConstraint ) ) )* otherlv_28= '}' ) ;
    public final EObject ruleMixin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_scheme_22_0=null;
        Token otherlv_23=null;
        Token lv_title_24_0=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_16_0 = null;

        EObject lv_annotations_18_0 = null;

        EObject lv_attributes_25_0 = null;

        EObject lv_actions_26_0 = null;

        EObject lv_constraints_27_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:607:2: ( (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )? otherlv_20= '{' otherlv_21= 'scheme' ( (lv_scheme_22_0= RULE_STRING ) ) (otherlv_23= 'title' ( (lv_title_24_0= RULE_STRING ) ) )? ( ( (lv_attributes_25_0= ruleAttribute ) ) | ( (lv_actions_26_0= ruleAction ) ) | ( (lv_constraints_27_0= ruleConstraint ) ) )* otherlv_28= '}' ) )
            // InternalOCCI.g:608:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )? otherlv_20= '{' otherlv_21= 'scheme' ( (lv_scheme_22_0= RULE_STRING ) ) (otherlv_23= 'title' ( (lv_title_24_0= RULE_STRING ) ) )? ( ( (lv_attributes_25_0= ruleAttribute ) ) | ( (lv_actions_26_0= ruleAction ) ) | ( (lv_constraints_27_0= ruleConstraint ) ) )* otherlv_28= '}' )
            {
            // InternalOCCI.g:608:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )? otherlv_20= '{' otherlv_21= 'scheme' ( (lv_scheme_22_0= RULE_STRING ) ) (otherlv_23= 'title' ( (lv_title_24_0= RULE_STRING ) ) )? ( ( (lv_attributes_25_0= ruleAttribute ) ) | ( (lv_actions_26_0= ruleAction ) ) | ( (lv_constraints_27_0= ruleConstraint ) ) )* otherlv_28= '}' )
            // InternalOCCI.g:609:3: otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )? otherlv_20= '{' otherlv_21= 'scheme' ( (lv_scheme_22_0= RULE_STRING ) ) (otherlv_23= 'title' ( (lv_title_24_0= RULE_STRING ) ) )? ( ( (lv_attributes_25_0= ruleAttribute ) ) | ( (lv_actions_26_0= ruleAction ) ) | ( (lv_constraints_27_0= ruleConstraint ) ) )* otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMixinAccess().getMixinKeyword_0());
            		
            // InternalOCCI.g:613:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:614:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:614:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:615:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getMixinAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_1_0=ruleNameID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMixinRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.NameID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:632:3: (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOCCI.g:633:4: otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getMixinAccess().getDependsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalOCCI.g:641:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:642:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:642:5: ( ruleQualifiedID )
                    // InternalOCCI.g:643:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:657:4: (otherlv_5= ',' ( ( ruleQualifiedID ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalOCCI.g:658:5: otherlv_5= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_13); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMixinAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalOCCI.g:662:5: ( ( ruleQualifiedID ) )
                    	    // InternalOCCI.g:663:6: ( ruleQualifiedID )
                    	    {
                    	    // InternalOCCI.g:663:6: ( ruleQualifiedID )
                    	    // InternalOCCI.g:664:7: ruleQualifiedID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMixinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleQualifiedID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getMixinAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:684:3: (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOCCI.g:685:4: otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getMixinAccess().getAppliesKeyword_3_0());
                    			
                    otherlv_9=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalOCCI.g:693:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:694:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:694:5: ( ruleQualifiedID )
                    // InternalOCCI.g:695:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:709:4: (otherlv_11= ',' ( ( ruleQualifiedID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==24) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalOCCI.g:710:5: otherlv_11= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,24,FOLLOW_13); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMixinAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalOCCI.g:714:5: ( ( ruleQualifiedID ) )
                    	    // InternalOCCI.g:715:6: ( ruleQualifiedID )
                    	    {
                    	    // InternalOCCI.g:715:6: ( ruleQualifiedID )
                    	    // InternalOCCI.g:716:7: ruleQualifiedID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMixinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleQualifiedID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,32,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getMixinAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:736:3: (otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOCCI.g:737:4: otherlv_14= 'annotations' otherlv_15= '{' ( (lv_annotations_16_0= ruleAnnotation ) ) (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getMixinAccess().getAnnotationsKeyword_4_0());
                    			
                    otherlv_15=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_15, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalOCCI.g:745:4: ( (lv_annotations_16_0= ruleAnnotation ) )
                    // InternalOCCI.g:746:5: (lv_annotations_16_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:746:5: (lv_annotations_16_0= ruleAnnotation )
                    // InternalOCCI.g:747:6: lv_annotations_16_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_annotations_16_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMixinRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_16_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:764:4: (otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==24) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalOCCI.g:765:5: otherlv_17= ',' ( (lv_annotations_18_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,24,FOLLOW_18); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getMixinAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOCCI.g:769:5: ( (lv_annotations_18_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:770:6: (lv_annotations_18_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:770:6: (lv_annotations_18_0= ruleAnnotation )
                    	    // InternalOCCI.g:771:7: lv_annotations_18_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_annotations_18_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMixinRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_18_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_19, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_20, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_21=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_21, grammarAccess.getMixinAccess().getSchemeKeyword_6());
            		
            // InternalOCCI.g:802:3: ( (lv_scheme_22_0= RULE_STRING ) )
            // InternalOCCI.g:803:4: (lv_scheme_22_0= RULE_STRING )
            {
            // InternalOCCI.g:803:4: (lv_scheme_22_0= RULE_STRING )
            // InternalOCCI.g:804:5: lv_scheme_22_0= RULE_STRING
            {
            lv_scheme_22_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_scheme_22_0, grammarAccess.getMixinAccess().getSchemeSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scheme",
            						lv_scheme_22_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:820:3: (otherlv_23= 'title' ( (lv_title_24_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOCCI.g:821:4: otherlv_23= 'title' ( (lv_title_24_0= RULE_STRING ) )
                    {
                    otherlv_23=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_23, grammarAccess.getMixinAccess().getTitleKeyword_8_0());
                    			
                    // InternalOCCI.g:825:4: ( (lv_title_24_0= RULE_STRING ) )
                    // InternalOCCI.g:826:5: (lv_title_24_0= RULE_STRING )
                    {
                    // InternalOCCI.g:826:5: (lv_title_24_0= RULE_STRING )
                    // InternalOCCI.g:827:6: lv_title_24_0= RULE_STRING
                    {
                    lv_title_24_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    						newLeafNode(lv_title_24_0, grammarAccess.getMixinAccess().getTitleSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_24_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:844:3: ( ( (lv_attributes_25_0= ruleAttribute ) ) | ( (lv_actions_26_0= ruleAction ) ) | ( (lv_constraints_27_0= ruleConstraint ) ) )*
            loop21:
            do {
                int alt21=4;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    alt21=1;
                    }
                    break;
                case 42:
                    {
                    alt21=2;
                    }
                    break;
                case 43:
                    {
                    alt21=3;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalOCCI.g:845:4: ( (lv_attributes_25_0= ruleAttribute ) )
            	    {
            	    // InternalOCCI.g:845:4: ( (lv_attributes_25_0= ruleAttribute ) )
            	    // InternalOCCI.g:846:5: (lv_attributes_25_0= ruleAttribute )
            	    {
            	    // InternalOCCI.g:846:5: (lv_attributes_25_0= ruleAttribute )
            	    // InternalOCCI.g:847:6: lv_attributes_25_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_9_0_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_attributes_25_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMixinRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_25_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOCCI.g:865:4: ( (lv_actions_26_0= ruleAction ) )
            	    {
            	    // InternalOCCI.g:865:4: ( (lv_actions_26_0= ruleAction ) )
            	    // InternalOCCI.g:866:5: (lv_actions_26_0= ruleAction )
            	    {
            	    // InternalOCCI.g:866:5: (lv_actions_26_0= ruleAction )
            	    // InternalOCCI.g:867:6: lv_actions_26_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_actions_26_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMixinRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_26_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOCCI.g:885:4: ( (lv_constraints_27_0= ruleConstraint ) )
            	    {
            	    // InternalOCCI.g:885:4: ( (lv_constraints_27_0= ruleConstraint ) )
            	    // InternalOCCI.g:886:5: (lv_constraints_27_0= ruleConstraint )
            	    {
            	    // InternalOCCI.g:886:5: (lv_constraints_27_0= ruleConstraint )
            	    // InternalOCCI.g:887:6: lv_constraints_27_0= ruleConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getMixinAccess().getConstraintsConstraintParserRuleCall_9_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_constraints_27_0=ruleConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMixinRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constraints",
            	    							lv_constraints_27_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.Constraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_28=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleAnnotation"
    // InternalOCCI.g:913:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalOCCI.g:913:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalOCCI.g:914:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalOCCI.g:920:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'annotation' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= RULE_STRING ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_key_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalOCCI.g:926:2: ( (otherlv_0= 'annotation' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= RULE_STRING ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalOCCI.g:927:2: (otherlv_0= 'annotation' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= RULE_STRING ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalOCCI.g:927:2: (otherlv_0= 'annotation' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= RULE_STRING ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalOCCI.g:928:3: otherlv_0= 'annotation' otherlv_1= '{' otherlv_2= 'key' ( (lv_key_3_0= RULE_STRING ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getAnnotationKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getKeyKeyword_2());
            		
            // InternalOCCI.g:940:3: ( (lv_key_3_0= RULE_STRING ) )
            // InternalOCCI.g:941:4: (lv_key_3_0= RULE_STRING )
            {
            // InternalOCCI.g:941:4: (lv_key_3_0= RULE_STRING )
            // InternalOCCI.g:942:5: lv_key_3_0= RULE_STRING
            {
            lv_key_3_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_key_3_0, grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getValueKeyword_4());
            		
            // InternalOCCI.g:962:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalOCCI.g:963:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalOCCI.g:963:4: (lv_value_5_0= RULE_STRING )
            // InternalOCCI.g:964:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_value_5_0, grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAttribute"
    // InternalOCCI.g:988:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOCCI.g:988:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOCCI.g:989:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalOCCI.g:995:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mutable_1_0=null;
        Token lv_required_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_default_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_annotations_15_0 = null;

        EObject lv_annotations_17_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1001:2: ( (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) )
            // InternalOCCI.g:1002:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            {
            // InternalOCCI.g:1002:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            // InternalOCCI.g:1003:3: otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalOCCI.g:1007:3: ( (lv_mutable_1_0= 'mutable' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_ID||LA22_1==RULE_QUALIFIED_ID||LA22_1==12||(LA22_1>=14 && LA22_1<=15)||(LA22_1>=17 && LA22_1<=22)||(LA22_1>=26 && LA22_1<=27)||(LA22_1>=29 && LA22_1<=30)||(LA22_1>=33 && LA22_1<=40)||(LA22_1>=42 && LA22_1<=44)||(LA22_1>=53 && LA22_1<=73)||(LA22_1>=75 && LA22_1<=81)) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalOCCI.g:1008:4: (lv_mutable_1_0= 'mutable' )
                    {
                    // InternalOCCI.g:1008:4: (lv_mutable_1_0= 'mutable' )
                    // InternalOCCI.g:1009:5: lv_mutable_1_0= 'mutable'
                    {
                    lv_mutable_1_0=(Token)match(input,38,FOLLOW_13); 

                    					newLeafNode(lv_mutable_1_0, grammarAccess.getAttributeAccess().getMutableMutableKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1021:3: ( (lv_required_2_0= 'required' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_ID||LA23_1==RULE_QUALIFIED_ID||LA23_1==12||(LA23_1>=14 && LA23_1<=15)||(LA23_1>=17 && LA23_1<=22)||(LA23_1>=26 && LA23_1<=27)||(LA23_1>=29 && LA23_1<=30)||(LA23_1>=33 && LA23_1<=40)||(LA23_1>=42 && LA23_1<=44)||(LA23_1>=53 && LA23_1<=73)||(LA23_1>=75 && LA23_1<=81)) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalOCCI.g:1022:4: (lv_required_2_0= 'required' )
                    {
                    // InternalOCCI.g:1022:4: (lv_required_2_0= 'required' )
                    // InternalOCCI.g:1023:5: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,39,FOLLOW_13); 

                    					newLeafNode(lv_required_2_0, grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1035:3: ( (lv_name_3_0= ruleQualifiedID ) )
            // InternalOCCI.g:1036:4: (lv_name_3_0= ruleQualifiedID )
            {
            // InternalOCCI.g:1036:4: (lv_name_3_0= ruleQualifiedID )
            // InternalOCCI.g:1037:5: lv_name_3_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameQualifiedIDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleQualifiedID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.QualifiedID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4());
            		
            // InternalOCCI.g:1058:3: (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOCCI.g:1059:4: otherlv_5= 'type' ( ( ruleQualifiedID ) )
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getTypeKeyword_5_0());
                    			
                    // InternalOCCI.g:1063:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1064:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1064:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1065:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1080:3: (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOCCI.g:1081:4: otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getEqualsSignKeyword_6_0());
                    			
                    // InternalOCCI.g:1085:4: ( (lv_default_8_0= RULE_STRING ) )
                    // InternalOCCI.g:1086:5: (lv_default_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1086:5: (lv_default_8_0= RULE_STRING )
                    // InternalOCCI.g:1087:6: lv_default_8_0= RULE_STRING
                    {
                    lv_default_8_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_default_8_0, grammarAccess.getAttributeAccess().getDefaultSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1104:3: (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // InternalOCCI.g:1105:4: otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            otherlv_9=(Token)match(input,23,FOLLOW_35); 

            				newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_7_0());
            			
            // InternalOCCI.g:1109:4: (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOCCI.g:1110:5: otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,14,FOLLOW_5); 

                    					newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getDescriptionKeyword_7_1_0());
                    				
                    // InternalOCCI.g:1114:5: ( (lv_description_11_0= RULE_STRING ) )
                    // InternalOCCI.g:1115:6: (lv_description_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1115:6: (lv_description_11_0= RULE_STRING )
                    // InternalOCCI.g:1116:7: lv_description_11_0= RULE_STRING
                    {
                    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    							newLeafNode(lv_description_11_0, grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_7_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAttributeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"description",
                    								lv_description_11_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,25,FOLLOW_36); 

            				newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7_2());
            			

            }

            // InternalOCCI.g:1138:3: (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOCCI.g:1139:4: otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getAnnotationsKeyword_8_0());
                    			
                    otherlv_14=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalOCCI.g:1147:4: ( (lv_annotations_15_0= ruleAnnotation ) )
                    // InternalOCCI.g:1148:5: (lv_annotations_15_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1148:5: (lv_annotations_15_0= ruleAnnotation )
                    // InternalOCCI.g:1149:6: lv_annotations_15_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_annotations_15_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_15_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1166:4: (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==24) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalOCCI.g:1167:5: otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,24,FOLLOW_18); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalOCCI.g:1171:5: ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1172:6: (lv_annotations_17_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1172:6: (lv_annotations_17_0= ruleAnnotation )
                    	    // InternalOCCI.g:1173:7: lv_annotations_17_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_annotations_17_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_17_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAction"
    // InternalOCCI.g:1200:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalOCCI.g:1200:47: (iv_ruleAction= ruleAction EOF )
            // InternalOCCI.g:1201:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalOCCI.g:1207:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_scheme_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_title_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_annotations_15_0 = null;

        EObject lv_annotations_17_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1213:2: ( (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) )
            // InternalOCCI.g:1214:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            {
            // InternalOCCI.g:1214:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            // InternalOCCI.g:1215:3: otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalOCCI.g:1219:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1220:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1220:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1221:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_1_0=ruleNameID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.NameID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getSchemeKeyword_2());
            		
            // InternalOCCI.g:1242:3: ( (lv_scheme_3_0= RULE_STRING ) )
            // InternalOCCI.g:1243:4: (lv_scheme_3_0= RULE_STRING )
            {
            // InternalOCCI.g:1243:4: (lv_scheme_3_0= RULE_STRING )
            // InternalOCCI.g:1244:5: lv_scheme_3_0= RULE_STRING
            {
            lv_scheme_3_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_scheme_3_0, grammarAccess.getActionAccess().getSchemeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scheme",
            						lv_scheme_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:1260:3: (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOCCI.g:1261:4: otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalOCCI.g:1265:4: ( (lv_attributes_5_0= ruleParameterDecl ) )
                    // InternalOCCI.g:1266:5: (lv_attributes_5_0= ruleParameterDecl )
                    {
                    // InternalOCCI.g:1266:5: (lv_attributes_5_0= ruleParameterDecl )
                    // InternalOCCI.g:1267:6: lv_attributes_5_0= ruleParameterDecl
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_attributes_5_0=ruleParameterDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_5_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.ParameterDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1284:4: (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==24) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalOCCI.g:1285:5: otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_13); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getActionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOCCI.g:1289:5: ( (lv_attributes_7_0= ruleParameterDecl ) )
                    	    // InternalOCCI.g:1290:6: (lv_attributes_7_0= ruleParameterDecl )
                    	    {
                    	    // InternalOCCI.g:1290:6: (lv_attributes_7_0= ruleParameterDecl )
                    	    // InternalOCCI.g:1291:7: lv_attributes_7_0= ruleParameterDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_attributes_7_0=ruleParameterDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_7_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.ParameterDecl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,32,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1314:3: (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOCCI.g:1315:4: otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_39); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getActionAccess().getTitleKeyword_5_1());
                    			
                    // InternalOCCI.g:1323:4: ( (lv_title_11_0= RULE_STRING ) )
                    // InternalOCCI.g:1324:5: (lv_title_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1324:5: (lv_title_11_0= RULE_STRING )
                    // InternalOCCI.g:1325:6: lv_title_11_0= RULE_STRING
                    {
                    lv_title_11_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_title_11_0, grammarAccess.getActionAccess().getTitleSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,25,FOLLOW_36); 

                    				newLeafNode(otherlv_12, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1346:3: (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOCCI.g:1347:4: otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionAccess().getAnnotationsKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOCCI.g:1355:4: ( (lv_annotations_15_0= ruleAnnotation ) )
                    // InternalOCCI.g:1356:5: (lv_annotations_15_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1356:5: (lv_annotations_15_0= ruleAnnotation )
                    // InternalOCCI.g:1357:6: lv_annotations_15_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_annotations_15_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_15_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1374:4: (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==24) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalOCCI.g:1375:5: otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,24,FOLLOW_18); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getActionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOCCI.g:1379:5: ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1380:6: (lv_annotations_17_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1380:6: (lv_annotations_17_0= ruleAnnotation )
                    	    // InternalOCCI.g:1381:7: lv_annotations_17_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_annotations_17_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_17_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleParameterDecl"
    // InternalOCCI.g:1408:1: entryRuleParameterDecl returns [EObject current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final EObject entryRuleParameterDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDecl = null;


        try {
            // InternalOCCI.g:1408:54: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalOCCI.g:1409:2: iv_ruleParameterDecl= ruleParameterDecl EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDecl=ruleParameterDecl();

            state._fsp--;

             current =iv_ruleParameterDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDecl"


    // $ANTLR start "ruleParameterDecl"
    // InternalOCCI.g:1415:1: ruleParameterDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleParameterDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_default_4_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1421:2: ( ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:1422:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:1422:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:1423:3: ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            {
            // InternalOCCI.g:1423:3: ( (lv_name_0_0= ruleQualifiedID ) )
            // InternalOCCI.g:1424:4: (lv_name_0_0= ruleQualifiedID )
            {
            // InternalOCCI.g:1424:4: (lv_name_0_0= ruleQualifiedID )
            // InternalOCCI.g:1425:5: lv_name_0_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getParameterDeclAccess().getNameQualifiedIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleQualifiedID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterDeclRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.QualifiedID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDeclAccess().getColonKeyword_1());
            		
            // InternalOCCI.g:1446:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:1447:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:1447:4: ( ruleQualifiedID )
            // InternalOCCI.g:1448:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterDeclRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterDeclAccess().getTypeDataTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_40);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:1462:3: (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOCCI.g:1463:4: otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDeclAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalOCCI.g:1467:4: ( (lv_default_4_0= RULE_STRING ) )
                    // InternalOCCI.g:1468:5: (lv_default_4_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1468:5: (lv_default_4_0= RULE_STRING )
                    // InternalOCCI.g:1469:6: lv_default_4_0= RULE_STRING
                    {
                    lv_default_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_default_4_0, grammarAccess.getParameterDeclAccess().getDefaultSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDecl"


    // $ANTLR start "entryRuleConstraint"
    // InternalOCCI.g:1490:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalOCCI.g:1490:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalOCCI.g:1491:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalOCCI.g:1497:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token lv_body_5_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1503:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) )
            // InternalOCCI.g:1504:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            {
            // InternalOCCI.g:1504:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            // InternalOCCI.g:1505:3: otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalOCCI.g:1509:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1510:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1510:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1511:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_41);
            lv_name_1_0=ruleNameID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.NameID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:1528:3: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOCCI.g:1529:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalOCCI.g:1533:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalOCCI.g:1534:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1534:5: (lv_description_3_0= RULE_STRING )
                    // InternalOCCI.g:1535:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

                    						newLeafNode(lv_description_3_0, grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getBodyKeyword_3());
            		
            // InternalOCCI.g:1556:3: ( (lv_body_5_0= RULE_STRING ) )
            // InternalOCCI.g:1557:4: (lv_body_5_0= RULE_STRING )
            {
            // InternalOCCI.g:1557:4: (lv_body_5_0= RULE_STRING )
            // InternalOCCI.g:1558:5: lv_body_5_0= RULE_STRING
            {
            lv_body_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_body_5_0, grammarAccess.getConstraintAccess().getBodySTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleFSM"
    // InternalOCCI.g:1578:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalOCCI.g:1578:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalOCCI.g:1579:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalOCCI.g:1585:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_ownedState_6_0 = null;

        EObject lv_ownedState_8_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1591:2: ( (otherlv_0= 'FSM' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalOCCI.g:1592:2: (otherlv_0= 'FSM' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalOCCI.g:1592:2: (otherlv_0= 'FSM' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalOCCI.g:1593:3: otherlv_0= 'FSM' otherlv_1= '{' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFSMAccess().getAttributeKeyword_2());
            		
            // InternalOCCI.g:1605:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:1606:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:1606:4: ( ruleQualifiedID )
            // InternalOCCI.g:1607:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFSMRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFSMAccess().getAttributeAttributeCrossReference_3_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:1621:3: (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOCCI.g:1622:4: otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getFSMAccess().getStatesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,23,FOLLOW_45); 

                    				newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalOCCI.g:1630:4: ( (lv_ownedState_6_0= ruleState ) )
                    // InternalOCCI.g:1631:5: (lv_ownedState_6_0= ruleState )
                    {
                    // InternalOCCI.g:1631:5: (lv_ownedState_6_0= ruleState )
                    // InternalOCCI.g:1632:6: lv_ownedState_6_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_ownedState_6_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    						}
                    						add(
                    							current,
                    							"ownedState",
                    							lv_ownedState_6_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1649:4: (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==24) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalOCCI.g:1650:5: otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) )
                    	    {
                    	    otherlv_7=(Token)match(input,24,FOLLOW_45); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOCCI.g:1654:5: ( (lv_ownedState_8_0= ruleState ) )
                    	    // InternalOCCI.g:1655:6: (lv_ownedState_8_0= ruleState )
                    	    {
                    	    // InternalOCCI.g:1655:6: (lv_ownedState_8_0= ruleState )
                    	    // InternalOCCI.g:1656:7: lv_ownedState_8_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_ownedState_8_0=ruleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFSMRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ownedState",
                    	    								lv_ownedState_8_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.State");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,25,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalOCCI.g:1687:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalOCCI.g:1687:46: (iv_ruleState= ruleState EOF )
            // InternalOCCI.g:1688:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalOCCI.g:1694:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' otherlv_1= '{' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_initial_2_0=null;
        Token lv_final_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_outgoingTransition_8_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1700:2: ( (otherlv_0= 'State' otherlv_1= '{' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalOCCI.g:1701:2: (otherlv_0= 'State' otherlv_1= '{' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalOCCI.g:1701:2: (otherlv_0= 'State' otherlv_1= '{' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalOCCI.g:1702:3: otherlv_0= 'State' otherlv_1= '{' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalOCCI.g:1710:3: ( (lv_initial_2_0= 'initial' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOCCI.g:1711:4: (lv_initial_2_0= 'initial' )
                    {
                    // InternalOCCI.g:1711:4: (lv_initial_2_0= 'initial' )
                    // InternalOCCI.g:1712:5: lv_initial_2_0= 'initial'
                    {
                    lv_initial_2_0=(Token)match(input,48,FOLLOW_47); 

                    					newLeafNode(lv_initial_2_0, grammarAccess.getStateAccess().getInitialInitialKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1724:3: ( (lv_final_3_0= 'final' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOCCI.g:1725:4: (lv_final_3_0= 'final' )
                    {
                    // InternalOCCI.g:1725:4: (lv_final_3_0= 'final' )
                    // InternalOCCI.g:1726:5: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,49,FOLLOW_48); 

                    					newLeafNode(lv_final_3_0, grammarAccess.getStateAccess().getFinalFinalKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1738:3: (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:1739:4: otherlv_4= 'literal' ( ( ruleQualifiedID ) )
            {
            otherlv_4=(Token)match(input,50,FOLLOW_13); 

            				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLiteralKeyword_4_0());
            			
            // InternalOCCI.g:1743:4: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:1744:5: ( ruleQualifiedID )
            {
            // InternalOCCI.g:1744:5: ( ruleQualifiedID )
            // InternalOCCI.g:1745:6: ruleQualifiedID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getStateRule());
            						}
            					

            						newCompositeNode(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_4_1_0());
            					
            pushFollow(FOLLOW_49);
            ruleQualifiedID();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOCCI.g:1760:3: (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) )* otherlv_9= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOCCI.g:1761:4: otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) )* otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getTransitionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,31,FOLLOW_50); 

                    				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalOCCI.g:1769:4: ( (lv_outgoingTransition_8_0= ruleTransition ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==42||LA40_0==52) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalOCCI.g:1770:5: (lv_outgoingTransition_8_0= ruleTransition )
                    	    {
                    	    // InternalOCCI.g:1770:5: (lv_outgoingTransition_8_0= ruleTransition )
                    	    // InternalOCCI.g:1771:6: lv_outgoingTransition_8_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_50);
                    	    lv_outgoingTransition_8_0=ruleTransition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outgoingTransition",
                    	    							lv_outgoingTransition_8_0,
                    	    							"org.eclipse.cmf.occi.core.xtext.OCCI.Transition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,32,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalOCCI.g:1801:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalOCCI.g:1801:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalOCCI.g:1802:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalOCCI.g:1808:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOCCI.g:1814:2: ( ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) )
            // InternalOCCI.g:1815:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            {
            // InternalOCCI.g:1815:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:1816:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:1816:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOCCI.g:1817:4: otherlv_0= 'action' ( ( ruleQualifiedID ) )
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getActionKeyword_0_0());
                    			
                    // InternalOCCI.g:1821:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1822:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1822:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1823:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getActionActionCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,52,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToKeyword_1());
            		
            // InternalOCCI.g:1842:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:1843:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:1843:4: ( ruleQualifiedID )
            // InternalOCCI.g:1844:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleDataType"
    // InternalOCCI.g:1862:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalOCCI.g:1862:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalOCCI.g:1863:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalOCCI.g:1869:1: ruleDataType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_EObjectType_1 = null;

        EObject this_BooleanType_2 = null;

        EObject this_NumericType_3 = null;

        EObject this_EnumerationType_4 = null;

        EObject this_RecordType_5 = null;

        EObject this_ArrayType_6 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1875:2: ( (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) )
            // InternalOCCI.g:1876:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            {
            // InternalOCCI.g:1876:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            int alt43=7;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt43=1;
                }
                break;
            case 59:
                {
                alt43=2;
                }
                break;
            case 61:
                {
                alt43=3;
                }
                break;
            case 62:
                {
                alt43=4;
                }
                break;
            case 68:
                {
                alt43=5;
                }
                break;
            case 70:
                {
                alt43=6;
                }
                break;
            case 73:
                {
                alt43=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalOCCI.g:1877:3: this_StringType_0= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getStringTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_0=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:1886:3: this_EObjectType_1= ruleEObjectType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getEObjectTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EObjectType_1=ruleEObjectType();

                    state._fsp--;


                    			current = this_EObjectType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:1895:3: this_BooleanType_2= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getBooleanTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_2=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOCCI.g:1904:3: this_NumericType_3= ruleNumericType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getNumericTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericType_3=ruleNumericType();

                    state._fsp--;


                    			current = this_NumericType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOCCI.g:1913:3: this_EnumerationType_4= ruleEnumerationType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getEnumerationTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumerationType_4=ruleEnumerationType();

                    state._fsp--;


                    			current = this_EnumerationType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOCCI.g:1922:3: this_RecordType_5= ruleRecordType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getRecordTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RecordType_5=ruleRecordType();

                    state._fsp--;


                    			current = this_RecordType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOCCI.g:1931:3: this_ArrayType_6= ruleArrayType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getArrayTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayType_6=ruleArrayType();

                    state._fsp--;


                    			current = this_ArrayType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleStringType"
    // InternalOCCI.g:1943:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalOCCI.g:1943:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalOCCI.g:1944:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalOCCI.g:1950:1: ruleStringType returns [EObject current=null] : (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? (otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) )? (otherlv_7= 'length' ( (lv_length_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'minLength' ( (lv_minLength_10_0= ruleEIntegerObject ) ) )? (otherlv_11= 'maxLength' ( (lv_maxLength_12_0= ruleEIntegerObject ) ) )? otherlv_13= ')' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_documentation_4_0=null;
        Token otherlv_5=null;
        Token lv_pattern_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_length_8_0 = null;

        AntlrDatatypeRuleToken lv_minLength_10_0 = null;

        AntlrDatatypeRuleToken lv_maxLength_12_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1956:2: ( (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? (otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) )? (otherlv_7= 'length' ( (lv_length_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'minLength' ( (lv_minLength_10_0= ruleEIntegerObject ) ) )? (otherlv_11= 'maxLength' ( (lv_maxLength_12_0= ruleEIntegerObject ) ) )? otherlv_13= ')' ) )
            // InternalOCCI.g:1957:2: (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? (otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) )? (otherlv_7= 'length' ( (lv_length_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'minLength' ( (lv_minLength_10_0= ruleEIntegerObject ) ) )? (otherlv_11= 'maxLength' ( (lv_maxLength_12_0= ruleEIntegerObject ) ) )? otherlv_13= ')' )
            {
            // InternalOCCI.g:1957:2: (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? (otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) )? (otherlv_7= 'length' ( (lv_length_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'minLength' ( (lv_minLength_10_0= ruleEIntegerObject ) ) )? (otherlv_11= 'maxLength' ( (lv_maxLength_12_0= ruleEIntegerObject ) ) )? otherlv_13= ')' )
            // InternalOCCI.g:1958:3: otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? (otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) )? (otherlv_7= 'length' ( (lv_length_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'minLength' ( (lv_minLength_10_0= ruleEIntegerObject ) ) )? (otherlv_11= 'maxLength' ( (lv_maxLength_12_0= ruleEIntegerObject ) ) )? otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStringTypeAccess().getStringTypeKeyword_0());
            		
            // InternalOCCI.g:1962:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:1963:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:1963:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:1964:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStringTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOCCI.g:1984:3: (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOCCI.g:1985:4: otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringTypeAccess().getDocumentationKeyword_3_0());
                    			
                    // InternalOCCI.g:1989:4: ( (lv_documentation_4_0= RULE_STRING ) )
                    // InternalOCCI.g:1990:5: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1990:5: (lv_documentation_4_0= RULE_STRING )
                    // InternalOCCI.g:1991:6: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

                    						newLeafNode(lv_documentation_4_0, grammarAccess.getStringTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2008:3: (otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOCCI.g:2009:4: otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getStringTypeAccess().getPatternKeyword_4_0());
                    			
                    // InternalOCCI.g:2013:4: ( (lv_pattern_6_0= RULE_STRING ) )
                    // InternalOCCI.g:2014:5: (lv_pattern_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2014:5: (lv_pattern_6_0= RULE_STRING )
                    // InternalOCCI.g:2015:6: lv_pattern_6_0= RULE_STRING
                    {
                    lv_pattern_6_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

                    						newLeafNode(lv_pattern_6_0, grammarAccess.getStringTypeAccess().getPatternSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pattern",
                    							lv_pattern_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2032:3: (otherlv_7= 'length' ( (lv_length_8_0= ruleEIntegerObject ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOCCI.g:2033:4: otherlv_7= 'length' ( (lv_length_8_0= ruleEIntegerObject ) )
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getStringTypeAccess().getLengthKeyword_5_0());
                    			
                    // InternalOCCI.g:2037:4: ( (lv_length_8_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2038:5: (lv_length_8_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2038:5: (lv_length_8_0= ruleEIntegerObject )
                    // InternalOCCI.g:2039:6: lv_length_8_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getLengthEIntegerObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_length_8_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"length",
                    							lv_length_8_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2057:3: (otherlv_9= 'minLength' ( (lv_minLength_10_0= ruleEIntegerObject ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOCCI.g:2058:4: otherlv_9= 'minLength' ( (lv_minLength_10_0= ruleEIntegerObject ) )
                    {
                    otherlv_9=(Token)match(input,57,FOLLOW_55); 

                    				newLeafNode(otherlv_9, grammarAccess.getStringTypeAccess().getMinLengthKeyword_6_0());
                    			
                    // InternalOCCI.g:2062:4: ( (lv_minLength_10_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2063:5: (lv_minLength_10_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2063:5: (lv_minLength_10_0= ruleEIntegerObject )
                    // InternalOCCI.g:2064:6: lv_minLength_10_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMinLengthEIntegerObjectParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_minLength_10_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"minLength",
                    							lv_minLength_10_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2082:3: (otherlv_11= 'maxLength' ( (lv_maxLength_12_0= ruleEIntegerObject ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOCCI.g:2083:4: otherlv_11= 'maxLength' ( (lv_maxLength_12_0= ruleEIntegerObject ) )
                    {
                    otherlv_11=(Token)match(input,58,FOLLOW_55); 

                    				newLeafNode(otherlv_11, grammarAccess.getStringTypeAccess().getMaxLengthKeyword_7_0());
                    			
                    // InternalOCCI.g:2087:4: ( (lv_maxLength_12_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2088:5: (lv_maxLength_12_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2088:5: (lv_maxLength_12_0= ruleEIntegerObject )
                    // InternalOCCI.g:2089:6: lv_maxLength_12_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMaxLengthEIntegerObjectParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_maxLength_12_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"maxLength",
                    							lv_maxLength_12_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getStringTypeAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleEObjectType"
    // InternalOCCI.g:2115:1: entryRuleEObjectType returns [EObject current=null] : iv_ruleEObjectType= ruleEObjectType EOF ;
    public final EObject entryRuleEObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectType = null;


        try {
            // InternalOCCI.g:2115:52: (iv_ruleEObjectType= ruleEObjectType EOF )
            // InternalOCCI.g:2116:2: iv_ruleEObjectType= ruleEObjectType EOF
            {
             newCompositeNode(grammarAccess.getEObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEObjectType=ruleEObjectType();

            state._fsp--;

             current =iv_ruleEObjectType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEObjectType"


    // $ANTLR start "ruleEObjectType"
    // InternalOCCI.g:2122:1: ruleEObjectType returns [EObject current=null] : (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? (otherlv_5= 'instanceClassName' ( (lv_instanceClassName_6_0= RULE_STRING ) ) )? otherlv_7= ')' ) ;
    public final EObject ruleEObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_documentation_4_0=null;
        Token otherlv_5=null;
        Token lv_instanceClassName_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalOCCI.g:2128:2: ( (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? (otherlv_5= 'instanceClassName' ( (lv_instanceClassName_6_0= RULE_STRING ) ) )? otherlv_7= ')' ) )
            // InternalOCCI.g:2129:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? (otherlv_5= 'instanceClassName' ( (lv_instanceClassName_6_0= RULE_STRING ) ) )? otherlv_7= ')' )
            {
            // InternalOCCI.g:2129:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? (otherlv_5= 'instanceClassName' ( (lv_instanceClassName_6_0= RULE_STRING ) ) )? otherlv_7= ')' )
            // InternalOCCI.g:2130:3: otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? (otherlv_5= 'instanceClassName' ( (lv_instanceClassName_6_0= RULE_STRING ) ) )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEObjectTypeAccess().getEObjectTypeKeyword_0());
            		
            // InternalOCCI.g:2134:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:2135:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:2135:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:2136:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEObjectTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEObjectTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getEObjectTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOCCI.g:2156:3: (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==54) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOCCI.g:2157:4: otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getEObjectTypeAccess().getDocumentationKeyword_3_0());
                    			
                    // InternalOCCI.g:2161:4: ( (lv_documentation_4_0= RULE_STRING ) )
                    // InternalOCCI.g:2162:5: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2162:5: (lv_documentation_4_0= RULE_STRING )
                    // InternalOCCI.g:2163:6: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

                    						newLeafNode(lv_documentation_4_0, grammarAccess.getEObjectTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEObjectTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2180:3: (otherlv_5= 'instanceClassName' ( (lv_instanceClassName_6_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==60) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalOCCI.g:2181:4: otherlv_5= 'instanceClassName' ( (lv_instanceClassName_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,60,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getEObjectTypeAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalOCCI.g:2185:4: ( (lv_instanceClassName_6_0= RULE_STRING ) )
                    // InternalOCCI.g:2186:5: (lv_instanceClassName_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2186:5: (lv_instanceClassName_6_0= RULE_STRING )
                    // InternalOCCI.g:2187:6: lv_instanceClassName_6_0= RULE_STRING
                    {
                    lv_instanceClassName_6_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    						newLeafNode(lv_instanceClassName_6_0, grammarAccess.getEObjectTypeAccess().getInstanceClassNameSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEObjectTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEObjectTypeAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEObjectType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalOCCI.g:2212:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalOCCI.g:2212:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalOCCI.g:2213:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalOCCI.g:2219:1: ruleBooleanType returns [EObject current=null] : (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_documentation_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalOCCI.g:2225:2: ( (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? otherlv_5= ')' ) )
            // InternalOCCI.g:2226:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? otherlv_5= ')' )
            {
            // InternalOCCI.g:2226:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? otherlv_5= ')' )
            // InternalOCCI.g:2227:3: otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_0());
            		
            // InternalOCCI.g:2231:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:2232:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:2232:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:2233:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBooleanTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getBooleanTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOCCI.g:2253:3: (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==54) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOCCI.g:2254:4: otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanTypeAccess().getDocumentationKeyword_3_0());
                    			
                    // InternalOCCI.g:2258:4: ( (lv_documentation_4_0= RULE_STRING ) )
                    // InternalOCCI.g:2259:5: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2259:5: (lv_documentation_4_0= RULE_STRING )
                    // InternalOCCI.g:2260:6: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    						newLeafNode(lv_documentation_4_0, grammarAccess.getBooleanTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBooleanTypeAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleNumericType"
    // InternalOCCI.g:2285:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // InternalOCCI.g:2285:52: (iv_ruleNumericType= ruleNumericType EOF )
            // InternalOCCI.g:2286:2: iv_ruleNumericType= ruleNumericType EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;

             current =iv_ruleNumericType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // InternalOCCI.g:2292:1: ruleNumericType returns [EObject current=null] : (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) )? (otherlv_7= 'totalDigits' ( (lv_totalDigits_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'minExclusive' ( (lv_minExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'maxExclusive' ( (lv_maxExclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'minInclusive' ( (lv_minInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'maxInclusive' ( (lv_maxInclusive_16_0= RULE_STRING ) ) )? otherlv_17= ')' ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_documentation_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_minExclusive_10_0=null;
        Token otherlv_11=null;
        Token lv_maxExclusive_12_0=null;
        Token otherlv_13=null;
        Token lv_minInclusive_14_0=null;
        Token otherlv_15=null;
        Token lv_maxInclusive_16_0=null;
        Token otherlv_17=null;
        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_totalDigits_8_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2298:2: ( (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) )? (otherlv_7= 'totalDigits' ( (lv_totalDigits_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'minExclusive' ( (lv_minExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'maxExclusive' ( (lv_maxExclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'minInclusive' ( (lv_minInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'maxInclusive' ( (lv_maxInclusive_16_0= RULE_STRING ) ) )? otherlv_17= ')' ) )
            // InternalOCCI.g:2299:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) )? (otherlv_7= 'totalDigits' ( (lv_totalDigits_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'minExclusive' ( (lv_minExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'maxExclusive' ( (lv_maxExclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'minInclusive' ( (lv_minInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'maxInclusive' ( (lv_maxInclusive_16_0= RULE_STRING ) ) )? otherlv_17= ')' )
            {
            // InternalOCCI.g:2299:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) )? (otherlv_7= 'totalDigits' ( (lv_totalDigits_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'minExclusive' ( (lv_minExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'maxExclusive' ( (lv_maxExclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'minInclusive' ( (lv_minInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'maxInclusive' ( (lv_maxInclusive_16_0= RULE_STRING ) ) )? otherlv_17= ')' )
            // InternalOCCI.g:2300:3: otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) )? (otherlv_7= 'totalDigits' ( (lv_totalDigits_8_0= ruleEIntegerObject ) ) )? (otherlv_9= 'minExclusive' ( (lv_minExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'maxExclusive' ( (lv_maxExclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'minInclusive' ( (lv_minInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'maxInclusive' ( (lv_maxInclusive_16_0= RULE_STRING ) ) )? otherlv_17= ')'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNumericTypeAccess().getNumericTypeKeyword_0());
            		
            // InternalOCCI.g:2304:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:2305:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:2305:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:2306:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_62); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNumericTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumericTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericTypeAccess().getTypeKeyword_2());
            		
            // InternalOCCI.g:2326:3: ( (lv_type_3_0= ruleNumericTypeEnum ) )
            // InternalOCCI.g:2327:4: (lv_type_3_0= ruleNumericTypeEnum )
            {
            // InternalOCCI.g:2327:4: (lv_type_3_0= ruleNumericTypeEnum )
            // InternalOCCI.g:2328:5: lv_type_3_0= ruleNumericTypeEnum
            {

            					newCompositeNode(grammarAccess.getNumericTypeAccess().getTypeNumericTypeEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_type_3_0=ruleNumericTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumericTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.NumericTypeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_64); 

            			newLeafNode(otherlv_4, grammarAccess.getNumericTypeAccess().getLeftParenthesisKeyword_4());
            		
            // InternalOCCI.g:2349:3: (otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==54) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOCCI.g:2350:4: otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getNumericTypeAccess().getDocumentationKeyword_5_0());
                    			
                    // InternalOCCI.g:2354:4: ( (lv_documentation_6_0= RULE_STRING ) )
                    // InternalOCCI.g:2355:5: (lv_documentation_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2355:5: (lv_documentation_6_0= RULE_STRING )
                    // InternalOCCI.g:2356:6: lv_documentation_6_0= RULE_STRING
                    {
                    lv_documentation_6_0=(Token)match(input,RULE_STRING,FOLLOW_65); 

                    						newLeafNode(lv_documentation_6_0, grammarAccess.getNumericTypeAccess().getDocumentationSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2373:3: (otherlv_7= 'totalDigits' ( (lv_totalDigits_8_0= ruleEIntegerObject ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==63) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOCCI.g:2374:4: otherlv_7= 'totalDigits' ( (lv_totalDigits_8_0= ruleEIntegerObject ) )
                    {
                    otherlv_7=(Token)match(input,63,FOLLOW_55); 

                    				newLeafNode(otherlv_7, grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_6_0());
                    			
                    // InternalOCCI.g:2378:4: ( (lv_totalDigits_8_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2379:5: (lv_totalDigits_8_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2379:5: (lv_totalDigits_8_0= ruleEIntegerObject )
                    // InternalOCCI.g:2380:6: lv_totalDigits_8_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getNumericTypeAccess().getTotalDigitsEIntegerObjectParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_totalDigits_8_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                    						}
                    						set(
                    							current,
                    							"totalDigits",
                    							lv_totalDigits_8_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2398:3: (otherlv_9= 'minExclusive' ( (lv_minExclusive_10_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==64) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOCCI.g:2399:4: otherlv_9= 'minExclusive' ( (lv_minExclusive_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,64,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_7_0());
                    			
                    // InternalOCCI.g:2403:4: ( (lv_minExclusive_10_0= RULE_STRING ) )
                    // InternalOCCI.g:2404:5: (lv_minExclusive_10_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2404:5: (lv_minExclusive_10_0= RULE_STRING )
                    // InternalOCCI.g:2405:6: lv_minExclusive_10_0= RULE_STRING
                    {
                    lv_minExclusive_10_0=(Token)match(input,RULE_STRING,FOLLOW_67); 

                    						newLeafNode(lv_minExclusive_10_0, grammarAccess.getNumericTypeAccess().getMinExclusiveSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minExclusive",
                    							lv_minExclusive_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2422:3: (otherlv_11= 'maxExclusive' ( (lv_maxExclusive_12_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==65) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOCCI.g:2423:4: otherlv_11= 'maxExclusive' ( (lv_maxExclusive_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,65,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_8_0());
                    			
                    // InternalOCCI.g:2427:4: ( (lv_maxExclusive_12_0= RULE_STRING ) )
                    // InternalOCCI.g:2428:5: (lv_maxExclusive_12_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2428:5: (lv_maxExclusive_12_0= RULE_STRING )
                    // InternalOCCI.g:2429:6: lv_maxExclusive_12_0= RULE_STRING
                    {
                    lv_maxExclusive_12_0=(Token)match(input,RULE_STRING,FOLLOW_68); 

                    						newLeafNode(lv_maxExclusive_12_0, grammarAccess.getNumericTypeAccess().getMaxExclusiveSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxExclusive",
                    							lv_maxExclusive_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2446:3: (otherlv_13= 'minInclusive' ( (lv_minInclusive_14_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==66) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOCCI.g:2447:4: otherlv_13= 'minInclusive' ( (lv_minInclusive_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,66,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_9_0());
                    			
                    // InternalOCCI.g:2451:4: ( (lv_minInclusive_14_0= RULE_STRING ) )
                    // InternalOCCI.g:2452:5: (lv_minInclusive_14_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2452:5: (lv_minInclusive_14_0= RULE_STRING )
                    // InternalOCCI.g:2453:6: lv_minInclusive_14_0= RULE_STRING
                    {
                    lv_minInclusive_14_0=(Token)match(input,RULE_STRING,FOLLOW_69); 

                    						newLeafNode(lv_minInclusive_14_0, grammarAccess.getNumericTypeAccess().getMinInclusiveSTRINGTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minInclusive",
                    							lv_minInclusive_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2470:3: (otherlv_15= 'maxInclusive' ( (lv_maxInclusive_16_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==67) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOCCI.g:2471:4: otherlv_15= 'maxInclusive' ( (lv_maxInclusive_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,67,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_10_0());
                    			
                    // InternalOCCI.g:2475:4: ( (lv_maxInclusive_16_0= RULE_STRING ) )
                    // InternalOCCI.g:2476:5: (lv_maxInclusive_16_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2476:5: (lv_maxInclusive_16_0= RULE_STRING )
                    // InternalOCCI.g:2477:6: lv_maxInclusive_16_0= RULE_STRING
                    {
                    lv_maxInclusive_16_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    						newLeafNode(lv_maxInclusive_16_0, grammarAccess.getNumericTypeAccess().getMaxInclusiveSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxInclusive",
                    							lv_maxInclusive_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getNumericTypeAccess().getRightParenthesisKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleEnumerationType"
    // InternalOCCI.g:2502:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // InternalOCCI.g:2502:56: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // InternalOCCI.g:2503:2: iv_ruleEnumerationType= ruleEnumerationType EOF
            {
             newCompositeNode(grammarAccess.getEnumerationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationType=ruleEnumerationType();

            state._fsp--;

             current =iv_ruleEnumerationType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationType"


    // $ANTLR start "ruleEnumerationType"
    // InternalOCCI.g:2509:1: ruleEnumerationType returns [EObject current=null] : (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'literals' otherlv_4= '(' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= ')' (otherlv_9= 'documentation' ( (lv_documentation_10_0= RULE_STRING ) ) )? otherlv_11= ')' ) ;
    public final EObject ruleEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_documentation_10_0=null;
        Token otherlv_11=null;
        EObject lv_literals_5_0 = null;

        EObject lv_literals_7_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2515:2: ( (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'literals' otherlv_4= '(' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= ')' (otherlv_9= 'documentation' ( (lv_documentation_10_0= RULE_STRING ) ) )? otherlv_11= ')' ) )
            // InternalOCCI.g:2516:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'literals' otherlv_4= '(' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= ')' (otherlv_9= 'documentation' ( (lv_documentation_10_0= RULE_STRING ) ) )? otherlv_11= ')' )
            {
            // InternalOCCI.g:2516:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'literals' otherlv_4= '(' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= ')' (otherlv_9= 'documentation' ( (lv_documentation_10_0= RULE_STRING ) ) )? otherlv_11= ')' )
            // InternalOCCI.g:2517:3: otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'literals' otherlv_4= '(' ( (lv_literals_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= ')' (otherlv_9= 'documentation' ( (lv_documentation_10_0= RULE_STRING ) ) )? otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0());
            		
            // InternalOCCI.g:2521:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:2522:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:2522:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:2523:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,69,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_4());
            		
            // InternalOCCI.g:2551:3: ( (lv_literals_5_0= ruleEnumerationLiteral ) )
            // InternalOCCI.g:2552:4: (lv_literals_5_0= ruleEnumerationLiteral )
            {
            // InternalOCCI.g:2552:4: (lv_literals_5_0= ruleEnumerationLiteral )
            // InternalOCCI.g:2553:5: lv_literals_5_0= ruleEnumerationLiteral
            {

            					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_literals_5_0=ruleEnumerationLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            					}
            					add(
            						current,
            						"literals",
            						lv_literals_5_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.EnumerationLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2570:3: (otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==24) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalOCCI.g:2571:4: otherlv_6= ',' ( (lv_literals_7_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_10); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEnumerationTypeAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalOCCI.g:2575:4: ( (lv_literals_7_0= ruleEnumerationLiteral ) )
            	    // InternalOCCI.g:2576:5: (lv_literals_7_0= ruleEnumerationLiteral )
            	    {
            	    // InternalOCCI.g:2576:5: (lv_literals_7_0= ruleEnumerationLiteral )
            	    // InternalOCCI.g:2577:6: lv_literals_7_0= ruleEnumerationLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_literals_7_0=ruleEnumerationLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"literals",
            	    							lv_literals_7_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.EnumerationLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_8=(Token)match(input,32,FOLLOW_61); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_7());
            		
            // InternalOCCI.g:2599:3: (otherlv_9= 'documentation' ( (lv_documentation_10_0= RULE_STRING ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==54) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOCCI.g:2600:4: otherlv_9= 'documentation' ( (lv_documentation_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnumerationTypeAccess().getDocumentationKeyword_8_0());
                    			
                    // InternalOCCI.g:2604:4: ( (lv_documentation_10_0= RULE_STRING ) )
                    // InternalOCCI.g:2605:5: (lv_documentation_10_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2605:5: (lv_documentation_10_0= RULE_STRING )
                    // InternalOCCI.g:2606:6: lv_documentation_10_0= RULE_STRING
                    {
                    lv_documentation_10_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    						newLeafNode(lv_documentation_10_0, grammarAccess.getEnumerationTypeAccess().getDocumentationSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumerationTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationType"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalOCCI.g:2631:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalOCCI.g:2631:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalOCCI.g:2632:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalOCCI.g:2638:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= ')' ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_documentation_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalOCCI.g:2644:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= ')' ) )
            // InternalOCCI.g:2645:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= ')' )
            {
            // InternalOCCI.g:2645:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= ')' )
            // InternalOCCI.g:2646:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= ')'
            {
            // InternalOCCI.g:2646:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOCCI.g:2647:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOCCI.g:2647:4: (lv_name_0_0= RULE_ID )
            // InternalOCCI.g:2648:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOCCI.g:2668:3: (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==54) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOCCI.g:2669:4: otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnumerationLiteralAccess().getDocumentationKeyword_2_0());
                    			
                    // InternalOCCI.g:2673:4: ( (lv_documentation_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2674:5: (lv_documentation_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2674:5: (lv_documentation_3_0= RULE_STRING )
                    // InternalOCCI.g:2675:6: lv_documentation_3_0= RULE_STRING
                    {
                    lv_documentation_3_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    						newLeafNode(lv_documentation_3_0, grammarAccess.getEnumerationLiteralAccess().getDocumentationSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumerationLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleRecordType"
    // InternalOCCI.g:2700:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // InternalOCCI.g:2700:51: (iv_ruleRecordType= ruleRecordType EOF )
            // InternalOCCI.g:2701:2: iv_ruleRecordType= ruleRecordType EOF
            {
             newCompositeNode(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;

             current =iv_ruleRecordType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // InternalOCCI.g:2707:1: ruleRecordType returns [EObject current=null] : (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? otherlv_5= 'fields' otherlv_6= '(' ( (lv_recordFields_7_0= ruleRecordField ) ) (otherlv_8= ',' ( (lv_recordFields_9_0= ruleRecordField ) ) )* otherlv_10= ')' otherlv_11= ')' ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_documentation_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_recordFields_7_0 = null;

        EObject lv_recordFields_9_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2713:2: ( (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? otherlv_5= 'fields' otherlv_6= '(' ( (lv_recordFields_7_0= ruleRecordField ) ) (otherlv_8= ',' ( (lv_recordFields_9_0= ruleRecordField ) ) )* otherlv_10= ')' otherlv_11= ')' ) )
            // InternalOCCI.g:2714:2: (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? otherlv_5= 'fields' otherlv_6= '(' ( (lv_recordFields_7_0= ruleRecordField ) ) (otherlv_8= ',' ( (lv_recordFields_9_0= ruleRecordField ) ) )* otherlv_10= ')' otherlv_11= ')' )
            {
            // InternalOCCI.g:2714:2: (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? otherlv_5= 'fields' otherlv_6= '(' ( (lv_recordFields_7_0= ruleRecordField ) ) (otherlv_8= ',' ( (lv_recordFields_9_0= ruleRecordField ) ) )* otherlv_10= ')' otherlv_11= ')' )
            // InternalOCCI.g:2715:3: otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )? otherlv_5= 'fields' otherlv_6= '(' ( (lv_recordFields_7_0= ruleRecordField ) ) (otherlv_8= ',' ( (lv_recordFields_9_0= ruleRecordField ) ) )* otherlv_10= ')' otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getRecordTypeKeyword_0());
            		
            // InternalOCCI.g:2719:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:2720:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:2720:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:2721:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecordTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOCCI.g:2741:3: (otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==54) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOCCI.g:2742:4: otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getDocumentationKeyword_3_0());
                    			
                    // InternalOCCI.g:2746:4: ( (lv_documentation_4_0= RULE_STRING ) )
                    // InternalOCCI.g:2747:5: (lv_documentation_4_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2747:5: (lv_documentation_4_0= RULE_STRING )
                    // InternalOCCI.g:2748:6: lv_documentation_4_0= RULE_STRING
                    {
                    lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

                    						newLeafNode(lv_documentation_4_0, grammarAccess.getRecordTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecordTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,71,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getFieldsKeyword_4());
            		
            otherlv_6=(Token)match(input,31,FOLLOW_73); 

            			newLeafNode(otherlv_6, grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_5());
            		
            // InternalOCCI.g:2773:3: ( (lv_recordFields_7_0= ruleRecordField ) )
            // InternalOCCI.g:2774:4: (lv_recordFields_7_0= ruleRecordField )
            {
            // InternalOCCI.g:2774:4: (lv_recordFields_7_0= ruleRecordField )
            // InternalOCCI.g:2775:5: lv_recordFields_7_0= ruleRecordField
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_26);
            lv_recordFields_7_0=ruleRecordField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            					}
            					add(
            						current,
            						"recordFields",
            						lv_recordFields_7_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.RecordField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2792:3: (otherlv_8= ',' ( (lv_recordFields_9_0= ruleRecordField ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==24) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalOCCI.g:2793:4: otherlv_8= ',' ( (lv_recordFields_9_0= ruleRecordField ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FOLLOW_73); 

            	    				newLeafNode(otherlv_8, grammarAccess.getRecordTypeAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalOCCI.g:2797:4: ( (lv_recordFields_9_0= ruleRecordField ) )
            	    // InternalOCCI.g:2798:5: (lv_recordFields_9_0= ruleRecordField )
            	    {
            	    // InternalOCCI.g:2798:5: (lv_recordFields_9_0= ruleRecordField )
            	    // InternalOCCI.g:2799:6: lv_recordFields_9_0= ruleRecordField
            	    {

            	    						newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_recordFields_9_0=ruleRecordField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recordFields",
            	    							lv_recordFields_9_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.RecordField");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_10=(Token)match(input,32,FOLLOW_58); 

            			newLeafNode(otherlv_10, grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_8());
            		
            otherlv_11=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleRecordField"
    // InternalOCCI.g:2829:1: entryRuleRecordField returns [EObject current=null] : iv_ruleRecordField= ruleRecordField EOF ;
    public final EObject entryRuleRecordField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordField = null;


        try {
            // InternalOCCI.g:2829:52: (iv_ruleRecordField= ruleRecordField EOF )
            // InternalOCCI.g:2830:2: iv_ruleRecordField= ruleRecordField EOF
            {
             newCompositeNode(grammarAccess.getRecordFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecordField=ruleRecordField();

            state._fsp--;

             current =iv_ruleRecordField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordField"


    // $ANTLR start "ruleRecordField"
    // InternalOCCI.g:2836:1: ruleRecordField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) ;
    public final EObject ruleRecordField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mutable_1_0=null;
        Token lv_required_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_default_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_annotations_15_0 = null;

        EObject lv_annotations_17_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2842:2: ( (otherlv_0= 'field' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) )
            // InternalOCCI.g:2843:2: (otherlv_0= 'field' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            {
            // InternalOCCI.g:2843:2: (otherlv_0= 'field' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            // InternalOCCI.g:2844:3: otherlv_0= 'field' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordFieldAccess().getFieldKeyword_0());
            		
            // InternalOCCI.g:2848:3: ( (lv_mutable_1_0= 'mutable' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==38) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==RULE_ID||LA63_1==RULE_QUALIFIED_ID||LA63_1==12||(LA63_1>=14 && LA63_1<=15)||(LA63_1>=17 && LA63_1<=22)||(LA63_1>=26 && LA63_1<=27)||(LA63_1>=29 && LA63_1<=30)||(LA63_1>=33 && LA63_1<=40)||(LA63_1>=42 && LA63_1<=44)||(LA63_1>=53 && LA63_1<=73)||(LA63_1>=75 && LA63_1<=81)) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalOCCI.g:2849:4: (lv_mutable_1_0= 'mutable' )
                    {
                    // InternalOCCI.g:2849:4: (lv_mutable_1_0= 'mutable' )
                    // InternalOCCI.g:2850:5: lv_mutable_1_0= 'mutable'
                    {
                    lv_mutable_1_0=(Token)match(input,38,FOLLOW_13); 

                    					newLeafNode(lv_mutable_1_0, grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2862:3: ( (lv_required_2_0= 'required' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==39) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==RULE_ID||LA64_1==RULE_QUALIFIED_ID||LA64_1==12||(LA64_1>=14 && LA64_1<=15)||(LA64_1>=17 && LA64_1<=22)||(LA64_1>=26 && LA64_1<=27)||(LA64_1>=29 && LA64_1<=30)||(LA64_1>=33 && LA64_1<=40)||(LA64_1>=42 && LA64_1<=44)||(LA64_1>=53 && LA64_1<=73)||(LA64_1>=75 && LA64_1<=81)) ) {
                    alt64=1;
                }
            }
            switch (alt64) {
                case 1 :
                    // InternalOCCI.g:2863:4: (lv_required_2_0= 'required' )
                    {
                    // InternalOCCI.g:2863:4: (lv_required_2_0= 'required' )
                    // InternalOCCI.g:2864:5: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,39,FOLLOW_13); 

                    					newLeafNode(lv_required_2_0, grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2876:3: ( (lv_name_3_0= ruleQualifiedID ) )
            // InternalOCCI.g:2877:4: (lv_name_3_0= ruleQualifiedID )
            {
            // InternalOCCI.g:2877:4: (lv_name_3_0= ruleQualifiedID )
            // InternalOCCI.g:2878:5: lv_name_3_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getRecordFieldAccess().getNameQualifiedIDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleQualifiedID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.QualifiedID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_62); 

            			newLeafNode(otherlv_4, grammarAccess.getRecordFieldAccess().getColonKeyword_4());
            		
            // InternalOCCI.g:2899:3: (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:2900:4: otherlv_5= 'type' ( ( ruleQualifiedID ) )
            {
            otherlv_5=(Token)match(input,40,FOLLOW_13); 

            				newLeafNode(otherlv_5, grammarAccess.getRecordFieldAccess().getTypeKeyword_5_0());
            			
            // InternalOCCI.g:2904:4: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2905:5: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2905:5: ( ruleQualifiedID )
            // InternalOCCI.g:2906:6: ruleQualifiedID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRecordFieldRule());
            						}
            					

            						newCompositeNode(grammarAccess.getRecordFieldAccess().getTypeDataTypeCrossReference_5_1_0());
            					
            pushFollow(FOLLOW_34);
            ruleQualifiedID();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOCCI.g:2921:3: (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==41) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOCCI.g:2922:4: otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getRecordFieldAccess().getEqualsSignKeyword_6_0());
                    			
                    // InternalOCCI.g:2926:4: ( (lv_default_8_0= RULE_STRING ) )
                    // InternalOCCI.g:2927:5: (lv_default_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2927:5: (lv_default_8_0= RULE_STRING )
                    // InternalOCCI.g:2928:6: lv_default_8_0= RULE_STRING
                    {
                    lv_default_8_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_default_8_0, grammarAccess.getRecordFieldAccess().getDefaultSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecordFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2945:3: (otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // InternalOCCI.g:2946:4: otherlv_9= '{' (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            otherlv_9=(Token)match(input,23,FOLLOW_35); 

            				newLeafNode(otherlv_9, grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_7_0());
            			
            // InternalOCCI.g:2950:4: (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==14) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalOCCI.g:2951:5: otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,14,FOLLOW_5); 

                    					newLeafNode(otherlv_10, grammarAccess.getRecordFieldAccess().getDescriptionKeyword_7_1_0());
                    				
                    // InternalOCCI.g:2955:5: ( (lv_description_11_0= RULE_STRING ) )
                    // InternalOCCI.g:2956:6: (lv_description_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2956:6: (lv_description_11_0= RULE_STRING )
                    // InternalOCCI.g:2957:7: lv_description_11_0= RULE_STRING
                    {
                    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    							newLeafNode(lv_description_11_0, grammarAccess.getRecordFieldAccess().getDescriptionSTRINGTerminalRuleCall_7_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRecordFieldRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"description",
                    								lv_description_11_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,25,FOLLOW_36); 

            				newLeafNode(otherlv_12, grammarAccess.getRecordFieldAccess().getRightCurlyBracketKeyword_7_2());
            			

            }

            // InternalOCCI.g:2979:3: (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==22) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalOCCI.g:2980:4: otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getRecordFieldAccess().getAnnotationsKeyword_8_0());
                    			
                    otherlv_14=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalOCCI.g:2988:4: ( (lv_annotations_15_0= ruleAnnotation ) )
                    // InternalOCCI.g:2989:5: (lv_annotations_15_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:2989:5: (lv_annotations_15_0= ruleAnnotation )
                    // InternalOCCI.g:2990:6: lv_annotations_15_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_annotations_15_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecordFieldRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_15_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:3007:4: (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==24) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalOCCI.g:3008:5: otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,24,FOLLOW_18); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRecordFieldAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalOCCI.g:3012:5: ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:3013:6: (lv_annotations_17_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:3013:6: (lv_annotations_17_0= ruleAnnotation )
                    	    // InternalOCCI.g:3014:7: lv_annotations_17_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_annotations_17_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRecordFieldRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_17_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getRecordFieldAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordField"


    // $ANTLR start "entryRuleArrayType"
    // InternalOCCI.g:3041:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalOCCI.g:3041:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalOCCI.g:3042:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalOCCI.g:3048:1: ruleArrayType returns [EObject current=null] : (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) otherlv_7= ')' )? ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_documentation_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalOCCI.g:3054:2: ( (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) otherlv_7= ')' )? ) )
            // InternalOCCI.g:3055:2: (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) otherlv_7= ')' )? )
            {
            // InternalOCCI.g:3055:2: (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) otherlv_7= ')' )? )
            // InternalOCCI.g:3056:3: otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) otherlv_7= ')' )?
            {
            otherlv_0=(Token)match(input,73,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getArrayTypeKeyword_0());
            		
            // InternalOCCI.g:3060:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:3061:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:3061:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:3062:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_62); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArrayTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalOCCI.g:3082:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:3083:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:3083:4: ( ruleQualifiedID )
            // InternalOCCI.g:3084:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArrayTypeAccess().getTypeDataTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_74);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:3098:3: (otherlv_4= '(' otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) otherlv_7= ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==31) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalOCCI.g:3099:4: otherlv_4= '(' otherlv_5= 'documentation' ( (lv_documentation_6_0= RULE_STRING ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_75); 

                    				newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getArrayTypeAccess().getDocumentationKeyword_4_1());
                    			
                    // InternalOCCI.g:3107:4: ( (lv_documentation_6_0= RULE_STRING ) )
                    // InternalOCCI.g:3108:5: (lv_documentation_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3108:5: (lv_documentation_6_0= RULE_STRING )
                    // InternalOCCI.g:3109:6: lv_documentation_6_0= RULE_STRING
                    {
                    lv_documentation_6_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    						newLeafNode(lv_documentation_6_0, grammarAccess.getArrayTypeAccess().getDocumentationSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArrayTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getArrayTypeAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalOCCI.g:3134:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalOCCI.g:3134:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalOCCI.g:3135:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalOCCI.g:3141:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOCCI.g:3147:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalOCCI.g:3148:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalOCCI.g:3148:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalOCCI.g:3149:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalOCCI.g:3149:3: (kw= '-' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==74) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalOCCI.g:3150:4: kw= '-'
                    {
                    kw=(Token)match(input,74,FOLLOW_76); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleQualifiedID"
    // InternalOCCI.g:3167:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // InternalOCCI.g:3167:51: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // InternalOCCI.g:3168:2: iv_ruleQualifiedID= ruleQualifiedID EOF
            {
             newCompositeNode(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedID=ruleQualifiedID();

            state._fsp--;

             current =iv_ruleQualifiedID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // InternalOCCI.g:3174:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_QUALIFIED_ID_1=null;
        AntlrDatatypeRuleToken this_KEYWORD_2 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3180:2: ( (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) )
            // InternalOCCI.g:3181:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            {
            // InternalOCCI.g:3181:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            int alt71=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt71=1;
                }
                break;
            case RULE_QUALIFIED_ID:
                {
                alt71=2;
                }
                break;
            case 12:
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 26:
            case 27:
            case 29:
            case 30:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 42:
            case 43:
            case 44:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalOCCI.g:3182:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3190:3: this_QUALIFIED_ID_1= RULE_QUALIFIED_ID
                    {
                    this_QUALIFIED_ID_1=(Token)match(input,RULE_QUALIFIED_ID,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_ID_1);
                    		

                    			newLeafNode(this_QUALIFIED_ID_1, grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3198:3: this_KEYWORD_2= ruleKEYWORD
                    {

                    			newCompositeNode(grammarAccess.getQualifiedIDAccess().getKEYWORDParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_KEYWORD_2=ruleKEYWORD();

                    state._fsp--;


                    			current.merge(this_KEYWORD_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "entryRuleNameID"
    // InternalOCCI.g:3212:1: entryRuleNameID returns [String current=null] : iv_ruleNameID= ruleNameID EOF ;
    public final String entryRuleNameID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameID = null;


        try {
            // InternalOCCI.g:3212:46: (iv_ruleNameID= ruleNameID EOF )
            // InternalOCCI.g:3213:2: iv_ruleNameID= ruleNameID EOF
            {
             newCompositeNode(grammarAccess.getNameIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameID=ruleNameID();

            state._fsp--;

             current =iv_ruleNameID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameID"


    // $ANTLR start "ruleNameID"
    // InternalOCCI.g:3219:1: ruleNameID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleNameID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_KEYWORD_3 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3225:2: ( ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) )
            // InternalOCCI.g:3226:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            {
            // InternalOCCI.g:3226:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            else if ( (LA73_0==12||(LA73_0>=14 && LA73_0<=15)||(LA73_0>=17 && LA73_0<=22)||(LA73_0>=26 && LA73_0<=27)||(LA73_0>=29 && LA73_0<=30)||(LA73_0>=33 && LA73_0<=40)||(LA73_0>=42 && LA73_0<=44)||(LA73_0>=53 && LA73_0<=73)||(LA73_0>=75 && LA73_0<=81)) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalOCCI.g:3227:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    {
                    // InternalOCCI.g:3227:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    // InternalOCCI.g:3228:4: this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )*
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_77); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalOCCI.g:3235:4: (this_ID_1= RULE_ID | kw= '-' )*
                    loop72:
                    do {
                        int alt72=3;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==RULE_ID) ) {
                            alt72=1;
                        }
                        else if ( (LA72_0==74) ) {
                            alt72=2;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalOCCI.g:3236:5: this_ID_1= RULE_ID
                    	    {
                    	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_77); 

                    	    					current.merge(this_ID_1);
                    	    				

                    	    					newLeafNode(this_ID_1, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_1_0());
                    	    				

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOCCI.g:3244:5: kw= '-'
                    	    {
                    	    kw=(Token)match(input,74,FOLLOW_77); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getNameIDAccess().getHyphenMinusKeyword_0_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3252:3: this_KEYWORD_3= ruleKEYWORD
                    {

                    			newCompositeNode(grammarAccess.getNameIDAccess().getKEYWORDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KEYWORD_3=ruleKEYWORD();

                    state._fsp--;


                    			current.merge(this_KEYWORD_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameID"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalOCCI.g:3266:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalOCCI.g:3266:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalOCCI.g:3267:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
             newCompositeNode(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;

             current =iv_ruleKEYWORD.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalOCCI.g:3273:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOCCI.g:3279:2: ( (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' ) )
            // InternalOCCI.g:3280:2: (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' )
            {
            // InternalOCCI.g:3280:2: (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' )
            int alt74=52;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt74=1;
                }
                break;
            case 14:
                {
                alt74=2;
                }
                break;
            case 15:
                {
                alt74=3;
                }
                break;
            case 17:
                {
                alt74=4;
                }
                break;
            case 18:
                {
                alt74=5;
                }
                break;
            case 19:
                {
                alt74=6;
                }
                break;
            case 20:
                {
                alt74=7;
                }
                break;
            case 21:
                {
                alt74=8;
                }
                break;
            case 22:
                {
                alt74=9;
                }
                break;
            case 26:
                {
                alt74=10;
                }
                break;
            case 27:
                {
                alt74=11;
                }
                break;
            case 29:
                {
                alt74=12;
                }
                break;
            case 30:
                {
                alt74=13;
                }
                break;
            case 33:
                {
                alt74=14;
                }
                break;
            case 34:
                {
                alt74=15;
                }
                break;
            case 35:
                {
                alt74=16;
                }
                break;
            case 36:
                {
                alt74=17;
                }
                break;
            case 37:
                {
                alt74=18;
                }
                break;
            case 38:
                {
                alt74=19;
                }
                break;
            case 39:
                {
                alt74=20;
                }
                break;
            case 40:
                {
                alt74=21;
                }
                break;
            case 42:
                {
                alt74=22;
                }
                break;
            case 43:
                {
                alt74=23;
                }
                break;
            case 44:
                {
                alt74=24;
                }
                break;
            case 53:
                {
                alt74=25;
                }
                break;
            case 54:
                {
                alt74=26;
                }
                break;
            case 55:
                {
                alt74=27;
                }
                break;
            case 56:
                {
                alt74=28;
                }
                break;
            case 57:
                {
                alt74=29;
                }
                break;
            case 58:
                {
                alt74=30;
                }
                break;
            case 59:
                {
                alt74=31;
                }
                break;
            case 60:
                {
                alt74=32;
                }
                break;
            case 61:
                {
                alt74=33;
                }
                break;
            case 62:
                {
                alt74=34;
                }
                break;
            case 63:
                {
                alt74=35;
                }
                break;
            case 64:
                {
                alt74=36;
                }
                break;
            case 65:
                {
                alt74=37;
                }
                break;
            case 66:
                {
                alt74=38;
                }
                break;
            case 67:
                {
                alt74=39;
                }
                break;
            case 75:
                {
                alt74=40;
                }
                break;
            case 76:
                {
                alt74=41;
                }
                break;
            case 77:
                {
                alt74=42;
                }
                break;
            case 78:
                {
                alt74=43;
                }
                break;
            case 79:
                {
                alt74=44;
                }
                break;
            case 80:
                {
                alt74=45;
                }
                break;
            case 81:
                {
                alt74=46;
                }
                break;
            case 68:
                {
                alt74=47;
                }
                break;
            case 69:
                {
                alt74=48;
                }
                break;
            case 70:
                {
                alt74=49;
                }
                break;
            case 71:
                {
                alt74=50;
                }
                break;
            case 72:
                {
                alt74=51;
                }
                break;
            case 73:
                {
                alt74=52;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalOCCI.g:3281:3: kw= 'extension'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtensionKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3287:3: kw= 'description'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDescriptionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3293:3: kw= 'specification'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSpecificationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOCCI.g:3299:3: kw= 'as'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAsKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOCCI.g:3305:3: kw= 'kind'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKindKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOCCI.g:3311:3: kw= 'extends'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtendsKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalOCCI.g:3317:3: kw= 'source'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSourceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalOCCI.g:3323:3: kw= 'target'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTargetKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalOCCI.g:3329:3: kw= 'annotations'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAnnotationsKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalOCCI.g:3335:3: kw= 'title'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTitleKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalOCCI.g:3341:3: kw= 'scheme'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSchemeKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalOCCI.g:3347:3: kw= 'mixin'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMixinKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalOCCI.g:3353:3: kw= 'depends'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDependsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalOCCI.g:3359:3: kw= 'applies'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAppliesKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalOCCI.g:3365:3: kw= 'annotation'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAnnotationKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalOCCI.g:3371:3: kw= 'key'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKeyKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalOCCI.g:3377:3: kw= 'value'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalOCCI.g:3383:3: kw= 'attribute'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAttributeKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalOCCI.g:3389:3: kw= 'mutable'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMutableKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalOCCI.g:3395:3: kw= 'required'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRequiredKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalOCCI.g:3401:3: kw= 'type'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalOCCI.g:3407:3: kw= 'action'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalOCCI.g:3413:3: kw= 'constraint'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConstraintKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalOCCI.g:3419:3: kw= 'body'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBodyKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalOCCI.g:3425:3: kw= 'StringType'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStringTypeKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalOCCI.g:3431:3: kw= 'documentation'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDocumentationKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalOCCI.g:3437:3: kw= 'pattern'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPatternKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalOCCI.g:3443:3: kw= 'length'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLengthKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalOCCI.g:3449:3: kw= 'minLength'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinLengthKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalOCCI.g:3455:3: kw= 'maxLength'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalOCCI.g:3461:3: kw= 'EObjectType'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEObjectTypeKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalOCCI.g:3467:3: kw= 'instanceClassName'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getInstanceClassNameKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalOCCI.g:3473:3: kw= 'BooleanType'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBooleanTypeKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalOCCI.g:3479:3: kw= 'NumericType'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNumericTypeKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalOCCI.g:3485:3: kw= 'totalDigits'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTotalDigitsKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalOCCI.g:3491:3: kw= 'minExclusive'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinExclusiveKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalOCCI.g:3497:3: kw= 'maxExclusive'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxExclusiveKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalOCCI.g:3503:3: kw= 'minInclusive'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinInclusiveKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalOCCI.g:3509:3: kw= 'maxInclusive'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxInclusiveKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalOCCI.g:3515:3: kw= 'Byte'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getByteKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalOCCI.g:3521:3: kw= 'Double'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDoubleKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalOCCI.g:3527:3: kw= 'Float'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFloatKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalOCCI.g:3533:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIntegerKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalOCCI.g:3539:3: kw= 'Long'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLongKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalOCCI.g:3545:3: kw= 'Short'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getShortKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalOCCI.g:3551:3: kw= 'BigDecimal'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBigDecimalKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalOCCI.g:3557:3: kw= 'EnumerationType'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnumerationTypeKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalOCCI.g:3563:3: kw= 'literals'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLiteralsKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalOCCI.g:3569:3: kw= 'RecordType'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRecordTypeKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalOCCI.g:3575:3: kw= 'fields'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFieldsKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalOCCI.g:3581:3: kw= 'field'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFieldKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalOCCI.g:3587:3: kw= 'ArrayType'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getArrayTypeKeyword_51());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "ruleNumericTypeEnum"
    // InternalOCCI.g:3596:1: ruleNumericTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) ;
    public final Enumerator ruleNumericTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalOCCI.g:3602:2: ( ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) )
            // InternalOCCI.g:3603:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            {
            // InternalOCCI.g:3603:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            int alt75=7;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt75=1;
                }
                break;
            case 76:
                {
                alt75=2;
                }
                break;
            case 77:
                {
                alt75=3;
                }
                break;
            case 78:
                {
                alt75=4;
                }
                break;
            case 79:
                {
                alt75=5;
                }
                break;
            case 80:
                {
                alt75=6;
                }
                break;
            case 81:
                {
                alt75=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalOCCI.g:3604:3: (enumLiteral_0= 'Byte' )
                    {
                    // InternalOCCI.g:3604:3: (enumLiteral_0= 'Byte' )
                    // InternalOCCI.g:3605:4: enumLiteral_0= 'Byte'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3612:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalOCCI.g:3612:3: (enumLiteral_1= 'Double' )
                    // InternalOCCI.g:3613:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3620:3: (enumLiteral_2= 'Float' )
                    {
                    // InternalOCCI.g:3620:3: (enumLiteral_2= 'Float' )
                    // InternalOCCI.g:3621:4: enumLiteral_2= 'Float'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOCCI.g:3628:3: (enumLiteral_3= 'Integer' )
                    {
                    // InternalOCCI.g:3628:3: (enumLiteral_3= 'Integer' )
                    // InternalOCCI.g:3629:4: enumLiteral_3= 'Integer'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOCCI.g:3636:3: (enumLiteral_4= 'Long' )
                    {
                    // InternalOCCI.g:3636:3: (enumLiteral_4= 'Long' )
                    // InternalOCCI.g:3637:4: enumLiteral_4= 'Long'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOCCI.g:3644:3: (enumLiteral_5= 'Short' )
                    {
                    // InternalOCCI.g:3644:3: (enumLiteral_5= 'Short' )
                    // InternalOCCI.g:3645:4: enumLiteral_5= 'Short'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOCCI.g:3652:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalOCCI.g:3652:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalOCCI.g:3653:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getBigDecimalEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getNumericTypeEnumAccess().getBigDecimalEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericTypeEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFE01DFE6C7ED020L,0x000000000003FBFFL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x682000002005C002L,0x0000000000000250L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x6820000020058002L,0x0000000000000250L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x6820000020050002L,0x0000000000000250L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x6820000020070002L,0x0000000000000250L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x6820000020040002L,0x0000000000000250L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFE01DFE6C7ED0A0L,0x000000000003FBFFL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000C2010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000240C00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200C00000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000C2006000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000C2002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000030000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080C00002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400002000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000002000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010040100000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x07C0000100000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0780000100000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0700000100000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0600000100000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0400000100000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1040000100000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1000000100000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0040000100000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x000000000003F800L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8040000100000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x8000000100000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000100000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000100000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000100000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000400L});

}