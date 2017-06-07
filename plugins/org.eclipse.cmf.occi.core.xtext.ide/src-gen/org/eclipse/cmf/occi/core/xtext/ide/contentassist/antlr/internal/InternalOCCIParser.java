package org.eclipse.cmf.occi.core.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.cmf.occi.core.xtext.services.OCCIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOCCIParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_QUALIFIED_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'extension'", "'description'", "'specification'", "'as'", "'kind'", "'extends'", "'source'", "'target'", "'annotations'", "'title'", "'scheme'", "'mixin'", "'depends'", "'applies'", "'annotation'", "'key'", "'value'", "'attribute'", "'mutable'", "'required'", "'type'", "'action'", "'constraint'", "'body'", "'StringType'", "'documentation'", "'pattern'", "'length'", "'minLength'", "'maxLength'", "'EObjectType'", "'instanceClassName'", "'BooleanType'", "'NumericType'", "'totalDigits'", "'minExclusive'", "'maxExclusive'", "'minInclusive'", "'maxInclusive'", "'Byte'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'BigDecimal'", "'EnumerationType'", "'literals'", "'RecordType'", "'fields'", "'field'", "'ArrayType'", "':'", "'import'", "'('", "')'", "'{'", "'}'", "','", "'='", "'FSM'", "'states'", "'State'", "'literal'", "'transitions'", "'to'", "'initial'", "'final'"
    };
    public static final int T__50=50;
    public static final int RULE_QUALIFIED_ID=5;
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=7;
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

    	public void setGrammarAccess(OCCIGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGrammar"
    // InternalOCCI.g:53:1: entryRuleGrammar : ruleGrammar EOF ;
    public final void entryRuleGrammar() throws RecognitionException {
        try {
            // InternalOCCI.g:54:1: ( ruleGrammar EOF )
            // InternalOCCI.g:55:1: ruleGrammar EOF
            {
             before(grammarAccess.getGrammarRule()); 
            pushFollow(FOLLOW_1);
            ruleGrammar();

            state._fsp--;

             after(grammarAccess.getGrammarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // InternalOCCI.g:62:1: ruleGrammar : ( ruleExtension ) ;
    public final void ruleGrammar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:66:2: ( ( ruleExtension ) )
            // InternalOCCI.g:67:2: ( ruleExtension )
            {
            // InternalOCCI.g:67:2: ( ruleExtension )
            // InternalOCCI.g:68:3: ruleExtension
            {
             before(grammarAccess.getGrammarAccess().getExtensionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getExtensionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleExtension"
    // InternalOCCI.g:78:1: entryRuleExtension : ruleExtension EOF ;
    public final void entryRuleExtension() throws RecognitionException {
        try {
            // InternalOCCI.g:79:1: ( ruleExtension EOF )
            // InternalOCCI.g:80:1: ruleExtension EOF
            {
             before(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_1);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getExtensionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // InternalOCCI.g:87:1: ruleExtension : ( ( rule__Extension__Group__0 ) ) ;
    public final void ruleExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:91:2: ( ( ( rule__Extension__Group__0 ) ) )
            // InternalOCCI.g:92:2: ( ( rule__Extension__Group__0 ) )
            {
            // InternalOCCI.g:92:2: ( ( rule__Extension__Group__0 ) )
            // InternalOCCI.g:93:3: ( rule__Extension__Group__0 )
            {
             before(grammarAccess.getExtensionAccess().getGroup()); 
            // InternalOCCI.g:94:3: ( rule__Extension__Group__0 )
            // InternalOCCI.g:94:4: rule__Extension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleKind"
    // InternalOCCI.g:103:1: entryRuleKind : ruleKind EOF ;
    public final void entryRuleKind() throws RecognitionException {
        try {
            // InternalOCCI.g:104:1: ( ruleKind EOF )
            // InternalOCCI.g:105:1: ruleKind EOF
            {
             before(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_1);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getKindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // InternalOCCI.g:112:1: ruleKind : ( ( rule__Kind__Group__0 ) ) ;
    public final void ruleKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:116:2: ( ( ( rule__Kind__Group__0 ) ) )
            // InternalOCCI.g:117:2: ( ( rule__Kind__Group__0 ) )
            {
            // InternalOCCI.g:117:2: ( ( rule__Kind__Group__0 ) )
            // InternalOCCI.g:118:3: ( rule__Kind__Group__0 )
            {
             before(grammarAccess.getKindAccess().getGroup()); 
            // InternalOCCI.g:119:3: ( rule__Kind__Group__0 )
            // InternalOCCI.g:119:4: rule__Kind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleMixin"
    // InternalOCCI.g:128:1: entryRuleMixin : ruleMixin EOF ;
    public final void entryRuleMixin() throws RecognitionException {
        try {
            // InternalOCCI.g:129:1: ( ruleMixin EOF )
            // InternalOCCI.g:130:1: ruleMixin EOF
            {
             before(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_1);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getMixinRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // InternalOCCI.g:137:1: ruleMixin : ( ( rule__Mixin__Group__0 ) ) ;
    public final void ruleMixin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:141:2: ( ( ( rule__Mixin__Group__0 ) ) )
            // InternalOCCI.g:142:2: ( ( rule__Mixin__Group__0 ) )
            {
            // InternalOCCI.g:142:2: ( ( rule__Mixin__Group__0 ) )
            // InternalOCCI.g:143:3: ( rule__Mixin__Group__0 )
            {
             before(grammarAccess.getMixinAccess().getGroup()); 
            // InternalOCCI.g:144:3: ( rule__Mixin__Group__0 )
            // InternalOCCI.g:144:4: rule__Mixin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleAnnotation"
    // InternalOCCI.g:153:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalOCCI.g:154:1: ( ruleAnnotation EOF )
            // InternalOCCI.g:155:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalOCCI.g:162:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:166:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalOCCI.g:167:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalOCCI.g:167:2: ( ( rule__Annotation__Group__0 ) )
            // InternalOCCI.g:168:3: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalOCCI.g:169:3: ( rule__Annotation__Group__0 )
            // InternalOCCI.g:169:4: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAttribute"
    // InternalOCCI.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalOCCI.g:179:1: ( ruleAttribute EOF )
            // InternalOCCI.g:180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalOCCI.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalOCCI.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalOCCI.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalOCCI.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalOCCI.g:194:3: ( rule__Attribute__Group__0 )
            // InternalOCCI.g:194:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAction"
    // InternalOCCI.g:203:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalOCCI.g:204:1: ( ruleAction EOF )
            // InternalOCCI.g:205:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalOCCI.g:212:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:216:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalOCCI.g:217:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalOCCI.g:217:2: ( ( rule__Action__Group__0 ) )
            // InternalOCCI.g:218:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalOCCI.g:219:3: ( rule__Action__Group__0 )
            // InternalOCCI.g:219:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleParameterDecl"
    // InternalOCCI.g:228:1: entryRuleParameterDecl : ruleParameterDecl EOF ;
    public final void entryRuleParameterDecl() throws RecognitionException {
        try {
            // InternalOCCI.g:229:1: ( ruleParameterDecl EOF )
            // InternalOCCI.g:230:1: ruleParameterDecl EOF
            {
             before(grammarAccess.getParameterDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterDecl();

            state._fsp--;

             after(grammarAccess.getParameterDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterDecl"


    // $ANTLR start "ruleParameterDecl"
    // InternalOCCI.g:237:1: ruleParameterDecl : ( ( rule__ParameterDecl__Group__0 ) ) ;
    public final void ruleParameterDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:241:2: ( ( ( rule__ParameterDecl__Group__0 ) ) )
            // InternalOCCI.g:242:2: ( ( rule__ParameterDecl__Group__0 ) )
            {
            // InternalOCCI.g:242:2: ( ( rule__ParameterDecl__Group__0 ) )
            // InternalOCCI.g:243:3: ( rule__ParameterDecl__Group__0 )
            {
             before(grammarAccess.getParameterDeclAccess().getGroup()); 
            // InternalOCCI.g:244:3: ( rule__ParameterDecl__Group__0 )
            // InternalOCCI.g:244:4: rule__ParameterDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDecl"


    // $ANTLR start "entryRuleConstraint"
    // InternalOCCI.g:253:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalOCCI.g:254:1: ( ruleConstraint EOF )
            // InternalOCCI.g:255:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalOCCI.g:262:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:266:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalOCCI.g:267:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalOCCI.g:267:2: ( ( rule__Constraint__Group__0 ) )
            // InternalOCCI.g:268:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalOCCI.g:269:3: ( rule__Constraint__Group__0 )
            // InternalOCCI.g:269:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleFSM"
    // InternalOCCI.g:278:1: entryRuleFSM : ruleFSM EOF ;
    public final void entryRuleFSM() throws RecognitionException {
        try {
            // InternalOCCI.g:279:1: ( ruleFSM EOF )
            // InternalOCCI.g:280:1: ruleFSM EOF
            {
             before(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            ruleFSM();

            state._fsp--;

             after(grammarAccess.getFSMRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalOCCI.g:287:1: ruleFSM : ( ( rule__FSM__Group__0 ) ) ;
    public final void ruleFSM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:291:2: ( ( ( rule__FSM__Group__0 ) ) )
            // InternalOCCI.g:292:2: ( ( rule__FSM__Group__0 ) )
            {
            // InternalOCCI.g:292:2: ( ( rule__FSM__Group__0 ) )
            // InternalOCCI.g:293:3: ( rule__FSM__Group__0 )
            {
             before(grammarAccess.getFSMAccess().getGroup()); 
            // InternalOCCI.g:294:3: ( rule__FSM__Group__0 )
            // InternalOCCI.g:294:4: rule__FSM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FSM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFSMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleState"
    // InternalOCCI.g:303:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalOCCI.g:304:1: ( ruleState EOF )
            // InternalOCCI.g:305:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalOCCI.g:312:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:316:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalOCCI.g:317:2: ( ( rule__State__Group__0 ) )
            {
            // InternalOCCI.g:317:2: ( ( rule__State__Group__0 ) )
            // InternalOCCI.g:318:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalOCCI.g:319:3: ( rule__State__Group__0 )
            // InternalOCCI.g:319:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalOCCI.g:328:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalOCCI.g:329:1: ( ruleTransition EOF )
            // InternalOCCI.g:330:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalOCCI.g:337:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:341:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalOCCI.g:342:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalOCCI.g:342:2: ( ( rule__Transition__Group__0 ) )
            // InternalOCCI.g:343:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalOCCI.g:344:3: ( rule__Transition__Group__0 )
            // InternalOCCI.g:344:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleDataType"
    // InternalOCCI.g:353:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalOCCI.g:354:1: ( ruleDataType EOF )
            // InternalOCCI.g:355:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalOCCI.g:362:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:366:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalOCCI.g:367:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalOCCI.g:367:2: ( ( rule__DataType__Alternatives ) )
            // InternalOCCI.g:368:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalOCCI.g:369:3: ( rule__DataType__Alternatives )
            // InternalOCCI.g:369:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleStringType"
    // InternalOCCI.g:378:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalOCCI.g:379:1: ( ruleStringType EOF )
            // InternalOCCI.g:380:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalOCCI.g:387:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:391:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalOCCI.g:392:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalOCCI.g:392:2: ( ( rule__StringType__Group__0 ) )
            // InternalOCCI.g:393:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalOCCI.g:394:3: ( rule__StringType__Group__0 )
            // InternalOCCI.g:394:4: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleEObjectType"
    // InternalOCCI.g:403:1: entryRuleEObjectType : ruleEObjectType EOF ;
    public final void entryRuleEObjectType() throws RecognitionException {
        try {
            // InternalOCCI.g:404:1: ( ruleEObjectType EOF )
            // InternalOCCI.g:405:1: ruleEObjectType EOF
            {
             before(grammarAccess.getEObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEObjectType();

            state._fsp--;

             after(grammarAccess.getEObjectTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEObjectType"


    // $ANTLR start "ruleEObjectType"
    // InternalOCCI.g:412:1: ruleEObjectType : ( ( rule__EObjectType__Group__0 ) ) ;
    public final void ruleEObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:416:2: ( ( ( rule__EObjectType__Group__0 ) ) )
            // InternalOCCI.g:417:2: ( ( rule__EObjectType__Group__0 ) )
            {
            // InternalOCCI.g:417:2: ( ( rule__EObjectType__Group__0 ) )
            // InternalOCCI.g:418:3: ( rule__EObjectType__Group__0 )
            {
             before(grammarAccess.getEObjectTypeAccess().getGroup()); 
            // InternalOCCI.g:419:3: ( rule__EObjectType__Group__0 )
            // InternalOCCI.g:419:4: rule__EObjectType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EObjectType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEObjectTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEObjectType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalOCCI.g:428:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalOCCI.g:429:1: ( ruleBooleanType EOF )
            // InternalOCCI.g:430:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalOCCI.g:437:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:441:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // InternalOCCI.g:442:2: ( ( rule__BooleanType__Group__0 ) )
            {
            // InternalOCCI.g:442:2: ( ( rule__BooleanType__Group__0 ) )
            // InternalOCCI.g:443:3: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // InternalOCCI.g:444:3: ( rule__BooleanType__Group__0 )
            // InternalOCCI.g:444:4: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleNumericType"
    // InternalOCCI.g:453:1: entryRuleNumericType : ruleNumericType EOF ;
    public final void entryRuleNumericType() throws RecognitionException {
        try {
            // InternalOCCI.g:454:1: ( ruleNumericType EOF )
            // InternalOCCI.g:455:1: ruleNumericType EOF
            {
             before(grammarAccess.getNumericTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericType();

            state._fsp--;

             after(grammarAccess.getNumericTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // InternalOCCI.g:462:1: ruleNumericType : ( ( rule__NumericType__Group__0 ) ) ;
    public final void ruleNumericType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:466:2: ( ( ( rule__NumericType__Group__0 ) ) )
            // InternalOCCI.g:467:2: ( ( rule__NumericType__Group__0 ) )
            {
            // InternalOCCI.g:467:2: ( ( rule__NumericType__Group__0 ) )
            // InternalOCCI.g:468:3: ( rule__NumericType__Group__0 )
            {
             before(grammarAccess.getNumericTypeAccess().getGroup()); 
            // InternalOCCI.g:469:3: ( rule__NumericType__Group__0 )
            // InternalOCCI.g:469:4: rule__NumericType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleEnumerationType"
    // InternalOCCI.g:478:1: entryRuleEnumerationType : ruleEnumerationType EOF ;
    public final void entryRuleEnumerationType() throws RecognitionException {
        try {
            // InternalOCCI.g:479:1: ( ruleEnumerationType EOF )
            // InternalOCCI.g:480:1: ruleEnumerationType EOF
            {
             before(grammarAccess.getEnumerationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationType();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationType"


    // $ANTLR start "ruleEnumerationType"
    // InternalOCCI.g:487:1: ruleEnumerationType : ( ( rule__EnumerationType__Group__0 ) ) ;
    public final void ruleEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:491:2: ( ( ( rule__EnumerationType__Group__0 ) ) )
            // InternalOCCI.g:492:2: ( ( rule__EnumerationType__Group__0 ) )
            {
            // InternalOCCI.g:492:2: ( ( rule__EnumerationType__Group__0 ) )
            // InternalOCCI.g:493:3: ( rule__EnumerationType__Group__0 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup()); 
            // InternalOCCI.g:494:3: ( rule__EnumerationType__Group__0 )
            // InternalOCCI.g:494:4: rule__EnumerationType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationType"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalOCCI.g:503:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalOCCI.g:504:1: ( ruleEnumerationLiteral EOF )
            // InternalOCCI.g:505:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalOCCI.g:512:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:516:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalOCCI.g:517:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalOCCI.g:517:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalOCCI.g:518:3: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // InternalOCCI.g:519:3: ( rule__EnumerationLiteral__Group__0 )
            // InternalOCCI.g:519:4: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleRecordType"
    // InternalOCCI.g:528:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // InternalOCCI.g:529:1: ( ruleRecordType EOF )
            // InternalOCCI.g:530:1: ruleRecordType EOF
            {
             before(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getRecordTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // InternalOCCI.g:537:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:541:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // InternalOCCI.g:542:2: ( ( rule__RecordType__Group__0 ) )
            {
            // InternalOCCI.g:542:2: ( ( rule__RecordType__Group__0 ) )
            // InternalOCCI.g:543:3: ( rule__RecordType__Group__0 )
            {
             before(grammarAccess.getRecordTypeAccess().getGroup()); 
            // InternalOCCI.g:544:3: ( rule__RecordType__Group__0 )
            // InternalOCCI.g:544:4: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleRecordField"
    // InternalOCCI.g:553:1: entryRuleRecordField : ruleRecordField EOF ;
    public final void entryRuleRecordField() throws RecognitionException {
        try {
            // InternalOCCI.g:554:1: ( ruleRecordField EOF )
            // InternalOCCI.g:555:1: ruleRecordField EOF
            {
             before(grammarAccess.getRecordFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleRecordField();

            state._fsp--;

             after(grammarAccess.getRecordFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecordField"


    // $ANTLR start "ruleRecordField"
    // InternalOCCI.g:562:1: ruleRecordField : ( ( rule__RecordField__Group__0 ) ) ;
    public final void ruleRecordField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:566:2: ( ( ( rule__RecordField__Group__0 ) ) )
            // InternalOCCI.g:567:2: ( ( rule__RecordField__Group__0 ) )
            {
            // InternalOCCI.g:567:2: ( ( rule__RecordField__Group__0 ) )
            // InternalOCCI.g:568:3: ( rule__RecordField__Group__0 )
            {
             before(grammarAccess.getRecordFieldAccess().getGroup()); 
            // InternalOCCI.g:569:3: ( rule__RecordField__Group__0 )
            // InternalOCCI.g:569:4: rule__RecordField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordField"


    // $ANTLR start "entryRuleArrayType"
    // InternalOCCI.g:578:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalOCCI.g:579:1: ( ruleArrayType EOF )
            // InternalOCCI.g:580:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalOCCI.g:587:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:591:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalOCCI.g:592:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalOCCI.g:592:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalOCCI.g:593:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalOCCI.g:594:3: ( rule__ArrayType__Group__0 )
            // InternalOCCI.g:594:4: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalOCCI.g:603:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // InternalOCCI.g:604:1: ( ruleEIntegerObject EOF )
            // InternalOCCI.g:605:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalOCCI.g:612:1: ruleEIntegerObject : ( ( rule__EIntegerObject__Group__0 ) ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:616:2: ( ( ( rule__EIntegerObject__Group__0 ) ) )
            // InternalOCCI.g:617:2: ( ( rule__EIntegerObject__Group__0 ) )
            {
            // InternalOCCI.g:617:2: ( ( rule__EIntegerObject__Group__0 ) )
            // InternalOCCI.g:618:3: ( rule__EIntegerObject__Group__0 )
            {
             before(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            // InternalOCCI.g:619:3: ( rule__EIntegerObject__Group__0 )
            // InternalOCCI.g:619:4: rule__EIntegerObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntegerObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleQualifiedID"
    // InternalOCCI.g:628:1: entryRuleQualifiedID : ruleQualifiedID EOF ;
    public final void entryRuleQualifiedID() throws RecognitionException {
        try {
            // InternalOCCI.g:629:1: ( ruleQualifiedID EOF )
            // InternalOCCI.g:630:1: ruleQualifiedID EOF
            {
             before(grammarAccess.getQualifiedIDRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getQualifiedIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedID"


    // $ANTLR start "ruleQualifiedID"
    // InternalOCCI.g:637:1: ruleQualifiedID : ( ( rule__QualifiedID__Alternatives ) ) ;
    public final void ruleQualifiedID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:641:2: ( ( ( rule__QualifiedID__Alternatives ) ) )
            // InternalOCCI.g:642:2: ( ( rule__QualifiedID__Alternatives ) )
            {
            // InternalOCCI.g:642:2: ( ( rule__QualifiedID__Alternatives ) )
            // InternalOCCI.g:643:3: ( rule__QualifiedID__Alternatives )
            {
             before(grammarAccess.getQualifiedIDAccess().getAlternatives()); 
            // InternalOCCI.g:644:3: ( rule__QualifiedID__Alternatives )
            // InternalOCCI.g:644:4: rule__QualifiedID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedID"


    // $ANTLR start "entryRuleNameID"
    // InternalOCCI.g:653:1: entryRuleNameID : ruleNameID EOF ;
    public final void entryRuleNameID() throws RecognitionException {
        try {
            // InternalOCCI.g:654:1: ( ruleNameID EOF )
            // InternalOCCI.g:655:1: ruleNameID EOF
            {
             before(grammarAccess.getNameIDRule()); 
            pushFollow(FOLLOW_1);
            ruleNameID();

            state._fsp--;

             after(grammarAccess.getNameIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNameID"


    // $ANTLR start "ruleNameID"
    // InternalOCCI.g:662:1: ruleNameID : ( ( rule__NameID__Alternatives ) ) ;
    public final void ruleNameID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:666:2: ( ( ( rule__NameID__Alternatives ) ) )
            // InternalOCCI.g:667:2: ( ( rule__NameID__Alternatives ) )
            {
            // InternalOCCI.g:667:2: ( ( rule__NameID__Alternatives ) )
            // InternalOCCI.g:668:3: ( rule__NameID__Alternatives )
            {
             before(grammarAccess.getNameIDAccess().getAlternatives()); 
            // InternalOCCI.g:669:3: ( rule__NameID__Alternatives )
            // InternalOCCI.g:669:4: rule__NameID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NameID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNameIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameID"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalOCCI.g:678:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalOCCI.g:679:1: ( ruleKEYWORD EOF )
            // InternalOCCI.g:680:1: ruleKEYWORD EOF
            {
             before(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            ruleKEYWORD();

            state._fsp--;

             after(grammarAccess.getKEYWORDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalOCCI.g:687:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:691:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalOCCI.g:692:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalOCCI.g:692:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalOCCI.g:693:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalOCCI.g:694:3: ( rule__KEYWORD__Alternatives )
            // InternalOCCI.g:694:4: rule__KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKEYWORDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "ruleNumericTypeEnum"
    // InternalOCCI.g:703:1: ruleNumericTypeEnum : ( ( rule__NumericTypeEnum__Alternatives ) ) ;
    public final void ruleNumericTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:707:1: ( ( ( rule__NumericTypeEnum__Alternatives ) ) )
            // InternalOCCI.g:708:2: ( ( rule__NumericTypeEnum__Alternatives ) )
            {
            // InternalOCCI.g:708:2: ( ( rule__NumericTypeEnum__Alternatives ) )
            // InternalOCCI.g:709:3: ( rule__NumericTypeEnum__Alternatives )
            {
             before(grammarAccess.getNumericTypeEnumAccess().getAlternatives()); 
            // InternalOCCI.g:710:3: ( rule__NumericTypeEnum__Alternatives )
            // InternalOCCI.g:710:4: rule__NumericTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericTypeEnum"


    // $ANTLR start "rule__Extension__Alternatives_7"
    // InternalOCCI.g:718:1: rule__Extension__Alternatives_7 : ( ( ( rule__Extension__KindsAssignment_7_0 ) ) | ( ( rule__Extension__MixinsAssignment_7_1 ) ) | ( ( rule__Extension__TypesAssignment_7_2 ) ) );
    public final void rule__Extension__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:722:1: ( ( ( rule__Extension__KindsAssignment_7_0 ) ) | ( ( rule__Extension__MixinsAssignment_7_1 ) ) | ( ( rule__Extension__TypesAssignment_7_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 37:
            case 43:
            case 45:
            case 46:
            case 59:
            case 61:
            case 64:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOCCI.g:723:2: ( ( rule__Extension__KindsAssignment_7_0 ) )
                    {
                    // InternalOCCI.g:723:2: ( ( rule__Extension__KindsAssignment_7_0 ) )
                    // InternalOCCI.g:724:3: ( rule__Extension__KindsAssignment_7_0 )
                    {
                     before(grammarAccess.getExtensionAccess().getKindsAssignment_7_0()); 
                    // InternalOCCI.g:725:3: ( rule__Extension__KindsAssignment_7_0 )
                    // InternalOCCI.g:725:4: rule__Extension__KindsAssignment_7_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__KindsAssignment_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionAccess().getKindsAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:729:2: ( ( rule__Extension__MixinsAssignment_7_1 ) )
                    {
                    // InternalOCCI.g:729:2: ( ( rule__Extension__MixinsAssignment_7_1 ) )
                    // InternalOCCI.g:730:3: ( rule__Extension__MixinsAssignment_7_1 )
                    {
                     before(grammarAccess.getExtensionAccess().getMixinsAssignment_7_1()); 
                    // InternalOCCI.g:731:3: ( rule__Extension__MixinsAssignment_7_1 )
                    // InternalOCCI.g:731:4: rule__Extension__MixinsAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__MixinsAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionAccess().getMixinsAssignment_7_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:735:2: ( ( rule__Extension__TypesAssignment_7_2 ) )
                    {
                    // InternalOCCI.g:735:2: ( ( rule__Extension__TypesAssignment_7_2 ) )
                    // InternalOCCI.g:736:3: ( rule__Extension__TypesAssignment_7_2 )
                    {
                     before(grammarAccess.getExtensionAccess().getTypesAssignment_7_2()); 
                    // InternalOCCI.g:737:3: ( rule__Extension__TypesAssignment_7_2 )
                    // InternalOCCI.g:737:4: rule__Extension__TypesAssignment_7_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__TypesAssignment_7_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionAccess().getTypesAssignment_7_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Alternatives_7"


    // $ANTLR start "rule__Kind__Alternatives_8_1"
    // InternalOCCI.g:745:1: rule__Kind__Alternatives_8_1 : ( ( ( rule__Kind__AttributesAssignment_8_1_0 ) ) | ( ( rule__Kind__ActionsAssignment_8_1_1 ) ) | ( ( rule__Kind__ConstraintsAssignment_8_1_2 ) ) );
    public final void rule__Kind__Alternatives_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:749:1: ( ( ( rule__Kind__AttributesAssignment_8_1_0 ) ) | ( ( rule__Kind__ActionsAssignment_8_1_1 ) ) | ( ( rule__Kind__ConstraintsAssignment_8_1_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalOCCI.g:750:2: ( ( rule__Kind__AttributesAssignment_8_1_0 ) )
                    {
                    // InternalOCCI.g:750:2: ( ( rule__Kind__AttributesAssignment_8_1_0 ) )
                    // InternalOCCI.g:751:3: ( rule__Kind__AttributesAssignment_8_1_0 )
                    {
                     before(grammarAccess.getKindAccess().getAttributesAssignment_8_1_0()); 
                    // InternalOCCI.g:752:3: ( rule__Kind__AttributesAssignment_8_1_0 )
                    // InternalOCCI.g:752:4: rule__Kind__AttributesAssignment_8_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__AttributesAssignment_8_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKindAccess().getAttributesAssignment_8_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:756:2: ( ( rule__Kind__ActionsAssignment_8_1_1 ) )
                    {
                    // InternalOCCI.g:756:2: ( ( rule__Kind__ActionsAssignment_8_1_1 ) )
                    // InternalOCCI.g:757:3: ( rule__Kind__ActionsAssignment_8_1_1 )
                    {
                     before(grammarAccess.getKindAccess().getActionsAssignment_8_1_1()); 
                    // InternalOCCI.g:758:3: ( rule__Kind__ActionsAssignment_8_1_1 )
                    // InternalOCCI.g:758:4: rule__Kind__ActionsAssignment_8_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__ActionsAssignment_8_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKindAccess().getActionsAssignment_8_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:762:2: ( ( rule__Kind__ConstraintsAssignment_8_1_2 ) )
                    {
                    // InternalOCCI.g:762:2: ( ( rule__Kind__ConstraintsAssignment_8_1_2 ) )
                    // InternalOCCI.g:763:3: ( rule__Kind__ConstraintsAssignment_8_1_2 )
                    {
                     before(grammarAccess.getKindAccess().getConstraintsAssignment_8_1_2()); 
                    // InternalOCCI.g:764:3: ( rule__Kind__ConstraintsAssignment_8_1_2 )
                    // InternalOCCI.g:764:4: rule__Kind__ConstraintsAssignment_8_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__ConstraintsAssignment_8_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getKindAccess().getConstraintsAssignment_8_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Alternatives_8_1"


    // $ANTLR start "rule__Mixin__Alternatives_7_1"
    // InternalOCCI.g:772:1: rule__Mixin__Alternatives_7_1 : ( ( ( rule__Mixin__AttributesAssignment_7_1_0 ) ) | ( ( rule__Mixin__ActionsAssignment_7_1_1 ) ) | ( ( rule__Mixin__ConstraintsAssignment_7_1_2 ) ) );
    public final void rule__Mixin__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:776:1: ( ( ( rule__Mixin__AttributesAssignment_7_1_0 ) ) | ( ( rule__Mixin__ActionsAssignment_7_1_1 ) ) | ( ( rule__Mixin__ConstraintsAssignment_7_1_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 34:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOCCI.g:777:2: ( ( rule__Mixin__AttributesAssignment_7_1_0 ) )
                    {
                    // InternalOCCI.g:777:2: ( ( rule__Mixin__AttributesAssignment_7_1_0 ) )
                    // InternalOCCI.g:778:3: ( rule__Mixin__AttributesAssignment_7_1_0 )
                    {
                     before(grammarAccess.getMixinAccess().getAttributesAssignment_7_1_0()); 
                    // InternalOCCI.g:779:3: ( rule__Mixin__AttributesAssignment_7_1_0 )
                    // InternalOCCI.g:779:4: rule__Mixin__AttributesAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__AttributesAssignment_7_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMixinAccess().getAttributesAssignment_7_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:783:2: ( ( rule__Mixin__ActionsAssignment_7_1_1 ) )
                    {
                    // InternalOCCI.g:783:2: ( ( rule__Mixin__ActionsAssignment_7_1_1 ) )
                    // InternalOCCI.g:784:3: ( rule__Mixin__ActionsAssignment_7_1_1 )
                    {
                     before(grammarAccess.getMixinAccess().getActionsAssignment_7_1_1()); 
                    // InternalOCCI.g:785:3: ( rule__Mixin__ActionsAssignment_7_1_1 )
                    // InternalOCCI.g:785:4: rule__Mixin__ActionsAssignment_7_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__ActionsAssignment_7_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMixinAccess().getActionsAssignment_7_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:789:2: ( ( rule__Mixin__ConstraintsAssignment_7_1_2 ) )
                    {
                    // InternalOCCI.g:789:2: ( ( rule__Mixin__ConstraintsAssignment_7_1_2 ) )
                    // InternalOCCI.g:790:3: ( rule__Mixin__ConstraintsAssignment_7_1_2 )
                    {
                     before(grammarAccess.getMixinAccess().getConstraintsAssignment_7_1_2()); 
                    // InternalOCCI.g:791:3: ( rule__Mixin__ConstraintsAssignment_7_1_2 )
                    // InternalOCCI.g:791:4: rule__Mixin__ConstraintsAssignment_7_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__ConstraintsAssignment_7_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMixinAccess().getConstraintsAssignment_7_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Alternatives_7_1"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalOCCI.g:799:1: rule__DataType__Alternatives : ( ( ruleStringType ) | ( ruleEObjectType ) | ( ruleBooleanType ) | ( ruleNumericType ) | ( ruleEnumerationType ) | ( ruleRecordType ) | ( ruleArrayType ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:803:1: ( ( ruleStringType ) | ( ruleEObjectType ) | ( ruleBooleanType ) | ( ruleNumericType ) | ( ruleEnumerationType ) | ( ruleRecordType ) | ( ruleArrayType ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case 45:
                {
                alt4=3;
                }
                break;
            case 46:
                {
                alt4=4;
                }
                break;
            case 59:
                {
                alt4=5;
                }
                break;
            case 61:
                {
                alt4=6;
                }
                break;
            case 64:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOCCI.g:804:2: ( ruleStringType )
                    {
                    // InternalOCCI.g:804:2: ( ruleStringType )
                    // InternalOCCI.g:805:3: ruleStringType
                    {
                     before(grammarAccess.getDataTypeAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:810:2: ( ruleEObjectType )
                    {
                    // InternalOCCI.g:810:2: ( ruleEObjectType )
                    // InternalOCCI.g:811:3: ruleEObjectType
                    {
                     before(grammarAccess.getDataTypeAccess().getEObjectTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEObjectType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getEObjectTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:816:2: ( ruleBooleanType )
                    {
                    // InternalOCCI.g:816:2: ( ruleBooleanType )
                    // InternalOCCI.g:817:3: ruleBooleanType
                    {
                     before(grammarAccess.getDataTypeAccess().getBooleanTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getBooleanTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOCCI.g:822:2: ( ruleNumericType )
                    {
                    // InternalOCCI.g:822:2: ( ruleNumericType )
                    // InternalOCCI.g:823:3: ruleNumericType
                    {
                     before(grammarAccess.getDataTypeAccess().getNumericTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getNumericTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOCCI.g:828:2: ( ruleEnumerationType )
                    {
                    // InternalOCCI.g:828:2: ( ruleEnumerationType )
                    // InternalOCCI.g:829:3: ruleEnumerationType
                    {
                     before(grammarAccess.getDataTypeAccess().getEnumerationTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumerationType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getEnumerationTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOCCI.g:834:2: ( ruleRecordType )
                    {
                    // InternalOCCI.g:834:2: ( ruleRecordType )
                    // InternalOCCI.g:835:3: ruleRecordType
                    {
                     before(grammarAccess.getDataTypeAccess().getRecordTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleRecordType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getRecordTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOCCI.g:840:2: ( ruleArrayType )
                    {
                    // InternalOCCI.g:840:2: ( ruleArrayType )
                    // InternalOCCI.g:841:3: ruleArrayType
                    {
                     before(grammarAccess.getDataTypeAccess().getArrayTypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getArrayTypeParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__QualifiedID__Alternatives"
    // InternalOCCI.g:850:1: rule__QualifiedID__Alternatives : ( ( RULE_ID ) | ( RULE_QUALIFIED_ID ) | ( ruleKEYWORD ) );
    public final void rule__QualifiedID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:854:1: ( ( RULE_ID ) | ( RULE_QUALIFIED_ID ) | ( ruleKEYWORD ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_QUALIFIED_ID:
                {
                alt5=2;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
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
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalOCCI.g:855:2: ( RULE_ID )
                    {
                    // InternalOCCI.g:855:2: ( RULE_ID )
                    // InternalOCCI.g:856:3: RULE_ID
                    {
                     before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:861:2: ( RULE_QUALIFIED_ID )
                    {
                    // InternalOCCI.g:861:2: ( RULE_QUALIFIED_ID )
                    // InternalOCCI.g:862:3: RULE_QUALIFIED_ID
                    {
                     before(grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1()); 
                    match(input,RULE_QUALIFIED_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedIDAccess().getQUALIFIED_IDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:867:2: ( ruleKEYWORD )
                    {
                    // InternalOCCI.g:867:2: ( ruleKEYWORD )
                    // InternalOCCI.g:868:3: ruleKEYWORD
                    {
                     before(grammarAccess.getQualifiedIDAccess().getKEYWORDParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleKEYWORD();

                    state._fsp--;

                     after(grammarAccess.getQualifiedIDAccess().getKEYWORDParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedID__Alternatives"


    // $ANTLR start "rule__NameID__Alternatives"
    // InternalOCCI.g:877:1: rule__NameID__Alternatives : ( ( ( rule__NameID__Group_0__0 ) ) | ( ruleKEYWORD ) );
    public final void rule__NameID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:881:1: ( ( ( rule__NameID__Group_0__0 ) ) | ( ruleKEYWORD ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=13 && LA6_0<=64)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOCCI.g:882:2: ( ( rule__NameID__Group_0__0 ) )
                    {
                    // InternalOCCI.g:882:2: ( ( rule__NameID__Group_0__0 ) )
                    // InternalOCCI.g:883:3: ( rule__NameID__Group_0__0 )
                    {
                     before(grammarAccess.getNameIDAccess().getGroup_0()); 
                    // InternalOCCI.g:884:3: ( rule__NameID__Group_0__0 )
                    // InternalOCCI.g:884:4: rule__NameID__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NameID__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNameIDAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:888:2: ( ruleKEYWORD )
                    {
                    // InternalOCCI.g:888:2: ( ruleKEYWORD )
                    // InternalOCCI.g:889:3: ruleKEYWORD
                    {
                     before(grammarAccess.getNameIDAccess().getKEYWORDParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKEYWORD();

                    state._fsp--;

                     after(grammarAccess.getNameIDAccess().getKEYWORDParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameID__Alternatives"


    // $ANTLR start "rule__NameID__Alternatives_0_1"
    // InternalOCCI.g:898:1: rule__NameID__Alternatives_0_1 : ( ( RULE_ID ) | ( '-' ) );
    public final void rule__NameID__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:902:1: ( ( RULE_ID ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOCCI.g:903:2: ( RULE_ID )
                    {
                    // InternalOCCI.g:903:2: ( RULE_ID )
                    // InternalOCCI.g:904:3: RULE_ID
                    {
                     before(grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:909:2: ( '-' )
                    {
                    // InternalOCCI.g:909:2: ( '-' )
                    // InternalOCCI.g:910:3: '-'
                    {
                     before(grammarAccess.getNameIDAccess().getHyphenMinusKeyword_0_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNameIDAccess().getHyphenMinusKeyword_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameID__Alternatives_0_1"


    // $ANTLR start "rule__KEYWORD__Alternatives"
    // InternalOCCI.g:919:1: rule__KEYWORD__Alternatives : ( ( 'extension' ) | ( 'description' ) | ( 'specification' ) | ( 'as' ) | ( 'kind' ) | ( 'extends' ) | ( 'source' ) | ( 'target' ) | ( 'annotations' ) | ( 'title' ) | ( 'scheme' ) | ( 'mixin' ) | ( 'depends' ) | ( 'applies' ) | ( 'annotation' ) | ( 'key' ) | ( 'value' ) | ( 'attribute' ) | ( 'mutable' ) | ( 'required' ) | ( 'type' ) | ( 'action' ) | ( 'constraint' ) | ( 'body' ) | ( 'StringType' ) | ( 'documentation' ) | ( 'pattern' ) | ( 'length' ) | ( 'minLength' ) | ( 'maxLength' ) | ( 'EObjectType' ) | ( 'instanceClassName' ) | ( 'BooleanType' ) | ( 'NumericType' ) | ( 'totalDigits' ) | ( 'minExclusive' ) | ( 'maxExclusive' ) | ( 'minInclusive' ) | ( 'maxInclusive' ) | ( 'Byte' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'BigDecimal' ) | ( 'EnumerationType' ) | ( 'literals' ) | ( 'RecordType' ) | ( 'fields' ) | ( 'field' ) | ( 'ArrayType' ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:923:1: ( ( 'extension' ) | ( 'description' ) | ( 'specification' ) | ( 'as' ) | ( 'kind' ) | ( 'extends' ) | ( 'source' ) | ( 'target' ) | ( 'annotations' ) | ( 'title' ) | ( 'scheme' ) | ( 'mixin' ) | ( 'depends' ) | ( 'applies' ) | ( 'annotation' ) | ( 'key' ) | ( 'value' ) | ( 'attribute' ) | ( 'mutable' ) | ( 'required' ) | ( 'type' ) | ( 'action' ) | ( 'constraint' ) | ( 'body' ) | ( 'StringType' ) | ( 'documentation' ) | ( 'pattern' ) | ( 'length' ) | ( 'minLength' ) | ( 'maxLength' ) | ( 'EObjectType' ) | ( 'instanceClassName' ) | ( 'BooleanType' ) | ( 'NumericType' ) | ( 'totalDigits' ) | ( 'minExclusive' ) | ( 'maxExclusive' ) | ( 'minInclusive' ) | ( 'maxInclusive' ) | ( 'Byte' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'BigDecimal' ) | ( 'EnumerationType' ) | ( 'literals' ) | ( 'RecordType' ) | ( 'fields' ) | ( 'field' ) | ( 'ArrayType' ) )
            int alt8=52;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            case 19:
                {
                alt8=7;
                }
                break;
            case 20:
                {
                alt8=8;
                }
                break;
            case 21:
                {
                alt8=9;
                }
                break;
            case 22:
                {
                alt8=10;
                }
                break;
            case 23:
                {
                alt8=11;
                }
                break;
            case 24:
                {
                alt8=12;
                }
                break;
            case 25:
                {
                alt8=13;
                }
                break;
            case 26:
                {
                alt8=14;
                }
                break;
            case 27:
                {
                alt8=15;
                }
                break;
            case 28:
                {
                alt8=16;
                }
                break;
            case 29:
                {
                alt8=17;
                }
                break;
            case 30:
                {
                alt8=18;
                }
                break;
            case 31:
                {
                alt8=19;
                }
                break;
            case 32:
                {
                alt8=20;
                }
                break;
            case 33:
                {
                alt8=21;
                }
                break;
            case 34:
                {
                alt8=22;
                }
                break;
            case 35:
                {
                alt8=23;
                }
                break;
            case 36:
                {
                alt8=24;
                }
                break;
            case 37:
                {
                alt8=25;
                }
                break;
            case 38:
                {
                alt8=26;
                }
                break;
            case 39:
                {
                alt8=27;
                }
                break;
            case 40:
                {
                alt8=28;
                }
                break;
            case 41:
                {
                alt8=29;
                }
                break;
            case 42:
                {
                alt8=30;
                }
                break;
            case 43:
                {
                alt8=31;
                }
                break;
            case 44:
                {
                alt8=32;
                }
                break;
            case 45:
                {
                alt8=33;
                }
                break;
            case 46:
                {
                alt8=34;
                }
                break;
            case 47:
                {
                alt8=35;
                }
                break;
            case 48:
                {
                alt8=36;
                }
                break;
            case 49:
                {
                alt8=37;
                }
                break;
            case 50:
                {
                alt8=38;
                }
                break;
            case 51:
                {
                alt8=39;
                }
                break;
            case 52:
                {
                alt8=40;
                }
                break;
            case 53:
                {
                alt8=41;
                }
                break;
            case 54:
                {
                alt8=42;
                }
                break;
            case 55:
                {
                alt8=43;
                }
                break;
            case 56:
                {
                alt8=44;
                }
                break;
            case 57:
                {
                alt8=45;
                }
                break;
            case 58:
                {
                alt8=46;
                }
                break;
            case 59:
                {
                alt8=47;
                }
                break;
            case 60:
                {
                alt8=48;
                }
                break;
            case 61:
                {
                alt8=49;
                }
                break;
            case 62:
                {
                alt8=50;
                }
                break;
            case 63:
                {
                alt8=51;
                }
                break;
            case 64:
                {
                alt8=52;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalOCCI.g:924:2: ( 'extension' )
                    {
                    // InternalOCCI.g:924:2: ( 'extension' )
                    // InternalOCCI.g:925:3: 'extension'
                    {
                     before(grammarAccess.getKEYWORDAccess().getExtensionKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getExtensionKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:930:2: ( 'description' )
                    {
                    // InternalOCCI.g:930:2: ( 'description' )
                    // InternalOCCI.g:931:3: 'description'
                    {
                     before(grammarAccess.getKEYWORDAccess().getDescriptionKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDescriptionKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:936:2: ( 'specification' )
                    {
                    // InternalOCCI.g:936:2: ( 'specification' )
                    // InternalOCCI.g:937:3: 'specification'
                    {
                     before(grammarAccess.getKEYWORDAccess().getSpecificationKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getSpecificationKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOCCI.g:942:2: ( 'as' )
                    {
                    // InternalOCCI.g:942:2: ( 'as' )
                    // InternalOCCI.g:943:3: 'as'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAsKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAsKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOCCI.g:948:2: ( 'kind' )
                    {
                    // InternalOCCI.g:948:2: ( 'kind' )
                    // InternalOCCI.g:949:3: 'kind'
                    {
                     before(grammarAccess.getKEYWORDAccess().getKindKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getKindKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOCCI.g:954:2: ( 'extends' )
                    {
                    // InternalOCCI.g:954:2: ( 'extends' )
                    // InternalOCCI.g:955:3: 'extends'
                    {
                     before(grammarAccess.getKEYWORDAccess().getExtendsKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getExtendsKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOCCI.g:960:2: ( 'source' )
                    {
                    // InternalOCCI.g:960:2: ( 'source' )
                    // InternalOCCI.g:961:3: 'source'
                    {
                     before(grammarAccess.getKEYWORDAccess().getSourceKeyword_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getSourceKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalOCCI.g:966:2: ( 'target' )
                    {
                    // InternalOCCI.g:966:2: ( 'target' )
                    // InternalOCCI.g:967:3: 'target'
                    {
                     before(grammarAccess.getKEYWORDAccess().getTargetKeyword_7()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTargetKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalOCCI.g:972:2: ( 'annotations' )
                    {
                    // InternalOCCI.g:972:2: ( 'annotations' )
                    // InternalOCCI.g:973:3: 'annotations'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAnnotationsKeyword_8()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAnnotationsKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalOCCI.g:978:2: ( 'title' )
                    {
                    // InternalOCCI.g:978:2: ( 'title' )
                    // InternalOCCI.g:979:3: 'title'
                    {
                     before(grammarAccess.getKEYWORDAccess().getTitleKeyword_9()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTitleKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalOCCI.g:984:2: ( 'scheme' )
                    {
                    // InternalOCCI.g:984:2: ( 'scheme' )
                    // InternalOCCI.g:985:3: 'scheme'
                    {
                     before(grammarAccess.getKEYWORDAccess().getSchemeKeyword_10()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getSchemeKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalOCCI.g:990:2: ( 'mixin' )
                    {
                    // InternalOCCI.g:990:2: ( 'mixin' )
                    // InternalOCCI.g:991:3: 'mixin'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMixinKeyword_11()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMixinKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalOCCI.g:996:2: ( 'depends' )
                    {
                    // InternalOCCI.g:996:2: ( 'depends' )
                    // InternalOCCI.g:997:3: 'depends'
                    {
                     before(grammarAccess.getKEYWORDAccess().getDependsKeyword_12()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDependsKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalOCCI.g:1002:2: ( 'applies' )
                    {
                    // InternalOCCI.g:1002:2: ( 'applies' )
                    // InternalOCCI.g:1003:3: 'applies'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAppliesKeyword_13()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAppliesKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalOCCI.g:1008:2: ( 'annotation' )
                    {
                    // InternalOCCI.g:1008:2: ( 'annotation' )
                    // InternalOCCI.g:1009:3: 'annotation'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAnnotationKeyword_14()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAnnotationKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalOCCI.g:1014:2: ( 'key' )
                    {
                    // InternalOCCI.g:1014:2: ( 'key' )
                    // InternalOCCI.g:1015:3: 'key'
                    {
                     before(grammarAccess.getKEYWORDAccess().getKeyKeyword_15()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getKeyKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalOCCI.g:1020:2: ( 'value' )
                    {
                    // InternalOCCI.g:1020:2: ( 'value' )
                    // InternalOCCI.g:1021:3: 'value'
                    {
                     before(grammarAccess.getKEYWORDAccess().getValueKeyword_16()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getValueKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalOCCI.g:1026:2: ( 'attribute' )
                    {
                    // InternalOCCI.g:1026:2: ( 'attribute' )
                    // InternalOCCI.g:1027:3: 'attribute'
                    {
                     before(grammarAccess.getKEYWORDAccess().getAttributeKeyword_17()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getAttributeKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalOCCI.g:1032:2: ( 'mutable' )
                    {
                    // InternalOCCI.g:1032:2: ( 'mutable' )
                    // InternalOCCI.g:1033:3: 'mutable'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMutableKeyword_18()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMutableKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalOCCI.g:1038:2: ( 'required' )
                    {
                    // InternalOCCI.g:1038:2: ( 'required' )
                    // InternalOCCI.g:1039:3: 'required'
                    {
                     before(grammarAccess.getKEYWORDAccess().getRequiredKeyword_19()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getRequiredKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalOCCI.g:1044:2: ( 'type' )
                    {
                    // InternalOCCI.g:1044:2: ( 'type' )
                    // InternalOCCI.g:1045:3: 'type'
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_20()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalOCCI.g:1050:2: ( 'action' )
                    {
                    // InternalOCCI.g:1050:2: ( 'action' )
                    // InternalOCCI.g:1051:3: 'action'
                    {
                     before(grammarAccess.getKEYWORDAccess().getActionKeyword_21()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getActionKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalOCCI.g:1056:2: ( 'constraint' )
                    {
                    // InternalOCCI.g:1056:2: ( 'constraint' )
                    // InternalOCCI.g:1057:3: 'constraint'
                    {
                     before(grammarAccess.getKEYWORDAccess().getConstraintKeyword_22()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getConstraintKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalOCCI.g:1062:2: ( 'body' )
                    {
                    // InternalOCCI.g:1062:2: ( 'body' )
                    // InternalOCCI.g:1063:3: 'body'
                    {
                     before(grammarAccess.getKEYWORDAccess().getBodyKeyword_23()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getBodyKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalOCCI.g:1068:2: ( 'StringType' )
                    {
                    // InternalOCCI.g:1068:2: ( 'StringType' )
                    // InternalOCCI.g:1069:3: 'StringType'
                    {
                     before(grammarAccess.getKEYWORDAccess().getStringTypeKeyword_24()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getStringTypeKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalOCCI.g:1074:2: ( 'documentation' )
                    {
                    // InternalOCCI.g:1074:2: ( 'documentation' )
                    // InternalOCCI.g:1075:3: 'documentation'
                    {
                     before(grammarAccess.getKEYWORDAccess().getDocumentationKeyword_25()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDocumentationKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalOCCI.g:1080:2: ( 'pattern' )
                    {
                    // InternalOCCI.g:1080:2: ( 'pattern' )
                    // InternalOCCI.g:1081:3: 'pattern'
                    {
                     before(grammarAccess.getKEYWORDAccess().getPatternKeyword_26()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getPatternKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalOCCI.g:1086:2: ( 'length' )
                    {
                    // InternalOCCI.g:1086:2: ( 'length' )
                    // InternalOCCI.g:1087:3: 'length'
                    {
                     before(grammarAccess.getKEYWORDAccess().getLengthKeyword_27()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getLengthKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalOCCI.g:1092:2: ( 'minLength' )
                    {
                    // InternalOCCI.g:1092:2: ( 'minLength' )
                    // InternalOCCI.g:1093:3: 'minLength'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMinLengthKeyword_28()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMinLengthKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalOCCI.g:1098:2: ( 'maxLength' )
                    {
                    // InternalOCCI.g:1098:2: ( 'maxLength' )
                    // InternalOCCI.g:1099:3: 'maxLength'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_29()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaxLengthKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalOCCI.g:1104:2: ( 'EObjectType' )
                    {
                    // InternalOCCI.g:1104:2: ( 'EObjectType' )
                    // InternalOCCI.g:1105:3: 'EObjectType'
                    {
                     before(grammarAccess.getKEYWORDAccess().getEObjectTypeKeyword_30()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getEObjectTypeKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalOCCI.g:1110:2: ( 'instanceClassName' )
                    {
                    // InternalOCCI.g:1110:2: ( 'instanceClassName' )
                    // InternalOCCI.g:1111:3: 'instanceClassName'
                    {
                     before(grammarAccess.getKEYWORDAccess().getInstanceClassNameKeyword_31()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getInstanceClassNameKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalOCCI.g:1116:2: ( 'BooleanType' )
                    {
                    // InternalOCCI.g:1116:2: ( 'BooleanType' )
                    // InternalOCCI.g:1117:3: 'BooleanType'
                    {
                     before(grammarAccess.getKEYWORDAccess().getBooleanTypeKeyword_32()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getBooleanTypeKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // InternalOCCI.g:1122:2: ( 'NumericType' )
                    {
                    // InternalOCCI.g:1122:2: ( 'NumericType' )
                    // InternalOCCI.g:1123:3: 'NumericType'
                    {
                     before(grammarAccess.getKEYWORDAccess().getNumericTypeKeyword_33()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNumericTypeKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // InternalOCCI.g:1128:2: ( 'totalDigits' )
                    {
                    // InternalOCCI.g:1128:2: ( 'totalDigits' )
                    // InternalOCCI.g:1129:3: 'totalDigits'
                    {
                     before(grammarAccess.getKEYWORDAccess().getTotalDigitsKeyword_34()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTotalDigitsKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // InternalOCCI.g:1134:2: ( 'minExclusive' )
                    {
                    // InternalOCCI.g:1134:2: ( 'minExclusive' )
                    // InternalOCCI.g:1135:3: 'minExclusive'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMinExclusiveKeyword_35()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMinExclusiveKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // InternalOCCI.g:1140:2: ( 'maxExclusive' )
                    {
                    // InternalOCCI.g:1140:2: ( 'maxExclusive' )
                    // InternalOCCI.g:1141:3: 'maxExclusive'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaxExclusiveKeyword_36()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaxExclusiveKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // InternalOCCI.g:1146:2: ( 'minInclusive' )
                    {
                    // InternalOCCI.g:1146:2: ( 'minInclusive' )
                    // InternalOCCI.g:1147:3: 'minInclusive'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMinInclusiveKeyword_37()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMinInclusiveKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // InternalOCCI.g:1152:2: ( 'maxInclusive' )
                    {
                    // InternalOCCI.g:1152:2: ( 'maxInclusive' )
                    // InternalOCCI.g:1153:3: 'maxInclusive'
                    {
                     before(grammarAccess.getKEYWORDAccess().getMaxInclusiveKeyword_38()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMaxInclusiveKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // InternalOCCI.g:1158:2: ( 'Byte' )
                    {
                    // InternalOCCI.g:1158:2: ( 'Byte' )
                    // InternalOCCI.g:1159:3: 'Byte'
                    {
                     before(grammarAccess.getKEYWORDAccess().getByteKeyword_39()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getByteKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // InternalOCCI.g:1164:2: ( 'Double' )
                    {
                    // InternalOCCI.g:1164:2: ( 'Double' )
                    // InternalOCCI.g:1165:3: 'Double'
                    {
                     before(grammarAccess.getKEYWORDAccess().getDoubleKeyword_40()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDoubleKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // InternalOCCI.g:1170:2: ( 'Float' )
                    {
                    // InternalOCCI.g:1170:2: ( 'Float' )
                    // InternalOCCI.g:1171:3: 'Float'
                    {
                     before(grammarAccess.getKEYWORDAccess().getFloatKeyword_41()); 
                    match(input,54,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getFloatKeyword_41()); 

                    }


                    }
                    break;
                case 43 :
                    // InternalOCCI.g:1176:2: ( 'Integer' )
                    {
                    // InternalOCCI.g:1176:2: ( 'Integer' )
                    // InternalOCCI.g:1177:3: 'Integer'
                    {
                     before(grammarAccess.getKEYWORDAccess().getIntegerKeyword_42()); 
                    match(input,55,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getIntegerKeyword_42()); 

                    }


                    }
                    break;
                case 44 :
                    // InternalOCCI.g:1182:2: ( 'Long' )
                    {
                    // InternalOCCI.g:1182:2: ( 'Long' )
                    // InternalOCCI.g:1183:3: 'Long'
                    {
                     before(grammarAccess.getKEYWORDAccess().getLongKeyword_43()); 
                    match(input,56,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getLongKeyword_43()); 

                    }


                    }
                    break;
                case 45 :
                    // InternalOCCI.g:1188:2: ( 'Short' )
                    {
                    // InternalOCCI.g:1188:2: ( 'Short' )
                    // InternalOCCI.g:1189:3: 'Short'
                    {
                     before(grammarAccess.getKEYWORDAccess().getShortKeyword_44()); 
                    match(input,57,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getShortKeyword_44()); 

                    }


                    }
                    break;
                case 46 :
                    // InternalOCCI.g:1194:2: ( 'BigDecimal' )
                    {
                    // InternalOCCI.g:1194:2: ( 'BigDecimal' )
                    // InternalOCCI.g:1195:3: 'BigDecimal'
                    {
                     before(grammarAccess.getKEYWORDAccess().getBigDecimalKeyword_45()); 
                    match(input,58,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getBigDecimalKeyword_45()); 

                    }


                    }
                    break;
                case 47 :
                    // InternalOCCI.g:1200:2: ( 'EnumerationType' )
                    {
                    // InternalOCCI.g:1200:2: ( 'EnumerationType' )
                    // InternalOCCI.g:1201:3: 'EnumerationType'
                    {
                     before(grammarAccess.getKEYWORDAccess().getEnumerationTypeKeyword_46()); 
                    match(input,59,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getEnumerationTypeKeyword_46()); 

                    }


                    }
                    break;
                case 48 :
                    // InternalOCCI.g:1206:2: ( 'literals' )
                    {
                    // InternalOCCI.g:1206:2: ( 'literals' )
                    // InternalOCCI.g:1207:3: 'literals'
                    {
                     before(grammarAccess.getKEYWORDAccess().getLiteralsKeyword_47()); 
                    match(input,60,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getLiteralsKeyword_47()); 

                    }


                    }
                    break;
                case 49 :
                    // InternalOCCI.g:1212:2: ( 'RecordType' )
                    {
                    // InternalOCCI.g:1212:2: ( 'RecordType' )
                    // InternalOCCI.g:1213:3: 'RecordType'
                    {
                     before(grammarAccess.getKEYWORDAccess().getRecordTypeKeyword_48()); 
                    match(input,61,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getRecordTypeKeyword_48()); 

                    }


                    }
                    break;
                case 50 :
                    // InternalOCCI.g:1218:2: ( 'fields' )
                    {
                    // InternalOCCI.g:1218:2: ( 'fields' )
                    // InternalOCCI.g:1219:3: 'fields'
                    {
                     before(grammarAccess.getKEYWORDAccess().getFieldsKeyword_49()); 
                    match(input,62,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getFieldsKeyword_49()); 

                    }


                    }
                    break;
                case 51 :
                    // InternalOCCI.g:1224:2: ( 'field' )
                    {
                    // InternalOCCI.g:1224:2: ( 'field' )
                    // InternalOCCI.g:1225:3: 'field'
                    {
                     before(grammarAccess.getKEYWORDAccess().getFieldKeyword_50()); 
                    match(input,63,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getFieldKeyword_50()); 

                    }


                    }
                    break;
                case 52 :
                    // InternalOCCI.g:1230:2: ( 'ArrayType' )
                    {
                    // InternalOCCI.g:1230:2: ( 'ArrayType' )
                    // InternalOCCI.g:1231:3: 'ArrayType'
                    {
                     before(grammarAccess.getKEYWORDAccess().getArrayTypeKeyword_51()); 
                    match(input,64,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getArrayTypeKeyword_51()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KEYWORD__Alternatives"


    // $ANTLR start "rule__NumericTypeEnum__Alternatives"
    // InternalOCCI.g:1240:1: rule__NumericTypeEnum__Alternatives : ( ( ( 'Byte' ) ) | ( ( 'Double' ) ) | ( ( 'Float' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'Short' ) ) | ( ( 'BigDecimal' ) ) );
    public final void rule__NumericTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1244:1: ( ( ( 'Byte' ) ) | ( ( 'Double' ) ) | ( ( 'Float' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'Short' ) ) | ( ( 'BigDecimal' ) ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt9=1;
                }
                break;
            case 53:
                {
                alt9=2;
                }
                break;
            case 54:
                {
                alt9=3;
                }
                break;
            case 55:
                {
                alt9=4;
                }
                break;
            case 56:
                {
                alt9=5;
                }
                break;
            case 57:
                {
                alt9=6;
                }
                break;
            case 58:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalOCCI.g:1245:2: ( ( 'Byte' ) )
                    {
                    // InternalOCCI.g:1245:2: ( ( 'Byte' ) )
                    // InternalOCCI.g:1246:3: ( 'Byte' )
                    {
                     before(grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0()); 
                    // InternalOCCI.g:1247:3: ( 'Byte' )
                    // InternalOCCI.g:1247:4: 'Byte'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericTypeEnumAccess().getByteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:1251:2: ( ( 'Double' ) )
                    {
                    // InternalOCCI.g:1251:2: ( ( 'Double' ) )
                    // InternalOCCI.g:1252:3: ( 'Double' )
                    {
                     before(grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1()); 
                    // InternalOCCI.g:1253:3: ( 'Double' )
                    // InternalOCCI.g:1253:4: 'Double'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericTypeEnumAccess().getDoubleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:1257:2: ( ( 'Float' ) )
                    {
                    // InternalOCCI.g:1257:2: ( ( 'Float' ) )
                    // InternalOCCI.g:1258:3: ( 'Float' )
                    {
                     before(grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2()); 
                    // InternalOCCI.g:1259:3: ( 'Float' )
                    // InternalOCCI.g:1259:4: 'Float'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericTypeEnumAccess().getFloatEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOCCI.g:1263:2: ( ( 'Integer' ) )
                    {
                    // InternalOCCI.g:1263:2: ( ( 'Integer' ) )
                    // InternalOCCI.g:1264:3: ( 'Integer' )
                    {
                     before(grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3()); 
                    // InternalOCCI.g:1265:3: ( 'Integer' )
                    // InternalOCCI.g:1265:4: 'Integer'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericTypeEnumAccess().getIntegerEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOCCI.g:1269:2: ( ( 'Long' ) )
                    {
                    // InternalOCCI.g:1269:2: ( ( 'Long' ) )
                    // InternalOCCI.g:1270:3: ( 'Long' )
                    {
                     before(grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4()); 
                    // InternalOCCI.g:1271:3: ( 'Long' )
                    // InternalOCCI.g:1271:4: 'Long'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericTypeEnumAccess().getLongEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOCCI.g:1275:2: ( ( 'Short' ) )
                    {
                    // InternalOCCI.g:1275:2: ( ( 'Short' ) )
                    // InternalOCCI.g:1276:3: ( 'Short' )
                    {
                     before(grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5()); 
                    // InternalOCCI.g:1277:3: ( 'Short' )
                    // InternalOCCI.g:1277:4: 'Short'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericTypeEnumAccess().getShortEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOCCI.g:1281:2: ( ( 'BigDecimal' ) )
                    {
                    // InternalOCCI.g:1281:2: ( ( 'BigDecimal' ) )
                    // InternalOCCI.g:1282:3: ( 'BigDecimal' )
                    {
                     before(grammarAccess.getNumericTypeEnumAccess().getBigDecimalEnumLiteralDeclaration_6()); 
                    // InternalOCCI.g:1283:3: ( 'BigDecimal' )
                    // InternalOCCI.g:1283:4: 'BigDecimal'
                    {
                    match(input,58,FOLLOW_2); 

                    }

                     after(grammarAccess.getNumericTypeEnumAccess().getBigDecimalEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeEnum__Alternatives"


    // $ANTLR start "rule__Extension__Group__0"
    // InternalOCCI.g:1291:1: rule__Extension__Group__0 : rule__Extension__Group__0__Impl rule__Extension__Group__1 ;
    public final void rule__Extension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1295:1: ( rule__Extension__Group__0__Impl rule__Extension__Group__1 )
            // InternalOCCI.g:1296:2: rule__Extension__Group__0__Impl rule__Extension__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Extension__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__0"


    // $ANTLR start "rule__Extension__Group__0__Impl"
    // InternalOCCI.g:1303:1: rule__Extension__Group__0__Impl : ( 'extension' ) ;
    public final void rule__Extension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1307:1: ( ( 'extension' ) )
            // InternalOCCI.g:1308:1: ( 'extension' )
            {
            // InternalOCCI.g:1308:1: ( 'extension' )
            // InternalOCCI.g:1309:2: 'extension'
            {
             before(grammarAccess.getExtensionAccess().getExtensionKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getExtensionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__0__Impl"


    // $ANTLR start "rule__Extension__Group__1"
    // InternalOCCI.g:1318:1: rule__Extension__Group__1 : rule__Extension__Group__1__Impl rule__Extension__Group__2 ;
    public final void rule__Extension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1322:1: ( rule__Extension__Group__1__Impl rule__Extension__Group__2 )
            // InternalOCCI.g:1323:2: rule__Extension__Group__1__Impl rule__Extension__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Extension__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__1"


    // $ANTLR start "rule__Extension__Group__1__Impl"
    // InternalOCCI.g:1330:1: rule__Extension__Group__1__Impl : ( ( rule__Extension__NameAssignment_1 ) ) ;
    public final void rule__Extension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1334:1: ( ( ( rule__Extension__NameAssignment_1 ) ) )
            // InternalOCCI.g:1335:1: ( ( rule__Extension__NameAssignment_1 ) )
            {
            // InternalOCCI.g:1335:1: ( ( rule__Extension__NameAssignment_1 ) )
            // InternalOCCI.g:1336:2: ( rule__Extension__NameAssignment_1 )
            {
             before(grammarAccess.getExtensionAccess().getNameAssignment_1()); 
            // InternalOCCI.g:1337:2: ( rule__Extension__NameAssignment_1 )
            // InternalOCCI.g:1337:3: rule__Extension__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Extension__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__1__Impl"


    // $ANTLR start "rule__Extension__Group__2"
    // InternalOCCI.g:1345:1: rule__Extension__Group__2 : rule__Extension__Group__2__Impl rule__Extension__Group__3 ;
    public final void rule__Extension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1349:1: ( rule__Extension__Group__2__Impl rule__Extension__Group__3 )
            // InternalOCCI.g:1350:2: rule__Extension__Group__2__Impl rule__Extension__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Extension__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__2"


    // $ANTLR start "rule__Extension__Group__2__Impl"
    // InternalOCCI.g:1357:1: rule__Extension__Group__2__Impl : ( ':' ) ;
    public final void rule__Extension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1361:1: ( ( ':' ) )
            // InternalOCCI.g:1362:1: ( ':' )
            {
            // InternalOCCI.g:1362:1: ( ':' )
            // InternalOCCI.g:1363:2: ':'
            {
             before(grammarAccess.getExtensionAccess().getColonKeyword_2()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__2__Impl"


    // $ANTLR start "rule__Extension__Group__3"
    // InternalOCCI.g:1372:1: rule__Extension__Group__3 : rule__Extension__Group__3__Impl rule__Extension__Group__4 ;
    public final void rule__Extension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1376:1: ( rule__Extension__Group__3__Impl rule__Extension__Group__4 )
            // InternalOCCI.g:1377:2: rule__Extension__Group__3__Impl rule__Extension__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Extension__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__3"


    // $ANTLR start "rule__Extension__Group__3__Impl"
    // InternalOCCI.g:1384:1: rule__Extension__Group__3__Impl : ( ( rule__Extension__SchemeAssignment_3 ) ) ;
    public final void rule__Extension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1388:1: ( ( ( rule__Extension__SchemeAssignment_3 ) ) )
            // InternalOCCI.g:1389:1: ( ( rule__Extension__SchemeAssignment_3 ) )
            {
            // InternalOCCI.g:1389:1: ( ( rule__Extension__SchemeAssignment_3 ) )
            // InternalOCCI.g:1390:2: ( rule__Extension__SchemeAssignment_3 )
            {
             before(grammarAccess.getExtensionAccess().getSchemeAssignment_3()); 
            // InternalOCCI.g:1391:2: ( rule__Extension__SchemeAssignment_3 )
            // InternalOCCI.g:1391:3: rule__Extension__SchemeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Extension__SchemeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getSchemeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__3__Impl"


    // $ANTLR start "rule__Extension__Group__4"
    // InternalOCCI.g:1399:1: rule__Extension__Group__4 : rule__Extension__Group__4__Impl rule__Extension__Group__5 ;
    public final void rule__Extension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1403:1: ( rule__Extension__Group__4__Impl rule__Extension__Group__5 )
            // InternalOCCI.g:1404:2: rule__Extension__Group__4__Impl rule__Extension__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Extension__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__4"


    // $ANTLR start "rule__Extension__Group__4__Impl"
    // InternalOCCI.g:1411:1: rule__Extension__Group__4__Impl : ( ( rule__Extension__Group_4__0 )? ) ;
    public final void rule__Extension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1415:1: ( ( ( rule__Extension__Group_4__0 )? ) )
            // InternalOCCI.g:1416:1: ( ( rule__Extension__Group_4__0 )? )
            {
            // InternalOCCI.g:1416:1: ( ( rule__Extension__Group_4__0 )? )
            // InternalOCCI.g:1417:2: ( rule__Extension__Group_4__0 )?
            {
             before(grammarAccess.getExtensionAccess().getGroup_4()); 
            // InternalOCCI.g:1418:2: ( rule__Extension__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOCCI.g:1418:3: rule__Extension__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtensionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__4__Impl"


    // $ANTLR start "rule__Extension__Group__5"
    // InternalOCCI.g:1426:1: rule__Extension__Group__5 : rule__Extension__Group__5__Impl rule__Extension__Group__6 ;
    public final void rule__Extension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1430:1: ( rule__Extension__Group__5__Impl rule__Extension__Group__6 )
            // InternalOCCI.g:1431:2: rule__Extension__Group__5__Impl rule__Extension__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Extension__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__5"


    // $ANTLR start "rule__Extension__Group__5__Impl"
    // InternalOCCI.g:1438:1: rule__Extension__Group__5__Impl : ( ( rule__Extension__Group_5__0 )? ) ;
    public final void rule__Extension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1442:1: ( ( ( rule__Extension__Group_5__0 )? ) )
            // InternalOCCI.g:1443:1: ( ( rule__Extension__Group_5__0 )? )
            {
            // InternalOCCI.g:1443:1: ( ( rule__Extension__Group_5__0 )? )
            // InternalOCCI.g:1444:2: ( rule__Extension__Group_5__0 )?
            {
             before(grammarAccess.getExtensionAccess().getGroup_5()); 
            // InternalOCCI.g:1445:2: ( rule__Extension__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOCCI.g:1445:3: rule__Extension__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtensionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__5__Impl"


    // $ANTLR start "rule__Extension__Group__6"
    // InternalOCCI.g:1453:1: rule__Extension__Group__6 : rule__Extension__Group__6__Impl rule__Extension__Group__7 ;
    public final void rule__Extension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1457:1: ( rule__Extension__Group__6__Impl rule__Extension__Group__7 )
            // InternalOCCI.g:1458:2: rule__Extension__Group__6__Impl rule__Extension__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Extension__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__6"


    // $ANTLR start "rule__Extension__Group__6__Impl"
    // InternalOCCI.g:1465:1: rule__Extension__Group__6__Impl : ( ( rule__Extension__Group_6__0 )* ) ;
    public final void rule__Extension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1469:1: ( ( ( rule__Extension__Group_6__0 )* ) )
            // InternalOCCI.g:1470:1: ( ( rule__Extension__Group_6__0 )* )
            {
            // InternalOCCI.g:1470:1: ( ( rule__Extension__Group_6__0 )* )
            // InternalOCCI.g:1471:2: ( rule__Extension__Group_6__0 )*
            {
             before(grammarAccess.getExtensionAccess().getGroup_6()); 
            // InternalOCCI.g:1472:2: ( rule__Extension__Group_6__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==66) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOCCI.g:1472:3: rule__Extension__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Extension__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExtensionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__6__Impl"


    // $ANTLR start "rule__Extension__Group__7"
    // InternalOCCI.g:1480:1: rule__Extension__Group__7 : rule__Extension__Group__7__Impl ;
    public final void rule__Extension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1484:1: ( rule__Extension__Group__7__Impl )
            // InternalOCCI.g:1485:2: rule__Extension__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__7"


    // $ANTLR start "rule__Extension__Group__7__Impl"
    // InternalOCCI.g:1491:1: rule__Extension__Group__7__Impl : ( ( rule__Extension__Alternatives_7 )* ) ;
    public final void rule__Extension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1495:1: ( ( ( rule__Extension__Alternatives_7 )* ) )
            // InternalOCCI.g:1496:1: ( ( rule__Extension__Alternatives_7 )* )
            {
            // InternalOCCI.g:1496:1: ( ( rule__Extension__Alternatives_7 )* )
            // InternalOCCI.g:1497:2: ( rule__Extension__Alternatives_7 )*
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_7()); 
            // InternalOCCI.g:1498:2: ( rule__Extension__Alternatives_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17||LA13_0==24||LA13_0==37||LA13_0==43||(LA13_0>=45 && LA13_0<=46)||LA13_0==59||LA13_0==61||LA13_0==64) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOCCI.g:1498:3: rule__Extension__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Extension__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExtensionAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__7__Impl"


    // $ANTLR start "rule__Extension__Group_4__0"
    // InternalOCCI.g:1507:1: rule__Extension__Group_4__0 : rule__Extension__Group_4__0__Impl rule__Extension__Group_4__1 ;
    public final void rule__Extension__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1511:1: ( rule__Extension__Group_4__0__Impl rule__Extension__Group_4__1 )
            // InternalOCCI.g:1512:2: rule__Extension__Group_4__0__Impl rule__Extension__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Extension__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_4__0"


    // $ANTLR start "rule__Extension__Group_4__0__Impl"
    // InternalOCCI.g:1519:1: rule__Extension__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Extension__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1523:1: ( ( 'description' ) )
            // InternalOCCI.g:1524:1: ( 'description' )
            {
            // InternalOCCI.g:1524:1: ( 'description' )
            // InternalOCCI.g:1525:2: 'description'
            {
             before(grammarAccess.getExtensionAccess().getDescriptionKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_4__0__Impl"


    // $ANTLR start "rule__Extension__Group_4__1"
    // InternalOCCI.g:1534:1: rule__Extension__Group_4__1 : rule__Extension__Group_4__1__Impl ;
    public final void rule__Extension__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1538:1: ( rule__Extension__Group_4__1__Impl )
            // InternalOCCI.g:1539:2: rule__Extension__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_4__1"


    // $ANTLR start "rule__Extension__Group_4__1__Impl"
    // InternalOCCI.g:1545:1: rule__Extension__Group_4__1__Impl : ( ( rule__Extension__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Extension__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1549:1: ( ( ( rule__Extension__DescriptionAssignment_4_1 ) ) )
            // InternalOCCI.g:1550:1: ( ( rule__Extension__DescriptionAssignment_4_1 ) )
            {
            // InternalOCCI.g:1550:1: ( ( rule__Extension__DescriptionAssignment_4_1 ) )
            // InternalOCCI.g:1551:2: ( rule__Extension__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getExtensionAccess().getDescriptionAssignment_4_1()); 
            // InternalOCCI.g:1552:2: ( rule__Extension__DescriptionAssignment_4_1 )
            // InternalOCCI.g:1552:3: rule__Extension__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Extension__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_4__1__Impl"


    // $ANTLR start "rule__Extension__Group_5__0"
    // InternalOCCI.g:1561:1: rule__Extension__Group_5__0 : rule__Extension__Group_5__0__Impl rule__Extension__Group_5__1 ;
    public final void rule__Extension__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1565:1: ( rule__Extension__Group_5__0__Impl rule__Extension__Group_5__1 )
            // InternalOCCI.g:1566:2: rule__Extension__Group_5__0__Impl rule__Extension__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Extension__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__0"


    // $ANTLR start "rule__Extension__Group_5__0__Impl"
    // InternalOCCI.g:1573:1: rule__Extension__Group_5__0__Impl : ( 'specification' ) ;
    public final void rule__Extension__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1577:1: ( ( 'specification' ) )
            // InternalOCCI.g:1578:1: ( 'specification' )
            {
            // InternalOCCI.g:1578:1: ( 'specification' )
            // InternalOCCI.g:1579:2: 'specification'
            {
             before(grammarAccess.getExtensionAccess().getSpecificationKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getSpecificationKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__0__Impl"


    // $ANTLR start "rule__Extension__Group_5__1"
    // InternalOCCI.g:1588:1: rule__Extension__Group_5__1 : rule__Extension__Group_5__1__Impl ;
    public final void rule__Extension__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1592:1: ( rule__Extension__Group_5__1__Impl )
            // InternalOCCI.g:1593:2: rule__Extension__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__1"


    // $ANTLR start "rule__Extension__Group_5__1__Impl"
    // InternalOCCI.g:1599:1: rule__Extension__Group_5__1__Impl : ( ( rule__Extension__SpecificationAssignment_5_1 ) ) ;
    public final void rule__Extension__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1603:1: ( ( ( rule__Extension__SpecificationAssignment_5_1 ) ) )
            // InternalOCCI.g:1604:1: ( ( rule__Extension__SpecificationAssignment_5_1 ) )
            {
            // InternalOCCI.g:1604:1: ( ( rule__Extension__SpecificationAssignment_5_1 ) )
            // InternalOCCI.g:1605:2: ( rule__Extension__SpecificationAssignment_5_1 )
            {
             before(grammarAccess.getExtensionAccess().getSpecificationAssignment_5_1()); 
            // InternalOCCI.g:1606:2: ( rule__Extension__SpecificationAssignment_5_1 )
            // InternalOCCI.g:1606:3: rule__Extension__SpecificationAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Extension__SpecificationAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getSpecificationAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_5__1__Impl"


    // $ANTLR start "rule__Extension__Group_6__0"
    // InternalOCCI.g:1615:1: rule__Extension__Group_6__0 : rule__Extension__Group_6__0__Impl rule__Extension__Group_6__1 ;
    public final void rule__Extension__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1619:1: ( rule__Extension__Group_6__0__Impl rule__Extension__Group_6__1 )
            // InternalOCCI.g:1620:2: rule__Extension__Group_6__0__Impl rule__Extension__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Extension__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__0"


    // $ANTLR start "rule__Extension__Group_6__0__Impl"
    // InternalOCCI.g:1627:1: rule__Extension__Group_6__0__Impl : ( 'import' ) ;
    public final void rule__Extension__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1631:1: ( ( 'import' ) )
            // InternalOCCI.g:1632:1: ( 'import' )
            {
            // InternalOCCI.g:1632:1: ( 'import' )
            // InternalOCCI.g:1633:2: 'import'
            {
             before(grammarAccess.getExtensionAccess().getImportKeyword_6_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getImportKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__0__Impl"


    // $ANTLR start "rule__Extension__Group_6__1"
    // InternalOCCI.g:1642:1: rule__Extension__Group_6__1 : rule__Extension__Group_6__1__Impl rule__Extension__Group_6__2 ;
    public final void rule__Extension__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1646:1: ( rule__Extension__Group_6__1__Impl rule__Extension__Group_6__2 )
            // InternalOCCI.g:1647:2: rule__Extension__Group_6__1__Impl rule__Extension__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__Extension__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__1"


    // $ANTLR start "rule__Extension__Group_6__1__Impl"
    // InternalOCCI.g:1654:1: rule__Extension__Group_6__1__Impl : ( ( rule__Extension__ImportAssignment_6_1 ) ) ;
    public final void rule__Extension__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1658:1: ( ( ( rule__Extension__ImportAssignment_6_1 ) ) )
            // InternalOCCI.g:1659:1: ( ( rule__Extension__ImportAssignment_6_1 ) )
            {
            // InternalOCCI.g:1659:1: ( ( rule__Extension__ImportAssignment_6_1 ) )
            // InternalOCCI.g:1660:2: ( rule__Extension__ImportAssignment_6_1 )
            {
             before(grammarAccess.getExtensionAccess().getImportAssignment_6_1()); 
            // InternalOCCI.g:1661:2: ( rule__Extension__ImportAssignment_6_1 )
            // InternalOCCI.g:1661:3: rule__Extension__ImportAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Extension__ImportAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getImportAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__1__Impl"


    // $ANTLR start "rule__Extension__Group_6__2"
    // InternalOCCI.g:1669:1: rule__Extension__Group_6__2 : rule__Extension__Group_6__2__Impl ;
    public final void rule__Extension__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1673:1: ( rule__Extension__Group_6__2__Impl )
            // InternalOCCI.g:1674:2: rule__Extension__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__2"


    // $ANTLR start "rule__Extension__Group_6__2__Impl"
    // InternalOCCI.g:1680:1: rule__Extension__Group_6__2__Impl : ( ( rule__Extension__Group_6_2__0 )? ) ;
    public final void rule__Extension__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1684:1: ( ( ( rule__Extension__Group_6_2__0 )? ) )
            // InternalOCCI.g:1685:1: ( ( rule__Extension__Group_6_2__0 )? )
            {
            // InternalOCCI.g:1685:1: ( ( rule__Extension__Group_6_2__0 )? )
            // InternalOCCI.g:1686:2: ( rule__Extension__Group_6_2__0 )?
            {
             before(grammarAccess.getExtensionAccess().getGroup_6_2()); 
            // InternalOCCI.g:1687:2: ( rule__Extension__Group_6_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOCCI.g:1687:3: rule__Extension__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__Group_6_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtensionAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6__2__Impl"


    // $ANTLR start "rule__Extension__Group_6_2__0"
    // InternalOCCI.g:1696:1: rule__Extension__Group_6_2__0 : rule__Extension__Group_6_2__0__Impl rule__Extension__Group_6_2__1 ;
    public final void rule__Extension__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1700:1: ( rule__Extension__Group_6_2__0__Impl rule__Extension__Group_6_2__1 )
            // InternalOCCI.g:1701:2: rule__Extension__Group_6_2__0__Impl rule__Extension__Group_6_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Extension__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6_2__0"


    // $ANTLR start "rule__Extension__Group_6_2__0__Impl"
    // InternalOCCI.g:1708:1: rule__Extension__Group_6_2__0__Impl : ( 'as' ) ;
    public final void rule__Extension__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1712:1: ( ( 'as' ) )
            // InternalOCCI.g:1713:1: ( 'as' )
            {
            // InternalOCCI.g:1713:1: ( 'as' )
            // InternalOCCI.g:1714:2: 'as'
            {
             before(grammarAccess.getExtensionAccess().getAsKeyword_6_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getAsKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6_2__0__Impl"


    // $ANTLR start "rule__Extension__Group_6_2__1"
    // InternalOCCI.g:1723:1: rule__Extension__Group_6_2__1 : rule__Extension__Group_6_2__1__Impl ;
    public final void rule__Extension__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1727:1: ( rule__Extension__Group_6_2__1__Impl )
            // InternalOCCI.g:1728:2: rule__Extension__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6_2__1"


    // $ANTLR start "rule__Extension__Group_6_2__1__Impl"
    // InternalOCCI.g:1734:1: rule__Extension__Group_6_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Extension__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1738:1: ( ( RULE_ID ) )
            // InternalOCCI.g:1739:1: ( RULE_ID )
            {
            // InternalOCCI.g:1739:1: ( RULE_ID )
            // InternalOCCI.g:1740:2: RULE_ID
            {
             before(grammarAccess.getExtensionAccess().getIDTerminalRuleCall_6_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getIDTerminalRuleCall_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_6_2__1__Impl"


    // $ANTLR start "rule__Kind__Group__0"
    // InternalOCCI.g:1750:1: rule__Kind__Group__0 : rule__Kind__Group__0__Impl rule__Kind__Group__1 ;
    public final void rule__Kind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1754:1: ( rule__Kind__Group__0__Impl rule__Kind__Group__1 )
            // InternalOCCI.g:1755:2: rule__Kind__Group__0__Impl rule__Kind__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Kind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__0"


    // $ANTLR start "rule__Kind__Group__0__Impl"
    // InternalOCCI.g:1762:1: rule__Kind__Group__0__Impl : ( 'kind' ) ;
    public final void rule__Kind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1766:1: ( ( 'kind' ) )
            // InternalOCCI.g:1767:1: ( 'kind' )
            {
            // InternalOCCI.g:1767:1: ( 'kind' )
            // InternalOCCI.g:1768:2: 'kind'
            {
             before(grammarAccess.getKindAccess().getKindKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getKindKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__0__Impl"


    // $ANTLR start "rule__Kind__Group__1"
    // InternalOCCI.g:1777:1: rule__Kind__Group__1 : rule__Kind__Group__1__Impl rule__Kind__Group__2 ;
    public final void rule__Kind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1781:1: ( rule__Kind__Group__1__Impl rule__Kind__Group__2 )
            // InternalOCCI.g:1782:2: rule__Kind__Group__1__Impl rule__Kind__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Kind__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__1"


    // $ANTLR start "rule__Kind__Group__1__Impl"
    // InternalOCCI.g:1789:1: rule__Kind__Group__1__Impl : ( ( rule__Kind__NameAssignment_1 ) ) ;
    public final void rule__Kind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1793:1: ( ( ( rule__Kind__NameAssignment_1 ) ) )
            // InternalOCCI.g:1794:1: ( ( rule__Kind__NameAssignment_1 ) )
            {
            // InternalOCCI.g:1794:1: ( ( rule__Kind__NameAssignment_1 ) )
            // InternalOCCI.g:1795:2: ( rule__Kind__NameAssignment_1 )
            {
             before(grammarAccess.getKindAccess().getNameAssignment_1()); 
            // InternalOCCI.g:1796:2: ( rule__Kind__NameAssignment_1 )
            // InternalOCCI.g:1796:3: rule__Kind__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Kind__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__1__Impl"


    // $ANTLR start "rule__Kind__Group__2"
    // InternalOCCI.g:1804:1: rule__Kind__Group__2 : rule__Kind__Group__2__Impl rule__Kind__Group__3 ;
    public final void rule__Kind__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1808:1: ( rule__Kind__Group__2__Impl rule__Kind__Group__3 )
            // InternalOCCI.g:1809:2: rule__Kind__Group__2__Impl rule__Kind__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Kind__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__2"


    // $ANTLR start "rule__Kind__Group__2__Impl"
    // InternalOCCI.g:1816:1: rule__Kind__Group__2__Impl : ( ( rule__Kind__Group_2__0 )? ) ;
    public final void rule__Kind__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1820:1: ( ( ( rule__Kind__Group_2__0 )? ) )
            // InternalOCCI.g:1821:1: ( ( rule__Kind__Group_2__0 )? )
            {
            // InternalOCCI.g:1821:1: ( ( rule__Kind__Group_2__0 )? )
            // InternalOCCI.g:1822:2: ( rule__Kind__Group_2__0 )?
            {
             before(grammarAccess.getKindAccess().getGroup_2()); 
            // InternalOCCI.g:1823:2: ( rule__Kind__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOCCI.g:1823:3: rule__Kind__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__2__Impl"


    // $ANTLR start "rule__Kind__Group__3"
    // InternalOCCI.g:1831:1: rule__Kind__Group__3 : rule__Kind__Group__3__Impl rule__Kind__Group__4 ;
    public final void rule__Kind__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1835:1: ( rule__Kind__Group__3__Impl rule__Kind__Group__4 )
            // InternalOCCI.g:1836:2: rule__Kind__Group__3__Impl rule__Kind__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Kind__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__3"


    // $ANTLR start "rule__Kind__Group__3__Impl"
    // InternalOCCI.g:1843:1: rule__Kind__Group__3__Impl : ( ( rule__Kind__Group_3__0 )? ) ;
    public final void rule__Kind__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1847:1: ( ( ( rule__Kind__Group_3__0 )? ) )
            // InternalOCCI.g:1848:1: ( ( rule__Kind__Group_3__0 )? )
            {
            // InternalOCCI.g:1848:1: ( ( rule__Kind__Group_3__0 )? )
            // InternalOCCI.g:1849:2: ( rule__Kind__Group_3__0 )?
            {
             before(grammarAccess.getKindAccess().getGroup_3()); 
            // InternalOCCI.g:1850:2: ( rule__Kind__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOCCI.g:1850:3: rule__Kind__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__3__Impl"


    // $ANTLR start "rule__Kind__Group__4"
    // InternalOCCI.g:1858:1: rule__Kind__Group__4 : rule__Kind__Group__4__Impl rule__Kind__Group__5 ;
    public final void rule__Kind__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1862:1: ( rule__Kind__Group__4__Impl rule__Kind__Group__5 )
            // InternalOCCI.g:1863:2: rule__Kind__Group__4__Impl rule__Kind__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Kind__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__4"


    // $ANTLR start "rule__Kind__Group__4__Impl"
    // InternalOCCI.g:1870:1: rule__Kind__Group__4__Impl : ( ( rule__Kind__Group_4__0 )? ) ;
    public final void rule__Kind__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1874:1: ( ( ( rule__Kind__Group_4__0 )? ) )
            // InternalOCCI.g:1875:1: ( ( rule__Kind__Group_4__0 )? )
            {
            // InternalOCCI.g:1875:1: ( ( rule__Kind__Group_4__0 )? )
            // InternalOCCI.g:1876:2: ( rule__Kind__Group_4__0 )?
            {
             before(grammarAccess.getKindAccess().getGroup_4()); 
            // InternalOCCI.g:1877:2: ( rule__Kind__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOCCI.g:1877:3: rule__Kind__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__4__Impl"


    // $ANTLR start "rule__Kind__Group__5"
    // InternalOCCI.g:1885:1: rule__Kind__Group__5 : rule__Kind__Group__5__Impl rule__Kind__Group__6 ;
    public final void rule__Kind__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1889:1: ( rule__Kind__Group__5__Impl rule__Kind__Group__6 )
            // InternalOCCI.g:1890:2: rule__Kind__Group__5__Impl rule__Kind__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Kind__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__5"


    // $ANTLR start "rule__Kind__Group__5__Impl"
    // InternalOCCI.g:1897:1: rule__Kind__Group__5__Impl : ( ( rule__Kind__Group_5__0 )? ) ;
    public final void rule__Kind__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1901:1: ( ( ( rule__Kind__Group_5__0 )? ) )
            // InternalOCCI.g:1902:1: ( ( rule__Kind__Group_5__0 )? )
            {
            // InternalOCCI.g:1902:1: ( ( rule__Kind__Group_5__0 )? )
            // InternalOCCI.g:1903:2: ( rule__Kind__Group_5__0 )?
            {
             before(grammarAccess.getKindAccess().getGroup_5()); 
            // InternalOCCI.g:1904:2: ( rule__Kind__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOCCI.g:1904:3: rule__Kind__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__5__Impl"


    // $ANTLR start "rule__Kind__Group__6"
    // InternalOCCI.g:1912:1: rule__Kind__Group__6 : rule__Kind__Group__6__Impl rule__Kind__Group__7 ;
    public final void rule__Kind__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1916:1: ( rule__Kind__Group__6__Impl rule__Kind__Group__7 )
            // InternalOCCI.g:1917:2: rule__Kind__Group__6__Impl rule__Kind__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Kind__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__6"


    // $ANTLR start "rule__Kind__Group__6__Impl"
    // InternalOCCI.g:1924:1: rule__Kind__Group__6__Impl : ( 'scheme' ) ;
    public final void rule__Kind__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1928:1: ( ( 'scheme' ) )
            // InternalOCCI.g:1929:1: ( 'scheme' )
            {
            // InternalOCCI.g:1929:1: ( 'scheme' )
            // InternalOCCI.g:1930:2: 'scheme'
            {
             before(grammarAccess.getKindAccess().getSchemeKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getSchemeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__6__Impl"


    // $ANTLR start "rule__Kind__Group__7"
    // InternalOCCI.g:1939:1: rule__Kind__Group__7 : rule__Kind__Group__7__Impl rule__Kind__Group__8 ;
    public final void rule__Kind__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1943:1: ( rule__Kind__Group__7__Impl rule__Kind__Group__8 )
            // InternalOCCI.g:1944:2: rule__Kind__Group__7__Impl rule__Kind__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Kind__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__7"


    // $ANTLR start "rule__Kind__Group__7__Impl"
    // InternalOCCI.g:1951:1: rule__Kind__Group__7__Impl : ( ( rule__Kind__SchemeAssignment_7 ) ) ;
    public final void rule__Kind__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1955:1: ( ( ( rule__Kind__SchemeAssignment_7 ) ) )
            // InternalOCCI.g:1956:1: ( ( rule__Kind__SchemeAssignment_7 ) )
            {
            // InternalOCCI.g:1956:1: ( ( rule__Kind__SchemeAssignment_7 ) )
            // InternalOCCI.g:1957:2: ( rule__Kind__SchemeAssignment_7 )
            {
             before(grammarAccess.getKindAccess().getSchemeAssignment_7()); 
            // InternalOCCI.g:1958:2: ( rule__Kind__SchemeAssignment_7 )
            // InternalOCCI.g:1958:3: rule__Kind__SchemeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Kind__SchemeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getSchemeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__7__Impl"


    // $ANTLR start "rule__Kind__Group__8"
    // InternalOCCI.g:1966:1: rule__Kind__Group__8 : rule__Kind__Group__8__Impl rule__Kind__Group__9 ;
    public final void rule__Kind__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1970:1: ( rule__Kind__Group__8__Impl rule__Kind__Group__9 )
            // InternalOCCI.g:1971:2: rule__Kind__Group__8__Impl rule__Kind__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Kind__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__8"


    // $ANTLR start "rule__Kind__Group__8__Impl"
    // InternalOCCI.g:1978:1: rule__Kind__Group__8__Impl : ( ( rule__Kind__Group_8__0 )? ) ;
    public final void rule__Kind__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1982:1: ( ( ( rule__Kind__Group_8__0 )? ) )
            // InternalOCCI.g:1983:1: ( ( rule__Kind__Group_8__0 )? )
            {
            // InternalOCCI.g:1983:1: ( ( rule__Kind__Group_8__0 )? )
            // InternalOCCI.g:1984:2: ( rule__Kind__Group_8__0 )?
            {
             before(grammarAccess.getKindAccess().getGroup_8()); 
            // InternalOCCI.g:1985:2: ( rule__Kind__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==67) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOCCI.g:1985:3: rule__Kind__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__8__Impl"


    // $ANTLR start "rule__Kind__Group__9"
    // InternalOCCI.g:1993:1: rule__Kind__Group__9 : rule__Kind__Group__9__Impl rule__Kind__Group__10 ;
    public final void rule__Kind__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1997:1: ( rule__Kind__Group__9__Impl rule__Kind__Group__10 )
            // InternalOCCI.g:1998:2: rule__Kind__Group__9__Impl rule__Kind__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Kind__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__9"


    // $ANTLR start "rule__Kind__Group__9__Impl"
    // InternalOCCI.g:2005:1: rule__Kind__Group__9__Impl : ( ( rule__Kind__FsmAssignment_9 )? ) ;
    public final void rule__Kind__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2009:1: ( ( ( rule__Kind__FsmAssignment_9 )? ) )
            // InternalOCCI.g:2010:1: ( ( rule__Kind__FsmAssignment_9 )? )
            {
            // InternalOCCI.g:2010:1: ( ( rule__Kind__FsmAssignment_9 )? )
            // InternalOCCI.g:2011:2: ( rule__Kind__FsmAssignment_9 )?
            {
             before(grammarAccess.getKindAccess().getFsmAssignment_9()); 
            // InternalOCCI.g:2012:2: ( rule__Kind__FsmAssignment_9 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==73) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOCCI.g:2012:3: rule__Kind__FsmAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__FsmAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getFsmAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__9__Impl"


    // $ANTLR start "rule__Kind__Group__10"
    // InternalOCCI.g:2020:1: rule__Kind__Group__10 : rule__Kind__Group__10__Impl ;
    public final void rule__Kind__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2024:1: ( rule__Kind__Group__10__Impl )
            // InternalOCCI.g:2025:2: rule__Kind__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__10"


    // $ANTLR start "rule__Kind__Group__10__Impl"
    // InternalOCCI.g:2031:1: rule__Kind__Group__10__Impl : ( ( rule__Kind__Group_10__0 )? ) ;
    public final void rule__Kind__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2035:1: ( ( ( rule__Kind__Group_10__0 )? ) )
            // InternalOCCI.g:2036:1: ( ( rule__Kind__Group_10__0 )? )
            {
            // InternalOCCI.g:2036:1: ( ( rule__Kind__Group_10__0 )? )
            // InternalOCCI.g:2037:2: ( rule__Kind__Group_10__0 )?
            {
             before(grammarAccess.getKindAccess().getGroup_10()); 
            // InternalOCCI.g:2038:2: ( rule__Kind__Group_10__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOCCI.g:2038:3: rule__Kind__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__10__Impl"


    // $ANTLR start "rule__Kind__Group_2__0"
    // InternalOCCI.g:2047:1: rule__Kind__Group_2__0 : rule__Kind__Group_2__0__Impl rule__Kind__Group_2__1 ;
    public final void rule__Kind__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2051:1: ( rule__Kind__Group_2__0__Impl rule__Kind__Group_2__1 )
            // InternalOCCI.g:2052:2: rule__Kind__Group_2__0__Impl rule__Kind__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Kind__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_2__0"


    // $ANTLR start "rule__Kind__Group_2__0__Impl"
    // InternalOCCI.g:2059:1: rule__Kind__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Kind__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2063:1: ( ( 'extends' ) )
            // InternalOCCI.g:2064:1: ( 'extends' )
            {
            // InternalOCCI.g:2064:1: ( 'extends' )
            // InternalOCCI.g:2065:2: 'extends'
            {
             before(grammarAccess.getKindAccess().getExtendsKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_2__0__Impl"


    // $ANTLR start "rule__Kind__Group_2__1"
    // InternalOCCI.g:2074:1: rule__Kind__Group_2__1 : rule__Kind__Group_2__1__Impl ;
    public final void rule__Kind__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2078:1: ( rule__Kind__Group_2__1__Impl )
            // InternalOCCI.g:2079:2: rule__Kind__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_2__1"


    // $ANTLR start "rule__Kind__Group_2__1__Impl"
    // InternalOCCI.g:2085:1: rule__Kind__Group_2__1__Impl : ( ( rule__Kind__ParentAssignment_2_1 ) ) ;
    public final void rule__Kind__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2089:1: ( ( ( rule__Kind__ParentAssignment_2_1 ) ) )
            // InternalOCCI.g:2090:1: ( ( rule__Kind__ParentAssignment_2_1 ) )
            {
            // InternalOCCI.g:2090:1: ( ( rule__Kind__ParentAssignment_2_1 ) )
            // InternalOCCI.g:2091:2: ( rule__Kind__ParentAssignment_2_1 )
            {
             before(grammarAccess.getKindAccess().getParentAssignment_2_1()); 
            // InternalOCCI.g:2092:2: ( rule__Kind__ParentAssignment_2_1 )
            // InternalOCCI.g:2092:3: rule__Kind__ParentAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Kind__ParentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getParentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_2__1__Impl"


    // $ANTLR start "rule__Kind__Group_3__0"
    // InternalOCCI.g:2101:1: rule__Kind__Group_3__0 : rule__Kind__Group_3__0__Impl rule__Kind__Group_3__1 ;
    public final void rule__Kind__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2105:1: ( rule__Kind__Group_3__0__Impl rule__Kind__Group_3__1 )
            // InternalOCCI.g:2106:2: rule__Kind__Group_3__0__Impl rule__Kind__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Kind__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_3__0"


    // $ANTLR start "rule__Kind__Group_3__0__Impl"
    // InternalOCCI.g:2113:1: rule__Kind__Group_3__0__Impl : ( 'source' ) ;
    public final void rule__Kind__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2117:1: ( ( 'source' ) )
            // InternalOCCI.g:2118:1: ( 'source' )
            {
            // InternalOCCI.g:2118:1: ( 'source' )
            // InternalOCCI.g:2119:2: 'source'
            {
             before(grammarAccess.getKindAccess().getSourceKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getSourceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_3__0__Impl"


    // $ANTLR start "rule__Kind__Group_3__1"
    // InternalOCCI.g:2128:1: rule__Kind__Group_3__1 : rule__Kind__Group_3__1__Impl ;
    public final void rule__Kind__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2132:1: ( rule__Kind__Group_3__1__Impl )
            // InternalOCCI.g:2133:2: rule__Kind__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_3__1"


    // $ANTLR start "rule__Kind__Group_3__1__Impl"
    // InternalOCCI.g:2139:1: rule__Kind__Group_3__1__Impl : ( ( rule__Kind__SourceAssignment_3_1 ) ) ;
    public final void rule__Kind__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2143:1: ( ( ( rule__Kind__SourceAssignment_3_1 ) ) )
            // InternalOCCI.g:2144:1: ( ( rule__Kind__SourceAssignment_3_1 ) )
            {
            // InternalOCCI.g:2144:1: ( ( rule__Kind__SourceAssignment_3_1 ) )
            // InternalOCCI.g:2145:2: ( rule__Kind__SourceAssignment_3_1 )
            {
             before(grammarAccess.getKindAccess().getSourceAssignment_3_1()); 
            // InternalOCCI.g:2146:2: ( rule__Kind__SourceAssignment_3_1 )
            // InternalOCCI.g:2146:3: rule__Kind__SourceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Kind__SourceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getSourceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_3__1__Impl"


    // $ANTLR start "rule__Kind__Group_4__0"
    // InternalOCCI.g:2155:1: rule__Kind__Group_4__0 : rule__Kind__Group_4__0__Impl rule__Kind__Group_4__1 ;
    public final void rule__Kind__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2159:1: ( rule__Kind__Group_4__0__Impl rule__Kind__Group_4__1 )
            // InternalOCCI.g:2160:2: rule__Kind__Group_4__0__Impl rule__Kind__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Kind__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_4__0"


    // $ANTLR start "rule__Kind__Group_4__0__Impl"
    // InternalOCCI.g:2167:1: rule__Kind__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__Kind__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2171:1: ( ( 'target' ) )
            // InternalOCCI.g:2172:1: ( 'target' )
            {
            // InternalOCCI.g:2172:1: ( 'target' )
            // InternalOCCI.g:2173:2: 'target'
            {
             before(grammarAccess.getKindAccess().getTargetKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getTargetKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_4__0__Impl"


    // $ANTLR start "rule__Kind__Group_4__1"
    // InternalOCCI.g:2182:1: rule__Kind__Group_4__1 : rule__Kind__Group_4__1__Impl ;
    public final void rule__Kind__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2186:1: ( rule__Kind__Group_4__1__Impl )
            // InternalOCCI.g:2187:2: rule__Kind__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_4__1"


    // $ANTLR start "rule__Kind__Group_4__1__Impl"
    // InternalOCCI.g:2193:1: rule__Kind__Group_4__1__Impl : ( ( rule__Kind__TargetAssignment_4_1 ) ) ;
    public final void rule__Kind__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2197:1: ( ( ( rule__Kind__TargetAssignment_4_1 ) ) )
            // InternalOCCI.g:2198:1: ( ( rule__Kind__TargetAssignment_4_1 ) )
            {
            // InternalOCCI.g:2198:1: ( ( rule__Kind__TargetAssignment_4_1 ) )
            // InternalOCCI.g:2199:2: ( rule__Kind__TargetAssignment_4_1 )
            {
             before(grammarAccess.getKindAccess().getTargetAssignment_4_1()); 
            // InternalOCCI.g:2200:2: ( rule__Kind__TargetAssignment_4_1 )
            // InternalOCCI.g:2200:3: rule__Kind__TargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Kind__TargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getTargetAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_4__1__Impl"


    // $ANTLR start "rule__Kind__Group_5__0"
    // InternalOCCI.g:2209:1: rule__Kind__Group_5__0 : rule__Kind__Group_5__0__Impl rule__Kind__Group_5__1 ;
    public final void rule__Kind__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2213:1: ( rule__Kind__Group_5__0__Impl rule__Kind__Group_5__1 )
            // InternalOCCI.g:2214:2: rule__Kind__Group_5__0__Impl rule__Kind__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Kind__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__0"


    // $ANTLR start "rule__Kind__Group_5__0__Impl"
    // InternalOCCI.g:2221:1: rule__Kind__Group_5__0__Impl : ( 'title' ) ;
    public final void rule__Kind__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2225:1: ( ( 'title' ) )
            // InternalOCCI.g:2226:1: ( 'title' )
            {
            // InternalOCCI.g:2226:1: ( 'title' )
            // InternalOCCI.g:2227:2: 'title'
            {
             before(grammarAccess.getKindAccess().getTitleKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getTitleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__0__Impl"


    // $ANTLR start "rule__Kind__Group_5__1"
    // InternalOCCI.g:2236:1: rule__Kind__Group_5__1 : rule__Kind__Group_5__1__Impl ;
    public final void rule__Kind__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2240:1: ( rule__Kind__Group_5__1__Impl )
            // InternalOCCI.g:2241:2: rule__Kind__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__1"


    // $ANTLR start "rule__Kind__Group_5__1__Impl"
    // InternalOCCI.g:2247:1: rule__Kind__Group_5__1__Impl : ( ( rule__Kind__TitleAssignment_5_1 ) ) ;
    public final void rule__Kind__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2251:1: ( ( ( rule__Kind__TitleAssignment_5_1 ) ) )
            // InternalOCCI.g:2252:1: ( ( rule__Kind__TitleAssignment_5_1 ) )
            {
            // InternalOCCI.g:2252:1: ( ( rule__Kind__TitleAssignment_5_1 ) )
            // InternalOCCI.g:2253:2: ( rule__Kind__TitleAssignment_5_1 )
            {
             before(grammarAccess.getKindAccess().getTitleAssignment_5_1()); 
            // InternalOCCI.g:2254:2: ( rule__Kind__TitleAssignment_5_1 )
            // InternalOCCI.g:2254:3: rule__Kind__TitleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Kind__TitleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getTitleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__1__Impl"


    // $ANTLR start "rule__Kind__Group_8__0"
    // InternalOCCI.g:2263:1: rule__Kind__Group_8__0 : rule__Kind__Group_8__0__Impl rule__Kind__Group_8__1 ;
    public final void rule__Kind__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2267:1: ( rule__Kind__Group_8__0__Impl rule__Kind__Group_8__1 )
            // InternalOCCI.g:2268:2: rule__Kind__Group_8__0__Impl rule__Kind__Group_8__1
            {
            pushFollow(FOLLOW_14);
            rule__Kind__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__0"


    // $ANTLR start "rule__Kind__Group_8__0__Impl"
    // InternalOCCI.g:2275:1: rule__Kind__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Kind__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2279:1: ( ( '(' ) )
            // InternalOCCI.g:2280:1: ( '(' )
            {
            // InternalOCCI.g:2280:1: ( '(' )
            // InternalOCCI.g:2281:2: '('
            {
             before(grammarAccess.getKindAccess().getLeftParenthesisKeyword_8_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getLeftParenthesisKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__0__Impl"


    // $ANTLR start "rule__Kind__Group_8__1"
    // InternalOCCI.g:2290:1: rule__Kind__Group_8__1 : rule__Kind__Group_8__1__Impl rule__Kind__Group_8__2 ;
    public final void rule__Kind__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2294:1: ( rule__Kind__Group_8__1__Impl rule__Kind__Group_8__2 )
            // InternalOCCI.g:2295:2: rule__Kind__Group_8__1__Impl rule__Kind__Group_8__2
            {
            pushFollow(FOLLOW_15);
            rule__Kind__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__1"


    // $ANTLR start "rule__Kind__Group_8__1__Impl"
    // InternalOCCI.g:2302:1: rule__Kind__Group_8__1__Impl : ( ( ( rule__Kind__Alternatives_8_1 ) ) ( ( rule__Kind__Alternatives_8_1 )* ) ) ;
    public final void rule__Kind__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2306:1: ( ( ( ( rule__Kind__Alternatives_8_1 ) ) ( ( rule__Kind__Alternatives_8_1 )* ) ) )
            // InternalOCCI.g:2307:1: ( ( ( rule__Kind__Alternatives_8_1 ) ) ( ( rule__Kind__Alternatives_8_1 )* ) )
            {
            // InternalOCCI.g:2307:1: ( ( ( rule__Kind__Alternatives_8_1 ) ) ( ( rule__Kind__Alternatives_8_1 )* ) )
            // InternalOCCI.g:2308:2: ( ( rule__Kind__Alternatives_8_1 ) ) ( ( rule__Kind__Alternatives_8_1 )* )
            {
            // InternalOCCI.g:2308:2: ( ( rule__Kind__Alternatives_8_1 ) )
            // InternalOCCI.g:2309:3: ( rule__Kind__Alternatives_8_1 )
            {
             before(grammarAccess.getKindAccess().getAlternatives_8_1()); 
            // InternalOCCI.g:2310:3: ( rule__Kind__Alternatives_8_1 )
            // InternalOCCI.g:2310:4: rule__Kind__Alternatives_8_1
            {
            pushFollow(FOLLOW_16);
            rule__Kind__Alternatives_8_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getAlternatives_8_1()); 

            }

            // InternalOCCI.g:2313:2: ( ( rule__Kind__Alternatives_8_1 )* )
            // InternalOCCI.g:2314:3: ( rule__Kind__Alternatives_8_1 )*
            {
             before(grammarAccess.getKindAccess().getAlternatives_8_1()); 
            // InternalOCCI.g:2315:3: ( rule__Kind__Alternatives_8_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30||(LA22_0>=34 && LA22_0<=35)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOCCI.g:2315:4: rule__Kind__Alternatives_8_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Kind__Alternatives_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getKindAccess().getAlternatives_8_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__1__Impl"


    // $ANTLR start "rule__Kind__Group_8__2"
    // InternalOCCI.g:2324:1: rule__Kind__Group_8__2 : rule__Kind__Group_8__2__Impl ;
    public final void rule__Kind__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2328:1: ( rule__Kind__Group_8__2__Impl )
            // InternalOCCI.g:2329:2: rule__Kind__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__2"


    // $ANTLR start "rule__Kind__Group_8__2__Impl"
    // InternalOCCI.g:2335:1: rule__Kind__Group_8__2__Impl : ( ')' ) ;
    public final void rule__Kind__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2339:1: ( ( ')' ) )
            // InternalOCCI.g:2340:1: ( ')' )
            {
            // InternalOCCI.g:2340:1: ( ')' )
            // InternalOCCI.g:2341:2: ')'
            {
             before(grammarAccess.getKindAccess().getRightParenthesisKeyword_8_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getRightParenthesisKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_8__2__Impl"


    // $ANTLR start "rule__Kind__Group_10__0"
    // InternalOCCI.g:2351:1: rule__Kind__Group_10__0 : rule__Kind__Group_10__0__Impl rule__Kind__Group_10__1 ;
    public final void rule__Kind__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2355:1: ( rule__Kind__Group_10__0__Impl rule__Kind__Group_10__1 )
            // InternalOCCI.g:2356:2: rule__Kind__Group_10__0__Impl rule__Kind__Group_10__1
            {
            pushFollow(FOLLOW_17);
            rule__Kind__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10__0"


    // $ANTLR start "rule__Kind__Group_10__0__Impl"
    // InternalOCCI.g:2363:1: rule__Kind__Group_10__0__Impl : ( 'annotations' ) ;
    public final void rule__Kind__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2367:1: ( ( 'annotations' ) )
            // InternalOCCI.g:2368:1: ( 'annotations' )
            {
            // InternalOCCI.g:2368:1: ( 'annotations' )
            // InternalOCCI.g:2369:2: 'annotations'
            {
             before(grammarAccess.getKindAccess().getAnnotationsKeyword_10_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getAnnotationsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10__0__Impl"


    // $ANTLR start "rule__Kind__Group_10__1"
    // InternalOCCI.g:2378:1: rule__Kind__Group_10__1 : rule__Kind__Group_10__1__Impl rule__Kind__Group_10__2 ;
    public final void rule__Kind__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2382:1: ( rule__Kind__Group_10__1__Impl rule__Kind__Group_10__2 )
            // InternalOCCI.g:2383:2: rule__Kind__Group_10__1__Impl rule__Kind__Group_10__2
            {
            pushFollow(FOLLOW_18);
            rule__Kind__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10__1"


    // $ANTLR start "rule__Kind__Group_10__1__Impl"
    // InternalOCCI.g:2390:1: rule__Kind__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Kind__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2394:1: ( ( '{' ) )
            // InternalOCCI.g:2395:1: ( '{' )
            {
            // InternalOCCI.g:2395:1: ( '{' )
            // InternalOCCI.g:2396:2: '{'
            {
             before(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10__1__Impl"


    // $ANTLR start "rule__Kind__Group_10__2"
    // InternalOCCI.g:2405:1: rule__Kind__Group_10__2 : rule__Kind__Group_10__2__Impl rule__Kind__Group_10__3 ;
    public final void rule__Kind__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2409:1: ( rule__Kind__Group_10__2__Impl rule__Kind__Group_10__3 )
            // InternalOCCI.g:2410:2: rule__Kind__Group_10__2__Impl rule__Kind__Group_10__3
            {
            pushFollow(FOLLOW_19);
            rule__Kind__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10__2"


    // $ANTLR start "rule__Kind__Group_10__2__Impl"
    // InternalOCCI.g:2417:1: rule__Kind__Group_10__2__Impl : ( ( rule__Kind__AnnotationsAssignment_10_2 ) ) ;
    public final void rule__Kind__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2421:1: ( ( ( rule__Kind__AnnotationsAssignment_10_2 ) ) )
            // InternalOCCI.g:2422:1: ( ( rule__Kind__AnnotationsAssignment_10_2 ) )
            {
            // InternalOCCI.g:2422:1: ( ( rule__Kind__AnnotationsAssignment_10_2 ) )
            // InternalOCCI.g:2423:2: ( rule__Kind__AnnotationsAssignment_10_2 )
            {
             before(grammarAccess.getKindAccess().getAnnotationsAssignment_10_2()); 
            // InternalOCCI.g:2424:2: ( rule__Kind__AnnotationsAssignment_10_2 )
            // InternalOCCI.g:2424:3: rule__Kind__AnnotationsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Kind__AnnotationsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getAnnotationsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10__2__Impl"


    // $ANTLR start "rule__Kind__Group_10__3"
    // InternalOCCI.g:2432:1: rule__Kind__Group_10__3 : rule__Kind__Group_10__3__Impl rule__Kind__Group_10__4 ;
    public final void rule__Kind__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2436:1: ( rule__Kind__Group_10__3__Impl rule__Kind__Group_10__4 )
            // InternalOCCI.g:2437:2: rule__Kind__Group_10__3__Impl rule__Kind__Group_10__4
            {
            pushFollow(FOLLOW_19);
            rule__Kind__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10__3"


    // $ANTLR start "rule__Kind__Group_10__3__Impl"
    // InternalOCCI.g:2444:1: rule__Kind__Group_10__3__Impl : ( ( rule__Kind__Group_10_3__0 )* ) ;
    public final void rule__Kind__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2448:1: ( ( ( rule__Kind__Group_10_3__0 )* ) )
            // InternalOCCI.g:2449:1: ( ( rule__Kind__Group_10_3__0 )* )
            {
            // InternalOCCI.g:2449:1: ( ( rule__Kind__Group_10_3__0 )* )
            // InternalOCCI.g:2450:2: ( rule__Kind__Group_10_3__0 )*
            {
             before(grammarAccess.getKindAccess().getGroup_10_3()); 
            // InternalOCCI.g:2451:2: ( rule__Kind__Group_10_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==71) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOCCI.g:2451:3: rule__Kind__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Kind__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getKindAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10__3__Impl"


    // $ANTLR start "rule__Kind__Group_10__4"
    // InternalOCCI.g:2459:1: rule__Kind__Group_10__4 : rule__Kind__Group_10__4__Impl ;
    public final void rule__Kind__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2463:1: ( rule__Kind__Group_10__4__Impl )
            // InternalOCCI.g:2464:2: rule__Kind__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10__4"


    // $ANTLR start "rule__Kind__Group_10__4__Impl"
    // InternalOCCI.g:2470:1: rule__Kind__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Kind__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2474:1: ( ( '}' ) )
            // InternalOCCI.g:2475:1: ( '}' )
            {
            // InternalOCCI.g:2475:1: ( '}' )
            // InternalOCCI.g:2476:2: '}'
            {
             before(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10__4__Impl"


    // $ANTLR start "rule__Kind__Group_10_3__0"
    // InternalOCCI.g:2486:1: rule__Kind__Group_10_3__0 : rule__Kind__Group_10_3__0__Impl rule__Kind__Group_10_3__1 ;
    public final void rule__Kind__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2490:1: ( rule__Kind__Group_10_3__0__Impl rule__Kind__Group_10_3__1 )
            // InternalOCCI.g:2491:2: rule__Kind__Group_10_3__0__Impl rule__Kind__Group_10_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Kind__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10_3__0"


    // $ANTLR start "rule__Kind__Group_10_3__0__Impl"
    // InternalOCCI.g:2498:1: rule__Kind__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Kind__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2502:1: ( ( ',' ) )
            // InternalOCCI.g:2503:1: ( ',' )
            {
            // InternalOCCI.g:2503:1: ( ',' )
            // InternalOCCI.g:2504:2: ','
            {
             before(grammarAccess.getKindAccess().getCommaKeyword_10_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10_3__0__Impl"


    // $ANTLR start "rule__Kind__Group_10_3__1"
    // InternalOCCI.g:2513:1: rule__Kind__Group_10_3__1 : rule__Kind__Group_10_3__1__Impl ;
    public final void rule__Kind__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2517:1: ( rule__Kind__Group_10_3__1__Impl )
            // InternalOCCI.g:2518:2: rule__Kind__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10_3__1"


    // $ANTLR start "rule__Kind__Group_10_3__1__Impl"
    // InternalOCCI.g:2524:1: rule__Kind__Group_10_3__1__Impl : ( ( rule__Kind__AnnotationsAssignment_10_3_1 ) ) ;
    public final void rule__Kind__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2528:1: ( ( ( rule__Kind__AnnotationsAssignment_10_3_1 ) ) )
            // InternalOCCI.g:2529:1: ( ( rule__Kind__AnnotationsAssignment_10_3_1 ) )
            {
            // InternalOCCI.g:2529:1: ( ( rule__Kind__AnnotationsAssignment_10_3_1 ) )
            // InternalOCCI.g:2530:2: ( rule__Kind__AnnotationsAssignment_10_3_1 )
            {
             before(grammarAccess.getKindAccess().getAnnotationsAssignment_10_3_1()); 
            // InternalOCCI.g:2531:2: ( rule__Kind__AnnotationsAssignment_10_3_1 )
            // InternalOCCI.g:2531:3: rule__Kind__AnnotationsAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Kind__AnnotationsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getAnnotationsAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_10_3__1__Impl"


    // $ANTLR start "rule__Mixin__Group__0"
    // InternalOCCI.g:2540:1: rule__Mixin__Group__0 : rule__Mixin__Group__0__Impl rule__Mixin__Group__1 ;
    public final void rule__Mixin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2544:1: ( rule__Mixin__Group__0__Impl rule__Mixin__Group__1 )
            // InternalOCCI.g:2545:2: rule__Mixin__Group__0__Impl rule__Mixin__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Mixin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__0"


    // $ANTLR start "rule__Mixin__Group__0__Impl"
    // InternalOCCI.g:2552:1: rule__Mixin__Group__0__Impl : ( 'mixin' ) ;
    public final void rule__Mixin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2556:1: ( ( 'mixin' ) )
            // InternalOCCI.g:2557:1: ( 'mixin' )
            {
            // InternalOCCI.g:2557:1: ( 'mixin' )
            // InternalOCCI.g:2558:2: 'mixin'
            {
             before(grammarAccess.getMixinAccess().getMixinKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getMixinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__0__Impl"


    // $ANTLR start "rule__Mixin__Group__1"
    // InternalOCCI.g:2567:1: rule__Mixin__Group__1 : rule__Mixin__Group__1__Impl rule__Mixin__Group__2 ;
    public final void rule__Mixin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2571:1: ( rule__Mixin__Group__1__Impl rule__Mixin__Group__2 )
            // InternalOCCI.g:2572:2: rule__Mixin__Group__1__Impl rule__Mixin__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Mixin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__1"


    // $ANTLR start "rule__Mixin__Group__1__Impl"
    // InternalOCCI.g:2579:1: rule__Mixin__Group__1__Impl : ( ( rule__Mixin__NameAssignment_1 ) ) ;
    public final void rule__Mixin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2583:1: ( ( ( rule__Mixin__NameAssignment_1 ) ) )
            // InternalOCCI.g:2584:1: ( ( rule__Mixin__NameAssignment_1 ) )
            {
            // InternalOCCI.g:2584:1: ( ( rule__Mixin__NameAssignment_1 ) )
            // InternalOCCI.g:2585:2: ( rule__Mixin__NameAssignment_1 )
            {
             before(grammarAccess.getMixinAccess().getNameAssignment_1()); 
            // InternalOCCI.g:2586:2: ( rule__Mixin__NameAssignment_1 )
            // InternalOCCI.g:2586:3: rule__Mixin__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__1__Impl"


    // $ANTLR start "rule__Mixin__Group__2"
    // InternalOCCI.g:2594:1: rule__Mixin__Group__2 : rule__Mixin__Group__2__Impl rule__Mixin__Group__3 ;
    public final void rule__Mixin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2598:1: ( rule__Mixin__Group__2__Impl rule__Mixin__Group__3 )
            // InternalOCCI.g:2599:2: rule__Mixin__Group__2__Impl rule__Mixin__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Mixin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__2"


    // $ANTLR start "rule__Mixin__Group__2__Impl"
    // InternalOCCI.g:2606:1: rule__Mixin__Group__2__Impl : ( ( rule__Mixin__Group_2__0 )? ) ;
    public final void rule__Mixin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2610:1: ( ( ( rule__Mixin__Group_2__0 )? ) )
            // InternalOCCI.g:2611:1: ( ( rule__Mixin__Group_2__0 )? )
            {
            // InternalOCCI.g:2611:1: ( ( rule__Mixin__Group_2__0 )? )
            // InternalOCCI.g:2612:2: ( rule__Mixin__Group_2__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_2()); 
            // InternalOCCI.g:2613:2: ( rule__Mixin__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOCCI.g:2613:3: rule__Mixin__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMixinAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__2__Impl"


    // $ANTLR start "rule__Mixin__Group__3"
    // InternalOCCI.g:2621:1: rule__Mixin__Group__3 : rule__Mixin__Group__3__Impl rule__Mixin__Group__4 ;
    public final void rule__Mixin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2625:1: ( rule__Mixin__Group__3__Impl rule__Mixin__Group__4 )
            // InternalOCCI.g:2626:2: rule__Mixin__Group__3__Impl rule__Mixin__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Mixin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__3"


    // $ANTLR start "rule__Mixin__Group__3__Impl"
    // InternalOCCI.g:2633:1: rule__Mixin__Group__3__Impl : ( ( rule__Mixin__Group_3__0 )? ) ;
    public final void rule__Mixin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2637:1: ( ( ( rule__Mixin__Group_3__0 )? ) )
            // InternalOCCI.g:2638:1: ( ( rule__Mixin__Group_3__0 )? )
            {
            // InternalOCCI.g:2638:1: ( ( rule__Mixin__Group_3__0 )? )
            // InternalOCCI.g:2639:2: ( rule__Mixin__Group_3__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_3()); 
            // InternalOCCI.g:2640:2: ( rule__Mixin__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOCCI.g:2640:3: rule__Mixin__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMixinAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__3__Impl"


    // $ANTLR start "rule__Mixin__Group__4"
    // InternalOCCI.g:2648:1: rule__Mixin__Group__4 : rule__Mixin__Group__4__Impl rule__Mixin__Group__5 ;
    public final void rule__Mixin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2652:1: ( rule__Mixin__Group__4__Impl rule__Mixin__Group__5 )
            // InternalOCCI.g:2653:2: rule__Mixin__Group__4__Impl rule__Mixin__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Mixin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__4"


    // $ANTLR start "rule__Mixin__Group__4__Impl"
    // InternalOCCI.g:2660:1: rule__Mixin__Group__4__Impl : ( 'scheme' ) ;
    public final void rule__Mixin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2664:1: ( ( 'scheme' ) )
            // InternalOCCI.g:2665:1: ( 'scheme' )
            {
            // InternalOCCI.g:2665:1: ( 'scheme' )
            // InternalOCCI.g:2666:2: 'scheme'
            {
             before(grammarAccess.getMixinAccess().getSchemeKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getSchemeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__4__Impl"


    // $ANTLR start "rule__Mixin__Group__5"
    // InternalOCCI.g:2675:1: rule__Mixin__Group__5 : rule__Mixin__Group__5__Impl rule__Mixin__Group__6 ;
    public final void rule__Mixin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2679:1: ( rule__Mixin__Group__5__Impl rule__Mixin__Group__6 )
            // InternalOCCI.g:2680:2: rule__Mixin__Group__5__Impl rule__Mixin__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Mixin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__5"


    // $ANTLR start "rule__Mixin__Group__5__Impl"
    // InternalOCCI.g:2687:1: rule__Mixin__Group__5__Impl : ( ( rule__Mixin__SchemeAssignment_5 ) ) ;
    public final void rule__Mixin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2691:1: ( ( ( rule__Mixin__SchemeAssignment_5 ) ) )
            // InternalOCCI.g:2692:1: ( ( rule__Mixin__SchemeAssignment_5 ) )
            {
            // InternalOCCI.g:2692:1: ( ( rule__Mixin__SchemeAssignment_5 ) )
            // InternalOCCI.g:2693:2: ( rule__Mixin__SchemeAssignment_5 )
            {
             before(grammarAccess.getMixinAccess().getSchemeAssignment_5()); 
            // InternalOCCI.g:2694:2: ( rule__Mixin__SchemeAssignment_5 )
            // InternalOCCI.g:2694:3: rule__Mixin__SchemeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__SchemeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getSchemeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__5__Impl"


    // $ANTLR start "rule__Mixin__Group__6"
    // InternalOCCI.g:2702:1: rule__Mixin__Group__6 : rule__Mixin__Group__6__Impl rule__Mixin__Group__7 ;
    public final void rule__Mixin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2706:1: ( rule__Mixin__Group__6__Impl rule__Mixin__Group__7 )
            // InternalOCCI.g:2707:2: rule__Mixin__Group__6__Impl rule__Mixin__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Mixin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__6"


    // $ANTLR start "rule__Mixin__Group__6__Impl"
    // InternalOCCI.g:2714:1: rule__Mixin__Group__6__Impl : ( ( rule__Mixin__Group_6__0 )? ) ;
    public final void rule__Mixin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2718:1: ( ( ( rule__Mixin__Group_6__0 )? ) )
            // InternalOCCI.g:2719:1: ( ( rule__Mixin__Group_6__0 )? )
            {
            // InternalOCCI.g:2719:1: ( ( rule__Mixin__Group_6__0 )? )
            // InternalOCCI.g:2720:2: ( rule__Mixin__Group_6__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_6()); 
            // InternalOCCI.g:2721:2: ( rule__Mixin__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOCCI.g:2721:3: rule__Mixin__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMixinAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__6__Impl"


    // $ANTLR start "rule__Mixin__Group__7"
    // InternalOCCI.g:2729:1: rule__Mixin__Group__7 : rule__Mixin__Group__7__Impl rule__Mixin__Group__8 ;
    public final void rule__Mixin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2733:1: ( rule__Mixin__Group__7__Impl rule__Mixin__Group__8 )
            // InternalOCCI.g:2734:2: rule__Mixin__Group__7__Impl rule__Mixin__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Mixin__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__7"


    // $ANTLR start "rule__Mixin__Group__7__Impl"
    // InternalOCCI.g:2741:1: rule__Mixin__Group__7__Impl : ( ( rule__Mixin__Group_7__0 )? ) ;
    public final void rule__Mixin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2745:1: ( ( ( rule__Mixin__Group_7__0 )? ) )
            // InternalOCCI.g:2746:1: ( ( rule__Mixin__Group_7__0 )? )
            {
            // InternalOCCI.g:2746:1: ( ( rule__Mixin__Group_7__0 )? )
            // InternalOCCI.g:2747:2: ( rule__Mixin__Group_7__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_7()); 
            // InternalOCCI.g:2748:2: ( rule__Mixin__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==67) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOCCI.g:2748:3: rule__Mixin__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMixinAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__7__Impl"


    // $ANTLR start "rule__Mixin__Group__8"
    // InternalOCCI.g:2756:1: rule__Mixin__Group__8 : rule__Mixin__Group__8__Impl ;
    public final void rule__Mixin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2760:1: ( rule__Mixin__Group__8__Impl )
            // InternalOCCI.g:2761:2: rule__Mixin__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__8"


    // $ANTLR start "rule__Mixin__Group__8__Impl"
    // InternalOCCI.g:2767:1: rule__Mixin__Group__8__Impl : ( ( rule__Mixin__Group_8__0 )? ) ;
    public final void rule__Mixin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2771:1: ( ( ( rule__Mixin__Group_8__0 )? ) )
            // InternalOCCI.g:2772:1: ( ( rule__Mixin__Group_8__0 )? )
            {
            // InternalOCCI.g:2772:1: ( ( rule__Mixin__Group_8__0 )? )
            // InternalOCCI.g:2773:2: ( rule__Mixin__Group_8__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_8()); 
            // InternalOCCI.g:2774:2: ( rule__Mixin__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOCCI.g:2774:3: rule__Mixin__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMixinAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__8__Impl"


    // $ANTLR start "rule__Mixin__Group_2__0"
    // InternalOCCI.g:2783:1: rule__Mixin__Group_2__0 : rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1 ;
    public final void rule__Mixin__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2787:1: ( rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1 )
            // InternalOCCI.g:2788:2: rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Mixin__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__0"


    // $ANTLR start "rule__Mixin__Group_2__0__Impl"
    // InternalOCCI.g:2795:1: rule__Mixin__Group_2__0__Impl : ( 'depends' ) ;
    public final void rule__Mixin__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2799:1: ( ( 'depends' ) )
            // InternalOCCI.g:2800:1: ( 'depends' )
            {
            // InternalOCCI.g:2800:1: ( 'depends' )
            // InternalOCCI.g:2801:2: 'depends'
            {
             before(grammarAccess.getMixinAccess().getDependsKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getDependsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__0__Impl"


    // $ANTLR start "rule__Mixin__Group_2__1"
    // InternalOCCI.g:2810:1: rule__Mixin__Group_2__1 : rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2 ;
    public final void rule__Mixin__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2814:1: ( rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2 )
            // InternalOCCI.g:2815:2: rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__Mixin__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__1"


    // $ANTLR start "rule__Mixin__Group_2__1__Impl"
    // InternalOCCI.g:2822:1: rule__Mixin__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Mixin__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2826:1: ( ( '(' ) )
            // InternalOCCI.g:2827:1: ( '(' )
            {
            // InternalOCCI.g:2827:1: ( '(' )
            // InternalOCCI.g:2828:2: '('
            {
             before(grammarAccess.getMixinAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__1__Impl"


    // $ANTLR start "rule__Mixin__Group_2__2"
    // InternalOCCI.g:2837:1: rule__Mixin__Group_2__2 : rule__Mixin__Group_2__2__Impl rule__Mixin__Group_2__3 ;
    public final void rule__Mixin__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2841:1: ( rule__Mixin__Group_2__2__Impl rule__Mixin__Group_2__3 )
            // InternalOCCI.g:2842:2: rule__Mixin__Group_2__2__Impl rule__Mixin__Group_2__3
            {
            pushFollow(FOLLOW_23);
            rule__Mixin__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__2"


    // $ANTLR start "rule__Mixin__Group_2__2__Impl"
    // InternalOCCI.g:2849:1: rule__Mixin__Group_2__2__Impl : ( ( rule__Mixin__DependsAssignment_2_2 ) ) ;
    public final void rule__Mixin__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2853:1: ( ( ( rule__Mixin__DependsAssignment_2_2 ) ) )
            // InternalOCCI.g:2854:1: ( ( rule__Mixin__DependsAssignment_2_2 ) )
            {
            // InternalOCCI.g:2854:1: ( ( rule__Mixin__DependsAssignment_2_2 ) )
            // InternalOCCI.g:2855:2: ( rule__Mixin__DependsAssignment_2_2 )
            {
             before(grammarAccess.getMixinAccess().getDependsAssignment_2_2()); 
            // InternalOCCI.g:2856:2: ( rule__Mixin__DependsAssignment_2_2 )
            // InternalOCCI.g:2856:3: rule__Mixin__DependsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__DependsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getDependsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__2__Impl"


    // $ANTLR start "rule__Mixin__Group_2__3"
    // InternalOCCI.g:2864:1: rule__Mixin__Group_2__3 : rule__Mixin__Group_2__3__Impl rule__Mixin__Group_2__4 ;
    public final void rule__Mixin__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2868:1: ( rule__Mixin__Group_2__3__Impl rule__Mixin__Group_2__4 )
            // InternalOCCI.g:2869:2: rule__Mixin__Group_2__3__Impl rule__Mixin__Group_2__4
            {
            pushFollow(FOLLOW_23);
            rule__Mixin__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__3"


    // $ANTLR start "rule__Mixin__Group_2__3__Impl"
    // InternalOCCI.g:2876:1: rule__Mixin__Group_2__3__Impl : ( ( rule__Mixin__Group_2_3__0 )* ) ;
    public final void rule__Mixin__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2880:1: ( ( ( rule__Mixin__Group_2_3__0 )* ) )
            // InternalOCCI.g:2881:1: ( ( rule__Mixin__Group_2_3__0 )* )
            {
            // InternalOCCI.g:2881:1: ( ( rule__Mixin__Group_2_3__0 )* )
            // InternalOCCI.g:2882:2: ( rule__Mixin__Group_2_3__0 )*
            {
             before(grammarAccess.getMixinAccess().getGroup_2_3()); 
            // InternalOCCI.g:2883:2: ( rule__Mixin__Group_2_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==71) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOCCI.g:2883:3: rule__Mixin__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Mixin__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getMixinAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__3__Impl"


    // $ANTLR start "rule__Mixin__Group_2__4"
    // InternalOCCI.g:2891:1: rule__Mixin__Group_2__4 : rule__Mixin__Group_2__4__Impl ;
    public final void rule__Mixin__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2895:1: ( rule__Mixin__Group_2__4__Impl )
            // InternalOCCI.g:2896:2: rule__Mixin__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__4"


    // $ANTLR start "rule__Mixin__Group_2__4__Impl"
    // InternalOCCI.g:2902:1: rule__Mixin__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Mixin__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2906:1: ( ( ')' ) )
            // InternalOCCI.g:2907:1: ( ')' )
            {
            // InternalOCCI.g:2907:1: ( ')' )
            // InternalOCCI.g:2908:2: ')'
            {
             before(grammarAccess.getMixinAccess().getRightParenthesisKeyword_2_4()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2__4__Impl"


    // $ANTLR start "rule__Mixin__Group_2_3__0"
    // InternalOCCI.g:2918:1: rule__Mixin__Group_2_3__0 : rule__Mixin__Group_2_3__0__Impl rule__Mixin__Group_2_3__1 ;
    public final void rule__Mixin__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2922:1: ( rule__Mixin__Group_2_3__0__Impl rule__Mixin__Group_2_3__1 )
            // InternalOCCI.g:2923:2: rule__Mixin__Group_2_3__0__Impl rule__Mixin__Group_2_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Mixin__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2_3__0"


    // $ANTLR start "rule__Mixin__Group_2_3__0__Impl"
    // InternalOCCI.g:2930:1: rule__Mixin__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Mixin__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2934:1: ( ( ',' ) )
            // InternalOCCI.g:2935:1: ( ',' )
            {
            // InternalOCCI.g:2935:1: ( ',' )
            // InternalOCCI.g:2936:2: ','
            {
             before(grammarAccess.getMixinAccess().getCommaKeyword_2_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2_3__0__Impl"


    // $ANTLR start "rule__Mixin__Group_2_3__1"
    // InternalOCCI.g:2945:1: rule__Mixin__Group_2_3__1 : rule__Mixin__Group_2_3__1__Impl ;
    public final void rule__Mixin__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2949:1: ( rule__Mixin__Group_2_3__1__Impl )
            // InternalOCCI.g:2950:2: rule__Mixin__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2_3__1"


    // $ANTLR start "rule__Mixin__Group_2_3__1__Impl"
    // InternalOCCI.g:2956:1: rule__Mixin__Group_2_3__1__Impl : ( ( rule__Mixin__DependsAssignment_2_3_1 ) ) ;
    public final void rule__Mixin__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2960:1: ( ( ( rule__Mixin__DependsAssignment_2_3_1 ) ) )
            // InternalOCCI.g:2961:1: ( ( rule__Mixin__DependsAssignment_2_3_1 ) )
            {
            // InternalOCCI.g:2961:1: ( ( rule__Mixin__DependsAssignment_2_3_1 ) )
            // InternalOCCI.g:2962:2: ( rule__Mixin__DependsAssignment_2_3_1 )
            {
             before(grammarAccess.getMixinAccess().getDependsAssignment_2_3_1()); 
            // InternalOCCI.g:2963:2: ( rule__Mixin__DependsAssignment_2_3_1 )
            // InternalOCCI.g:2963:3: rule__Mixin__DependsAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__DependsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getDependsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_2_3__1__Impl"


    // $ANTLR start "rule__Mixin__Group_3__0"
    // InternalOCCI.g:2972:1: rule__Mixin__Group_3__0 : rule__Mixin__Group_3__0__Impl rule__Mixin__Group_3__1 ;
    public final void rule__Mixin__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2976:1: ( rule__Mixin__Group_3__0__Impl rule__Mixin__Group_3__1 )
            // InternalOCCI.g:2977:2: rule__Mixin__Group_3__0__Impl rule__Mixin__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Mixin__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3__0"


    // $ANTLR start "rule__Mixin__Group_3__0__Impl"
    // InternalOCCI.g:2984:1: rule__Mixin__Group_3__0__Impl : ( 'applies' ) ;
    public final void rule__Mixin__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2988:1: ( ( 'applies' ) )
            // InternalOCCI.g:2989:1: ( 'applies' )
            {
            // InternalOCCI.g:2989:1: ( 'applies' )
            // InternalOCCI.g:2990:2: 'applies'
            {
             before(grammarAccess.getMixinAccess().getAppliesKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getAppliesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3__0__Impl"


    // $ANTLR start "rule__Mixin__Group_3__1"
    // InternalOCCI.g:2999:1: rule__Mixin__Group_3__1 : rule__Mixin__Group_3__1__Impl rule__Mixin__Group_3__2 ;
    public final void rule__Mixin__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3003:1: ( rule__Mixin__Group_3__1__Impl rule__Mixin__Group_3__2 )
            // InternalOCCI.g:3004:2: rule__Mixin__Group_3__1__Impl rule__Mixin__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__Mixin__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3__1"


    // $ANTLR start "rule__Mixin__Group_3__1__Impl"
    // InternalOCCI.g:3011:1: rule__Mixin__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Mixin__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3015:1: ( ( '(' ) )
            // InternalOCCI.g:3016:1: ( '(' )
            {
            // InternalOCCI.g:3016:1: ( '(' )
            // InternalOCCI.g:3017:2: '('
            {
             before(grammarAccess.getMixinAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3__1__Impl"


    // $ANTLR start "rule__Mixin__Group_3__2"
    // InternalOCCI.g:3026:1: rule__Mixin__Group_3__2 : rule__Mixin__Group_3__2__Impl rule__Mixin__Group_3__3 ;
    public final void rule__Mixin__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3030:1: ( rule__Mixin__Group_3__2__Impl rule__Mixin__Group_3__3 )
            // InternalOCCI.g:3031:2: rule__Mixin__Group_3__2__Impl rule__Mixin__Group_3__3
            {
            pushFollow(FOLLOW_23);
            rule__Mixin__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3__2"


    // $ANTLR start "rule__Mixin__Group_3__2__Impl"
    // InternalOCCI.g:3038:1: rule__Mixin__Group_3__2__Impl : ( ( rule__Mixin__AppliesAssignment_3_2 ) ) ;
    public final void rule__Mixin__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3042:1: ( ( ( rule__Mixin__AppliesAssignment_3_2 ) ) )
            // InternalOCCI.g:3043:1: ( ( rule__Mixin__AppliesAssignment_3_2 ) )
            {
            // InternalOCCI.g:3043:1: ( ( rule__Mixin__AppliesAssignment_3_2 ) )
            // InternalOCCI.g:3044:2: ( rule__Mixin__AppliesAssignment_3_2 )
            {
             before(grammarAccess.getMixinAccess().getAppliesAssignment_3_2()); 
            // InternalOCCI.g:3045:2: ( rule__Mixin__AppliesAssignment_3_2 )
            // InternalOCCI.g:3045:3: rule__Mixin__AppliesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__AppliesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAppliesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3__2__Impl"


    // $ANTLR start "rule__Mixin__Group_3__3"
    // InternalOCCI.g:3053:1: rule__Mixin__Group_3__3 : rule__Mixin__Group_3__3__Impl rule__Mixin__Group_3__4 ;
    public final void rule__Mixin__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3057:1: ( rule__Mixin__Group_3__3__Impl rule__Mixin__Group_3__4 )
            // InternalOCCI.g:3058:2: rule__Mixin__Group_3__3__Impl rule__Mixin__Group_3__4
            {
            pushFollow(FOLLOW_23);
            rule__Mixin__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3__3"


    // $ANTLR start "rule__Mixin__Group_3__3__Impl"
    // InternalOCCI.g:3065:1: rule__Mixin__Group_3__3__Impl : ( ( rule__Mixin__Group_3_3__0 )* ) ;
    public final void rule__Mixin__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3069:1: ( ( ( rule__Mixin__Group_3_3__0 )* ) )
            // InternalOCCI.g:3070:1: ( ( rule__Mixin__Group_3_3__0 )* )
            {
            // InternalOCCI.g:3070:1: ( ( rule__Mixin__Group_3_3__0 )* )
            // InternalOCCI.g:3071:2: ( rule__Mixin__Group_3_3__0 )*
            {
             before(grammarAccess.getMixinAccess().getGroup_3_3()); 
            // InternalOCCI.g:3072:2: ( rule__Mixin__Group_3_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==71) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOCCI.g:3072:3: rule__Mixin__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Mixin__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getMixinAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3__3__Impl"


    // $ANTLR start "rule__Mixin__Group_3__4"
    // InternalOCCI.g:3080:1: rule__Mixin__Group_3__4 : rule__Mixin__Group_3__4__Impl ;
    public final void rule__Mixin__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3084:1: ( rule__Mixin__Group_3__4__Impl )
            // InternalOCCI.g:3085:2: rule__Mixin__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3__4"


    // $ANTLR start "rule__Mixin__Group_3__4__Impl"
    // InternalOCCI.g:3091:1: rule__Mixin__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Mixin__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3095:1: ( ( ')' ) )
            // InternalOCCI.g:3096:1: ( ')' )
            {
            // InternalOCCI.g:3096:1: ( ')' )
            // InternalOCCI.g:3097:2: ')'
            {
             before(grammarAccess.getMixinAccess().getRightParenthesisKeyword_3_4()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3__4__Impl"


    // $ANTLR start "rule__Mixin__Group_3_3__0"
    // InternalOCCI.g:3107:1: rule__Mixin__Group_3_3__0 : rule__Mixin__Group_3_3__0__Impl rule__Mixin__Group_3_3__1 ;
    public final void rule__Mixin__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3111:1: ( rule__Mixin__Group_3_3__0__Impl rule__Mixin__Group_3_3__1 )
            // InternalOCCI.g:3112:2: rule__Mixin__Group_3_3__0__Impl rule__Mixin__Group_3_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Mixin__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3_3__0"


    // $ANTLR start "rule__Mixin__Group_3_3__0__Impl"
    // InternalOCCI.g:3119:1: rule__Mixin__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Mixin__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3123:1: ( ( ',' ) )
            // InternalOCCI.g:3124:1: ( ',' )
            {
            // InternalOCCI.g:3124:1: ( ',' )
            // InternalOCCI.g:3125:2: ','
            {
             before(grammarAccess.getMixinAccess().getCommaKeyword_3_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3_3__0__Impl"


    // $ANTLR start "rule__Mixin__Group_3_3__1"
    // InternalOCCI.g:3134:1: rule__Mixin__Group_3_3__1 : rule__Mixin__Group_3_3__1__Impl ;
    public final void rule__Mixin__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3138:1: ( rule__Mixin__Group_3_3__1__Impl )
            // InternalOCCI.g:3139:2: rule__Mixin__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3_3__1"


    // $ANTLR start "rule__Mixin__Group_3_3__1__Impl"
    // InternalOCCI.g:3145:1: rule__Mixin__Group_3_3__1__Impl : ( ( rule__Mixin__AppliesAssignment_3_3_1 ) ) ;
    public final void rule__Mixin__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3149:1: ( ( ( rule__Mixin__AppliesAssignment_3_3_1 ) ) )
            // InternalOCCI.g:3150:1: ( ( rule__Mixin__AppliesAssignment_3_3_1 ) )
            {
            // InternalOCCI.g:3150:1: ( ( rule__Mixin__AppliesAssignment_3_3_1 ) )
            // InternalOCCI.g:3151:2: ( rule__Mixin__AppliesAssignment_3_3_1 )
            {
             before(grammarAccess.getMixinAccess().getAppliesAssignment_3_3_1()); 
            // InternalOCCI.g:3152:2: ( rule__Mixin__AppliesAssignment_3_3_1 )
            // InternalOCCI.g:3152:3: rule__Mixin__AppliesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__AppliesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAppliesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_3_3__1__Impl"


    // $ANTLR start "rule__Mixin__Group_6__0"
    // InternalOCCI.g:3161:1: rule__Mixin__Group_6__0 : rule__Mixin__Group_6__0__Impl rule__Mixin__Group_6__1 ;
    public final void rule__Mixin__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3165:1: ( rule__Mixin__Group_6__0__Impl rule__Mixin__Group_6__1 )
            // InternalOCCI.g:3166:2: rule__Mixin__Group_6__0__Impl rule__Mixin__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Mixin__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__0"


    // $ANTLR start "rule__Mixin__Group_6__0__Impl"
    // InternalOCCI.g:3173:1: rule__Mixin__Group_6__0__Impl : ( 'title' ) ;
    public final void rule__Mixin__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3177:1: ( ( 'title' ) )
            // InternalOCCI.g:3178:1: ( 'title' )
            {
            // InternalOCCI.g:3178:1: ( 'title' )
            // InternalOCCI.g:3179:2: 'title'
            {
             before(grammarAccess.getMixinAccess().getTitleKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getTitleKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__0__Impl"


    // $ANTLR start "rule__Mixin__Group_6__1"
    // InternalOCCI.g:3188:1: rule__Mixin__Group_6__1 : rule__Mixin__Group_6__1__Impl ;
    public final void rule__Mixin__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3192:1: ( rule__Mixin__Group_6__1__Impl )
            // InternalOCCI.g:3193:2: rule__Mixin__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__1"


    // $ANTLR start "rule__Mixin__Group_6__1__Impl"
    // InternalOCCI.g:3199:1: rule__Mixin__Group_6__1__Impl : ( ( rule__Mixin__TitleAssignment_6_1 ) ) ;
    public final void rule__Mixin__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3203:1: ( ( ( rule__Mixin__TitleAssignment_6_1 ) ) )
            // InternalOCCI.g:3204:1: ( ( rule__Mixin__TitleAssignment_6_1 ) )
            {
            // InternalOCCI.g:3204:1: ( ( rule__Mixin__TitleAssignment_6_1 ) )
            // InternalOCCI.g:3205:2: ( rule__Mixin__TitleAssignment_6_1 )
            {
             before(grammarAccess.getMixinAccess().getTitleAssignment_6_1()); 
            // InternalOCCI.g:3206:2: ( rule__Mixin__TitleAssignment_6_1 )
            // InternalOCCI.g:3206:3: rule__Mixin__TitleAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__TitleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getTitleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_6__1__Impl"


    // $ANTLR start "rule__Mixin__Group_7__0"
    // InternalOCCI.g:3215:1: rule__Mixin__Group_7__0 : rule__Mixin__Group_7__0__Impl rule__Mixin__Group_7__1 ;
    public final void rule__Mixin__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3219:1: ( rule__Mixin__Group_7__0__Impl rule__Mixin__Group_7__1 )
            // InternalOCCI.g:3220:2: rule__Mixin__Group_7__0__Impl rule__Mixin__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__Mixin__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__0"


    // $ANTLR start "rule__Mixin__Group_7__0__Impl"
    // InternalOCCI.g:3227:1: rule__Mixin__Group_7__0__Impl : ( '(' ) ;
    public final void rule__Mixin__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3231:1: ( ( '(' ) )
            // InternalOCCI.g:3232:1: ( '(' )
            {
            // InternalOCCI.g:3232:1: ( '(' )
            // InternalOCCI.g:3233:2: '('
            {
             before(grammarAccess.getMixinAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getLeftParenthesisKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__0__Impl"


    // $ANTLR start "rule__Mixin__Group_7__1"
    // InternalOCCI.g:3242:1: rule__Mixin__Group_7__1 : rule__Mixin__Group_7__1__Impl rule__Mixin__Group_7__2 ;
    public final void rule__Mixin__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3246:1: ( rule__Mixin__Group_7__1__Impl rule__Mixin__Group_7__2 )
            // InternalOCCI.g:3247:2: rule__Mixin__Group_7__1__Impl rule__Mixin__Group_7__2
            {
            pushFollow(FOLLOW_15);
            rule__Mixin__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__1"


    // $ANTLR start "rule__Mixin__Group_7__1__Impl"
    // InternalOCCI.g:3254:1: rule__Mixin__Group_7__1__Impl : ( ( ( rule__Mixin__Alternatives_7_1 ) ) ( ( rule__Mixin__Alternatives_7_1 )* ) ) ;
    public final void rule__Mixin__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3258:1: ( ( ( ( rule__Mixin__Alternatives_7_1 ) ) ( ( rule__Mixin__Alternatives_7_1 )* ) ) )
            // InternalOCCI.g:3259:1: ( ( ( rule__Mixin__Alternatives_7_1 ) ) ( ( rule__Mixin__Alternatives_7_1 )* ) )
            {
            // InternalOCCI.g:3259:1: ( ( ( rule__Mixin__Alternatives_7_1 ) ) ( ( rule__Mixin__Alternatives_7_1 )* ) )
            // InternalOCCI.g:3260:2: ( ( rule__Mixin__Alternatives_7_1 ) ) ( ( rule__Mixin__Alternatives_7_1 )* )
            {
            // InternalOCCI.g:3260:2: ( ( rule__Mixin__Alternatives_7_1 ) )
            // InternalOCCI.g:3261:3: ( rule__Mixin__Alternatives_7_1 )
            {
             before(grammarAccess.getMixinAccess().getAlternatives_7_1()); 
            // InternalOCCI.g:3262:3: ( rule__Mixin__Alternatives_7_1 )
            // InternalOCCI.g:3262:4: rule__Mixin__Alternatives_7_1
            {
            pushFollow(FOLLOW_16);
            rule__Mixin__Alternatives_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAlternatives_7_1()); 

            }

            // InternalOCCI.g:3265:2: ( ( rule__Mixin__Alternatives_7_1 )* )
            // InternalOCCI.g:3266:3: ( rule__Mixin__Alternatives_7_1 )*
            {
             before(grammarAccess.getMixinAccess().getAlternatives_7_1()); 
            // InternalOCCI.g:3267:3: ( rule__Mixin__Alternatives_7_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==30||(LA31_0>=34 && LA31_0<=35)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOCCI.g:3267:4: rule__Mixin__Alternatives_7_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Mixin__Alternatives_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getMixinAccess().getAlternatives_7_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__1__Impl"


    // $ANTLR start "rule__Mixin__Group_7__2"
    // InternalOCCI.g:3276:1: rule__Mixin__Group_7__2 : rule__Mixin__Group_7__2__Impl ;
    public final void rule__Mixin__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3280:1: ( rule__Mixin__Group_7__2__Impl )
            // InternalOCCI.g:3281:2: rule__Mixin__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__2"


    // $ANTLR start "rule__Mixin__Group_7__2__Impl"
    // InternalOCCI.g:3287:1: rule__Mixin__Group_7__2__Impl : ( ')' ) ;
    public final void rule__Mixin__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3291:1: ( ( ')' ) )
            // InternalOCCI.g:3292:1: ( ')' )
            {
            // InternalOCCI.g:3292:1: ( ')' )
            // InternalOCCI.g:3293:2: ')'
            {
             before(grammarAccess.getMixinAccess().getRightParenthesisKeyword_7_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getRightParenthesisKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_7__2__Impl"


    // $ANTLR start "rule__Mixin__Group_8__0"
    // InternalOCCI.g:3303:1: rule__Mixin__Group_8__0 : rule__Mixin__Group_8__0__Impl rule__Mixin__Group_8__1 ;
    public final void rule__Mixin__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3307:1: ( rule__Mixin__Group_8__0__Impl rule__Mixin__Group_8__1 )
            // InternalOCCI.g:3308:2: rule__Mixin__Group_8__0__Impl rule__Mixin__Group_8__1
            {
            pushFollow(FOLLOW_17);
            rule__Mixin__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8__0"


    // $ANTLR start "rule__Mixin__Group_8__0__Impl"
    // InternalOCCI.g:3315:1: rule__Mixin__Group_8__0__Impl : ( 'annotations' ) ;
    public final void rule__Mixin__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3319:1: ( ( 'annotations' ) )
            // InternalOCCI.g:3320:1: ( 'annotations' )
            {
            // InternalOCCI.g:3320:1: ( 'annotations' )
            // InternalOCCI.g:3321:2: 'annotations'
            {
             before(grammarAccess.getMixinAccess().getAnnotationsKeyword_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getAnnotationsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8__0__Impl"


    // $ANTLR start "rule__Mixin__Group_8__1"
    // InternalOCCI.g:3330:1: rule__Mixin__Group_8__1 : rule__Mixin__Group_8__1__Impl rule__Mixin__Group_8__2 ;
    public final void rule__Mixin__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3334:1: ( rule__Mixin__Group_8__1__Impl rule__Mixin__Group_8__2 )
            // InternalOCCI.g:3335:2: rule__Mixin__Group_8__1__Impl rule__Mixin__Group_8__2
            {
            pushFollow(FOLLOW_18);
            rule__Mixin__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8__1"


    // $ANTLR start "rule__Mixin__Group_8__1__Impl"
    // InternalOCCI.g:3342:1: rule__Mixin__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Mixin__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3346:1: ( ( '{' ) )
            // InternalOCCI.g:3347:1: ( '{' )
            {
            // InternalOCCI.g:3347:1: ( '{' )
            // InternalOCCI.g:3348:2: '{'
            {
             before(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8__1__Impl"


    // $ANTLR start "rule__Mixin__Group_8__2"
    // InternalOCCI.g:3357:1: rule__Mixin__Group_8__2 : rule__Mixin__Group_8__2__Impl rule__Mixin__Group_8__3 ;
    public final void rule__Mixin__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3361:1: ( rule__Mixin__Group_8__2__Impl rule__Mixin__Group_8__3 )
            // InternalOCCI.g:3362:2: rule__Mixin__Group_8__2__Impl rule__Mixin__Group_8__3
            {
            pushFollow(FOLLOW_19);
            rule__Mixin__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8__2"


    // $ANTLR start "rule__Mixin__Group_8__2__Impl"
    // InternalOCCI.g:3369:1: rule__Mixin__Group_8__2__Impl : ( ( rule__Mixin__AnnotationsAssignment_8_2 ) ) ;
    public final void rule__Mixin__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3373:1: ( ( ( rule__Mixin__AnnotationsAssignment_8_2 ) ) )
            // InternalOCCI.g:3374:1: ( ( rule__Mixin__AnnotationsAssignment_8_2 ) )
            {
            // InternalOCCI.g:3374:1: ( ( rule__Mixin__AnnotationsAssignment_8_2 ) )
            // InternalOCCI.g:3375:2: ( rule__Mixin__AnnotationsAssignment_8_2 )
            {
             before(grammarAccess.getMixinAccess().getAnnotationsAssignment_8_2()); 
            // InternalOCCI.g:3376:2: ( rule__Mixin__AnnotationsAssignment_8_2 )
            // InternalOCCI.g:3376:3: rule__Mixin__AnnotationsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__AnnotationsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAnnotationsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8__2__Impl"


    // $ANTLR start "rule__Mixin__Group_8__3"
    // InternalOCCI.g:3384:1: rule__Mixin__Group_8__3 : rule__Mixin__Group_8__3__Impl rule__Mixin__Group_8__4 ;
    public final void rule__Mixin__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3388:1: ( rule__Mixin__Group_8__3__Impl rule__Mixin__Group_8__4 )
            // InternalOCCI.g:3389:2: rule__Mixin__Group_8__3__Impl rule__Mixin__Group_8__4
            {
            pushFollow(FOLLOW_19);
            rule__Mixin__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8__3"


    // $ANTLR start "rule__Mixin__Group_8__3__Impl"
    // InternalOCCI.g:3396:1: rule__Mixin__Group_8__3__Impl : ( ( rule__Mixin__Group_8_3__0 )* ) ;
    public final void rule__Mixin__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3400:1: ( ( ( rule__Mixin__Group_8_3__0 )* ) )
            // InternalOCCI.g:3401:1: ( ( rule__Mixin__Group_8_3__0 )* )
            {
            // InternalOCCI.g:3401:1: ( ( rule__Mixin__Group_8_3__0 )* )
            // InternalOCCI.g:3402:2: ( rule__Mixin__Group_8_3__0 )*
            {
             before(grammarAccess.getMixinAccess().getGroup_8_3()); 
            // InternalOCCI.g:3403:2: ( rule__Mixin__Group_8_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==71) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalOCCI.g:3403:3: rule__Mixin__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Mixin__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getMixinAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8__3__Impl"


    // $ANTLR start "rule__Mixin__Group_8__4"
    // InternalOCCI.g:3411:1: rule__Mixin__Group_8__4 : rule__Mixin__Group_8__4__Impl ;
    public final void rule__Mixin__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3415:1: ( rule__Mixin__Group_8__4__Impl )
            // InternalOCCI.g:3416:2: rule__Mixin__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8__4"


    // $ANTLR start "rule__Mixin__Group_8__4__Impl"
    // InternalOCCI.g:3422:1: rule__Mixin__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Mixin__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3426:1: ( ( '}' ) )
            // InternalOCCI.g:3427:1: ( '}' )
            {
            // InternalOCCI.g:3427:1: ( '}' )
            // InternalOCCI.g:3428:2: '}'
            {
             before(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8__4__Impl"


    // $ANTLR start "rule__Mixin__Group_8_3__0"
    // InternalOCCI.g:3438:1: rule__Mixin__Group_8_3__0 : rule__Mixin__Group_8_3__0__Impl rule__Mixin__Group_8_3__1 ;
    public final void rule__Mixin__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3442:1: ( rule__Mixin__Group_8_3__0__Impl rule__Mixin__Group_8_3__1 )
            // InternalOCCI.g:3443:2: rule__Mixin__Group_8_3__0__Impl rule__Mixin__Group_8_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Mixin__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8_3__0"


    // $ANTLR start "rule__Mixin__Group_8_3__0__Impl"
    // InternalOCCI.g:3450:1: rule__Mixin__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Mixin__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3454:1: ( ( ',' ) )
            // InternalOCCI.g:3455:1: ( ',' )
            {
            // InternalOCCI.g:3455:1: ( ',' )
            // InternalOCCI.g:3456:2: ','
            {
             before(grammarAccess.getMixinAccess().getCommaKeyword_8_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8_3__0__Impl"


    // $ANTLR start "rule__Mixin__Group_8_3__1"
    // InternalOCCI.g:3465:1: rule__Mixin__Group_8_3__1 : rule__Mixin__Group_8_3__1__Impl ;
    public final void rule__Mixin__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3469:1: ( rule__Mixin__Group_8_3__1__Impl )
            // InternalOCCI.g:3470:2: rule__Mixin__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8_3__1"


    // $ANTLR start "rule__Mixin__Group_8_3__1__Impl"
    // InternalOCCI.g:3476:1: rule__Mixin__Group_8_3__1__Impl : ( ( rule__Mixin__AnnotationsAssignment_8_3_1 ) ) ;
    public final void rule__Mixin__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3480:1: ( ( ( rule__Mixin__AnnotationsAssignment_8_3_1 ) ) )
            // InternalOCCI.g:3481:1: ( ( rule__Mixin__AnnotationsAssignment_8_3_1 ) )
            {
            // InternalOCCI.g:3481:1: ( ( rule__Mixin__AnnotationsAssignment_8_3_1 ) )
            // InternalOCCI.g:3482:2: ( rule__Mixin__AnnotationsAssignment_8_3_1 )
            {
             before(grammarAccess.getMixinAccess().getAnnotationsAssignment_8_3_1()); 
            // InternalOCCI.g:3483:2: ( rule__Mixin__AnnotationsAssignment_8_3_1 )
            // InternalOCCI.g:3483:3: rule__Mixin__AnnotationsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__AnnotationsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAnnotationsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_8_3__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalOCCI.g:3492:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3496:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalOCCI.g:3497:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalOCCI.g:3504:1: rule__Annotation__Group__0__Impl : ( '(' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3508:1: ( ( '(' ) )
            // InternalOCCI.g:3509:1: ( '(' )
            {
            // InternalOCCI.g:3509:1: ( '(' )
            // InternalOCCI.g:3510:2: '('
            {
             before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalOCCI.g:3519:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3523:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalOCCI.g:3524:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalOCCI.g:3531:1: rule__Annotation__Group__1__Impl : ( 'key' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3535:1: ( ( 'key' ) )
            // InternalOCCI.g:3536:1: ( 'key' )
            {
            // InternalOCCI.g:3536:1: ( 'key' )
            // InternalOCCI.g:3537:2: 'key'
            {
             before(grammarAccess.getAnnotationAccess().getKeyKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getKeyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // InternalOCCI.g:3546:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3550:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // InternalOCCI.g:3551:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Annotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // InternalOCCI.g:3558:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__KeyAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3562:1: ( ( ( rule__Annotation__KeyAssignment_2 ) ) )
            // InternalOCCI.g:3563:1: ( ( rule__Annotation__KeyAssignment_2 ) )
            {
            // InternalOCCI.g:3563:1: ( ( rule__Annotation__KeyAssignment_2 ) )
            // InternalOCCI.g:3564:2: ( rule__Annotation__KeyAssignment_2 )
            {
             before(grammarAccess.getAnnotationAccess().getKeyAssignment_2()); 
            // InternalOCCI.g:3565:2: ( rule__Annotation__KeyAssignment_2 )
            // InternalOCCI.g:3565:3: rule__Annotation__KeyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__KeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group__3"
    // InternalOCCI.g:3573:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl rule__Annotation__Group__4 ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3577:1: ( rule__Annotation__Group__3__Impl rule__Annotation__Group__4 )
            // InternalOCCI.g:3578:2: rule__Annotation__Group__3__Impl rule__Annotation__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Annotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3"


    // $ANTLR start "rule__Annotation__Group__3__Impl"
    // InternalOCCI.g:3585:1: rule__Annotation__Group__3__Impl : ( 'value' ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3589:1: ( ( 'value' ) )
            // InternalOCCI.g:3590:1: ( 'value' )
            {
            // InternalOCCI.g:3590:1: ( 'value' )
            // InternalOCCI.g:3591:2: 'value'
            {
             before(grammarAccess.getAnnotationAccess().getValueKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getValueKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3__Impl"


    // $ANTLR start "rule__Annotation__Group__4"
    // InternalOCCI.g:3600:1: rule__Annotation__Group__4 : rule__Annotation__Group__4__Impl rule__Annotation__Group__5 ;
    public final void rule__Annotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3604:1: ( rule__Annotation__Group__4__Impl rule__Annotation__Group__5 )
            // InternalOCCI.g:3605:2: rule__Annotation__Group__4__Impl rule__Annotation__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Annotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__4"


    // $ANTLR start "rule__Annotation__Group__4__Impl"
    // InternalOCCI.g:3612:1: rule__Annotation__Group__4__Impl : ( ( rule__Annotation__ValueAssignment_4 ) ) ;
    public final void rule__Annotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3616:1: ( ( ( rule__Annotation__ValueAssignment_4 ) ) )
            // InternalOCCI.g:3617:1: ( ( rule__Annotation__ValueAssignment_4 ) )
            {
            // InternalOCCI.g:3617:1: ( ( rule__Annotation__ValueAssignment_4 ) )
            // InternalOCCI.g:3618:2: ( rule__Annotation__ValueAssignment_4 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_4()); 
            // InternalOCCI.g:3619:2: ( rule__Annotation__ValueAssignment_4 )
            // InternalOCCI.g:3619:3: rule__Annotation__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__4__Impl"


    // $ANTLR start "rule__Annotation__Group__5"
    // InternalOCCI.g:3627:1: rule__Annotation__Group__5 : rule__Annotation__Group__5__Impl ;
    public final void rule__Annotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3631:1: ( rule__Annotation__Group__5__Impl )
            // InternalOCCI.g:3632:2: rule__Annotation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__5"


    // $ANTLR start "rule__Annotation__Group__5__Impl"
    // InternalOCCI.g:3638:1: rule__Annotation__Group__5__Impl : ( ')' ) ;
    public final void rule__Annotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3642:1: ( ( ')' ) )
            // InternalOCCI.g:3643:1: ( ')' )
            {
            // InternalOCCI.g:3643:1: ( ')' )
            // InternalOCCI.g:3644:2: ')'
            {
             before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_5()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalOCCI.g:3654:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3658:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalOCCI.g:3659:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalOCCI.g:3666:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3670:1: ( ( 'attribute' ) )
            // InternalOCCI.g:3671:1: ( 'attribute' )
            {
            // InternalOCCI.g:3671:1: ( 'attribute' )
            // InternalOCCI.g:3672:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalOCCI.g:3681:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3685:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalOCCI.g:3686:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalOCCI.g:3693:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__MutableAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3697:1: ( ( ( rule__Attribute__MutableAssignment_1 )? ) )
            // InternalOCCI.g:3698:1: ( ( rule__Attribute__MutableAssignment_1 )? )
            {
            // InternalOCCI.g:3698:1: ( ( rule__Attribute__MutableAssignment_1 )? )
            // InternalOCCI.g:3699:2: ( rule__Attribute__MutableAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getMutableAssignment_1()); 
            // InternalOCCI.g:3700:2: ( rule__Attribute__MutableAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                int LA33_1 = input.LA(2);

                if ( ((LA33_1>=RULE_ID && LA33_1<=RULE_QUALIFIED_ID)||(LA33_1>=13 && LA33_1<=64)) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // InternalOCCI.g:3700:3: rule__Attribute__MutableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__MutableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getMutableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalOCCI.g:3708:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3712:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalOCCI.g:3713:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalOCCI.g:3720:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__RequiredAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3724:1: ( ( ( rule__Attribute__RequiredAssignment_2 )? ) )
            // InternalOCCI.g:3725:1: ( ( rule__Attribute__RequiredAssignment_2 )? )
            {
            // InternalOCCI.g:3725:1: ( ( rule__Attribute__RequiredAssignment_2 )? )
            // InternalOCCI.g:3726:2: ( rule__Attribute__RequiredAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getRequiredAssignment_2()); 
            // InternalOCCI.g:3727:2: ( rule__Attribute__RequiredAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                int LA34_1 = input.LA(2);

                if ( ((LA34_1>=RULE_ID && LA34_1<=RULE_QUALIFIED_ID)||(LA34_1>=13 && LA34_1<=64)) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalOCCI.g:3727:3: rule__Attribute__RequiredAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__RequiredAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getRequiredAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalOCCI.g:3735:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3739:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalOCCI.g:3740:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalOCCI.g:3747:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3751:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // InternalOCCI.g:3752:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // InternalOCCI.g:3752:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // InternalOCCI.g:3753:2: ( rule__Attribute__NameAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            // InternalOCCI.g:3754:2: ( rule__Attribute__NameAssignment_3 )
            // InternalOCCI.g:3754:3: rule__Attribute__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalOCCI.g:3762:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3766:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalOCCI.g:3767:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalOCCI.g:3774:1: rule__Attribute__Group__4__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3778:1: ( ( ':' ) )
            // InternalOCCI.g:3779:1: ( ':' )
            {
            // InternalOCCI.g:3779:1: ( ':' )
            // InternalOCCI.g:3780:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_4()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalOCCI.g:3789:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3793:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalOCCI.g:3794:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalOCCI.g:3801:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3805:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalOCCI.g:3806:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalOCCI.g:3806:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalOCCI.g:3807:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalOCCI.g:3808:2: ( rule__Attribute__Group_5__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOCCI.g:3808:3: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalOCCI.g:3816:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3820:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalOCCI.g:3821:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalOCCI.g:3828:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__Group_6__0 )? ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3832:1: ( ( ( rule__Attribute__Group_6__0 )? ) )
            // InternalOCCI.g:3833:1: ( ( rule__Attribute__Group_6__0 )? )
            {
            // InternalOCCI.g:3833:1: ( ( rule__Attribute__Group_6__0 )? )
            // InternalOCCI.g:3834:2: ( rule__Attribute__Group_6__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_6()); 
            // InternalOCCI.g:3835:2: ( rule__Attribute__Group_6__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==72) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOCCI.g:3835:3: rule__Attribute__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__7"
    // InternalOCCI.g:3843:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3847:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalOCCI.g:3848:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7"


    // $ANTLR start "rule__Attribute__Group__7__Impl"
    // InternalOCCI.g:3855:1: rule__Attribute__Group__7__Impl : ( ( rule__Attribute__Group_7__0 )? ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3859:1: ( ( ( rule__Attribute__Group_7__0 )? ) )
            // InternalOCCI.g:3860:1: ( ( rule__Attribute__Group_7__0 )? )
            {
            // InternalOCCI.g:3860:1: ( ( rule__Attribute__Group_7__0 )? )
            // InternalOCCI.g:3861:2: ( rule__Attribute__Group_7__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_7()); 
            // InternalOCCI.g:3862:2: ( rule__Attribute__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOCCI.g:3862:3: rule__Attribute__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group__8"
    // InternalOCCI.g:3870:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3874:1: ( rule__Attribute__Group__8__Impl )
            // InternalOCCI.g:3875:2: rule__Attribute__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__8"


    // $ANTLR start "rule__Attribute__Group__8__Impl"
    // InternalOCCI.g:3881:1: rule__Attribute__Group__8__Impl : ( ( rule__Attribute__Group_8__0 )? ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3885:1: ( ( ( rule__Attribute__Group_8__0 )? ) )
            // InternalOCCI.g:3886:1: ( ( rule__Attribute__Group_8__0 )? )
            {
            // InternalOCCI.g:3886:1: ( ( rule__Attribute__Group_8__0 )? )
            // InternalOCCI.g:3887:2: ( rule__Attribute__Group_8__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_8()); 
            // InternalOCCI.g:3888:2: ( rule__Attribute__Group_8__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOCCI.g:3888:3: rule__Attribute__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__8__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // InternalOCCI.g:3897:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3901:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalOCCI.g:3902:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // InternalOCCI.g:3909:1: rule__Attribute__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3913:1: ( ( 'type' ) )
            // InternalOCCI.g:3914:1: ( 'type' )
            {
            // InternalOCCI.g:3914:1: ( 'type' )
            // InternalOCCI.g:3915:2: 'type'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // InternalOCCI.g:3924:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3928:1: ( rule__Attribute__Group_5__1__Impl )
            // InternalOCCI.g:3929:2: rule__Attribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // InternalOCCI.g:3935:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__TypeAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3939:1: ( ( ( rule__Attribute__TypeAssignment_5_1 ) ) )
            // InternalOCCI.g:3940:1: ( ( rule__Attribute__TypeAssignment_5_1 ) )
            {
            // InternalOCCI.g:3940:1: ( ( rule__Attribute__TypeAssignment_5_1 ) )
            // InternalOCCI.g:3941:2: ( rule__Attribute__TypeAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_5_1()); 
            // InternalOCCI.g:3942:2: ( rule__Attribute__TypeAssignment_5_1 )
            // InternalOCCI.g:3942:3: rule__Attribute__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group_6__0"
    // InternalOCCI.g:3951:1: rule__Attribute__Group_6__0 : rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 ;
    public final void rule__Attribute__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3955:1: ( rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 )
            // InternalOCCI.g:3956:2: rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__0"


    // $ANTLR start "rule__Attribute__Group_6__0__Impl"
    // InternalOCCI.g:3963:1: rule__Attribute__Group_6__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3967:1: ( ( '=' ) )
            // InternalOCCI.g:3968:1: ( '=' )
            {
            // InternalOCCI.g:3968:1: ( '=' )
            // InternalOCCI.g:3969:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_6_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__0__Impl"


    // $ANTLR start "rule__Attribute__Group_6__1"
    // InternalOCCI.g:3978:1: rule__Attribute__Group_6__1 : rule__Attribute__Group_6__1__Impl ;
    public final void rule__Attribute__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3982:1: ( rule__Attribute__Group_6__1__Impl )
            // InternalOCCI.g:3983:2: rule__Attribute__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__1"


    // $ANTLR start "rule__Attribute__Group_6__1__Impl"
    // InternalOCCI.g:3989:1: rule__Attribute__Group_6__1__Impl : ( ( rule__Attribute__DefaultAssignment_6_1 ) ) ;
    public final void rule__Attribute__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3993:1: ( ( ( rule__Attribute__DefaultAssignment_6_1 ) ) )
            // InternalOCCI.g:3994:1: ( ( rule__Attribute__DefaultAssignment_6_1 ) )
            {
            // InternalOCCI.g:3994:1: ( ( rule__Attribute__DefaultAssignment_6_1 ) )
            // InternalOCCI.g:3995:2: ( rule__Attribute__DefaultAssignment_6_1 )
            {
             before(grammarAccess.getAttributeAccess().getDefaultAssignment_6_1()); 
            // InternalOCCI.g:3996:2: ( rule__Attribute__DefaultAssignment_6_1 )
            // InternalOCCI.g:3996:3: rule__Attribute__DefaultAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DefaultAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDefaultAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_6__1__Impl"


    // $ANTLR start "rule__Attribute__Group_7__0"
    // InternalOCCI.g:4005:1: rule__Attribute__Group_7__0 : rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 ;
    public final void rule__Attribute__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4009:1: ( rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 )
            // InternalOCCI.g:4010:2: rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7__0"


    // $ANTLR start "rule__Attribute__Group_7__0__Impl"
    // InternalOCCI.g:4017:1: rule__Attribute__Group_7__0__Impl : ( 'description' ) ;
    public final void rule__Attribute__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4021:1: ( ( 'description' ) )
            // InternalOCCI.g:4022:1: ( 'description' )
            {
            // InternalOCCI.g:4022:1: ( 'description' )
            // InternalOCCI.g:4023:2: 'description'
            {
             before(grammarAccess.getAttributeAccess().getDescriptionKeyword_7_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDescriptionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7__0__Impl"


    // $ANTLR start "rule__Attribute__Group_7__1"
    // InternalOCCI.g:4032:1: rule__Attribute__Group_7__1 : rule__Attribute__Group_7__1__Impl ;
    public final void rule__Attribute__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4036:1: ( rule__Attribute__Group_7__1__Impl )
            // InternalOCCI.g:4037:2: rule__Attribute__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7__1"


    // $ANTLR start "rule__Attribute__Group_7__1__Impl"
    // InternalOCCI.g:4043:1: rule__Attribute__Group_7__1__Impl : ( ( rule__Attribute__DescriptionAssignment_7_1 ) ) ;
    public final void rule__Attribute__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4047:1: ( ( ( rule__Attribute__DescriptionAssignment_7_1 ) ) )
            // InternalOCCI.g:4048:1: ( ( rule__Attribute__DescriptionAssignment_7_1 ) )
            {
            // InternalOCCI.g:4048:1: ( ( rule__Attribute__DescriptionAssignment_7_1 ) )
            // InternalOCCI.g:4049:2: ( rule__Attribute__DescriptionAssignment_7_1 )
            {
             before(grammarAccess.getAttributeAccess().getDescriptionAssignment_7_1()); 
            // InternalOCCI.g:4050:2: ( rule__Attribute__DescriptionAssignment_7_1 )
            // InternalOCCI.g:4050:3: rule__Attribute__DescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDescriptionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7__1__Impl"


    // $ANTLR start "rule__Attribute__Group_8__0"
    // InternalOCCI.g:4059:1: rule__Attribute__Group_8__0 : rule__Attribute__Group_8__0__Impl rule__Attribute__Group_8__1 ;
    public final void rule__Attribute__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4063:1: ( rule__Attribute__Group_8__0__Impl rule__Attribute__Group_8__1 )
            // InternalOCCI.g:4064:2: rule__Attribute__Group_8__0__Impl rule__Attribute__Group_8__1
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8__0"


    // $ANTLR start "rule__Attribute__Group_8__0__Impl"
    // InternalOCCI.g:4071:1: rule__Attribute__Group_8__0__Impl : ( 'annotations' ) ;
    public final void rule__Attribute__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4075:1: ( ( 'annotations' ) )
            // InternalOCCI.g:4076:1: ( 'annotations' )
            {
            // InternalOCCI.g:4076:1: ( 'annotations' )
            // InternalOCCI.g:4077:2: 'annotations'
            {
             before(grammarAccess.getAttributeAccess().getAnnotationsKeyword_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAnnotationsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8__0__Impl"


    // $ANTLR start "rule__Attribute__Group_8__1"
    // InternalOCCI.g:4086:1: rule__Attribute__Group_8__1 : rule__Attribute__Group_8__1__Impl rule__Attribute__Group_8__2 ;
    public final void rule__Attribute__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4090:1: ( rule__Attribute__Group_8__1__Impl rule__Attribute__Group_8__2 )
            // InternalOCCI.g:4091:2: rule__Attribute__Group_8__1__Impl rule__Attribute__Group_8__2
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8__1"


    // $ANTLR start "rule__Attribute__Group_8__1__Impl"
    // InternalOCCI.g:4098:1: rule__Attribute__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4102:1: ( ( '{' ) )
            // InternalOCCI.g:4103:1: ( '{' )
            {
            // InternalOCCI.g:4103:1: ( '{' )
            // InternalOCCI.g:4104:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8__1__Impl"


    // $ANTLR start "rule__Attribute__Group_8__2"
    // InternalOCCI.g:4113:1: rule__Attribute__Group_8__2 : rule__Attribute__Group_8__2__Impl rule__Attribute__Group_8__3 ;
    public final void rule__Attribute__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4117:1: ( rule__Attribute__Group_8__2__Impl rule__Attribute__Group_8__3 )
            // InternalOCCI.g:4118:2: rule__Attribute__Group_8__2__Impl rule__Attribute__Group_8__3
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8__2"


    // $ANTLR start "rule__Attribute__Group_8__2__Impl"
    // InternalOCCI.g:4125:1: rule__Attribute__Group_8__2__Impl : ( ( rule__Attribute__AnnotationsAssignment_8_2 ) ) ;
    public final void rule__Attribute__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4129:1: ( ( ( rule__Attribute__AnnotationsAssignment_8_2 ) ) )
            // InternalOCCI.g:4130:1: ( ( rule__Attribute__AnnotationsAssignment_8_2 ) )
            {
            // InternalOCCI.g:4130:1: ( ( rule__Attribute__AnnotationsAssignment_8_2 ) )
            // InternalOCCI.g:4131:2: ( rule__Attribute__AnnotationsAssignment_8_2 )
            {
             before(grammarAccess.getAttributeAccess().getAnnotationsAssignment_8_2()); 
            // InternalOCCI.g:4132:2: ( rule__Attribute__AnnotationsAssignment_8_2 )
            // InternalOCCI.g:4132:3: rule__Attribute__AnnotationsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AnnotationsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAnnotationsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8__2__Impl"


    // $ANTLR start "rule__Attribute__Group_8__3"
    // InternalOCCI.g:4140:1: rule__Attribute__Group_8__3 : rule__Attribute__Group_8__3__Impl rule__Attribute__Group_8__4 ;
    public final void rule__Attribute__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4144:1: ( rule__Attribute__Group_8__3__Impl rule__Attribute__Group_8__4 )
            // InternalOCCI.g:4145:2: rule__Attribute__Group_8__3__Impl rule__Attribute__Group_8__4
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8__3"


    // $ANTLR start "rule__Attribute__Group_8__3__Impl"
    // InternalOCCI.g:4152:1: rule__Attribute__Group_8__3__Impl : ( ( rule__Attribute__Group_8_3__0 )* ) ;
    public final void rule__Attribute__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4156:1: ( ( ( rule__Attribute__Group_8_3__0 )* ) )
            // InternalOCCI.g:4157:1: ( ( rule__Attribute__Group_8_3__0 )* )
            {
            // InternalOCCI.g:4157:1: ( ( rule__Attribute__Group_8_3__0 )* )
            // InternalOCCI.g:4158:2: ( rule__Attribute__Group_8_3__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_8_3()); 
            // InternalOCCI.g:4159:2: ( rule__Attribute__Group_8_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==71) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalOCCI.g:4159:3: rule__Attribute__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Attribute__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8__3__Impl"


    // $ANTLR start "rule__Attribute__Group_8__4"
    // InternalOCCI.g:4167:1: rule__Attribute__Group_8__4 : rule__Attribute__Group_8__4__Impl ;
    public final void rule__Attribute__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4171:1: ( rule__Attribute__Group_8__4__Impl )
            // InternalOCCI.g:4172:2: rule__Attribute__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8__4"


    // $ANTLR start "rule__Attribute__Group_8__4__Impl"
    // InternalOCCI.g:4178:1: rule__Attribute__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4182:1: ( ( '}' ) )
            // InternalOCCI.g:4183:1: ( '}' )
            {
            // InternalOCCI.g:4183:1: ( '}' )
            // InternalOCCI.g:4184:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8__4__Impl"


    // $ANTLR start "rule__Attribute__Group_8_3__0"
    // InternalOCCI.g:4194:1: rule__Attribute__Group_8_3__0 : rule__Attribute__Group_8_3__0__Impl rule__Attribute__Group_8_3__1 ;
    public final void rule__Attribute__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4198:1: ( rule__Attribute__Group_8_3__0__Impl rule__Attribute__Group_8_3__1 )
            // InternalOCCI.g:4199:2: rule__Attribute__Group_8_3__0__Impl rule__Attribute__Group_8_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8_3__0"


    // $ANTLR start "rule__Attribute__Group_8_3__0__Impl"
    // InternalOCCI.g:4206:1: rule__Attribute__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4210:1: ( ( ',' ) )
            // InternalOCCI.g:4211:1: ( ',' )
            {
            // InternalOCCI.g:4211:1: ( ',' )
            // InternalOCCI.g:4212:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_8_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8_3__0__Impl"


    // $ANTLR start "rule__Attribute__Group_8_3__1"
    // InternalOCCI.g:4221:1: rule__Attribute__Group_8_3__1 : rule__Attribute__Group_8_3__1__Impl ;
    public final void rule__Attribute__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4225:1: ( rule__Attribute__Group_8_3__1__Impl )
            // InternalOCCI.g:4226:2: rule__Attribute__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8_3__1"


    // $ANTLR start "rule__Attribute__Group_8_3__1__Impl"
    // InternalOCCI.g:4232:1: rule__Attribute__Group_8_3__1__Impl : ( ( rule__Attribute__AnnotationsAssignment_8_3_1 ) ) ;
    public final void rule__Attribute__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4236:1: ( ( ( rule__Attribute__AnnotationsAssignment_8_3_1 ) ) )
            // InternalOCCI.g:4237:1: ( ( rule__Attribute__AnnotationsAssignment_8_3_1 ) )
            {
            // InternalOCCI.g:4237:1: ( ( rule__Attribute__AnnotationsAssignment_8_3_1 ) )
            // InternalOCCI.g:4238:2: ( rule__Attribute__AnnotationsAssignment_8_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getAnnotationsAssignment_8_3_1()); 
            // InternalOCCI.g:4239:2: ( rule__Attribute__AnnotationsAssignment_8_3_1 )
            // InternalOCCI.g:4239:3: rule__Attribute__AnnotationsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AnnotationsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAnnotationsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_8_3__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalOCCI.g:4248:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4252:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalOCCI.g:4253:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalOCCI.g:4260:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4264:1: ( ( 'action' ) )
            // InternalOCCI.g:4265:1: ( 'action' )
            {
            // InternalOCCI.g:4265:1: ( 'action' )
            // InternalOCCI.g:4266:2: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalOCCI.g:4275:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4279:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalOCCI.g:4280:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalOCCI.g:4287:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4291:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // InternalOCCI.g:4292:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // InternalOCCI.g:4292:1: ( ( rule__Action__NameAssignment_1 ) )
            // InternalOCCI.g:4293:2: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // InternalOCCI.g:4294:2: ( rule__Action__NameAssignment_1 )
            // InternalOCCI.g:4294:3: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalOCCI.g:4302:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4306:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalOCCI.g:4307:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalOCCI.g:4314:1: rule__Action__Group__2__Impl : ( 'scheme' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4318:1: ( ( 'scheme' ) )
            // InternalOCCI.g:4319:1: ( 'scheme' )
            {
            // InternalOCCI.g:4319:1: ( 'scheme' )
            // InternalOCCI.g:4320:2: 'scheme'
            {
             before(grammarAccess.getActionAccess().getSchemeKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getSchemeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalOCCI.g:4329:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4333:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalOCCI.g:4334:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalOCCI.g:4341:1: rule__Action__Group__3__Impl : ( ( rule__Action__SchemeAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4345:1: ( ( ( rule__Action__SchemeAssignment_3 ) ) )
            // InternalOCCI.g:4346:1: ( ( rule__Action__SchemeAssignment_3 ) )
            {
            // InternalOCCI.g:4346:1: ( ( rule__Action__SchemeAssignment_3 ) )
            // InternalOCCI.g:4347:2: ( rule__Action__SchemeAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getSchemeAssignment_3()); 
            // InternalOCCI.g:4348:2: ( rule__Action__SchemeAssignment_3 )
            // InternalOCCI.g:4348:3: rule__Action__SchemeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Action__SchemeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getSchemeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalOCCI.g:4356:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4360:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalOCCI.g:4361:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalOCCI.g:4368:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4372:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // InternalOCCI.g:4373:1: ( ( rule__Action__Group_4__0 )? )
            {
            // InternalOCCI.g:4373:1: ( ( rule__Action__Group_4__0 )? )
            // InternalOCCI.g:4374:2: ( rule__Action__Group_4__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_4()); 
            // InternalOCCI.g:4375:2: ( rule__Action__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==67) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOCCI.g:4375:3: rule__Action__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalOCCI.g:4383:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4387:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalOCCI.g:4388:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalOCCI.g:4395:1: rule__Action__Group__5__Impl : ( ( rule__Action__Group_5__0 )? ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4399:1: ( ( ( rule__Action__Group_5__0 )? ) )
            // InternalOCCI.g:4400:1: ( ( rule__Action__Group_5__0 )? )
            {
            // InternalOCCI.g:4400:1: ( ( rule__Action__Group_5__0 )? )
            // InternalOCCI.g:4401:2: ( rule__Action__Group_5__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_5()); 
            // InternalOCCI.g:4402:2: ( rule__Action__Group_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==69) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOCCI.g:4402:3: rule__Action__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // InternalOCCI.g:4410:1: rule__Action__Group__6 : rule__Action__Group__6__Impl ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4414:1: ( rule__Action__Group__6__Impl )
            // InternalOCCI.g:4415:2: rule__Action__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // InternalOCCI.g:4421:1: rule__Action__Group__6__Impl : ( ( rule__Action__Group_6__0 )? ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4425:1: ( ( ( rule__Action__Group_6__0 )? ) )
            // InternalOCCI.g:4426:1: ( ( rule__Action__Group_6__0 )? )
            {
            // InternalOCCI.g:4426:1: ( ( rule__Action__Group_6__0 )? )
            // InternalOCCI.g:4427:2: ( rule__Action__Group_6__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_6()); 
            // InternalOCCI.g:4428:2: ( rule__Action__Group_6__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOCCI.g:4428:3: rule__Action__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Action__Group_4__0"
    // InternalOCCI.g:4437:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4441:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // InternalOCCI.g:4442:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Action__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0"


    // $ANTLR start "rule__Action__Group_4__0__Impl"
    // InternalOCCI.g:4449:1: rule__Action__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4453:1: ( ( '(' ) )
            // InternalOCCI.g:4454:1: ( '(' )
            {
            // InternalOCCI.g:4454:1: ( '(' )
            // InternalOCCI.g:4455:2: '('
            {
             before(grammarAccess.getActionAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__0__Impl"


    // $ANTLR start "rule__Action__Group_4__1"
    // InternalOCCI.g:4464:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl rule__Action__Group_4__2 ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4468:1: ( rule__Action__Group_4__1__Impl rule__Action__Group_4__2 )
            // InternalOCCI.g:4469:2: rule__Action__Group_4__1__Impl rule__Action__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__Action__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1"


    // $ANTLR start "rule__Action__Group_4__1__Impl"
    // InternalOCCI.g:4476:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__AttributesAssignment_4_1 ) ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4480:1: ( ( ( rule__Action__AttributesAssignment_4_1 ) ) )
            // InternalOCCI.g:4481:1: ( ( rule__Action__AttributesAssignment_4_1 ) )
            {
            // InternalOCCI.g:4481:1: ( ( rule__Action__AttributesAssignment_4_1 ) )
            // InternalOCCI.g:4482:2: ( rule__Action__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getActionAccess().getAttributesAssignment_4_1()); 
            // InternalOCCI.g:4483:2: ( rule__Action__AttributesAssignment_4_1 )
            // InternalOCCI.g:4483:3: rule__Action__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAttributesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__1__Impl"


    // $ANTLR start "rule__Action__Group_4__2"
    // InternalOCCI.g:4491:1: rule__Action__Group_4__2 : rule__Action__Group_4__2__Impl rule__Action__Group_4__3 ;
    public final void rule__Action__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4495:1: ( rule__Action__Group_4__2__Impl rule__Action__Group_4__3 )
            // InternalOCCI.g:4496:2: rule__Action__Group_4__2__Impl rule__Action__Group_4__3
            {
            pushFollow(FOLLOW_23);
            rule__Action__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__2"


    // $ANTLR start "rule__Action__Group_4__2__Impl"
    // InternalOCCI.g:4503:1: rule__Action__Group_4__2__Impl : ( ( rule__Action__Group_4_2__0 )* ) ;
    public final void rule__Action__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4507:1: ( ( ( rule__Action__Group_4_2__0 )* ) )
            // InternalOCCI.g:4508:1: ( ( rule__Action__Group_4_2__0 )* )
            {
            // InternalOCCI.g:4508:1: ( ( rule__Action__Group_4_2__0 )* )
            // InternalOCCI.g:4509:2: ( rule__Action__Group_4_2__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_4_2()); 
            // InternalOCCI.g:4510:2: ( rule__Action__Group_4_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==71) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalOCCI.g:4510:3: rule__Action__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Action__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__2__Impl"


    // $ANTLR start "rule__Action__Group_4__3"
    // InternalOCCI.g:4518:1: rule__Action__Group_4__3 : rule__Action__Group_4__3__Impl ;
    public final void rule__Action__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4522:1: ( rule__Action__Group_4__3__Impl )
            // InternalOCCI.g:4523:2: rule__Action__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__3"


    // $ANTLR start "rule__Action__Group_4__3__Impl"
    // InternalOCCI.g:4529:1: rule__Action__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Action__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4533:1: ( ( ')' ) )
            // InternalOCCI.g:4534:1: ( ')' )
            {
            // InternalOCCI.g:4534:1: ( ')' )
            // InternalOCCI.g:4535:2: ')'
            {
             before(grammarAccess.getActionAccess().getRightParenthesisKeyword_4_3()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4__3__Impl"


    // $ANTLR start "rule__Action__Group_4_2__0"
    // InternalOCCI.g:4545:1: rule__Action__Group_4_2__0 : rule__Action__Group_4_2__0__Impl rule__Action__Group_4_2__1 ;
    public final void rule__Action__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4549:1: ( rule__Action__Group_4_2__0__Impl rule__Action__Group_4_2__1 )
            // InternalOCCI.g:4550:2: rule__Action__Group_4_2__0__Impl rule__Action__Group_4_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Action__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4_2__0"


    // $ANTLR start "rule__Action__Group_4_2__0__Impl"
    // InternalOCCI.g:4557:1: rule__Action__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Action__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4561:1: ( ( ',' ) )
            // InternalOCCI.g:4562:1: ( ',' )
            {
            // InternalOCCI.g:4562:1: ( ',' )
            // InternalOCCI.g:4563:2: ','
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_4_2_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4_2__0__Impl"


    // $ANTLR start "rule__Action__Group_4_2__1"
    // InternalOCCI.g:4572:1: rule__Action__Group_4_2__1 : rule__Action__Group_4_2__1__Impl ;
    public final void rule__Action__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4576:1: ( rule__Action__Group_4_2__1__Impl )
            // InternalOCCI.g:4577:2: rule__Action__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4_2__1"


    // $ANTLR start "rule__Action__Group_4_2__1__Impl"
    // InternalOCCI.g:4583:1: rule__Action__Group_4_2__1__Impl : ( ( rule__Action__AttributesAssignment_4_2_1 ) ) ;
    public final void rule__Action__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4587:1: ( ( ( rule__Action__AttributesAssignment_4_2_1 ) ) )
            // InternalOCCI.g:4588:1: ( ( rule__Action__AttributesAssignment_4_2_1 ) )
            {
            // InternalOCCI.g:4588:1: ( ( rule__Action__AttributesAssignment_4_2_1 ) )
            // InternalOCCI.g:4589:2: ( rule__Action__AttributesAssignment_4_2_1 )
            {
             before(grammarAccess.getActionAccess().getAttributesAssignment_4_2_1()); 
            // InternalOCCI.g:4590:2: ( rule__Action__AttributesAssignment_4_2_1 )
            // InternalOCCI.g:4590:3: rule__Action__AttributesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__AttributesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAttributesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_4_2__1__Impl"


    // $ANTLR start "rule__Action__Group_5__0"
    // InternalOCCI.g:4599:1: rule__Action__Group_5__0 : rule__Action__Group_5__0__Impl rule__Action__Group_5__1 ;
    public final void rule__Action__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4603:1: ( rule__Action__Group_5__0__Impl rule__Action__Group_5__1 )
            // InternalOCCI.g:4604:2: rule__Action__Group_5__0__Impl rule__Action__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__Action__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__0"


    // $ANTLR start "rule__Action__Group_5__0__Impl"
    // InternalOCCI.g:4611:1: rule__Action__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Action__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4615:1: ( ( '{' ) )
            // InternalOCCI.g:4616:1: ( '{' )
            {
            // InternalOCCI.g:4616:1: ( '{' )
            // InternalOCCI.g:4617:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__0__Impl"


    // $ANTLR start "rule__Action__Group_5__1"
    // InternalOCCI.g:4626:1: rule__Action__Group_5__1 : rule__Action__Group_5__1__Impl rule__Action__Group_5__2 ;
    public final void rule__Action__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4630:1: ( rule__Action__Group_5__1__Impl rule__Action__Group_5__2 )
            // InternalOCCI.g:4631:2: rule__Action__Group_5__1__Impl rule__Action__Group_5__2
            {
            pushFollow(FOLLOW_5);
            rule__Action__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__1"


    // $ANTLR start "rule__Action__Group_5__1__Impl"
    // InternalOCCI.g:4638:1: rule__Action__Group_5__1__Impl : ( 'title' ) ;
    public final void rule__Action__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4642:1: ( ( 'title' ) )
            // InternalOCCI.g:4643:1: ( 'title' )
            {
            // InternalOCCI.g:4643:1: ( 'title' )
            // InternalOCCI.g:4644:2: 'title'
            {
             before(grammarAccess.getActionAccess().getTitleKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getTitleKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__1__Impl"


    // $ANTLR start "rule__Action__Group_5__2"
    // InternalOCCI.g:4653:1: rule__Action__Group_5__2 : rule__Action__Group_5__2__Impl rule__Action__Group_5__3 ;
    public final void rule__Action__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4657:1: ( rule__Action__Group_5__2__Impl rule__Action__Group_5__3 )
            // InternalOCCI.g:4658:2: rule__Action__Group_5__2__Impl rule__Action__Group_5__3
            {
            pushFollow(FOLLOW_30);
            rule__Action__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__2"


    // $ANTLR start "rule__Action__Group_5__2__Impl"
    // InternalOCCI.g:4665:1: rule__Action__Group_5__2__Impl : ( ( rule__Action__TitleAssignment_5_2 ) ) ;
    public final void rule__Action__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4669:1: ( ( ( rule__Action__TitleAssignment_5_2 ) ) )
            // InternalOCCI.g:4670:1: ( ( rule__Action__TitleAssignment_5_2 ) )
            {
            // InternalOCCI.g:4670:1: ( ( rule__Action__TitleAssignment_5_2 ) )
            // InternalOCCI.g:4671:2: ( rule__Action__TitleAssignment_5_2 )
            {
             before(grammarAccess.getActionAccess().getTitleAssignment_5_2()); 
            // InternalOCCI.g:4672:2: ( rule__Action__TitleAssignment_5_2 )
            // InternalOCCI.g:4672:3: rule__Action__TitleAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__TitleAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTitleAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__2__Impl"


    // $ANTLR start "rule__Action__Group_5__3"
    // InternalOCCI.g:4680:1: rule__Action__Group_5__3 : rule__Action__Group_5__3__Impl ;
    public final void rule__Action__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4684:1: ( rule__Action__Group_5__3__Impl )
            // InternalOCCI.g:4685:2: rule__Action__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__3"


    // $ANTLR start "rule__Action__Group_5__3__Impl"
    // InternalOCCI.g:4691:1: rule__Action__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Action__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4695:1: ( ( '}' ) )
            // InternalOCCI.g:4696:1: ( '}' )
            {
            // InternalOCCI.g:4696:1: ( '}' )
            // InternalOCCI.g:4697:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_5__3__Impl"


    // $ANTLR start "rule__Action__Group_6__0"
    // InternalOCCI.g:4707:1: rule__Action__Group_6__0 : rule__Action__Group_6__0__Impl rule__Action__Group_6__1 ;
    public final void rule__Action__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4711:1: ( rule__Action__Group_6__0__Impl rule__Action__Group_6__1 )
            // InternalOCCI.g:4712:2: rule__Action__Group_6__0__Impl rule__Action__Group_6__1
            {
            pushFollow(FOLLOW_17);
            rule__Action__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__0"


    // $ANTLR start "rule__Action__Group_6__0__Impl"
    // InternalOCCI.g:4719:1: rule__Action__Group_6__0__Impl : ( 'annotations' ) ;
    public final void rule__Action__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4723:1: ( ( 'annotations' ) )
            // InternalOCCI.g:4724:1: ( 'annotations' )
            {
            // InternalOCCI.g:4724:1: ( 'annotations' )
            // InternalOCCI.g:4725:2: 'annotations'
            {
             before(grammarAccess.getActionAccess().getAnnotationsKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getAnnotationsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__0__Impl"


    // $ANTLR start "rule__Action__Group_6__1"
    // InternalOCCI.g:4734:1: rule__Action__Group_6__1 : rule__Action__Group_6__1__Impl rule__Action__Group_6__2 ;
    public final void rule__Action__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4738:1: ( rule__Action__Group_6__1__Impl rule__Action__Group_6__2 )
            // InternalOCCI.g:4739:2: rule__Action__Group_6__1__Impl rule__Action__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__Action__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__1"


    // $ANTLR start "rule__Action__Group_6__1__Impl"
    // InternalOCCI.g:4746:1: rule__Action__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Action__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4750:1: ( ( '{' ) )
            // InternalOCCI.g:4751:1: ( '{' )
            {
            // InternalOCCI.g:4751:1: ( '{' )
            // InternalOCCI.g:4752:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__1__Impl"


    // $ANTLR start "rule__Action__Group_6__2"
    // InternalOCCI.g:4761:1: rule__Action__Group_6__2 : rule__Action__Group_6__2__Impl rule__Action__Group_6__3 ;
    public final void rule__Action__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4765:1: ( rule__Action__Group_6__2__Impl rule__Action__Group_6__3 )
            // InternalOCCI.g:4766:2: rule__Action__Group_6__2__Impl rule__Action__Group_6__3
            {
            pushFollow(FOLLOW_19);
            rule__Action__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__2"


    // $ANTLR start "rule__Action__Group_6__2__Impl"
    // InternalOCCI.g:4773:1: rule__Action__Group_6__2__Impl : ( ( rule__Action__AnnotationsAssignment_6_2 ) ) ;
    public final void rule__Action__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4777:1: ( ( ( rule__Action__AnnotationsAssignment_6_2 ) ) )
            // InternalOCCI.g:4778:1: ( ( rule__Action__AnnotationsAssignment_6_2 ) )
            {
            // InternalOCCI.g:4778:1: ( ( rule__Action__AnnotationsAssignment_6_2 ) )
            // InternalOCCI.g:4779:2: ( rule__Action__AnnotationsAssignment_6_2 )
            {
             before(grammarAccess.getActionAccess().getAnnotationsAssignment_6_2()); 
            // InternalOCCI.g:4780:2: ( rule__Action__AnnotationsAssignment_6_2 )
            // InternalOCCI.g:4780:3: rule__Action__AnnotationsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__AnnotationsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAnnotationsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__2__Impl"


    // $ANTLR start "rule__Action__Group_6__3"
    // InternalOCCI.g:4788:1: rule__Action__Group_6__3 : rule__Action__Group_6__3__Impl rule__Action__Group_6__4 ;
    public final void rule__Action__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4792:1: ( rule__Action__Group_6__3__Impl rule__Action__Group_6__4 )
            // InternalOCCI.g:4793:2: rule__Action__Group_6__3__Impl rule__Action__Group_6__4
            {
            pushFollow(FOLLOW_19);
            rule__Action__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__3"


    // $ANTLR start "rule__Action__Group_6__3__Impl"
    // InternalOCCI.g:4800:1: rule__Action__Group_6__3__Impl : ( ( rule__Action__Group_6_3__0 )* ) ;
    public final void rule__Action__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4804:1: ( ( ( rule__Action__Group_6_3__0 )* ) )
            // InternalOCCI.g:4805:1: ( ( rule__Action__Group_6_3__0 )* )
            {
            // InternalOCCI.g:4805:1: ( ( rule__Action__Group_6_3__0 )* )
            // InternalOCCI.g:4806:2: ( rule__Action__Group_6_3__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_6_3()); 
            // InternalOCCI.g:4807:2: ( rule__Action__Group_6_3__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==71) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalOCCI.g:4807:3: rule__Action__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Action__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__3__Impl"


    // $ANTLR start "rule__Action__Group_6__4"
    // InternalOCCI.g:4815:1: rule__Action__Group_6__4 : rule__Action__Group_6__4__Impl ;
    public final void rule__Action__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4819:1: ( rule__Action__Group_6__4__Impl )
            // InternalOCCI.g:4820:2: rule__Action__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__4"


    // $ANTLR start "rule__Action__Group_6__4__Impl"
    // InternalOCCI.g:4826:1: rule__Action__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Action__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4830:1: ( ( '}' ) )
            // InternalOCCI.g:4831:1: ( '}' )
            {
            // InternalOCCI.g:4831:1: ( '}' )
            // InternalOCCI.g:4832:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6__4__Impl"


    // $ANTLR start "rule__Action__Group_6_3__0"
    // InternalOCCI.g:4842:1: rule__Action__Group_6_3__0 : rule__Action__Group_6_3__0__Impl rule__Action__Group_6_3__1 ;
    public final void rule__Action__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4846:1: ( rule__Action__Group_6_3__0__Impl rule__Action__Group_6_3__1 )
            // InternalOCCI.g:4847:2: rule__Action__Group_6_3__0__Impl rule__Action__Group_6_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Action__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6_3__0"


    // $ANTLR start "rule__Action__Group_6_3__0__Impl"
    // InternalOCCI.g:4854:1: rule__Action__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Action__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4858:1: ( ( ',' ) )
            // InternalOCCI.g:4859:1: ( ',' )
            {
            // InternalOCCI.g:4859:1: ( ',' )
            // InternalOCCI.g:4860:2: ','
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_6_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6_3__0__Impl"


    // $ANTLR start "rule__Action__Group_6_3__1"
    // InternalOCCI.g:4869:1: rule__Action__Group_6_3__1 : rule__Action__Group_6_3__1__Impl ;
    public final void rule__Action__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4873:1: ( rule__Action__Group_6_3__1__Impl )
            // InternalOCCI.g:4874:2: rule__Action__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6_3__1"


    // $ANTLR start "rule__Action__Group_6_3__1__Impl"
    // InternalOCCI.g:4880:1: rule__Action__Group_6_3__1__Impl : ( ( rule__Action__AnnotationsAssignment_6_3_1 ) ) ;
    public final void rule__Action__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4884:1: ( ( ( rule__Action__AnnotationsAssignment_6_3_1 ) ) )
            // InternalOCCI.g:4885:1: ( ( rule__Action__AnnotationsAssignment_6_3_1 ) )
            {
            // InternalOCCI.g:4885:1: ( ( rule__Action__AnnotationsAssignment_6_3_1 ) )
            // InternalOCCI.g:4886:2: ( rule__Action__AnnotationsAssignment_6_3_1 )
            {
             before(grammarAccess.getActionAccess().getAnnotationsAssignment_6_3_1()); 
            // InternalOCCI.g:4887:2: ( rule__Action__AnnotationsAssignment_6_3_1 )
            // InternalOCCI.g:4887:3: rule__Action__AnnotationsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__AnnotationsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAnnotationsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_6_3__1__Impl"


    // $ANTLR start "rule__ParameterDecl__Group__0"
    // InternalOCCI.g:4896:1: rule__ParameterDecl__Group__0 : rule__ParameterDecl__Group__0__Impl rule__ParameterDecl__Group__1 ;
    public final void rule__ParameterDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4900:1: ( rule__ParameterDecl__Group__0__Impl rule__ParameterDecl__Group__1 )
            // InternalOCCI.g:4901:2: rule__ParameterDecl__Group__0__Impl rule__ParameterDecl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ParameterDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group__0"


    // $ANTLR start "rule__ParameterDecl__Group__0__Impl"
    // InternalOCCI.g:4908:1: rule__ParameterDecl__Group__0__Impl : ( ( rule__ParameterDecl__NameAssignment_0 ) ) ;
    public final void rule__ParameterDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4912:1: ( ( ( rule__ParameterDecl__NameAssignment_0 ) ) )
            // InternalOCCI.g:4913:1: ( ( rule__ParameterDecl__NameAssignment_0 ) )
            {
            // InternalOCCI.g:4913:1: ( ( rule__ParameterDecl__NameAssignment_0 ) )
            // InternalOCCI.g:4914:2: ( rule__ParameterDecl__NameAssignment_0 )
            {
             before(grammarAccess.getParameterDeclAccess().getNameAssignment_0()); 
            // InternalOCCI.g:4915:2: ( rule__ParameterDecl__NameAssignment_0 )
            // InternalOCCI.g:4915:3: rule__ParameterDecl__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDecl__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group__0__Impl"


    // $ANTLR start "rule__ParameterDecl__Group__1"
    // InternalOCCI.g:4923:1: rule__ParameterDecl__Group__1 : rule__ParameterDecl__Group__1__Impl rule__ParameterDecl__Group__2 ;
    public final void rule__ParameterDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4927:1: ( rule__ParameterDecl__Group__1__Impl rule__ParameterDecl__Group__2 )
            // InternalOCCI.g:4928:2: rule__ParameterDecl__Group__1__Impl rule__ParameterDecl__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ParameterDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group__1"


    // $ANTLR start "rule__ParameterDecl__Group__1__Impl"
    // InternalOCCI.g:4935:1: rule__ParameterDecl__Group__1__Impl : ( ':' ) ;
    public final void rule__ParameterDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4939:1: ( ( ':' ) )
            // InternalOCCI.g:4940:1: ( ':' )
            {
            // InternalOCCI.g:4940:1: ( ':' )
            // InternalOCCI.g:4941:2: ':'
            {
             before(grammarAccess.getParameterDeclAccess().getColonKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getParameterDeclAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group__1__Impl"


    // $ANTLR start "rule__ParameterDecl__Group__2"
    // InternalOCCI.g:4950:1: rule__ParameterDecl__Group__2 : rule__ParameterDecl__Group__2__Impl rule__ParameterDecl__Group__3 ;
    public final void rule__ParameterDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4954:1: ( rule__ParameterDecl__Group__2__Impl rule__ParameterDecl__Group__3 )
            // InternalOCCI.g:4955:2: rule__ParameterDecl__Group__2__Impl rule__ParameterDecl__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ParameterDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group__2"


    // $ANTLR start "rule__ParameterDecl__Group__2__Impl"
    // InternalOCCI.g:4962:1: rule__ParameterDecl__Group__2__Impl : ( ( rule__ParameterDecl__TypeAssignment_2 ) ) ;
    public final void rule__ParameterDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4966:1: ( ( ( rule__ParameterDecl__TypeAssignment_2 ) ) )
            // InternalOCCI.g:4967:1: ( ( rule__ParameterDecl__TypeAssignment_2 ) )
            {
            // InternalOCCI.g:4967:1: ( ( rule__ParameterDecl__TypeAssignment_2 ) )
            // InternalOCCI.g:4968:2: ( rule__ParameterDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterDeclAccess().getTypeAssignment_2()); 
            // InternalOCCI.g:4969:2: ( rule__ParameterDecl__TypeAssignment_2 )
            // InternalOCCI.g:4969:3: rule__ParameterDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDecl__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group__2__Impl"


    // $ANTLR start "rule__ParameterDecl__Group__3"
    // InternalOCCI.g:4977:1: rule__ParameterDecl__Group__3 : rule__ParameterDecl__Group__3__Impl ;
    public final void rule__ParameterDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4981:1: ( rule__ParameterDecl__Group__3__Impl )
            // InternalOCCI.g:4982:2: rule__ParameterDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDecl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group__3"


    // $ANTLR start "rule__ParameterDecl__Group__3__Impl"
    // InternalOCCI.g:4988:1: rule__ParameterDecl__Group__3__Impl : ( ( rule__ParameterDecl__Group_3__0 )? ) ;
    public final void rule__ParameterDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4992:1: ( ( ( rule__ParameterDecl__Group_3__0 )? ) )
            // InternalOCCI.g:4993:1: ( ( rule__ParameterDecl__Group_3__0 )? )
            {
            // InternalOCCI.g:4993:1: ( ( rule__ParameterDecl__Group_3__0 )? )
            // InternalOCCI.g:4994:2: ( rule__ParameterDecl__Group_3__0 )?
            {
             before(grammarAccess.getParameterDeclAccess().getGroup_3()); 
            // InternalOCCI.g:4995:2: ( rule__ParameterDecl__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==72) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOCCI.g:4995:3: rule__ParameterDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterDecl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterDeclAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group__3__Impl"


    // $ANTLR start "rule__ParameterDecl__Group_3__0"
    // InternalOCCI.g:5004:1: rule__ParameterDecl__Group_3__0 : rule__ParameterDecl__Group_3__0__Impl rule__ParameterDecl__Group_3__1 ;
    public final void rule__ParameterDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5008:1: ( rule__ParameterDecl__Group_3__0__Impl rule__ParameterDecl__Group_3__1 )
            // InternalOCCI.g:5009:2: rule__ParameterDecl__Group_3__0__Impl rule__ParameterDecl__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ParameterDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDecl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group_3__0"


    // $ANTLR start "rule__ParameterDecl__Group_3__0__Impl"
    // InternalOCCI.g:5016:1: rule__ParameterDecl__Group_3__0__Impl : ( '=' ) ;
    public final void rule__ParameterDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5020:1: ( ( '=' ) )
            // InternalOCCI.g:5021:1: ( '=' )
            {
            // InternalOCCI.g:5021:1: ( '=' )
            // InternalOCCI.g:5022:2: '='
            {
             before(grammarAccess.getParameterDeclAccess().getEqualsSignKeyword_3_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getParameterDeclAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterDecl__Group_3__1"
    // InternalOCCI.g:5031:1: rule__ParameterDecl__Group_3__1 : rule__ParameterDecl__Group_3__1__Impl ;
    public final void rule__ParameterDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5035:1: ( rule__ParameterDecl__Group_3__1__Impl )
            // InternalOCCI.g:5036:2: rule__ParameterDecl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDecl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group_3__1"


    // $ANTLR start "rule__ParameterDecl__Group_3__1__Impl"
    // InternalOCCI.g:5042:1: rule__ParameterDecl__Group_3__1__Impl : ( ( rule__ParameterDecl__DefaultAssignment_3_1 ) ) ;
    public final void rule__ParameterDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5046:1: ( ( ( rule__ParameterDecl__DefaultAssignment_3_1 ) ) )
            // InternalOCCI.g:5047:1: ( ( rule__ParameterDecl__DefaultAssignment_3_1 ) )
            {
            // InternalOCCI.g:5047:1: ( ( rule__ParameterDecl__DefaultAssignment_3_1 ) )
            // InternalOCCI.g:5048:2: ( rule__ParameterDecl__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getParameterDeclAccess().getDefaultAssignment_3_1()); 
            // InternalOCCI.g:5049:2: ( rule__ParameterDecl__DefaultAssignment_3_1 )
            // InternalOCCI.g:5049:3: rule__ParameterDecl__DefaultAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDecl__DefaultAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclAccess().getDefaultAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__Group_3__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalOCCI.g:5058:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5062:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalOCCI.g:5063:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalOCCI.g:5070:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5074:1: ( ( 'constraint' ) )
            // InternalOCCI.g:5075:1: ( 'constraint' )
            {
            // InternalOCCI.g:5075:1: ( 'constraint' )
            // InternalOCCI.g:5076:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalOCCI.g:5085:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5089:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalOCCI.g:5090:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalOCCI.g:5097:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5101:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalOCCI.g:5102:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalOCCI.g:5102:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalOCCI.g:5103:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalOCCI.g:5104:2: ( rule__Constraint__NameAssignment_1 )
            // InternalOCCI.g:5104:3: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalOCCI.g:5112:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5116:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalOCCI.g:5117:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalOCCI.g:5124:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__Group_2__0 )? ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5128:1: ( ( ( rule__Constraint__Group_2__0 )? ) )
            // InternalOCCI.g:5129:1: ( ( rule__Constraint__Group_2__0 )? )
            {
            // InternalOCCI.g:5129:1: ( ( rule__Constraint__Group_2__0 )? )
            // InternalOCCI.g:5130:2: ( rule__Constraint__Group_2__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_2()); 
            // InternalOCCI.g:5131:2: ( rule__Constraint__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==14) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOCCI.g:5131:3: rule__Constraint__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalOCCI.g:5139:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5143:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalOCCI.g:5144:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalOCCI.g:5151:1: rule__Constraint__Group__3__Impl : ( 'body' ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5155:1: ( ( 'body' ) )
            // InternalOCCI.g:5156:1: ( 'body' )
            {
            // InternalOCCI.g:5156:1: ( 'body' )
            // InternalOCCI.g:5157:2: 'body'
            {
             before(grammarAccess.getConstraintAccess().getBodyKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getBodyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalOCCI.g:5166:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5170:1: ( rule__Constraint__Group__4__Impl )
            // InternalOCCI.g:5171:2: rule__Constraint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalOCCI.g:5177:1: rule__Constraint__Group__4__Impl : ( ( rule__Constraint__BodyAssignment_4 ) ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5181:1: ( ( ( rule__Constraint__BodyAssignment_4 ) ) )
            // InternalOCCI.g:5182:1: ( ( rule__Constraint__BodyAssignment_4 ) )
            {
            // InternalOCCI.g:5182:1: ( ( rule__Constraint__BodyAssignment_4 ) )
            // InternalOCCI.g:5183:2: ( rule__Constraint__BodyAssignment_4 )
            {
             before(grammarAccess.getConstraintAccess().getBodyAssignment_4()); 
            // InternalOCCI.g:5184:2: ( rule__Constraint__BodyAssignment_4 )
            // InternalOCCI.g:5184:3: rule__Constraint__BodyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group_2__0"
    // InternalOCCI.g:5193:1: rule__Constraint__Group_2__0 : rule__Constraint__Group_2__0__Impl rule__Constraint__Group_2__1 ;
    public final void rule__Constraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5197:1: ( rule__Constraint__Group_2__0__Impl rule__Constraint__Group_2__1 )
            // InternalOCCI.g:5198:2: rule__Constraint__Group_2__0__Impl rule__Constraint__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Constraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2__0"


    // $ANTLR start "rule__Constraint__Group_2__0__Impl"
    // InternalOCCI.g:5205:1: rule__Constraint__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__Constraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5209:1: ( ( 'description' ) )
            // InternalOCCI.g:5210:1: ( 'description' )
            {
            // InternalOCCI.g:5210:1: ( 'description' )
            // InternalOCCI.g:5211:2: 'description'
            {
             before(grammarAccess.getConstraintAccess().getDescriptionKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2__0__Impl"


    // $ANTLR start "rule__Constraint__Group_2__1"
    // InternalOCCI.g:5220:1: rule__Constraint__Group_2__1 : rule__Constraint__Group_2__1__Impl ;
    public final void rule__Constraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5224:1: ( rule__Constraint__Group_2__1__Impl )
            // InternalOCCI.g:5225:2: rule__Constraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2__1"


    // $ANTLR start "rule__Constraint__Group_2__1__Impl"
    // InternalOCCI.g:5231:1: rule__Constraint__Group_2__1__Impl : ( ( rule__Constraint__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Constraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5235:1: ( ( ( rule__Constraint__DescriptionAssignment_2_1 ) ) )
            // InternalOCCI.g:5236:1: ( ( rule__Constraint__DescriptionAssignment_2_1 ) )
            {
            // InternalOCCI.g:5236:1: ( ( rule__Constraint__DescriptionAssignment_2_1 ) )
            // InternalOCCI.g:5237:2: ( rule__Constraint__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getConstraintAccess().getDescriptionAssignment_2_1()); 
            // InternalOCCI.g:5238:2: ( rule__Constraint__DescriptionAssignment_2_1 )
            // InternalOCCI.g:5238:3: rule__Constraint__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_2__1__Impl"


    // $ANTLR start "rule__FSM__Group__0"
    // InternalOCCI.g:5247:1: rule__FSM__Group__0 : rule__FSM__Group__0__Impl rule__FSM__Group__1 ;
    public final void rule__FSM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5251:1: ( rule__FSM__Group__0__Impl rule__FSM__Group__1 )
            // InternalOCCI.g:5252:2: rule__FSM__Group__0__Impl rule__FSM__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__FSM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__0"


    // $ANTLR start "rule__FSM__Group__0__Impl"
    // InternalOCCI.g:5259:1: rule__FSM__Group__0__Impl : ( 'FSM' ) ;
    public final void rule__FSM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5263:1: ( ( 'FSM' ) )
            // InternalOCCI.g:5264:1: ( 'FSM' )
            {
            // InternalOCCI.g:5264:1: ( 'FSM' )
            // InternalOCCI.g:5265:2: 'FSM'
            {
             before(grammarAccess.getFSMAccess().getFSMKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getFSMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__0__Impl"


    // $ANTLR start "rule__FSM__Group__1"
    // InternalOCCI.g:5274:1: rule__FSM__Group__1 : rule__FSM__Group__1__Impl rule__FSM__Group__2 ;
    public final void rule__FSM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5278:1: ( rule__FSM__Group__1__Impl rule__FSM__Group__2 )
            // InternalOCCI.g:5279:2: rule__FSM__Group__1__Impl rule__FSM__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__FSM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__1"


    // $ANTLR start "rule__FSM__Group__1__Impl"
    // InternalOCCI.g:5286:1: rule__FSM__Group__1__Impl : ( '(' ) ;
    public final void rule__FSM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5290:1: ( ( '(' ) )
            // InternalOCCI.g:5291:1: ( '(' )
            {
            // InternalOCCI.g:5291:1: ( '(' )
            // InternalOCCI.g:5292:2: '('
            {
             before(grammarAccess.getFSMAccess().getLeftParenthesisKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__1__Impl"


    // $ANTLR start "rule__FSM__Group__2"
    // InternalOCCI.g:5301:1: rule__FSM__Group__2 : rule__FSM__Group__2__Impl rule__FSM__Group__3 ;
    public final void rule__FSM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5305:1: ( rule__FSM__Group__2__Impl rule__FSM__Group__3 )
            // InternalOCCI.g:5306:2: rule__FSM__Group__2__Impl rule__FSM__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__FSM__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__2"


    // $ANTLR start "rule__FSM__Group__2__Impl"
    // InternalOCCI.g:5313:1: rule__FSM__Group__2__Impl : ( 'attribute' ) ;
    public final void rule__FSM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5317:1: ( ( 'attribute' ) )
            // InternalOCCI.g:5318:1: ( 'attribute' )
            {
            // InternalOCCI.g:5318:1: ( 'attribute' )
            // InternalOCCI.g:5319:2: 'attribute'
            {
             before(grammarAccess.getFSMAccess().getAttributeKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getAttributeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__2__Impl"


    // $ANTLR start "rule__FSM__Group__3"
    // InternalOCCI.g:5328:1: rule__FSM__Group__3 : rule__FSM__Group__3__Impl rule__FSM__Group__4 ;
    public final void rule__FSM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5332:1: ( rule__FSM__Group__3__Impl rule__FSM__Group__4 )
            // InternalOCCI.g:5333:2: rule__FSM__Group__3__Impl rule__FSM__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__FSM__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__3"


    // $ANTLR start "rule__FSM__Group__3__Impl"
    // InternalOCCI.g:5340:1: rule__FSM__Group__3__Impl : ( ( rule__FSM__AttributeAssignment_3 ) ) ;
    public final void rule__FSM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5344:1: ( ( ( rule__FSM__AttributeAssignment_3 ) ) )
            // InternalOCCI.g:5345:1: ( ( rule__FSM__AttributeAssignment_3 ) )
            {
            // InternalOCCI.g:5345:1: ( ( rule__FSM__AttributeAssignment_3 ) )
            // InternalOCCI.g:5346:2: ( rule__FSM__AttributeAssignment_3 )
            {
             before(grammarAccess.getFSMAccess().getAttributeAssignment_3()); 
            // InternalOCCI.g:5347:2: ( rule__FSM__AttributeAssignment_3 )
            // InternalOCCI.g:5347:3: rule__FSM__AttributeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FSM__AttributeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFSMAccess().getAttributeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__3__Impl"


    // $ANTLR start "rule__FSM__Group__4"
    // InternalOCCI.g:5355:1: rule__FSM__Group__4 : rule__FSM__Group__4__Impl rule__FSM__Group__5 ;
    public final void rule__FSM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5359:1: ( rule__FSM__Group__4__Impl rule__FSM__Group__5 )
            // InternalOCCI.g:5360:2: rule__FSM__Group__4__Impl rule__FSM__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__FSM__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__4"


    // $ANTLR start "rule__FSM__Group__4__Impl"
    // InternalOCCI.g:5367:1: rule__FSM__Group__4__Impl : ( ( rule__FSM__Group_4__0 )? ) ;
    public final void rule__FSM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5371:1: ( ( ( rule__FSM__Group_4__0 )? ) )
            // InternalOCCI.g:5372:1: ( ( rule__FSM__Group_4__0 )? )
            {
            // InternalOCCI.g:5372:1: ( ( rule__FSM__Group_4__0 )? )
            // InternalOCCI.g:5373:2: ( rule__FSM__Group_4__0 )?
            {
             before(grammarAccess.getFSMAccess().getGroup_4()); 
            // InternalOCCI.g:5374:2: ( rule__FSM__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==74) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOCCI.g:5374:3: rule__FSM__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FSM__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFSMAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__4__Impl"


    // $ANTLR start "rule__FSM__Group__5"
    // InternalOCCI.g:5382:1: rule__FSM__Group__5 : rule__FSM__Group__5__Impl ;
    public final void rule__FSM__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5386:1: ( rule__FSM__Group__5__Impl )
            // InternalOCCI.g:5387:2: rule__FSM__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FSM__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__5"


    // $ANTLR start "rule__FSM__Group__5__Impl"
    // InternalOCCI.g:5393:1: rule__FSM__Group__5__Impl : ( ')' ) ;
    public final void rule__FSM__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5397:1: ( ( ')' ) )
            // InternalOCCI.g:5398:1: ( ')' )
            {
            // InternalOCCI.g:5398:1: ( ')' )
            // InternalOCCI.g:5399:2: ')'
            {
             before(grammarAccess.getFSMAccess().getRightParenthesisKeyword_5()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group__5__Impl"


    // $ANTLR start "rule__FSM__Group_4__0"
    // InternalOCCI.g:5409:1: rule__FSM__Group_4__0 : rule__FSM__Group_4__0__Impl rule__FSM__Group_4__1 ;
    public final void rule__FSM__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5413:1: ( rule__FSM__Group_4__0__Impl rule__FSM__Group_4__1 )
            // InternalOCCI.g:5414:2: rule__FSM__Group_4__0__Impl rule__FSM__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__FSM__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4__0"


    // $ANTLR start "rule__FSM__Group_4__0__Impl"
    // InternalOCCI.g:5421:1: rule__FSM__Group_4__0__Impl : ( 'states' ) ;
    public final void rule__FSM__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5425:1: ( ( 'states' ) )
            // InternalOCCI.g:5426:1: ( 'states' )
            {
            // InternalOCCI.g:5426:1: ( 'states' )
            // InternalOCCI.g:5427:2: 'states'
            {
             before(grammarAccess.getFSMAccess().getStatesKeyword_4_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getStatesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4__0__Impl"


    // $ANTLR start "rule__FSM__Group_4__1"
    // InternalOCCI.g:5436:1: rule__FSM__Group_4__1 : rule__FSM__Group_4__1__Impl rule__FSM__Group_4__2 ;
    public final void rule__FSM__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5440:1: ( rule__FSM__Group_4__1__Impl rule__FSM__Group_4__2 )
            // InternalOCCI.g:5441:2: rule__FSM__Group_4__1__Impl rule__FSM__Group_4__2
            {
            pushFollow(FOLLOW_35);
            rule__FSM__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4__1"


    // $ANTLR start "rule__FSM__Group_4__1__Impl"
    // InternalOCCI.g:5448:1: rule__FSM__Group_4__1__Impl : ( '{' ) ;
    public final void rule__FSM__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5452:1: ( ( '{' ) )
            // InternalOCCI.g:5453:1: ( '{' )
            {
            // InternalOCCI.g:5453:1: ( '{' )
            // InternalOCCI.g:5454:2: '{'
            {
             before(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4__1__Impl"


    // $ANTLR start "rule__FSM__Group_4__2"
    // InternalOCCI.g:5463:1: rule__FSM__Group_4__2 : rule__FSM__Group_4__2__Impl rule__FSM__Group_4__3 ;
    public final void rule__FSM__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5467:1: ( rule__FSM__Group_4__2__Impl rule__FSM__Group_4__3 )
            // InternalOCCI.g:5468:2: rule__FSM__Group_4__2__Impl rule__FSM__Group_4__3
            {
            pushFollow(FOLLOW_19);
            rule__FSM__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4__2"


    // $ANTLR start "rule__FSM__Group_4__2__Impl"
    // InternalOCCI.g:5475:1: rule__FSM__Group_4__2__Impl : ( ( rule__FSM__OwnedStateAssignment_4_2 ) ) ;
    public final void rule__FSM__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5479:1: ( ( ( rule__FSM__OwnedStateAssignment_4_2 ) ) )
            // InternalOCCI.g:5480:1: ( ( rule__FSM__OwnedStateAssignment_4_2 ) )
            {
            // InternalOCCI.g:5480:1: ( ( rule__FSM__OwnedStateAssignment_4_2 ) )
            // InternalOCCI.g:5481:2: ( rule__FSM__OwnedStateAssignment_4_2 )
            {
             before(grammarAccess.getFSMAccess().getOwnedStateAssignment_4_2()); 
            // InternalOCCI.g:5482:2: ( rule__FSM__OwnedStateAssignment_4_2 )
            // InternalOCCI.g:5482:3: rule__FSM__OwnedStateAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__FSM__OwnedStateAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getFSMAccess().getOwnedStateAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4__2__Impl"


    // $ANTLR start "rule__FSM__Group_4__3"
    // InternalOCCI.g:5490:1: rule__FSM__Group_4__3 : rule__FSM__Group_4__3__Impl rule__FSM__Group_4__4 ;
    public final void rule__FSM__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5494:1: ( rule__FSM__Group_4__3__Impl rule__FSM__Group_4__4 )
            // InternalOCCI.g:5495:2: rule__FSM__Group_4__3__Impl rule__FSM__Group_4__4
            {
            pushFollow(FOLLOW_19);
            rule__FSM__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4__3"


    // $ANTLR start "rule__FSM__Group_4__3__Impl"
    // InternalOCCI.g:5502:1: rule__FSM__Group_4__3__Impl : ( ( rule__FSM__Group_4_3__0 )* ) ;
    public final void rule__FSM__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5506:1: ( ( ( rule__FSM__Group_4_3__0 )* ) )
            // InternalOCCI.g:5507:1: ( ( rule__FSM__Group_4_3__0 )* )
            {
            // InternalOCCI.g:5507:1: ( ( rule__FSM__Group_4_3__0 )* )
            // InternalOCCI.g:5508:2: ( rule__FSM__Group_4_3__0 )*
            {
             before(grammarAccess.getFSMAccess().getGroup_4_3()); 
            // InternalOCCI.g:5509:2: ( rule__FSM__Group_4_3__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==71) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalOCCI.g:5509:3: rule__FSM__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FSM__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getFSMAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4__3__Impl"


    // $ANTLR start "rule__FSM__Group_4__4"
    // InternalOCCI.g:5517:1: rule__FSM__Group_4__4 : rule__FSM__Group_4__4__Impl ;
    public final void rule__FSM__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5521:1: ( rule__FSM__Group_4__4__Impl )
            // InternalOCCI.g:5522:2: rule__FSM__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FSM__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4__4"


    // $ANTLR start "rule__FSM__Group_4__4__Impl"
    // InternalOCCI.g:5528:1: rule__FSM__Group_4__4__Impl : ( '}' ) ;
    public final void rule__FSM__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5532:1: ( ( '}' ) )
            // InternalOCCI.g:5533:1: ( '}' )
            {
            // InternalOCCI.g:5533:1: ( '}' )
            // InternalOCCI.g:5534:2: '}'
            {
             before(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4__4__Impl"


    // $ANTLR start "rule__FSM__Group_4_3__0"
    // InternalOCCI.g:5544:1: rule__FSM__Group_4_3__0 : rule__FSM__Group_4_3__0__Impl rule__FSM__Group_4_3__1 ;
    public final void rule__FSM__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5548:1: ( rule__FSM__Group_4_3__0__Impl rule__FSM__Group_4_3__1 )
            // InternalOCCI.g:5549:2: rule__FSM__Group_4_3__0__Impl rule__FSM__Group_4_3__1
            {
            pushFollow(FOLLOW_35);
            rule__FSM__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FSM__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4_3__0"


    // $ANTLR start "rule__FSM__Group_4_3__0__Impl"
    // InternalOCCI.g:5556:1: rule__FSM__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__FSM__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5560:1: ( ( ',' ) )
            // InternalOCCI.g:5561:1: ( ',' )
            {
            // InternalOCCI.g:5561:1: ( ',' )
            // InternalOCCI.g:5562:2: ','
            {
             before(grammarAccess.getFSMAccess().getCommaKeyword_4_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4_3__0__Impl"


    // $ANTLR start "rule__FSM__Group_4_3__1"
    // InternalOCCI.g:5571:1: rule__FSM__Group_4_3__1 : rule__FSM__Group_4_3__1__Impl ;
    public final void rule__FSM__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5575:1: ( rule__FSM__Group_4_3__1__Impl )
            // InternalOCCI.g:5576:2: rule__FSM__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FSM__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4_3__1"


    // $ANTLR start "rule__FSM__Group_4_3__1__Impl"
    // InternalOCCI.g:5582:1: rule__FSM__Group_4_3__1__Impl : ( ( rule__FSM__OwnedStateAssignment_4_3_1 ) ) ;
    public final void rule__FSM__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5586:1: ( ( ( rule__FSM__OwnedStateAssignment_4_3_1 ) ) )
            // InternalOCCI.g:5587:1: ( ( rule__FSM__OwnedStateAssignment_4_3_1 ) )
            {
            // InternalOCCI.g:5587:1: ( ( rule__FSM__OwnedStateAssignment_4_3_1 ) )
            // InternalOCCI.g:5588:2: ( rule__FSM__OwnedStateAssignment_4_3_1 )
            {
             before(grammarAccess.getFSMAccess().getOwnedStateAssignment_4_3_1()); 
            // InternalOCCI.g:5589:2: ( rule__FSM__OwnedStateAssignment_4_3_1 )
            // InternalOCCI.g:5589:3: rule__FSM__OwnedStateAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FSM__OwnedStateAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFSMAccess().getOwnedStateAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__Group_4_3__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalOCCI.g:5598:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5602:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalOCCI.g:5603:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalOCCI.g:5610:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5614:1: ( ( 'State' ) )
            // InternalOCCI.g:5615:1: ( 'State' )
            {
            // InternalOCCI.g:5615:1: ( 'State' )
            // InternalOCCI.g:5616:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalOCCI.g:5625:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5629:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalOCCI.g:5630:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalOCCI.g:5637:1: rule__State__Group__1__Impl : ( '(' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5641:1: ( ( '(' ) )
            // InternalOCCI.g:5642:1: ( '(' )
            {
            // InternalOCCI.g:5642:1: ( '(' )
            // InternalOCCI.g:5643:2: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalOCCI.g:5652:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5656:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalOCCI.g:5657:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalOCCI.g:5664:1: rule__State__Group__2__Impl : ( ( rule__State__InitialAssignment_2 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5668:1: ( ( ( rule__State__InitialAssignment_2 )? ) )
            // InternalOCCI.g:5669:1: ( ( rule__State__InitialAssignment_2 )? )
            {
            // InternalOCCI.g:5669:1: ( ( rule__State__InitialAssignment_2 )? )
            // InternalOCCI.g:5670:2: ( rule__State__InitialAssignment_2 )?
            {
             before(grammarAccess.getStateAccess().getInitialAssignment_2()); 
            // InternalOCCI.g:5671:2: ( rule__State__InitialAssignment_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==79) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOCCI.g:5671:3: rule__State__InitialAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__InitialAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getInitialAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalOCCI.g:5679:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5683:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalOCCI.g:5684:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalOCCI.g:5691:1: rule__State__Group__3__Impl : ( ( rule__State__FinalAssignment_3 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5695:1: ( ( ( rule__State__FinalAssignment_3 )? ) )
            // InternalOCCI.g:5696:1: ( ( rule__State__FinalAssignment_3 )? )
            {
            // InternalOCCI.g:5696:1: ( ( rule__State__FinalAssignment_3 )? )
            // InternalOCCI.g:5697:2: ( rule__State__FinalAssignment_3 )?
            {
             before(grammarAccess.getStateAccess().getFinalAssignment_3()); 
            // InternalOCCI.g:5698:2: ( rule__State__FinalAssignment_3 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==80) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalOCCI.g:5698:3: rule__State__FinalAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__FinalAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getFinalAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalOCCI.g:5706:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5710:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalOCCI.g:5711:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalOCCI.g:5718:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5722:1: ( ( ( rule__State__Group_4__0 ) ) )
            // InternalOCCI.g:5723:1: ( ( rule__State__Group_4__0 ) )
            {
            // InternalOCCI.g:5723:1: ( ( rule__State__Group_4__0 ) )
            // InternalOCCI.g:5724:2: ( rule__State__Group_4__0 )
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // InternalOCCI.g:5725:2: ( rule__State__Group_4__0 )
            // InternalOCCI.g:5725:3: rule__State__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // InternalOCCI.g:5733:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5737:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // InternalOCCI.g:5738:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__State__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // InternalOCCI.g:5745:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5749:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalOCCI.g:5750:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalOCCI.g:5750:1: ( ( rule__State__Group_5__0 )? )
            // InternalOCCI.g:5751:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalOCCI.g:5752:2: ( rule__State__Group_5__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==77) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOCCI.g:5752:3: rule__State__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group__6"
    // InternalOCCI.g:5760:1: rule__State__Group__6 : rule__State__Group__6__Impl ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5764:1: ( rule__State__Group__6__Impl )
            // InternalOCCI.g:5765:2: rule__State__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6"


    // $ANTLR start "rule__State__Group__6__Impl"
    // InternalOCCI.g:5771:1: rule__State__Group__6__Impl : ( ')' ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5775:1: ( ( ')' ) )
            // InternalOCCI.g:5776:1: ( ')' )
            {
            // InternalOCCI.g:5776:1: ( ')' )
            // InternalOCCI.g:5777:2: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_6()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__6__Impl"


    // $ANTLR start "rule__State__Group_4__0"
    // InternalOCCI.g:5787:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5791:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // InternalOCCI.g:5792:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__State__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__0"


    // $ANTLR start "rule__State__Group_4__0__Impl"
    // InternalOCCI.g:5799:1: rule__State__Group_4__0__Impl : ( 'literal' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5803:1: ( ( 'literal' ) )
            // InternalOCCI.g:5804:1: ( 'literal' )
            {
            // InternalOCCI.g:5804:1: ( 'literal' )
            // InternalOCCI.g:5805:2: 'literal'
            {
             before(grammarAccess.getStateAccess().getLiteralKeyword_4_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLiteralKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__0__Impl"


    // $ANTLR start "rule__State__Group_4__1"
    // InternalOCCI.g:5814:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5818:1: ( rule__State__Group_4__1__Impl )
            // InternalOCCI.g:5819:2: rule__State__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__1"


    // $ANTLR start "rule__State__Group_4__1__Impl"
    // InternalOCCI.g:5825:1: rule__State__Group_4__1__Impl : ( ( rule__State__LiteralAssignment_4_1 ) ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5829:1: ( ( ( rule__State__LiteralAssignment_4_1 ) ) )
            // InternalOCCI.g:5830:1: ( ( rule__State__LiteralAssignment_4_1 ) )
            {
            // InternalOCCI.g:5830:1: ( ( rule__State__LiteralAssignment_4_1 ) )
            // InternalOCCI.g:5831:2: ( rule__State__LiteralAssignment_4_1 )
            {
             before(grammarAccess.getStateAccess().getLiteralAssignment_4_1()); 
            // InternalOCCI.g:5832:2: ( rule__State__LiteralAssignment_4_1 )
            // InternalOCCI.g:5832:3: rule__State__LiteralAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__State__LiteralAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getLiteralAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_4__1__Impl"


    // $ANTLR start "rule__State__Group_5__0"
    // InternalOCCI.g:5841:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5845:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalOCCI.g:5846:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__State__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0"


    // $ANTLR start "rule__State__Group_5__0__Impl"
    // InternalOCCI.g:5853:1: rule__State__Group_5__0__Impl : ( 'transitions' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5857:1: ( ( 'transitions' ) )
            // InternalOCCI.g:5858:1: ( 'transitions' )
            {
            // InternalOCCI.g:5858:1: ( 'transitions' )
            // InternalOCCI.g:5859:2: 'transitions'
            {
             before(grammarAccess.getStateAccess().getTransitionsKeyword_5_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getTransitionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0__Impl"


    // $ANTLR start "rule__State__Group_5__1"
    // InternalOCCI.g:5868:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5872:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // InternalOCCI.g:5873:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
            {
            pushFollow(FOLLOW_38);
            rule__State__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1"


    // $ANTLR start "rule__State__Group_5__1__Impl"
    // InternalOCCI.g:5880:1: rule__State__Group_5__1__Impl : ( '(' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5884:1: ( ( '(' ) )
            // InternalOCCI.g:5885:1: ( '(' )
            {
            // InternalOCCI.g:5885:1: ( '(' )
            // InternalOCCI.g:5886:2: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1__Impl"


    // $ANTLR start "rule__State__Group_5__2"
    // InternalOCCI.g:5895:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5899:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // InternalOCCI.g:5900:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
            {
            pushFollow(FOLLOW_23);
            rule__State__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__2"


    // $ANTLR start "rule__State__Group_5__2__Impl"
    // InternalOCCI.g:5907:1: rule__State__Group_5__2__Impl : ( ( rule__State__OutgoingTransitionAssignment_5_2 ) ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5911:1: ( ( ( rule__State__OutgoingTransitionAssignment_5_2 ) ) )
            // InternalOCCI.g:5912:1: ( ( rule__State__OutgoingTransitionAssignment_5_2 ) )
            {
            // InternalOCCI.g:5912:1: ( ( rule__State__OutgoingTransitionAssignment_5_2 ) )
            // InternalOCCI.g:5913:2: ( rule__State__OutgoingTransitionAssignment_5_2 )
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_2()); 
            // InternalOCCI.g:5914:2: ( rule__State__OutgoingTransitionAssignment_5_2 )
            // InternalOCCI.g:5914:3: rule__State__OutgoingTransitionAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__State__OutgoingTransitionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__2__Impl"


    // $ANTLR start "rule__State__Group_5__3"
    // InternalOCCI.g:5922:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5926:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // InternalOCCI.g:5927:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
            {
            pushFollow(FOLLOW_23);
            rule__State__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__3"


    // $ANTLR start "rule__State__Group_5__3__Impl"
    // InternalOCCI.g:5934:1: rule__State__Group_5__3__Impl : ( ( rule__State__Group_5_3__0 )* ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5938:1: ( ( ( rule__State__Group_5_3__0 )* ) )
            // InternalOCCI.g:5939:1: ( ( rule__State__Group_5_3__0 )* )
            {
            // InternalOCCI.g:5939:1: ( ( rule__State__Group_5_3__0 )* )
            // InternalOCCI.g:5940:2: ( rule__State__Group_5_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_3()); 
            // InternalOCCI.g:5941:2: ( rule__State__Group_5_3__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==71) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalOCCI.g:5941:3: rule__State__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__State__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__3__Impl"


    // $ANTLR start "rule__State__Group_5__4"
    // InternalOCCI.g:5949:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5953:1: ( rule__State__Group_5__4__Impl )
            // InternalOCCI.g:5954:2: rule__State__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__4"


    // $ANTLR start "rule__State__Group_5__4__Impl"
    // InternalOCCI.g:5960:1: rule__State__Group_5__4__Impl : ( ')' ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5964:1: ( ( ')' ) )
            // InternalOCCI.g:5965:1: ( ')' )
            {
            // InternalOCCI.g:5965:1: ( ')' )
            // InternalOCCI.g:5966:2: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__4__Impl"


    // $ANTLR start "rule__State__Group_5_3__0"
    // InternalOCCI.g:5976:1: rule__State__Group_5_3__0 : rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 ;
    public final void rule__State__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5980:1: ( rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 )
            // InternalOCCI.g:5981:2: rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1
            {
            pushFollow(FOLLOW_38);
            rule__State__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__0"


    // $ANTLR start "rule__State__Group_5_3__0__Impl"
    // InternalOCCI.g:5988:1: rule__State__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5992:1: ( ( ',' ) )
            // InternalOCCI.g:5993:1: ( ',' )
            {
            // InternalOCCI.g:5993:1: ( ',' )
            // InternalOCCI.g:5994:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__0__Impl"


    // $ANTLR start "rule__State__Group_5_3__1"
    // InternalOCCI.g:6003:1: rule__State__Group_5_3__1 : rule__State__Group_5_3__1__Impl ;
    public final void rule__State__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6007:1: ( rule__State__Group_5_3__1__Impl )
            // InternalOCCI.g:6008:2: rule__State__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__1"


    // $ANTLR start "rule__State__Group_5_3__1__Impl"
    // InternalOCCI.g:6014:1: rule__State__Group_5_3__1__Impl : ( ( rule__State__OutgoingTransitionAssignment_5_3_1 ) ) ;
    public final void rule__State__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6018:1: ( ( ( rule__State__OutgoingTransitionAssignment_5_3_1 ) ) )
            // InternalOCCI.g:6019:1: ( ( rule__State__OutgoingTransitionAssignment_5_3_1 ) )
            {
            // InternalOCCI.g:6019:1: ( ( rule__State__OutgoingTransitionAssignment_5_3_1 ) )
            // InternalOCCI.g:6020:2: ( rule__State__OutgoingTransitionAssignment_5_3_1 )
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_3_1()); 
            // InternalOCCI.g:6021:2: ( rule__State__OutgoingTransitionAssignment_5_3_1 )
            // InternalOCCI.g:6021:3: rule__State__OutgoingTransitionAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__State__OutgoingTransitionAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_3__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalOCCI.g:6030:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6034:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalOCCI.g:6035:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalOCCI.g:6042:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Group_0__0 )? ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6046:1: ( ( ( rule__Transition__Group_0__0 )? ) )
            // InternalOCCI.g:6047:1: ( ( rule__Transition__Group_0__0 )? )
            {
            // InternalOCCI.g:6047:1: ( ( rule__Transition__Group_0__0 )? )
            // InternalOCCI.g:6048:2: ( rule__Transition__Group_0__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_0()); 
            // InternalOCCI.g:6049:2: ( rule__Transition__Group_0__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==34) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOCCI.g:6049:3: rule__Transition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalOCCI.g:6057:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6061:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalOCCI.g:6062:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalOCCI.g:6069:1: rule__Transition__Group__1__Impl : ( 'to' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6073:1: ( ( 'to' ) )
            // InternalOCCI.g:6074:1: ( 'to' )
            {
            // InternalOCCI.g:6074:1: ( 'to' )
            // InternalOCCI.g:6075:2: 'to'
            {
             before(grammarAccess.getTransitionAccess().getToKeyword_1()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalOCCI.g:6084:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6088:1: ( rule__Transition__Group__2__Impl )
            // InternalOCCI.g:6089:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalOCCI.g:6095:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__TargetAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6099:1: ( ( ( rule__Transition__TargetAssignment_2 ) ) )
            // InternalOCCI.g:6100:1: ( ( rule__Transition__TargetAssignment_2 ) )
            {
            // InternalOCCI.g:6100:1: ( ( rule__Transition__TargetAssignment_2 ) )
            // InternalOCCI.g:6101:2: ( rule__Transition__TargetAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_2()); 
            // InternalOCCI.g:6102:2: ( rule__Transition__TargetAssignment_2 )
            // InternalOCCI.g:6102:3: rule__Transition__TargetAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group_0__0"
    // InternalOCCI.g:6111:1: rule__Transition__Group_0__0 : rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 ;
    public final void rule__Transition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6115:1: ( rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 )
            // InternalOCCI.g:6116:2: rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Transition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__0"


    // $ANTLR start "rule__Transition__Group_0__0__Impl"
    // InternalOCCI.g:6123:1: rule__Transition__Group_0__0__Impl : ( 'action' ) ;
    public final void rule__Transition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6127:1: ( ( 'action' ) )
            // InternalOCCI.g:6128:1: ( 'action' )
            {
            // InternalOCCI.g:6128:1: ( 'action' )
            // InternalOCCI.g:6129:2: 'action'
            {
             before(grammarAccess.getTransitionAccess().getActionKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getActionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_0__1"
    // InternalOCCI.g:6138:1: rule__Transition__Group_0__1 : rule__Transition__Group_0__1__Impl ;
    public final void rule__Transition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6142:1: ( rule__Transition__Group_0__1__Impl )
            // InternalOCCI.g:6143:2: rule__Transition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__1"


    // $ANTLR start "rule__Transition__Group_0__1__Impl"
    // InternalOCCI.g:6149:1: rule__Transition__Group_0__1__Impl : ( ( rule__Transition__ActionAssignment_0_1 ) ) ;
    public final void rule__Transition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6153:1: ( ( ( rule__Transition__ActionAssignment_0_1 ) ) )
            // InternalOCCI.g:6154:1: ( ( rule__Transition__ActionAssignment_0_1 ) )
            {
            // InternalOCCI.g:6154:1: ( ( rule__Transition__ActionAssignment_0_1 ) )
            // InternalOCCI.g:6155:2: ( rule__Transition__ActionAssignment_0_1 )
            {
             before(grammarAccess.getTransitionAccess().getActionAssignment_0_1()); 
            // InternalOCCI.g:6156:2: ( rule__Transition__ActionAssignment_0_1 )
            // InternalOCCI.g:6156:3: rule__Transition__ActionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ActionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getActionAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_0__1__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // InternalOCCI.g:6165:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6169:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalOCCI.g:6170:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // InternalOCCI.g:6177:1: rule__StringType__Group__0__Impl : ( 'StringType' ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6181:1: ( ( 'StringType' ) )
            // InternalOCCI.g:6182:1: ( 'StringType' )
            {
            // InternalOCCI.g:6182:1: ( 'StringType' )
            // InternalOCCI.g:6183:2: 'StringType'
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getStringTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // InternalOCCI.g:6192:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl rule__StringType__Group__2 ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6196:1: ( rule__StringType__Group__1__Impl rule__StringType__Group__2 )
            // InternalOCCI.g:6197:2: rule__StringType__Group__1__Impl rule__StringType__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__StringType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // InternalOCCI.g:6204:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__NameAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6208:1: ( ( ( rule__StringType__NameAssignment_1 ) ) )
            // InternalOCCI.g:6209:1: ( ( rule__StringType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:6209:1: ( ( rule__StringType__NameAssignment_1 ) )
            // InternalOCCI.g:6210:2: ( rule__StringType__NameAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:6211:2: ( rule__StringType__NameAssignment_1 )
            // InternalOCCI.g:6211:3: rule__StringType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__2"
    // InternalOCCI.g:6219:1: rule__StringType__Group__2 : rule__StringType__Group__2__Impl rule__StringType__Group__3 ;
    public final void rule__StringType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6223:1: ( rule__StringType__Group__2__Impl rule__StringType__Group__3 )
            // InternalOCCI.g:6224:2: rule__StringType__Group__2__Impl rule__StringType__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__StringType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__2"


    // $ANTLR start "rule__StringType__Group__2__Impl"
    // InternalOCCI.g:6231:1: rule__StringType__Group__2__Impl : ( ( rule__StringType__Group_2__0 )? ) ;
    public final void rule__StringType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6235:1: ( ( ( rule__StringType__Group_2__0 )? ) )
            // InternalOCCI.g:6236:1: ( ( rule__StringType__Group_2__0 )? )
            {
            // InternalOCCI.g:6236:1: ( ( rule__StringType__Group_2__0 )? )
            // InternalOCCI.g:6237:2: ( rule__StringType__Group_2__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_2()); 
            // InternalOCCI.g:6238:2: ( rule__StringType__Group_2__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==39) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOCCI.g:6238:3: rule__StringType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__2__Impl"


    // $ANTLR start "rule__StringType__Group__3"
    // InternalOCCI.g:6246:1: rule__StringType__Group__3 : rule__StringType__Group__3__Impl rule__StringType__Group__4 ;
    public final void rule__StringType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6250:1: ( rule__StringType__Group__3__Impl rule__StringType__Group__4 )
            // InternalOCCI.g:6251:2: rule__StringType__Group__3__Impl rule__StringType__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__StringType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__3"


    // $ANTLR start "rule__StringType__Group__3__Impl"
    // InternalOCCI.g:6258:1: rule__StringType__Group__3__Impl : ( ( rule__StringType__Group_3__0 )? ) ;
    public final void rule__StringType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6262:1: ( ( ( rule__StringType__Group_3__0 )? ) )
            // InternalOCCI.g:6263:1: ( ( rule__StringType__Group_3__0 )? )
            {
            // InternalOCCI.g:6263:1: ( ( rule__StringType__Group_3__0 )? )
            // InternalOCCI.g:6264:2: ( rule__StringType__Group_3__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_3()); 
            // InternalOCCI.g:6265:2: ( rule__StringType__Group_3__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==40) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOCCI.g:6265:3: rule__StringType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__3__Impl"


    // $ANTLR start "rule__StringType__Group__4"
    // InternalOCCI.g:6273:1: rule__StringType__Group__4 : rule__StringType__Group__4__Impl rule__StringType__Group__5 ;
    public final void rule__StringType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6277:1: ( rule__StringType__Group__4__Impl rule__StringType__Group__5 )
            // InternalOCCI.g:6278:2: rule__StringType__Group__4__Impl rule__StringType__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__StringType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__4"


    // $ANTLR start "rule__StringType__Group__4__Impl"
    // InternalOCCI.g:6285:1: rule__StringType__Group__4__Impl : ( ( rule__StringType__Group_4__0 )? ) ;
    public final void rule__StringType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6289:1: ( ( ( rule__StringType__Group_4__0 )? ) )
            // InternalOCCI.g:6290:1: ( ( rule__StringType__Group_4__0 )? )
            {
            // InternalOCCI.g:6290:1: ( ( rule__StringType__Group_4__0 )? )
            // InternalOCCI.g:6291:2: ( rule__StringType__Group_4__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_4()); 
            // InternalOCCI.g:6292:2: ( rule__StringType__Group_4__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==41) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOCCI.g:6292:3: rule__StringType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__4__Impl"


    // $ANTLR start "rule__StringType__Group__5"
    // InternalOCCI.g:6300:1: rule__StringType__Group__5 : rule__StringType__Group__5__Impl rule__StringType__Group__6 ;
    public final void rule__StringType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6304:1: ( rule__StringType__Group__5__Impl rule__StringType__Group__6 )
            // InternalOCCI.g:6305:2: rule__StringType__Group__5__Impl rule__StringType__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__StringType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__5"


    // $ANTLR start "rule__StringType__Group__5__Impl"
    // InternalOCCI.g:6312:1: rule__StringType__Group__5__Impl : ( ( rule__StringType__Group_5__0 )? ) ;
    public final void rule__StringType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6316:1: ( ( ( rule__StringType__Group_5__0 )? ) )
            // InternalOCCI.g:6317:1: ( ( rule__StringType__Group_5__0 )? )
            {
            // InternalOCCI.g:6317:1: ( ( rule__StringType__Group_5__0 )? )
            // InternalOCCI.g:6318:2: ( rule__StringType__Group_5__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_5()); 
            // InternalOCCI.g:6319:2: ( rule__StringType__Group_5__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==42) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOCCI.g:6319:3: rule__StringType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__5__Impl"


    // $ANTLR start "rule__StringType__Group__6"
    // InternalOCCI.g:6327:1: rule__StringType__Group__6 : rule__StringType__Group__6__Impl ;
    public final void rule__StringType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6331:1: ( rule__StringType__Group__6__Impl )
            // InternalOCCI.g:6332:2: rule__StringType__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__6"


    // $ANTLR start "rule__StringType__Group__6__Impl"
    // InternalOCCI.g:6338:1: rule__StringType__Group__6__Impl : ( ( rule__StringType__Group_6__0 )? ) ;
    public final void rule__StringType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6342:1: ( ( ( rule__StringType__Group_6__0 )? ) )
            // InternalOCCI.g:6343:1: ( ( rule__StringType__Group_6__0 )? )
            {
            // InternalOCCI.g:6343:1: ( ( rule__StringType__Group_6__0 )? )
            // InternalOCCI.g:6344:2: ( rule__StringType__Group_6__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_6()); 
            // InternalOCCI.g:6345:2: ( rule__StringType__Group_6__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==38) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalOCCI.g:6345:3: rule__StringType__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__6__Impl"


    // $ANTLR start "rule__StringType__Group_2__0"
    // InternalOCCI.g:6354:1: rule__StringType__Group_2__0 : rule__StringType__Group_2__0__Impl rule__StringType__Group_2__1 ;
    public final void rule__StringType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6358:1: ( rule__StringType__Group_2__0__Impl rule__StringType__Group_2__1 )
            // InternalOCCI.g:6359:2: rule__StringType__Group_2__0__Impl rule__StringType__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__StringType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2__0"


    // $ANTLR start "rule__StringType__Group_2__0__Impl"
    // InternalOCCI.g:6366:1: rule__StringType__Group_2__0__Impl : ( 'pattern' ) ;
    public final void rule__StringType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6370:1: ( ( 'pattern' ) )
            // InternalOCCI.g:6371:1: ( 'pattern' )
            {
            // InternalOCCI.g:6371:1: ( 'pattern' )
            // InternalOCCI.g:6372:2: 'pattern'
            {
             before(grammarAccess.getStringTypeAccess().getPatternKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getPatternKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2__0__Impl"


    // $ANTLR start "rule__StringType__Group_2__1"
    // InternalOCCI.g:6381:1: rule__StringType__Group_2__1 : rule__StringType__Group_2__1__Impl ;
    public final void rule__StringType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6385:1: ( rule__StringType__Group_2__1__Impl )
            // InternalOCCI.g:6386:2: rule__StringType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2__1"


    // $ANTLR start "rule__StringType__Group_2__1__Impl"
    // InternalOCCI.g:6392:1: rule__StringType__Group_2__1__Impl : ( ( rule__StringType__PatternAssignment_2_1 ) ) ;
    public final void rule__StringType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6396:1: ( ( ( rule__StringType__PatternAssignment_2_1 ) ) )
            // InternalOCCI.g:6397:1: ( ( rule__StringType__PatternAssignment_2_1 ) )
            {
            // InternalOCCI.g:6397:1: ( ( rule__StringType__PatternAssignment_2_1 ) )
            // InternalOCCI.g:6398:2: ( rule__StringType__PatternAssignment_2_1 )
            {
             before(grammarAccess.getStringTypeAccess().getPatternAssignment_2_1()); 
            // InternalOCCI.g:6399:2: ( rule__StringType__PatternAssignment_2_1 )
            // InternalOCCI.g:6399:3: rule__StringType__PatternAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__PatternAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getPatternAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_2__1__Impl"


    // $ANTLR start "rule__StringType__Group_3__0"
    // InternalOCCI.g:6408:1: rule__StringType__Group_3__0 : rule__StringType__Group_3__0__Impl rule__StringType__Group_3__1 ;
    public final void rule__StringType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6412:1: ( rule__StringType__Group_3__0__Impl rule__StringType__Group_3__1 )
            // InternalOCCI.g:6413:2: rule__StringType__Group_3__0__Impl rule__StringType__Group_3__1
            {
            pushFollow(FOLLOW_40);
            rule__StringType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_3__0"


    // $ANTLR start "rule__StringType__Group_3__0__Impl"
    // InternalOCCI.g:6420:1: rule__StringType__Group_3__0__Impl : ( 'length' ) ;
    public final void rule__StringType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6424:1: ( ( 'length' ) )
            // InternalOCCI.g:6425:1: ( 'length' )
            {
            // InternalOCCI.g:6425:1: ( 'length' )
            // InternalOCCI.g:6426:2: 'length'
            {
             before(grammarAccess.getStringTypeAccess().getLengthKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getLengthKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_3__0__Impl"


    // $ANTLR start "rule__StringType__Group_3__1"
    // InternalOCCI.g:6435:1: rule__StringType__Group_3__1 : rule__StringType__Group_3__1__Impl ;
    public final void rule__StringType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6439:1: ( rule__StringType__Group_3__1__Impl )
            // InternalOCCI.g:6440:2: rule__StringType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_3__1"


    // $ANTLR start "rule__StringType__Group_3__1__Impl"
    // InternalOCCI.g:6446:1: rule__StringType__Group_3__1__Impl : ( ( rule__StringType__LengthAssignment_3_1 ) ) ;
    public final void rule__StringType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6450:1: ( ( ( rule__StringType__LengthAssignment_3_1 ) ) )
            // InternalOCCI.g:6451:1: ( ( rule__StringType__LengthAssignment_3_1 ) )
            {
            // InternalOCCI.g:6451:1: ( ( rule__StringType__LengthAssignment_3_1 ) )
            // InternalOCCI.g:6452:2: ( rule__StringType__LengthAssignment_3_1 )
            {
             before(grammarAccess.getStringTypeAccess().getLengthAssignment_3_1()); 
            // InternalOCCI.g:6453:2: ( rule__StringType__LengthAssignment_3_1 )
            // InternalOCCI.g:6453:3: rule__StringType__LengthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__LengthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getLengthAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_3__1__Impl"


    // $ANTLR start "rule__StringType__Group_4__0"
    // InternalOCCI.g:6462:1: rule__StringType__Group_4__0 : rule__StringType__Group_4__0__Impl rule__StringType__Group_4__1 ;
    public final void rule__StringType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6466:1: ( rule__StringType__Group_4__0__Impl rule__StringType__Group_4__1 )
            // InternalOCCI.g:6467:2: rule__StringType__Group_4__0__Impl rule__StringType__Group_4__1
            {
            pushFollow(FOLLOW_40);
            rule__StringType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_4__0"


    // $ANTLR start "rule__StringType__Group_4__0__Impl"
    // InternalOCCI.g:6474:1: rule__StringType__Group_4__0__Impl : ( 'minLength' ) ;
    public final void rule__StringType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6478:1: ( ( 'minLength' ) )
            // InternalOCCI.g:6479:1: ( 'minLength' )
            {
            // InternalOCCI.g:6479:1: ( 'minLength' )
            // InternalOCCI.g:6480:2: 'minLength'
            {
             before(grammarAccess.getStringTypeAccess().getMinLengthKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getMinLengthKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_4__0__Impl"


    // $ANTLR start "rule__StringType__Group_4__1"
    // InternalOCCI.g:6489:1: rule__StringType__Group_4__1 : rule__StringType__Group_4__1__Impl ;
    public final void rule__StringType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6493:1: ( rule__StringType__Group_4__1__Impl )
            // InternalOCCI.g:6494:2: rule__StringType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_4__1"


    // $ANTLR start "rule__StringType__Group_4__1__Impl"
    // InternalOCCI.g:6500:1: rule__StringType__Group_4__1__Impl : ( ( rule__StringType__MinLengthAssignment_4_1 ) ) ;
    public final void rule__StringType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6504:1: ( ( ( rule__StringType__MinLengthAssignment_4_1 ) ) )
            // InternalOCCI.g:6505:1: ( ( rule__StringType__MinLengthAssignment_4_1 ) )
            {
            // InternalOCCI.g:6505:1: ( ( rule__StringType__MinLengthAssignment_4_1 ) )
            // InternalOCCI.g:6506:2: ( rule__StringType__MinLengthAssignment_4_1 )
            {
             before(grammarAccess.getStringTypeAccess().getMinLengthAssignment_4_1()); 
            // InternalOCCI.g:6507:2: ( rule__StringType__MinLengthAssignment_4_1 )
            // InternalOCCI.g:6507:3: rule__StringType__MinLengthAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__MinLengthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getMinLengthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_4__1__Impl"


    // $ANTLR start "rule__StringType__Group_5__0"
    // InternalOCCI.g:6516:1: rule__StringType__Group_5__0 : rule__StringType__Group_5__0__Impl rule__StringType__Group_5__1 ;
    public final void rule__StringType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6520:1: ( rule__StringType__Group_5__0__Impl rule__StringType__Group_5__1 )
            // InternalOCCI.g:6521:2: rule__StringType__Group_5__0__Impl rule__StringType__Group_5__1
            {
            pushFollow(FOLLOW_40);
            rule__StringType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_5__0"


    // $ANTLR start "rule__StringType__Group_5__0__Impl"
    // InternalOCCI.g:6528:1: rule__StringType__Group_5__0__Impl : ( 'maxLength' ) ;
    public final void rule__StringType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6532:1: ( ( 'maxLength' ) )
            // InternalOCCI.g:6533:1: ( 'maxLength' )
            {
            // InternalOCCI.g:6533:1: ( 'maxLength' )
            // InternalOCCI.g:6534:2: 'maxLength'
            {
             before(grammarAccess.getStringTypeAccess().getMaxLengthKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getMaxLengthKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_5__0__Impl"


    // $ANTLR start "rule__StringType__Group_5__1"
    // InternalOCCI.g:6543:1: rule__StringType__Group_5__1 : rule__StringType__Group_5__1__Impl ;
    public final void rule__StringType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6547:1: ( rule__StringType__Group_5__1__Impl )
            // InternalOCCI.g:6548:2: rule__StringType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_5__1"


    // $ANTLR start "rule__StringType__Group_5__1__Impl"
    // InternalOCCI.g:6554:1: rule__StringType__Group_5__1__Impl : ( ( rule__StringType__MaxLengthAssignment_5_1 ) ) ;
    public final void rule__StringType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6558:1: ( ( ( rule__StringType__MaxLengthAssignment_5_1 ) ) )
            // InternalOCCI.g:6559:1: ( ( rule__StringType__MaxLengthAssignment_5_1 ) )
            {
            // InternalOCCI.g:6559:1: ( ( rule__StringType__MaxLengthAssignment_5_1 ) )
            // InternalOCCI.g:6560:2: ( rule__StringType__MaxLengthAssignment_5_1 )
            {
             before(grammarAccess.getStringTypeAccess().getMaxLengthAssignment_5_1()); 
            // InternalOCCI.g:6561:2: ( rule__StringType__MaxLengthAssignment_5_1 )
            // InternalOCCI.g:6561:3: rule__StringType__MaxLengthAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__MaxLengthAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getMaxLengthAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_5__1__Impl"


    // $ANTLR start "rule__StringType__Group_6__0"
    // InternalOCCI.g:6570:1: rule__StringType__Group_6__0 : rule__StringType__Group_6__0__Impl rule__StringType__Group_6__1 ;
    public final void rule__StringType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6574:1: ( rule__StringType__Group_6__0__Impl rule__StringType__Group_6__1 )
            // InternalOCCI.g:6575:2: rule__StringType__Group_6__0__Impl rule__StringType__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__StringType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_6__0"


    // $ANTLR start "rule__StringType__Group_6__0__Impl"
    // InternalOCCI.g:6582:1: rule__StringType__Group_6__0__Impl : ( 'documentation' ) ;
    public final void rule__StringType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6586:1: ( ( 'documentation' ) )
            // InternalOCCI.g:6587:1: ( 'documentation' )
            {
            // InternalOCCI.g:6587:1: ( 'documentation' )
            // InternalOCCI.g:6588:2: 'documentation'
            {
             before(grammarAccess.getStringTypeAccess().getDocumentationKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getDocumentationKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_6__0__Impl"


    // $ANTLR start "rule__StringType__Group_6__1"
    // InternalOCCI.g:6597:1: rule__StringType__Group_6__1 : rule__StringType__Group_6__1__Impl ;
    public final void rule__StringType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6601:1: ( rule__StringType__Group_6__1__Impl )
            // InternalOCCI.g:6602:2: rule__StringType__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_6__1"


    // $ANTLR start "rule__StringType__Group_6__1__Impl"
    // InternalOCCI.g:6608:1: rule__StringType__Group_6__1__Impl : ( ( rule__StringType__DocumentationAssignment_6_1 ) ) ;
    public final void rule__StringType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6612:1: ( ( ( rule__StringType__DocumentationAssignment_6_1 ) ) )
            // InternalOCCI.g:6613:1: ( ( rule__StringType__DocumentationAssignment_6_1 ) )
            {
            // InternalOCCI.g:6613:1: ( ( rule__StringType__DocumentationAssignment_6_1 ) )
            // InternalOCCI.g:6614:2: ( rule__StringType__DocumentationAssignment_6_1 )
            {
             before(grammarAccess.getStringTypeAccess().getDocumentationAssignment_6_1()); 
            // InternalOCCI.g:6615:2: ( rule__StringType__DocumentationAssignment_6_1 )
            // InternalOCCI.g:6615:3: rule__StringType__DocumentationAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__DocumentationAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getDocumentationAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_6__1__Impl"


    // $ANTLR start "rule__EObjectType__Group__0"
    // InternalOCCI.g:6624:1: rule__EObjectType__Group__0 : rule__EObjectType__Group__0__Impl rule__EObjectType__Group__1 ;
    public final void rule__EObjectType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6628:1: ( rule__EObjectType__Group__0__Impl rule__EObjectType__Group__1 )
            // InternalOCCI.g:6629:2: rule__EObjectType__Group__0__Impl rule__EObjectType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EObjectType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EObjectType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__0"


    // $ANTLR start "rule__EObjectType__Group__0__Impl"
    // InternalOCCI.g:6636:1: rule__EObjectType__Group__0__Impl : ( 'EObjectType' ) ;
    public final void rule__EObjectType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6640:1: ( ( 'EObjectType' ) )
            // InternalOCCI.g:6641:1: ( 'EObjectType' )
            {
            // InternalOCCI.g:6641:1: ( 'EObjectType' )
            // InternalOCCI.g:6642:2: 'EObjectType'
            {
             before(grammarAccess.getEObjectTypeAccess().getEObjectTypeKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEObjectTypeAccess().getEObjectTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__0__Impl"


    // $ANTLR start "rule__EObjectType__Group__1"
    // InternalOCCI.g:6651:1: rule__EObjectType__Group__1 : rule__EObjectType__Group__1__Impl rule__EObjectType__Group__2 ;
    public final void rule__EObjectType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6655:1: ( rule__EObjectType__Group__1__Impl rule__EObjectType__Group__2 )
            // InternalOCCI.g:6656:2: rule__EObjectType__Group__1__Impl rule__EObjectType__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__EObjectType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EObjectType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__1"


    // $ANTLR start "rule__EObjectType__Group__1__Impl"
    // InternalOCCI.g:6663:1: rule__EObjectType__Group__1__Impl : ( ( rule__EObjectType__NameAssignment_1 ) ) ;
    public final void rule__EObjectType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6667:1: ( ( ( rule__EObjectType__NameAssignment_1 ) ) )
            // InternalOCCI.g:6668:1: ( ( rule__EObjectType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:6668:1: ( ( rule__EObjectType__NameAssignment_1 ) )
            // InternalOCCI.g:6669:2: ( rule__EObjectType__NameAssignment_1 )
            {
             before(grammarAccess.getEObjectTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:6670:2: ( rule__EObjectType__NameAssignment_1 )
            // InternalOCCI.g:6670:3: rule__EObjectType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EObjectType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEObjectTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__1__Impl"


    // $ANTLR start "rule__EObjectType__Group__2"
    // InternalOCCI.g:6678:1: rule__EObjectType__Group__2 : rule__EObjectType__Group__2__Impl rule__EObjectType__Group__3 ;
    public final void rule__EObjectType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6682:1: ( rule__EObjectType__Group__2__Impl rule__EObjectType__Group__3 )
            // InternalOCCI.g:6683:2: rule__EObjectType__Group__2__Impl rule__EObjectType__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__EObjectType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EObjectType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__2"


    // $ANTLR start "rule__EObjectType__Group__2__Impl"
    // InternalOCCI.g:6690:1: rule__EObjectType__Group__2__Impl : ( ( rule__EObjectType__Group_2__0 )? ) ;
    public final void rule__EObjectType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6694:1: ( ( ( rule__EObjectType__Group_2__0 )? ) )
            // InternalOCCI.g:6695:1: ( ( rule__EObjectType__Group_2__0 )? )
            {
            // InternalOCCI.g:6695:1: ( ( rule__EObjectType__Group_2__0 )? )
            // InternalOCCI.g:6696:2: ( rule__EObjectType__Group_2__0 )?
            {
             before(grammarAccess.getEObjectTypeAccess().getGroup_2()); 
            // InternalOCCI.g:6697:2: ( rule__EObjectType__Group_2__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==44) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOCCI.g:6697:3: rule__EObjectType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EObjectType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEObjectTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__2__Impl"


    // $ANTLR start "rule__EObjectType__Group__3"
    // InternalOCCI.g:6705:1: rule__EObjectType__Group__3 : rule__EObjectType__Group__3__Impl ;
    public final void rule__EObjectType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6709:1: ( rule__EObjectType__Group__3__Impl )
            // InternalOCCI.g:6710:2: rule__EObjectType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EObjectType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__3"


    // $ANTLR start "rule__EObjectType__Group__3__Impl"
    // InternalOCCI.g:6716:1: rule__EObjectType__Group__3__Impl : ( ( rule__EObjectType__Group_3__0 )? ) ;
    public final void rule__EObjectType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6720:1: ( ( ( rule__EObjectType__Group_3__0 )? ) )
            // InternalOCCI.g:6721:1: ( ( rule__EObjectType__Group_3__0 )? )
            {
            // InternalOCCI.g:6721:1: ( ( rule__EObjectType__Group_3__0 )? )
            // InternalOCCI.g:6722:2: ( rule__EObjectType__Group_3__0 )?
            {
             before(grammarAccess.getEObjectTypeAccess().getGroup_3()); 
            // InternalOCCI.g:6723:2: ( rule__EObjectType__Group_3__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==38) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOCCI.g:6723:3: rule__EObjectType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EObjectType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEObjectTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__3__Impl"


    // $ANTLR start "rule__EObjectType__Group_2__0"
    // InternalOCCI.g:6732:1: rule__EObjectType__Group_2__0 : rule__EObjectType__Group_2__0__Impl rule__EObjectType__Group_2__1 ;
    public final void rule__EObjectType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6736:1: ( rule__EObjectType__Group_2__0__Impl rule__EObjectType__Group_2__1 )
            // InternalOCCI.g:6737:2: rule__EObjectType__Group_2__0__Impl rule__EObjectType__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__EObjectType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EObjectType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_2__0"


    // $ANTLR start "rule__EObjectType__Group_2__0__Impl"
    // InternalOCCI.g:6744:1: rule__EObjectType__Group_2__0__Impl : ( 'instanceClassName' ) ;
    public final void rule__EObjectType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6748:1: ( ( 'instanceClassName' ) )
            // InternalOCCI.g:6749:1: ( 'instanceClassName' )
            {
            // InternalOCCI.g:6749:1: ( 'instanceClassName' )
            // InternalOCCI.g:6750:2: 'instanceClassName'
            {
             before(grammarAccess.getEObjectTypeAccess().getInstanceClassNameKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEObjectTypeAccess().getInstanceClassNameKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_2__0__Impl"


    // $ANTLR start "rule__EObjectType__Group_2__1"
    // InternalOCCI.g:6759:1: rule__EObjectType__Group_2__1 : rule__EObjectType__Group_2__1__Impl ;
    public final void rule__EObjectType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6763:1: ( rule__EObjectType__Group_2__1__Impl )
            // InternalOCCI.g:6764:2: rule__EObjectType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EObjectType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_2__1"


    // $ANTLR start "rule__EObjectType__Group_2__1__Impl"
    // InternalOCCI.g:6770:1: rule__EObjectType__Group_2__1__Impl : ( ( rule__EObjectType__InstanceClassNameAssignment_2_1 ) ) ;
    public final void rule__EObjectType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6774:1: ( ( ( rule__EObjectType__InstanceClassNameAssignment_2_1 ) ) )
            // InternalOCCI.g:6775:1: ( ( rule__EObjectType__InstanceClassNameAssignment_2_1 ) )
            {
            // InternalOCCI.g:6775:1: ( ( rule__EObjectType__InstanceClassNameAssignment_2_1 ) )
            // InternalOCCI.g:6776:2: ( rule__EObjectType__InstanceClassNameAssignment_2_1 )
            {
             before(grammarAccess.getEObjectTypeAccess().getInstanceClassNameAssignment_2_1()); 
            // InternalOCCI.g:6777:2: ( rule__EObjectType__InstanceClassNameAssignment_2_1 )
            // InternalOCCI.g:6777:3: rule__EObjectType__InstanceClassNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EObjectType__InstanceClassNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEObjectTypeAccess().getInstanceClassNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_2__1__Impl"


    // $ANTLR start "rule__EObjectType__Group_3__0"
    // InternalOCCI.g:6786:1: rule__EObjectType__Group_3__0 : rule__EObjectType__Group_3__0__Impl rule__EObjectType__Group_3__1 ;
    public final void rule__EObjectType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6790:1: ( rule__EObjectType__Group_3__0__Impl rule__EObjectType__Group_3__1 )
            // InternalOCCI.g:6791:2: rule__EObjectType__Group_3__0__Impl rule__EObjectType__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__EObjectType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EObjectType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_3__0"


    // $ANTLR start "rule__EObjectType__Group_3__0__Impl"
    // InternalOCCI.g:6798:1: rule__EObjectType__Group_3__0__Impl : ( 'documentation' ) ;
    public final void rule__EObjectType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6802:1: ( ( 'documentation' ) )
            // InternalOCCI.g:6803:1: ( 'documentation' )
            {
            // InternalOCCI.g:6803:1: ( 'documentation' )
            // InternalOCCI.g:6804:2: 'documentation'
            {
             before(grammarAccess.getEObjectTypeAccess().getDocumentationKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEObjectTypeAccess().getDocumentationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_3__0__Impl"


    // $ANTLR start "rule__EObjectType__Group_3__1"
    // InternalOCCI.g:6813:1: rule__EObjectType__Group_3__1 : rule__EObjectType__Group_3__1__Impl ;
    public final void rule__EObjectType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6817:1: ( rule__EObjectType__Group_3__1__Impl )
            // InternalOCCI.g:6818:2: rule__EObjectType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EObjectType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_3__1"


    // $ANTLR start "rule__EObjectType__Group_3__1__Impl"
    // InternalOCCI.g:6824:1: rule__EObjectType__Group_3__1__Impl : ( ( rule__EObjectType__DocumentationAssignment_3_1 ) ) ;
    public final void rule__EObjectType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6828:1: ( ( ( rule__EObjectType__DocumentationAssignment_3_1 ) ) )
            // InternalOCCI.g:6829:1: ( ( rule__EObjectType__DocumentationAssignment_3_1 ) )
            {
            // InternalOCCI.g:6829:1: ( ( rule__EObjectType__DocumentationAssignment_3_1 ) )
            // InternalOCCI.g:6830:2: ( rule__EObjectType__DocumentationAssignment_3_1 )
            {
             before(grammarAccess.getEObjectTypeAccess().getDocumentationAssignment_3_1()); 
            // InternalOCCI.g:6831:2: ( rule__EObjectType__DocumentationAssignment_3_1 )
            // InternalOCCI.g:6831:3: rule__EObjectType__DocumentationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EObjectType__DocumentationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEObjectTypeAccess().getDocumentationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_3__1__Impl"


    // $ANTLR start "rule__BooleanType__Group__0"
    // InternalOCCI.g:6840:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6844:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // InternalOCCI.g:6845:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__BooleanType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0"


    // $ANTLR start "rule__BooleanType__Group__0__Impl"
    // InternalOCCI.g:6852:1: rule__BooleanType__Group__0__Impl : ( 'BooleanType' ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6856:1: ( ( 'BooleanType' ) )
            // InternalOCCI.g:6857:1: ( 'BooleanType' )
            {
            // InternalOCCI.g:6857:1: ( 'BooleanType' )
            // InternalOCCI.g:6858:2: 'BooleanType'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0__Impl"


    // $ANTLR start "rule__BooleanType__Group__1"
    // InternalOCCI.g:6867:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl rule__BooleanType__Group__2 ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6871:1: ( rule__BooleanType__Group__1__Impl rule__BooleanType__Group__2 )
            // InternalOCCI.g:6872:2: rule__BooleanType__Group__1__Impl rule__BooleanType__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__BooleanType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1"


    // $ANTLR start "rule__BooleanType__Group__1__Impl"
    // InternalOCCI.g:6879:1: rule__BooleanType__Group__1__Impl : ( ( rule__BooleanType__NameAssignment_1 ) ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6883:1: ( ( ( rule__BooleanType__NameAssignment_1 ) ) )
            // InternalOCCI.g:6884:1: ( ( rule__BooleanType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:6884:1: ( ( rule__BooleanType__NameAssignment_1 ) )
            // InternalOCCI.g:6885:2: ( rule__BooleanType__NameAssignment_1 )
            {
             before(grammarAccess.getBooleanTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:6886:2: ( rule__BooleanType__NameAssignment_1 )
            // InternalOCCI.g:6886:3: rule__BooleanType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1__Impl"


    // $ANTLR start "rule__BooleanType__Group__2"
    // InternalOCCI.g:6894:1: rule__BooleanType__Group__2 : rule__BooleanType__Group__2__Impl ;
    public final void rule__BooleanType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6898:1: ( rule__BooleanType__Group__2__Impl )
            // InternalOCCI.g:6899:2: rule__BooleanType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__2"


    // $ANTLR start "rule__BooleanType__Group__2__Impl"
    // InternalOCCI.g:6905:1: rule__BooleanType__Group__2__Impl : ( ( rule__BooleanType__Group_2__0 )? ) ;
    public final void rule__BooleanType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6909:1: ( ( ( rule__BooleanType__Group_2__0 )? ) )
            // InternalOCCI.g:6910:1: ( ( rule__BooleanType__Group_2__0 )? )
            {
            // InternalOCCI.g:6910:1: ( ( rule__BooleanType__Group_2__0 )? )
            // InternalOCCI.g:6911:2: ( rule__BooleanType__Group_2__0 )?
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup_2()); 
            // InternalOCCI.g:6912:2: ( rule__BooleanType__Group_2__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==38) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOCCI.g:6912:3: rule__BooleanType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__2__Impl"


    // $ANTLR start "rule__BooleanType__Group_2__0"
    // InternalOCCI.g:6921:1: rule__BooleanType__Group_2__0 : rule__BooleanType__Group_2__0__Impl rule__BooleanType__Group_2__1 ;
    public final void rule__BooleanType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6925:1: ( rule__BooleanType__Group_2__0__Impl rule__BooleanType__Group_2__1 )
            // InternalOCCI.g:6926:2: rule__BooleanType__Group_2__0__Impl rule__BooleanType__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__BooleanType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group_2__0"


    // $ANTLR start "rule__BooleanType__Group_2__0__Impl"
    // InternalOCCI.g:6933:1: rule__BooleanType__Group_2__0__Impl : ( 'documentation' ) ;
    public final void rule__BooleanType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6937:1: ( ( 'documentation' ) )
            // InternalOCCI.g:6938:1: ( 'documentation' )
            {
            // InternalOCCI.g:6938:1: ( 'documentation' )
            // InternalOCCI.g:6939:2: 'documentation'
            {
             before(grammarAccess.getBooleanTypeAccess().getDocumentationKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getDocumentationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group_2__0__Impl"


    // $ANTLR start "rule__BooleanType__Group_2__1"
    // InternalOCCI.g:6948:1: rule__BooleanType__Group_2__1 : rule__BooleanType__Group_2__1__Impl ;
    public final void rule__BooleanType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6952:1: ( rule__BooleanType__Group_2__1__Impl )
            // InternalOCCI.g:6953:2: rule__BooleanType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group_2__1"


    // $ANTLR start "rule__BooleanType__Group_2__1__Impl"
    // InternalOCCI.g:6959:1: rule__BooleanType__Group_2__1__Impl : ( ( rule__BooleanType__DocumentationAssignment_2_1 ) ) ;
    public final void rule__BooleanType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6963:1: ( ( ( rule__BooleanType__DocumentationAssignment_2_1 ) ) )
            // InternalOCCI.g:6964:1: ( ( rule__BooleanType__DocumentationAssignment_2_1 ) )
            {
            // InternalOCCI.g:6964:1: ( ( rule__BooleanType__DocumentationAssignment_2_1 ) )
            // InternalOCCI.g:6965:2: ( rule__BooleanType__DocumentationAssignment_2_1 )
            {
             before(grammarAccess.getBooleanTypeAccess().getDocumentationAssignment_2_1()); 
            // InternalOCCI.g:6966:2: ( rule__BooleanType__DocumentationAssignment_2_1 )
            // InternalOCCI.g:6966:3: rule__BooleanType__DocumentationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__DocumentationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getDocumentationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group_2__1__Impl"


    // $ANTLR start "rule__NumericType__Group__0"
    // InternalOCCI.g:6975:1: rule__NumericType__Group__0 : rule__NumericType__Group__0__Impl rule__NumericType__Group__1 ;
    public final void rule__NumericType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6979:1: ( rule__NumericType__Group__0__Impl rule__NumericType__Group__1 )
            // InternalOCCI.g:6980:2: rule__NumericType__Group__0__Impl rule__NumericType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__NumericType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__0"


    // $ANTLR start "rule__NumericType__Group__0__Impl"
    // InternalOCCI.g:6987:1: rule__NumericType__Group__0__Impl : ( 'NumericType' ) ;
    public final void rule__NumericType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6991:1: ( ( 'NumericType' ) )
            // InternalOCCI.g:6992:1: ( 'NumericType' )
            {
            // InternalOCCI.g:6992:1: ( 'NumericType' )
            // InternalOCCI.g:6993:2: 'NumericType'
            {
             before(grammarAccess.getNumericTypeAccess().getNumericTypeKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getNumericTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__0__Impl"


    // $ANTLR start "rule__NumericType__Group__1"
    // InternalOCCI.g:7002:1: rule__NumericType__Group__1 : rule__NumericType__Group__1__Impl rule__NumericType__Group__2 ;
    public final void rule__NumericType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7006:1: ( rule__NumericType__Group__1__Impl rule__NumericType__Group__2 )
            // InternalOCCI.g:7007:2: rule__NumericType__Group__1__Impl rule__NumericType__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__NumericType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__1"


    // $ANTLR start "rule__NumericType__Group__1__Impl"
    // InternalOCCI.g:7014:1: rule__NumericType__Group__1__Impl : ( ( rule__NumericType__NameAssignment_1 ) ) ;
    public final void rule__NumericType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7018:1: ( ( ( rule__NumericType__NameAssignment_1 ) ) )
            // InternalOCCI.g:7019:1: ( ( rule__NumericType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:7019:1: ( ( rule__NumericType__NameAssignment_1 ) )
            // InternalOCCI.g:7020:2: ( rule__NumericType__NameAssignment_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:7021:2: ( rule__NumericType__NameAssignment_1 )
            // InternalOCCI.g:7021:3: rule__NumericType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__1__Impl"


    // $ANTLR start "rule__NumericType__Group__2"
    // InternalOCCI.g:7029:1: rule__NumericType__Group__2 : rule__NumericType__Group__2__Impl rule__NumericType__Group__3 ;
    public final void rule__NumericType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7033:1: ( rule__NumericType__Group__2__Impl rule__NumericType__Group__3 )
            // InternalOCCI.g:7034:2: rule__NumericType__Group__2__Impl rule__NumericType__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__NumericType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__2"


    // $ANTLR start "rule__NumericType__Group__2__Impl"
    // InternalOCCI.g:7041:1: rule__NumericType__Group__2__Impl : ( 'type' ) ;
    public final void rule__NumericType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7045:1: ( ( 'type' ) )
            // InternalOCCI.g:7046:1: ( 'type' )
            {
            // InternalOCCI.g:7046:1: ( 'type' )
            // InternalOCCI.g:7047:2: 'type'
            {
             before(grammarAccess.getNumericTypeAccess().getTypeKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__2__Impl"


    // $ANTLR start "rule__NumericType__Group__3"
    // InternalOCCI.g:7056:1: rule__NumericType__Group__3 : rule__NumericType__Group__3__Impl rule__NumericType__Group__4 ;
    public final void rule__NumericType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7060:1: ( rule__NumericType__Group__3__Impl rule__NumericType__Group__4 )
            // InternalOCCI.g:7061:2: rule__NumericType__Group__3__Impl rule__NumericType__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__NumericType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__3"


    // $ANTLR start "rule__NumericType__Group__3__Impl"
    // InternalOCCI.g:7068:1: rule__NumericType__Group__3__Impl : ( ( rule__NumericType__TypeAssignment_3 ) ) ;
    public final void rule__NumericType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7072:1: ( ( ( rule__NumericType__TypeAssignment_3 ) ) )
            // InternalOCCI.g:7073:1: ( ( rule__NumericType__TypeAssignment_3 ) )
            {
            // InternalOCCI.g:7073:1: ( ( rule__NumericType__TypeAssignment_3 ) )
            // InternalOCCI.g:7074:2: ( rule__NumericType__TypeAssignment_3 )
            {
             before(grammarAccess.getNumericTypeAccess().getTypeAssignment_3()); 
            // InternalOCCI.g:7075:2: ( rule__NumericType__TypeAssignment_3 )
            // InternalOCCI.g:7075:3: rule__NumericType__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__3__Impl"


    // $ANTLR start "rule__NumericType__Group__4"
    // InternalOCCI.g:7083:1: rule__NumericType__Group__4 : rule__NumericType__Group__4__Impl rule__NumericType__Group__5 ;
    public final void rule__NumericType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7087:1: ( rule__NumericType__Group__4__Impl rule__NumericType__Group__5 )
            // InternalOCCI.g:7088:2: rule__NumericType__Group__4__Impl rule__NumericType__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__NumericType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__4"


    // $ANTLR start "rule__NumericType__Group__4__Impl"
    // InternalOCCI.g:7095:1: rule__NumericType__Group__4__Impl : ( '(' ) ;
    public final void rule__NumericType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7099:1: ( ( '(' ) )
            // InternalOCCI.g:7100:1: ( '(' )
            {
            // InternalOCCI.g:7100:1: ( '(' )
            // InternalOCCI.g:7101:2: '('
            {
             before(grammarAccess.getNumericTypeAccess().getLeftParenthesisKeyword_4()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__4__Impl"


    // $ANTLR start "rule__NumericType__Group__5"
    // InternalOCCI.g:7110:1: rule__NumericType__Group__5 : rule__NumericType__Group__5__Impl rule__NumericType__Group__6 ;
    public final void rule__NumericType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7114:1: ( rule__NumericType__Group__5__Impl rule__NumericType__Group__6 )
            // InternalOCCI.g:7115:2: rule__NumericType__Group__5__Impl rule__NumericType__Group__6
            {
            pushFollow(FOLLOW_45);
            rule__NumericType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__5"


    // $ANTLR start "rule__NumericType__Group__5__Impl"
    // InternalOCCI.g:7122:1: rule__NumericType__Group__5__Impl : ( ( rule__NumericType__Group_5__0 )? ) ;
    public final void rule__NumericType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7126:1: ( ( ( rule__NumericType__Group_5__0 )? ) )
            // InternalOCCI.g:7127:1: ( ( rule__NumericType__Group_5__0 )? )
            {
            // InternalOCCI.g:7127:1: ( ( rule__NumericType__Group_5__0 )? )
            // InternalOCCI.g:7128:2: ( rule__NumericType__Group_5__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_5()); 
            // InternalOCCI.g:7129:2: ( rule__NumericType__Group_5__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==47) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOCCI.g:7129:3: rule__NumericType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__5__Impl"


    // $ANTLR start "rule__NumericType__Group__6"
    // InternalOCCI.g:7137:1: rule__NumericType__Group__6 : rule__NumericType__Group__6__Impl rule__NumericType__Group__7 ;
    public final void rule__NumericType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7141:1: ( rule__NumericType__Group__6__Impl rule__NumericType__Group__7 )
            // InternalOCCI.g:7142:2: rule__NumericType__Group__6__Impl rule__NumericType__Group__7
            {
            pushFollow(FOLLOW_45);
            rule__NumericType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__6"


    // $ANTLR start "rule__NumericType__Group__6__Impl"
    // InternalOCCI.g:7149:1: rule__NumericType__Group__6__Impl : ( ( rule__NumericType__Group_6__0 )? ) ;
    public final void rule__NumericType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7153:1: ( ( ( rule__NumericType__Group_6__0 )? ) )
            // InternalOCCI.g:7154:1: ( ( rule__NumericType__Group_6__0 )? )
            {
            // InternalOCCI.g:7154:1: ( ( rule__NumericType__Group_6__0 )? )
            // InternalOCCI.g:7155:2: ( rule__NumericType__Group_6__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_6()); 
            // InternalOCCI.g:7156:2: ( rule__NumericType__Group_6__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==48) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOCCI.g:7156:3: rule__NumericType__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__6__Impl"


    // $ANTLR start "rule__NumericType__Group__7"
    // InternalOCCI.g:7164:1: rule__NumericType__Group__7 : rule__NumericType__Group__7__Impl rule__NumericType__Group__8 ;
    public final void rule__NumericType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7168:1: ( rule__NumericType__Group__7__Impl rule__NumericType__Group__8 )
            // InternalOCCI.g:7169:2: rule__NumericType__Group__7__Impl rule__NumericType__Group__8
            {
            pushFollow(FOLLOW_45);
            rule__NumericType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__7"


    // $ANTLR start "rule__NumericType__Group__7__Impl"
    // InternalOCCI.g:7176:1: rule__NumericType__Group__7__Impl : ( ( rule__NumericType__Group_7__0 )? ) ;
    public final void rule__NumericType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7180:1: ( ( ( rule__NumericType__Group_7__0 )? ) )
            // InternalOCCI.g:7181:1: ( ( rule__NumericType__Group_7__0 )? )
            {
            // InternalOCCI.g:7181:1: ( ( rule__NumericType__Group_7__0 )? )
            // InternalOCCI.g:7182:2: ( rule__NumericType__Group_7__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_7()); 
            // InternalOCCI.g:7183:2: ( rule__NumericType__Group_7__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==49) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalOCCI.g:7183:3: rule__NumericType__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__7__Impl"


    // $ANTLR start "rule__NumericType__Group__8"
    // InternalOCCI.g:7191:1: rule__NumericType__Group__8 : rule__NumericType__Group__8__Impl rule__NumericType__Group__9 ;
    public final void rule__NumericType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7195:1: ( rule__NumericType__Group__8__Impl rule__NumericType__Group__9 )
            // InternalOCCI.g:7196:2: rule__NumericType__Group__8__Impl rule__NumericType__Group__9
            {
            pushFollow(FOLLOW_45);
            rule__NumericType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__8"


    // $ANTLR start "rule__NumericType__Group__8__Impl"
    // InternalOCCI.g:7203:1: rule__NumericType__Group__8__Impl : ( ( rule__NumericType__Group_8__0 )? ) ;
    public final void rule__NumericType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7207:1: ( ( ( rule__NumericType__Group_8__0 )? ) )
            // InternalOCCI.g:7208:1: ( ( rule__NumericType__Group_8__0 )? )
            {
            // InternalOCCI.g:7208:1: ( ( rule__NumericType__Group_8__0 )? )
            // InternalOCCI.g:7209:2: ( rule__NumericType__Group_8__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_8()); 
            // InternalOCCI.g:7210:2: ( rule__NumericType__Group_8__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==50) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOCCI.g:7210:3: rule__NumericType__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__8__Impl"


    // $ANTLR start "rule__NumericType__Group__9"
    // InternalOCCI.g:7218:1: rule__NumericType__Group__9 : rule__NumericType__Group__9__Impl rule__NumericType__Group__10 ;
    public final void rule__NumericType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7222:1: ( rule__NumericType__Group__9__Impl rule__NumericType__Group__10 )
            // InternalOCCI.g:7223:2: rule__NumericType__Group__9__Impl rule__NumericType__Group__10
            {
            pushFollow(FOLLOW_45);
            rule__NumericType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__9"


    // $ANTLR start "rule__NumericType__Group__9__Impl"
    // InternalOCCI.g:7230:1: rule__NumericType__Group__9__Impl : ( ( rule__NumericType__Group_9__0 )? ) ;
    public final void rule__NumericType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7234:1: ( ( ( rule__NumericType__Group_9__0 )? ) )
            // InternalOCCI.g:7235:1: ( ( rule__NumericType__Group_9__0 )? )
            {
            // InternalOCCI.g:7235:1: ( ( rule__NumericType__Group_9__0 )? )
            // InternalOCCI.g:7236:2: ( rule__NumericType__Group_9__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_9()); 
            // InternalOCCI.g:7237:2: ( rule__NumericType__Group_9__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==51) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalOCCI.g:7237:3: rule__NumericType__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__9__Impl"


    // $ANTLR start "rule__NumericType__Group__10"
    // InternalOCCI.g:7245:1: rule__NumericType__Group__10 : rule__NumericType__Group__10__Impl rule__NumericType__Group__11 ;
    public final void rule__NumericType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7249:1: ( rule__NumericType__Group__10__Impl rule__NumericType__Group__11 )
            // InternalOCCI.g:7250:2: rule__NumericType__Group__10__Impl rule__NumericType__Group__11
            {
            pushFollow(FOLLOW_45);
            rule__NumericType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__10"


    // $ANTLR start "rule__NumericType__Group__10__Impl"
    // InternalOCCI.g:7257:1: rule__NumericType__Group__10__Impl : ( ( rule__NumericType__Group_10__0 )? ) ;
    public final void rule__NumericType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7261:1: ( ( ( rule__NumericType__Group_10__0 )? ) )
            // InternalOCCI.g:7262:1: ( ( rule__NumericType__Group_10__0 )? )
            {
            // InternalOCCI.g:7262:1: ( ( rule__NumericType__Group_10__0 )? )
            // InternalOCCI.g:7263:2: ( rule__NumericType__Group_10__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_10()); 
            // InternalOCCI.g:7264:2: ( rule__NumericType__Group_10__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==38) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOCCI.g:7264:3: rule__NumericType__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumericType__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumericTypeAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__10__Impl"


    // $ANTLR start "rule__NumericType__Group__11"
    // InternalOCCI.g:7272:1: rule__NumericType__Group__11 : rule__NumericType__Group__11__Impl ;
    public final void rule__NumericType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7276:1: ( rule__NumericType__Group__11__Impl )
            // InternalOCCI.g:7277:2: rule__NumericType__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__11"


    // $ANTLR start "rule__NumericType__Group__11__Impl"
    // InternalOCCI.g:7283:1: rule__NumericType__Group__11__Impl : ( ')' ) ;
    public final void rule__NumericType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7287:1: ( ( ')' ) )
            // InternalOCCI.g:7288:1: ( ')' )
            {
            // InternalOCCI.g:7288:1: ( ')' )
            // InternalOCCI.g:7289:2: ')'
            {
             before(grammarAccess.getNumericTypeAccess().getRightParenthesisKeyword_11()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group__11__Impl"


    // $ANTLR start "rule__NumericType__Group_5__0"
    // InternalOCCI.g:7299:1: rule__NumericType__Group_5__0 : rule__NumericType__Group_5__0__Impl rule__NumericType__Group_5__1 ;
    public final void rule__NumericType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7303:1: ( rule__NumericType__Group_5__0__Impl rule__NumericType__Group_5__1 )
            // InternalOCCI.g:7304:2: rule__NumericType__Group_5__0__Impl rule__NumericType__Group_5__1
            {
            pushFollow(FOLLOW_40);
            rule__NumericType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_5__0"


    // $ANTLR start "rule__NumericType__Group_5__0__Impl"
    // InternalOCCI.g:7311:1: rule__NumericType__Group_5__0__Impl : ( 'totalDigits' ) ;
    public final void rule__NumericType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7315:1: ( ( 'totalDigits' ) )
            // InternalOCCI.g:7316:1: ( 'totalDigits' )
            {
            // InternalOCCI.g:7316:1: ( 'totalDigits' )
            // InternalOCCI.g:7317:2: 'totalDigits'
            {
             before(grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_5__0__Impl"


    // $ANTLR start "rule__NumericType__Group_5__1"
    // InternalOCCI.g:7326:1: rule__NumericType__Group_5__1 : rule__NumericType__Group_5__1__Impl ;
    public final void rule__NumericType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7330:1: ( rule__NumericType__Group_5__1__Impl )
            // InternalOCCI.g:7331:2: rule__NumericType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_5__1"


    // $ANTLR start "rule__NumericType__Group_5__1__Impl"
    // InternalOCCI.g:7337:1: rule__NumericType__Group_5__1__Impl : ( ( rule__NumericType__TotalDigitsAssignment_5_1 ) ) ;
    public final void rule__NumericType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7341:1: ( ( ( rule__NumericType__TotalDigitsAssignment_5_1 ) ) )
            // InternalOCCI.g:7342:1: ( ( rule__NumericType__TotalDigitsAssignment_5_1 ) )
            {
            // InternalOCCI.g:7342:1: ( ( rule__NumericType__TotalDigitsAssignment_5_1 ) )
            // InternalOCCI.g:7343:2: ( rule__NumericType__TotalDigitsAssignment_5_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getTotalDigitsAssignment_5_1()); 
            // InternalOCCI.g:7344:2: ( rule__NumericType__TotalDigitsAssignment_5_1 )
            // InternalOCCI.g:7344:3: rule__NumericType__TotalDigitsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__TotalDigitsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getTotalDigitsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_5__1__Impl"


    // $ANTLR start "rule__NumericType__Group_6__0"
    // InternalOCCI.g:7353:1: rule__NumericType__Group_6__0 : rule__NumericType__Group_6__0__Impl rule__NumericType__Group_6__1 ;
    public final void rule__NumericType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7357:1: ( rule__NumericType__Group_6__0__Impl rule__NumericType__Group_6__1 )
            // InternalOCCI.g:7358:2: rule__NumericType__Group_6__0__Impl rule__NumericType__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__NumericType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_6__0"


    // $ANTLR start "rule__NumericType__Group_6__0__Impl"
    // InternalOCCI.g:7365:1: rule__NumericType__Group_6__0__Impl : ( 'minExclusive' ) ;
    public final void rule__NumericType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7369:1: ( ( 'minExclusive' ) )
            // InternalOCCI.g:7370:1: ( 'minExclusive' )
            {
            // InternalOCCI.g:7370:1: ( 'minExclusive' )
            // InternalOCCI.g:7371:2: 'minExclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_6_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_6__0__Impl"


    // $ANTLR start "rule__NumericType__Group_6__1"
    // InternalOCCI.g:7380:1: rule__NumericType__Group_6__1 : rule__NumericType__Group_6__1__Impl ;
    public final void rule__NumericType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7384:1: ( rule__NumericType__Group_6__1__Impl )
            // InternalOCCI.g:7385:2: rule__NumericType__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_6__1"


    // $ANTLR start "rule__NumericType__Group_6__1__Impl"
    // InternalOCCI.g:7391:1: rule__NumericType__Group_6__1__Impl : ( ( rule__NumericType__MinExclusiveAssignment_6_1 ) ) ;
    public final void rule__NumericType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7395:1: ( ( ( rule__NumericType__MinExclusiveAssignment_6_1 ) ) )
            // InternalOCCI.g:7396:1: ( ( rule__NumericType__MinExclusiveAssignment_6_1 ) )
            {
            // InternalOCCI.g:7396:1: ( ( rule__NumericType__MinExclusiveAssignment_6_1 ) )
            // InternalOCCI.g:7397:2: ( rule__NumericType__MinExclusiveAssignment_6_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMinExclusiveAssignment_6_1()); 
            // InternalOCCI.g:7398:2: ( rule__NumericType__MinExclusiveAssignment_6_1 )
            // InternalOCCI.g:7398:3: rule__NumericType__MinExclusiveAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MinExclusiveAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMinExclusiveAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_6__1__Impl"


    // $ANTLR start "rule__NumericType__Group_7__0"
    // InternalOCCI.g:7407:1: rule__NumericType__Group_7__0 : rule__NumericType__Group_7__0__Impl rule__NumericType__Group_7__1 ;
    public final void rule__NumericType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7411:1: ( rule__NumericType__Group_7__0__Impl rule__NumericType__Group_7__1 )
            // InternalOCCI.g:7412:2: rule__NumericType__Group_7__0__Impl rule__NumericType__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__NumericType__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_7__0"


    // $ANTLR start "rule__NumericType__Group_7__0__Impl"
    // InternalOCCI.g:7419:1: rule__NumericType__Group_7__0__Impl : ( 'maxExclusive' ) ;
    public final void rule__NumericType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7423:1: ( ( 'maxExclusive' ) )
            // InternalOCCI.g:7424:1: ( 'maxExclusive' )
            {
            // InternalOCCI.g:7424:1: ( 'maxExclusive' )
            // InternalOCCI.g:7425:2: 'maxExclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_7_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_7__0__Impl"


    // $ANTLR start "rule__NumericType__Group_7__1"
    // InternalOCCI.g:7434:1: rule__NumericType__Group_7__1 : rule__NumericType__Group_7__1__Impl ;
    public final void rule__NumericType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7438:1: ( rule__NumericType__Group_7__1__Impl )
            // InternalOCCI.g:7439:2: rule__NumericType__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_7__1"


    // $ANTLR start "rule__NumericType__Group_7__1__Impl"
    // InternalOCCI.g:7445:1: rule__NumericType__Group_7__1__Impl : ( ( rule__NumericType__MaxExclusiveAssignment_7_1 ) ) ;
    public final void rule__NumericType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7449:1: ( ( ( rule__NumericType__MaxExclusiveAssignment_7_1 ) ) )
            // InternalOCCI.g:7450:1: ( ( rule__NumericType__MaxExclusiveAssignment_7_1 ) )
            {
            // InternalOCCI.g:7450:1: ( ( rule__NumericType__MaxExclusiveAssignment_7_1 ) )
            // InternalOCCI.g:7451:2: ( rule__NumericType__MaxExclusiveAssignment_7_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMaxExclusiveAssignment_7_1()); 
            // InternalOCCI.g:7452:2: ( rule__NumericType__MaxExclusiveAssignment_7_1 )
            // InternalOCCI.g:7452:3: rule__NumericType__MaxExclusiveAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MaxExclusiveAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMaxExclusiveAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_7__1__Impl"


    // $ANTLR start "rule__NumericType__Group_8__0"
    // InternalOCCI.g:7461:1: rule__NumericType__Group_8__0 : rule__NumericType__Group_8__0__Impl rule__NumericType__Group_8__1 ;
    public final void rule__NumericType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7465:1: ( rule__NumericType__Group_8__0__Impl rule__NumericType__Group_8__1 )
            // InternalOCCI.g:7466:2: rule__NumericType__Group_8__0__Impl rule__NumericType__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__NumericType__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_8__0"


    // $ANTLR start "rule__NumericType__Group_8__0__Impl"
    // InternalOCCI.g:7473:1: rule__NumericType__Group_8__0__Impl : ( 'minInclusive' ) ;
    public final void rule__NumericType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7477:1: ( ( 'minInclusive' ) )
            // InternalOCCI.g:7478:1: ( 'minInclusive' )
            {
            // InternalOCCI.g:7478:1: ( 'minInclusive' )
            // InternalOCCI.g:7479:2: 'minInclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_8_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_8__0__Impl"


    // $ANTLR start "rule__NumericType__Group_8__1"
    // InternalOCCI.g:7488:1: rule__NumericType__Group_8__1 : rule__NumericType__Group_8__1__Impl ;
    public final void rule__NumericType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7492:1: ( rule__NumericType__Group_8__1__Impl )
            // InternalOCCI.g:7493:2: rule__NumericType__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_8__1"


    // $ANTLR start "rule__NumericType__Group_8__1__Impl"
    // InternalOCCI.g:7499:1: rule__NumericType__Group_8__1__Impl : ( ( rule__NumericType__MinInclusiveAssignment_8_1 ) ) ;
    public final void rule__NumericType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7503:1: ( ( ( rule__NumericType__MinInclusiveAssignment_8_1 ) ) )
            // InternalOCCI.g:7504:1: ( ( rule__NumericType__MinInclusiveAssignment_8_1 ) )
            {
            // InternalOCCI.g:7504:1: ( ( rule__NumericType__MinInclusiveAssignment_8_1 ) )
            // InternalOCCI.g:7505:2: ( rule__NumericType__MinInclusiveAssignment_8_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMinInclusiveAssignment_8_1()); 
            // InternalOCCI.g:7506:2: ( rule__NumericType__MinInclusiveAssignment_8_1 )
            // InternalOCCI.g:7506:3: rule__NumericType__MinInclusiveAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MinInclusiveAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMinInclusiveAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_8__1__Impl"


    // $ANTLR start "rule__NumericType__Group_9__0"
    // InternalOCCI.g:7515:1: rule__NumericType__Group_9__0 : rule__NumericType__Group_9__0__Impl rule__NumericType__Group_9__1 ;
    public final void rule__NumericType__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7519:1: ( rule__NumericType__Group_9__0__Impl rule__NumericType__Group_9__1 )
            // InternalOCCI.g:7520:2: rule__NumericType__Group_9__0__Impl rule__NumericType__Group_9__1
            {
            pushFollow(FOLLOW_5);
            rule__NumericType__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_9__0"


    // $ANTLR start "rule__NumericType__Group_9__0__Impl"
    // InternalOCCI.g:7527:1: rule__NumericType__Group_9__0__Impl : ( 'maxInclusive' ) ;
    public final void rule__NumericType__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7531:1: ( ( 'maxInclusive' ) )
            // InternalOCCI.g:7532:1: ( 'maxInclusive' )
            {
            // InternalOCCI.g:7532:1: ( 'maxInclusive' )
            // InternalOCCI.g:7533:2: 'maxInclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_9_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_9__0__Impl"


    // $ANTLR start "rule__NumericType__Group_9__1"
    // InternalOCCI.g:7542:1: rule__NumericType__Group_9__1 : rule__NumericType__Group_9__1__Impl ;
    public final void rule__NumericType__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7546:1: ( rule__NumericType__Group_9__1__Impl )
            // InternalOCCI.g:7547:2: rule__NumericType__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_9__1"


    // $ANTLR start "rule__NumericType__Group_9__1__Impl"
    // InternalOCCI.g:7553:1: rule__NumericType__Group_9__1__Impl : ( ( rule__NumericType__MaxInclusiveAssignment_9_1 ) ) ;
    public final void rule__NumericType__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7557:1: ( ( ( rule__NumericType__MaxInclusiveAssignment_9_1 ) ) )
            // InternalOCCI.g:7558:1: ( ( rule__NumericType__MaxInclusiveAssignment_9_1 ) )
            {
            // InternalOCCI.g:7558:1: ( ( rule__NumericType__MaxInclusiveAssignment_9_1 ) )
            // InternalOCCI.g:7559:2: ( rule__NumericType__MaxInclusiveAssignment_9_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMaxInclusiveAssignment_9_1()); 
            // InternalOCCI.g:7560:2: ( rule__NumericType__MaxInclusiveAssignment_9_1 )
            // InternalOCCI.g:7560:3: rule__NumericType__MaxInclusiveAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MaxInclusiveAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMaxInclusiveAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_9__1__Impl"


    // $ANTLR start "rule__NumericType__Group_10__0"
    // InternalOCCI.g:7569:1: rule__NumericType__Group_10__0 : rule__NumericType__Group_10__0__Impl rule__NumericType__Group_10__1 ;
    public final void rule__NumericType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7573:1: ( rule__NumericType__Group_10__0__Impl rule__NumericType__Group_10__1 )
            // InternalOCCI.g:7574:2: rule__NumericType__Group_10__0__Impl rule__NumericType__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__NumericType__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericType__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_10__0"


    // $ANTLR start "rule__NumericType__Group_10__0__Impl"
    // InternalOCCI.g:7581:1: rule__NumericType__Group_10__0__Impl : ( 'documentation' ) ;
    public final void rule__NumericType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7585:1: ( ( 'documentation' ) )
            // InternalOCCI.g:7586:1: ( 'documentation' )
            {
            // InternalOCCI.g:7586:1: ( 'documentation' )
            // InternalOCCI.g:7587:2: 'documentation'
            {
             before(grammarAccess.getNumericTypeAccess().getDocumentationKeyword_10_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getDocumentationKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_10__0__Impl"


    // $ANTLR start "rule__NumericType__Group_10__1"
    // InternalOCCI.g:7596:1: rule__NumericType__Group_10__1 : rule__NumericType__Group_10__1__Impl ;
    public final void rule__NumericType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7600:1: ( rule__NumericType__Group_10__1__Impl )
            // InternalOCCI.g:7601:2: rule__NumericType__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_10__1"


    // $ANTLR start "rule__NumericType__Group_10__1__Impl"
    // InternalOCCI.g:7607:1: rule__NumericType__Group_10__1__Impl : ( ( rule__NumericType__DocumentationAssignment_10_1 ) ) ;
    public final void rule__NumericType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7611:1: ( ( ( rule__NumericType__DocumentationAssignment_10_1 ) ) )
            // InternalOCCI.g:7612:1: ( ( rule__NumericType__DocumentationAssignment_10_1 ) )
            {
            // InternalOCCI.g:7612:1: ( ( rule__NumericType__DocumentationAssignment_10_1 ) )
            // InternalOCCI.g:7613:2: ( rule__NumericType__DocumentationAssignment_10_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getDocumentationAssignment_10_1()); 
            // InternalOCCI.g:7614:2: ( rule__NumericType__DocumentationAssignment_10_1 )
            // InternalOCCI.g:7614:3: rule__NumericType__DocumentationAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__DocumentationAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getDocumentationAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__Group_10__1__Impl"


    // $ANTLR start "rule__EnumerationType__Group__0"
    // InternalOCCI.g:7623:1: rule__EnumerationType__Group__0 : rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1 ;
    public final void rule__EnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7627:1: ( rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1 )
            // InternalOCCI.g:7628:2: rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EnumerationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__0"


    // $ANTLR start "rule__EnumerationType__Group__0__Impl"
    // InternalOCCI.g:7635:1: rule__EnumerationType__Group__0__Impl : ( 'EnumerationType' ) ;
    public final void rule__EnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7639:1: ( ( 'EnumerationType' ) )
            // InternalOCCI.g:7640:1: ( 'EnumerationType' )
            {
            // InternalOCCI.g:7640:1: ( 'EnumerationType' )
            // InternalOCCI.g:7641:2: 'EnumerationType'
            {
             before(grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getEnumerationTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group__1"
    // InternalOCCI.g:7650:1: rule__EnumerationType__Group__1 : rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2 ;
    public final void rule__EnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7654:1: ( rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2 )
            // InternalOCCI.g:7655:2: rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__EnumerationType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__1"


    // $ANTLR start "rule__EnumerationType__Group__1__Impl"
    // InternalOCCI.g:7662:1: rule__EnumerationType__Group__1__Impl : ( ( rule__EnumerationType__NameAssignment_1 ) ) ;
    public final void rule__EnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7666:1: ( ( ( rule__EnumerationType__NameAssignment_1 ) ) )
            // InternalOCCI.g:7667:1: ( ( rule__EnumerationType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:7667:1: ( ( rule__EnumerationType__NameAssignment_1 ) )
            // InternalOCCI.g:7668:2: ( rule__EnumerationType__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:7669:2: ( rule__EnumerationType__NameAssignment_1 )
            // InternalOCCI.g:7669:3: rule__EnumerationType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__1__Impl"


    // $ANTLR start "rule__EnumerationType__Group__2"
    // InternalOCCI.g:7677:1: rule__EnumerationType__Group__2 : rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3 ;
    public final void rule__EnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7681:1: ( rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3 )
            // InternalOCCI.g:7682:2: rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__EnumerationType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__2"


    // $ANTLR start "rule__EnumerationType__Group__2__Impl"
    // InternalOCCI.g:7689:1: rule__EnumerationType__Group__2__Impl : ( 'literals' ) ;
    public final void rule__EnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7693:1: ( ( 'literals' ) )
            // InternalOCCI.g:7694:1: ( 'literals' )
            {
            // InternalOCCI.g:7694:1: ( 'literals' )
            // InternalOCCI.g:7695:2: 'literals'
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__2__Impl"


    // $ANTLR start "rule__EnumerationType__Group__3"
    // InternalOCCI.g:7704:1: rule__EnumerationType__Group__3 : rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4 ;
    public final void rule__EnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7708:1: ( rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4 )
            // InternalOCCI.g:7709:2: rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__EnumerationType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__3"


    // $ANTLR start "rule__EnumerationType__Group__3__Impl"
    // InternalOCCI.g:7716:1: rule__EnumerationType__Group__3__Impl : ( '(' ) ;
    public final void rule__EnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7720:1: ( ( '(' ) )
            // InternalOCCI.g:7721:1: ( '(' )
            {
            // InternalOCCI.g:7721:1: ( '(' )
            // InternalOCCI.g:7722:2: '('
            {
             before(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_3()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__3__Impl"


    // $ANTLR start "rule__EnumerationType__Group__4"
    // InternalOCCI.g:7731:1: rule__EnumerationType__Group__4 : rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5 ;
    public final void rule__EnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7735:1: ( rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5 )
            // InternalOCCI.g:7736:2: rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__EnumerationType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__4"


    // $ANTLR start "rule__EnumerationType__Group__4__Impl"
    // InternalOCCI.g:7743:1: rule__EnumerationType__Group__4__Impl : ( ( rule__EnumerationType__LiteralsAssignment_4 ) ) ;
    public final void rule__EnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7747:1: ( ( ( rule__EnumerationType__LiteralsAssignment_4 ) ) )
            // InternalOCCI.g:7748:1: ( ( rule__EnumerationType__LiteralsAssignment_4 ) )
            {
            // InternalOCCI.g:7748:1: ( ( rule__EnumerationType__LiteralsAssignment_4 ) )
            // InternalOCCI.g:7749:2: ( rule__EnumerationType__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_4()); 
            // InternalOCCI.g:7750:2: ( rule__EnumerationType__LiteralsAssignment_4 )
            // InternalOCCI.g:7750:3: rule__EnumerationType__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__LiteralsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__4__Impl"


    // $ANTLR start "rule__EnumerationType__Group__5"
    // InternalOCCI.g:7758:1: rule__EnumerationType__Group__5 : rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6 ;
    public final void rule__EnumerationType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7762:1: ( rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6 )
            // InternalOCCI.g:7763:2: rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__EnumerationType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__5"


    // $ANTLR start "rule__EnumerationType__Group__5__Impl"
    // InternalOCCI.g:7770:1: rule__EnumerationType__Group__5__Impl : ( ( rule__EnumerationType__Group_5__0 )* ) ;
    public final void rule__EnumerationType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7774:1: ( ( ( rule__EnumerationType__Group_5__0 )* ) )
            // InternalOCCI.g:7775:1: ( ( rule__EnumerationType__Group_5__0 )* )
            {
            // InternalOCCI.g:7775:1: ( ( rule__EnumerationType__Group_5__0 )* )
            // InternalOCCI.g:7776:2: ( rule__EnumerationType__Group_5__0 )*
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup_5()); 
            // InternalOCCI.g:7777:2: ( rule__EnumerationType__Group_5__0 )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==71) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalOCCI.g:7777:3: rule__EnumerationType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__EnumerationType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

             after(grammarAccess.getEnumerationTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__5__Impl"


    // $ANTLR start "rule__EnumerationType__Group__6"
    // InternalOCCI.g:7785:1: rule__EnumerationType__Group__6 : rule__EnumerationType__Group__6__Impl rule__EnumerationType__Group__7 ;
    public final void rule__EnumerationType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7789:1: ( rule__EnumerationType__Group__6__Impl rule__EnumerationType__Group__7 )
            // InternalOCCI.g:7790:2: rule__EnumerationType__Group__6__Impl rule__EnumerationType__Group__7
            {
            pushFollow(FOLLOW_42);
            rule__EnumerationType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__6"


    // $ANTLR start "rule__EnumerationType__Group__6__Impl"
    // InternalOCCI.g:7797:1: rule__EnumerationType__Group__6__Impl : ( ')' ) ;
    public final void rule__EnumerationType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7801:1: ( ( ')' ) )
            // InternalOCCI.g:7802:1: ( ')' )
            {
            // InternalOCCI.g:7802:1: ( ')' )
            // InternalOCCI.g:7803:2: ')'
            {
             before(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_6()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__6__Impl"


    // $ANTLR start "rule__EnumerationType__Group__7"
    // InternalOCCI.g:7812:1: rule__EnumerationType__Group__7 : rule__EnumerationType__Group__7__Impl ;
    public final void rule__EnumerationType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7816:1: ( rule__EnumerationType__Group__7__Impl )
            // InternalOCCI.g:7817:2: rule__EnumerationType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__7"


    // $ANTLR start "rule__EnumerationType__Group__7__Impl"
    // InternalOCCI.g:7823:1: rule__EnumerationType__Group__7__Impl : ( ( rule__EnumerationType__Group_7__0 )? ) ;
    public final void rule__EnumerationType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7827:1: ( ( ( rule__EnumerationType__Group_7__0 )? ) )
            // InternalOCCI.g:7828:1: ( ( rule__EnumerationType__Group_7__0 )? )
            {
            // InternalOCCI.g:7828:1: ( ( rule__EnumerationType__Group_7__0 )? )
            // InternalOCCI.g:7829:2: ( rule__EnumerationType__Group_7__0 )?
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup_7()); 
            // InternalOCCI.g:7830:2: ( rule__EnumerationType__Group_7__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalOCCI.g:7830:3: rule__EnumerationType__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationType__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationTypeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__7__Impl"


    // $ANTLR start "rule__EnumerationType__Group_5__0"
    // InternalOCCI.g:7839:1: rule__EnumerationType__Group_5__0 : rule__EnumerationType__Group_5__0__Impl rule__EnumerationType__Group_5__1 ;
    public final void rule__EnumerationType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7843:1: ( rule__EnumerationType__Group_5__0__Impl rule__EnumerationType__Group_5__1 )
            // InternalOCCI.g:7844:2: rule__EnumerationType__Group_5__0__Impl rule__EnumerationType__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__EnumerationType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__0"


    // $ANTLR start "rule__EnumerationType__Group_5__0__Impl"
    // InternalOCCI.g:7851:1: rule__EnumerationType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__EnumerationType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7855:1: ( ( ',' ) )
            // InternalOCCI.g:7856:1: ( ',' )
            {
            // InternalOCCI.g:7856:1: ( ',' )
            // InternalOCCI.g:7857:2: ','
            {
             before(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group_5__1"
    // InternalOCCI.g:7866:1: rule__EnumerationType__Group_5__1 : rule__EnumerationType__Group_5__1__Impl ;
    public final void rule__EnumerationType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7870:1: ( rule__EnumerationType__Group_5__1__Impl )
            // InternalOCCI.g:7871:2: rule__EnumerationType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__1"


    // $ANTLR start "rule__EnumerationType__Group_5__1__Impl"
    // InternalOCCI.g:7877:1: rule__EnumerationType__Group_5__1__Impl : ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) ) ;
    public final void rule__EnumerationType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7881:1: ( ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) ) )
            // InternalOCCI.g:7882:1: ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) )
            {
            // InternalOCCI.g:7882:1: ( ( rule__EnumerationType__LiteralsAssignment_5_1 ) )
            // InternalOCCI.g:7883:2: ( rule__EnumerationType__LiteralsAssignment_5_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_5_1()); 
            // InternalOCCI.g:7884:2: ( rule__EnumerationType__LiteralsAssignment_5_1 )
            // InternalOCCI.g:7884:3: rule__EnumerationType__LiteralsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__LiteralsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_5__1__Impl"


    // $ANTLR start "rule__EnumerationType__Group_7__0"
    // InternalOCCI.g:7893:1: rule__EnumerationType__Group_7__0 : rule__EnumerationType__Group_7__0__Impl rule__EnumerationType__Group_7__1 ;
    public final void rule__EnumerationType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7897:1: ( rule__EnumerationType__Group_7__0__Impl rule__EnumerationType__Group_7__1 )
            // InternalOCCI.g:7898:2: rule__EnumerationType__Group_7__0__Impl rule__EnumerationType__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationType__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_7__0"


    // $ANTLR start "rule__EnumerationType__Group_7__0__Impl"
    // InternalOCCI.g:7905:1: rule__EnumerationType__Group_7__0__Impl : ( 'documentation' ) ;
    public final void rule__EnumerationType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7909:1: ( ( 'documentation' ) )
            // InternalOCCI.g:7910:1: ( 'documentation' )
            {
            // InternalOCCI.g:7910:1: ( 'documentation' )
            // InternalOCCI.g:7911:2: 'documentation'
            {
             before(grammarAccess.getEnumerationTypeAccess().getDocumentationKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getDocumentationKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_7__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group_7__1"
    // InternalOCCI.g:7920:1: rule__EnumerationType__Group_7__1 : rule__EnumerationType__Group_7__1__Impl ;
    public final void rule__EnumerationType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7924:1: ( rule__EnumerationType__Group_7__1__Impl )
            // InternalOCCI.g:7925:2: rule__EnumerationType__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_7__1"


    // $ANTLR start "rule__EnumerationType__Group_7__1__Impl"
    // InternalOCCI.g:7931:1: rule__EnumerationType__Group_7__1__Impl : ( ( rule__EnumerationType__DocumentationAssignment_7_1 ) ) ;
    public final void rule__EnumerationType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7935:1: ( ( ( rule__EnumerationType__DocumentationAssignment_7_1 ) ) )
            // InternalOCCI.g:7936:1: ( ( rule__EnumerationType__DocumentationAssignment_7_1 ) )
            {
            // InternalOCCI.g:7936:1: ( ( rule__EnumerationType__DocumentationAssignment_7_1 ) )
            // InternalOCCI.g:7937:2: ( rule__EnumerationType__DocumentationAssignment_7_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getDocumentationAssignment_7_1()); 
            // InternalOCCI.g:7938:2: ( rule__EnumerationType__DocumentationAssignment_7_1 )
            // InternalOCCI.g:7938:3: rule__EnumerationType__DocumentationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__DocumentationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getDocumentationAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_7__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__0"
    // InternalOCCI.g:7947:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7951:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalOCCI.g:7952:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0"


    // $ANTLR start "rule__EnumerationLiteral__Group__0__Impl"
    // InternalOCCI.g:7959:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7963:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // InternalOCCI.g:7964:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // InternalOCCI.g:7964:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // InternalOCCI.g:7965:2: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // InternalOCCI.g:7966:2: ( rule__EnumerationLiteral__NameAssignment_0 )
            // InternalOCCI.g:7966:3: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__1"
    // InternalOCCI.g:7974:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7978:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // InternalOCCI.g:7979:2: rule__EnumerationLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1"


    // $ANTLR start "rule__EnumerationLiteral__Group__1__Impl"
    // InternalOCCI.g:7985:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__Group_1__0 )? ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7989:1: ( ( ( rule__EnumerationLiteral__Group_1__0 )? ) )
            // InternalOCCI.g:7990:1: ( ( rule__EnumerationLiteral__Group_1__0 )? )
            {
            // InternalOCCI.g:7990:1: ( ( rule__EnumerationLiteral__Group_1__0 )? )
            // InternalOCCI.g:7991:2: ( rule__EnumerationLiteral__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // InternalOCCI.g:7992:2: ( rule__EnumerationLiteral__Group_1__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==38) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalOCCI.g:7992:3: rule__EnumerationLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationLiteral__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__0"
    // InternalOCCI.g:8001:1: rule__EnumerationLiteral__Group_1__0 : rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8005:1: ( rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 )
            // InternalOCCI.g:8006:2: rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__0"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__0__Impl"
    // InternalOCCI.g:8013:1: rule__EnumerationLiteral__Group_1__0__Impl : ( 'documentation' ) ;
    public final void rule__EnumerationLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8017:1: ( ( 'documentation' ) )
            // InternalOCCI.g:8018:1: ( 'documentation' )
            {
            // InternalOCCI.g:8018:1: ( 'documentation' )
            // InternalOCCI.g:8019:2: 'documentation'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getDocumentationKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getDocumentationKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__1"
    // InternalOCCI.g:8028:1: rule__EnumerationLiteral__Group_1__1 : rule__EnumerationLiteral__Group_1__1__Impl ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8032:1: ( rule__EnumerationLiteral__Group_1__1__Impl )
            // InternalOCCI.g:8033:2: rule__EnumerationLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__1"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__1__Impl"
    // InternalOCCI.g:8039:1: rule__EnumerationLiteral__Group_1__1__Impl : ( ( rule__EnumerationLiteral__DocumentationAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8043:1: ( ( ( rule__EnumerationLiteral__DocumentationAssignment_1_1 ) ) )
            // InternalOCCI.g:8044:1: ( ( rule__EnumerationLiteral__DocumentationAssignment_1_1 ) )
            {
            // InternalOCCI.g:8044:1: ( ( rule__EnumerationLiteral__DocumentationAssignment_1_1 ) )
            // InternalOCCI.g:8045:2: ( rule__EnumerationLiteral__DocumentationAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getDocumentationAssignment_1_1()); 
            // InternalOCCI.g:8046:2: ( rule__EnumerationLiteral__DocumentationAssignment_1_1 )
            // InternalOCCI.g:8046:3: rule__EnumerationLiteral__DocumentationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__DocumentationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getDocumentationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // InternalOCCI.g:8055:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8059:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // InternalOCCI.g:8060:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__RecordType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0"


    // $ANTLR start "rule__RecordType__Group__0__Impl"
    // InternalOCCI.g:8067:1: rule__RecordType__Group__0__Impl : ( 'RecordType' ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8071:1: ( ( 'RecordType' ) )
            // InternalOCCI.g:8072:1: ( 'RecordType' )
            {
            // InternalOCCI.g:8072:1: ( 'RecordType' )
            // InternalOCCI.g:8073:2: 'RecordType'
            {
             before(grammarAccess.getRecordTypeAccess().getRecordTypeKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getRecordTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0__Impl"


    // $ANTLR start "rule__RecordType__Group__1"
    // InternalOCCI.g:8082:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8086:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // InternalOCCI.g:8087:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__RecordType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1"


    // $ANTLR start "rule__RecordType__Group__1__Impl"
    // InternalOCCI.g:8094:1: rule__RecordType__Group__1__Impl : ( ( rule__RecordType__NameAssignment_1 ) ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8098:1: ( ( ( rule__RecordType__NameAssignment_1 ) ) )
            // InternalOCCI.g:8099:1: ( ( rule__RecordType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:8099:1: ( ( rule__RecordType__NameAssignment_1 ) )
            // InternalOCCI.g:8100:2: ( rule__RecordType__NameAssignment_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:8101:2: ( rule__RecordType__NameAssignment_1 )
            // InternalOCCI.g:8101:3: rule__RecordType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1__Impl"


    // $ANTLR start "rule__RecordType__Group__2"
    // InternalOCCI.g:8109:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8113:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // InternalOCCI.g:8114:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__RecordType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2"


    // $ANTLR start "rule__RecordType__Group__2__Impl"
    // InternalOCCI.g:8121:1: rule__RecordType__Group__2__Impl : ( 'fields' ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8125:1: ( ( 'fields' ) )
            // InternalOCCI.g:8126:1: ( 'fields' )
            {
            // InternalOCCI.g:8126:1: ( 'fields' )
            // InternalOCCI.g:8127:2: 'fields'
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsKeyword_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getFieldsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2__Impl"


    // $ANTLR start "rule__RecordType__Group__3"
    // InternalOCCI.g:8136:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8140:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // InternalOCCI.g:8141:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RecordType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3"


    // $ANTLR start "rule__RecordType__Group__3__Impl"
    // InternalOCCI.g:8148:1: rule__RecordType__Group__3__Impl : ( '(' ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8152:1: ( ( '(' ) )
            // InternalOCCI.g:8153:1: ( '(' )
            {
            // InternalOCCI.g:8153:1: ( '(' )
            // InternalOCCI.g:8154:2: '('
            {
             before(grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_3()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3__Impl"


    // $ANTLR start "rule__RecordType__Group__4"
    // InternalOCCI.g:8163:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8167:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // InternalOCCI.g:8168:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__RecordType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4"


    // $ANTLR start "rule__RecordType__Group__4__Impl"
    // InternalOCCI.g:8175:1: rule__RecordType__Group__4__Impl : ( ( rule__RecordType__RecordFieldsAssignment_4 ) ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8179:1: ( ( ( rule__RecordType__RecordFieldsAssignment_4 ) ) )
            // InternalOCCI.g:8180:1: ( ( rule__RecordType__RecordFieldsAssignment_4 ) )
            {
            // InternalOCCI.g:8180:1: ( ( rule__RecordType__RecordFieldsAssignment_4 ) )
            // InternalOCCI.g:8181:2: ( rule__RecordType__RecordFieldsAssignment_4 )
            {
             before(grammarAccess.getRecordTypeAccess().getRecordFieldsAssignment_4()); 
            // InternalOCCI.g:8182:2: ( rule__RecordType__RecordFieldsAssignment_4 )
            // InternalOCCI.g:8182:3: rule__RecordType__RecordFieldsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__RecordFieldsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getRecordFieldsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4__Impl"


    // $ANTLR start "rule__RecordType__Group__5"
    // InternalOCCI.g:8190:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8194:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // InternalOCCI.g:8195:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__RecordType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__5"


    // $ANTLR start "rule__RecordType__Group__5__Impl"
    // InternalOCCI.g:8202:1: rule__RecordType__Group__5__Impl : ( ( rule__RecordType__Group_5__0 )* ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8206:1: ( ( ( rule__RecordType__Group_5__0 )* ) )
            // InternalOCCI.g:8207:1: ( ( rule__RecordType__Group_5__0 )* )
            {
            // InternalOCCI.g:8207:1: ( ( rule__RecordType__Group_5__0 )* )
            // InternalOCCI.g:8208:2: ( rule__RecordType__Group_5__0 )*
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_5()); 
            // InternalOCCI.g:8209:2: ( rule__RecordType__Group_5__0 )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==71) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalOCCI.g:8209:3: rule__RecordType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RecordType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

             after(grammarAccess.getRecordTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__5__Impl"


    // $ANTLR start "rule__RecordType__Group__6"
    // InternalOCCI.g:8217:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8221:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // InternalOCCI.g:8222:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_42);
            rule__RecordType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__6"


    // $ANTLR start "rule__RecordType__Group__6__Impl"
    // InternalOCCI.g:8229:1: rule__RecordType__Group__6__Impl : ( ')' ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8233:1: ( ( ')' ) )
            // InternalOCCI.g:8234:1: ( ')' )
            {
            // InternalOCCI.g:8234:1: ( ')' )
            // InternalOCCI.g:8235:2: ')'
            {
             before(grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_6()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__6__Impl"


    // $ANTLR start "rule__RecordType__Group__7"
    // InternalOCCI.g:8244:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8248:1: ( rule__RecordType__Group__7__Impl )
            // InternalOCCI.g:8249:2: rule__RecordType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__7"


    // $ANTLR start "rule__RecordType__Group__7__Impl"
    // InternalOCCI.g:8255:1: rule__RecordType__Group__7__Impl : ( ( rule__RecordType__Group_7__0 )? ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8259:1: ( ( ( rule__RecordType__Group_7__0 )? ) )
            // InternalOCCI.g:8260:1: ( ( rule__RecordType__Group_7__0 )? )
            {
            // InternalOCCI.g:8260:1: ( ( rule__RecordType__Group_7__0 )? )
            // InternalOCCI.g:8261:2: ( rule__RecordType__Group_7__0 )?
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_7()); 
            // InternalOCCI.g:8262:2: ( rule__RecordType__Group_7__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==38) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalOCCI.g:8262:3: rule__RecordType__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordType__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordTypeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__7__Impl"


    // $ANTLR start "rule__RecordType__Group_5__0"
    // InternalOCCI.g:8271:1: rule__RecordType__Group_5__0 : rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 ;
    public final void rule__RecordType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8275:1: ( rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 )
            // InternalOCCI.g:8276:2: rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__RecordType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_5__0"


    // $ANTLR start "rule__RecordType__Group_5__0__Impl"
    // InternalOCCI.g:8283:1: rule__RecordType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8287:1: ( ( ',' ) )
            // InternalOCCI.g:8288:1: ( ',' )
            {
            // InternalOCCI.g:8288:1: ( ',' )
            // InternalOCCI.g:8289:2: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_5_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_5__0__Impl"


    // $ANTLR start "rule__RecordType__Group_5__1"
    // InternalOCCI.g:8298:1: rule__RecordType__Group_5__1 : rule__RecordType__Group_5__1__Impl ;
    public final void rule__RecordType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8302:1: ( rule__RecordType__Group_5__1__Impl )
            // InternalOCCI.g:8303:2: rule__RecordType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_5__1"


    // $ANTLR start "rule__RecordType__Group_5__1__Impl"
    // InternalOCCI.g:8309:1: rule__RecordType__Group_5__1__Impl : ( ( rule__RecordType__RecordFieldsAssignment_5_1 ) ) ;
    public final void rule__RecordType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8313:1: ( ( ( rule__RecordType__RecordFieldsAssignment_5_1 ) ) )
            // InternalOCCI.g:8314:1: ( ( rule__RecordType__RecordFieldsAssignment_5_1 ) )
            {
            // InternalOCCI.g:8314:1: ( ( rule__RecordType__RecordFieldsAssignment_5_1 ) )
            // InternalOCCI.g:8315:2: ( rule__RecordType__RecordFieldsAssignment_5_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getRecordFieldsAssignment_5_1()); 
            // InternalOCCI.g:8316:2: ( rule__RecordType__RecordFieldsAssignment_5_1 )
            // InternalOCCI.g:8316:3: rule__RecordType__RecordFieldsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__RecordFieldsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getRecordFieldsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_5__1__Impl"


    // $ANTLR start "rule__RecordType__Group_7__0"
    // InternalOCCI.g:8325:1: rule__RecordType__Group_7__0 : rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 ;
    public final void rule__RecordType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8329:1: ( rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 )
            // InternalOCCI.g:8330:2: rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__RecordType__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_7__0"


    // $ANTLR start "rule__RecordType__Group_7__0__Impl"
    // InternalOCCI.g:8337:1: rule__RecordType__Group_7__0__Impl : ( 'documentation' ) ;
    public final void rule__RecordType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8341:1: ( ( 'documentation' ) )
            // InternalOCCI.g:8342:1: ( 'documentation' )
            {
            // InternalOCCI.g:8342:1: ( 'documentation' )
            // InternalOCCI.g:8343:2: 'documentation'
            {
             before(grammarAccess.getRecordTypeAccess().getDocumentationKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getDocumentationKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_7__0__Impl"


    // $ANTLR start "rule__RecordType__Group_7__1"
    // InternalOCCI.g:8352:1: rule__RecordType__Group_7__1 : rule__RecordType__Group_7__1__Impl ;
    public final void rule__RecordType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8356:1: ( rule__RecordType__Group_7__1__Impl )
            // InternalOCCI.g:8357:2: rule__RecordType__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_7__1"


    // $ANTLR start "rule__RecordType__Group_7__1__Impl"
    // InternalOCCI.g:8363:1: rule__RecordType__Group_7__1__Impl : ( ( rule__RecordType__DocumentationAssignment_7_1 ) ) ;
    public final void rule__RecordType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8367:1: ( ( ( rule__RecordType__DocumentationAssignment_7_1 ) ) )
            // InternalOCCI.g:8368:1: ( ( rule__RecordType__DocumentationAssignment_7_1 ) )
            {
            // InternalOCCI.g:8368:1: ( ( rule__RecordType__DocumentationAssignment_7_1 ) )
            // InternalOCCI.g:8369:2: ( rule__RecordType__DocumentationAssignment_7_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getDocumentationAssignment_7_1()); 
            // InternalOCCI.g:8370:2: ( rule__RecordType__DocumentationAssignment_7_1 )
            // InternalOCCI.g:8370:3: rule__RecordType__DocumentationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__DocumentationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getDocumentationAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_7__1__Impl"


    // $ANTLR start "rule__RecordField__Group__0"
    // InternalOCCI.g:8379:1: rule__RecordField__Group__0 : rule__RecordField__Group__0__Impl rule__RecordField__Group__1 ;
    public final void rule__RecordField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8383:1: ( rule__RecordField__Group__0__Impl rule__RecordField__Group__1 )
            // InternalOCCI.g:8384:2: rule__RecordField__Group__0__Impl rule__RecordField__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RecordField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__0"


    // $ANTLR start "rule__RecordField__Group__0__Impl"
    // InternalOCCI.g:8391:1: rule__RecordField__Group__0__Impl : ( ( rule__RecordField__MutableAssignment_0 )? ) ;
    public final void rule__RecordField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8395:1: ( ( ( rule__RecordField__MutableAssignment_0 )? ) )
            // InternalOCCI.g:8396:1: ( ( rule__RecordField__MutableAssignment_0 )? )
            {
            // InternalOCCI.g:8396:1: ( ( rule__RecordField__MutableAssignment_0 )? )
            // InternalOCCI.g:8397:2: ( rule__RecordField__MutableAssignment_0 )?
            {
             before(grammarAccess.getRecordFieldAccess().getMutableAssignment_0()); 
            // InternalOCCI.g:8398:2: ( rule__RecordField__MutableAssignment_0 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==31) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==33) ) {
                    int LA73_3 = input.LA(3);

                    if ( (LA73_3==33) ) {
                        switch ( input.LA(4) ) {
                            case RULE_ID:
                            case RULE_QUALIFIED_ID:
                            case 13:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
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
                                {
                                alt73=1;
                                }
                                break;
                            case 14:
                                {
                                int LA73_6 = input.LA(5);

                                if ( (LA73_6==EOF||LA73_6==14||LA73_6==21||LA73_6==68||(LA73_6>=71 && LA73_6<=72)) ) {
                                    alt73=1;
                                }
                                }
                                break;
                            case 21:
                                {
                                int LA73_7 = input.LA(5);

                                if ( (LA73_7==EOF||LA73_7==14||LA73_7==21||LA73_7==68||(LA73_7>=71 && LA73_7<=72)) ) {
                                    alt73=1;
                                }
                                }
                                break;
                        }

                    }
                }
                else if ( ((LA73_1>=RULE_ID && LA73_1<=RULE_QUALIFIED_ID)||(LA73_1>=13 && LA73_1<=32)||(LA73_1>=34 && LA73_1<=64)) ) {
                    alt73=1;
                }
            }
            switch (alt73) {
                case 1 :
                    // InternalOCCI.g:8398:3: rule__RecordField__MutableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordField__MutableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordFieldAccess().getMutableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__0__Impl"


    // $ANTLR start "rule__RecordField__Group__1"
    // InternalOCCI.g:8406:1: rule__RecordField__Group__1 : rule__RecordField__Group__1__Impl rule__RecordField__Group__2 ;
    public final void rule__RecordField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8410:1: ( rule__RecordField__Group__1__Impl rule__RecordField__Group__2 )
            // InternalOCCI.g:8411:2: rule__RecordField__Group__1__Impl rule__RecordField__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RecordField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__1"


    // $ANTLR start "rule__RecordField__Group__1__Impl"
    // InternalOCCI.g:8418:1: rule__RecordField__Group__1__Impl : ( ( rule__RecordField__RequiredAssignment_1 )? ) ;
    public final void rule__RecordField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8422:1: ( ( ( rule__RecordField__RequiredAssignment_1 )? ) )
            // InternalOCCI.g:8423:1: ( ( rule__RecordField__RequiredAssignment_1 )? )
            {
            // InternalOCCI.g:8423:1: ( ( rule__RecordField__RequiredAssignment_1 )? )
            // InternalOCCI.g:8424:2: ( rule__RecordField__RequiredAssignment_1 )?
            {
             before(grammarAccess.getRecordFieldAccess().getRequiredAssignment_1()); 
            // InternalOCCI.g:8425:2: ( rule__RecordField__RequiredAssignment_1 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==32) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==33) ) {
                    int LA74_3 = input.LA(3);

                    if ( (LA74_3==33) ) {
                        switch ( input.LA(4) ) {
                            case 14:
                                {
                                int LA74_6 = input.LA(5);

                                if ( (LA74_6==EOF||LA74_6==14||LA74_6==21||LA74_6==68||(LA74_6>=71 && LA74_6<=72)) ) {
                                    alt74=1;
                                }
                                }
                                break;
                            case 21:
                                {
                                int LA74_7 = input.LA(5);

                                if ( (LA74_7==EOF||LA74_7==14||LA74_7==21||LA74_7==68||(LA74_7>=71 && LA74_7<=72)) ) {
                                    alt74=1;
                                }
                                }
                                break;
                            case RULE_ID:
                            case RULE_QUALIFIED_ID:
                            case 13:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
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
                                {
                                alt74=1;
                                }
                                break;
                        }

                    }
                }
                else if ( ((LA74_1>=RULE_ID && LA74_1<=RULE_QUALIFIED_ID)||(LA74_1>=13 && LA74_1<=32)||(LA74_1>=34 && LA74_1<=64)) ) {
                    alt74=1;
                }
            }
            switch (alt74) {
                case 1 :
                    // InternalOCCI.g:8425:3: rule__RecordField__RequiredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordField__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordFieldAccess().getRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__1__Impl"


    // $ANTLR start "rule__RecordField__Group__2"
    // InternalOCCI.g:8433:1: rule__RecordField__Group__2 : rule__RecordField__Group__2__Impl rule__RecordField__Group__3 ;
    public final void rule__RecordField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8437:1: ( rule__RecordField__Group__2__Impl rule__RecordField__Group__3 )
            // InternalOCCI.g:8438:2: rule__RecordField__Group__2__Impl rule__RecordField__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__RecordField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__2"


    // $ANTLR start "rule__RecordField__Group__2__Impl"
    // InternalOCCI.g:8445:1: rule__RecordField__Group__2__Impl : ( ( rule__RecordField__NameAssignment_2 ) ) ;
    public final void rule__RecordField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8449:1: ( ( ( rule__RecordField__NameAssignment_2 ) ) )
            // InternalOCCI.g:8450:1: ( ( rule__RecordField__NameAssignment_2 ) )
            {
            // InternalOCCI.g:8450:1: ( ( rule__RecordField__NameAssignment_2 ) )
            // InternalOCCI.g:8451:2: ( rule__RecordField__NameAssignment_2 )
            {
             before(grammarAccess.getRecordFieldAccess().getNameAssignment_2()); 
            // InternalOCCI.g:8452:2: ( rule__RecordField__NameAssignment_2 )
            // InternalOCCI.g:8452:3: rule__RecordField__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__2__Impl"


    // $ANTLR start "rule__RecordField__Group__3"
    // InternalOCCI.g:8460:1: rule__RecordField__Group__3 : rule__RecordField__Group__3__Impl rule__RecordField__Group__4 ;
    public final void rule__RecordField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8464:1: ( rule__RecordField__Group__3__Impl rule__RecordField__Group__4 )
            // InternalOCCI.g:8465:2: rule__RecordField__Group__3__Impl rule__RecordField__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__RecordField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__3"


    // $ANTLR start "rule__RecordField__Group__3__Impl"
    // InternalOCCI.g:8472:1: rule__RecordField__Group__3__Impl : ( ( rule__RecordField__Group_3__0 ) ) ;
    public final void rule__RecordField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8476:1: ( ( ( rule__RecordField__Group_3__0 ) ) )
            // InternalOCCI.g:8477:1: ( ( rule__RecordField__Group_3__0 ) )
            {
            // InternalOCCI.g:8477:1: ( ( rule__RecordField__Group_3__0 ) )
            // InternalOCCI.g:8478:2: ( rule__RecordField__Group_3__0 )
            {
             before(grammarAccess.getRecordFieldAccess().getGroup_3()); 
            // InternalOCCI.g:8479:2: ( rule__RecordField__Group_3__0 )
            // InternalOCCI.g:8479:3: rule__RecordField__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__3__Impl"


    // $ANTLR start "rule__RecordField__Group__4"
    // InternalOCCI.g:8487:1: rule__RecordField__Group__4 : rule__RecordField__Group__4__Impl rule__RecordField__Group__5 ;
    public final void rule__RecordField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8491:1: ( rule__RecordField__Group__4__Impl rule__RecordField__Group__5 )
            // InternalOCCI.g:8492:2: rule__RecordField__Group__4__Impl rule__RecordField__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__RecordField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__4"


    // $ANTLR start "rule__RecordField__Group__4__Impl"
    // InternalOCCI.g:8499:1: rule__RecordField__Group__4__Impl : ( ( rule__RecordField__Group_4__0 )? ) ;
    public final void rule__RecordField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8503:1: ( ( ( rule__RecordField__Group_4__0 )? ) )
            // InternalOCCI.g:8504:1: ( ( rule__RecordField__Group_4__0 )? )
            {
            // InternalOCCI.g:8504:1: ( ( rule__RecordField__Group_4__0 )? )
            // InternalOCCI.g:8505:2: ( rule__RecordField__Group_4__0 )?
            {
             before(grammarAccess.getRecordFieldAccess().getGroup_4()); 
            // InternalOCCI.g:8506:2: ( rule__RecordField__Group_4__0 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==72) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalOCCI.g:8506:3: rule__RecordField__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordField__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordFieldAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__4__Impl"


    // $ANTLR start "rule__RecordField__Group__5"
    // InternalOCCI.g:8514:1: rule__RecordField__Group__5 : rule__RecordField__Group__5__Impl rule__RecordField__Group__6 ;
    public final void rule__RecordField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8518:1: ( rule__RecordField__Group__5__Impl rule__RecordField__Group__6 )
            // InternalOCCI.g:8519:2: rule__RecordField__Group__5__Impl rule__RecordField__Group__6
            {
            pushFollow(FOLLOW_48);
            rule__RecordField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__5"


    // $ANTLR start "rule__RecordField__Group__5__Impl"
    // InternalOCCI.g:8526:1: rule__RecordField__Group__5__Impl : ( ( rule__RecordField__Group_5__0 )? ) ;
    public final void rule__RecordField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8530:1: ( ( ( rule__RecordField__Group_5__0 )? ) )
            // InternalOCCI.g:8531:1: ( ( rule__RecordField__Group_5__0 )? )
            {
            // InternalOCCI.g:8531:1: ( ( rule__RecordField__Group_5__0 )? )
            // InternalOCCI.g:8532:2: ( rule__RecordField__Group_5__0 )?
            {
             before(grammarAccess.getRecordFieldAccess().getGroup_5()); 
            // InternalOCCI.g:8533:2: ( rule__RecordField__Group_5__0 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==14) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalOCCI.g:8533:3: rule__RecordField__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordField__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordFieldAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__5__Impl"


    // $ANTLR start "rule__RecordField__Group__6"
    // InternalOCCI.g:8541:1: rule__RecordField__Group__6 : rule__RecordField__Group__6__Impl ;
    public final void rule__RecordField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8545:1: ( rule__RecordField__Group__6__Impl )
            // InternalOCCI.g:8546:2: rule__RecordField__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__6"


    // $ANTLR start "rule__RecordField__Group__6__Impl"
    // InternalOCCI.g:8552:1: rule__RecordField__Group__6__Impl : ( ( rule__RecordField__Group_6__0 )? ) ;
    public final void rule__RecordField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8556:1: ( ( ( rule__RecordField__Group_6__0 )? ) )
            // InternalOCCI.g:8557:1: ( ( rule__RecordField__Group_6__0 )? )
            {
            // InternalOCCI.g:8557:1: ( ( rule__RecordField__Group_6__0 )? )
            // InternalOCCI.g:8558:2: ( rule__RecordField__Group_6__0 )?
            {
             before(grammarAccess.getRecordFieldAccess().getGroup_6()); 
            // InternalOCCI.g:8559:2: ( rule__RecordField__Group_6__0 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==21) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalOCCI.g:8559:3: rule__RecordField__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordField__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordFieldAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__6__Impl"


    // $ANTLR start "rule__RecordField__Group_3__0"
    // InternalOCCI.g:8568:1: rule__RecordField__Group_3__0 : rule__RecordField__Group_3__0__Impl rule__RecordField__Group_3__1 ;
    public final void rule__RecordField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8572:1: ( rule__RecordField__Group_3__0__Impl rule__RecordField__Group_3__1 )
            // InternalOCCI.g:8573:2: rule__RecordField__Group_3__0__Impl rule__RecordField__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__RecordField__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_3__0"


    // $ANTLR start "rule__RecordField__Group_3__0__Impl"
    // InternalOCCI.g:8580:1: rule__RecordField__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__RecordField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8584:1: ( ( 'type' ) )
            // InternalOCCI.g:8585:1: ( 'type' )
            {
            // InternalOCCI.g:8585:1: ( 'type' )
            // InternalOCCI.g:8586:2: 'type'
            {
             before(grammarAccess.getRecordFieldAccess().getTypeKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_3__0__Impl"


    // $ANTLR start "rule__RecordField__Group_3__1"
    // InternalOCCI.g:8595:1: rule__RecordField__Group_3__1 : rule__RecordField__Group_3__1__Impl ;
    public final void rule__RecordField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8599:1: ( rule__RecordField__Group_3__1__Impl )
            // InternalOCCI.g:8600:2: rule__RecordField__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_3__1"


    // $ANTLR start "rule__RecordField__Group_3__1__Impl"
    // InternalOCCI.g:8606:1: rule__RecordField__Group_3__1__Impl : ( ( rule__RecordField__TypeAssignment_3_1 ) ) ;
    public final void rule__RecordField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8610:1: ( ( ( rule__RecordField__TypeAssignment_3_1 ) ) )
            // InternalOCCI.g:8611:1: ( ( rule__RecordField__TypeAssignment_3_1 ) )
            {
            // InternalOCCI.g:8611:1: ( ( rule__RecordField__TypeAssignment_3_1 ) )
            // InternalOCCI.g:8612:2: ( rule__RecordField__TypeAssignment_3_1 )
            {
             before(grammarAccess.getRecordFieldAccess().getTypeAssignment_3_1()); 
            // InternalOCCI.g:8613:2: ( rule__RecordField__TypeAssignment_3_1 )
            // InternalOCCI.g:8613:3: rule__RecordField__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_3__1__Impl"


    // $ANTLR start "rule__RecordField__Group_4__0"
    // InternalOCCI.g:8622:1: rule__RecordField__Group_4__0 : rule__RecordField__Group_4__0__Impl rule__RecordField__Group_4__1 ;
    public final void rule__RecordField__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8626:1: ( rule__RecordField__Group_4__0__Impl rule__RecordField__Group_4__1 )
            // InternalOCCI.g:8627:2: rule__RecordField__Group_4__0__Impl rule__RecordField__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RecordField__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_4__0"


    // $ANTLR start "rule__RecordField__Group_4__0__Impl"
    // InternalOCCI.g:8634:1: rule__RecordField__Group_4__0__Impl : ( '=' ) ;
    public final void rule__RecordField__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8638:1: ( ( '=' ) )
            // InternalOCCI.g:8639:1: ( '=' )
            {
            // InternalOCCI.g:8639:1: ( '=' )
            // InternalOCCI.g:8640:2: '='
            {
             before(grammarAccess.getRecordFieldAccess().getEqualsSignKeyword_4_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_4__0__Impl"


    // $ANTLR start "rule__RecordField__Group_4__1"
    // InternalOCCI.g:8649:1: rule__RecordField__Group_4__1 : rule__RecordField__Group_4__1__Impl ;
    public final void rule__RecordField__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8653:1: ( rule__RecordField__Group_4__1__Impl )
            // InternalOCCI.g:8654:2: rule__RecordField__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_4__1"


    // $ANTLR start "rule__RecordField__Group_4__1__Impl"
    // InternalOCCI.g:8660:1: rule__RecordField__Group_4__1__Impl : ( ( rule__RecordField__DefaultAssignment_4_1 ) ) ;
    public final void rule__RecordField__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8664:1: ( ( ( rule__RecordField__DefaultAssignment_4_1 ) ) )
            // InternalOCCI.g:8665:1: ( ( rule__RecordField__DefaultAssignment_4_1 ) )
            {
            // InternalOCCI.g:8665:1: ( ( rule__RecordField__DefaultAssignment_4_1 ) )
            // InternalOCCI.g:8666:2: ( rule__RecordField__DefaultAssignment_4_1 )
            {
             before(grammarAccess.getRecordFieldAccess().getDefaultAssignment_4_1()); 
            // InternalOCCI.g:8667:2: ( rule__RecordField__DefaultAssignment_4_1 )
            // InternalOCCI.g:8667:3: rule__RecordField__DefaultAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__DefaultAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getDefaultAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_4__1__Impl"


    // $ANTLR start "rule__RecordField__Group_5__0"
    // InternalOCCI.g:8676:1: rule__RecordField__Group_5__0 : rule__RecordField__Group_5__0__Impl rule__RecordField__Group_5__1 ;
    public final void rule__RecordField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8680:1: ( rule__RecordField__Group_5__0__Impl rule__RecordField__Group_5__1 )
            // InternalOCCI.g:8681:2: rule__RecordField__Group_5__0__Impl rule__RecordField__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__RecordField__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_5__0"


    // $ANTLR start "rule__RecordField__Group_5__0__Impl"
    // InternalOCCI.g:8688:1: rule__RecordField__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__RecordField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8692:1: ( ( 'description' ) )
            // InternalOCCI.g:8693:1: ( 'description' )
            {
            // InternalOCCI.g:8693:1: ( 'description' )
            // InternalOCCI.g:8694:2: 'description'
            {
             before(grammarAccess.getRecordFieldAccess().getDescriptionKeyword_5_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_5__0__Impl"


    // $ANTLR start "rule__RecordField__Group_5__1"
    // InternalOCCI.g:8703:1: rule__RecordField__Group_5__1 : rule__RecordField__Group_5__1__Impl ;
    public final void rule__RecordField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8707:1: ( rule__RecordField__Group_5__1__Impl )
            // InternalOCCI.g:8708:2: rule__RecordField__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_5__1"


    // $ANTLR start "rule__RecordField__Group_5__1__Impl"
    // InternalOCCI.g:8714:1: rule__RecordField__Group_5__1__Impl : ( ( rule__RecordField__DescriptionAssignment_5_1 ) ) ;
    public final void rule__RecordField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8718:1: ( ( ( rule__RecordField__DescriptionAssignment_5_1 ) ) )
            // InternalOCCI.g:8719:1: ( ( rule__RecordField__DescriptionAssignment_5_1 ) )
            {
            // InternalOCCI.g:8719:1: ( ( rule__RecordField__DescriptionAssignment_5_1 ) )
            // InternalOCCI.g:8720:2: ( rule__RecordField__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getRecordFieldAccess().getDescriptionAssignment_5_1()); 
            // InternalOCCI.g:8721:2: ( rule__RecordField__DescriptionAssignment_5_1 )
            // InternalOCCI.g:8721:3: rule__RecordField__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_5__1__Impl"


    // $ANTLR start "rule__RecordField__Group_6__0"
    // InternalOCCI.g:8730:1: rule__RecordField__Group_6__0 : rule__RecordField__Group_6__0__Impl rule__RecordField__Group_6__1 ;
    public final void rule__RecordField__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8734:1: ( rule__RecordField__Group_6__0__Impl rule__RecordField__Group_6__1 )
            // InternalOCCI.g:8735:2: rule__RecordField__Group_6__0__Impl rule__RecordField__Group_6__1
            {
            pushFollow(FOLLOW_17);
            rule__RecordField__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6__0"


    // $ANTLR start "rule__RecordField__Group_6__0__Impl"
    // InternalOCCI.g:8742:1: rule__RecordField__Group_6__0__Impl : ( 'annotations' ) ;
    public final void rule__RecordField__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8746:1: ( ( 'annotations' ) )
            // InternalOCCI.g:8747:1: ( 'annotations' )
            {
            // InternalOCCI.g:8747:1: ( 'annotations' )
            // InternalOCCI.g:8748:2: 'annotations'
            {
             before(grammarAccess.getRecordFieldAccess().getAnnotationsKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getAnnotationsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6__0__Impl"


    // $ANTLR start "rule__RecordField__Group_6__1"
    // InternalOCCI.g:8757:1: rule__RecordField__Group_6__1 : rule__RecordField__Group_6__1__Impl rule__RecordField__Group_6__2 ;
    public final void rule__RecordField__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8761:1: ( rule__RecordField__Group_6__1__Impl rule__RecordField__Group_6__2 )
            // InternalOCCI.g:8762:2: rule__RecordField__Group_6__1__Impl rule__RecordField__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__RecordField__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6__1"


    // $ANTLR start "rule__RecordField__Group_6__1__Impl"
    // InternalOCCI.g:8769:1: rule__RecordField__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RecordField__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8773:1: ( ( '{' ) )
            // InternalOCCI.g:8774:1: ( '{' )
            {
            // InternalOCCI.g:8774:1: ( '{' )
            // InternalOCCI.g:8775:2: '{'
            {
             before(grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6__1__Impl"


    // $ANTLR start "rule__RecordField__Group_6__2"
    // InternalOCCI.g:8784:1: rule__RecordField__Group_6__2 : rule__RecordField__Group_6__2__Impl rule__RecordField__Group_6__3 ;
    public final void rule__RecordField__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8788:1: ( rule__RecordField__Group_6__2__Impl rule__RecordField__Group_6__3 )
            // InternalOCCI.g:8789:2: rule__RecordField__Group_6__2__Impl rule__RecordField__Group_6__3
            {
            pushFollow(FOLLOW_19);
            rule__RecordField__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6__2"


    // $ANTLR start "rule__RecordField__Group_6__2__Impl"
    // InternalOCCI.g:8796:1: rule__RecordField__Group_6__2__Impl : ( ( rule__RecordField__AnnotationsAssignment_6_2 ) ) ;
    public final void rule__RecordField__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8800:1: ( ( ( rule__RecordField__AnnotationsAssignment_6_2 ) ) )
            // InternalOCCI.g:8801:1: ( ( rule__RecordField__AnnotationsAssignment_6_2 ) )
            {
            // InternalOCCI.g:8801:1: ( ( rule__RecordField__AnnotationsAssignment_6_2 ) )
            // InternalOCCI.g:8802:2: ( rule__RecordField__AnnotationsAssignment_6_2 )
            {
             before(grammarAccess.getRecordFieldAccess().getAnnotationsAssignment_6_2()); 
            // InternalOCCI.g:8803:2: ( rule__RecordField__AnnotationsAssignment_6_2 )
            // InternalOCCI.g:8803:3: rule__RecordField__AnnotationsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__AnnotationsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getAnnotationsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6__2__Impl"


    // $ANTLR start "rule__RecordField__Group_6__3"
    // InternalOCCI.g:8811:1: rule__RecordField__Group_6__3 : rule__RecordField__Group_6__3__Impl rule__RecordField__Group_6__4 ;
    public final void rule__RecordField__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8815:1: ( rule__RecordField__Group_6__3__Impl rule__RecordField__Group_6__4 )
            // InternalOCCI.g:8816:2: rule__RecordField__Group_6__3__Impl rule__RecordField__Group_6__4
            {
            pushFollow(FOLLOW_19);
            rule__RecordField__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6__3"


    // $ANTLR start "rule__RecordField__Group_6__3__Impl"
    // InternalOCCI.g:8823:1: rule__RecordField__Group_6__3__Impl : ( ( rule__RecordField__Group_6_3__0 )* ) ;
    public final void rule__RecordField__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8827:1: ( ( ( rule__RecordField__Group_6_3__0 )* ) )
            // InternalOCCI.g:8828:1: ( ( rule__RecordField__Group_6_3__0 )* )
            {
            // InternalOCCI.g:8828:1: ( ( rule__RecordField__Group_6_3__0 )* )
            // InternalOCCI.g:8829:2: ( rule__RecordField__Group_6_3__0 )*
            {
             before(grammarAccess.getRecordFieldAccess().getGroup_6_3()); 
            // InternalOCCI.g:8830:2: ( rule__RecordField__Group_6_3__0 )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==71) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalOCCI.g:8830:3: rule__RecordField__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RecordField__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

             after(grammarAccess.getRecordFieldAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6__3__Impl"


    // $ANTLR start "rule__RecordField__Group_6__4"
    // InternalOCCI.g:8838:1: rule__RecordField__Group_6__4 : rule__RecordField__Group_6__4__Impl ;
    public final void rule__RecordField__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8842:1: ( rule__RecordField__Group_6__4__Impl )
            // InternalOCCI.g:8843:2: rule__RecordField__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6__4"


    // $ANTLR start "rule__RecordField__Group_6__4__Impl"
    // InternalOCCI.g:8849:1: rule__RecordField__Group_6__4__Impl : ( '}' ) ;
    public final void rule__RecordField__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8853:1: ( ( '}' ) )
            // InternalOCCI.g:8854:1: ( '}' )
            {
            // InternalOCCI.g:8854:1: ( '}' )
            // InternalOCCI.g:8855:2: '}'
            {
             before(grammarAccess.getRecordFieldAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6__4__Impl"


    // $ANTLR start "rule__RecordField__Group_6_3__0"
    // InternalOCCI.g:8865:1: rule__RecordField__Group_6_3__0 : rule__RecordField__Group_6_3__0__Impl rule__RecordField__Group_6_3__1 ;
    public final void rule__RecordField__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8869:1: ( rule__RecordField__Group_6_3__0__Impl rule__RecordField__Group_6_3__1 )
            // InternalOCCI.g:8870:2: rule__RecordField__Group_6_3__0__Impl rule__RecordField__Group_6_3__1
            {
            pushFollow(FOLLOW_18);
            rule__RecordField__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6_3__0"


    // $ANTLR start "rule__RecordField__Group_6_3__0__Impl"
    // InternalOCCI.g:8877:1: rule__RecordField__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__RecordField__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8881:1: ( ( ',' ) )
            // InternalOCCI.g:8882:1: ( ',' )
            {
            // InternalOCCI.g:8882:1: ( ',' )
            // InternalOCCI.g:8883:2: ','
            {
             before(grammarAccess.getRecordFieldAccess().getCommaKeyword_6_3_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6_3__0__Impl"


    // $ANTLR start "rule__RecordField__Group_6_3__1"
    // InternalOCCI.g:8892:1: rule__RecordField__Group_6_3__1 : rule__RecordField__Group_6_3__1__Impl ;
    public final void rule__RecordField__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8896:1: ( rule__RecordField__Group_6_3__1__Impl )
            // InternalOCCI.g:8897:2: rule__RecordField__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6_3__1"


    // $ANTLR start "rule__RecordField__Group_6_3__1__Impl"
    // InternalOCCI.g:8903:1: rule__RecordField__Group_6_3__1__Impl : ( ( rule__RecordField__AnnotationsAssignment_6_3_1 ) ) ;
    public final void rule__RecordField__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8907:1: ( ( ( rule__RecordField__AnnotationsAssignment_6_3_1 ) ) )
            // InternalOCCI.g:8908:1: ( ( rule__RecordField__AnnotationsAssignment_6_3_1 ) )
            {
            // InternalOCCI.g:8908:1: ( ( rule__RecordField__AnnotationsAssignment_6_3_1 ) )
            // InternalOCCI.g:8909:2: ( rule__RecordField__AnnotationsAssignment_6_3_1 )
            {
             before(grammarAccess.getRecordFieldAccess().getAnnotationsAssignment_6_3_1()); 
            // InternalOCCI.g:8910:2: ( rule__RecordField__AnnotationsAssignment_6_3_1 )
            // InternalOCCI.g:8910:3: rule__RecordField__AnnotationsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__AnnotationsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getAnnotationsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_6_3__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // InternalOCCI.g:8919:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8923:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalOCCI.g:8924:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0"


    // $ANTLR start "rule__ArrayType__Group__0__Impl"
    // InternalOCCI.g:8931:1: rule__ArrayType__Group__0__Impl : ( 'ArrayType' ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8935:1: ( ( 'ArrayType' ) )
            // InternalOCCI.g:8936:1: ( 'ArrayType' )
            {
            // InternalOCCI.g:8936:1: ( 'ArrayType' )
            // InternalOCCI.g:8937:2: 'ArrayType'
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getArrayTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0__Impl"


    // $ANTLR start "rule__ArrayType__Group__1"
    // InternalOCCI.g:8946:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8950:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalOCCI.g:8951:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1"


    // $ANTLR start "rule__ArrayType__Group__1__Impl"
    // InternalOCCI.g:8958:1: rule__ArrayType__Group__1__Impl : ( ( rule__ArrayType__NameAssignment_1 ) ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8962:1: ( ( ( rule__ArrayType__NameAssignment_1 ) ) )
            // InternalOCCI.g:8963:1: ( ( rule__ArrayType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:8963:1: ( ( rule__ArrayType__NameAssignment_1 ) )
            // InternalOCCI.g:8964:2: ( rule__ArrayType__NameAssignment_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:8965:2: ( rule__ArrayType__NameAssignment_1 )
            // InternalOCCI.g:8965:3: rule__ArrayType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__2"
    // InternalOCCI.g:8973:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8977:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalOCCI.g:8978:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2"


    // $ANTLR start "rule__ArrayType__Group__2__Impl"
    // InternalOCCI.g:8985:1: rule__ArrayType__Group__2__Impl : ( 'type' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8989:1: ( ( 'type' ) )
            // InternalOCCI.g:8990:1: ( 'type' )
            {
            // InternalOCCI.g:8990:1: ( 'type' )
            // InternalOCCI.g:8991:2: 'type'
            {
             before(grammarAccess.getArrayTypeAccess().getTypeKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2__Impl"


    // $ANTLR start "rule__ArrayType__Group__3"
    // InternalOCCI.g:9000:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9004:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // InternalOCCI.g:9005:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__ArrayType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3"


    // $ANTLR start "rule__ArrayType__Group__3__Impl"
    // InternalOCCI.g:9012:1: rule__ArrayType__Group__3__Impl : ( ( rule__ArrayType__TypeAssignment_3 ) ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9016:1: ( ( ( rule__ArrayType__TypeAssignment_3 ) ) )
            // InternalOCCI.g:9017:1: ( ( rule__ArrayType__TypeAssignment_3 ) )
            {
            // InternalOCCI.g:9017:1: ( ( rule__ArrayType__TypeAssignment_3 ) )
            // InternalOCCI.g:9018:2: ( rule__ArrayType__TypeAssignment_3 )
            {
             before(grammarAccess.getArrayTypeAccess().getTypeAssignment_3()); 
            // InternalOCCI.g:9019:2: ( rule__ArrayType__TypeAssignment_3 )
            // InternalOCCI.g:9019:3: rule__ArrayType__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3__Impl"


    // $ANTLR start "rule__ArrayType__Group__4"
    // InternalOCCI.g:9027:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9031:1: ( rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5 )
            // InternalOCCI.g:9032:2: rule__ArrayType__Group__4__Impl rule__ArrayType__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ArrayType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__4"


    // $ANTLR start "rule__ArrayType__Group__4__Impl"
    // InternalOCCI.g:9039:1: rule__ArrayType__Group__4__Impl : ( 'documentation' ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9043:1: ( ( 'documentation' ) )
            // InternalOCCI.g:9044:1: ( 'documentation' )
            {
            // InternalOCCI.g:9044:1: ( 'documentation' )
            // InternalOCCI.g:9045:2: 'documentation'
            {
             before(grammarAccess.getArrayTypeAccess().getDocumentationKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getDocumentationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__4__Impl"


    // $ANTLR start "rule__ArrayType__Group__5"
    // InternalOCCI.g:9054:1: rule__ArrayType__Group__5 : rule__ArrayType__Group__5__Impl ;
    public final void rule__ArrayType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9058:1: ( rule__ArrayType__Group__5__Impl )
            // InternalOCCI.g:9059:2: rule__ArrayType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__5"


    // $ANTLR start "rule__ArrayType__Group__5__Impl"
    // InternalOCCI.g:9065:1: rule__ArrayType__Group__5__Impl : ( ( rule__ArrayType__DocumentationAssignment_5 )? ) ;
    public final void rule__ArrayType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9069:1: ( ( ( rule__ArrayType__DocumentationAssignment_5 )? ) )
            // InternalOCCI.g:9070:1: ( ( rule__ArrayType__DocumentationAssignment_5 )? )
            {
            // InternalOCCI.g:9070:1: ( ( rule__ArrayType__DocumentationAssignment_5 )? )
            // InternalOCCI.g:9071:2: ( rule__ArrayType__DocumentationAssignment_5 )?
            {
             before(grammarAccess.getArrayTypeAccess().getDocumentationAssignment_5()); 
            // InternalOCCI.g:9072:2: ( rule__ArrayType__DocumentationAssignment_5 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_STRING) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalOCCI.g:9072:3: rule__ArrayType__DocumentationAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__DocumentationAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayTypeAccess().getDocumentationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__5__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__0"
    // InternalOCCI.g:9081:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9085:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // InternalOCCI.g:9086:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__EIntegerObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0"


    // $ANTLR start "rule__EIntegerObject__Group__0__Impl"
    // InternalOCCI.g:9093:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9097:1: ( ( ( '-' )? ) )
            // InternalOCCI.g:9098:1: ( ( '-' )? )
            {
            // InternalOCCI.g:9098:1: ( ( '-' )? )
            // InternalOCCI.g:9099:2: ( '-' )?
            {
             before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalOCCI.g:9100:2: ( '-' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==12) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalOCCI.g:9100:3: '-'
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__1"
    // InternalOCCI.g:9108:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9112:1: ( rule__EIntegerObject__Group__1__Impl )
            // InternalOCCI.g:9113:2: rule__EIntegerObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1"


    // $ANTLR start "rule__EIntegerObject__Group__1__Impl"
    // InternalOCCI.g:9119:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9123:1: ( ( RULE_INT ) )
            // InternalOCCI.g:9124:1: ( RULE_INT )
            {
            // InternalOCCI.g:9124:1: ( RULE_INT )
            // InternalOCCI.g:9125:2: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1__Impl"


    // $ANTLR start "rule__NameID__Group_0__0"
    // InternalOCCI.g:9135:1: rule__NameID__Group_0__0 : rule__NameID__Group_0__0__Impl rule__NameID__Group_0__1 ;
    public final void rule__NameID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9139:1: ( rule__NameID__Group_0__0__Impl rule__NameID__Group_0__1 )
            // InternalOCCI.g:9140:2: rule__NameID__Group_0__0__Impl rule__NameID__Group_0__1
            {
            pushFollow(FOLLOW_49);
            rule__NameID__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameID__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameID__Group_0__0"


    // $ANTLR start "rule__NameID__Group_0__0__Impl"
    // InternalOCCI.g:9147:1: rule__NameID__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__NameID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9151:1: ( ( RULE_ID ) )
            // InternalOCCI.g:9152:1: ( RULE_ID )
            {
            // InternalOCCI.g:9152:1: ( RULE_ID )
            // InternalOCCI.g:9153:2: RULE_ID
            {
             before(grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameIDAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameID__Group_0__0__Impl"


    // $ANTLR start "rule__NameID__Group_0__1"
    // InternalOCCI.g:9162:1: rule__NameID__Group_0__1 : rule__NameID__Group_0__1__Impl ;
    public final void rule__NameID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9166:1: ( rule__NameID__Group_0__1__Impl )
            // InternalOCCI.g:9167:2: rule__NameID__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameID__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameID__Group_0__1"


    // $ANTLR start "rule__NameID__Group_0__1__Impl"
    // InternalOCCI.g:9173:1: rule__NameID__Group_0__1__Impl : ( ( rule__NameID__Alternatives_0_1 )* ) ;
    public final void rule__NameID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9177:1: ( ( ( rule__NameID__Alternatives_0_1 )* ) )
            // InternalOCCI.g:9178:1: ( ( rule__NameID__Alternatives_0_1 )* )
            {
            // InternalOCCI.g:9178:1: ( ( rule__NameID__Alternatives_0_1 )* )
            // InternalOCCI.g:9179:2: ( rule__NameID__Alternatives_0_1 )*
            {
             before(grammarAccess.getNameIDAccess().getAlternatives_0_1()); 
            // InternalOCCI.g:9180:2: ( rule__NameID__Alternatives_0_1 )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==RULE_ID||LA81_0==12) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalOCCI.g:9180:3: rule__NameID__Alternatives_0_1
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__NameID__Alternatives_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

             after(grammarAccess.getNameIDAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameID__Group_0__1__Impl"


    // $ANTLR start "rule__Extension__NameAssignment_1"
    // InternalOCCI.g:9189:1: rule__Extension__NameAssignment_1 : ( ruleNameID ) ;
    public final void rule__Extension__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9193:1: ( ( ruleNameID ) )
            // InternalOCCI.g:9194:2: ( ruleNameID )
            {
            // InternalOCCI.g:9194:2: ( ruleNameID )
            // InternalOCCI.g:9195:3: ruleNameID
            {
             before(grammarAccess.getExtensionAccess().getNameNameIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNameID();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getNameNameIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__NameAssignment_1"


    // $ANTLR start "rule__Extension__SchemeAssignment_3"
    // InternalOCCI.g:9204:1: rule__Extension__SchemeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Extension__SchemeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9208:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9209:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9209:2: ( RULE_STRING )
            // InternalOCCI.g:9210:3: RULE_STRING
            {
             before(grammarAccess.getExtensionAccess().getSchemeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getSchemeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__SchemeAssignment_3"


    // $ANTLR start "rule__Extension__DescriptionAssignment_4_1"
    // InternalOCCI.g:9219:1: rule__Extension__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Extension__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9223:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9224:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9224:2: ( RULE_STRING )
            // InternalOCCI.g:9225:3: RULE_STRING
            {
             before(grammarAccess.getExtensionAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Extension__SpecificationAssignment_5_1"
    // InternalOCCI.g:9234:1: rule__Extension__SpecificationAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Extension__SpecificationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9238:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9239:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9239:2: ( RULE_STRING )
            // InternalOCCI.g:9240:3: RULE_STRING
            {
             before(grammarAccess.getExtensionAccess().getSpecificationSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getSpecificationSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__SpecificationAssignment_5_1"


    // $ANTLR start "rule__Extension__ImportAssignment_6_1"
    // InternalOCCI.g:9249:1: rule__Extension__ImportAssignment_6_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Extension__ImportAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9253:1: ( ( ( RULE_STRING ) ) )
            // InternalOCCI.g:9254:2: ( ( RULE_STRING ) )
            {
            // InternalOCCI.g:9254:2: ( ( RULE_STRING ) )
            // InternalOCCI.g:9255:3: ( RULE_STRING )
            {
             before(grammarAccess.getExtensionAccess().getImportExtensionCrossReference_6_1_0()); 
            // InternalOCCI.g:9256:3: ( RULE_STRING )
            // InternalOCCI.g:9257:4: RULE_STRING
            {
             before(grammarAccess.getExtensionAccess().getImportExtensionSTRINGTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getImportExtensionSTRINGTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getExtensionAccess().getImportExtensionCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__ImportAssignment_6_1"


    // $ANTLR start "rule__Extension__KindsAssignment_7_0"
    // InternalOCCI.g:9268:1: rule__Extension__KindsAssignment_7_0 : ( ruleKind ) ;
    public final void rule__Extension__KindsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9272:1: ( ( ruleKind ) )
            // InternalOCCI.g:9273:2: ( ruleKind )
            {
            // InternalOCCI.g:9273:2: ( ruleKind )
            // InternalOCCI.g:9274:3: ruleKind
            {
             before(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getKindsKindParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__KindsAssignment_7_0"


    // $ANTLR start "rule__Extension__MixinsAssignment_7_1"
    // InternalOCCI.g:9283:1: rule__Extension__MixinsAssignment_7_1 : ( ruleMixin ) ;
    public final void rule__Extension__MixinsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9287:1: ( ( ruleMixin ) )
            // InternalOCCI.g:9288:2: ( ruleMixin )
            {
            // InternalOCCI.g:9288:2: ( ruleMixin )
            // InternalOCCI.g:9289:3: ruleMixin
            {
             before(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getMixinsMixinParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__MixinsAssignment_7_1"


    // $ANTLR start "rule__Extension__TypesAssignment_7_2"
    // InternalOCCI.g:9298:1: rule__Extension__TypesAssignment_7_2 : ( ruleDataType ) ;
    public final void rule__Extension__TypesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9302:1: ( ( ruleDataType ) )
            // InternalOCCI.g:9303:2: ( ruleDataType )
            {
            // InternalOCCI.g:9303:2: ( ruleDataType )
            // InternalOCCI.g:9304:3: ruleDataType
            {
             before(grammarAccess.getExtensionAccess().getTypesDataTypeParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getTypesDataTypeParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__TypesAssignment_7_2"


    // $ANTLR start "rule__Kind__NameAssignment_1"
    // InternalOCCI.g:9313:1: rule__Kind__NameAssignment_1 : ( ruleNameID ) ;
    public final void rule__Kind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9317:1: ( ( ruleNameID ) )
            // InternalOCCI.g:9318:2: ( ruleNameID )
            {
            // InternalOCCI.g:9318:2: ( ruleNameID )
            // InternalOCCI.g:9319:3: ruleNameID
            {
             before(grammarAccess.getKindAccess().getNameNameIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNameID();

            state._fsp--;

             after(grammarAccess.getKindAccess().getNameNameIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__NameAssignment_1"


    // $ANTLR start "rule__Kind__ParentAssignment_2_1"
    // InternalOCCI.g:9328:1: rule__Kind__ParentAssignment_2_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Kind__ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9332:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9333:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9333:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9334:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getKindAccess().getParentKindCrossReference_2_1_0()); 
            // InternalOCCI.g:9335:3: ( ruleQualifiedID )
            // InternalOCCI.g:9336:4: ruleQualifiedID
            {
             before(grammarAccess.getKindAccess().getParentKindQualifiedIDParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getKindAccess().getParentKindQualifiedIDParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getKindAccess().getParentKindCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__ParentAssignment_2_1"


    // $ANTLR start "rule__Kind__SourceAssignment_3_1"
    // InternalOCCI.g:9347:1: rule__Kind__SourceAssignment_3_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Kind__SourceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9351:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9352:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9352:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9353:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getKindAccess().getSourceKindCrossReference_3_1_0()); 
            // InternalOCCI.g:9354:3: ( ruleQualifiedID )
            // InternalOCCI.g:9355:4: ruleQualifiedID
            {
             before(grammarAccess.getKindAccess().getSourceKindQualifiedIDParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getKindAccess().getSourceKindQualifiedIDParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getKindAccess().getSourceKindCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__SourceAssignment_3_1"


    // $ANTLR start "rule__Kind__TargetAssignment_4_1"
    // InternalOCCI.g:9366:1: rule__Kind__TargetAssignment_4_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Kind__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9370:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9371:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9371:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9372:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getKindAccess().getTargetKindCrossReference_4_1_0()); 
            // InternalOCCI.g:9373:3: ( ruleQualifiedID )
            // InternalOCCI.g:9374:4: ruleQualifiedID
            {
             before(grammarAccess.getKindAccess().getTargetKindQualifiedIDParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getKindAccess().getTargetKindQualifiedIDParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getKindAccess().getTargetKindCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__TargetAssignment_4_1"


    // $ANTLR start "rule__Kind__TitleAssignment_5_1"
    // InternalOCCI.g:9385:1: rule__Kind__TitleAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Kind__TitleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9389:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9390:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9390:2: ( RULE_STRING )
            // InternalOCCI.g:9391:3: RULE_STRING
            {
             before(grammarAccess.getKindAccess().getTitleSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getTitleSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__TitleAssignment_5_1"


    // $ANTLR start "rule__Kind__SchemeAssignment_7"
    // InternalOCCI.g:9400:1: rule__Kind__SchemeAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Kind__SchemeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9404:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9405:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9405:2: ( RULE_STRING )
            // InternalOCCI.g:9406:3: RULE_STRING
            {
             before(grammarAccess.getKindAccess().getSchemeSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getSchemeSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__SchemeAssignment_7"


    // $ANTLR start "rule__Kind__AttributesAssignment_8_1_0"
    // InternalOCCI.g:9415:1: rule__Kind__AttributesAssignment_8_1_0 : ( ruleAttribute ) ;
    public final void rule__Kind__AttributesAssignment_8_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9419:1: ( ( ruleAttribute ) )
            // InternalOCCI.g:9420:2: ( ruleAttribute )
            {
            // InternalOCCI.g:9420:2: ( ruleAttribute )
            // InternalOCCI.g:9421:3: ruleAttribute
            {
             before(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_8_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_8_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__AttributesAssignment_8_1_0"


    // $ANTLR start "rule__Kind__ActionsAssignment_8_1_1"
    // InternalOCCI.g:9430:1: rule__Kind__ActionsAssignment_8_1_1 : ( ruleAction ) ;
    public final void rule__Kind__ActionsAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9434:1: ( ( ruleAction ) )
            // InternalOCCI.g:9435:2: ( ruleAction )
            {
            // InternalOCCI.g:9435:2: ( ruleAction )
            // InternalOCCI.g:9436:3: ruleAction
            {
             before(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getKindAccess().getActionsActionParserRuleCall_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__ActionsAssignment_8_1_1"


    // $ANTLR start "rule__Kind__ConstraintsAssignment_8_1_2"
    // InternalOCCI.g:9445:1: rule__Kind__ConstraintsAssignment_8_1_2 : ( ruleConstraint ) ;
    public final void rule__Kind__ConstraintsAssignment_8_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9449:1: ( ( ruleConstraint ) )
            // InternalOCCI.g:9450:2: ( ruleConstraint )
            {
            // InternalOCCI.g:9450:2: ( ruleConstraint )
            // InternalOCCI.g:9451:3: ruleConstraint
            {
             before(grammarAccess.getKindAccess().getConstraintsConstraintParserRuleCall_8_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getKindAccess().getConstraintsConstraintParserRuleCall_8_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__ConstraintsAssignment_8_1_2"


    // $ANTLR start "rule__Kind__FsmAssignment_9"
    // InternalOCCI.g:9460:1: rule__Kind__FsmAssignment_9 : ( ruleFSM ) ;
    public final void rule__Kind__FsmAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9464:1: ( ( ruleFSM ) )
            // InternalOCCI.g:9465:2: ( ruleFSM )
            {
            // InternalOCCI.g:9465:2: ( ruleFSM )
            // InternalOCCI.g:9466:3: ruleFSM
            {
             before(grammarAccess.getKindAccess().getFsmFSMParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleFSM();

            state._fsp--;

             after(grammarAccess.getKindAccess().getFsmFSMParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__FsmAssignment_9"


    // $ANTLR start "rule__Kind__AnnotationsAssignment_10_2"
    // InternalOCCI.g:9475:1: rule__Kind__AnnotationsAssignment_10_2 : ( ruleAnnotation ) ;
    public final void rule__Kind__AnnotationsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9479:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:9480:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:9480:2: ( ruleAnnotation )
            // InternalOCCI.g:9481:3: ruleAnnotation
            {
             before(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__AnnotationsAssignment_10_2"


    // $ANTLR start "rule__Kind__AnnotationsAssignment_10_3_1"
    // InternalOCCI.g:9490:1: rule__Kind__AnnotationsAssignment_10_3_1 : ( ruleAnnotation ) ;
    public final void rule__Kind__AnnotationsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9494:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:9495:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:9495:2: ( ruleAnnotation )
            // InternalOCCI.g:9496:3: ruleAnnotation
            {
             before(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__AnnotationsAssignment_10_3_1"


    // $ANTLR start "rule__Mixin__NameAssignment_1"
    // InternalOCCI.g:9505:1: rule__Mixin__NameAssignment_1 : ( ruleNameID ) ;
    public final void rule__Mixin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9509:1: ( ( ruleNameID ) )
            // InternalOCCI.g:9510:2: ( ruleNameID )
            {
            // InternalOCCI.g:9510:2: ( ruleNameID )
            // InternalOCCI.g:9511:3: ruleNameID
            {
             before(grammarAccess.getMixinAccess().getNameNameIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNameID();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getNameNameIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__NameAssignment_1"


    // $ANTLR start "rule__Mixin__DependsAssignment_2_2"
    // InternalOCCI.g:9520:1: rule__Mixin__DependsAssignment_2_2 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Mixin__DependsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9524:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9525:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9525:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9526:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_2_0()); 
            // InternalOCCI.g:9527:3: ( ruleQualifiedID )
            // InternalOCCI.g:9528:4: ruleQualifiedID
            {
             before(grammarAccess.getMixinAccess().getDependsMixinQualifiedIDParserRuleCall_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getDependsMixinQualifiedIDParserRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__DependsAssignment_2_2"


    // $ANTLR start "rule__Mixin__DependsAssignment_2_3_1"
    // InternalOCCI.g:9539:1: rule__Mixin__DependsAssignment_2_3_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Mixin__DependsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9543:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9544:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9544:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9545:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_3_1_0()); 
            // InternalOCCI.g:9546:3: ( ruleQualifiedID )
            // InternalOCCI.g:9547:4: ruleQualifiedID
            {
             before(grammarAccess.getMixinAccess().getDependsMixinQualifiedIDParserRuleCall_2_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getDependsMixinQualifiedIDParserRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__DependsAssignment_2_3_1"


    // $ANTLR start "rule__Mixin__AppliesAssignment_3_2"
    // InternalOCCI.g:9558:1: rule__Mixin__AppliesAssignment_3_2 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Mixin__AppliesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9562:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9563:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9563:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9564:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_2_0()); 
            // InternalOCCI.g:9565:3: ( ruleQualifiedID )
            // InternalOCCI.g:9566:4: ruleQualifiedID
            {
             before(grammarAccess.getMixinAccess().getAppliesKindQualifiedIDParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getAppliesKindQualifiedIDParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__AppliesAssignment_3_2"


    // $ANTLR start "rule__Mixin__AppliesAssignment_3_3_1"
    // InternalOCCI.g:9577:1: rule__Mixin__AppliesAssignment_3_3_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Mixin__AppliesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9581:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9582:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9582:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9583:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_3_1_0()); 
            // InternalOCCI.g:9584:3: ( ruleQualifiedID )
            // InternalOCCI.g:9585:4: ruleQualifiedID
            {
             before(grammarAccess.getMixinAccess().getAppliesKindQualifiedIDParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getAppliesKindQualifiedIDParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__AppliesAssignment_3_3_1"


    // $ANTLR start "rule__Mixin__SchemeAssignment_5"
    // InternalOCCI.g:9596:1: rule__Mixin__SchemeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Mixin__SchemeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9600:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9601:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9601:2: ( RULE_STRING )
            // InternalOCCI.g:9602:3: RULE_STRING
            {
             before(grammarAccess.getMixinAccess().getSchemeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getSchemeSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__SchemeAssignment_5"


    // $ANTLR start "rule__Mixin__TitleAssignment_6_1"
    // InternalOCCI.g:9611:1: rule__Mixin__TitleAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Mixin__TitleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9615:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9616:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9616:2: ( RULE_STRING )
            // InternalOCCI.g:9617:3: RULE_STRING
            {
             before(grammarAccess.getMixinAccess().getTitleSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getTitleSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__TitleAssignment_6_1"


    // $ANTLR start "rule__Mixin__AttributesAssignment_7_1_0"
    // InternalOCCI.g:9626:1: rule__Mixin__AttributesAssignment_7_1_0 : ( ruleAttribute ) ;
    public final void rule__Mixin__AttributesAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9630:1: ( ( ruleAttribute ) )
            // InternalOCCI.g:9631:2: ( ruleAttribute )
            {
            // InternalOCCI.g:9631:2: ( ruleAttribute )
            // InternalOCCI.g:9632:3: ruleAttribute
            {
             before(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_7_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_7_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__AttributesAssignment_7_1_0"


    // $ANTLR start "rule__Mixin__ActionsAssignment_7_1_1"
    // InternalOCCI.g:9641:1: rule__Mixin__ActionsAssignment_7_1_1 : ( ruleAction ) ;
    public final void rule__Mixin__ActionsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9645:1: ( ( ruleAction ) )
            // InternalOCCI.g:9646:2: ( ruleAction )
            {
            // InternalOCCI.g:9646:2: ( ruleAction )
            // InternalOCCI.g:9647:3: ruleAction
            {
             before(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__ActionsAssignment_7_1_1"


    // $ANTLR start "rule__Mixin__ConstraintsAssignment_7_1_2"
    // InternalOCCI.g:9656:1: rule__Mixin__ConstraintsAssignment_7_1_2 : ( ruleConstraint ) ;
    public final void rule__Mixin__ConstraintsAssignment_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9660:1: ( ( ruleConstraint ) )
            // InternalOCCI.g:9661:2: ( ruleConstraint )
            {
            // InternalOCCI.g:9661:2: ( ruleConstraint )
            // InternalOCCI.g:9662:3: ruleConstraint
            {
             before(grammarAccess.getMixinAccess().getConstraintsConstraintParserRuleCall_7_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getConstraintsConstraintParserRuleCall_7_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__ConstraintsAssignment_7_1_2"


    // $ANTLR start "rule__Mixin__AnnotationsAssignment_8_2"
    // InternalOCCI.g:9671:1: rule__Mixin__AnnotationsAssignment_8_2 : ( ruleAnnotation ) ;
    public final void rule__Mixin__AnnotationsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9675:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:9676:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:9676:2: ( ruleAnnotation )
            // InternalOCCI.g:9677:3: ruleAnnotation
            {
             before(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__AnnotationsAssignment_8_2"


    // $ANTLR start "rule__Mixin__AnnotationsAssignment_8_3_1"
    // InternalOCCI.g:9686:1: rule__Mixin__AnnotationsAssignment_8_3_1 : ( ruleAnnotation ) ;
    public final void rule__Mixin__AnnotationsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9690:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:9691:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:9691:2: ( ruleAnnotation )
            // InternalOCCI.g:9692:3: ruleAnnotation
            {
             before(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__AnnotationsAssignment_8_3_1"


    // $ANTLR start "rule__Annotation__KeyAssignment_2"
    // InternalOCCI.g:9701:1: rule__Annotation__KeyAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Annotation__KeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9705:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9706:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9706:2: ( RULE_STRING )
            // InternalOCCI.g:9707:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__KeyAssignment_2"


    // $ANTLR start "rule__Annotation__ValueAssignment_4"
    // InternalOCCI.g:9716:1: rule__Annotation__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9720:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9721:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9721:2: ( RULE_STRING )
            // InternalOCCI.g:9722:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__ValueAssignment_4"


    // $ANTLR start "rule__Attribute__MutableAssignment_1"
    // InternalOCCI.g:9731:1: rule__Attribute__MutableAssignment_1 : ( ( 'mutable' ) ) ;
    public final void rule__Attribute__MutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9735:1: ( ( ( 'mutable' ) ) )
            // InternalOCCI.g:9736:2: ( ( 'mutable' ) )
            {
            // InternalOCCI.g:9736:2: ( ( 'mutable' ) )
            // InternalOCCI.g:9737:3: ( 'mutable' )
            {
             before(grammarAccess.getAttributeAccess().getMutableMutableKeyword_1_0()); 
            // InternalOCCI.g:9738:3: ( 'mutable' )
            // InternalOCCI.g:9739:4: 'mutable'
            {
             before(grammarAccess.getAttributeAccess().getMutableMutableKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getMutableMutableKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getMutableMutableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__MutableAssignment_1"


    // $ANTLR start "rule__Attribute__RequiredAssignment_2"
    // InternalOCCI.g:9750:1: rule__Attribute__RequiredAssignment_2 : ( ( 'required' ) ) ;
    public final void rule__Attribute__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9754:1: ( ( ( 'required' ) ) )
            // InternalOCCI.g:9755:2: ( ( 'required' ) )
            {
            // InternalOCCI.g:9755:2: ( ( 'required' ) )
            // InternalOCCI.g:9756:3: ( 'required' )
            {
             before(grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_2_0()); 
            // InternalOCCI.g:9757:3: ( 'required' )
            // InternalOCCI.g:9758:4: 'required'
            {
             before(grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_2_0()); 

            }

             after(grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__RequiredAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_3"
    // InternalOCCI.g:9769:1: rule__Attribute__NameAssignment_3 : ( ruleQualifiedID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9773:1: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9774:2: ( ruleQualifiedID )
            {
            // InternalOCCI.g:9774:2: ( ruleQualifiedID )
            // InternalOCCI.g:9775:3: ruleQualifiedID
            {
             before(grammarAccess.getAttributeAccess().getNameQualifiedIDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameQualifiedIDParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_3"


    // $ANTLR start "rule__Attribute__TypeAssignment_5_1"
    // InternalOCCI.g:9784:1: rule__Attribute__TypeAssignment_5_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Attribute__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9788:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9789:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9789:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9790:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_5_1_0()); 
            // InternalOCCI.g:9791:3: ( ruleQualifiedID )
            // InternalOCCI.g:9792:4: ruleQualifiedID
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeQualifiedIDParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeDataTypeQualifiedIDParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_5_1"


    // $ANTLR start "rule__Attribute__DefaultAssignment_6_1"
    // InternalOCCI.g:9803:1: rule__Attribute__DefaultAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__DefaultAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9807:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9808:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9808:2: ( RULE_STRING )
            // InternalOCCI.g:9809:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getDefaultSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDefaultSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DefaultAssignment_6_1"


    // $ANTLR start "rule__Attribute__DescriptionAssignment_7_1"
    // InternalOCCI.g:9818:1: rule__Attribute__DescriptionAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__DescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9822:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9823:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9823:2: ( RULE_STRING )
            // InternalOCCI.g:9824:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DescriptionAssignment_7_1"


    // $ANTLR start "rule__Attribute__AnnotationsAssignment_8_2"
    // InternalOCCI.g:9833:1: rule__Attribute__AnnotationsAssignment_8_2 : ( ruleAnnotation ) ;
    public final void rule__Attribute__AnnotationsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9837:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:9838:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:9838:2: ( ruleAnnotation )
            // InternalOCCI.g:9839:3: ruleAnnotation
            {
             before(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AnnotationsAssignment_8_2"


    // $ANTLR start "rule__Attribute__AnnotationsAssignment_8_3_1"
    // InternalOCCI.g:9848:1: rule__Attribute__AnnotationsAssignment_8_3_1 : ( ruleAnnotation ) ;
    public final void rule__Attribute__AnnotationsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9852:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:9853:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:9853:2: ( ruleAnnotation )
            // InternalOCCI.g:9854:3: ruleAnnotation
            {
             before(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AnnotationsAssignment_8_3_1"


    // $ANTLR start "rule__Action__NameAssignment_1"
    // InternalOCCI.g:9863:1: rule__Action__NameAssignment_1 : ( ruleNameID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9867:1: ( ( ruleNameID ) )
            // InternalOCCI.g:9868:2: ( ruleNameID )
            {
            // InternalOCCI.g:9868:2: ( ruleNameID )
            // InternalOCCI.g:9869:3: ruleNameID
            {
             before(grammarAccess.getActionAccess().getNameNameIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNameID();

            state._fsp--;

             after(grammarAccess.getActionAccess().getNameNameIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_1"


    // $ANTLR start "rule__Action__SchemeAssignment_3"
    // InternalOCCI.g:9878:1: rule__Action__SchemeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Action__SchemeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9882:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9883:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9883:2: ( RULE_STRING )
            // InternalOCCI.g:9884:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getSchemeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getSchemeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__SchemeAssignment_3"


    // $ANTLR start "rule__Action__AttributesAssignment_4_1"
    // InternalOCCI.g:9893:1: rule__Action__AttributesAssignment_4_1 : ( ruleParameterDecl ) ;
    public final void rule__Action__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9897:1: ( ( ruleParameterDecl ) )
            // InternalOCCI.g:9898:2: ( ruleParameterDecl )
            {
            // InternalOCCI.g:9898:2: ( ruleParameterDecl )
            // InternalOCCI.g:9899:3: ruleParameterDecl
            {
             before(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterDecl();

            state._fsp--;

             after(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AttributesAssignment_4_1"


    // $ANTLR start "rule__Action__AttributesAssignment_4_2_1"
    // InternalOCCI.g:9908:1: rule__Action__AttributesAssignment_4_2_1 : ( ruleParameterDecl ) ;
    public final void rule__Action__AttributesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9912:1: ( ( ruleParameterDecl ) )
            // InternalOCCI.g:9913:2: ( ruleParameterDecl )
            {
            // InternalOCCI.g:9913:2: ( ruleParameterDecl )
            // InternalOCCI.g:9914:3: ruleParameterDecl
            {
             before(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterDecl();

            state._fsp--;

             after(grammarAccess.getActionAccess().getAttributesParameterDeclParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AttributesAssignment_4_2_1"


    // $ANTLR start "rule__Action__TitleAssignment_5_2"
    // InternalOCCI.g:9923:1: rule__Action__TitleAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Action__TitleAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9927:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9928:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9928:2: ( RULE_STRING )
            // InternalOCCI.g:9929:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getTitleSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getTitleSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TitleAssignment_5_2"


    // $ANTLR start "rule__Action__AnnotationsAssignment_6_2"
    // InternalOCCI.g:9938:1: rule__Action__AnnotationsAssignment_6_2 : ( ruleAnnotation ) ;
    public final void rule__Action__AnnotationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9942:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:9943:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:9943:2: ( ruleAnnotation )
            // InternalOCCI.g:9944:3: ruleAnnotation
            {
             before(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AnnotationsAssignment_6_2"


    // $ANTLR start "rule__Action__AnnotationsAssignment_6_3_1"
    // InternalOCCI.g:9953:1: rule__Action__AnnotationsAssignment_6_3_1 : ( ruleAnnotation ) ;
    public final void rule__Action__AnnotationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9957:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:9958:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:9958:2: ( ruleAnnotation )
            // InternalOCCI.g:9959:3: ruleAnnotation
            {
             before(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getActionAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__AnnotationsAssignment_6_3_1"


    // $ANTLR start "rule__ParameterDecl__NameAssignment_0"
    // InternalOCCI.g:9968:1: rule__ParameterDecl__NameAssignment_0 : ( ruleQualifiedID ) ;
    public final void rule__ParameterDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9972:1: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9973:2: ( ruleQualifiedID )
            {
            // InternalOCCI.g:9973:2: ( ruleQualifiedID )
            // InternalOCCI.g:9974:3: ruleQualifiedID
            {
             before(grammarAccess.getParameterDeclAccess().getNameQualifiedIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getParameterDeclAccess().getNameQualifiedIDParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__NameAssignment_0"


    // $ANTLR start "rule__ParameterDecl__TypeAssignment_2"
    // InternalOCCI.g:9983:1: rule__ParameterDecl__TypeAssignment_2 : ( ( ruleQualifiedID ) ) ;
    public final void rule__ParameterDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9987:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9988:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9988:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9989:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getParameterDeclAccess().getTypeDataTypeCrossReference_2_0()); 
            // InternalOCCI.g:9990:3: ( ruleQualifiedID )
            // InternalOCCI.g:9991:4: ruleQualifiedID
            {
             before(grammarAccess.getParameterDeclAccess().getTypeDataTypeQualifiedIDParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getParameterDeclAccess().getTypeDataTypeQualifiedIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getParameterDeclAccess().getTypeDataTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__TypeAssignment_2"


    // $ANTLR start "rule__ParameterDecl__DefaultAssignment_3_1"
    // InternalOCCI.g:10002:1: rule__ParameterDecl__DefaultAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ParameterDecl__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10006:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10007:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10007:2: ( RULE_STRING )
            // InternalOCCI.g:10008:3: RULE_STRING
            {
             before(grammarAccess.getParameterDeclAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParameterDeclAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDecl__DefaultAssignment_3_1"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // InternalOCCI.g:10017:1: rule__Constraint__NameAssignment_1 : ( ruleNameID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10021:1: ( ( ruleNameID ) )
            // InternalOCCI.g:10022:2: ( ruleNameID )
            {
            // InternalOCCI.g:10022:2: ( ruleNameID )
            // InternalOCCI.g:10023:3: ruleNameID
            {
             before(grammarAccess.getConstraintAccess().getNameNameIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNameID();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getNameNameIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_1"


    // $ANTLR start "rule__Constraint__DescriptionAssignment_2_1"
    // InternalOCCI.g:10032:1: rule__Constraint__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Constraint__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10036:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10037:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10037:2: ( RULE_STRING )
            // InternalOCCI.g:10038:3: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__DescriptionAssignment_2_1"


    // $ANTLR start "rule__Constraint__BodyAssignment_4"
    // InternalOCCI.g:10047:1: rule__Constraint__BodyAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Constraint__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10051:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10052:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10052:2: ( RULE_STRING )
            // InternalOCCI.g:10053:3: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getBodySTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getBodySTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__BodyAssignment_4"


    // $ANTLR start "rule__FSM__AttributeAssignment_3"
    // InternalOCCI.g:10062:1: rule__FSM__AttributeAssignment_3 : ( ( ruleQualifiedID ) ) ;
    public final void rule__FSM__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10066:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10067:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10067:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10068:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getFSMAccess().getAttributeAttributeCrossReference_3_0()); 
            // InternalOCCI.g:10069:3: ( ruleQualifiedID )
            // InternalOCCI.g:10070:4: ruleQualifiedID
            {
             before(grammarAccess.getFSMAccess().getAttributeAttributeQualifiedIDParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getFSMAccess().getAttributeAttributeQualifiedIDParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFSMAccess().getAttributeAttributeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__AttributeAssignment_3"


    // $ANTLR start "rule__FSM__OwnedStateAssignment_4_2"
    // InternalOCCI.g:10081:1: rule__FSM__OwnedStateAssignment_4_2 : ( ruleState ) ;
    public final void rule__FSM__OwnedStateAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10085:1: ( ( ruleState ) )
            // InternalOCCI.g:10086:2: ( ruleState )
            {
            // InternalOCCI.g:10086:2: ( ruleState )
            // InternalOCCI.g:10087:3: ruleState
            {
             before(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__OwnedStateAssignment_4_2"


    // $ANTLR start "rule__FSM__OwnedStateAssignment_4_3_1"
    // InternalOCCI.g:10096:1: rule__FSM__OwnedStateAssignment_4_3_1 : ( ruleState ) ;
    public final void rule__FSM__OwnedStateAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10100:1: ( ( ruleState ) )
            // InternalOCCI.g:10101:2: ( ruleState )
            {
            // InternalOCCI.g:10101:2: ( ruleState )
            // InternalOCCI.g:10102:3: ruleState
            {
             before(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getFSMAccess().getOwnedStateStateParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FSM__OwnedStateAssignment_4_3_1"


    // $ANTLR start "rule__State__InitialAssignment_2"
    // InternalOCCI.g:10111:1: rule__State__InitialAssignment_2 : ( ( 'initial' ) ) ;
    public final void rule__State__InitialAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10115:1: ( ( ( 'initial' ) ) )
            // InternalOCCI.g:10116:2: ( ( 'initial' ) )
            {
            // InternalOCCI.g:10116:2: ( ( 'initial' ) )
            // InternalOCCI.g:10117:3: ( 'initial' )
            {
             before(grammarAccess.getStateAccess().getInitialInitialKeyword_2_0()); 
            // InternalOCCI.g:10118:3: ( 'initial' )
            // InternalOCCI.g:10119:4: 'initial'
            {
             before(grammarAccess.getStateAccess().getInitialInitialKeyword_2_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getInitialInitialKeyword_2_0()); 

            }

             after(grammarAccess.getStateAccess().getInitialInitialKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__InitialAssignment_2"


    // $ANTLR start "rule__State__FinalAssignment_3"
    // InternalOCCI.g:10130:1: rule__State__FinalAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__State__FinalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10134:1: ( ( ( 'final' ) ) )
            // InternalOCCI.g:10135:2: ( ( 'final' ) )
            {
            // InternalOCCI.g:10135:2: ( ( 'final' ) )
            // InternalOCCI.g:10136:3: ( 'final' )
            {
             before(grammarAccess.getStateAccess().getFinalFinalKeyword_3_0()); 
            // InternalOCCI.g:10137:3: ( 'final' )
            // InternalOCCI.g:10138:4: 'final'
            {
             before(grammarAccess.getStateAccess().getFinalFinalKeyword_3_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getFinalFinalKeyword_3_0()); 

            }

             after(grammarAccess.getStateAccess().getFinalFinalKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__FinalAssignment_3"


    // $ANTLR start "rule__State__LiteralAssignment_4_1"
    // InternalOCCI.g:10149:1: rule__State__LiteralAssignment_4_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__State__LiteralAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10153:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10154:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10154:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10155:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_4_1_0()); 
            // InternalOCCI.g:10156:3: ( ruleQualifiedID )
            // InternalOCCI.g:10157:4: ruleQualifiedID
            {
             before(grammarAccess.getStateAccess().getLiteralEnumerationLiteralQualifiedIDParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getStateAccess().getLiteralEnumerationLiteralQualifiedIDParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__LiteralAssignment_4_1"


    // $ANTLR start "rule__State__OutgoingTransitionAssignment_5_2"
    // InternalOCCI.g:10168:1: rule__State__OutgoingTransitionAssignment_5_2 : ( ruleTransition ) ;
    public final void rule__State__OutgoingTransitionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10172:1: ( ( ruleTransition ) )
            // InternalOCCI.g:10173:2: ( ruleTransition )
            {
            // InternalOCCI.g:10173:2: ( ruleTransition )
            // InternalOCCI.g:10174:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OutgoingTransitionAssignment_5_2"


    // $ANTLR start "rule__State__OutgoingTransitionAssignment_5_3_1"
    // InternalOCCI.g:10183:1: rule__State__OutgoingTransitionAssignment_5_3_1 : ( ruleTransition ) ;
    public final void rule__State__OutgoingTransitionAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10187:1: ( ( ruleTransition ) )
            // InternalOCCI.g:10188:2: ( ruleTransition )
            {
            // InternalOCCI.g:10188:2: ( ruleTransition )
            // InternalOCCI.g:10189:3: ruleTransition
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOutgoingTransitionTransitionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OutgoingTransitionAssignment_5_3_1"


    // $ANTLR start "rule__Transition__ActionAssignment_0_1"
    // InternalOCCI.g:10198:1: rule__Transition__ActionAssignment_0_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Transition__ActionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10202:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10203:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10203:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10204:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getTransitionAccess().getActionActionCrossReference_0_1_0()); 
            // InternalOCCI.g:10205:3: ( ruleQualifiedID )
            // InternalOCCI.g:10206:4: ruleQualifiedID
            {
             before(grammarAccess.getTransitionAccess().getActionActionQualifiedIDParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getActionActionQualifiedIDParserRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getActionActionCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionAssignment_0_1"


    // $ANTLR start "rule__Transition__TargetAssignment_2"
    // InternalOCCI.g:10217:1: rule__Transition__TargetAssignment_2 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Transition__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10221:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10222:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10222:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10223:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_2_0()); 
            // InternalOCCI.g:10224:3: ( ruleQualifiedID )
            // InternalOCCI.g:10225:4: ruleQualifiedID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateQualifiedIDParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetStateQualifiedIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_2"


    // $ANTLR start "rule__StringType__NameAssignment_1"
    // InternalOCCI.g:10236:1: rule__StringType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10240:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10241:2: ( RULE_ID )
            {
            // InternalOCCI.g:10241:2: ( RULE_ID )
            // InternalOCCI.g:10242:3: RULE_ID
            {
             before(grammarAccess.getStringTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__NameAssignment_1"


    // $ANTLR start "rule__StringType__PatternAssignment_2_1"
    // InternalOCCI.g:10251:1: rule__StringType__PatternAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringType__PatternAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10255:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10256:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10256:2: ( RULE_STRING )
            // InternalOCCI.g:10257:3: RULE_STRING
            {
             before(grammarAccess.getStringTypeAccess().getPatternSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getPatternSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__PatternAssignment_2_1"


    // $ANTLR start "rule__StringType__LengthAssignment_3_1"
    // InternalOCCI.g:10266:1: rule__StringType__LengthAssignment_3_1 : ( ruleEIntegerObject ) ;
    public final void rule__StringType__LengthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10270:1: ( ( ruleEIntegerObject ) )
            // InternalOCCI.g:10271:2: ( ruleEIntegerObject )
            {
            // InternalOCCI.g:10271:2: ( ruleEIntegerObject )
            // InternalOCCI.g:10272:3: ruleEIntegerObject
            {
             before(grammarAccess.getStringTypeAccess().getLengthEIntegerObjectParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getLengthEIntegerObjectParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__LengthAssignment_3_1"


    // $ANTLR start "rule__StringType__MinLengthAssignment_4_1"
    // InternalOCCI.g:10281:1: rule__StringType__MinLengthAssignment_4_1 : ( ruleEIntegerObject ) ;
    public final void rule__StringType__MinLengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10285:1: ( ( ruleEIntegerObject ) )
            // InternalOCCI.g:10286:2: ( ruleEIntegerObject )
            {
            // InternalOCCI.g:10286:2: ( ruleEIntegerObject )
            // InternalOCCI.g:10287:3: ruleEIntegerObject
            {
             before(grammarAccess.getStringTypeAccess().getMinLengthEIntegerObjectParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getMinLengthEIntegerObjectParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__MinLengthAssignment_4_1"


    // $ANTLR start "rule__StringType__MaxLengthAssignment_5_1"
    // InternalOCCI.g:10296:1: rule__StringType__MaxLengthAssignment_5_1 : ( ruleEIntegerObject ) ;
    public final void rule__StringType__MaxLengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10300:1: ( ( ruleEIntegerObject ) )
            // InternalOCCI.g:10301:2: ( ruleEIntegerObject )
            {
            // InternalOCCI.g:10301:2: ( ruleEIntegerObject )
            // InternalOCCI.g:10302:3: ruleEIntegerObject
            {
             before(grammarAccess.getStringTypeAccess().getMaxLengthEIntegerObjectParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getMaxLengthEIntegerObjectParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__MaxLengthAssignment_5_1"


    // $ANTLR start "rule__StringType__DocumentationAssignment_6_1"
    // InternalOCCI.g:10311:1: rule__StringType__DocumentationAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__StringType__DocumentationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10315:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10316:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10316:2: ( RULE_STRING )
            // InternalOCCI.g:10317:3: RULE_STRING
            {
             before(grammarAccess.getStringTypeAccess().getDocumentationSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getDocumentationSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__DocumentationAssignment_6_1"


    // $ANTLR start "rule__EObjectType__NameAssignment_1"
    // InternalOCCI.g:10326:1: rule__EObjectType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EObjectType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10330:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10331:2: ( RULE_ID )
            {
            // InternalOCCI.g:10331:2: ( RULE_ID )
            // InternalOCCI.g:10332:3: RULE_ID
            {
             before(grammarAccess.getEObjectTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEObjectTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__NameAssignment_1"


    // $ANTLR start "rule__EObjectType__InstanceClassNameAssignment_2_1"
    // InternalOCCI.g:10341:1: rule__EObjectType__InstanceClassNameAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EObjectType__InstanceClassNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10345:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10346:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10346:2: ( RULE_STRING )
            // InternalOCCI.g:10347:3: RULE_STRING
            {
             before(grammarAccess.getEObjectTypeAccess().getInstanceClassNameSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEObjectTypeAccess().getInstanceClassNameSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__InstanceClassNameAssignment_2_1"


    // $ANTLR start "rule__EObjectType__DocumentationAssignment_3_1"
    // InternalOCCI.g:10356:1: rule__EObjectType__DocumentationAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__EObjectType__DocumentationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10360:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10361:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10361:2: ( RULE_STRING )
            // InternalOCCI.g:10362:3: RULE_STRING
            {
             before(grammarAccess.getEObjectTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEObjectTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__DocumentationAssignment_3_1"


    // $ANTLR start "rule__BooleanType__NameAssignment_1"
    // InternalOCCI.g:10371:1: rule__BooleanType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BooleanType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10375:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10376:2: ( RULE_ID )
            {
            // InternalOCCI.g:10376:2: ( RULE_ID )
            // InternalOCCI.g:10377:3: RULE_ID
            {
             before(grammarAccess.getBooleanTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__NameAssignment_1"


    // $ANTLR start "rule__BooleanType__DocumentationAssignment_2_1"
    // InternalOCCI.g:10386:1: rule__BooleanType__DocumentationAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__BooleanType__DocumentationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10390:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10391:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10391:2: ( RULE_STRING )
            // InternalOCCI.g:10392:3: RULE_STRING
            {
             before(grammarAccess.getBooleanTypeAccess().getDocumentationSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getDocumentationSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__DocumentationAssignment_2_1"


    // $ANTLR start "rule__NumericType__NameAssignment_1"
    // InternalOCCI.g:10401:1: rule__NumericType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NumericType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10405:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10406:2: ( RULE_ID )
            {
            // InternalOCCI.g:10406:2: ( RULE_ID )
            // InternalOCCI.g:10407:3: RULE_ID
            {
             before(grammarAccess.getNumericTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__NameAssignment_1"


    // $ANTLR start "rule__NumericType__TypeAssignment_3"
    // InternalOCCI.g:10416:1: rule__NumericType__TypeAssignment_3 : ( ruleNumericTypeEnum ) ;
    public final void rule__NumericType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10420:1: ( ( ruleNumericTypeEnum ) )
            // InternalOCCI.g:10421:2: ( ruleNumericTypeEnum )
            {
            // InternalOCCI.g:10421:2: ( ruleNumericTypeEnum )
            // InternalOCCI.g:10422:3: ruleNumericTypeEnum
            {
             before(grammarAccess.getNumericTypeAccess().getTypeNumericTypeEnumEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNumericTypeEnum();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getTypeNumericTypeEnumEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__TypeAssignment_3"


    // $ANTLR start "rule__NumericType__TotalDigitsAssignment_5_1"
    // InternalOCCI.g:10431:1: rule__NumericType__TotalDigitsAssignment_5_1 : ( ruleEIntegerObject ) ;
    public final void rule__NumericType__TotalDigitsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10435:1: ( ( ruleEIntegerObject ) )
            // InternalOCCI.g:10436:2: ( ruleEIntegerObject )
            {
            // InternalOCCI.g:10436:2: ( ruleEIntegerObject )
            // InternalOCCI.g:10437:3: ruleEIntegerObject
            {
             before(grammarAccess.getNumericTypeAccess().getTotalDigitsEIntegerObjectParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getTotalDigitsEIntegerObjectParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__TotalDigitsAssignment_5_1"


    // $ANTLR start "rule__NumericType__MinExclusiveAssignment_6_1"
    // InternalOCCI.g:10446:1: rule__NumericType__MinExclusiveAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__NumericType__MinExclusiveAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10450:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10451:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10451:2: ( RULE_STRING )
            // InternalOCCI.g:10452:3: RULE_STRING
            {
             before(grammarAccess.getNumericTypeAccess().getMinExclusiveSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMinExclusiveSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__MinExclusiveAssignment_6_1"


    // $ANTLR start "rule__NumericType__MaxExclusiveAssignment_7_1"
    // InternalOCCI.g:10461:1: rule__NumericType__MaxExclusiveAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__NumericType__MaxExclusiveAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10465:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10466:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10466:2: ( RULE_STRING )
            // InternalOCCI.g:10467:3: RULE_STRING
            {
             before(grammarAccess.getNumericTypeAccess().getMaxExclusiveSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMaxExclusiveSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__MaxExclusiveAssignment_7_1"


    // $ANTLR start "rule__NumericType__MinInclusiveAssignment_8_1"
    // InternalOCCI.g:10476:1: rule__NumericType__MinInclusiveAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__NumericType__MinInclusiveAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10480:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10481:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10481:2: ( RULE_STRING )
            // InternalOCCI.g:10482:3: RULE_STRING
            {
             before(grammarAccess.getNumericTypeAccess().getMinInclusiveSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMinInclusiveSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__MinInclusiveAssignment_8_1"


    // $ANTLR start "rule__NumericType__MaxInclusiveAssignment_9_1"
    // InternalOCCI.g:10491:1: rule__NumericType__MaxInclusiveAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__NumericType__MaxInclusiveAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10495:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10496:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10496:2: ( RULE_STRING )
            // InternalOCCI.g:10497:3: RULE_STRING
            {
             before(grammarAccess.getNumericTypeAccess().getMaxInclusiveSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMaxInclusiveSTRINGTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__MaxInclusiveAssignment_9_1"


    // $ANTLR start "rule__NumericType__DocumentationAssignment_10_1"
    // InternalOCCI.g:10506:1: rule__NumericType__DocumentationAssignment_10_1 : ( RULE_STRING ) ;
    public final void rule__NumericType__DocumentationAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10510:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10511:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10511:2: ( RULE_STRING )
            // InternalOCCI.g:10512:3: RULE_STRING
            {
             before(grammarAccess.getNumericTypeAccess().getDocumentationSTRINGTerminalRuleCall_10_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getDocumentationSTRINGTerminalRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__DocumentationAssignment_10_1"


    // $ANTLR start "rule__EnumerationType__NameAssignment_1"
    // InternalOCCI.g:10521:1: rule__EnumerationType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumerationType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10525:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10526:2: ( RULE_ID )
            {
            // InternalOCCI.g:10526:2: ( RULE_ID )
            // InternalOCCI.g:10527:3: RULE_ID
            {
             before(grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__NameAssignment_1"


    // $ANTLR start "rule__EnumerationType__LiteralsAssignment_4"
    // InternalOCCI.g:10536:1: rule__EnumerationType__LiteralsAssignment_4 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationType__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10540:1: ( ( ruleEnumerationLiteral ) )
            // InternalOCCI.g:10541:2: ( ruleEnumerationLiteral )
            {
            // InternalOCCI.g:10541:2: ( ruleEnumerationLiteral )
            // InternalOCCI.g:10542:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__LiteralsAssignment_4"


    // $ANTLR start "rule__EnumerationType__LiteralsAssignment_5_1"
    // InternalOCCI.g:10551:1: rule__EnumerationType__LiteralsAssignment_5_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationType__LiteralsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10555:1: ( ( ruleEnumerationLiteral ) )
            // InternalOCCI.g:10556:2: ( ruleEnumerationLiteral )
            {
            // InternalOCCI.g:10556:2: ( ruleEnumerationLiteral )
            // InternalOCCI.g:10557:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__LiteralsAssignment_5_1"


    // $ANTLR start "rule__EnumerationType__DocumentationAssignment_7_1"
    // InternalOCCI.g:10566:1: rule__EnumerationType__DocumentationAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__EnumerationType__DocumentationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10570:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10571:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10571:2: ( RULE_STRING )
            // InternalOCCI.g:10572:3: RULE_STRING
            {
             before(grammarAccess.getEnumerationTypeAccess().getDocumentationSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getDocumentationSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__DocumentationAssignment_7_1"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment_0"
    // InternalOCCI.g:10581:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10585:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10586:2: ( RULE_ID )
            {
            // InternalOCCI.g:10586:2: ( RULE_ID )
            // InternalOCCI.g:10587:3: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment_0"


    // $ANTLR start "rule__EnumerationLiteral__DocumentationAssignment_1_1"
    // InternalOCCI.g:10596:1: rule__EnumerationLiteral__DocumentationAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__EnumerationLiteral__DocumentationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10600:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10601:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10601:2: ( RULE_STRING )
            // InternalOCCI.g:10602:3: RULE_STRING
            {
             before(grammarAccess.getEnumerationLiteralAccess().getDocumentationSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getDocumentationSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__DocumentationAssignment_1_1"


    // $ANTLR start "rule__RecordType__NameAssignment_1"
    // InternalOCCI.g:10611:1: rule__RecordType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10615:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10616:2: ( RULE_ID )
            {
            // InternalOCCI.g:10616:2: ( RULE_ID )
            // InternalOCCI.g:10617:3: RULE_ID
            {
             before(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__NameAssignment_1"


    // $ANTLR start "rule__RecordType__RecordFieldsAssignment_4"
    // InternalOCCI.g:10626:1: rule__RecordType__RecordFieldsAssignment_4 : ( ruleRecordField ) ;
    public final void rule__RecordType__RecordFieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10630:1: ( ( ruleRecordField ) )
            // InternalOCCI.g:10631:2: ( ruleRecordField )
            {
            // InternalOCCI.g:10631:2: ( ruleRecordField )
            // InternalOCCI.g:10632:3: ruleRecordField
            {
             before(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRecordField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__RecordFieldsAssignment_4"


    // $ANTLR start "rule__RecordType__RecordFieldsAssignment_5_1"
    // InternalOCCI.g:10641:1: rule__RecordType__RecordFieldsAssignment_5_1 : ( ruleRecordField ) ;
    public final void rule__RecordType__RecordFieldsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10645:1: ( ( ruleRecordField ) )
            // InternalOCCI.g:10646:2: ( ruleRecordField )
            {
            // InternalOCCI.g:10646:2: ( ruleRecordField )
            // InternalOCCI.g:10647:3: ruleRecordField
            {
             before(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecordField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__RecordFieldsAssignment_5_1"


    // $ANTLR start "rule__RecordType__DocumentationAssignment_7_1"
    // InternalOCCI.g:10656:1: rule__RecordType__DocumentationAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__RecordType__DocumentationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10660:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10661:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10661:2: ( RULE_STRING )
            // InternalOCCI.g:10662:3: RULE_STRING
            {
             before(grammarAccess.getRecordTypeAccess().getDocumentationSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getDocumentationSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__DocumentationAssignment_7_1"


    // $ANTLR start "rule__RecordField__MutableAssignment_0"
    // InternalOCCI.g:10671:1: rule__RecordField__MutableAssignment_0 : ( ( 'mutable' ) ) ;
    public final void rule__RecordField__MutableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10675:1: ( ( ( 'mutable' ) ) )
            // InternalOCCI.g:10676:2: ( ( 'mutable' ) )
            {
            // InternalOCCI.g:10676:2: ( ( 'mutable' ) )
            // InternalOCCI.g:10677:3: ( 'mutable' )
            {
             before(grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_0_0()); 
            // InternalOCCI.g:10678:3: ( 'mutable' )
            // InternalOCCI.g:10679:4: 'mutable'
            {
             before(grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_0_0()); 

            }

             after(grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__MutableAssignment_0"


    // $ANTLR start "rule__RecordField__RequiredAssignment_1"
    // InternalOCCI.g:10690:1: rule__RecordField__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__RecordField__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10694:1: ( ( ( 'required' ) ) )
            // InternalOCCI.g:10695:2: ( ( 'required' ) )
            {
            // InternalOCCI.g:10695:2: ( ( 'required' ) )
            // InternalOCCI.g:10696:3: ( 'required' )
            {
             before(grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_1_0()); 
            // InternalOCCI.g:10697:3: ( 'required' )
            // InternalOCCI.g:10698:4: 'required'
            {
             before(grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__RequiredAssignment_1"


    // $ANTLR start "rule__RecordField__NameAssignment_2"
    // InternalOCCI.g:10709:1: rule__RecordField__NameAssignment_2 : ( ruleQualifiedID ) ;
    public final void rule__RecordField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10713:1: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10714:2: ( ruleQualifiedID )
            {
            // InternalOCCI.g:10714:2: ( ruleQualifiedID )
            // InternalOCCI.g:10715:3: ruleQualifiedID
            {
             before(grammarAccess.getRecordFieldAccess().getNameQualifiedIDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getRecordFieldAccess().getNameQualifiedIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__NameAssignment_2"


    // $ANTLR start "rule__RecordField__TypeAssignment_3_1"
    // InternalOCCI.g:10724:1: rule__RecordField__TypeAssignment_3_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__RecordField__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10728:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10729:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10729:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10730:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getRecordFieldAccess().getTypeDataTypeCrossReference_3_1_0()); 
            // InternalOCCI.g:10731:3: ( ruleQualifiedID )
            // InternalOCCI.g:10732:4: ruleQualifiedID
            {
             before(grammarAccess.getRecordFieldAccess().getTypeDataTypeQualifiedIDParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getRecordFieldAccess().getTypeDataTypeQualifiedIDParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getRecordFieldAccess().getTypeDataTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__TypeAssignment_3_1"


    // $ANTLR start "rule__RecordField__DefaultAssignment_4_1"
    // InternalOCCI.g:10743:1: rule__RecordField__DefaultAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__RecordField__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10747:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10748:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10748:2: ( RULE_STRING )
            // InternalOCCI.g:10749:3: RULE_STRING
            {
             before(grammarAccess.getRecordFieldAccess().getDefaultSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getDefaultSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__DefaultAssignment_4_1"


    // $ANTLR start "rule__RecordField__DescriptionAssignment_5_1"
    // InternalOCCI.g:10758:1: rule__RecordField__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__RecordField__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10762:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10763:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10763:2: ( RULE_STRING )
            // InternalOCCI.g:10764:3: RULE_STRING
            {
             before(grammarAccess.getRecordFieldAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__DescriptionAssignment_5_1"


    // $ANTLR start "rule__RecordField__AnnotationsAssignment_6_2"
    // InternalOCCI.g:10773:1: rule__RecordField__AnnotationsAssignment_6_2 : ( ruleAnnotation ) ;
    public final void rule__RecordField__AnnotationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10777:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:10778:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:10778:2: ( ruleAnnotation )
            // InternalOCCI.g:10779:3: ruleAnnotation
            {
             before(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__AnnotationsAssignment_6_2"


    // $ANTLR start "rule__RecordField__AnnotationsAssignment_6_3_1"
    // InternalOCCI.g:10788:1: rule__RecordField__AnnotationsAssignment_6_3_1 : ( ruleAnnotation ) ;
    public final void rule__RecordField__AnnotationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10792:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:10793:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:10793:2: ( ruleAnnotation )
            // InternalOCCI.g:10794:3: ruleAnnotation
            {
             before(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__AnnotationsAssignment_6_3_1"


    // $ANTLR start "rule__ArrayType__NameAssignment_1"
    // InternalOCCI.g:10803:1: rule__ArrayType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArrayType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10807:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10808:2: ( RULE_ID )
            {
            // InternalOCCI.g:10808:2: ( RULE_ID )
            // InternalOCCI.g:10809:3: RULE_ID
            {
             before(grammarAccess.getArrayTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__NameAssignment_1"


    // $ANTLR start "rule__ArrayType__TypeAssignment_3"
    // InternalOCCI.g:10818:1: rule__ArrayType__TypeAssignment_3 : ( ( ruleQualifiedID ) ) ;
    public final void rule__ArrayType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10822:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10823:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10823:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10824:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getArrayTypeAccess().getTypeDataTypeCrossReference_3_0()); 
            // InternalOCCI.g:10825:3: ( ruleQualifiedID )
            // InternalOCCI.g:10826:4: ruleQualifiedID
            {
             before(grammarAccess.getArrayTypeAccess().getTypeDataTypeQualifiedIDParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getTypeDataTypeQualifiedIDParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getArrayTypeAccess().getTypeDataTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__TypeAssignment_3"


    // $ANTLR start "rule__ArrayType__DocumentationAssignment_5"
    // InternalOCCI.g:10837:1: rule__ArrayType__DocumentationAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ArrayType__DocumentationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10841:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10842:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10842:2: ( RULE_STRING )
            // InternalOCCI.g:10843:3: RULE_STRING
            {
             before(grammarAccess.getArrayTypeAccess().getDocumentationSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getDocumentationSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__DocumentationAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0xFFFFFFFFFFFFE010L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x280068200102C000L,0x0000000000000005L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x2800682001020002L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000DC0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000208L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFFFFFFFFFFFE030L,0x0000000000000001L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C40000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000C40000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000600000L,0x0000000000000008L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200204000L,0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000028L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000019000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000007C000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x07F0000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000F804000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000204000L,0x0000000000000100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000001012L});

}