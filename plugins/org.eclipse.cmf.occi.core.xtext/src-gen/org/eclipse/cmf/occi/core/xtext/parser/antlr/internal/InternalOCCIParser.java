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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_QUALIFIED_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Configuration'", "'{'", "'description'", "'location'", "'use'", "'('", "','", "')'", "'resources'", "'}'", "'mixins'", "'Resource'", "'id'", "'title'", "'summary'", "'kind'", "'attributes'", "'parts'", "'links'", "'Link'", "'target'", "'AttributeState'", "'name'", "'value'", "'MixinBase'", "'mixin'", "'extension'", "':'", "'specification'", "'import'", "'as'", "'extends'", "'source'", "'scheme'", "'annotations'", "'depends'", "'applies'", "'key'", "'attribute'", "'mutable'", "'required'", "'type'", "'='", "'action'", "'constraint'", "'body'", "'FSM'", "'states'", "'State'", "'initial'", "'final'", "'literal'", "'transitions'", "'to'", "'StringType'", "'pattern'", "'length'", "'minLength'", "'maxLength'", "'documentation'", "'EObjectType'", "'instanceClassName'", "'BooleanType'", "'NumericType'", "'totalDigits'", "'minExclusive'", "'maxExclusive'", "'minInclusive'", "'maxInclusive'", "'EnumerationType'", "'literals'", "'RecordType'", "'fields'", "'ArrayType'", "'-'", "'annotation'", "'Byte'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'BigDecimal'", "'field'"
    };
    public static final int T__50=50;
    public static final int RULE_QUALIFIED_ID=7;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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

            if ( (LA1_0==38) ) {
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
    // InternalOCCI.g:108:1: ruleConfiguration returns [EObject current=null] : ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'location' ( (lv_location_6_0= RULE_STRING ) ) )? (otherlv_7= 'use' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')' )? (otherlv_13= 'resources' otherlv_14= '{' ( (lv_resources_15_0= ruleResource ) ) (otherlv_16= ',' ( (lv_resources_17_0= ruleResource ) ) )* otherlv_18= '}' )? (otherlv_19= 'mixins' otherlv_20= '{' ( (lv_mixins_21_0= ruleMixin ) ) (otherlv_22= ',' ( (lv_mixins_23_0= ruleMixin ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_location_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_resources_15_0 = null;

        EObject lv_resources_17_0 = null;

        EObject lv_mixins_21_0 = null;

        EObject lv_mixins_23_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:114:2: ( ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'location' ( (lv_location_6_0= RULE_STRING ) ) )? (otherlv_7= 'use' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')' )? (otherlv_13= 'resources' otherlv_14= '{' ( (lv_resources_15_0= ruleResource ) ) (otherlv_16= ',' ( (lv_resources_17_0= ruleResource ) ) )* otherlv_18= '}' )? (otherlv_19= 'mixins' otherlv_20= '{' ( (lv_mixins_21_0= ruleMixin ) ) (otherlv_22= ',' ( (lv_mixins_23_0= ruleMixin ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalOCCI.g:115:2: ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'location' ( (lv_location_6_0= RULE_STRING ) ) )? (otherlv_7= 'use' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')' )? (otherlv_13= 'resources' otherlv_14= '{' ( (lv_resources_15_0= ruleResource ) ) (otherlv_16= ',' ( (lv_resources_17_0= ruleResource ) ) )* otherlv_18= '}' )? (otherlv_19= 'mixins' otherlv_20= '{' ( (lv_mixins_21_0= ruleMixin ) ) (otherlv_22= ',' ( (lv_mixins_23_0= ruleMixin ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalOCCI.g:115:2: ( () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'location' ( (lv_location_6_0= RULE_STRING ) ) )? (otherlv_7= 'use' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')' )? (otherlv_13= 'resources' otherlv_14= '{' ( (lv_resources_15_0= ruleResource ) ) (otherlv_16= ',' ( (lv_resources_17_0= ruleResource ) ) )* otherlv_18= '}' )? (otherlv_19= 'mixins' otherlv_20= '{' ( (lv_mixins_21_0= ruleMixin ) ) (otherlv_22= ',' ( (lv_mixins_23_0= ruleMixin ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalOCCI.g:116:3: () otherlv_1= 'Configuration' otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= 'location' ( (lv_location_6_0= RULE_STRING ) ) )? (otherlv_7= 'use' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')' )? (otherlv_13= 'resources' otherlv_14= '{' ( (lv_resources_15_0= ruleResource ) ) (otherlv_16= ',' ( (lv_resources_17_0= ruleResource ) ) )* otherlv_18= '}' )? (otherlv_19= 'mixins' otherlv_20= '{' ( (lv_mixins_21_0= ruleMixin ) ) (otherlv_22= ',' ( (lv_mixins_23_0= ruleMixin ) ) )* otherlv_24= '}' )? otherlv_25= '}'
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
            		
            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOCCI.g:131:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOCCI.g:132:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalOCCI.g:136:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalOCCI.g:137:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalOCCI.g:137:5: (lv_description_4_0= RULE_STRING )
                    // InternalOCCI.g:138:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getConfigurationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigurationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:155:3: (otherlv_5= 'location' ( (lv_location_6_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOCCI.g:156:4: otherlv_5= 'location' ( (lv_location_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getConfigurationAccess().getLocationKeyword_4_0());
                    			
                    // InternalOCCI.g:160:4: ( (lv_location_6_0= RULE_STRING ) )
                    // InternalOCCI.g:161:5: (lv_location_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:161:5: (lv_location_6_0= RULE_STRING )
                    // InternalOCCI.g:162:6: lv_location_6_0= RULE_STRING
                    {
                    lv_location_6_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_location_6_0, grammarAccess.getConfigurationAccess().getLocationSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigurationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:179:3: (otherlv_7= 'use' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOCCI.g:180:4: otherlv_7= 'use' otherlv_8= '(' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getUseKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getConfigurationAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalOCCI.g:188:4: ( (otherlv_9= RULE_STRING ) )
                    // InternalOCCI.g:189:5: (otherlv_9= RULE_STRING )
                    {
                    // InternalOCCI.g:189:5: (otherlv_9= RULE_STRING )
                    // InternalOCCI.g:190:6: otherlv_9= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfigurationRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(otherlv_9, grammarAccess.getConfigurationAccess().getUseExtensionCrossReference_5_2_0());
                    					

                    }


                    }

                    // InternalOCCI.g:201:4: (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalOCCI.g:202:5: otherlv_10= ',' ( (otherlv_11= RULE_STRING ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FOLLOW_5); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getConfigurationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalOCCI.g:206:5: ( (otherlv_11= RULE_STRING ) )
                    	    // InternalOCCI.g:207:6: (otherlv_11= RULE_STRING )
                    	    {
                    	    // InternalOCCI.g:207:6: (otherlv_11= RULE_STRING )
                    	    // InternalOCCI.g:208:7: otherlv_11= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getConfigurationRule());
                    	    							}
                    	    						
                    	    otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getConfigurationAccess().getUseExtensionCrossReference_5_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getConfigurationAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:225:3: (otherlv_13= 'resources' otherlv_14= '{' ( (lv_resources_15_0= ruleResource ) ) (otherlv_16= ',' ( (lv_resources_17_0= ruleResource ) ) )* otherlv_18= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOCCI.g:226:4: otherlv_13= 'resources' otherlv_14= '{' ( (lv_resources_15_0= ruleResource ) ) (otherlv_16= ',' ( (lv_resources_17_0= ruleResource ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getConfigurationAccess().getResourcesKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOCCI.g:234:4: ( (lv_resources_15_0= ruleResource ) )
                    // InternalOCCI.g:235:5: (lv_resources_15_0= ruleResource )
                    {
                    // InternalOCCI.g:235:5: (lv_resources_15_0= ruleResource )
                    // InternalOCCI.g:236:6: lv_resources_15_0= ruleResource
                    {

                    						newCompositeNode(grammarAccess.getConfigurationAccess().getResourcesResourceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_resources_15_0=ruleResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    						}
                    						add(
                    							current,
                    							"resources",
                    							lv_resources_15_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Resource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:253:4: (otherlv_16= ',' ( (lv_resources_17_0= ruleResource ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOCCI.g:254:5: otherlv_16= ',' ( (lv_resources_17_0= ruleResource ) )
                    	    {
                    	    otherlv_16=(Token)match(input,18,FOLLOW_11); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getConfigurationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOCCI.g:258:5: ( (lv_resources_17_0= ruleResource ) )
                    	    // InternalOCCI.g:259:6: (lv_resources_17_0= ruleResource )
                    	    {
                    	    // InternalOCCI.g:259:6: (lv_resources_17_0= ruleResource )
                    	    // InternalOCCI.g:260:7: lv_resources_17_0= ruleResource
                    	    {

                    	    							newCompositeNode(grammarAccess.getConfigurationAccess().getResourcesResourceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_resources_17_0=ruleResource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resources",
                    	    								lv_resources_17_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Resource");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:283:3: (otherlv_19= 'mixins' otherlv_20= '{' ( (lv_mixins_21_0= ruleMixin ) ) (otherlv_22= ',' ( (lv_mixins_23_0= ruleMixin ) ) )* otherlv_24= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOCCI.g:284:4: otherlv_19= 'mixins' otherlv_20= '{' ( (lv_mixins_21_0= ruleMixin ) ) (otherlv_22= ',' ( (lv_mixins_23_0= ruleMixin ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getConfigurationAccess().getMixinsKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalOCCI.g:292:4: ( (lv_mixins_21_0= ruleMixin ) )
                    // InternalOCCI.g:293:5: (lv_mixins_21_0= ruleMixin )
                    {
                    // InternalOCCI.g:293:5: (lv_mixins_21_0= ruleMixin )
                    // InternalOCCI.g:294:6: lv_mixins_21_0= ruleMixin
                    {

                    						newCompositeNode(grammarAccess.getConfigurationAccess().getMixinsMixinParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_mixins_21_0=ruleMixin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    						}
                    						add(
                    							current,
                    							"mixins",
                    							lv_mixins_21_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Mixin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:311:4: (otherlv_22= ',' ( (lv_mixins_23_0= ruleMixin ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalOCCI.g:312:5: otherlv_22= ',' ( (lv_mixins_23_0= ruleMixin ) )
                    	    {
                    	    otherlv_22=(Token)match(input,18,FOLLOW_14); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getConfigurationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalOCCI.g:316:5: ( (lv_mixins_23_0= ruleMixin ) )
                    	    // InternalOCCI.g:317:6: (lv_mixins_23_0= ruleMixin )
                    	    {
                    	    // InternalOCCI.g:317:6: (lv_mixins_23_0= ruleMixin )
                    	    // InternalOCCI.g:318:7: lv_mixins_23_0= ruleMixin
                    	    {

                    	    							newCompositeNode(grammarAccess.getConfigurationAccess().getMixinsMixinParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_mixins_23_0=ruleMixin();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"mixins",
                    	    								lv_mixins_23_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Mixin");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_24, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalOCCI.g:349:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalOCCI.g:349:49: (iv_ruleResource= ruleResource EOF )
            // InternalOCCI.g:350:2: iv_ruleResource= ruleResource EOF
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
    // InternalOCCI.g:356:1: ruleResource returns [EObject current=null] : (otherlv_0= 'Resource' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? otherlv_10= 'kind' ( ( ruleQualifiedID ) ) (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )? (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )? (otherlv_24= 'links' otherlv_25= '{' ( (lv_links_26_0= ruleLink ) ) (otherlv_27= ',' ( (lv_links_28_0= ruleLink ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token lv_location_7_0=null;
        Token otherlv_8=null;
        Token lv_summary_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        EObject lv_attributes_14_0 = null;

        EObject lv_attributes_16_0 = null;

        EObject lv_parts_20_0 = null;

        EObject lv_parts_22_0 = null;

        EObject lv_links_26_0 = null;

        EObject lv_links_28_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:362:2: ( (otherlv_0= 'Resource' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? otherlv_10= 'kind' ( ( ruleQualifiedID ) ) (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )? (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )? (otherlv_24= 'links' otherlv_25= '{' ( (lv_links_26_0= ruleLink ) ) (otherlv_27= ',' ( (lv_links_28_0= ruleLink ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalOCCI.g:363:2: (otherlv_0= 'Resource' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? otherlv_10= 'kind' ( ( ruleQualifiedID ) ) (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )? (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )? (otherlv_24= 'links' otherlv_25= '{' ( (lv_links_26_0= ruleLink ) ) (otherlv_27= ',' ( (lv_links_28_0= ruleLink ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalOCCI.g:363:2: (otherlv_0= 'Resource' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? otherlv_10= 'kind' ( ( ruleQualifiedID ) ) (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )? (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )? (otherlv_24= 'links' otherlv_25= '{' ( (lv_links_26_0= ruleLink ) ) (otherlv_27= ',' ( (lv_links_28_0= ruleLink ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalOCCI.g:364:3: otherlv_0= 'Resource' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )? otherlv_10= 'kind' ( ( ruleQualifiedID ) ) (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )? (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )? (otherlv_24= 'links' otherlv_25= '{' ( (lv_links_26_0= ruleLink ) ) (otherlv_27= ',' ( (lv_links_28_0= ruleLink ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getIdKeyword_2());
            		
            // InternalOCCI.g:376:3: ( (lv_id_3_0= RULE_STRING ) )
            // InternalOCCI.g:377:4: (lv_id_3_0= RULE_STRING )
            {
            // InternalOCCI.g:377:4: (lv_id_3_0= RULE_STRING )
            // InternalOCCI.g:378:5: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_id_3_0, grammarAccess.getResourceAccess().getIdSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:394:3: (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOCCI.g:395:4: otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getTitleKeyword_4_0());
                    			
                    // InternalOCCI.g:399:4: ( (lv_title_5_0= RULE_STRING ) )
                    // InternalOCCI.g:400:5: (lv_title_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:400:5: (lv_title_5_0= RULE_STRING )
                    // InternalOCCI.g:401:6: lv_title_5_0= RULE_STRING
                    {
                    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

            // InternalOCCI.g:418:3: (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOCCI.g:419:4: otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getLocationKeyword_5_0());
                    			
                    // InternalOCCI.g:423:4: ( (lv_location_7_0= RULE_STRING ) )
                    // InternalOCCI.g:424:5: (lv_location_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:424:5: (lv_location_7_0= RULE_STRING )
                    // InternalOCCI.g:425:6: lv_location_7_0= RULE_STRING
                    {
                    lv_location_7_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            // InternalOCCI.g:442:3: (otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOCCI.g:443:4: otherlv_8= 'summary' ( (lv_summary_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getSummaryKeyword_6_0());
                    			
                    // InternalOCCI.g:447:4: ( (lv_summary_9_0= RULE_STRING ) )
                    // InternalOCCI.g:448:5: (lv_summary_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:448:5: (lv_summary_9_0= RULE_STRING )
                    // InternalOCCI.g:449:6: lv_summary_9_0= RULE_STRING
                    {
                    lv_summary_9_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            otherlv_10=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_10, grammarAccess.getResourceAccess().getKindKeyword_7());
            		
            // InternalOCCI.g:470:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:471:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:471:4: ( ruleQualifiedID )
            // InternalOCCI.g:472:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getResourceAccess().getKindKindCrossReference_8_0());
            				
            pushFollow(FOLLOW_22);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:486:3: (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOCCI.g:487:4: otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getResourceAccess().getAttributesKeyword_9_0());
                    			
                    otherlv_13=(Token)match(input,13,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalOCCI.g:495:4: ( (lv_attributes_14_0= ruleAttributeState ) )
                    // InternalOCCI.g:496:5: (lv_attributes_14_0= ruleAttributeState )
                    {
                    // InternalOCCI.g:496:5: (lv_attributes_14_0= ruleAttributeState )
                    // InternalOCCI.g:497:6: lv_attributes_14_0= ruleAttributeState
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getAttributesAttributeStateParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalOCCI.g:514:4: (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalOCCI.g:515:5: otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) )
                    	    {
                    	    otherlv_15=(Token)match(input,18,FOLLOW_23); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getResourceAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalOCCI.g:519:5: ( (lv_attributes_16_0= ruleAttributeState ) )
                    	    // InternalOCCI.g:520:6: (lv_attributes_16_0= ruleAttributeState )
                    	    {
                    	    // InternalOCCI.g:520:6: (lv_attributes_16_0= ruleAttributeState )
                    	    // InternalOCCI.g:521:7: lv_attributes_16_0= ruleAttributeState
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getAttributesAttributeStateParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_24); 

                    				newLeafNode(otherlv_17, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:544:3: (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOCCI.g:545:4: otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getResourceAccess().getPartsKeyword_10_0());
                    			
                    otherlv_19=(Token)match(input,13,FOLLOW_25); 

                    				newLeafNode(otherlv_19, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalOCCI.g:553:4: ( (lv_parts_20_0= ruleMixinBase ) )
                    // InternalOCCI.g:554:5: (lv_parts_20_0= ruleMixinBase )
                    {
                    // InternalOCCI.g:554:5: (lv_parts_20_0= ruleMixinBase )
                    // InternalOCCI.g:555:6: lv_parts_20_0= ruleMixinBase
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getPartsMixinBaseParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parts_20_0=ruleMixinBase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_20_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.MixinBase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:572:4: (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalOCCI.g:573:5: otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) )
                    	    {
                    	    otherlv_21=(Token)match(input,18,FOLLOW_25); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getResourceAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalOCCI.g:577:5: ( (lv_parts_22_0= ruleMixinBase ) )
                    	    // InternalOCCI.g:578:6: (lv_parts_22_0= ruleMixinBase )
                    	    {
                    	    // InternalOCCI.g:578:6: (lv_parts_22_0= ruleMixinBase )
                    	    // InternalOCCI.g:579:7: lv_parts_22_0= ruleMixinBase
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getPartsMixinBaseParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parts_22_0=ruleMixinBase();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_22_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.MixinBase");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,21,FOLLOW_26); 

                    				newLeafNode(otherlv_23, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:602:3: (otherlv_24= 'links' otherlv_25= '{' ( (lv_links_26_0= ruleLink ) ) (otherlv_27= ',' ( (lv_links_28_0= ruleLink ) ) )* otherlv_29= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOCCI.g:603:4: otherlv_24= 'links' otherlv_25= '{' ( (lv_links_26_0= ruleLink ) ) (otherlv_27= ',' ( (lv_links_28_0= ruleLink ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getResourceAccess().getLinksKeyword_11_0());
                    			
                    otherlv_25=(Token)match(input,13,FOLLOW_27); 

                    				newLeafNode(otherlv_25, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalOCCI.g:611:4: ( (lv_links_26_0= ruleLink ) )
                    // InternalOCCI.g:612:5: (lv_links_26_0= ruleLink )
                    {
                    // InternalOCCI.g:612:5: (lv_links_26_0= ruleLink )
                    // InternalOCCI.g:613:6: lv_links_26_0= ruleLink
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getLinksLinkParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_links_26_0=ruleLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						add(
                    							current,
                    							"links",
                    							lv_links_26_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.Link");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:630:4: (otherlv_27= ',' ( (lv_links_28_0= ruleLink ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==18) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalOCCI.g:631:5: otherlv_27= ',' ( (lv_links_28_0= ruleLink ) )
                    	    {
                    	    otherlv_27=(Token)match(input,18,FOLLOW_27); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getResourceAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalOCCI.g:635:5: ( (lv_links_28_0= ruleLink ) )
                    	    // InternalOCCI.g:636:6: (lv_links_28_0= ruleLink )
                    	    {
                    	    // InternalOCCI.g:636:6: (lv_links_28_0= ruleLink )
                    	    // InternalOCCI.g:637:7: lv_links_28_0= ruleLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getLinksLinkParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_links_28_0=ruleLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"links",
                    	    								lv_links_28_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.Link");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_29, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalOCCI.g:668:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalOCCI.g:668:45: (iv_ruleLink= ruleLink EOF )
            // InternalOCCI.g:669:2: iv_ruleLink= ruleLink EOF
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
    // InternalOCCI.g:675:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'kind' ( ( ruleQualifiedID ) ) otherlv_10= 'target' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )? (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token lv_location_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_attributes_14_0 = null;

        EObject lv_attributes_16_0 = null;

        EObject lv_parts_20_0 = null;

        EObject lv_parts_22_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:681:2: ( (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'kind' ( ( ruleQualifiedID ) ) otherlv_10= 'target' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )? (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalOCCI.g:682:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'kind' ( ( ruleQualifiedID ) ) otherlv_10= 'target' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )? (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalOCCI.g:682:2: (otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'kind' ( ( ruleQualifiedID ) ) otherlv_10= 'target' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )? (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalOCCI.g:683:3: otherlv_0= 'Link' otherlv_1= '{' otherlv_2= 'id' ( (lv_id_3_0= RULE_STRING ) ) (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )? (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )? otherlv_8= 'kind' ( ( ruleQualifiedID ) ) otherlv_10= 'target' ( (otherlv_11= RULE_STRING ) ) (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )? (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getIdKeyword_2());
            		
            // InternalOCCI.g:695:3: ( (lv_id_3_0= RULE_STRING ) )
            // InternalOCCI.g:696:4: (lv_id_3_0= RULE_STRING )
            {
            // InternalOCCI.g:696:4: (lv_id_3_0= RULE_STRING )
            // InternalOCCI.g:697:5: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_id_3_0, grammarAccess.getLinkAccess().getIdSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOCCI.g:713:3: (otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOCCI.g:714:4: otherlv_4= 'title' ( (lv_title_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getTitleKeyword_4_0());
                    			
                    // InternalOCCI.g:718:4: ( (lv_title_5_0= RULE_STRING ) )
                    // InternalOCCI.g:719:5: (lv_title_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:719:5: (lv_title_5_0= RULE_STRING )
                    // InternalOCCI.g:720:6: lv_title_5_0= RULE_STRING
                    {
                    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            // InternalOCCI.g:737:3: (otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOCCI.g:738:4: otherlv_6= 'location' ( (lv_location_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getLocationKeyword_5_0());
                    			
                    // InternalOCCI.g:742:4: ( (lv_location_7_0= RULE_STRING ) )
                    // InternalOCCI.g:743:5: (lv_location_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:743:5: (lv_location_7_0= RULE_STRING )
                    // InternalOCCI.g:744:6: lv_location_7_0= RULE_STRING
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

            otherlv_8=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getKindKeyword_6());
            		
            // InternalOCCI.g:765:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:766:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:766:4: ( ruleQualifiedID )
            // InternalOCCI.g:767:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getKindKindCrossReference_7_0());
            				
            pushFollow(FOLLOW_30);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getTargetKeyword_8());
            		
            // InternalOCCI.g:785:3: ( (otherlv_11= RULE_STRING ) )
            // InternalOCCI.g:786:4: (otherlv_11= RULE_STRING )
            {
            // InternalOCCI.g:786:4: (otherlv_11= RULE_STRING )
            // InternalOCCI.g:787:5: otherlv_11= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getTargetResourceCrossReference_9_0());
            				

            }


            }

            // InternalOCCI.g:798:3: (otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOCCI.g:799:4: otherlv_12= 'attributes' otherlv_13= '{' ( (lv_attributes_14_0= ruleAttributeState ) ) (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getLinkAccess().getAttributesKeyword_10_0());
                    			
                    otherlv_13=(Token)match(input,13,FOLLOW_23); 

                    				newLeafNode(otherlv_13, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalOCCI.g:807:4: ( (lv_attributes_14_0= ruleAttributeState ) )
                    // InternalOCCI.g:808:5: (lv_attributes_14_0= ruleAttributeState )
                    {
                    // InternalOCCI.g:808:5: (lv_attributes_14_0= ruleAttributeState )
                    // InternalOCCI.g:809:6: lv_attributes_14_0= ruleAttributeState
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getAttributesAttributeStateParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_attributes_14_0=ruleAttributeState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_14_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:826:4: (otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==18) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalOCCI.g:827:5: otherlv_15= ',' ( (lv_attributes_16_0= ruleAttributeState ) )
                    	    {
                    	    otherlv_15=(Token)match(input,18,FOLLOW_23); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getLinkAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalOCCI.g:831:5: ( (lv_attributes_16_0= ruleAttributeState ) )
                    	    // InternalOCCI.g:832:6: (lv_attributes_16_0= ruleAttributeState )
                    	    {
                    	    // InternalOCCI.g:832:6: (lv_attributes_16_0= ruleAttributeState )
                    	    // InternalOCCI.g:833:7: lv_attributes_16_0= ruleAttributeState
                    	    {

                    	    							newCompositeNode(grammarAccess.getLinkAccess().getAttributesAttributeStateParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_attributes_16_0=ruleAttributeState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_16_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_32); 

                    				newLeafNode(otherlv_17, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:856:3: (otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOCCI.g:857:4: otherlv_18= 'parts' otherlv_19= '{' ( (lv_parts_20_0= ruleMixinBase ) ) (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getLinkAccess().getPartsKeyword_11_0());
                    			
                    otherlv_19=(Token)match(input,13,FOLLOW_25); 

                    				newLeafNode(otherlv_19, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalOCCI.g:865:4: ( (lv_parts_20_0= ruleMixinBase ) )
                    // InternalOCCI.g:866:5: (lv_parts_20_0= ruleMixinBase )
                    {
                    // InternalOCCI.g:866:5: (lv_parts_20_0= ruleMixinBase )
                    // InternalOCCI.g:867:6: lv_parts_20_0= ruleMixinBase
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getPartsMixinBaseParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parts_20_0=ruleMixinBase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_20_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.MixinBase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:884:4: (otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalOCCI.g:885:5: otherlv_21= ',' ( (lv_parts_22_0= ruleMixinBase ) )
                    	    {
                    	    otherlv_21=(Token)match(input,18,FOLLOW_25); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getLinkAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalOCCI.g:889:5: ( (lv_parts_22_0= ruleMixinBase ) )
                    	    // InternalOCCI.g:890:6: (lv_parts_22_0= ruleMixinBase )
                    	    {
                    	    // InternalOCCI.g:890:6: (lv_parts_22_0= ruleMixinBase )
                    	    // InternalOCCI.g:891:7: lv_parts_22_0= ruleMixinBase
                    	    {

                    	    							newCompositeNode(grammarAccess.getLinkAccess().getPartsMixinBaseParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parts_22_0=ruleMixinBase();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_22_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.MixinBase");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleAttributeState"
    // InternalOCCI.g:922:1: entryRuleAttributeState returns [EObject current=null] : iv_ruleAttributeState= ruleAttributeState EOF ;
    public final EObject entryRuleAttributeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeState = null;


        try {
            // InternalOCCI.g:922:55: (iv_ruleAttributeState= ruleAttributeState EOF )
            // InternalOCCI.g:923:2: iv_ruleAttributeState= ruleAttributeState EOF
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
    // InternalOCCI.g:929:1: ruleAttributeState returns [EObject current=null] : (otherlv_0= 'AttributeState' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleAttributeState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:935:2: ( (otherlv_0= 'AttributeState' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalOCCI.g:936:2: (otherlv_0= 'AttributeState' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalOCCI.g:936:2: (otherlv_0= 'AttributeState' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalOCCI.g:937:3: otherlv_0= 'AttributeState' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeStateAccess().getAttributeStateKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeStateAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeStateAccess().getNameKeyword_2());
            		
            // InternalOCCI.g:949:3: ( (lv_name_3_0= ruleQualifiedID ) )
            // InternalOCCI.g:950:4: (lv_name_3_0= ruleQualifiedID )
            {
            // InternalOCCI.g:950:4: (lv_name_3_0= ruleQualifiedID )
            // InternalOCCI.g:951:5: lv_name_3_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getAttributeStateAccess().getNameQualifiedIDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_3_0=ruleQualifiedID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.cmf.occi.core.xtext.OCCI.QualifiedID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeStateAccess().getValueKeyword_4());
            		
            // InternalOCCI.g:972:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalOCCI.g:973:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalOCCI.g:973:4: (lv_value_5_0= RULE_STRING )
            // InternalOCCI.g:974:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_value_5_0, grammarAccess.getAttributeStateAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAttributeStateAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleMixinBase"
    // InternalOCCI.g:998:1: entryRuleMixinBase returns [EObject current=null] : iv_ruleMixinBase= ruleMixinBase EOF ;
    public final EObject entryRuleMixinBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixinBase = null;


        try {
            // InternalOCCI.g:998:50: (iv_ruleMixinBase= ruleMixinBase EOF )
            // InternalOCCI.g:999:2: iv_ruleMixinBase= ruleMixinBase EOF
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
    // InternalOCCI.g:1005:1: ruleMixinBase returns [EObject current=null] : (otherlv_0= 'MixinBase' otherlv_1= '{' otherlv_2= 'mixin' ( ( ruleQualifiedID ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeState ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeState ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleMixinBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_attributes_6_0 = null;

        EObject lv_attributes_8_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:1011:2: ( (otherlv_0= 'MixinBase' otherlv_1= '{' otherlv_2= 'mixin' ( ( ruleQualifiedID ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeState ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeState ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalOCCI.g:1012:2: (otherlv_0= 'MixinBase' otherlv_1= '{' otherlv_2= 'mixin' ( ( ruleQualifiedID ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeState ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeState ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalOCCI.g:1012:2: (otherlv_0= 'MixinBase' otherlv_1= '{' otherlv_2= 'mixin' ( ( ruleQualifiedID ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeState ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeState ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalOCCI.g:1013:3: otherlv_0= 'MixinBase' otherlv_1= '{' otherlv_2= 'mixin' ( ( ruleQualifiedID ) ) (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeState ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeState ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMixinBaseAccess().getMixinBaseKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMixinBaseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getMixinBaseAccess().getMixinKeyword_2());
            		
            // InternalOCCI.g:1025:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:1026:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:1026:4: ( ruleQualifiedID )
            // InternalOCCI.g:1027:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMixinBaseRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMixinBaseAccess().getMixinMixinCrossReference_3_0());
            				
            pushFollow(FOLLOW_35);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:1041:3: (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeState ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeState ) ) )* otherlv_9= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOCCI.g:1042:4: otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttributeState ) ) (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeState ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMixinBaseAccess().getAttributesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getMixinBaseAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalOCCI.g:1050:4: ( (lv_attributes_6_0= ruleAttributeState ) )
                    // InternalOCCI.g:1051:5: (lv_attributes_6_0= ruleAttributeState )
                    {
                    // InternalOCCI.g:1051:5: (lv_attributes_6_0= ruleAttributeState )
                    // InternalOCCI.g:1052:6: lv_attributes_6_0= ruleAttributeState
                    {

                    						newCompositeNode(grammarAccess.getMixinBaseAccess().getAttributesAttributeStateParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_attributes_6_0=ruleAttributeState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMixinBaseRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_6_0,
                    							"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1069:4: (otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeState ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==18) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalOCCI.g:1070:5: otherlv_7= ',' ( (lv_attributes_8_0= ruleAttributeState ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_23); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMixinBaseAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOCCI.g:1074:5: ( (lv_attributes_8_0= ruleAttributeState ) )
                    	    // InternalOCCI.g:1075:6: (lv_attributes_8_0= ruleAttributeState )
                    	    {
                    	    // InternalOCCI.g:1075:6: (lv_attributes_8_0= ruleAttributeState )
                    	    // InternalOCCI.g:1076:7: lv_attributes_8_0= ruleAttributeState
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinBaseAccess().getAttributesAttributeStateParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_attributes_8_0=ruleAttributeState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMixinBaseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_8_0,
                    	    								"org.eclipse.cmf.occi.core.xtext.OCCI.AttributeState");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getMixinBaseAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMixinBaseAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleExtension"
    // InternalOCCI.g:1107:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // InternalOCCI.g:1107:50: (iv_ruleExtension= ruleExtension EOF )
            // InternalOCCI.g:1108:2: iv_ruleExtension= ruleExtension EOF
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
    // InternalOCCI.g:1114:1: ruleExtension returns [EObject current=null] : (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* ) ;
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
            // InternalOCCI.g:1120:2: ( (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* ) )
            // InternalOCCI.g:1121:2: (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* )
            {
            // InternalOCCI.g:1121:2: (otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )* )
            // InternalOCCI.g:1122:3: otherlv_0= 'extension' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= ':' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )? (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )* ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )*
            {
            otherlv_0=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionAccess().getExtensionKeyword_0());
            		
            // InternalOCCI.g:1126:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1127:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1127:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1128:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getExtensionAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_2=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getColonKeyword_2());
            		
            // InternalOCCI.g:1149:3: ( (lv_scheme_3_0= RULE_STRING ) )
            // InternalOCCI.g:1150:4: (lv_scheme_3_0= RULE_STRING )
            {
            // InternalOCCI.g:1150:4: (lv_scheme_3_0= RULE_STRING )
            // InternalOCCI.g:1151:5: lv_scheme_3_0= RULE_STRING
            {
            lv_scheme_3_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

            // InternalOCCI.g:1167:3: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==14) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOCCI.g:1168:4: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalOCCI.g:1172:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalOCCI.g:1173:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1173:5: (lv_description_5_0= RULE_STRING )
                    // InternalOCCI.g:1174:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

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

            // InternalOCCI.g:1191:3: (otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOCCI.g:1192:4: otherlv_6= 'specification' ( (lv_specification_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getExtensionAccess().getSpecificationKeyword_5_0());
                    			
                    // InternalOCCI.g:1196:4: ( (lv_specification_7_0= RULE_STRING ) )
                    // InternalOCCI.g:1197:5: (lv_specification_7_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1197:5: (lv_specification_7_0= RULE_STRING )
                    // InternalOCCI.g:1198:6: lv_specification_7_0= RULE_STRING
                    {
                    lv_specification_7_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            // InternalOCCI.g:1215:3: (otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )? )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==41) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOCCI.g:1216:4: otherlv_8= 'import' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'as' this_ID_11= RULE_ID )?
            	    {
            	    otherlv_8=(Token)match(input,41,FOLLOW_5); 

            	    				newLeafNode(otherlv_8, grammarAccess.getExtensionAccess().getImportKeyword_6_0());
            	    			
            	    // InternalOCCI.g:1220:4: ( (otherlv_9= RULE_STRING ) )
            	    // InternalOCCI.g:1221:5: (otherlv_9= RULE_STRING )
            	    {
            	    // InternalOCCI.g:1221:5: (otherlv_9= RULE_STRING )
            	    // InternalOCCI.g:1222:6: otherlv_9= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExtensionRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_40); 

            	    						newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getImportExtensionCrossReference_6_1_0());
            	    					

            	    }


            	    }

            	    // InternalOCCI.g:1233:4: (otherlv_10= 'as' this_ID_11= RULE_ID )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==42) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalOCCI.g:1234:5: otherlv_10= 'as' this_ID_11= RULE_ID
            	            {
            	            otherlv_10=(Token)match(input,42,FOLLOW_41); 

            	            					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getAsKeyword_6_2_0());
            	            				
            	            this_ID_11=(Token)match(input,RULE_ID,FOLLOW_39); 

            	            					newLeafNode(this_ID_11, grammarAccess.getExtensionAccess().getIDTerminalRuleCall_6_2_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // InternalOCCI.g:1244:3: ( ( (lv_kinds_12_0= ruleKind ) ) | ( (lv_mixins_13_0= ruleMixin ) ) | ( (lv_types_14_0= ruleDataType ) ) )*
            loop31:
            do {
                int alt31=4;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    alt31=1;
                    }
                    break;
                case 37:
                    {
                    alt31=2;
                    }
                    break;
                case 66:
                case 72:
                case 74:
                case 75:
                case 81:
                case 83:
                case 85:
                    {
                    alt31=3;
                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // InternalOCCI.g:1245:4: ( (lv_kinds_12_0= ruleKind ) )
            	    {
            	    // InternalOCCI.g:1245:4: ( (lv_kinds_12_0= ruleKind ) )
            	    // InternalOCCI.g:1246:5: (lv_kinds_12_0= ruleKind )
            	    {
            	    // InternalOCCI.g:1246:5: (lv_kinds_12_0= ruleKind )
            	    // InternalOCCI.g:1247:6: lv_kinds_12_0= ruleKind
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_42);
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
            	    // InternalOCCI.g:1265:4: ( (lv_mixins_13_0= ruleMixin ) )
            	    {
            	    // InternalOCCI.g:1265:4: ( (lv_mixins_13_0= ruleMixin ) )
            	    // InternalOCCI.g:1266:5: (lv_mixins_13_0= ruleMixin )
            	    {
            	    // InternalOCCI.g:1266:5: (lv_mixins_13_0= ruleMixin )
            	    // InternalOCCI.g:1267:6: lv_mixins_13_0= ruleMixin
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
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
            	    // InternalOCCI.g:1285:4: ( (lv_types_14_0= ruleDataType ) )
            	    {
            	    // InternalOCCI.g:1285:4: ( (lv_types_14_0= ruleDataType ) )
            	    // InternalOCCI.g:1286:5: (lv_types_14_0= ruleDataType )
            	    {
            	    // InternalOCCI.g:1286:5: (lv_types_14_0= ruleDataType )
            	    // InternalOCCI.g:1287:6: lv_types_14_0= ruleDataType
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getTypesDataTypeParserRuleCall_7_2_0());
            	    					
            	    pushFollow(FOLLOW_42);
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
            	    break loop31;
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
    // InternalOCCI.g:1309:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // InternalOCCI.g:1309:45: (iv_ruleKind= ruleKind EOF )
            // InternalOCCI.g:1310:2: iv_ruleKind= ruleKind EOF
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
    // InternalOCCI.g:1316:1: ruleKind returns [EObject current=null] : (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? otherlv_10= 'scheme' ( (lv_scheme_11_0= RULE_STRING ) ) (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? ) ;
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
            // InternalOCCI.g:1322:2: ( (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? otherlv_10= 'scheme' ( (lv_scheme_11_0= RULE_STRING ) ) (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? ) )
            // InternalOCCI.g:1323:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? otherlv_10= 'scheme' ( (lv_scheme_11_0= RULE_STRING ) ) (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? )
            {
            // InternalOCCI.g:1323:2: (otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? otherlv_10= 'scheme' ( (lv_scheme_11_0= RULE_STRING ) ) (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )? )
            // InternalOCCI.g:1324:3: otherlv_0= 'kind' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )? (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )? (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )? (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )? otherlv_10= 'scheme' ( (lv_scheme_11_0= RULE_STRING ) ) (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )? ( (lv_fsm_17_0= ruleFSM ) )? (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getKindAccess().getKindKeyword_0());
            		
            // InternalOCCI.g:1328:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1329:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1329:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1330:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getKindAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalOCCI.g:1347:3: (otherlv_2= 'extends' ( ( ruleQualifiedID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOCCI.g:1348:4: otherlv_2= 'extends' ( ( ruleQualifiedID ) )
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getKindAccess().getExtendsKeyword_2_0());
                    			
                    // InternalOCCI.g:1352:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1353:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1353:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1354:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getParentKindCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1369:3: (otherlv_4= 'source' ( ( ruleQualifiedID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOCCI.g:1370:4: otherlv_4= 'source' ( ( ruleQualifiedID ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getKindAccess().getSourceKeyword_3_0());
                    			
                    // InternalOCCI.g:1374:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1375:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1375:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1376:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getSourceKindCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1391:3: (otherlv_6= 'target' ( ( ruleQualifiedID ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOCCI.g:1392:4: otherlv_6= 'target' ( ( ruleQualifiedID ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getKindAccess().getTargetKeyword_4_0());
                    			
                    // InternalOCCI.g:1396:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1397:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1397:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1398:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKindRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKindAccess().getTargetKindCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:1413:3: (otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOCCI.g:1414:4: otherlv_8= 'title' ( (lv_title_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getKindAccess().getTitleKeyword_5_0());
                    			
                    // InternalOCCI.g:1418:4: ( (lv_title_9_0= RULE_STRING ) )
                    // InternalOCCI.g:1419:5: (lv_title_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1419:5: (lv_title_9_0= RULE_STRING )
                    // InternalOCCI.g:1420:6: lv_title_9_0= RULE_STRING
                    {
                    lv_title_9_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

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

            otherlv_10=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getKindAccess().getSchemeKeyword_6());
            		
            // InternalOCCI.g:1441:3: ( (lv_scheme_11_0= RULE_STRING ) )
            // InternalOCCI.g:1442:4: (lv_scheme_11_0= RULE_STRING )
            {
            // InternalOCCI.g:1442:4: (lv_scheme_11_0= RULE_STRING )
            // InternalOCCI.g:1443:5: lv_scheme_11_0= RULE_STRING
            {
            lv_scheme_11_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

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

            // InternalOCCI.g:1459:3: (otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==17) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOCCI.g:1460:4: otherlv_12= '(' ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+ otherlv_16= ')'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_49); 

                    				newLeafNode(otherlv_12, grammarAccess.getKindAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalOCCI.g:1464:4: ( ( (lv_attributes_13_0= ruleAttribute ) ) | ( (lv_actions_14_0= ruleAction ) ) | ( (lv_constraints_15_0= ruleConstraint ) ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=4;
                        switch ( input.LA(1) ) {
                        case 50:
                            {
                            alt36=1;
                            }
                            break;
                        case 55:
                            {
                            alt36=2;
                            }
                            break;
                        case 56:
                            {
                            alt36=3;
                            }
                            break;

                        }

                        switch (alt36) {
                    	case 1 :
                    	    // InternalOCCI.g:1465:5: ( (lv_attributes_13_0= ruleAttribute ) )
                    	    {
                    	    // InternalOCCI.g:1465:5: ( (lv_attributes_13_0= ruleAttribute ) )
                    	    // InternalOCCI.g:1466:6: (lv_attributes_13_0= ruleAttribute )
                    	    {
                    	    // InternalOCCI.g:1466:6: (lv_attributes_13_0= ruleAttribute )
                    	    // InternalOCCI.g:1467:7: lv_attributes_13_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_8_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
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
                    	    // InternalOCCI.g:1485:5: ( (lv_actions_14_0= ruleAction ) )
                    	    {
                    	    // InternalOCCI.g:1485:5: ( (lv_actions_14_0= ruleAction ) )
                    	    // InternalOCCI.g:1486:6: (lv_actions_14_0= ruleAction )
                    	    {
                    	    // InternalOCCI.g:1486:6: (lv_actions_14_0= ruleAction )
                    	    // InternalOCCI.g:1487:7: lv_actions_14_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
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
                    	    // InternalOCCI.g:1505:5: ( (lv_constraints_15_0= ruleConstraint ) )
                    	    {
                    	    // InternalOCCI.g:1505:5: ( (lv_constraints_15_0= ruleConstraint ) )
                    	    // InternalOCCI.g:1506:6: (lv_constraints_15_0= ruleConstraint )
                    	    {
                    	    // InternalOCCI.g:1506:6: (lv_constraints_15_0= ruleConstraint )
                    	    // InternalOCCI.g:1507:7: lv_constraints_15_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getConstraintsConstraintParserRuleCall_8_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
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
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_51); 

                    				newLeafNode(otherlv_16, grammarAccess.getKindAccess().getRightParenthesisKeyword_8_2());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1530:3: ( (lv_fsm_17_0= ruleFSM ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==58) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOCCI.g:1531:4: (lv_fsm_17_0= ruleFSM )
                    {
                    // InternalOCCI.g:1531:4: (lv_fsm_17_0= ruleFSM )
                    // InternalOCCI.g:1532:5: lv_fsm_17_0= ruleFSM
                    {

                    					newCompositeNode(grammarAccess.getKindAccess().getFsmFSMParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_52);
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

            // InternalOCCI.g:1549:3: (otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOCCI.g:1550:4: otherlv_18= 'annotations' otherlv_19= '{' ( (lv_annotations_20_0= ruleAnnotation ) ) (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getKindAccess().getAnnotationsKeyword_10_0());
                    			
                    otherlv_19=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalOCCI.g:1558:4: ( (lv_annotations_20_0= ruleAnnotation ) )
                    // InternalOCCI.g:1559:5: (lv_annotations_20_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1559:5: (lv_annotations_20_0= ruleAnnotation )
                    // InternalOCCI.g:1560:6: lv_annotations_20_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalOCCI.g:1577:4: (otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==18) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalOCCI.g:1578:5: otherlv_21= ',' ( (lv_annotations_22_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_21=(Token)match(input,18,FOLLOW_8); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getKindAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalOCCI.g:1582:5: ( (lv_annotations_22_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1583:6: (lv_annotations_22_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1583:6: (lv_annotations_22_0= ruleAnnotation )
                    	    // InternalOCCI.g:1584:7: lv_annotations_22_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,21,FOLLOW_2); 

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
    // InternalOCCI.g:1611:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // InternalOCCI.g:1611:46: (iv_ruleMixin= ruleMixin EOF )
            // InternalOCCI.g:1612:2: iv_ruleMixin= ruleMixin EOF
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
    // InternalOCCI.g:1618:1: ruleMixin returns [EObject current=null] : (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? ) ;
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
            // InternalOCCI.g:1624:2: ( (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? ) )
            // InternalOCCI.g:1625:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? )
            {
            // InternalOCCI.g:1625:2: (otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )? )
            // InternalOCCI.g:1626:3: otherlv_0= 'mixin' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )? (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )? otherlv_14= 'scheme' ( (lv_scheme_15_0= RULE_STRING ) ) (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )? (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )? (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getMixinAccess().getMixinKeyword_0());
            		
            // InternalOCCI.g:1630:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:1631:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:1631:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:1632:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getMixinAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
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

            // InternalOCCI.g:1649:3: (otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==47) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOCCI.g:1650:4: otherlv_2= 'depends' otherlv_3= '(' ( ( ruleQualifiedID ) ) (otherlv_5= ',' ( ( ruleQualifiedID ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getMixinAccess().getDependsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalOCCI.g:1658:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1659:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1659:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1660:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1674:4: (otherlv_5= ',' ( ( ruleQualifiedID ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==18) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalOCCI.g:1675:5: otherlv_5= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMixinAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalOCCI.g:1679:5: ( ( ruleQualifiedID ) )
                    	    // InternalOCCI.g:1680:6: ( ruleQualifiedID )
                    	    {
                    	    // InternalOCCI.g:1680:6: ( ruleQualifiedID )
                    	    // InternalOCCI.g:1681:7: ruleQualifiedID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMixinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    ruleQualifiedID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_54); 

                    				newLeafNode(otherlv_7, grammarAccess.getMixinAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1701:3: (otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOCCI.g:1702:4: otherlv_8= 'applies' otherlv_9= '(' ( ( ruleQualifiedID ) ) (otherlv_11= ',' ( ( ruleQualifiedID ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getMixinAccess().getAppliesKeyword_3_0());
                    			
                    otherlv_9=(Token)match(input,17,FOLLOW_21); 

                    				newLeafNode(otherlv_9, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalOCCI.g:1710:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:1711:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:1711:5: ( ruleQualifiedID )
                    // InternalOCCI.g:1712:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMixinRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOCCI.g:1726:4: (otherlv_11= ',' ( ( ruleQualifiedID ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==18) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalOCCI.g:1727:5: otherlv_11= ',' ( ( ruleQualifiedID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMixinAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalOCCI.g:1731:5: ( ( ruleQualifiedID ) )
                    	    // InternalOCCI.g:1732:6: ( ruleQualifiedID )
                    	    {
                    	    // InternalOCCI.g:1732:6: ( ruleQualifiedID )
                    	    // InternalOCCI.g:1733:7: ruleQualifiedID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMixinRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    ruleQualifiedID();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_47); 

                    				newLeafNode(otherlv_13, grammarAccess.getMixinAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getMixinAccess().getSchemeKeyword_4());
            		
            // InternalOCCI.g:1757:3: ( (lv_scheme_15_0= RULE_STRING ) )
            // InternalOCCI.g:1758:4: (lv_scheme_15_0= RULE_STRING )
            {
            // InternalOCCI.g:1758:4: (lv_scheme_15_0= RULE_STRING )
            // InternalOCCI.g:1759:5: lv_scheme_15_0= RULE_STRING
            {
            lv_scheme_15_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

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

            // InternalOCCI.g:1775:3: (otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOCCI.g:1776:4: otherlv_16= 'title' ( (lv_title_17_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getMixinAccess().getTitleKeyword_6_0());
                    			
                    // InternalOCCI.g:1780:4: ( (lv_title_17_0= RULE_STRING ) )
                    // InternalOCCI.g:1781:5: (lv_title_17_0= RULE_STRING )
                    {
                    // InternalOCCI.g:1781:5: (lv_title_17_0= RULE_STRING )
                    // InternalOCCI.g:1782:6: lv_title_17_0= RULE_STRING
                    {
                    lv_title_17_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

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

            // InternalOCCI.g:1799:3: (otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==17) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOCCI.g:1800:4: otherlv_18= '(' ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+ otherlv_22= ')'
                    {
                    otherlv_18=(Token)match(input,17,FOLLOW_49); 

                    				newLeafNode(otherlv_18, grammarAccess.getMixinAccess().getLeftParenthesisKeyword_7_0());
                    			
                    // InternalOCCI.g:1804:4: ( ( (lv_attributes_19_0= ruleAttribute ) ) | ( (lv_actions_20_0= ruleAction ) ) | ( (lv_constraints_21_0= ruleConstraint ) ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=4;
                        switch ( input.LA(1) ) {
                        case 50:
                            {
                            alt46=1;
                            }
                            break;
                        case 55:
                            {
                            alt46=2;
                            }
                            break;
                        case 56:
                            {
                            alt46=3;
                            }
                            break;

                        }

                        switch (alt46) {
                    	case 1 :
                    	    // InternalOCCI.g:1805:5: ( (lv_attributes_19_0= ruleAttribute ) )
                    	    {
                    	    // InternalOCCI.g:1805:5: ( (lv_attributes_19_0= ruleAttribute ) )
                    	    // InternalOCCI.g:1806:6: (lv_attributes_19_0= ruleAttribute )
                    	    {
                    	    // InternalOCCI.g:1806:6: (lv_attributes_19_0= ruleAttribute )
                    	    // InternalOCCI.g:1807:7: lv_attributes_19_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_7_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
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
                    	    // InternalOCCI.g:1825:5: ( (lv_actions_20_0= ruleAction ) )
                    	    {
                    	    // InternalOCCI.g:1825:5: ( (lv_actions_20_0= ruleAction ) )
                    	    // InternalOCCI.g:1826:6: (lv_actions_20_0= ruleAction )
                    	    {
                    	    // InternalOCCI.g:1826:6: (lv_actions_20_0= ruleAction )
                    	    // InternalOCCI.g:1827:7: lv_actions_20_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
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
                    	    // InternalOCCI.g:1845:5: ( (lv_constraints_21_0= ruleConstraint ) )
                    	    {
                    	    // InternalOCCI.g:1845:5: ( (lv_constraints_21_0= ruleConstraint ) )
                    	    // InternalOCCI.g:1846:6: (lv_constraints_21_0= ruleConstraint )
                    	    {
                    	    // InternalOCCI.g:1846:6: (lv_constraints_21_0= ruleConstraint )
                    	    // InternalOCCI.g:1847:7: lv_constraints_21_0= ruleConstraint
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getConstraintsConstraintParserRuleCall_7_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_50);
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
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_52); 

                    				newLeafNode(otherlv_22, grammarAccess.getMixinAccess().getRightParenthesisKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:1870:3: (otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOCCI.g:1871:4: otherlv_23= 'annotations' otherlv_24= '{' ( (lv_annotations_25_0= ruleAnnotation ) ) (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getMixinAccess().getAnnotationsKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_24, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalOCCI.g:1879:4: ( (lv_annotations_25_0= ruleAnnotation ) )
                    // InternalOCCI.g:1880:5: (lv_annotations_25_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:1880:5: (lv_annotations_25_0= ruleAnnotation )
                    // InternalOCCI.g:1881:6: lv_annotations_25_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalOCCI.g:1898:4: (otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==18) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalOCCI.g:1899:5: otherlv_26= ',' ( (lv_annotations_27_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,18,FOLLOW_8); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getMixinAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalOCCI.g:1903:5: ( (lv_annotations_27_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:1904:6: (lv_annotations_27_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:1904:6: (lv_annotations_27_0= ruleAnnotation )
                    	    // InternalOCCI.g:1905:7: lv_annotations_27_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,21,FOLLOW_2); 

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
    // InternalOCCI.g:1932:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalOCCI.g:1932:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalOCCI.g:1933:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalOCCI.g:1939:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
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
            // InternalOCCI.g:1945:2: ( (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalOCCI.g:1946:2: (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalOCCI.g:1946:2: (otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalOCCI.g:1947:3: otherlv_0= '(' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= 'value' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getKeyKeyword_1());
            		
            // InternalOCCI.g:1955:3: ( (lv_key_2_0= RULE_STRING ) )
            // InternalOCCI.g:1956:4: (lv_key_2_0= RULE_STRING )
            {
            // InternalOCCI.g:1956:4: (lv_key_2_0= RULE_STRING )
            // InternalOCCI.g:1957:5: lv_key_2_0= RULE_STRING
            {
            lv_key_2_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            otherlv_3=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getValueKeyword_3());
            		
            // InternalOCCI.g:1977:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalOCCI.g:1978:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalOCCI.g:1978:4: (lv_value_4_0= RULE_STRING )
            // InternalOCCI.g:1979:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

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

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

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
    // InternalOCCI.g:2003:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOCCI.g:2003:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOCCI.g:2004:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOCCI.g:2010:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? ) ;
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
            // InternalOCCI.g:2016:2: ( (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? ) )
            // InternalOCCI.g:2017:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? )
            {
            // InternalOCCI.g:2017:2: (otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )? )
            // InternalOCCI.g:2018:3: otherlv_0= 'attribute' ( (lv_mutable_1_0= 'mutable' ) )? ( (lv_required_2_0= 'required' ) )? ( (lv_name_3_0= ruleQualifiedID ) ) otherlv_4= ':' (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )? (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )? (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )? (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalOCCI.g:2022:3: ( (lv_mutable_1_0= 'mutable' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==RULE_ID||LA50_1==RULE_QUALIFIED_ID||LA50_1==14||LA50_1==25||LA50_1==27||LA50_1==32||LA50_1==35||(LA50_1>=37 && LA50_1<=38)||LA50_1==40||(LA50_1>=42 && LA50_1<=53)||(LA50_1>=55 && LA50_1<=57)||(LA50_1>=66 && LA50_1<=85)||(LA50_1>=87 && LA50_1<=95)) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalOCCI.g:2023:4: (lv_mutable_1_0= 'mutable' )
                    {
                    // InternalOCCI.g:2023:4: (lv_mutable_1_0= 'mutable' )
                    // InternalOCCI.g:2024:5: lv_mutable_1_0= 'mutable'
                    {
                    lv_mutable_1_0=(Token)match(input,51,FOLLOW_21); 

                    					newLeafNode(lv_mutable_1_0, grammarAccess.getAttributeAccess().getMutableMutableKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2036:3: ( (lv_required_2_0= 'required' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==52) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_ID||LA51_1==RULE_QUALIFIED_ID||LA51_1==14||LA51_1==25||LA51_1==27||LA51_1==32||LA51_1==35||(LA51_1>=37 && LA51_1<=38)||LA51_1==40||(LA51_1>=42 && LA51_1<=53)||(LA51_1>=55 && LA51_1<=57)||(LA51_1>=66 && LA51_1<=85)||(LA51_1>=87 && LA51_1<=95)) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalOCCI.g:2037:4: (lv_required_2_0= 'required' )
                    {
                    // InternalOCCI.g:2037:4: (lv_required_2_0= 'required' )
                    // InternalOCCI.g:2038:5: lv_required_2_0= 'required'
                    {
                    lv_required_2_0=(Token)match(input,52,FOLLOW_21); 

                    					newLeafNode(lv_required_2_0, grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2050:3: ( (lv_name_3_0= ruleQualifiedID ) )
            // InternalOCCI.g:2051:4: (lv_name_3_0= ruleQualifiedID )
            {
            // InternalOCCI.g:2051:4: (lv_name_3_0= ruleQualifiedID )
            // InternalOCCI.g:2052:5: lv_name_3_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameQualifiedIDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_4=(Token)match(input,39,FOLLOW_59); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4());
            		
            // InternalOCCI.g:2073:3: (otherlv_5= 'type' ( ( ruleQualifiedID ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==53) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOCCI.g:2074:4: otherlv_5= 'type' ( ( ruleQualifiedID ) )
                    {
                    otherlv_5=(Token)match(input,53,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getTypeKeyword_5_0());
                    			
                    // InternalOCCI.g:2078:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:2079:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:2079:5: ( ruleQualifiedID )
                    // InternalOCCI.g:2080:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOCCI.g:2095:3: (otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==54) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOCCI.g:2096:4: otherlv_7= '=' ( (lv_default_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getEqualsSignKeyword_6_0());
                    			
                    // InternalOCCI.g:2100:4: ( (lv_default_8_0= RULE_STRING ) )
                    // InternalOCCI.g:2101:5: (lv_default_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2101:5: (lv_default_8_0= RULE_STRING )
                    // InternalOCCI.g:2102:6: lv_default_8_0= RULE_STRING
                    {
                    lv_default_8_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

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

            // InternalOCCI.g:2119:3: (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==14) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOCCI.g:2120:4: otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getDescriptionKeyword_7_0());
                    			
                    // InternalOCCI.g:2124:4: ( (lv_description_10_0= RULE_STRING ) )
                    // InternalOCCI.g:2125:5: (lv_description_10_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2125:5: (lv_description_10_0= RULE_STRING )
                    // InternalOCCI.g:2126:6: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

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

            // InternalOCCI.g:2143:3: (otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==46) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOCCI.g:2144:4: otherlv_11= 'annotations' otherlv_12= '{' ( (lv_annotations_13_0= ruleAnnotation ) ) (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getAnnotationsKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalOCCI.g:2152:4: ( (lv_annotations_13_0= ruleAnnotation ) )
                    // InternalOCCI.g:2153:5: (lv_annotations_13_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:2153:5: (lv_annotations_13_0= ruleAnnotation )
                    // InternalOCCI.g:2154:6: lv_annotations_13_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalOCCI.g:2171:4: (otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==18) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalOCCI.g:2172:5: otherlv_14= ',' ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FOLLOW_8); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalOCCI.g:2176:5: ( (lv_annotations_15_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:2177:6: (lv_annotations_15_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:2177:6: (lv_annotations_15_0= ruleAnnotation )
                    	    // InternalOCCI.g:2178:7: lv_annotations_15_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,21,FOLLOW_2); 

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
    // InternalOCCI.g:2205:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalOCCI.g:2205:47: (iv_ruleAction= ruleAction EOF )
            // InternalOCCI.g:2206:2: iv_ruleAction= ruleAction EOF
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
    // InternalOCCI.g:2212:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) ;
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
            // InternalOCCI.g:2218:2: ( (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? ) )
            // InternalOCCI.g:2219:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            {
            // InternalOCCI.g:2219:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )? )
            // InternalOCCI.g:2220:3: otherlv_0= 'action' ( (lv_name_1_0= ruleNameID ) ) otherlv_2= 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )? (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )? (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalOCCI.g:2224:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:2225:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:2225:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:2226:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
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

            otherlv_2=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getSchemeKeyword_2());
            		
            // InternalOCCI.g:2247:3: ( (lv_scheme_3_0= RULE_STRING ) )
            // InternalOCCI.g:2248:4: (lv_scheme_3_0= RULE_STRING )
            {
            // InternalOCCI.g:2248:4: (lv_scheme_3_0= RULE_STRING )
            // InternalOCCI.g:2249:5: lv_scheme_3_0= RULE_STRING
            {
            lv_scheme_3_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

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

            // InternalOCCI.g:2265:3: (otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==17) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalOCCI.g:2266:4: otherlv_4= '(' ( (lv_attributes_5_0= ruleParameterDecl ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )* otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalOCCI.g:2270:4: ( (lv_attributes_5_0= ruleParameterDecl ) )
                    // InternalOCCI.g:2271:5: (lv_attributes_5_0= ruleParameterDecl )
                    {
                    // InternalOCCI.g:2271:5: (lv_attributes_5_0= ruleParameterDecl )
                    // InternalOCCI.g:2272:6: lv_attributes_5_0= ruleParameterDecl
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalOCCI.g:2289:4: (otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==18) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalOCCI.g:2290:5: otherlv_6= ',' ( (lv_attributes_7_0= ruleParameterDecl ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getActionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalOCCI.g:2294:5: ( (lv_attributes_7_0= ruleParameterDecl ) )
                    	    // InternalOCCI.g:2295:6: (lv_attributes_7_0= ruleParameterDecl )
                    	    {
                    	    // InternalOCCI.g:2295:6: (lv_attributes_7_0= ruleParameterDecl )
                    	    // InternalOCCI.g:2296:7: lv_attributes_7_0= ruleParameterDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,19,FOLLOW_63); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:2319:3: (otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==13) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOCCI.g:2320:4: otherlv_9= '{' otherlv_10= 'title' ( (lv_title_11_0= RULE_STRING ) ) otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_64); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    otherlv_10=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getActionAccess().getTitleKeyword_5_1());
                    			
                    // InternalOCCI.g:2328:4: ( (lv_title_11_0= RULE_STRING ) )
                    // InternalOCCI.g:2329:5: (lv_title_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2329:5: (lv_title_11_0= RULE_STRING )
                    // InternalOCCI.g:2330:6: lv_title_11_0= RULE_STRING
                    {
                    lv_title_11_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

                    otherlv_12=(Token)match(input,21,FOLLOW_52); 

                    				newLeafNode(otherlv_12, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalOCCI.g:2351:3: (otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==46) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOCCI.g:2352:4: otherlv_13= 'annotations' otherlv_14= '{' ( (lv_annotations_15_0= ruleAnnotation ) ) (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionAccess().getAnnotationsKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOCCI.g:2360:4: ( (lv_annotations_15_0= ruleAnnotation ) )
                    // InternalOCCI.g:2361:5: (lv_annotations_15_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:2361:5: (lv_annotations_15_0= ruleAnnotation )
                    // InternalOCCI.g:2362:6: lv_annotations_15_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalOCCI.g:2379:4: (otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==18) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalOCCI.g:2380:5: otherlv_16= ',' ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_16=(Token)match(input,18,FOLLOW_8); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getActionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOCCI.g:2384:5: ( (lv_annotations_17_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:2385:6: (lv_annotations_17_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:2385:6: (lv_annotations_17_0= ruleAnnotation )
                    	    // InternalOCCI.g:2386:7: lv_annotations_17_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,21,FOLLOW_2); 

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
    // InternalOCCI.g:2413:1: entryRuleParameterDecl returns [EObject current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final EObject entryRuleParameterDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDecl = null;


        try {
            // InternalOCCI.g:2413:54: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalOCCI.g:2414:2: iv_ruleParameterDecl= ruleParameterDecl EOF
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
    // InternalOCCI.g:2420:1: ruleParameterDecl returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleParameterDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_default_4_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalOCCI.g:2426:2: ( ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2427:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2427:2: ( ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2428:3: ( (lv_name_0_0= ruleQualifiedID ) ) otherlv_1= ':' ( ( ruleQualifiedID ) ) (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            {
            // InternalOCCI.g:2428:3: ( (lv_name_0_0= ruleQualifiedID ) )
            // InternalOCCI.g:2429:4: (lv_name_0_0= ruleQualifiedID )
            {
            // InternalOCCI.g:2429:4: (lv_name_0_0= ruleQualifiedID )
            // InternalOCCI.g:2430:5: lv_name_0_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getParameterDeclAccess().getNameQualifiedIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_1=(Token)match(input,39,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDeclAccess().getColonKeyword_1());
            		
            // InternalOCCI.g:2451:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2452:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2452:4: ( ruleQualifiedID )
            // InternalOCCI.g:2453:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterDeclRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterDeclAccess().getTypeDataTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_65);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2467:3: (otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==54) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOCCI.g:2468:4: otherlv_3= '=' ( (lv_default_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDeclAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalOCCI.g:2472:4: ( (lv_default_4_0= RULE_STRING ) )
                    // InternalOCCI.g:2473:5: (lv_default_4_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2473:5: (lv_default_4_0= RULE_STRING )
                    // InternalOCCI.g:2474:6: lv_default_4_0= RULE_STRING
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
    // InternalOCCI.g:2495:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalOCCI.g:2495:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalOCCI.g:2496:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalOCCI.g:2502:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) ;
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
            // InternalOCCI.g:2508:2: ( (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) ) )
            // InternalOCCI.g:2509:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            {
            // InternalOCCI.g:2509:2: (otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) ) )
            // InternalOCCI.g:2510:3: otherlv_0= 'constraint' ( (lv_name_1_0= ruleNameID ) ) (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )? otherlv_4= 'body' ( (lv_body_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            // InternalOCCI.g:2514:3: ( (lv_name_1_0= ruleNameID ) )
            // InternalOCCI.g:2515:4: (lv_name_1_0= ruleNameID )
            {
            // InternalOCCI.g:2515:4: (lv_name_1_0= ruleNameID )
            // InternalOCCI.g:2516:5: lv_name_1_0= ruleNameID
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getNameNameIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_66);
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

            // InternalOCCI.g:2533:3: (otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==14) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOCCI.g:2534:4: otherlv_2= 'description' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalOCCI.g:2538:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalOCCI.g:2539:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:2539:5: (lv_description_3_0= RULE_STRING )
                    // InternalOCCI.g:2540:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_67); 

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

            otherlv_4=(Token)match(input,57,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getBodyKeyword_3());
            		
            // InternalOCCI.g:2561:3: ( (lv_body_5_0= RULE_STRING ) )
            // InternalOCCI.g:2562:4: (lv_body_5_0= RULE_STRING )
            {
            // InternalOCCI.g:2562:4: (lv_body_5_0= RULE_STRING )
            // InternalOCCI.g:2563:5: lv_body_5_0= RULE_STRING
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
    // InternalOCCI.g:2583:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalOCCI.g:2583:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalOCCI.g:2584:2: iv_ruleFSM= ruleFSM EOF
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
    // InternalOCCI.g:2590:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' otherlv_1= '(' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= ')' ) ;
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
            // InternalOCCI.g:2596:2: ( (otherlv_0= 'FSM' otherlv_1= '(' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= ')' ) )
            // InternalOCCI.g:2597:2: (otherlv_0= 'FSM' otherlv_1= '(' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= ')' )
            {
            // InternalOCCI.g:2597:2: (otherlv_0= 'FSM' otherlv_1= '(' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= ')' )
            // InternalOCCI.g:2598:3: otherlv_0= 'FSM' otherlv_1= '(' otherlv_2= 'attribute' ( ( ruleQualifiedID ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )? otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,50,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getFSMAccess().getAttributeKeyword_2());
            		
            // InternalOCCI.g:2610:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2611:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2611:4: ( ruleQualifiedID )
            // InternalOCCI.g:2612:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFSMRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFSMAccess().getAttributeAttributeCrossReference_3_0());
            				
            pushFollow(FOLLOW_69);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOCCI.g:2626:3: (otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==59) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOCCI.g:2627:4: otherlv_4= 'states' otherlv_5= '{' ( (lv_ownedState_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFSMAccess().getStatesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_70); 

                    				newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalOCCI.g:2635:4: ( (lv_ownedState_6_0= ruleState ) )
                    // InternalOCCI.g:2636:5: (lv_ownedState_6_0= ruleState )
                    {
                    // InternalOCCI.g:2636:5: (lv_ownedState_6_0= ruleState )
                    // InternalOCCI.g:2637:6: lv_ownedState_6_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalOCCI.g:2654:4: (otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==18) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalOCCI.g:2655:5: otherlv_7= ',' ( (lv_ownedState_8_0= ruleState ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_70); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalOCCI.g:2659:5: ( (lv_ownedState_8_0= ruleState ) )
                    	    // InternalOCCI.g:2660:6: (lv_ownedState_8_0= ruleState )
                    	    {
                    	    // InternalOCCI.g:2660:6: (lv_ownedState_8_0= ruleState )
                    	    // InternalOCCI.g:2661:7: lv_ownedState_8_0= ruleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

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
    // InternalOCCI.g:2692:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalOCCI.g:2692:46: (iv_ruleState= ruleState EOF )
            // InternalOCCI.g:2693:2: iv_ruleState= ruleState EOF
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
    // InternalOCCI.g:2699:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' otherlv_1= '(' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )? otherlv_12= ')' ) ;
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
            // InternalOCCI.g:2705:2: ( (otherlv_0= 'State' otherlv_1= '(' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )? otherlv_12= ')' ) )
            // InternalOCCI.g:2706:2: (otherlv_0= 'State' otherlv_1= '(' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )? otherlv_12= ')' )
            {
            // InternalOCCI.g:2706:2: (otherlv_0= 'State' otherlv_1= '(' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )? otherlv_12= ')' )
            // InternalOCCI.g:2707:3: otherlv_0= 'State' otherlv_1= '(' ( (lv_initial_2_0= 'initial' ) )? ( (lv_final_3_0= 'final' ) )? (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) ) (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )? otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_71); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalOCCI.g:2715:3: ( (lv_initial_2_0= 'initial' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==61) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalOCCI.g:2716:4: (lv_initial_2_0= 'initial' )
                    {
                    // InternalOCCI.g:2716:4: (lv_initial_2_0= 'initial' )
                    // InternalOCCI.g:2717:5: lv_initial_2_0= 'initial'
                    {
                    lv_initial_2_0=(Token)match(input,61,FOLLOW_72); 

                    					newLeafNode(lv_initial_2_0, grammarAccess.getStateAccess().getInitialInitialKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "initial", true, "initial");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2729:3: ( (lv_final_3_0= 'final' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==62) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOCCI.g:2730:4: (lv_final_3_0= 'final' )
                    {
                    // InternalOCCI.g:2730:4: (lv_final_3_0= 'final' )
                    // InternalOCCI.g:2731:5: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,62,FOLLOW_73); 

                    					newLeafNode(lv_final_3_0, grammarAccess.getStateAccess().getFinalFinalKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "final", true, "final");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:2743:3: (otherlv_4= 'literal' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:2744:4: otherlv_4= 'literal' ( ( ruleQualifiedID ) )
            {
            otherlv_4=(Token)match(input,63,FOLLOW_21); 

            				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLiteralKeyword_4_0());
            			
            // InternalOCCI.g:2748:4: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2749:5: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2749:5: ( ruleQualifiedID )
            // InternalOCCI.g:2750:6: ruleQualifiedID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getStateRule());
            						}
            					

            						newCompositeNode(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_4_1_0());
            					
            pushFollow(FOLLOW_74);
            ruleQualifiedID();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOCCI.g:2765:3: (otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==64) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalOCCI.g:2766:4: otherlv_6= 'transitions' otherlv_7= '(' ( (lv_outgoingTransition_8_0= ruleTransition ) ) (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,64,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getTransitionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,17,FOLLOW_75); 

                    				newLeafNode(otherlv_7, grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalOCCI.g:2774:4: ( (lv_outgoingTransition_8_0= ruleTransition ) )
                    // InternalOCCI.g:2775:5: (lv_outgoingTransition_8_0= ruleTransition )
                    {
                    // InternalOCCI.g:2775:5: (lv_outgoingTransition_8_0= ruleTransition )
                    // InternalOCCI.g:2776:6: lv_outgoingTransition_8_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalOCCI.g:2793:4: (otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==18) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalOCCI.g:2794:5: otherlv_9= ',' ( (lv_outgoingTransition_10_0= ruleTransition ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FOLLOW_75); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalOCCI.g:2798:5: ( (lv_outgoingTransition_10_0= ruleTransition ) )
                    	    // InternalOCCI.g:2799:6: (lv_outgoingTransition_10_0= ruleTransition )
                    	    {
                    	    // InternalOCCI.g:2799:6: (lv_outgoingTransition_10_0= ruleTransition )
                    	    // InternalOCCI.g:2800:7: lv_outgoingTransition_10_0= ruleTransition
                    	    {

                    	    							newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_58); 

                    				newLeafNode(otherlv_11, grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

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
    // InternalOCCI.g:2831:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalOCCI.g:2831:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalOCCI.g:2832:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalOCCI.g:2838:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalOCCI.g:2844:2: ( ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) ) )
            // InternalOCCI.g:2845:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            {
            // InternalOCCI.g:2845:2: ( (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:2846:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )? otherlv_2= 'to' ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:2846:3: (otherlv_0= 'action' ( ( ruleQualifiedID ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==55) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalOCCI.g:2847:4: otherlv_0= 'action' ( ( ruleQualifiedID ) )
                    {
                    otherlv_0=(Token)match(input,55,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getActionKeyword_0_0());
                    			
                    // InternalOCCI.g:2851:4: ( ( ruleQualifiedID ) )
                    // InternalOCCI.g:2852:5: ( ruleQualifiedID )
                    {
                    // InternalOCCI.g:2852:5: ( ruleQualifiedID )
                    // InternalOCCI.g:2853:6: ruleQualifiedID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getActionActionCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    ruleQualifiedID();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,65,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToKeyword_1());
            		
            // InternalOCCI.g:2872:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:2873:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:2873:4: ( ruleQualifiedID )
            // InternalOCCI.g:2874:5: ruleQualifiedID
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
    // InternalOCCI.g:2892:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalOCCI.g:2892:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalOCCI.g:2893:2: iv_ruleDataType= ruleDataType EOF
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
    // InternalOCCI.g:2899:1: ruleDataType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) ;
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
            // InternalOCCI.g:2905:2: ( (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType ) )
            // InternalOCCI.g:2906:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            {
            // InternalOCCI.g:2906:2: (this_StringType_0= ruleStringType | this_EObjectType_1= ruleEObjectType | this_BooleanType_2= ruleBooleanType | this_NumericType_3= ruleNumericType | this_EnumerationType_4= ruleEnumerationType | this_RecordType_5= ruleRecordType | this_ArrayType_6= ruleArrayType )
            int alt71=7;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt71=1;
                }
                break;
            case 72:
                {
                alt71=2;
                }
                break;
            case 74:
                {
                alt71=3;
                }
                break;
            case 75:
                {
                alt71=4;
                }
                break;
            case 81:
                {
                alt71=5;
                }
                break;
            case 83:
                {
                alt71=6;
                }
                break;
            case 85:
                {
                alt71=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalOCCI.g:2907:3: this_StringType_0= ruleStringType
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
                    // InternalOCCI.g:2916:3: this_EObjectType_1= ruleEObjectType
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
                    // InternalOCCI.g:2925:3: this_BooleanType_2= ruleBooleanType
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
                    // InternalOCCI.g:2934:3: this_NumericType_3= ruleNumericType
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
                    // InternalOCCI.g:2943:3: this_EnumerationType_4= ruleEnumerationType
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
                    // InternalOCCI.g:2952:3: this_RecordType_5= ruleRecordType
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
                    // InternalOCCI.g:2961:3: this_ArrayType_6= ruleArrayType
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
    // InternalOCCI.g:2973:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalOCCI.g:2973:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalOCCI.g:2974:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalOCCI.g:2980:1: ruleStringType returns [EObject current=null] : (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? ) ;
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
            // InternalOCCI.g:2986:2: ( (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:2987:2: (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:2987:2: (otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:2988:3: otherlv_0= 'StringType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )? (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )? (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )? (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getStringTypeAccess().getStringTypeKeyword_0());
            		
            // InternalOCCI.g:2992:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:2993:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:2993:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:2994:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_77); 

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

            // InternalOCCI.g:3010:3: (otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==67) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalOCCI.g:3011:4: otherlv_2= 'pattern' ( (lv_pattern_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getPatternKeyword_2_0());
                    			
                    // InternalOCCI.g:3015:4: ( (lv_pattern_3_0= RULE_STRING ) )
                    // InternalOCCI.g:3016:5: (lv_pattern_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3016:5: (lv_pattern_3_0= RULE_STRING )
                    // InternalOCCI.g:3017:6: lv_pattern_3_0= RULE_STRING
                    {
                    lv_pattern_3_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

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

            // InternalOCCI.g:3034:3: (otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==68) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalOCCI.g:3035:4: otherlv_4= 'length' ( (lv_length_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_79); 

                    				newLeafNode(otherlv_4, grammarAccess.getStringTypeAccess().getLengthKeyword_3_0());
                    			
                    // InternalOCCI.g:3039:4: ( (lv_length_5_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:3040:5: (lv_length_5_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:3040:5: (lv_length_5_0= ruleEIntegerObject )
                    // InternalOCCI.g:3041:6: lv_length_5_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getLengthEIntegerObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_80);
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

            // InternalOCCI.g:3059:3: (otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==69) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalOCCI.g:3060:4: otherlv_6= 'minLength' ( (lv_minLength_7_0= ruleEIntegerObject ) )
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_79); 

                    				newLeafNode(otherlv_6, grammarAccess.getStringTypeAccess().getMinLengthKeyword_4_0());
                    			
                    // InternalOCCI.g:3064:4: ( (lv_minLength_7_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:3065:5: (lv_minLength_7_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:3065:5: (lv_minLength_7_0= ruleEIntegerObject )
                    // InternalOCCI.g:3066:6: lv_minLength_7_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMinLengthEIntegerObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_81);
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

            // InternalOCCI.g:3084:3: (otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==70) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalOCCI.g:3085:4: otherlv_8= 'maxLength' ( (lv_maxLength_9_0= ruleEIntegerObject ) )
                    {
                    otherlv_8=(Token)match(input,70,FOLLOW_79); 

                    				newLeafNode(otherlv_8, grammarAccess.getStringTypeAccess().getMaxLengthKeyword_5_0());
                    			
                    // InternalOCCI.g:3089:4: ( (lv_maxLength_9_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:3090:5: (lv_maxLength_9_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:3090:5: (lv_maxLength_9_0= ruleEIntegerObject )
                    // InternalOCCI.g:3091:6: lv_maxLength_9_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getStringTypeAccess().getMaxLengthEIntegerObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_82);
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

            // InternalOCCI.g:3109:3: (otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==71) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalOCCI.g:3110:4: otherlv_10= 'documentation' ( (lv_documentation_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,71,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getStringTypeAccess().getDocumentationKeyword_6_0());
                    			
                    // InternalOCCI.g:3114:4: ( (lv_documentation_11_0= RULE_STRING ) )
                    // InternalOCCI.g:3115:5: (lv_documentation_11_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3115:5: (lv_documentation_11_0= RULE_STRING )
                    // InternalOCCI.g:3116:6: lv_documentation_11_0= RULE_STRING
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
    // InternalOCCI.g:3137:1: entryRuleEObjectType returns [EObject current=null] : iv_ruleEObjectType= ruleEObjectType EOF ;
    public final EObject entryRuleEObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObjectType = null;


        try {
            // InternalOCCI.g:3137:52: (iv_ruleEObjectType= ruleEObjectType EOF )
            // InternalOCCI.g:3138:2: iv_ruleEObjectType= ruleEObjectType EOF
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
    // InternalOCCI.g:3144:1: ruleEObjectType returns [EObject current=null] : (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) ;
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
            // InternalOCCI.g:3150:2: ( (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3151:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3151:2: (otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3152:3: otherlv_0= 'EObjectType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )? (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getEObjectTypeAccess().getEObjectTypeKeyword_0());
            		
            // InternalOCCI.g:3156:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:3157:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:3157:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:3158:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); 

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

            // InternalOCCI.g:3174:3: (otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==73) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalOCCI.g:3175:4: otherlv_2= 'instanceClassName' ( (lv_instanceClassName_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,73,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getEObjectTypeAccess().getInstanceClassNameKeyword_2_0());
                    			
                    // InternalOCCI.g:3179:4: ( (lv_instanceClassName_3_0= RULE_STRING ) )
                    // InternalOCCI.g:3180:5: (lv_instanceClassName_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3180:5: (lv_instanceClassName_3_0= RULE_STRING )
                    // InternalOCCI.g:3181:6: lv_instanceClassName_3_0= RULE_STRING
                    {
                    lv_instanceClassName_3_0=(Token)match(input,RULE_STRING,FOLLOW_82); 

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

            // InternalOCCI.g:3198:3: (otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==71) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalOCCI.g:3199:4: otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,71,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getEObjectTypeAccess().getDocumentationKeyword_3_0());
                    			
                    // InternalOCCI.g:3203:4: ( (lv_documentation_5_0= RULE_STRING ) )
                    // InternalOCCI.g:3204:5: (lv_documentation_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3204:5: (lv_documentation_5_0= RULE_STRING )
                    // InternalOCCI.g:3205:6: lv_documentation_5_0= RULE_STRING
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
    // InternalOCCI.g:3226:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalOCCI.g:3226:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalOCCI.g:3227:2: iv_ruleBooleanType= ruleBooleanType EOF
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
    // InternalOCCI.g:3233:1: ruleBooleanType returns [EObject current=null] : (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_documentation_3_0=null;


        	enterRule();

        try {
            // InternalOCCI.g:3239:2: ( (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3240:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3240:2: (otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3241:3: otherlv_0= 'BooleanType' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,74,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_0());
            		
            // InternalOCCI.g:3245:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:3246:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:3246:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:3247:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_82); 

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

            // InternalOCCI.g:3263:3: (otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==71) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalOCCI.g:3264:4: otherlv_2= 'documentation' ( (lv_documentation_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,71,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanTypeAccess().getDocumentationKeyword_2_0());
                    			
                    // InternalOCCI.g:3268:4: ( (lv_documentation_3_0= RULE_STRING ) )
                    // InternalOCCI.g:3269:5: (lv_documentation_3_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3269:5: (lv_documentation_3_0= RULE_STRING )
                    // InternalOCCI.g:3270:6: lv_documentation_3_0= RULE_STRING
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
    // InternalOCCI.g:3291:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // InternalOCCI.g:3291:52: (iv_ruleNumericType= ruleNumericType EOF )
            // InternalOCCI.g:3292:2: iv_ruleNumericType= ruleNumericType EOF
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
    // InternalOCCI.g:3298:1: ruleNumericType returns [EObject current=null] : (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )? otherlv_17= ')' ) ;
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
            // InternalOCCI.g:3304:2: ( (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )? otherlv_17= ')' ) )
            // InternalOCCI.g:3305:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )? otherlv_17= ')' )
            {
            // InternalOCCI.g:3305:2: (otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )? otherlv_17= ')' )
            // InternalOCCI.g:3306:3: otherlv_0= 'NumericType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleNumericTypeEnum ) ) otherlv_4= '(' (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )? (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )? (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )? (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )? (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )? otherlv_17= ')'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getNumericTypeAccess().getNumericTypeKeyword_0());
            		
            // InternalOCCI.g:3310:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:3311:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:3311:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:3312:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_84); 

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

            otherlv_2=(Token)match(input,53,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericTypeAccess().getTypeKeyword_2());
            		
            // InternalOCCI.g:3332:3: ( (lv_type_3_0= ruleNumericTypeEnum ) )
            // InternalOCCI.g:3333:4: (lv_type_3_0= ruleNumericTypeEnum )
            {
            // InternalOCCI.g:3333:4: (lv_type_3_0= ruleNumericTypeEnum )
            // InternalOCCI.g:3334:5: lv_type_3_0= ruleNumericTypeEnum
            {

            					newCompositeNode(grammarAccess.getNumericTypeAccess().getTypeNumericTypeEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_4=(Token)match(input,17,FOLLOW_86); 

            			newLeafNode(otherlv_4, grammarAccess.getNumericTypeAccess().getLeftParenthesisKeyword_4());
            		
            // InternalOCCI.g:3355:3: (otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==76) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalOCCI.g:3356:4: otherlv_5= 'totalDigits' ( (lv_totalDigits_6_0= ruleEIntegerObject ) )
                    {
                    otherlv_5=(Token)match(input,76,FOLLOW_79); 

                    				newLeafNode(otherlv_5, grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_5_0());
                    			
                    // InternalOCCI.g:3360:4: ( (lv_totalDigits_6_0= ruleEIntegerObject ) )
                    // InternalOCCI.g:3361:5: (lv_totalDigits_6_0= ruleEIntegerObject )
                    {
                    // InternalOCCI.g:3361:5: (lv_totalDigits_6_0= ruleEIntegerObject )
                    // InternalOCCI.g:3362:6: lv_totalDigits_6_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getNumericTypeAccess().getTotalDigitsEIntegerObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_87);
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

            // InternalOCCI.g:3380:3: (otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==77) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalOCCI.g:3381:4: otherlv_7= 'minExclusive' ( (lv_minExclusive_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,77,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_6_0());
                    			
                    // InternalOCCI.g:3385:4: ( (lv_minExclusive_8_0= RULE_STRING ) )
                    // InternalOCCI.g:3386:5: (lv_minExclusive_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3386:5: (lv_minExclusive_8_0= RULE_STRING )
                    // InternalOCCI.g:3387:6: lv_minExclusive_8_0= RULE_STRING
                    {
                    lv_minExclusive_8_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

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

            // InternalOCCI.g:3404:3: (otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==78) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalOCCI.g:3405:4: otherlv_9= 'maxExclusive' ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,78,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_7_0());
                    			
                    // InternalOCCI.g:3409:4: ( (lv_maxExclusive_10_0= RULE_STRING ) )
                    // InternalOCCI.g:3410:5: (lv_maxExclusive_10_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3410:5: (lv_maxExclusive_10_0= RULE_STRING )
                    // InternalOCCI.g:3411:6: lv_maxExclusive_10_0= RULE_STRING
                    {
                    lv_maxExclusive_10_0=(Token)match(input,RULE_STRING,FOLLOW_89); 

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

            // InternalOCCI.g:3428:3: (otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==79) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalOCCI.g:3429:4: otherlv_11= 'minInclusive' ( (lv_minInclusive_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,79,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_8_0());
                    			
                    // InternalOCCI.g:3433:4: ( (lv_minInclusive_12_0= RULE_STRING ) )
                    // InternalOCCI.g:3434:5: (lv_minInclusive_12_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3434:5: (lv_minInclusive_12_0= RULE_STRING )
                    // InternalOCCI.g:3435:6: lv_minInclusive_12_0= RULE_STRING
                    {
                    lv_minInclusive_12_0=(Token)match(input,RULE_STRING,FOLLOW_90); 

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

            // InternalOCCI.g:3452:3: (otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==80) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalOCCI.g:3453:4: otherlv_13= 'maxInclusive' ( (lv_maxInclusive_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,80,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_9_0());
                    			
                    // InternalOCCI.g:3457:4: ( (lv_maxInclusive_14_0= RULE_STRING ) )
                    // InternalOCCI.g:3458:5: (lv_maxInclusive_14_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3458:5: (lv_maxInclusive_14_0= RULE_STRING )
                    // InternalOCCI.g:3459:6: lv_maxInclusive_14_0= RULE_STRING
                    {
                    lv_maxInclusive_14_0=(Token)match(input,RULE_STRING,FOLLOW_91); 

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

            // InternalOCCI.g:3476:3: (otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==71) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalOCCI.g:3477:4: otherlv_15= 'documentation' ( (lv_documentation_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,71,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getNumericTypeAccess().getDocumentationKeyword_10_0());
                    			
                    // InternalOCCI.g:3481:4: ( (lv_documentation_16_0= RULE_STRING ) )
                    // InternalOCCI.g:3482:5: (lv_documentation_16_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3482:5: (lv_documentation_16_0= RULE_STRING )
                    // InternalOCCI.g:3483:6: lv_documentation_16_0= RULE_STRING
                    {
                    lv_documentation_16_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

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

            otherlv_17=(Token)match(input,19,FOLLOW_2); 

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
    // InternalOCCI.g:3508:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // InternalOCCI.g:3508:56: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // InternalOCCI.g:3509:2: iv_ruleEnumerationType= ruleEnumerationType EOF
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
    // InternalOCCI.g:3515:1: ruleEnumerationType returns [EObject current=null] : (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) ;
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
            // InternalOCCI.g:3521:2: ( (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3522:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3522:2: (otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3523:3: otherlv_0= 'EnumerationType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'literals' otherlv_3= '(' ( (lv_literals_4_0= ruleEnumerationLiteral ) ) (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,81,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0());
            		
            // InternalOCCI.g:3527:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:3528:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:3528:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:3529:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_92); 

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

            otherlv_2=(Token)match(input,82,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_3());
            		
            // InternalOCCI.g:3553:3: ( (lv_literals_4_0= ruleEnumerationLiteral ) )
            // InternalOCCI.g:3554:4: (lv_literals_4_0= ruleEnumerationLiteral )
            {
            // InternalOCCI.g:3554:4: (lv_literals_4_0= ruleEnumerationLiteral )
            // InternalOCCI.g:3555:5: lv_literals_4_0= ruleEnumerationLiteral
            {

            					newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalOCCI.g:3572:3: (otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==18) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalOCCI.g:3573:4: otherlv_5= ',' ( (lv_literals_6_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_41); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalOCCI.g:3577:4: ( (lv_literals_6_0= ruleEnumerationLiteral ) )
            	    // InternalOCCI.g:3578:5: (lv_literals_6_0= ruleEnumerationLiteral )
            	    {
            	    // InternalOCCI.g:3578:5: (lv_literals_6_0= ruleEnumerationLiteral )
            	    // InternalOCCI.g:3579:6: lv_literals_6_0= ruleEnumerationLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
            	    break loop86;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_82); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_6());
            		
            // InternalOCCI.g:3601:3: (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==71) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalOCCI.g:3602:4: otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,71,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnumerationTypeAccess().getDocumentationKeyword_7_0());
                    			
                    // InternalOCCI.g:3606:4: ( (lv_documentation_9_0= RULE_STRING ) )
                    // InternalOCCI.g:3607:5: (lv_documentation_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3607:5: (lv_documentation_9_0= RULE_STRING )
                    // InternalOCCI.g:3608:6: lv_documentation_9_0= RULE_STRING
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
    // InternalOCCI.g:3629:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalOCCI.g:3629:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalOCCI.g:3630:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalOCCI.g:3636:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_documentation_2_0=null;


        	enterRule();

        try {
            // InternalOCCI.g:3642:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3643:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3643:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3644:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )?
            {
            // InternalOCCI.g:3644:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalOCCI.g:3645:4: (lv_name_0_0= RULE_ID )
            {
            // InternalOCCI.g:3645:4: (lv_name_0_0= RULE_ID )
            // InternalOCCI.g:3646:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_82); 

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

            // InternalOCCI.g:3662:3: (otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==71) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalOCCI.g:3663:4: otherlv_1= 'documentation' ( (lv_documentation_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getDocumentationKeyword_1_0());
                    			
                    // InternalOCCI.g:3667:4: ( (lv_documentation_2_0= RULE_STRING ) )
                    // InternalOCCI.g:3668:5: (lv_documentation_2_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3668:5: (lv_documentation_2_0= RULE_STRING )
                    // InternalOCCI.g:3669:6: lv_documentation_2_0= RULE_STRING
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
    // InternalOCCI.g:3690:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // InternalOCCI.g:3690:51: (iv_ruleRecordType= ruleRecordType EOF )
            // InternalOCCI.g:3691:2: iv_ruleRecordType= ruleRecordType EOF
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
    // InternalOCCI.g:3697:1: ruleRecordType returns [EObject current=null] : (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) ;
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
            // InternalOCCI.g:3703:2: ( (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? ) )
            // InternalOCCI.g:3704:2: (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            {
            // InternalOCCI.g:3704:2: (otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )? )
            // InternalOCCI.g:3705:3: otherlv_0= 'RecordType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'fields' otherlv_3= '(' ( (lv_recordFields_4_0= ruleRecordField ) ) (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )* otherlv_7= ')' (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,83,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordTypeAccess().getRecordTypeKeyword_0());
            		
            // InternalOCCI.g:3709:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:3710:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:3710:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:3711:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_93); 

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

            otherlv_2=(Token)match(input,84,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getFieldsKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_3());
            		
            // InternalOCCI.g:3735:3: ( (lv_recordFields_4_0= ruleRecordField ) )
            // InternalOCCI.g:3736:4: (lv_recordFields_4_0= ruleRecordField )
            {
            // InternalOCCI.g:3736:4: (lv_recordFields_4_0= ruleRecordField )
            // InternalOCCI.g:3737:5: lv_recordFields_4_0= ruleRecordField
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalOCCI.g:3754:3: (otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==18) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalOCCI.g:3755:4: otherlv_5= ',' ( (lv_recordFields_6_0= ruleRecordField ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_21); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalOCCI.g:3759:4: ( (lv_recordFields_6_0= ruleRecordField ) )
            	    // InternalOCCI.g:3760:5: (lv_recordFields_6_0= ruleRecordField )
            	    {
            	    // InternalOCCI.g:3760:5: (lv_recordFields_6_0= ruleRecordField )
            	    // InternalOCCI.g:3761:6: lv_recordFields_6_0= ruleRecordField
            	    {

            	    						newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
            	    break loop89;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_82); 

            			newLeafNode(otherlv_7, grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_6());
            		
            // InternalOCCI.g:3783:3: (otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==71) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalOCCI.g:3784:4: otherlv_8= 'documentation' ( (lv_documentation_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,71,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getRecordTypeAccess().getDocumentationKeyword_7_0());
                    			
                    // InternalOCCI.g:3788:4: ( (lv_documentation_9_0= RULE_STRING ) )
                    // InternalOCCI.g:3789:5: (lv_documentation_9_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3789:5: (lv_documentation_9_0= RULE_STRING )
                    // InternalOCCI.g:3790:6: lv_documentation_9_0= RULE_STRING
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
    // InternalOCCI.g:3811:1: entryRuleRecordField returns [EObject current=null] : iv_ruleRecordField= ruleRecordField EOF ;
    public final EObject entryRuleRecordField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordField = null;


        try {
            // InternalOCCI.g:3811:52: (iv_ruleRecordField= ruleRecordField EOF )
            // InternalOCCI.g:3812:2: iv_ruleRecordField= ruleRecordField EOF
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
    // InternalOCCI.g:3818:1: ruleRecordField returns [EObject current=null] : ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) ;
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
            // InternalOCCI.g:3824:2: ( ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? ) )
            // InternalOCCI.g:3825:2: ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            {
            // InternalOCCI.g:3825:2: ( ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )? )
            // InternalOCCI.g:3826:3: ( (lv_mutable_0_0= 'mutable' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleQualifiedID ) ) (otherlv_3= 'type' ( ( ruleQualifiedID ) ) ) (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )? (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )? (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            {
            // InternalOCCI.g:3826:3: ( (lv_mutable_0_0= 'mutable' ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==51) ) {
                int LA91_1 = input.LA(2);

                if ( (LA91_1==RULE_ID||LA91_1==RULE_QUALIFIED_ID||LA91_1==14||LA91_1==25||LA91_1==27||LA91_1==32||LA91_1==35||(LA91_1>=37 && LA91_1<=38)||LA91_1==40||(LA91_1>=42 && LA91_1<=52)||(LA91_1>=55 && LA91_1<=57)||(LA91_1>=66 && LA91_1<=85)||(LA91_1>=87 && LA91_1<=95)) ) {
                    alt91=1;
                }
                else if ( (LA91_1==53) ) {
                    int LA91_4 = input.LA(3);

                    if ( (LA91_4==53) ) {
                        switch ( input.LA(4) ) {
                            case 14:
                                {
                                int LA91_6 = input.LA(5);

                                if ( (LA91_6==EOF||LA91_6==14||(LA91_6>=18 && LA91_6<=19)||LA91_6==46||LA91_6==54) ) {
                                    alt91=1;
                                }
                                }
                                break;
                            case 46:
                                {
                                int LA91_7 = input.LA(5);

                                if ( (LA91_7==EOF||LA91_7==14||(LA91_7>=18 && LA91_7<=19)||LA91_7==46||LA91_7==54) ) {
                                    alt91=1;
                                }
                                }
                                break;
                            case RULE_ID:
                            case RULE_QUALIFIED_ID:
                            case 25:
                            case 27:
                            case 32:
                            case 35:
                            case 37:
                            case 38:
                            case 40:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 55:
                            case 56:
                            case 57:
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
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                                {
                                alt91=1;
                                }
                                break;
                        }

                    }
                }
            }
            switch (alt91) {
                case 1 :
                    // InternalOCCI.g:3827:4: (lv_mutable_0_0= 'mutable' )
                    {
                    // InternalOCCI.g:3827:4: (lv_mutable_0_0= 'mutable' )
                    // InternalOCCI.g:3828:5: lv_mutable_0_0= 'mutable'
                    {
                    lv_mutable_0_0=(Token)match(input,51,FOLLOW_21); 

                    					newLeafNode(lv_mutable_0_0, grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "mutable", true, "mutable");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:3840:3: ( (lv_required_1_0= 'required' ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==52) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==RULE_ID||LA92_1==RULE_QUALIFIED_ID||LA92_1==14||LA92_1==25||LA92_1==27||LA92_1==32||LA92_1==35||(LA92_1>=37 && LA92_1<=38)||LA92_1==40||(LA92_1>=42 && LA92_1<=52)||(LA92_1>=55 && LA92_1<=57)||(LA92_1>=66 && LA92_1<=85)||(LA92_1>=87 && LA92_1<=95)) ) {
                    alt92=1;
                }
                else if ( (LA92_1==53) ) {
                    int LA92_4 = input.LA(3);

                    if ( (LA92_4==53) ) {
                        switch ( input.LA(4) ) {
                            case 14:
                                {
                                int LA92_6 = input.LA(5);

                                if ( (LA92_6==EOF||LA92_6==14||(LA92_6>=18 && LA92_6<=19)||LA92_6==46||LA92_6==54) ) {
                                    alt92=1;
                                }
                                }
                                break;
                            case 46:
                                {
                                int LA92_7 = input.LA(5);

                                if ( (LA92_7==EOF||LA92_7==14||(LA92_7>=18 && LA92_7<=19)||LA92_7==46||LA92_7==54) ) {
                                    alt92=1;
                                }
                                }
                                break;
                            case RULE_ID:
                            case RULE_QUALIFIED_ID:
                            case 25:
                            case 27:
                            case 32:
                            case 35:
                            case 37:
                            case 38:
                            case 40:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 55:
                            case 56:
                            case 57:
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
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                                {
                                alt92=1;
                                }
                                break;
                        }

                    }
                }
            }
            switch (alt92) {
                case 1 :
                    // InternalOCCI.g:3841:4: (lv_required_1_0= 'required' )
                    {
                    // InternalOCCI.g:3841:4: (lv_required_1_0= 'required' )
                    // InternalOCCI.g:3842:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,52,FOLLOW_21); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRecordFieldRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalOCCI.g:3854:3: ( (lv_name_2_0= ruleQualifiedID ) )
            // InternalOCCI.g:3855:4: (lv_name_2_0= ruleQualifiedID )
            {
            // InternalOCCI.g:3855:4: (lv_name_2_0= ruleQualifiedID )
            // InternalOCCI.g:3856:5: lv_name_2_0= ruleQualifiedID
            {

            					newCompositeNode(grammarAccess.getRecordFieldAccess().getNameQualifiedIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_84);
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

            // InternalOCCI.g:3873:3: (otherlv_3= 'type' ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:3874:4: otherlv_3= 'type' ( ( ruleQualifiedID ) )
            {
            otherlv_3=(Token)match(input,53,FOLLOW_21); 

            				newLeafNode(otherlv_3, grammarAccess.getRecordFieldAccess().getTypeKeyword_3_0());
            			
            // InternalOCCI.g:3878:4: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:3879:5: ( ruleQualifiedID )
            {
            // InternalOCCI.g:3879:5: ( ruleQualifiedID )
            // InternalOCCI.g:3880:6: ruleQualifiedID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getRecordFieldRule());
            						}
            					

            						newCompositeNode(grammarAccess.getRecordFieldAccess().getTypeDataTypeCrossReference_3_1_0());
            					
            pushFollow(FOLLOW_60);
            ruleQualifiedID();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOCCI.g:3895:3: (otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==54) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalOCCI.g:3896:4: otherlv_5= '=' ( (lv_default_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,54,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRecordFieldAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalOCCI.g:3900:4: ( (lv_default_6_0= RULE_STRING ) )
                    // InternalOCCI.g:3901:5: (lv_default_6_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3901:5: (lv_default_6_0= RULE_STRING )
                    // InternalOCCI.g:3902:6: lv_default_6_0= RULE_STRING
                    {
                    lv_default_6_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

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

            // InternalOCCI.g:3919:3: (otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==14) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalOCCI.g:3920:4: otherlv_7= 'description' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getRecordFieldAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalOCCI.g:3924:4: ( (lv_description_8_0= RULE_STRING ) )
                    // InternalOCCI.g:3925:5: (lv_description_8_0= RULE_STRING )
                    {
                    // InternalOCCI.g:3925:5: (lv_description_8_0= RULE_STRING )
                    // InternalOCCI.g:3926:6: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

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

            // InternalOCCI.g:3943:3: (otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==46) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalOCCI.g:3944:4: otherlv_9= 'annotations' otherlv_10= '{' ( (lv_annotations_11_0= ruleAnnotation ) ) (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRecordFieldAccess().getAnnotationsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOCCI.g:3952:4: ( (lv_annotations_11_0= ruleAnnotation ) )
                    // InternalOCCI.g:3953:5: (lv_annotations_11_0= ruleAnnotation )
                    {
                    // InternalOCCI.g:3953:5: (lv_annotations_11_0= ruleAnnotation )
                    // InternalOCCI.g:3954:6: lv_annotations_11_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalOCCI.g:3971:4: (otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==18) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalOCCI.g:3972:5: otherlv_12= ',' ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,18,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRecordFieldAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOCCI.g:3976:5: ( (lv_annotations_13_0= ruleAnnotation ) )
                    	    // InternalOCCI.g:3977:6: (lv_annotations_13_0= ruleAnnotation )
                    	    {
                    	    // InternalOCCI.g:3977:6: (lv_annotations_13_0= ruleAnnotation )
                    	    // InternalOCCI.g:3978:7: lv_annotations_13_0= ruleAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_2); 

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
    // InternalOCCI.g:4005:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalOCCI.g:4005:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalOCCI.g:4006:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalOCCI.g:4012:1: ruleArrayType returns [EObject current=null] : (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )? ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_documentation_5_0=null;


        	enterRule();

        try {
            // InternalOCCI.g:4018:2: ( (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )? ) )
            // InternalOCCI.g:4019:2: (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )? )
            {
            // InternalOCCI.g:4019:2: (otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )? )
            // InternalOCCI.g:4020:3: otherlv_0= 'ArrayType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( ( ruleQualifiedID ) ) otherlv_4= 'documentation' ( (lv_documentation_5_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,85,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayTypeAccess().getArrayTypeKeyword_0());
            		
            // InternalOCCI.g:4024:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalOCCI.g:4025:4: (lv_name_1_0= RULE_ID )
            {
            // InternalOCCI.g:4025:4: (lv_name_1_0= RULE_ID )
            // InternalOCCI.g:4026:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_84); 

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

            otherlv_2=(Token)match(input,53,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalOCCI.g:4046:3: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:4047:4: ( ruleQualifiedID )
            {
            // InternalOCCI.g:4047:4: ( ruleQualifiedID )
            // InternalOCCI.g:4048:5: ruleQualifiedID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArrayTypeAccess().getTypeDataTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_94);
            ruleQualifiedID();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,71,FOLLOW_95); 

            			newLeafNode(otherlv_4, grammarAccess.getArrayTypeAccess().getDocumentationKeyword_4());
            		
            // InternalOCCI.g:4066:3: ( (lv_documentation_5_0= RULE_STRING ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_STRING) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalOCCI.g:4067:4: (lv_documentation_5_0= RULE_STRING )
                    {
                    // InternalOCCI.g:4067:4: (lv_documentation_5_0= RULE_STRING )
                    // InternalOCCI.g:4068:5: lv_documentation_5_0= RULE_STRING
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
    // InternalOCCI.g:4088:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalOCCI.g:4088:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalOCCI.g:4089:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalOCCI.g:4095:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOCCI.g:4101:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalOCCI.g:4102:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalOCCI.g:4102:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalOCCI.g:4103:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalOCCI.g:4103:3: (kw= '-' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==86) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalOCCI.g:4104:4: kw= '-'
                    {
                    kw=(Token)match(input,86,FOLLOW_96); 

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
    // InternalOCCI.g:4121:1: entryRuleQualifiedID returns [String current=null] : iv_ruleQualifiedID= ruleQualifiedID EOF ;
    public final String entryRuleQualifiedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedID = null;


        try {
            // InternalOCCI.g:4121:51: (iv_ruleQualifiedID= ruleQualifiedID EOF )
            // InternalOCCI.g:4122:2: iv_ruleQualifiedID= ruleQualifiedID EOF
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
    // InternalOCCI.g:4128:1: ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_QUALIFIED_ID_1=null;
        AntlrDatatypeRuleToken this_KEYWORD_2 = null;



        	enterRule();

        try {
            // InternalOCCI.g:4134:2: ( (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD ) )
            // InternalOCCI.g:4135:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            {
            // InternalOCCI.g:4135:2: (this_ID_0= RULE_ID | this_QUALIFIED_ID_1= RULE_QUALIFIED_ID | this_KEYWORD_2= ruleKEYWORD )
            int alt99=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt99=1;
                }
                break;
            case RULE_QUALIFIED_ID:
                {
                alt99=2;
                }
                break;
            case 14:
            case 25:
            case 27:
            case 32:
            case 35:
            case 37:
            case 38:
            case 40:
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
            case 55:
            case 56:
            case 57:
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
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
                {
                alt99=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalOCCI.g:4136:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:4144:3: this_QUALIFIED_ID_1= RULE_QUALIFIED_ID
                    {
                    this_QUALIFIED_ID_1=(Token)match(input,RULE_QUALIFIED_ID,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_ID_1);
                    		

                    			newLeafNode(this_QUALIFIED_ID_1, grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:4152:3: this_KEYWORD_2= ruleKEYWORD
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
    // InternalOCCI.g:4166:1: entryRuleNameID returns [String current=null] : iv_ruleNameID= ruleNameID EOF ;
    public final String entryRuleNameID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameID = null;


        try {
            // InternalOCCI.g:4166:46: (iv_ruleNameID= ruleNameID EOF )
            // InternalOCCI.g:4167:2: iv_ruleNameID= ruleNameID EOF
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
    // InternalOCCI.g:4173:1: ruleNameID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleNameID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_KEYWORD_3 = null;



        	enterRule();

        try {
            // InternalOCCI.g:4179:2: ( ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD ) )
            // InternalOCCI.g:4180:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            {
            // InternalOCCI.g:4180:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* ) | this_KEYWORD_3= ruleKEYWORD )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_ID) ) {
                alt101=1;
            }
            else if ( (LA101_0==14||LA101_0==25||LA101_0==27||LA101_0==32||LA101_0==35||(LA101_0>=37 && LA101_0<=38)||LA101_0==40||(LA101_0>=42 && LA101_0<=53)||(LA101_0>=55 && LA101_0<=57)||(LA101_0>=66 && LA101_0<=85)||(LA101_0>=87 && LA101_0<=95)) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalOCCI.g:4181:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    {
                    // InternalOCCI.g:4181:3: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )* )
                    // InternalOCCI.g:4182:4: this_ID_0= RULE_ID (this_ID_1= RULE_ID | kw= '-' )*
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_97); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalOCCI.g:4189:4: (this_ID_1= RULE_ID | kw= '-' )*
                    loop100:
                    do {
                        int alt100=3;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==RULE_ID) ) {
                            alt100=1;
                        }
                        else if ( (LA100_0==86) ) {
                            alt100=2;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // InternalOCCI.g:4190:5: this_ID_1= RULE_ID
                    	    {
                    	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_97); 

                    	    					current.merge(this_ID_1);
                    	    				

                    	    					newLeafNode(this_ID_1, grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_1_0());
                    	    				

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOCCI.g:4198:5: kw= '-'
                    	    {
                    	    kw=(Token)match(input,86,FOLLOW_97); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getNameIDAccess().getHyphenMinusKeyword_0_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:4206:3: this_KEYWORD_3= ruleKEYWORD
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
    // InternalOCCI.g:4220:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalOCCI.g:4220:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalOCCI.g:4221:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalOCCI.g:4227:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOCCI.g:4233:2: ( (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' ) )
            // InternalOCCI.g:4234:2: (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' )
            {
            // InternalOCCI.g:4234:2: (kw= 'extension' | kw= 'description' | kw= 'specification' | kw= 'as' | kw= 'kind' | kw= 'extends' | kw= 'source' | kw= 'target' | kw= 'annotations' | kw= 'title' | kw= 'scheme' | kw= 'mixin' | kw= 'depends' | kw= 'applies' | kw= 'annotation' | kw= 'key' | kw= 'value' | kw= 'attribute' | kw= 'mutable' | kw= 'required' | kw= 'type' | kw= 'action' | kw= 'constraint' | kw= 'body' | kw= 'StringType' | kw= 'documentation' | kw= 'pattern' | kw= 'length' | kw= 'minLength' | kw= 'maxLength' | kw= 'EObjectType' | kw= 'instanceClassName' | kw= 'BooleanType' | kw= 'NumericType' | kw= 'totalDigits' | kw= 'minExclusive' | kw= 'maxExclusive' | kw= 'minInclusive' | kw= 'maxInclusive' | kw= 'Byte' | kw= 'Double' | kw= 'Float' | kw= 'Integer' | kw= 'Long' | kw= 'Short' | kw= 'BigDecimal' | kw= 'EnumerationType' | kw= 'literals' | kw= 'RecordType' | kw= 'fields' | kw= 'field' | kw= 'ArrayType' )
            int alt102=52;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt102=1;
                }
                break;
            case 14:
                {
                alt102=2;
                }
                break;
            case 40:
                {
                alt102=3;
                }
                break;
            case 42:
                {
                alt102=4;
                }
                break;
            case 27:
                {
                alt102=5;
                }
                break;
            case 43:
                {
                alt102=6;
                }
                break;
            case 44:
                {
                alt102=7;
                }
                break;
            case 32:
                {
                alt102=8;
                }
                break;
            case 46:
                {
                alt102=9;
                }
                break;
            case 25:
                {
                alt102=10;
                }
                break;
            case 45:
                {
                alt102=11;
                }
                break;
            case 37:
                {
                alt102=12;
                }
                break;
            case 47:
                {
                alt102=13;
                }
                break;
            case 48:
                {
                alt102=14;
                }
                break;
            case 87:
                {
                alt102=15;
                }
                break;
            case 49:
                {
                alt102=16;
                }
                break;
            case 35:
                {
                alt102=17;
                }
                break;
            case 50:
                {
                alt102=18;
                }
                break;
            case 51:
                {
                alt102=19;
                }
                break;
            case 52:
                {
                alt102=20;
                }
                break;
            case 53:
                {
                alt102=21;
                }
                break;
            case 55:
                {
                alt102=22;
                }
                break;
            case 56:
                {
                alt102=23;
                }
                break;
            case 57:
                {
                alt102=24;
                }
                break;
            case 66:
                {
                alt102=25;
                }
                break;
            case 71:
                {
                alt102=26;
                }
                break;
            case 67:
                {
                alt102=27;
                }
                break;
            case 68:
                {
                alt102=28;
                }
                break;
            case 69:
                {
                alt102=29;
                }
                break;
            case 70:
                {
                alt102=30;
                }
                break;
            case 72:
                {
                alt102=31;
                }
                break;
            case 73:
                {
                alt102=32;
                }
                break;
            case 74:
                {
                alt102=33;
                }
                break;
            case 75:
                {
                alt102=34;
                }
                break;
            case 76:
                {
                alt102=35;
                }
                break;
            case 77:
                {
                alt102=36;
                }
                break;
            case 78:
                {
                alt102=37;
                }
                break;
            case 79:
                {
                alt102=38;
                }
                break;
            case 80:
                {
                alt102=39;
                }
                break;
            case 88:
                {
                alt102=40;
                }
                break;
            case 89:
                {
                alt102=41;
                }
                break;
            case 90:
                {
                alt102=42;
                }
                break;
            case 91:
                {
                alt102=43;
                }
                break;
            case 92:
                {
                alt102=44;
                }
                break;
            case 93:
                {
                alt102=45;
                }
                break;
            case 94:
                {
                alt102=46;
                }
                break;
            case 81:
                {
                alt102=47;
                }
                break;
            case 82:
                {
                alt102=48;
                }
                break;
            case 83:
                {
                alt102=49;
                }
                break;
            case 84:
                {
                alt102=50;
                }
                break;
            case 95:
                {
                alt102=51;
                }
                break;
            case 85:
                {
                alt102=52;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalOCCI.g:4235:3: kw= 'extension'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtensionKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOCCI.g:4241:3: kw= 'description'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDescriptionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOCCI.g:4247:3: kw= 'specification'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSpecificationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOCCI.g:4253:3: kw= 'as'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAsKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOCCI.g:4259:3: kw= 'kind'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKindKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOCCI.g:4265:3: kw= 'extends'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getExtendsKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalOCCI.g:4271:3: kw= 'source'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSourceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalOCCI.g:4277:3: kw= 'target'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTargetKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalOCCI.g:4283:3: kw= 'annotations'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAnnotationsKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalOCCI.g:4289:3: kw= 'title'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTitleKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalOCCI.g:4295:3: kw= 'scheme'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSchemeKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalOCCI.g:4301:3: kw= 'mixin'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMixinKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalOCCI.g:4307:3: kw= 'depends'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDependsKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalOCCI.g:4313:3: kw= 'applies'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAppliesKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalOCCI.g:4319:3: kw= 'annotation'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAnnotationKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalOCCI.g:4325:3: kw= 'key'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getKeyKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalOCCI.g:4331:3: kw= 'value'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalOCCI.g:4337:3: kw= 'attribute'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getAttributeKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalOCCI.g:4343:3: kw= 'mutable'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMutableKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalOCCI.g:4349:3: kw= 'required'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRequiredKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalOCCI.g:4355:3: kw= 'type'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalOCCI.g:4361:3: kw= 'action'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalOCCI.g:4367:3: kw= 'constraint'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getConstraintKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalOCCI.g:4373:3: kw= 'body'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBodyKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalOCCI.g:4379:3: kw= 'StringType'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getStringTypeKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalOCCI.g:4385:3: kw= 'documentation'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDocumentationKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalOCCI.g:4391:3: kw= 'pattern'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getPatternKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalOCCI.g:4397:3: kw= 'length'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLengthKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalOCCI.g:4403:3: kw= 'minLength'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinLengthKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalOCCI.g:4409:3: kw= 'maxLength'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalOCCI.g:4415:3: kw= 'EObjectType'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEObjectTypeKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalOCCI.g:4421:3: kw= 'instanceClassName'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getInstanceClassNameKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalOCCI.g:4427:3: kw= 'BooleanType'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBooleanTypeKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalOCCI.g:4433:3: kw= 'NumericType'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNumericTypeKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalOCCI.g:4439:3: kw= 'totalDigits'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTotalDigitsKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalOCCI.g:4445:3: kw= 'minExclusive'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinExclusiveKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalOCCI.g:4451:3: kw= 'maxExclusive'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxExclusiveKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalOCCI.g:4457:3: kw= 'minInclusive'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMinInclusiveKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalOCCI.g:4463:3: kw= 'maxInclusive'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMaxInclusiveKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalOCCI.g:4469:3: kw= 'Byte'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getByteKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalOCCI.g:4475:3: kw= 'Double'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDoubleKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalOCCI.g:4481:3: kw= 'Float'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFloatKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalOCCI.g:4487:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getIntegerKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalOCCI.g:4493:3: kw= 'Long'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLongKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalOCCI.g:4499:3: kw= 'Short'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getShortKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalOCCI.g:4505:3: kw= 'BigDecimal'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getBigDecimalKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalOCCI.g:4511:3: kw= 'EnumerationType'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getEnumerationTypeKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalOCCI.g:4517:3: kw= 'literals'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getLiteralsKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalOCCI.g:4523:3: kw= 'RecordType'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getRecordTypeKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalOCCI.g:4529:3: kw= 'fields'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFieldsKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalOCCI.g:4535:3: kw= 'field'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFieldKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalOCCI.g:4541:3: kw= 'ArrayType'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

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
    // InternalOCCI.g:4550:1: ruleNumericTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) ;
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
            // InternalOCCI.g:4556:2: ( ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) ) )
            // InternalOCCI.g:4557:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            {
            // InternalOCCI.g:4557:2: ( (enumLiteral_0= 'Byte' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Float' ) | (enumLiteral_3= 'Integer' ) | (enumLiteral_4= 'Long' ) | (enumLiteral_5= 'Short' ) | (enumLiteral_6= 'BigDecimal' ) )
            int alt103=7;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt103=1;
                }
                break;
            case 89:
                {
                alt103=2;
                }
                break;
            case 90:
                {
                alt103=3;
                }
                break;
            case 91:
                {
                alt103=4;
                }
                break;
            case 92:
                {
                alt103=5;
                }
                break;
            case 93:
                {
                alt103=6;
                }
                break;
            case 94:
                {
                alt103=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalOCCI.g:4558:3: (enumLiteral_0= 'Byte' )
                    {
                    // InternalOCCI.g:4558:3: (enumLiteral_0= 'Byte' )
                    // InternalOCCI.g:4559:4: enumLiteral_0= 'Byte'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:4566:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalOCCI.g:4566:3: (enumLiteral_1= 'Double' )
                    // InternalOCCI.g:4567:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:4574:3: (enumLiteral_2= 'Float' )
                    {
                    // InternalOCCI.g:4574:3: (enumLiteral_2= 'Float' )
                    // InternalOCCI.g:4575:4: enumLiteral_2= 'Float'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOCCI.g:4582:3: (enumLiteral_3= 'Integer' )
                    {
                    // InternalOCCI.g:4582:3: (enumLiteral_3= 'Integer' )
                    // InternalOCCI.g:4583:4: enumLiteral_3= 'Integer'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOCCI.g:4590:3: (enumLiteral_4= 'Long' )
                    {
                    // InternalOCCI.g:4590:3: (enumLiteral_4= 'Long' )
                    // InternalOCCI.g:4591:4: enumLiteral_4= 'Long'
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOCCI.g:4598:3: (enumLiteral_5= 'Short' )
                    {
                    // InternalOCCI.g:4598:3: (enumLiteral_5= 'Short' )
                    // InternalOCCI.g:4599:4: enumLiteral_5= 'Short'
                    {
                    enumLiteral_5=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOCCI.g:4606:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalOCCI.g:4606:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalOCCI.g:4607:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,94,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000071C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000718000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000E008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x03BFFD690A0040A0L,0x00000000FFBFFFFCL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000070200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000A008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000030200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000032008004002L,0x00000000002A0D04L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000032008000002L,0x00000000002A0D04L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000022008000002L,0x00000000002A0D04L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000062008000002L,0x00000000002A0D04L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002008000002L,0x00000000002A0D04L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000380102000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000300102000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200102000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0400400000020002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0184000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0184000000080000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0400400000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001A00000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000400002020002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000400000020002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0060400000004002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0040400000004002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000400000004002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000400000022002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000400000002002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0200000000004000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0800000000080000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000001L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000F8L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000F0L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000040L,0x0000000000400000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000E0L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x000000007F000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000080000L,0x000000000001F080L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000080000L,0x000000000001E080L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000080000L,0x000000000001C080L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000080000L,0x0000000000018080L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000080000L,0x0000000000010080L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000022L,0x0000000000400000L});

}