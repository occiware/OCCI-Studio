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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_QUALIFIED_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'configuration'", "'description'", "'location'", "'use'", "'resource'", "':'", "'('", "'title'", "')'", "'summary'", "'{'", "'}'", "'link'", "'target'", "'mixin'", "'attribute'", "'='", "'extension'", "'specification'", "'import'", "'as'", "'kind'", "'extends'", "'source'", "'scheme'", "'annotations'", "','", "'depends'", "'applies'", "'key'", "'value'", "'mutable'", "'required'", "'action'", "'constraint'", "'body'", "'FSM'", "'state'", "'initial'", "'final'", "'transitions'", "'to'", "'StringType'", "'pattern'", "'length'", "'minLength'", "'maxLength'", "'documentation'", "'EObjectType'", "'type'", "'BooleanType'", "'NumericType'", "'totalDigits'", "'minExclusive'", "'maxExclusive'", "'minInclusive'", "'maxInclusive'", "'EnumerationType'", "'literals'", "'record'", "'array'", "'-'", "'parts'", "'Byte'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'BigDecimal'"
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

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
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

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getConfigurationKeyword_1());
            		
            // InternalOCCI.g:127:3: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOCCI.g:128:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

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

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOCCI.g:152:4: otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_4); 

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

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOCCI.g:176:4: otherlv_6= 'use' ( (otherlv_7= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_4); 

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

                if ( (LA5_0==16) ) {
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

                if ( (LA6_0==26) ) {
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
    // InternalOCCI.g:243:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )? (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )? (otherlv_10= 'summary' ( (lv_summary_11_0= RULE_STRING ) ) )? (otherlv_12= '{' ( (lv_parts_13_0= ruleMixinBase ) )* ( (lv_attributes_14_0= ruleAttributeState ) )* ( (lv_links_15_0= ruleLink ) )* otherlv_16= '}' ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_title_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_location_9_0=null;
        Token otherlv_10=null;
        Token lv_summary_11_0=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject lv_parts_13_0 = null;

        EObject lv_attributes_14_0 = null;

        EObject lv_links_15_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:249:2: ( (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )? (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )? (otherlv_10= 'summary' ( (lv_summary_11_0= RULE_STRING ) ) )? (otherlv_12= '{' ( (lv_parts_13_0= ruleMixinBase ) )* ( (lv_attributes_14_0= ruleAttributeState ) )* ( (lv_links_15_0= ruleLink ) )* otherlv_16= '}' ) ) )
            // InternalOCCI.g:250:2: (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )? (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )? (otherlv_10= 'summary' ( (lv_summary_11_0= RULE_STRING ) ) )? (otherlv_12= '{' ( (lv_parts_13_0= ruleMixinBase ) )* ( (lv_attributes_14_0= ruleAttributeState ) )* ( (lv_links_15_0= ruleLink ) )* otherlv_16= '}' ) )
            {
            // InternalOCCI.g:250:2: (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )? (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )? (otherlv_10= 'summary' ( (lv_summary_11_0= RULE_STRING ) ) )? (otherlv_12= '{' ( (lv_parts_13_0= ruleMixinBase ) )* ( (lv_attributes_14_0= ruleAttributeState ) )* ( (lv_links_15_0= ruleLink ) )* otherlv_16= '}' ) )
            // InternalOCCI.g:251:3: otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )? (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )? (otherlv_10= 'summary' ( (lv_summary_11_0= RULE_STRING ) ) )? (otherlv_12= '{' ( (lv_parts_13_0= ruleMixinBase ) )* ( (lv_attributes_14_0= ruleAttributeState ) )* ( (lv_links_15_0= ruleLink ) )* otherlv_16= '}' )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

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

            // InternalOCCI.g:293:3: (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOCCI.g:294:4: otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getTitleKeyword_4_1());
                    			
                    // InternalOCCI.g:302:4: ( (lv_title_6_0= RULE_STRING ) )
                    // InternalOCCI.g:303:5: (lv_title_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:303:5: (lv_title_6_0= RULE_STRING )
                    // InternalOCCI.g:304:6: lv_title_6_0= RULE_STRING
                    {
                    lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_title_6_0, grammarAccess.getResourceAccess().getTitleSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getResourceAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:325:3: (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOCCI.g:326:4: otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getLocationKeyword_5_0());
                    			
                    // InternalOCCI.g:330:4: ( (lv_location_9_0= RULE_STRING ) )
                    // InternalOCCI.g:331:5: (lv_location_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:331:5: (lv_location_9_0= RULE_STRING )
                    // InternalOCCI.g:332:6: lv_location_9_0= RULE_STRING
                    {
                    lv_location_9_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_location_9_0, grammarAccess.getResourceAccess().getLocationSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:349:3: (otherlv_10= 'summary' ( (lv_summary_11_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOCCI.g:350:4: otherlv_10= 'summary' ( (lv_summary_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getResourceAccess().getSummaryKeyword_6_0());
                    			
                    // InternalOCCI.g:354:4: ( (lv_summary_11_0= RULE_STRING ) )
                    // InternalOCCI.g:355:5: (lv_summary_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:355:5: (lv_summary_11_0= RULE_STRING )
                    // InternalOCCI.g:356:6: lv_summary_11_0= RULE_STRING
                    {
                    lv_summary_11_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_summary_11_0, grammarAccess.getResourceAccess().getSummarySTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"summary",
                    							lv_summary_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:373:3: (otherlv_12= '{' ( (lv_parts_13_0= ruleMixinBase ) )* ( (lv_attributes_14_0= ruleAttributeState ) )* ( (lv_links_15_0= ruleLink ) )* otherlv_16= '}' )
            // InternalOCCI.g:374:4: otherlv_12= '{' ( (lv_parts_13_0= ruleMixinBase ) )* ( (lv_attributes_14_0= ruleAttributeState ) )* ( (lv_links_15_0= ruleLink ) )* otherlv_16= '}'
            {
            otherlv_12=(Token)match(input,22,FOLLOW_17); 

            				newLeafNode(otherlv_12, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7_0());
            			
            // InternalOCCI.g:378:4: ( (lv_parts_13_0= ruleMixinBase ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOCCI.g:379:5: (lv_parts_13_0= ruleMixinBase )
            	    {
            	    // InternalOCCI.g:379:5: (lv_parts_13_0= ruleMixinBase )
            	    // InternalOCCI.g:380:6: lv_parts_13_0= ruleMixinBase
            	    {

            	    						newCompositeNode(grammarAccess.getResourceAccess().getPartsMixinBaseParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_parts_13_0=ruleMixinBase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getResourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parts",
            	    							lv_parts_13_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.MixinBase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalOCCI.g:397:4: ( (lv_attributes_14_0= ruleAttributeState ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOCCI.g:398:5: (lv_attributes_14_0= ruleAttributeState )
            	    {
            	    // InternalOCCI.g:398:5: (lv_attributes_14_0= ruleAttributeState )
            	    // InternalOCCI.g:399:6: lv_attributes_14_0= ruleAttributeState
            	    {

            	    						newCompositeNode(grammarAccess.getResourceAccess().getAttributesAttributeStateParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_attributes_14_0=ruleAttributeState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getResourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_14_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalOCCI.g:416:4: ( (lv_links_15_0= ruleLink ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOCCI.g:417:5: (lv_links_15_0= ruleLink )
            	    {
            	    // InternalOCCI.g:417:5: (lv_links_15_0= ruleLink )
            	    // InternalOCCI.g:418:6: lv_links_15_0= ruleLink
            	    {

            	    						newCompositeNode(grammarAccess.getResourceAccess().getLinksLinkParserRuleCall_7_3_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_links_15_0=ruleLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getResourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"links",
            	    							lv_links_15_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.Link");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_16=(Token)match(input,23,FOLLOW_2); 

            				newLeafNode(otherlv_16, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_7_4());
            			

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
    // InternalOCCI.g:444:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalOCCI.g:444:45: (iv_ruleLink= ruleLink EOF )
            // InternalOCCI.g:445:2: iv_ruleLink= ruleLink EOF
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
    // InternalOCCI.g:451:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )? (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )? otherlv_10= 'target' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= '{' ( (lv_attributes_13_0= ruleAttributeState ) )* ( (lv_parts_14_0= ruleMixinBase ) )* otherlv_15= '}' ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_title_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_location_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        EObject lv_attributes_13_0 = null;

        EObject lv_parts_14_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:457:2: ( (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )? (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )? otherlv_10= 'target' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= '{' ( (lv_attributes_13_0= ruleAttributeState ) )* ( (lv_parts_14_0= ruleMixinBase ) )* otherlv_15= '}' ) ) )
            // InternalOCCI.g:458:2: (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )? (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )? otherlv_10= 'target' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= '{' ( (lv_attributes_13_0= ruleAttributeState ) )* ( (lv_parts_14_0= ruleMixinBase ) )* otherlv_15= '}' ) )
            {
            // InternalOCCI.g:458:2: (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )? (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )? otherlv_10= 'target' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= '{' ( (lv_attributes_13_0= ruleAttributeState ) )* ( (lv_parts_14_0= ruleMixinBase ) )* otherlv_15= '}' ) )
            // InternalOCCI.g:459:3: otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )? (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )? otherlv_10= 'target' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= '{' ( (lv_attributes_13_0= ruleAttributeState ) )* ( (lv_parts_14_0= ruleMixinBase ) )* otherlv_15= '}' )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalOCCI.g:463:3: ( (lv_id_1_0= RULE_STRING ) )
            // InternalOCCI.g:464:4: (lv_id_1_0= RULE_STRING )
            {
            // InternalOCCI.g:464:4: (lv_id_1_0= RULE_STRING )
            // InternalOCCI.g:465:5: lv_id_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:485:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:486:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:486:4: ( ruleQualifiedID )
            // InternalOCCI.g:487:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getKindKindCrossReference_3_0());
            				
            pushFollow(FOLLOW_20);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:501:3: (otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOCCI.g:502:4: otherlv_4= '(' otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getTitleKeyword_4_1());
                    			
                    // InternalOCCI.g:510:4: ( (lv_title_6_0= RULE_STRING ) )
                    // InternalOCCI.g:511:5: (lv_title_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:511:5: (lv_title_6_0= RULE_STRING )
                    // InternalOCCI.g:512:6: lv_title_6_0= RULE_STRING
                    {
                    lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_title_6_0, grammarAccess.getLinkAccess().getTitleSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getLinkAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:533:3: (otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOCCI.g:534:4: otherlv_8= 'location' ( (lv_location_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getLocationKeyword_5_0());
                    			
                    // InternalOCCI.g:538:4: ( (lv_location_9_0= RULE_STRING ) )
                    // InternalOCCI.g:539:5: (lv_location_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:539:5: (lv_location_9_0= RULE_STRING )
                    // InternalOCCI.g:540:6: lv_location_9_0= RULE_STRING
                    {
                    lv_location_9_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_location_9_0, grammarAccess.getLinkAccess().getLocationSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getTargetKeyword_6());
            		
            // InternalOCCI.g:561:3: ( (otherlv_11= RULE_STRING ) )
            // InternalOCCI.g:562:4: (otherlv_11= RULE_STRING )
            {
            // InternalOCCI.g:562:4: (otherlv_11= RULE_STRING )
            // InternalOCCI.g:563:5: otherlv_11= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getTargetResourceCrossReference_7_0());
            				

            }


            }

            // InternalOCCI.g:574:3: (otherlv_12= '{' ( (lv_attributes_13_0= ruleAttributeState ) )* ( (lv_parts_14_0= ruleMixinBase ) )* otherlv_15= '}' )
            // InternalOCCI.g:575:4: otherlv_12= '{' ( (lv_attributes_13_0= ruleAttributeState ) )* ( (lv_parts_14_0= ruleMixinBase ) )* otherlv_15= '}'
            {
            otherlv_12=(Token)match(input,22,FOLLOW_23); 

            				newLeafNode(otherlv_12, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_8_0());
            			
            // InternalOCCI.g:579:4: ( (lv_attributes_13_0= ruleAttributeState ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalOCCI.g:580:5: (lv_attributes_13_0= ruleAttributeState )
            	    {
            	    // InternalOCCI.g:580:5: (lv_attributes_13_0= ruleAttributeState )
            	    // InternalOCCI.g:581:6: lv_attributes_13_0= ruleAttributeState
            	    {

            	    						newCompositeNode(grammarAccess.getLinkAccess().getAttributesAttributeStateParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_attributes_13_0=ruleAttributeState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLinkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_13_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalOCCI.g:598:4: ( (lv_parts_14_0= ruleMixinBase ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOCCI.g:599:5: (lv_parts_14_0= ruleMixinBase )
            	    {
            	    // InternalOCCI.g:599:5: (lv_parts_14_0= ruleMixinBase )
            	    // InternalOCCI.g:600:6: lv_parts_14_0= ruleMixinBase
            	    {

            	    						newCompositeNode(grammarAccess.getLinkAccess().getPartsMixinBaseParserRuleCall_8_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_parts_14_0=ruleMixinBase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLinkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parts",
            	    							lv_parts_14_0,
            	    							"org.eclipse.cmf.occi.core.xtext.OCCI.MixinBase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_15=(Token)match(input,23,FOLLOW_2); 

            				newLeafNode(otherlv_15, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8_3());
            			

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
    // InternalOCCI.g:626:1: entryRuleMixinBase returns [EObject current=null] : iv_ruleMixinBase= ruleMixinBase EOF ;
    public final EObject entryRuleMixinBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixinBase = null;


        try {
            // InternalOCCI.g:626:50: (iv_ruleMixinBase= ruleMixinBase EOF )
            // InternalOCCI.g:627:2: iv_ruleMixinBase= ruleMixinBase EOF
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
    // InternalOCCI.g:633:1: ruleMixinBase returns [EObject current=null] : (otherlv_0= 'mixin' ( ( ruleQualifiedID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeState ) )* otherlv_4= '}' ) ;
    public final EObject ruleMixinBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:639:2: ( (otherlv_0= 'mixin' ( ( ruleQualifiedID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeState ) )* otherlv_4= '}' ) )
            // InternalOCCI.g:640:2: (otherlv_0= 'mixin' ( ( ruleQualifiedID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeState ) )* otherlv_4= '}' )
            {
            // InternalOCCI.g:640:2: (otherlv_0= 'mixin' ( ( ruleQualifiedID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeState ) )* otherlv_4= '}' )
            // InternalOCCI.g:641:3: otherlv_0= 'mixin' ( ( ruleQualifiedID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttributeState ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMixinBaseAccess().getMixinKeyword_0());
            		
            // InternalOCCI.g:645:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:646:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:646:4: ( ruleQualifiedID )
            // InternalOCCI.g:647:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixinBaseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMixinBaseAccess().getMixinMixinCrossReference_1_0());
            				
            pushFollow(FOLLOW_16);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getMixinBaseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOCCI.g:665:3: ( (lv_attributes_3_0= ruleAttributeState ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOCCI.g:666:4: (lv_attributes_3_0= ruleAttributeState )
            	    {
            	    // InternalOCCI.g:666:4: (lv_attributes_3_0= ruleAttributeState )
            	    // InternalOCCI.g:667:5: lv_attributes_3_0= ruleAttributeState
            	    {

            	    					newCompositeNode(grammarAccess.getMixinBaseAccess().getAttributesAttributeStateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
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

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

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
    // InternalOCCI.g:692:1: entryRuleAttributeState returns [EObject current=null] : iv_ruleAttributeState= ruleAttributeState EOF ;
    public final EObject entryRuleAttributeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeState = null;


        try {
            // InternalOCCI.g:692:55: (iv_ruleAttributeState= ruleAttributeState EOF )
            // InternalOCCI.g:693:2: iv_ruleAttributeState= ruleAttributeState EOF
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
    // InternalOCCI.g:699:1: ruleAttributeState returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttributeState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:705:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalOCCI.g:706:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalOCCI.g:706:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalOCCI.g:707:3: otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeStateAccess().getAttributeKeyword_0());
            		
            // InternalOCCI.g:711:3: ( (lv_name_1_0= ruleQualifiedID ) )
            // InternalOCCI.g:712:4: (lv_name_1_0= ruleQualifiedID )
            {
            // InternalOCCI.g:712:4: (lv_name_1_0= ruleQualifiedID )
            // InternalOCCI.g:713:5: lv_name_1_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getAttributeStateAccess().getNameQualifiedIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_2=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeStateAccess().getEqualsSignKeyword_2());
            		
            // InternalOCCI.g:734:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalOCCI.g:735:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalOCCI.g:735:4: (lv_value_3_0= RULE_STRING )
            // InternalOCCI.g:736:5: lv_value_3_0= RULE_STRING
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
    // InternalOCCI.g:756:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // InternalOCCI.g:756:50: (iv_ruleExtension= ruleExtension EOF )
            // InternalOCCI.g:757:2: iv_ruleExtension= ruleExtension EOF
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
    // InternalOCCI.g:763:1: ruleExtension returns [EObject current=null] : (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* ) ;
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
            // InternalOCCI.g:769:2: ( (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* ) )
            // InternalOCCI.g:770:2: (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* )
            {
            // InternalOCCI.g:770:2: (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* )
            // InternalOCCI.g:771:3: otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionAccess().getExtensionKeyword_0());
            		
            // InternalOCCI.g:775:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:776:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:776:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:777:5: lv_name_1_0= ruleNameID
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

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:798:3: ( (lv_scheme_3_0= RULE_STRING ) )
            // InternalOCCI.g:799:4: (lv_scheme_3_0= RULE_STRING )
            {
            // InternalOCCI.g:799:4: (lv_scheme_3_0= RULE_STRING )
            // InternalOCCI.g:800:5: lv_scheme_3_0= RULE_STRING
            {
            lv_scheme_3_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            // InternalOCCI.g:816:3: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOCCI.g:817:4: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalOCCI.g:821:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalOCCI.g:822:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:822:5: (lv_description_5_0= RULE_STRING )
                    // InternalOCCI.g:823:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

            // InternalOCCI.g:840:3: (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOCCI.g:841:4: otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getExtensionAccess().getSpecificationKeyword_5_0());
                    			
                    // InternalOCCI.g:845:4: ( (lv_specification_7_0= RULE_STRING ) )
                    // InternalOCCI.g:846:5: (lv_specification_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:846:5: (lv_specification_7_0= RULE_STRING )
                    // InternalOCCI.g:847:6: lv_specification_7_0= RULE_STRING
                    {
                    lv_specification_7_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            // InternalOCCI.g:864:3: (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOCCI.g:865:4: otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )?
            	    {
            	    otherlv_8=(Token)match(input,31,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getImportKeyword_6_0());
            	    			
            	    // InternalOCCI.g:869:4: ( (otherlv_9= RULE_STRING ) )
            	    // InternalOCCI.g:870:5: (otherlv_9= RULE_STRING )
            	    {
            	    // InternalOCCI.g:870:5: (otherlv_9= RULE_STRING )
            	    // InternalOCCI.g:871:6: otherlv_9= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExtensionRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_30); 

            	    						newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getImportExtensionCrossReference_6_1_0());
            	    					

            	    }


            	    }

            	    // InternalOCCI.g:882:4: (otherlv_10= 'as' this_ID_11= RULE_ID )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==32) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalOCCI.g:883:5: otherlv_10= 'as' this_ID_11= RULE_ID
            	            {
            	            otherlv_10=(Token)match(input,32,FOLLOW_31); 

            	            					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getAsKeyword_6_2_0());
            	            				
            	            this_ID_11=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            // InternalOCCI.g:893:3: ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )*
            loop22:
            do {
                int alt22=4;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    alt22=1;
                    }
                    break;
                case 26:
                    {
                    alt22=2;
                    }
                    break;
                case 54:
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
            	    // InternalOCCI.g:894:4: ( (lv_kinds_12_0= ruleKind ) )
            	    {
            	    // InternalOCCI.g:894:4: ( (lv_kinds_12_0= ruleKind ) )
            	    // InternalOCCI.g:895:5: (lv_kinds_12_0= ruleKind )
            	    {
            	    // InternalOCCI.g:895:5: (lv_kinds_12_0= ruleKind )
            	    // InternalOCCI.g:896:6: lv_kinds_12_0= ruleKind
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    // InternalOCCI.g:914:4: ( (lv_mixins_13_0= ruleMixin ) )
            	    {
            	    // InternalOCCI.g:914:4: ( (lv_mixins_13_0= ruleMixin ) )
            	    // InternalOCCI.g:915:5: (lv_mixins_13_0= ruleMixin )
            	    {
            	    // InternalOCCI.g:915:5: (lv_mixins_13_0= ruleMixin )
            	    // InternalOCCI.g:916:6: lv_mixins_13_0= ruleMixin
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    // InternalOCCI.g:934:4: ( (lv_types_14_0= ruleDataType ) )
            	    {
            	    // InternalOCCI.g:934:4: ( (lv_types_14_0= ruleDataType ) )
            	    // InternalOCCI.g:935:5: (lv_types_14_0= ruleDataType )
            	    {
            	    // InternalOCCI.g:935:5: (lv_types_14_0= ruleDataType )
            	    // InternalOCCI.g:936:6: lv_types_14_0= ruleDataType
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getTypesDataTypeParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
    // InternalOCCI.g:958:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // InternalOCCI.g:958:45: (iv_ruleKind= ruleKind EOF )
            // InternalOCCI.g:959:2: iv_ruleKind= ruleKind EOF
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
    // InternalOCCI.g:965:1: ruleKind returns [EObject current=null] : (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= '(' otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= ')' )? otherlv_12= 'scheme' ( (lv_scheme_13_0= RULE_STRING ) ) (otherlv_14= '{' ( ( (lv_attributes_15_0= ruleAttribute ) ) | ( (lv_actions_16_0= ruleAction ) ) | ( (lv_constraints_17_0= ruleConstraint ) ) )+ otherlv_18= '}' )? ( (lv_fsm_19_0= ruleFSM ) )? (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )? ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_title_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_scheme_13_0=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_15_0 = null;

        EObject lv_actions_16_0 = null;

        EObject lv_constraints_17_0 = null;

        EObject lv_fsm_19_0 = null;

        EObject lv_annotations_22_0 = null;

        EObject lv_annotations_24_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:971:2: ( (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= '(' otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= ')' )? otherlv_12= 'scheme' ( (lv_scheme_13_0= RULE_STRING ) ) (otherlv_14= '{' ( ( (lv_attributes_15_0= ruleAttribute ) ) | ( (lv_actions_16_0= ruleAction ) ) | ( (lv_constraints_17_0= ruleConstraint ) ) )+ otherlv_18= '}' )? ( (lv_fsm_19_0= ruleFSM ) )? (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )? ) )
            // InternalOCCI.g:972:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= '(' otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= ')' )? otherlv_12= 'scheme' ( (lv_scheme_13_0= RULE_STRING ) ) (otherlv_14= '{' ( ( (lv_attributes_15_0= ruleAttribute ) ) | ( (lv_actions_16_0= ruleAction ) ) | ( (lv_constraints_17_0= ruleConstraint ) ) )+ otherlv_18= '}' )? ( (lv_fsm_19_0= ruleFSM ) )? (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )? )
            {
            // InternalOCCI.g:972:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= '(' otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= ')' )? otherlv_12= 'scheme' ( (lv_scheme_13_0= RULE_STRING ) ) (otherlv_14= '{' ( ( (lv_attributes_15_0= ruleAttribute ) ) | ( (lv_actions_16_0= ruleAction ) ) | ( (lv_constraints_17_0= ruleConstraint ) ) )+ otherlv_18= '}' )? ( (lv_fsm_19_0= ruleFSM ) )? (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )? )
            // InternalOCCI.g:973:3: otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= '(' otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= ')' )? otherlv_12= 'scheme' ( (lv_scheme_13_0= RULE_STRING ) ) (otherlv_14= '{' ( ( (lv_attributes_15_0= ruleAttribute ) ) | ( (lv_actions_16_0= ruleAction ) ) | ( (lv_constraints_17_0= ruleConstraint ) ) )+ otherlv_18= '}' )? ( (lv_fsm_19_0= ruleFSM ) )? (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getKindAccess().getKindKeyword_0());
            		
            // InternalOCCI.g:977:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:978:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:978:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:979:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getKindAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalOCCI.g:996:3: (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOCCI.g:997:4: otherlv_2= 'extends' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getKindAccess().getExtendsKeyword_2_0());
                    			
                    // InternalOCCI.g:1001:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1002:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1002:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1003:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getParentKindCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1018:3: (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOCCI.g:1019:4: otherlv_4= 'source' ( ( ruleQualifiedID ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getKindAccess().getSourceKeyword_3_0());
                    			
                    // InternalOCCI.g:1023:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1024:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1024:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1025:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getSourceKindCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1040:3: (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOCCI.g:1041:4: otherlv_6= 'target' ( ( ruleQualifiedID ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getKindAccess().getTargetKeyword_4_0());
                    			
                    // InternalOCCI.g:1045:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1046:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1046:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1047:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getTargetKindCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1062:3: (otherlv_8= '(' otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOCCI.g:1063:4: otherlv_8= '(' otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getKindAccess().getLeftParenthesisKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getKindAccess().getTitleKeyword_5_1());
                    			
                    // InternalOCCI.g:1071:4: ( (lv_title_10_0= RULE_STRING ) )
                    // InternalOCCI.g:1072:5: (lv_title_10_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1072:5: (lv_title_10_0= RULE_STRING )
                    // InternalOCCI.g:1073:6: lv_title_10_0= RULE_STRING
                    {
                    lv_title_10_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_title_10_0, grammarAccess.getKindAccess().getTitleSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_11, grammarAccess.getKindAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getKindAccess().getSchemeKeyword_6());
            		
            // InternalOCCI.g:1098:3: ( (lv_scheme_13_0= RULE_STRING ) )
            // InternalOCCI.g:1099:4: (lv_scheme_13_0= RULE_STRING )
            {
            // InternalOCCI.g:1099:4: (lv_scheme_13_0= RULE_STRING )
            // InternalOCCI.g:1100:5: lv_scheme_13_0= RULE_STRING
            {
            lv_scheme_13_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_scheme_13_0, grammarAccess.getKindAccess().getSchemeSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKindRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scheme",
            						lv_scheme_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:1116:3: (otherlv_14= '{' ( ( (lv_attributes_15_0= ruleAttribute ) ) | ( (lv_actions_16_0= ruleAction ) ) | ( (lv_constraints_17_0= ruleConstraint ) ) )+ otherlv_18= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOCCI.g:1117:4: otherlv_14= '{' ( ( (lv_attributes_15_0= ruleAttribute ) ) | ( (lv_actions_16_0= ruleAction ) ) | ( (lv_constraints_17_0= ruleConstraint ) ) )+ otherlv_18= '}'
                    {
                    otherlv_14=(Token)match(input,22,FOLLOW_39); 

                    				newLeafNode(otherlv_14, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_8_0());
                    			
                    // InternalOCCI.g:1121:4: ( ( (lv_attributes_15_0= ruleAttribute ) ) | ( (lv_actions_16_0= ruleAction ) ) | ( (lv_constraints_17_0= ruleConstraint ) ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=4;
                        switch ( input.LA(1) ) {
                        case 27:
                            {
                            alt27=1;
                            }
                            break;
                        case 45:
                            {
                            alt27=2;
                            }
                            break;
                        case 46:
                            {
                            alt27=3;
                            }
                            break;

                        }

                        switch (alt27) {
                    	case 1 :
                    	    // InternalOCCI.g:1122:5: ( (lv_attributes_15_0= ruleAttribute ) )
                    	    {
                    	    // InternalOCCI.g:1122:5: ( (lv_attributes_15_0= ruleAttribute ) )
                    	    // InternalOCCI.g:1123:6: (lv_attributes_15_0= ruleAttribute )
                    	    {
                    	    // InternalOCCI.g:1123:6: (lv_attributes_15_0= ruleAttribute )
                    	    // InternalOCCI.g:1124:7: lv_attributes_15_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_8_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_attributes_15_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_15_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOCCI.g:1142:5: ( (lv_actions_16_0= ruleAction ) )
                    	    {
                    	    // InternalOCCI.g:1142:5: ( (lv_actions_16_0= ruleAction ) )
                    	    // InternalOCCI.g:1143:6: (lv_actions_16_0= ruleAction )
                    	    {
                    	    // InternalOCCI.g:1143:6: (lv_actions_16_0= ruleAction )
                    	    // InternalOCCI.g:1144:7: lv_actions_16_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_actions_16_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_16_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalOCCI.g:1162:5: ( (lv_constraints_17_0= ruleConstraint ) )
                    	    {
                    	    // InternalOCCI.g:1162:5: ( (lv_constraints_17_0= ruleConstraint ) )
                    	    // InternalOCCI.g:1163:6: (lv_constraints_17_0= ruleConstraint )
                    	    {
                    	    // InternalOCCI.g:1163:6: (lv_constraints_17_0= ruleConstraint )
                    	    // InternalOCCI.g:1164:7: lv_constraints_17_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getConstraintsConstraintParserRuleCall_8_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_constraints_17_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_17_0,
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

                    otherlv_18=(Token)match(input,23,FOLLOW_41); 

                    				newLeafNode(otherlv_18, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_8_2());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1187:3: ( (lv_fsm_19_0= ruleFSM ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOCCI.g:1188:4: (lv_fsm_19_0= ruleFSM )
                    {
                    // InternalOCCI.g:1188:4: (lv_fsm_19_0= ruleFSM )
                    // InternalOCCI.g:1189:5: lv_fsm_19_0= ruleFSM
                    {

                    					newCompositeNode(grammarAccess.getKindAccess().getFsmFSMParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_fsm_19_0=ruleFSM();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getKindRule());
                    					}
                    					set(
                    						current,
                    						"fsm",
                    						lv_fsm_19_0,
                    						"org.eclipse.cmf.occi.core.xtext.OCCI.FSM");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1206:3: (otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOCCI.g:1207:4: otherlv_20= 'annotations' otherlv_21= '{' ( (lv_annotations_22_0= ruleAnnotation ) ) (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_20, grammarAccess.getKindAccess().getAnnotationsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,22,FOLLOW_43); 

                    				newLeafNode(otherlv_21, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalOCCI.g:1215:4: ( (lv_annotations_22_0= ruleAnnotation ) )
                    // InternalOCCI.g:1216:5: (lv_annotations_22_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1216:5: (lv_annotations_22_0= ruleAnnotation )
                    // InternalOCCI.g:1217:6: lv_annotations_22_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_44);
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

                    // InternalOCCI.g:1234:4: (otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==38) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalOCCI.g:1235:5: otherlv_23= ',' ( (lv_annotations_24_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,38,FOLLOW_43); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getKindAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalOCCI.g:1239:5: ( (lv_annotations_24_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1240:6: (lv_annotations_24_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1240:6: (lv_annotations_24_0= ruleAnnotation )
                    	    // InternalOCCI.g:1241:7: lv_annotations_24_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    lv_annotations_24_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKindRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_24_0,
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

                    otherlv_25=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_10_4());
                    			

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
    // InternalOCCI.g:1268:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // InternalOCCI.g:1268:46: (iv_ruleMixin= ruleMixin EOF )
            // InternalOCCI.g:1269:2: iv_ruleMixin= ruleMixin EOF
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
    // InternalOCCI.g:1275:1: ruleMixin returns [EObject current=null] : (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= '(' otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) otherlv_17= ')' )? otherlv_18= 'scheme' ( (lv_scheme_19_0= RULE_STRING ) ) (otherlv_20= '{' ( ( (lv_attributes_21_0= ruleAttribute ) ) | ( (lv_actions_22_0= ruleAction ) ) | ( (lv_constraints_23_0= ruleConstraint ) ) )+ otherlv_24= '}' )? (otherlv_25= 'annotations' otherlv_26= '{' ( (lv_annotations_27_0= ruleAnnotation ) ) (otherlv_28= ',' ( (lv_annotations_29_0= ruleAnnotation ) ) )* otherlv_30= '}' )? ) ;
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
        Token lv_title_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_scheme_19_0=null;
        Token otherlv_20=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_21_0 = null;

        EObject lv_actions_22_0 = null;

        EObject lv_constraints_23_0 = null;

        EObject lv_annotations_27_0 = null;

        EObject lv_annotations_29_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1281:2: ( (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= '(' otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) otherlv_17= ')' )? otherlv_18= 'scheme' ( (lv_scheme_19_0= RULE_STRING ) ) (otherlv_20= '{' ( ( (lv_attributes_21_0= ruleAttribute ) ) | ( (lv_actions_22_0= ruleAction ) ) | ( (lv_constraints_23_0= ruleConstraint ) ) )+ otherlv_24= '}' )? (otherlv_25= 'annotations' otherlv_26= '{' ( (lv_annotations_27_0= ruleAnnotation ) ) (otherlv_28= ',' ( (lv_annotations_29_0= ruleAnnotation ) ) )* otherlv_30= '}' )? ) )
            // InternalOCCI.g:1282:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= '(' otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) otherlv_17= ')' )? otherlv_18= 'scheme' ( (lv_scheme_19_0= RULE_STRING ) ) (otherlv_20= '{' ( ( (lv_attributes_21_0= ruleAttribute ) ) | ( (lv_actions_22_0= ruleAction ) ) | ( (lv_constraints_23_0= ruleConstraint ) ) )+ otherlv_24= '}' )? (otherlv_25= 'annotations' otherlv_26= '{' ( (lv_annotations_27_0= ruleAnnotation ) ) (otherlv_28= ',' ( (lv_annotations_29_0= ruleAnnotation ) ) )* otherlv_30= '}' )? )
            {
            // InternalOCCI.g:1282:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= '(' otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) otherlv_17= ')' )? otherlv_18= 'scheme' ( (lv_scheme_19_0= RULE_STRING ) ) (otherlv_20= '{' ( ( (lv_attributes_21_0= ruleAttribute ) ) | ( (lv_actions_22_0= ruleAction ) ) | ( (lv_constraints_23_0= ruleConstraint ) ) )+ otherlv_24= '}' )? (otherlv_25= 'annotations' otherlv_26= '{' ( (lv_annotations_27_0= ruleAnnotation ) ) (otherlv_28= ',' ( (lv_annotations_29_0= ruleAnnotation ) ) )* otherlv_30= '}' )? )
            // InternalOCCI.g:1283:3: otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? (otherlv_14= '(' otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) otherlv_17= ')' )? otherlv_18= 'scheme' ( (lv_scheme_19_0= RULE_STRING ) ) (otherlv_20= '{' ( ( (lv_attributes_21_0= ruleAttribute ) ) | ( (lv_actions_22_0= ruleAction ) ) | ( (lv_constraints_23_0= ruleConstraint ) ) )+ otherlv_24= '}' )? (otherlv_25= 'annotations' otherlv_26= '{' ( (lv_annotations_27_0= ruleAnnotation ) ) (otherlv_28= ',' ( (lv_annotations_29_0= ruleAnnotation ) ) )* otherlv_30= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMixinAccess().getMixinKeyword_0());
            		
            // InternalOCCI.g:1287:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1288:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1288:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1289:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getMixinAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalOCCI.g:1306:3: (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOCCI.g:1307:4: otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_43); 

                    				newLeafNode(otherlv_2, grammarAccess.getMixinAccess().getDependsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalOCCI.g:1315:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1316:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1316:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1317:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1331:4: (otherlv_5= ',' ( ( ruleQualifiedID ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==38) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalOCCI.g:1332:5: otherlv_5= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMixinAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalOCCI.g:1336:5: ( ( ruleQualifiedID ) )
                    	    // InternalOCCI.g:1337:6: ( ruleQualifiedID )
                    	    {
                    	    // InternalOCCI.g:1337:6: ( ruleQualifiedID )
                    	    // InternalOCCI.g:1338:7: ruleQualifiedID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMixinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
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

                    otherlv_7=(Token)match(input,20,FOLLOW_47); 

                    				newLeafNode(otherlv_7, grammarAccess.getMixinAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1358:3: (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOCCI.g:1359:4: otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_43); 

                    				newLeafNode(otherlv_8, grammarAccess.getMixinAccess().getAppliesKeyword_3_0());
                    			
                    otherlv_9=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalOCCI.g:1367:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1368:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1368:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1369:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1383:4: (otherlv_11= ',' ( ( ruleQualifiedID ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==38) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalOCCI.g:1384:5: otherlv_11= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMixinAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalOCCI.g:1388:5: ( ( ruleQualifiedID ) )
                    	    // InternalOCCI.g:1389:6: ( ruleQualifiedID )
                    	    {
                    	    // InternalOCCI.g:1389:6: ( ruleQualifiedID )
                    	    // InternalOCCI.g:1390:7: ruleQualifiedID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMixinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
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

                    otherlv_13=(Token)match(input,20,FOLLOW_36); 

                    				newLeafNode(otherlv_13, grammarAccess.getMixinAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1410:3: (otherlv_14= '(' otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) otherlv_17= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOCCI.g:1411:4: otherlv_14= '(' otherlv_15= 'title' ( (lv_title_16_0= RULE_STRING ) ) otherlv_17= ')'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_15=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getMixinAccess().getTitleKeyword_4_1());
                    			
                    // InternalOCCI.g:1419:4: ( (lv_title_16_0= RULE_STRING ) )
                    // InternalOCCI.g:1420:5: (lv_title_16_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1420:5: (lv_title_16_0= RULE_STRING )
                    // InternalOCCI.g:1421:6: lv_title_16_0= RULE_STRING
                    {
                    lv_title_16_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_title_16_0, grammarAccess.getMixinAccess().getTitleSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_17, grammarAccess.getMixinAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getMixinAccess().getSchemeKeyword_5());
            		
            // InternalOCCI.g:1446:3: ( (lv_scheme_19_0= RULE_STRING ) )
            // InternalOCCI.g:1447:4: (lv_scheme_19_0= RULE_STRING )
            {
            // InternalOCCI.g:1447:4: (lv_scheme_19_0= RULE_STRING )
            // InternalOCCI.g:1448:5: lv_scheme_19_0= RULE_STRING
            {
            lv_scheme_19_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            					newLeafNode(lv_scheme_19_0, grammarAccess.getMixinAccess().getSchemeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scheme",
            						lv_scheme_19_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:1464:3: (otherlv_20= '{' ( ( (lv_attributes_21_0= ruleAttribute ) ) | ( (lv_actions_22_0= ruleAction ) ) | ( (lv_constraints_23_0= ruleConstraint ) ) )+ otherlv_24= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOCCI.g:1465:4: otherlv_20= '{' ( ( (lv_attributes_21_0= ruleAttribute ) ) | ( (lv_actions_22_0= ruleAction ) ) | ( (lv_constraints_23_0= ruleConstraint ) ) )+ otherlv_24= '}'
                    {
                    otherlv_20=(Token)match(input,22,FOLLOW_39); 

                    				newLeafNode(otherlv_20, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalOCCI.g:1469:4: ( ( (lv_attributes_21_0= ruleAttribute ) ) | ( (lv_actions_22_0= ruleAction ) ) | ( (lv_constraints_23_0= ruleConstraint ) ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=4;
                        switch ( input.LA(1) ) {
                        case 27:
                            {
                            alt37=1;
                            }
                            break;
                        case 45:
                            {
                            alt37=2;
                            }
                            break;
                        case 46:
                            {
                            alt37=3;
                            }
                            break;

                        }

                        switch (alt37) {
                    	case 1 :
                    	    // InternalOCCI.g:1470:5: ( (lv_attributes_21_0= ruleAttribute ) )
                    	    {
                    	    // InternalOCCI.g:1470:5: ( (lv_attributes_21_0= ruleAttribute ) )
                    	    // InternalOCCI.g:1471:6: (lv_attributes_21_0= ruleAttribute )
                    	    {
                    	    // InternalOCCI.g:1471:6: (lv_attributes_21_0= ruleAttribute )
                    	    // InternalOCCI.g:1472:7: lv_attributes_21_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_7_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_attributes_21_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMixinRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_21_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOCCI.g:1490:5: ( (lv_actions_22_0= ruleAction ) )
                    	    {
                    	    // InternalOCCI.g:1490:5: ( (lv_actions_22_0= ruleAction ) )
                    	    // InternalOCCI.g:1491:6: (lv_actions_22_0= ruleAction )
                    	    {
                    	    // InternalOCCI.g:1491:6: (lv_actions_22_0= ruleAction )
                    	    // InternalOCCI.g:1492:7: lv_actions_22_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_actions_22_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMixinRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_22_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalOCCI.g:1510:5: ( (lv_constraints_23_0= ruleConstraint ) )
                    	    {
                    	    // InternalOCCI.g:1510:5: ( (lv_constraints_23_0= ruleConstraint ) )
                    	    // InternalOCCI.g:1511:6: (lv_constraints_23_0= ruleConstraint )
                    	    {
                    	    // InternalOCCI.g:1511:6: (lv_constraints_23_0= ruleConstraint )
                    	    // InternalOCCI.g:1512:7: lv_constraints_23_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getConstraintsConstraintParserRuleCall_7_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_40);
                    	    lv_constraints_23_0=ruleConstraint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMixinRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_23_0,
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

                    otherlv_24=(Token)match(input,23,FOLLOW_42); 

                    				newLeafNode(otherlv_24, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1535:3: (otherlv_25= 'annotations' otherlv_26= '{' ( (lv_annotations_27_0= ruleAnnotation ) ) (otherlv_28= ',' ( (lv_annotations_29_0= ruleAnnotation ) ) )* otherlv_30= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOCCI.g:1536:4: otherlv_25= 'annotations' otherlv_26= '{' ( (lv_annotations_27_0= ruleAnnotation ) ) (otherlv_28= ',' ( (lv_annotations_29_0= ruleAnnotation ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getMixinAccess().getAnnotationsKeyword_8_0());
                    			
                    otherlv_26=(Token)match(input,22,FOLLOW_43); 

                    				newLeafNode(otherlv_26, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalOCCI.g:1544:4: ( (lv_annotations_27_0= ruleAnnotation ) )
                    // InternalOCCI.g:1545:5: (lv_annotations_27_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1545:5: (lv_annotations_27_0= ruleAnnotation )
                    // InternalOCCI.g:1546:6: lv_annotations_27_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_44);
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

                    // InternalOCCI.g:1563:4: (otherlv_28= ',' ( (lv_annotations_29_0= ruleAnnotation ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==38) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalOCCI.g:1564:5: otherlv_28= ',' ( (lv_annotations_29_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_28=(Token)match(input,38,FOLLOW_43); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getMixinAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalOCCI.g:1568:5: ( (lv_annotations_29_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1569:6: (lv_annotations_29_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1569:6: (lv_annotations_29_0= ruleAnnotation )
                    	    // InternalOCCI.g:1570:7: lv_annotations_29_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    lv_annotations_29_0=ruleAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMixinRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"annotations",
                    	    								lv_annotations_29_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Annotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_30, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_8_4());
                    			

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
    // InternalOCCI.g:1597:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalOCCI.g:1597:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalOCCI.g:1598:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalOCCI.g:1604:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
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
            // InternalOCCI.g:1610:2: ( (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalOCCI.g:1611:2: (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalOCCI.g:1611:2: (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalOCCI.g:1612:3: otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getKeyKeyword_1());
            		
            // InternalOCCI.g:1620:3: ( (lv_key_2_0= RULE_STRING ) )
            // InternalOCCI.g:1621:4: (lv_key_2_0= RULE_STRING )
            {
            // InternalOCCI.g:1621:4: (lv_key_2_0= RULE_STRING )
            // InternalOCCI.g:1622:5: lv_key_2_0= RULE_STRING
            {
            lv_key_2_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

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

            otherlv_3=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getValueKeyword_3());
            		
            // InternalOCCI.g:1642:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalOCCI.g:1643:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalOCCI.g:1643:4: (lv_value_4_0= RULE_STRING )
            // InternalOCCI.g:1644:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOCCI.g:1668:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOCCI.g:1668:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOCCI.g:1669:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOCCI.g:1675:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) (otherlv_4= ':' ( ( ruleQualifiedID ) ) )? (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? ) ;
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
            // InternalOCCI.g:1681:2: ( (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) (otherlv_4= ':' ( ( ruleQualifiedID ) ) )? (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? ) )
            // InternalOCCI.g:1682:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) (otherlv_4= ':' ( ( ruleQualifiedID ) ) )? (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? )
            {
            // InternalOCCI.g:1682:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) (otherlv_4= ':' ( ( ruleQualifiedID ) ) )? (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )? )
            // InternalOCCI.g:1683:3: otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) (otherlv_4= ':' ( ( ruleQualifiedID ) ) )? (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalOCCI.g:1687:3: ( (lv_mutable_1_0= 'mutable' ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalOCCI.g:1688:4: (lv_mutable_1_0= 'mutable' )
                    {
                    // InternalOCCI.g:1688:4: (lv_mutable_1_0= 'mutable' )
                    // InternalOCCI.g:1689:5: lv_mutable_1_0= 'mutable'
                    {
                    lv_mutable_1_0=(Token)match(input,43,FOLLOW_10); 

                    					newLeafNode(lv_mutable_1_0, grammarAccess.getAttributeAccess().getMutableMutableKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1701:3: ( (lv_required_2_0= 'required' ) )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalOCCI.g:1702:4: (lv_required_2_0= 'required' )
                    {
                    // InternalOCCI.g:1702:4: (lv_required_2_0= 'required' )
                    // InternalOCCI.g:1703:5: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,44,FOLLOW_10); 

                    					newLeafNode(lv_required_2_0, grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1715:3: ( (lv_name_3_0= ruleQualifiedID ) )
            // InternalOCCI.g:1716:4: (lv_name_3_0= ruleQualifiedID )
            {
            // InternalOCCI.g:1716:4: (lv_name_3_0= ruleQualifiedID )
            // InternalOCCI.g:1717:5: lv_name_3_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameQualifiedIDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_51);
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

            // InternalOCCI.g:1734:3: (otherlv_4= ':' ( ( ruleQualifiedID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==17) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOCCI.g:1735:4: otherlv_4= ':' ( ( ruleQualifiedID ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4_0());
                    			
                    // InternalOCCI.g:1739:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1740:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1740:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1741:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1756:3: (otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOCCI.g:1757:4: otherlv_6= '=' ( (lv_default_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOCCI.g:1761:4: ( (lv_default_7_0= RULE_STRING ) )
                    // InternalOCCI.g:1762:5: (lv_default_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1762:5: (lv_default_7_0= RULE_STRING )
                    // InternalOCCI.g:1763:6: lv_default_7_0= RULE_STRING
                    {
                    lv_default_7_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

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

            // InternalOCCI.g:1780:3: (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==13) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOCCI.g:1781:4: otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getDescriptionKeyword_6_0());
                    			
                    // InternalOCCI.g:1785:4: ( (lv_description_9_0= RULE_STRING ) )
                    // InternalOCCI.g:1786:5: (lv_description_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1786:5: (lv_description_9_0= RULE_STRING )
                    // InternalOCCI.g:1787:6: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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

            // InternalOCCI.g:1804:3: (otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==37) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOCCI.g:1805:4: otherlv_10= 'annotations' otherlv_11= '{' ( (lv_annotations_12_0= ruleAnnotation ) ) (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_43); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalOCCI.g:1813:4: ( (lv_annotations_12_0= ruleAnnotation ) )
                    // InternalOCCI.g:1814:5: (lv_annotations_12_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1814:5: (lv_annotations_12_0= ruleAnnotation )
                    // InternalOCCI.g:1815:6: lv_annotations_12_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_44);
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

                    // InternalOCCI.g:1832:4: (otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==38) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalOCCI.g:1833:5: otherlv_13= ',' ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,38,FOLLOW_43); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalOCCI.g:1837:5: ( (lv_annotations_14_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1838:6: (lv_annotations_14_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1838:6: (lv_annotations_14_0= ruleAnnotation )
                    	    // InternalOCCI.g:1839:7: lv_annotations_14_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,23,FOLLOW_2); 

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
    // InternalOCCI.g:1866:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalOCCI.g:1866:47: (iv_ruleAction= ruleAction EOF )
            // InternalOCCI.g:1867:2: iv_ruleAction= ruleAction EOF
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
    // InternalOCCI.g:1873:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? otherlv_7= 'scheme' ( (lv_scheme_8_0= RULE_STRING ) ) (otherlv_9= '(' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= ')' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_scheme_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_title_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_annotations_15_0 = null;

        EObject lv_annotations_17_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1879:2: ( (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? otherlv_7= 'scheme' ( (lv_scheme_8_0= RULE_STRING ) ) (otherlv_9= '(' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= ')' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) )
            // InternalOCCI.g:1880:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? otherlv_7= 'scheme' ( (lv_scheme_8_0= RULE_STRING ) ) (otherlv_9= '(' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= ')' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            {
            // InternalOCCI.g:1880:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? otherlv_7= 'scheme' ( (lv_scheme_8_0= RULE_STRING ) ) (otherlv_9= '(' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= ')' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            // InternalOCCI.g:1881:3: otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? otherlv_7= 'scheme' ( (lv_scheme_8_0= RULE_STRING ) ) (otherlv_9= '(' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= ')' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalOCCI.g:1885:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1886:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1886:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1887:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalOCCI.g:1904:3: (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==18) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOCCI.g:1905:4: otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalOCCI.g:1909:4: ( (lv_attributes_3_0= ruleParameterDecl ) )
                    // InternalOCCI.g:1910:5: (lv_attributes_3_0= ruleParameterDecl )
                    {
                    // InternalOCCI.g:1910:5: (lv_attributes_3_0= ruleParameterDecl )
                    // InternalOCCI.g:1911:6: lv_attributes_3_0= ruleParameterDecl
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_46);
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

                    // InternalOCCI.g:1928:4: (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==38) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalOCCI.g:1929:5: otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOCCI.g:1933:5: ( (lv_attributes_5_0= ruleParameterDecl ) )
                    	    // InternalOCCI.g:1934:6: (lv_attributes_5_0= ruleParameterDecl )
                    	    {
                    	    // InternalOCCI.g:1934:6: (lv_attributes_5_0= ruleParameterDecl )
                    	    // InternalOCCI.g:1935:7: lv_attributes_5_0= ruleParameterDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
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
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,20,FOLLOW_37); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getSchemeKeyword_3());
            		
            // InternalOCCI.g:1962:3: ( (lv_scheme_8_0= RULE_STRING ) )
            // InternalOCCI.g:1963:4: (lv_scheme_8_0= RULE_STRING )
            {
            // InternalOCCI.g:1963:4: (lv_scheme_8_0= RULE_STRING )
            // InternalOCCI.g:1964:5: lv_scheme_8_0= RULE_STRING
            {
            lv_scheme_8_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

            					newLeafNode(lv_scheme_8_0, grammarAccess.getActionAccess().getSchemeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scheme",
            						lv_scheme_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:1980:3: (otherlv_9= '(' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==18) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalOCCI.g:1981:4: otherlv_9= '(' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= ')'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionAccess().getLeftParenthesisKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getActionAccess().getTitleKeyword_5_1());
                    			
                    // InternalOCCI.g:1989:4: ( (lv_title_11_0= RULE_STRING ) )
                    // InternalOCCI.g:1990:5: (lv_title_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1990:5: (lv_title_11_0= RULE_STRING )
                    // InternalOCCI.g:1991:6: lv_title_11_0= RULE_STRING
                    {
                    lv_title_11_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

                    otherlv_12=(Token)match(input,20,FOLLOW_42); 

                    				newLeafNode(otherlv_12, grammarAccess.getActionAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:2012:3: (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==37) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOCCI.g:2013:4: otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionAccess().getAnnotationsKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,22,FOLLOW_43); 

                    				newLeafNode(otherlv_14, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOCCI.g:2021:4: ( (lv_annotations_15_0= ruleAnnotation ) )
                    // InternalOCCI.g:2022:5: (lv_annotations_15_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:2022:5: (lv_annotations_15_0= ruleAnnotation )
                    // InternalOCCI.g:2023:6: lv_annotations_15_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_44);
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

                    // InternalOCCI.g:2040:4: (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==38) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalOCCI.g:2041:5: otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,38,FOLLOW_43); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getActionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOCCI.g:2045:5: ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:2046:6: (lv_annotations_17_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:2046:6: (lv_annotations_17_0= ruleAnnotation )
                    	    // InternalOCCI.g:2047:7: lv_annotations_17_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,23,FOLLOW_2); 

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
    // InternalOCCI.g:2074:1: entryRuleParameterDecl returns [EObject current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final EObject entryRuleParameterDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDecl = null;


        try {
            // InternalOCCI.g:2074:54: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalOCCI.g:2075:2: iv_ruleParameterDecl= ruleParameterDecl EOF
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
    // InternalOCCI.g:2081:1: ruleParameterDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleParameterDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_default_4_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2087:2: ( ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2088:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2088:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2089:3: ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            {
            // InternalOCCI.g:2089:3: ( (lv_name_0_0= ruleQualifiedID ) )
            // InternalOCCI.g:2090:4: (lv_name_0_0= ruleQualifiedID )
            {
            // InternalOCCI.g:2090:4: (lv_name_0_0= ruleQualifiedID )
            // InternalOCCI.g:2091:5: lv_name_0_0= ruleQualifiedID
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

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDeclAccess().getColonKeyword_1());
            		
            // InternalOCCI.g:2112:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2113:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2113:4: ( ruleQualifiedID )
            // InternalOCCI.g:2114:5: ruleQualifiedID
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

            // InternalOCCI.g:2128:3: (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==28) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOCCI.g:2129:4: otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDeclAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalOCCI.g:2133:4: ( (lv_default_4_0= RULE_STRING ) )
                    // InternalOCCI.g:2134:5: (lv_default_4_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2134:5: (lv_default_4_0= RULE_STRING )
                    // InternalOCCI.g:2135:6: lv_default_4_0= RULE_STRING
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
    // InternalOCCI.g:2156:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalOCCI.g:2156:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalOCCI.g:2157:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalOCCI.g:2163:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) ;
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
            // InternalOCCI.g:2169:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) )
            // InternalOCCI.g:2170:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            {
            // InternalOCCI.g:2170:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            // InternalOCCI.g:2171:3: otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalOCCI.g:2175:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:2176:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:2176:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:2177:5: lv_name_1_0= ruleNameID
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

            // InternalOCCI.g:2194:3: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==13) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOCCI.g:2195:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalOCCI.g:2199:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2200:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2200:5: (lv_description_3_0= RULE_STRING )
                    // InternalOCCI.g:2201:6: lv_description_3_0= RULE_STRING
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

            otherlv_4=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getBodyKeyword_3());
            		
            // InternalOCCI.g:2222:3: ( (lv_body_5_0= RULE_STRING ) )
            // InternalOCCI.g:2223:4: (lv_body_5_0= RULE_STRING )
            {
            // InternalOCCI.g:2223:4: (lv_body_5_0= RULE_STRING )
            // InternalOCCI.g:2224:5: lv_body_5_0= RULE_STRING
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
    // InternalOCCI.g:2244:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalOCCI.g:2244:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalOCCI.g:2245:2: iv_ruleFSM= ruleFSM EOF
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
    // InternalOCCI.g:2251:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalOCCI.g:2257:2: ( (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? ) )
            // InternalOCCI.g:2258:2: (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? )
            {
            // InternalOCCI.g:2258:2: (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? )
            // InternalOCCI.g:2259:3: otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getAttributeKeyword_1());
            		
            // InternalOCCI.g:2267:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2268:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2268:4: ( ruleQualifiedID )
            // InternalOCCI.g:2269:5: ruleQualifiedID
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

            // InternalOCCI.g:2283:3: (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==22) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOCCI.g:2284:4: otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_60); 

                    				newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalOCCI.g:2288:4: ( (lv_ownedState_4_0= ruleState ) )
                    // InternalOCCI.g:2289:5: (lv_ownedState_4_0= ruleState )
                    {
                    // InternalOCCI.g:2289:5: (lv_ownedState_4_0= ruleState )
                    // InternalOCCI.g:2290:6: lv_ownedState_4_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

                    // InternalOCCI.g:2307:4: (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==38) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalOCCI.g:2308:5: otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) )
                    	    {
                    	    otherlv_5=(Token)match(input,38,FOLLOW_60); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalOCCI.g:2312:5: ( (lv_ownedState_6_0= ruleState ) )
                    	    // InternalOCCI.g:2313:6: (lv_ownedState_6_0= ruleState )
                    	    {
                    	    // InternalOCCI.g:2313:6: (lv_ownedState_6_0= ruleState )
                    	    // InternalOCCI.g:2314:7: lv_ownedState_6_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

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
    // InternalOCCI.g:2341:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalOCCI.g:2341:46: (iv_ruleState= ruleState EOF )
            // InternalOCCI.g:2342:2: iv_ruleState= ruleState EOF
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
    // InternalOCCI.g:2348:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( ( ruleQualifiedID ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )? ) ;
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
            // InternalOCCI.g:2354:2: ( (otherlv_0= 'state' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( ( ruleQualifiedID ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )? ) )
            // InternalOCCI.g:2355:2: (otherlv_0= 'state' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( ( ruleQualifiedID ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )? )
            {
            // InternalOCCI.g:2355:2: (otherlv_0= 'state' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( ( ruleQualifiedID ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )? )
            // InternalOCCI.g:2356:3: otherlv_0= 'state' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? ( ( ruleQualifiedID ) ) (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalOCCI.g:2360:3: ( (lv_initial_1_0= 'initial' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==50) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==RULE_ID||LA57_1==RULE_QUALIFIED_ID||(LA57_1>=12 && LA57_1<=16)||LA57_1==19||LA57_1==21||(LA57_1>=24 && LA57_1<=27)||(LA57_1>=29 && LA57_1<=37)||(LA57_1>=39 && LA57_1<=51)||(LA57_1>=53 && LA57_1<=60)||(LA57_1>=62 && LA57_1<=72)||(LA57_1>=74 && LA57_1<=81)) ) {
                    alt57=1;
                }
                else if ( (LA57_1==52) ) {
                    int LA57_4 = input.LA(3);

                    if ( (LA57_4==EOF||LA57_4==23||LA57_4==38||LA57_4==52) ) {
                        alt57=1;
                    }
                }
            }
            switch (alt57) {
                case 1 :
                    // InternalOCCI.g:2361:4: (lv_initial_1_0= 'initial' )
                    {
                    // InternalOCCI.g:2361:4: (lv_initial_1_0= 'initial' )
                    // InternalOCCI.g:2362:5: lv_initial_1_0= 'initial'
                    {
                    lv_initial_1_0=(Token)match(input,50,FOLLOW_10); 

                    					newLeafNode(lv_initial_1_0, grammarAccess.getStateAccess().getInitialInitialKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2374:3: ( (lv_final_2_0= 'final' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==51) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==52) ) {
                    int LA58_3 = input.LA(3);

                    if ( (LA58_3==EOF||LA58_3==23||LA58_3==38||LA58_3==52) ) {
                        alt58=1;
                    }
                }
                else if ( (LA58_1==RULE_ID||LA58_1==RULE_QUALIFIED_ID||(LA58_1>=12 && LA58_1<=16)||LA58_1==19||LA58_1==21||(LA58_1>=24 && LA58_1<=27)||(LA58_1>=29 && LA58_1<=37)||(LA58_1>=39 && LA58_1<=51)||(LA58_1>=53 && LA58_1<=60)||(LA58_1>=62 && LA58_1<=72)||(LA58_1>=74 && LA58_1<=81)) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // InternalOCCI.g:2375:4: (lv_final_2_0= 'final' )
                    {
                    // InternalOCCI.g:2375:4: (lv_final_2_0= 'final' )
                    // InternalOCCI.g:2376:5: lv_final_2_0= 'final'
                    {
                    lv_final_2_0=(Token)match(input,51,FOLLOW_10); 

                    					newLeafNode(lv_final_2_0, grammarAccess.getStateAccess().getFinalFinalKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2388:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2389:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2389:4: ( ruleQualifiedID )
            // InternalOCCI.g:2390:5: ruleQualifiedID
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

            // InternalOCCI.g:2404:3: (otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==52) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOCCI.g:2405:4: otherlv_4= 'transitions' otherlv_5= '(' ( (lv_outgoingTransition_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getTransitionsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_62); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalOCCI.g:2413:4: ( (lv_outgoingTransition_6_0= ruleTransition ) )
                    // InternalOCCI.g:2414:5: (lv_outgoingTransition_6_0= ruleTransition )
                    {
                    // InternalOCCI.g:2414:5: (lv_outgoingTransition_6_0= ruleTransition )
                    // InternalOCCI.g:2415:6: lv_outgoingTransition_6_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_46);
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

                    // InternalOCCI.g:2432:4: (otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==38) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalOCCI.g:2433:5: otherlv_7= ',' ( (lv_outgoingTransition_8_0= ruleTransition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,38,FOLLOW_62); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOCCI.g:2437:5: ( (lv_outgoingTransition_8_0= ruleTransition ) )
                    	    // InternalOCCI.g:2438:6: (lv_outgoingTransition_8_0= ruleTransition )
                    	    {
                    	    // InternalOCCI.g:2438:6: (lv_outgoingTransition_8_0= ruleTransition )
                    	    // InternalOCCI.g:2439:7: lv_outgoingTransition_8_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOCCI.g:2466:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalOCCI.g:2466:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalOCCI.g:2467:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalOCCI.g:2473:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOCCI.g:2479:2: ( ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) )
            // InternalOCCI.g:2480:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            {
            // InternalOCCI.g:2480:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:2481:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:2481:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==45) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOCCI.g:2482:4: otherlv_0= 'action' ( ( ruleQualifiedID ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getActionKeyword_0_0());
                    			
                    // InternalOCCI.g:2486:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:2487:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:2487:5: ( ruleQualifiedID )
                    // InternalOCCI.g:2488:6: ruleQualifiedID
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

            otherlv_2=(Token)match(input,53,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToKeyword_1());
            		
            // InternalOCCI.g:2507:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2508:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2508:4: ( ruleQualifiedID )
            // InternalOCCI.g:2509:5: ruleQualifiedID
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
    // InternalOCCI.g:2527:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalOCCI.g:2527:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalOCCI.g:2528:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalOCCI.g:2534:1: ruleDataType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) ;
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
            // InternalOCCI.g:2540:2: ( (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) )
            // InternalOCCI.g:2541:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            {
            // InternalOCCI.g:2541:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            int alt62=7;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt62=1;
                }
                break;
            case 60:
                {
                alt62=2;
                }
                break;
            case 62:
                {
                alt62=3;
                }
                break;
            case 63:
                {
                alt62=4;
                }
                break;
            case 69:
                {
                alt62=5;
                }
                break;
            case 71:
                {
                alt62=6;
                }
                break;
            case 72:
                {
                alt62=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalOCCI.g:2542:3: this_StringType_0= ruleStringType
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
                    // InternalOCCI.g:2551:3: this_EObjectType_1= ruleEObjectType
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
                    // InternalOCCI.g:2560:3: this_BooleanType_2= ruleBooleanType
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
                    // InternalOCCI.g:2569:3: this_NumericType_3= ruleNumericType
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
                    // InternalOCCI.g:2578:3: this_EnumerationType_4= ruleEnumerationType
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
                    // InternalOCCI.g:2587:3: this_RecordType_5= ruleRecordType
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
                    // InternalOCCI.g:2596:3: this_ArrayType_6= ruleArrayType
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
    // InternalOCCI.g:2608:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalOCCI.g:2608:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalOCCI.g:2609:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalOCCI.g:2615:1: ruleStringType returns [EObject current=null] : (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_pattern_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_documentation_11_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_length_5_0 = null;

        AntlrDatatypeRuleToken lv_minLength_7_0 = null;

        AntlrDatatypeRuleToken lv_maxLength_9_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2621:2: ( (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2622:2: (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2622:2: (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2623:3: otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStringTypeAccess().getStringTypeKeyword_0());
            		
            // InternalOCCI.g:2627:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2628:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2628:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2629:5: lv_name_1_0= ruleTypeID
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

            // InternalOCCI.g:2646:3: (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==55) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOCCI.g:2647:4: otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getPatternKeyword_2_0());
                    			
                    // InternalOCCI.g:2651:4: ( (lv_pattern_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2652:5: (lv_pattern_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2652:5: (lv_pattern_3_0= RULE_STRING )
                    // InternalOCCI.g:2653:6: lv_pattern_3_0= RULE_STRING
                    {
                    lv_pattern_3_0=(Token)match(input,RULE_STRING,FOLLOW_65); 

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

            // InternalOCCI.g:2670:3: (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==56) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalOCCI.g:2671:4: otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_66); 

                    				newLeafNode(otherlv_4, grammarAccess.getStringTypeAccess().getLengthKeyword_3_0());
                    			
                    // InternalOCCI.g:2675:4: ( (lv_length_5_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2676:5: (lv_length_5_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2676:5: (lv_length_5_0= ruleEIntegerObject )
                    // InternalOCCI.g:2677:6: lv_length_5_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getLengthEIntegerObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_67);
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

            // InternalOCCI.g:2695:3: (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==57) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOCCI.g:2696:4: otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_66); 

                    				newLeafNode(otherlv_6, grammarAccess.getStringTypeAccess().getMinLengthKeyword_4_0());
                    			
                    // InternalOCCI.g:2700:4: ( (lv_minLength_7_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2701:5: (lv_minLength_7_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2701:5: (lv_minLength_7_0= ruleEIntegerObject )
                    // InternalOCCI.g:2702:6: lv_minLength_7_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMinLengthEIntegerObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

            // InternalOCCI.g:2720:3: (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==58) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalOCCI.g:2721:4: otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) )
                    {
                    otherlv_8=(Token)match(input,58,FOLLOW_66); 

                    				newLeafNode(otherlv_8, grammarAccess.getStringTypeAccess().getMaxLengthKeyword_5_0());
                    			
                    // InternalOCCI.g:2725:4: ( (lv_maxLength_9_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2726:5: (lv_maxLength_9_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2726:5: (lv_maxLength_9_0= ruleEIntegerObject )
                    // InternalOCCI.g:2727:6: lv_maxLength_9_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMaxLengthEIntegerObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_69);
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

            // InternalOCCI.g:2745:3: (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==59) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOCCI.g:2746:4: otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getStringTypeAccess().getDocumentationKeyword_6_0());
                    			
                    // InternalOCCI.g:2750:4: ( (lv_documentation_11_0= RULE_STRING ) )
                    // InternalOCCI.g:2751:5: (lv_documentation_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2751:5: (lv_documentation_11_0= RULE_STRING )
                    // InternalOCCI.g:2752:6: lv_documentation_11_0= RULE_STRING
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
    // InternalOCCI.g:2773:1: entryRuleEObjectType returns [EObject current=null] : iv_ruleEObjectType= ruleEObjectType EOF ;
    public final EObject entryRuleEObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectType = null;


        try {
            // InternalOCCI.g:2773:52: (iv_ruleEObjectType= ruleEObjectType EOF )
            // InternalOCCI.g:2774:2: iv_ruleEObjectType= ruleEObjectType EOF
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
    // InternalOCCI.g:2780:1: ruleEObjectType returns [EObject current=null] : (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEObjectType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_instanceClassName_3_0=null;
        Token otherlv_4=null;
        Token lv_documentation_5_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2786:2: ( (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2787:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2787:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2788:3: otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEObjectTypeAccess().getEObjectTypeKeyword_0());
            		
            // InternalOCCI.g:2792:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2793:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2793:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2794:5: lv_name_1_0= ruleTypeID
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

            // InternalOCCI.g:2811:3: (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==61) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalOCCI.g:2812:4: otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEObjectTypeAccess().getTypeKeyword_2_0());
                    			
                    // InternalOCCI.g:2816:4: ( (lv_instanceClassName_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2817:5: (lv_instanceClassName_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2817:5: (lv_instanceClassName_3_0= RULE_STRING )
                    // InternalOCCI.g:2818:6: lv_instanceClassName_3_0= RULE_STRING
                    {
                    lv_instanceClassName_3_0=(Token)match(input,RULE_STRING,FOLLOW_69); 

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

            // InternalOCCI.g:2835:3: (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==59) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalOCCI.g:2836:4: otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEObjectTypeAccess().getDocumentationKeyword_3_0());
                    			
                    // InternalOCCI.g:2840:4: ( (lv_documentation_5_0= RULE_STRING ) )
                    // InternalOCCI.g:2841:5: (lv_documentation_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2841:5: (lv_documentation_5_0= RULE_STRING )
                    // InternalOCCI.g:2842:6: lv_documentation_5_0= RULE_STRING
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
    // InternalOCCI.g:2863:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalOCCI.g:2863:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalOCCI.g:2864:2: iv_ruleBooleanType= ruleBooleanType EOF
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
    // InternalOCCI.g:2870:1: ruleBooleanType returns [EObject current=null] : (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_documentation_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2876:2: ( (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2877:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2877:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2878:3: otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_0());
            		
            // InternalOCCI.g:2882:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2883:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2883:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2884:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getBooleanTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_69);
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

            // InternalOCCI.g:2901:3: (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==59) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalOCCI.g:2902:4: otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanTypeAccess().getDocumentationKeyword_2_0());
                    			
                    // InternalOCCI.g:2906:4: ( (lv_documentation_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2907:5: (lv_documentation_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2907:5: (lv_documentation_3_0= RULE_STRING )
                    // InternalOCCI.g:2908:6: lv_documentation_3_0= RULE_STRING
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
    // InternalOCCI.g:2929:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // InternalOCCI.g:2929:52: (iv_ruleNumericType= ruleNumericType EOF )
            // InternalOCCI.g:2930:2: iv_ruleNumericType= ruleNumericType EOF
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
    // InternalOCCI.g:2936:1: ruleNumericType returns [EObject current=null] : (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )? (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_minExclusive_7_0=null;
        Token otherlv_8=null;
        Token lv_maxExclusive_9_0=null;
        Token otherlv_10=null;
        Token lv_minInclusive_11_0=null;
        Token otherlv_12=null;
        Token lv_maxInclusive_13_0=null;
        Token otherlv_14=null;
        Token lv_documentation_15_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_totalDigits_5_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2942:2: ( (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )? (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2943:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )? (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2943:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )? (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2944:3: otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )? (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNumericTypeAccess().getNumericTypeKeyword_0());
            		
            // InternalOCCI.g:2948:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2949:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2949:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2950:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getNumericTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_71);
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

            otherlv_2=(Token)match(input,61,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericTypeAccess().getTypeKeyword_2());
            		
            // InternalOCCI.g:2971:3: ( (lv_type_3_0= ruleNumericTypeEnum ) )
            // InternalOCCI.g:2972:4: (lv_type_3_0= ruleNumericTypeEnum )
            {
            // InternalOCCI.g:2972:4: (lv_type_3_0= ruleNumericTypeEnum )
            // InternalOCCI.g:2973:5: lv_type_3_0= ruleNumericTypeEnum
            {

            					newCompositeNode(grammarAccess.getNumericTypeAccess().getTypeNumericTypeEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_73);
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

            // InternalOCCI.g:2990:3: (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==64) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalOCCI.g:2991:4: otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_66); 

                    				newLeafNode(otherlv_4, grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_4_0());
                    			
                    // InternalOCCI.g:2995:4: ( (lv_totalDigits_5_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2996:5: (lv_totalDigits_5_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2996:5: (lv_totalDigits_5_0= ruleEIntegerObject )
                    // InternalOCCI.g:2997:6: lv_totalDigits_5_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getNumericTypeAccess().getTotalDigitsEIntegerObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_totalDigits_5_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumericTypeRule());
                    						}
                    						set(
                    							current,
                    							"totalDigits",
                    							lv_totalDigits_5_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:3015:3: (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==65) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalOCCI.g:3016:4: otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,65,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_5_0());
                    			
                    // InternalOCCI.g:3020:4: ( (lv_minExclusive_7_0= RULE_STRING ) )
                    // InternalOCCI.g:3021:5: (lv_minExclusive_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3021:5: (lv_minExclusive_7_0= RULE_STRING )
                    // InternalOCCI.g:3022:6: lv_minExclusive_7_0= RULE_STRING
                    {
                    lv_minExclusive_7_0=(Token)match(input,RULE_STRING,FOLLOW_75); 

                    						newLeafNode(lv_minExclusive_7_0, grammarAccess.getNumericTypeAccess().getMinExclusiveSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minExclusive",
                    							lv_minExclusive_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:3039:3: (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==66) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalOCCI.g:3040:4: otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,66,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_6_0());
                    			
                    // InternalOCCI.g:3044:4: ( (lv_maxExclusive_9_0= RULE_STRING ) )
                    // InternalOCCI.g:3045:5: (lv_maxExclusive_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3045:5: (lv_maxExclusive_9_0= RULE_STRING )
                    // InternalOCCI.g:3046:6: lv_maxExclusive_9_0= RULE_STRING
                    {
                    lv_maxExclusive_9_0=(Token)match(input,RULE_STRING,FOLLOW_76); 

                    						newLeafNode(lv_maxExclusive_9_0, grammarAccess.getNumericTypeAccess().getMaxExclusiveSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxExclusive",
                    							lv_maxExclusive_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:3063:3: (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==67) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalOCCI.g:3064:4: otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,67,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_7_0());
                    			
                    // InternalOCCI.g:3068:4: ( (lv_minInclusive_11_0= RULE_STRING ) )
                    // InternalOCCI.g:3069:5: (lv_minInclusive_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3069:5: (lv_minInclusive_11_0= RULE_STRING )
                    // InternalOCCI.g:3070:6: lv_minInclusive_11_0= RULE_STRING
                    {
                    lv_minInclusive_11_0=(Token)match(input,RULE_STRING,FOLLOW_77); 

                    						newLeafNode(lv_minInclusive_11_0, grammarAccess.getNumericTypeAccess().getMinInclusiveSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minInclusive",
                    							lv_minInclusive_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:3087:3: (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==68) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalOCCI.g:3088:4: otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,68,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_8_0());
                    			
                    // InternalOCCI.g:3092:4: ( (lv_maxInclusive_13_0= RULE_STRING ) )
                    // InternalOCCI.g:3093:5: (lv_maxInclusive_13_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3093:5: (lv_maxInclusive_13_0= RULE_STRING )
                    // InternalOCCI.g:3094:6: lv_maxInclusive_13_0= RULE_STRING
                    {
                    lv_maxInclusive_13_0=(Token)match(input,RULE_STRING,FOLLOW_69); 

                    						newLeafNode(lv_maxInclusive_13_0, grammarAccess.getNumericTypeAccess().getMaxInclusiveSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxInclusive",
                    							lv_maxInclusive_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:3111:3: (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==59) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalOCCI.g:3112:4: otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getNumericTypeAccess().getDocumentationKeyword_9_0());
                    			
                    // InternalOCCI.g:3116:4: ( (lv_documentation_15_0= RULE_STRING ) )
                    // InternalOCCI.g:3117:5: (lv_documentation_15_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3117:5: (lv_documentation_15_0= RULE_STRING )
                    // InternalOCCI.g:3118:6: lv_documentation_15_0= RULE_STRING
                    {
                    lv_documentation_15_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_documentation_15_0, grammarAccess.getNumericTypeAccess().getDocumentationSTRINGTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumericTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_15_0,
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
    // InternalOCCI.g:3139:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // InternalOCCI.g:3139:56: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // InternalOCCI.g:3140:2: iv_ruleEnumerationType= ruleEnumerationType EOF
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
    // InternalOCCI.g:3146:1: ruleEnumerationType returns [EObject current=null] : (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_documentation_9_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_literals_4_0 = null;

        EObject lv_literals_6_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3152:2: ( (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3153:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3153:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3154:3: otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,69,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0());
            		
            // InternalOCCI.g:3158:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:3159:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:3159:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:3160:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_78);
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

            otherlv_2=(Token)match(input,70,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_3());
            		
            // InternalOCCI.g:3185:3: ( (lv_literals_4_0= ruleEnumerationLiteral ) )
            // InternalOCCI.g:3186:4: (lv_literals_4_0= ruleEnumerationLiteral )
            {
            // InternalOCCI.g:3186:4: (lv_literals_4_0= ruleEnumerationLiteral )
            // InternalOCCI.g:3187:5: lv_literals_4_0= ruleEnumerationLiteral
            {

            					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalOCCI.g:3204:3: (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==38) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalOCCI.g:3205:4: otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_5=(Token)match(input,38,FOLLOW_10); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalOCCI.g:3209:4: ( (lv_literals_6_0= ruleEnumerationLiteral ) )
            	    // InternalOCCI.g:3210:5: (lv_literals_6_0= ruleEnumerationLiteral )
            	    {
            	    // InternalOCCI.g:3210:5: (lv_literals_6_0= ruleEnumerationLiteral )
            	    // InternalOCCI.g:3211:6: lv_literals_6_0= ruleEnumerationLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
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
            	    break loop77;
                }
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_69); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_6());
            		
            // InternalOCCI.g:3233:3: (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==59) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalOCCI.g:3234:4: otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnumerationTypeAccess().getDocumentationKeyword_7_0());
                    			
                    // InternalOCCI.g:3238:4: ( (lv_documentation_9_0= RULE_STRING ) )
                    // InternalOCCI.g:3239:5: (lv_documentation_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3239:5: (lv_documentation_9_0= RULE_STRING )
                    // InternalOCCI.g:3240:6: lv_documentation_9_0= RULE_STRING
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
    // InternalOCCI.g:3261:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalOCCI.g:3261:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalOCCI.g:3262:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalOCCI.g:3268:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_documentation_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3274:2: ( ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3275:2: ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3275:2: ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3276:3: ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )?
            {
            // InternalOCCI.g:3276:3: ( (lv_name_0_0= ruleTypeID ) )
            // InternalOCCI.g:3277:4: (lv_name_0_0= ruleTypeID )
            {
            // InternalOCCI.g:3277:4: (lv_name_0_0= ruleTypeID )
            // InternalOCCI.g:3278:5: lv_name_0_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getNameTypeIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_69);
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

            // InternalOCCI.g:3295:3: (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==59) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalOCCI.g:3296:4: otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getDocumentationKeyword_1_0());
                    			
                    // InternalOCCI.g:3300:4: ( (lv_documentation_2_0= RULE_STRING ) )
                    // InternalOCCI.g:3301:5: (lv_documentation_2_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3301:5: (lv_documentation_2_0= RULE_STRING )
                    // InternalOCCI.g:3302:6: lv_documentation_2_0= RULE_STRING
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
    // InternalOCCI.g:3323:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // InternalOCCI.g:3323:51: (iv_ruleRecordType= ruleRecordType EOF )
            // InternalOCCI.g:3324:2: iv_ruleRecordType= ruleRecordType EOF
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
    // InternalOCCI.g:3330:1: ruleRecordType returns [EObject current=null] : (otherlv_0= 'record' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= '{' ( (lv_recordFields_3_0= ruleRecordField ) ) (otherlv_4= ',' ( (lv_recordFields_5_0= ruleRecordField ) ) )* otherlv_6= '}' (otherlv_7= 'documentation' ( (lv_documentation_8_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_documentation_8_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_recordFields_3_0 = null;

        EObject lv_recordFields_5_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3336:2: ( (otherlv_0= 'record' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= '{' ( (lv_recordFields_3_0= ruleRecordField ) ) (otherlv_4= ',' ( (lv_recordFields_5_0= ruleRecordField ) ) )* otherlv_6= '}' (otherlv_7= 'documentation' ( (lv_documentation_8_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3337:2: (otherlv_0= 'record' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= '{' ( (lv_recordFields_3_0= ruleRecordField ) ) (otherlv_4= ',' ( (lv_recordFields_5_0= ruleRecordField ) ) )* otherlv_6= '}' (otherlv_7= 'documentation' ( (lv_documentation_8_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3337:2: (otherlv_0= 'record' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= '{' ( (lv_recordFields_3_0= ruleRecordField ) ) (otherlv_4= ',' ( (lv_recordFields_5_0= ruleRecordField ) ) )* otherlv_6= '}' (otherlv_7= 'documentation' ( (lv_documentation_8_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3338:3: otherlv_0= 'record' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= '{' ( (lv_recordFields_3_0= ruleRecordField ) ) (otherlv_4= ',' ( (lv_recordFields_5_0= ruleRecordField ) ) )* otherlv_6= '}' (otherlv_7= 'documentation' ( (lv_documentation_8_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getRecordKeyword_0());
            		
            // InternalOCCI.g:3342:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:3343:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:3343:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:3344:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOCCI.g:3365:3: ( (lv_recordFields_3_0= ruleRecordField ) )
            // InternalOCCI.g:3366:4: (lv_recordFields_3_0= ruleRecordField )
            {
            // InternalOCCI.g:3366:4: (lv_recordFields_3_0= ruleRecordField )
            // InternalOCCI.g:3367:5: lv_recordFields_3_0= ruleRecordField
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
            lv_recordFields_3_0=ruleRecordField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            					}
            					add(
            						current,
            						"recordFields",
            						lv_recordFields_3_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.RecordField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:3384:3: (otherlv_4= ',' ( (lv_recordFields_5_0= ruleRecordField ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==38) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalOCCI.g:3385:4: otherlv_4= ',' ( (lv_recordFields_5_0= ruleRecordField ) )
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRecordTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalOCCI.g:3389:4: ( (lv_recordFields_5_0= ruleRecordField ) )
            	    // InternalOCCI.g:3390:5: (lv_recordFields_5_0= ruleRecordField )
            	    {
            	    // InternalOCCI.g:3390:5: (lv_recordFields_5_0= ruleRecordField )
            	    // InternalOCCI.g:3391:6: lv_recordFields_5_0= ruleRecordField
            	    {

            	    						newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_69); 

            			newLeafNode(otherlv_6, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalOCCI.g:3413:3: (otherlv_7= 'documentation' ( (lv_documentation_8_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==59) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalOCCI.g:3414:4: otherlv_7= 'documentation' ( (lv_documentation_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getRecordTypeAccess().getDocumentationKeyword_6_0());
                    			
                    // InternalOCCI.g:3418:4: ( (lv_documentation_8_0= RULE_STRING ) )
                    // InternalOCCI.g:3419:5: (lv_documentation_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3419:5: (lv_documentation_8_0= RULE_STRING )
                    // InternalOCCI.g:3420:6: lv_documentation_8_0= RULE_STRING
                    {
                    lv_documentation_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_documentation_8_0, grammarAccess.getRecordTypeAccess().getDocumentationSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecordTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"documentation",
                    							lv_documentation_8_0,
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
    // InternalOCCI.g:3441:1: entryRuleRecordField returns [EObject current=null] : iv_ruleRecordField= ruleRecordField EOF ;
    public final EObject entryRuleRecordField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordField = null;


        try {
            // InternalOCCI.g:3441:52: (iv_ruleRecordField= ruleRecordField EOF )
            // InternalOCCI.g:3442:2: iv_ruleRecordField= ruleRecordField EOF
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
    // InternalOCCI.g:3448:1: ruleRecordField returns [EObject current=null] : ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= ':' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) ;
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
            // InternalOCCI.g:3454:2: ( ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= ':' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) )
            // InternalOCCI.g:3455:2: ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= ':' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            {
            // InternalOCCI.g:3455:2: ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= ':' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            // InternalOCCI.g:3456:3: ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= ':' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            {
            // InternalOCCI.g:3456:3: ( (lv_mutable_0_0= 'mutable' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==43) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==RULE_ID||LA82_1==RULE_QUALIFIED_ID||(LA82_1>=12 && LA82_1<=16)||LA82_1==19||LA82_1==21||(LA82_1>=24 && LA82_1<=27)||(LA82_1>=29 && LA82_1<=37)||(LA82_1>=39 && LA82_1<=60)||(LA82_1>=62 && LA82_1<=72)||(LA82_1>=74 && LA82_1<=81)) ) {
                    alt82=1;
                }
            }
            switch (alt82) {
                case 1 :
                    // InternalOCCI.g:3457:4: (lv_mutable_0_0= 'mutable' )
                    {
                    // InternalOCCI.g:3457:4: (lv_mutable_0_0= 'mutable' )
                    // InternalOCCI.g:3458:5: lv_mutable_0_0= 'mutable'
                    {
                    lv_mutable_0_0=(Token)match(input,43,FOLLOW_10); 

                    					newLeafNode(lv_mutable_0_0, grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:3470:3: ( (lv_required_1_0= 'required' ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==44) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==RULE_ID||LA83_1==RULE_QUALIFIED_ID||(LA83_1>=12 && LA83_1<=16)||LA83_1==19||LA83_1==21||(LA83_1>=24 && LA83_1<=27)||(LA83_1>=29 && LA83_1<=37)||(LA83_1>=39 && LA83_1<=60)||(LA83_1>=62 && LA83_1<=72)||(LA83_1>=74 && LA83_1<=81)) ) {
                    alt83=1;
                }
            }
            switch (alt83) {
                case 1 :
                    // InternalOCCI.g:3471:4: (lv_required_1_0= 'required' )
                    {
                    // InternalOCCI.g:3471:4: (lv_required_1_0= 'required' )
                    // InternalOCCI.g:3472:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,44,FOLLOW_10); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:3484:3: ( (lv_name_2_0= ruleQualifiedID ) )
            // InternalOCCI.g:3485:4: (lv_name_2_0= ruleQualifiedID )
            {
            // InternalOCCI.g:3485:4: (lv_name_2_0= ruleQualifiedID )
            // InternalOCCI.g:3486:5: lv_name_2_0= ruleQualifiedID
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

            // InternalOCCI.g:3503:3: (otherlv_3= ':' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:3504:4: otherlv_3= ':' ( ( ruleQualifiedID ) )
            {
            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            				newLeafNode(otherlv_3, grammarAccess.getRecordFieldAccess().getColonKeyword_3_0());
            			
            // InternalOCCI.g:3508:4: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:3509:5: ( ruleQualifiedID )
            {
            // InternalOCCI.g:3509:5: ( ruleQualifiedID )
            // InternalOCCI.g:3510:6: ruleQualifiedID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRecordFieldRule());
            						}
            					

            						newCompositeNode(grammarAccess.getRecordFieldAccess().getTypeDataTypeCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_52);
            ruleQualifiedID();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOCCI.g:3525:3: (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==28) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalOCCI.g:3526:4: otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRecordFieldAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalOCCI.g:3530:4: ( (lv_default_6_0= RULE_STRING ) )
                    // InternalOCCI.g:3531:5: (lv_default_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3531:5: (lv_default_6_0= RULE_STRING )
                    // InternalOCCI.g:3532:6: lv_default_6_0= RULE_STRING
                    {
                    lv_default_6_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

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

            // InternalOCCI.g:3549:3: (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==13) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalOCCI.g:3550:4: otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getRecordFieldAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalOCCI.g:3554:4: ( (lv_description_8_0= RULE_STRING ) )
                    // InternalOCCI.g:3555:5: (lv_description_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3555:5: (lv_description_8_0= RULE_STRING )
                    // InternalOCCI.g:3556:6: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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

            // InternalOCCI.g:3573:3: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==37) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalOCCI.g:3574:4: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getRecordFieldAccess().getAnnotationsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,22,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOCCI.g:3582:4: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // InternalOCCI.g:3583:5: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:3583:5: (lv_annotations_11_0= ruleAnnotation )
                    // InternalOCCI.g:3584:6: lv_annotations_11_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_44);
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

                    // InternalOCCI.g:3601:4: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==38) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalOCCI.g:3602:5: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,38,FOLLOW_43); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRecordFieldAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOCCI.g:3606:5: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:3607:6: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:3607:6: (lv_annotations_13_0= ruleAnnotation )
                    	    // InternalOCCI.g:3608:7: lv_annotations_13_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
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
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,23,FOLLOW_2); 

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
    // InternalOCCI.g:3635:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalOCCI.g:3635:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalOCCI.g:3636:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalOCCI.g:3642:1: ruleArrayType returns [EObject current=null] : (otherlv_0= 'array' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_documentation_5_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3648:2: ( (otherlv_0= 'array' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3649:2: (otherlv_0= 'array' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3649:2: (otherlv_0= 'array' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3650:3: otherlv_0= 'array' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getArrayKeyword_0());
            		
            // InternalOCCI.g:3654:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:3655:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:3655:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:3656:5: lv_name_1_0= ruleTypeID
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

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:3677:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:3678:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:3678:4: ( ruleQualifiedID )
            // InternalOCCI.g:3679:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArrayTypeAccess().getTypeDataTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_69);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:3693:3: (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==59) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalOCCI.g:3694:4: otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getDocumentationKeyword_4_0());
                    			
                    // InternalOCCI.g:3698:4: ( (lv_documentation_5_0= RULE_STRING ) )
                    // InternalOCCI.g:3699:5: (lv_documentation_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3699:5: (lv_documentation_5_0= RULE_STRING )
                    // InternalOCCI.g:3700:6: lv_documentation_5_0= RULE_STRING
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
    // InternalOCCI.g:3721:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalOCCI.g:3721:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalOCCI.g:3722:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalOCCI.g:3728:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOCCI.g:3734:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalOCCI.g:3735:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalOCCI.g:3735:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalOCCI.g:3736:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalOCCI.g:3736:3: (kw= '-' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==73) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalOCCI.g:3737:4: kw= '-'
                    {
                    kw=(Token)match(input,73,FOLLOW_79); 

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
    // InternalOCCI.g:3754:1: entryRuleTypeID returns [String current=null] : iv_ruleTypeID= ruleTypeID EOF ;
    public final String entryRuleTypeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeID = null;


        try {
            // InternalOCCI.g:3754:46: (iv_ruleTypeID= ruleTypeID EOF )
            // InternalOCCI.g:3755:2: iv_ruleTypeID= ruleTypeID EOF
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
    // InternalOCCI.g:3761:1: ruleTypeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleTypeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3767:2: ( (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalOCCI.g:3768:2: (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalOCCI.g:3768:2: (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID) ) {
                alt90=1;
            }
            else if ( ((LA90_0>=12 && LA90_0<=16)||LA90_0==19||LA90_0==21||(LA90_0>=24 && LA90_0<=27)||(LA90_0>=29 && LA90_0<=37)||(LA90_0>=39 && LA90_0<=60)||(LA90_0>=62 && LA90_0<=72)||(LA90_0>=74 && LA90_0<=81)) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalOCCI.g:3769:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getTypeIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3777:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalOCCI.g:3791:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // InternalOCCI.g:3791:51: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // InternalOCCI.g:3792:2: iv_ruleQualifiedID= ruleQualifiedID EOF
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
    // InternalOCCI.g:3798:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_QUALIFIED_ID_1=null;
        AntlrDatatypeRuleToken this_KEYWORD_2 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3804:2: ( (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) )
            // InternalOCCI.g:3805:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            {
            // InternalOCCI.g:3805:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            int alt91=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt91=1;
                }
                break;
            case RULE_QUALIFIED_ID:
                {
                alt91=2;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 19:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 39:
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
                alt91=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalOCCI.g:3806:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3814:3: this_QUALIFIED_ID_1= RULE_QUALIFIED_ID
                    {
                    this_QUALIFIED_ID_1=(Token)match(input,RULE_QUALIFIED_ID,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_ID_1);
                    		

                    			newLeafNode(this_QUALIFIED_ID_1, grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3822:3: this_KEYWORD_2= ruleKEYWORD
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
    // InternalOCCI.g:3836:1: entryRuleNameID returns [String current=null] : iv_ruleNameID= ruleNameID EOF ;
    public final String entryRuleNameID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameID = null;


        try {
            // InternalOCCI.g:3836:46: (iv_ruleNameID= ruleNameID EOF )
            // InternalOCCI.g:3837:2: iv_ruleNameID= ruleNameID EOF
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
    // InternalOCCI.g:3843:1: ruleNameID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleNameID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_KEYWORD_3 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3849:2: ( ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) )
            // InternalOCCI.g:3850:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            {
            // InternalOCCI.g:3850:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                alt93=1;
            }
            else if ( ((LA93_0>=12 && LA93_0<=16)||LA93_0==19||LA93_0==21||(LA93_0>=24 && LA93_0<=27)||(LA93_0>=29 && LA93_0<=37)||(LA93_0>=39 && LA93_0<=60)||(LA93_0>=62 && LA93_0<=72)||(LA93_0>=74 && LA93_0<=81)) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalOCCI.g:3851:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    {
                    // InternalOCCI.g:3851:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    // InternalOCCI.g:3852:4: this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )*
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_80); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalOCCI.g:3859:4: (this_ID_1= RULE_ID | kw= '-' )*
                    loop92:
                    do {
                        int alt92=3;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==RULE_ID) ) {
                            alt92=1;
                        }
                        else if ( (LA92_0==73) ) {
                            alt92=2;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalOCCI.g:3860:5: this_ID_1= RULE_ID
                    	    {
                    	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_80); 

                    	    					current.merge(this_ID_1);
                    	    				

                    	    					newLeafNode(this_ID_1, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_1_0());
                    	    				

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOCCI.g:3868:5: kw= '-'
                    	    {
                    	    kw=(Token)match(input,73,FOLLOW_80); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getNameIDAccess().getHyphenMinusKeyword_0_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3876:3: this_KEYWORD_3= ruleKEYWORD
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
    // InternalOCCI.g:3890:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalOCCI.g:3890:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalOCCI.g:3891:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalOCCI.g:3897:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixin' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'state' | kw= 'initial' | kw= 'final' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'documentation' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'record' | kw= 'array' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOCCI.g:3903:2: ( (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixin' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'state' | kw= 'initial' | kw= 'final' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'documentation' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'record' | kw= 'array' ) )
            // InternalOCCI.g:3904:2: (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixin' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'state' | kw= 'initial' | kw= 'final' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'documentation' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'record' | kw= 'array' )
            {
            // InternalOCCI.g:3904:2: (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixin' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'state' | kw= 'initial' | kw= 'final' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'documentation' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'record' | kw= 'array' )
            int alt94=61;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt94=1;
                }
                break;
            case 13:
                {
                alt94=2;
                }
                break;
            case 14:
                {
                alt94=3;
                }
                break;
            case 15:
                {
                alt94=4;
                }
                break;
            case 16:
                {
                alt94=5;
                }
                break;
            case 19:
                {
                alt94=6;
                }
                break;
            case 21:
                {
                alt94=7;
                }
                break;
            case 74:
                {
                alt94=8;
                }
                break;
            case 24:
                {
                alt94=9;
                }
                break;
            case 33:
                {
                alt94=10;
                }
                break;
            case 25:
                {
                alt94=11;
                }
                break;
            case 26:
                {
                alt94=12;
                }
                break;
            case 27:
                {
                alt94=13;
                }
                break;
            case 29:
                {
                alt94=14;
                }
                break;
            case 30:
                {
                alt94=15;
                }
                break;
            case 31:
                {
                alt94=16;
                }
                break;
            case 32:
                {
                alt94=17;
                }
                break;
            case 34:
                {
                alt94=18;
                }
                break;
            case 35:
                {
                alt94=19;
                }
                break;
            case 36:
                {
                alt94=20;
                }
                break;
            case 37:
                {
                alt94=21;
                }
                break;
            case 39:
                {
                alt94=22;
                }
                break;
            case 40:
                {
                alt94=23;
                }
                break;
            case 41:
                {
                alt94=24;
                }
                break;
            case 42:
                {
                alt94=25;
                }
                break;
            case 43:
                {
                alt94=26;
                }
                break;
            case 44:
                {
                alt94=27;
                }
                break;
            case 45:
                {
                alt94=28;
                }
                break;
            case 46:
                {
                alt94=29;
                }
                break;
            case 47:
                {
                alt94=30;
                }
                break;
            case 48:
                {
                alt94=31;
                }
                break;
            case 49:
                {
                alt94=32;
                }
                break;
            case 50:
                {
                alt94=33;
                }
                break;
            case 51:
                {
                alt94=34;
                }
                break;
            case 52:
                {
                alt94=35;
                }
                break;
            case 53:
                {
                alt94=36;
                }
                break;
            case 54:
                {
                alt94=37;
                }
                break;
            case 55:
                {
                alt94=38;
                }
                break;
            case 56:
                {
                alt94=39;
                }
                break;
            case 57:
                {
                alt94=40;
                }
                break;
            case 58:
                {
                alt94=41;
                }
                break;
            case 59:
                {
                alt94=42;
                }
                break;
            case 60:
                {
                alt94=43;
                }
                break;
            case 62:
                {
                alt94=44;
                }
                break;
            case 63:
                {
                alt94=45;
                }
                break;
            case 64:
                {
                alt94=46;
                }
                break;
            case 65:
                {
                alt94=47;
                }
                break;
            case 66:
                {
                alt94=48;
                }
                break;
            case 67:
                {
                alt94=49;
                }
                break;
            case 68:
                {
                alt94=50;
                }
                break;
            case 75:
                {
                alt94=51;
                }
                break;
            case 76:
                {
                alt94=52;
                }
                break;
            case 77:
                {
                alt94=53;
                }
                break;
            case 78:
                {
                alt94=54;
                }
                break;
            case 79:
                {
                alt94=55;
                }
                break;
            case 80:
                {
                alt94=56;
                }
                break;
            case 81:
                {
                alt94=57;
                }
                break;
            case 69:
                {
                alt94=58;
                }
                break;
            case 70:
                {
                alt94=59;
                }
                break;
            case 71:
                {
                alt94=60;
                }
                break;
            case 72:
                {
                alt94=61;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalOCCI.g:3905:3: kw= 'configuration'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConfigurationKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3911:3: kw= 'description'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDescriptionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3917:3: kw= 'location'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLocationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOCCI.g:3923:3: kw= 'use'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getUseKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOCCI.g:3929:3: kw= 'resource'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResourceKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOCCI.g:3935:3: kw= 'title'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTitleKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalOCCI.g:3941:3: kw= 'summary'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSummaryKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalOCCI.g:3947:3: kw= 'parts'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPartsKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalOCCI.g:3953:3: kw= 'link'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLinkKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalOCCI.g:3959:3: kw= 'kind'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKindKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalOCCI.g:3965:3: kw= 'target'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTargetKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalOCCI.g:3971:3: kw= 'mixin'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMixinKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalOCCI.g:3977:3: kw= 'attribute'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAttributeKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalOCCI.g:3983:3: kw= 'extension'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtensionKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalOCCI.g:3989:3: kw= 'specification'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSpecificationKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalOCCI.g:3995:3: kw= 'import'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getImportKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalOCCI.g:4001:3: kw= 'as'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAsKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalOCCI.g:4007:3: kw= 'extends'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtendsKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalOCCI.g:4013:3: kw= 'source'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSourceKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalOCCI.g:4019:3: kw= 'scheme'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSchemeKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalOCCI.g:4025:3: kw= 'annotations'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAnnotationsKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalOCCI.g:4031:3: kw= 'depends'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDependsKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalOCCI.g:4037:3: kw= 'applies'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAppliesKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalOCCI.g:4043:3: kw= 'key'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKeyKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalOCCI.g:4049:3: kw= 'value'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalOCCI.g:4055:3: kw= 'mutable'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMutableKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalOCCI.g:4061:3: kw= 'required'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRequiredKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalOCCI.g:4067:3: kw= 'action'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalOCCI.g:4073:3: kw= 'constraint'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConstraintKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalOCCI.g:4079:3: kw= 'body'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBodyKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalOCCI.g:4085:3: kw= 'FSM'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFSMKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalOCCI.g:4091:3: kw= 'state'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStateKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalOCCI.g:4097:3: kw= 'initial'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getInitialKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalOCCI.g:4103:3: kw= 'final'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFinalKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalOCCI.g:4109:3: kw= 'transitions'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTransitionsKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalOCCI.g:4115:3: kw= 'to'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getToKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalOCCI.g:4121:3: kw= 'StringType'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStringTypeKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalOCCI.g:4127:3: kw= 'pattern'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPatternKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalOCCI.g:4133:3: kw= 'length'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLengthKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalOCCI.g:4139:3: kw= 'minLength'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinLengthKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalOCCI.g:4145:3: kw= 'maxLength'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalOCCI.g:4151:3: kw= 'documentation'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDocumentationKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalOCCI.g:4157:3: kw= 'EObjectType'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEObjectTypeKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalOCCI.g:4163:3: kw= 'BooleanType'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBooleanTypeKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalOCCI.g:4169:3: kw= 'NumericType'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNumericTypeKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalOCCI.g:4175:3: kw= 'totalDigits'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTotalDigitsKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalOCCI.g:4181:3: kw= 'minExclusive'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinExclusiveKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalOCCI.g:4187:3: kw= 'maxExclusive'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxExclusiveKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalOCCI.g:4193:3: kw= 'minInclusive'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinInclusiveKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalOCCI.g:4199:3: kw= 'maxInclusive'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxInclusiveKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalOCCI.g:4205:3: kw= 'Byte'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getByteKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalOCCI.g:4211:3: kw= 'Double'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDoubleKeyword_51());
                    		

                    }
                    break;
                case 53 :
                    // InternalOCCI.g:4217:3: kw= 'Float'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFloatKeyword_52());
                    		

                    }
                    break;
                case 54 :
                    // InternalOCCI.g:4223:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIntegerKeyword_53());
                    		

                    }
                    break;
                case 55 :
                    // InternalOCCI.g:4229:3: kw= 'Long'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLongKeyword_54());
                    		

                    }
                    break;
                case 56 :
                    // InternalOCCI.g:4235:3: kw= 'Short'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getShortKeyword_55());
                    		

                    }
                    break;
                case 57 :
                    // InternalOCCI.g:4241:3: kw= 'BigDecimal'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBigDecimalKeyword_56());
                    		

                    }
                    break;
                case 58 :
                    // InternalOCCI.g:4247:3: kw= 'EnumerationType'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnumerationTypeKeyword_57());
                    		

                    }
                    break;
                case 59 :
                    // InternalOCCI.g:4253:3: kw= 'literals'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLiteralsKeyword_58());
                    		

                    }
                    break;
                case 60 :
                    // InternalOCCI.g:4259:3: kw= 'record'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRecordKeyword_59());
                    		

                    }
                    break;
                case 61 :
                    // InternalOCCI.g:4265:3: kw= 'array'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getArrayKeyword_60());
                    		

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
    // InternalOCCI.g:4274:1: ruleNumericTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) ;
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
            // InternalOCCI.g:4280:2: ( ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) )
            // InternalOCCI.g:4281:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            {
            // InternalOCCI.g:4281:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            int alt95=7;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt95=1;
                }
                break;
            case 76:
                {
                alt95=2;
                }
                break;
            case 77:
                {
                alt95=3;
                }
                break;
            case 78:
                {
                alt95=4;
                }
                break;
            case 79:
                {
                alt95=5;
                }
                break;
            case 80:
                {
                alt95=6;
                }
                break;
            case 81:
                {
                alt95=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalOCCI.g:4282:3: (enumLiteral_0= 'Byte' )
                    {
                    // InternalOCCI.g:4282:3: (enumLiteral_0= 'Byte' )
                    // InternalOCCI.g:4283:4: enumLiteral_0= 'Byte'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:4290:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalOCCI.g:4290:3: (enumLiteral_1= 'Double' )
                    // InternalOCCI.g:4291:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:4298:3: (enumLiteral_2= 'Float' )
                    {
                    // InternalOCCI.g:4298:3: (enumLiteral_2= 'Float' )
                    // InternalOCCI.g:4299:4: enumLiteral_2= 'Float'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOCCI.g:4306:3: (enumLiteral_3= 'Integer' )
                    {
                    // InternalOCCI.g:4306:3: (enumLiteral_3= 'Integer' )
                    // InternalOCCI.g:4307:4: enumLiteral_3= 'Integer'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOCCI.g:4314:3: (enumLiteral_4= 'Long' )
                    {
                    // InternalOCCI.g:4314:3: (enumLiteral_4= 'Long' )
                    // InternalOCCI.g:4315:4: enumLiteral_4= 'Long'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOCCI.g:4322:3: (enumLiteral_5= 'Short' )
                    {
                    // InternalOCCI.g:4322:3: (enumLiteral_5= 'Short' )
                    // InternalOCCI.g:4323:4: enumLiteral_5= 'Short'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOCCI.g:4330:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalOCCI.g:4330:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalOCCI.g:4331:4: enumLiteral_6= 'BigDecimal'
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


    protected DFA41 dfa41 = new DFA41(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String dfa_1s = "\77\uffff";
    static final String dfa_2s = "\1\uffff\1\2\2\uffff\5\3\66\uffff";
    static final String dfa_3s = "\2\5\2\uffff\1\4\1\5\1\15\2\5\1\4\1\15\3\5\1\4\1\22\3\5\1\4\1\5\1\15\2\5\1\4\1\5\1\15\2\5\1\4\1\5\1\22\2\5\1\4\1\5\1\15\2\5\12\4\1\15\1\4\1\22\1\4\1\15\11\4";
    static final String dfa_4s = "\2\121\2\uffff\1\56\1\121\1\56\2\121\2\56\3\121\2\44\3\121\1\57\1\121\1\57\2\121\1\56\1\121\1\56\2\121\1\44\1\121\1\44\2\121\1\57\1\121\1\57\2\121\1\56\1\44\1\57\2\56\2\44\2\57\2\56\2\44\2\57\1\56\1\44\1\57\2\56\2\44\2\57";
    static final String dfa_5s = "\2\uffff\1\2\1\1\73\uffff";
    static final String dfa_6s = "\77\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\2\4\uffff\5\2\2\uffff\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\11\2\1\uffff\4\2\1\1\21\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\1\uffff\1\3\4\uffff\1\3\1\4\3\3\1\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\2\3\3\1\5\1\2\10\3\1\6\1\uffff\6\3\1\7\1\10\16\3\1\uffff\13\3\1\uffff\10\3",
            "",
            "",
            "\1\2\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\1\uffff\1\2\4\uffff\1\2\1\11\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\13\1\3\10\2\1\12\1\uffff\6\2\1\14\1\15\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\3\uffff\1\3\4\uffff\1\2\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\6\uffff\1\2\1\16\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\20\1\3\10\2\1\17\1\uffff\6\2\1\21\1\22\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\6\uffff\1\2\1\23\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\24\1\3\10\2\1\25\1\uffff\6\2\1\26\1\27\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\10\uffff\1\2\3\uffff\1\2\5\uffff\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\2\3\uffff\1\2\4\uffff\1\3\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\3\1\uffff\1\3\4\uffff\1\3\1\30\3\3\1\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\2\3\3\1\31\1\2\10\3\1\32\1\uffff\6\3\1\33\1\34\16\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\6\uffff\1\3\1\35\3\3\1\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\2\3\3\1\36\1\2\10\3\1\37\1\uffff\6\3\1\40\1\41\16\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\6\uffff\1\3\1\42\3\3\1\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\2\3\3\1\43\1\2\10\3\1\44\1\uffff\6\3\1\45\1\46\16\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\15\uffff\1\2\21\uffff\1\2",
            "\1\2\3\uffff\1\3\15\uffff\1\2",
            "\1\3\1\uffff\1\3\4\uffff\5\3\1\uffff\1\2\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\7\3\1\47\1\3\1\uffff\26\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\6\uffff\5\3\1\uffff\1\2\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\7\3\1\50\1\3\1\uffff\26\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\6\uffff\5\3\1\uffff\1\2\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\7\3\1\51\1\3\1\uffff\26\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\10\uffff\1\2\41\uffff\1\2",
            "\1\3\1\uffff\1\3\4\uffff\1\3\1\52\3\3\2\uffff\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\11\3\1\uffff\10\3\1\53\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\10\uffff\1\3\30\uffff\1\2",
            "\1\3\6\uffff\1\3\1\54\3\3\2\uffff\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\11\3\1\uffff\10\3\1\55\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\6\uffff\1\3\1\56\3\3\2\uffff\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\11\3\1\uffff\10\3\1\57\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\1\uffff\1\2\4\uffff\1\2\1\60\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\13\1\3\10\2\1\61\1\uffff\6\2\1\14\1\15\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\3\uffff\1\3\4\uffff\1\2\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\6\uffff\1\2\1\62\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\20\1\3\10\2\1\63\1\uffff\6\2\1\21\1\22\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\6\uffff\1\2\1\64\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\24\1\3\10\2\1\65\1\uffff\6\2\1\26\1\27\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\15\uffff\1\3\21\uffff\1\3",
            "\1\2\1\uffff\1\2\4\uffff\5\2\1\uffff\1\3\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\7\2\1\66\1\2\1\uffff\26\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\3\uffff\1\2\15\uffff\1\3",
            "\1\2\6\uffff\5\2\1\uffff\1\3\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\7\2\1\67\1\2\1\uffff\26\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\6\uffff\5\2\1\uffff\1\3\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\7\2\1\70\1\2\1\uffff\26\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\10\uffff\1\3\41\uffff\1\3",
            "\1\2\1\uffff\1\2\4\uffff\1\2\1\71\3\2\2\uffff\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\11\2\1\uffff\10\2\1\72\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\10\uffff\1\2\30\uffff\1\3",
            "\1\2\6\uffff\1\2\1\73\3\2\2\uffff\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\11\2\1\uffff\10\2\1\74\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\6\uffff\1\2\1\75\3\2\2\uffff\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\11\2\1\uffff\10\2\1\76\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\15\uffff\1\3\21\uffff\1\3",
            "\1\2\10\uffff\1\3\41\uffff\1\3",
            "\1\2\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\15\uffff\1\3\21\uffff\1\3",
            "\1\2\15\uffff\1\3\21\uffff\1\3",
            "\1\2\10\uffff\1\3\41\uffff\1\3",
            "\1\2\10\uffff\1\3\41\uffff\1\3",
            "\1\3\10\uffff\1\2\3\uffff\1\2\5\uffff\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\2\3\uffff\1\2\4\uffff\1\3\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\3\15\uffff\1\2\21\uffff\1\2",
            "\1\2\3\uffff\1\3\15\uffff\1\2",
            "\1\3\10\uffff\1\2\41\uffff\1\2",
            "\1\2\10\uffff\1\3\30\uffff\1\2",
            "\1\3\10\uffff\1\2\3\uffff\1\2\5\uffff\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\3\15\uffff\1\2\21\uffff\1\2",
            "\1\3\10\uffff\1\2\41\uffff\1\2",
            "\1\3\10\uffff\1\2\3\uffff\1\2\5\uffff\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\3\10\uffff\1\2\3\uffff\1\2\5\uffff\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\3\15\uffff\1\2\21\uffff\1\2",
            "\1\3\15\uffff\1\2\21\uffff\1\2",
            "\1\3\10\uffff\1\2\41\uffff\1\2",
            "\1\3\10\uffff\1\2\41\uffff\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1687:3: ( (lv_mutable_1_0= 'mutable' ) )?";
        }
    }
    static final String[] dfa_8s = {
            "\1\2\1\uffff\1\2\4\uffff\5\2\2\uffff\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\11\2\1\uffff\5\2\1\1\20\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\1\uffff\1\3\4\uffff\1\3\1\4\3\3\1\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\2\3\3\1\5\1\2\10\3\1\6\1\uffff\6\3\1\7\1\10\16\3\1\uffff\13\3\1\uffff\10\3",
            "",
            "",
            "\1\2\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\1\uffff\1\2\4\uffff\1\2\1\11\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\13\1\3\10\2\1\12\1\uffff\6\2\1\14\1\15\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\3\uffff\1\3\4\uffff\1\2\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\6\uffff\1\2\1\16\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\20\1\3\10\2\1\17\1\uffff\6\2\1\21\1\22\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\6\uffff\1\2\1\23\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\24\1\3\10\2\1\25\1\uffff\6\2\1\26\1\27\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\10\uffff\1\2\3\uffff\1\2\5\uffff\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\2\3\uffff\1\2\4\uffff\1\3\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\3\1\uffff\1\3\4\uffff\1\3\1\30\3\3\1\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\2\3\3\1\31\1\2\10\3\1\32\1\uffff\6\3\1\33\1\34\16\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\6\uffff\1\3\1\35\3\3\1\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\2\3\3\1\36\1\2\10\3\1\37\1\uffff\6\3\1\40\1\41\16\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\6\uffff\1\3\1\42\3\3\1\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\2\3\3\1\43\1\2\10\3\1\44\1\uffff\6\3\1\45\1\46\16\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\15\uffff\1\2\21\uffff\1\2",
            "\1\2\3\uffff\1\3\15\uffff\1\2",
            "\1\3\1\uffff\1\3\4\uffff\5\3\1\uffff\1\2\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\7\3\1\47\1\3\1\uffff\26\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\6\uffff\5\3\1\uffff\1\2\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\7\3\1\50\1\3\1\uffff\26\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\6\uffff\5\3\1\uffff\1\2\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\7\3\1\51\1\3\1\uffff\26\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\10\uffff\1\2\41\uffff\1\2",
            "\1\3\1\uffff\1\3\4\uffff\1\3\1\52\3\3\2\uffff\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\11\3\1\uffff\10\3\1\53\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\10\uffff\1\3\30\uffff\1\2",
            "\1\3\6\uffff\1\3\1\54\3\3\2\uffff\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\11\3\1\uffff\10\3\1\55\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\3\6\uffff\1\3\1\56\3\3\2\uffff\1\3\1\uffff\1\3\2\uffff\4\3\1\uffff\11\3\1\uffff\10\3\1\57\15\3\1\uffff\13\3\1\uffff\10\3",
            "\1\2\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\1\uffff\1\2\4\uffff\1\2\1\60\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\13\1\3\10\2\1\61\1\uffff\6\2\1\14\1\15\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\3\uffff\1\3\4\uffff\1\2\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\6\uffff\1\2\1\62\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\20\1\3\10\2\1\63\1\uffff\6\2\1\21\1\22\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\6\uffff\1\2\1\64\3\2\1\3\1\uffff\1\2\1\uffff\1\2\1\uffff\1\3\3\2\1\24\1\3\10\2\1\65\1\uffff\6\2\1\26\1\27\16\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\15\uffff\1\3\21\uffff\1\3",
            "\1\2\1\uffff\1\2\4\uffff\5\2\1\uffff\1\3\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\7\2\1\66\1\2\1\uffff\26\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\3\uffff\1\2\15\uffff\1\3",
            "\1\2\6\uffff\5\2\1\uffff\1\3\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\7\2\1\67\1\2\1\uffff\26\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\6\uffff\5\2\1\uffff\1\3\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\7\2\1\70\1\2\1\uffff\26\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\10\uffff\1\3\41\uffff\1\3",
            "\1\2\1\uffff\1\2\4\uffff\1\2\1\71\3\2\2\uffff\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\11\2\1\uffff\10\2\1\72\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\3\10\uffff\1\2\30\uffff\1\3",
            "\1\2\6\uffff\1\2\1\73\3\2\2\uffff\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\11\2\1\uffff\10\2\1\74\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\6\uffff\1\2\1\75\3\2\2\uffff\1\2\1\uffff\1\2\2\uffff\4\2\1\uffff\11\2\1\uffff\10\2\1\76\15\2\1\uffff\13\2\1\uffff\10\2",
            "\1\2\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\15\uffff\1\3\21\uffff\1\3",
            "\1\2\10\uffff\1\3\41\uffff\1\3",
            "\1\2\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\10\uffff\1\3\3\uffff\1\3\5\uffff\1\3\3\uffff\2\3\10\uffff\1\3\7\uffff\2\3",
            "\1\2\15\uffff\1\3\21\uffff\1\3",
            "\1\2\15\uffff\1\3\21\uffff\1\3",
            "\1\2\10\uffff\1\3\41\uffff\1\3",
            "\1\2\10\uffff\1\3\41\uffff\1\3",
            "\1\3\10\uffff\1\2\3\uffff\1\2\5\uffff\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\2\3\uffff\1\2\4\uffff\1\3\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\3\15\uffff\1\2\21\uffff\1\2",
            "\1\2\3\uffff\1\3\15\uffff\1\2",
            "\1\3\10\uffff\1\2\41\uffff\1\2",
            "\1\2\10\uffff\1\3\30\uffff\1\2",
            "\1\3\10\uffff\1\2\3\uffff\1\2\5\uffff\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\3\15\uffff\1\2\21\uffff\1\2",
            "\1\3\10\uffff\1\2\41\uffff\1\2",
            "\1\3\10\uffff\1\2\3\uffff\1\2\5\uffff\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\3\10\uffff\1\2\3\uffff\1\2\5\uffff\1\2\3\uffff\2\2\10\uffff\1\2\7\uffff\2\2",
            "\1\3\15\uffff\1\2\21\uffff\1\2",
            "\1\3\15\uffff\1\2\21\uffff\1\2",
            "\1\3\10\uffff\1\2\41\uffff\1\2",
            "\1\3\10\uffff\1\2\41\uffff\1\2"
    };
    static final short[][] dfa_8 = unpackEncodedStringArray(dfa_8s);

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
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "1701:3: ( (lv_required_2_0= 'required' ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000401E002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000401C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004018002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xDFFFFFBFEF29F0A0L,0x000000000003FDFFL});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000644000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000604000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000D800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000009800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002044000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xD0400002C4002002L,0x00000000000001A0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xD0400002C4000002L,0x00000000000001A0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xD040000284000002L,0x00000000000001A0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xD040000384000002L,0x00000000000001A0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xD040000204000002L,0x00000000000001A0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001C02040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001802040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001002040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001002000400002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000600008000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000600008800000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001002000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000019000040000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000100000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000011000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000002000400002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002010022002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000002010002002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000002000002002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000002000040002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000800000002000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0020200000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0F80000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0F00000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0E00000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x2800000000000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x000000000003F800L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0800000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0800000000000002L,0x000000000000001EL});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0800000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000200L});

}