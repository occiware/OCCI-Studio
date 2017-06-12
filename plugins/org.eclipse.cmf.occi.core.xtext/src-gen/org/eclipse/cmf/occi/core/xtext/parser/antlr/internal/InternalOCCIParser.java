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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_QUALIFIED_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'configuration'", "'description'", "'location'", "'use'", "'('", "','", "')'", "'resource'", "':'", "'title'", "'summary'", "'parts'", "'{'", "'}'", "'link'", "'target'", "'mixinBase'", "'attribute'", "'='", "'extension'", "'specification'", "'import'", "'as'", "'kind'", "'extends'", "'source'", "'scheme'", "'annotations'", "'mixin'", "'depends'", "'applies'", "'key'", "'value'", "'mutable'", "'required'", "'type'", "'action'", "'constraint'", "'body'", "'FSM'", "'State'", "'initial'", "'final'", "'literal'", "'transitions'", "'to'", "'StringType'", "'pattern'", "'length'", "'minLength'", "'maxLength'", "'documentation'", "'EObjectType'", "'BooleanType'", "'NumericType'", "'totalDigits'", "'minExclusive'", "'maxExclusive'", "'minInclusive'", "'maxInclusive'", "'EnumerationType'", "'literals'", "'RecordType'", "'fields'", "'ArrayType'", "'-'", "'Byte'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'BigDecimal'"
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
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
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

            if ( (LA1_0==31) ) {
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
    // InternalOCCI.g:108:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= 'configuration' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) ) )? (otherlv_6= 'use' otherlv_7= '(' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= ')' )? ( (lv_resources_12_0= ruleResource ) )* ( (lv_mixins_13_0= ruleMixin ) )* ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token lv_location_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_resources_12_0 = null;

        EObject lv_mixins_13_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:114:2: ( ( () otherlv_1= 'configuration' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) ) )? (otherlv_6= 'use' otherlv_7= '(' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= ')' )? ( (lv_resources_12_0= ruleResource ) )* ( (lv_mixins_13_0= ruleMixin ) )* ) )
            // InternalOCCI.g:115:2: ( () otherlv_1= 'configuration' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) ) )? (otherlv_6= 'use' otherlv_7= '(' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= ')' )? ( (lv_resources_12_0= ruleResource ) )* ( (lv_mixins_13_0= ruleMixin ) )* )
            {
            // InternalOCCI.g:115:2: ( () otherlv_1= 'configuration' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) ) )? (otherlv_6= 'use' otherlv_7= '(' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= ')' )? ( (lv_resources_12_0= ruleResource ) )* ( (lv_mixins_13_0= ruleMixin ) )* )
            // InternalOCCI.g:116:3: () otherlv_1= 'configuration' (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'location' ( (lv_location_5_0= RULE_STRING ) ) )? (otherlv_6= 'use' otherlv_7= '(' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= ')' )? ( (lv_resources_12_0= ruleResource ) )* ( (lv_mixins_13_0= ruleMixin ) )*
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

            // InternalOCCI.g:175:3: (otherlv_6= 'use' otherlv_7= '(' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOCCI.g:176:4: otherlv_6= 'use' otherlv_7= '(' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getUseKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalOCCI.g:184:4: ( (otherlv_8= RULE_STRING ) )
                    // InternalOCCI.g:185:5: (otherlv_8= RULE_STRING )
                    {
                    // InternalOCCI.g:185:5: (otherlv_8= RULE_STRING )
                    // InternalOCCI.g:186:6: otherlv_8= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigurationRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(otherlv_8, grammarAccess.getConfigurationAccess().getUseExtensionCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalOCCI.g:197:4: (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalOCCI.g:198:5: otherlv_9= ',' ( (otherlv_10= RULE_STRING ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getConfigurationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOCCI.g:202:5: ( (otherlv_10= RULE_STRING ) )
                    	    // InternalOCCI.g:203:6: (otherlv_10= RULE_STRING )
                    	    {
                    	    // InternalOCCI.g:203:6: (otherlv_10= RULE_STRING )
                    	    // InternalOCCI.g:204:7: otherlv_10= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConfigurationRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getConfigurationAccess().getUseExtensionCrossReference_4_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getConfigurationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:221:3: ( (lv_resources_12_0= ruleResource ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOCCI.g:222:4: (lv_resources_12_0= ruleResource )
            	    {
            	    // InternalOCCI.g:222:4: (lv_resources_12_0= ruleResource )
            	    // InternalOCCI.g:223:5: lv_resources_12_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getResourcesResourceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_resources_12_0=ruleResource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_12_0,
            	    						"org.eclipse.cmf.occi.core.xtext.OCCI.Resource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalOCCI.g:240:3: ( (lv_mixins_13_0= ruleMixin ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==40) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOCCI.g:241:4: (lv_mixins_13_0= ruleMixin )
            	    {
            	    // InternalOCCI.g:241:4: (lv_mixins_13_0= ruleMixin )
            	    // InternalOCCI.g:242:5: lv_mixins_13_0= ruleMixin
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getMixinsMixinParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_mixins_13_0=ruleMixin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mixins",
            	    						lv_mixins_13_0,
            	    						"org.eclipse.cmf.occi.core.xtext.OCCI.Mixin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalOCCI.g:263:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalOCCI.g:263:49: (iv_ruleResource= ruleResource EOF )
            // InternalOCCI.g:264:2: iv_ruleResource= ruleResource EOF
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
    // InternalOCCI.g:270:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? (otherlv_10= 'parts' otherlv_11= '{' ( (lv_parts_12_0= ruleMixinBase ) ) (otherlv_13= ',' ( (lv_parts_14_0= ruleMixinBase ) ) )* otherlv_15= '}' )? ( (lv_attributes_16_0= ruleAttributeState ) )* ( (lv_links_17_0= ruleLink ) )* ) ;
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
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_parts_12_0 = null;

        EObject lv_parts_14_0 = null;

        EObject lv_attributes_16_0 = null;

        EObject lv_links_17_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:276:2: ( (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? (otherlv_10= 'parts' otherlv_11= '{' ( (lv_parts_12_0= ruleMixinBase ) ) (otherlv_13= ',' ( (lv_parts_14_0= ruleMixinBase ) ) )* otherlv_15= '}' )? ( (lv_attributes_16_0= ruleAttributeState ) )* ( (lv_links_17_0= ruleLink ) )* ) )
            // InternalOCCI.g:277:2: (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? (otherlv_10= 'parts' otherlv_11= '{' ( (lv_parts_12_0= ruleMixinBase ) ) (otherlv_13= ',' ( (lv_parts_14_0= ruleMixinBase ) ) )* otherlv_15= '}' )? ( (lv_attributes_16_0= ruleAttributeState ) )* ( (lv_links_17_0= ruleLink ) )* )
            {
            // InternalOCCI.g:277:2: (otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? (otherlv_10= 'parts' otherlv_11= '{' ( (lv_parts_12_0= ruleMixinBase ) ) (otherlv_13= ',' ( (lv_parts_14_0= ruleMixinBase ) ) )* otherlv_15= '}' )? ( (lv_attributes_16_0= ruleAttributeState ) )* ( (lv_links_17_0= ruleLink ) )* )
            // InternalOCCI.g:278:3: otherlv_0= 'resource' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? (otherlv_10= 'parts' otherlv_11= '{' ( (lv_parts_12_0= ruleMixinBase ) ) (otherlv_13= ',' ( (lv_parts_14_0= ruleMixinBase ) ) )* otherlv_15= '}' )? ( (lv_attributes_16_0= ruleAttributeState ) )* ( (lv_links_17_0= ruleLink ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
            		
            // InternalOCCI.g:282:3: ( (lv_id_1_0= RULE_STRING ) )
            // InternalOCCI.g:283:4: (lv_id_1_0= RULE_STRING )
            {
            // InternalOCCI.g:283:4: (lv_id_1_0= RULE_STRING )
            // InternalOCCI.g:284:5: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:304:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:305:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:305:4: ( ruleQualifiedID )
            // InternalOCCI.g:306:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getResourceAccess().getKindKindCrossReference_3_0());
            				
            pushFollow(FOLLOW_13);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:320:3: (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOCCI.g:321:4: otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getTitleKeyword_4_0());
                    			
                    // InternalOCCI.g:325:4: ( (lv_title_5_0= RULE_STRING ) )
                    // InternalOCCI.g:326:5: (lv_title_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:326:5: (lv_title_5_0= RULE_STRING )
                    // InternalOCCI.g:327:6: lv_title_5_0= RULE_STRING
                    {
                    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            // InternalOCCI.g:344:3: (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOCCI.g:345:4: otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getLocationKeyword_5_0());
                    			
                    // InternalOCCI.g:349:4: ( (lv_location_7_0= RULE_STRING ) )
                    // InternalOCCI.g:350:5: (lv_location_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:350:5: (lv_location_7_0= RULE_STRING )
                    // InternalOCCI.g:351:6: lv_location_7_0= RULE_STRING
                    {
                    lv_location_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            // InternalOCCI.g:368:3: (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOCCI.g:369:4: otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getSummaryKeyword_6_0());
                    			
                    // InternalOCCI.g:373:4: ( (lv_summary_9_0= RULE_STRING ) )
                    // InternalOCCI.g:374:5: (lv_summary_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:374:5: (lv_summary_9_0= RULE_STRING )
                    // InternalOCCI.g:375:6: lv_summary_9_0= RULE_STRING
                    {
                    lv_summary_9_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            // InternalOCCI.g:392:3: (otherlv_10= 'parts' otherlv_11= '{' ( (lv_parts_12_0= ruleMixinBase ) ) (otherlv_13= ',' ( (lv_parts_14_0= ruleMixinBase ) ) )* otherlv_15= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOCCI.g:393:4: otherlv_10= 'parts' otherlv_11= '{' ( (lv_parts_12_0= ruleMixinBase ) ) (otherlv_13= ',' ( (lv_parts_14_0= ruleMixinBase ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getResourceAccess().getPartsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalOCCI.g:401:4: ( (lv_parts_12_0= ruleMixinBase ) )
                    // InternalOCCI.g:402:5: (lv_parts_12_0= ruleMixinBase )
                    {
                    // InternalOCCI.g:402:5: (lv_parts_12_0= ruleMixinBase )
                    // InternalOCCI.g:403:6: lv_parts_12_0= ruleMixinBase
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getPartsMixinBaseParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_parts_12_0=ruleMixinBase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_12_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.MixinBase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:420:4: (otherlv_13= ',' ( (lv_parts_14_0= ruleMixinBase ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalOCCI.g:421:5: otherlv_13= ',' ( (lv_parts_14_0= ruleMixinBase ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FOLLOW_18); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalOCCI.g:425:5: ( (lv_parts_14_0= ruleMixinBase ) )
                    	    // InternalOCCI.g:426:6: (lv_parts_14_0= ruleMixinBase )
                    	    {
                    	    // InternalOCCI.g:426:6: (lv_parts_14_0= ruleMixinBase )
                    	    // InternalOCCI.g:427:7: lv_parts_14_0= ruleMixinBase
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getPartsMixinBaseParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_parts_14_0=ruleMixinBase();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_14_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.MixinBase");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:450:3: ( (lv_attributes_16_0= ruleAttributeState ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOCCI.g:451:4: (lv_attributes_16_0= ruleAttributeState )
            	    {
            	    // InternalOCCI.g:451:4: (lv_attributes_16_0= ruleAttributeState )
            	    // InternalOCCI.g:452:5: lv_attributes_16_0= ruleAttributeState
            	    {

            	    					newCompositeNode(grammarAccess.getResourceAccess().getAttributesAttributeStateParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_attributes_16_0=ruleAttributeState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResourceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_16_0,
            	    						"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalOCCI.g:469:3: ( (lv_links_17_0= ruleLink ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOCCI.g:470:4: (lv_links_17_0= ruleLink )
            	    {
            	    // InternalOCCI.g:470:4: (lv_links_17_0= ruleLink )
            	    // InternalOCCI.g:471:5: lv_links_17_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getResourceAccess().getLinksLinkParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_links_17_0=ruleLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResourceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"links",
            	    						lv_links_17_0,
            	    						"org.eclipse.cmf.occi.core.xtext.OCCI.Link");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleLink"
    // InternalOCCI.g:492:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalOCCI.g:492:45: (iv_ruleLink= ruleLink EOF )
            // InternalOCCI.g:493:2: iv_ruleLink= ruleLink EOF
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
    // InternalOCCI.g:499:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) ( (lv_attributes_10_0= ruleAttributeState ) )* ( (lv_parts_11_0= ruleMixinBase ) )* ) ;
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
        EObject lv_attributes_10_0 = null;

        EObject lv_parts_11_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:505:2: ( (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) ( (lv_attributes_10_0= ruleAttributeState ) )* ( (lv_parts_11_0= ruleMixinBase ) )* ) )
            // InternalOCCI.g:506:2: (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) ( (lv_attributes_10_0= ruleAttributeState ) )* ( (lv_parts_11_0= ruleMixinBase ) )* )
            {
            // InternalOCCI.g:506:2: (otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) ( (lv_attributes_10_0= ruleAttributeState ) )* ( (lv_parts_11_0= ruleMixinBase ) )* )
            // InternalOCCI.g:507:3: otherlv_0= 'link' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ruleQualifiedID ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'target' ( (otherlv_9= RULE_STRING ) ) ( (lv_attributes_10_0= ruleAttributeState ) )* ( (lv_parts_11_0= ruleMixinBase ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalOCCI.g:511:3: ( (lv_id_1_0= RULE_STRING ) )
            // InternalOCCI.g:512:4: (lv_id_1_0= RULE_STRING )
            {
            // InternalOCCI.g:512:4: (lv_id_1_0= RULE_STRING )
            // InternalOCCI.g:513:5: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:533:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:534:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:534:4: ( ruleQualifiedID )
            // InternalOCCI.g:535:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getKindKindCrossReference_3_0());
            				
            pushFollow(FOLLOW_22);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:549:3: (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOCCI.g:550:4: otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getTitleKeyword_4_0());
                    			
                    // InternalOCCI.g:554:4: ( (lv_title_5_0= RULE_STRING ) )
                    // InternalOCCI.g:555:5: (lv_title_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:555:5: (lv_title_5_0= RULE_STRING )
                    // InternalOCCI.g:556:6: lv_title_5_0= RULE_STRING
                    {
                    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            // InternalOCCI.g:573:3: (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOCCI.g:574:4: otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getLocationKeyword_5_0());
                    			
                    // InternalOCCI.g:578:4: ( (lv_location_7_0= RULE_STRING ) )
                    // InternalOCCI.g:579:5: (lv_location_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:579:5: (lv_location_7_0= RULE_STRING )
                    // InternalOCCI.g:580:6: lv_location_7_0= RULE_STRING
                    {
                    lv_location_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            otherlv_8=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getTargetKeyword_6());
            		
            // InternalOCCI.g:601:3: ( (otherlv_9= RULE_STRING ) )
            // InternalOCCI.g:602:4: (otherlv_9= RULE_STRING )
            {
            // InternalOCCI.g:602:4: (otherlv_9= RULE_STRING )
            // InternalOCCI.g:603:5: otherlv_9= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getTargetResourceCrossReference_7_0());
            				

            }


            }

            // InternalOCCI.g:614:3: ( (lv_attributes_10_0= ruleAttributeState ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOCCI.g:615:4: (lv_attributes_10_0= ruleAttributeState )
            	    {
            	    // InternalOCCI.g:615:4: (lv_attributes_10_0= ruleAttributeState )
            	    // InternalOCCI.g:616:5: lv_attributes_10_0= ruleAttributeState
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getAttributesAttributeStateParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_attributes_10_0=ruleAttributeState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_10_0,
            	    						"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalOCCI.g:633:3: ( (lv_parts_11_0= ruleMixinBase ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOCCI.g:634:4: (lv_parts_11_0= ruleMixinBase )
            	    {
            	    // InternalOCCI.g:634:4: (lv_parts_11_0= ruleMixinBase )
            	    // InternalOCCI.g:635:5: lv_parts_11_0= ruleMixinBase
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getPartsMixinBaseParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_parts_11_0=ruleMixinBase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
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
            	    break loop18;
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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleMixinBase"
    // InternalOCCI.g:656:1: entryRuleMixinBase returns [EObject current=null] : iv_ruleMixinBase= ruleMixinBase EOF ;
    public final EObject entryRuleMixinBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixinBase = null;


        try {
            // InternalOCCI.g:656:50: (iv_ruleMixinBase= ruleMixinBase EOF )
            // InternalOCCI.g:657:2: iv_ruleMixinBase= ruleMixinBase EOF
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
    // InternalOCCI.g:663:1: ruleMixinBase returns [EObject current=null] : (otherlv_0= 'mixinBase' ( ( ruleQualifiedID ) ) ( (lv_attributes_2_0= ruleAttributeState ) )* ) ;
    public final EObject ruleMixinBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:669:2: ( (otherlv_0= 'mixinBase' ( ( ruleQualifiedID ) ) ( (lv_attributes_2_0= ruleAttributeState ) )* ) )
            // InternalOCCI.g:670:2: (otherlv_0= 'mixinBase' ( ( ruleQualifiedID ) ) ( (lv_attributes_2_0= ruleAttributeState ) )* )
            {
            // InternalOCCI.g:670:2: (otherlv_0= 'mixinBase' ( ( ruleQualifiedID ) ) ( (lv_attributes_2_0= ruleAttributeState ) )* )
            // InternalOCCI.g:671:3: otherlv_0= 'mixinBase' ( ( ruleQualifiedID ) ) ( (lv_attributes_2_0= ruleAttributeState ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMixinBaseAccess().getMixinBaseKeyword_0());
            		
            // InternalOCCI.g:675:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:676:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:676:4: ( ruleQualifiedID )
            // InternalOCCI.g:677:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixinBaseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMixinBaseAccess().getMixinMixinCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:691:3: ( (lv_attributes_2_0= ruleAttributeState ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOCCI.g:692:4: (lv_attributes_2_0= ruleAttributeState )
            	    {
            	    // InternalOCCI.g:692:4: (lv_attributes_2_0= ruleAttributeState )
            	    // InternalOCCI.g:693:5: lv_attributes_2_0= ruleAttributeState
            	    {

            	    					newCompositeNode(grammarAccess.getMixinBaseAccess().getAttributesAttributeStateParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_attributes_2_0=ruleAttributeState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMixinBaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_2_0,
            	    						"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleMixinBase"


    // $ANTLR start "entryRuleAttributeState"
    // InternalOCCI.g:714:1: entryRuleAttributeState returns [EObject current=null] : iv_ruleAttributeState= ruleAttributeState EOF ;
    public final EObject entryRuleAttributeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeState = null;


        try {
            // InternalOCCI.g:714:55: (iv_ruleAttributeState= ruleAttributeState EOF )
            // InternalOCCI.g:715:2: iv_ruleAttributeState= ruleAttributeState EOF
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
    // InternalOCCI.g:721:1: ruleAttributeState returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttributeState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:727:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalOCCI.g:728:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalOCCI.g:728:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalOCCI.g:729:3: otherlv_0= 'attribute' ( (lv_name_1_0= ruleQualifiedID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeStateAccess().getAttributeKeyword_0());
            		
            // InternalOCCI.g:733:3: ( (lv_name_1_0= ruleQualifiedID ) )
            // InternalOCCI.g:734:4: (lv_name_1_0= ruleQualifiedID )
            {
            // InternalOCCI.g:734:4: (lv_name_1_0= ruleQualifiedID )
            // InternalOCCI.g:735:5: lv_name_1_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getAttributeStateAccess().getNameQualifiedIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_2=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeStateAccess().getEqualsSignKeyword_2());
            		
            // InternalOCCI.g:756:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalOCCI.g:757:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalOCCI.g:757:4: (lv_value_3_0= RULE_STRING )
            // InternalOCCI.g:758:5: lv_value_3_0= RULE_STRING
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
    // InternalOCCI.g:778:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // InternalOCCI.g:778:50: (iv_ruleExtension= ruleExtension EOF )
            // InternalOCCI.g:779:2: iv_ruleExtension= ruleExtension EOF
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
    // InternalOCCI.g:785:1: ruleExtension returns [EObject current=null] : (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* ) ;
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
            // InternalOCCI.g:791:2: ( (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* ) )
            // InternalOCCI.g:792:2: (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* )
            {
            // InternalOCCI.g:792:2: (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* )
            // InternalOCCI.g:793:3: otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionAccess().getExtensionKeyword_0());
            		
            // InternalOCCI.g:797:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:798:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:798:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:799:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getExtensionAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:820:3: ( (lv_scheme_3_0= RULE_STRING ) )
            // InternalOCCI.g:821:4: (lv_scheme_3_0= RULE_STRING )
            {
            // InternalOCCI.g:821:4: (lv_scheme_3_0= RULE_STRING )
            // InternalOCCI.g:822:5: lv_scheme_3_0= RULE_STRING
            {
            lv_scheme_3_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            // InternalOCCI.g:838:3: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOCCI.g:839:4: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalOCCI.g:843:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalOCCI.g:844:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:844:5: (lv_description_5_0= RULE_STRING )
                    // InternalOCCI.g:845:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalOCCI.g:862:3: (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOCCI.g:863:4: otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getExtensionAccess().getSpecificationKeyword_5_0());
                    			
                    // InternalOCCI.g:867:4: ( (lv_specification_7_0= RULE_STRING ) )
                    // InternalOCCI.g:868:5: (lv_specification_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:868:5: (lv_specification_7_0= RULE_STRING )
                    // InternalOCCI.g:869:6: lv_specification_7_0= RULE_STRING
                    {
                    lv_specification_7_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            // InternalOCCI.g:886:3: (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOCCI.g:887:4: otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )?
            	    {
            	    otherlv_8=(Token)match(input,33,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getImportKeyword_6_0());
            	    			
            	    // InternalOCCI.g:891:4: ( (otherlv_9= RULE_STRING ) )
            	    // InternalOCCI.g:892:5: (otherlv_9= RULE_STRING )
            	    {
            	    // InternalOCCI.g:892:5: (otherlv_9= RULE_STRING )
            	    // InternalOCCI.g:893:6: otherlv_9= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExtensionRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_32); 

            	    						newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getImportExtensionCrossReference_6_1_0());
            	    					

            	    }


            	    }

            	    // InternalOCCI.g:904:4: (otherlv_10= 'as' this_ID_11= RULE_ID )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==34) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalOCCI.g:905:5: otherlv_10= 'as' this_ID_11= RULE_ID
            	            {
            	            otherlv_10=(Token)match(input,34,FOLLOW_33); 

            	            					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getAsKeyword_6_2_0());
            	            				
            	            this_ID_11=(Token)match(input,RULE_ID,FOLLOW_31); 

            	            					newLeafNode(this_ID_11, grammarAccess.getExtensionAccess().getIDTerminalRuleCall_6_2_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalOCCI.g:915:3: ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )*
            loop24:
            do {
                int alt24=4;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    alt24=1;
                    }
                    break;
                case 40:
                    {
                    alt24=2;
                    }
                    break;
                case 58:
                case 64:
                case 65:
                case 66:
                case 72:
                case 74:
                case 76:
                    {
                    alt24=3;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // InternalOCCI.g:916:4: ( (lv_kinds_12_0= ruleKind ) )
            	    {
            	    // InternalOCCI.g:916:4: ( (lv_kinds_12_0= ruleKind ) )
            	    // InternalOCCI.g:917:5: (lv_kinds_12_0= ruleKind )
            	    {
            	    // InternalOCCI.g:917:5: (lv_kinds_12_0= ruleKind )
            	    // InternalOCCI.g:918:6: lv_kinds_12_0= ruleKind
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    // InternalOCCI.g:936:4: ( (lv_mixins_13_0= ruleMixin ) )
            	    {
            	    // InternalOCCI.g:936:4: ( (lv_mixins_13_0= ruleMixin ) )
            	    // InternalOCCI.g:937:5: (lv_mixins_13_0= ruleMixin )
            	    {
            	    // InternalOCCI.g:937:5: (lv_mixins_13_0= ruleMixin )
            	    // InternalOCCI.g:938:6: lv_mixins_13_0= ruleMixin
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    // InternalOCCI.g:956:4: ( (lv_types_14_0= ruleDataType ) )
            	    {
            	    // InternalOCCI.g:956:4: ( (lv_types_14_0= ruleDataType ) )
            	    // InternalOCCI.g:957:5: (lv_types_14_0= ruleDataType )
            	    {
            	    // InternalOCCI.g:957:5: (lv_types_14_0= ruleDataType )
            	    // InternalOCCI.g:958:6: lv_types_14_0= ruleDataType
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getTypesDataTypeParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop24;
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
    // InternalOCCI.g:980:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // InternalOCCI.g:980:45: (iv_ruleKind= ruleKind EOF )
            // InternalOCCI.g:981:2: iv_ruleKind= ruleKind EOF
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
    // InternalOCCI.g:987:1: ruleKind returns [EObject current=null] : (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? otherlv_8= 'scheme' ( (lv_scheme_9_0= RULE_STRING ) ) (otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) )? (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_scheme_9_0=null;
        Token otherlv_10=null;
        Token lv_title_11_0=null;
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
            // InternalOCCI.g:993:2: ( (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? otherlv_8= 'scheme' ( (lv_scheme_9_0= RULE_STRING ) ) (otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) )? (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? ) )
            // InternalOCCI.g:994:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? otherlv_8= 'scheme' ( (lv_scheme_9_0= RULE_STRING ) ) (otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) )? (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? )
            {
            // InternalOCCI.g:994:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? otherlv_8= 'scheme' ( (lv_scheme_9_0= RULE_STRING ) ) (otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) )? (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? )
            // InternalOCCI.g:995:3: otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? otherlv_8= 'scheme' ( (lv_scheme_9_0= RULE_STRING ) ) (otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) )? (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getKindAccess().getKindKeyword_0());
            		
            // InternalOCCI.g:999:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1000:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1000:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1001:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getKindAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalOCCI.g:1018:3: (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOCCI.g:1019:4: otherlv_2= 'extends' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getKindAccess().getExtendsKeyword_2_0());
                    			
                    // InternalOCCI.g:1023:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1024:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1024:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1025:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getParentKindCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1040:3: (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOCCI.g:1041:4: otherlv_4= 'source' ( ( ruleQualifiedID ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getKindAccess().getSourceKeyword_3_0());
                    			
                    // InternalOCCI.g:1045:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1046:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1046:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1047:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getSourceKindCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1062:3: (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOCCI.g:1063:4: otherlv_6= 'target' ( ( ruleQualifiedID ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getKindAccess().getTargetKeyword_4_0());
                    			
                    // InternalOCCI.g:1067:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1068:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1068:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1069:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getTargetKindCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getKindAccess().getSchemeKeyword_5());
            		
            // InternalOCCI.g:1088:3: ( (lv_scheme_9_0= RULE_STRING ) )
            // InternalOCCI.g:1089:4: (lv_scheme_9_0= RULE_STRING )
            {
            // InternalOCCI.g:1089:4: (lv_scheme_9_0= RULE_STRING )
            // InternalOCCI.g:1090:5: lv_scheme_9_0= RULE_STRING
            {
            lv_scheme_9_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_scheme_9_0, grammarAccess.getKindAccess().getSchemeSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKindRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scheme",
            						lv_scheme_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:1106:3: (otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOCCI.g:1107:4: otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getKindAccess().getTitleKeyword_7_0());
                    			
                    // InternalOCCI.g:1111:4: ( (lv_title_11_0= RULE_STRING ) )
                    // InternalOCCI.g:1112:5: (lv_title_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1112:5: (lv_title_11_0= RULE_STRING )
                    // InternalOCCI.g:1113:6: lv_title_11_0= RULE_STRING
                    {
                    lv_title_11_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_title_11_0, grammarAccess.getKindAccess().getTitleSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1130:3: (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOCCI.g:1131:4: otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')'
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_41); 

                    				newLeafNode(otherlv_12, grammarAccess.getKindAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalOCCI.g:1135:4: ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=4;
                        switch ( input.LA(1) ) {
                        case 29:
                            {
                            alt29=1;
                            }
                            break;
                        case 48:
                            {
                            alt29=2;
                            }
                            break;
                        case 49:
                            {
                            alt29=3;
                            }
                            break;

                        }

                        switch (alt29) {
                    	case 1 :
                    	    // InternalOCCI.g:1136:5: ( (lv_attributes_13_0= ruleAttribute ) )
                    	    {
                    	    // InternalOCCI.g:1136:5: ( (lv_attributes_13_0= ruleAttribute ) )
                    	    // InternalOCCI.g:1137:6: (lv_attributes_13_0= ruleAttribute )
                    	    {
                    	    // InternalOCCI.g:1137:6: (lv_attributes_13_0= ruleAttribute )
                    	    // InternalOCCI.g:1138:7: lv_attributes_13_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_8_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
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
                    	    // InternalOCCI.g:1156:5: ( (lv_actions_14_0= ruleAction ) )
                    	    {
                    	    // InternalOCCI.g:1156:5: ( (lv_actions_14_0= ruleAction ) )
                    	    // InternalOCCI.g:1157:6: (lv_actions_14_0= ruleAction )
                    	    {
                    	    // InternalOCCI.g:1157:6: (lv_actions_14_0= ruleAction )
                    	    // InternalOCCI.g:1158:7: lv_actions_14_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
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
                    	    // InternalOCCI.g:1176:5: ( (lv_constraints_15_0= ruleConstraint ) )
                    	    {
                    	    // InternalOCCI.g:1176:5: ( (lv_constraints_15_0= ruleConstraint ) )
                    	    // InternalOCCI.g:1177:6: (lv_constraints_15_0= ruleConstraint )
                    	    {
                    	    // InternalOCCI.g:1177:6: (lv_constraints_15_0= ruleConstraint )
                    	    // InternalOCCI.g:1178:7: lv_constraints_15_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getConstraintsConstraintParserRuleCall_8_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
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
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    otherlv_16=(Token)match(input,18,FOLLOW_43); 

                    				newLeafNode(otherlv_16, grammarAccess.getKindAccess().getRightParenthesisKeyword_8_2());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1201:3: ( (lv_fsm_17_0= ruleFSM ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOCCI.g:1202:4: (lv_fsm_17_0= ruleFSM )
                    {
                    // InternalOCCI.g:1202:4: (lv_fsm_17_0= ruleFSM )
                    // InternalOCCI.g:1203:5: lv_fsm_17_0= ruleFSM
                    {

                    					newCompositeNode(grammarAccess.getKindAccess().getFsmFSMParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_44);
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

            // InternalOCCI.g:1220:3: (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOCCI.g:1221:4: otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,39,FOLLOW_17); 

                    				newLeafNode(otherlv_18, grammarAccess.getKindAccess().getAnnotationsKeyword_10_0());
                    			
                    otherlv_19=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_19, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalOCCI.g:1229:4: ( (lv_annotations_20_0= ruleAnnotation ) )
                    // InternalOCCI.g:1230:5: (lv_annotations_20_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1230:5: (lv_annotations_20_0= ruleAnnotation )
                    // InternalOCCI.g:1231:6: lv_annotations_20_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalOCCI.g:1248:4: (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==17) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalOCCI.g:1249:5: otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_21=(Token)match(input,17,FOLLOW_7); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getKindAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalOCCI.g:1253:5: ( (lv_annotations_22_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1254:6: (lv_annotations_22_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1254:6: (lv_annotations_22_0= ruleAnnotation )
                    	    // InternalOCCI.g:1255:7: lv_annotations_22_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,25,FOLLOW_2); 

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
    // InternalOCCI.g:1282:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // InternalOCCI.g:1282:46: (iv_ruleMixin= ruleMixin EOF )
            // InternalOCCI.g:1283:2: iv_ruleMixin= ruleMixin EOF
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
    // InternalOCCI.g:1289:1: ruleMixin returns [EObject current=null] : (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? ) ;
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
            // InternalOCCI.g:1295:2: ( (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? ) )
            // InternalOCCI.g:1296:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? )
            {
            // InternalOCCI.g:1296:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? )
            // InternalOCCI.g:1297:3: otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMixinAccess().getMixinKeyword_0());
            		
            // InternalOCCI.g:1301:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1302:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1302:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1303:5: lv_name_1_0= ruleNameID
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

            // InternalOCCI.g:1320:3: (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOCCI.g:1321:4: otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getMixinAccess().getDependsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalOCCI.g:1329:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1330:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1330:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1331:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1345:4: (otherlv_5= ',' ( ( ruleQualifiedID ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==17) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalOCCI.g:1346:5: otherlv_5= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMixinAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalOCCI.g:1350:5: ( ( ruleQualifiedID ) )
                    	    // InternalOCCI.g:1351:6: ( ruleQualifiedID )
                    	    {
                    	    // InternalOCCI.g:1351:6: ( ruleQualifiedID )
                    	    // InternalOCCI.g:1352:7: ruleQualifiedID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMixinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_7=(Token)match(input,18,FOLLOW_46); 

                    				newLeafNode(otherlv_7, grammarAccess.getMixinAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1372:3: (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==42) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOCCI.g:1373:4: otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getMixinAccess().getAppliesKeyword_3_0());
                    			
                    otherlv_9=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalOCCI.g:1381:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1382:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1382:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1383:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1397:4: (otherlv_11= ',' ( ( ruleQualifiedID ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==17) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalOCCI.g:1398:5: otherlv_11= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMixinAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalOCCI.g:1402:5: ( ( ruleQualifiedID ) )
                    	    // InternalOCCI.g:1403:6: ( ruleQualifiedID )
                    	    {
                    	    // InternalOCCI.g:1403:6: ( ruleQualifiedID )
                    	    // InternalOCCI.g:1404:7: ruleQualifiedID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMixinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleQualifiedID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_38); 

                    				newLeafNode(otherlv_13, grammarAccess.getMixinAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getMixinAccess().getSchemeKeyword_4());
            		
            // InternalOCCI.g:1428:3: ( (lv_scheme_15_0= RULE_STRING ) )
            // InternalOCCI.g:1429:4: (lv_scheme_15_0= RULE_STRING )
            {
            // InternalOCCI.g:1429:4: (lv_scheme_15_0= RULE_STRING )
            // InternalOCCI.g:1430:5: lv_scheme_15_0= RULE_STRING
            {
            lv_scheme_15_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

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

            // InternalOCCI.g:1446:3: (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOCCI.g:1447:4: otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getMixinAccess().getTitleKeyword_6_0());
                    			
                    // InternalOCCI.g:1451:4: ( (lv_title_17_0= RULE_STRING ) )
                    // InternalOCCI.g:1452:5: (lv_title_17_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1452:5: (lv_title_17_0= RULE_STRING )
                    // InternalOCCI.g:1453:6: lv_title_17_0= RULE_STRING
                    {
                    lv_title_17_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

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

            // InternalOCCI.g:1470:3: (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==16) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOCCI.g:1471:4: otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')'
                    {
                    otherlv_18=(Token)match(input,16,FOLLOW_41); 

                    				newLeafNode(otherlv_18, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_7_0());
                    			
                    // InternalOCCI.g:1475:4: ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=4;
                        switch ( input.LA(1) ) {
                        case 29:
                            {
                            alt39=1;
                            }
                            break;
                        case 48:
                            {
                            alt39=2;
                            }
                            break;
                        case 49:
                            {
                            alt39=3;
                            }
                            break;

                        }

                        switch (alt39) {
                    	case 1 :
                    	    // InternalOCCI.g:1476:5: ( (lv_attributes_19_0= ruleAttribute ) )
                    	    {
                    	    // InternalOCCI.g:1476:5: ( (lv_attributes_19_0= ruleAttribute ) )
                    	    // InternalOCCI.g:1477:6: (lv_attributes_19_0= ruleAttribute )
                    	    {
                    	    // InternalOCCI.g:1477:6: (lv_attributes_19_0= ruleAttribute )
                    	    // InternalOCCI.g:1478:7: lv_attributes_19_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_7_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
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
                    	    // InternalOCCI.g:1496:5: ( (lv_actions_20_0= ruleAction ) )
                    	    {
                    	    // InternalOCCI.g:1496:5: ( (lv_actions_20_0= ruleAction ) )
                    	    // InternalOCCI.g:1497:6: (lv_actions_20_0= ruleAction )
                    	    {
                    	    // InternalOCCI.g:1497:6: (lv_actions_20_0= ruleAction )
                    	    // InternalOCCI.g:1498:7: lv_actions_20_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
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
                    	    // InternalOCCI.g:1516:5: ( (lv_constraints_21_0= ruleConstraint ) )
                    	    {
                    	    // InternalOCCI.g:1516:5: ( (lv_constraints_21_0= ruleConstraint ) )
                    	    // InternalOCCI.g:1517:6: (lv_constraints_21_0= ruleConstraint )
                    	    {
                    	    // InternalOCCI.g:1517:6: (lv_constraints_21_0= ruleConstraint )
                    	    // InternalOCCI.g:1518:7: lv_constraints_21_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getConstraintsConstraintParserRuleCall_7_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
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
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    otherlv_22=(Token)match(input,18,FOLLOW_44); 

                    				newLeafNode(otherlv_22, grammarAccess.getMixinAccess().getRightParenthesisKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1541:3: (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOCCI.g:1542:4: otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,39,FOLLOW_17); 

                    				newLeafNode(otherlv_23, grammarAccess.getMixinAccess().getAnnotationsKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_24, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalOCCI.g:1550:4: ( (lv_annotations_25_0= ruleAnnotation ) )
                    // InternalOCCI.g:1551:5: (lv_annotations_25_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1551:5: (lv_annotations_25_0= ruleAnnotation )
                    // InternalOCCI.g:1552:6: lv_annotations_25_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalOCCI.g:1569:4: (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==17) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalOCCI.g:1570:5: otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,17,FOLLOW_7); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getMixinAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalOCCI.g:1574:5: ( (lv_annotations_27_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1575:6: (lv_annotations_27_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1575:6: (lv_annotations_27_0= ruleAnnotation )
                    	    // InternalOCCI.g:1576:7: lv_annotations_27_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,25,FOLLOW_2); 

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
    // InternalOCCI.g:1603:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalOCCI.g:1603:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalOCCI.g:1604:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalOCCI.g:1610:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
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
            // InternalOCCI.g:1616:2: ( (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalOCCI.g:1617:2: (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalOCCI.g:1617:2: (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalOCCI.g:1618:3: otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getKeyKeyword_1());
            		
            // InternalOCCI.g:1626:3: ( (lv_key_2_0= RULE_STRING ) )
            // InternalOCCI.g:1627:4: (lv_key_2_0= RULE_STRING )
            {
            // InternalOCCI.g:1627:4: (lv_key_2_0= RULE_STRING )
            // InternalOCCI.g:1628:5: lv_key_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getValueKeyword_3());
            		
            // InternalOCCI.g:1648:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalOCCI.g:1649:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalOCCI.g:1649:4: (lv_value_4_0= RULE_STRING )
            // InternalOCCI.g:1650:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

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

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

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
    // InternalOCCI.g:1674:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOCCI.g:1674:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOCCI.g:1675:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOCCI.g:1681:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? ) ;
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
            // InternalOCCI.g:1687:2: ( (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? ) )
            // InternalOCCI.g:1688:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? )
            {
            // InternalOCCI.g:1688:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? )
            // InternalOCCI.g:1689:3: otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalOCCI.g:1693:3: ( (lv_mutable_1_0= 'mutable' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==45) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_ID||LA43_1==RULE_QUALIFIED_ID||(LA43_1>=12 && LA43_1<=15)||LA43_1==19||(LA43_1>=21 && LA43_1<=23)||(LA43_1>=26 && LA43_1<=29)||(LA43_1>=31 && LA43_1<=76)||(LA43_1>=78 && LA43_1<=84)) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalOCCI.g:1694:4: (lv_mutable_1_0= 'mutable' )
                    {
                    // InternalOCCI.g:1694:4: (lv_mutable_1_0= 'mutable' )
                    // InternalOCCI.g:1695:5: lv_mutable_1_0= 'mutable'
                    {
                    lv_mutable_1_0=(Token)match(input,45,FOLLOW_12); 

                    					newLeafNode(lv_mutable_1_0, grammarAccess.getAttributeAccess().getMutableMutableKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1707:3: ( (lv_required_2_0= 'required' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==RULE_ID||LA44_1==RULE_QUALIFIED_ID||(LA44_1>=12 && LA44_1<=15)||LA44_1==19||(LA44_1>=21 && LA44_1<=23)||(LA44_1>=26 && LA44_1<=29)||(LA44_1>=31 && LA44_1<=76)||(LA44_1>=78 && LA44_1<=84)) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalOCCI.g:1708:4: (lv_required_2_0= 'required' )
                    {
                    // InternalOCCI.g:1708:4: (lv_required_2_0= 'required' )
                    // InternalOCCI.g:1709:5: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,46,FOLLOW_12); 

                    					newLeafNode(lv_required_2_0, grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:1721:3: ( (lv_name_3_0= ruleQualifiedID ) )
            // InternalOCCI.g:1722:4: (lv_name_3_0= ruleQualifiedID )
            {
            // InternalOCCI.g:1722:4: (lv_name_3_0= ruleQualifiedID )
            // InternalOCCI.g:1723:5: lv_name_3_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameQualifiedIDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_4=(Token)match(input,20,FOLLOW_52); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4());
            		
            // InternalOCCI.g:1744:3: (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOCCI.g:1745:4: otherlv_5= 'type' ( ( ruleQualifiedID ) )
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getTypeKeyword_5_0());
                    			
                    // InternalOCCI.g:1749:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1750:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1750:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1751:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1766:3: (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOCCI.g:1767:4: otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getEqualsSignKeyword_6_0());
                    			
                    // InternalOCCI.g:1771:4: ( (lv_default_8_0= RULE_STRING ) )
                    // InternalOCCI.g:1772:5: (lv_default_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1772:5: (lv_default_8_0= RULE_STRING )
                    // InternalOCCI.g:1773:6: lv_default_8_0= RULE_STRING
                    {
                    lv_default_8_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

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

            // InternalOCCI.g:1790:3: (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==13) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOCCI.g:1791:4: otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalOCCI.g:1795:4: ( (lv_description_10_0= RULE_STRING ) )
                    // InternalOCCI.g:1796:5: (lv_description_10_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1796:5: (lv_description_10_0= RULE_STRING )
                    // InternalOCCI.g:1797:6: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            // InternalOCCI.g:1814:3: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==39) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOCCI.g:1815:4: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getAnnotationsKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalOCCI.g:1823:4: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // InternalOCCI.g:1824:5: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1824:5: (lv_annotations_13_0= ruleAnnotation )
                    // InternalOCCI.g:1825:6: lv_annotations_13_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalOCCI.g:1842:4: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==17) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalOCCI.g:1843:5: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FOLLOW_7); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalOCCI.g:1847:5: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1848:6: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1848:6: (lv_annotations_15_0= ruleAnnotation )
                    	    // InternalOCCI.g:1849:7: lv_annotations_15_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0());
                    	    						
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


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,25,FOLLOW_2); 

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
    // InternalOCCI.g:1876:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalOCCI.g:1876:47: (iv_ruleAction= ruleAction EOF )
            // InternalOCCI.g:1877:2: iv_ruleAction= ruleAction EOF
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
    // InternalOCCI.g:1883:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? otherlv_7= 'scheme' ( (lv_scheme_8_0= RULE_STRING ) ) (otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_scheme_8_0=null;
        Token otherlv_9=null;
        Token lv_title_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_annotations_13_0 = null;

        EObject lv_annotations_15_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1889:2: ( (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? otherlv_7= 'scheme' ( (lv_scheme_8_0= RULE_STRING ) ) (otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? ) )
            // InternalOCCI.g:1890:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? otherlv_7= 'scheme' ( (lv_scheme_8_0= RULE_STRING ) ) (otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? )
            {
            // InternalOCCI.g:1890:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? otherlv_7= 'scheme' ( (lv_scheme_8_0= RULE_STRING ) ) (otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? )
            // InternalOCCI.g:1891:3: otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )? otherlv_7= 'scheme' ( (lv_scheme_8_0= RULE_STRING ) ) (otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalOCCI.g:1895:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1896:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1896:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1897:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_55);
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

            // InternalOCCI.g:1914:3: (otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==16) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOCCI.g:1915:4: otherlv_2= '(' ( (lv_attributes_3_0= ruleParameterDecl ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalOCCI.g:1919:4: ( (lv_attributes_3_0= ruleParameterDecl ) )
                    // InternalOCCI.g:1920:5: (lv_attributes_3_0= ruleParameterDecl )
                    {
                    // InternalOCCI.g:1920:5: (lv_attributes_3_0= ruleParameterDecl )
                    // InternalOCCI.g:1921:6: lv_attributes_3_0= ruleParameterDecl
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalOCCI.g:1938:4: (otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==17) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalOCCI.g:1939:5: otherlv_4= ',' ( (lv_attributes_5_0= ruleParameterDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalOCCI.g:1943:5: ( (lv_attributes_5_0= ruleParameterDecl ) )
                    	    // InternalOCCI.g:1944:6: (lv_attributes_5_0= ruleParameterDecl )
                    	    {
                    	    // InternalOCCI.g:1944:6: (lv_attributes_5_0= ruleParameterDecl )
                    	    // InternalOCCI.g:1945:7: lv_attributes_5_0= ruleParameterDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,18,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getSchemeKeyword_3());
            		
            // InternalOCCI.g:1972:3: ( (lv_scheme_8_0= RULE_STRING ) )
            // InternalOCCI.g:1973:4: (lv_scheme_8_0= RULE_STRING )
            {
            // InternalOCCI.g:1973:4: (lv_scheme_8_0= RULE_STRING )
            // InternalOCCI.g:1974:5: lv_scheme_8_0= RULE_STRING
            {
            lv_scheme_8_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

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

            // InternalOCCI.g:1990:3: (otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==21) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOCCI.g:1991:4: otherlv_9= 'title' ( (lv_title_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionAccess().getTitleKeyword_5_0());
                    			
                    // InternalOCCI.g:1995:4: ( (lv_title_10_0= RULE_STRING ) )
                    // InternalOCCI.g:1996:5: (lv_title_10_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1996:5: (lv_title_10_0= RULE_STRING )
                    // InternalOCCI.g:1997:6: lv_title_10_0= RULE_STRING
                    {
                    lv_title_10_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

                    						newLeafNode(lv_title_10_0, grammarAccess.getActionAccess().getTitleSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2014:3: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==39) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOCCI.g:2015:4: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getAnnotationsKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOCCI.g:2023:4: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // InternalOCCI.g:2024:5: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:2024:5: (lv_annotations_13_0= ruleAnnotation )
                    // InternalOCCI.g:2025:6: lv_annotations_13_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalOCCI.g:2042:4: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==17) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalOCCI.g:2043:5: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FOLLOW_7); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getActionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOCCI.g:2047:5: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:2048:6: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:2048:6: (lv_annotations_15_0= ruleAnnotation )
                    	    // InternalOCCI.g:2049:7: lv_annotations_15_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0());
                    	    						
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


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6_4());
                    			

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
    // InternalOCCI.g:2076:1: entryRuleParameterDecl returns [EObject current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final EObject entryRuleParameterDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDecl = null;


        try {
            // InternalOCCI.g:2076:54: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalOCCI.g:2077:2: iv_ruleParameterDecl= ruleParameterDecl EOF
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
    // InternalOCCI.g:2083:1: ruleParameterDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleParameterDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_default_4_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2089:2: ( ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2090:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2090:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2091:3: ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            {
            // InternalOCCI.g:2091:3: ( (lv_name_0_0= ruleQualifiedID ) )
            // InternalOCCI.g:2092:4: (lv_name_0_0= ruleQualifiedID )
            {
            // InternalOCCI.g:2092:4: (lv_name_0_0= ruleQualifiedID )
            // InternalOCCI.g:2093:5: lv_name_0_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getParameterDeclAccess().getNameQualifiedIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDeclAccess().getColonKeyword_1());
            		
            // InternalOCCI.g:2114:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2115:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2115:4: ( ruleQualifiedID )
            // InternalOCCI.g:2116:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterDeclRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterDeclAccess().getTypeDataTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_57);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2130:3: (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==30) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOCCI.g:2131:4: otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDeclAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalOCCI.g:2135:4: ( (lv_default_4_0= RULE_STRING ) )
                    // InternalOCCI.g:2136:5: (lv_default_4_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2136:5: (lv_default_4_0= RULE_STRING )
                    // InternalOCCI.g:2137:6: lv_default_4_0= RULE_STRING
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
    // InternalOCCI.g:2158:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalOCCI.g:2158:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalOCCI.g:2159:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalOCCI.g:2165:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) ;
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
            // InternalOCCI.g:2171:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) )
            // InternalOCCI.g:2172:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            {
            // InternalOCCI.g:2172:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            // InternalOCCI.g:2173:3: otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalOCCI.g:2177:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:2178:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:2178:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:2179:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
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

            // InternalOCCI.g:2196:3: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==13) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOCCI.g:2197:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalOCCI.g:2201:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2202:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2202:5: (lv_description_3_0= RULE_STRING )
                    // InternalOCCI.g:2203:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

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

            otherlv_4=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getBodyKeyword_3());
            		
            // InternalOCCI.g:2224:3: ( (lv_body_5_0= RULE_STRING ) )
            // InternalOCCI.g:2225:4: (lv_body_5_0= RULE_STRING )
            {
            // InternalOCCI.g:2225:4: (lv_body_5_0= RULE_STRING )
            // InternalOCCI.g:2226:5: lv_body_5_0= RULE_STRING
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
    // InternalOCCI.g:2246:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalOCCI.g:2246:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalOCCI.g:2247:2: iv_ruleFSM= ruleFSM EOF
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
    // InternalOCCI.g:2253:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalOCCI.g:2259:2: ( (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? ) )
            // InternalOCCI.g:2260:2: (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? )
            {
            // InternalOCCI.g:2260:2: (otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )? )
            // InternalOCCI.g:2261:3: otherlv_0= 'FSM' otherlv_1= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getAttributeKeyword_1());
            		
            // InternalOCCI.g:2269:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2270:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2270:4: ( ruleQualifiedID )
            // InternalOCCI.g:2271:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFSMRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFSMAccess().getAttributeAttributeCrossReference_2_0());
            				
            pushFollow(FOLLOW_61);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2285:3: (otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==24) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalOCCI.g:2286:4: otherlv_3= '{' ( (lv_ownedState_4_0= ruleState ) ) (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_62); 

                    				newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalOCCI.g:2290:4: ( (lv_ownedState_4_0= ruleState ) )
                    // InternalOCCI.g:2291:5: (lv_ownedState_4_0= ruleState )
                    {
                    // InternalOCCI.g:2291:5: (lv_ownedState_4_0= ruleState )
                    // InternalOCCI.g:2292:6: lv_ownedState_4_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalOCCI.g:2309:4: (otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==17) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalOCCI.g:2310:5: otherlv_5= ',' ( (lv_ownedState_6_0= ruleState ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_62); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalOCCI.g:2314:5: ( (lv_ownedState_6_0= ruleState ) )
                    	    // InternalOCCI.g:2315:6: (lv_ownedState_6_0= ruleState )
                    	    {
                    	    // InternalOCCI.g:2315:6: (lv_ownedState_6_0= ruleState )
                    	    // InternalOCCI.g:2316:7: lv_ownedState_6_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_3_2_1_0());
                    	    						
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


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_2); 

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
    // InternalOCCI.g:2343:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalOCCI.g:2343:46: (iv_ruleState= ruleState EOF )
            // InternalOCCI.g:2344:2: iv_ruleState= ruleState EOF
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
    // InternalOCCI.g:2350:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? (otherlv_3= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_5= 'transitions' otherlv_6= '(' ( (lv_outgoingTransition_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_outgoingTransition_9_0= ruleTransition ) ) )* otherlv_10= ')' )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_initial_1_0=null;
        Token lv_final_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_outgoingTransition_7_0 = null;

        EObject lv_outgoingTransition_9_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2356:2: ( (otherlv_0= 'State' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? (otherlv_3= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_5= 'transitions' otherlv_6= '(' ( (lv_outgoingTransition_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_outgoingTransition_9_0= ruleTransition ) ) )* otherlv_10= ')' )? ) )
            // InternalOCCI.g:2357:2: (otherlv_0= 'State' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? (otherlv_3= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_5= 'transitions' otherlv_6= '(' ( (lv_outgoingTransition_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_outgoingTransition_9_0= ruleTransition ) ) )* otherlv_10= ')' )? )
            {
            // InternalOCCI.g:2357:2: (otherlv_0= 'State' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? (otherlv_3= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_5= 'transitions' otherlv_6= '(' ( (lv_outgoingTransition_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_outgoingTransition_9_0= ruleTransition ) ) )* otherlv_10= ')' )? )
            // InternalOCCI.g:2358:3: otherlv_0= 'State' ( (lv_initial_1_0= 'initial' ) )? ( (lv_final_2_0= 'final' ) )? (otherlv_3= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_5= 'transitions' otherlv_6= '(' ( (lv_outgoingTransition_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_outgoingTransition_9_0= ruleTransition ) ) )* otherlv_10= ')' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalOCCI.g:2362:3: ( (lv_initial_1_0= 'initial' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==53) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOCCI.g:2363:4: (lv_initial_1_0= 'initial' )
                    {
                    // InternalOCCI.g:2363:4: (lv_initial_1_0= 'initial' )
                    // InternalOCCI.g:2364:5: lv_initial_1_0= 'initial'
                    {
                    lv_initial_1_0=(Token)match(input,53,FOLLOW_64); 

                    					newLeafNode(lv_initial_1_0, grammarAccess.getStateAccess().getInitialInitialKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2376:3: ( (lv_final_2_0= 'final' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==54) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOCCI.g:2377:4: (lv_final_2_0= 'final' )
                    {
                    // InternalOCCI.g:2377:4: (lv_final_2_0= 'final' )
                    // InternalOCCI.g:2378:5: lv_final_2_0= 'final'
                    {
                    lv_final_2_0=(Token)match(input,54,FOLLOW_65); 

                    					newLeafNode(lv_final_2_0, grammarAccess.getStateAccess().getFinalFinalKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2390:3: (otherlv_3= 'literal' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:2391:4: otherlv_3= 'literal' ( ( ruleQualifiedID ) )
            {
            otherlv_3=(Token)match(input,55,FOLLOW_12); 

            				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLiteralKeyword_3_0());
            			
            // InternalOCCI.g:2395:4: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2396:5: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2396:5: ( ruleQualifiedID )
            // InternalOCCI.g:2397:6: ruleQualifiedID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getStateRule());
            						}
            					

            						newCompositeNode(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_66);
            ruleQualifiedID();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOCCI.g:2412:3: (otherlv_5= 'transitions' otherlv_6= '(' ( (lv_outgoingTransition_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_outgoingTransition_9_0= ruleTransition ) ) )* otherlv_10= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==56) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOCCI.g:2413:4: otherlv_5= 'transitions' otherlv_6= '(' ( (lv_outgoingTransition_7_0= ruleTransition ) ) (otherlv_8= ',' ( (lv_outgoingTransition_9_0= ruleTransition ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getStateAccess().getTransitionsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,16,FOLLOW_67); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalOCCI.g:2421:4: ( (lv_outgoingTransition_7_0= ruleTransition ) )
                    // InternalOCCI.g:2422:5: (lv_outgoingTransition_7_0= ruleTransition )
                    {
                    // InternalOCCI.g:2422:5: (lv_outgoingTransition_7_0= ruleTransition )
                    // InternalOCCI.g:2423:6: lv_outgoingTransition_7_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_outgoingTransition_7_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"outgoingTransition",
                    							lv_outgoingTransition_7_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:2440:4: (otherlv_8= ',' ( (lv_outgoingTransition_9_0= ruleTransition ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==17) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalOCCI.g:2441:5: otherlv_8= ',' ( (lv_outgoingTransition_9_0= ruleTransition ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_67); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOCCI.g:2445:5: ( (lv_outgoingTransition_9_0= ruleTransition ) )
                    	    // InternalOCCI.g:2446:6: (lv_outgoingTransition_9_0= ruleTransition )
                    	    {
                    	    // InternalOCCI.g:2446:6: (lv_outgoingTransition_9_0= ruleTransition )
                    	    // InternalOCCI.g:2447:7: lv_outgoingTransition_9_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_outgoingTransition_9_0=ruleTransition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outgoingTransition",
                    	    								lv_outgoingTransition_9_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Transition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightParenthesisKeyword_4_4());
                    			

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
    // InternalOCCI.g:2474:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalOCCI.g:2474:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalOCCI.g:2475:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalOCCI.g:2481:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOCCI.g:2487:2: ( ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) )
            // InternalOCCI.g:2488:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            {
            // InternalOCCI.g:2488:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:2489:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:2489:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==48) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOCCI.g:2490:4: otherlv_0= 'action' ( ( ruleQualifiedID ) )
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getActionKeyword_0_0());
                    			
                    // InternalOCCI.g:2494:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:2495:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:2495:5: ( ruleQualifiedID )
                    // InternalOCCI.g:2496:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getActionActionCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,57,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToKeyword_1());
            		
            // InternalOCCI.g:2515:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2516:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2516:4: ( ruleQualifiedID )
            // InternalOCCI.g:2517:5: ruleQualifiedID
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
    // InternalOCCI.g:2535:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalOCCI.g:2535:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalOCCI.g:2536:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalOCCI.g:2542:1: ruleDataType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) ;
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
            // InternalOCCI.g:2548:2: ( (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) )
            // InternalOCCI.g:2549:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            {
            // InternalOCCI.g:2549:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            int alt64=7;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt64=1;
                }
                break;
            case 64:
                {
                alt64=2;
                }
                break;
            case 65:
                {
                alt64=3;
                }
                break;
            case 66:
                {
                alt64=4;
                }
                break;
            case 72:
                {
                alt64=5;
                }
                break;
            case 74:
                {
                alt64=6;
                }
                break;
            case 76:
                {
                alt64=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalOCCI.g:2550:3: this_StringType_0= ruleStringType
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
                    // InternalOCCI.g:2559:3: this_EObjectType_1= ruleEObjectType
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
                    // InternalOCCI.g:2568:3: this_BooleanType_2= ruleBooleanType
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
                    // InternalOCCI.g:2577:3: this_NumericType_3= ruleNumericType
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
                    // InternalOCCI.g:2586:3: this_EnumerationType_4= ruleEnumerationType
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
                    // InternalOCCI.g:2595:3: this_RecordType_5= ruleRecordType
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
                    // InternalOCCI.g:2604:3: this_ArrayType_6= ruleArrayType
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
    // InternalOCCI.g:2616:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalOCCI.g:2616:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalOCCI.g:2617:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalOCCI.g:2623:1: ruleStringType returns [EObject current=null] : (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? ) ;
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
            // InternalOCCI.g:2629:2: ( (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2630:2: (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2630:2: (otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2631:3: otherlv_0= 'StringType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStringTypeAccess().getStringTypeKeyword_0());
            		
            // InternalOCCI.g:2635:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2636:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2636:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2637:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getStringTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_69);
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

            // InternalOCCI.g:2654:3: (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==59) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOCCI.g:2655:4: otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getPatternKeyword_2_0());
                    			
                    // InternalOCCI.g:2659:4: ( (lv_pattern_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2660:5: (lv_pattern_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2660:5: (lv_pattern_3_0= RULE_STRING )
                    // InternalOCCI.g:2661:6: lv_pattern_3_0= RULE_STRING
                    {
                    lv_pattern_3_0=(Token)match(input,RULE_STRING,FOLLOW_70); 

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

            // InternalOCCI.g:2678:3: (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==60) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalOCCI.g:2679:4: otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_71); 

                    				newLeafNode(otherlv_4, grammarAccess.getStringTypeAccess().getLengthKeyword_3_0());
                    			
                    // InternalOCCI.g:2683:4: ( (lv_length_5_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2684:5: (lv_length_5_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2684:5: (lv_length_5_0= ruleEIntegerObject )
                    // InternalOCCI.g:2685:6: lv_length_5_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getLengthEIntegerObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_72);
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

            // InternalOCCI.g:2703:3: (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==61) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOCCI.g:2704:4: otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) )
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_71); 

                    				newLeafNode(otherlv_6, grammarAccess.getStringTypeAccess().getMinLengthKeyword_4_0());
                    			
                    // InternalOCCI.g:2708:4: ( (lv_minLength_7_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2709:5: (lv_minLength_7_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2709:5: (lv_minLength_7_0= ruleEIntegerObject )
                    // InternalOCCI.g:2710:6: lv_minLength_7_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMinLengthEIntegerObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_73);
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

            // InternalOCCI.g:2728:3: (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==62) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalOCCI.g:2729:4: otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) )
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_71); 

                    				newLeafNode(otherlv_8, grammarAccess.getStringTypeAccess().getMaxLengthKeyword_5_0());
                    			
                    // InternalOCCI.g:2733:4: ( (lv_maxLength_9_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:2734:5: (lv_maxLength_9_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:2734:5: (lv_maxLength_9_0= ruleEIntegerObject )
                    // InternalOCCI.g:2735:6: lv_maxLength_9_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMaxLengthEIntegerObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_74);
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

            // InternalOCCI.g:2753:3: (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==63) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalOCCI.g:2754:4: otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getStringTypeAccess().getDocumentationKeyword_6_0());
                    			
                    // InternalOCCI.g:2758:4: ( (lv_documentation_11_0= RULE_STRING ) )
                    // InternalOCCI.g:2759:5: (lv_documentation_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2759:5: (lv_documentation_11_0= RULE_STRING )
                    // InternalOCCI.g:2760:6: lv_documentation_11_0= RULE_STRING
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
    // InternalOCCI.g:2781:1: entryRuleEObjectType returns [EObject current=null] : iv_ruleEObjectType= ruleEObjectType EOF ;
    public final EObject entryRuleEObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectType = null;


        try {
            // InternalOCCI.g:2781:52: (iv_ruleEObjectType= ruleEObjectType EOF )
            // InternalOCCI.g:2782:2: iv_ruleEObjectType= ruleEObjectType EOF
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
    // InternalOCCI.g:2788:1: ruleEObjectType returns [EObject current=null] : (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) ;
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
            // InternalOCCI.g:2794:2: ( (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2795:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2795:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2796:3: otherlv_0= 'EObjectType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEObjectTypeAccess().getEObjectTypeKeyword_0());
            		
            // InternalOCCI.g:2800:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2801:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2801:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2802:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getEObjectTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_75);
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

            // InternalOCCI.g:2819:3: (otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==47) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalOCCI.g:2820:4: otherlv_2= 'type' ( (lv_instanceClassName_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEObjectTypeAccess().getTypeKeyword_2_0());
                    			
                    // InternalOCCI.g:2824:4: ( (lv_instanceClassName_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2825:5: (lv_instanceClassName_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2825:5: (lv_instanceClassName_3_0= RULE_STRING )
                    // InternalOCCI.g:2826:6: lv_instanceClassName_3_0= RULE_STRING
                    {
                    lv_instanceClassName_3_0=(Token)match(input,RULE_STRING,FOLLOW_74); 

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

            // InternalOCCI.g:2843:3: (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==63) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalOCCI.g:2844:4: otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEObjectTypeAccess().getDocumentationKeyword_3_0());
                    			
                    // InternalOCCI.g:2848:4: ( (lv_documentation_5_0= RULE_STRING ) )
                    // InternalOCCI.g:2849:5: (lv_documentation_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2849:5: (lv_documentation_5_0= RULE_STRING )
                    // InternalOCCI.g:2850:6: lv_documentation_5_0= RULE_STRING
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
    // InternalOCCI.g:2871:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalOCCI.g:2871:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalOCCI.g:2872:2: iv_ruleBooleanType= ruleBooleanType EOF
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
    // InternalOCCI.g:2878:1: ruleBooleanType returns [EObject current=null] : (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_documentation_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2884:2: ( (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2885:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2885:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2886:3: otherlv_0= 'BooleanType' ( (lv_name_1_0= ruleTypeID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_0());
            		
            // InternalOCCI.g:2890:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2891:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2891:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2892:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getBooleanTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_74);
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

            // InternalOCCI.g:2909:3: (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==63) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalOCCI.g:2910:4: otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanTypeAccess().getDocumentationKeyword_2_0());
                    			
                    // InternalOCCI.g:2914:4: ( (lv_documentation_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2915:5: (lv_documentation_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2915:5: (lv_documentation_3_0= RULE_STRING )
                    // InternalOCCI.g:2916:6: lv_documentation_3_0= RULE_STRING
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
    // InternalOCCI.g:2937:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // InternalOCCI.g:2937:52: (iv_ruleNumericType= ruleNumericType EOF )
            // InternalOCCI.g:2938:2: iv_ruleNumericType= ruleNumericType EOF
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
    // InternalOCCI.g:2944:1: ruleNumericType returns [EObject current=null] : (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )? (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )? ) ;
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
            // InternalOCCI.g:2950:2: ( (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )? (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2951:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )? (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2951:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )? (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2952:3: otherlv_0= 'NumericType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )? (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )? (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )? (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )? (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNumericTypeAccess().getNumericTypeKeyword_0());
            		
            // InternalOCCI.g:2956:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:2957:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:2957:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:2958:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getNumericTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_76);
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

            otherlv_2=(Token)match(input,47,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericTypeAccess().getTypeKeyword_2());
            		
            // InternalOCCI.g:2979:3: ( (lv_type_3_0= ruleNumericTypeEnum ) )
            // InternalOCCI.g:2980:4: (lv_type_3_0= ruleNumericTypeEnum )
            {
            // InternalOCCI.g:2980:4: (lv_type_3_0= ruleNumericTypeEnum )
            // InternalOCCI.g:2981:5: lv_type_3_0= ruleNumericTypeEnum
            {

            					newCompositeNode(grammarAccess.getNumericTypeAccess().getTypeNumericTypeEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_78);
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

            // InternalOCCI.g:2998:3: (otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==67) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalOCCI.g:2999:4: otherlv_4= 'totalDigits' ( (lv_totalDigits_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_4=(Token)match(input,67,FOLLOW_71); 

                    				newLeafNode(otherlv_4, grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_4_0());
                    			
                    // InternalOCCI.g:3003:4: ( (lv_totalDigits_5_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:3004:5: (lv_totalDigits_5_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:3004:5: (lv_totalDigits_5_0= ruleEIntegerObject )
                    // InternalOCCI.g:3005:6: lv_totalDigits_5_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getNumericTypeAccess().getTotalDigitsEIntegerObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_79);
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

            // InternalOCCI.g:3023:3: (otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==68) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalOCCI.g:3024:4: otherlv_6= 'minExclusive' ( (lv_minExclusive_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_5_0());
                    			
                    // InternalOCCI.g:3028:4: ( (lv_minExclusive_7_0= RULE_STRING ) )
                    // InternalOCCI.g:3029:5: (lv_minExclusive_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3029:5: (lv_minExclusive_7_0= RULE_STRING )
                    // InternalOCCI.g:3030:6: lv_minExclusive_7_0= RULE_STRING
                    {
                    lv_minExclusive_7_0=(Token)match(input,RULE_STRING,FOLLOW_80); 

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

            // InternalOCCI.g:3047:3: (otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==69) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalOCCI.g:3048:4: otherlv_8= 'maxExclusive' ( (lv_maxExclusive_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,69,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_6_0());
                    			
                    // InternalOCCI.g:3052:4: ( (lv_maxExclusive_9_0= RULE_STRING ) )
                    // InternalOCCI.g:3053:5: (lv_maxExclusive_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3053:5: (lv_maxExclusive_9_0= RULE_STRING )
                    // InternalOCCI.g:3054:6: lv_maxExclusive_9_0= RULE_STRING
                    {
                    lv_maxExclusive_9_0=(Token)match(input,RULE_STRING,FOLLOW_81); 

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

            // InternalOCCI.g:3071:3: (otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==70) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalOCCI.g:3072:4: otherlv_10= 'minInclusive' ( (lv_minInclusive_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,70,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_7_0());
                    			
                    // InternalOCCI.g:3076:4: ( (lv_minInclusive_11_0= RULE_STRING ) )
                    // InternalOCCI.g:3077:5: (lv_minInclusive_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3077:5: (lv_minInclusive_11_0= RULE_STRING )
                    // InternalOCCI.g:3078:6: lv_minInclusive_11_0= RULE_STRING
                    {
                    lv_minInclusive_11_0=(Token)match(input,RULE_STRING,FOLLOW_82); 

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

            // InternalOCCI.g:3095:3: (otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==71) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalOCCI.g:3096:4: otherlv_12= 'maxInclusive' ( (lv_maxInclusive_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,71,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_8_0());
                    			
                    // InternalOCCI.g:3100:4: ( (lv_maxInclusive_13_0= RULE_STRING ) )
                    // InternalOCCI.g:3101:5: (lv_maxInclusive_13_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3101:5: (lv_maxInclusive_13_0= RULE_STRING )
                    // InternalOCCI.g:3102:6: lv_maxInclusive_13_0= RULE_STRING
                    {
                    lv_maxInclusive_13_0=(Token)match(input,RULE_STRING,FOLLOW_74); 

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

            // InternalOCCI.g:3119:3: (otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==63) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalOCCI.g:3120:4: otherlv_14= 'documentation' ( (lv_documentation_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getNumericTypeAccess().getDocumentationKeyword_9_0());
                    			
                    // InternalOCCI.g:3124:4: ( (lv_documentation_15_0= RULE_STRING ) )
                    // InternalOCCI.g:3125:5: (lv_documentation_15_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3125:5: (lv_documentation_15_0= RULE_STRING )
                    // InternalOCCI.g:3126:6: lv_documentation_15_0= RULE_STRING
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
    // InternalOCCI.g:3147:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // InternalOCCI.g:3147:56: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // InternalOCCI.g:3148:2: iv_ruleEnumerationType= ruleEnumerationType EOF
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
    // InternalOCCI.g:3154:1: ruleEnumerationType returns [EObject current=null] : (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) ;
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
            // InternalOCCI.g:3160:2: ( (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3161:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3161:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3162:3: otherlv_0= 'EnumerationType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0());
            		
            // InternalOCCI.g:3166:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:3167:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:3167:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:3168:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_83);
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

            otherlv_2=(Token)match(input,73,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_3());
            		
            // InternalOCCI.g:3193:3: ( (lv_literals_4_0= ruleEnumerationLiteral ) )
            // InternalOCCI.g:3194:4: (lv_literals_4_0= ruleEnumerationLiteral )
            {
            // InternalOCCI.g:3194:4: (lv_literals_4_0= ruleEnumerationLiteral )
            // InternalOCCI.g:3195:5: lv_literals_4_0= ruleEnumerationLiteral
            {

            					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalOCCI.g:3212:3: (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==17) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalOCCI.g:3213:4: otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_12); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalOCCI.g:3217:4: ( (lv_literals_6_0= ruleEnumerationLiteral ) )
            	    // InternalOCCI.g:3218:5: (lv_literals_6_0= ruleEnumerationLiteral )
            	    {
            	    // InternalOCCI.g:3218:5: (lv_literals_6_0= ruleEnumerationLiteral )
            	    // InternalOCCI.g:3219:6: lv_literals_6_0= ruleEnumerationLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
            	    break loop79;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_74); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_6());
            		
            // InternalOCCI.g:3241:3: (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==63) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalOCCI.g:3242:4: otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnumerationTypeAccess().getDocumentationKeyword_7_0());
                    			
                    // InternalOCCI.g:3246:4: ( (lv_documentation_9_0= RULE_STRING ) )
                    // InternalOCCI.g:3247:5: (lv_documentation_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3247:5: (lv_documentation_9_0= RULE_STRING )
                    // InternalOCCI.g:3248:6: lv_documentation_9_0= RULE_STRING
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
    // InternalOCCI.g:3269:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalOCCI.g:3269:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalOCCI.g:3270:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalOCCI.g:3276:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_documentation_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3282:2: ( ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3283:2: ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3283:2: ( ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3284:3: ( (lv_name_0_0= ruleTypeID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )?
            {
            // InternalOCCI.g:3284:3: ( (lv_name_0_0= ruleTypeID ) )
            // InternalOCCI.g:3285:4: (lv_name_0_0= ruleTypeID )
            {
            // InternalOCCI.g:3285:4: (lv_name_0_0= ruleTypeID )
            // InternalOCCI.g:3286:5: lv_name_0_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getNameTypeIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_74);
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

            // InternalOCCI.g:3303:3: (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==63) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalOCCI.g:3304:4: otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getDocumentationKeyword_1_0());
                    			
                    // InternalOCCI.g:3308:4: ( (lv_documentation_2_0= RULE_STRING ) )
                    // InternalOCCI.g:3309:5: (lv_documentation_2_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3309:5: (lv_documentation_2_0= RULE_STRING )
                    // InternalOCCI.g:3310:6: lv_documentation_2_0= RULE_STRING
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
    // InternalOCCI.g:3331:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // InternalOCCI.g:3331:51: (iv_ruleRecordType= ruleRecordType EOF )
            // InternalOCCI.g:3332:2: iv_ruleRecordType= ruleRecordType EOF
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
    // InternalOCCI.g:3338:1: ruleRecordType returns [EObject current=null] : (otherlv_0= 'RecordType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_documentation_9_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_recordFields_4_0 = null;

        EObject lv_recordFields_6_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3344:2: ( (otherlv_0= 'RecordType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3345:2: (otherlv_0= 'RecordType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3345:2: (otherlv_0= 'RecordType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3346:3: otherlv_0= 'RecordType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,74,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getRecordTypeKeyword_0());
            		
            // InternalOCCI.g:3350:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:3351:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:3351:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:3352:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_84);
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

            otherlv_2=(Token)match(input,75,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getFieldsKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_3());
            		
            // InternalOCCI.g:3377:3: ( (lv_recordFields_4_0= ruleRecordField ) )
            // InternalOCCI.g:3378:4: (lv_recordFields_4_0= ruleRecordField )
            {
            // InternalOCCI.g:3378:4: (lv_recordFields_4_0= ruleRecordField )
            // InternalOCCI.g:3379:5: lv_recordFields_4_0= ruleRecordField
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalOCCI.g:3396:3: (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==17) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalOCCI.g:3397:4: otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_12); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalOCCI.g:3401:4: ( (lv_recordFields_6_0= ruleRecordField ) )
            	    // InternalOCCI.g:3402:5: (lv_recordFields_6_0= ruleRecordField )
            	    {
            	    // InternalOCCI.g:3402:5: (lv_recordFields_6_0= ruleRecordField )
            	    // InternalOCCI.g:3403:6: lv_recordFields_6_0= ruleRecordField
            	    {

            	    						newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
            	    break loop82;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_74); 

            			newLeafNode(otherlv_7, grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_6());
            		
            // InternalOCCI.g:3425:3: (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==63) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalOCCI.g:3426:4: otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getRecordTypeAccess().getDocumentationKeyword_7_0());
                    			
                    // InternalOCCI.g:3430:4: ( (lv_documentation_9_0= RULE_STRING ) )
                    // InternalOCCI.g:3431:5: (lv_documentation_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3431:5: (lv_documentation_9_0= RULE_STRING )
                    // InternalOCCI.g:3432:6: lv_documentation_9_0= RULE_STRING
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
    // InternalOCCI.g:3453:1: entryRuleRecordField returns [EObject current=null] : iv_ruleRecordField= ruleRecordField EOF ;
    public final EObject entryRuleRecordField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordField = null;


        try {
            // InternalOCCI.g:3453:52: (iv_ruleRecordField= ruleRecordField EOF )
            // InternalOCCI.g:3454:2: iv_ruleRecordField= ruleRecordField EOF
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
    // InternalOCCI.g:3460:1: ruleRecordField returns [EObject current=null] : ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) ;
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
            // InternalOCCI.g:3466:2: ( ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) )
            // InternalOCCI.g:3467:2: ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            {
            // InternalOCCI.g:3467:2: ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            // InternalOCCI.g:3468:3: ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            {
            // InternalOCCI.g:3468:3: ( (lv_mutable_0_0= 'mutable' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==45) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==RULE_ID||LA84_1==RULE_QUALIFIED_ID||(LA84_1>=12 && LA84_1<=15)||LA84_1==19||(LA84_1>=21 && LA84_1<=23)||(LA84_1>=26 && LA84_1<=29)||(LA84_1>=31 && LA84_1<=46)||(LA84_1>=48 && LA84_1<=76)||(LA84_1>=78 && LA84_1<=84)) ) {
                    alt84=1;
                }
                else if ( (LA84_1==47) ) {
                    int LA84_4 = input.LA(3);

                    if ( (LA84_4==47) ) {
                        switch ( input.LA(4) ) {
                            case 13:
                                {
                                int LA84_6 = input.LA(5);

                                if ( (LA84_6==EOF||LA84_6==13||(LA84_6>=17 && LA84_6<=18)||LA84_6==30||LA84_6==39) ) {
                                    alt84=1;
                                }
                                }
                                break;
                            case 39:
                                {
                                int LA84_7 = input.LA(5);

                                if ( (LA84_7==EOF||LA84_7==13||(LA84_7>=17 && LA84_7<=18)||LA84_7==30||LA84_7==39) ) {
                                    alt84=1;
                                }
                                }
                                break;
                            case RULE_ID:
                            case RULE_QUALIFIED_ID:
                            case 12:
                            case 14:
                            case 15:
                            case 19:
                            case 21:
                            case 22:
                            case 23:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
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
                            case 74:
                            case 75:
                            case 76:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                                {
                                alt84=1;
                                }
                                break;
                        }

                    }
                }
            }
            switch (alt84) {
                case 1 :
                    // InternalOCCI.g:3469:4: (lv_mutable_0_0= 'mutable' )
                    {
                    // InternalOCCI.g:3469:4: (lv_mutable_0_0= 'mutable' )
                    // InternalOCCI.g:3470:5: lv_mutable_0_0= 'mutable'
                    {
                    lv_mutable_0_0=(Token)match(input,45,FOLLOW_12); 

                    					newLeafNode(lv_mutable_0_0, grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:3482:3: ( (lv_required_1_0= 'required' ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==46) ) {
                int LA85_1 = input.LA(2);

                if ( (LA85_1==47) ) {
                    int LA85_3 = input.LA(3);

                    if ( (LA85_3==47) ) {
                        switch ( input.LA(4) ) {
                            case 13:
                                {
                                int LA85_6 = input.LA(5);

                                if ( (LA85_6==EOF||LA85_6==13||(LA85_6>=17 && LA85_6<=18)||LA85_6==30||LA85_6==39) ) {
                                    alt85=1;
                                }
                                }
                                break;
                            case 39:
                                {
                                int LA85_7 = input.LA(5);

                                if ( (LA85_7==EOF||LA85_7==13||(LA85_7>=17 && LA85_7<=18)||LA85_7==30||LA85_7==39) ) {
                                    alt85=1;
                                }
                                }
                                break;
                            case RULE_ID:
                            case RULE_QUALIFIED_ID:
                            case 12:
                            case 14:
                            case 15:
                            case 19:
                            case 21:
                            case 22:
                            case 23:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
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
                            case 74:
                            case 75:
                            case 76:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                                {
                                alt85=1;
                                }
                                break;
                        }

                    }
                }
                else if ( (LA85_1==RULE_ID||LA85_1==RULE_QUALIFIED_ID||(LA85_1>=12 && LA85_1<=15)||LA85_1==19||(LA85_1>=21 && LA85_1<=23)||(LA85_1>=26 && LA85_1<=29)||(LA85_1>=31 && LA85_1<=46)||(LA85_1>=48 && LA85_1<=76)||(LA85_1>=78 && LA85_1<=84)) ) {
                    alt85=1;
                }
            }
            switch (alt85) {
                case 1 :
                    // InternalOCCI.g:3483:4: (lv_required_1_0= 'required' )
                    {
                    // InternalOCCI.g:3483:4: (lv_required_1_0= 'required' )
                    // InternalOCCI.g:3484:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,46,FOLLOW_12); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:3496:3: ( (lv_name_2_0= ruleQualifiedID ) )
            // InternalOCCI.g:3497:4: (lv_name_2_0= ruleQualifiedID )
            {
            // InternalOCCI.g:3497:4: (lv_name_2_0= ruleQualifiedID )
            // InternalOCCI.g:3498:5: lv_name_2_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getRecordFieldAccess().getNameQualifiedIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_76);
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

            // InternalOCCI.g:3515:3: (otherlv_3= 'type' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:3516:4: otherlv_3= 'type' ( ( ruleQualifiedID ) )
            {
            otherlv_3=(Token)match(input,47,FOLLOW_12); 

            				newLeafNode(otherlv_3, grammarAccess.getRecordFieldAccess().getTypeKeyword_3_0());
            			
            // InternalOCCI.g:3520:4: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:3521:5: ( ruleQualifiedID )
            {
            // InternalOCCI.g:3521:5: ( ruleQualifiedID )
            // InternalOCCI.g:3522:6: ruleQualifiedID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRecordFieldRule());
            						}
            					

            						newCompositeNode(grammarAccess.getRecordFieldAccess().getTypeDataTypeCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_53);
            ruleQualifiedID();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOCCI.g:3537:3: (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==30) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalOCCI.g:3538:4: otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRecordFieldAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalOCCI.g:3542:4: ( (lv_default_6_0= RULE_STRING ) )
                    // InternalOCCI.g:3543:5: (lv_default_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3543:5: (lv_default_6_0= RULE_STRING )
                    // InternalOCCI.g:3544:6: lv_default_6_0= RULE_STRING
                    {
                    lv_default_6_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

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

            // InternalOCCI.g:3561:3: (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==13) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalOCCI.g:3562:4: otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getRecordFieldAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalOCCI.g:3566:4: ( (lv_description_8_0= RULE_STRING ) )
                    // InternalOCCI.g:3567:5: (lv_description_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3567:5: (lv_description_8_0= RULE_STRING )
                    // InternalOCCI.g:3568:6: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            // InternalOCCI.g:3585:3: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==39) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalOCCI.g:3586:4: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getRecordFieldAccess().getAnnotationsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOCCI.g:3594:4: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // InternalOCCI.g:3595:5: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:3595:5: (lv_annotations_11_0= ruleAnnotation )
                    // InternalOCCI.g:3596:6: lv_annotations_11_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalOCCI.g:3613:4: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==17) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalOCCI.g:3614:5: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_7); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRecordFieldAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOCCI.g:3618:5: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:3619:6: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:3619:6: (lv_annotations_13_0= ruleAnnotation )
                    	    // InternalOCCI.g:3620:7: lv_annotations_13_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,25,FOLLOW_2); 

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
    // InternalOCCI.g:3647:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalOCCI.g:3647:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalOCCI.g:3648:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalOCCI.g:3654:1: ruleArrayType returns [EObject current=null] : (otherlv_0= 'ArrayType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_documentation_5_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3660:2: ( (otherlv_0= 'ArrayType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3661:2: (otherlv_0= 'ArrayType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3661:2: (otherlv_0= 'ArrayType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3662:3: otherlv_0= 'ArrayType' ( (lv_name_1_0= ruleTypeID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getArrayTypeKeyword_0());
            		
            // InternalOCCI.g:3666:3: ( (lv_name_1_0= ruleTypeID ) )
            // InternalOCCI.g:3667:4: (lv_name_1_0= ruleTypeID )
            {
            // InternalOCCI.g:3667:4: (lv_name_1_0= ruleTypeID )
            // InternalOCCI.g:3668:5: lv_name_1_0= ruleTypeID
            {

            					newCompositeNode(grammarAccess.getArrayTypeAccess().getNameTypeIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_76);
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

            otherlv_2=(Token)match(input,47,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalOCCI.g:3689:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:3690:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:3690:4: ( ruleQualifiedID )
            // InternalOCCI.g:3691:5: ruleQualifiedID
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

            // InternalOCCI.g:3705:3: (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==63) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalOCCI.g:3706:4: otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,63,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getDocumentationKeyword_4_0());
                    			
                    // InternalOCCI.g:3710:4: ( (lv_documentation_5_0= RULE_STRING ) )
                    // InternalOCCI.g:3711:5: (lv_documentation_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3711:5: (lv_documentation_5_0= RULE_STRING )
                    // InternalOCCI.g:3712:6: lv_documentation_5_0= RULE_STRING
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
    // InternalOCCI.g:3733:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalOCCI.g:3733:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalOCCI.g:3734:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalOCCI.g:3740:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOCCI.g:3746:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalOCCI.g:3747:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalOCCI.g:3747:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalOCCI.g:3748:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalOCCI.g:3748:3: (kw= '-' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==77) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalOCCI.g:3749:4: kw= '-'
                    {
                    kw=(Token)match(input,77,FOLLOW_85); 

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
    // InternalOCCI.g:3766:1: entryRuleTypeID returns [String current=null] : iv_ruleTypeID= ruleTypeID EOF ;
    public final String entryRuleTypeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeID = null;


        try {
            // InternalOCCI.g:3766:46: (iv_ruleTypeID= ruleTypeID EOF )
            // InternalOCCI.g:3767:2: iv_ruleTypeID= ruleTypeID EOF
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
    // InternalOCCI.g:3773:1: ruleTypeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleTypeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3779:2: ( (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalOCCI.g:3780:2: (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalOCCI.g:3780:2: (this_ID_0= RULE_ID | this_KEYWORD_1= ruleKEYWORD )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID) ) {
                alt92=1;
            }
            else if ( ((LA92_0>=12 && LA92_0<=15)||LA92_0==19||(LA92_0>=21 && LA92_0<=23)||(LA92_0>=26 && LA92_0<=29)||(LA92_0>=31 && LA92_0<=76)||(LA92_0>=78 && LA92_0<=84)) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalOCCI.g:3781:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getTypeIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3789:3: this_KEYWORD_1= ruleKEYWORD
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
    // InternalOCCI.g:3803:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // InternalOCCI.g:3803:51: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // InternalOCCI.g:3804:2: iv_ruleQualifiedID= ruleQualifiedID EOF
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
    // InternalOCCI.g:3810:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_QUALIFIED_ID_1=null;
        AntlrDatatypeRuleToken this_KEYWORD_2 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3816:2: ( (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) )
            // InternalOCCI.g:3817:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            {
            // InternalOCCI.g:3817:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            int alt93=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt93=1;
                }
                break;
            case RULE_QUALIFIED_ID:
                {
                alt93=2;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            case 21:
            case 22:
            case 23:
            case 26:
            case 27:
            case 28:
            case 29:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
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
            case 74:
            case 75:
            case 76:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalOCCI.g:3818:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3826:3: this_QUALIFIED_ID_1= RULE_QUALIFIED_ID
                    {
                    this_QUALIFIED_ID_1=(Token)match(input,RULE_QUALIFIED_ID,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_ID_1);
                    		

                    			newLeafNode(this_QUALIFIED_ID_1, grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3834:3: this_KEYWORD_2= ruleKEYWORD
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
    // InternalOCCI.g:3848:1: entryRuleNameID returns [String current=null] : iv_ruleNameID= ruleNameID EOF ;
    public final String entryRuleNameID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameID = null;


        try {
            // InternalOCCI.g:3848:46: (iv_ruleNameID= ruleNameID EOF )
            // InternalOCCI.g:3849:2: iv_ruleNameID= ruleNameID EOF
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
    // InternalOCCI.g:3855:1: ruleNameID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleNameID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_KEYWORD_3 = null;



        	enterRule();

        try {
            // InternalOCCI.g:3861:2: ( ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) )
            // InternalOCCI.g:3862:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            {
            // InternalOCCI.g:3862:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_ID) ) {
                alt95=1;
            }
            else if ( ((LA95_0>=12 && LA95_0<=15)||LA95_0==19||(LA95_0>=21 && LA95_0<=23)||(LA95_0>=26 && LA95_0<=29)||(LA95_0>=31 && LA95_0<=76)||(LA95_0>=78 && LA95_0<=84)) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalOCCI.g:3863:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    {
                    // InternalOCCI.g:3863:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    // InternalOCCI.g:3864:4: this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )*
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_86); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalOCCI.g:3871:4: (this_ID_1= RULE_ID | kw= '-' )*
                    loop94:
                    do {
                        int alt94=3;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==RULE_ID) ) {
                            alt94=1;
                        }
                        else if ( (LA94_0==77) ) {
                            alt94=2;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalOCCI.g:3872:5: this_ID_1= RULE_ID
                    	    {
                    	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_86); 

                    	    					current.merge(this_ID_1);
                    	    				

                    	    					newLeafNode(this_ID_1, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_1_0());
                    	    				

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOCCI.g:3880:5: kw= '-'
                    	    {
                    	    kw=(Token)match(input,77,FOLLOW_86); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getNameIDAccess().getHyphenMinusKeyword_0_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3888:3: this_KEYWORD_3= ruleKEYWORD
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
    // InternalOCCI.g:3902:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalOCCI.g:3902:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalOCCI.g:3903:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalOCCI.g:3909:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixinBase' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'State' | kw= 'initial' | kw= 'final' | kw= 'literal' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'documentation' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'ArrayType' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOCCI.g:3915:2: ( (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixinBase' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'State' | kw= 'initial' | kw= 'final' | kw= 'literal' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'documentation' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'ArrayType' ) )
            // InternalOCCI.g:3916:2: (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixinBase' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'State' | kw= 'initial' | kw= 'final' | kw= 'literal' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'documentation' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'ArrayType' )
            {
            // InternalOCCI.g:3916:2: (kw= 'configuration' | kw= 'description' | kw= 'location' | kw= 'use' | kw= 'resource' | kw= 'title' | kw= 'summary' | kw= 'parts' | kw= 'link' | kw= 'kind' | kw= 'target' | kw= 'mixinBase' | kw= 'attribute' | kw= 'extension' | kw= 'specification' | kw= 'import' | kw= 'as' | kw= 'extends' | kw= 'source' | kw= 'scheme' | kw= 'annotations' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'key' | kw= 'value' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'FSM' | kw= 'State' | kw= 'initial' | kw= 'final' | kw= 'literal' | kw= 'transitions' | kw= 'to' | kw= 'StringType' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'documentation' | kw= 'EObjectType' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'ArrayType' )
            int alt96=65;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt96=1;
                }
                break;
            case 13:
                {
                alt96=2;
                }
                break;
            case 14:
                {
                alt96=3;
                }
                break;
            case 15:
                {
                alt96=4;
                }
                break;
            case 19:
                {
                alt96=5;
                }
                break;
            case 21:
                {
                alt96=6;
                }
                break;
            case 22:
                {
                alt96=7;
                }
                break;
            case 23:
                {
                alt96=8;
                }
                break;
            case 26:
                {
                alt96=9;
                }
                break;
            case 35:
                {
                alt96=10;
                }
                break;
            case 27:
                {
                alt96=11;
                }
                break;
            case 28:
                {
                alt96=12;
                }
                break;
            case 29:
                {
                alt96=13;
                }
                break;
            case 31:
                {
                alt96=14;
                }
                break;
            case 32:
                {
                alt96=15;
                }
                break;
            case 33:
                {
                alt96=16;
                }
                break;
            case 34:
                {
                alt96=17;
                }
                break;
            case 36:
                {
                alt96=18;
                }
                break;
            case 37:
                {
                alt96=19;
                }
                break;
            case 38:
                {
                alt96=20;
                }
                break;
            case 39:
                {
                alt96=21;
                }
                break;
            case 40:
                {
                alt96=22;
                }
                break;
            case 41:
                {
                alt96=23;
                }
                break;
            case 42:
                {
                alt96=24;
                }
                break;
            case 43:
                {
                alt96=25;
                }
                break;
            case 44:
                {
                alt96=26;
                }
                break;
            case 45:
                {
                alt96=27;
                }
                break;
            case 46:
                {
                alt96=28;
                }
                break;
            case 47:
                {
                alt96=29;
                }
                break;
            case 48:
                {
                alt96=30;
                }
                break;
            case 49:
                {
                alt96=31;
                }
                break;
            case 50:
                {
                alt96=32;
                }
                break;
            case 51:
                {
                alt96=33;
                }
                break;
            case 52:
                {
                alt96=34;
                }
                break;
            case 53:
                {
                alt96=35;
                }
                break;
            case 54:
                {
                alt96=36;
                }
                break;
            case 55:
                {
                alt96=37;
                }
                break;
            case 56:
                {
                alt96=38;
                }
                break;
            case 57:
                {
                alt96=39;
                }
                break;
            case 58:
                {
                alt96=40;
                }
                break;
            case 59:
                {
                alt96=41;
                }
                break;
            case 60:
                {
                alt96=42;
                }
                break;
            case 61:
                {
                alt96=43;
                }
                break;
            case 62:
                {
                alt96=44;
                }
                break;
            case 63:
                {
                alt96=45;
                }
                break;
            case 64:
                {
                alt96=46;
                }
                break;
            case 65:
                {
                alt96=47;
                }
                break;
            case 66:
                {
                alt96=48;
                }
                break;
            case 67:
                {
                alt96=49;
                }
                break;
            case 68:
                {
                alt96=50;
                }
                break;
            case 69:
                {
                alt96=51;
                }
                break;
            case 70:
                {
                alt96=52;
                }
                break;
            case 71:
                {
                alt96=53;
                }
                break;
            case 78:
                {
                alt96=54;
                }
                break;
            case 79:
                {
                alt96=55;
                }
                break;
            case 80:
                {
                alt96=56;
                }
                break;
            case 81:
                {
                alt96=57;
                }
                break;
            case 82:
                {
                alt96=58;
                }
                break;
            case 83:
                {
                alt96=59;
                }
                break;
            case 84:
                {
                alt96=60;
                }
                break;
            case 72:
                {
                alt96=61;
                }
                break;
            case 73:
                {
                alt96=62;
                }
                break;
            case 74:
                {
                alt96=63;
                }
                break;
            case 75:
                {
                alt96=64;
                }
                break;
            case 76:
                {
                alt96=65;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalOCCI.g:3917:3: kw= 'configuration'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConfigurationKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:3923:3: kw= 'description'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDescriptionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:3929:3: kw= 'location'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLocationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOCCI.g:3935:3: kw= 'use'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getUseKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOCCI.g:3941:3: kw= 'resource'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResourceKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOCCI.g:3947:3: kw= 'title'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTitleKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalOCCI.g:3953:3: kw= 'summary'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSummaryKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalOCCI.g:3959:3: kw= 'parts'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPartsKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalOCCI.g:3965:3: kw= 'link'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLinkKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalOCCI.g:3971:3: kw= 'kind'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKindKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalOCCI.g:3977:3: kw= 'target'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTargetKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalOCCI.g:3983:3: kw= 'mixinBase'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMixinBaseKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalOCCI.g:3989:3: kw= 'attribute'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAttributeKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalOCCI.g:3995:3: kw= 'extension'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtensionKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalOCCI.g:4001:3: kw= 'specification'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSpecificationKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalOCCI.g:4007:3: kw= 'import'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getImportKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalOCCI.g:4013:3: kw= 'as'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAsKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalOCCI.g:4019:3: kw= 'extends'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtendsKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalOCCI.g:4025:3: kw= 'source'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSourceKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalOCCI.g:4031:3: kw= 'scheme'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSchemeKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalOCCI.g:4037:3: kw= 'annotations'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAnnotationsKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalOCCI.g:4043:3: kw= 'mixin'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMixinKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalOCCI.g:4049:3: kw= 'depends'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDependsKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalOCCI.g:4055:3: kw= 'applies'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAppliesKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalOCCI.g:4061:3: kw= 'key'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKeyKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalOCCI.g:4067:3: kw= 'value'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalOCCI.g:4073:3: kw= 'mutable'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMutableKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalOCCI.g:4079:3: kw= 'required'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRequiredKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalOCCI.g:4085:3: kw= 'type'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalOCCI.g:4091:3: kw= 'action'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalOCCI.g:4097:3: kw= 'constraint'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConstraintKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalOCCI.g:4103:3: kw= 'body'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBodyKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalOCCI.g:4109:3: kw= 'FSM'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFSMKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalOCCI.g:4115:3: kw= 'State'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStateKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalOCCI.g:4121:3: kw= 'initial'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getInitialKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalOCCI.g:4127:3: kw= 'final'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFinalKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalOCCI.g:4133:3: kw= 'literal'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLiteralKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalOCCI.g:4139:3: kw= 'transitions'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTransitionsKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalOCCI.g:4145:3: kw= 'to'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getToKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalOCCI.g:4151:3: kw= 'StringType'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStringTypeKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalOCCI.g:4157:3: kw= 'pattern'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPatternKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalOCCI.g:4163:3: kw= 'length'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLengthKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalOCCI.g:4169:3: kw= 'minLength'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinLengthKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalOCCI.g:4175:3: kw= 'maxLength'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalOCCI.g:4181:3: kw= 'documentation'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDocumentationKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalOCCI.g:4187:3: kw= 'EObjectType'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEObjectTypeKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalOCCI.g:4193:3: kw= 'BooleanType'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBooleanTypeKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalOCCI.g:4199:3: kw= 'NumericType'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNumericTypeKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalOCCI.g:4205:3: kw= 'totalDigits'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTotalDigitsKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalOCCI.g:4211:3: kw= 'minExclusive'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinExclusiveKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalOCCI.g:4217:3: kw= 'maxExclusive'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxExclusiveKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalOCCI.g:4223:3: kw= 'minInclusive'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinInclusiveKeyword_51());
                    		

                    }
                    break;
                case 53 :
                    // InternalOCCI.g:4229:3: kw= 'maxInclusive'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxInclusiveKeyword_52());
                    		

                    }
                    break;
                case 54 :
                    // InternalOCCI.g:4235:3: kw= 'Byte'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getByteKeyword_53());
                    		

                    }
                    break;
                case 55 :
                    // InternalOCCI.g:4241:3: kw= 'Double'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDoubleKeyword_54());
                    		

                    }
                    break;
                case 56 :
                    // InternalOCCI.g:4247:3: kw= 'Float'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFloatKeyword_55());
                    		

                    }
                    break;
                case 57 :
                    // InternalOCCI.g:4253:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIntegerKeyword_56());
                    		

                    }
                    break;
                case 58 :
                    // InternalOCCI.g:4259:3: kw= 'Long'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLongKeyword_57());
                    		

                    }
                    break;
                case 59 :
                    // InternalOCCI.g:4265:3: kw= 'Short'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getShortKeyword_58());
                    		

                    }
                    break;
                case 60 :
                    // InternalOCCI.g:4271:3: kw= 'BigDecimal'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBigDecimalKeyword_59());
                    		

                    }
                    break;
                case 61 :
                    // InternalOCCI.g:4277:3: kw= 'EnumerationType'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnumerationTypeKeyword_60());
                    		

                    }
                    break;
                case 62 :
                    // InternalOCCI.g:4283:3: kw= 'literals'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLiteralsKeyword_61());
                    		

                    }
                    break;
                case 63 :
                    // InternalOCCI.g:4289:3: kw= 'RecordType'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRecordTypeKeyword_62());
                    		

                    }
                    break;
                case 64 :
                    // InternalOCCI.g:4295:3: kw= 'fields'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFieldsKeyword_63());
                    		

                    }
                    break;
                case 65 :
                    // InternalOCCI.g:4301:3: kw= 'ArrayType'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getArrayTypeKeyword_64());
                    		

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
    // InternalOCCI.g:4310:1: ruleNumericTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) ;
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
            // InternalOCCI.g:4316:2: ( ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) )
            // InternalOCCI.g:4317:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            {
            // InternalOCCI.g:4317:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            int alt97=7;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt97=1;
                }
                break;
            case 79:
                {
                alt97=2;
                }
                break;
            case 80:
                {
                alt97=3;
                }
                break;
            case 81:
                {
                alt97=4;
                }
                break;
            case 82:
                {
                alt97=5;
                }
                break;
            case 83:
                {
                alt97=6;
                }
                break;
            case 84:
                {
                alt97=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalOCCI.g:4318:3: (enumLiteral_0= 'Byte' )
                    {
                    // InternalOCCI.g:4318:3: (enumLiteral_0= 'Byte' )
                    // InternalOCCI.g:4319:4: enumLiteral_0= 'Byte'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:4326:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalOCCI.g:4326:3: (enumLiteral_1= 'Double' )
                    // InternalOCCI.g:4327:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:4334:3: (enumLiteral_2= 'Float' )
                    {
                    // InternalOCCI.g:4334:3: (enumLiteral_2= 'Float' )
                    // InternalOCCI.g:4335:4: enumLiteral_2= 'Float'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOCCI.g:4342:3: (enumLiteral_3= 'Integer' )
                    {
                    // InternalOCCI.g:4342:3: (enumLiteral_3= 'Integer' )
                    // InternalOCCI.g:4343:4: enumLiteral_3= 'Integer'
                    {
                    enumLiteral_3=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOCCI.g:4350:3: (enumLiteral_4= 'Long' )
                    {
                    // InternalOCCI.g:4350:3: (enumLiteral_4= 'Long' )
                    // InternalOCCI.g:4351:4: enumLiteral_4= 'Long'
                    {
                    enumLiteral_4=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOCCI.g:4358:3: (enumLiteral_5= 'Short' )
                    {
                    // InternalOCCI.g:4358:3: (enumLiteral_5= 'Short' )
                    // InternalOCCI.g:4359:4: enumLiteral_5= 'Short'
                    {
                    enumLiteral_5=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOCCI.g:4366:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalOCCI.g:4366:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalOCCI.g:4367:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,84,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001000008E002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000001000008C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010000088002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xFFFFFFFFBCE8F0A0L,0x00000000001FDFFFL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000024E04002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000024C04002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000024C00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000024800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008204000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400010B00002002L,0x0000000000001507L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0400010B00000002L,0x0000000000001507L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0400010A00000002L,0x0000000000001507L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400010E00000002L,0x0000000000001507L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400010800000002L,0x0000000000001507L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000007008000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000006008000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004008000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008008000210002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008008000010002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003000020000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0003000020040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008008000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000064000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000008000210002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000010002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000808040002002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000008040002002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000008000002002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000008000200002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0004000000002000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0201000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0xF800000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000040L,0x0000000000002000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0xE000000000000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x8000800000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x00000000001FC000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x8000000000000002L,0x00000000000000F8L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x8000000000000002L,0x00000000000000F0L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x8000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x8000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000022L,0x0000000000002000L});

}