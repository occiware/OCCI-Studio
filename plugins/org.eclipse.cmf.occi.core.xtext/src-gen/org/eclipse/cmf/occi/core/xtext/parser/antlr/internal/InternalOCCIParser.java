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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_QUALIFIED_ID", "RULE_ID_WITHOUT_CARET", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'configuration'", "'description'", "'location'", "'use'", "'resource'", "':'", "'title'", "'summary'", "'{'", "'}'", "'link'", "'target'", "'mixin'", "'attribute'", "'='", "'extension'", "'specification'", "'import'", "'as'", "'kind'", "'extends'", "'source'", "'annotations'", "','", "'depends'", "'('", "')'", "'applies'", "'scheme'", "'key'", "'value'", "'mutable'", "'required'", "'action'", "'constraint'", "'body'", "'FSM'", "'state'", "'initial'", "'final'", "'transitions'", "'to'", "'StringType'", "'pattern'", "'length'", "'minLength'", "'maxLength'", "'EObjectType'", "'type'", "'BooleanType'", "'NumericType'", "'totalDigits'", "'minExclusive'", "'maxExclusive'", "'minInclusive'", "'maxInclusive'", "'EnumerationType'", "'literals'", "'record'", "'array'", "'-'", "'parts'", "'Byte'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'BigDecimal'"
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
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_ID_WITHOUT_CARET=8;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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
    // InternalOCCI.g:72:1: ruleGrammar returns [EObject current=null] : (this_Extension_0= ruleExtension | this_Configuration_1= ruleConfiguration ) ;
    public final EObject ruleGrammar() throws RecognitionException {
        EObject current = null;

        EObject this_Extension_0 = null;

        EObject this_Configuration_1 = null;



        	enterRule();

        try {
            // InternalOCCI.g:78:2: ( (this_Extension_0= ruleExtension | this_Configuration_1= ruleConfiguration ) )
            // InternalOCCI.g:79:2: (this_Extension_0= ruleExtension | this_Configuration_1= ruleConfiguration )
            {
            // InternalOCCI.g:79:2: (this_Extension_0= ruleExtension | this_Configuration_1= ruleConfiguration )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOCCI.g:80:3: this_Extension_0= ruleExtension
                    {

                    			newCompositeNode(grammarAccess.getGrammarAccess().getExtensionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extension_0=ruleExtension();

                    state._fsp--;


                    			current = this_Extension_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:89:3: this_Configuration_1= ruleConfiguration
                    {

                    			newCompositeNode(grammarAccess.getGrammarAccess().getConfigurationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Configuration_1=ruleConfiguration();

                    state._fsp--;


                    			current = this_Configuration_1;
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
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleConfiguration"
    // InternalOCCI.g:101:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalOCCI.g:101:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalOCCI.g:102:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalOCCI.g:108:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= 'configuration' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) ) )? (otherlv_6= 'use' ( (otherlv_7= RULE_STRING ) ) )* ( (lv_resources_8_0= ruleResource ) )* ( (lv_mixins_9_0= ruleMixin ) )* ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token lv_location_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_resources_8_0 = null;

        EObject lv_mixins_9_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:114:2: ( ( () otherlv_1= 'configuration' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) ) )? (otherlv_6= 'use' ( (otherlv_7= RULE_STRING ) ) )* ( (lv_resources_8_0= ruleResource ) )* ( (lv_mixins_9_0= ruleMixin ) )* ) )
            // InternalOCCI.g:115:2: ( () otherlv_1= 'configuration' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) ) )? (otherlv_6= 'use' ( (otherlv_7= RULE_STRING ) ) )* ( (lv_resources_8_0= ruleResource ) )* ( (lv_mixins_9_0= ruleMixin ) )* )
            {
            // InternalOCCI.g:115:2: ( () otherlv_1= 'configuration' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) ) )? (otherlv_6= 'use' ( (otherlv_7= RULE_STRING ) ) )* ( (lv_resources_8_0= ruleResource ) )* ( (lv_mixins_9_0= ruleMixin ) )* )
            // InternalOCCI.g:116:3: () otherlv_1= 'configuration' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) ) )? (otherlv_6= 'use' ( (otherlv_7= RULE_STRING ) ) )* ( (lv_resources_8_0= ruleResource ) )* ( (lv_mixins_9_0= ruleMixin ) )*
            {
            // InternalOCCI.g:116:3: ()
            // InternalOCCI.g:117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigurationAccess().getConfigurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getConfigurationKeyword_1());
            		
            // InternalOCCI.g:127:3: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOCCI.g:128:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalOCCI.g:132:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalOCCI.g:133:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:133:5: (lv_description_3_0= RULE_STRING )
                    // InternalOCCI.g:134:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_description_3_0, grammarAccess.getConfigurationAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigurationRule());
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

            // InternalOCCI.g:151:3: (otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOCCI.g:152:4: otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getLocationKeyword_3_0());
                    			
                    // InternalOCCI.g:156:4: ( (lv_location_5_0= RULE_STRING ) )
                    // InternalOCCI.g:157:5: (lv_location_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:157:5: (lv_location_5_0= RULE_STRING )
                    // InternalOCCI.g:158:6: lv_location_5_0= RULE_STRING
                    {
                    lv_location_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_location_5_0, grammarAccess.getConfigurationAccess().getLocationSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigurationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:175:3: (otherlv_6= 'use' ( (otherlv_7= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOCCI.g:176:4: otherlv_6= 'use' ( (otherlv_7= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getUseKeyword_4_0());
            	    			
            	    // InternalOCCI.g:180:4: ( (otherlv_7= RULE_STRING ) )
            	    // InternalOCCI.g:181:5: (otherlv_7= RULE_STRING )
            	    {
            	    // InternalOCCI.g:181:5: (otherlv_7= RULE_STRING )
            	    // InternalOCCI.g:182:6: otherlv_7= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getConfigurationRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    						newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getUseExtensionCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalOCCI.g:194:3: ( (lv_resources_8_0= ruleResource ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOCCI.g:195:4: (lv_resources_8_0= ruleResource )
            	    {
            	    // InternalOCCI.g:195:4: (lv_resources_8_0= ruleResource )
            	    // InternalOCCI.g:196:5: lv_resources_8_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getResourcesResourceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_resources_8_0=ruleResource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_8_0,
            	    						"org.eclipse.cmf.occi.core.xtext.OCCI.Resource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalOCCI.g:213:3: ( (lv_mixins_9_0= ruleMixin ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOCCI.g:214:4: (lv_mixins_9_0= ruleMixin )
            	    {
            	    // InternalOCCI.g:214:4: (lv_mixins_9_0= ruleMixin )
            	    // InternalOCCI.g:215:5: lv_mixins_9_0= ruleMixin
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getMixinsMixinParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_mixins_9_0=ruleMixin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mixins",
            	    						lv_mixins_9_0,
            	    						"org.eclipse.cmf.occi.core.xtext.OCCI.Mixin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleResource"
    // InternalOCCI.g:236:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalOCCI.g:236:49: (iv_ruleResource= ruleResource EOF )
            // InternalOCCI.g:237:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalOCCI.g:243:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? (otherlv_10= '{' ( (lv_parts_11_0= ruleMixinBase ) )* ( (lv_attributes_12_0= ruleAttributeState ) )* ( (lv_links_13_0= ruleLink ) )* otherlv_14= '}' ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token lv_location_7_0=null;
        Token otherlv_8=null;
        Token lv_summary_9_0=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        EObject lv_parts_11_0 = null;

        EObject lv_attributes_12_0 = null;

        EObject lv_links_13_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:249:2: ( (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? (otherlv_10= '{' ( (lv_parts_11_0= ruleMixinBase ) )* ( (lv_attributes_12_0= ruleAttributeState ) )* ( (lv_links_13_0= ruleLink ) )* otherlv_14= '}' ) ) )
            // InternalOCCI.g:250:2: (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? (otherlv_10= '{' ( (lv_parts_11_0= ruleMixinBase ) )* ( (lv_attributes_12_0= ruleAttributeState ) )* ( (lv_links_13_0= ruleLink ) )* otherlv_14= '}' ) )
            {
            // InternalOCCI.g:250:2: (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? (otherlv_10= '{' ( (lv_parts_11_0= ruleMixinBase ) )* ( (lv_attributes_12_0= ruleAttributeState ) )* ( (lv_links_13_0= ruleLink ) )* otherlv_14= '}' ) )
            // InternalOCCI.g:251:3: otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? (otherlv_10= '{' ( (lv_parts_11_0= ruleMixinBase ) )* ( (lv_attributes_12_0= ruleAttributeState ) )* ( (lv_links_13_0= ruleLink ) )* otherlv_14= '}' )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
            		
            // InternalOCCI.g:255:3: ( (lv_id_1_0= RULE_STRING ) )
            // InternalOCCI.g:256:4: (lv_id_1_0= RULE_STRING )
            {
            // InternalOCCI.g:256:4: (lv_id_1_0= RULE_STRING )
            // InternalOCCI.g:257:5: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_id_1_0, grammarAccess.getResourceAccess().getIdSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:277:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:278:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:278:4: ( ruleQualifiedID )
            // InternalOCCI.g:279:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getResourceAccess().getKindKindCrossReference_3_0());
            				
            pushFollow(FOLLOW_11);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:293:3: (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOCCI.g:294:4: otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getTitleKeyword_4_0());
                    			
                    // InternalOCCI.g:298:4: ( (lv_title_5_0= RULE_STRING ) )
                    // InternalOCCI.g:299:5: (lv_title_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:299:5: (lv_title_5_0= RULE_STRING )
                    // InternalOCCI.g:300:6: lv_title_5_0= RULE_STRING
                    {
                    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_title_5_0, grammarAccess.getResourceAccess().getTitleSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:317:3: (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOCCI.g:318:4: otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getLocationKeyword_5_0());
                    			
                    // InternalOCCI.g:322:4: ( (lv_location_7_0= RULE_STRING ) )
                    // InternalOCCI.g:323:5: (lv_location_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:323:5: (lv_location_7_0= RULE_STRING )
                    // InternalOCCI.g:324:6: lv_location_7_0= RULE_STRING
                    {
                    lv_location_7_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_location_7_0, grammarAccess.getResourceAccess().getLocationSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:341:3: (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOCCI.g:342:4: otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getSummaryKeyword_6_0());
                    			
                    // InternalOCCI.g:346:4: ( (lv_summary_9_0= RULE_STRING ) )
                    // InternalOCCI.g:347:5: (lv_summary_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:347:5: (lv_summary_9_0= RULE_STRING )
                    // InternalOCCI.g:348:6: lv_summary_9_0= RULE_STRING
                    {
                    lv_summary_9_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_summary_9_0, grammarAccess.getResourceAccess().getSummarySTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"summary",
                    							lv_summary_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:365:3: (otherlv_10= '{' ( (lv_parts_11_0= ruleMixinBase ) )* ( (lv_attributes_12_0= ruleAttributeState ) )* ( (lv_links_13_0= ruleLink ) )* otherlv_14= '}' )
            // InternalOCCI.g:366:4: otherlv_10= '{' ( (lv_parts_11_0= ruleMixinBase ) )* ( (lv_attributes_12_0= ruleAttributeState ) )* ( (lv_links_13_0= ruleLink ) )* otherlv_14= '}'
            {
            otherlv_10=(Token)match(input,21,FOLLOW_15); 

            				newLeafNode(otherlv_10, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7_0());
            			
            // InternalOCCI.g:370:4: ( (lv_parts_11_0= ruleMixinBase ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOCCI.g:371:5: (lv_parts_11_0= ruleMixinBase )
            	    {
            	    // InternalOCCI.g:371:5: (lv_parts_11_0= ruleMixinBase )
            	    // InternalOCCI.g:372:6: lv_parts_11_0= ruleMixinBase
            	    {

            	    						newCompositeNode(grammarAccess.getResourceAccess().getPartsMixinBaseParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_parts_11_0=ruleMixinBase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getResourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parts",
            	    							lv_parts_11_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.MixinBase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalOCCI.g:389:4: ( (lv_attributes_12_0= ruleAttributeState ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOCCI.g:390:5: (lv_attributes_12_0= ruleAttributeState )
            	    {
            	    // InternalOCCI.g:390:5: (lv_attributes_12_0= ruleAttributeState )
            	    // InternalOCCI.g:391:6: lv_attributes_12_0= ruleAttributeState
            	    {

            	    						newCompositeNode(grammarAccess.getResourceAccess().getAttributesAttributeStateParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_attributes_12_0=ruleAttributeState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getResourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_12_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalOCCI.g:408:4: ( (lv_links_13_0= ruleLink ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOCCI.g:409:5: (lv_links_13_0= ruleLink )
            	    {
            	    // InternalOCCI.g:409:5: (lv_links_13_0= ruleLink )
            	    // InternalOCCI.g:410:6: lv_links_13_0= ruleLink
            	    {

            	    						newCompositeNode(grammarAccess.getResourceAccess().getLinksLinkParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_links_13_0=ruleLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getResourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"links",
            	    							lv_links_13_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.Link");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_14=(Token)match(input,22,FOLLOW_2); 

            				newLeafNode(otherlv_14, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_7_4());
            			

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleLink"
    // InternalOCCI.g:436:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalOCCI.g:436:45: (iv_ruleLink= ruleLink EOF )
            // InternalOCCI.g:437:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalOCCI.g:443:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= '{' ( (lv_attributes_11_0= ruleAttributeState ) )* ( (lv_parts_12_0= ruleMixinBase ) )* otherlv_13= '}' ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token lv_location_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_attributes_11_0 = null;

        EObject lv_parts_12_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:449:2: ( (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= '{' ( (lv_attributes_11_0= ruleAttributeState ) )* ( (lv_parts_12_0= ruleMixinBase ) )* otherlv_13= '}' ) ) )
            // InternalOCCI.g:450:2: (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= '{' ( (lv_attributes_11_0= ruleAttributeState ) )* ( (lv_parts_12_0= ruleMixinBase ) )* otherlv_13= '}' ) )
            {
            // InternalOCCI.g:450:2: (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= '{' ( (lv_attributes_11_0= ruleAttributeState ) )* ( (lv_parts_12_0= ruleMixinBase ) )* otherlv_13= '}' ) )
            // InternalOCCI.g:451:3: otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= '{' ( (lv_attributes_11_0= ruleAttributeState ) )* ( (lv_parts_12_0= ruleMixinBase ) )* otherlv_13= '}' )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalOCCI.g:455:3: ( (lv_id_1_0= RULE_STRING ) )
            // InternalOCCI.g:456:4: (lv_id_1_0= RULE_STRING )
            {
            // InternalOCCI.g:456:4: (lv_id_1_0= RULE_STRING )
            // InternalOCCI.g:457:5: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_id_1_0, grammarAccess.getLinkAccess().getIdSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:477:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:478:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:478:4: ( ruleQualifiedID )
            // InternalOCCI.g:479:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getKindKindCrossReference_3_0());
            				
            pushFollow(FOLLOW_18);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:493:3: (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOCCI.g:494:4: otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getTitleKeyword_4_0());
                    			
                    // InternalOCCI.g:498:4: ( (lv_title_5_0= RULE_STRING ) )
                    // InternalOCCI.g:499:5: (lv_title_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:499:5: (lv_title_5_0= RULE_STRING )
                    // InternalOCCI.g:500:6: lv_title_5_0= RULE_STRING
                    {
                    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_title_5_0, grammarAccess.getLinkAccess().getTitleSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:517:3: (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOCCI.g:518:4: otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getLocationKeyword_5_0());
                    			
                    // InternalOCCI.g:522:4: ( (lv_location_7_0= RULE_STRING ) )
                    // InternalOCCI.g:523:5: (lv_location_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:523:5: (lv_location_7_0= RULE_STRING )
                    // InternalOCCI.g:524:6: lv_location_7_0= RULE_STRING
                    {
                    lv_location_7_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    						newLeafNode(lv_location_7_0, grammarAccess.getLinkAccess().getLocationSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getTargetKeyword_6());
            		
            // InternalOCCI.g:545:3: ( (otherlv_9= RULE_STRING ) )
            // InternalOCCI.g:546:4: (otherlv_9= RULE_STRING )
            {
            // InternalOCCI.g:546:4: (otherlv_9= RULE_STRING )
            // InternalOCCI.g:547:5: otherlv_9= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getTargetResourceCrossReference_7_0());
            				

            }


            }

            // InternalOCCI.g:558:3: (otherlv_10= '{' ( (lv_attributes_11_0= ruleAttributeState ) )* ( (lv_parts_12_0= ruleMixinBase ) )* otherlv_13= '}' )
            // InternalOCCI.g:559:4: otherlv_10= '{' ( (lv_attributes_11_0= ruleAttributeState ) )* ( (lv_parts_12_0= ruleMixinBase ) )* otherlv_13= '}'
            {
            otherlv_10=(Token)match(input,21,FOLLOW_21); 

            				newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_8_0());
            			
            // InternalOCCI.g:563:4: ( (lv_attributes_11_0= ruleAttributeState ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOCCI.g:564:5: (lv_attributes_11_0= ruleAttributeState )
            	    {
            	    // InternalOCCI.g:564:5: (lv_attributes_11_0= ruleAttributeState )
            	    // InternalOCCI.g:565:6: lv_attributes_11_0= ruleAttributeState
            	    {

            	    						newCompositeNode(grammarAccess.getLinkAccess().getAttributesAttributeStateParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_attributes_11_0=ruleAttributeState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLinkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_11_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalOCCI.g:582:4: ( (lv_parts_12_0= ruleMixinBase ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOCCI.g:583:5: (lv_parts_12_0= ruleMixinBase )
            	    {
            	    // InternalOCCI.g:583:5: (lv_parts_12_0= ruleMixinBase )
            	    // InternalOCCI.g:584:6: lv_parts_12_0= ruleMixinBase
            	    {

            	    						newCompositeNode(grammarAccess.getLinkAccess().getPartsMixinBaseParserRuleCall_8_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_parts_12_0=ruleMixinBase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLinkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parts",
            	    							lv_parts_12_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.MixinBase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_13=(Token)match(input,22,FOLLOW_2); 

            				newLeafNode(otherlv_13, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8_3());
            			

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleMixinBase"
    // InternalOCCI.g:610:1: entryRuleMixinBase returns [EObject current=null] : iv_ruleMixinBase= ruleMixinBase EOF ;
    public final EObject entryRuleMixinBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixinBase = null;


        try {
            // InternalOCCI.g:610:50: (iv_ruleMixinBase= ruleMixinBase EOF )
            // InternalOCCI.g:611:2: iv_ruleMixinBase= ruleMixinBase EOF
            {
             newCompositeNode(grammarAccess.getMixinBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMixinBase=ruleMixinBase();

            state._fsp--;

             current =iv_ruleMixinBase; 
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
    // $ANTLR end "entryRuleMixinBase"


    // $ANTLR start "ruleMixinBase"
    // InternalOCCI.g:617:1: ruleMixinBase returns [EObject current=null] : (otherlv_0= 'mixin' ( ( ruleQualifiedID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeState ) )* otherlv_4= '}' ) ;
    public final EObject ruleMixinBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:623:2: ( (otherlv_0= 'mixin' ( ( ruleQualifiedID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeState ) )* otherlv_4= '}' ) )
            // InternalOCCI.g:624:2: (otherlv_0= 'mixin' ( ( ruleQualifiedID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeState ) )* otherlv_4= '}' )
            {
            // InternalOCCI.g:624:2: (otherlv_0= 'mixin' ( ( ruleQualifiedID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeState ) )* otherlv_4= '}' )
            // InternalOCCI.g:625:3: otherlv_0= 'mixin' ( ( ruleQualifiedID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeState ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMixinBaseAccess().getMixinKeyword_0());
            		
            // InternalOCCI.g:629:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:630:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:630:4: ( ruleQualifiedID )
            // InternalOCCI.g:631:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixinBaseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMixinBaseAccess().getMixinMixinCrossReference_1_0());
            				
            pushFollow(FOLLOW_14);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMixinBaseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOCCI.g:649:3: ( (lv_attributes_3_0= ruleAttributeState ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOCCI.g:650:4: (lv_attributes_3_0= ruleAttributeState )
            	    {
            	    // InternalOCCI.g:650:4: (lv_attributes_3_0= ruleAttributeState )
            	    // InternalOCCI.g:651:5: lv_attributes_3_0= ruleAttributeState
            	    {

            	    					newCompositeNode(grammarAccess.getMixinBaseAccess().getAttributesAttributeStateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_attributes_3_0=ruleAttributeState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMixinBaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMixinBaseAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMixinBase"


    // $ANTLR start "entryRuleAttributeState"
    // InternalOCCI.g:676:1: entryRuleAttributeState returns [EObject current=null] : iv_ruleAttributeState= ruleAttributeState EOF ;
    public final EObject entryRuleAttributeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeState = null;


        try {
            // InternalOCCI.g:676:55: (iv_ruleAttributeState= ruleAttributeState EOF )
            // InternalOCCI.g:677:2: iv_ruleAttributeState= ruleAttributeState EOF
            {
             newCompositeNode(grammarAccess.getAttributeStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeState=ruleAttributeState();

            state._fsp--;

             current =iv_ruleAttributeState; 
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
    // $ANTLR end "entryRuleAttributeState"


    // $ANTLR start "ruleAttributeState"
    // InternalOCCI.g:683:1: ruleAttributeState returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttributeState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:689:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalOCCI.g:690:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalOCCI.g:690:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalOCCI.g:691:3: otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeStateAccess().getAttributeKeyword_0());
            		
            // InternalOCCI.g:695:3: ( (lv_name_1_0= ruleQualifiedID ) )
            // InternalOCCI.g:696:4: (lv_name_1_0= ruleQualifiedID )
            {
            // InternalOCCI.g:696:4: (lv_name_1_0= ruleQualifiedID )
            // InternalOCCI.g:697:5: lv_name_1_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getAttributeStateAccess().getNameQualifiedIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_1_0=ruleQualifiedID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.QualifiedID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeStateAccess().getEqualsSignKeyword_2());
            		
            // InternalOCCI.g:718:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalOCCI.g:719:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalOCCI.g:719:4: (lv_value_3_0= RULE_STRING )
            // InternalOCCI.g:720:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getAttributeStateAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
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
    // $ANTLR end "ruleAttributeState"


    // $ANTLR start "entryRuleExtension"
    // InternalOCCI.g:740:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // InternalOCCI.g:740:50: (iv_ruleExtension= ruleExtension EOF )
            // InternalOCCI.g:741:2: iv_ruleExtension= ruleExtension EOF
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
    // InternalOCCI.g:747:1: ruleExtension returns [EObject current=null] : (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* ) ;
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
            // InternalOCCI.g:753:2: ( (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* ) )
            // InternalOCCI.g:754:2: (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* )
            {
            // InternalOCCI.g:754:2: (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* )
            // InternalOCCI.g:755:3: otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionAccess().getExtensionKeyword_0());
            		
            // InternalOCCI.g:759:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:760:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:760:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:761:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getExtensionAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:782:3: ( (lv_scheme_3_0= RULE_STRING ) )
            // InternalOCCI.g:783:4: (lv_scheme_3_0= RULE_STRING )
            {
            // InternalOCCI.g:783:4: (lv_scheme_3_0= RULE_STRING )
            // InternalOCCI.g:784:5: lv_scheme_3_0= RULE_STRING
            {
            lv_scheme_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            // InternalOCCI.g:800:3: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOCCI.g:801:4: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalOCCI.g:805:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalOCCI.g:806:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:806:5: (lv_description_5_0= RULE_STRING )
                    // InternalOCCI.g:807:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            // InternalOCCI.g:824:3: (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOCCI.g:825:4: otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getExtensionAccess().getSpecificationKeyword_5_0());
                    			
                    // InternalOCCI.g:829:4: ( (lv_specification_7_0= RULE_STRING ) )
                    // InternalOCCI.g:830:5: (lv_specification_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:830:5: (lv_specification_7_0= RULE_STRING )
                    // InternalOCCI.g:831:6: lv_specification_7_0= RULE_STRING
                    {
                    lv_specification_7_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            // InternalOCCI.g:848:3: (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOCCI.g:849:4: otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )?
            	    {
            	    otherlv_8=(Token)match(input,30,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getImportKeyword_6_0());
            	    			
            	    // InternalOCCI.g:853:4: ( (otherlv_9= RULE_STRING ) )
            	    // InternalOCCI.g:854:5: (otherlv_9= RULE_STRING )
            	    {
            	    // InternalOCCI.g:854:5: (otherlv_9= RULE_STRING )
            	    // InternalOCCI.g:855:6: otherlv_9= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExtensionRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_28); 

            	    						newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getImportExtensionCrossReference_6_1_0());
            	    					

            	    }


            	    }

            	    // InternalOCCI.g:866:4: (otherlv_10= 'as' this_ID_11= RULE_ID )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==31) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalOCCI.g:867:5: otherlv_10= 'as' this_ID_11= RULE_ID
            	            {
            	            otherlv_10=(Token)match(input,31,FOLLOW_29); 

            	            					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getAsKeyword_6_2_0());
            	            				
            	            this_ID_11=(Token)match(input,RULE_ID,FOLLOW_27); 

            	            					newLeafNode(this_ID_11, grammarAccess.getExtensionAccess().getIDTerminalRuleCall_6_2_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalOCCI.g:877:3: ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )*
            loop22:
            do {
                int alt22=4;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    alt22=1;
                    }
                    break;
                case 25:
                    {
                    alt22=2;
                    }
                    break;
                case 55:
                case 60:
                case 62:
                case 63:
                case 69:
                case 71:
                case 72:
                    {
                    alt22=3;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // InternalOCCI.g:878:4: ( (lv_kinds_12_0= ruleKind ) )
            	    {
            	    // InternalOCCI.g:878:4: ( (lv_kinds_12_0= ruleKind ) )
            	    // InternalOCCI.g:879:5: (lv_kinds_12_0= ruleKind )
            	    {
            	    // InternalOCCI.g:879:5: (lv_kinds_12_0= ruleKind )
            	    // InternalOCCI.g:880:6: lv_kinds_12_0= ruleKind
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
            	    // InternalOCCI.g:898:4: ( (lv_mixins_13_0= ruleMixin ) )
            	    {
            	    // InternalOCCI.g:898:4: ( (lv_mixins_13_0= ruleMixin ) )
            	    // InternalOCCI.g:899:5: (lv_mixins_13_0= ruleMixin )
            	    {
            	    // InternalOCCI.g:899:5: (lv_mixins_13_0= ruleMixin )
            	    // InternalOCCI.g:900:6: lv_mixins_13_0= ruleMixin
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
            	    // InternalOCCI.g:918:4: ( (lv_types_14_0= ruleDataType ) )
            	    {
            	    // InternalOCCI.g:918:4: ( (lv_types_14_0= ruleDataType ) )
            	    // InternalOCCI.g:919:5: (lv_types_14_0= ruleDataType )
            	    {
            	    // InternalOCCI.g:919:5: (lv_types_14_0= ruleDataType )
            	    // InternalOCCI.g:920:6: lv_types_14_0= ruleDataType
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getTypesDataTypeParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
            	    break loop22;
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
    // InternalOCCI.g:942:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // InternalOCCI.g:942:45: (iv_ruleKind= ruleKind EOF )
            // InternalOCCI.g:943:2: iv_ruleKind= ruleKind EOF
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
    // InternalOCCI.g:949:1: ruleKind returns [EObject current=null] : (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) | ( (lv_actions_12_0= ruleAction ) ) | ( (lv_constraints_13_0= ruleConstraint ) ) )+ otherlv_14= '}' )? ( (lv_fsm_15_0= ruleFSM ) )? (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )? ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_title_9_0=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_actions_12_0 = null;

        EObject lv_constraints_13_0 = null;

        EObject lv_fsm_15_0 = null;

        EObject lv_annotations_18_0 = null;

        EObject lv_annotations_20_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:955:2: ( (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) | ( (lv_actions_12_0= ruleAction ) ) | ( (lv_constraints_13_0= ruleConstraint ) ) )+ otherlv_14= '}' )? ( (lv_fsm_15_0= ruleFSM ) )? (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )? ) )
            // InternalOCCI.g:956:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) | ( (lv_actions_12_0= ruleAction ) ) | ( (lv_constraints_13_0= ruleConstraint ) ) )+ otherlv_14= '}' )? ( (lv_fsm_15_0= ruleFSM ) )? (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )? )
            {
            // InternalOCCI.g:956:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) | ( (lv_actions_12_0= ruleAction ) ) | ( (lv_constraints_13_0= ruleConstraint ) ) )+ otherlv_14= '}' )? ( (lv_fsm_15_0= ruleFSM ) )? (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )? )
            // InternalOCCI.g:957:3: otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? (otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) | ( (lv_actions_12_0= ruleAction ) ) | ( (lv_constraints_13_0= ruleConstraint ) ) )+ otherlv_14= '}' )? ( (lv_fsm_15_0= ruleFSM ) )? (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getKindAccess().getKindKeyword_0());
            		
            // InternalOCCI.g:961:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:962:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:962:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:963:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getKindAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalOCCI.g:980:3: (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOCCI.g:981:4: otherlv_2= 'extends' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getKindAccess().getExtendsKeyword_2_0());
                    			
                    // InternalOCCI.g:985:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:986:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:986:5: ( ruleQualifiedID )
                    // InternalOCCI.g:987:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getParentKindCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1002:3: (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOCCI.g:1003:4: otherlv_4= 'source' ( ( ruleQualifiedID ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getKindAccess().getSourceKeyword_3_0());
                    			
                    // InternalOCCI.g:1007:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1008:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1008:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1009:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getSourceKindCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1024:3: (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOCCI.g:1025:4: otherlv_6= 'target' ( ( ruleQualifiedID ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getKindAccess().getTargetKeyword_4_0());
                    			
                    // InternalOCCI.g:1029:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1030:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1030:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1031:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getTargetKindCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1046:3: (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOCCI.g:1047:4: otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getKindAccess().getTitleKeyword_5_0());
                    			
                    // InternalOCCI.g:1051:4: ( (lv_title_9_0= RULE_STRING ) )
                    // InternalOCCI.g:1052:5: (lv_title_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1052:5: (lv_title_9_0= RULE_STRING )
                    // InternalOCCI.g:1053:6: lv_title_9_0= RULE_STRING
                    {
                    lv_title_9_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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

            // InternalOCCI.g:1070:3: (otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) | ( (lv_actions_12_0= ruleAction ) ) | ( (lv_constraints_13_0= ruleConstraint ) ) )+ otherlv_14= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOCCI.g:1071:4: otherlv_10= '{' ( ( (lv_attributes_11_0= ruleAttribute ) ) | ( (lv_actions_12_0= ruleAction ) ) | ( (lv_constraints_13_0= ruleConstraint ) ) )+ otherlv_14= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_36); 

                    				newLeafNode(otherlv_10, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalOCCI.g:1075:4: ( ( (lv_attributes_11_0= ruleAttribute ) ) | ( (lv_actions_12_0= ruleAction ) ) | ( (lv_constraints_13_0= ruleConstraint ) ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=4;
                        switch ( input.LA(1) ) {
                        case 26:
                            {
                            alt27=1;
                            }
                            break;
                        case 46:
                            {
                            alt27=2;
                            }
                            break;
                        case 47:
                            {
                            alt27=3;
                            }
                            break;

                        }

                        switch (alt27) {
                    	case 1 :
                    	    // InternalOCCI.g:1076:5: ( (lv_attributes_11_0= ruleAttribute ) )
                    	    {
                    	    // InternalOCCI.g:1076:5: ( (lv_attributes_11_0= ruleAttribute ) )
                    	    // InternalOCCI.g:1077:6: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalOCCI.g:1077:6: (lv_attributes_11_0= ruleAttribute )
                    	    // InternalOCCI.g:1078:7: lv_attributes_11_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_6_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_attributes_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_11_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOCCI.g:1096:5: ( (lv_actions_12_0= ruleAction ) )
                    	    {
                    	    // InternalOCCI.g:1096:5: ( (lv_actions_12_0= ruleAction ) )
                    	    // InternalOCCI.g:1097:6: (lv_actions_12_0= ruleAction )
                    	    {
                    	    // InternalOCCI.g:1097:6: (lv_actions_12_0= ruleAction )
                    	    // InternalOCCI.g:1098:7: lv_actions_12_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getActionsActionParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_actions_12_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_12_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalOCCI.g:1116:5: ( (lv_constraints_13_0= ruleConstraint ) )
                    	    {
                    	    // InternalOCCI.g:1116:5: ( (lv_constraints_13_0= ruleConstraint ) )
                    	    // InternalOCCI.g:1117:6: (lv_constraints_13_0= ruleConstraint )
                    	    {
                    	    // InternalOCCI.g:1117:6: (lv_constraints_13_0= ruleConstraint )
                    	    // InternalOCCI.g:1118:7: lv_constraints_13_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getConstraintsConstraintParserRuleCall_6_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_constraints_13_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_13_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Constraint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    otherlv_14=(Token)match(input,22,FOLLOW_38); 

                    				newLeafNode(otherlv_14, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1141:3: ( (lv_fsm_15_0= ruleFSM ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOCCI.g:1142:4: (lv_fsm_15_0= ruleFSM )
                    {
                    // InternalOCCI.g:1142:4: (lv_fsm_15_0= ruleFSM )
                    // InternalOCCI.g:1143:5: lv_fsm_15_0= ruleFSM
                    {

                    					newCompositeNode(grammarAccess.getKindAccess().getFsmFSMParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_39);
                    lv_fsm_15_0=ruleFSM();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getKindRule());
                    					}
                    					set(
                    						current,
                    						"fsm",
                    						lv_fsm_15_0,
                    						"org.eclipse.cmf.occi.core.xtext.OCCI.FSM");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1160:3: (otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOCCI.g:1161:4: otherlv_16= 'annotations' otherlv_17= '{' ( (lv_annotations_18_0= ruleAnnotation ) ) (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,35,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getKindAccess().getAnnotationsKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,21,FOLLOW_40); 

                    				newLeafNode(otherlv_17, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalOCCI.g:1169:4: ( (lv_annotations_18_0= ruleAnnotation ) )
                    // InternalOCCI.g:1170:5: (lv_annotations_18_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1170:5: (lv_annotations_18_0= ruleAnnotation )
                    // InternalOCCI.g:1171:6: lv_annotations_18_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_annotations_18_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKindRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_18_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1188:4: (otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==36) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalOCCI.g:1189:5: otherlv_19= ',' ( (lv_annotations_20_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,36,FOLLOW_40); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getKindAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalOCCI.g:1193:5: ( (lv_annotations_20_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1194:6: (lv_annotations_20_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1194:6: (lv_annotations_20_0= ruleAnnotation )
                    	    // InternalOCCI.g:1195:7: lv_annotations_20_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_8_4());
                    			

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
    // InternalOCCI.g:1222:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // InternalOCCI.g:1222:46: (iv_ruleMixin= ruleMixin EOF )
            // InternalOCCI.g:1223:2: iv_ruleMixin= ruleMixin EOF
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
    // InternalOCCI.g:1229:1: ruleMixin returns [EObject current=null] : (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= 'title' ( (lv_title_15_0= RULE_STRING ) ) )? otherlv_16= 'scheme' ( (lv_scheme_17_0= RULE_STRING ) ) (otherlv_18= '{' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= '}' )? ( (lv_fsm_23_0= ruleFSM ) )? (otherlv_24= 'annotations' otherlv_25= '{' ( (lv_annotations_26_0= ruleAnnotation ) ) (otherlv_27= ',' ( (lv_annotations_28_0= ruleAnnotation ) ) )* otherlv_29= '}' )? ) ;
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
        Token lv_title_15_0=null;
        Token otherlv_16=null;
        Token lv_scheme_17_0=null;
        Token otherlv_18=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_19_0 = null;

        EObject lv_actions_20_0 = null;

        EObject lv_constraints_21_0 = null;

        EObject lv_fsm_23_0 = null;

        EObject lv_annotations_26_0 = null;

        EObject lv_annotations_28_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1235:2: ( (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= 'title' ( (lv_title_15_0= RULE_STRING ) ) )? otherlv_16= 'scheme' ( (lv_scheme_17_0= RULE_STRING ) ) (otherlv_18= '{' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= '}' )? ( (lv_fsm_23_0= ruleFSM ) )? (otherlv_24= 'annotations' otherlv_25= '{' ( (lv_annotations_26_0= ruleAnnotation ) ) (otherlv_27= ',' ( (lv_annotations_28_0= ruleAnnotation ) ) )* otherlv_29= '}' )? ) )
            // InternalOCCI.g:1236:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= 'title' ( (lv_title_15_0= RULE_STRING ) ) )? otherlv_16= 'scheme' ( (lv_scheme_17_0= RULE_STRING ) ) (otherlv_18= '{' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= '}' )? ( (lv_fsm_23_0= ruleFSM ) )? (otherlv_24= 'annotations' otherlv_25= '{' ( (lv_annotations_26_0= ruleAnnotation ) ) (otherlv_27= ',' ( (lv_annotations_28_0= ruleAnnotation ) ) )* otherlv_29= '}' )? )
            {
            // InternalOCCI.g:1236:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= 'title' ( (lv_title_15_0= RULE_STRING ) ) )? otherlv_16= 'scheme' ( (lv_scheme_17_0= RULE_STRING ) ) (otherlv_18= '{' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= '}' )? ( (lv_fsm_23_0= ruleFSM ) )? (otherlv_24= 'annotations' otherlv_25= '{' ( (lv_annotations_26_0= ruleAnnotation ) ) (otherlv_27= ',' ( (lv_annotations_28_0= ruleAnnotation ) ) )* otherlv_29= '}' )? )
            // InternalOCCI.g:1237:3: otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= 'title' ( (lv_title_15_0= RULE_STRING ) ) )? otherlv_16= 'scheme' ( (lv_scheme_17_0= RULE_STRING ) ) (otherlv_18= '{' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= '}' )? ( (lv_fsm_23_0= ruleFSM ) )? (otherlv_24= 'annotations' otherlv_25= '{' ( (lv_annotations_26_0= ruleAnnotation ) ) (otherlv_27= ',' ( (lv_annotations_28_0= ruleAnnotation ) ) )* otherlv_29= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMixinAccess().getMixinKeyword_0());
            		
            // InternalOCCI.g:1241:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1242:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1242:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1243:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getMixinAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalOCCI.g:1260:3: (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOCCI.g:1261:4: otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getMixinAccess().getDependsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,38,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalOCCI.g:1269:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1270:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1270:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1271:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1285:4: (otherlv_5= ',' ( ( ruleQualifiedID ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==36) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalOCCI.g:1286:5: otherlv_5= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,36,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMixinAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalOCCI.g:1290:5: ( ( ruleQualifiedID ) )
                    	    // InternalOCCI.g:1291:6: ( ruleQualifiedID )
                    	    {
                    	    // InternalOCCI.g:1291:6: ( ruleQualifiedID )
                    	    // InternalOCCI.g:1292:7: ruleQualifiedID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMixinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    ruleQualifiedID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,39,FOLLOW_44); 

                    				newLeafNode(otherlv_7, grammarAccess.getMixinAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1312:3: (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOCCI.g:1313:4: otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getMixinAccess().getAppliesKeyword_3_0());
                    			
                    otherlv_9=(Token)match(input,38,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalOCCI.g:1321:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1322:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1322:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1323:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1337:4: (otherlv_11= ',' ( ( ruleQualifiedID ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==36) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalOCCI.g:1338:5: otherlv_11= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,36,FOLLOW_10); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMixinAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalOCCI.g:1342:5: ( ( ruleQualifiedID ) )
                    	    // InternalOCCI.g:1343:6: ( ruleQualifiedID )
                    	    {
                    	    // InternalOCCI.g:1343:6: ( ruleQualifiedID )
                    	    // InternalOCCI.g:1344:7: ruleQualifiedID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMixinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
                    	    ruleQualifiedID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,39,FOLLOW_45); 

                    				newLeafNode(otherlv_13, grammarAccess.getMixinAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1364:3: (otherlv_14= 'title' ( (lv_title_15_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOCCI.g:1365:4: otherlv_14= 'title' ( (lv_title_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getMixinAccess().getTitleKeyword_4_0());
                    			
                    // InternalOCCI.g:1369:4: ( (lv_title_15_0= RULE_STRING ) )
                    // InternalOCCI.g:1370:5: (lv_title_15_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1370:5: (lv_title_15_0= RULE_STRING )
                    // InternalOCCI.g:1371:6: lv_title_15_0= RULE_STRING
                    {
                    lv_title_15_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

                    						newLeafNode(lv_title_15_0, grammarAccess.getMixinAccess().getTitleSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_16, grammarAccess.getMixinAccess().getSchemeKeyword_5());
            		
            // InternalOCCI.g:1392:3: ( (lv_scheme_17_0= RULE_STRING ) )
            // InternalOCCI.g:1393:4: (lv_scheme_17_0= RULE_STRING )
            {
            // InternalOCCI.g:1393:4: (lv_scheme_17_0= RULE_STRING )
            // InternalOCCI.g:1394:5: lv_scheme_17_0= RULE_STRING
            {
            lv_scheme_17_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_scheme_17_0, grammarAccess.getMixinAccess().getSchemeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scheme",
            						lv_scheme_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:1410:3: (otherlv_18= '{' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOCCI.g:1411:4: otherlv_18= '{' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_36); 

                    				newLeafNode(otherlv_18, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalOCCI.g:1415:4: ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=4;
                        switch ( input.LA(1) ) {
                        case 26:
                            {
                            alt37=1;
                            }
                            break;
                        case 46:
                            {
                            alt37=2;
                            }
                            break;
                        case 47:
                            {
                            alt37=3;
                            }
                            break;

                        }

                        switch (alt37) {
                    	case 1 :
                    	    // InternalOCCI.g:1416:5: ( (lv_attributes_19_0= ruleAttribute ) )
                    	    {
                    	    // InternalOCCI.g:1416:5: ( (lv_attributes_19_0= ruleAttribute ) )
                    	    // InternalOCCI.g:1417:6: (lv_attributes_19_0= ruleAttribute )
                    	    {
                    	    // InternalOCCI.g:1417:6: (lv_attributes_19_0= ruleAttribute )
                    	    // InternalOCCI.g:1418:7: lv_attributes_19_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_7_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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
                    	    // InternalOCCI.g:1436:5: ( (lv_actions_20_0= ruleAction ) )
                    	    {
                    	    // InternalOCCI.g:1436:5: ( (lv_actions_20_0= ruleAction ) )
                    	    // InternalOCCI.g:1437:6: (lv_actions_20_0= ruleAction )
                    	    {
                    	    // InternalOCCI.g:1437:6: (lv_actions_20_0= ruleAction )
                    	    // InternalOCCI.g:1438:7: lv_actions_20_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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
                    	    // InternalOCCI.g:1456:5: ( (lv_constraints_21_0= ruleConstraint ) )
                    	    {
                    	    // InternalOCCI.g:1456:5: ( (lv_constraints_21_0= ruleConstraint ) )
                    	    // InternalOCCI.g:1457:6: (lv_constraints_21_0= ruleConstraint )
                    	    {
                    	    // InternalOCCI.g:1457:6: (lv_constraints_21_0= ruleConstraint )
                    	    // InternalOCCI.g:1458:7: lv_constraints_21_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getConstraintsConstraintParserRuleCall_7_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    otherlv_22=(Token)match(input,22,FOLLOW_38); 

                    				newLeafNode(otherlv_22, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1481:3: ( (lv_fsm_23_0= ruleFSM ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOCCI.g:1482:4: (lv_fsm_23_0= ruleFSM )
                    {
                    // InternalOCCI.g:1482:4: (lv_fsm_23_0= ruleFSM )
                    // InternalOCCI.g:1483:5: lv_fsm_23_0= ruleFSM
                    {

                    					newCompositeNode(grammarAccess.getMixinAccess().getFsmFSMParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_39);
                    lv_fsm_23_0=ruleFSM();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMixinRule());
                    					}
                    					set(
                    						current,
                    						"fsm",
                    						lv_fsm_23_0,
                    						"org.eclipse.cmf.occi.core.xtext.OCCI.FSM");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1500:3: (otherlv_24= 'annotations' otherlv_25= '{' ( (lv_annotations_26_0= ruleAnnotation ) ) (otherlv_27= ',' ( (lv_annotations_28_0= ruleAnnotation ) ) )* otherlv_29= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOCCI.g:1501:4: otherlv_24= 'annotations' otherlv_25= '{' ( (lv_annotations_26_0= ruleAnnotation ) ) (otherlv_27= ',' ( (lv_annotations_28_0= ruleAnnotation ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,35,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getMixinAccess().getAnnotationsKeyword_9_0());
                    			
                    otherlv_25=(Token)match(input,21,FOLLOW_40); 

                    				newLeafNode(otherlv_25, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalOCCI.g:1509:4: ( (lv_annotations_26_0= ruleAnnotation ) )
                    // InternalOCCI.g:1510:5: (lv_annotations_26_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1510:5: (lv_annotations_26_0= ruleAnnotation )
                    // InternalOCCI.g:1511:6: lv_annotations_26_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_annotations_26_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMixinRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_26_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1528:4: (otherlv_27= ',' ( (lv_annotations_28_0= ruleAnnotation ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==36) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalOCCI.g:1529:5: otherlv_27= ',' ( (lv_annotations_28_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_27=(Token)match(input,36,FOLLOW_40); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getMixinAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalOCCI.g:1533:5: ( (lv_annotations_28_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1534:6: (lv_annotations_28_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1534:6: (lv_annotations_28_0= ruleAnnotation )
                    	    // InternalOCCI.g:1535:7: lv_annotations_28_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    lv_annotations_28_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMixinRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_28_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_29, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_9_4());
                    			

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
    // InternalOCCI.g:1562:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalOCCI.g:1562:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalOCCI.g:1563:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalOCCI.g:1569:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
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
            // InternalOCCI.g:1575:2: ( (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalOCCI.g:1576:2: (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalOCCI.g:1576:2: (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalOCCI.g:1577:3: otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getKeyKeyword_1());
            		
            // InternalOCCI.g:1585:3: ( (lv_key_2_0= RULE_STRING ) )
            // InternalOCCI.g:1586:4: (lv_key_2_0= RULE_STRING )
            {
            // InternalOCCI.g:1586:4: (lv_key_2_0= RULE_STRING )
            // InternalOCCI.g:1587:5: lv_key_2_0= RULE_STRING
            {
            lv_key_2_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

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

            otherlv_3=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getValueKeyword_3());
            		
            // InternalOCCI.g:1607:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalOCCI.g:1608:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalOCCI.g:1608:4: (lv_value_4_0= RULE_STRING )
            // InternalOCCI.g:1609:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

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

            otherlv_5=(Token)match(input,39,FOLLOW_2); 

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
    // InternalOCCI.g:1633:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOCCI.g:1633:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOCCI.g:1634:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOCCI.g:1640:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) (otherlv_4= ':' ( ( ruleQualifiedID ) ) )? (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mutable_1_0=null;
        Token lv_required_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_default_7_0=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_annotations_12_0 = null;

        EObject lv_annotations_14_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1646:2: ( (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) (otherlv_4= ':' ( ( ruleQualifiedID ) ) )? (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? ) )
            // InternalOCCI.g:1647:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) (otherlv_4= ':' ( ( ruleQualifiedID ) ) )? (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? )
            {
            // InternalOCCI.g:1647:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) (otherlv_4= ':' ( ( ruleQualifiedID ) ) )? (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? )
            // InternalOCCI.g:1648:3: otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) (otherlv_4= ':' ( ( ruleQualifiedID ) ) )? (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalOCCI.g:1652:3: ( (lv_mutable_1_0= 'mutable' ) )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalOCCI.g:1653:4: (lv_mutable_1_0= 'mutable' )
                    {
                    // InternalOCCI.g:1653:4: (lv_mutable_1_0= 'mutable' )
                    // InternalOCCI.g:1654:5: lv_mutable_1_0= 'mutable'
                    {
                    lv_mutable_1_0=(Token)match(input,44,FOLLOW_10); 

                    					newLeafNode(lv_mutable_1_0, grammarAccess.getAttributeAccess().getMutableMutableKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1666:3: ( (lv_required_2_0= 'required' ) )?
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // InternalOCCI.g:1667:4: (lv_required_2_0= 'required' )
                    {
                    // InternalOCCI.g:1667:4: (lv_required_2_0= 'required' )
                    // InternalOCCI.g:1668:5: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,45,FOLLOW_10); 

                    					newLeafNode(lv_required_2_0, grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1680:3: ( (lv_name_3_0= ruleQualifiedID ) )
            // InternalOCCI.g:1681:4: (lv_name_3_0= ruleQualifiedID )
            {
            // InternalOCCI.g:1681:4: (lv_name_3_0= ruleQualifiedID )
            // InternalOCCI.g:1682:5: lv_name_3_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameQualifiedIDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_50);
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

            // InternalOCCI.g:1699:3: (otherlv_4= ':' ( ( ruleQualifiedID ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOCCI.g:1700:4: otherlv_4= ':' ( ( ruleQualifiedID ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4_0());
                    			
                    // InternalOCCI.g:1704:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1705:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1705:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1706:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1721:3: (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==27) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOCCI.g:1722:4: otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOCCI.g:1726:4: ( (lv_default_7_0= RULE_STRING ) )
                    // InternalOCCI.g:1727:5: (lv_default_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1727:5: (lv_default_7_0= RULE_STRING )
                    // InternalOCCI.g:1728:6: lv_default_7_0= RULE_STRING
                    {
                    lv_default_7_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

                    						newLeafNode(lv_default_7_0, grammarAccess.getAttributeAccess().getDefaultSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1745:3: (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==14) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOCCI.g:1746:4: otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalOCCI.g:1750:4: ( (lv_description_9_0= RULE_STRING ) )
                    // InternalOCCI.g:1751:5: (lv_description_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1751:5: (lv_description_9_0= RULE_STRING )
                    // InternalOCCI.g:1752:6: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    						newLeafNode(lv_description_9_0, grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1769:3: (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==35) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOCCI.g:1770:4: otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_40); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalOCCI.g:1778:4: ( (lv_annotations_12_0= ruleAnnotation ) )
                    // InternalOCCI.g:1779:5: (lv_annotations_12_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1779:5: (lv_annotations_12_0= ruleAnnotation )
                    // InternalOCCI.g:1780:6: lv_annotations_12_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_annotations_12_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_12_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1797:4: (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==36) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalOCCI.g:1798:5: otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,36,FOLLOW_40); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalOCCI.g:1802:5: ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1803:6: (lv_annotations_14_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1803:6: (lv_annotations_14_0= ruleAnnotation )
                    	    // InternalOCCI.g:1804:7: lv_annotations_14_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    lv_annotations_14_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_14_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7_4());
                    			

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
    // InternalOCCI.g:1831:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalOCCI.g:1831:47: (iv_ruleAction= ruleAction EOF )
            // InternalOCCI.g:1832:2: iv_ruleAction= ruleAction EOF
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
    // InternalOCCI.g:1838:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? (otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_title_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_annotations_11_0 = null;

        EObject lv_annotations_13_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1844:2: ( (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? (otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) )
            // InternalOCCI.g:1845:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? (otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            {
            // InternalOCCI.g:1845:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? (otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            // InternalOCCI.g:1846:3: otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? (otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalOCCI.g:1850:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1851:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1851:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1852:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
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

            // InternalOCCI.g:1869:3: (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==38) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalOCCI.g:1870:4: otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalOCCI.g:1874:4: ( (lv_attributes_3_0= ruleParameterDecl ) )
                    // InternalOCCI.g:1875:5: (lv_attributes_3_0= ruleParameterDecl )
                    {
                    // InternalOCCI.g:1875:5: (lv_attributes_3_0= ruleParameterDecl )
                    // InternalOCCI.g:1876:6: lv_attributes_3_0= ruleParameterDecl
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_attributes_3_0=ruleParameterDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_3_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.ParameterDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1893:4: (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==36) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalOCCI.g:1894:5: otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,36,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOCCI.g:1898:5: ( (lv_attributes_5_0= ruleParameterDecl ) )
                    	    // InternalOCCI.g:1899:6: (lv_attributes_5_0= ruleParameterDecl )
                    	    {
                    	    // InternalOCCI.g:1899:6: (lv_attributes_5_0= ruleParameterDecl )
                    	    // InternalOCCI.g:1900:7: lv_attributes_5_0= ruleParameterDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,39,FOLLOW_54); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1923:3: (otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==19) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOCCI.g:1924:4: otherlv_7= 'title' ( (lv_title_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getActionAccess().getTitleKeyword_3_0());
                    			
                    // InternalOCCI.g:1928:4: ( (lv_title_8_0= RULE_STRING ) )
                    // InternalOCCI.g:1929:5: (lv_title_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1929:5: (lv_title_8_0= RULE_STRING )
                    // InternalOCCI.g:1930:6: lv_title_8_0= RULE_STRING
                    {
                    lv_title_8_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    						newLeafNode(lv_title_8_0, grammarAccess.getActionAccess().getTitleSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1947:3: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==35) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOCCI.g:1948:4: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionAccess().getAnnotationsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,21,FOLLOW_40); 

                    				newLeafNode(otherlv_10, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalOCCI.g:1956:4: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // InternalOCCI.g:1957:5: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1957:5: (lv_annotations_11_0= ruleAnnotation )
                    // InternalOCCI.g:1958:6: lv_annotations_11_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_annotations_11_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_11_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1975:4: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==36) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalOCCI.g:1976:5: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,36,FOLLOW_40); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getActionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOCCI.g:1980:5: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1981:6: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1981:6: (lv_annotations_13_0= ruleAnnotation )
                    	    // InternalOCCI.g:1982:7: lv_annotations_13_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
                    	    lv_annotations_13_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
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
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_4_4());
                    			

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
    // InternalOCCI.g:2009:1: entryRuleParameterDecl returns [EObject current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final EObject entryRuleParameterDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDecl = null;


        try {
            // InternalOCCI.g:2009:54: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalOCCI.g:2010:2: iv_ruleParameterDecl= ruleParameterDecl EOF
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
    // InternalOCCI.g:2016:1: ruleParameterDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleParameterDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_default_4_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2022:2: ( ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2023:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2023:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2024:3: ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            {
            // InternalOCCI.g:2024:3: ( (lv_name_0_0= ruleQualifiedID ) )
            // InternalOCCI.g:2025:4: (lv_name_0_0= ruleQualifiedID )
            {
            // InternalOCCI.g:2025:4: (lv_name_0_0= ruleQualifiedID )
            // InternalOCCI.g:2026:5: lv_name_0_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getParameterDeclAccess().getNameQualifiedIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDeclAccess().getColonKeyword_1());
            		
            // InternalOCCI.g:2047:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2048:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2048:4: ( ruleQualifiedID )
            // InternalOCCI.g:2049:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterDeclRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterDeclAccess().getTypeDataTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_55);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2063:3: (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==27) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOCCI.g:2064:4: otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDeclAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalOCCI.g:2068:4: ( (lv_default_4_0= RULE_STRING ) )
                    // InternalOCCI.g:2069:5: (lv_default_4_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2069:5: (lv_default_4_0= RULE_STRING )
                    // InternalOCCI.g:2070:6: lv_default_4_0= RULE_STRING
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
    // InternalOCCI.g:2091:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalOCCI.g:2091:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalOCCI.g:2092:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalOCCI.g:2098:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) ;
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
            // InternalOCCI.g:2104:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) )
            // InternalOCCI.g:2105:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            {
            // InternalOCCI.g:2105:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            // InternalOCCI.g:2106:3: otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalOCCI.g:2110:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:2111:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:2111:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:2112:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_56);
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

            // InternalOCCI.g:2129:3: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==14) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOCCI.g:2130:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalOCCI.g:2134:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2135:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2135:5: (lv_description_3_0= RULE_STRING )
                    // InternalOCCI.g:2136:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

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

            otherlv_4=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getBodyKeyword_3());
            		
            // InternalOCCI.g:2157:3: ( (lv_body_5_0= RULE_STRING ) )
            // InternalOCCI.g:2158:4: (lv_body_5_0= RULE_STRING )
            {
            // InternalOCCI.g:2158:4: (lv_body_5_0= RULE_STRING )
            // InternalOCCI.g:2159:5: lv_body_5_0= RULE_STRING
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
    // InternalOCCI.g:2179:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalOCCI.g:2179:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalOCCI.g:2180:2: iv_ruleFSM= ruleFSM EOF
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
    // InternalOCCI.g:2186:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedState_4_0 = null;

        EObject lv_ownedState_6_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2192:2: ( (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? ) )
            // InternalOCCI.g:2193:2: (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? )
            {
            // InternalOCCI.g:2193:2: (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? )
            // InternalOCCI.g:2194:3: otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getAttributeKeyword_1());
            		
            // InternalOCCI.g:2202:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2203:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2203:4: ( ruleQualifiedID )
            // InternalOCCI.g:2204:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFSMRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFSMAccess().getAttributeAttributeCrossReference_2_0());
            				
            pushFollow(FOLLOW_59);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2218:3: (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==21) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOCCI.g:2219:4: otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_60); 

                    				newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalOCCI.g:2223:4: ( (lv_ownedState_4_0= ruleState ) )
                    // InternalOCCI.g:2224:5: (lv_ownedState_4_0= ruleState )
                    {
                    // InternalOCCI.g:2224:5: (lv_ownedState_4_0= ruleState )
                    // InternalOCCI.g:2225:6: lv_ownedState_4_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_ownedState_4_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFSMRule());
                    						}
                    						add(
                    							current,
                    							"ownedState",
                    							lv_ownedState_4_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:2242:4: (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==36) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalOCCI.g:2243:5: otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) )
                    	    {
                    	    otherlv_5=(Token)match(input,36,FOLLOW_60); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalOCCI.g:2247:5: ( (lv_ownedState_6_0= ruleState ) )
                    	    // InternalOCCI.g:2248:6: (lv_ownedState_6_0= ruleState )
                    	    {
                    	    // InternalOCCI.g:2248:6: (lv_ownedState_6_0= ruleState )
                    	    // InternalOCCI.g:2249:7: lv_ownedState_6_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_3_3());
                    			

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
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalOCCI.g:2276:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalOCCI.g:2276:46: (iv_ruleState= ruleState EOF )
            // InternalOCCI.g:2277:2: iv_ruleState= ruleState EOF
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
    // InternalOCCI.g:2283:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( ( ruleQualifiedID ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_initial_1_0=null;
        Token lv_final_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_outgoingTransition_6_0 = null;

        EObject lv_outgoingTransition_8_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2289:2: ( (otherlv_0= 'state' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( ( ruleQualifiedID ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )? ) )
            // InternalOCCI.g:2290:2: (otherlv_0= 'state' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( ( ruleQualifiedID ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )? )
            {
            // InternalOCCI.g:2290:2: (otherlv_0= 'state' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( ( ruleQualifiedID ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )? )
            // InternalOCCI.g:2291:3: otherlv_0= 'state' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( ( ruleQualifiedID ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalOCCI.g:2295:3: ( (lv_initial_1_0= 'initial' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==51) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==53) ) {
                    int LA58_3 = input.LA(3);

                    if ( (LA58_3==EOF||LA58_3==22||LA58_3==36||LA58_3==53) ) {
                        alt58=1;
                    }
                }
                else if ( (LA58_1==RULE_ID||LA58_1==RULE_QUALIFIED_ID||(LA58_1>=13 && LA58_1<=17)||(LA58_1>=19 && LA58_1<=20)||(LA58_1>=23 && LA58_1<=26)||(LA58_1>=28 && LA58_1<=35)||LA58_1==37||(LA58_1>=40 && LA58_1<=52)||(LA58_1>=54 && LA58_1<=60)||(LA58_1>=62 && LA58_1<=72)||(LA58_1>=74 && LA58_1<=81)) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // InternalOCCI.g:2296:4: (lv_initial_1_0= 'initial' )
                    {
                    // InternalOCCI.g:2296:4: (lv_initial_1_0= 'initial' )
                    // InternalOCCI.g:2297:5: lv_initial_1_0= 'initial'
                    {
                    lv_initial_1_0=(Token)match(input,51,FOLLOW_10); 

                    					newLeafNode(lv_initial_1_0, grammarAccess.getStateAccess().getInitialInitialKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2309:3: ( (lv_final_2_0= 'final' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==52) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==RULE_ID||LA59_1==RULE_QUALIFIED_ID||(LA59_1>=13 && LA59_1<=17)||(LA59_1>=19 && LA59_1<=20)||(LA59_1>=23 && LA59_1<=26)||(LA59_1>=28 && LA59_1<=35)||LA59_1==37||(LA59_1>=40 && LA59_1<=52)||(LA59_1>=54 && LA59_1<=60)||(LA59_1>=62 && LA59_1<=72)||(LA59_1>=74 && LA59_1<=81)) ) {
                    alt59=1;
                }
                else if ( (LA59_1==53) ) {
                    int LA59_4 = input.LA(3);

                    if ( (LA59_4==EOF||LA59_4==22||LA59_4==36||LA59_4==53) ) {
                        alt59=1;
                    }
                }
            }
            switch (alt59) {
                case 1 :
                    // InternalOCCI.g:2310:4: (lv_final_2_0= 'final' )
                    {
                    // InternalOCCI.g:2310:4: (lv_final_2_0= 'final' )
                    // InternalOCCI.g:2311:5: lv_final_2_0= 'final'
                    {
                    lv_final_2_0=(Token)match(input,52,FOLLOW_10); 

                    					newLeafNode(lv_final_2_0, grammarAccess.getStateAccess().getFinalFinalKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2323:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2324:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2324:4: ( ruleQualifiedID )
            // InternalOCCI.g:2325:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_3_0());
            				
            pushFollow(FOLLOW_61);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2339:3: (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==53) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOCCI.g:2340:4: otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getTransitionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,38,FOLLOW_62); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalOCCI.g:2348:4: ( (lv_outgoingTransition_6_0= ruleTransition ) )
                    // InternalOCCI.g:2349:5: (lv_outgoingTransition_6_0= ruleTransition )
                    {
                    // InternalOCCI.g:2349:5: (lv_outgoingTransition_6_0= ruleTransition )
                    // InternalOCCI.g:2350:6: lv_outgoingTransition_6_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_outgoingTransition_6_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"outgoingTransition",
                    							lv_outgoingTransition_6_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:2367:4: (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==36) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalOCCI.g:2368:5: otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,36,FOLLOW_62); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOCCI.g:2372:5: ( (lv_outgoingTransition_8_0= ruleTransition ) )
                    	    // InternalOCCI.g:2373:6: (lv_outgoingTransition_8_0= ruleTransition )
                    	    {
                    	    // InternalOCCI.g:2373:6: (lv_outgoingTransition_8_0= ruleTransition )
                    	    // InternalOCCI.g:2374:7: lv_outgoingTransition_8_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_43);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightParenthesisKeyword_4_4());
                    			

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalOCCI.g:2401:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalOCCI.g:2401:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalOCCI.g:2402:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalOCCI.g:2408:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOCCI.g:2414:2: ( ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) )
            // InternalOCCI.g:2415:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            {
            // InternalOCCI.g:2415:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:2416:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:2416:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==46) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOCCI.g:2417:4: otherlv_0= 'action' ( ( ruleQualifiedID ) )
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getActionKeyword_0_0());
                    			
                    // InternalOCCI.g:2421:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:2422:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:2422:5: ( ruleQualifiedID )
                    // InternalOCCI.g:2423:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getActionActionCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,54,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToKeyword_1());
            		
            // InternalOCCI.g:2442:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2443:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2443:4: ( ruleQualifiedID )
            // InternalOCCI.g:2444:5: ruleQualifiedID
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
    // InternalOCCI.g:2462:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalOCCI.g:2462:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalOCCI.g:2463:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalOCCI.g:2469:1: ruleDataType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) ;
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
            // InternalOCCI.g:2475:2: ( (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) )
            // InternalOCCI.g:2476:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            {
            // InternalOCCI.g:2476:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            int alt63=7;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt63=1;
                }
                break;
            case 60:
                {
                alt63=2;
                }
                break;
            case 62:
                {
                alt63=3;
                }
                break;
            case 63:
                {
                alt63=4;
                }
                break;
            case 69:
                {
                alt63=5;
                }
                break;
            case 71:
                {
                alt63=6;
                }
                break;
            case 72:
                {
                alt63=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalOCCI.g:2477:3: this_StringType_0= ruleStringType
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
                    // InternalOCCI.g:2486:3: this_EObjectType_1= ruleEObjectType
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
                    // InternalOCCI.g:2495:3: this_BooleanType_2= ruleBooleanType
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
                    // InternalOCCI.g:2504:3: this_NumericType_3= ruleNumericType
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
                    // InternalOCCI.g:2513:3: this_EnumerationType_4= ruleEnumerationType
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
                    // InternalOCCI.g:2522:3: this_RecordType_5= ruleRecordType
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
                    // InternalOCCI.g:2531:3: this_ArrayType_6= ruleArrayType
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
    // InternalOCCI.g:2543:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalOCCI.g:2543:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalOCCI.g:2544:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalOCCI.g:2550:1: ruleStringType returns [EObject current=null] : (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? (otherlv_4= 'pattern' ( (lv_pattern_5_0= RULE_STRING ) ) )? (otherlv_6= 'length' ( (lv_length_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'minLength' ( (lv_minLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'maxLength' ( (lv_maxLength_11_0= ruleEIntegerObject ) ) )? ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_documentation_3_0=null;
        Token otherlv_4=null;
        Token lv_pattern_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_length_7_0 = null;

        AntlrDatatypeRuleToken lv_minLength_9_0 = null;

        AntlrDatatypeRuleToken lv_maxLength_11_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2556:2: ( (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? (otherlv_4= 'pattern' ( (lv_pattern_5_0= RULE_STRING ) ) )? (otherlv_6= 'length' ( (lv_length_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'minLength' ( (lv_minLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'maxLength' ( (lv_maxLength_11_0= ruleEIntegerObject ) ) )? ) )
            // InternalOCCI.g:2557:2: (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? (otherlv_4= 'pattern' ( (lv_pattern_5_0= RULE_STRING ) ) )? (otherlv_6= 'length' ( (lv_length_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'minLength' ( (lv_minLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'maxLength' ( (lv_maxLength_11_0= ruleEIntegerObject ) ) )? )
            {
            // InternalOCCI.g:2557:2: (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? (otherlv_4= 'pattern' ( (lv_pattern_5_0= RULE_STRING ) ) )? (otherlv_6= 'length' ( (lv_length_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'minLength' ( (lv_minLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'maxLength' ( (lv_maxLength_11_0= ruleEIntegerObject ) ) )? )
            // InternalOCCI.g:2558:3: otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? (otherlv_4= 'pattern' ( (lv_pattern_5_0= RULE_STRING ) ) )? (otherlv_6= 'length' ( (lv_length_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'minLength' ( (lv_minLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'maxLength' ( (lv_maxLength_11_0= ruleEIntegerObject ) ) )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStringTypeAccess().getStringTypeKeyword_0());
            		
            // InternalOCCI.g:2562:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2563:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2563:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2564:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getStringTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_64);
            lv_name_1_0=ruleTypeID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.TypeID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2581:3: (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==18) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalOCCI.g:2582:4: otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getColonKeyword_2_0());
                    			
                    // InternalOCCI.g:2586:4: ( (lv_documentation_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2587:5: (lv_documentation_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2587:5: (lv_documentation_3_0= RULE_STRING )
                    // InternalOCCI.g:2588:6: lv_documentation_3_0= RULE_STRING
                    {
                    lv_documentation_3_0=(Token)match(input,RULE_STRING,FOLLOW_65); 

                    						newLeafNode(lv_documentation_3_0, grammarAccess.getStringTypeAccess().getDocumentationSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringTypeRule());
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

            // InternalOCCI.g:2605:3: (otherlv_4= 'pattern' ( (lv_pattern_5_0= RULE_STRING ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==56) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOCCI.g:2606:4: otherlv_4= 'pattern' ( (lv_pattern_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStringTypeAccess().getPatternKeyword_3_0());
                    			
                    // InternalOCCI.g:2610:4: ( (lv_pattern_5_0= RULE_STRING ) )
                    // InternalOCCI.g:2611:5: (lv_pattern_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2611:5: (lv_pattern_5_0= RULE_STRING )
                    // InternalOCCI.g:2612:6: lv_pattern_5_0= RULE_STRING
                    {
                    lv_pattern_5_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

                    						newLeafNode(lv_pattern_5_0, grammarAccess.getStringTypeAccess().getPatternSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pattern",
                    							lv_pattern_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2629:3: (otherlv_6= 'length' ( (lv_length_7_0= ruleEIntegerObject ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==57) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalOCCI.g:2630:4: otherlv_6= 'length' ( (lv_length_7_0= ruleEIntegerObject ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_67); 

                    				newLeafNode(otherlv_6, grammarAccess.getStringTypeAccess().getLengthKeyword_4_0());
                    			
                    // InternalOCCI.g:2634:4: ( (lv_length_7_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2635:5: (lv_length_7_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2635:5: (lv_length_7_0= ruleEIntegerObject )
                    // InternalOCCI.g:2636:6: lv_length_7_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getLengthEIntegerObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_length_7_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"length",
                    							lv_length_7_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2654:3: (otherlv_8= 'minLength' ( (lv_minLength_9_0= ruleEIntegerObject ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==58) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOCCI.g:2655:4: otherlv_8= 'minLength' ( (lv_minLength_9_0= ruleEIntegerObject ) )
                    {
                    otherlv_8=(Token)match(input,58,FOLLOW_67); 

                    				newLeafNode(otherlv_8, grammarAccess.getStringTypeAccess().getMinLengthKeyword_5_0());
                    			
                    // InternalOCCI.g:2659:4: ( (lv_minLength_9_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2660:5: (lv_minLength_9_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2660:5: (lv_minLength_9_0= ruleEIntegerObject )
                    // InternalOCCI.g:2661:6: lv_minLength_9_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMinLengthEIntegerObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    lv_minLength_9_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"minLength",
                    							lv_minLength_9_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2679:3: (otherlv_10= 'maxLength' ( (lv_maxLength_11_0= ruleEIntegerObject ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==59) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalOCCI.g:2680:4: otherlv_10= 'maxLength' ( (lv_maxLength_11_0= ruleEIntegerObject ) )
                    {
                    otherlv_10=(Token)match(input,59,FOLLOW_67); 

                    				newLeafNode(otherlv_10, grammarAccess.getStringTypeAccess().getMaxLengthKeyword_6_0());
                    			
                    // InternalOCCI.g:2684:4: ( (lv_maxLength_11_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2685:5: (lv_maxLength_11_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2685:5: (lv_maxLength_11_0= ruleEIntegerObject )
                    // InternalOCCI.g:2686:6: lv_maxLength_11_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMaxLengthEIntegerObjectParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_maxLength_11_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"maxLength",
                    							lv_maxLength_11_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleEObjectType"
    // InternalOCCI.g:2708:1: entryRuleEObjectType returns [EObject current=null] : iv_ruleEObjectType= ruleEObjectType EOF ;
    public final EObject entryRuleEObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectType = null;


        try {
            // InternalOCCI.g:2708:52: (iv_ruleEObjectType= ruleEObjectType EOF )
            // InternalOCCI.g:2709:2: iv_ruleEObjectType= ruleEObjectType EOF
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
    // InternalOCCI.g:2715:1: ruleEObjectType returns [EObject current=null] : (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? (otherlv_4= 'type' ( (lv_instanceClassName_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_documentation_3_0=null;
        Token otherlv_4=null;
        Token lv_instanceClassName_5_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2721:2: ( (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? (otherlv_4= 'type' ( (lv_instanceClassName_5_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2722:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? (otherlv_4= 'type' ( (lv_instanceClassName_5_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2722:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? (otherlv_4= 'type' ( (lv_instanceClassName_5_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2723:3: otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? (otherlv_4= 'type' ( (lv_instanceClassName_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEObjectTypeAccess().getEObjectTypeKeyword_0());
            		
            // InternalOCCI.g:2727:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2728:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2728:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2729:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getEObjectTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_70);
            lv_name_1_0=ruleTypeID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEObjectTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.TypeID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2746:3: (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==18) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalOCCI.g:2747:4: otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEObjectTypeAccess().getColonKeyword_2_0());
                    			
                    // InternalOCCI.g:2751:4: ( (lv_documentation_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2752:5: (lv_documentation_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2752:5: (lv_documentation_3_0= RULE_STRING )
                    // InternalOCCI.g:2753:6: lv_documentation_3_0= RULE_STRING
                    {
                    lv_documentation_3_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

                    						newLeafNode(lv_documentation_3_0, grammarAccess.getEObjectTypeAccess().getDocumentationSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEObjectTypeRule());
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

            // InternalOCCI.g:2770:3: (otherlv_4= 'type' ( (lv_instanceClassName_5_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==61) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalOCCI.g:2771:4: otherlv_4= 'type' ( (lv_instanceClassName_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEObjectTypeAccess().getTypeKeyword_3_0());
                    			
                    // InternalOCCI.g:2775:4: ( (lv_instanceClassName_5_0= RULE_STRING ) )
                    // InternalOCCI.g:2776:5: (lv_instanceClassName_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2776:5: (lv_instanceClassName_5_0= RULE_STRING )
                    // InternalOCCI.g:2777:6: lv_instanceClassName_5_0= RULE_STRING
                    {
                    lv_instanceClassName_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_instanceClassName_5_0, grammarAccess.getEObjectTypeAccess().getInstanceClassNameSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEObjectTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_5_0,
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
    // InternalOCCI.g:2798:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalOCCI.g:2798:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalOCCI.g:2799:2: iv_ruleBooleanType= ruleBooleanType EOF
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
    // InternalOCCI.g:2805:1: ruleBooleanType returns [EObject current=null] : (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_documentation_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2811:2: ( (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2812:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2812:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2813:3: otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_0());
            		
            // InternalOCCI.g:2817:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2818:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2818:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2819:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getBooleanTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_72);
            lv_name_1_0=ruleTypeID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.TypeID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2836:3: (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==18) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalOCCI.g:2837:4: otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanTypeAccess().getColonKeyword_2_0());
                    			
                    // InternalOCCI.g:2841:4: ( (lv_documentation_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2842:5: (lv_documentation_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2842:5: (lv_documentation_3_0= RULE_STRING )
                    // InternalOCCI.g:2843:6: lv_documentation_3_0= RULE_STRING
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
    // InternalOCCI.g:2864:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // InternalOCCI.g:2864:52: (iv_ruleNumericType= ruleNumericType EOF )
            // InternalOCCI.g:2865:2: iv_ruleNumericType= ruleNumericType EOF
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
    // InternalOCCI.g:2871:1: ruleNumericType returns [EObject current=null] : (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )? (otherlv_6= 'totalDigits' ( (lv_totalDigits_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'minExclusive' ( (lv_minExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'maxExclusive' ( (lv_maxExclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'minInclusive' ( (lv_minInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'maxInclusive' ( (lv_maxInclusive_15_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_documentation_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_minExclusive_9_0=null;
        Token otherlv_10=null;
        Token lv_maxExclusive_11_0=null;
        Token otherlv_12=null;
        Token lv_minInclusive_13_0=null;
        Token otherlv_14=null;
        Token lv_maxInclusive_15_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_totalDigits_7_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2877:2: ( (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )? (otherlv_6= 'totalDigits' ( (lv_totalDigits_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'minExclusive' ( (lv_minExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'maxExclusive' ( (lv_maxExclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'minInclusive' ( (lv_minInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'maxInclusive' ( (lv_maxInclusive_15_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2878:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )? (otherlv_6= 'totalDigits' ( (lv_totalDigits_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'minExclusive' ( (lv_minExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'maxExclusive' ( (lv_maxExclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'minInclusive' ( (lv_minInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'maxInclusive' ( (lv_maxInclusive_15_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2878:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )? (otherlv_6= 'totalDigits' ( (lv_totalDigits_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'minExclusive' ( (lv_minExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'maxExclusive' ( (lv_maxExclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'minInclusive' ( (lv_minInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'maxInclusive' ( (lv_maxInclusive_15_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2879:3: otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )? (otherlv_6= 'totalDigits' ( (lv_totalDigits_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'minExclusive' ( (lv_minExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'maxExclusive' ( (lv_maxExclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'minInclusive' ( (lv_minInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'maxInclusive' ( (lv_maxInclusive_15_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNumericTypeAccess().getNumericTypeKeyword_0());
            		
            // InternalOCCI.g:2883:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2884:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2884:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2885:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getNumericTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_73);
            lv_name_1_0=ruleTypeID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumericTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.TypeID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,61,FOLLOW_74); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericTypeAccess().getTypeKeyword_2());
            		
            // InternalOCCI.g:2906:3: ( (lv_type_3_0= ruleNumericTypeEnum ) )
            // InternalOCCI.g:2907:4: (lv_type_3_0= ruleNumericTypeEnum )
            {
            // InternalOCCI.g:2907:4: (lv_type_3_0= ruleNumericTypeEnum )
            // InternalOCCI.g:2908:5: lv_type_3_0= ruleNumericTypeEnum
            {

            					newCompositeNode(grammarAccess.getNumericTypeAccess().getTypeNumericTypeEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_75);
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

            // InternalOCCI.g:2925:3: (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==18) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalOCCI.g:2926:4: otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getNumericTypeAccess().getColonKeyword_4_0());
                    			
                    // InternalOCCI.g:2930:4: ( (lv_documentation_5_0= RULE_STRING ) )
                    // InternalOCCI.g:2931:5: (lv_documentation_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2931:5: (lv_documentation_5_0= RULE_STRING )
                    // InternalOCCI.g:2932:6: lv_documentation_5_0= RULE_STRING
                    {
                    lv_documentation_5_0=(Token)match(input,RULE_STRING,FOLLOW_76); 

                    						newLeafNode(lv_documentation_5_0, grammarAccess.getNumericTypeAccess().getDocumentationSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
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

            // InternalOCCI.g:2949:3: (otherlv_6= 'totalDigits' ( (lv_totalDigits_7_0= ruleEIntegerObject ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==64) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalOCCI.g:2950:4: otherlv_6= 'totalDigits' ( (lv_totalDigits_7_0= ruleEIntegerObject ) )
                    {
                    otherlv_6=(Token)match(input,64,FOLLOW_67); 

                    				newLeafNode(otherlv_6, grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_5_0());
                    			
                    // InternalOCCI.g:2954:4: ( (lv_totalDigits_7_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2955:5: (lv_totalDigits_7_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2955:5: (lv_totalDigits_7_0= ruleEIntegerObject )
                    // InternalOCCI.g:2956:6: lv_totalDigits_7_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getNumericTypeAccess().getTotalDigitsEIntegerObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_77);
                    lv_totalDigits_7_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                    						}
                    						set(
                    							current,
                    							"totalDigits",
                    							lv_totalDigits_7_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2974:3: (otherlv_8= 'minExclusive' ( (lv_minExclusive_9_0= RULE_STRING ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==65) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalOCCI.g:2975:4: otherlv_8= 'minExclusive' ( (lv_minExclusive_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,65,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_6_0());
                    			
                    // InternalOCCI.g:2979:4: ( (lv_minExclusive_9_0= RULE_STRING ) )
                    // InternalOCCI.g:2980:5: (lv_minExclusive_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2980:5: (lv_minExclusive_9_0= RULE_STRING )
                    // InternalOCCI.g:2981:6: lv_minExclusive_9_0= RULE_STRING
                    {
                    lv_minExclusive_9_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

                    						newLeafNode(lv_minExclusive_9_0, grammarAccess.getNumericTypeAccess().getMinExclusiveSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minExclusive",
                    							lv_minExclusive_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2998:3: (otherlv_10= 'maxExclusive' ( (lv_maxExclusive_11_0= RULE_STRING ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==66) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalOCCI.g:2999:4: otherlv_10= 'maxExclusive' ( (lv_maxExclusive_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,66,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_7_0());
                    			
                    // InternalOCCI.g:3003:4: ( (lv_maxExclusive_11_0= RULE_STRING ) )
                    // InternalOCCI.g:3004:5: (lv_maxExclusive_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3004:5: (lv_maxExclusive_11_0= RULE_STRING )
                    // InternalOCCI.g:3005:6: lv_maxExclusive_11_0= RULE_STRING
                    {
                    lv_maxExclusive_11_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

                    						newLeafNode(lv_maxExclusive_11_0, grammarAccess.getNumericTypeAccess().getMaxExclusiveSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxExclusive",
                    							lv_maxExclusive_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:3022:3: (otherlv_12= 'minInclusive' ( (lv_minInclusive_13_0= RULE_STRING ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==67) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalOCCI.g:3023:4: otherlv_12= 'minInclusive' ( (lv_minInclusive_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,67,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_8_0());
                    			
                    // InternalOCCI.g:3027:4: ( (lv_minInclusive_13_0= RULE_STRING ) )
                    // InternalOCCI.g:3028:5: (lv_minInclusive_13_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3028:5: (lv_minInclusive_13_0= RULE_STRING )
                    // InternalOCCI.g:3029:6: lv_minInclusive_13_0= RULE_STRING
                    {
                    lv_minInclusive_13_0=(Token)match(input,RULE_STRING,FOLLOW_80); 

                    						newLeafNode(lv_minInclusive_13_0, grammarAccess.getNumericTypeAccess().getMinInclusiveSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minInclusive",
                    							lv_minInclusive_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:3046:3: (otherlv_14= 'maxInclusive' ( (lv_maxInclusive_15_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==68) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalOCCI.g:3047:4: otherlv_14= 'maxInclusive' ( (lv_maxInclusive_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,68,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_9_0());
                    			
                    // InternalOCCI.g:3051:4: ( (lv_maxInclusive_15_0= RULE_STRING ) )
                    // InternalOCCI.g:3052:5: (lv_maxInclusive_15_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3052:5: (lv_maxInclusive_15_0= RULE_STRING )
                    // InternalOCCI.g:3053:6: lv_maxInclusive_15_0= RULE_STRING
                    {
                    lv_maxInclusive_15_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_maxInclusive_15_0, grammarAccess.getNumericTypeAccess().getMaxInclusiveSTRINGTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxInclusive",
                    							lv_maxInclusive_15_0,
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
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleEnumerationType"
    // InternalOCCI.g:3074:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // InternalOCCI.g:3074:56: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // InternalOCCI.g:3075:2: iv_ruleEnumerationType= ruleEnumerationType EOF
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
    // InternalOCCI.g:3081:1: ruleEnumerationType returns [EObject current=null] : (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= 'literals' otherlv_5= '(' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleEnumerationLiteral ) ) )* otherlv_9= ')' ) ;
    public final EObject ruleEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_documentation_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_literals_6_0 = null;

        EObject lv_literals_8_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3087:2: ( (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= 'literals' otherlv_5= '(' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleEnumerationLiteral ) ) )* otherlv_9= ')' ) )
            // InternalOCCI.g:3088:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= 'literals' otherlv_5= '(' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleEnumerationLiteral ) ) )* otherlv_9= ')' )
            {
            // InternalOCCI.g:3088:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= 'literals' otherlv_5= '(' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleEnumerationLiteral ) ) )* otherlv_9= ')' )
            // InternalOCCI.g:3089:3: otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= 'literals' otherlv_5= '(' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) (otherlv_7= ',' ( (lv_literals_8_0= ruleEnumerationLiteral ) ) )* otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0());
            		
            // InternalOCCI.g:3093:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:3094:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:3094:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:3095:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_81);
            lv_name_1_0=ruleTypeID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.TypeID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:3112:3: (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==18) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalOCCI.g:3113:4: otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getColonKeyword_2_0());
                    			
                    // InternalOCCI.g:3117:4: ( (lv_documentation_3_0= RULE_STRING ) )
                    // InternalOCCI.g:3118:5: (lv_documentation_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3118:5: (lv_documentation_3_0= RULE_STRING )
                    // InternalOCCI.g:3119:6: lv_documentation_3_0= RULE_STRING
                    {
                    lv_documentation_3_0=(Token)match(input,RULE_STRING,FOLLOW_82); 

                    						newLeafNode(lv_documentation_3_0, grammarAccess.getEnumerationTypeAccess().getDocumentationSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnumerationTypeRule());
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

            otherlv_4=(Token)match(input,70,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_3());
            		
            otherlv_5=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_4());
            		
            // InternalOCCI.g:3144:3: ( (lv_literals_6_0= ruleEnumerationLiteral ) )
            // InternalOCCI.g:3145:4: (lv_literals_6_0= ruleEnumerationLiteral )
            {
            // InternalOCCI.g:3145:4: (lv_literals_6_0= ruleEnumerationLiteral )
            // InternalOCCI.g:3146:5: lv_literals_6_0= ruleEnumerationLiteral
            {

            					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalOCCI.g:3163:3: (otherlv_7= ',' ( (lv_literals_8_0= ruleEnumerationLiteral ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==36) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalOCCI.g:3164:4: otherlv_7= ',' ( (lv_literals_8_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_7=(Token)match(input,36,FOLLOW_10); 

            	    				newLeafNode(otherlv_7, grammarAccess.getEnumerationTypeAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalOCCI.g:3168:4: ( (lv_literals_8_0= ruleEnumerationLiteral ) )
            	    // InternalOCCI.g:3169:5: (lv_literals_8_0= ruleEnumerationLiteral )
            	    {
            	    // InternalOCCI.g:3169:5: (lv_literals_8_0= ruleEnumerationLiteral )
            	    // InternalOCCI.g:3170:6: lv_literals_8_0= ruleEnumerationLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_literals_8_0=ruleEnumerationLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"literals",
            	    							lv_literals_8_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.EnumerationLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_9=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_7());
            		

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
    // InternalOCCI.g:3196:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalOCCI.g:3196:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalOCCI.g:3197:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalOCCI.g:3203:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= ':' ( (lv_documentation_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_documentation_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3209:2: ( ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= ':' ( (lv_documentation_2_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3210:2: ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= ':' ( (lv_documentation_2_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3210:2: ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= ':' ( (lv_documentation_2_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3211:3: ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= ':' ( (lv_documentation_2_0= RULE_STRING ) ) )?
            {
            // InternalOCCI.g:3211:3: ( (lv_name_0_0= ruleTypeID ) )
            // InternalOCCI.g:3212:4: (lv_name_0_0= ruleTypeID )
            {
            // InternalOCCI.g:3212:4: (lv_name_0_0= ruleTypeID )
            // InternalOCCI.g:3213:5: lv_name_0_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getNameTypeIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_72);
            lv_name_0_0=ruleTypeID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.TypeID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:3230:3: (otherlv_1= ':' ( (lv_documentation_2_0= RULE_STRING ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==18) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalOCCI.g:3231:4: otherlv_1= ':' ( (lv_documentation_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getColonKeyword_1_0());
                    			
                    // InternalOCCI.g:3235:4: ( (lv_documentation_2_0= RULE_STRING ) )
                    // InternalOCCI.g:3236:5: (lv_documentation_2_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3236:5: (lv_documentation_2_0= RULE_STRING )
                    // InternalOCCI.g:3237:6: lv_documentation_2_0= RULE_STRING
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
    // InternalOCCI.g:3258:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // InternalOCCI.g:3258:51: (iv_ruleRecordType= ruleRecordType EOF )
            // InternalOCCI.g:3259:2: iv_ruleRecordType= ruleRecordType EOF
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
    // InternalOCCI.g:3265:1: ruleRecordType returns [EObject current=null] : (otherlv_0= 'record' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_recordFields_5_0= ruleRecordField ) ) (otherlv_6= ',' ( (lv_recordFields_7_0= ruleRecordField ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_documentation_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_recordFields_5_0 = null;

        EObject lv_recordFields_7_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3271:2: ( (otherlv_0= 'record' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_recordFields_5_0= ruleRecordField ) ) (otherlv_6= ',' ( (lv_recordFields_7_0= ruleRecordField ) ) )* otherlv_8= '}' ) )
            // InternalOCCI.g:3272:2: (otherlv_0= 'record' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_recordFields_5_0= ruleRecordField ) ) (otherlv_6= ',' ( (lv_recordFields_7_0= ruleRecordField ) ) )* otherlv_8= '}' )
            {
            // InternalOCCI.g:3272:2: (otherlv_0= 'record' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_recordFields_5_0= ruleRecordField ) ) (otherlv_6= ',' ( (lv_recordFields_7_0= ruleRecordField ) ) )* otherlv_8= '}' )
            // InternalOCCI.g:3273:3: otherlv_0= 'record' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_recordFields_5_0= ruleRecordField ) ) (otherlv_6= ',' ( (lv_recordFields_7_0= ruleRecordField ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getRecordKeyword_0());
            		
            // InternalOCCI.g:3277:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:3278:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:3278:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:3279:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_83);
            lv_name_1_0=ruleTypeID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.TypeID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:3296:3: (otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==18) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalOCCI.g:3297:4: otherlv_2= ':' ( (lv_documentation_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getColonKeyword_2_0());
                    			
                    // InternalOCCI.g:3301:4: ( (lv_documentation_3_0= RULE_STRING ) )
                    // InternalOCCI.g:3302:5: (lv_documentation_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3302:5: (lv_documentation_3_0= RULE_STRING )
                    // InternalOCCI.g:3303:6: lv_documentation_3_0= RULE_STRING
                    {
                    lv_documentation_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_documentation_3_0, grammarAccess.getRecordTypeAccess().getDocumentationSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecordTypeRule());
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

            otherlv_4=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOCCI.g:3324:3: ( (lv_recordFields_5_0= ruleRecordField ) )
            // InternalOCCI.g:3325:4: (lv_recordFields_5_0= ruleRecordField )
            {
            // InternalOCCI.g:3325:4: (lv_recordFields_5_0= ruleRecordField )
            // InternalOCCI.g:3326:5: lv_recordFields_5_0= ruleRecordField
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_41);
            lv_recordFields_5_0=ruleRecordField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            					}
            					add(
            						current,
            						"recordFields",
            						lv_recordFields_5_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.RecordField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:3343:3: (otherlv_6= ',' ( (lv_recordFields_7_0= ruleRecordField ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==36) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalOCCI.g:3344:4: otherlv_6= ',' ( (lv_recordFields_7_0= ruleRecordField ) )
            	    {
            	    otherlv_6=(Token)match(input,36,FOLLOW_10); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRecordTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalOCCI.g:3348:4: ( (lv_recordFields_7_0= ruleRecordField ) )
            	    // InternalOCCI.g:3349:5: (lv_recordFields_7_0= ruleRecordField )
            	    {
            	    // InternalOCCI.g:3349:5: (lv_recordFields_7_0= ruleRecordField )
            	    // InternalOCCI.g:3350:6: lv_recordFields_7_0= ruleRecordField
            	    {

            	    						newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
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


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalOCCI.g:3376:1: entryRuleRecordField returns [EObject current=null] : iv_ruleRecordField= ruleRecordField EOF ;
    public final EObject entryRuleRecordField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordField = null;


        try {
            // InternalOCCI.g:3376:52: (iv_ruleRecordField= ruleRecordField EOF )
            // InternalOCCI.g:3377:2: iv_ruleRecordField= ruleRecordField EOF
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
    // InternalOCCI.g:3383:1: ruleRecordField returns [EObject current=null] : ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= ':' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) ;
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
            // InternalOCCI.g:3389:2: ( ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= ':' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) )
            // InternalOCCI.g:3390:2: ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= ':' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            {
            // InternalOCCI.g:3390:2: ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= ':' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            // InternalOCCI.g:3391:3: ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= ':' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            {
            // InternalOCCI.g:3391:3: ( (lv_mutable_0_0= 'mutable' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==44) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==RULE_ID||LA83_1==RULE_QUALIFIED_ID||(LA83_1>=13 && LA83_1<=17)||(LA83_1>=19 && LA83_1<=20)||(LA83_1>=23 && LA83_1<=26)||(LA83_1>=28 && LA83_1<=35)||LA83_1==37||(LA83_1>=40 && LA83_1<=60)||(LA83_1>=62 && LA83_1<=72)||(LA83_1>=74 && LA83_1<=81)) ) {
                    alt83=1;
                }
            }
            switch (alt83) {
                case 1 :
                    // InternalOCCI.g:3392:4: (lv_mutable_0_0= 'mutable' )
                    {
                    // InternalOCCI.g:3392:4: (lv_mutable_0_0= 'mutable' )
                    // InternalOCCI.g:3393:5: lv_mutable_0_0= 'mutable'
                    {
                    lv_mutable_0_0=(Token)match(input,44,FOLLOW_10); 

                    					newLeafNode(lv_mutable_0_0, grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:3405:3: ( (lv_required_1_0= 'required' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==45) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==RULE_ID||LA84_1==RULE_QUALIFIED_ID||(LA84_1>=13 && LA84_1<=17)||(LA84_1>=19 && LA84_1<=20)||(LA84_1>=23 && LA84_1<=26)||(LA84_1>=28 && LA84_1<=35)||LA84_1==37||(LA84_1>=40 && LA84_1<=60)||(LA84_1>=62 && LA84_1<=72)||(LA84_1>=74 && LA84_1<=81)) ) {
                    alt84=1;
                }
            }
            switch (alt84) {
                case 1 :
                    // InternalOCCI.g:3406:4: (lv_required_1_0= 'required' )
                    {
                    // InternalOCCI.g:3406:4: (lv_required_1_0= 'required' )
                    // InternalOCCI.g:3407:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,45,FOLLOW_10); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:3419:3: ( (lv_name_2_0= ruleQualifiedID ) )
            // InternalOCCI.g:3420:4: (lv_name_2_0= ruleQualifiedID )
            {
            // InternalOCCI.g:3420:4: (lv_name_2_0= ruleQualifiedID )
            // InternalOCCI.g:3421:5: lv_name_2_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getRecordFieldAccess().getNameQualifiedIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalOCCI.g:3438:3: (otherlv_3= ':' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:3439:4: otherlv_3= ':' ( ( ruleQualifiedID ) )
            {
            otherlv_3=(Token)match(input,18,FOLLOW_10); 

            				newLeafNode(otherlv_3, grammarAccess.getRecordFieldAccess().getColonKeyword_3_0());
            			
            // InternalOCCI.g:3443:4: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:3444:5: ( ruleQualifiedID )
            {
            // InternalOCCI.g:3444:5: ( ruleQualifiedID )
            // InternalOCCI.g:3445:6: ruleQualifiedID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRecordFieldRule());
            						}
            					

            						newCompositeNode(grammarAccess.getRecordFieldAccess().getTypeDataTypeCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_51);
            ruleQualifiedID();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOCCI.g:3460:3: (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==27) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalOCCI.g:3461:4: otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRecordFieldAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalOCCI.g:3465:4: ( (lv_default_6_0= RULE_STRING ) )
                    // InternalOCCI.g:3466:5: (lv_default_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3466:5: (lv_default_6_0= RULE_STRING )
                    // InternalOCCI.g:3467:6: lv_default_6_0= RULE_STRING
                    {
                    lv_default_6_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

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

            // InternalOCCI.g:3484:3: (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==14) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalOCCI.g:3485:4: otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getRecordFieldAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalOCCI.g:3489:4: ( (lv_description_8_0= RULE_STRING ) )
                    // InternalOCCI.g:3490:5: (lv_description_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3490:5: (lv_description_8_0= RULE_STRING )
                    // InternalOCCI.g:3491:6: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            // InternalOCCI.g:3508:3: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==35) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalOCCI.g:3509:4: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getRecordFieldAccess().getAnnotationsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,21,FOLLOW_40); 

                    				newLeafNode(otherlv_10, grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOCCI.g:3517:4: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // InternalOCCI.g:3518:5: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:3518:5: (lv_annotations_11_0= ruleAnnotation )
                    // InternalOCCI.g:3519:6: lv_annotations_11_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalOCCI.g:3536:4: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==36) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalOCCI.g:3537:5: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,36,FOLLOW_40); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRecordFieldAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOCCI.g:3541:5: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:3542:6: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:3542:6: (lv_annotations_13_0= ruleAnnotation )
                    	    // InternalOCCI.g:3543:7: lv_annotations_13_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FOLLOW_2); 

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
    // InternalOCCI.g:3570:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalOCCI.g:3570:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalOCCI.g:3571:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalOCCI.g:3577:1: ruleArrayType returns [EObject current=null] : (otherlv_0= 'array' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_documentation_5_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3583:2: ( (otherlv_0= 'array' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3584:2: (otherlv_0= 'array' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3584:2: (otherlv_0= 'array' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3585:3: otherlv_0= 'array' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getArrayKeyword_0());
            		
            // InternalOCCI.g:3589:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:3590:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:3590:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:3591:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getArrayTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleTypeID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.TypeID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:3612:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:3613:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:3613:4: ( ruleQualifiedID )
            // InternalOCCI.g:3614:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArrayTypeAccess().getTypeDataTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_72);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:3628:3: (otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==18) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalOCCI.g:3629:4: otherlv_4= ':' ( (lv_documentation_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getColonKeyword_4_0());
                    			
                    // InternalOCCI.g:3633:4: ( (lv_documentation_5_0= RULE_STRING ) )
                    // InternalOCCI.g:3634:5: (lv_documentation_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3634:5: (lv_documentation_5_0= RULE_STRING )
                    // InternalOCCI.g:3635:6: lv_documentation_5_0= RULE_STRING
                    {
                    lv_documentation_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_documentation_5_0, grammarAccess.getArrayTypeAccess().getDocumentationSTRINGTerminalRuleCall_4_1_0());
                    					

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
    // InternalOCCI.g:3656:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalOCCI.g:3656:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalOCCI.g:3657:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalOCCI.g:3663:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOCCI.g:3669:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalOCCI.g:3670:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalOCCI.g:3670:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalOCCI.g:3671:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalOCCI.g:3671:3: (kw= '-' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==73) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalOCCI.g:3672:4: kw= '-'
                    {
                    kw=(Token)match(input,73,FOLLOW_84); 

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


    // $ANTLR start "entryRuleTypeID"
    // InternalOCCI.g:3689:1: entryRuleTypeID returns [String current=null] : iv_ruleTypeID= ruleTypeID EOF ;
    public final String entryRuleTypeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeID = null;


        try {
            // InternalOCCI.g:3689:46: (iv_ruleTypeID= ruleTypeID EOF )
            // InternalOCCI.g:3690:2: iv_ruleTypeID= ruleTypeID EOF
            {
             newCompositeNode(grammarAccess.getTypeIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeID=ruleTypeID();

            state._fsp--;

             current =iv_ruleTypeID.getText(); 
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
    // $ANTLR end "entryRuleTypeID"


    // $ANTLR start "ruleTypeID"
    // InternalOCCI.g:3696:1: ruleTypeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleTypeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3702:2: ( (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalOCCI.g:3703:2: (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalOCCI.g:3703:2: (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_ID) ) {
                alt91=1;
            }
            else if ( ((LA91_0>=13 && LA91_0<=17)||(LA91_0>=19 && LA91_0<=20)||(LA91_0>=23 && LA91_0<=26)||(LA91_0>=28 && LA91_0<=35)||LA91_0==37||(LA91_0>=40 && LA91_0<=60)||(LA91_0>=62 && LA91_0<=72)||(LA91_0>=74 && LA91_0<=81)) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalOCCI.g:3704:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getTypeIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3712:3: this_KEYWORD_1= ruleKEYWORD
                    {

                    			newCompositeNode(grammarAccess.getTypeIDAccess().getKEYWORDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KEYWORD_1=ruleKEYWORD();

                    state._fsp--;


                    			current.merge(this_KEYWORD_1);
                    		

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
    // $ANTLR end "ruleTypeID"


    // $ANTLR start "entryRuleQualifiedID"
    // InternalOCCI.g:3726:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // InternalOCCI.g:3726:51: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // InternalOCCI.g:3727:2: iv_ruleQualifiedID= ruleQualifiedID EOF
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
    // InternalOCCI.g:3733:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_QUALIFIED_ID_1=null;
        AntlrDatatypeRuleToken this_KEYWORD_2 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3739:2: ( (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) )
            // InternalOCCI.g:3740:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            {
            // InternalOCCI.g:3740:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            int alt92=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt92=1;
                }
                break;
            case RULE_QUALIFIED_ID:
                {
                alt92=2;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 37:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
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
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalOCCI.g:3741:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3749:3: this_QUALIFIED_ID_1= RULE_QUALIFIED_ID
                    {
                    this_QUALIFIED_ID_1=(Token)match(input,RULE_QUALIFIED_ID,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_ID_1);
                    		

                    			newLeafNode(this_QUALIFIED_ID_1, grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3757:3: this_KEYWORD_2= ruleKEYWORD
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
    // InternalOCCI.g:3771:1: entryRuleNameID returns [String current=null] : iv_ruleNameID= ruleNameID EOF ;
    public final String entryRuleNameID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameID = null;


        try {
            // InternalOCCI.g:3771:46: (iv_ruleNameID= ruleNameID EOF )
            // InternalOCCI.g:3772:2: iv_ruleNameID= ruleNameID EOF
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
    // InternalOCCI.g:3778:1: ruleNameID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleNameID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_KEYWORD_3 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3784:2: ( ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) )
            // InternalOCCI.g:3785:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            {
            // InternalOCCI.g:3785:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ID) ) {
                alt94=1;
            }
            else if ( ((LA94_0>=13 && LA94_0<=17)||(LA94_0>=19 && LA94_0<=20)||(LA94_0>=23 && LA94_0<=26)||(LA94_0>=28 && LA94_0<=35)||LA94_0==37||(LA94_0>=40 && LA94_0<=60)||(LA94_0>=62 && LA94_0<=72)||(LA94_0>=74 && LA94_0<=81)) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalOCCI.g:3786:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    {
                    // InternalOCCI.g:3786:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    // InternalOCCI.g:3787:4: this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )*
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_85); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalOCCI.g:3794:4: (this_ID_1= RULE_ID | kw= '-' )*
                    loop93:
                    do {
                        int alt93=3;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==RULE_ID) ) {
                            alt93=1;
                        }
                        else if ( (LA93_0==73) ) {
                            alt93=2;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalOCCI.g:3795:5: this_ID_1= RULE_ID
                    	    {
                    	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_85); 

                    	    					current.merge(this_ID_1);
                    	    				

                    	    					newLeafNode(this_ID_1, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_1_0());
                    	    				

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOCCI.g:3803:5: kw= '-'
                    	    {
                    	    kw=(Token)match(input,73,FOLLOW_85); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getNameIDAccess().getHyphenMinusKeyword_0_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3811:3: this_KEYWORD_3= ruleKEYWORD
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
    // InternalOCCI.g:3825:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalOCCI.g:3825:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalOCCI.g:3826:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalOCCI.g:3832:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixin' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'state' | kw= 'initial' | kw= 'final' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'record' | kw= 'array' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOCCI.g:3838:2: ( (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixin' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'state' | kw= 'initial' | kw= 'final' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'record' | kw= 'array' ) )
            // InternalOCCI.g:3839:2: (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixin' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'state' | kw= 'initial' | kw= 'final' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'record' | kw= 'array' )
            {
            // InternalOCCI.g:3839:2: (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixin' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'state' | kw= 'initial' | kw= 'final' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'record' | kw= 'array' )
            int alt95=60;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt95=1;
                }
                break;
            case 14:
                {
                alt95=2;
                }
                break;
            case 15:
                {
                alt95=3;
                }
                break;
            case 16:
                {
                alt95=4;
                }
                break;
            case 17:
                {
                alt95=5;
                }
                break;
            case 19:
                {
                alt95=6;
                }
                break;
            case 20:
                {
                alt95=7;
                }
                break;
            case 74:
                {
                alt95=8;
                }
                break;
            case 23:
                {
                alt95=9;
                }
                break;
            case 32:
                {
                alt95=10;
                }
                break;
            case 24:
                {
                alt95=11;
                }
                break;
            case 25:
                {
                alt95=12;
                }
                break;
            case 26:
                {
                alt95=13;
                }
                break;
            case 28:
                {
                alt95=14;
                }
                break;
            case 29:
                {
                alt95=15;
                }
                break;
            case 30:
                {
                alt95=16;
                }
                break;
            case 31:
                {
                alt95=17;
                }
                break;
            case 33:
                {
                alt95=18;
                }
                break;
            case 34:
                {
                alt95=19;
                }
                break;
            case 41:
                {
                alt95=20;
                }
                break;
            case 35:
                {
                alt95=21;
                }
                break;
            case 37:
                {
                alt95=22;
                }
                break;
            case 40:
                {
                alt95=23;
                }
                break;
            case 42:
                {
                alt95=24;
                }
                break;
            case 43:
                {
                alt95=25;
                }
                break;
            case 44:
                {
                alt95=26;
                }
                break;
            case 45:
                {
                alt95=27;
                }
                break;
            case 46:
                {
                alt95=28;
                }
                break;
            case 47:
                {
                alt95=29;
                }
                break;
            case 48:
                {
                alt95=30;
                }
                break;
            case 49:
                {
                alt95=31;
                }
                break;
            case 50:
                {
                alt95=32;
                }
                break;
            case 51:
                {
                alt95=33;
                }
                break;
            case 52:
                {
                alt95=34;
                }
                break;
            case 53:
                {
                alt95=35;
                }
                break;
            case 54:
                {
                alt95=36;
                }
                break;
            case 55:
                {
                alt95=37;
                }
                break;
            case 56:
                {
                alt95=38;
                }
                break;
            case 57:
                {
                alt95=39;
                }
                break;
            case 58:
                {
                alt95=40;
                }
                break;
            case 59:
                {
                alt95=41;
                }
                break;
            case 60:
                {
                alt95=42;
                }
                break;
            case 62:
                {
                alt95=43;
                }
                break;
            case 63:
                {
                alt95=44;
                }
                break;
            case 64:
                {
                alt95=45;
                }
                break;
            case 65:
                {
                alt95=46;
                }
                break;
            case 66:
                {
                alt95=47;
                }
                break;
            case 67:
                {
                alt95=48;
                }
                break;
            case 68:
                {
                alt95=49;
                }
                break;
            case 75:
                {
                alt95=50;
                }
                break;
            case 76:
                {
                alt95=51;
                }
                break;
            case 77:
                {
                alt95=52;
                }
                break;
            case 78:
                {
                alt95=53;
                }
                break;
            case 79:
                {
                alt95=54;
                }
                break;
            case 80:
                {
                alt95=55;
                }
                break;
            case 81:
                {
                alt95=56;
                }
                break;
            case 69:
                {
                alt95=57;
                }
                break;
            case 70:
                {
                alt95=58;
                }
                break;
            case 71:
                {
                alt95=59;
                }
                break;
            case 72:
                {
                alt95=60;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalOCCI.g:3840:3: kw= 'configuration'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConfigurationKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3846:3: kw= 'description'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDescriptionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3852:3: kw= 'location'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLocationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOCCI.g:3858:3: kw= 'use'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getUseKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOCCI.g:3864:3: kw= 'resource'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResourceKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOCCI.g:3870:3: kw= 'title'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTitleKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalOCCI.g:3876:3: kw= 'summary'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSummaryKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalOCCI.g:3882:3: kw= 'parts'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPartsKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalOCCI.g:3888:3: kw= 'link'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLinkKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalOCCI.g:3894:3: kw= 'kind'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKindKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalOCCI.g:3900:3: kw= 'target'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTargetKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalOCCI.g:3906:3: kw= 'mixin'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMixinKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalOCCI.g:3912:3: kw= 'attribute'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAttributeKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalOCCI.g:3918:3: kw= 'extension'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtensionKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalOCCI.g:3924:3: kw= 'specification'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSpecificationKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalOCCI.g:3930:3: kw= 'import'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getImportKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalOCCI.g:3936:3: kw= 'as'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAsKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalOCCI.g:3942:3: kw= 'extends'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtendsKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalOCCI.g:3948:3: kw= 'source'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSourceKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalOCCI.g:3954:3: kw= 'scheme'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSchemeKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalOCCI.g:3960:3: kw= 'annotations'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAnnotationsKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalOCCI.g:3966:3: kw= 'depends'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDependsKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalOCCI.g:3972:3: kw= 'applies'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAppliesKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalOCCI.g:3978:3: kw= 'key'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKeyKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalOCCI.g:3984:3: kw= 'value'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalOCCI.g:3990:3: kw= 'mutable'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMutableKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalOCCI.g:3996:3: kw= 'required'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRequiredKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalOCCI.g:4002:3: kw= 'action'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalOCCI.g:4008:3: kw= 'constraint'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConstraintKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalOCCI.g:4014:3: kw= 'body'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBodyKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalOCCI.g:4020:3: kw= 'FSM'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFSMKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalOCCI.g:4026:3: kw= 'state'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStateKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalOCCI.g:4032:3: kw= 'initial'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getInitialKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalOCCI.g:4038:3: kw= 'final'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFinalKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalOCCI.g:4044:3: kw= 'transitions'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTransitionsKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalOCCI.g:4050:3: kw= 'to'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getToKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalOCCI.g:4056:3: kw= 'StringType'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStringTypeKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalOCCI.g:4062:3: kw= 'pattern'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPatternKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalOCCI.g:4068:3: kw= 'length'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLengthKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalOCCI.g:4074:3: kw= 'minLength'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinLengthKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalOCCI.g:4080:3: kw= 'maxLength'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalOCCI.g:4086:3: kw= 'EObjectType'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEObjectTypeKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalOCCI.g:4092:3: kw= 'BooleanType'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBooleanTypeKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalOCCI.g:4098:3: kw= 'NumericType'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNumericTypeKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalOCCI.g:4104:3: kw= 'totalDigits'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTotalDigitsKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalOCCI.g:4110:3: kw= 'minExclusive'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinExclusiveKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalOCCI.g:4116:3: kw= 'maxExclusive'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxExclusiveKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalOCCI.g:4122:3: kw= 'minInclusive'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinInclusiveKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalOCCI.g:4128:3: kw= 'maxInclusive'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxInclusiveKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalOCCI.g:4134:3: kw= 'Byte'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getByteKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalOCCI.g:4140:3: kw= 'Double'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDoubleKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalOCCI.g:4146:3: kw= 'Float'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFloatKeyword_51());
                    		

                    }
                    break;
                case 53 :
                    // InternalOCCI.g:4152:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIntegerKeyword_52());
                    		

                    }
                    break;
                case 54 :
                    // InternalOCCI.g:4158:3: kw= 'Long'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLongKeyword_53());
                    		

                    }
                    break;
                case 55 :
                    // InternalOCCI.g:4164:3: kw= 'Short'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getShortKeyword_54());
                    		

                    }
                    break;
                case 56 :
                    // InternalOCCI.g:4170:3: kw= 'BigDecimal'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBigDecimalKeyword_55());
                    		

                    }
                    break;
                case 57 :
                    // InternalOCCI.g:4176:3: kw= 'EnumerationType'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnumerationTypeKeyword_56());
                    		

                    }
                    break;
                case 58 :
                    // InternalOCCI.g:4182:3: kw= 'literals'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLiteralsKeyword_57());
                    		

                    }
                    break;
                case 59 :
                    // InternalOCCI.g:4188:3: kw= 'record'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRecordKeyword_58());
                    		

                    }
                    break;
                case 60 :
                    // InternalOCCI.g:4194:3: kw= 'array'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getArrayKeyword_59());
                    		

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
    // InternalOCCI.g:4203:1: ruleNumericTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) ;
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
            // InternalOCCI.g:4209:2: ( ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) )
            // InternalOCCI.g:4210:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            {
            // InternalOCCI.g:4210:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            int alt96=7;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt96=1;
                }
                break;
            case 76:
                {
                alt96=2;
                }
                break;
            case 77:
                {
                alt96=3;
                }
                break;
            case 78:
                {
                alt96=4;
                }
                break;
            case 79:
                {
                alt96=5;
                }
                break;
            case 80:
                {
                alt96=6;
                }
                break;
            case 81:
                {
                alt96=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalOCCI.g:4211:3: (enumLiteral_0= 'Byte' )
                    {
                    // InternalOCCI.g:4211:3: (enumLiteral_0= 'Byte' )
                    // InternalOCCI.g:4212:4: enumLiteral_0= 'Byte'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:4219:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalOCCI.g:4219:3: (enumLiteral_1= 'Double' )
                    // InternalOCCI.g:4220:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:4227:3: (enumLiteral_2= 'Float' )
                    {
                    // InternalOCCI.g:4227:3: (enumLiteral_2= 'Float' )
                    // InternalOCCI.g:4228:4: enumLiteral_2= 'Float'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOCCI.g:4235:3: (enumLiteral_3= 'Integer' )
                    {
                    // InternalOCCI.g:4235:3: (enumLiteral_3= 'Integer' )
                    // InternalOCCI.g:4236:4: enumLiteral_3= 'Integer'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOCCI.g:4243:3: (enumLiteral_4= 'Long' )
                    {
                    // InternalOCCI.g:4243:3: (enumLiteral_4= 'Long' )
                    // InternalOCCI.g:4244:4: enumLiteral_4= 'Long'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOCCI.g:4251:3: (enumLiteral_5= 'Short' )
                    {
                    // InternalOCCI.g:4251:3: (enumLiteral_5= 'Short' )
                    // InternalOCCI.g:4252:4: enumLiteral_5= 'Short'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOCCI.g:4259:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalOCCI.g:4259:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalOCCI.g:4260:4: enumLiteral_6= 'BigDecimal'
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


    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String dfa_1s = "\105\uffff";
    static final String dfa_2s = "\1\uffff\1\2\2\uffff\5\3\74\uffff";
    static final String dfa_3s = "\2\5\2\uffff\1\4\1\5\1\16\2\5\1\4\1\5\1\16\2\5\1\4\1\5\1\23\2\5\1\4\1\5\1\16\2\5\1\4\1\5\1\16\2\5\1\4\1\23\3\5\1\4\1\5\1\16\2\5\1\4\1\16\1\4\1\23\1\4\1\16\7\4\1\16\1\4\1\23\1\4\1\16\1\4\1\16\1\4\1\23\1\4\1\16\6\4";
    static final String dfa_4s = "\2\121\2\uffff\1\57\1\121\1\57\2\121\1\57\1\121\1\57\2\121\1\57\1\121\1\57\2\121\1\60\1\121\1\60\2\121\1\57\1\121\1\57\2\121\2\57\3\121\1\60\1\121\1\60\2\121\4\57\2\60\4\57\2\60\4\57\2\60\4\57\2\60\4\57\2\60";
    static final String dfa_5s = "\2\uffff\1\2\1\1\101\uffff";
    static final String dfa_6s = "\105\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\2\5\uffff\5\2\1\uffff\2\2\2\uffff\4\2\1\uffff\10\2\1\uffff\1\2\2\uffff\4\2\1\1\20\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\1\uffff\1\3\5\uffff\1\3\1\4\3\3\1\2\2\3\1\uffff\1\2\3\3\1\5\1\2\7\3\1\6\1\uffff\1\3\2\uffff\6\3\1\7\1\10\15\3\1\uffff\13\3\1\uffff\10\3",
            "",
            "",
            "\1\2\11\uffff\1\3\3\uffff\1\3\3\uffff\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\1\uffff\1\2\5\uffff\1\2\1\11\3\2\1\3\2\2\1\uffff\1\3\3\2\1\12\1\3\7\2\1\13\1\uffff\1\2\2\uffff\6\2\1\14\1\15\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\3\uffff\1\3\2\uffff\1\2\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\7\uffff\1\2\1\16\3\2\1\3\2\2\1\uffff\1\3\3\2\1\17\1\3\7\2\1\20\1\uffff\1\2\2\uffff\6\2\1\21\1\22\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\7\uffff\1\2\1\23\3\2\1\3\2\2\1\uffff\1\3\3\2\1\24\1\3\7\2\1\25\1\uffff\1\2\2\uffff\6\2\1\26\1\27\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\11\uffff\1\2\3\uffff\1\2\3\uffff\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\1\uffff\1\3\5\uffff\1\3\1\30\3\3\1\2\2\3\1\uffff\1\2\3\3\1\31\1\2\7\3\1\32\1\uffff\1\3\2\uffff\6\3\1\33\1\34\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\3\uffff\1\2\2\uffff\1\3\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\7\uffff\1\3\1\35\3\3\1\2\2\3\1\uffff\1\2\3\3\1\37\1\2\7\3\1\36\1\uffff\1\3\2\uffff\6\3\1\40\1\41\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\7\uffff\1\3\1\42\3\3\1\2\2\3\1\uffff\1\2\3\3\1\43\1\2\7\3\1\44\1\uffff\1\3\2\uffff\6\3\1\45\1\46\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\16\uffff\1\2\2\uffff\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\1\uffff\1\3\5\uffff\5\3\1\uffff\1\47\1\3\1\uffff\1\2\3\3\1\31\1\uffff\7\3\1\50\1\uffff\1\3\1\2\1\uffff\6\3\1\33\1\34\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\1\uffff\1\3\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\7\uffff\5\3\1\uffff\1\51\1\3\1\uffff\1\2\3\3\1\37\1\uffff\7\3\1\52\1\uffff\1\3\1\2\1\uffff\6\3\1\40\1\41\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\7\uffff\5\3\1\uffff\1\53\1\3\1\uffff\1\2\3\3\1\43\1\uffff\7\3\1\54\1\uffff\1\3\1\2\1\uffff\6\3\1\45\1\46\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\11\uffff\1\2\41\uffff\1\2",
            "\1\3\1\uffff\1\3\5\uffff\1\3\1\55\3\3\1\uffff\2\3\2\uffff\4\3\1\uffff\10\3\1\uffff\1\3\2\uffff\10\3\1\56\14\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\6\uffff\1\3\32\uffff\1\2",
            "\1\3\7\uffff\1\3\1\57\3\3\1\uffff\2\3\2\uffff\4\3\1\uffff\10\3\1\uffff\1\3\2\uffff\10\3\1\60\14\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\7\uffff\1\3\1\61\3\3\1\uffff\2\3\2\uffff\4\3\1\uffff\10\3\1\uffff\1\3\2\uffff\10\3\1\62\14\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\11\uffff\1\3\3\uffff\1\3\3\uffff\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\1\uffff\1\2\5\uffff\1\2\1\63\3\2\1\3\2\2\1\uffff\1\3\3\2\1\12\1\3\7\2\1\64\1\uffff\1\2\2\uffff\6\2\1\14\1\15\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\3\uffff\1\3\2\uffff\1\2\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\7\uffff\1\2\1\65\3\2\1\3\2\2\1\uffff\1\3\3\2\1\17\1\3\7\2\1\66\1\uffff\1\2\2\uffff\6\2\1\21\1\22\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\7\uffff\1\2\1\67\3\2\1\3\2\2\1\uffff\1\3\3\2\1\24\1\3\7\2\1\70\1\uffff\1\2\2\uffff\6\2\1\26\1\27\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\16\uffff\1\3\2\uffff\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\3\1\uffff\1\2\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\2\1\uffff\1\2\5\uffff\5\2\1\uffff\1\71\1\2\1\uffff\1\3\3\2\1\12\1\uffff\7\2\1\72\1\uffff\1\2\1\3\1\uffff\6\2\1\14\1\15\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\7\uffff\5\2\1\uffff\1\73\1\2\1\uffff\1\3\3\2\1\17\1\uffff\7\2\1\74\1\uffff\1\2\1\3\1\uffff\6\2\1\21\1\22\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\7\uffff\5\2\1\uffff\1\75\1\2\1\uffff\1\3\3\2\1\24\1\uffff\7\2\1\76\1\uffff\1\2\1\3\1\uffff\6\2\1\26\1\27\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\11\uffff\1\3\41\uffff\1\3",
            "\1\2\1\uffff\1\2\5\uffff\1\2\1\77\3\2\1\uffff\2\2\2\uffff\4\2\1\uffff\10\2\1\uffff\1\2\2\uffff\10\2\1\100\14\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\6\uffff\1\2\32\uffff\1\3",
            "\1\2\7\uffff\1\2\1\101\3\2\1\uffff\2\2\2\uffff\4\2\1\uffff\10\2\1\uffff\1\2\2\uffff\10\2\1\102\14\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\7\uffff\1\2\1\103\3\2\1\uffff\2\2\2\uffff\4\2\1\uffff\10\2\1\uffff\1\2\2\uffff\10\2\1\104\14\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\11\uffff\1\3\3\uffff\1\3\3\uffff\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\3\3\uffff\1\3\2\uffff\1\2\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\16\uffff\1\3\2\uffff\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\3\1\uffff\1\2\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\2\11\uffff\1\3\41\uffff\1\3",
            "\1\3\6\uffff\1\2\32\uffff\1\3",
            "\1\2\11\uffff\1\3\3\uffff\1\3\3\uffff\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\11\uffff\1\3\3\uffff\1\3\3\uffff\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\16\uffff\1\3\2\uffff\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\2\16\uffff\1\3\2\uffff\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\2\11\uffff\1\3\41\uffff\1\3",
            "\1\2\11\uffff\1\3\41\uffff\1\3",
            "\1\3\11\uffff\1\2\3\uffff\1\2\3\uffff\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\2\3\uffff\1\2\2\uffff\1\3\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\16\uffff\1\2\2\uffff\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\2\1\uffff\1\3\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\11\uffff\1\2\41\uffff\1\2",
            "\1\2\6\uffff\1\3\32\uffff\1\2",
            "\1\3\11\uffff\1\2\3\uffff\1\2\3\uffff\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\2\3\uffff\1\2\2\uffff\1\3\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\16\uffff\1\2\2\uffff\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\2\1\uffff\1\3\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\11\uffff\1\2\41\uffff\1\2",
            "\1\2\6\uffff\1\3\32\uffff\1\2",
            "\1\3\11\uffff\1\2\3\uffff\1\2\3\uffff\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\11\uffff\1\2\3\uffff\1\2\3\uffff\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\16\uffff\1\2\2\uffff\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\16\uffff\1\2\2\uffff\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\11\uffff\1\2\41\uffff\1\2",
            "\1\3\11\uffff\1\2\41\uffff\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1652:3: ( (lv_mutable_1_0= 'mutable' ) )?";
        }
    }
    static final String[] dfa_8s = {
            "\1\2\1\uffff\1\2\5\uffff\5\2\1\uffff\2\2\2\uffff\4\2\1\uffff\10\2\1\uffff\1\2\2\uffff\5\2\1\1\17\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\1\uffff\1\3\5\uffff\1\3\1\4\3\3\1\2\2\3\1\uffff\1\2\3\3\1\5\1\2\7\3\1\6\1\uffff\1\3\2\uffff\6\3\1\7\1\10\15\3\1\uffff\13\3\1\uffff\10\3",
            "",
            "",
            "\1\2\11\uffff\1\3\3\uffff\1\3\3\uffff\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\1\uffff\1\2\5\uffff\1\2\1\11\3\2\1\3\2\2\1\uffff\1\3\3\2\1\12\1\3\7\2\1\13\1\uffff\1\2\2\uffff\6\2\1\14\1\15\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\3\uffff\1\3\2\uffff\1\2\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\7\uffff\1\2\1\16\3\2\1\3\2\2\1\uffff\1\3\3\2\1\17\1\3\7\2\1\20\1\uffff\1\2\2\uffff\6\2\1\21\1\22\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\7\uffff\1\2\1\23\3\2\1\3\2\2\1\uffff\1\3\3\2\1\24\1\3\7\2\1\25\1\uffff\1\2\2\uffff\6\2\1\26\1\27\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\11\uffff\1\2\3\uffff\1\2\3\uffff\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\1\uffff\1\3\5\uffff\1\3\1\30\3\3\1\2\2\3\1\uffff\1\2\3\3\1\31\1\2\7\3\1\32\1\uffff\1\3\2\uffff\6\3\1\33\1\34\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\3\uffff\1\2\2\uffff\1\3\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\7\uffff\1\3\1\35\3\3\1\2\2\3\1\uffff\1\2\3\3\1\37\1\2\7\3\1\36\1\uffff\1\3\2\uffff\6\3\1\40\1\41\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\7\uffff\1\3\1\42\3\3\1\2\2\3\1\uffff\1\2\3\3\1\43\1\2\7\3\1\44\1\uffff\1\3\2\uffff\6\3\1\45\1\46\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\16\uffff\1\2\2\uffff\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\1\uffff\1\3\5\uffff\5\3\1\uffff\1\47\1\3\1\uffff\1\2\3\3\1\31\1\uffff\7\3\1\50\1\uffff\1\3\1\2\1\uffff\6\3\1\33\1\34\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\1\uffff\1\3\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\7\uffff\5\3\1\uffff\1\51\1\3\1\uffff\1\2\3\3\1\37\1\uffff\7\3\1\52\1\uffff\1\3\1\2\1\uffff\6\3\1\40\1\41\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\7\uffff\5\3\1\uffff\1\53\1\3\1\uffff\1\2\3\3\1\43\1\uffff\7\3\1\54\1\uffff\1\3\1\2\1\uffff\6\3\1\45\1\46\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\11\uffff\1\2\41\uffff\1\2",
            "\1\3\1\uffff\1\3\5\uffff\1\3\1\55\3\3\1\uffff\2\3\2\uffff\4\3\1\uffff\10\3\1\uffff\1\3\2\uffff\10\3\1\56\14\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\6\uffff\1\3\32\uffff\1\2",
            "\1\3\7\uffff\1\3\1\57\3\3\1\uffff\2\3\2\uffff\4\3\1\uffff\10\3\1\uffff\1\3\2\uffff\10\3\1\60\14\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\7\uffff\1\3\1\61\3\3\1\uffff\2\3\2\uffff\4\3\1\uffff\10\3\1\uffff\1\3\2\uffff\10\3\1\62\14\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\11\uffff\1\3\3\uffff\1\3\3\uffff\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\1\uffff\1\2\5\uffff\1\2\1\63\3\2\1\3\2\2\1\uffff\1\3\3\2\1\12\1\3\7\2\1\64\1\uffff\1\2\2\uffff\6\2\1\14\1\15\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\3\uffff\1\3\2\uffff\1\2\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\7\uffff\1\2\1\65\3\2\1\3\2\2\1\uffff\1\3\3\2\1\17\1\3\7\2\1\66\1\uffff\1\2\2\uffff\6\2\1\21\1\22\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\7\uffff\1\2\1\67\3\2\1\3\2\2\1\uffff\1\3\3\2\1\24\1\3\7\2\1\70\1\uffff\1\2\2\uffff\6\2\1\26\1\27\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\16\uffff\1\3\2\uffff\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\3\1\uffff\1\2\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\2\1\uffff\1\2\5\uffff\5\2\1\uffff\1\71\1\2\1\uffff\1\3\3\2\1\12\1\uffff\7\2\1\72\1\uffff\1\2\1\3\1\uffff\6\2\1\14\1\15\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\7\uffff\5\2\1\uffff\1\73\1\2\1\uffff\1\3\3\2\1\17\1\uffff\7\2\1\74\1\uffff\1\2\1\3\1\uffff\6\2\1\21\1\22\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\7\uffff\5\2\1\uffff\1\75\1\2\1\uffff\1\3\3\2\1\24\1\uffff\7\2\1\76\1\uffff\1\2\1\3\1\uffff\6\2\1\26\1\27\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\11\uffff\1\3\41\uffff\1\3",
            "\1\2\1\uffff\1\2\5\uffff\1\2\1\77\3\2\1\uffff\2\2\2\uffff\4\2\1\uffff\10\2\1\uffff\1\2\2\uffff\10\2\1\100\14\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\6\uffff\1\2\32\uffff\1\3",
            "\1\2\7\uffff\1\2\1\101\3\2\1\uffff\2\2\2\uffff\4\2\1\uffff\10\2\1\uffff\1\2\2\uffff\10\2\1\102\14\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\7\uffff\1\2\1\103\3\2\1\uffff\2\2\2\uffff\4\2\1\uffff\10\2\1\uffff\1\2\2\uffff\10\2\1\104\14\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\11\uffff\1\3\3\uffff\1\3\3\uffff\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\3\3\uffff\1\3\2\uffff\1\2\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\16\uffff\1\3\2\uffff\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\3\1\uffff\1\2\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\2\11\uffff\1\3\41\uffff\1\3",
            "\1\3\6\uffff\1\2\32\uffff\1\3",
            "\1\2\11\uffff\1\3\3\uffff\1\3\3\uffff\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\11\uffff\1\3\3\uffff\1\3\3\uffff\1\3\3\uffff\2\3\7\uffff\1\3\12\uffff\2\3",
            "\1\2\16\uffff\1\3\2\uffff\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\2\16\uffff\1\3\2\uffff\1\3\3\uffff\1\3\10\uffff\1\3\2\uffff\1\3\7\uffff\2\3",
            "\1\2\11\uffff\1\3\41\uffff\1\3",
            "\1\2\11\uffff\1\3\41\uffff\1\3",
            "\1\3\11\uffff\1\2\3\uffff\1\2\3\uffff\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\2\3\uffff\1\2\2\uffff\1\3\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\16\uffff\1\2\2\uffff\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\2\1\uffff\1\3\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\11\uffff\1\2\41\uffff\1\2",
            "\1\2\6\uffff\1\3\32\uffff\1\2",
            "\1\3\11\uffff\1\2\3\uffff\1\2\3\uffff\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\2\3\uffff\1\2\2\uffff\1\3\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\16\uffff\1\2\2\uffff\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\2\1\uffff\1\3\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\11\uffff\1\2\41\uffff\1\2",
            "\1\2\6\uffff\1\3\32\uffff\1\2",
            "\1\3\11\uffff\1\2\3\uffff\1\2\3\uffff\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\11\uffff\1\2\3\uffff\1\2\3\uffff\1\2\3\uffff\2\2\7\uffff\1\2\12\uffff\2\2",
            "\1\3\16\uffff\1\2\2\uffff\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\16\uffff\1\2\2\uffff\1\2\3\uffff\1\2\10\uffff\1\2\2\uffff\1\2\7\uffff\2\2",
            "\1\3\11\uffff\1\2\41\uffff\1\2",
            "\1\3\11\uffff\1\2\41\uffff\1\2"
    };
    static final short[][] dfa_8 = unpackEncodedStringArray(dfa_8s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "1666:3: ( (lv_required_2_0= 'required' ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000203C002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002038002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002030002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xDFFFFF2FF79BE0A0L,0x000000000003FDFFL});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000388000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001088000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xD080000162004002L,0x00000000000001A0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xD080000162000002L,0x00000000000001A0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xD080000142000002L,0x00000000000001A0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xD0800001C2000002L,0x00000000000001A0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xD080000102000002L,0x00000000000001A0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000E01280002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000C01280002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000801280002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000800280002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000800200002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000C00004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000C00004400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000800000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000032000080000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000030000080000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000808044002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000808004002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000800004002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000004800080002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000800080002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0F00000000040002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0E00000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x2000000000040002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x000000000003F800L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000040002L,0x000000000000001FL});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001EL});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});

}