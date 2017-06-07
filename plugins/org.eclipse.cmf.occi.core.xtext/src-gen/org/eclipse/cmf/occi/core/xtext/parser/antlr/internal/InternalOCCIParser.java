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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_QUALIFIED_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'extension'", "':'", "'description'", "'specification'", "'import'", "'as'", "'kind'", "'extends'", "'source'", "'target'", "'title'", "'scheme'", "'('", "')'", "'annotations'", "'{'", "','", "'}'", "'mixin'", "'depends'", "'applies'", "'key'", "'value'", "'attribute'", "'mutable'", "'required'", "'type'", "'='", "'action'", "'constraint'", "'body'", "'FSM'", "'states'", "'State'", "'initial'", "'final'", "'literal'", "'transitions'", "'to'", "'StringType'", "'pattern'", "'length'", "'minLength'", "'maxLength'", "'documentation'", "'EObjectType'", "'instanceClassName'", "'BooleanType'", "'NumericType'", "'totalDigits'", "'minExclusive'", "'maxExclusive'", "'minInclusive'", "'maxInclusive'", "'EnumerationType'", "'literals'", "'RecordType'", "'fields'", "'ArrayType'", "'-'", "'annotation'", "'Byte'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'BigDecimal'", "'field'"
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
                case 30:
                    {
                    alt5=2;
                    }
                    break;
                case 51:
                case 57:
                case 59:
                case 60:
                case 66:
                case 68:
                case 70:
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
    // InternalOCCI.g:299:1: ruleKind returns [EObject current=null] : (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? otherlv_10= 'scheme' ( (lv_scheme_11_0= RULE_STRING ) ) (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_title_9_0=null;
        Token otherlv_10=null;
        Token lv_scheme_11_0=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_13_0 = null;

        EObject lv_actions_14_0 = null;

        EObject lv_constraints_15_0 = null;

        EObject lv_fsm_17_0 = null;

        EObject lv_annotations_20_0 = null;

        EObject lv_annotations_22_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:305:2: ( (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? otherlv_10= 'scheme' ( (lv_scheme_11_0= RULE_STRING ) ) (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? ) )
            // InternalOCCI.g:306:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? otherlv_10= 'scheme' ( (lv_scheme_11_0= RULE_STRING ) ) (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? )
            {
            // InternalOCCI.g:306:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? otherlv_10= 'scheme' ( (lv_scheme_11_0= RULE_STRING ) ) (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? )
            // InternalOCCI.g:307:3: otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? otherlv_10= 'scheme' ( (lv_scheme_11_0= RULE_STRING ) ) (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )?
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

            // InternalOCCI.g:396:3: (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOCCI.g:397:4: otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getKindAccess().getTitleKeyword_5_0());
                    			
                    // InternalOCCI.g:401:4: ( (lv_title_9_0= RULE_STRING ) )
                    // InternalOCCI.g:402:5: (lv_title_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:402:5: (lv_title_9_0= RULE_STRING )
                    // InternalOCCI.g:403:6: lv_title_9_0= RULE_STRING
                    {
                    lv_title_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_title_9_0, grammarAccess.getKindAccess().getTitleSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getKindAccess().getSchemeKeyword_6());
            		
            // InternalOCCI.g:424:3: ( (lv_scheme_11_0= RULE_STRING ) )
            // InternalOCCI.g:425:4: (lv_scheme_11_0= RULE_STRING )
            {
            // InternalOCCI.g:425:4: (lv_scheme_11_0= RULE_STRING )
            // InternalOCCI.g:426:5: lv_scheme_11_0= RULE_STRING
            {
            lv_scheme_11_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_scheme_11_0, grammarAccess.getKindAccess().getSchemeSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKindRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scheme",
            						lv_scheme_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:442:3: (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOCCI.g:443:4: otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')'
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getKindAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalOCCI.g:447:4: ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=4;
                        switch ( input.LA(1) ) {
                        case 35:
                            {
                            alt10=1;
                            }
                            break;
                        case 40:
                            {
                            alt10=2;
                            }
                            break;
                        case 41:
                            {
                            alt10=3;
                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // InternalOCCI.g:448:5: ( (lv_attributes_13_0= ruleAttribute ) )
                    	    {
                    	    // InternalOCCI.g:448:5: ( (lv_attributes_13_0= ruleAttribute ) )
                    	    // InternalOCCI.g:449:6: (lv_attributes_13_0= ruleAttribute )
                    	    {
                    	    // InternalOCCI.g:449:6: (lv_attributes_13_0= ruleAttribute )
                    	    // InternalOCCI.g:450:7: lv_attributes_13_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_8_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_attributes_13_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_13_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOCCI.g:468:5: ( (lv_actions_14_0= ruleAction ) )
                    	    {
                    	    // InternalOCCI.g:468:5: ( (lv_actions_14_0= ruleAction ) )
                    	    // InternalOCCI.g:469:6: (lv_actions_14_0= ruleAction )
                    	    {
                    	    // InternalOCCI.g:469:6: (lv_actions_14_0= ruleAction )
                    	    // InternalOCCI.g:470:7: lv_actions_14_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_actions_14_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_14_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalOCCI.g:488:5: ( (lv_constraints_15_0= ruleConstraint ) )
                    	    {
                    	    // InternalOCCI.g:488:5: ( (lv_constraints_15_0= ruleConstraint ) )
                    	    // InternalOCCI.g:489:6: (lv_constraints_15_0= ruleConstraint )
                    	    {
                    	    // InternalOCCI.g:489:6: (lv_constraints_15_0= ruleConstraint )
                    	    // InternalOCCI.g:490:7: lv_constraints_15_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getConstraintsConstraintParserRuleCall_8_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_constraints_15_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_15_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Constraint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    otherlv_16=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_16, grammarAccess.getKindAccess().getRightParenthesisKeyword_8_2());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:513:3: ( (lv_fsm_17_0= ruleFSM ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOCCI.g:514:4: (lv_fsm_17_0= ruleFSM )
                    {
                    // InternalOCCI.g:514:4: (lv_fsm_17_0= ruleFSM )
                    // InternalOCCI.g:515:5: lv_fsm_17_0= ruleFSM
                    {

                    					newCompositeNode(grammarAccess.getKindAccess().getFsmFSMParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_fsm_17_0=ruleFSM();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getKindRule());
                    					}
                    					set(
                    						current,
                    						"fsm",
                    						lv_fsm_17_0,
                    						"org.eclipse.cmf.occi.core.xtext.OCCI.FSM");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:532:3: (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOCCI.g:533:4: otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getKindAccess().getAnnotationsKeyword_10_0());
                    			
                    otherlv_19=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_19, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalOCCI.g:541:4: ( (lv_annotations_20_0= ruleAnnotation ) )
                    // InternalOCCI.g:542:5: (lv_annotations_20_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:542:5: (lv_annotations_20_0= ruleAnnotation )
                    // InternalOCCI.g:543:6: lv_annotations_20_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_annotations_20_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKindRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_20_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:560:4: (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==28) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalOCCI.g:561:5: otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_21=(Token)match(input,28,FOLLOW_24); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getKindAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalOCCI.g:565:5: ( (lv_annotations_22_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:566:6: (lv_annotations_22_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:566:6: (lv_annotations_22_0= ruleAnnotation )
                    	    // InternalOCCI.g:567:7: lv_annotations_22_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_annotations_22_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_22_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_10_4());
                    			

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
    // InternalOCCI.g:601:1: ruleMixin returns [EObject current=null] : (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? ) ;
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
        Token lv_scheme_15_0=null;
        Token otherlv_16=null;
        Token lv_title_17_0=null;
        Token otherlv_18=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_19_0 = null;

        EObject lv_actions_20_0 = null;

        EObject lv_constraints_21_0 = null;

        EObject lv_annotations_25_0 = null;

        EObject lv_annotations_27_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:607:2: ( (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? ) )
            // InternalOCCI.g:608:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? )
            {
            // InternalOCCI.g:608:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? )
            // InternalOCCI.g:609:3: otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMixinAccess().getMixinKeyword_0());
            		
            // InternalOCCI.g:613:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:614:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:614:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:615:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getMixinAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOCCI.g:633:4: otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getMixinAccess().getDependsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_13); 

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
                    					
                    pushFollow(FOLLOW_27);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:657:4: (otherlv_5= ',' ( ( ruleQualifiedID ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==28) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalOCCI.g:658:5: otherlv_5= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FOLLOW_13); 

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
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleQualifiedID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getMixinAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:684:3: (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOCCI.g:685:4: otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_8, grammarAccess.getMixinAccess().getAppliesKeyword_3_0());
                    			
                    otherlv_9=(Token)match(input,24,FOLLOW_13); 

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
                    					
                    pushFollow(FOLLOW_27);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:709:4: (otherlv_11= ',' ( ( ruleQualifiedID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==28) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalOCCI.g:710:5: otherlv_11= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,28,FOLLOW_13); 

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
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleQualifiedID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getMixinAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getMixinAccess().getSchemeKeyword_4());
            		
            // InternalOCCI.g:740:3: ( (lv_scheme_15_0= RULE_STRING ) )
            // InternalOCCI.g:741:4: (lv_scheme_15_0= RULE_STRING )
            {
            // InternalOCCI.g:741:4: (lv_scheme_15_0= RULE_STRING )
            // InternalOCCI.g:742:5: lv_scheme_15_0= RULE_STRING
            {
            lv_scheme_15_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_scheme_15_0, grammarAccess.getMixinAccess().getSchemeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scheme",
            						lv_scheme_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:758:3: (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOCCI.g:759:4: otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getMixinAccess().getTitleKeyword_6_0());
                    			
                    // InternalOCCI.g:763:4: ( (lv_title_17_0= RULE_STRING ) )
                    // InternalOCCI.g:764:5: (lv_title_17_0= RULE_STRING )
                    {
                    // InternalOCCI.g:764:5: (lv_title_17_0= RULE_STRING )
                    // InternalOCCI.g:765:6: lv_title_17_0= RULE_STRING
                    {
                    lv_title_17_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_title_17_0, grammarAccess.getMixinAccess().getTitleSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_17_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:782:3: (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOCCI.g:783:4: otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')'
                    {
                    otherlv_18=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_18, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_7_0());
                    			
                    // InternalOCCI.g:787:4: ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=4;
                        switch ( input.LA(1) ) {
                        case 35:
                            {
                            alt20=1;
                            }
                            break;
                        case 40:
                            {
                            alt20=2;
                            }
                            break;
                        case 41:
                            {
                            alt20=3;
                            }
                            break;

                        }

                        switch (alt20) {
                    	case 1 :
                    	    // InternalOCCI.g:788:5: ( (lv_attributes_19_0= ruleAttribute ) )
                    	    {
                    	    // InternalOCCI.g:788:5: ( (lv_attributes_19_0= ruleAttribute ) )
                    	    // InternalOCCI.g:789:6: (lv_attributes_19_0= ruleAttribute )
                    	    {
                    	    // InternalOCCI.g:789:6: (lv_attributes_19_0= ruleAttribute )
                    	    // InternalOCCI.g:790:7: lv_attributes_19_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_7_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_attributes_19_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMixinRule());
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
                    	    // InternalOCCI.g:808:5: ( (lv_actions_20_0= ruleAction ) )
                    	    {
                    	    // InternalOCCI.g:808:5: ( (lv_actions_20_0= ruleAction ) )
                    	    // InternalOCCI.g:809:6: (lv_actions_20_0= ruleAction )
                    	    {
                    	    // InternalOCCI.g:809:6: (lv_actions_20_0= ruleAction )
                    	    // InternalOCCI.g:810:7: lv_actions_20_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_actions_20_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMixinRule());
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
                    	    // InternalOCCI.g:828:5: ( (lv_constraints_21_0= ruleConstraint ) )
                    	    {
                    	    // InternalOCCI.g:828:5: ( (lv_constraints_21_0= ruleConstraint ) )
                    	    // InternalOCCI.g:829:6: (lv_constraints_21_0= ruleConstraint )
                    	    {
                    	    // InternalOCCI.g:829:6: (lv_constraints_21_0= ruleConstraint )
                    	    // InternalOCCI.g:830:7: lv_constraints_21_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getConstraintsConstraintParserRuleCall_7_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_constraints_21_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMixinRule());
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
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    otherlv_22=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_22, grammarAccess.getMixinAccess().getRightParenthesisKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:853:3: (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOCCI.g:854:4: otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_23, grammarAccess.getMixinAccess().getAnnotationsKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_24, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalOCCI.g:862:4: ( (lv_annotations_25_0= ruleAnnotation ) )
                    // InternalOCCI.g:863:5: (lv_annotations_25_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:863:5: (lv_annotations_25_0= ruleAnnotation )
                    // InternalOCCI.g:864:6: lv_annotations_25_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_annotations_25_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMixinRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_25_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:881:4: (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==28) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalOCCI.g:882:5: otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,28,FOLLOW_24); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getMixinAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalOCCI.g:886:5: ( (lv_annotations_27_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:887:6: (lv_annotations_27_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:887:6: (lv_annotations_27_0= ruleAnnotation )
                    	    // InternalOCCI.g:888:7: lv_annotations_27_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_annotations_27_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMixinRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_27_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_28, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_8_4());
                    			

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
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleAnnotation"
    // InternalOCCI.g:915:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalOCCI.g:915:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalOCCI.g:916:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalOCCI.g:922:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalOCCI.g:928:2: ( (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalOCCI.g:929:2: (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalOCCI.g:929:2: (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalOCCI.g:930:3: otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getKeyKeyword_1());
            		
            // InternalOCCI.g:938:3: ( (lv_key_2_0= RULE_STRING ) )
            // InternalOCCI.g:939:4: (lv_key_2_0= RULE_STRING )
            {
            // InternalOCCI.g:939:4: (lv_key_2_0= RULE_STRING )
            // InternalOCCI.g:940:5: lv_key_2_0= RULE_STRING
            {
            lv_key_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_key_2_0, grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getValueKeyword_3());
            		
            // InternalOCCI.g:960:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalOCCI.g:961:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalOCCI.g:961:4: (lv_value_4_0= RULE_STRING )
            // InternalOCCI.g:962:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_value_4_0, grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalOCCI.g:986:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOCCI.g:986:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOCCI.g:987:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOCCI.g:993:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? ) ;
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
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_annotations_15_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:999:2: ( (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? ) )
            // InternalOCCI.g:1000:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? )
            {
            // InternalOCCI.g:1000:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? )
            // InternalOCCI.g:1001:3: otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalOCCI.g:1005:3: ( (lv_mutable_1_0= 'mutable' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_ID||LA24_1==RULE_QUALIFIED_ID||LA24_1==12||(LA24_1>=14 && LA24_1<=15)||(LA24_1>=17 && LA24_1<=23)||LA24_1==26||(LA24_1>=30 && LA24_1<=38)||(LA24_1>=40 && LA24_1<=42)||(LA24_1>=51 && LA24_1<=70)||(LA24_1>=72 && LA24_1<=80)) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalOCCI.g:1006:4: (lv_mutable_1_0= 'mutable' )
                    {
                    // InternalOCCI.g:1006:4: (lv_mutable_1_0= 'mutable' )
                    // InternalOCCI.g:1007:5: lv_mutable_1_0= 'mutable'
                    {
                    lv_mutable_1_0=(Token)match(input,36,FOLLOW_13); 

                    					newLeafNode(lv_mutable_1_0, grammarAccess.getAttributeAccess().getMutableMutableKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1019:3: ( (lv_required_2_0= 'required' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_ID||LA25_1==RULE_QUALIFIED_ID||LA25_1==12||(LA25_1>=14 && LA25_1<=15)||(LA25_1>=17 && LA25_1<=23)||LA25_1==26||(LA25_1>=30 && LA25_1<=38)||(LA25_1>=40 && LA25_1<=42)||(LA25_1>=51 && LA25_1<=70)||(LA25_1>=72 && LA25_1<=80)) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalOCCI.g:1020:4: (lv_required_2_0= 'required' )
                    {
                    // InternalOCCI.g:1020:4: (lv_required_2_0= 'required' )
                    // InternalOCCI.g:1021:5: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,37,FOLLOW_13); 

                    					newLeafNode(lv_required_2_0, grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1033:3: ( (lv_name_3_0= ruleQualifiedID ) )
            // InternalOCCI.g:1034:4: (lv_name_3_0= ruleQualifiedID )
            {
            // InternalOCCI.g:1034:4: (lv_name_3_0= ruleQualifiedID )
            // InternalOCCI.g:1035:5: lv_name_3_0= ruleQualifiedID
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

            otherlv_4=(Token)match(input,13,FOLLOW_34); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4());
            		
            // InternalOCCI.g:1056:3: (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOCCI.g:1057:4: otherlv_5= 'type' ( ( ruleQualifiedID ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getTypeKeyword_5_0());
                    			
                    // InternalOCCI.g:1061:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1062:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1062:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1063:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1078:3: (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOCCI.g:1079:4: otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getEqualsSignKeyword_6_0());
                    			
                    // InternalOCCI.g:1083:4: ( (lv_default_8_0= RULE_STRING ) )
                    // InternalOCCI.g:1084:5: (lv_default_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1084:5: (lv_default_8_0= RULE_STRING )
                    // InternalOCCI.g:1085:6: lv_default_8_0= RULE_STRING
                    {
                    lv_default_8_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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

            // InternalOCCI.g:1102:3: (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOCCI.g:1103:4: otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalOCCI.g:1107:4: ( (lv_description_10_0= RULE_STRING ) )
                    // InternalOCCI.g:1108:5: (lv_description_10_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1108:5: (lv_description_10_0= RULE_STRING )
                    // InternalOCCI.g:1109:6: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_description_10_0, grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1126:3: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOCCI.g:1127:4: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getAnnotationsKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalOCCI.g:1135:4: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // InternalOCCI.g:1136:5: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1136:5: (lv_annotations_13_0= ruleAnnotation )
                    // InternalOCCI.g:1137:6: lv_annotations_13_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_annotations_13_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_13_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1154:4: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==28) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalOCCI.g:1155:5: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,28,FOLLOW_24); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalOCCI.g:1159:5: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1160:6: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1160:6: (lv_annotations_15_0= ruleAnnotation )
                    	    // InternalOCCI.g:1161:7: lv_annotations_15_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_8_4());
                    			

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
    // InternalOCCI.g:1188:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalOCCI.g:1188:47: (iv_ruleAction= ruleAction EOF )
            // InternalOCCI.g:1189:2: iv_ruleAction= ruleAction EOF
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
    // InternalOCCI.g:1195:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) ;
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
            // InternalOCCI.g:1201:2: ( (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) )
            // InternalOCCI.g:1202:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            {
            // InternalOCCI.g:1202:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            // InternalOCCI.g:1203:3: otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalOCCI.g:1207:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1208:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1208:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1209:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getSchemeKeyword_2());
            		
            // InternalOCCI.g:1230:3: ( (lv_scheme_3_0= RULE_STRING ) )
            // InternalOCCI.g:1231:4: (lv_scheme_3_0= RULE_STRING )
            {
            // InternalOCCI.g:1231:4: (lv_scheme_3_0= RULE_STRING )
            // InternalOCCI.g:1232:5: lv_scheme_3_0= RULE_STRING
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

            // InternalOCCI.g:1248:3: (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOCCI.g:1249:4: otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalOCCI.g:1253:4: ( (lv_attributes_5_0= ruleParameterDecl ) )
                    // InternalOCCI.g:1254:5: (lv_attributes_5_0= ruleParameterDecl )
                    {
                    // InternalOCCI.g:1254:5: (lv_attributes_5_0= ruleParameterDecl )
                    // InternalOCCI.g:1255:6: lv_attributes_5_0= ruleParameterDecl
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    // InternalOCCI.g:1272:4: (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==28) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalOCCI.g:1273:5: otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_13); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getActionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOCCI.g:1277:5: ( (lv_attributes_7_0= ruleParameterDecl ) )
                    	    // InternalOCCI.g:1278:6: (lv_attributes_7_0= ruleParameterDecl )
                    	    {
                    	    // InternalOCCI.g:1278:6: (lv_attributes_7_0= ruleParameterDecl )
                    	    // InternalOCCI.g:1279:7: lv_attributes_7_0= ruleParameterDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,25,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1302:3: (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOCCI.g:1303:4: otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_39); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getActionAccess().getTitleKeyword_5_1());
                    			
                    // InternalOCCI.g:1311:4: ( (lv_title_11_0= RULE_STRING ) )
                    // InternalOCCI.g:1312:5: (lv_title_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1312:5: (lv_title_11_0= RULE_STRING )
                    // InternalOCCI.g:1313:6: lv_title_11_0= RULE_STRING
                    {
                    lv_title_11_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

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

                    otherlv_12=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1334:3: (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOCCI.g:1335:4: otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionAccess().getAnnotationsKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_14, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOCCI.g:1343:4: ( (lv_annotations_15_0= ruleAnnotation ) )
                    // InternalOCCI.g:1344:5: (lv_annotations_15_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1344:5: (lv_annotations_15_0= ruleAnnotation )
                    // InternalOCCI.g:1345:6: lv_annotations_15_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_25);
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

                    // InternalOCCI.g:1362:4: (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==28) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalOCCI.g:1363:5: otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,28,FOLLOW_24); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getActionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOCCI.g:1367:5: ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1368:6: (lv_annotations_17_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1368:6: (lv_annotations_17_0= ruleAnnotation )
                    	    // InternalOCCI.g:1369:7: lv_annotations_17_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,29,FOLLOW_2); 

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
    // InternalOCCI.g:1396:1: entryRuleParameterDecl returns [EObject current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final EObject entryRuleParameterDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDecl = null;


        try {
            // InternalOCCI.g:1396:54: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalOCCI.g:1397:2: iv_ruleParameterDecl= ruleParameterDecl EOF
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
    // InternalOCCI.g:1403:1: ruleParameterDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleParameterDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_default_4_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1409:2: ( ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:1410:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:1410:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:1411:3: ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            {
            // InternalOCCI.g:1411:3: ( (lv_name_0_0= ruleQualifiedID ) )
            // InternalOCCI.g:1412:4: (lv_name_0_0= ruleQualifiedID )
            {
            // InternalOCCI.g:1412:4: (lv_name_0_0= ruleQualifiedID )
            // InternalOCCI.g:1413:5: lv_name_0_0= ruleQualifiedID
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
            		
            // InternalOCCI.g:1434:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:1435:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:1435:4: ( ruleQualifiedID )
            // InternalOCCI.g:1436:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterDeclRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterDeclAccess().getTypeDataTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_41);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:1450:3: (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOCCI.g:1451:4: otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDeclAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalOCCI.g:1455:4: ( (lv_default_4_0= RULE_STRING ) )
                    // InternalOCCI.g:1456:5: (lv_default_4_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1456:5: (lv_default_4_0= RULE_STRING )
                    // InternalOCCI.g:1457:6: lv_default_4_0= RULE_STRING
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
    // InternalOCCI.g:1478:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalOCCI.g:1478:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalOCCI.g:1479:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalOCCI.g:1485:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) ;
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
            // InternalOCCI.g:1491:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) )
            // InternalOCCI.g:1492:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            {
            // InternalOCCI.g:1492:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            // InternalOCCI.g:1493:3: otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalOCCI.g:1497:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1498:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1498:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1499:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalOCCI.g:1516:3: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOCCI.g:1517:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalOCCI.g:1521:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalOCCI.g:1522:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1522:5: (lv_description_3_0= RULE_STRING )
                    // InternalOCCI.g:1523:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

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

            otherlv_4=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getBodyKeyword_3());
            		
            // InternalOCCI.g:1544:3: ( (lv_body_5_0= RULE_STRING ) )
            // InternalOCCI.g:1545:4: (lv_body_5_0= RULE_STRING )
            {
            // InternalOCCI.g:1545:4: (lv_body_5_0= RULE_STRING )
            // InternalOCCI.g:1546:5: lv_body_5_0= RULE_STRING
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
    // InternalOCCI.g:1566:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalOCCI.g:1566:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalOCCI.g:1567:2: iv_ruleFSM= ruleFSM EOF
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
    // InternalOCCI.g:1573:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' otherlv_1= '(' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= ')' ) ;
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
            // InternalOCCI.g:1579:2: ( (otherlv_0= 'FSM' otherlv_1= '(' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= ')' ) )
            // InternalOCCI.g:1580:2: (otherlv_0= 'FSM' otherlv_1= '(' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= ')' )
            {
            // InternalOCCI.g:1580:2: (otherlv_0= 'FSM' otherlv_1= '(' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= ')' )
            // InternalOCCI.g:1581:3: otherlv_0= 'FSM' otherlv_1= '(' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFSMAccess().getAttributeKeyword_2());
            		
            // InternalOCCI.g:1593:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:1594:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:1594:4: ( ruleQualifiedID )
            // InternalOCCI.g:1595:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFSMRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFSMAccess().getAttributeAttributeCrossReference_3_0());
            				
            pushFollow(FOLLOW_45);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:1609:3: (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOCCI.g:1610:4: otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getFSMAccess().getStatesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_46); 

                    				newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalOCCI.g:1618:4: ( (lv_ownedState_6_0= ruleState ) )
                    // InternalOCCI.g:1619:5: (lv_ownedState_6_0= ruleState )
                    {
                    // InternalOCCI.g:1619:5: (lv_ownedState_6_0= ruleState )
                    // InternalOCCI.g:1620:6: lv_ownedState_6_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_25);
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

                    // InternalOCCI.g:1637:4: (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==28) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalOCCI.g:1638:5: otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_46); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOCCI.g:1642:5: ( (lv_ownedState_8_0= ruleState ) )
                    	    // InternalOCCI.g:1643:6: (lv_ownedState_8_0= ruleState )
                    	    {
                    	    // InternalOCCI.g:1643:6: (lv_ownedState_8_0= ruleState )
                    	    // InternalOCCI.g:1644:7: lv_ownedState_8_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFSMAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalOCCI.g:1675:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalOCCI.g:1675:46: (iv_ruleState= ruleState EOF )
            // InternalOCCI.g:1676:2: iv_ruleState= ruleState EOF
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
    // InternalOCCI.g:1682:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' otherlv_1= '(' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )? otherlv_12= ')' ) ;
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_outgoingTransition_8_0 = null;

        EObject lv_outgoingTransition_10_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1688:2: ( (otherlv_0= 'State' otherlv_1= '(' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )? otherlv_12= ')' ) )
            // InternalOCCI.g:1689:2: (otherlv_0= 'State' otherlv_1= '(' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )? otherlv_12= ')' )
            {
            // InternalOCCI.g:1689:2: (otherlv_0= 'State' otherlv_1= '(' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )? otherlv_12= ')' )
            // InternalOCCI.g:1690:3: otherlv_0= 'State' otherlv_1= '(' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )? otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOCCI.g:1698:3: ( (lv_initial_2_0= 'initial' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOCCI.g:1699:4: (lv_initial_2_0= 'initial' )
                    {
                    // InternalOCCI.g:1699:4: (lv_initial_2_0= 'initial' )
                    // InternalOCCI.g:1700:5: lv_initial_2_0= 'initial'
                    {
                    lv_initial_2_0=(Token)match(input,46,FOLLOW_48); 

                    					newLeafNode(lv_initial_2_0, grammarAccess.getStateAccess().getInitialInitialKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1712:3: ( (lv_final_3_0= 'final' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOCCI.g:1713:4: (lv_final_3_0= 'final' )
                    {
                    // InternalOCCI.g:1713:4: (lv_final_3_0= 'final' )
                    // InternalOCCI.g:1714:5: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,47,FOLLOW_49); 

                    					newLeafNode(lv_final_3_0, grammarAccess.getStateAccess().getFinalFinalKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1726:3: (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:1727:4: otherlv_4= 'literal' ( ( ruleQualifiedID ) )
            {
            otherlv_4=(Token)match(input,48,FOLLOW_13); 

            				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLiteralKeyword_4_0());
            			
            // InternalOCCI.g:1731:4: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:1732:5: ( ruleQualifiedID )
            {
            // InternalOCCI.g:1732:5: ( ruleQualifiedID )
            // InternalOCCI.g:1733:6: ruleQualifiedID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getStateRule());
            						}
            					

            						newCompositeNode(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_4_1_0());
            					
            pushFollow(FOLLOW_50);
            ruleQualifiedID();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOCCI.g:1748:3: (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOCCI.g:1749:4: otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getTransitionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,24,FOLLOW_51); 

                    				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalOCCI.g:1757:4: ( (lv_outgoingTransition_8_0= ruleTransition ) )
                    // InternalOCCI.g:1758:5: (lv_outgoingTransition_8_0= ruleTransition )
                    {
                    // InternalOCCI.g:1758:5: (lv_outgoingTransition_8_0= ruleTransition )
                    // InternalOCCI.g:1759:6: lv_outgoingTransition_8_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    // InternalOCCI.g:1776:4: (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==28) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalOCCI.g:1777:5: otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) )
                    	    {
                    	    otherlv_9=(Token)match(input,28,FOLLOW_51); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalOCCI.g:1781:5: ( (lv_outgoingTransition_10_0= ruleTransition ) )
                    	    // InternalOCCI.g:1782:6: (lv_outgoingTransition_10_0= ruleTransition )
                    	    {
                    	    // InternalOCCI.g:1782:6: (lv_outgoingTransition_10_0= ruleTransition )
                    	    // InternalOCCI.g:1783:7: lv_outgoingTransition_10_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_outgoingTransition_10_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outgoingTransition",
                    	    								lv_outgoingTransition_10_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,25,FOLLOW_33); 

                    				newLeafNode(otherlv_11, grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getStateAccess().getRightParenthesisKeyword_6());
            		

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
    // InternalOCCI.g:1814:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalOCCI.g:1814:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalOCCI.g:1815:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalOCCI.g:1821:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOCCI.g:1827:2: ( ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) )
            // InternalOCCI.g:1828:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            {
            // InternalOCCI.g:1828:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:1829:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:1829:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOCCI.g:1830:4: otherlv_0= 'action' ( ( ruleQualifiedID ) )
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getActionKeyword_0_0());
                    			
                    // InternalOCCI.g:1834:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1835:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1835:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1836:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getActionActionCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,50,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToKeyword_1());
            		
            // InternalOCCI.g:1855:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:1856:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:1856:4: ( ruleQualifiedID )
            // InternalOCCI.g:1857:5: ruleQualifiedID
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
    // InternalOCCI.g:1875:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalOCCI.g:1875:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalOCCI.g:1876:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalOCCI.g:1882:1: ruleDataType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) ;
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
            // InternalOCCI.g:1888:2: ( (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) )
            // InternalOCCI.g:1889:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            {
            // InternalOCCI.g:1889:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            int alt45=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt45=1;
                }
                break;
            case 57:
                {
                alt45=2;
                }
                break;
            case 59:
                {
                alt45=3;
                }
                break;
            case 60:
                {
                alt45=4;
                }
                break;
            case 66:
                {
                alt45=5;
                }
                break;
            case 68:
                {
                alt45=6;
                }
                break;
            case 70:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalOCCI.g:1890:3: this_StringType_0= ruleStringType
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
                    // InternalOCCI.g:1899:3: this_EObjectType_1= ruleEObjectType
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
                    // InternalOCCI.g:1908:3: this_BooleanType_2= ruleBooleanType
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
                    // InternalOCCI.g:1917:3: this_NumericType_3= ruleNumericType
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
                    // InternalOCCI.g:1926:3: this_EnumerationType_4= ruleEnumerationType
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
                    // InternalOCCI.g:1935:3: this_RecordType_5= ruleRecordType
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
                    // InternalOCCI.g:1944:3: this_ArrayType_6= ruleArrayType
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
    // InternalOCCI.g:1956:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalOCCI.g:1956:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalOCCI.g:1957:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalOCCI.g:1963:1: ruleStringType returns [EObject current=null] : (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_pattern_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_documentation_11_0=null;
        AntlrDatatypeRuleToken lv_length_5_0 = null;

        AntlrDatatypeRuleToken lv_minLength_7_0 = null;

        AntlrDatatypeRuleToken lv_maxLength_9_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1969:2: ( (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:1970:2: (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:1970:2: (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:1971:3: otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStringTypeAccess().getStringTypeKeyword_0());
            		
            // InternalOCCI.g:1975:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:1976:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:1976:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:1977:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

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

            // InternalOCCI.g:1993:3: (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOCCI.g:1994:4: otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getPatternKeyword_2_0());
                    			
                    // InternalOCCI.g:1998:4: ( (lv_pattern_3_0= RULE_STRING ) )
                    // InternalOCCI.g:1999:5: (lv_pattern_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1999:5: (lv_pattern_3_0= RULE_STRING )
                    // InternalOCCI.g:2000:6: lv_pattern_3_0= RULE_STRING
                    {
                    lv_pattern_3_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

                    						newLeafNode(lv_pattern_3_0, grammarAccess.getStringTypeAccess().getPatternSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pattern",
                    							lv_pattern_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2017:3: (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOCCI.g:2018:4: otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_55); 

                    				newLeafNode(otherlv_4, grammarAccess.getStringTypeAccess().getLengthKeyword_3_0());
                    			
                    // InternalOCCI.g:2022:4: ( (lv_length_5_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2023:5: (lv_length_5_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2023:5: (lv_length_5_0= ruleEIntegerObject )
                    // InternalOCCI.g:2024:6: lv_length_5_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getLengthEIntegerObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_length_5_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"length",
                    							lv_length_5_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2042:3: (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOCCI.g:2043:4: otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) )
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_55); 

                    				newLeafNode(otherlv_6, grammarAccess.getStringTypeAccess().getMinLengthKeyword_4_0());
                    			
                    // InternalOCCI.g:2047:4: ( (lv_minLength_7_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2048:5: (lv_minLength_7_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2048:5: (lv_minLength_7_0= ruleEIntegerObject )
                    // InternalOCCI.g:2049:6: lv_minLength_7_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMinLengthEIntegerObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_minLength_7_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"minLength",
                    							lv_minLength_7_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2067:3: (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOCCI.g:2068:4: otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) )
                    {
                    otherlv_8=(Token)match(input,55,FOLLOW_55); 

                    				newLeafNode(otherlv_8, grammarAccess.getStringTypeAccess().getMaxLengthKeyword_5_0());
                    			
                    // InternalOCCI.g:2072:4: ( (lv_maxLength_9_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2073:5: (lv_maxLength_9_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2073:5: (lv_maxLength_9_0= ruleEIntegerObject )
                    // InternalOCCI.g:2074:6: lv_maxLength_9_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMaxLengthEIntegerObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_maxLength_9_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"maxLength",
                    							lv_maxLength_9_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2092:3: (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==56) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalOCCI.g:2093:4: otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getStringTypeAccess().getDocumentationKeyword_6_0());
                    			
                    // InternalOCCI.g:2097:4: ( (lv_documentation_11_0= RULE_STRING ) )
                    // InternalOCCI.g:2098:5: (lv_documentation_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2098:5: (lv_documentation_11_0= RULE_STRING )
                    // InternalOCCI.g:2099:6: lv_documentation_11_0= RULE_STRING
                    {
                    lv_documentation_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_documentation_11_0, grammarAccess.getStringTypeAccess().getDocumentationSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_11_0,
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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleEObjectType"
    // InternalOCCI.g:2120:1: entryRuleEObjectType returns [EObject current=null] : iv_ruleEObjectType= ruleEObjectType EOF ;
    public final EObject entryRuleEObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectType = null;


        try {
            // InternalOCCI.g:2120:52: (iv_ruleEObjectType= ruleEObjectType EOF )
            // InternalOCCI.g:2121:2: iv_ruleEObjectType= ruleEObjectType EOF
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
    // InternalOCCI.g:2127:1: ruleEObjectType returns [EObject current=null] : (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_instanceClassName_3_0=null;
        Token otherlv_4=null;
        Token lv_documentation_5_0=null;


        	enterRule();

        try {
            // InternalOCCI.g:2133:2: ( (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2134:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2134:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2135:3: otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEObjectTypeAccess().getEObjectTypeKeyword_0());
            		
            // InternalOCCI.g:2139:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:2140:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:2140:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:2141:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_59); 

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

            // InternalOCCI.g:2157:3: (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==58) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOCCI.g:2158:4: otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getEObjectTypeAccess().getInstanceClassNameKeyword_2_0());
                    			
                    // InternalOCCI.g:2162:4: ( (lv_instanceClassName_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2163:5: (lv_instanceClassName_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2163:5: (lv_instanceClassName_3_0= RULE_STRING )
                    // InternalOCCI.g:2164:6: lv_instanceClassName_3_0= RULE_STRING
                    {
                    lv_instanceClassName_3_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    						newLeafNode(lv_instanceClassName_3_0, grammarAccess.getEObjectTypeAccess().getInstanceClassNameSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEObjectTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2181:3: (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==56) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOCCI.g:2182:4: otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getEObjectTypeAccess().getDocumentationKeyword_3_0());
                    			
                    // InternalOCCI.g:2186:4: ( (lv_documentation_5_0= RULE_STRING ) )
                    // InternalOCCI.g:2187:5: (lv_documentation_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2187:5: (lv_documentation_5_0= RULE_STRING )
                    // InternalOCCI.g:2188:6: lv_documentation_5_0= RULE_STRING
                    {
                    lv_documentation_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_documentation_5_0, grammarAccess.getEObjectTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEObjectTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_5_0,
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
    // $ANTLR end "ruleEObjectType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalOCCI.g:2209:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalOCCI.g:2209:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalOCCI.g:2210:2: iv_ruleBooleanType= ruleBooleanType EOF
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
    // InternalOCCI.g:2216:1: ruleBooleanType returns [EObject current=null] : (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_documentation_3_0=null;


        	enterRule();

        try {
            // InternalOCCI.g:2222:2: ( (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2223:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2223:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2224:3: otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_0());
            		
            // InternalOCCI.g:2228:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:2229:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:2229:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:2230:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_58); 

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

            // InternalOCCI.g:2246:3: (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==56) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOCCI.g:2247:4: otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanTypeAccess().getDocumentationKeyword_2_0());
                    			
                    // InternalOCCI.g:2251:4: ( (lv_documentation_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2252:5: (lv_documentation_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2252:5: (lv_documentation_3_0= RULE_STRING )
                    // InternalOCCI.g:2253:6: lv_documentation_3_0= RULE_STRING
                    {
                    lv_documentation_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_documentation_3_0, grammarAccess.getBooleanTypeAccess().getDocumentationSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanTypeRule());
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
    // InternalOCCI.g:2274:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // InternalOCCI.g:2274:52: (iv_ruleNumericType= ruleNumericType EOF )
            // InternalOCCI.g:2275:2: iv_ruleNumericType= ruleNumericType EOF
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
    // InternalOCCI.g:2281:1: ruleNumericType returns [EObject current=null] : (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )? otherlv_17= ')' ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_minExclusive_8_0=null;
        Token otherlv_9=null;
        Token lv_maxExclusive_10_0=null;
        Token otherlv_11=null;
        Token lv_minInclusive_12_0=null;
        Token otherlv_13=null;
        Token lv_maxInclusive_14_0=null;
        Token otherlv_15=null;
        Token lv_documentation_16_0=null;
        Token otherlv_17=null;
        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_totalDigits_6_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2287:2: ( (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )? otherlv_17= ')' ) )
            // InternalOCCI.g:2288:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )? otherlv_17= ')' )
            {
            // InternalOCCI.g:2288:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )? otherlv_17= ')' )
            // InternalOCCI.g:2289:3: otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )? otherlv_17= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNumericTypeAccess().getNumericTypeKeyword_0());
            		
            // InternalOCCI.g:2293:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:2294:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:2294:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:2295:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_60); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericTypeAccess().getTypeKeyword_2());
            		
            // InternalOCCI.g:2315:3: ( (lv_type_3_0= ruleNumericTypeEnum ) )
            // InternalOCCI.g:2316:4: (lv_type_3_0= ruleNumericTypeEnum )
            {
            // InternalOCCI.g:2316:4: (lv_type_3_0= ruleNumericTypeEnum )
            // InternalOCCI.g:2317:5: lv_type_3_0= ruleNumericTypeEnum
            {

            					newCompositeNode(grammarAccess.getNumericTypeAccess().getTypeNumericTypeEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_4=(Token)match(input,24,FOLLOW_62); 

            			newLeafNode(otherlv_4, grammarAccess.getNumericTypeAccess().getLeftParenthesisKeyword_4());
            		
            // InternalOCCI.g:2338:3: (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==61) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOCCI.g:2339:4: otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) )
                    {
                    otherlv_5=(Token)match(input,61,FOLLOW_55); 

                    				newLeafNode(otherlv_5, grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_5_0());
                    			
                    // InternalOCCI.g:2343:4: ( (lv_totalDigits_6_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2344:5: (lv_totalDigits_6_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2344:5: (lv_totalDigits_6_0= ruleEIntegerObject )
                    // InternalOCCI.g:2345:6: lv_totalDigits_6_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getNumericTypeAccess().getTotalDigitsEIntegerObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_totalDigits_6_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                    						}
                    						set(
                    							current,
                    							"totalDigits",
                    							lv_totalDigits_6_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2363:3: (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==62) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOCCI.g:2364:4: otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,62,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_6_0());
                    			
                    // InternalOCCI.g:2368:4: ( (lv_minExclusive_8_0= RULE_STRING ) )
                    // InternalOCCI.g:2369:5: (lv_minExclusive_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2369:5: (lv_minExclusive_8_0= RULE_STRING )
                    // InternalOCCI.g:2370:6: lv_minExclusive_8_0= RULE_STRING
                    {
                    lv_minExclusive_8_0=(Token)match(input,RULE_STRING,FOLLOW_64); 

                    						newLeafNode(lv_minExclusive_8_0, grammarAccess.getNumericTypeAccess().getMinExclusiveSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minExclusive",
                    							lv_minExclusive_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2387:3: (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==63) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOCCI.g:2388:4: otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,63,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_7_0());
                    			
                    // InternalOCCI.g:2392:4: ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    // InternalOCCI.g:2393:5: (lv_maxExclusive_10_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2393:5: (lv_maxExclusive_10_0= RULE_STRING )
                    // InternalOCCI.g:2394:6: lv_maxExclusive_10_0= RULE_STRING
                    {
                    lv_maxExclusive_10_0=(Token)match(input,RULE_STRING,FOLLOW_65); 

                    						newLeafNode(lv_maxExclusive_10_0, grammarAccess.getNumericTypeAccess().getMaxExclusiveSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxExclusive",
                    							lv_maxExclusive_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2411:3: (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==64) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOCCI.g:2412:4: otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,64,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_8_0());
                    			
                    // InternalOCCI.g:2416:4: ( (lv_minInclusive_12_0= RULE_STRING ) )
                    // InternalOCCI.g:2417:5: (lv_minInclusive_12_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2417:5: (lv_minInclusive_12_0= RULE_STRING )
                    // InternalOCCI.g:2418:6: lv_minInclusive_12_0= RULE_STRING
                    {
                    lv_minInclusive_12_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

                    						newLeafNode(lv_minInclusive_12_0, grammarAccess.getNumericTypeAccess().getMinInclusiveSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minInclusive",
                    							lv_minInclusive_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2435:3: (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==65) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalOCCI.g:2436:4: otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,65,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_9_0());
                    			
                    // InternalOCCI.g:2440:4: ( (lv_maxInclusive_14_0= RULE_STRING ) )
                    // InternalOCCI.g:2441:5: (lv_maxInclusive_14_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2441:5: (lv_maxInclusive_14_0= RULE_STRING )
                    // InternalOCCI.g:2442:6: lv_maxInclusive_14_0= RULE_STRING
                    {
                    lv_maxInclusive_14_0=(Token)match(input,RULE_STRING,FOLLOW_67); 

                    						newLeafNode(lv_maxInclusive_14_0, grammarAccess.getNumericTypeAccess().getMaxInclusiveSTRINGTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxInclusive",
                    							lv_maxInclusive_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2459:3: (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==56) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOCCI.g:2460:4: otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getNumericTypeAccess().getDocumentationKeyword_10_0());
                    			
                    // InternalOCCI.g:2464:4: ( (lv_documentation_16_0= RULE_STRING ) )
                    // InternalOCCI.g:2465:5: (lv_documentation_16_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2465:5: (lv_documentation_16_0= RULE_STRING )
                    // InternalOCCI.g:2466:6: lv_documentation_16_0= RULE_STRING
                    {
                    lv_documentation_16_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    						newLeafNode(lv_documentation_16_0, grammarAccess.getNumericTypeAccess().getDocumentationSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,25,FOLLOW_2); 

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
    // InternalOCCI.g:2491:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // InternalOCCI.g:2491:56: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // InternalOCCI.g:2492:2: iv_ruleEnumerationType= ruleEnumerationType EOF
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
    // InternalOCCI.g:2498:1: ruleEnumerationType returns [EObject current=null] : (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_documentation_9_0=null;
        EObject lv_literals_4_0 = null;

        EObject lv_literals_6_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2504:2: ( (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2505:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2505:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2506:3: otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0());
            		
            // InternalOCCI.g:2510:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:2511:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:2511:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:2512:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_68); 

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

            otherlv_2=(Token)match(input,67,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_3());
            		
            // InternalOCCI.g:2536:3: ( (lv_literals_4_0= ruleEnumerationLiteral ) )
            // InternalOCCI.g:2537:4: (lv_literals_4_0= ruleEnumerationLiteral )
            {
            // InternalOCCI.g:2537:4: (lv_literals_4_0= ruleEnumerationLiteral )
            // InternalOCCI.g:2538:5: lv_literals_4_0= ruleEnumerationLiteral
            {

            					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_literals_4_0=ruleEnumerationLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            					}
            					add(
            						current,
            						"literals",
            						lv_literals_4_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.EnumerationLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2555:3: (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==28) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalOCCI.g:2556:4: otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_5=(Token)match(input,28,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalOCCI.g:2560:4: ( (lv_literals_6_0= ruleEnumerationLiteral ) )
            	    // InternalOCCI.g:2561:5: (lv_literals_6_0= ruleEnumerationLiteral )
            	    {
            	    // InternalOCCI.g:2561:5: (lv_literals_6_0= ruleEnumerationLiteral )
            	    // InternalOCCI.g:2562:6: lv_literals_6_0= ruleEnumerationLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_literals_6_0=ruleEnumerationLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"literals",
            	    							lv_literals_6_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.EnumerationLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_58); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_6());
            		
            // InternalOCCI.g:2584:3: (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==56) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOCCI.g:2585:4: otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnumerationTypeAccess().getDocumentationKeyword_7_0());
                    			
                    // InternalOCCI.g:2589:4: ( (lv_documentation_9_0= RULE_STRING ) )
                    // InternalOCCI.g:2590:5: (lv_documentation_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2590:5: (lv_documentation_9_0= RULE_STRING )
                    // InternalOCCI.g:2591:6: lv_documentation_9_0= RULE_STRING
                    {
                    lv_documentation_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_documentation_9_0, grammarAccess.getEnumerationTypeAccess().getDocumentationSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumerationTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_9_0,
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
    // $ANTLR end "ruleEnumerationType"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalOCCI.g:2612:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalOCCI.g:2612:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalOCCI.g:2613:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalOCCI.g:2619:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_documentation_2_0=null;


        	enterRule();

        try {
            // InternalOCCI.g:2625:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2626:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2626:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2627:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )?
            {
            // InternalOCCI.g:2627:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOCCI.g:2628:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOCCI.g:2628:4: (lv_name_0_0= RULE_ID )
            // InternalOCCI.g:2629:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_58); 

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

            // InternalOCCI.g:2645:3: (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==56) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOCCI.g:2646:4: otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getDocumentationKeyword_1_0());
                    			
                    // InternalOCCI.g:2650:4: ( (lv_documentation_2_0= RULE_STRING ) )
                    // InternalOCCI.g:2651:5: (lv_documentation_2_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2651:5: (lv_documentation_2_0= RULE_STRING )
                    // InternalOCCI.g:2652:6: lv_documentation_2_0= RULE_STRING
                    {
                    lv_documentation_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_documentation_2_0, grammarAccess.getEnumerationLiteralAccess().getDocumentationSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumerationLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_2_0,
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
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleRecordType"
    // InternalOCCI.g:2673:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // InternalOCCI.g:2673:51: (iv_ruleRecordType= ruleRecordType EOF )
            // InternalOCCI.g:2674:2: iv_ruleRecordType= ruleRecordType EOF
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
    // InternalOCCI.g:2680:1: ruleRecordType returns [EObject current=null] : (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_documentation_9_0=null;
        EObject lv_recordFields_4_0 = null;

        EObject lv_recordFields_6_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2686:2: ( (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2687:2: (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2687:2: (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2688:3: otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getRecordTypeKeyword_0());
            		
            // InternalOCCI.g:2692:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:2693:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:2693:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:2694:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_69); 

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

            otherlv_2=(Token)match(input,69,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getFieldsKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_3());
            		
            // InternalOCCI.g:2718:3: ( (lv_recordFields_4_0= ruleRecordField ) )
            // InternalOCCI.g:2719:4: (lv_recordFields_4_0= ruleRecordField )
            {
            // InternalOCCI.g:2719:4: (lv_recordFields_4_0= ruleRecordField )
            // InternalOCCI.g:2720:5: lv_recordFields_4_0= ruleRecordField
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_recordFields_4_0=ruleRecordField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            					}
            					add(
            						current,
            						"recordFields",
            						lv_recordFields_4_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.RecordField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2737:3: (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==28) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalOCCI.g:2738:4: otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) )
            	    {
            	    otherlv_5=(Token)match(input,28,FOLLOW_13); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalOCCI.g:2742:4: ( (lv_recordFields_6_0= ruleRecordField ) )
            	    // InternalOCCI.g:2743:5: (lv_recordFields_6_0= ruleRecordField )
            	    {
            	    // InternalOCCI.g:2743:5: (lv_recordFields_6_0= ruleRecordField )
            	    // InternalOCCI.g:2744:6: lv_recordFields_6_0= ruleRecordField
            	    {

            	    						newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_recordFields_6_0=ruleRecordField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recordFields",
            	    							lv_recordFields_6_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.RecordField");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_58); 

            			newLeafNode(otherlv_7, grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_6());
            		
            // InternalOCCI.g:2766:3: (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==56) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalOCCI.g:2767:4: otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getRecordTypeAccess().getDocumentationKeyword_7_0());
                    			
                    // InternalOCCI.g:2771:4: ( (lv_documentation_9_0= RULE_STRING ) )
                    // InternalOCCI.g:2772:5: (lv_documentation_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2772:5: (lv_documentation_9_0= RULE_STRING )
                    // InternalOCCI.g:2773:6: lv_documentation_9_0= RULE_STRING
                    {
                    lv_documentation_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_documentation_9_0, grammarAccess.getRecordTypeAccess().getDocumentationSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecordTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_9_0,
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
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleRecordField"
    // InternalOCCI.g:2794:1: entryRuleRecordField returns [EObject current=null] : iv_ruleRecordField= ruleRecordField EOF ;
    public final EObject entryRuleRecordField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordField = null;


        try {
            // InternalOCCI.g:2794:52: (iv_ruleRecordField= ruleRecordField EOF )
            // InternalOCCI.g:2795:2: iv_ruleRecordField= ruleRecordField EOF
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
    // InternalOCCI.g:2801:1: ruleRecordField returns [EObject current=null] : ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleRecordField() throws RecognitionException {
        EObject current = null;

        Token lv_mutable_0_0=null;
        Token lv_required_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_default_6_0=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_annotations_11_0 = null;

        EObject lv_annotations_13_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2807:2: ( ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) )
            // InternalOCCI.g:2808:2: ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            {
            // InternalOCCI.g:2808:2: ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            // InternalOCCI.g:2809:3: ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            {
            // InternalOCCI.g:2809:3: ( (lv_mutable_0_0= 'mutable' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==36) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==RULE_ID||LA65_1==RULE_QUALIFIED_ID||LA65_1==12||(LA65_1>=14 && LA65_1<=15)||(LA65_1>=17 && LA65_1<=23)||LA65_1==26||(LA65_1>=30 && LA65_1<=37)||(LA65_1>=40 && LA65_1<=42)||(LA65_1>=51 && LA65_1<=70)||(LA65_1>=72 && LA65_1<=80)) ) {
                    alt65=1;
                }
                else if ( (LA65_1==38) ) {
                    int LA65_4 = input.LA(3);

                    if ( (LA65_4==38) ) {
                        switch ( input.LA(4) ) {
                            case RULE_ID:
                            case RULE_QUALIFIED_ID:
                            case 12:
                            case 15:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 40:
                            case 41:
                            case 42:
                            case 51:
                            case 52:
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
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                                {
                                alt65=1;
                                }
                                break;
                            case 14:
                                {
                                int LA65_6 = input.LA(5);

                                if ( (LA65_6==EOF||LA65_6==14||(LA65_6>=25 && LA65_6<=26)||LA65_6==28||LA65_6==39) ) {
                                    alt65=1;
                                }
                                }
                                break;
                            case 26:
                                {
                                int LA65_7 = input.LA(5);

                                if ( (LA65_7==EOF||LA65_7==14||(LA65_7>=25 && LA65_7<=26)||LA65_7==28||LA65_7==39) ) {
                                    alt65=1;
                                }
                                }
                                break;
                        }

                    }
                }
            }
            switch (alt65) {
                case 1 :
                    // InternalOCCI.g:2810:4: (lv_mutable_0_0= 'mutable' )
                    {
                    // InternalOCCI.g:2810:4: (lv_mutable_0_0= 'mutable' )
                    // InternalOCCI.g:2811:5: lv_mutable_0_0= 'mutable'
                    {
                    lv_mutable_0_0=(Token)match(input,36,FOLLOW_13); 

                    					newLeafNode(lv_mutable_0_0, grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2823:3: ( (lv_required_1_0= 'required' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==37) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==RULE_ID||LA66_1==RULE_QUALIFIED_ID||LA66_1==12||(LA66_1>=14 && LA66_1<=15)||(LA66_1>=17 && LA66_1<=23)||LA66_1==26||(LA66_1>=30 && LA66_1<=37)||(LA66_1>=40 && LA66_1<=42)||(LA66_1>=51 && LA66_1<=70)||(LA66_1>=72 && LA66_1<=80)) ) {
                    alt66=1;
                }
                else if ( (LA66_1==38) ) {
                    int LA66_4 = input.LA(3);

                    if ( (LA66_4==38) ) {
                        switch ( input.LA(4) ) {
                            case RULE_ID:
                            case RULE_QUALIFIED_ID:
                            case 12:
                            case 15:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 40:
                            case 41:
                            case 42:
                            case 51:
                            case 52:
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
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                                {
                                alt66=1;
                                }
                                break;
                            case 14:
                                {
                                int LA66_6 = input.LA(5);

                                if ( (LA66_6==EOF||LA66_6==14||(LA66_6>=25 && LA66_6<=26)||LA66_6==28||LA66_6==39) ) {
                                    alt66=1;
                                }
                                }
                                break;
                            case 26:
                                {
                                int LA66_7 = input.LA(5);

                                if ( (LA66_7==EOF||LA66_7==14||(LA66_7>=25 && LA66_7<=26)||LA66_7==28||LA66_7==39) ) {
                                    alt66=1;
                                }
                                }
                                break;
                        }

                    }
                }
            }
            switch (alt66) {
                case 1 :
                    // InternalOCCI.g:2824:4: (lv_required_1_0= 'required' )
                    {
                    // InternalOCCI.g:2824:4: (lv_required_1_0= 'required' )
                    // InternalOCCI.g:2825:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,37,FOLLOW_13); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2837:3: ( (lv_name_2_0= ruleQualifiedID ) )
            // InternalOCCI.g:2838:4: (lv_name_2_0= ruleQualifiedID )
            {
            // InternalOCCI.g:2838:4: (lv_name_2_0= ruleQualifiedID )
            // InternalOCCI.g:2839:5: lv_name_2_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getRecordFieldAccess().getNameQualifiedIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_60);
            lv_name_2_0=ruleQualifiedID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.QualifiedID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2856:3: (otherlv_3= 'type' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:2857:4: otherlv_3= 'type' ( ( ruleQualifiedID ) )
            {
            otherlv_3=(Token)match(input,38,FOLLOW_13); 

            				newLeafNode(otherlv_3, grammarAccess.getRecordFieldAccess().getTypeKeyword_3_0());
            			
            // InternalOCCI.g:2861:4: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2862:5: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2862:5: ( ruleQualifiedID )
            // InternalOCCI.g:2863:6: ruleQualifiedID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRecordFieldRule());
            						}
            					

            						newCompositeNode(grammarAccess.getRecordFieldAccess().getTypeDataTypeCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_35);
            ruleQualifiedID();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOCCI.g:2878:3: (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==39) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOCCI.g:2879:4: otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRecordFieldAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalOCCI.g:2883:4: ( (lv_default_6_0= RULE_STRING ) )
                    // InternalOCCI.g:2884:5: (lv_default_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2884:5: (lv_default_6_0= RULE_STRING )
                    // InternalOCCI.g:2885:6: lv_default_6_0= RULE_STRING
                    {
                    lv_default_6_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

                    						newLeafNode(lv_default_6_0, grammarAccess.getRecordFieldAccess().getDefaultSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecordFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2902:3: (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==14) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalOCCI.g:2903:4: otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getRecordFieldAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalOCCI.g:2907:4: ( (lv_description_8_0= RULE_STRING ) )
                    // InternalOCCI.g:2908:5: (lv_description_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2908:5: (lv_description_8_0= RULE_STRING )
                    // InternalOCCI.g:2909:6: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_description_8_0, grammarAccess.getRecordFieldAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecordFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2926:3: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==26) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalOCCI.g:2927:4: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getRecordFieldAccess().getAnnotationsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOCCI.g:2935:4: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // InternalOCCI.g:2936:5: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:2936:5: (lv_annotations_11_0= ruleAnnotation )
                    // InternalOCCI.g:2937:6: lv_annotations_11_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_annotations_11_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecordFieldRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_11_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:2954:4: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==28) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalOCCI.g:2955:5: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,28,FOLLOW_24); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRecordFieldAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOCCI.g:2959:5: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:2960:6: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:2960:6: (lv_annotations_13_0= ruleAnnotation )
                    	    // InternalOCCI.g:2961:7: lv_annotations_13_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_annotations_13_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRecordFieldRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_13_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getRecordFieldAccess().getRightCurlyBracketKeyword_6_4());
                    			

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
    // InternalOCCI.g:2988:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalOCCI.g:2988:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalOCCI.g:2989:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalOCCI.g:2995:1: ruleArrayType returns [EObject current=null] : (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )? ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_documentation_5_0=null;


        	enterRule();

        try {
            // InternalOCCI.g:3001:2: ( (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )? ) )
            // InternalOCCI.g:3002:2: (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )? )
            {
            // InternalOCCI.g:3002:2: (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )? )
            // InternalOCCI.g:3003:3: otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getArrayTypeKeyword_0());
            		
            // InternalOCCI.g:3007:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:3008:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:3008:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:3009:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_60); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalOCCI.g:3029:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:3030:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:3030:4: ( ruleQualifiedID )
            // InternalOCCI.g:3031:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArrayTypeAccess().getTypeDataTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_70);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_71); 

            			newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getDocumentationKeyword_4());
            		
            // InternalOCCI.g:3049:3: ( (lv_documentation_5_0= RULE_STRING ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_STRING) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalOCCI.g:3050:4: (lv_documentation_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3050:4: (lv_documentation_5_0= RULE_STRING )
                    // InternalOCCI.g:3051:5: lv_documentation_5_0= RULE_STRING
                    {
                    lv_documentation_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_documentation_5_0, grammarAccess.getArrayTypeAccess().getDocumentationSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getArrayTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalOCCI.g:3071:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalOCCI.g:3071:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalOCCI.g:3072:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalOCCI.g:3078:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOCCI.g:3084:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalOCCI.g:3085:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalOCCI.g:3085:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalOCCI.g:3086:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalOCCI.g:3086:3: (kw= '-' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==71) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalOCCI.g:3087:4: kw= '-'
                    {
                    kw=(Token)match(input,71,FOLLOW_72); 

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
    // InternalOCCI.g:3104:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // InternalOCCI.g:3104:51: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // InternalOCCI.g:3105:2: iv_ruleQualifiedID= ruleQualifiedID EOF
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
    // InternalOCCI.g:3111:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_QUALIFIED_ID_1=null;
        AntlrDatatypeRuleToken this_KEYWORD_2 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3117:2: ( (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) )
            // InternalOCCI.g:3118:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            {
            // InternalOCCI.g:3118:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            int alt73=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt73=1;
                }
                break;
            case RULE_QUALIFIED_ID:
                {
                alt73=2;
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
            case 23:
            case 26:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 40:
            case 41:
            case 42:
            case 51:
            case 52:
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
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
                {
                alt73=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalOCCI.g:3119:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3127:3: this_QUALIFIED_ID_1= RULE_QUALIFIED_ID
                    {
                    this_QUALIFIED_ID_1=(Token)match(input,RULE_QUALIFIED_ID,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_ID_1);
                    		

                    			newLeafNode(this_QUALIFIED_ID_1, grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3135:3: this_KEYWORD_2= ruleKEYWORD
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
    // InternalOCCI.g:3149:1: entryRuleNameID returns [String current=null] : iv_ruleNameID= ruleNameID EOF ;
    public final String entryRuleNameID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameID = null;


        try {
            // InternalOCCI.g:3149:46: (iv_ruleNameID= ruleNameID EOF )
            // InternalOCCI.g:3150:2: iv_ruleNameID= ruleNameID EOF
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
    // InternalOCCI.g:3156:1: ruleNameID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleNameID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_KEYWORD_3 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3162:2: ( ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) )
            // InternalOCCI.g:3163:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            {
            // InternalOCCI.g:3163:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            else if ( (LA75_0==12||(LA75_0>=14 && LA75_0<=15)||(LA75_0>=17 && LA75_0<=23)||LA75_0==26||(LA75_0>=30 && LA75_0<=38)||(LA75_0>=40 && LA75_0<=42)||(LA75_0>=51 && LA75_0<=70)||(LA75_0>=72 && LA75_0<=80)) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalOCCI.g:3164:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    {
                    // InternalOCCI.g:3164:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    // InternalOCCI.g:3165:4: this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )*
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_73); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalOCCI.g:3172:4: (this_ID_1= RULE_ID | kw= '-' )*
                    loop74:
                    do {
                        int alt74=3;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==RULE_ID) ) {
                            alt74=1;
                        }
                        else if ( (LA74_0==71) ) {
                            alt74=2;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalOCCI.g:3173:5: this_ID_1= RULE_ID
                    	    {
                    	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_73); 

                    	    					current.merge(this_ID_1);
                    	    				

                    	    					newLeafNode(this_ID_1, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_1_0());
                    	    				

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOCCI.g:3181:5: kw= '-'
                    	    {
                    	    kw=(Token)match(input,71,FOLLOW_73); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getNameIDAccess().getHyphenMinusKeyword_0_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3189:3: this_KEYWORD_3= ruleKEYWORD
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
    // InternalOCCI.g:3203:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalOCCI.g:3203:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalOCCI.g:3204:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalOCCI.g:3210:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOCCI.g:3216:2: ( (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' ) )
            // InternalOCCI.g:3217:2: (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' )
            {
            // InternalOCCI.g:3217:2: (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' )
            int alt76=52;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt76=1;
                }
                break;
            case 14:
                {
                alt76=2;
                }
                break;
            case 15:
                {
                alt76=3;
                }
                break;
            case 17:
                {
                alt76=4;
                }
                break;
            case 18:
                {
                alt76=5;
                }
                break;
            case 19:
                {
                alt76=6;
                }
                break;
            case 20:
                {
                alt76=7;
                }
                break;
            case 21:
                {
                alt76=8;
                }
                break;
            case 26:
                {
                alt76=9;
                }
                break;
            case 22:
                {
                alt76=10;
                }
                break;
            case 23:
                {
                alt76=11;
                }
                break;
            case 30:
                {
                alt76=12;
                }
                break;
            case 31:
                {
                alt76=13;
                }
                break;
            case 32:
                {
                alt76=14;
                }
                break;
            case 72:
                {
                alt76=15;
                }
                break;
            case 33:
                {
                alt76=16;
                }
                break;
            case 34:
                {
                alt76=17;
                }
                break;
            case 35:
                {
                alt76=18;
                }
                break;
            case 36:
                {
                alt76=19;
                }
                break;
            case 37:
                {
                alt76=20;
                }
                break;
            case 38:
                {
                alt76=21;
                }
                break;
            case 40:
                {
                alt76=22;
                }
                break;
            case 41:
                {
                alt76=23;
                }
                break;
            case 42:
                {
                alt76=24;
                }
                break;
            case 51:
                {
                alt76=25;
                }
                break;
            case 56:
                {
                alt76=26;
                }
                break;
            case 52:
                {
                alt76=27;
                }
                break;
            case 53:
                {
                alt76=28;
                }
                break;
            case 54:
                {
                alt76=29;
                }
                break;
            case 55:
                {
                alt76=30;
                }
                break;
            case 57:
                {
                alt76=31;
                }
                break;
            case 58:
                {
                alt76=32;
                }
                break;
            case 59:
                {
                alt76=33;
                }
                break;
            case 60:
                {
                alt76=34;
                }
                break;
            case 61:
                {
                alt76=35;
                }
                break;
            case 62:
                {
                alt76=36;
                }
                break;
            case 63:
                {
                alt76=37;
                }
                break;
            case 64:
                {
                alt76=38;
                }
                break;
            case 65:
                {
                alt76=39;
                }
                break;
            case 73:
                {
                alt76=40;
                }
                break;
            case 74:
                {
                alt76=41;
                }
                break;
            case 75:
                {
                alt76=42;
                }
                break;
            case 76:
                {
                alt76=43;
                }
                break;
            case 77:
                {
                alt76=44;
                }
                break;
            case 78:
                {
                alt76=45;
                }
                break;
            case 79:
                {
                alt76=46;
                }
                break;
            case 66:
                {
                alt76=47;
                }
                break;
            case 67:
                {
                alt76=48;
                }
                break;
            case 68:
                {
                alt76=49;
                }
                break;
            case 69:
                {
                alt76=50;
                }
                break;
            case 80:
                {
                alt76=51;
                }
                break;
            case 70:
                {
                alt76=52;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalOCCI.g:3218:3: kw= 'extension'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtensionKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3224:3: kw= 'description'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDescriptionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3230:3: kw= 'specification'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSpecificationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOCCI.g:3236:3: kw= 'as'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAsKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOCCI.g:3242:3: kw= 'kind'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKindKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOCCI.g:3248:3: kw= 'extends'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtendsKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalOCCI.g:3254:3: kw= 'source'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSourceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalOCCI.g:3260:3: kw= 'target'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTargetKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalOCCI.g:3266:3: kw= 'annotations'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAnnotationsKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalOCCI.g:3272:3: kw= 'title'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTitleKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalOCCI.g:3278:3: kw= 'scheme'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSchemeKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalOCCI.g:3284:3: kw= 'mixin'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMixinKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalOCCI.g:3290:3: kw= 'depends'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDependsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalOCCI.g:3296:3: kw= 'applies'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAppliesKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalOCCI.g:3302:3: kw= 'annotation'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAnnotationKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalOCCI.g:3308:3: kw= 'key'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKeyKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalOCCI.g:3314:3: kw= 'value'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalOCCI.g:3320:3: kw= 'attribute'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAttributeKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalOCCI.g:3326:3: kw= 'mutable'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMutableKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalOCCI.g:3332:3: kw= 'required'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRequiredKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalOCCI.g:3338:3: kw= 'type'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalOCCI.g:3344:3: kw= 'action'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalOCCI.g:3350:3: kw= 'constraint'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConstraintKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalOCCI.g:3356:3: kw= 'body'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBodyKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalOCCI.g:3362:3: kw= 'StringType'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStringTypeKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalOCCI.g:3368:3: kw= 'documentation'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDocumentationKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalOCCI.g:3374:3: kw= 'pattern'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPatternKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalOCCI.g:3380:3: kw= 'length'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLengthKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalOCCI.g:3386:3: kw= 'minLength'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinLengthKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalOCCI.g:3392:3: kw= 'maxLength'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalOCCI.g:3398:3: kw= 'EObjectType'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEObjectTypeKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalOCCI.g:3404:3: kw= 'instanceClassName'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getInstanceClassNameKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalOCCI.g:3410:3: kw= 'BooleanType'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBooleanTypeKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalOCCI.g:3416:3: kw= 'NumericType'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNumericTypeKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalOCCI.g:3422:3: kw= 'totalDigits'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTotalDigitsKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalOCCI.g:3428:3: kw= 'minExclusive'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinExclusiveKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalOCCI.g:3434:3: kw= 'maxExclusive'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxExclusiveKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalOCCI.g:3440:3: kw= 'minInclusive'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinInclusiveKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalOCCI.g:3446:3: kw= 'maxInclusive'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxInclusiveKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalOCCI.g:3452:3: kw= 'Byte'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getByteKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalOCCI.g:3458:3: kw= 'Double'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDoubleKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalOCCI.g:3464:3: kw= 'Float'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFloatKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalOCCI.g:3470:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIntegerKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalOCCI.g:3476:3: kw= 'Long'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLongKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalOCCI.g:3482:3: kw= 'Short'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getShortKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalOCCI.g:3488:3: kw= 'BigDecimal'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBigDecimalKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalOCCI.g:3494:3: kw= 'EnumerationType'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnumerationTypeKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalOCCI.g:3500:3: kw= 'literals'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLiteralsKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalOCCI.g:3506:3: kw= 'RecordType'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRecordTypeKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalOCCI.g:3512:3: kw= 'fields'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFieldsKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalOCCI.g:3518:3: kw= 'field'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFieldKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalOCCI.g:3524:3: kw= 'ArrayType'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

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
    // InternalOCCI.g:3533:1: ruleNumericTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) ;
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
            // InternalOCCI.g:3539:2: ( ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) )
            // InternalOCCI.g:3540:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            {
            // InternalOCCI.g:3540:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            int alt77=7;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt77=1;
                }
                break;
            case 74:
                {
                alt77=2;
                }
                break;
            case 75:
                {
                alt77=3;
                }
                break;
            case 76:
                {
                alt77=4;
                }
                break;
            case 77:
                {
                alt77=5;
                }
                break;
            case 78:
                {
                alt77=6;
                }
                break;
            case 79:
                {
                alt77=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalOCCI.g:3541:3: (enumLiteral_0= 'Byte' )
                    {
                    // InternalOCCI.g:3541:3: (enumLiteral_0= 'Byte' )
                    // InternalOCCI.g:3542:4: enumLiteral_0= 'Byte'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3549:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalOCCI.g:3549:3: (enumLiteral_1= 'Double' )
                    // InternalOCCI.g:3550:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3557:3: (enumLiteral_2= 'Float' )
                    {
                    // InternalOCCI.g:3557:3: (enumLiteral_2= 'Float' )
                    // InternalOCCI.g:3558:4: enumLiteral_2= 'Float'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOCCI.g:3565:3: (enumLiteral_3= 'Integer' )
                    {
                    // InternalOCCI.g:3565:3: (enumLiteral_3= 'Integer' )
                    // InternalOCCI.g:3566:4: enumLiteral_3= 'Integer'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOCCI.g:3573:3: (enumLiteral_4= 'Long' )
                    {
                    // InternalOCCI.g:3573:3: (enumLiteral_4= 'Long' )
                    // InternalOCCI.g:3574:4: enumLiteral_4= 'Long'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOCCI.g:3581:3: (enumLiteral_5= 'Short' )
                    {
                    // InternalOCCI.g:3581:3: (enumLiteral_5= 'Short' )
                    // InternalOCCI.g:3582:4: enumLiteral_5= 'Short'
                    {
                    enumLiteral_5=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOCCI.g:3589:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalOCCI.g:3589:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalOCCI.g:3590:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,79,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFF8077FC4FED020L,0x000000000001FF7FL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1A0800004005C002L,0x0000000000000054L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1A08000040058002L,0x0000000000000054L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x1A08000040050002L,0x0000000000000054L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x1A08000040070002L,0x0000000000000054L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x1A08000040040002L,0x0000000000000054L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFF8077FC4FED0A0L,0x000000000001FF7FL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080005000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000030800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000030802000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000005400002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C004004002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008004004002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004004002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000000D000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000002000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004010000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x01F0000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x01E0000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000080L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x01C0000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0500000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FE00L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xE100000002000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0xC100000002000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8100000002000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0100000002000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0100000002000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0100000002000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000080L});

}