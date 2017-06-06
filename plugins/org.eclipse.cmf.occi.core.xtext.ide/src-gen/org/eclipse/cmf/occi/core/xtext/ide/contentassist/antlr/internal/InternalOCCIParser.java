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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_QUALIFIED_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'extension'", "'description'", "'specification'", "'as'", "'kind'", "'extends'", "'source'", "'target'", "'annotations'", "'title'", "'scheme'", "'mixin'", "'depends'", "'applies'", "'annotation'", "'key'", "'value'", "'attribute'", "'mutable'", "'required'", "'type'", "'action'", "'constraint'", "'body'", "'StringType'", "'documentation'", "'pattern'", "'length'", "'minLength'", "'maxLength'", "'EObjectType'", "'instanceClassName'", "'BooleanType'", "'NumericType'", "'totalDigits'", "'minExclusive'", "'maxExclusive'", "'minInclusive'", "'maxInclusive'", "'Byte'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'BigDecimal'", "'EnumerationType'", "'literals'", "'RecordType'", "'fields'", "'field'", "'ArrayType'", "':'", "'import'", "'{'", "'}'", "','", "'('", "')'", "'='", "'FSM'", "'states'", "'State'", "'literal'", "'transitions'", "'to'", "'initial'", "'final'"
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


    // $ANTLR start "rule__Kind__Alternatives_10"
    // InternalOCCI.g:745:1: rule__Kind__Alternatives_10 : ( ( ( rule__Kind__AttributesAssignment_10_0 ) ) | ( ( rule__Kind__ActionsAssignment_10_1 ) ) | ( ( rule__Kind__ConstraintsAssignment_10_2 ) ) );
    public final void rule__Kind__Alternatives_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:749:1: ( ( ( rule__Kind__AttributesAssignment_10_0 ) ) | ( ( rule__Kind__ActionsAssignment_10_1 ) ) | ( ( rule__Kind__ConstraintsAssignment_10_2 ) ) )
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
                    // InternalOCCI.g:750:2: ( ( rule__Kind__AttributesAssignment_10_0 ) )
                    {
                    // InternalOCCI.g:750:2: ( ( rule__Kind__AttributesAssignment_10_0 ) )
                    // InternalOCCI.g:751:3: ( rule__Kind__AttributesAssignment_10_0 )
                    {
                     before(grammarAccess.getKindAccess().getAttributesAssignment_10_0()); 
                    // InternalOCCI.g:752:3: ( rule__Kind__AttributesAssignment_10_0 )
                    // InternalOCCI.g:752:4: rule__Kind__AttributesAssignment_10_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__AttributesAssignment_10_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getKindAccess().getAttributesAssignment_10_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:756:2: ( ( rule__Kind__ActionsAssignment_10_1 ) )
                    {
                    // InternalOCCI.g:756:2: ( ( rule__Kind__ActionsAssignment_10_1 ) )
                    // InternalOCCI.g:757:3: ( rule__Kind__ActionsAssignment_10_1 )
                    {
                     before(grammarAccess.getKindAccess().getActionsAssignment_10_1()); 
                    // InternalOCCI.g:758:3: ( rule__Kind__ActionsAssignment_10_1 )
                    // InternalOCCI.g:758:4: rule__Kind__ActionsAssignment_10_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__ActionsAssignment_10_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getKindAccess().getActionsAssignment_10_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:762:2: ( ( rule__Kind__ConstraintsAssignment_10_2 ) )
                    {
                    // InternalOCCI.g:762:2: ( ( rule__Kind__ConstraintsAssignment_10_2 ) )
                    // InternalOCCI.g:763:3: ( rule__Kind__ConstraintsAssignment_10_2 )
                    {
                     before(grammarAccess.getKindAccess().getConstraintsAssignment_10_2()); 
                    // InternalOCCI.g:764:3: ( rule__Kind__ConstraintsAssignment_10_2 )
                    // InternalOCCI.g:764:4: rule__Kind__ConstraintsAssignment_10_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__ConstraintsAssignment_10_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getKindAccess().getConstraintsAssignment_10_2()); 

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
    // $ANTLR end "rule__Kind__Alternatives_10"


    // $ANTLR start "rule__Mixin__Alternatives_9"
    // InternalOCCI.g:772:1: rule__Mixin__Alternatives_9 : ( ( ( rule__Mixin__AttributesAssignment_9_0 ) ) | ( ( rule__Mixin__ActionsAssignment_9_1 ) ) | ( ( rule__Mixin__ConstraintsAssignment_9_2 ) ) );
    public final void rule__Mixin__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:776:1: ( ( ( rule__Mixin__AttributesAssignment_9_0 ) ) | ( ( rule__Mixin__ActionsAssignment_9_1 ) ) | ( ( rule__Mixin__ConstraintsAssignment_9_2 ) ) )
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
                    // InternalOCCI.g:777:2: ( ( rule__Mixin__AttributesAssignment_9_0 ) )
                    {
                    // InternalOCCI.g:777:2: ( ( rule__Mixin__AttributesAssignment_9_0 ) )
                    // InternalOCCI.g:778:3: ( rule__Mixin__AttributesAssignment_9_0 )
                    {
                     before(grammarAccess.getMixinAccess().getAttributesAssignment_9_0()); 
                    // InternalOCCI.g:779:3: ( rule__Mixin__AttributesAssignment_9_0 )
                    // InternalOCCI.g:779:4: rule__Mixin__AttributesAssignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__AttributesAssignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMixinAccess().getAttributesAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOCCI.g:783:2: ( ( rule__Mixin__ActionsAssignment_9_1 ) )
                    {
                    // InternalOCCI.g:783:2: ( ( rule__Mixin__ActionsAssignment_9_1 ) )
                    // InternalOCCI.g:784:3: ( rule__Mixin__ActionsAssignment_9_1 )
                    {
                     before(grammarAccess.getMixinAccess().getActionsAssignment_9_1()); 
                    // InternalOCCI.g:785:3: ( rule__Mixin__ActionsAssignment_9_1 )
                    // InternalOCCI.g:785:4: rule__Mixin__ActionsAssignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__ActionsAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMixinAccess().getActionsAssignment_9_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOCCI.g:789:2: ( ( rule__Mixin__ConstraintsAssignment_9_2 ) )
                    {
                    // InternalOCCI.g:789:2: ( ( rule__Mixin__ConstraintsAssignment_9_2 ) )
                    // InternalOCCI.g:790:3: ( rule__Mixin__ConstraintsAssignment_9_2 )
                    {
                     before(grammarAccess.getMixinAccess().getConstraintsAssignment_9_2()); 
                    // InternalOCCI.g:791:3: ( rule__Mixin__ConstraintsAssignment_9_2 )
                    // InternalOCCI.g:791:4: rule__Mixin__ConstraintsAssignment_9_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__ConstraintsAssignment_9_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMixinAccess().getConstraintsAssignment_9_2()); 

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
    // $ANTLR end "rule__Mixin__Alternatives_9"


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

            if ( (LA18_0==21) ) {
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
            pushFollow(FOLLOW_12);
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
    // InternalOCCI.g:1924:1: rule__Kind__Group__6__Impl : ( '{' ) ;
    public final void rule__Kind__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1928:1: ( ( '{' ) )
            // InternalOCCI.g:1929:1: ( '{' )
            {
            // InternalOCCI.g:1929:1: ( '{' )
            // InternalOCCI.g:1930:2: '{'
            {
             before(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalOCCI.g:1951:1: rule__Kind__Group__7__Impl : ( ( rule__Kind__Group_7__0 )? ) ;
    public final void rule__Kind__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1955:1: ( ( ( rule__Kind__Group_7__0 )? ) )
            // InternalOCCI.g:1956:1: ( ( rule__Kind__Group_7__0 )? )
            {
            // InternalOCCI.g:1956:1: ( ( rule__Kind__Group_7__0 )? )
            // InternalOCCI.g:1957:2: ( rule__Kind__Group_7__0 )?
            {
             before(grammarAccess.getKindAccess().getGroup_7()); 
            // InternalOCCI.g:1958:2: ( rule__Kind__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOCCI.g:1958:3: rule__Kind__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getGroup_7()); 

            }


            }

        }
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
            pushFollow(FOLLOW_5);
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
    // InternalOCCI.g:1978:1: rule__Kind__Group__8__Impl : ( 'scheme' ) ;
    public final void rule__Kind__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:1982:1: ( ( 'scheme' ) )
            // InternalOCCI.g:1983:1: ( 'scheme' )
            {
            // InternalOCCI.g:1983:1: ( 'scheme' )
            // InternalOCCI.g:1984:2: 'scheme'
            {
             before(grammarAccess.getKindAccess().getSchemeKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getSchemeKeyword_8()); 

            }


            }

        }
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
            pushFollow(FOLLOW_13);
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
    // InternalOCCI.g:2005:1: rule__Kind__Group__9__Impl : ( ( rule__Kind__SchemeAssignment_9 ) ) ;
    public final void rule__Kind__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2009:1: ( ( ( rule__Kind__SchemeAssignment_9 ) ) )
            // InternalOCCI.g:2010:1: ( ( rule__Kind__SchemeAssignment_9 ) )
            {
            // InternalOCCI.g:2010:1: ( ( rule__Kind__SchemeAssignment_9 ) )
            // InternalOCCI.g:2011:2: ( rule__Kind__SchemeAssignment_9 )
            {
             before(grammarAccess.getKindAccess().getSchemeAssignment_9()); 
            // InternalOCCI.g:2012:2: ( rule__Kind__SchemeAssignment_9 )
            // InternalOCCI.g:2012:3: rule__Kind__SchemeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Kind__SchemeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getSchemeAssignment_9()); 

            }


            }

        }
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
    // InternalOCCI.g:2020:1: rule__Kind__Group__10 : rule__Kind__Group__10__Impl rule__Kind__Group__11 ;
    public final void rule__Kind__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2024:1: ( rule__Kind__Group__10__Impl rule__Kind__Group__11 )
            // InternalOCCI.g:2025:2: rule__Kind__Group__10__Impl rule__Kind__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Kind__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__11();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:2032:1: rule__Kind__Group__10__Impl : ( ( rule__Kind__Alternatives_10 )* ) ;
    public final void rule__Kind__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2036:1: ( ( ( rule__Kind__Alternatives_10 )* ) )
            // InternalOCCI.g:2037:1: ( ( rule__Kind__Alternatives_10 )* )
            {
            // InternalOCCI.g:2037:1: ( ( rule__Kind__Alternatives_10 )* )
            // InternalOCCI.g:2038:2: ( rule__Kind__Alternatives_10 )*
            {
             before(grammarAccess.getKindAccess().getAlternatives_10()); 
            // InternalOCCI.g:2039:2: ( rule__Kind__Alternatives_10 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30||(LA20_0>=34 && LA20_0<=35)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOCCI.g:2039:3: rule__Kind__Alternatives_10
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Kind__Alternatives_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getKindAccess().getAlternatives_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__Kind__Group__11"
    // InternalOCCI.g:2047:1: rule__Kind__Group__11 : rule__Kind__Group__11__Impl ;
    public final void rule__Kind__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2051:1: ( rule__Kind__Group__11__Impl )
            // InternalOCCI.g:2052:2: rule__Kind__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__11"


    // $ANTLR start "rule__Kind__Group__11__Impl"
    // InternalOCCI.g:2058:1: rule__Kind__Group__11__Impl : ( ( rule__Kind__FsmAssignment_11 )? ) ;
    public final void rule__Kind__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2062:1: ( ( ( rule__Kind__FsmAssignment_11 )? ) )
            // InternalOCCI.g:2063:1: ( ( rule__Kind__FsmAssignment_11 )? )
            {
            // InternalOCCI.g:2063:1: ( ( rule__Kind__FsmAssignment_11 )? )
            // InternalOCCI.g:2064:2: ( rule__Kind__FsmAssignment_11 )?
            {
             before(grammarAccess.getKindAccess().getFsmAssignment_11()); 
            // InternalOCCI.g:2065:2: ( rule__Kind__FsmAssignment_11 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==73) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOCCI.g:2065:3: rule__Kind__FsmAssignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Kind__FsmAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKindAccess().getFsmAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__11__Impl"


    // $ANTLR start "rule__Kind__Group_2__0"
    // InternalOCCI.g:2074:1: rule__Kind__Group_2__0 : rule__Kind__Group_2__0__Impl rule__Kind__Group_2__1 ;
    public final void rule__Kind__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2078:1: ( rule__Kind__Group_2__0__Impl rule__Kind__Group_2__1 )
            // InternalOCCI.g:2079:2: rule__Kind__Group_2__0__Impl rule__Kind__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:2086:1: rule__Kind__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Kind__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2090:1: ( ( 'extends' ) )
            // InternalOCCI.g:2091:1: ( 'extends' )
            {
            // InternalOCCI.g:2091:1: ( 'extends' )
            // InternalOCCI.g:2092:2: 'extends'
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
    // InternalOCCI.g:2101:1: rule__Kind__Group_2__1 : rule__Kind__Group_2__1__Impl ;
    public final void rule__Kind__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2105:1: ( rule__Kind__Group_2__1__Impl )
            // InternalOCCI.g:2106:2: rule__Kind__Group_2__1__Impl
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
    // InternalOCCI.g:2112:1: rule__Kind__Group_2__1__Impl : ( ( rule__Kind__ParentAssignment_2_1 ) ) ;
    public final void rule__Kind__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2116:1: ( ( ( rule__Kind__ParentAssignment_2_1 ) ) )
            // InternalOCCI.g:2117:1: ( ( rule__Kind__ParentAssignment_2_1 ) )
            {
            // InternalOCCI.g:2117:1: ( ( rule__Kind__ParentAssignment_2_1 ) )
            // InternalOCCI.g:2118:2: ( rule__Kind__ParentAssignment_2_1 )
            {
             before(grammarAccess.getKindAccess().getParentAssignment_2_1()); 
            // InternalOCCI.g:2119:2: ( rule__Kind__ParentAssignment_2_1 )
            // InternalOCCI.g:2119:3: rule__Kind__ParentAssignment_2_1
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
    // InternalOCCI.g:2128:1: rule__Kind__Group_3__0 : rule__Kind__Group_3__0__Impl rule__Kind__Group_3__1 ;
    public final void rule__Kind__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2132:1: ( rule__Kind__Group_3__0__Impl rule__Kind__Group_3__1 )
            // InternalOCCI.g:2133:2: rule__Kind__Group_3__0__Impl rule__Kind__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:2140:1: rule__Kind__Group_3__0__Impl : ( 'source' ) ;
    public final void rule__Kind__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2144:1: ( ( 'source' ) )
            // InternalOCCI.g:2145:1: ( 'source' )
            {
            // InternalOCCI.g:2145:1: ( 'source' )
            // InternalOCCI.g:2146:2: 'source'
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
    // InternalOCCI.g:2155:1: rule__Kind__Group_3__1 : rule__Kind__Group_3__1__Impl ;
    public final void rule__Kind__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2159:1: ( rule__Kind__Group_3__1__Impl )
            // InternalOCCI.g:2160:2: rule__Kind__Group_3__1__Impl
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
    // InternalOCCI.g:2166:1: rule__Kind__Group_3__1__Impl : ( ( rule__Kind__SourceAssignment_3_1 ) ) ;
    public final void rule__Kind__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2170:1: ( ( ( rule__Kind__SourceAssignment_3_1 ) ) )
            // InternalOCCI.g:2171:1: ( ( rule__Kind__SourceAssignment_3_1 ) )
            {
            // InternalOCCI.g:2171:1: ( ( rule__Kind__SourceAssignment_3_1 ) )
            // InternalOCCI.g:2172:2: ( rule__Kind__SourceAssignment_3_1 )
            {
             before(grammarAccess.getKindAccess().getSourceAssignment_3_1()); 
            // InternalOCCI.g:2173:2: ( rule__Kind__SourceAssignment_3_1 )
            // InternalOCCI.g:2173:3: rule__Kind__SourceAssignment_3_1
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
    // InternalOCCI.g:2182:1: rule__Kind__Group_4__0 : rule__Kind__Group_4__0__Impl rule__Kind__Group_4__1 ;
    public final void rule__Kind__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2186:1: ( rule__Kind__Group_4__0__Impl rule__Kind__Group_4__1 )
            // InternalOCCI.g:2187:2: rule__Kind__Group_4__0__Impl rule__Kind__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:2194:1: rule__Kind__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__Kind__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2198:1: ( ( 'target' ) )
            // InternalOCCI.g:2199:1: ( 'target' )
            {
            // InternalOCCI.g:2199:1: ( 'target' )
            // InternalOCCI.g:2200:2: 'target'
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
    // InternalOCCI.g:2209:1: rule__Kind__Group_4__1 : rule__Kind__Group_4__1__Impl ;
    public final void rule__Kind__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2213:1: ( rule__Kind__Group_4__1__Impl )
            // InternalOCCI.g:2214:2: rule__Kind__Group_4__1__Impl
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
    // InternalOCCI.g:2220:1: rule__Kind__Group_4__1__Impl : ( ( rule__Kind__TargetAssignment_4_1 ) ) ;
    public final void rule__Kind__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2224:1: ( ( ( rule__Kind__TargetAssignment_4_1 ) ) )
            // InternalOCCI.g:2225:1: ( ( rule__Kind__TargetAssignment_4_1 ) )
            {
            // InternalOCCI.g:2225:1: ( ( rule__Kind__TargetAssignment_4_1 ) )
            // InternalOCCI.g:2226:2: ( rule__Kind__TargetAssignment_4_1 )
            {
             before(grammarAccess.getKindAccess().getTargetAssignment_4_1()); 
            // InternalOCCI.g:2227:2: ( rule__Kind__TargetAssignment_4_1 )
            // InternalOCCI.g:2227:3: rule__Kind__TargetAssignment_4_1
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
    // InternalOCCI.g:2236:1: rule__Kind__Group_5__0 : rule__Kind__Group_5__0__Impl rule__Kind__Group_5__1 ;
    public final void rule__Kind__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2240:1: ( rule__Kind__Group_5__0__Impl rule__Kind__Group_5__1 )
            // InternalOCCI.g:2241:2: rule__Kind__Group_5__0__Impl rule__Kind__Group_5__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalOCCI.g:2248:1: rule__Kind__Group_5__0__Impl : ( 'annotations' ) ;
    public final void rule__Kind__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2252:1: ( ( 'annotations' ) )
            // InternalOCCI.g:2253:1: ( 'annotations' )
            {
            // InternalOCCI.g:2253:1: ( 'annotations' )
            // InternalOCCI.g:2254:2: 'annotations'
            {
             before(grammarAccess.getKindAccess().getAnnotationsKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getAnnotationsKeyword_5_0()); 

            }


            }

        }
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
    // InternalOCCI.g:2263:1: rule__Kind__Group_5__1 : rule__Kind__Group_5__1__Impl rule__Kind__Group_5__2 ;
    public final void rule__Kind__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2267:1: ( rule__Kind__Group_5__1__Impl rule__Kind__Group_5__2 )
            // InternalOCCI.g:2268:2: rule__Kind__Group_5__1__Impl rule__Kind__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__Kind__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_5__2();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:2275:1: rule__Kind__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Kind__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2279:1: ( ( '{' ) )
            // InternalOCCI.g:2280:1: ( '{' )
            {
            // InternalOCCI.g:2280:1: ( '{' )
            // InternalOCCI.g:2281:2: '{'
            {
             before(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Kind__Group_5__2"
    // InternalOCCI.g:2290:1: rule__Kind__Group_5__2 : rule__Kind__Group_5__2__Impl rule__Kind__Group_5__3 ;
    public final void rule__Kind__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2294:1: ( rule__Kind__Group_5__2__Impl rule__Kind__Group_5__3 )
            // InternalOCCI.g:2295:2: rule__Kind__Group_5__2__Impl rule__Kind__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__Kind__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__2"


    // $ANTLR start "rule__Kind__Group_5__2__Impl"
    // InternalOCCI.g:2302:1: rule__Kind__Group_5__2__Impl : ( ( rule__Kind__AnnotationsAssignment_5_2 ) ) ;
    public final void rule__Kind__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2306:1: ( ( ( rule__Kind__AnnotationsAssignment_5_2 ) ) )
            // InternalOCCI.g:2307:1: ( ( rule__Kind__AnnotationsAssignment_5_2 ) )
            {
            // InternalOCCI.g:2307:1: ( ( rule__Kind__AnnotationsAssignment_5_2 ) )
            // InternalOCCI.g:2308:2: ( rule__Kind__AnnotationsAssignment_5_2 )
            {
             before(grammarAccess.getKindAccess().getAnnotationsAssignment_5_2()); 
            // InternalOCCI.g:2309:2: ( rule__Kind__AnnotationsAssignment_5_2 )
            // InternalOCCI.g:2309:3: rule__Kind__AnnotationsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Kind__AnnotationsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getAnnotationsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__2__Impl"


    // $ANTLR start "rule__Kind__Group_5__3"
    // InternalOCCI.g:2317:1: rule__Kind__Group_5__3 : rule__Kind__Group_5__3__Impl rule__Kind__Group_5__4 ;
    public final void rule__Kind__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2321:1: ( rule__Kind__Group_5__3__Impl rule__Kind__Group_5__4 )
            // InternalOCCI.g:2322:2: rule__Kind__Group_5__3__Impl rule__Kind__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__Kind__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__3"


    // $ANTLR start "rule__Kind__Group_5__3__Impl"
    // InternalOCCI.g:2329:1: rule__Kind__Group_5__3__Impl : ( ( rule__Kind__Group_5_3__0 )* ) ;
    public final void rule__Kind__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2333:1: ( ( ( rule__Kind__Group_5_3__0 )* ) )
            // InternalOCCI.g:2334:1: ( ( rule__Kind__Group_5_3__0 )* )
            {
            // InternalOCCI.g:2334:1: ( ( rule__Kind__Group_5_3__0 )* )
            // InternalOCCI.g:2335:2: ( rule__Kind__Group_5_3__0 )*
            {
             before(grammarAccess.getKindAccess().getGroup_5_3()); 
            // InternalOCCI.g:2336:2: ( rule__Kind__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==69) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOCCI.g:2336:3: rule__Kind__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Kind__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getKindAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__3__Impl"


    // $ANTLR start "rule__Kind__Group_5__4"
    // InternalOCCI.g:2344:1: rule__Kind__Group_5__4 : rule__Kind__Group_5__4__Impl ;
    public final void rule__Kind__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2348:1: ( rule__Kind__Group_5__4__Impl )
            // InternalOCCI.g:2349:2: rule__Kind__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__4"


    // $ANTLR start "rule__Kind__Group_5__4__Impl"
    // InternalOCCI.g:2355:1: rule__Kind__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Kind__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2359:1: ( ( '}' ) )
            // InternalOCCI.g:2360:1: ( '}' )
            {
            // InternalOCCI.g:2360:1: ( '}' )
            // InternalOCCI.g:2361:2: '}'
            {
             before(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5__4__Impl"


    // $ANTLR start "rule__Kind__Group_5_3__0"
    // InternalOCCI.g:2371:1: rule__Kind__Group_5_3__0 : rule__Kind__Group_5_3__0__Impl rule__Kind__Group_5_3__1 ;
    public final void rule__Kind__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2375:1: ( rule__Kind__Group_5_3__0__Impl rule__Kind__Group_5_3__1 )
            // InternalOCCI.g:2376:2: rule__Kind__Group_5_3__0__Impl rule__Kind__Group_5_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Kind__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5_3__0"


    // $ANTLR start "rule__Kind__Group_5_3__0__Impl"
    // InternalOCCI.g:2383:1: rule__Kind__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Kind__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2387:1: ( ( ',' ) )
            // InternalOCCI.g:2388:1: ( ',' )
            {
            // InternalOCCI.g:2388:1: ( ',' )
            // InternalOCCI.g:2389:2: ','
            {
             before(grammarAccess.getKindAccess().getCommaKeyword_5_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5_3__0__Impl"


    // $ANTLR start "rule__Kind__Group_5_3__1"
    // InternalOCCI.g:2398:1: rule__Kind__Group_5_3__1 : rule__Kind__Group_5_3__1__Impl ;
    public final void rule__Kind__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2402:1: ( rule__Kind__Group_5_3__1__Impl )
            // InternalOCCI.g:2403:2: rule__Kind__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5_3__1"


    // $ANTLR start "rule__Kind__Group_5_3__1__Impl"
    // InternalOCCI.g:2409:1: rule__Kind__Group_5_3__1__Impl : ( ( rule__Kind__AnnotationsAssignment_5_3_1 ) ) ;
    public final void rule__Kind__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2413:1: ( ( ( rule__Kind__AnnotationsAssignment_5_3_1 ) ) )
            // InternalOCCI.g:2414:1: ( ( rule__Kind__AnnotationsAssignment_5_3_1 ) )
            {
            // InternalOCCI.g:2414:1: ( ( rule__Kind__AnnotationsAssignment_5_3_1 ) )
            // InternalOCCI.g:2415:2: ( rule__Kind__AnnotationsAssignment_5_3_1 )
            {
             before(grammarAccess.getKindAccess().getAnnotationsAssignment_5_3_1()); 
            // InternalOCCI.g:2416:2: ( rule__Kind__AnnotationsAssignment_5_3_1 )
            // InternalOCCI.g:2416:3: rule__Kind__AnnotationsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Kind__AnnotationsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getAnnotationsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_5_3__1__Impl"


    // $ANTLR start "rule__Kind__Group_7__0"
    // InternalOCCI.g:2425:1: rule__Kind__Group_7__0 : rule__Kind__Group_7__0__Impl rule__Kind__Group_7__1 ;
    public final void rule__Kind__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2429:1: ( rule__Kind__Group_7__0__Impl rule__Kind__Group_7__1 )
            // InternalOCCI.g:2430:2: rule__Kind__Group_7__0__Impl rule__Kind__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Kind__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__0"


    // $ANTLR start "rule__Kind__Group_7__0__Impl"
    // InternalOCCI.g:2437:1: rule__Kind__Group_7__0__Impl : ( 'title' ) ;
    public final void rule__Kind__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2441:1: ( ( 'title' ) )
            // InternalOCCI.g:2442:1: ( 'title' )
            {
            // InternalOCCI.g:2442:1: ( 'title' )
            // InternalOCCI.g:2443:2: 'title'
            {
             before(grammarAccess.getKindAccess().getTitleKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getTitleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__0__Impl"


    // $ANTLR start "rule__Kind__Group_7__1"
    // InternalOCCI.g:2452:1: rule__Kind__Group_7__1 : rule__Kind__Group_7__1__Impl ;
    public final void rule__Kind__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2456:1: ( rule__Kind__Group_7__1__Impl )
            // InternalOCCI.g:2457:2: rule__Kind__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__1"


    // $ANTLR start "rule__Kind__Group_7__1__Impl"
    // InternalOCCI.g:2463:1: rule__Kind__Group_7__1__Impl : ( ( rule__Kind__TitleAssignment_7_1 ) ) ;
    public final void rule__Kind__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2467:1: ( ( ( rule__Kind__TitleAssignment_7_1 ) ) )
            // InternalOCCI.g:2468:1: ( ( rule__Kind__TitleAssignment_7_1 ) )
            {
            // InternalOCCI.g:2468:1: ( ( rule__Kind__TitleAssignment_7_1 ) )
            // InternalOCCI.g:2469:2: ( rule__Kind__TitleAssignment_7_1 )
            {
             before(grammarAccess.getKindAccess().getTitleAssignment_7_1()); 
            // InternalOCCI.g:2470:2: ( rule__Kind__TitleAssignment_7_1 )
            // InternalOCCI.g:2470:3: rule__Kind__TitleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Kind__TitleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getTitleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group_7__1__Impl"


    // $ANTLR start "rule__Mixin__Group__0"
    // InternalOCCI.g:2479:1: rule__Mixin__Group__0 : rule__Mixin__Group__0__Impl rule__Mixin__Group__1 ;
    public final void rule__Mixin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2483:1: ( rule__Mixin__Group__0__Impl rule__Mixin__Group__1 )
            // InternalOCCI.g:2484:2: rule__Mixin__Group__0__Impl rule__Mixin__Group__1
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
    // InternalOCCI.g:2491:1: rule__Mixin__Group__0__Impl : ( 'mixin' ) ;
    public final void rule__Mixin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2495:1: ( ( 'mixin' ) )
            // InternalOCCI.g:2496:1: ( 'mixin' )
            {
            // InternalOCCI.g:2496:1: ( 'mixin' )
            // InternalOCCI.g:2497:2: 'mixin'
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
    // InternalOCCI.g:2506:1: rule__Mixin__Group__1 : rule__Mixin__Group__1__Impl rule__Mixin__Group__2 ;
    public final void rule__Mixin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2510:1: ( rule__Mixin__Group__1__Impl rule__Mixin__Group__2 )
            // InternalOCCI.g:2511:2: rule__Mixin__Group__1__Impl rule__Mixin__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalOCCI.g:2518:1: rule__Mixin__Group__1__Impl : ( ( rule__Mixin__NameAssignment_1 ) ) ;
    public final void rule__Mixin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2522:1: ( ( ( rule__Mixin__NameAssignment_1 ) ) )
            // InternalOCCI.g:2523:1: ( ( rule__Mixin__NameAssignment_1 ) )
            {
            // InternalOCCI.g:2523:1: ( ( rule__Mixin__NameAssignment_1 ) )
            // InternalOCCI.g:2524:2: ( rule__Mixin__NameAssignment_1 )
            {
             before(grammarAccess.getMixinAccess().getNameAssignment_1()); 
            // InternalOCCI.g:2525:2: ( rule__Mixin__NameAssignment_1 )
            // InternalOCCI.g:2525:3: rule__Mixin__NameAssignment_1
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
    // InternalOCCI.g:2533:1: rule__Mixin__Group__2 : rule__Mixin__Group__2__Impl rule__Mixin__Group__3 ;
    public final void rule__Mixin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2537:1: ( rule__Mixin__Group__2__Impl rule__Mixin__Group__3 )
            // InternalOCCI.g:2538:2: rule__Mixin__Group__2__Impl rule__Mixin__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalOCCI.g:2545:1: rule__Mixin__Group__2__Impl : ( ( rule__Mixin__Group_2__0 )? ) ;
    public final void rule__Mixin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2549:1: ( ( ( rule__Mixin__Group_2__0 )? ) )
            // InternalOCCI.g:2550:1: ( ( rule__Mixin__Group_2__0 )? )
            {
            // InternalOCCI.g:2550:1: ( ( rule__Mixin__Group_2__0 )? )
            // InternalOCCI.g:2551:2: ( rule__Mixin__Group_2__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_2()); 
            // InternalOCCI.g:2552:2: ( rule__Mixin__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOCCI.g:2552:3: rule__Mixin__Group_2__0
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
    // InternalOCCI.g:2560:1: rule__Mixin__Group__3 : rule__Mixin__Group__3__Impl rule__Mixin__Group__4 ;
    public final void rule__Mixin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2564:1: ( rule__Mixin__Group__3__Impl rule__Mixin__Group__4 )
            // InternalOCCI.g:2565:2: rule__Mixin__Group__3__Impl rule__Mixin__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalOCCI.g:2572:1: rule__Mixin__Group__3__Impl : ( ( rule__Mixin__Group_3__0 )? ) ;
    public final void rule__Mixin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2576:1: ( ( ( rule__Mixin__Group_3__0 )? ) )
            // InternalOCCI.g:2577:1: ( ( rule__Mixin__Group_3__0 )? )
            {
            // InternalOCCI.g:2577:1: ( ( rule__Mixin__Group_3__0 )? )
            // InternalOCCI.g:2578:2: ( rule__Mixin__Group_3__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_3()); 
            // InternalOCCI.g:2579:2: ( rule__Mixin__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOCCI.g:2579:3: rule__Mixin__Group_3__0
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
    // InternalOCCI.g:2587:1: rule__Mixin__Group__4 : rule__Mixin__Group__4__Impl rule__Mixin__Group__5 ;
    public final void rule__Mixin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2591:1: ( rule__Mixin__Group__4__Impl rule__Mixin__Group__5 )
            // InternalOCCI.g:2592:2: rule__Mixin__Group__4__Impl rule__Mixin__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalOCCI.g:2599:1: rule__Mixin__Group__4__Impl : ( ( rule__Mixin__Group_4__0 )? ) ;
    public final void rule__Mixin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2603:1: ( ( ( rule__Mixin__Group_4__0 )? ) )
            // InternalOCCI.g:2604:1: ( ( rule__Mixin__Group_4__0 )? )
            {
            // InternalOCCI.g:2604:1: ( ( rule__Mixin__Group_4__0 )? )
            // InternalOCCI.g:2605:2: ( rule__Mixin__Group_4__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_4()); 
            // InternalOCCI.g:2606:2: ( rule__Mixin__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOCCI.g:2606:3: rule__Mixin__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mixin__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMixinAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalOCCI.g:2614:1: rule__Mixin__Group__5 : rule__Mixin__Group__5__Impl rule__Mixin__Group__6 ;
    public final void rule__Mixin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2618:1: ( rule__Mixin__Group__5__Impl rule__Mixin__Group__6 )
            // InternalOCCI.g:2619:2: rule__Mixin__Group__5__Impl rule__Mixin__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalOCCI.g:2626:1: rule__Mixin__Group__5__Impl : ( '{' ) ;
    public final void rule__Mixin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2630:1: ( ( '{' ) )
            // InternalOCCI.g:2631:1: ( '{' )
            {
            // InternalOCCI.g:2631:1: ( '{' )
            // InternalOCCI.g:2632:2: '{'
            {
             before(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalOCCI.g:2641:1: rule__Mixin__Group__6 : rule__Mixin__Group__6__Impl rule__Mixin__Group__7 ;
    public final void rule__Mixin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2645:1: ( rule__Mixin__Group__6__Impl rule__Mixin__Group__7 )
            // InternalOCCI.g:2646:2: rule__Mixin__Group__6__Impl rule__Mixin__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalOCCI.g:2653:1: rule__Mixin__Group__6__Impl : ( 'scheme' ) ;
    public final void rule__Mixin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2657:1: ( ( 'scheme' ) )
            // InternalOCCI.g:2658:1: ( 'scheme' )
            {
            // InternalOCCI.g:2658:1: ( 'scheme' )
            // InternalOCCI.g:2659:2: 'scheme'
            {
             before(grammarAccess.getMixinAccess().getSchemeKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getSchemeKeyword_6()); 

            }


            }

        }
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
    // InternalOCCI.g:2668:1: rule__Mixin__Group__7 : rule__Mixin__Group__7__Impl rule__Mixin__Group__8 ;
    public final void rule__Mixin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2672:1: ( rule__Mixin__Group__7__Impl rule__Mixin__Group__8 )
            // InternalOCCI.g:2673:2: rule__Mixin__Group__7__Impl rule__Mixin__Group__8
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
    // InternalOCCI.g:2680:1: rule__Mixin__Group__7__Impl : ( ( rule__Mixin__SchemeAssignment_7 ) ) ;
    public final void rule__Mixin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2684:1: ( ( ( rule__Mixin__SchemeAssignment_7 ) ) )
            // InternalOCCI.g:2685:1: ( ( rule__Mixin__SchemeAssignment_7 ) )
            {
            // InternalOCCI.g:2685:1: ( ( rule__Mixin__SchemeAssignment_7 ) )
            // InternalOCCI.g:2686:2: ( rule__Mixin__SchemeAssignment_7 )
            {
             before(grammarAccess.getMixinAccess().getSchemeAssignment_7()); 
            // InternalOCCI.g:2687:2: ( rule__Mixin__SchemeAssignment_7 )
            // InternalOCCI.g:2687:3: rule__Mixin__SchemeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__SchemeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getSchemeAssignment_7()); 

            }


            }

        }
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
    // InternalOCCI.g:2695:1: rule__Mixin__Group__8 : rule__Mixin__Group__8__Impl rule__Mixin__Group__9 ;
    public final void rule__Mixin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2699:1: ( rule__Mixin__Group__8__Impl rule__Mixin__Group__9 )
            // InternalOCCI.g:2700:2: rule__Mixin__Group__8__Impl rule__Mixin__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Mixin__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group__9();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:2707:1: rule__Mixin__Group__8__Impl : ( ( rule__Mixin__Group_8__0 )? ) ;
    public final void rule__Mixin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2711:1: ( ( ( rule__Mixin__Group_8__0 )? ) )
            // InternalOCCI.g:2712:1: ( ( rule__Mixin__Group_8__0 )? )
            {
            // InternalOCCI.g:2712:1: ( ( rule__Mixin__Group_8__0 )? )
            // InternalOCCI.g:2713:2: ( rule__Mixin__Group_8__0 )?
            {
             before(grammarAccess.getMixinAccess().getGroup_8()); 
            // InternalOCCI.g:2714:2: ( rule__Mixin__Group_8__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOCCI.g:2714:3: rule__Mixin__Group_8__0
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


    // $ANTLR start "rule__Mixin__Group__9"
    // InternalOCCI.g:2722:1: rule__Mixin__Group__9 : rule__Mixin__Group__9__Impl rule__Mixin__Group__10 ;
    public final void rule__Mixin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2726:1: ( rule__Mixin__Group__9__Impl rule__Mixin__Group__10 )
            // InternalOCCI.g:2727:2: rule__Mixin__Group__9__Impl rule__Mixin__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__Mixin__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__9"


    // $ANTLR start "rule__Mixin__Group__9__Impl"
    // InternalOCCI.g:2734:1: rule__Mixin__Group__9__Impl : ( ( rule__Mixin__Alternatives_9 )* ) ;
    public final void rule__Mixin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2738:1: ( ( ( rule__Mixin__Alternatives_9 )* ) )
            // InternalOCCI.g:2739:1: ( ( rule__Mixin__Alternatives_9 )* )
            {
            // InternalOCCI.g:2739:1: ( ( rule__Mixin__Alternatives_9 )* )
            // InternalOCCI.g:2740:2: ( rule__Mixin__Alternatives_9 )*
            {
             before(grammarAccess.getMixinAccess().getAlternatives_9()); 
            // InternalOCCI.g:2741:2: ( rule__Mixin__Alternatives_9 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30||(LA27_0>=34 && LA27_0<=35)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalOCCI.g:2741:3: rule__Mixin__Alternatives_9
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Mixin__Alternatives_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMixinAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__9__Impl"


    // $ANTLR start "rule__Mixin__Group__10"
    // InternalOCCI.g:2749:1: rule__Mixin__Group__10 : rule__Mixin__Group__10__Impl ;
    public final void rule__Mixin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2753:1: ( rule__Mixin__Group__10__Impl )
            // InternalOCCI.g:2754:2: rule__Mixin__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__10"


    // $ANTLR start "rule__Mixin__Group__10__Impl"
    // InternalOCCI.g:2760:1: rule__Mixin__Group__10__Impl : ( '}' ) ;
    public final void rule__Mixin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2764:1: ( ( '}' ) )
            // InternalOCCI.g:2765:1: ( '}' )
            {
            // InternalOCCI.g:2765:1: ( '}' )
            // InternalOCCI.g:2766:2: '}'
            {
             before(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_10()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__10__Impl"


    // $ANTLR start "rule__Mixin__Group_2__0"
    // InternalOCCI.g:2776:1: rule__Mixin__Group_2__0 : rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1 ;
    public final void rule__Mixin__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2780:1: ( rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1 )
            // InternalOCCI.g:2781:2: rule__Mixin__Group_2__0__Impl rule__Mixin__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:2788:1: rule__Mixin__Group_2__0__Impl : ( 'depends' ) ;
    public final void rule__Mixin__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2792:1: ( ( 'depends' ) )
            // InternalOCCI.g:2793:1: ( 'depends' )
            {
            // InternalOCCI.g:2793:1: ( 'depends' )
            // InternalOCCI.g:2794:2: 'depends'
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
    // InternalOCCI.g:2803:1: rule__Mixin__Group_2__1 : rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2 ;
    public final void rule__Mixin__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2807:1: ( rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2 )
            // InternalOCCI.g:2808:2: rule__Mixin__Group_2__1__Impl rule__Mixin__Group_2__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:2815:1: rule__Mixin__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Mixin__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2819:1: ( ( '(' ) )
            // InternalOCCI.g:2820:1: ( '(' )
            {
            // InternalOCCI.g:2820:1: ( '(' )
            // InternalOCCI.g:2821:2: '('
            {
             before(grammarAccess.getMixinAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalOCCI.g:2830:1: rule__Mixin__Group_2__2 : rule__Mixin__Group_2__2__Impl rule__Mixin__Group_2__3 ;
    public final void rule__Mixin__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2834:1: ( rule__Mixin__Group_2__2__Impl rule__Mixin__Group_2__3 )
            // InternalOCCI.g:2835:2: rule__Mixin__Group_2__2__Impl rule__Mixin__Group_2__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalOCCI.g:2842:1: rule__Mixin__Group_2__2__Impl : ( ( rule__Mixin__DependsAssignment_2_2 ) ) ;
    public final void rule__Mixin__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2846:1: ( ( ( rule__Mixin__DependsAssignment_2_2 ) ) )
            // InternalOCCI.g:2847:1: ( ( rule__Mixin__DependsAssignment_2_2 ) )
            {
            // InternalOCCI.g:2847:1: ( ( rule__Mixin__DependsAssignment_2_2 ) )
            // InternalOCCI.g:2848:2: ( rule__Mixin__DependsAssignment_2_2 )
            {
             before(grammarAccess.getMixinAccess().getDependsAssignment_2_2()); 
            // InternalOCCI.g:2849:2: ( rule__Mixin__DependsAssignment_2_2 )
            // InternalOCCI.g:2849:3: rule__Mixin__DependsAssignment_2_2
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
    // InternalOCCI.g:2857:1: rule__Mixin__Group_2__3 : rule__Mixin__Group_2__3__Impl rule__Mixin__Group_2__4 ;
    public final void rule__Mixin__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2861:1: ( rule__Mixin__Group_2__3__Impl rule__Mixin__Group_2__4 )
            // InternalOCCI.g:2862:2: rule__Mixin__Group_2__3__Impl rule__Mixin__Group_2__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalOCCI.g:2869:1: rule__Mixin__Group_2__3__Impl : ( ( rule__Mixin__Group_2_3__0 )* ) ;
    public final void rule__Mixin__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2873:1: ( ( ( rule__Mixin__Group_2_3__0 )* ) )
            // InternalOCCI.g:2874:1: ( ( rule__Mixin__Group_2_3__0 )* )
            {
            // InternalOCCI.g:2874:1: ( ( rule__Mixin__Group_2_3__0 )* )
            // InternalOCCI.g:2875:2: ( rule__Mixin__Group_2_3__0 )*
            {
             before(grammarAccess.getMixinAccess().getGroup_2_3()); 
            // InternalOCCI.g:2876:2: ( rule__Mixin__Group_2_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==69) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOCCI.g:2876:3: rule__Mixin__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Mixin__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalOCCI.g:2884:1: rule__Mixin__Group_2__4 : rule__Mixin__Group_2__4__Impl ;
    public final void rule__Mixin__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2888:1: ( rule__Mixin__Group_2__4__Impl )
            // InternalOCCI.g:2889:2: rule__Mixin__Group_2__4__Impl
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
    // InternalOCCI.g:2895:1: rule__Mixin__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Mixin__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2899:1: ( ( ')' ) )
            // InternalOCCI.g:2900:1: ( ')' )
            {
            // InternalOCCI.g:2900:1: ( ')' )
            // InternalOCCI.g:2901:2: ')'
            {
             before(grammarAccess.getMixinAccess().getRightParenthesisKeyword_2_4()); 
            match(input,71,FOLLOW_2); 
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
    // InternalOCCI.g:2911:1: rule__Mixin__Group_2_3__0 : rule__Mixin__Group_2_3__0__Impl rule__Mixin__Group_2_3__1 ;
    public final void rule__Mixin__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2915:1: ( rule__Mixin__Group_2_3__0__Impl rule__Mixin__Group_2_3__1 )
            // InternalOCCI.g:2916:2: rule__Mixin__Group_2_3__0__Impl rule__Mixin__Group_2_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:2923:1: rule__Mixin__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Mixin__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2927:1: ( ( ',' ) )
            // InternalOCCI.g:2928:1: ( ',' )
            {
            // InternalOCCI.g:2928:1: ( ',' )
            // InternalOCCI.g:2929:2: ','
            {
             before(grammarAccess.getMixinAccess().getCommaKeyword_2_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalOCCI.g:2938:1: rule__Mixin__Group_2_3__1 : rule__Mixin__Group_2_3__1__Impl ;
    public final void rule__Mixin__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2942:1: ( rule__Mixin__Group_2_3__1__Impl )
            // InternalOCCI.g:2943:2: rule__Mixin__Group_2_3__1__Impl
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
    // InternalOCCI.g:2949:1: rule__Mixin__Group_2_3__1__Impl : ( ( rule__Mixin__DependsAssignment_2_3_1 ) ) ;
    public final void rule__Mixin__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2953:1: ( ( ( rule__Mixin__DependsAssignment_2_3_1 ) ) )
            // InternalOCCI.g:2954:1: ( ( rule__Mixin__DependsAssignment_2_3_1 ) )
            {
            // InternalOCCI.g:2954:1: ( ( rule__Mixin__DependsAssignment_2_3_1 ) )
            // InternalOCCI.g:2955:2: ( rule__Mixin__DependsAssignment_2_3_1 )
            {
             before(grammarAccess.getMixinAccess().getDependsAssignment_2_3_1()); 
            // InternalOCCI.g:2956:2: ( rule__Mixin__DependsAssignment_2_3_1 )
            // InternalOCCI.g:2956:3: rule__Mixin__DependsAssignment_2_3_1
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
    // InternalOCCI.g:2965:1: rule__Mixin__Group_3__0 : rule__Mixin__Group_3__0__Impl rule__Mixin__Group_3__1 ;
    public final void rule__Mixin__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2969:1: ( rule__Mixin__Group_3__0__Impl rule__Mixin__Group_3__1 )
            // InternalOCCI.g:2970:2: rule__Mixin__Group_3__0__Impl rule__Mixin__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:2977:1: rule__Mixin__Group_3__0__Impl : ( 'applies' ) ;
    public final void rule__Mixin__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2981:1: ( ( 'applies' ) )
            // InternalOCCI.g:2982:1: ( 'applies' )
            {
            // InternalOCCI.g:2982:1: ( 'applies' )
            // InternalOCCI.g:2983:2: 'applies'
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
    // InternalOCCI.g:2992:1: rule__Mixin__Group_3__1 : rule__Mixin__Group_3__1__Impl rule__Mixin__Group_3__2 ;
    public final void rule__Mixin__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:2996:1: ( rule__Mixin__Group_3__1__Impl rule__Mixin__Group_3__2 )
            // InternalOCCI.g:2997:2: rule__Mixin__Group_3__1__Impl rule__Mixin__Group_3__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:3004:1: rule__Mixin__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Mixin__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3008:1: ( ( '(' ) )
            // InternalOCCI.g:3009:1: ( '(' )
            {
            // InternalOCCI.g:3009:1: ( '(' )
            // InternalOCCI.g:3010:2: '('
            {
             before(grammarAccess.getMixinAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalOCCI.g:3019:1: rule__Mixin__Group_3__2 : rule__Mixin__Group_3__2__Impl rule__Mixin__Group_3__3 ;
    public final void rule__Mixin__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3023:1: ( rule__Mixin__Group_3__2__Impl rule__Mixin__Group_3__3 )
            // InternalOCCI.g:3024:2: rule__Mixin__Group_3__2__Impl rule__Mixin__Group_3__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalOCCI.g:3031:1: rule__Mixin__Group_3__2__Impl : ( ( rule__Mixin__AppliesAssignment_3_2 ) ) ;
    public final void rule__Mixin__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3035:1: ( ( ( rule__Mixin__AppliesAssignment_3_2 ) ) )
            // InternalOCCI.g:3036:1: ( ( rule__Mixin__AppliesAssignment_3_2 ) )
            {
            // InternalOCCI.g:3036:1: ( ( rule__Mixin__AppliesAssignment_3_2 ) )
            // InternalOCCI.g:3037:2: ( rule__Mixin__AppliesAssignment_3_2 )
            {
             before(grammarAccess.getMixinAccess().getAppliesAssignment_3_2()); 
            // InternalOCCI.g:3038:2: ( rule__Mixin__AppliesAssignment_3_2 )
            // InternalOCCI.g:3038:3: rule__Mixin__AppliesAssignment_3_2
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
    // InternalOCCI.g:3046:1: rule__Mixin__Group_3__3 : rule__Mixin__Group_3__3__Impl rule__Mixin__Group_3__4 ;
    public final void rule__Mixin__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3050:1: ( rule__Mixin__Group_3__3__Impl rule__Mixin__Group_3__4 )
            // InternalOCCI.g:3051:2: rule__Mixin__Group_3__3__Impl rule__Mixin__Group_3__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalOCCI.g:3058:1: rule__Mixin__Group_3__3__Impl : ( ( rule__Mixin__Group_3_3__0 )* ) ;
    public final void rule__Mixin__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3062:1: ( ( ( rule__Mixin__Group_3_3__0 )* ) )
            // InternalOCCI.g:3063:1: ( ( rule__Mixin__Group_3_3__0 )* )
            {
            // InternalOCCI.g:3063:1: ( ( rule__Mixin__Group_3_3__0 )* )
            // InternalOCCI.g:3064:2: ( rule__Mixin__Group_3_3__0 )*
            {
             before(grammarAccess.getMixinAccess().getGroup_3_3()); 
            // InternalOCCI.g:3065:2: ( rule__Mixin__Group_3_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==69) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOCCI.g:3065:3: rule__Mixin__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Mixin__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalOCCI.g:3073:1: rule__Mixin__Group_3__4 : rule__Mixin__Group_3__4__Impl ;
    public final void rule__Mixin__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3077:1: ( rule__Mixin__Group_3__4__Impl )
            // InternalOCCI.g:3078:2: rule__Mixin__Group_3__4__Impl
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
    // InternalOCCI.g:3084:1: rule__Mixin__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Mixin__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3088:1: ( ( ')' ) )
            // InternalOCCI.g:3089:1: ( ')' )
            {
            // InternalOCCI.g:3089:1: ( ')' )
            // InternalOCCI.g:3090:2: ')'
            {
             before(grammarAccess.getMixinAccess().getRightParenthesisKeyword_3_4()); 
            match(input,71,FOLLOW_2); 
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
    // InternalOCCI.g:3100:1: rule__Mixin__Group_3_3__0 : rule__Mixin__Group_3_3__0__Impl rule__Mixin__Group_3_3__1 ;
    public final void rule__Mixin__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3104:1: ( rule__Mixin__Group_3_3__0__Impl rule__Mixin__Group_3_3__1 )
            // InternalOCCI.g:3105:2: rule__Mixin__Group_3_3__0__Impl rule__Mixin__Group_3_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:3112:1: rule__Mixin__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Mixin__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3116:1: ( ( ',' ) )
            // InternalOCCI.g:3117:1: ( ',' )
            {
            // InternalOCCI.g:3117:1: ( ',' )
            // InternalOCCI.g:3118:2: ','
            {
             before(grammarAccess.getMixinAccess().getCommaKeyword_3_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalOCCI.g:3127:1: rule__Mixin__Group_3_3__1 : rule__Mixin__Group_3_3__1__Impl ;
    public final void rule__Mixin__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3131:1: ( rule__Mixin__Group_3_3__1__Impl )
            // InternalOCCI.g:3132:2: rule__Mixin__Group_3_3__1__Impl
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
    // InternalOCCI.g:3138:1: rule__Mixin__Group_3_3__1__Impl : ( ( rule__Mixin__AppliesAssignment_3_3_1 ) ) ;
    public final void rule__Mixin__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3142:1: ( ( ( rule__Mixin__AppliesAssignment_3_3_1 ) ) )
            // InternalOCCI.g:3143:1: ( ( rule__Mixin__AppliesAssignment_3_3_1 ) )
            {
            // InternalOCCI.g:3143:1: ( ( rule__Mixin__AppliesAssignment_3_3_1 ) )
            // InternalOCCI.g:3144:2: ( rule__Mixin__AppliesAssignment_3_3_1 )
            {
             before(grammarAccess.getMixinAccess().getAppliesAssignment_3_3_1()); 
            // InternalOCCI.g:3145:2: ( rule__Mixin__AppliesAssignment_3_3_1 )
            // InternalOCCI.g:3145:3: rule__Mixin__AppliesAssignment_3_3_1
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


    // $ANTLR start "rule__Mixin__Group_4__0"
    // InternalOCCI.g:3154:1: rule__Mixin__Group_4__0 : rule__Mixin__Group_4__0__Impl rule__Mixin__Group_4__1 ;
    public final void rule__Mixin__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3158:1: ( rule__Mixin__Group_4__0__Impl rule__Mixin__Group_4__1 )
            // InternalOCCI.g:3159:2: rule__Mixin__Group_4__0__Impl rule__Mixin__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Mixin__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4__0"


    // $ANTLR start "rule__Mixin__Group_4__0__Impl"
    // InternalOCCI.g:3166:1: rule__Mixin__Group_4__0__Impl : ( 'annotations' ) ;
    public final void rule__Mixin__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3170:1: ( ( 'annotations' ) )
            // InternalOCCI.g:3171:1: ( 'annotations' )
            {
            // InternalOCCI.g:3171:1: ( 'annotations' )
            // InternalOCCI.g:3172:2: 'annotations'
            {
             before(grammarAccess.getMixinAccess().getAnnotationsKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getAnnotationsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4__0__Impl"


    // $ANTLR start "rule__Mixin__Group_4__1"
    // InternalOCCI.g:3181:1: rule__Mixin__Group_4__1 : rule__Mixin__Group_4__1__Impl rule__Mixin__Group_4__2 ;
    public final void rule__Mixin__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3185:1: ( rule__Mixin__Group_4__1__Impl rule__Mixin__Group_4__2 )
            // InternalOCCI.g:3186:2: rule__Mixin__Group_4__1__Impl rule__Mixin__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__Mixin__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4__1"


    // $ANTLR start "rule__Mixin__Group_4__1__Impl"
    // InternalOCCI.g:3193:1: rule__Mixin__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Mixin__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3197:1: ( ( '{' ) )
            // InternalOCCI.g:3198:1: ( '{' )
            {
            // InternalOCCI.g:3198:1: ( '{' )
            // InternalOCCI.g:3199:2: '{'
            {
             before(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4__1__Impl"


    // $ANTLR start "rule__Mixin__Group_4__2"
    // InternalOCCI.g:3208:1: rule__Mixin__Group_4__2 : rule__Mixin__Group_4__2__Impl rule__Mixin__Group_4__3 ;
    public final void rule__Mixin__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3212:1: ( rule__Mixin__Group_4__2__Impl rule__Mixin__Group_4__3 )
            // InternalOCCI.g:3213:2: rule__Mixin__Group_4__2__Impl rule__Mixin__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__Mixin__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4__2"


    // $ANTLR start "rule__Mixin__Group_4__2__Impl"
    // InternalOCCI.g:3220:1: rule__Mixin__Group_4__2__Impl : ( ( rule__Mixin__AnnotationsAssignment_4_2 ) ) ;
    public final void rule__Mixin__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3224:1: ( ( ( rule__Mixin__AnnotationsAssignment_4_2 ) ) )
            // InternalOCCI.g:3225:1: ( ( rule__Mixin__AnnotationsAssignment_4_2 ) )
            {
            // InternalOCCI.g:3225:1: ( ( rule__Mixin__AnnotationsAssignment_4_2 ) )
            // InternalOCCI.g:3226:2: ( rule__Mixin__AnnotationsAssignment_4_2 )
            {
             before(grammarAccess.getMixinAccess().getAnnotationsAssignment_4_2()); 
            // InternalOCCI.g:3227:2: ( rule__Mixin__AnnotationsAssignment_4_2 )
            // InternalOCCI.g:3227:3: rule__Mixin__AnnotationsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__AnnotationsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAnnotationsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4__2__Impl"


    // $ANTLR start "rule__Mixin__Group_4__3"
    // InternalOCCI.g:3235:1: rule__Mixin__Group_4__3 : rule__Mixin__Group_4__3__Impl rule__Mixin__Group_4__4 ;
    public final void rule__Mixin__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3239:1: ( rule__Mixin__Group_4__3__Impl rule__Mixin__Group_4__4 )
            // InternalOCCI.g:3240:2: rule__Mixin__Group_4__3__Impl rule__Mixin__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__Mixin__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4__3"


    // $ANTLR start "rule__Mixin__Group_4__3__Impl"
    // InternalOCCI.g:3247:1: rule__Mixin__Group_4__3__Impl : ( ( rule__Mixin__Group_4_3__0 )* ) ;
    public final void rule__Mixin__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3251:1: ( ( ( rule__Mixin__Group_4_3__0 )* ) )
            // InternalOCCI.g:3252:1: ( ( rule__Mixin__Group_4_3__0 )* )
            {
            // InternalOCCI.g:3252:1: ( ( rule__Mixin__Group_4_3__0 )* )
            // InternalOCCI.g:3253:2: ( rule__Mixin__Group_4_3__0 )*
            {
             before(grammarAccess.getMixinAccess().getGroup_4_3()); 
            // InternalOCCI.g:3254:2: ( rule__Mixin__Group_4_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==69) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOCCI.g:3254:3: rule__Mixin__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Mixin__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getMixinAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4__3__Impl"


    // $ANTLR start "rule__Mixin__Group_4__4"
    // InternalOCCI.g:3262:1: rule__Mixin__Group_4__4 : rule__Mixin__Group_4__4__Impl ;
    public final void rule__Mixin__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3266:1: ( rule__Mixin__Group_4__4__Impl )
            // InternalOCCI.g:3267:2: rule__Mixin__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4__4"


    // $ANTLR start "rule__Mixin__Group_4__4__Impl"
    // InternalOCCI.g:3273:1: rule__Mixin__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Mixin__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3277:1: ( ( '}' ) )
            // InternalOCCI.g:3278:1: ( '}' )
            {
            // InternalOCCI.g:3278:1: ( '}' )
            // InternalOCCI.g:3279:2: '}'
            {
             before(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4__4__Impl"


    // $ANTLR start "rule__Mixin__Group_4_3__0"
    // InternalOCCI.g:3289:1: rule__Mixin__Group_4_3__0 : rule__Mixin__Group_4_3__0__Impl rule__Mixin__Group_4_3__1 ;
    public final void rule__Mixin__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3293:1: ( rule__Mixin__Group_4_3__0__Impl rule__Mixin__Group_4_3__1 )
            // InternalOCCI.g:3294:2: rule__Mixin__Group_4_3__0__Impl rule__Mixin__Group_4_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Mixin__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mixin__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4_3__0"


    // $ANTLR start "rule__Mixin__Group_4_3__0__Impl"
    // InternalOCCI.g:3301:1: rule__Mixin__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Mixin__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3305:1: ( ( ',' ) )
            // InternalOCCI.g:3306:1: ( ',' )
            {
            // InternalOCCI.g:3306:1: ( ',' )
            // InternalOCCI.g:3307:2: ','
            {
             before(grammarAccess.getMixinAccess().getCommaKeyword_4_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4_3__0__Impl"


    // $ANTLR start "rule__Mixin__Group_4_3__1"
    // InternalOCCI.g:3316:1: rule__Mixin__Group_4_3__1 : rule__Mixin__Group_4_3__1__Impl ;
    public final void rule__Mixin__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3320:1: ( rule__Mixin__Group_4_3__1__Impl )
            // InternalOCCI.g:3321:2: rule__Mixin__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4_3__1"


    // $ANTLR start "rule__Mixin__Group_4_3__1__Impl"
    // InternalOCCI.g:3327:1: rule__Mixin__Group_4_3__1__Impl : ( ( rule__Mixin__AnnotationsAssignment_4_3_1 ) ) ;
    public final void rule__Mixin__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3331:1: ( ( ( rule__Mixin__AnnotationsAssignment_4_3_1 ) ) )
            // InternalOCCI.g:3332:1: ( ( rule__Mixin__AnnotationsAssignment_4_3_1 ) )
            {
            // InternalOCCI.g:3332:1: ( ( rule__Mixin__AnnotationsAssignment_4_3_1 ) )
            // InternalOCCI.g:3333:2: ( rule__Mixin__AnnotationsAssignment_4_3_1 )
            {
             before(grammarAccess.getMixinAccess().getAnnotationsAssignment_4_3_1()); 
            // InternalOCCI.g:3334:2: ( rule__Mixin__AnnotationsAssignment_4_3_1 )
            // InternalOCCI.g:3334:3: rule__Mixin__AnnotationsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__AnnotationsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAnnotationsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group_4_3__1__Impl"


    // $ANTLR start "rule__Mixin__Group_8__0"
    // InternalOCCI.g:3343:1: rule__Mixin__Group_8__0 : rule__Mixin__Group_8__0__Impl rule__Mixin__Group_8__1 ;
    public final void rule__Mixin__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3347:1: ( rule__Mixin__Group_8__0__Impl rule__Mixin__Group_8__1 )
            // InternalOCCI.g:3348:2: rule__Mixin__Group_8__0__Impl rule__Mixin__Group_8__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOCCI.g:3355:1: rule__Mixin__Group_8__0__Impl : ( 'title' ) ;
    public final void rule__Mixin__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3359:1: ( ( 'title' ) )
            // InternalOCCI.g:3360:1: ( 'title' )
            {
            // InternalOCCI.g:3360:1: ( 'title' )
            // InternalOCCI.g:3361:2: 'title'
            {
             before(grammarAccess.getMixinAccess().getTitleKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getTitleKeyword_8_0()); 

            }


            }

        }
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
    // InternalOCCI.g:3370:1: rule__Mixin__Group_8__1 : rule__Mixin__Group_8__1__Impl ;
    public final void rule__Mixin__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3374:1: ( rule__Mixin__Group_8__1__Impl )
            // InternalOCCI.g:3375:2: rule__Mixin__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__Group_8__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:3381:1: rule__Mixin__Group_8__1__Impl : ( ( rule__Mixin__TitleAssignment_8_1 ) ) ;
    public final void rule__Mixin__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3385:1: ( ( ( rule__Mixin__TitleAssignment_8_1 ) ) )
            // InternalOCCI.g:3386:1: ( ( rule__Mixin__TitleAssignment_8_1 ) )
            {
            // InternalOCCI.g:3386:1: ( ( rule__Mixin__TitleAssignment_8_1 ) )
            // InternalOCCI.g:3387:2: ( rule__Mixin__TitleAssignment_8_1 )
            {
             before(grammarAccess.getMixinAccess().getTitleAssignment_8_1()); 
            // InternalOCCI.g:3388:2: ( rule__Mixin__TitleAssignment_8_1 )
            // InternalOCCI.g:3388:3: rule__Mixin__TitleAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Mixin__TitleAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getTitleAssignment_8_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalOCCI.g:3397:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3401:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalOCCI.g:3402:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalOCCI.g:3409:1: rule__Annotation__Group__0__Impl : ( 'annotation' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3413:1: ( ( 'annotation' ) )
            // InternalOCCI.g:3414:1: ( 'annotation' )
            {
            // InternalOCCI.g:3414:1: ( 'annotation' )
            // InternalOCCI.g:3415:2: 'annotation'
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getAnnotationKeyword_0()); 

            }


            }

        }
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
    // InternalOCCI.g:3424:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3428:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalOCCI.g:3429:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalOCCI.g:3436:1: rule__Annotation__Group__1__Impl : ( '{' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3440:1: ( ( '{' ) )
            // InternalOCCI.g:3441:1: ( '{' )
            {
            // InternalOCCI.g:3441:1: ( '{' )
            // InternalOCCI.g:3442:2: '{'
            {
             before(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalOCCI.g:3451:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3455:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // InternalOCCI.g:3456:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalOCCI.g:3463:1: rule__Annotation__Group__2__Impl : ( 'key' ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3467:1: ( ( 'key' ) )
            // InternalOCCI.g:3468:1: ( 'key' )
            {
            // InternalOCCI.g:3468:1: ( 'key' )
            // InternalOCCI.g:3469:2: 'key'
            {
             before(grammarAccess.getAnnotationAccess().getKeyKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getKeyKeyword_2()); 

            }


            }

        }
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
    // InternalOCCI.g:3478:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl rule__Annotation__Group__4 ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3482:1: ( rule__Annotation__Group__3__Impl rule__Annotation__Group__4 )
            // InternalOCCI.g:3483:2: rule__Annotation__Group__3__Impl rule__Annotation__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalOCCI.g:3490:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__KeyAssignment_3 ) ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3494:1: ( ( ( rule__Annotation__KeyAssignment_3 ) ) )
            // InternalOCCI.g:3495:1: ( ( rule__Annotation__KeyAssignment_3 ) )
            {
            // InternalOCCI.g:3495:1: ( ( rule__Annotation__KeyAssignment_3 ) )
            // InternalOCCI.g:3496:2: ( rule__Annotation__KeyAssignment_3 )
            {
             before(grammarAccess.getAnnotationAccess().getKeyAssignment_3()); 
            // InternalOCCI.g:3497:2: ( rule__Annotation__KeyAssignment_3 )
            // InternalOCCI.g:3497:3: rule__Annotation__KeyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__KeyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getKeyAssignment_3()); 

            }


            }

        }
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
    // InternalOCCI.g:3505:1: rule__Annotation__Group__4 : rule__Annotation__Group__4__Impl rule__Annotation__Group__5 ;
    public final void rule__Annotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3509:1: ( rule__Annotation__Group__4__Impl rule__Annotation__Group__5 )
            // InternalOCCI.g:3510:2: rule__Annotation__Group__4__Impl rule__Annotation__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalOCCI.g:3517:1: rule__Annotation__Group__4__Impl : ( 'value' ) ;
    public final void rule__Annotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3521:1: ( ( 'value' ) )
            // InternalOCCI.g:3522:1: ( 'value' )
            {
            // InternalOCCI.g:3522:1: ( 'value' )
            // InternalOCCI.g:3523:2: 'value'
            {
             before(grammarAccess.getAnnotationAccess().getValueKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getValueKeyword_4()); 

            }


            }

        }
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
    // InternalOCCI.g:3532:1: rule__Annotation__Group__5 : rule__Annotation__Group__5__Impl rule__Annotation__Group__6 ;
    public final void rule__Annotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3536:1: ( rule__Annotation__Group__5__Impl rule__Annotation__Group__6 )
            // InternalOCCI.g:3537:2: rule__Annotation__Group__5__Impl rule__Annotation__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Annotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__6();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:3544:1: rule__Annotation__Group__5__Impl : ( ( rule__Annotation__ValueAssignment_5 ) ) ;
    public final void rule__Annotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3548:1: ( ( ( rule__Annotation__ValueAssignment_5 ) ) )
            // InternalOCCI.g:3549:1: ( ( rule__Annotation__ValueAssignment_5 ) )
            {
            // InternalOCCI.g:3549:1: ( ( rule__Annotation__ValueAssignment_5 ) )
            // InternalOCCI.g:3550:2: ( rule__Annotation__ValueAssignment_5 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_5()); 
            // InternalOCCI.g:3551:2: ( rule__Annotation__ValueAssignment_5 )
            // InternalOCCI.g:3551:3: rule__Annotation__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getValueAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Annotation__Group__6"
    // InternalOCCI.g:3559:1: rule__Annotation__Group__6 : rule__Annotation__Group__6__Impl ;
    public final void rule__Annotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3563:1: ( rule__Annotation__Group__6__Impl )
            // InternalOCCI.g:3564:2: rule__Annotation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__6"


    // $ANTLR start "rule__Annotation__Group__6__Impl"
    // InternalOCCI.g:3570:1: rule__Annotation__Group__6__Impl : ( '}' ) ;
    public final void rule__Annotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3574:1: ( ( '}' ) )
            // InternalOCCI.g:3575:1: ( '}' )
            {
            // InternalOCCI.g:3575:1: ( '}' )
            // InternalOCCI.g:3576:2: '}'
            {
             before(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalOCCI.g:3586:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3590:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalOCCI.g:3591:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:3598:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3602:1: ( ( 'attribute' ) )
            // InternalOCCI.g:3603:1: ( 'attribute' )
            {
            // InternalOCCI.g:3603:1: ( 'attribute' )
            // InternalOCCI.g:3604:2: 'attribute'
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
    // InternalOCCI.g:3613:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3617:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalOCCI.g:3618:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:3625:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__MutableAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3629:1: ( ( ( rule__Attribute__MutableAssignment_1 )? ) )
            // InternalOCCI.g:3630:1: ( ( rule__Attribute__MutableAssignment_1 )? )
            {
            // InternalOCCI.g:3630:1: ( ( rule__Attribute__MutableAssignment_1 )? )
            // InternalOCCI.g:3631:2: ( rule__Attribute__MutableAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getMutableAssignment_1()); 
            // InternalOCCI.g:3632:2: ( rule__Attribute__MutableAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                int LA31_1 = input.LA(2);

                if ( ((LA31_1>=RULE_ID && LA31_1<=RULE_QUALIFIED_ID)||(LA31_1>=13 && LA31_1<=64)) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalOCCI.g:3632:3: rule__Attribute__MutableAssignment_1
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
    // InternalOCCI.g:3640:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3644:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalOCCI.g:3645:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:3652:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__RequiredAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3656:1: ( ( ( rule__Attribute__RequiredAssignment_2 )? ) )
            // InternalOCCI.g:3657:1: ( ( rule__Attribute__RequiredAssignment_2 )? )
            {
            // InternalOCCI.g:3657:1: ( ( rule__Attribute__RequiredAssignment_2 )? )
            // InternalOCCI.g:3658:2: ( rule__Attribute__RequiredAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getRequiredAssignment_2()); 
            // InternalOCCI.g:3659:2: ( rule__Attribute__RequiredAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                int LA32_1 = input.LA(2);

                if ( ((LA32_1>=RULE_ID && LA32_1<=RULE_QUALIFIED_ID)||(LA32_1>=13 && LA32_1<=64)) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalOCCI.g:3659:3: rule__Attribute__RequiredAssignment_2
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
    // InternalOCCI.g:3667:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3671:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalOCCI.g:3672:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalOCCI.g:3679:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__NameAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3683:1: ( ( ( rule__Attribute__NameAssignment_3 ) ) )
            // InternalOCCI.g:3684:1: ( ( rule__Attribute__NameAssignment_3 ) )
            {
            // InternalOCCI.g:3684:1: ( ( rule__Attribute__NameAssignment_3 ) )
            // InternalOCCI.g:3685:2: ( rule__Attribute__NameAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_3()); 
            // InternalOCCI.g:3686:2: ( rule__Attribute__NameAssignment_3 )
            // InternalOCCI.g:3686:3: rule__Attribute__NameAssignment_3
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
    // InternalOCCI.g:3694:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3698:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalOCCI.g:3699:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalOCCI.g:3706:1: rule__Attribute__Group__4__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3710:1: ( ( ':' ) )
            // InternalOCCI.g:3711:1: ( ':' )
            {
            // InternalOCCI.g:3711:1: ( ':' )
            // InternalOCCI.g:3712:2: ':'
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
    // InternalOCCI.g:3721:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3725:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalOCCI.g:3726:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalOCCI.g:3733:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3737:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalOCCI.g:3738:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalOCCI.g:3738:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalOCCI.g:3739:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalOCCI.g:3740:2: ( rule__Attribute__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOCCI.g:3740:3: rule__Attribute__Group_5__0
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
    // InternalOCCI.g:3748:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3752:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalOCCI.g:3753:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalOCCI.g:3760:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__Group_6__0 )? ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3764:1: ( ( ( rule__Attribute__Group_6__0 )? ) )
            // InternalOCCI.g:3765:1: ( ( rule__Attribute__Group_6__0 )? )
            {
            // InternalOCCI.g:3765:1: ( ( rule__Attribute__Group_6__0 )? )
            // InternalOCCI.g:3766:2: ( rule__Attribute__Group_6__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_6()); 
            // InternalOCCI.g:3767:2: ( rule__Attribute__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==72) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOCCI.g:3767:3: rule__Attribute__Group_6__0
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
    // InternalOCCI.g:3775:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3779:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalOCCI.g:3780:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalOCCI.g:3787:1: rule__Attribute__Group__7__Impl : ( ( rule__Attribute__Group_7__0 ) ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3791:1: ( ( ( rule__Attribute__Group_7__0 ) ) )
            // InternalOCCI.g:3792:1: ( ( rule__Attribute__Group_7__0 ) )
            {
            // InternalOCCI.g:3792:1: ( ( rule__Attribute__Group_7__0 ) )
            // InternalOCCI.g:3793:2: ( rule__Attribute__Group_7__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup_7()); 
            // InternalOCCI.g:3794:2: ( rule__Attribute__Group_7__0 )
            // InternalOCCI.g:3794:3: rule__Attribute__Group_7__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7__0();

            state._fsp--;


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
    // InternalOCCI.g:3802:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3806:1: ( rule__Attribute__Group__8__Impl )
            // InternalOCCI.g:3807:2: rule__Attribute__Group__8__Impl
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
    // InternalOCCI.g:3813:1: rule__Attribute__Group__8__Impl : ( ( rule__Attribute__Group_8__0 )? ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3817:1: ( ( ( rule__Attribute__Group_8__0 )? ) )
            // InternalOCCI.g:3818:1: ( ( rule__Attribute__Group_8__0 )? )
            {
            // InternalOCCI.g:3818:1: ( ( rule__Attribute__Group_8__0 )? )
            // InternalOCCI.g:3819:2: ( rule__Attribute__Group_8__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_8()); 
            // InternalOCCI.g:3820:2: ( rule__Attribute__Group_8__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOCCI.g:3820:3: rule__Attribute__Group_8__0
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
    // InternalOCCI.g:3829:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3833:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalOCCI.g:3834:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:3841:1: rule__Attribute__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3845:1: ( ( 'type' ) )
            // InternalOCCI.g:3846:1: ( 'type' )
            {
            // InternalOCCI.g:3846:1: ( 'type' )
            // InternalOCCI.g:3847:2: 'type'
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
    // InternalOCCI.g:3856:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3860:1: ( rule__Attribute__Group_5__1__Impl )
            // InternalOCCI.g:3861:2: rule__Attribute__Group_5__1__Impl
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
    // InternalOCCI.g:3867:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__TypeAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3871:1: ( ( ( rule__Attribute__TypeAssignment_5_1 ) ) )
            // InternalOCCI.g:3872:1: ( ( rule__Attribute__TypeAssignment_5_1 ) )
            {
            // InternalOCCI.g:3872:1: ( ( rule__Attribute__TypeAssignment_5_1 ) )
            // InternalOCCI.g:3873:2: ( rule__Attribute__TypeAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_5_1()); 
            // InternalOCCI.g:3874:2: ( rule__Attribute__TypeAssignment_5_1 )
            // InternalOCCI.g:3874:3: rule__Attribute__TypeAssignment_5_1
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
    // InternalOCCI.g:3883:1: rule__Attribute__Group_6__0 : rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 ;
    public final void rule__Attribute__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3887:1: ( rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1 )
            // InternalOCCI.g:3888:2: rule__Attribute__Group_6__0__Impl rule__Attribute__Group_6__1
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
    // InternalOCCI.g:3895:1: rule__Attribute__Group_6__0__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3899:1: ( ( '=' ) )
            // InternalOCCI.g:3900:1: ( '=' )
            {
            // InternalOCCI.g:3900:1: ( '=' )
            // InternalOCCI.g:3901:2: '='
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
    // InternalOCCI.g:3910:1: rule__Attribute__Group_6__1 : rule__Attribute__Group_6__1__Impl ;
    public final void rule__Attribute__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3914:1: ( rule__Attribute__Group_6__1__Impl )
            // InternalOCCI.g:3915:2: rule__Attribute__Group_6__1__Impl
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
    // InternalOCCI.g:3921:1: rule__Attribute__Group_6__1__Impl : ( ( rule__Attribute__DefaultAssignment_6_1 ) ) ;
    public final void rule__Attribute__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3925:1: ( ( ( rule__Attribute__DefaultAssignment_6_1 ) ) )
            // InternalOCCI.g:3926:1: ( ( rule__Attribute__DefaultAssignment_6_1 ) )
            {
            // InternalOCCI.g:3926:1: ( ( rule__Attribute__DefaultAssignment_6_1 ) )
            // InternalOCCI.g:3927:2: ( rule__Attribute__DefaultAssignment_6_1 )
            {
             before(grammarAccess.getAttributeAccess().getDefaultAssignment_6_1()); 
            // InternalOCCI.g:3928:2: ( rule__Attribute__DefaultAssignment_6_1 )
            // InternalOCCI.g:3928:3: rule__Attribute__DefaultAssignment_6_1
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
    // InternalOCCI.g:3937:1: rule__Attribute__Group_7__0 : rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 ;
    public final void rule__Attribute__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3941:1: ( rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1 )
            // InternalOCCI.g:3942:2: rule__Attribute__Group_7__0__Impl rule__Attribute__Group_7__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalOCCI.g:3949:1: rule__Attribute__Group_7__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3953:1: ( ( '{' ) )
            // InternalOCCI.g:3954:1: ( '{' )
            {
            // InternalOCCI.g:3954:1: ( '{' )
            // InternalOCCI.g:3955:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_7_0()); 

            }


            }

        }
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
    // InternalOCCI.g:3964:1: rule__Attribute__Group_7__1 : rule__Attribute__Group_7__1__Impl rule__Attribute__Group_7__2 ;
    public final void rule__Attribute__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3968:1: ( rule__Attribute__Group_7__1__Impl rule__Attribute__Group_7__2 )
            // InternalOCCI.g:3969:2: rule__Attribute__Group_7__1__Impl rule__Attribute__Group_7__2
            {
            pushFollow(FOLLOW_30);
            rule__Attribute__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7__2();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:3976:1: rule__Attribute__Group_7__1__Impl : ( ( rule__Attribute__Group_7_1__0 )? ) ;
    public final void rule__Attribute__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3980:1: ( ( ( rule__Attribute__Group_7_1__0 )? ) )
            // InternalOCCI.g:3981:1: ( ( rule__Attribute__Group_7_1__0 )? )
            {
            // InternalOCCI.g:3981:1: ( ( rule__Attribute__Group_7_1__0 )? )
            // InternalOCCI.g:3982:2: ( rule__Attribute__Group_7_1__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_7_1()); 
            // InternalOCCI.g:3983:2: ( rule__Attribute__Group_7_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOCCI.g:3983:3: rule__Attribute__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_7_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__Group_7__2"
    // InternalOCCI.g:3991:1: rule__Attribute__Group_7__2 : rule__Attribute__Group_7__2__Impl ;
    public final void rule__Attribute__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:3995:1: ( rule__Attribute__Group_7__2__Impl )
            // InternalOCCI.g:3996:2: rule__Attribute__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7__2"


    // $ANTLR start "rule__Attribute__Group_7__2__Impl"
    // InternalOCCI.g:4002:1: rule__Attribute__Group_7__2__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4006:1: ( ( '}' ) )
            // InternalOCCI.g:4007:1: ( '}' )
            {
            // InternalOCCI.g:4007:1: ( '}' )
            // InternalOCCI.g:4008:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7__2__Impl"


    // $ANTLR start "rule__Attribute__Group_7_1__0"
    // InternalOCCI.g:4018:1: rule__Attribute__Group_7_1__0 : rule__Attribute__Group_7_1__0__Impl rule__Attribute__Group_7_1__1 ;
    public final void rule__Attribute__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4022:1: ( rule__Attribute__Group_7_1__0__Impl rule__Attribute__Group_7_1__1 )
            // InternalOCCI.g:4023:2: rule__Attribute__Group_7_1__0__Impl rule__Attribute__Group_7_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7_1__0"


    // $ANTLR start "rule__Attribute__Group_7_1__0__Impl"
    // InternalOCCI.g:4030:1: rule__Attribute__Group_7_1__0__Impl : ( 'description' ) ;
    public final void rule__Attribute__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4034:1: ( ( 'description' ) )
            // InternalOCCI.g:4035:1: ( 'description' )
            {
            // InternalOCCI.g:4035:1: ( 'description' )
            // InternalOCCI.g:4036:2: 'description'
            {
             before(grammarAccess.getAttributeAccess().getDescriptionKeyword_7_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDescriptionKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_7_1__1"
    // InternalOCCI.g:4045:1: rule__Attribute__Group_7_1__1 : rule__Attribute__Group_7_1__1__Impl ;
    public final void rule__Attribute__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4049:1: ( rule__Attribute__Group_7_1__1__Impl )
            // InternalOCCI.g:4050:2: rule__Attribute__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7_1__1"


    // $ANTLR start "rule__Attribute__Group_7_1__1__Impl"
    // InternalOCCI.g:4056:1: rule__Attribute__Group_7_1__1__Impl : ( ( rule__Attribute__DescriptionAssignment_7_1_1 ) ) ;
    public final void rule__Attribute__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4060:1: ( ( ( rule__Attribute__DescriptionAssignment_7_1_1 ) ) )
            // InternalOCCI.g:4061:1: ( ( rule__Attribute__DescriptionAssignment_7_1_1 ) )
            {
            // InternalOCCI.g:4061:1: ( ( rule__Attribute__DescriptionAssignment_7_1_1 ) )
            // InternalOCCI.g:4062:2: ( rule__Attribute__DescriptionAssignment_7_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getDescriptionAssignment_7_1_1()); 
            // InternalOCCI.g:4063:2: ( rule__Attribute__DescriptionAssignment_7_1_1 )
            // InternalOCCI.g:4063:3: rule__Attribute__DescriptionAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DescriptionAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDescriptionAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_7_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_8__0"
    // InternalOCCI.g:4072:1: rule__Attribute__Group_8__0 : rule__Attribute__Group_8__0__Impl rule__Attribute__Group_8__1 ;
    public final void rule__Attribute__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4076:1: ( rule__Attribute__Group_8__0__Impl rule__Attribute__Group_8__1 )
            // InternalOCCI.g:4077:2: rule__Attribute__Group_8__0__Impl rule__Attribute__Group_8__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalOCCI.g:4084:1: rule__Attribute__Group_8__0__Impl : ( 'annotations' ) ;
    public final void rule__Attribute__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4088:1: ( ( 'annotations' ) )
            // InternalOCCI.g:4089:1: ( 'annotations' )
            {
            // InternalOCCI.g:4089:1: ( 'annotations' )
            // InternalOCCI.g:4090:2: 'annotations'
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
    // InternalOCCI.g:4099:1: rule__Attribute__Group_8__1 : rule__Attribute__Group_8__1__Impl rule__Attribute__Group_8__2 ;
    public final void rule__Attribute__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4103:1: ( rule__Attribute__Group_8__1__Impl rule__Attribute__Group_8__2 )
            // InternalOCCI.g:4104:2: rule__Attribute__Group_8__1__Impl rule__Attribute__Group_8__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalOCCI.g:4111:1: rule__Attribute__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4115:1: ( ( '{' ) )
            // InternalOCCI.g:4116:1: ( '{' )
            {
            // InternalOCCI.g:4116:1: ( '{' )
            // InternalOCCI.g:4117:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalOCCI.g:4126:1: rule__Attribute__Group_8__2 : rule__Attribute__Group_8__2__Impl rule__Attribute__Group_8__3 ;
    public final void rule__Attribute__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4130:1: ( rule__Attribute__Group_8__2__Impl rule__Attribute__Group_8__3 )
            // InternalOCCI.g:4131:2: rule__Attribute__Group_8__2__Impl rule__Attribute__Group_8__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalOCCI.g:4138:1: rule__Attribute__Group_8__2__Impl : ( ( rule__Attribute__AnnotationsAssignment_8_2 ) ) ;
    public final void rule__Attribute__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4142:1: ( ( ( rule__Attribute__AnnotationsAssignment_8_2 ) ) )
            // InternalOCCI.g:4143:1: ( ( rule__Attribute__AnnotationsAssignment_8_2 ) )
            {
            // InternalOCCI.g:4143:1: ( ( rule__Attribute__AnnotationsAssignment_8_2 ) )
            // InternalOCCI.g:4144:2: ( rule__Attribute__AnnotationsAssignment_8_2 )
            {
             before(grammarAccess.getAttributeAccess().getAnnotationsAssignment_8_2()); 
            // InternalOCCI.g:4145:2: ( rule__Attribute__AnnotationsAssignment_8_2 )
            // InternalOCCI.g:4145:3: rule__Attribute__AnnotationsAssignment_8_2
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
    // InternalOCCI.g:4153:1: rule__Attribute__Group_8__3 : rule__Attribute__Group_8__3__Impl rule__Attribute__Group_8__4 ;
    public final void rule__Attribute__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4157:1: ( rule__Attribute__Group_8__3__Impl rule__Attribute__Group_8__4 )
            // InternalOCCI.g:4158:2: rule__Attribute__Group_8__3__Impl rule__Attribute__Group_8__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalOCCI.g:4165:1: rule__Attribute__Group_8__3__Impl : ( ( rule__Attribute__Group_8_3__0 )* ) ;
    public final void rule__Attribute__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4169:1: ( ( ( rule__Attribute__Group_8_3__0 )* ) )
            // InternalOCCI.g:4170:1: ( ( rule__Attribute__Group_8_3__0 )* )
            {
            // InternalOCCI.g:4170:1: ( ( rule__Attribute__Group_8_3__0 )* )
            // InternalOCCI.g:4171:2: ( rule__Attribute__Group_8_3__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_8_3()); 
            // InternalOCCI.g:4172:2: ( rule__Attribute__Group_8_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==69) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalOCCI.g:4172:3: rule__Attribute__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Attribute__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalOCCI.g:4180:1: rule__Attribute__Group_8__4 : rule__Attribute__Group_8__4__Impl ;
    public final void rule__Attribute__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4184:1: ( rule__Attribute__Group_8__4__Impl )
            // InternalOCCI.g:4185:2: rule__Attribute__Group_8__4__Impl
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
    // InternalOCCI.g:4191:1: rule__Attribute__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4195:1: ( ( '}' ) )
            // InternalOCCI.g:4196:1: ( '}' )
            {
            // InternalOCCI.g:4196:1: ( '}' )
            // InternalOCCI.g:4197:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalOCCI.g:4207:1: rule__Attribute__Group_8_3__0 : rule__Attribute__Group_8_3__0__Impl rule__Attribute__Group_8_3__1 ;
    public final void rule__Attribute__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4211:1: ( rule__Attribute__Group_8_3__0__Impl rule__Attribute__Group_8_3__1 )
            // InternalOCCI.g:4212:2: rule__Attribute__Group_8_3__0__Impl rule__Attribute__Group_8_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalOCCI.g:4219:1: rule__Attribute__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4223:1: ( ( ',' ) )
            // InternalOCCI.g:4224:1: ( ',' )
            {
            // InternalOCCI.g:4224:1: ( ',' )
            // InternalOCCI.g:4225:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_8_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalOCCI.g:4234:1: rule__Attribute__Group_8_3__1 : rule__Attribute__Group_8_3__1__Impl ;
    public final void rule__Attribute__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4238:1: ( rule__Attribute__Group_8_3__1__Impl )
            // InternalOCCI.g:4239:2: rule__Attribute__Group_8_3__1__Impl
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
    // InternalOCCI.g:4245:1: rule__Attribute__Group_8_3__1__Impl : ( ( rule__Attribute__AnnotationsAssignment_8_3_1 ) ) ;
    public final void rule__Attribute__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4249:1: ( ( ( rule__Attribute__AnnotationsAssignment_8_3_1 ) ) )
            // InternalOCCI.g:4250:1: ( ( rule__Attribute__AnnotationsAssignment_8_3_1 ) )
            {
            // InternalOCCI.g:4250:1: ( ( rule__Attribute__AnnotationsAssignment_8_3_1 ) )
            // InternalOCCI.g:4251:2: ( rule__Attribute__AnnotationsAssignment_8_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getAnnotationsAssignment_8_3_1()); 
            // InternalOCCI.g:4252:2: ( rule__Attribute__AnnotationsAssignment_8_3_1 )
            // InternalOCCI.g:4252:3: rule__Attribute__AnnotationsAssignment_8_3_1
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
    // InternalOCCI.g:4261:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4265:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalOCCI.g:4266:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalOCCI.g:4273:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4277:1: ( ( 'action' ) )
            // InternalOCCI.g:4278:1: ( 'action' )
            {
            // InternalOCCI.g:4278:1: ( 'action' )
            // InternalOCCI.g:4279:2: 'action'
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
    // InternalOCCI.g:4288:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4292:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalOCCI.g:4293:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalOCCI.g:4300:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4304:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // InternalOCCI.g:4305:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // InternalOCCI.g:4305:1: ( ( rule__Action__NameAssignment_1 ) )
            // InternalOCCI.g:4306:2: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // InternalOCCI.g:4307:2: ( rule__Action__NameAssignment_1 )
            // InternalOCCI.g:4307:3: rule__Action__NameAssignment_1
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
    // InternalOCCI.g:4315:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4319:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalOCCI.g:4320:2: rule__Action__Group__2__Impl rule__Action__Group__3
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
    // InternalOCCI.g:4327:1: rule__Action__Group__2__Impl : ( 'scheme' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4331:1: ( ( 'scheme' ) )
            // InternalOCCI.g:4332:1: ( 'scheme' )
            {
            // InternalOCCI.g:4332:1: ( 'scheme' )
            // InternalOCCI.g:4333:2: 'scheme'
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
    // InternalOCCI.g:4342:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4346:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalOCCI.g:4347:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalOCCI.g:4354:1: rule__Action__Group__3__Impl : ( ( rule__Action__SchemeAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4358:1: ( ( ( rule__Action__SchemeAssignment_3 ) ) )
            // InternalOCCI.g:4359:1: ( ( rule__Action__SchemeAssignment_3 ) )
            {
            // InternalOCCI.g:4359:1: ( ( rule__Action__SchemeAssignment_3 ) )
            // InternalOCCI.g:4360:2: ( rule__Action__SchemeAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getSchemeAssignment_3()); 
            // InternalOCCI.g:4361:2: ( rule__Action__SchemeAssignment_3 )
            // InternalOCCI.g:4361:3: rule__Action__SchemeAssignment_3
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
    // InternalOCCI.g:4369:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4373:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalOCCI.g:4374:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalOCCI.g:4381:1: rule__Action__Group__4__Impl : ( ( rule__Action__Group_4__0 )? ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4385:1: ( ( ( rule__Action__Group_4__0 )? ) )
            // InternalOCCI.g:4386:1: ( ( rule__Action__Group_4__0 )? )
            {
            // InternalOCCI.g:4386:1: ( ( rule__Action__Group_4__0 )? )
            // InternalOCCI.g:4387:2: ( rule__Action__Group_4__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_4()); 
            // InternalOCCI.g:4388:2: ( rule__Action__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==70) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOCCI.g:4388:3: rule__Action__Group_4__0
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
    // InternalOCCI.g:4396:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4400:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalOCCI.g:4401:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalOCCI.g:4408:1: rule__Action__Group__5__Impl : ( ( rule__Action__Group_5__0 )? ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4412:1: ( ( ( rule__Action__Group_5__0 )? ) )
            // InternalOCCI.g:4413:1: ( ( rule__Action__Group_5__0 )? )
            {
            // InternalOCCI.g:4413:1: ( ( rule__Action__Group_5__0 )? )
            // InternalOCCI.g:4414:2: ( rule__Action__Group_5__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_5()); 
            // InternalOCCI.g:4415:2: ( rule__Action__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==67) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOCCI.g:4415:3: rule__Action__Group_5__0
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
    // InternalOCCI.g:4423:1: rule__Action__Group__6 : rule__Action__Group__6__Impl ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4427:1: ( rule__Action__Group__6__Impl )
            // InternalOCCI.g:4428:2: rule__Action__Group__6__Impl
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
    // InternalOCCI.g:4434:1: rule__Action__Group__6__Impl : ( ( rule__Action__Group_6__0 )? ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4438:1: ( ( ( rule__Action__Group_6__0 )? ) )
            // InternalOCCI.g:4439:1: ( ( rule__Action__Group_6__0 )? )
            {
            // InternalOCCI.g:4439:1: ( ( rule__Action__Group_6__0 )? )
            // InternalOCCI.g:4440:2: ( rule__Action__Group_6__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_6()); 
            // InternalOCCI.g:4441:2: ( rule__Action__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOCCI.g:4441:3: rule__Action__Group_6__0
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
    // InternalOCCI.g:4450:1: rule__Action__Group_4__0 : rule__Action__Group_4__0__Impl rule__Action__Group_4__1 ;
    public final void rule__Action__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4454:1: ( rule__Action__Group_4__0__Impl rule__Action__Group_4__1 )
            // InternalOCCI.g:4455:2: rule__Action__Group_4__0__Impl rule__Action__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:4462:1: rule__Action__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Action__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4466:1: ( ( '(' ) )
            // InternalOCCI.g:4467:1: ( '(' )
            {
            // InternalOCCI.g:4467:1: ( '(' )
            // InternalOCCI.g:4468:2: '('
            {
             before(grammarAccess.getActionAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalOCCI.g:4477:1: rule__Action__Group_4__1 : rule__Action__Group_4__1__Impl rule__Action__Group_4__2 ;
    public final void rule__Action__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4481:1: ( rule__Action__Group_4__1__Impl rule__Action__Group_4__2 )
            // InternalOCCI.g:4482:2: rule__Action__Group_4__1__Impl rule__Action__Group_4__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalOCCI.g:4489:1: rule__Action__Group_4__1__Impl : ( ( rule__Action__AttributesAssignment_4_1 ) ) ;
    public final void rule__Action__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4493:1: ( ( ( rule__Action__AttributesAssignment_4_1 ) ) )
            // InternalOCCI.g:4494:1: ( ( rule__Action__AttributesAssignment_4_1 ) )
            {
            // InternalOCCI.g:4494:1: ( ( rule__Action__AttributesAssignment_4_1 ) )
            // InternalOCCI.g:4495:2: ( rule__Action__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getActionAccess().getAttributesAssignment_4_1()); 
            // InternalOCCI.g:4496:2: ( rule__Action__AttributesAssignment_4_1 )
            // InternalOCCI.g:4496:3: rule__Action__AttributesAssignment_4_1
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
    // InternalOCCI.g:4504:1: rule__Action__Group_4__2 : rule__Action__Group_4__2__Impl rule__Action__Group_4__3 ;
    public final void rule__Action__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4508:1: ( rule__Action__Group_4__2__Impl rule__Action__Group_4__3 )
            // InternalOCCI.g:4509:2: rule__Action__Group_4__2__Impl rule__Action__Group_4__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalOCCI.g:4516:1: rule__Action__Group_4__2__Impl : ( ( rule__Action__Group_4_2__0 )* ) ;
    public final void rule__Action__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4520:1: ( ( ( rule__Action__Group_4_2__0 )* ) )
            // InternalOCCI.g:4521:1: ( ( rule__Action__Group_4_2__0 )* )
            {
            // InternalOCCI.g:4521:1: ( ( rule__Action__Group_4_2__0 )* )
            // InternalOCCI.g:4522:2: ( rule__Action__Group_4_2__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_4_2()); 
            // InternalOCCI.g:4523:2: ( rule__Action__Group_4_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==69) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalOCCI.g:4523:3: rule__Action__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Action__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalOCCI.g:4531:1: rule__Action__Group_4__3 : rule__Action__Group_4__3__Impl ;
    public final void rule__Action__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4535:1: ( rule__Action__Group_4__3__Impl )
            // InternalOCCI.g:4536:2: rule__Action__Group_4__3__Impl
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
    // InternalOCCI.g:4542:1: rule__Action__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Action__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4546:1: ( ( ')' ) )
            // InternalOCCI.g:4547:1: ( ')' )
            {
            // InternalOCCI.g:4547:1: ( ')' )
            // InternalOCCI.g:4548:2: ')'
            {
             before(grammarAccess.getActionAccess().getRightParenthesisKeyword_4_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalOCCI.g:4558:1: rule__Action__Group_4_2__0 : rule__Action__Group_4_2__0__Impl rule__Action__Group_4_2__1 ;
    public final void rule__Action__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4562:1: ( rule__Action__Group_4_2__0__Impl rule__Action__Group_4_2__1 )
            // InternalOCCI.g:4563:2: rule__Action__Group_4_2__0__Impl rule__Action__Group_4_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:4570:1: rule__Action__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Action__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4574:1: ( ( ',' ) )
            // InternalOCCI.g:4575:1: ( ',' )
            {
            // InternalOCCI.g:4575:1: ( ',' )
            // InternalOCCI.g:4576:2: ','
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_4_2_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalOCCI.g:4585:1: rule__Action__Group_4_2__1 : rule__Action__Group_4_2__1__Impl ;
    public final void rule__Action__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4589:1: ( rule__Action__Group_4_2__1__Impl )
            // InternalOCCI.g:4590:2: rule__Action__Group_4_2__1__Impl
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
    // InternalOCCI.g:4596:1: rule__Action__Group_4_2__1__Impl : ( ( rule__Action__AttributesAssignment_4_2_1 ) ) ;
    public final void rule__Action__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4600:1: ( ( ( rule__Action__AttributesAssignment_4_2_1 ) ) )
            // InternalOCCI.g:4601:1: ( ( rule__Action__AttributesAssignment_4_2_1 ) )
            {
            // InternalOCCI.g:4601:1: ( ( rule__Action__AttributesAssignment_4_2_1 ) )
            // InternalOCCI.g:4602:2: ( rule__Action__AttributesAssignment_4_2_1 )
            {
             before(grammarAccess.getActionAccess().getAttributesAssignment_4_2_1()); 
            // InternalOCCI.g:4603:2: ( rule__Action__AttributesAssignment_4_2_1 )
            // InternalOCCI.g:4603:3: rule__Action__AttributesAssignment_4_2_1
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
    // InternalOCCI.g:4612:1: rule__Action__Group_5__0 : rule__Action__Group_5__0__Impl rule__Action__Group_5__1 ;
    public final void rule__Action__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4616:1: ( rule__Action__Group_5__0__Impl rule__Action__Group_5__1 )
            // InternalOCCI.g:4617:2: rule__Action__Group_5__0__Impl rule__Action__Group_5__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalOCCI.g:4624:1: rule__Action__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Action__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4628:1: ( ( '{' ) )
            // InternalOCCI.g:4629:1: ( '{' )
            {
            // InternalOCCI.g:4629:1: ( '{' )
            // InternalOCCI.g:4630:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalOCCI.g:4639:1: rule__Action__Group_5__1 : rule__Action__Group_5__1__Impl rule__Action__Group_5__2 ;
    public final void rule__Action__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4643:1: ( rule__Action__Group_5__1__Impl rule__Action__Group_5__2 )
            // InternalOCCI.g:4644:2: rule__Action__Group_5__1__Impl rule__Action__Group_5__2
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
    // InternalOCCI.g:4651:1: rule__Action__Group_5__1__Impl : ( 'title' ) ;
    public final void rule__Action__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4655:1: ( ( 'title' ) )
            // InternalOCCI.g:4656:1: ( 'title' )
            {
            // InternalOCCI.g:4656:1: ( 'title' )
            // InternalOCCI.g:4657:2: 'title'
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
    // InternalOCCI.g:4666:1: rule__Action__Group_5__2 : rule__Action__Group_5__2__Impl rule__Action__Group_5__3 ;
    public final void rule__Action__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4670:1: ( rule__Action__Group_5__2__Impl rule__Action__Group_5__3 )
            // InternalOCCI.g:4671:2: rule__Action__Group_5__2__Impl rule__Action__Group_5__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalOCCI.g:4678:1: rule__Action__Group_5__2__Impl : ( ( rule__Action__TitleAssignment_5_2 ) ) ;
    public final void rule__Action__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4682:1: ( ( ( rule__Action__TitleAssignment_5_2 ) ) )
            // InternalOCCI.g:4683:1: ( ( rule__Action__TitleAssignment_5_2 ) )
            {
            // InternalOCCI.g:4683:1: ( ( rule__Action__TitleAssignment_5_2 ) )
            // InternalOCCI.g:4684:2: ( rule__Action__TitleAssignment_5_2 )
            {
             before(grammarAccess.getActionAccess().getTitleAssignment_5_2()); 
            // InternalOCCI.g:4685:2: ( rule__Action__TitleAssignment_5_2 )
            // InternalOCCI.g:4685:3: rule__Action__TitleAssignment_5_2
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
    // InternalOCCI.g:4693:1: rule__Action__Group_5__3 : rule__Action__Group_5__3__Impl ;
    public final void rule__Action__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4697:1: ( rule__Action__Group_5__3__Impl )
            // InternalOCCI.g:4698:2: rule__Action__Group_5__3__Impl
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
    // InternalOCCI.g:4704:1: rule__Action__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Action__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4708:1: ( ( '}' ) )
            // InternalOCCI.g:4709:1: ( '}' )
            {
            // InternalOCCI.g:4709:1: ( '}' )
            // InternalOCCI.g:4710:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,68,FOLLOW_2); 
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
    // InternalOCCI.g:4720:1: rule__Action__Group_6__0 : rule__Action__Group_6__0__Impl rule__Action__Group_6__1 ;
    public final void rule__Action__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4724:1: ( rule__Action__Group_6__0__Impl rule__Action__Group_6__1 )
            // InternalOCCI.g:4725:2: rule__Action__Group_6__0__Impl rule__Action__Group_6__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalOCCI.g:4732:1: rule__Action__Group_6__0__Impl : ( 'annotations' ) ;
    public final void rule__Action__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4736:1: ( ( 'annotations' ) )
            // InternalOCCI.g:4737:1: ( 'annotations' )
            {
            // InternalOCCI.g:4737:1: ( 'annotations' )
            // InternalOCCI.g:4738:2: 'annotations'
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
    // InternalOCCI.g:4747:1: rule__Action__Group_6__1 : rule__Action__Group_6__1__Impl rule__Action__Group_6__2 ;
    public final void rule__Action__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4751:1: ( rule__Action__Group_6__1__Impl rule__Action__Group_6__2 )
            // InternalOCCI.g:4752:2: rule__Action__Group_6__1__Impl rule__Action__Group_6__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalOCCI.g:4759:1: rule__Action__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Action__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4763:1: ( ( '{' ) )
            // InternalOCCI.g:4764:1: ( '{' )
            {
            // InternalOCCI.g:4764:1: ( '{' )
            // InternalOCCI.g:4765:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalOCCI.g:4774:1: rule__Action__Group_6__2 : rule__Action__Group_6__2__Impl rule__Action__Group_6__3 ;
    public final void rule__Action__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4778:1: ( rule__Action__Group_6__2__Impl rule__Action__Group_6__3 )
            // InternalOCCI.g:4779:2: rule__Action__Group_6__2__Impl rule__Action__Group_6__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalOCCI.g:4786:1: rule__Action__Group_6__2__Impl : ( ( rule__Action__AnnotationsAssignment_6_2 ) ) ;
    public final void rule__Action__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4790:1: ( ( ( rule__Action__AnnotationsAssignment_6_2 ) ) )
            // InternalOCCI.g:4791:1: ( ( rule__Action__AnnotationsAssignment_6_2 ) )
            {
            // InternalOCCI.g:4791:1: ( ( rule__Action__AnnotationsAssignment_6_2 ) )
            // InternalOCCI.g:4792:2: ( rule__Action__AnnotationsAssignment_6_2 )
            {
             before(grammarAccess.getActionAccess().getAnnotationsAssignment_6_2()); 
            // InternalOCCI.g:4793:2: ( rule__Action__AnnotationsAssignment_6_2 )
            // InternalOCCI.g:4793:3: rule__Action__AnnotationsAssignment_6_2
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
    // InternalOCCI.g:4801:1: rule__Action__Group_6__3 : rule__Action__Group_6__3__Impl rule__Action__Group_6__4 ;
    public final void rule__Action__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4805:1: ( rule__Action__Group_6__3__Impl rule__Action__Group_6__4 )
            // InternalOCCI.g:4806:2: rule__Action__Group_6__3__Impl rule__Action__Group_6__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalOCCI.g:4813:1: rule__Action__Group_6__3__Impl : ( ( rule__Action__Group_6_3__0 )* ) ;
    public final void rule__Action__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4817:1: ( ( ( rule__Action__Group_6_3__0 )* ) )
            // InternalOCCI.g:4818:1: ( ( rule__Action__Group_6_3__0 )* )
            {
            // InternalOCCI.g:4818:1: ( ( rule__Action__Group_6_3__0 )* )
            // InternalOCCI.g:4819:2: ( rule__Action__Group_6_3__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_6_3()); 
            // InternalOCCI.g:4820:2: ( rule__Action__Group_6_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==69) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalOCCI.g:4820:3: rule__Action__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Action__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalOCCI.g:4828:1: rule__Action__Group_6__4 : rule__Action__Group_6__4__Impl ;
    public final void rule__Action__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4832:1: ( rule__Action__Group_6__4__Impl )
            // InternalOCCI.g:4833:2: rule__Action__Group_6__4__Impl
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
    // InternalOCCI.g:4839:1: rule__Action__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Action__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4843:1: ( ( '}' ) )
            // InternalOCCI.g:4844:1: ( '}' )
            {
            // InternalOCCI.g:4844:1: ( '}' )
            // InternalOCCI.g:4845:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalOCCI.g:4855:1: rule__Action__Group_6_3__0 : rule__Action__Group_6_3__0__Impl rule__Action__Group_6_3__1 ;
    public final void rule__Action__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4859:1: ( rule__Action__Group_6_3__0__Impl rule__Action__Group_6_3__1 )
            // InternalOCCI.g:4860:2: rule__Action__Group_6_3__0__Impl rule__Action__Group_6_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalOCCI.g:4867:1: rule__Action__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Action__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4871:1: ( ( ',' ) )
            // InternalOCCI.g:4872:1: ( ',' )
            {
            // InternalOCCI.g:4872:1: ( ',' )
            // InternalOCCI.g:4873:2: ','
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_6_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalOCCI.g:4882:1: rule__Action__Group_6_3__1 : rule__Action__Group_6_3__1__Impl ;
    public final void rule__Action__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4886:1: ( rule__Action__Group_6_3__1__Impl )
            // InternalOCCI.g:4887:2: rule__Action__Group_6_3__1__Impl
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
    // InternalOCCI.g:4893:1: rule__Action__Group_6_3__1__Impl : ( ( rule__Action__AnnotationsAssignment_6_3_1 ) ) ;
    public final void rule__Action__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4897:1: ( ( ( rule__Action__AnnotationsAssignment_6_3_1 ) ) )
            // InternalOCCI.g:4898:1: ( ( rule__Action__AnnotationsAssignment_6_3_1 ) )
            {
            // InternalOCCI.g:4898:1: ( ( rule__Action__AnnotationsAssignment_6_3_1 ) )
            // InternalOCCI.g:4899:2: ( rule__Action__AnnotationsAssignment_6_3_1 )
            {
             before(grammarAccess.getActionAccess().getAnnotationsAssignment_6_3_1()); 
            // InternalOCCI.g:4900:2: ( rule__Action__AnnotationsAssignment_6_3_1 )
            // InternalOCCI.g:4900:3: rule__Action__AnnotationsAssignment_6_3_1
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
    // InternalOCCI.g:4909:1: rule__ParameterDecl__Group__0 : rule__ParameterDecl__Group__0__Impl rule__ParameterDecl__Group__1 ;
    public final void rule__ParameterDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4913:1: ( rule__ParameterDecl__Group__0__Impl rule__ParameterDecl__Group__1 )
            // InternalOCCI.g:4914:2: rule__ParameterDecl__Group__0__Impl rule__ParameterDecl__Group__1
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
    // InternalOCCI.g:4921:1: rule__ParameterDecl__Group__0__Impl : ( ( rule__ParameterDecl__NameAssignment_0 ) ) ;
    public final void rule__ParameterDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4925:1: ( ( ( rule__ParameterDecl__NameAssignment_0 ) ) )
            // InternalOCCI.g:4926:1: ( ( rule__ParameterDecl__NameAssignment_0 ) )
            {
            // InternalOCCI.g:4926:1: ( ( rule__ParameterDecl__NameAssignment_0 ) )
            // InternalOCCI.g:4927:2: ( rule__ParameterDecl__NameAssignment_0 )
            {
             before(grammarAccess.getParameterDeclAccess().getNameAssignment_0()); 
            // InternalOCCI.g:4928:2: ( rule__ParameterDecl__NameAssignment_0 )
            // InternalOCCI.g:4928:3: rule__ParameterDecl__NameAssignment_0
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
    // InternalOCCI.g:4936:1: rule__ParameterDecl__Group__1 : rule__ParameterDecl__Group__1__Impl rule__ParameterDecl__Group__2 ;
    public final void rule__ParameterDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4940:1: ( rule__ParameterDecl__Group__1__Impl rule__ParameterDecl__Group__2 )
            // InternalOCCI.g:4941:2: rule__ParameterDecl__Group__1__Impl rule__ParameterDecl__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:4948:1: rule__ParameterDecl__Group__1__Impl : ( ':' ) ;
    public final void rule__ParameterDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4952:1: ( ( ':' ) )
            // InternalOCCI.g:4953:1: ( ':' )
            {
            // InternalOCCI.g:4953:1: ( ':' )
            // InternalOCCI.g:4954:2: ':'
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
    // InternalOCCI.g:4963:1: rule__ParameterDecl__Group__2 : rule__ParameterDecl__Group__2__Impl rule__ParameterDecl__Group__3 ;
    public final void rule__ParameterDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4967:1: ( rule__ParameterDecl__Group__2__Impl rule__ParameterDecl__Group__3 )
            // InternalOCCI.g:4968:2: rule__ParameterDecl__Group__2__Impl rule__ParameterDecl__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalOCCI.g:4975:1: rule__ParameterDecl__Group__2__Impl : ( ( rule__ParameterDecl__TypeAssignment_2 ) ) ;
    public final void rule__ParameterDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4979:1: ( ( ( rule__ParameterDecl__TypeAssignment_2 ) ) )
            // InternalOCCI.g:4980:1: ( ( rule__ParameterDecl__TypeAssignment_2 ) )
            {
            // InternalOCCI.g:4980:1: ( ( rule__ParameterDecl__TypeAssignment_2 ) )
            // InternalOCCI.g:4981:2: ( rule__ParameterDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterDeclAccess().getTypeAssignment_2()); 
            // InternalOCCI.g:4982:2: ( rule__ParameterDecl__TypeAssignment_2 )
            // InternalOCCI.g:4982:3: rule__ParameterDecl__TypeAssignment_2
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
    // InternalOCCI.g:4990:1: rule__ParameterDecl__Group__3 : rule__ParameterDecl__Group__3__Impl ;
    public final void rule__ParameterDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:4994:1: ( rule__ParameterDecl__Group__3__Impl )
            // InternalOCCI.g:4995:2: rule__ParameterDecl__Group__3__Impl
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
    // InternalOCCI.g:5001:1: rule__ParameterDecl__Group__3__Impl : ( ( rule__ParameterDecl__Group_3__0 )? ) ;
    public final void rule__ParameterDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5005:1: ( ( ( rule__ParameterDecl__Group_3__0 )? ) )
            // InternalOCCI.g:5006:1: ( ( rule__ParameterDecl__Group_3__0 )? )
            {
            // InternalOCCI.g:5006:1: ( ( rule__ParameterDecl__Group_3__0 )? )
            // InternalOCCI.g:5007:2: ( rule__ParameterDecl__Group_3__0 )?
            {
             before(grammarAccess.getParameterDeclAccess().getGroup_3()); 
            // InternalOCCI.g:5008:2: ( rule__ParameterDecl__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==72) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOCCI.g:5008:3: rule__ParameterDecl__Group_3__0
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
    // InternalOCCI.g:5017:1: rule__ParameterDecl__Group_3__0 : rule__ParameterDecl__Group_3__0__Impl rule__ParameterDecl__Group_3__1 ;
    public final void rule__ParameterDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5021:1: ( rule__ParameterDecl__Group_3__0__Impl rule__ParameterDecl__Group_3__1 )
            // InternalOCCI.g:5022:2: rule__ParameterDecl__Group_3__0__Impl rule__ParameterDecl__Group_3__1
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
    // InternalOCCI.g:5029:1: rule__ParameterDecl__Group_3__0__Impl : ( '=' ) ;
    public final void rule__ParameterDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5033:1: ( ( '=' ) )
            // InternalOCCI.g:5034:1: ( '=' )
            {
            // InternalOCCI.g:5034:1: ( '=' )
            // InternalOCCI.g:5035:2: '='
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
    // InternalOCCI.g:5044:1: rule__ParameterDecl__Group_3__1 : rule__ParameterDecl__Group_3__1__Impl ;
    public final void rule__ParameterDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5048:1: ( rule__ParameterDecl__Group_3__1__Impl )
            // InternalOCCI.g:5049:2: rule__ParameterDecl__Group_3__1__Impl
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
    // InternalOCCI.g:5055:1: rule__ParameterDecl__Group_3__1__Impl : ( ( rule__ParameterDecl__DefaultAssignment_3_1 ) ) ;
    public final void rule__ParameterDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5059:1: ( ( ( rule__ParameterDecl__DefaultAssignment_3_1 ) ) )
            // InternalOCCI.g:5060:1: ( ( rule__ParameterDecl__DefaultAssignment_3_1 ) )
            {
            // InternalOCCI.g:5060:1: ( ( rule__ParameterDecl__DefaultAssignment_3_1 ) )
            // InternalOCCI.g:5061:2: ( rule__ParameterDecl__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getParameterDeclAccess().getDefaultAssignment_3_1()); 
            // InternalOCCI.g:5062:2: ( rule__ParameterDecl__DefaultAssignment_3_1 )
            // InternalOCCI.g:5062:3: rule__ParameterDecl__DefaultAssignment_3_1
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
    // InternalOCCI.g:5071:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5075:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalOCCI.g:5076:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalOCCI.g:5083:1: rule__Constraint__Group__0__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5087:1: ( ( 'constraint' ) )
            // InternalOCCI.g:5088:1: ( 'constraint' )
            {
            // InternalOCCI.g:5088:1: ( 'constraint' )
            // InternalOCCI.g:5089:2: 'constraint'
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
    // InternalOCCI.g:5098:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5102:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalOCCI.g:5103:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalOCCI.g:5110:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5114:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalOCCI.g:5115:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalOCCI.g:5115:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalOCCI.g:5116:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalOCCI.g:5117:2: ( rule__Constraint__NameAssignment_1 )
            // InternalOCCI.g:5117:3: rule__Constraint__NameAssignment_1
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
    // InternalOCCI.g:5125:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5129:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalOCCI.g:5130:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalOCCI.g:5137:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__Group_2__0 )? ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5141:1: ( ( ( rule__Constraint__Group_2__0 )? ) )
            // InternalOCCI.g:5142:1: ( ( rule__Constraint__Group_2__0 )? )
            {
            // InternalOCCI.g:5142:1: ( ( rule__Constraint__Group_2__0 )? )
            // InternalOCCI.g:5143:2: ( rule__Constraint__Group_2__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_2()); 
            // InternalOCCI.g:5144:2: ( rule__Constraint__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==14) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOCCI.g:5144:3: rule__Constraint__Group_2__0
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
    // InternalOCCI.g:5152:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5156:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalOCCI.g:5157:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
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
    // InternalOCCI.g:5164:1: rule__Constraint__Group__3__Impl : ( 'body' ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5168:1: ( ( 'body' ) )
            // InternalOCCI.g:5169:1: ( 'body' )
            {
            // InternalOCCI.g:5169:1: ( 'body' )
            // InternalOCCI.g:5170:2: 'body'
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
    // InternalOCCI.g:5179:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5183:1: ( rule__Constraint__Group__4__Impl )
            // InternalOCCI.g:5184:2: rule__Constraint__Group__4__Impl
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
    // InternalOCCI.g:5190:1: rule__Constraint__Group__4__Impl : ( ( rule__Constraint__BodyAssignment_4 ) ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5194:1: ( ( ( rule__Constraint__BodyAssignment_4 ) ) )
            // InternalOCCI.g:5195:1: ( ( rule__Constraint__BodyAssignment_4 ) )
            {
            // InternalOCCI.g:5195:1: ( ( rule__Constraint__BodyAssignment_4 ) )
            // InternalOCCI.g:5196:2: ( rule__Constraint__BodyAssignment_4 )
            {
             before(grammarAccess.getConstraintAccess().getBodyAssignment_4()); 
            // InternalOCCI.g:5197:2: ( rule__Constraint__BodyAssignment_4 )
            // InternalOCCI.g:5197:3: rule__Constraint__BodyAssignment_4
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
    // InternalOCCI.g:5206:1: rule__Constraint__Group_2__0 : rule__Constraint__Group_2__0__Impl rule__Constraint__Group_2__1 ;
    public final void rule__Constraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5210:1: ( rule__Constraint__Group_2__0__Impl rule__Constraint__Group_2__1 )
            // InternalOCCI.g:5211:2: rule__Constraint__Group_2__0__Impl rule__Constraint__Group_2__1
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
    // InternalOCCI.g:5218:1: rule__Constraint__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__Constraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5222:1: ( ( 'description' ) )
            // InternalOCCI.g:5223:1: ( 'description' )
            {
            // InternalOCCI.g:5223:1: ( 'description' )
            // InternalOCCI.g:5224:2: 'description'
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
    // InternalOCCI.g:5233:1: rule__Constraint__Group_2__1 : rule__Constraint__Group_2__1__Impl ;
    public final void rule__Constraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5237:1: ( rule__Constraint__Group_2__1__Impl )
            // InternalOCCI.g:5238:2: rule__Constraint__Group_2__1__Impl
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
    // InternalOCCI.g:5244:1: rule__Constraint__Group_2__1__Impl : ( ( rule__Constraint__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Constraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5248:1: ( ( ( rule__Constraint__DescriptionAssignment_2_1 ) ) )
            // InternalOCCI.g:5249:1: ( ( rule__Constraint__DescriptionAssignment_2_1 ) )
            {
            // InternalOCCI.g:5249:1: ( ( rule__Constraint__DescriptionAssignment_2_1 ) )
            // InternalOCCI.g:5250:2: ( rule__Constraint__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getConstraintAccess().getDescriptionAssignment_2_1()); 
            // InternalOCCI.g:5251:2: ( rule__Constraint__DescriptionAssignment_2_1 )
            // InternalOCCI.g:5251:3: rule__Constraint__DescriptionAssignment_2_1
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
    // InternalOCCI.g:5260:1: rule__FSM__Group__0 : rule__FSM__Group__0__Impl rule__FSM__Group__1 ;
    public final void rule__FSM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5264:1: ( rule__FSM__Group__0__Impl rule__FSM__Group__1 )
            // InternalOCCI.g:5265:2: rule__FSM__Group__0__Impl rule__FSM__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalOCCI.g:5272:1: rule__FSM__Group__0__Impl : ( 'FSM' ) ;
    public final void rule__FSM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5276:1: ( ( 'FSM' ) )
            // InternalOCCI.g:5277:1: ( 'FSM' )
            {
            // InternalOCCI.g:5277:1: ( 'FSM' )
            // InternalOCCI.g:5278:2: 'FSM'
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
    // InternalOCCI.g:5287:1: rule__FSM__Group__1 : rule__FSM__Group__1__Impl rule__FSM__Group__2 ;
    public final void rule__FSM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5291:1: ( rule__FSM__Group__1__Impl rule__FSM__Group__2 )
            // InternalOCCI.g:5292:2: rule__FSM__Group__1__Impl rule__FSM__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalOCCI.g:5299:1: rule__FSM__Group__1__Impl : ( '{' ) ;
    public final void rule__FSM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5303:1: ( ( '{' ) )
            // InternalOCCI.g:5304:1: ( '{' )
            {
            // InternalOCCI.g:5304:1: ( '{' )
            // InternalOCCI.g:5305:2: '{'
            {
             before(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalOCCI.g:5314:1: rule__FSM__Group__2 : rule__FSM__Group__2__Impl rule__FSM__Group__3 ;
    public final void rule__FSM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5318:1: ( rule__FSM__Group__2__Impl rule__FSM__Group__3 )
            // InternalOCCI.g:5319:2: rule__FSM__Group__2__Impl rule__FSM__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:5326:1: rule__FSM__Group__2__Impl : ( 'attribute' ) ;
    public final void rule__FSM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5330:1: ( ( 'attribute' ) )
            // InternalOCCI.g:5331:1: ( 'attribute' )
            {
            // InternalOCCI.g:5331:1: ( 'attribute' )
            // InternalOCCI.g:5332:2: 'attribute'
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
    // InternalOCCI.g:5341:1: rule__FSM__Group__3 : rule__FSM__Group__3__Impl rule__FSM__Group__4 ;
    public final void rule__FSM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5345:1: ( rule__FSM__Group__3__Impl rule__FSM__Group__4 )
            // InternalOCCI.g:5346:2: rule__FSM__Group__3__Impl rule__FSM__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalOCCI.g:5353:1: rule__FSM__Group__3__Impl : ( ( rule__FSM__AttributeAssignment_3 ) ) ;
    public final void rule__FSM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5357:1: ( ( ( rule__FSM__AttributeAssignment_3 ) ) )
            // InternalOCCI.g:5358:1: ( ( rule__FSM__AttributeAssignment_3 ) )
            {
            // InternalOCCI.g:5358:1: ( ( rule__FSM__AttributeAssignment_3 ) )
            // InternalOCCI.g:5359:2: ( rule__FSM__AttributeAssignment_3 )
            {
             before(grammarAccess.getFSMAccess().getAttributeAssignment_3()); 
            // InternalOCCI.g:5360:2: ( rule__FSM__AttributeAssignment_3 )
            // InternalOCCI.g:5360:3: rule__FSM__AttributeAssignment_3
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
    // InternalOCCI.g:5368:1: rule__FSM__Group__4 : rule__FSM__Group__4__Impl rule__FSM__Group__5 ;
    public final void rule__FSM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5372:1: ( rule__FSM__Group__4__Impl rule__FSM__Group__5 )
            // InternalOCCI.g:5373:2: rule__FSM__Group__4__Impl rule__FSM__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalOCCI.g:5380:1: rule__FSM__Group__4__Impl : ( ( rule__FSM__Group_4__0 )? ) ;
    public final void rule__FSM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5384:1: ( ( ( rule__FSM__Group_4__0 )? ) )
            // InternalOCCI.g:5385:1: ( ( rule__FSM__Group_4__0 )? )
            {
            // InternalOCCI.g:5385:1: ( ( rule__FSM__Group_4__0 )? )
            // InternalOCCI.g:5386:2: ( rule__FSM__Group_4__0 )?
            {
             before(grammarAccess.getFSMAccess().getGroup_4()); 
            // InternalOCCI.g:5387:2: ( rule__FSM__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==74) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOCCI.g:5387:3: rule__FSM__Group_4__0
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
    // InternalOCCI.g:5395:1: rule__FSM__Group__5 : rule__FSM__Group__5__Impl ;
    public final void rule__FSM__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5399:1: ( rule__FSM__Group__5__Impl )
            // InternalOCCI.g:5400:2: rule__FSM__Group__5__Impl
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
    // InternalOCCI.g:5406:1: rule__FSM__Group__5__Impl : ( '}' ) ;
    public final void rule__FSM__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5410:1: ( ( '}' ) )
            // InternalOCCI.g:5411:1: ( '}' )
            {
            // InternalOCCI.g:5411:1: ( '}' )
            // InternalOCCI.g:5412:2: '}'
            {
             before(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_5()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalOCCI.g:5422:1: rule__FSM__Group_4__0 : rule__FSM__Group_4__0__Impl rule__FSM__Group_4__1 ;
    public final void rule__FSM__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5426:1: ( rule__FSM__Group_4__0__Impl rule__FSM__Group_4__1 )
            // InternalOCCI.g:5427:2: rule__FSM__Group_4__0__Impl rule__FSM__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalOCCI.g:5434:1: rule__FSM__Group_4__0__Impl : ( 'states' ) ;
    public final void rule__FSM__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5438:1: ( ( 'states' ) )
            // InternalOCCI.g:5439:1: ( 'states' )
            {
            // InternalOCCI.g:5439:1: ( 'states' )
            // InternalOCCI.g:5440:2: 'states'
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
    // InternalOCCI.g:5449:1: rule__FSM__Group_4__1 : rule__FSM__Group_4__1__Impl rule__FSM__Group_4__2 ;
    public final void rule__FSM__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5453:1: ( rule__FSM__Group_4__1__Impl rule__FSM__Group_4__2 )
            // InternalOCCI.g:5454:2: rule__FSM__Group_4__1__Impl rule__FSM__Group_4__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalOCCI.g:5461:1: rule__FSM__Group_4__1__Impl : ( '{' ) ;
    public final void rule__FSM__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5465:1: ( ( '{' ) )
            // InternalOCCI.g:5466:1: ( '{' )
            {
            // InternalOCCI.g:5466:1: ( '{' )
            // InternalOCCI.g:5467:2: '{'
            {
             before(grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalOCCI.g:5476:1: rule__FSM__Group_4__2 : rule__FSM__Group_4__2__Impl rule__FSM__Group_4__3 ;
    public final void rule__FSM__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5480:1: ( rule__FSM__Group_4__2__Impl rule__FSM__Group_4__3 )
            // InternalOCCI.g:5481:2: rule__FSM__Group_4__2__Impl rule__FSM__Group_4__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalOCCI.g:5488:1: rule__FSM__Group_4__2__Impl : ( ( rule__FSM__OwnedStateAssignment_4_2 ) ) ;
    public final void rule__FSM__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5492:1: ( ( ( rule__FSM__OwnedStateAssignment_4_2 ) ) )
            // InternalOCCI.g:5493:1: ( ( rule__FSM__OwnedStateAssignment_4_2 ) )
            {
            // InternalOCCI.g:5493:1: ( ( rule__FSM__OwnedStateAssignment_4_2 ) )
            // InternalOCCI.g:5494:2: ( rule__FSM__OwnedStateAssignment_4_2 )
            {
             before(grammarAccess.getFSMAccess().getOwnedStateAssignment_4_2()); 
            // InternalOCCI.g:5495:2: ( rule__FSM__OwnedStateAssignment_4_2 )
            // InternalOCCI.g:5495:3: rule__FSM__OwnedStateAssignment_4_2
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
    // InternalOCCI.g:5503:1: rule__FSM__Group_4__3 : rule__FSM__Group_4__3__Impl rule__FSM__Group_4__4 ;
    public final void rule__FSM__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5507:1: ( rule__FSM__Group_4__3__Impl rule__FSM__Group_4__4 )
            // InternalOCCI.g:5508:2: rule__FSM__Group_4__3__Impl rule__FSM__Group_4__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalOCCI.g:5515:1: rule__FSM__Group_4__3__Impl : ( ( rule__FSM__Group_4_3__0 )* ) ;
    public final void rule__FSM__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5519:1: ( ( ( rule__FSM__Group_4_3__0 )* ) )
            // InternalOCCI.g:5520:1: ( ( rule__FSM__Group_4_3__0 )* )
            {
            // InternalOCCI.g:5520:1: ( ( rule__FSM__Group_4_3__0 )* )
            // InternalOCCI.g:5521:2: ( rule__FSM__Group_4_3__0 )*
            {
             before(grammarAccess.getFSMAccess().getGroup_4_3()); 
            // InternalOCCI.g:5522:2: ( rule__FSM__Group_4_3__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==69) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalOCCI.g:5522:3: rule__FSM__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__FSM__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalOCCI.g:5530:1: rule__FSM__Group_4__4 : rule__FSM__Group_4__4__Impl ;
    public final void rule__FSM__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5534:1: ( rule__FSM__Group_4__4__Impl )
            // InternalOCCI.g:5535:2: rule__FSM__Group_4__4__Impl
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
    // InternalOCCI.g:5541:1: rule__FSM__Group_4__4__Impl : ( '}' ) ;
    public final void rule__FSM__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5545:1: ( ( '}' ) )
            // InternalOCCI.g:5546:1: ( '}' )
            {
            // InternalOCCI.g:5546:1: ( '}' )
            // InternalOCCI.g:5547:2: '}'
            {
             before(grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalOCCI.g:5557:1: rule__FSM__Group_4_3__0 : rule__FSM__Group_4_3__0__Impl rule__FSM__Group_4_3__1 ;
    public final void rule__FSM__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5561:1: ( rule__FSM__Group_4_3__0__Impl rule__FSM__Group_4_3__1 )
            // InternalOCCI.g:5562:2: rule__FSM__Group_4_3__0__Impl rule__FSM__Group_4_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalOCCI.g:5569:1: rule__FSM__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__FSM__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5573:1: ( ( ',' ) )
            // InternalOCCI.g:5574:1: ( ',' )
            {
            // InternalOCCI.g:5574:1: ( ',' )
            // InternalOCCI.g:5575:2: ','
            {
             before(grammarAccess.getFSMAccess().getCommaKeyword_4_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalOCCI.g:5584:1: rule__FSM__Group_4_3__1 : rule__FSM__Group_4_3__1__Impl ;
    public final void rule__FSM__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5588:1: ( rule__FSM__Group_4_3__1__Impl )
            // InternalOCCI.g:5589:2: rule__FSM__Group_4_3__1__Impl
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
    // InternalOCCI.g:5595:1: rule__FSM__Group_4_3__1__Impl : ( ( rule__FSM__OwnedStateAssignment_4_3_1 ) ) ;
    public final void rule__FSM__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5599:1: ( ( ( rule__FSM__OwnedStateAssignment_4_3_1 ) ) )
            // InternalOCCI.g:5600:1: ( ( rule__FSM__OwnedStateAssignment_4_3_1 ) )
            {
            // InternalOCCI.g:5600:1: ( ( rule__FSM__OwnedStateAssignment_4_3_1 ) )
            // InternalOCCI.g:5601:2: ( rule__FSM__OwnedStateAssignment_4_3_1 )
            {
             before(grammarAccess.getFSMAccess().getOwnedStateAssignment_4_3_1()); 
            // InternalOCCI.g:5602:2: ( rule__FSM__OwnedStateAssignment_4_3_1 )
            // InternalOCCI.g:5602:3: rule__FSM__OwnedStateAssignment_4_3_1
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
    // InternalOCCI.g:5611:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5615:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalOCCI.g:5616:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalOCCI.g:5623:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5627:1: ( ( 'State' ) )
            // InternalOCCI.g:5628:1: ( 'State' )
            {
            // InternalOCCI.g:5628:1: ( 'State' )
            // InternalOCCI.g:5629:2: 'State'
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
    // InternalOCCI.g:5638:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5642:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalOCCI.g:5643:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalOCCI.g:5650:1: rule__State__Group__1__Impl : ( '{' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5654:1: ( ( '{' ) )
            // InternalOCCI.g:5655:1: ( '{' )
            {
            // InternalOCCI.g:5655:1: ( '{' )
            // InternalOCCI.g:5656:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalOCCI.g:5665:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5669:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalOCCI.g:5670:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalOCCI.g:5677:1: rule__State__Group__2__Impl : ( ( rule__State__InitialAssignment_2 )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5681:1: ( ( ( rule__State__InitialAssignment_2 )? ) )
            // InternalOCCI.g:5682:1: ( ( rule__State__InitialAssignment_2 )? )
            {
            // InternalOCCI.g:5682:1: ( ( rule__State__InitialAssignment_2 )? )
            // InternalOCCI.g:5683:2: ( rule__State__InitialAssignment_2 )?
            {
             before(grammarAccess.getStateAccess().getInitialAssignment_2()); 
            // InternalOCCI.g:5684:2: ( rule__State__InitialAssignment_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==79) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOCCI.g:5684:3: rule__State__InitialAssignment_2
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
    // InternalOCCI.g:5692:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5696:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalOCCI.g:5697:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalOCCI.g:5704:1: rule__State__Group__3__Impl : ( ( rule__State__FinalAssignment_3 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5708:1: ( ( ( rule__State__FinalAssignment_3 )? ) )
            // InternalOCCI.g:5709:1: ( ( rule__State__FinalAssignment_3 )? )
            {
            // InternalOCCI.g:5709:1: ( ( rule__State__FinalAssignment_3 )? )
            // InternalOCCI.g:5710:2: ( rule__State__FinalAssignment_3 )?
            {
             before(grammarAccess.getStateAccess().getFinalAssignment_3()); 
            // InternalOCCI.g:5711:2: ( rule__State__FinalAssignment_3 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==80) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOCCI.g:5711:3: rule__State__FinalAssignment_3
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
    // InternalOCCI.g:5719:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5723:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // InternalOCCI.g:5724:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalOCCI.g:5731:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 ) ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5735:1: ( ( ( rule__State__Group_4__0 ) ) )
            // InternalOCCI.g:5736:1: ( ( rule__State__Group_4__0 ) )
            {
            // InternalOCCI.g:5736:1: ( ( rule__State__Group_4__0 ) )
            // InternalOCCI.g:5737:2: ( rule__State__Group_4__0 )
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // InternalOCCI.g:5738:2: ( rule__State__Group_4__0 )
            // InternalOCCI.g:5738:3: rule__State__Group_4__0
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
    // InternalOCCI.g:5746:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5750:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // InternalOCCI.g:5751:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalOCCI.g:5758:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5762:1: ( ( ( rule__State__Group_5__0 )? ) )
            // InternalOCCI.g:5763:1: ( ( rule__State__Group_5__0 )? )
            {
            // InternalOCCI.g:5763:1: ( ( rule__State__Group_5__0 )? )
            // InternalOCCI.g:5764:2: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // InternalOCCI.g:5765:2: ( rule__State__Group_5__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==77) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOCCI.g:5765:3: rule__State__Group_5__0
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
    // InternalOCCI.g:5773:1: rule__State__Group__6 : rule__State__Group__6__Impl ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5777:1: ( rule__State__Group__6__Impl )
            // InternalOCCI.g:5778:2: rule__State__Group__6__Impl
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
    // InternalOCCI.g:5784:1: rule__State__Group__6__Impl : ( '}' ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5788:1: ( ( '}' ) )
            // InternalOCCI.g:5789:1: ( '}' )
            {
            // InternalOCCI.g:5789:1: ( '}' )
            // InternalOCCI.g:5790:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalOCCI.g:5800:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5804:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // InternalOCCI.g:5805:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:5812:1: rule__State__Group_4__0__Impl : ( 'literal' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5816:1: ( ( 'literal' ) )
            // InternalOCCI.g:5817:1: ( 'literal' )
            {
            // InternalOCCI.g:5817:1: ( 'literal' )
            // InternalOCCI.g:5818:2: 'literal'
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
    // InternalOCCI.g:5827:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5831:1: ( rule__State__Group_4__1__Impl )
            // InternalOCCI.g:5832:2: rule__State__Group_4__1__Impl
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
    // InternalOCCI.g:5838:1: rule__State__Group_4__1__Impl : ( ( rule__State__LiteralAssignment_4_1 ) ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5842:1: ( ( ( rule__State__LiteralAssignment_4_1 ) ) )
            // InternalOCCI.g:5843:1: ( ( rule__State__LiteralAssignment_4_1 ) )
            {
            // InternalOCCI.g:5843:1: ( ( rule__State__LiteralAssignment_4_1 ) )
            // InternalOCCI.g:5844:2: ( rule__State__LiteralAssignment_4_1 )
            {
             before(grammarAccess.getStateAccess().getLiteralAssignment_4_1()); 
            // InternalOCCI.g:5845:2: ( rule__State__LiteralAssignment_4_1 )
            // InternalOCCI.g:5845:3: rule__State__LiteralAssignment_4_1
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
    // InternalOCCI.g:5854:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5858:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // InternalOCCI.g:5859:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:5866:1: rule__State__Group_5__0__Impl : ( 'transitions' ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5870:1: ( ( 'transitions' ) )
            // InternalOCCI.g:5871:1: ( 'transitions' )
            {
            // InternalOCCI.g:5871:1: ( 'transitions' )
            // InternalOCCI.g:5872:2: 'transitions'
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
    // InternalOCCI.g:5881:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl rule__State__Group_5__2 ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5885:1: ( rule__State__Group_5__1__Impl rule__State__Group_5__2 )
            // InternalOCCI.g:5886:2: rule__State__Group_5__1__Impl rule__State__Group_5__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalOCCI.g:5893:1: rule__State__Group_5__1__Impl : ( '(' ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5897:1: ( ( '(' ) )
            // InternalOCCI.g:5898:1: ( '(' )
            {
            // InternalOCCI.g:5898:1: ( '(' )
            // InternalOCCI.g:5899:2: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalOCCI.g:5908:1: rule__State__Group_5__2 : rule__State__Group_5__2__Impl rule__State__Group_5__3 ;
    public final void rule__State__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5912:1: ( rule__State__Group_5__2__Impl rule__State__Group_5__3 )
            // InternalOCCI.g:5913:2: rule__State__Group_5__2__Impl rule__State__Group_5__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalOCCI.g:5920:1: rule__State__Group_5__2__Impl : ( ( rule__State__OutgoingTransitionAssignment_5_2 ) ) ;
    public final void rule__State__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5924:1: ( ( ( rule__State__OutgoingTransitionAssignment_5_2 ) ) )
            // InternalOCCI.g:5925:1: ( ( rule__State__OutgoingTransitionAssignment_5_2 ) )
            {
            // InternalOCCI.g:5925:1: ( ( rule__State__OutgoingTransitionAssignment_5_2 ) )
            // InternalOCCI.g:5926:2: ( rule__State__OutgoingTransitionAssignment_5_2 )
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_2()); 
            // InternalOCCI.g:5927:2: ( rule__State__OutgoingTransitionAssignment_5_2 )
            // InternalOCCI.g:5927:3: rule__State__OutgoingTransitionAssignment_5_2
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
    // InternalOCCI.g:5935:1: rule__State__Group_5__3 : rule__State__Group_5__3__Impl rule__State__Group_5__4 ;
    public final void rule__State__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5939:1: ( rule__State__Group_5__3__Impl rule__State__Group_5__4 )
            // InternalOCCI.g:5940:2: rule__State__Group_5__3__Impl rule__State__Group_5__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalOCCI.g:5947:1: rule__State__Group_5__3__Impl : ( ( rule__State__Group_5_3__0 )* ) ;
    public final void rule__State__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5951:1: ( ( ( rule__State__Group_5_3__0 )* ) )
            // InternalOCCI.g:5952:1: ( ( rule__State__Group_5_3__0 )* )
            {
            // InternalOCCI.g:5952:1: ( ( rule__State__Group_5_3__0 )* )
            // InternalOCCI.g:5953:2: ( rule__State__Group_5_3__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_3()); 
            // InternalOCCI.g:5954:2: ( rule__State__Group_5_3__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==69) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalOCCI.g:5954:3: rule__State__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__State__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalOCCI.g:5962:1: rule__State__Group_5__4 : rule__State__Group_5__4__Impl ;
    public final void rule__State__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5966:1: ( rule__State__Group_5__4__Impl )
            // InternalOCCI.g:5967:2: rule__State__Group_5__4__Impl
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
    // InternalOCCI.g:5973:1: rule__State__Group_5__4__Impl : ( ')' ) ;
    public final void rule__State__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5977:1: ( ( ')' ) )
            // InternalOCCI.g:5978:1: ( ')' )
            {
            // InternalOCCI.g:5978:1: ( ')' )
            // InternalOCCI.g:5979:2: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4()); 
            match(input,71,FOLLOW_2); 
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
    // InternalOCCI.g:5989:1: rule__State__Group_5_3__0 : rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 ;
    public final void rule__State__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:5993:1: ( rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1 )
            // InternalOCCI.g:5994:2: rule__State__Group_5_3__0__Impl rule__State__Group_5_3__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalOCCI.g:6001:1: rule__State__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__State__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6005:1: ( ( ',' ) )
            // InternalOCCI.g:6006:1: ( ',' )
            {
            // InternalOCCI.g:6006:1: ( ',' )
            // InternalOCCI.g:6007:2: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_5_3_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalOCCI.g:6016:1: rule__State__Group_5_3__1 : rule__State__Group_5_3__1__Impl ;
    public final void rule__State__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6020:1: ( rule__State__Group_5_3__1__Impl )
            // InternalOCCI.g:6021:2: rule__State__Group_5_3__1__Impl
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
    // InternalOCCI.g:6027:1: rule__State__Group_5_3__1__Impl : ( ( rule__State__OutgoingTransitionAssignment_5_3_1 ) ) ;
    public final void rule__State__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6031:1: ( ( ( rule__State__OutgoingTransitionAssignment_5_3_1 ) ) )
            // InternalOCCI.g:6032:1: ( ( rule__State__OutgoingTransitionAssignment_5_3_1 ) )
            {
            // InternalOCCI.g:6032:1: ( ( rule__State__OutgoingTransitionAssignment_5_3_1 ) )
            // InternalOCCI.g:6033:2: ( rule__State__OutgoingTransitionAssignment_5_3_1 )
            {
             before(grammarAccess.getStateAccess().getOutgoingTransitionAssignment_5_3_1()); 
            // InternalOCCI.g:6034:2: ( rule__State__OutgoingTransitionAssignment_5_3_1 )
            // InternalOCCI.g:6034:3: rule__State__OutgoingTransitionAssignment_5_3_1
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
    // InternalOCCI.g:6043:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6047:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalOCCI.g:6048:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalOCCI.g:6055:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Group_0__0 )? ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6059:1: ( ( ( rule__Transition__Group_0__0 )? ) )
            // InternalOCCI.g:6060:1: ( ( rule__Transition__Group_0__0 )? )
            {
            // InternalOCCI.g:6060:1: ( ( rule__Transition__Group_0__0 )? )
            // InternalOCCI.g:6061:2: ( rule__Transition__Group_0__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_0()); 
            // InternalOCCI.g:6062:2: ( rule__Transition__Group_0__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==34) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOCCI.g:6062:3: rule__Transition__Group_0__0
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
    // InternalOCCI.g:6070:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6074:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalOCCI.g:6075:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:6082:1: rule__Transition__Group__1__Impl : ( 'to' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6086:1: ( ( 'to' ) )
            // InternalOCCI.g:6087:1: ( 'to' )
            {
            // InternalOCCI.g:6087:1: ( 'to' )
            // InternalOCCI.g:6088:2: 'to'
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
    // InternalOCCI.g:6097:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6101:1: ( rule__Transition__Group__2__Impl )
            // InternalOCCI.g:6102:2: rule__Transition__Group__2__Impl
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
    // InternalOCCI.g:6108:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__TargetAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6112:1: ( ( ( rule__Transition__TargetAssignment_2 ) ) )
            // InternalOCCI.g:6113:1: ( ( rule__Transition__TargetAssignment_2 ) )
            {
            // InternalOCCI.g:6113:1: ( ( rule__Transition__TargetAssignment_2 ) )
            // InternalOCCI.g:6114:2: ( rule__Transition__TargetAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_2()); 
            // InternalOCCI.g:6115:2: ( rule__Transition__TargetAssignment_2 )
            // InternalOCCI.g:6115:3: rule__Transition__TargetAssignment_2
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
    // InternalOCCI.g:6124:1: rule__Transition__Group_0__0 : rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 ;
    public final void rule__Transition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6128:1: ( rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 )
            // InternalOCCI.g:6129:2: rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:6136:1: rule__Transition__Group_0__0__Impl : ( 'action' ) ;
    public final void rule__Transition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6140:1: ( ( 'action' ) )
            // InternalOCCI.g:6141:1: ( 'action' )
            {
            // InternalOCCI.g:6141:1: ( 'action' )
            // InternalOCCI.g:6142:2: 'action'
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
    // InternalOCCI.g:6151:1: rule__Transition__Group_0__1 : rule__Transition__Group_0__1__Impl ;
    public final void rule__Transition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6155:1: ( rule__Transition__Group_0__1__Impl )
            // InternalOCCI.g:6156:2: rule__Transition__Group_0__1__Impl
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
    // InternalOCCI.g:6162:1: rule__Transition__Group_0__1__Impl : ( ( rule__Transition__ActionAssignment_0_1 ) ) ;
    public final void rule__Transition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6166:1: ( ( ( rule__Transition__ActionAssignment_0_1 ) ) )
            // InternalOCCI.g:6167:1: ( ( rule__Transition__ActionAssignment_0_1 ) )
            {
            // InternalOCCI.g:6167:1: ( ( rule__Transition__ActionAssignment_0_1 ) )
            // InternalOCCI.g:6168:2: ( rule__Transition__ActionAssignment_0_1 )
            {
             before(grammarAccess.getTransitionAccess().getActionAssignment_0_1()); 
            // InternalOCCI.g:6169:2: ( rule__Transition__ActionAssignment_0_1 )
            // InternalOCCI.g:6169:3: rule__Transition__ActionAssignment_0_1
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
    // InternalOCCI.g:6178:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6182:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalOCCI.g:6183:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
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
    // InternalOCCI.g:6190:1: rule__StringType__Group__0__Impl : ( 'StringType' ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6194:1: ( ( 'StringType' ) )
            // InternalOCCI.g:6195:1: ( 'StringType' )
            {
            // InternalOCCI.g:6195:1: ( 'StringType' )
            // InternalOCCI.g:6196:2: 'StringType'
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
    // InternalOCCI.g:6205:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl rule__StringType__Group__2 ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6209:1: ( rule__StringType__Group__1__Impl rule__StringType__Group__2 )
            // InternalOCCI.g:6210:2: rule__StringType__Group__1__Impl rule__StringType__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:6217:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__NameAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6221:1: ( ( ( rule__StringType__NameAssignment_1 ) ) )
            // InternalOCCI.g:6222:1: ( ( rule__StringType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:6222:1: ( ( rule__StringType__NameAssignment_1 ) )
            // InternalOCCI.g:6223:2: ( rule__StringType__NameAssignment_1 )
            {
             before(grammarAccess.getStringTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:6224:2: ( rule__StringType__NameAssignment_1 )
            // InternalOCCI.g:6224:3: rule__StringType__NameAssignment_1
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
    // InternalOCCI.g:6232:1: rule__StringType__Group__2 : rule__StringType__Group__2__Impl rule__StringType__Group__3 ;
    public final void rule__StringType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6236:1: ( rule__StringType__Group__2__Impl rule__StringType__Group__3 )
            // InternalOCCI.g:6237:2: rule__StringType__Group__2__Impl rule__StringType__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalOCCI.g:6244:1: rule__StringType__Group__2__Impl : ( '(' ) ;
    public final void rule__StringType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6248:1: ( ( '(' ) )
            // InternalOCCI.g:6249:1: ( '(' )
            {
            // InternalOCCI.g:6249:1: ( '(' )
            // InternalOCCI.g:6250:2: '('
            {
             before(grammarAccess.getStringTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalOCCI.g:6259:1: rule__StringType__Group__3 : rule__StringType__Group__3__Impl rule__StringType__Group__4 ;
    public final void rule__StringType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6263:1: ( rule__StringType__Group__3__Impl rule__StringType__Group__4 )
            // InternalOCCI.g:6264:2: rule__StringType__Group__3__Impl rule__StringType__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalOCCI.g:6271:1: rule__StringType__Group__3__Impl : ( ( rule__StringType__Group_3__0 )? ) ;
    public final void rule__StringType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6275:1: ( ( ( rule__StringType__Group_3__0 )? ) )
            // InternalOCCI.g:6276:1: ( ( rule__StringType__Group_3__0 )? )
            {
            // InternalOCCI.g:6276:1: ( ( rule__StringType__Group_3__0 )? )
            // InternalOCCI.g:6277:2: ( rule__StringType__Group_3__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_3()); 
            // InternalOCCI.g:6278:2: ( rule__StringType__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOCCI.g:6278:3: rule__StringType__Group_3__0
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
    // InternalOCCI.g:6286:1: rule__StringType__Group__4 : rule__StringType__Group__4__Impl rule__StringType__Group__5 ;
    public final void rule__StringType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6290:1: ( rule__StringType__Group__4__Impl rule__StringType__Group__5 )
            // InternalOCCI.g:6291:2: rule__StringType__Group__4__Impl rule__StringType__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalOCCI.g:6298:1: rule__StringType__Group__4__Impl : ( ( rule__StringType__Group_4__0 )? ) ;
    public final void rule__StringType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6302:1: ( ( ( rule__StringType__Group_4__0 )? ) )
            // InternalOCCI.g:6303:1: ( ( rule__StringType__Group_4__0 )? )
            {
            // InternalOCCI.g:6303:1: ( ( rule__StringType__Group_4__0 )? )
            // InternalOCCI.g:6304:2: ( rule__StringType__Group_4__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_4()); 
            // InternalOCCI.g:6305:2: ( rule__StringType__Group_4__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==39) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOCCI.g:6305:3: rule__StringType__Group_4__0
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
    // InternalOCCI.g:6313:1: rule__StringType__Group__5 : rule__StringType__Group__5__Impl rule__StringType__Group__6 ;
    public final void rule__StringType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6317:1: ( rule__StringType__Group__5__Impl rule__StringType__Group__6 )
            // InternalOCCI.g:6318:2: rule__StringType__Group__5__Impl rule__StringType__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalOCCI.g:6325:1: rule__StringType__Group__5__Impl : ( ( rule__StringType__Group_5__0 )? ) ;
    public final void rule__StringType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6329:1: ( ( ( rule__StringType__Group_5__0 )? ) )
            // InternalOCCI.g:6330:1: ( ( rule__StringType__Group_5__0 )? )
            {
            // InternalOCCI.g:6330:1: ( ( rule__StringType__Group_5__0 )? )
            // InternalOCCI.g:6331:2: ( rule__StringType__Group_5__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_5()); 
            // InternalOCCI.g:6332:2: ( rule__StringType__Group_5__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==40) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOCCI.g:6332:3: rule__StringType__Group_5__0
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
    // InternalOCCI.g:6340:1: rule__StringType__Group__6 : rule__StringType__Group__6__Impl rule__StringType__Group__7 ;
    public final void rule__StringType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6344:1: ( rule__StringType__Group__6__Impl rule__StringType__Group__7 )
            // InternalOCCI.g:6345:2: rule__StringType__Group__6__Impl rule__StringType__Group__7
            {
            pushFollow(FOLLOW_41);
            rule__StringType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__7();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:6352:1: rule__StringType__Group__6__Impl : ( ( rule__StringType__Group_6__0 )? ) ;
    public final void rule__StringType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6356:1: ( ( ( rule__StringType__Group_6__0 )? ) )
            // InternalOCCI.g:6357:1: ( ( rule__StringType__Group_6__0 )? )
            {
            // InternalOCCI.g:6357:1: ( ( rule__StringType__Group_6__0 )? )
            // InternalOCCI.g:6358:2: ( rule__StringType__Group_6__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_6()); 
            // InternalOCCI.g:6359:2: ( rule__StringType__Group_6__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==41) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOCCI.g:6359:3: rule__StringType__Group_6__0
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


    // $ANTLR start "rule__StringType__Group__7"
    // InternalOCCI.g:6367:1: rule__StringType__Group__7 : rule__StringType__Group__7__Impl rule__StringType__Group__8 ;
    public final void rule__StringType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6371:1: ( rule__StringType__Group__7__Impl rule__StringType__Group__8 )
            // InternalOCCI.g:6372:2: rule__StringType__Group__7__Impl rule__StringType__Group__8
            {
            pushFollow(FOLLOW_41);
            rule__StringType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__7"


    // $ANTLR start "rule__StringType__Group__7__Impl"
    // InternalOCCI.g:6379:1: rule__StringType__Group__7__Impl : ( ( rule__StringType__Group_7__0 )? ) ;
    public final void rule__StringType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6383:1: ( ( ( rule__StringType__Group_7__0 )? ) )
            // InternalOCCI.g:6384:1: ( ( rule__StringType__Group_7__0 )? )
            {
            // InternalOCCI.g:6384:1: ( ( rule__StringType__Group_7__0 )? )
            // InternalOCCI.g:6385:2: ( rule__StringType__Group_7__0 )?
            {
             before(grammarAccess.getStringTypeAccess().getGroup_7()); 
            // InternalOCCI.g:6386:2: ( rule__StringType__Group_7__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==42) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOCCI.g:6386:3: rule__StringType__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringTypeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__7__Impl"


    // $ANTLR start "rule__StringType__Group__8"
    // InternalOCCI.g:6394:1: rule__StringType__Group__8 : rule__StringType__Group__8__Impl ;
    public final void rule__StringType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6398:1: ( rule__StringType__Group__8__Impl )
            // InternalOCCI.g:6399:2: rule__StringType__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__8"


    // $ANTLR start "rule__StringType__Group__8__Impl"
    // InternalOCCI.g:6405:1: rule__StringType__Group__8__Impl : ( ')' ) ;
    public final void rule__StringType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6409:1: ( ( ')' ) )
            // InternalOCCI.g:6410:1: ( ')' )
            {
            // InternalOCCI.g:6410:1: ( ')' )
            // InternalOCCI.g:6411:2: ')'
            {
             before(grammarAccess.getStringTypeAccess().getRightParenthesisKeyword_8()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__8__Impl"


    // $ANTLR start "rule__StringType__Group_3__0"
    // InternalOCCI.g:6421:1: rule__StringType__Group_3__0 : rule__StringType__Group_3__0__Impl rule__StringType__Group_3__1 ;
    public final void rule__StringType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6425:1: ( rule__StringType__Group_3__0__Impl rule__StringType__Group_3__1 )
            // InternalOCCI.g:6426:2: rule__StringType__Group_3__0__Impl rule__StringType__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOCCI.g:6433:1: rule__StringType__Group_3__0__Impl : ( 'documentation' ) ;
    public final void rule__StringType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6437:1: ( ( 'documentation' ) )
            // InternalOCCI.g:6438:1: ( 'documentation' )
            {
            // InternalOCCI.g:6438:1: ( 'documentation' )
            // InternalOCCI.g:6439:2: 'documentation'
            {
             before(grammarAccess.getStringTypeAccess().getDocumentationKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getDocumentationKeyword_3_0()); 

            }


            }

        }
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
    // InternalOCCI.g:6448:1: rule__StringType__Group_3__1 : rule__StringType__Group_3__1__Impl ;
    public final void rule__StringType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6452:1: ( rule__StringType__Group_3__1__Impl )
            // InternalOCCI.g:6453:2: rule__StringType__Group_3__1__Impl
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
    // InternalOCCI.g:6459:1: rule__StringType__Group_3__1__Impl : ( ( rule__StringType__DocumentationAssignment_3_1 ) ) ;
    public final void rule__StringType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6463:1: ( ( ( rule__StringType__DocumentationAssignment_3_1 ) ) )
            // InternalOCCI.g:6464:1: ( ( rule__StringType__DocumentationAssignment_3_1 ) )
            {
            // InternalOCCI.g:6464:1: ( ( rule__StringType__DocumentationAssignment_3_1 ) )
            // InternalOCCI.g:6465:2: ( rule__StringType__DocumentationAssignment_3_1 )
            {
             before(grammarAccess.getStringTypeAccess().getDocumentationAssignment_3_1()); 
            // InternalOCCI.g:6466:2: ( rule__StringType__DocumentationAssignment_3_1 )
            // InternalOCCI.g:6466:3: rule__StringType__DocumentationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__DocumentationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getDocumentationAssignment_3_1()); 

            }


            }

        }
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
    // InternalOCCI.g:6475:1: rule__StringType__Group_4__0 : rule__StringType__Group_4__0__Impl rule__StringType__Group_4__1 ;
    public final void rule__StringType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6479:1: ( rule__StringType__Group_4__0__Impl rule__StringType__Group_4__1 )
            // InternalOCCI.g:6480:2: rule__StringType__Group_4__0__Impl rule__StringType__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOCCI.g:6487:1: rule__StringType__Group_4__0__Impl : ( 'pattern' ) ;
    public final void rule__StringType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6491:1: ( ( 'pattern' ) )
            // InternalOCCI.g:6492:1: ( 'pattern' )
            {
            // InternalOCCI.g:6492:1: ( 'pattern' )
            // InternalOCCI.g:6493:2: 'pattern'
            {
             before(grammarAccess.getStringTypeAccess().getPatternKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getPatternKeyword_4_0()); 

            }


            }

        }
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
    // InternalOCCI.g:6502:1: rule__StringType__Group_4__1 : rule__StringType__Group_4__1__Impl ;
    public final void rule__StringType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6506:1: ( rule__StringType__Group_4__1__Impl )
            // InternalOCCI.g:6507:2: rule__StringType__Group_4__1__Impl
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
    // InternalOCCI.g:6513:1: rule__StringType__Group_4__1__Impl : ( ( rule__StringType__PatternAssignment_4_1 ) ) ;
    public final void rule__StringType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6517:1: ( ( ( rule__StringType__PatternAssignment_4_1 ) ) )
            // InternalOCCI.g:6518:1: ( ( rule__StringType__PatternAssignment_4_1 ) )
            {
            // InternalOCCI.g:6518:1: ( ( rule__StringType__PatternAssignment_4_1 ) )
            // InternalOCCI.g:6519:2: ( rule__StringType__PatternAssignment_4_1 )
            {
             before(grammarAccess.getStringTypeAccess().getPatternAssignment_4_1()); 
            // InternalOCCI.g:6520:2: ( rule__StringType__PatternAssignment_4_1 )
            // InternalOCCI.g:6520:3: rule__StringType__PatternAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__PatternAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getPatternAssignment_4_1()); 

            }


            }

        }
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
    // InternalOCCI.g:6529:1: rule__StringType__Group_5__0 : rule__StringType__Group_5__0__Impl rule__StringType__Group_5__1 ;
    public final void rule__StringType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6533:1: ( rule__StringType__Group_5__0__Impl rule__StringType__Group_5__1 )
            // InternalOCCI.g:6534:2: rule__StringType__Group_5__0__Impl rule__StringType__Group_5__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalOCCI.g:6541:1: rule__StringType__Group_5__0__Impl : ( 'length' ) ;
    public final void rule__StringType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6545:1: ( ( 'length' ) )
            // InternalOCCI.g:6546:1: ( 'length' )
            {
            // InternalOCCI.g:6546:1: ( 'length' )
            // InternalOCCI.g:6547:2: 'length'
            {
             before(grammarAccess.getStringTypeAccess().getLengthKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getLengthKeyword_5_0()); 

            }


            }

        }
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
    // InternalOCCI.g:6556:1: rule__StringType__Group_5__1 : rule__StringType__Group_5__1__Impl ;
    public final void rule__StringType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6560:1: ( rule__StringType__Group_5__1__Impl )
            // InternalOCCI.g:6561:2: rule__StringType__Group_5__1__Impl
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
    // InternalOCCI.g:6567:1: rule__StringType__Group_5__1__Impl : ( ( rule__StringType__LengthAssignment_5_1 ) ) ;
    public final void rule__StringType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6571:1: ( ( ( rule__StringType__LengthAssignment_5_1 ) ) )
            // InternalOCCI.g:6572:1: ( ( rule__StringType__LengthAssignment_5_1 ) )
            {
            // InternalOCCI.g:6572:1: ( ( rule__StringType__LengthAssignment_5_1 ) )
            // InternalOCCI.g:6573:2: ( rule__StringType__LengthAssignment_5_1 )
            {
             before(grammarAccess.getStringTypeAccess().getLengthAssignment_5_1()); 
            // InternalOCCI.g:6574:2: ( rule__StringType__LengthAssignment_5_1 )
            // InternalOCCI.g:6574:3: rule__StringType__LengthAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__LengthAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getLengthAssignment_5_1()); 

            }


            }

        }
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
    // InternalOCCI.g:6583:1: rule__StringType__Group_6__0 : rule__StringType__Group_6__0__Impl rule__StringType__Group_6__1 ;
    public final void rule__StringType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6587:1: ( rule__StringType__Group_6__0__Impl rule__StringType__Group_6__1 )
            // InternalOCCI.g:6588:2: rule__StringType__Group_6__0__Impl rule__StringType__Group_6__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalOCCI.g:6595:1: rule__StringType__Group_6__0__Impl : ( 'minLength' ) ;
    public final void rule__StringType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6599:1: ( ( 'minLength' ) )
            // InternalOCCI.g:6600:1: ( 'minLength' )
            {
            // InternalOCCI.g:6600:1: ( 'minLength' )
            // InternalOCCI.g:6601:2: 'minLength'
            {
             before(grammarAccess.getStringTypeAccess().getMinLengthKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getMinLengthKeyword_6_0()); 

            }


            }

        }
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
    // InternalOCCI.g:6610:1: rule__StringType__Group_6__1 : rule__StringType__Group_6__1__Impl ;
    public final void rule__StringType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6614:1: ( rule__StringType__Group_6__1__Impl )
            // InternalOCCI.g:6615:2: rule__StringType__Group_6__1__Impl
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
    // InternalOCCI.g:6621:1: rule__StringType__Group_6__1__Impl : ( ( rule__StringType__MinLengthAssignment_6_1 ) ) ;
    public final void rule__StringType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6625:1: ( ( ( rule__StringType__MinLengthAssignment_6_1 ) ) )
            // InternalOCCI.g:6626:1: ( ( rule__StringType__MinLengthAssignment_6_1 ) )
            {
            // InternalOCCI.g:6626:1: ( ( rule__StringType__MinLengthAssignment_6_1 ) )
            // InternalOCCI.g:6627:2: ( rule__StringType__MinLengthAssignment_6_1 )
            {
             before(grammarAccess.getStringTypeAccess().getMinLengthAssignment_6_1()); 
            // InternalOCCI.g:6628:2: ( rule__StringType__MinLengthAssignment_6_1 )
            // InternalOCCI.g:6628:3: rule__StringType__MinLengthAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__MinLengthAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getMinLengthAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__StringType__Group_7__0"
    // InternalOCCI.g:6637:1: rule__StringType__Group_7__0 : rule__StringType__Group_7__0__Impl rule__StringType__Group_7__1 ;
    public final void rule__StringType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6641:1: ( rule__StringType__Group_7__0__Impl rule__StringType__Group_7__1 )
            // InternalOCCI.g:6642:2: rule__StringType__Group_7__0__Impl rule__StringType__Group_7__1
            {
            pushFollow(FOLLOW_42);
            rule__StringType__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_7__0"


    // $ANTLR start "rule__StringType__Group_7__0__Impl"
    // InternalOCCI.g:6649:1: rule__StringType__Group_7__0__Impl : ( 'maxLength' ) ;
    public final void rule__StringType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6653:1: ( ( 'maxLength' ) )
            // InternalOCCI.g:6654:1: ( 'maxLength' )
            {
            // InternalOCCI.g:6654:1: ( 'maxLength' )
            // InternalOCCI.g:6655:2: 'maxLength'
            {
             before(grammarAccess.getStringTypeAccess().getMaxLengthKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getMaxLengthKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_7__0__Impl"


    // $ANTLR start "rule__StringType__Group_7__1"
    // InternalOCCI.g:6664:1: rule__StringType__Group_7__1 : rule__StringType__Group_7__1__Impl ;
    public final void rule__StringType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6668:1: ( rule__StringType__Group_7__1__Impl )
            // InternalOCCI.g:6669:2: rule__StringType__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_7__1"


    // $ANTLR start "rule__StringType__Group_7__1__Impl"
    // InternalOCCI.g:6675:1: rule__StringType__Group_7__1__Impl : ( ( rule__StringType__MaxLengthAssignment_7_1 ) ) ;
    public final void rule__StringType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6679:1: ( ( ( rule__StringType__MaxLengthAssignment_7_1 ) ) )
            // InternalOCCI.g:6680:1: ( ( rule__StringType__MaxLengthAssignment_7_1 ) )
            {
            // InternalOCCI.g:6680:1: ( ( rule__StringType__MaxLengthAssignment_7_1 ) )
            // InternalOCCI.g:6681:2: ( rule__StringType__MaxLengthAssignment_7_1 )
            {
             before(grammarAccess.getStringTypeAccess().getMaxLengthAssignment_7_1()); 
            // InternalOCCI.g:6682:2: ( rule__StringType__MaxLengthAssignment_7_1 )
            // InternalOCCI.g:6682:3: rule__StringType__MaxLengthAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__StringType__MaxLengthAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getMaxLengthAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group_7__1__Impl"


    // $ANTLR start "rule__EObjectType__Group__0"
    // InternalOCCI.g:6691:1: rule__EObjectType__Group__0 : rule__EObjectType__Group__0__Impl rule__EObjectType__Group__1 ;
    public final void rule__EObjectType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6695:1: ( rule__EObjectType__Group__0__Impl rule__EObjectType__Group__1 )
            // InternalOCCI.g:6696:2: rule__EObjectType__Group__0__Impl rule__EObjectType__Group__1
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
    // InternalOCCI.g:6703:1: rule__EObjectType__Group__0__Impl : ( 'EObjectType' ) ;
    public final void rule__EObjectType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6707:1: ( ( 'EObjectType' ) )
            // InternalOCCI.g:6708:1: ( 'EObjectType' )
            {
            // InternalOCCI.g:6708:1: ( 'EObjectType' )
            // InternalOCCI.g:6709:2: 'EObjectType'
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
    // InternalOCCI.g:6718:1: rule__EObjectType__Group__1 : rule__EObjectType__Group__1__Impl rule__EObjectType__Group__2 ;
    public final void rule__EObjectType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6722:1: ( rule__EObjectType__Group__1__Impl rule__EObjectType__Group__2 )
            // InternalOCCI.g:6723:2: rule__EObjectType__Group__1__Impl rule__EObjectType__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:6730:1: rule__EObjectType__Group__1__Impl : ( ( rule__EObjectType__NameAssignment_1 ) ) ;
    public final void rule__EObjectType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6734:1: ( ( ( rule__EObjectType__NameAssignment_1 ) ) )
            // InternalOCCI.g:6735:1: ( ( rule__EObjectType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:6735:1: ( ( rule__EObjectType__NameAssignment_1 ) )
            // InternalOCCI.g:6736:2: ( rule__EObjectType__NameAssignment_1 )
            {
             before(grammarAccess.getEObjectTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:6737:2: ( rule__EObjectType__NameAssignment_1 )
            // InternalOCCI.g:6737:3: rule__EObjectType__NameAssignment_1
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
    // InternalOCCI.g:6745:1: rule__EObjectType__Group__2 : rule__EObjectType__Group__2__Impl rule__EObjectType__Group__3 ;
    public final void rule__EObjectType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6749:1: ( rule__EObjectType__Group__2__Impl rule__EObjectType__Group__3 )
            // InternalOCCI.g:6750:2: rule__EObjectType__Group__2__Impl rule__EObjectType__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalOCCI.g:6757:1: rule__EObjectType__Group__2__Impl : ( '(' ) ;
    public final void rule__EObjectType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6761:1: ( ( '(' ) )
            // InternalOCCI.g:6762:1: ( '(' )
            {
            // InternalOCCI.g:6762:1: ( '(' )
            // InternalOCCI.g:6763:2: '('
            {
             before(grammarAccess.getEObjectTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getEObjectTypeAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalOCCI.g:6772:1: rule__EObjectType__Group__3 : rule__EObjectType__Group__3__Impl rule__EObjectType__Group__4 ;
    public final void rule__EObjectType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6776:1: ( rule__EObjectType__Group__3__Impl rule__EObjectType__Group__4 )
            // InternalOCCI.g:6777:2: rule__EObjectType__Group__3__Impl rule__EObjectType__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__EObjectType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EObjectType__Group__4();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:6784:1: rule__EObjectType__Group__3__Impl : ( ( rule__EObjectType__Group_3__0 )? ) ;
    public final void rule__EObjectType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6788:1: ( ( ( rule__EObjectType__Group_3__0 )? ) )
            // InternalOCCI.g:6789:1: ( ( rule__EObjectType__Group_3__0 )? )
            {
            // InternalOCCI.g:6789:1: ( ( rule__EObjectType__Group_3__0 )? )
            // InternalOCCI.g:6790:2: ( rule__EObjectType__Group_3__0 )?
            {
             before(grammarAccess.getEObjectTypeAccess().getGroup_3()); 
            // InternalOCCI.g:6791:2: ( rule__EObjectType__Group_3__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==38) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOCCI.g:6791:3: rule__EObjectType__Group_3__0
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


    // $ANTLR start "rule__EObjectType__Group__4"
    // InternalOCCI.g:6799:1: rule__EObjectType__Group__4 : rule__EObjectType__Group__4__Impl rule__EObjectType__Group__5 ;
    public final void rule__EObjectType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6803:1: ( rule__EObjectType__Group__4__Impl rule__EObjectType__Group__5 )
            // InternalOCCI.g:6804:2: rule__EObjectType__Group__4__Impl rule__EObjectType__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__EObjectType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EObjectType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__4"


    // $ANTLR start "rule__EObjectType__Group__4__Impl"
    // InternalOCCI.g:6811:1: rule__EObjectType__Group__4__Impl : ( ( rule__EObjectType__Group_4__0 )? ) ;
    public final void rule__EObjectType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6815:1: ( ( ( rule__EObjectType__Group_4__0 )? ) )
            // InternalOCCI.g:6816:1: ( ( rule__EObjectType__Group_4__0 )? )
            {
            // InternalOCCI.g:6816:1: ( ( rule__EObjectType__Group_4__0 )? )
            // InternalOCCI.g:6817:2: ( rule__EObjectType__Group_4__0 )?
            {
             before(grammarAccess.getEObjectTypeAccess().getGroup_4()); 
            // InternalOCCI.g:6818:2: ( rule__EObjectType__Group_4__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==44) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalOCCI.g:6818:3: rule__EObjectType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EObjectType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEObjectTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__4__Impl"


    // $ANTLR start "rule__EObjectType__Group__5"
    // InternalOCCI.g:6826:1: rule__EObjectType__Group__5 : rule__EObjectType__Group__5__Impl ;
    public final void rule__EObjectType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6830:1: ( rule__EObjectType__Group__5__Impl )
            // InternalOCCI.g:6831:2: rule__EObjectType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EObjectType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__5"


    // $ANTLR start "rule__EObjectType__Group__5__Impl"
    // InternalOCCI.g:6837:1: rule__EObjectType__Group__5__Impl : ( ')' ) ;
    public final void rule__EObjectType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6841:1: ( ( ')' ) )
            // InternalOCCI.g:6842:1: ( ')' )
            {
            // InternalOCCI.g:6842:1: ( ')' )
            // InternalOCCI.g:6843:2: ')'
            {
             before(grammarAccess.getEObjectTypeAccess().getRightParenthesisKeyword_5()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getEObjectTypeAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group__5__Impl"


    // $ANTLR start "rule__EObjectType__Group_3__0"
    // InternalOCCI.g:6853:1: rule__EObjectType__Group_3__0 : rule__EObjectType__Group_3__0__Impl rule__EObjectType__Group_3__1 ;
    public final void rule__EObjectType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6857:1: ( rule__EObjectType__Group_3__0__Impl rule__EObjectType__Group_3__1 )
            // InternalOCCI.g:6858:2: rule__EObjectType__Group_3__0__Impl rule__EObjectType__Group_3__1
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
    // InternalOCCI.g:6865:1: rule__EObjectType__Group_3__0__Impl : ( 'documentation' ) ;
    public final void rule__EObjectType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6869:1: ( ( 'documentation' ) )
            // InternalOCCI.g:6870:1: ( 'documentation' )
            {
            // InternalOCCI.g:6870:1: ( 'documentation' )
            // InternalOCCI.g:6871:2: 'documentation'
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
    // InternalOCCI.g:6880:1: rule__EObjectType__Group_3__1 : rule__EObjectType__Group_3__1__Impl ;
    public final void rule__EObjectType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6884:1: ( rule__EObjectType__Group_3__1__Impl )
            // InternalOCCI.g:6885:2: rule__EObjectType__Group_3__1__Impl
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
    // InternalOCCI.g:6891:1: rule__EObjectType__Group_3__1__Impl : ( ( rule__EObjectType__DocumentationAssignment_3_1 ) ) ;
    public final void rule__EObjectType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6895:1: ( ( ( rule__EObjectType__DocumentationAssignment_3_1 ) ) )
            // InternalOCCI.g:6896:1: ( ( rule__EObjectType__DocumentationAssignment_3_1 ) )
            {
            // InternalOCCI.g:6896:1: ( ( rule__EObjectType__DocumentationAssignment_3_1 ) )
            // InternalOCCI.g:6897:2: ( rule__EObjectType__DocumentationAssignment_3_1 )
            {
             before(grammarAccess.getEObjectTypeAccess().getDocumentationAssignment_3_1()); 
            // InternalOCCI.g:6898:2: ( rule__EObjectType__DocumentationAssignment_3_1 )
            // InternalOCCI.g:6898:3: rule__EObjectType__DocumentationAssignment_3_1
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


    // $ANTLR start "rule__EObjectType__Group_4__0"
    // InternalOCCI.g:6907:1: rule__EObjectType__Group_4__0 : rule__EObjectType__Group_4__0__Impl rule__EObjectType__Group_4__1 ;
    public final void rule__EObjectType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6911:1: ( rule__EObjectType__Group_4__0__Impl rule__EObjectType__Group_4__1 )
            // InternalOCCI.g:6912:2: rule__EObjectType__Group_4__0__Impl rule__EObjectType__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__EObjectType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EObjectType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_4__0"


    // $ANTLR start "rule__EObjectType__Group_4__0__Impl"
    // InternalOCCI.g:6919:1: rule__EObjectType__Group_4__0__Impl : ( 'instanceClassName' ) ;
    public final void rule__EObjectType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6923:1: ( ( 'instanceClassName' ) )
            // InternalOCCI.g:6924:1: ( 'instanceClassName' )
            {
            // InternalOCCI.g:6924:1: ( 'instanceClassName' )
            // InternalOCCI.g:6925:2: 'instanceClassName'
            {
             before(grammarAccess.getEObjectTypeAccess().getInstanceClassNameKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEObjectTypeAccess().getInstanceClassNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_4__0__Impl"


    // $ANTLR start "rule__EObjectType__Group_4__1"
    // InternalOCCI.g:6934:1: rule__EObjectType__Group_4__1 : rule__EObjectType__Group_4__1__Impl ;
    public final void rule__EObjectType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6938:1: ( rule__EObjectType__Group_4__1__Impl )
            // InternalOCCI.g:6939:2: rule__EObjectType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EObjectType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_4__1"


    // $ANTLR start "rule__EObjectType__Group_4__1__Impl"
    // InternalOCCI.g:6945:1: rule__EObjectType__Group_4__1__Impl : ( ( rule__EObjectType__InstanceClassNameAssignment_4_1 ) ) ;
    public final void rule__EObjectType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6949:1: ( ( ( rule__EObjectType__InstanceClassNameAssignment_4_1 ) ) )
            // InternalOCCI.g:6950:1: ( ( rule__EObjectType__InstanceClassNameAssignment_4_1 ) )
            {
            // InternalOCCI.g:6950:1: ( ( rule__EObjectType__InstanceClassNameAssignment_4_1 ) )
            // InternalOCCI.g:6951:2: ( rule__EObjectType__InstanceClassNameAssignment_4_1 )
            {
             before(grammarAccess.getEObjectTypeAccess().getInstanceClassNameAssignment_4_1()); 
            // InternalOCCI.g:6952:2: ( rule__EObjectType__InstanceClassNameAssignment_4_1 )
            // InternalOCCI.g:6952:3: rule__EObjectType__InstanceClassNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EObjectType__InstanceClassNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEObjectTypeAccess().getInstanceClassNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__Group_4__1__Impl"


    // $ANTLR start "rule__BooleanType__Group__0"
    // InternalOCCI.g:6961:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6965:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // InternalOCCI.g:6966:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
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
    // InternalOCCI.g:6973:1: rule__BooleanType__Group__0__Impl : ( 'BooleanType' ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6977:1: ( ( 'BooleanType' ) )
            // InternalOCCI.g:6978:1: ( 'BooleanType' )
            {
            // InternalOCCI.g:6978:1: ( 'BooleanType' )
            // InternalOCCI.g:6979:2: 'BooleanType'
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
    // InternalOCCI.g:6988:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl rule__BooleanType__Group__2 ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:6992:1: ( rule__BooleanType__Group__1__Impl rule__BooleanType__Group__2 )
            // InternalOCCI.g:6993:2: rule__BooleanType__Group__1__Impl rule__BooleanType__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:7000:1: rule__BooleanType__Group__1__Impl : ( ( rule__BooleanType__NameAssignment_1 ) ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7004:1: ( ( ( rule__BooleanType__NameAssignment_1 ) ) )
            // InternalOCCI.g:7005:1: ( ( rule__BooleanType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:7005:1: ( ( rule__BooleanType__NameAssignment_1 ) )
            // InternalOCCI.g:7006:2: ( rule__BooleanType__NameAssignment_1 )
            {
             before(grammarAccess.getBooleanTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:7007:2: ( rule__BooleanType__NameAssignment_1 )
            // InternalOCCI.g:7007:3: rule__BooleanType__NameAssignment_1
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
    // InternalOCCI.g:7015:1: rule__BooleanType__Group__2 : rule__BooleanType__Group__2__Impl rule__BooleanType__Group__3 ;
    public final void rule__BooleanType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7019:1: ( rule__BooleanType__Group__2__Impl rule__BooleanType__Group__3 )
            // InternalOCCI.g:7020:2: rule__BooleanType__Group__2__Impl rule__BooleanType__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__BooleanType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__3();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:7027:1: rule__BooleanType__Group__2__Impl : ( '(' ) ;
    public final void rule__BooleanType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7031:1: ( ( '(' ) )
            // InternalOCCI.g:7032:1: ( '(' )
            {
            // InternalOCCI.g:7032:1: ( '(' )
            // InternalOCCI.g:7033:2: '('
            {
             before(grammarAccess.getBooleanTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__BooleanType__Group__3"
    // InternalOCCI.g:7042:1: rule__BooleanType__Group__3 : rule__BooleanType__Group__3__Impl rule__BooleanType__Group__4 ;
    public final void rule__BooleanType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7046:1: ( rule__BooleanType__Group__3__Impl rule__BooleanType__Group__4 )
            // InternalOCCI.g:7047:2: rule__BooleanType__Group__3__Impl rule__BooleanType__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__BooleanType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__3"


    // $ANTLR start "rule__BooleanType__Group__3__Impl"
    // InternalOCCI.g:7054:1: rule__BooleanType__Group__3__Impl : ( ( rule__BooleanType__Group_3__0 )? ) ;
    public final void rule__BooleanType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7058:1: ( ( ( rule__BooleanType__Group_3__0 )? ) )
            // InternalOCCI.g:7059:1: ( ( rule__BooleanType__Group_3__0 )? )
            {
            // InternalOCCI.g:7059:1: ( ( rule__BooleanType__Group_3__0 )? )
            // InternalOCCI.g:7060:2: ( rule__BooleanType__Group_3__0 )?
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup_3()); 
            // InternalOCCI.g:7061:2: ( rule__BooleanType__Group_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==38) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOCCI.g:7061:3: rule__BooleanType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__3__Impl"


    // $ANTLR start "rule__BooleanType__Group__4"
    // InternalOCCI.g:7069:1: rule__BooleanType__Group__4 : rule__BooleanType__Group__4__Impl ;
    public final void rule__BooleanType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7073:1: ( rule__BooleanType__Group__4__Impl )
            // InternalOCCI.g:7074:2: rule__BooleanType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__4"


    // $ANTLR start "rule__BooleanType__Group__4__Impl"
    // InternalOCCI.g:7080:1: rule__BooleanType__Group__4__Impl : ( ')' ) ;
    public final void rule__BooleanType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7084:1: ( ( ')' ) )
            // InternalOCCI.g:7085:1: ( ')' )
            {
            // InternalOCCI.g:7085:1: ( ')' )
            // InternalOCCI.g:7086:2: ')'
            {
             before(grammarAccess.getBooleanTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__4__Impl"


    // $ANTLR start "rule__BooleanType__Group_3__0"
    // InternalOCCI.g:7096:1: rule__BooleanType__Group_3__0 : rule__BooleanType__Group_3__0__Impl rule__BooleanType__Group_3__1 ;
    public final void rule__BooleanType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7100:1: ( rule__BooleanType__Group_3__0__Impl rule__BooleanType__Group_3__1 )
            // InternalOCCI.g:7101:2: rule__BooleanType__Group_3__0__Impl rule__BooleanType__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__BooleanType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group_3__0"


    // $ANTLR start "rule__BooleanType__Group_3__0__Impl"
    // InternalOCCI.g:7108:1: rule__BooleanType__Group_3__0__Impl : ( 'documentation' ) ;
    public final void rule__BooleanType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7112:1: ( ( 'documentation' ) )
            // InternalOCCI.g:7113:1: ( 'documentation' )
            {
            // InternalOCCI.g:7113:1: ( 'documentation' )
            // InternalOCCI.g:7114:2: 'documentation'
            {
             before(grammarAccess.getBooleanTypeAccess().getDocumentationKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getDocumentationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group_3__0__Impl"


    // $ANTLR start "rule__BooleanType__Group_3__1"
    // InternalOCCI.g:7123:1: rule__BooleanType__Group_3__1 : rule__BooleanType__Group_3__1__Impl ;
    public final void rule__BooleanType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7127:1: ( rule__BooleanType__Group_3__1__Impl )
            // InternalOCCI.g:7128:2: rule__BooleanType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group_3__1"


    // $ANTLR start "rule__BooleanType__Group_3__1__Impl"
    // InternalOCCI.g:7134:1: rule__BooleanType__Group_3__1__Impl : ( ( rule__BooleanType__DocumentationAssignment_3_1 ) ) ;
    public final void rule__BooleanType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7138:1: ( ( ( rule__BooleanType__DocumentationAssignment_3_1 ) ) )
            // InternalOCCI.g:7139:1: ( ( rule__BooleanType__DocumentationAssignment_3_1 ) )
            {
            // InternalOCCI.g:7139:1: ( ( rule__BooleanType__DocumentationAssignment_3_1 ) )
            // InternalOCCI.g:7140:2: ( rule__BooleanType__DocumentationAssignment_3_1 )
            {
             before(grammarAccess.getBooleanTypeAccess().getDocumentationAssignment_3_1()); 
            // InternalOCCI.g:7141:2: ( rule__BooleanType__DocumentationAssignment_3_1 )
            // InternalOCCI.g:7141:3: rule__BooleanType__DocumentationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__DocumentationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getDocumentationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group_3__1__Impl"


    // $ANTLR start "rule__NumericType__Group__0"
    // InternalOCCI.g:7150:1: rule__NumericType__Group__0 : rule__NumericType__Group__0__Impl rule__NumericType__Group__1 ;
    public final void rule__NumericType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7154:1: ( rule__NumericType__Group__0__Impl rule__NumericType__Group__1 )
            // InternalOCCI.g:7155:2: rule__NumericType__Group__0__Impl rule__NumericType__Group__1
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
    // InternalOCCI.g:7162:1: rule__NumericType__Group__0__Impl : ( 'NumericType' ) ;
    public final void rule__NumericType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7166:1: ( ( 'NumericType' ) )
            // InternalOCCI.g:7167:1: ( 'NumericType' )
            {
            // InternalOCCI.g:7167:1: ( 'NumericType' )
            // InternalOCCI.g:7168:2: 'NumericType'
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
    // InternalOCCI.g:7177:1: rule__NumericType__Group__1 : rule__NumericType__Group__1__Impl rule__NumericType__Group__2 ;
    public final void rule__NumericType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7181:1: ( rule__NumericType__Group__1__Impl rule__NumericType__Group__2 )
            // InternalOCCI.g:7182:2: rule__NumericType__Group__1__Impl rule__NumericType__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalOCCI.g:7189:1: rule__NumericType__Group__1__Impl : ( ( rule__NumericType__NameAssignment_1 ) ) ;
    public final void rule__NumericType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7193:1: ( ( ( rule__NumericType__NameAssignment_1 ) ) )
            // InternalOCCI.g:7194:1: ( ( rule__NumericType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:7194:1: ( ( rule__NumericType__NameAssignment_1 ) )
            // InternalOCCI.g:7195:2: ( rule__NumericType__NameAssignment_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:7196:2: ( rule__NumericType__NameAssignment_1 )
            // InternalOCCI.g:7196:3: rule__NumericType__NameAssignment_1
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
    // InternalOCCI.g:7204:1: rule__NumericType__Group__2 : rule__NumericType__Group__2__Impl rule__NumericType__Group__3 ;
    public final void rule__NumericType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7208:1: ( rule__NumericType__Group__2__Impl rule__NumericType__Group__3 )
            // InternalOCCI.g:7209:2: rule__NumericType__Group__2__Impl rule__NumericType__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalOCCI.g:7216:1: rule__NumericType__Group__2__Impl : ( 'type' ) ;
    public final void rule__NumericType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7220:1: ( ( 'type' ) )
            // InternalOCCI.g:7221:1: ( 'type' )
            {
            // InternalOCCI.g:7221:1: ( 'type' )
            // InternalOCCI.g:7222:2: 'type'
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
    // InternalOCCI.g:7231:1: rule__NumericType__Group__3 : rule__NumericType__Group__3__Impl rule__NumericType__Group__4 ;
    public final void rule__NumericType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7235:1: ( rule__NumericType__Group__3__Impl rule__NumericType__Group__4 )
            // InternalOCCI.g:7236:2: rule__NumericType__Group__3__Impl rule__NumericType__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:7243:1: rule__NumericType__Group__3__Impl : ( ( rule__NumericType__TypeAssignment_3 ) ) ;
    public final void rule__NumericType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7247:1: ( ( ( rule__NumericType__TypeAssignment_3 ) ) )
            // InternalOCCI.g:7248:1: ( ( rule__NumericType__TypeAssignment_3 ) )
            {
            // InternalOCCI.g:7248:1: ( ( rule__NumericType__TypeAssignment_3 ) )
            // InternalOCCI.g:7249:2: ( rule__NumericType__TypeAssignment_3 )
            {
             before(grammarAccess.getNumericTypeAccess().getTypeAssignment_3()); 
            // InternalOCCI.g:7250:2: ( rule__NumericType__TypeAssignment_3 )
            // InternalOCCI.g:7250:3: rule__NumericType__TypeAssignment_3
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
    // InternalOCCI.g:7258:1: rule__NumericType__Group__4 : rule__NumericType__Group__4__Impl rule__NumericType__Group__5 ;
    public final void rule__NumericType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7262:1: ( rule__NumericType__Group__4__Impl rule__NumericType__Group__5 )
            // InternalOCCI.g:7263:2: rule__NumericType__Group__4__Impl rule__NumericType__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalOCCI.g:7270:1: rule__NumericType__Group__4__Impl : ( '(' ) ;
    public final void rule__NumericType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7274:1: ( ( '(' ) )
            // InternalOCCI.g:7275:1: ( '(' )
            {
            // InternalOCCI.g:7275:1: ( '(' )
            // InternalOCCI.g:7276:2: '('
            {
             before(grammarAccess.getNumericTypeAccess().getLeftParenthesisKeyword_4()); 
            match(input,70,FOLLOW_2); 
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
    // InternalOCCI.g:7285:1: rule__NumericType__Group__5 : rule__NumericType__Group__5__Impl rule__NumericType__Group__6 ;
    public final void rule__NumericType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7289:1: ( rule__NumericType__Group__5__Impl rule__NumericType__Group__6 )
            // InternalOCCI.g:7290:2: rule__NumericType__Group__5__Impl rule__NumericType__Group__6
            {
            pushFollow(FOLLOW_47);
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
    // InternalOCCI.g:7297:1: rule__NumericType__Group__5__Impl : ( ( rule__NumericType__Group_5__0 )? ) ;
    public final void rule__NumericType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7301:1: ( ( ( rule__NumericType__Group_5__0 )? ) )
            // InternalOCCI.g:7302:1: ( ( rule__NumericType__Group_5__0 )? )
            {
            // InternalOCCI.g:7302:1: ( ( rule__NumericType__Group_5__0 )? )
            // InternalOCCI.g:7303:2: ( rule__NumericType__Group_5__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_5()); 
            // InternalOCCI.g:7304:2: ( rule__NumericType__Group_5__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==38) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOCCI.g:7304:3: rule__NumericType__Group_5__0
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
    // InternalOCCI.g:7312:1: rule__NumericType__Group__6 : rule__NumericType__Group__6__Impl rule__NumericType__Group__7 ;
    public final void rule__NumericType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7316:1: ( rule__NumericType__Group__6__Impl rule__NumericType__Group__7 )
            // InternalOCCI.g:7317:2: rule__NumericType__Group__6__Impl rule__NumericType__Group__7
            {
            pushFollow(FOLLOW_47);
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
    // InternalOCCI.g:7324:1: rule__NumericType__Group__6__Impl : ( ( rule__NumericType__Group_6__0 )? ) ;
    public final void rule__NumericType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7328:1: ( ( ( rule__NumericType__Group_6__0 )? ) )
            // InternalOCCI.g:7329:1: ( ( rule__NumericType__Group_6__0 )? )
            {
            // InternalOCCI.g:7329:1: ( ( rule__NumericType__Group_6__0 )? )
            // InternalOCCI.g:7330:2: ( rule__NumericType__Group_6__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_6()); 
            // InternalOCCI.g:7331:2: ( rule__NumericType__Group_6__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==47) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOCCI.g:7331:3: rule__NumericType__Group_6__0
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
    // InternalOCCI.g:7339:1: rule__NumericType__Group__7 : rule__NumericType__Group__7__Impl rule__NumericType__Group__8 ;
    public final void rule__NumericType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7343:1: ( rule__NumericType__Group__7__Impl rule__NumericType__Group__8 )
            // InternalOCCI.g:7344:2: rule__NumericType__Group__7__Impl rule__NumericType__Group__8
            {
            pushFollow(FOLLOW_47);
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
    // InternalOCCI.g:7351:1: rule__NumericType__Group__7__Impl : ( ( rule__NumericType__Group_7__0 )? ) ;
    public final void rule__NumericType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7355:1: ( ( ( rule__NumericType__Group_7__0 )? ) )
            // InternalOCCI.g:7356:1: ( ( rule__NumericType__Group_7__0 )? )
            {
            // InternalOCCI.g:7356:1: ( ( rule__NumericType__Group_7__0 )? )
            // InternalOCCI.g:7357:2: ( rule__NumericType__Group_7__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_7()); 
            // InternalOCCI.g:7358:2: ( rule__NumericType__Group_7__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==48) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOCCI.g:7358:3: rule__NumericType__Group_7__0
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
    // InternalOCCI.g:7366:1: rule__NumericType__Group__8 : rule__NumericType__Group__8__Impl rule__NumericType__Group__9 ;
    public final void rule__NumericType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7370:1: ( rule__NumericType__Group__8__Impl rule__NumericType__Group__9 )
            // InternalOCCI.g:7371:2: rule__NumericType__Group__8__Impl rule__NumericType__Group__9
            {
            pushFollow(FOLLOW_47);
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
    // InternalOCCI.g:7378:1: rule__NumericType__Group__8__Impl : ( ( rule__NumericType__Group_8__0 )? ) ;
    public final void rule__NumericType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7382:1: ( ( ( rule__NumericType__Group_8__0 )? ) )
            // InternalOCCI.g:7383:1: ( ( rule__NumericType__Group_8__0 )? )
            {
            // InternalOCCI.g:7383:1: ( ( rule__NumericType__Group_8__0 )? )
            // InternalOCCI.g:7384:2: ( rule__NumericType__Group_8__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_8()); 
            // InternalOCCI.g:7385:2: ( rule__NumericType__Group_8__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==49) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOCCI.g:7385:3: rule__NumericType__Group_8__0
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
    // InternalOCCI.g:7393:1: rule__NumericType__Group__9 : rule__NumericType__Group__9__Impl rule__NumericType__Group__10 ;
    public final void rule__NumericType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7397:1: ( rule__NumericType__Group__9__Impl rule__NumericType__Group__10 )
            // InternalOCCI.g:7398:2: rule__NumericType__Group__9__Impl rule__NumericType__Group__10
            {
            pushFollow(FOLLOW_47);
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
    // InternalOCCI.g:7405:1: rule__NumericType__Group__9__Impl : ( ( rule__NumericType__Group_9__0 )? ) ;
    public final void rule__NumericType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7409:1: ( ( ( rule__NumericType__Group_9__0 )? ) )
            // InternalOCCI.g:7410:1: ( ( rule__NumericType__Group_9__0 )? )
            {
            // InternalOCCI.g:7410:1: ( ( rule__NumericType__Group_9__0 )? )
            // InternalOCCI.g:7411:2: ( rule__NumericType__Group_9__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_9()); 
            // InternalOCCI.g:7412:2: ( rule__NumericType__Group_9__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==50) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalOCCI.g:7412:3: rule__NumericType__Group_9__0
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
    // InternalOCCI.g:7420:1: rule__NumericType__Group__10 : rule__NumericType__Group__10__Impl rule__NumericType__Group__11 ;
    public final void rule__NumericType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7424:1: ( rule__NumericType__Group__10__Impl rule__NumericType__Group__11 )
            // InternalOCCI.g:7425:2: rule__NumericType__Group__10__Impl rule__NumericType__Group__11
            {
            pushFollow(FOLLOW_47);
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
    // InternalOCCI.g:7432:1: rule__NumericType__Group__10__Impl : ( ( rule__NumericType__Group_10__0 )? ) ;
    public final void rule__NumericType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7436:1: ( ( ( rule__NumericType__Group_10__0 )? ) )
            // InternalOCCI.g:7437:1: ( ( rule__NumericType__Group_10__0 )? )
            {
            // InternalOCCI.g:7437:1: ( ( rule__NumericType__Group_10__0 )? )
            // InternalOCCI.g:7438:2: ( rule__NumericType__Group_10__0 )?
            {
             before(grammarAccess.getNumericTypeAccess().getGroup_10()); 
            // InternalOCCI.g:7439:2: ( rule__NumericType__Group_10__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==51) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOCCI.g:7439:3: rule__NumericType__Group_10__0
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
    // InternalOCCI.g:7447:1: rule__NumericType__Group__11 : rule__NumericType__Group__11__Impl ;
    public final void rule__NumericType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7451:1: ( rule__NumericType__Group__11__Impl )
            // InternalOCCI.g:7452:2: rule__NumericType__Group__11__Impl
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
    // InternalOCCI.g:7458:1: rule__NumericType__Group__11__Impl : ( ')' ) ;
    public final void rule__NumericType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7462:1: ( ( ')' ) )
            // InternalOCCI.g:7463:1: ( ')' )
            {
            // InternalOCCI.g:7463:1: ( ')' )
            // InternalOCCI.g:7464:2: ')'
            {
             before(grammarAccess.getNumericTypeAccess().getRightParenthesisKeyword_11()); 
            match(input,71,FOLLOW_2); 
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
    // InternalOCCI.g:7474:1: rule__NumericType__Group_5__0 : rule__NumericType__Group_5__0__Impl rule__NumericType__Group_5__1 ;
    public final void rule__NumericType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7478:1: ( rule__NumericType__Group_5__0__Impl rule__NumericType__Group_5__1 )
            // InternalOCCI.g:7479:2: rule__NumericType__Group_5__0__Impl rule__NumericType__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOCCI.g:7486:1: rule__NumericType__Group_5__0__Impl : ( 'documentation' ) ;
    public final void rule__NumericType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7490:1: ( ( 'documentation' ) )
            // InternalOCCI.g:7491:1: ( 'documentation' )
            {
            // InternalOCCI.g:7491:1: ( 'documentation' )
            // InternalOCCI.g:7492:2: 'documentation'
            {
             before(grammarAccess.getNumericTypeAccess().getDocumentationKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getDocumentationKeyword_5_0()); 

            }


            }

        }
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
    // InternalOCCI.g:7501:1: rule__NumericType__Group_5__1 : rule__NumericType__Group_5__1__Impl ;
    public final void rule__NumericType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7505:1: ( rule__NumericType__Group_5__1__Impl )
            // InternalOCCI.g:7506:2: rule__NumericType__Group_5__1__Impl
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
    // InternalOCCI.g:7512:1: rule__NumericType__Group_5__1__Impl : ( ( rule__NumericType__DocumentationAssignment_5_1 ) ) ;
    public final void rule__NumericType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7516:1: ( ( ( rule__NumericType__DocumentationAssignment_5_1 ) ) )
            // InternalOCCI.g:7517:1: ( ( rule__NumericType__DocumentationAssignment_5_1 ) )
            {
            // InternalOCCI.g:7517:1: ( ( rule__NumericType__DocumentationAssignment_5_1 ) )
            // InternalOCCI.g:7518:2: ( rule__NumericType__DocumentationAssignment_5_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getDocumentationAssignment_5_1()); 
            // InternalOCCI.g:7519:2: ( rule__NumericType__DocumentationAssignment_5_1 )
            // InternalOCCI.g:7519:3: rule__NumericType__DocumentationAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__DocumentationAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getDocumentationAssignment_5_1()); 

            }


            }

        }
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
    // InternalOCCI.g:7528:1: rule__NumericType__Group_6__0 : rule__NumericType__Group_6__0__Impl rule__NumericType__Group_6__1 ;
    public final void rule__NumericType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7532:1: ( rule__NumericType__Group_6__0__Impl rule__NumericType__Group_6__1 )
            // InternalOCCI.g:7533:2: rule__NumericType__Group_6__0__Impl rule__NumericType__Group_6__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalOCCI.g:7540:1: rule__NumericType__Group_6__0__Impl : ( 'totalDigits' ) ;
    public final void rule__NumericType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7544:1: ( ( 'totalDigits' ) )
            // InternalOCCI.g:7545:1: ( 'totalDigits' )
            {
            // InternalOCCI.g:7545:1: ( 'totalDigits' )
            // InternalOCCI.g:7546:2: 'totalDigits'
            {
             before(grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getTotalDigitsKeyword_6_0()); 

            }


            }

        }
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
    // InternalOCCI.g:7555:1: rule__NumericType__Group_6__1 : rule__NumericType__Group_6__1__Impl ;
    public final void rule__NumericType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7559:1: ( rule__NumericType__Group_6__1__Impl )
            // InternalOCCI.g:7560:2: rule__NumericType__Group_6__1__Impl
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
    // InternalOCCI.g:7566:1: rule__NumericType__Group_6__1__Impl : ( ( rule__NumericType__TotalDigitsAssignment_6_1 ) ) ;
    public final void rule__NumericType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7570:1: ( ( ( rule__NumericType__TotalDigitsAssignment_6_1 ) ) )
            // InternalOCCI.g:7571:1: ( ( rule__NumericType__TotalDigitsAssignment_6_1 ) )
            {
            // InternalOCCI.g:7571:1: ( ( rule__NumericType__TotalDigitsAssignment_6_1 ) )
            // InternalOCCI.g:7572:2: ( rule__NumericType__TotalDigitsAssignment_6_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getTotalDigitsAssignment_6_1()); 
            // InternalOCCI.g:7573:2: ( rule__NumericType__TotalDigitsAssignment_6_1 )
            // InternalOCCI.g:7573:3: rule__NumericType__TotalDigitsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__TotalDigitsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getTotalDigitsAssignment_6_1()); 

            }


            }

        }
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
    // InternalOCCI.g:7582:1: rule__NumericType__Group_7__0 : rule__NumericType__Group_7__0__Impl rule__NumericType__Group_7__1 ;
    public final void rule__NumericType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7586:1: ( rule__NumericType__Group_7__0__Impl rule__NumericType__Group_7__1 )
            // InternalOCCI.g:7587:2: rule__NumericType__Group_7__0__Impl rule__NumericType__Group_7__1
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
    // InternalOCCI.g:7594:1: rule__NumericType__Group_7__0__Impl : ( 'minExclusive' ) ;
    public final void rule__NumericType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7598:1: ( ( 'minExclusive' ) )
            // InternalOCCI.g:7599:1: ( 'minExclusive' )
            {
            // InternalOCCI.g:7599:1: ( 'minExclusive' )
            // InternalOCCI.g:7600:2: 'minExclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_7_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMinExclusiveKeyword_7_0()); 

            }


            }

        }
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
    // InternalOCCI.g:7609:1: rule__NumericType__Group_7__1 : rule__NumericType__Group_7__1__Impl ;
    public final void rule__NumericType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7613:1: ( rule__NumericType__Group_7__1__Impl )
            // InternalOCCI.g:7614:2: rule__NumericType__Group_7__1__Impl
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
    // InternalOCCI.g:7620:1: rule__NumericType__Group_7__1__Impl : ( ( rule__NumericType__MinExclusiveAssignment_7_1 ) ) ;
    public final void rule__NumericType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7624:1: ( ( ( rule__NumericType__MinExclusiveAssignment_7_1 ) ) )
            // InternalOCCI.g:7625:1: ( ( rule__NumericType__MinExclusiveAssignment_7_1 ) )
            {
            // InternalOCCI.g:7625:1: ( ( rule__NumericType__MinExclusiveAssignment_7_1 ) )
            // InternalOCCI.g:7626:2: ( rule__NumericType__MinExclusiveAssignment_7_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMinExclusiveAssignment_7_1()); 
            // InternalOCCI.g:7627:2: ( rule__NumericType__MinExclusiveAssignment_7_1 )
            // InternalOCCI.g:7627:3: rule__NumericType__MinExclusiveAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MinExclusiveAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMinExclusiveAssignment_7_1()); 

            }


            }

        }
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
    // InternalOCCI.g:7636:1: rule__NumericType__Group_8__0 : rule__NumericType__Group_8__0__Impl rule__NumericType__Group_8__1 ;
    public final void rule__NumericType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7640:1: ( rule__NumericType__Group_8__0__Impl rule__NumericType__Group_8__1 )
            // InternalOCCI.g:7641:2: rule__NumericType__Group_8__0__Impl rule__NumericType__Group_8__1
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
    // InternalOCCI.g:7648:1: rule__NumericType__Group_8__0__Impl : ( 'maxExclusive' ) ;
    public final void rule__NumericType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7652:1: ( ( 'maxExclusive' ) )
            // InternalOCCI.g:7653:1: ( 'maxExclusive' )
            {
            // InternalOCCI.g:7653:1: ( 'maxExclusive' )
            // InternalOCCI.g:7654:2: 'maxExclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_8_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMaxExclusiveKeyword_8_0()); 

            }


            }

        }
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
    // InternalOCCI.g:7663:1: rule__NumericType__Group_8__1 : rule__NumericType__Group_8__1__Impl ;
    public final void rule__NumericType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7667:1: ( rule__NumericType__Group_8__1__Impl )
            // InternalOCCI.g:7668:2: rule__NumericType__Group_8__1__Impl
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
    // InternalOCCI.g:7674:1: rule__NumericType__Group_8__1__Impl : ( ( rule__NumericType__MaxExclusiveAssignment_8_1 ) ) ;
    public final void rule__NumericType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7678:1: ( ( ( rule__NumericType__MaxExclusiveAssignment_8_1 ) ) )
            // InternalOCCI.g:7679:1: ( ( rule__NumericType__MaxExclusiveAssignment_8_1 ) )
            {
            // InternalOCCI.g:7679:1: ( ( rule__NumericType__MaxExclusiveAssignment_8_1 ) )
            // InternalOCCI.g:7680:2: ( rule__NumericType__MaxExclusiveAssignment_8_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMaxExclusiveAssignment_8_1()); 
            // InternalOCCI.g:7681:2: ( rule__NumericType__MaxExclusiveAssignment_8_1 )
            // InternalOCCI.g:7681:3: rule__NumericType__MaxExclusiveAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MaxExclusiveAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMaxExclusiveAssignment_8_1()); 

            }


            }

        }
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
    // InternalOCCI.g:7690:1: rule__NumericType__Group_9__0 : rule__NumericType__Group_9__0__Impl rule__NumericType__Group_9__1 ;
    public final void rule__NumericType__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7694:1: ( rule__NumericType__Group_9__0__Impl rule__NumericType__Group_9__1 )
            // InternalOCCI.g:7695:2: rule__NumericType__Group_9__0__Impl rule__NumericType__Group_9__1
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
    // InternalOCCI.g:7702:1: rule__NumericType__Group_9__0__Impl : ( 'minInclusive' ) ;
    public final void rule__NumericType__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7706:1: ( ( 'minInclusive' ) )
            // InternalOCCI.g:7707:1: ( 'minInclusive' )
            {
            // InternalOCCI.g:7707:1: ( 'minInclusive' )
            // InternalOCCI.g:7708:2: 'minInclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_9_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMinInclusiveKeyword_9_0()); 

            }


            }

        }
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
    // InternalOCCI.g:7717:1: rule__NumericType__Group_9__1 : rule__NumericType__Group_9__1__Impl ;
    public final void rule__NumericType__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7721:1: ( rule__NumericType__Group_9__1__Impl )
            // InternalOCCI.g:7722:2: rule__NumericType__Group_9__1__Impl
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
    // InternalOCCI.g:7728:1: rule__NumericType__Group_9__1__Impl : ( ( rule__NumericType__MinInclusiveAssignment_9_1 ) ) ;
    public final void rule__NumericType__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7732:1: ( ( ( rule__NumericType__MinInclusiveAssignment_9_1 ) ) )
            // InternalOCCI.g:7733:1: ( ( rule__NumericType__MinInclusiveAssignment_9_1 ) )
            {
            // InternalOCCI.g:7733:1: ( ( rule__NumericType__MinInclusiveAssignment_9_1 ) )
            // InternalOCCI.g:7734:2: ( rule__NumericType__MinInclusiveAssignment_9_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMinInclusiveAssignment_9_1()); 
            // InternalOCCI.g:7735:2: ( rule__NumericType__MinInclusiveAssignment_9_1 )
            // InternalOCCI.g:7735:3: rule__NumericType__MinInclusiveAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MinInclusiveAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMinInclusiveAssignment_9_1()); 

            }


            }

        }
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
    // InternalOCCI.g:7744:1: rule__NumericType__Group_10__0 : rule__NumericType__Group_10__0__Impl rule__NumericType__Group_10__1 ;
    public final void rule__NumericType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7748:1: ( rule__NumericType__Group_10__0__Impl rule__NumericType__Group_10__1 )
            // InternalOCCI.g:7749:2: rule__NumericType__Group_10__0__Impl rule__NumericType__Group_10__1
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
    // InternalOCCI.g:7756:1: rule__NumericType__Group_10__0__Impl : ( 'maxInclusive' ) ;
    public final void rule__NumericType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7760:1: ( ( 'maxInclusive' ) )
            // InternalOCCI.g:7761:1: ( 'maxInclusive' )
            {
            // InternalOCCI.g:7761:1: ( 'maxInclusive' )
            // InternalOCCI.g:7762:2: 'maxInclusive'
            {
             before(grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_10_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMaxInclusiveKeyword_10_0()); 

            }


            }

        }
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
    // InternalOCCI.g:7771:1: rule__NumericType__Group_10__1 : rule__NumericType__Group_10__1__Impl ;
    public final void rule__NumericType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7775:1: ( rule__NumericType__Group_10__1__Impl )
            // InternalOCCI.g:7776:2: rule__NumericType__Group_10__1__Impl
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
    // InternalOCCI.g:7782:1: rule__NumericType__Group_10__1__Impl : ( ( rule__NumericType__MaxInclusiveAssignment_10_1 ) ) ;
    public final void rule__NumericType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7786:1: ( ( ( rule__NumericType__MaxInclusiveAssignment_10_1 ) ) )
            // InternalOCCI.g:7787:1: ( ( rule__NumericType__MaxInclusiveAssignment_10_1 ) )
            {
            // InternalOCCI.g:7787:1: ( ( rule__NumericType__MaxInclusiveAssignment_10_1 ) )
            // InternalOCCI.g:7788:2: ( rule__NumericType__MaxInclusiveAssignment_10_1 )
            {
             before(grammarAccess.getNumericTypeAccess().getMaxInclusiveAssignment_10_1()); 
            // InternalOCCI.g:7789:2: ( rule__NumericType__MaxInclusiveAssignment_10_1 )
            // InternalOCCI.g:7789:3: rule__NumericType__MaxInclusiveAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__NumericType__MaxInclusiveAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeAccess().getMaxInclusiveAssignment_10_1()); 

            }


            }

        }
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
    // InternalOCCI.g:7798:1: rule__EnumerationType__Group__0 : rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1 ;
    public final void rule__EnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7802:1: ( rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1 )
            // InternalOCCI.g:7803:2: rule__EnumerationType__Group__0__Impl rule__EnumerationType__Group__1
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
    // InternalOCCI.g:7810:1: rule__EnumerationType__Group__0__Impl : ( 'EnumerationType' ) ;
    public final void rule__EnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7814:1: ( ( 'EnumerationType' ) )
            // InternalOCCI.g:7815:1: ( 'EnumerationType' )
            {
            // InternalOCCI.g:7815:1: ( 'EnumerationType' )
            // InternalOCCI.g:7816:2: 'EnumerationType'
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
    // InternalOCCI.g:7825:1: rule__EnumerationType__Group__1 : rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2 ;
    public final void rule__EnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7829:1: ( rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2 )
            // InternalOCCI.g:7830:2: rule__EnumerationType__Group__1__Impl rule__EnumerationType__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:7837:1: rule__EnumerationType__Group__1__Impl : ( ( rule__EnumerationType__NameAssignment_1 ) ) ;
    public final void rule__EnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7841:1: ( ( ( rule__EnumerationType__NameAssignment_1 ) ) )
            // InternalOCCI.g:7842:1: ( ( rule__EnumerationType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:7842:1: ( ( rule__EnumerationType__NameAssignment_1 ) )
            // InternalOCCI.g:7843:2: ( rule__EnumerationType__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:7844:2: ( rule__EnumerationType__NameAssignment_1 )
            // InternalOCCI.g:7844:3: rule__EnumerationType__NameAssignment_1
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
    // InternalOCCI.g:7852:1: rule__EnumerationType__Group__2 : rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3 ;
    public final void rule__EnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7856:1: ( rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3 )
            // InternalOCCI.g:7857:2: rule__EnumerationType__Group__2__Impl rule__EnumerationType__Group__3
            {
            pushFollow(FOLLOW_48);
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
    // InternalOCCI.g:7864:1: rule__EnumerationType__Group__2__Impl : ( '(' ) ;
    public final void rule__EnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7868:1: ( ( '(' ) )
            // InternalOCCI.g:7869:1: ( '(' )
            {
            // InternalOCCI.g:7869:1: ( '(' )
            // InternalOCCI.g:7870:2: '('
            {
             before(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalOCCI.g:7879:1: rule__EnumerationType__Group__3 : rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4 ;
    public final void rule__EnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7883:1: ( rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4 )
            // InternalOCCI.g:7884:2: rule__EnumerationType__Group__3__Impl rule__EnumerationType__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:7891:1: rule__EnumerationType__Group__3__Impl : ( 'literals' ) ;
    public final void rule__EnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7895:1: ( ( 'literals' ) )
            // InternalOCCI.g:7896:1: ( 'literals' )
            {
            // InternalOCCI.g:7896:1: ( 'literals' )
            // InternalOCCI.g:7897:2: 'literals'
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_3()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getLiteralsKeyword_3()); 

            }


            }

        }
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
    // InternalOCCI.g:7906:1: rule__EnumerationType__Group__4 : rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5 ;
    public final void rule__EnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7910:1: ( rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5 )
            // InternalOCCI.g:7911:2: rule__EnumerationType__Group__4__Impl rule__EnumerationType__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalOCCI.g:7918:1: rule__EnumerationType__Group__4__Impl : ( '(' ) ;
    public final void rule__EnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7922:1: ( ( '(' ) )
            // InternalOCCI.g:7923:1: ( '(' )
            {
            // InternalOCCI.g:7923:1: ( '(' )
            // InternalOCCI.g:7924:2: '('
            {
             before(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_4()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalOCCI.g:7933:1: rule__EnumerationType__Group__5 : rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6 ;
    public final void rule__EnumerationType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7937:1: ( rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6 )
            // InternalOCCI.g:7938:2: rule__EnumerationType__Group__5__Impl rule__EnumerationType__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalOCCI.g:7945:1: rule__EnumerationType__Group__5__Impl : ( ( rule__EnumerationType__LiteralsAssignment_5 ) ) ;
    public final void rule__EnumerationType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7949:1: ( ( ( rule__EnumerationType__LiteralsAssignment_5 ) ) )
            // InternalOCCI.g:7950:1: ( ( rule__EnumerationType__LiteralsAssignment_5 ) )
            {
            // InternalOCCI.g:7950:1: ( ( rule__EnumerationType__LiteralsAssignment_5 ) )
            // InternalOCCI.g:7951:2: ( rule__EnumerationType__LiteralsAssignment_5 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_5()); 
            // InternalOCCI.g:7952:2: ( rule__EnumerationType__LiteralsAssignment_5 )
            // InternalOCCI.g:7952:3: rule__EnumerationType__LiteralsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__LiteralsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_5()); 

            }


            }

        }
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
    // InternalOCCI.g:7960:1: rule__EnumerationType__Group__6 : rule__EnumerationType__Group__6__Impl rule__EnumerationType__Group__7 ;
    public final void rule__EnumerationType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7964:1: ( rule__EnumerationType__Group__6__Impl rule__EnumerationType__Group__7 )
            // InternalOCCI.g:7965:2: rule__EnumerationType__Group__6__Impl rule__EnumerationType__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalOCCI.g:7972:1: rule__EnumerationType__Group__6__Impl : ( ( rule__EnumerationType__Group_6__0 )* ) ;
    public final void rule__EnumerationType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7976:1: ( ( ( rule__EnumerationType__Group_6__0 )* ) )
            // InternalOCCI.g:7977:1: ( ( rule__EnumerationType__Group_6__0 )* )
            {
            // InternalOCCI.g:7977:1: ( ( rule__EnumerationType__Group_6__0 )* )
            // InternalOCCI.g:7978:2: ( rule__EnumerationType__Group_6__0 )*
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup_6()); 
            // InternalOCCI.g:7979:2: ( rule__EnumerationType__Group_6__0 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==69) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalOCCI.g:7979:3: rule__EnumerationType__Group_6__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__EnumerationType__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

             after(grammarAccess.getEnumerationTypeAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalOCCI.g:7987:1: rule__EnumerationType__Group__7 : rule__EnumerationType__Group__7__Impl rule__EnumerationType__Group__8 ;
    public final void rule__EnumerationType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:7991:1: ( rule__EnumerationType__Group__7__Impl rule__EnumerationType__Group__8 )
            // InternalOCCI.g:7992:2: rule__EnumerationType__Group__7__Impl rule__EnumerationType__Group__8
            {
            pushFollow(FOLLOW_44);
            rule__EnumerationType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__8();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:7999:1: rule__EnumerationType__Group__7__Impl : ( ')' ) ;
    public final void rule__EnumerationType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8003:1: ( ( ')' ) )
            // InternalOCCI.g:8004:1: ( ')' )
            {
            // InternalOCCI.g:8004:1: ( ')' )
            // InternalOCCI.g:8005:2: ')'
            {
             before(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_7()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumerationType__Group__8"
    // InternalOCCI.g:8014:1: rule__EnumerationType__Group__8 : rule__EnumerationType__Group__8__Impl rule__EnumerationType__Group__9 ;
    public final void rule__EnumerationType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8018:1: ( rule__EnumerationType__Group__8__Impl rule__EnumerationType__Group__9 )
            // InternalOCCI.g:8019:2: rule__EnumerationType__Group__8__Impl rule__EnumerationType__Group__9
            {
            pushFollow(FOLLOW_44);
            rule__EnumerationType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__8"


    // $ANTLR start "rule__EnumerationType__Group__8__Impl"
    // InternalOCCI.g:8026:1: rule__EnumerationType__Group__8__Impl : ( ( rule__EnumerationType__Group_8__0 )? ) ;
    public final void rule__EnumerationType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8030:1: ( ( ( rule__EnumerationType__Group_8__0 )? ) )
            // InternalOCCI.g:8031:1: ( ( rule__EnumerationType__Group_8__0 )? )
            {
            // InternalOCCI.g:8031:1: ( ( rule__EnumerationType__Group_8__0 )? )
            // InternalOCCI.g:8032:2: ( rule__EnumerationType__Group_8__0 )?
            {
             before(grammarAccess.getEnumerationTypeAccess().getGroup_8()); 
            // InternalOCCI.g:8033:2: ( rule__EnumerationType__Group_8__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==38) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOCCI.g:8033:3: rule__EnumerationType__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationType__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationTypeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__8__Impl"


    // $ANTLR start "rule__EnumerationType__Group__9"
    // InternalOCCI.g:8041:1: rule__EnumerationType__Group__9 : rule__EnumerationType__Group__9__Impl ;
    public final void rule__EnumerationType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8045:1: ( rule__EnumerationType__Group__9__Impl )
            // InternalOCCI.g:8046:2: rule__EnumerationType__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__9"


    // $ANTLR start "rule__EnumerationType__Group__9__Impl"
    // InternalOCCI.g:8052:1: rule__EnumerationType__Group__9__Impl : ( ')' ) ;
    public final void rule__EnumerationType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8056:1: ( ( ')' ) )
            // InternalOCCI.g:8057:1: ( ')' )
            {
            // InternalOCCI.g:8057:1: ( ')' )
            // InternalOCCI.g:8058:2: ')'
            {
             before(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_9()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group__9__Impl"


    // $ANTLR start "rule__EnumerationType__Group_6__0"
    // InternalOCCI.g:8068:1: rule__EnumerationType__Group_6__0 : rule__EnumerationType__Group_6__0__Impl rule__EnumerationType__Group_6__1 ;
    public final void rule__EnumerationType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8072:1: ( rule__EnumerationType__Group_6__0__Impl rule__EnumerationType__Group_6__1 )
            // InternalOCCI.g:8073:2: rule__EnumerationType__Group_6__0__Impl rule__EnumerationType__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__EnumerationType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_6__0"


    // $ANTLR start "rule__EnumerationType__Group_6__0__Impl"
    // InternalOCCI.g:8080:1: rule__EnumerationType__Group_6__0__Impl : ( ',' ) ;
    public final void rule__EnumerationType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8084:1: ( ( ',' ) )
            // InternalOCCI.g:8085:1: ( ',' )
            {
            // InternalOCCI.g:8085:1: ( ',' )
            // InternalOCCI.g:8086:2: ','
            {
             before(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_6_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_6__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group_6__1"
    // InternalOCCI.g:8095:1: rule__EnumerationType__Group_6__1 : rule__EnumerationType__Group_6__1__Impl ;
    public final void rule__EnumerationType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8099:1: ( rule__EnumerationType__Group_6__1__Impl )
            // InternalOCCI.g:8100:2: rule__EnumerationType__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_6__1"


    // $ANTLR start "rule__EnumerationType__Group_6__1__Impl"
    // InternalOCCI.g:8106:1: rule__EnumerationType__Group_6__1__Impl : ( ( rule__EnumerationType__LiteralsAssignment_6_1 ) ) ;
    public final void rule__EnumerationType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8110:1: ( ( ( rule__EnumerationType__LiteralsAssignment_6_1 ) ) )
            // InternalOCCI.g:8111:1: ( ( rule__EnumerationType__LiteralsAssignment_6_1 ) )
            {
            // InternalOCCI.g:8111:1: ( ( rule__EnumerationType__LiteralsAssignment_6_1 ) )
            // InternalOCCI.g:8112:2: ( rule__EnumerationType__LiteralsAssignment_6_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_6_1()); 
            // InternalOCCI.g:8113:2: ( rule__EnumerationType__LiteralsAssignment_6_1 )
            // InternalOCCI.g:8113:3: rule__EnumerationType__LiteralsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__LiteralsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_6__1__Impl"


    // $ANTLR start "rule__EnumerationType__Group_8__0"
    // InternalOCCI.g:8122:1: rule__EnumerationType__Group_8__0 : rule__EnumerationType__Group_8__0__Impl rule__EnumerationType__Group_8__1 ;
    public final void rule__EnumerationType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8126:1: ( rule__EnumerationType__Group_8__0__Impl rule__EnumerationType__Group_8__1 )
            // InternalOCCI.g:8127:2: rule__EnumerationType__Group_8__0__Impl rule__EnumerationType__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationType__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_8__0"


    // $ANTLR start "rule__EnumerationType__Group_8__0__Impl"
    // InternalOCCI.g:8134:1: rule__EnumerationType__Group_8__0__Impl : ( 'documentation' ) ;
    public final void rule__EnumerationType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8138:1: ( ( 'documentation' ) )
            // InternalOCCI.g:8139:1: ( 'documentation' )
            {
            // InternalOCCI.g:8139:1: ( 'documentation' )
            // InternalOCCI.g:8140:2: 'documentation'
            {
             before(grammarAccess.getEnumerationTypeAccess().getDocumentationKeyword_8_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getDocumentationKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_8__0__Impl"


    // $ANTLR start "rule__EnumerationType__Group_8__1"
    // InternalOCCI.g:8149:1: rule__EnumerationType__Group_8__1 : rule__EnumerationType__Group_8__1__Impl ;
    public final void rule__EnumerationType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8153:1: ( rule__EnumerationType__Group_8__1__Impl )
            // InternalOCCI.g:8154:2: rule__EnumerationType__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_8__1"


    // $ANTLR start "rule__EnumerationType__Group_8__1__Impl"
    // InternalOCCI.g:8160:1: rule__EnumerationType__Group_8__1__Impl : ( ( rule__EnumerationType__DocumentationAssignment_8_1 ) ) ;
    public final void rule__EnumerationType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8164:1: ( ( ( rule__EnumerationType__DocumentationAssignment_8_1 ) ) )
            // InternalOCCI.g:8165:1: ( ( rule__EnumerationType__DocumentationAssignment_8_1 ) )
            {
            // InternalOCCI.g:8165:1: ( ( rule__EnumerationType__DocumentationAssignment_8_1 ) )
            // InternalOCCI.g:8166:2: ( rule__EnumerationType__DocumentationAssignment_8_1 )
            {
             before(grammarAccess.getEnumerationTypeAccess().getDocumentationAssignment_8_1()); 
            // InternalOCCI.g:8167:2: ( rule__EnumerationType__DocumentationAssignment_8_1 )
            // InternalOCCI.g:8167:3: rule__EnumerationType__DocumentationAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationType__DocumentationAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationTypeAccess().getDocumentationAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__Group_8__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__0"
    // InternalOCCI.g:8176:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8180:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalOCCI.g:8181:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:8188:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8192:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // InternalOCCI.g:8193:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // InternalOCCI.g:8193:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // InternalOCCI.g:8194:2: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // InternalOCCI.g:8195:2: ( rule__EnumerationLiteral__NameAssignment_0 )
            // InternalOCCI.g:8195:3: rule__EnumerationLiteral__NameAssignment_0
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
    // InternalOCCI.g:8203:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8207:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // InternalOCCI.g:8208:2: rule__EnumerationLiteral__Group__1__Impl
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
    // InternalOCCI.g:8214:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__Group_1__0 )? ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8218:1: ( ( ( rule__EnumerationLiteral__Group_1__0 )? ) )
            // InternalOCCI.g:8219:1: ( ( rule__EnumerationLiteral__Group_1__0 )? )
            {
            // InternalOCCI.g:8219:1: ( ( rule__EnumerationLiteral__Group_1__0 )? )
            // InternalOCCI.g:8220:2: ( rule__EnumerationLiteral__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // InternalOCCI.g:8221:2: ( rule__EnumerationLiteral__Group_1__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==70) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalOCCI.g:8221:3: rule__EnumerationLiteral__Group_1__0
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
    // InternalOCCI.g:8230:1: rule__EnumerationLiteral__Group_1__0 : rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8234:1: ( rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 )
            // InternalOCCI.g:8235:2: rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalOCCI.g:8242:1: rule__EnumerationLiteral__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EnumerationLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8246:1: ( ( '(' ) )
            // InternalOCCI.g:8247:1: ( '(' )
            {
            // InternalOCCI.g:8247:1: ( '(' )
            // InternalOCCI.g:8248:2: '('
            {
             before(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
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
    // InternalOCCI.g:8257:1: rule__EnumerationLiteral__Group_1__1 : rule__EnumerationLiteral__Group_1__1__Impl rule__EnumerationLiteral__Group_1__2 ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8261:1: ( rule__EnumerationLiteral__Group_1__1__Impl rule__EnumerationLiteral__Group_1__2 )
            // InternalOCCI.g:8262:2: rule__EnumerationLiteral__Group_1__1__Impl rule__EnumerationLiteral__Group_1__2
            {
            pushFollow(FOLLOW_50);
            rule__EnumerationLiteral__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:8269:1: rule__EnumerationLiteral__Group_1__1__Impl : ( ( rule__EnumerationLiteral__Group_1_1__0 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8273:1: ( ( ( rule__EnumerationLiteral__Group_1_1__0 ) ) )
            // InternalOCCI.g:8274:1: ( ( rule__EnumerationLiteral__Group_1_1__0 ) )
            {
            // InternalOCCI.g:8274:1: ( ( rule__EnumerationLiteral__Group_1_1__0 ) )
            // InternalOCCI.g:8275:2: ( rule__EnumerationLiteral__Group_1_1__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1_1()); 
            // InternalOCCI.g:8276:2: ( rule__EnumerationLiteral__Group_1_1__0 )
            // InternalOCCI.g:8276:3: rule__EnumerationLiteral__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumerationLiteral__Group_1__2"
    // InternalOCCI.g:8284:1: rule__EnumerationLiteral__Group_1__2 : rule__EnumerationLiteral__Group_1__2__Impl ;
    public final void rule__EnumerationLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8288:1: ( rule__EnumerationLiteral__Group_1__2__Impl )
            // InternalOCCI.g:8289:2: rule__EnumerationLiteral__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__2"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__2__Impl"
    // InternalOCCI.g:8295:1: rule__EnumerationLiteral__Group_1__2__Impl : ( ')' ) ;
    public final void rule__EnumerationLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8299:1: ( ( ')' ) )
            // InternalOCCI.g:8300:1: ( ')' )
            {
            // InternalOCCI.g:8300:1: ( ')' )
            // InternalOCCI.g:8301:2: ')'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_1_2()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group_1_1__0"
    // InternalOCCI.g:8311:1: rule__EnumerationLiteral__Group_1_1__0 : rule__EnumerationLiteral__Group_1_1__0__Impl rule__EnumerationLiteral__Group_1_1__1 ;
    public final void rule__EnumerationLiteral__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8315:1: ( rule__EnumerationLiteral__Group_1_1__0__Impl rule__EnumerationLiteral__Group_1_1__1 )
            // InternalOCCI.g:8316:2: rule__EnumerationLiteral__Group_1_1__0__Impl rule__EnumerationLiteral__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationLiteral__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1_1__0"


    // $ANTLR start "rule__EnumerationLiteral__Group_1_1__0__Impl"
    // InternalOCCI.g:8323:1: rule__EnumerationLiteral__Group_1_1__0__Impl : ( 'documentation' ) ;
    public final void rule__EnumerationLiteral__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8327:1: ( ( 'documentation' ) )
            // InternalOCCI.g:8328:1: ( 'documentation' )
            {
            // InternalOCCI.g:8328:1: ( 'documentation' )
            // InternalOCCI.g:8329:2: 'documentation'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getDocumentationKeyword_1_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getDocumentationKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1_1__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group_1_1__1"
    // InternalOCCI.g:8338:1: rule__EnumerationLiteral__Group_1_1__1 : rule__EnumerationLiteral__Group_1_1__1__Impl ;
    public final void rule__EnumerationLiteral__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8342:1: ( rule__EnumerationLiteral__Group_1_1__1__Impl )
            // InternalOCCI.g:8343:2: rule__EnumerationLiteral__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1_1__1"


    // $ANTLR start "rule__EnumerationLiteral__Group_1_1__1__Impl"
    // InternalOCCI.g:8349:1: rule__EnumerationLiteral__Group_1_1__1__Impl : ( ( rule__EnumerationLiteral__DocumentationAssignment_1_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8353:1: ( ( ( rule__EnumerationLiteral__DocumentationAssignment_1_1_1 ) ) )
            // InternalOCCI.g:8354:1: ( ( rule__EnumerationLiteral__DocumentationAssignment_1_1_1 ) )
            {
            // InternalOCCI.g:8354:1: ( ( rule__EnumerationLiteral__DocumentationAssignment_1_1_1 ) )
            // InternalOCCI.g:8355:2: ( rule__EnumerationLiteral__DocumentationAssignment_1_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getDocumentationAssignment_1_1_1()); 
            // InternalOCCI.g:8356:2: ( rule__EnumerationLiteral__DocumentationAssignment_1_1_1 )
            // InternalOCCI.g:8356:3: rule__EnumerationLiteral__DocumentationAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__DocumentationAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getDocumentationAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1_1__1__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // InternalOCCI.g:8365:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8369:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // InternalOCCI.g:8370:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
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
    // InternalOCCI.g:8377:1: rule__RecordType__Group__0__Impl : ( 'RecordType' ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8381:1: ( ( 'RecordType' ) )
            // InternalOCCI.g:8382:1: ( 'RecordType' )
            {
            // InternalOCCI.g:8382:1: ( 'RecordType' )
            // InternalOCCI.g:8383:2: 'RecordType'
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
    // InternalOCCI.g:8392:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8396:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // InternalOCCI.g:8397:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:8404:1: rule__RecordType__Group__1__Impl : ( ( rule__RecordType__NameAssignment_1 ) ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8408:1: ( ( ( rule__RecordType__NameAssignment_1 ) ) )
            // InternalOCCI.g:8409:1: ( ( rule__RecordType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:8409:1: ( ( rule__RecordType__NameAssignment_1 ) )
            // InternalOCCI.g:8410:2: ( rule__RecordType__NameAssignment_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:8411:2: ( rule__RecordType__NameAssignment_1 )
            // InternalOCCI.g:8411:3: rule__RecordType__NameAssignment_1
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
    // InternalOCCI.g:8419:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8423:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // InternalOCCI.g:8424:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalOCCI.g:8431:1: rule__RecordType__Group__2__Impl : ( '(' ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8435:1: ( ( '(' ) )
            // InternalOCCI.g:8436:1: ( '(' )
            {
            // InternalOCCI.g:8436:1: ( '(' )
            // InternalOCCI.g:8437:2: '('
            {
             before(grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalOCCI.g:8446:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8450:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // InternalOCCI.g:8451:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalOCCI.g:8458:1: rule__RecordType__Group__3__Impl : ( ( rule__RecordType__Group_3__0 )? ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8462:1: ( ( ( rule__RecordType__Group_3__0 )? ) )
            // InternalOCCI.g:8463:1: ( ( rule__RecordType__Group_3__0 )? )
            {
            // InternalOCCI.g:8463:1: ( ( rule__RecordType__Group_3__0 )? )
            // InternalOCCI.g:8464:2: ( rule__RecordType__Group_3__0 )?
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_3()); 
            // InternalOCCI.g:8465:2: ( rule__RecordType__Group_3__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalOCCI.g:8465:3: rule__RecordType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordTypeAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalOCCI.g:8473:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8477:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // InternalOCCI.g:8478:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
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
    // InternalOCCI.g:8485:1: rule__RecordType__Group__4__Impl : ( 'fields' ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8489:1: ( ( 'fields' ) )
            // InternalOCCI.g:8490:1: ( 'fields' )
            {
            // InternalOCCI.g:8490:1: ( 'fields' )
            // InternalOCCI.g:8491:2: 'fields'
            {
             before(grammarAccess.getRecordTypeAccess().getFieldsKeyword_4()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getFieldsKeyword_4()); 

            }


            }

        }
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
    // InternalOCCI.g:8500:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8504:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // InternalOCCI.g:8505:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_52);
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
    // InternalOCCI.g:8512:1: rule__RecordType__Group__5__Impl : ( '(' ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8516:1: ( ( '(' ) )
            // InternalOCCI.g:8517:1: ( '(' )
            {
            // InternalOCCI.g:8517:1: ( '(' )
            // InternalOCCI.g:8518:2: '('
            {
             before(grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_5()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
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
    // InternalOCCI.g:8527:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8531:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // InternalOCCI.g:8532:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalOCCI.g:8539:1: rule__RecordType__Group__6__Impl : ( ( rule__RecordType__RecordFieldsAssignment_6 ) ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8543:1: ( ( ( rule__RecordType__RecordFieldsAssignment_6 ) ) )
            // InternalOCCI.g:8544:1: ( ( rule__RecordType__RecordFieldsAssignment_6 ) )
            {
            // InternalOCCI.g:8544:1: ( ( rule__RecordType__RecordFieldsAssignment_6 ) )
            // InternalOCCI.g:8545:2: ( rule__RecordType__RecordFieldsAssignment_6 )
            {
             before(grammarAccess.getRecordTypeAccess().getRecordFieldsAssignment_6()); 
            // InternalOCCI.g:8546:2: ( rule__RecordType__RecordFieldsAssignment_6 )
            // InternalOCCI.g:8546:3: rule__RecordType__RecordFieldsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__RecordFieldsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getRecordFieldsAssignment_6()); 

            }


            }

        }
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
    // InternalOCCI.g:8554:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl rule__RecordType__Group__8 ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8558:1: ( rule__RecordType__Group__7__Impl rule__RecordType__Group__8 )
            // InternalOCCI.g:8559:2: rule__RecordType__Group__7__Impl rule__RecordType__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__RecordType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__8();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:8566:1: rule__RecordType__Group__7__Impl : ( ( rule__RecordType__Group_7__0 )* ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8570:1: ( ( ( rule__RecordType__Group_7__0 )* ) )
            // InternalOCCI.g:8571:1: ( ( rule__RecordType__Group_7__0 )* )
            {
            // InternalOCCI.g:8571:1: ( ( rule__RecordType__Group_7__0 )* )
            // InternalOCCI.g:8572:2: ( rule__RecordType__Group_7__0 )*
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_7()); 
            // InternalOCCI.g:8573:2: ( rule__RecordType__Group_7__0 )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==69) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalOCCI.g:8573:3: rule__RecordType__Group_7__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__RecordType__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

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


    // $ANTLR start "rule__RecordType__Group__8"
    // InternalOCCI.g:8581:1: rule__RecordType__Group__8 : rule__RecordType__Group__8__Impl rule__RecordType__Group__9 ;
    public final void rule__RecordType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8585:1: ( rule__RecordType__Group__8__Impl rule__RecordType__Group__9 )
            // InternalOCCI.g:8586:2: rule__RecordType__Group__8__Impl rule__RecordType__Group__9
            {
            pushFollow(FOLLOW_50);
            rule__RecordType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__8"


    // $ANTLR start "rule__RecordType__Group__8__Impl"
    // InternalOCCI.g:8593:1: rule__RecordType__Group__8__Impl : ( ')' ) ;
    public final void rule__RecordType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8597:1: ( ( ')' ) )
            // InternalOCCI.g:8598:1: ( ')' )
            {
            // InternalOCCI.g:8598:1: ( ')' )
            // InternalOCCI.g:8599:2: ')'
            {
             before(grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_8()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__8__Impl"


    // $ANTLR start "rule__RecordType__Group__9"
    // InternalOCCI.g:8608:1: rule__RecordType__Group__9 : rule__RecordType__Group__9__Impl ;
    public final void rule__RecordType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8612:1: ( rule__RecordType__Group__9__Impl )
            // InternalOCCI.g:8613:2: rule__RecordType__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__9"


    // $ANTLR start "rule__RecordType__Group__9__Impl"
    // InternalOCCI.g:8619:1: rule__RecordType__Group__9__Impl : ( ')' ) ;
    public final void rule__RecordType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8623:1: ( ( ')' ) )
            // InternalOCCI.g:8624:1: ( ')' )
            {
            // InternalOCCI.g:8624:1: ( ')' )
            // InternalOCCI.g:8625:2: ')'
            {
             before(grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_9()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__9__Impl"


    // $ANTLR start "rule__RecordType__Group_3__0"
    // InternalOCCI.g:8635:1: rule__RecordType__Group_3__0 : rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 ;
    public final void rule__RecordType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8639:1: ( rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 )
            // InternalOCCI.g:8640:2: rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__RecordType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__0"


    // $ANTLR start "rule__RecordType__Group_3__0__Impl"
    // InternalOCCI.g:8647:1: rule__RecordType__Group_3__0__Impl : ( 'documentation' ) ;
    public final void rule__RecordType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8651:1: ( ( 'documentation' ) )
            // InternalOCCI.g:8652:1: ( 'documentation' )
            {
            // InternalOCCI.g:8652:1: ( 'documentation' )
            // InternalOCCI.g:8653:2: 'documentation'
            {
             before(grammarAccess.getRecordTypeAccess().getDocumentationKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getDocumentationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__0__Impl"


    // $ANTLR start "rule__RecordType__Group_3__1"
    // InternalOCCI.g:8662:1: rule__RecordType__Group_3__1 : rule__RecordType__Group_3__1__Impl ;
    public final void rule__RecordType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8666:1: ( rule__RecordType__Group_3__1__Impl )
            // InternalOCCI.g:8667:2: rule__RecordType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__1"


    // $ANTLR start "rule__RecordType__Group_3__1__Impl"
    // InternalOCCI.g:8673:1: rule__RecordType__Group_3__1__Impl : ( ( rule__RecordType__DocumentationAssignment_3_1 ) ) ;
    public final void rule__RecordType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8677:1: ( ( ( rule__RecordType__DocumentationAssignment_3_1 ) ) )
            // InternalOCCI.g:8678:1: ( ( rule__RecordType__DocumentationAssignment_3_1 ) )
            {
            // InternalOCCI.g:8678:1: ( ( rule__RecordType__DocumentationAssignment_3_1 ) )
            // InternalOCCI.g:8679:2: ( rule__RecordType__DocumentationAssignment_3_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getDocumentationAssignment_3_1()); 
            // InternalOCCI.g:8680:2: ( rule__RecordType__DocumentationAssignment_3_1 )
            // InternalOCCI.g:8680:3: rule__RecordType__DocumentationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__DocumentationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getDocumentationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__1__Impl"


    // $ANTLR start "rule__RecordType__Group_7__0"
    // InternalOCCI.g:8689:1: rule__RecordType__Group_7__0 : rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 ;
    public final void rule__RecordType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8693:1: ( rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 )
            // InternalOCCI.g:8694:2: rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalOCCI.g:8701:1: rule__RecordType__Group_7__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8705:1: ( ( ',' ) )
            // InternalOCCI.g:8706:1: ( ',' )
            {
            // InternalOCCI.g:8706:1: ( ',' )
            // InternalOCCI.g:8707:2: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_7_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_7_0()); 

            }


            }

        }
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
    // InternalOCCI.g:8716:1: rule__RecordType__Group_7__1 : rule__RecordType__Group_7__1__Impl ;
    public final void rule__RecordType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8720:1: ( rule__RecordType__Group_7__1__Impl )
            // InternalOCCI.g:8721:2: rule__RecordType__Group_7__1__Impl
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
    // InternalOCCI.g:8727:1: rule__RecordType__Group_7__1__Impl : ( ( rule__RecordType__RecordFieldsAssignment_7_1 ) ) ;
    public final void rule__RecordType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8731:1: ( ( ( rule__RecordType__RecordFieldsAssignment_7_1 ) ) )
            // InternalOCCI.g:8732:1: ( ( rule__RecordType__RecordFieldsAssignment_7_1 ) )
            {
            // InternalOCCI.g:8732:1: ( ( rule__RecordType__RecordFieldsAssignment_7_1 ) )
            // InternalOCCI.g:8733:2: ( rule__RecordType__RecordFieldsAssignment_7_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getRecordFieldsAssignment_7_1()); 
            // InternalOCCI.g:8734:2: ( rule__RecordType__RecordFieldsAssignment_7_1 )
            // InternalOCCI.g:8734:3: rule__RecordType__RecordFieldsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__RecordFieldsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getRecordFieldsAssignment_7_1()); 

            }


            }

        }
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
    // InternalOCCI.g:8743:1: rule__RecordField__Group__0 : rule__RecordField__Group__0__Impl rule__RecordField__Group__1 ;
    public final void rule__RecordField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8747:1: ( rule__RecordField__Group__0__Impl rule__RecordField__Group__1 )
            // InternalOCCI.g:8748:2: rule__RecordField__Group__0__Impl rule__RecordField__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:8755:1: rule__RecordField__Group__0__Impl : ( 'field' ) ;
    public final void rule__RecordField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8759:1: ( ( 'field' ) )
            // InternalOCCI.g:8760:1: ( 'field' )
            {
            // InternalOCCI.g:8760:1: ( 'field' )
            // InternalOCCI.g:8761:2: 'field'
            {
             before(grammarAccess.getRecordFieldAccess().getFieldKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getFieldKeyword_0()); 

            }


            }

        }
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
    // InternalOCCI.g:8770:1: rule__RecordField__Group__1 : rule__RecordField__Group__1__Impl rule__RecordField__Group__2 ;
    public final void rule__RecordField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8774:1: ( rule__RecordField__Group__1__Impl rule__RecordField__Group__2 )
            // InternalOCCI.g:8775:2: rule__RecordField__Group__1__Impl rule__RecordField__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:8782:1: rule__RecordField__Group__1__Impl : ( ( rule__RecordField__MutableAssignment_1 )? ) ;
    public final void rule__RecordField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8786:1: ( ( ( rule__RecordField__MutableAssignment_1 )? ) )
            // InternalOCCI.g:8787:1: ( ( rule__RecordField__MutableAssignment_1 )? )
            {
            // InternalOCCI.g:8787:1: ( ( rule__RecordField__MutableAssignment_1 )? )
            // InternalOCCI.g:8788:2: ( rule__RecordField__MutableAssignment_1 )?
            {
             before(grammarAccess.getRecordFieldAccess().getMutableAssignment_1()); 
            // InternalOCCI.g:8789:2: ( rule__RecordField__MutableAssignment_1 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==31) ) {
                int LA71_1 = input.LA(2);

                if ( ((LA71_1>=RULE_ID && LA71_1<=RULE_QUALIFIED_ID)||(LA71_1>=13 && LA71_1<=64)) ) {
                    alt71=1;
                }
            }
            switch (alt71) {
                case 1 :
                    // InternalOCCI.g:8789:3: rule__RecordField__MutableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordField__MutableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordFieldAccess().getMutableAssignment_1()); 

            }


            }

        }
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
    // InternalOCCI.g:8797:1: rule__RecordField__Group__2 : rule__RecordField__Group__2__Impl rule__RecordField__Group__3 ;
    public final void rule__RecordField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8801:1: ( rule__RecordField__Group__2__Impl rule__RecordField__Group__3 )
            // InternalOCCI.g:8802:2: rule__RecordField__Group__2__Impl rule__RecordField__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:8809:1: rule__RecordField__Group__2__Impl : ( ( rule__RecordField__RequiredAssignment_2 )? ) ;
    public final void rule__RecordField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8813:1: ( ( ( rule__RecordField__RequiredAssignment_2 )? ) )
            // InternalOCCI.g:8814:1: ( ( rule__RecordField__RequiredAssignment_2 )? )
            {
            // InternalOCCI.g:8814:1: ( ( rule__RecordField__RequiredAssignment_2 )? )
            // InternalOCCI.g:8815:2: ( rule__RecordField__RequiredAssignment_2 )?
            {
             before(grammarAccess.getRecordFieldAccess().getRequiredAssignment_2()); 
            // InternalOCCI.g:8816:2: ( rule__RecordField__RequiredAssignment_2 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==32) ) {
                int LA72_1 = input.LA(2);

                if ( ((LA72_1>=RULE_ID && LA72_1<=RULE_QUALIFIED_ID)||(LA72_1>=13 && LA72_1<=64)) ) {
                    alt72=1;
                }
            }
            switch (alt72) {
                case 1 :
                    // InternalOCCI.g:8816:3: rule__RecordField__RequiredAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordField__RequiredAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordFieldAccess().getRequiredAssignment_2()); 

            }


            }

        }
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
    // InternalOCCI.g:8824:1: rule__RecordField__Group__3 : rule__RecordField__Group__3__Impl rule__RecordField__Group__4 ;
    public final void rule__RecordField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8828:1: ( rule__RecordField__Group__3__Impl rule__RecordField__Group__4 )
            // InternalOCCI.g:8829:2: rule__RecordField__Group__3__Impl rule__RecordField__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalOCCI.g:8836:1: rule__RecordField__Group__3__Impl : ( ( rule__RecordField__NameAssignment_3 ) ) ;
    public final void rule__RecordField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8840:1: ( ( ( rule__RecordField__NameAssignment_3 ) ) )
            // InternalOCCI.g:8841:1: ( ( rule__RecordField__NameAssignment_3 ) )
            {
            // InternalOCCI.g:8841:1: ( ( rule__RecordField__NameAssignment_3 ) )
            // InternalOCCI.g:8842:2: ( rule__RecordField__NameAssignment_3 )
            {
             before(grammarAccess.getRecordFieldAccess().getNameAssignment_3()); 
            // InternalOCCI.g:8843:2: ( rule__RecordField__NameAssignment_3 )
            // InternalOCCI.g:8843:3: rule__RecordField__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalOCCI.g:8851:1: rule__RecordField__Group__4 : rule__RecordField__Group__4__Impl rule__RecordField__Group__5 ;
    public final void rule__RecordField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8855:1: ( rule__RecordField__Group__4__Impl rule__RecordField__Group__5 )
            // InternalOCCI.g:8856:2: rule__RecordField__Group__4__Impl rule__RecordField__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalOCCI.g:8863:1: rule__RecordField__Group__4__Impl : ( ':' ) ;
    public final void rule__RecordField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8867:1: ( ( ':' ) )
            // InternalOCCI.g:8868:1: ( ':' )
            {
            // InternalOCCI.g:8868:1: ( ':' )
            // InternalOCCI.g:8869:2: ':'
            {
             before(grammarAccess.getRecordFieldAccess().getColonKeyword_4()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getColonKeyword_4()); 

            }


            }

        }
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
    // InternalOCCI.g:8878:1: rule__RecordField__Group__5 : rule__RecordField__Group__5__Impl rule__RecordField__Group__6 ;
    public final void rule__RecordField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8882:1: ( rule__RecordField__Group__5__Impl rule__RecordField__Group__6 )
            // InternalOCCI.g:8883:2: rule__RecordField__Group__5__Impl rule__RecordField__Group__6
            {
            pushFollow(FOLLOW_53);
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
    // InternalOCCI.g:8890:1: rule__RecordField__Group__5__Impl : ( ( rule__RecordField__Group_5__0 ) ) ;
    public final void rule__RecordField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8894:1: ( ( ( rule__RecordField__Group_5__0 ) ) )
            // InternalOCCI.g:8895:1: ( ( rule__RecordField__Group_5__0 ) )
            {
            // InternalOCCI.g:8895:1: ( ( rule__RecordField__Group_5__0 ) )
            // InternalOCCI.g:8896:2: ( rule__RecordField__Group_5__0 )
            {
             before(grammarAccess.getRecordFieldAccess().getGroup_5()); 
            // InternalOCCI.g:8897:2: ( rule__RecordField__Group_5__0 )
            // InternalOCCI.g:8897:3: rule__RecordField__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_5__0();

            state._fsp--;


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
    // InternalOCCI.g:8905:1: rule__RecordField__Group__6 : rule__RecordField__Group__6__Impl rule__RecordField__Group__7 ;
    public final void rule__RecordField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8909:1: ( rule__RecordField__Group__6__Impl rule__RecordField__Group__7 )
            // InternalOCCI.g:8910:2: rule__RecordField__Group__6__Impl rule__RecordField__Group__7
            {
            pushFollow(FOLLOW_53);
            rule__RecordField__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group__7();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:8917:1: rule__RecordField__Group__6__Impl : ( ( rule__RecordField__Group_6__0 )? ) ;
    public final void rule__RecordField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8921:1: ( ( ( rule__RecordField__Group_6__0 )? ) )
            // InternalOCCI.g:8922:1: ( ( rule__RecordField__Group_6__0 )? )
            {
            // InternalOCCI.g:8922:1: ( ( rule__RecordField__Group_6__0 )? )
            // InternalOCCI.g:8923:2: ( rule__RecordField__Group_6__0 )?
            {
             before(grammarAccess.getRecordFieldAccess().getGroup_6()); 
            // InternalOCCI.g:8924:2: ( rule__RecordField__Group_6__0 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==72) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalOCCI.g:8924:3: rule__RecordField__Group_6__0
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


    // $ANTLR start "rule__RecordField__Group__7"
    // InternalOCCI.g:8932:1: rule__RecordField__Group__7 : rule__RecordField__Group__7__Impl rule__RecordField__Group__8 ;
    public final void rule__RecordField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8936:1: ( rule__RecordField__Group__7__Impl rule__RecordField__Group__8 )
            // InternalOCCI.g:8937:2: rule__RecordField__Group__7__Impl rule__RecordField__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__RecordField__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__7"


    // $ANTLR start "rule__RecordField__Group__7__Impl"
    // InternalOCCI.g:8944:1: rule__RecordField__Group__7__Impl : ( ( rule__RecordField__Group_7__0 ) ) ;
    public final void rule__RecordField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8948:1: ( ( ( rule__RecordField__Group_7__0 ) ) )
            // InternalOCCI.g:8949:1: ( ( rule__RecordField__Group_7__0 ) )
            {
            // InternalOCCI.g:8949:1: ( ( rule__RecordField__Group_7__0 ) )
            // InternalOCCI.g:8950:2: ( rule__RecordField__Group_7__0 )
            {
             before(grammarAccess.getRecordFieldAccess().getGroup_7()); 
            // InternalOCCI.g:8951:2: ( rule__RecordField__Group_7__0 )
            // InternalOCCI.g:8951:3: rule__RecordField__Group_7__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__7__Impl"


    // $ANTLR start "rule__RecordField__Group__8"
    // InternalOCCI.g:8959:1: rule__RecordField__Group__8 : rule__RecordField__Group__8__Impl ;
    public final void rule__RecordField__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8963:1: ( rule__RecordField__Group__8__Impl )
            // InternalOCCI.g:8964:2: rule__RecordField__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__8"


    // $ANTLR start "rule__RecordField__Group__8__Impl"
    // InternalOCCI.g:8970:1: rule__RecordField__Group__8__Impl : ( ( rule__RecordField__Group_8__0 )? ) ;
    public final void rule__RecordField__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8974:1: ( ( ( rule__RecordField__Group_8__0 )? ) )
            // InternalOCCI.g:8975:1: ( ( rule__RecordField__Group_8__0 )? )
            {
            // InternalOCCI.g:8975:1: ( ( rule__RecordField__Group_8__0 )? )
            // InternalOCCI.g:8976:2: ( rule__RecordField__Group_8__0 )?
            {
             before(grammarAccess.getRecordFieldAccess().getGroup_8()); 
            // InternalOCCI.g:8977:2: ( rule__RecordField__Group_8__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==21) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalOCCI.g:8977:3: rule__RecordField__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordField__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordFieldAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group__8__Impl"


    // $ANTLR start "rule__RecordField__Group_5__0"
    // InternalOCCI.g:8986:1: rule__RecordField__Group_5__0 : rule__RecordField__Group_5__0__Impl rule__RecordField__Group_5__1 ;
    public final void rule__RecordField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:8990:1: ( rule__RecordField__Group_5__0__Impl rule__RecordField__Group_5__1 )
            // InternalOCCI.g:8991:2: rule__RecordField__Group_5__0__Impl rule__RecordField__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:8998:1: rule__RecordField__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__RecordField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9002:1: ( ( 'type' ) )
            // InternalOCCI.g:9003:1: ( 'type' )
            {
            // InternalOCCI.g:9003:1: ( 'type' )
            // InternalOCCI.g:9004:2: 'type'
            {
             before(grammarAccess.getRecordFieldAccess().getTypeKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getTypeKeyword_5_0()); 

            }


            }

        }
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
    // InternalOCCI.g:9013:1: rule__RecordField__Group_5__1 : rule__RecordField__Group_5__1__Impl ;
    public final void rule__RecordField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9017:1: ( rule__RecordField__Group_5__1__Impl )
            // InternalOCCI.g:9018:2: rule__RecordField__Group_5__1__Impl
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
    // InternalOCCI.g:9024:1: rule__RecordField__Group_5__1__Impl : ( ( rule__RecordField__TypeAssignment_5_1 ) ) ;
    public final void rule__RecordField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9028:1: ( ( ( rule__RecordField__TypeAssignment_5_1 ) ) )
            // InternalOCCI.g:9029:1: ( ( rule__RecordField__TypeAssignment_5_1 ) )
            {
            // InternalOCCI.g:9029:1: ( ( rule__RecordField__TypeAssignment_5_1 ) )
            // InternalOCCI.g:9030:2: ( rule__RecordField__TypeAssignment_5_1 )
            {
             before(grammarAccess.getRecordFieldAccess().getTypeAssignment_5_1()); 
            // InternalOCCI.g:9031:2: ( rule__RecordField__TypeAssignment_5_1 )
            // InternalOCCI.g:9031:3: rule__RecordField__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getTypeAssignment_5_1()); 

            }


            }

        }
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
    // InternalOCCI.g:9040:1: rule__RecordField__Group_6__0 : rule__RecordField__Group_6__0__Impl rule__RecordField__Group_6__1 ;
    public final void rule__RecordField__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9044:1: ( rule__RecordField__Group_6__0__Impl rule__RecordField__Group_6__1 )
            // InternalOCCI.g:9045:2: rule__RecordField__Group_6__0__Impl rule__RecordField__Group_6__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalOCCI.g:9052:1: rule__RecordField__Group_6__0__Impl : ( '=' ) ;
    public final void rule__RecordField__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9056:1: ( ( '=' ) )
            // InternalOCCI.g:9057:1: ( '=' )
            {
            // InternalOCCI.g:9057:1: ( '=' )
            // InternalOCCI.g:9058:2: '='
            {
             before(grammarAccess.getRecordFieldAccess().getEqualsSignKeyword_6_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getEqualsSignKeyword_6_0()); 

            }


            }

        }
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
    // InternalOCCI.g:9067:1: rule__RecordField__Group_6__1 : rule__RecordField__Group_6__1__Impl ;
    public final void rule__RecordField__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9071:1: ( rule__RecordField__Group_6__1__Impl )
            // InternalOCCI.g:9072:2: rule__RecordField__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:9078:1: rule__RecordField__Group_6__1__Impl : ( ( rule__RecordField__DefaultAssignment_6_1 ) ) ;
    public final void rule__RecordField__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9082:1: ( ( ( rule__RecordField__DefaultAssignment_6_1 ) ) )
            // InternalOCCI.g:9083:1: ( ( rule__RecordField__DefaultAssignment_6_1 ) )
            {
            // InternalOCCI.g:9083:1: ( ( rule__RecordField__DefaultAssignment_6_1 ) )
            // InternalOCCI.g:9084:2: ( rule__RecordField__DefaultAssignment_6_1 )
            {
             before(grammarAccess.getRecordFieldAccess().getDefaultAssignment_6_1()); 
            // InternalOCCI.g:9085:2: ( rule__RecordField__DefaultAssignment_6_1 )
            // InternalOCCI.g:9085:3: rule__RecordField__DefaultAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__DefaultAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getDefaultAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RecordField__Group_7__0"
    // InternalOCCI.g:9094:1: rule__RecordField__Group_7__0 : rule__RecordField__Group_7__0__Impl rule__RecordField__Group_7__1 ;
    public final void rule__RecordField__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9098:1: ( rule__RecordField__Group_7__0__Impl rule__RecordField__Group_7__1 )
            // InternalOCCI.g:9099:2: rule__RecordField__Group_7__0__Impl rule__RecordField__Group_7__1
            {
            pushFollow(FOLLOW_30);
            rule__RecordField__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_7__0"


    // $ANTLR start "rule__RecordField__Group_7__0__Impl"
    // InternalOCCI.g:9106:1: rule__RecordField__Group_7__0__Impl : ( '{' ) ;
    public final void rule__RecordField__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9110:1: ( ( '{' ) )
            // InternalOCCI.g:9111:1: ( '{' )
            {
            // InternalOCCI.g:9111:1: ( '{' )
            // InternalOCCI.g:9112:2: '{'
            {
             before(grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_7__0__Impl"


    // $ANTLR start "rule__RecordField__Group_7__1"
    // InternalOCCI.g:9121:1: rule__RecordField__Group_7__1 : rule__RecordField__Group_7__1__Impl rule__RecordField__Group_7__2 ;
    public final void rule__RecordField__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9125:1: ( rule__RecordField__Group_7__1__Impl rule__RecordField__Group_7__2 )
            // InternalOCCI.g:9126:2: rule__RecordField__Group_7__1__Impl rule__RecordField__Group_7__2
            {
            pushFollow(FOLLOW_30);
            rule__RecordField__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_7__1"


    // $ANTLR start "rule__RecordField__Group_7__1__Impl"
    // InternalOCCI.g:9133:1: rule__RecordField__Group_7__1__Impl : ( ( rule__RecordField__Group_7_1__0 )? ) ;
    public final void rule__RecordField__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9137:1: ( ( ( rule__RecordField__Group_7_1__0 )? ) )
            // InternalOCCI.g:9138:1: ( ( rule__RecordField__Group_7_1__0 )? )
            {
            // InternalOCCI.g:9138:1: ( ( rule__RecordField__Group_7_1__0 )? )
            // InternalOCCI.g:9139:2: ( rule__RecordField__Group_7_1__0 )?
            {
             before(grammarAccess.getRecordFieldAccess().getGroup_7_1()); 
            // InternalOCCI.g:9140:2: ( rule__RecordField__Group_7_1__0 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==14) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalOCCI.g:9140:3: rule__RecordField__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RecordField__Group_7_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecordFieldAccess().getGroup_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_7__1__Impl"


    // $ANTLR start "rule__RecordField__Group_7__2"
    // InternalOCCI.g:9148:1: rule__RecordField__Group_7__2 : rule__RecordField__Group_7__2__Impl ;
    public final void rule__RecordField__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9152:1: ( rule__RecordField__Group_7__2__Impl )
            // InternalOCCI.g:9153:2: rule__RecordField__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_7__2"


    // $ANTLR start "rule__RecordField__Group_7__2__Impl"
    // InternalOCCI.g:9159:1: rule__RecordField__Group_7__2__Impl : ( '}' ) ;
    public final void rule__RecordField__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9163:1: ( ( '}' ) )
            // InternalOCCI.g:9164:1: ( '}' )
            {
            // InternalOCCI.g:9164:1: ( '}' )
            // InternalOCCI.g:9165:2: '}'
            {
             before(grammarAccess.getRecordFieldAccess().getRightCurlyBracketKeyword_7_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getRightCurlyBracketKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_7__2__Impl"


    // $ANTLR start "rule__RecordField__Group_7_1__0"
    // InternalOCCI.g:9175:1: rule__RecordField__Group_7_1__0 : rule__RecordField__Group_7_1__0__Impl rule__RecordField__Group_7_1__1 ;
    public final void rule__RecordField__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9179:1: ( rule__RecordField__Group_7_1__0__Impl rule__RecordField__Group_7_1__1 )
            // InternalOCCI.g:9180:2: rule__RecordField__Group_7_1__0__Impl rule__RecordField__Group_7_1__1
            {
            pushFollow(FOLLOW_5);
            rule__RecordField__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_7_1__0"


    // $ANTLR start "rule__RecordField__Group_7_1__0__Impl"
    // InternalOCCI.g:9187:1: rule__RecordField__Group_7_1__0__Impl : ( 'description' ) ;
    public final void rule__RecordField__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9191:1: ( ( 'description' ) )
            // InternalOCCI.g:9192:1: ( 'description' )
            {
            // InternalOCCI.g:9192:1: ( 'description' )
            // InternalOCCI.g:9193:2: 'description'
            {
             before(grammarAccess.getRecordFieldAccess().getDescriptionKeyword_7_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getDescriptionKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_7_1__0__Impl"


    // $ANTLR start "rule__RecordField__Group_7_1__1"
    // InternalOCCI.g:9202:1: rule__RecordField__Group_7_1__1 : rule__RecordField__Group_7_1__1__Impl ;
    public final void rule__RecordField__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9206:1: ( rule__RecordField__Group_7_1__1__Impl )
            // InternalOCCI.g:9207:2: rule__RecordField__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_7_1__1"


    // $ANTLR start "rule__RecordField__Group_7_1__1__Impl"
    // InternalOCCI.g:9213:1: rule__RecordField__Group_7_1__1__Impl : ( ( rule__RecordField__DescriptionAssignment_7_1_1 ) ) ;
    public final void rule__RecordField__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9217:1: ( ( ( rule__RecordField__DescriptionAssignment_7_1_1 ) ) )
            // InternalOCCI.g:9218:1: ( ( rule__RecordField__DescriptionAssignment_7_1_1 ) )
            {
            // InternalOCCI.g:9218:1: ( ( rule__RecordField__DescriptionAssignment_7_1_1 ) )
            // InternalOCCI.g:9219:2: ( rule__RecordField__DescriptionAssignment_7_1_1 )
            {
             before(grammarAccess.getRecordFieldAccess().getDescriptionAssignment_7_1_1()); 
            // InternalOCCI.g:9220:2: ( rule__RecordField__DescriptionAssignment_7_1_1 )
            // InternalOCCI.g:9220:3: rule__RecordField__DescriptionAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__DescriptionAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getDescriptionAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_7_1__1__Impl"


    // $ANTLR start "rule__RecordField__Group_8__0"
    // InternalOCCI.g:9229:1: rule__RecordField__Group_8__0 : rule__RecordField__Group_8__0__Impl rule__RecordField__Group_8__1 ;
    public final void rule__RecordField__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9233:1: ( rule__RecordField__Group_8__0__Impl rule__RecordField__Group_8__1 )
            // InternalOCCI.g:9234:2: rule__RecordField__Group_8__0__Impl rule__RecordField__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__RecordField__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8__0"


    // $ANTLR start "rule__RecordField__Group_8__0__Impl"
    // InternalOCCI.g:9241:1: rule__RecordField__Group_8__0__Impl : ( 'annotations' ) ;
    public final void rule__RecordField__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9245:1: ( ( 'annotations' ) )
            // InternalOCCI.g:9246:1: ( 'annotations' )
            {
            // InternalOCCI.g:9246:1: ( 'annotations' )
            // InternalOCCI.g:9247:2: 'annotations'
            {
             before(grammarAccess.getRecordFieldAccess().getAnnotationsKeyword_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getAnnotationsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8__0__Impl"


    // $ANTLR start "rule__RecordField__Group_8__1"
    // InternalOCCI.g:9256:1: rule__RecordField__Group_8__1 : rule__RecordField__Group_8__1__Impl rule__RecordField__Group_8__2 ;
    public final void rule__RecordField__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9260:1: ( rule__RecordField__Group_8__1__Impl rule__RecordField__Group_8__2 )
            // InternalOCCI.g:9261:2: rule__RecordField__Group_8__1__Impl rule__RecordField__Group_8__2
            {
            pushFollow(FOLLOW_17);
            rule__RecordField__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8__1"


    // $ANTLR start "rule__RecordField__Group_8__1__Impl"
    // InternalOCCI.g:9268:1: rule__RecordField__Group_8__1__Impl : ( '{' ) ;
    public final void rule__RecordField__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9272:1: ( ( '{' ) )
            // InternalOCCI.g:9273:1: ( '{' )
            {
            // InternalOCCI.g:9273:1: ( '{' )
            // InternalOCCI.g:9274:2: '{'
            {
             before(grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8__1__Impl"


    // $ANTLR start "rule__RecordField__Group_8__2"
    // InternalOCCI.g:9283:1: rule__RecordField__Group_8__2 : rule__RecordField__Group_8__2__Impl rule__RecordField__Group_8__3 ;
    public final void rule__RecordField__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9287:1: ( rule__RecordField__Group_8__2__Impl rule__RecordField__Group_8__3 )
            // InternalOCCI.g:9288:2: rule__RecordField__Group_8__2__Impl rule__RecordField__Group_8__3
            {
            pushFollow(FOLLOW_18);
            rule__RecordField__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8__2"


    // $ANTLR start "rule__RecordField__Group_8__2__Impl"
    // InternalOCCI.g:9295:1: rule__RecordField__Group_8__2__Impl : ( ( rule__RecordField__AnnotationsAssignment_8_2 ) ) ;
    public final void rule__RecordField__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9299:1: ( ( ( rule__RecordField__AnnotationsAssignment_8_2 ) ) )
            // InternalOCCI.g:9300:1: ( ( rule__RecordField__AnnotationsAssignment_8_2 ) )
            {
            // InternalOCCI.g:9300:1: ( ( rule__RecordField__AnnotationsAssignment_8_2 ) )
            // InternalOCCI.g:9301:2: ( rule__RecordField__AnnotationsAssignment_8_2 )
            {
             before(grammarAccess.getRecordFieldAccess().getAnnotationsAssignment_8_2()); 
            // InternalOCCI.g:9302:2: ( rule__RecordField__AnnotationsAssignment_8_2 )
            // InternalOCCI.g:9302:3: rule__RecordField__AnnotationsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__AnnotationsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getAnnotationsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8__2__Impl"


    // $ANTLR start "rule__RecordField__Group_8__3"
    // InternalOCCI.g:9310:1: rule__RecordField__Group_8__3 : rule__RecordField__Group_8__3__Impl rule__RecordField__Group_8__4 ;
    public final void rule__RecordField__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9314:1: ( rule__RecordField__Group_8__3__Impl rule__RecordField__Group_8__4 )
            // InternalOCCI.g:9315:2: rule__RecordField__Group_8__3__Impl rule__RecordField__Group_8__4
            {
            pushFollow(FOLLOW_18);
            rule__RecordField__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8__3"


    // $ANTLR start "rule__RecordField__Group_8__3__Impl"
    // InternalOCCI.g:9322:1: rule__RecordField__Group_8__3__Impl : ( ( rule__RecordField__Group_8_3__0 )* ) ;
    public final void rule__RecordField__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9326:1: ( ( ( rule__RecordField__Group_8_3__0 )* ) )
            // InternalOCCI.g:9327:1: ( ( rule__RecordField__Group_8_3__0 )* )
            {
            // InternalOCCI.g:9327:1: ( ( rule__RecordField__Group_8_3__0 )* )
            // InternalOCCI.g:9328:2: ( rule__RecordField__Group_8_3__0 )*
            {
             before(grammarAccess.getRecordFieldAccess().getGroup_8_3()); 
            // InternalOCCI.g:9329:2: ( rule__RecordField__Group_8_3__0 )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==69) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalOCCI.g:9329:3: rule__RecordField__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__RecordField__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

             after(grammarAccess.getRecordFieldAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8__3__Impl"


    // $ANTLR start "rule__RecordField__Group_8__4"
    // InternalOCCI.g:9337:1: rule__RecordField__Group_8__4 : rule__RecordField__Group_8__4__Impl ;
    public final void rule__RecordField__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9341:1: ( rule__RecordField__Group_8__4__Impl )
            // InternalOCCI.g:9342:2: rule__RecordField__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8__4"


    // $ANTLR start "rule__RecordField__Group_8__4__Impl"
    // InternalOCCI.g:9348:1: rule__RecordField__Group_8__4__Impl : ( '}' ) ;
    public final void rule__RecordField__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9352:1: ( ( '}' ) )
            // InternalOCCI.g:9353:1: ( '}' )
            {
            // InternalOCCI.g:9353:1: ( '}' )
            // InternalOCCI.g:9354:2: '}'
            {
             before(grammarAccess.getRecordFieldAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8__4__Impl"


    // $ANTLR start "rule__RecordField__Group_8_3__0"
    // InternalOCCI.g:9364:1: rule__RecordField__Group_8_3__0 : rule__RecordField__Group_8_3__0__Impl rule__RecordField__Group_8_3__1 ;
    public final void rule__RecordField__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9368:1: ( rule__RecordField__Group_8_3__0__Impl rule__RecordField__Group_8_3__1 )
            // InternalOCCI.g:9369:2: rule__RecordField__Group_8_3__0__Impl rule__RecordField__Group_8_3__1
            {
            pushFollow(FOLLOW_17);
            rule__RecordField__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordField__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8_3__0"


    // $ANTLR start "rule__RecordField__Group_8_3__0__Impl"
    // InternalOCCI.g:9376:1: rule__RecordField__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__RecordField__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9380:1: ( ( ',' ) )
            // InternalOCCI.g:9381:1: ( ',' )
            {
            // InternalOCCI.g:9381:1: ( ',' )
            // InternalOCCI.g:9382:2: ','
            {
             before(grammarAccess.getRecordFieldAccess().getCommaKeyword_8_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8_3__0__Impl"


    // $ANTLR start "rule__RecordField__Group_8_3__1"
    // InternalOCCI.g:9391:1: rule__RecordField__Group_8_3__1 : rule__RecordField__Group_8_3__1__Impl ;
    public final void rule__RecordField__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9395:1: ( rule__RecordField__Group_8_3__1__Impl )
            // InternalOCCI.g:9396:2: rule__RecordField__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8_3__1"


    // $ANTLR start "rule__RecordField__Group_8_3__1__Impl"
    // InternalOCCI.g:9402:1: rule__RecordField__Group_8_3__1__Impl : ( ( rule__RecordField__AnnotationsAssignment_8_3_1 ) ) ;
    public final void rule__RecordField__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9406:1: ( ( ( rule__RecordField__AnnotationsAssignment_8_3_1 ) ) )
            // InternalOCCI.g:9407:1: ( ( rule__RecordField__AnnotationsAssignment_8_3_1 ) )
            {
            // InternalOCCI.g:9407:1: ( ( rule__RecordField__AnnotationsAssignment_8_3_1 ) )
            // InternalOCCI.g:9408:2: ( rule__RecordField__AnnotationsAssignment_8_3_1 )
            {
             before(grammarAccess.getRecordFieldAccess().getAnnotationsAssignment_8_3_1()); 
            // InternalOCCI.g:9409:2: ( rule__RecordField__AnnotationsAssignment_8_3_1 )
            // InternalOCCI.g:9409:3: rule__RecordField__AnnotationsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordField__AnnotationsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordFieldAccess().getAnnotationsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__Group_8_3__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // InternalOCCI.g:9418:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9422:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalOCCI.g:9423:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
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
    // InternalOCCI.g:9430:1: rule__ArrayType__Group__0__Impl : ( 'ArrayType' ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9434:1: ( ( 'ArrayType' ) )
            // InternalOCCI.g:9435:1: ( 'ArrayType' )
            {
            // InternalOCCI.g:9435:1: ( 'ArrayType' )
            // InternalOCCI.g:9436:2: 'ArrayType'
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
    // InternalOCCI.g:9445:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9449:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalOCCI.g:9450:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalOCCI.g:9457:1: rule__ArrayType__Group__1__Impl : ( ( rule__ArrayType__NameAssignment_1 ) ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9461:1: ( ( ( rule__ArrayType__NameAssignment_1 ) ) )
            // InternalOCCI.g:9462:1: ( ( rule__ArrayType__NameAssignment_1 ) )
            {
            // InternalOCCI.g:9462:1: ( ( rule__ArrayType__NameAssignment_1 ) )
            // InternalOCCI.g:9463:2: ( rule__ArrayType__NameAssignment_1 )
            {
             before(grammarAccess.getArrayTypeAccess().getNameAssignment_1()); 
            // InternalOCCI.g:9464:2: ( rule__ArrayType__NameAssignment_1 )
            // InternalOCCI.g:9464:3: rule__ArrayType__NameAssignment_1
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
    // InternalOCCI.g:9472:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9476:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalOCCI.g:9477:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalOCCI.g:9484:1: rule__ArrayType__Group__2__Impl : ( 'type' ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9488:1: ( ( 'type' ) )
            // InternalOCCI.g:9489:1: ( 'type' )
            {
            // InternalOCCI.g:9489:1: ( 'type' )
            // InternalOCCI.g:9490:2: 'type'
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
    // InternalOCCI.g:9499:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9503:1: ( rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4 )
            // InternalOCCI.g:9504:2: rule__ArrayType__Group__3__Impl rule__ArrayType__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalOCCI.g:9511:1: rule__ArrayType__Group__3__Impl : ( ( rule__ArrayType__TypeAssignment_3 ) ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9515:1: ( ( ( rule__ArrayType__TypeAssignment_3 ) ) )
            // InternalOCCI.g:9516:1: ( ( rule__ArrayType__TypeAssignment_3 ) )
            {
            // InternalOCCI.g:9516:1: ( ( rule__ArrayType__TypeAssignment_3 ) )
            // InternalOCCI.g:9517:2: ( rule__ArrayType__TypeAssignment_3 )
            {
             before(grammarAccess.getArrayTypeAccess().getTypeAssignment_3()); 
            // InternalOCCI.g:9518:2: ( rule__ArrayType__TypeAssignment_3 )
            // InternalOCCI.g:9518:3: rule__ArrayType__TypeAssignment_3
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
    // InternalOCCI.g:9526:1: rule__ArrayType__Group__4 : rule__ArrayType__Group__4__Impl ;
    public final void rule__ArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9530:1: ( rule__ArrayType__Group__4__Impl )
            // InternalOCCI.g:9531:2: rule__ArrayType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalOCCI.g:9537:1: rule__ArrayType__Group__4__Impl : ( ( rule__ArrayType__Group_4__0 )? ) ;
    public final void rule__ArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9541:1: ( ( ( rule__ArrayType__Group_4__0 )? ) )
            // InternalOCCI.g:9542:1: ( ( rule__ArrayType__Group_4__0 )? )
            {
            // InternalOCCI.g:9542:1: ( ( rule__ArrayType__Group_4__0 )? )
            // InternalOCCI.g:9543:2: ( rule__ArrayType__Group_4__0 )?
            {
             before(grammarAccess.getArrayTypeAccess().getGroup_4()); 
            // InternalOCCI.g:9544:2: ( rule__ArrayType__Group_4__0 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==70) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalOCCI.g:9544:3: rule__ArrayType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayTypeAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ArrayType__Group_4__0"
    // InternalOCCI.g:9553:1: rule__ArrayType__Group_4__0 : rule__ArrayType__Group_4__0__Impl rule__ArrayType__Group_4__1 ;
    public final void rule__ArrayType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9557:1: ( rule__ArrayType__Group_4__0__Impl rule__ArrayType__Group_4__1 )
            // InternalOCCI.g:9558:2: rule__ArrayType__Group_4__0__Impl rule__ArrayType__Group_4__1
            {
            pushFollow(FOLLOW_49);
            rule__ArrayType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_4__0"


    // $ANTLR start "rule__ArrayType__Group_4__0__Impl"
    // InternalOCCI.g:9565:1: rule__ArrayType__Group_4__0__Impl : ( '(' ) ;
    public final void rule__ArrayType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9569:1: ( ( '(' ) )
            // InternalOCCI.g:9570:1: ( '(' )
            {
            // InternalOCCI.g:9570:1: ( '(' )
            // InternalOCCI.g:9571:2: '('
            {
             before(grammarAccess.getArrayTypeAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_4__0__Impl"


    // $ANTLR start "rule__ArrayType__Group_4__1"
    // InternalOCCI.g:9580:1: rule__ArrayType__Group_4__1 : rule__ArrayType__Group_4__1__Impl rule__ArrayType__Group_4__2 ;
    public final void rule__ArrayType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9584:1: ( rule__ArrayType__Group_4__1__Impl rule__ArrayType__Group_4__2 )
            // InternalOCCI.g:9585:2: rule__ArrayType__Group_4__1__Impl rule__ArrayType__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__ArrayType__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_4__1"


    // $ANTLR start "rule__ArrayType__Group_4__1__Impl"
    // InternalOCCI.g:9592:1: rule__ArrayType__Group_4__1__Impl : ( 'documentation' ) ;
    public final void rule__ArrayType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9596:1: ( ( 'documentation' ) )
            // InternalOCCI.g:9597:1: ( 'documentation' )
            {
            // InternalOCCI.g:9597:1: ( 'documentation' )
            // InternalOCCI.g:9598:2: 'documentation'
            {
             before(grammarAccess.getArrayTypeAccess().getDocumentationKeyword_4_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getDocumentationKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_4__1__Impl"


    // $ANTLR start "rule__ArrayType__Group_4__2"
    // InternalOCCI.g:9607:1: rule__ArrayType__Group_4__2 : rule__ArrayType__Group_4__2__Impl rule__ArrayType__Group_4__3 ;
    public final void rule__ArrayType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9611:1: ( rule__ArrayType__Group_4__2__Impl rule__ArrayType__Group_4__3 )
            // InternalOCCI.g:9612:2: rule__ArrayType__Group_4__2__Impl rule__ArrayType__Group_4__3
            {
            pushFollow(FOLLOW_50);
            rule__ArrayType__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_4__2"


    // $ANTLR start "rule__ArrayType__Group_4__2__Impl"
    // InternalOCCI.g:9619:1: rule__ArrayType__Group_4__2__Impl : ( ( rule__ArrayType__DocumentationAssignment_4_2 ) ) ;
    public final void rule__ArrayType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9623:1: ( ( ( rule__ArrayType__DocumentationAssignment_4_2 ) ) )
            // InternalOCCI.g:9624:1: ( ( rule__ArrayType__DocumentationAssignment_4_2 ) )
            {
            // InternalOCCI.g:9624:1: ( ( rule__ArrayType__DocumentationAssignment_4_2 ) )
            // InternalOCCI.g:9625:2: ( rule__ArrayType__DocumentationAssignment_4_2 )
            {
             before(grammarAccess.getArrayTypeAccess().getDocumentationAssignment_4_2()); 
            // InternalOCCI.g:9626:2: ( rule__ArrayType__DocumentationAssignment_4_2 )
            // InternalOCCI.g:9626:3: rule__ArrayType__DocumentationAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__DocumentationAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getDocumentationAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_4__2__Impl"


    // $ANTLR start "rule__ArrayType__Group_4__3"
    // InternalOCCI.g:9634:1: rule__ArrayType__Group_4__3 : rule__ArrayType__Group_4__3__Impl ;
    public final void rule__ArrayType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9638:1: ( rule__ArrayType__Group_4__3__Impl )
            // InternalOCCI.g:9639:2: rule__ArrayType__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_4__3"


    // $ANTLR start "rule__ArrayType__Group_4__3__Impl"
    // InternalOCCI.g:9645:1: rule__ArrayType__Group_4__3__Impl : ( ')' ) ;
    public final void rule__ArrayType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9649:1: ( ( ')' ) )
            // InternalOCCI.g:9650:1: ( ')' )
            {
            // InternalOCCI.g:9650:1: ( ')' )
            // InternalOCCI.g:9651:2: ')'
            {
             before(grammarAccess.getArrayTypeAccess().getRightParenthesisKeyword_4_3()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_4__3__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__0"
    // InternalOCCI.g:9661:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9665:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // InternalOCCI.g:9666:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalOCCI.g:9673:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9677:1: ( ( ( '-' )? ) )
            // InternalOCCI.g:9678:1: ( ( '-' )? )
            {
            // InternalOCCI.g:9678:1: ( ( '-' )? )
            // InternalOCCI.g:9679:2: ( '-' )?
            {
             before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalOCCI.g:9680:2: ( '-' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==12) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalOCCI.g:9680:3: '-'
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
    // InternalOCCI.g:9688:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9692:1: ( rule__EIntegerObject__Group__1__Impl )
            // InternalOCCI.g:9693:2: rule__EIntegerObject__Group__1__Impl
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
    // InternalOCCI.g:9699:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9703:1: ( ( RULE_INT ) )
            // InternalOCCI.g:9704:1: ( RULE_INT )
            {
            // InternalOCCI.g:9704:1: ( RULE_INT )
            // InternalOCCI.g:9705:2: RULE_INT
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
    // InternalOCCI.g:9715:1: rule__NameID__Group_0__0 : rule__NameID__Group_0__0__Impl rule__NameID__Group_0__1 ;
    public final void rule__NameID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9719:1: ( rule__NameID__Group_0__0__Impl rule__NameID__Group_0__1 )
            // InternalOCCI.g:9720:2: rule__NameID__Group_0__0__Impl rule__NameID__Group_0__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalOCCI.g:9727:1: rule__NameID__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__NameID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9731:1: ( ( RULE_ID ) )
            // InternalOCCI.g:9732:1: ( RULE_ID )
            {
            // InternalOCCI.g:9732:1: ( RULE_ID )
            // InternalOCCI.g:9733:2: RULE_ID
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
    // InternalOCCI.g:9742:1: rule__NameID__Group_0__1 : rule__NameID__Group_0__1__Impl ;
    public final void rule__NameID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9746:1: ( rule__NameID__Group_0__1__Impl )
            // InternalOCCI.g:9747:2: rule__NameID__Group_0__1__Impl
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
    // InternalOCCI.g:9753:1: rule__NameID__Group_0__1__Impl : ( ( rule__NameID__Alternatives_0_1 )* ) ;
    public final void rule__NameID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9757:1: ( ( ( rule__NameID__Alternatives_0_1 )* ) )
            // InternalOCCI.g:9758:1: ( ( rule__NameID__Alternatives_0_1 )* )
            {
            // InternalOCCI.g:9758:1: ( ( rule__NameID__Alternatives_0_1 )* )
            // InternalOCCI.g:9759:2: ( rule__NameID__Alternatives_0_1 )*
            {
             before(grammarAccess.getNameIDAccess().getAlternatives_0_1()); 
            // InternalOCCI.g:9760:2: ( rule__NameID__Alternatives_0_1 )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_ID||LA79_0==12) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalOCCI.g:9760:3: rule__NameID__Alternatives_0_1
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__NameID__Alternatives_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop79;
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
    // InternalOCCI.g:9769:1: rule__Extension__NameAssignment_1 : ( ruleNameID ) ;
    public final void rule__Extension__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9773:1: ( ( ruleNameID ) )
            // InternalOCCI.g:9774:2: ( ruleNameID )
            {
            // InternalOCCI.g:9774:2: ( ruleNameID )
            // InternalOCCI.g:9775:3: ruleNameID
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
    // InternalOCCI.g:9784:1: rule__Extension__SchemeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Extension__SchemeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9788:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9789:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9789:2: ( RULE_STRING )
            // InternalOCCI.g:9790:3: RULE_STRING
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
    // InternalOCCI.g:9799:1: rule__Extension__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Extension__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9803:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9804:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9804:2: ( RULE_STRING )
            // InternalOCCI.g:9805:3: RULE_STRING
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
    // InternalOCCI.g:9814:1: rule__Extension__SpecificationAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Extension__SpecificationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9818:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:9819:2: ( RULE_STRING )
            {
            // InternalOCCI.g:9819:2: ( RULE_STRING )
            // InternalOCCI.g:9820:3: RULE_STRING
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
    // InternalOCCI.g:9829:1: rule__Extension__ImportAssignment_6_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Extension__ImportAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9833:1: ( ( ( RULE_STRING ) ) )
            // InternalOCCI.g:9834:2: ( ( RULE_STRING ) )
            {
            // InternalOCCI.g:9834:2: ( ( RULE_STRING ) )
            // InternalOCCI.g:9835:3: ( RULE_STRING )
            {
             before(grammarAccess.getExtensionAccess().getImportExtensionCrossReference_6_1_0()); 
            // InternalOCCI.g:9836:3: ( RULE_STRING )
            // InternalOCCI.g:9837:4: RULE_STRING
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
    // InternalOCCI.g:9848:1: rule__Extension__KindsAssignment_7_0 : ( ruleKind ) ;
    public final void rule__Extension__KindsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9852:1: ( ( ruleKind ) )
            // InternalOCCI.g:9853:2: ( ruleKind )
            {
            // InternalOCCI.g:9853:2: ( ruleKind )
            // InternalOCCI.g:9854:3: ruleKind
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
    // InternalOCCI.g:9863:1: rule__Extension__MixinsAssignment_7_1 : ( ruleMixin ) ;
    public final void rule__Extension__MixinsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9867:1: ( ( ruleMixin ) )
            // InternalOCCI.g:9868:2: ( ruleMixin )
            {
            // InternalOCCI.g:9868:2: ( ruleMixin )
            // InternalOCCI.g:9869:3: ruleMixin
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
    // InternalOCCI.g:9878:1: rule__Extension__TypesAssignment_7_2 : ( ruleDataType ) ;
    public final void rule__Extension__TypesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9882:1: ( ( ruleDataType ) )
            // InternalOCCI.g:9883:2: ( ruleDataType )
            {
            // InternalOCCI.g:9883:2: ( ruleDataType )
            // InternalOCCI.g:9884:3: ruleDataType
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
    // InternalOCCI.g:9893:1: rule__Kind__NameAssignment_1 : ( ruleNameID ) ;
    public final void rule__Kind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9897:1: ( ( ruleNameID ) )
            // InternalOCCI.g:9898:2: ( ruleNameID )
            {
            // InternalOCCI.g:9898:2: ( ruleNameID )
            // InternalOCCI.g:9899:3: ruleNameID
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
    // InternalOCCI.g:9908:1: rule__Kind__ParentAssignment_2_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Kind__ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9912:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9913:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9913:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9914:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getKindAccess().getParentKindCrossReference_2_1_0()); 
            // InternalOCCI.g:9915:3: ( ruleQualifiedID )
            // InternalOCCI.g:9916:4: ruleQualifiedID
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
    // InternalOCCI.g:9927:1: rule__Kind__SourceAssignment_3_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Kind__SourceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9931:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9932:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9932:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9933:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getKindAccess().getSourceKindCrossReference_3_1_0()); 
            // InternalOCCI.g:9934:3: ( ruleQualifiedID )
            // InternalOCCI.g:9935:4: ruleQualifiedID
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
    // InternalOCCI.g:9946:1: rule__Kind__TargetAssignment_4_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Kind__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9950:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:9951:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:9951:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:9952:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getKindAccess().getTargetKindCrossReference_4_1_0()); 
            // InternalOCCI.g:9953:3: ( ruleQualifiedID )
            // InternalOCCI.g:9954:4: ruleQualifiedID
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


    // $ANTLR start "rule__Kind__AnnotationsAssignment_5_2"
    // InternalOCCI.g:9965:1: rule__Kind__AnnotationsAssignment_5_2 : ( ruleAnnotation ) ;
    public final void rule__Kind__AnnotationsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9969:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:9970:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:9970:2: ( ruleAnnotation )
            // InternalOCCI.g:9971:3: ruleAnnotation
            {
             before(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__AnnotationsAssignment_5_2"


    // $ANTLR start "rule__Kind__AnnotationsAssignment_5_3_1"
    // InternalOCCI.g:9980:1: rule__Kind__AnnotationsAssignment_5_3_1 : ( ruleAnnotation ) ;
    public final void rule__Kind__AnnotationsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9984:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:9985:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:9985:2: ( ruleAnnotation )
            // InternalOCCI.g:9986:3: ruleAnnotation
            {
             before(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getKindAccess().getAnnotationsAnnotationParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__AnnotationsAssignment_5_3_1"


    // $ANTLR start "rule__Kind__TitleAssignment_7_1"
    // InternalOCCI.g:9995:1: rule__Kind__TitleAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Kind__TitleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:9999:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10000:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10000:2: ( RULE_STRING )
            // InternalOCCI.g:10001:3: RULE_STRING
            {
             before(grammarAccess.getKindAccess().getTitleSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getTitleSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__TitleAssignment_7_1"


    // $ANTLR start "rule__Kind__SchemeAssignment_9"
    // InternalOCCI.g:10010:1: rule__Kind__SchemeAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Kind__SchemeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10014:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10015:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10015:2: ( RULE_STRING )
            // InternalOCCI.g:10016:3: RULE_STRING
            {
             before(grammarAccess.getKindAccess().getSchemeSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getSchemeSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__SchemeAssignment_9"


    // $ANTLR start "rule__Kind__AttributesAssignment_10_0"
    // InternalOCCI.g:10025:1: rule__Kind__AttributesAssignment_10_0 : ( ruleAttribute ) ;
    public final void rule__Kind__AttributesAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10029:1: ( ( ruleAttribute ) )
            // InternalOCCI.g:10030:2: ( ruleAttribute )
            {
            // InternalOCCI.g:10030:2: ( ruleAttribute )
            // InternalOCCI.g:10031:3: ruleAttribute
            {
             before(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getKindAccess().getAttributesAttributeParserRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__AttributesAssignment_10_0"


    // $ANTLR start "rule__Kind__ActionsAssignment_10_1"
    // InternalOCCI.g:10040:1: rule__Kind__ActionsAssignment_10_1 : ( ruleAction ) ;
    public final void rule__Kind__ActionsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10044:1: ( ( ruleAction ) )
            // InternalOCCI.g:10045:2: ( ruleAction )
            {
            // InternalOCCI.g:10045:2: ( ruleAction )
            // InternalOCCI.g:10046:3: ruleAction
            {
             before(grammarAccess.getKindAccess().getActionsActionParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getKindAccess().getActionsActionParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__ActionsAssignment_10_1"


    // $ANTLR start "rule__Kind__ConstraintsAssignment_10_2"
    // InternalOCCI.g:10055:1: rule__Kind__ConstraintsAssignment_10_2 : ( ruleConstraint ) ;
    public final void rule__Kind__ConstraintsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10059:1: ( ( ruleConstraint ) )
            // InternalOCCI.g:10060:2: ( ruleConstraint )
            {
            // InternalOCCI.g:10060:2: ( ruleConstraint )
            // InternalOCCI.g:10061:3: ruleConstraint
            {
             before(grammarAccess.getKindAccess().getConstraintsConstraintParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getKindAccess().getConstraintsConstraintParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__ConstraintsAssignment_10_2"


    // $ANTLR start "rule__Kind__FsmAssignment_11"
    // InternalOCCI.g:10070:1: rule__Kind__FsmAssignment_11 : ( ruleFSM ) ;
    public final void rule__Kind__FsmAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10074:1: ( ( ruleFSM ) )
            // InternalOCCI.g:10075:2: ( ruleFSM )
            {
            // InternalOCCI.g:10075:2: ( ruleFSM )
            // InternalOCCI.g:10076:3: ruleFSM
            {
             before(grammarAccess.getKindAccess().getFsmFSMParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleFSM();

            state._fsp--;

             after(grammarAccess.getKindAccess().getFsmFSMParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__FsmAssignment_11"


    // $ANTLR start "rule__Mixin__NameAssignment_1"
    // InternalOCCI.g:10085:1: rule__Mixin__NameAssignment_1 : ( ruleNameID ) ;
    public final void rule__Mixin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10089:1: ( ( ruleNameID ) )
            // InternalOCCI.g:10090:2: ( ruleNameID )
            {
            // InternalOCCI.g:10090:2: ( ruleNameID )
            // InternalOCCI.g:10091:3: ruleNameID
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
    // InternalOCCI.g:10100:1: rule__Mixin__DependsAssignment_2_2 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Mixin__DependsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10104:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10105:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10105:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10106:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_2_0()); 
            // InternalOCCI.g:10107:3: ( ruleQualifiedID )
            // InternalOCCI.g:10108:4: ruleQualifiedID
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
    // InternalOCCI.g:10119:1: rule__Mixin__DependsAssignment_2_3_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Mixin__DependsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10123:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10124:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10124:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10125:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getMixinAccess().getDependsMixinCrossReference_2_3_1_0()); 
            // InternalOCCI.g:10126:3: ( ruleQualifiedID )
            // InternalOCCI.g:10127:4: ruleQualifiedID
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
    // InternalOCCI.g:10138:1: rule__Mixin__AppliesAssignment_3_2 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Mixin__AppliesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10142:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10143:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10143:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10144:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_2_0()); 
            // InternalOCCI.g:10145:3: ( ruleQualifiedID )
            // InternalOCCI.g:10146:4: ruleQualifiedID
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
    // InternalOCCI.g:10157:1: rule__Mixin__AppliesAssignment_3_3_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Mixin__AppliesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10161:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10162:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10162:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10163:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getMixinAccess().getAppliesKindCrossReference_3_3_1_0()); 
            // InternalOCCI.g:10164:3: ( ruleQualifiedID )
            // InternalOCCI.g:10165:4: ruleQualifiedID
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


    // $ANTLR start "rule__Mixin__AnnotationsAssignment_4_2"
    // InternalOCCI.g:10176:1: rule__Mixin__AnnotationsAssignment_4_2 : ( ruleAnnotation ) ;
    public final void rule__Mixin__AnnotationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10180:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:10181:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:10181:2: ( ruleAnnotation )
            // InternalOCCI.g:10182:3: ruleAnnotation
            {
             before(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__AnnotationsAssignment_4_2"


    // $ANTLR start "rule__Mixin__AnnotationsAssignment_4_3_1"
    // InternalOCCI.g:10191:1: rule__Mixin__AnnotationsAssignment_4_3_1 : ( ruleAnnotation ) ;
    public final void rule__Mixin__AnnotationsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10195:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:10196:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:10196:2: ( ruleAnnotation )
            // InternalOCCI.g:10197:3: ruleAnnotation
            {
             before(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__AnnotationsAssignment_4_3_1"


    // $ANTLR start "rule__Mixin__SchemeAssignment_7"
    // InternalOCCI.g:10206:1: rule__Mixin__SchemeAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Mixin__SchemeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10210:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10211:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10211:2: ( RULE_STRING )
            // InternalOCCI.g:10212:3: RULE_STRING
            {
             before(grammarAccess.getMixinAccess().getSchemeSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getSchemeSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__SchemeAssignment_7"


    // $ANTLR start "rule__Mixin__TitleAssignment_8_1"
    // InternalOCCI.g:10221:1: rule__Mixin__TitleAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__Mixin__TitleAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10225:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10226:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10226:2: ( RULE_STRING )
            // InternalOCCI.g:10227:3: RULE_STRING
            {
             before(grammarAccess.getMixinAccess().getTitleSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMixinAccess().getTitleSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__TitleAssignment_8_1"


    // $ANTLR start "rule__Mixin__AttributesAssignment_9_0"
    // InternalOCCI.g:10236:1: rule__Mixin__AttributesAssignment_9_0 : ( ruleAttribute ) ;
    public final void rule__Mixin__AttributesAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10240:1: ( ( ruleAttribute ) )
            // InternalOCCI.g:10241:2: ( ruleAttribute )
            {
            // InternalOCCI.g:10241:2: ( ruleAttribute )
            // InternalOCCI.g:10242:3: ruleAttribute
            {
             before(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getAttributesAttributeParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__AttributesAssignment_9_0"


    // $ANTLR start "rule__Mixin__ActionsAssignment_9_1"
    // InternalOCCI.g:10251:1: rule__Mixin__ActionsAssignment_9_1 : ( ruleAction ) ;
    public final void rule__Mixin__ActionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10255:1: ( ( ruleAction ) )
            // InternalOCCI.g:10256:2: ( ruleAction )
            {
            // InternalOCCI.g:10256:2: ( ruleAction )
            // InternalOCCI.g:10257:3: ruleAction
            {
             before(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getActionsActionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__ActionsAssignment_9_1"


    // $ANTLR start "rule__Mixin__ConstraintsAssignment_9_2"
    // InternalOCCI.g:10266:1: rule__Mixin__ConstraintsAssignment_9_2 : ( ruleConstraint ) ;
    public final void rule__Mixin__ConstraintsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10270:1: ( ( ruleConstraint ) )
            // InternalOCCI.g:10271:2: ( ruleConstraint )
            {
            // InternalOCCI.g:10271:2: ( ruleConstraint )
            // InternalOCCI.g:10272:3: ruleConstraint
            {
             before(grammarAccess.getMixinAccess().getConstraintsConstraintParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getMixinAccess().getConstraintsConstraintParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__ConstraintsAssignment_9_2"


    // $ANTLR start "rule__Annotation__KeyAssignment_3"
    // InternalOCCI.g:10281:1: rule__Annotation__KeyAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Annotation__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10285:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10286:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10286:2: ( RULE_STRING )
            // InternalOCCI.g:10287:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__KeyAssignment_3"


    // $ANTLR start "rule__Annotation__ValueAssignment_5"
    // InternalOCCI.g:10296:1: rule__Annotation__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10300:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10301:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10301:2: ( RULE_STRING )
            // InternalOCCI.g:10302:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__ValueAssignment_5"


    // $ANTLR start "rule__Attribute__MutableAssignment_1"
    // InternalOCCI.g:10311:1: rule__Attribute__MutableAssignment_1 : ( ( 'mutable' ) ) ;
    public final void rule__Attribute__MutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10315:1: ( ( ( 'mutable' ) ) )
            // InternalOCCI.g:10316:2: ( ( 'mutable' ) )
            {
            // InternalOCCI.g:10316:2: ( ( 'mutable' ) )
            // InternalOCCI.g:10317:3: ( 'mutable' )
            {
             before(grammarAccess.getAttributeAccess().getMutableMutableKeyword_1_0()); 
            // InternalOCCI.g:10318:3: ( 'mutable' )
            // InternalOCCI.g:10319:4: 'mutable'
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
    // InternalOCCI.g:10330:1: rule__Attribute__RequiredAssignment_2 : ( ( 'required' ) ) ;
    public final void rule__Attribute__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10334:1: ( ( ( 'required' ) ) )
            // InternalOCCI.g:10335:2: ( ( 'required' ) )
            {
            // InternalOCCI.g:10335:2: ( ( 'required' ) )
            // InternalOCCI.g:10336:3: ( 'required' )
            {
             before(grammarAccess.getAttributeAccess().getRequiredRequiredKeyword_2_0()); 
            // InternalOCCI.g:10337:3: ( 'required' )
            // InternalOCCI.g:10338:4: 'required'
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
    // InternalOCCI.g:10349:1: rule__Attribute__NameAssignment_3 : ( ruleQualifiedID ) ;
    public final void rule__Attribute__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10353:1: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10354:2: ( ruleQualifiedID )
            {
            // InternalOCCI.g:10354:2: ( ruleQualifiedID )
            // InternalOCCI.g:10355:3: ruleQualifiedID
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
    // InternalOCCI.g:10364:1: rule__Attribute__TypeAssignment_5_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Attribute__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10368:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10369:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10369:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10370:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeCrossReference_5_1_0()); 
            // InternalOCCI.g:10371:3: ( ruleQualifiedID )
            // InternalOCCI.g:10372:4: ruleQualifiedID
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
    // InternalOCCI.g:10383:1: rule__Attribute__DefaultAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__DefaultAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10387:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10388:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10388:2: ( RULE_STRING )
            // InternalOCCI.g:10389:3: RULE_STRING
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


    // $ANTLR start "rule__Attribute__DescriptionAssignment_7_1_1"
    // InternalOCCI.g:10398:1: rule__Attribute__DescriptionAssignment_7_1_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__DescriptionAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10402:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10403:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10403:2: ( RULE_STRING )
            // InternalOCCI.g:10404:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_7_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DescriptionAssignment_7_1_1"


    // $ANTLR start "rule__Attribute__AnnotationsAssignment_8_2"
    // InternalOCCI.g:10413:1: rule__Attribute__AnnotationsAssignment_8_2 : ( ruleAnnotation ) ;
    public final void rule__Attribute__AnnotationsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10417:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:10418:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:10418:2: ( ruleAnnotation )
            // InternalOCCI.g:10419:3: ruleAnnotation
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
    // InternalOCCI.g:10428:1: rule__Attribute__AnnotationsAssignment_8_3_1 : ( ruleAnnotation ) ;
    public final void rule__Attribute__AnnotationsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10432:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:10433:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:10433:2: ( ruleAnnotation )
            // InternalOCCI.g:10434:3: ruleAnnotation
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
    // InternalOCCI.g:10443:1: rule__Action__NameAssignment_1 : ( ruleNameID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10447:1: ( ( ruleNameID ) )
            // InternalOCCI.g:10448:2: ( ruleNameID )
            {
            // InternalOCCI.g:10448:2: ( ruleNameID )
            // InternalOCCI.g:10449:3: ruleNameID
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
    // InternalOCCI.g:10458:1: rule__Action__SchemeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Action__SchemeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10462:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10463:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10463:2: ( RULE_STRING )
            // InternalOCCI.g:10464:3: RULE_STRING
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
    // InternalOCCI.g:10473:1: rule__Action__AttributesAssignment_4_1 : ( ruleParameterDecl ) ;
    public final void rule__Action__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10477:1: ( ( ruleParameterDecl ) )
            // InternalOCCI.g:10478:2: ( ruleParameterDecl )
            {
            // InternalOCCI.g:10478:2: ( ruleParameterDecl )
            // InternalOCCI.g:10479:3: ruleParameterDecl
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
    // InternalOCCI.g:10488:1: rule__Action__AttributesAssignment_4_2_1 : ( ruleParameterDecl ) ;
    public final void rule__Action__AttributesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10492:1: ( ( ruleParameterDecl ) )
            // InternalOCCI.g:10493:2: ( ruleParameterDecl )
            {
            // InternalOCCI.g:10493:2: ( ruleParameterDecl )
            // InternalOCCI.g:10494:3: ruleParameterDecl
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
    // InternalOCCI.g:10503:1: rule__Action__TitleAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Action__TitleAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10507:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10508:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10508:2: ( RULE_STRING )
            // InternalOCCI.g:10509:3: RULE_STRING
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
    // InternalOCCI.g:10518:1: rule__Action__AnnotationsAssignment_6_2 : ( ruleAnnotation ) ;
    public final void rule__Action__AnnotationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10522:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:10523:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:10523:2: ( ruleAnnotation )
            // InternalOCCI.g:10524:3: ruleAnnotation
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
    // InternalOCCI.g:10533:1: rule__Action__AnnotationsAssignment_6_3_1 : ( ruleAnnotation ) ;
    public final void rule__Action__AnnotationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10537:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:10538:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:10538:2: ( ruleAnnotation )
            // InternalOCCI.g:10539:3: ruleAnnotation
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
    // InternalOCCI.g:10548:1: rule__ParameterDecl__NameAssignment_0 : ( ruleQualifiedID ) ;
    public final void rule__ParameterDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10552:1: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10553:2: ( ruleQualifiedID )
            {
            // InternalOCCI.g:10553:2: ( ruleQualifiedID )
            // InternalOCCI.g:10554:3: ruleQualifiedID
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
    // InternalOCCI.g:10563:1: rule__ParameterDecl__TypeAssignment_2 : ( ( ruleQualifiedID ) ) ;
    public final void rule__ParameterDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10567:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10568:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10568:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10569:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getParameterDeclAccess().getTypeDataTypeCrossReference_2_0()); 
            // InternalOCCI.g:10570:3: ( ruleQualifiedID )
            // InternalOCCI.g:10571:4: ruleQualifiedID
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
    // InternalOCCI.g:10582:1: rule__ParameterDecl__DefaultAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ParameterDecl__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10586:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10587:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10587:2: ( RULE_STRING )
            // InternalOCCI.g:10588:3: RULE_STRING
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
    // InternalOCCI.g:10597:1: rule__Constraint__NameAssignment_1 : ( ruleNameID ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10601:1: ( ( ruleNameID ) )
            // InternalOCCI.g:10602:2: ( ruleNameID )
            {
            // InternalOCCI.g:10602:2: ( ruleNameID )
            // InternalOCCI.g:10603:3: ruleNameID
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
    // InternalOCCI.g:10612:1: rule__Constraint__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Constraint__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10616:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10617:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10617:2: ( RULE_STRING )
            // InternalOCCI.g:10618:3: RULE_STRING
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
    // InternalOCCI.g:10627:1: rule__Constraint__BodyAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Constraint__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10631:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10632:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10632:2: ( RULE_STRING )
            // InternalOCCI.g:10633:3: RULE_STRING
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
    // InternalOCCI.g:10642:1: rule__FSM__AttributeAssignment_3 : ( ( ruleQualifiedID ) ) ;
    public final void rule__FSM__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10646:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10647:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10647:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10648:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getFSMAccess().getAttributeAttributeCrossReference_3_0()); 
            // InternalOCCI.g:10649:3: ( ruleQualifiedID )
            // InternalOCCI.g:10650:4: ruleQualifiedID
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
    // InternalOCCI.g:10661:1: rule__FSM__OwnedStateAssignment_4_2 : ( ruleState ) ;
    public final void rule__FSM__OwnedStateAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10665:1: ( ( ruleState ) )
            // InternalOCCI.g:10666:2: ( ruleState )
            {
            // InternalOCCI.g:10666:2: ( ruleState )
            // InternalOCCI.g:10667:3: ruleState
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
    // InternalOCCI.g:10676:1: rule__FSM__OwnedStateAssignment_4_3_1 : ( ruleState ) ;
    public final void rule__FSM__OwnedStateAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10680:1: ( ( ruleState ) )
            // InternalOCCI.g:10681:2: ( ruleState )
            {
            // InternalOCCI.g:10681:2: ( ruleState )
            // InternalOCCI.g:10682:3: ruleState
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
    // InternalOCCI.g:10691:1: rule__State__InitialAssignment_2 : ( ( 'initial' ) ) ;
    public final void rule__State__InitialAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10695:1: ( ( ( 'initial' ) ) )
            // InternalOCCI.g:10696:2: ( ( 'initial' ) )
            {
            // InternalOCCI.g:10696:2: ( ( 'initial' ) )
            // InternalOCCI.g:10697:3: ( 'initial' )
            {
             before(grammarAccess.getStateAccess().getInitialInitialKeyword_2_0()); 
            // InternalOCCI.g:10698:3: ( 'initial' )
            // InternalOCCI.g:10699:4: 'initial'
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
    // InternalOCCI.g:10710:1: rule__State__FinalAssignment_3 : ( ( 'final' ) ) ;
    public final void rule__State__FinalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10714:1: ( ( ( 'final' ) ) )
            // InternalOCCI.g:10715:2: ( ( 'final' ) )
            {
            // InternalOCCI.g:10715:2: ( ( 'final' ) )
            // InternalOCCI.g:10716:3: ( 'final' )
            {
             before(grammarAccess.getStateAccess().getFinalFinalKeyword_3_0()); 
            // InternalOCCI.g:10717:3: ( 'final' )
            // InternalOCCI.g:10718:4: 'final'
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
    // InternalOCCI.g:10729:1: rule__State__LiteralAssignment_4_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__State__LiteralAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10733:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10734:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10734:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10735:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getStateAccess().getLiteralEnumerationLiteralCrossReference_4_1_0()); 
            // InternalOCCI.g:10736:3: ( ruleQualifiedID )
            // InternalOCCI.g:10737:4: ruleQualifiedID
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
    // InternalOCCI.g:10748:1: rule__State__OutgoingTransitionAssignment_5_2 : ( ruleTransition ) ;
    public final void rule__State__OutgoingTransitionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10752:1: ( ( ruleTransition ) )
            // InternalOCCI.g:10753:2: ( ruleTransition )
            {
            // InternalOCCI.g:10753:2: ( ruleTransition )
            // InternalOCCI.g:10754:3: ruleTransition
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
    // InternalOCCI.g:10763:1: rule__State__OutgoingTransitionAssignment_5_3_1 : ( ruleTransition ) ;
    public final void rule__State__OutgoingTransitionAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10767:1: ( ( ruleTransition ) )
            // InternalOCCI.g:10768:2: ( ruleTransition )
            {
            // InternalOCCI.g:10768:2: ( ruleTransition )
            // InternalOCCI.g:10769:3: ruleTransition
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
    // InternalOCCI.g:10778:1: rule__Transition__ActionAssignment_0_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Transition__ActionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10782:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10783:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10783:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10784:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getTransitionAccess().getActionActionCrossReference_0_1_0()); 
            // InternalOCCI.g:10785:3: ( ruleQualifiedID )
            // InternalOCCI.g:10786:4: ruleQualifiedID
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
    // InternalOCCI.g:10797:1: rule__Transition__TargetAssignment_2 : ( ( ruleQualifiedID ) ) ;
    public final void rule__Transition__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10801:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:10802:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:10802:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:10803:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_2_0()); 
            // InternalOCCI.g:10804:3: ( ruleQualifiedID )
            // InternalOCCI.g:10805:4: ruleQualifiedID
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
    // InternalOCCI.g:10816:1: rule__StringType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10820:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10821:2: ( RULE_ID )
            {
            // InternalOCCI.g:10821:2: ( RULE_ID )
            // InternalOCCI.g:10822:3: RULE_ID
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


    // $ANTLR start "rule__StringType__DocumentationAssignment_3_1"
    // InternalOCCI.g:10831:1: rule__StringType__DocumentationAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__StringType__DocumentationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10835:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10836:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10836:2: ( RULE_STRING )
            // InternalOCCI.g:10837:3: RULE_STRING
            {
             before(grammarAccess.getStringTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__DocumentationAssignment_3_1"


    // $ANTLR start "rule__StringType__PatternAssignment_4_1"
    // InternalOCCI.g:10846:1: rule__StringType__PatternAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__StringType__PatternAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10850:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10851:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10851:2: ( RULE_STRING )
            // InternalOCCI.g:10852:3: RULE_STRING
            {
             before(grammarAccess.getStringTypeAccess().getPatternSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getPatternSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__PatternAssignment_4_1"


    // $ANTLR start "rule__StringType__LengthAssignment_5_1"
    // InternalOCCI.g:10861:1: rule__StringType__LengthAssignment_5_1 : ( ruleEIntegerObject ) ;
    public final void rule__StringType__LengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10865:1: ( ( ruleEIntegerObject ) )
            // InternalOCCI.g:10866:2: ( ruleEIntegerObject )
            {
            // InternalOCCI.g:10866:2: ( ruleEIntegerObject )
            // InternalOCCI.g:10867:3: ruleEIntegerObject
            {
             before(grammarAccess.getStringTypeAccess().getLengthEIntegerObjectParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getLengthEIntegerObjectParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__LengthAssignment_5_1"


    // $ANTLR start "rule__StringType__MinLengthAssignment_6_1"
    // InternalOCCI.g:10876:1: rule__StringType__MinLengthAssignment_6_1 : ( ruleEIntegerObject ) ;
    public final void rule__StringType__MinLengthAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10880:1: ( ( ruleEIntegerObject ) )
            // InternalOCCI.g:10881:2: ( ruleEIntegerObject )
            {
            // InternalOCCI.g:10881:2: ( ruleEIntegerObject )
            // InternalOCCI.g:10882:3: ruleEIntegerObject
            {
             before(grammarAccess.getStringTypeAccess().getMinLengthEIntegerObjectParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getMinLengthEIntegerObjectParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__MinLengthAssignment_6_1"


    // $ANTLR start "rule__StringType__MaxLengthAssignment_7_1"
    // InternalOCCI.g:10891:1: rule__StringType__MaxLengthAssignment_7_1 : ( ruleEIntegerObject ) ;
    public final void rule__StringType__MaxLengthAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10895:1: ( ( ruleEIntegerObject ) )
            // InternalOCCI.g:10896:2: ( ruleEIntegerObject )
            {
            // InternalOCCI.g:10896:2: ( ruleEIntegerObject )
            // InternalOCCI.g:10897:3: ruleEIntegerObject
            {
             before(grammarAccess.getStringTypeAccess().getMaxLengthEIntegerObjectParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getMaxLengthEIntegerObjectParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__MaxLengthAssignment_7_1"


    // $ANTLR start "rule__EObjectType__NameAssignment_1"
    // InternalOCCI.g:10906:1: rule__EObjectType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EObjectType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10910:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10911:2: ( RULE_ID )
            {
            // InternalOCCI.g:10911:2: ( RULE_ID )
            // InternalOCCI.g:10912:3: RULE_ID
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


    // $ANTLR start "rule__EObjectType__DocumentationAssignment_3_1"
    // InternalOCCI.g:10921:1: rule__EObjectType__DocumentationAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__EObjectType__DocumentationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10925:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10926:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10926:2: ( RULE_STRING )
            // InternalOCCI.g:10927:3: RULE_STRING
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


    // $ANTLR start "rule__EObjectType__InstanceClassNameAssignment_4_1"
    // InternalOCCI.g:10936:1: rule__EObjectType__InstanceClassNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__EObjectType__InstanceClassNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10940:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10941:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10941:2: ( RULE_STRING )
            // InternalOCCI.g:10942:3: RULE_STRING
            {
             before(grammarAccess.getEObjectTypeAccess().getInstanceClassNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEObjectTypeAccess().getInstanceClassNameSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EObjectType__InstanceClassNameAssignment_4_1"


    // $ANTLR start "rule__BooleanType__NameAssignment_1"
    // InternalOCCI.g:10951:1: rule__BooleanType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BooleanType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10955:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10956:2: ( RULE_ID )
            {
            // InternalOCCI.g:10956:2: ( RULE_ID )
            // InternalOCCI.g:10957:3: RULE_ID
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


    // $ANTLR start "rule__BooleanType__DocumentationAssignment_3_1"
    // InternalOCCI.g:10966:1: rule__BooleanType__DocumentationAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__BooleanType__DocumentationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10970:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:10971:2: ( RULE_STRING )
            {
            // InternalOCCI.g:10971:2: ( RULE_STRING )
            // InternalOCCI.g:10972:3: RULE_STRING
            {
             before(grammarAccess.getBooleanTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__DocumentationAssignment_3_1"


    // $ANTLR start "rule__NumericType__NameAssignment_1"
    // InternalOCCI.g:10981:1: rule__NumericType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NumericType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:10985:1: ( ( RULE_ID ) )
            // InternalOCCI.g:10986:2: ( RULE_ID )
            {
            // InternalOCCI.g:10986:2: ( RULE_ID )
            // InternalOCCI.g:10987:3: RULE_ID
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
    // InternalOCCI.g:10996:1: rule__NumericType__TypeAssignment_3 : ( ruleNumericTypeEnum ) ;
    public final void rule__NumericType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11000:1: ( ( ruleNumericTypeEnum ) )
            // InternalOCCI.g:11001:2: ( ruleNumericTypeEnum )
            {
            // InternalOCCI.g:11001:2: ( ruleNumericTypeEnum )
            // InternalOCCI.g:11002:3: ruleNumericTypeEnum
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


    // $ANTLR start "rule__NumericType__DocumentationAssignment_5_1"
    // InternalOCCI.g:11011:1: rule__NumericType__DocumentationAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__NumericType__DocumentationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11015:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:11016:2: ( RULE_STRING )
            {
            // InternalOCCI.g:11016:2: ( RULE_STRING )
            // InternalOCCI.g:11017:3: RULE_STRING
            {
             before(grammarAccess.getNumericTypeAccess().getDocumentationSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getDocumentationSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__DocumentationAssignment_5_1"


    // $ANTLR start "rule__NumericType__TotalDigitsAssignment_6_1"
    // InternalOCCI.g:11026:1: rule__NumericType__TotalDigitsAssignment_6_1 : ( ruleEIntegerObject ) ;
    public final void rule__NumericType__TotalDigitsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11030:1: ( ( ruleEIntegerObject ) )
            // InternalOCCI.g:11031:2: ( ruleEIntegerObject )
            {
            // InternalOCCI.g:11031:2: ( ruleEIntegerObject )
            // InternalOCCI.g:11032:3: ruleEIntegerObject
            {
             before(grammarAccess.getNumericTypeAccess().getTotalDigitsEIntegerObjectParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getNumericTypeAccess().getTotalDigitsEIntegerObjectParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__TotalDigitsAssignment_6_1"


    // $ANTLR start "rule__NumericType__MinExclusiveAssignment_7_1"
    // InternalOCCI.g:11041:1: rule__NumericType__MinExclusiveAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__NumericType__MinExclusiveAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11045:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:11046:2: ( RULE_STRING )
            {
            // InternalOCCI.g:11046:2: ( RULE_STRING )
            // InternalOCCI.g:11047:3: RULE_STRING
            {
             before(grammarAccess.getNumericTypeAccess().getMinExclusiveSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMinExclusiveSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__MinExclusiveAssignment_7_1"


    // $ANTLR start "rule__NumericType__MaxExclusiveAssignment_8_1"
    // InternalOCCI.g:11056:1: rule__NumericType__MaxExclusiveAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__NumericType__MaxExclusiveAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11060:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:11061:2: ( RULE_STRING )
            {
            // InternalOCCI.g:11061:2: ( RULE_STRING )
            // InternalOCCI.g:11062:3: RULE_STRING
            {
             before(grammarAccess.getNumericTypeAccess().getMaxExclusiveSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMaxExclusiveSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__MaxExclusiveAssignment_8_1"


    // $ANTLR start "rule__NumericType__MinInclusiveAssignment_9_1"
    // InternalOCCI.g:11071:1: rule__NumericType__MinInclusiveAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__NumericType__MinInclusiveAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11075:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:11076:2: ( RULE_STRING )
            {
            // InternalOCCI.g:11076:2: ( RULE_STRING )
            // InternalOCCI.g:11077:3: RULE_STRING
            {
             before(grammarAccess.getNumericTypeAccess().getMinInclusiveSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMinInclusiveSTRINGTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__MinInclusiveAssignment_9_1"


    // $ANTLR start "rule__NumericType__MaxInclusiveAssignment_10_1"
    // InternalOCCI.g:11086:1: rule__NumericType__MaxInclusiveAssignment_10_1 : ( RULE_STRING ) ;
    public final void rule__NumericType__MaxInclusiveAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11090:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:11091:2: ( RULE_STRING )
            {
            // InternalOCCI.g:11091:2: ( RULE_STRING )
            // InternalOCCI.g:11092:3: RULE_STRING
            {
             before(grammarAccess.getNumericTypeAccess().getMaxInclusiveSTRINGTerminalRuleCall_10_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNumericTypeAccess().getMaxInclusiveSTRINGTerminalRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericType__MaxInclusiveAssignment_10_1"


    // $ANTLR start "rule__EnumerationType__NameAssignment_1"
    // InternalOCCI.g:11101:1: rule__EnumerationType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumerationType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11105:1: ( ( RULE_ID ) )
            // InternalOCCI.g:11106:2: ( RULE_ID )
            {
            // InternalOCCI.g:11106:2: ( RULE_ID )
            // InternalOCCI.g:11107:3: RULE_ID
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


    // $ANTLR start "rule__EnumerationType__LiteralsAssignment_5"
    // InternalOCCI.g:11116:1: rule__EnumerationType__LiteralsAssignment_5 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationType__LiteralsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11120:1: ( ( ruleEnumerationLiteral ) )
            // InternalOCCI.g:11121:2: ( ruleEnumerationLiteral )
            {
            // InternalOCCI.g:11121:2: ( ruleEnumerationLiteral )
            // InternalOCCI.g:11122:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__LiteralsAssignment_5"


    // $ANTLR start "rule__EnumerationType__LiteralsAssignment_6_1"
    // InternalOCCI.g:11131:1: rule__EnumerationType__LiteralsAssignment_6_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationType__LiteralsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11135:1: ( ( ruleEnumerationLiteral ) )
            // InternalOCCI.g:11136:2: ( ruleEnumerationLiteral )
            {
            // InternalOCCI.g:11136:2: ( ruleEnumerationLiteral )
            // InternalOCCI.g:11137:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationTypeAccess().getLiteralsEnumerationLiteralParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__LiteralsAssignment_6_1"


    // $ANTLR start "rule__EnumerationType__DocumentationAssignment_8_1"
    // InternalOCCI.g:11146:1: rule__EnumerationType__DocumentationAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__EnumerationType__DocumentationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11150:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:11151:2: ( RULE_STRING )
            {
            // InternalOCCI.g:11151:2: ( RULE_STRING )
            // InternalOCCI.g:11152:3: RULE_STRING
            {
             before(grammarAccess.getEnumerationTypeAccess().getDocumentationSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumerationTypeAccess().getDocumentationSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationType__DocumentationAssignment_8_1"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment_0"
    // InternalOCCI.g:11161:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11165:1: ( ( RULE_ID ) )
            // InternalOCCI.g:11166:2: ( RULE_ID )
            {
            // InternalOCCI.g:11166:2: ( RULE_ID )
            // InternalOCCI.g:11167:3: RULE_ID
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


    // $ANTLR start "rule__EnumerationLiteral__DocumentationAssignment_1_1_1"
    // InternalOCCI.g:11176:1: rule__EnumerationLiteral__DocumentationAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__EnumerationLiteral__DocumentationAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11180:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:11181:2: ( RULE_STRING )
            {
            // InternalOCCI.g:11181:2: ( RULE_STRING )
            // InternalOCCI.g:11182:3: RULE_STRING
            {
             before(grammarAccess.getEnumerationLiteralAccess().getDocumentationSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getDocumentationSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__DocumentationAssignment_1_1_1"


    // $ANTLR start "rule__RecordType__NameAssignment_1"
    // InternalOCCI.g:11191:1: rule__RecordType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11195:1: ( ( RULE_ID ) )
            // InternalOCCI.g:11196:2: ( RULE_ID )
            {
            // InternalOCCI.g:11196:2: ( RULE_ID )
            // InternalOCCI.g:11197:3: RULE_ID
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


    // $ANTLR start "rule__RecordType__DocumentationAssignment_3_1"
    // InternalOCCI.g:11206:1: rule__RecordType__DocumentationAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RecordType__DocumentationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11210:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:11211:2: ( RULE_STRING )
            {
            // InternalOCCI.g:11211:2: ( RULE_STRING )
            // InternalOCCI.g:11212:3: RULE_STRING
            {
             before(grammarAccess.getRecordTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getDocumentationSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__DocumentationAssignment_3_1"


    // $ANTLR start "rule__RecordType__RecordFieldsAssignment_6"
    // InternalOCCI.g:11221:1: rule__RecordType__RecordFieldsAssignment_6 : ( ruleRecordField ) ;
    public final void rule__RecordType__RecordFieldsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11225:1: ( ( ruleRecordField ) )
            // InternalOCCI.g:11226:2: ( ruleRecordField )
            {
            // InternalOCCI.g:11226:2: ( ruleRecordField )
            // InternalOCCI.g:11227:3: ruleRecordField
            {
             before(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRecordField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__RecordFieldsAssignment_6"


    // $ANTLR start "rule__RecordType__RecordFieldsAssignment_7_1"
    // InternalOCCI.g:11236:1: rule__RecordType__RecordFieldsAssignment_7_1 : ( ruleRecordField ) ;
    public final void rule__RecordType__RecordFieldsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11240:1: ( ( ruleRecordField ) )
            // InternalOCCI.g:11241:2: ( ruleRecordField )
            {
            // InternalOCCI.g:11241:2: ( ruleRecordField )
            // InternalOCCI.g:11242:3: ruleRecordField
            {
             before(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecordField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getRecordFieldsRecordFieldParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__RecordFieldsAssignment_7_1"


    // $ANTLR start "rule__RecordField__MutableAssignment_1"
    // InternalOCCI.g:11251:1: rule__RecordField__MutableAssignment_1 : ( ( 'mutable' ) ) ;
    public final void rule__RecordField__MutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11255:1: ( ( ( 'mutable' ) ) )
            // InternalOCCI.g:11256:2: ( ( 'mutable' ) )
            {
            // InternalOCCI.g:11256:2: ( ( 'mutable' ) )
            // InternalOCCI.g:11257:3: ( 'mutable' )
            {
             before(grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_1_0()); 
            // InternalOCCI.g:11258:3: ( 'mutable' )
            // InternalOCCI.g:11259:4: 'mutable'
            {
             before(grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_1_0()); 

            }

             after(grammarAccess.getRecordFieldAccess().getMutableMutableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__MutableAssignment_1"


    // $ANTLR start "rule__RecordField__RequiredAssignment_2"
    // InternalOCCI.g:11270:1: rule__RecordField__RequiredAssignment_2 : ( ( 'required' ) ) ;
    public final void rule__RecordField__RequiredAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11274:1: ( ( ( 'required' ) ) )
            // InternalOCCI.g:11275:2: ( ( 'required' ) )
            {
            // InternalOCCI.g:11275:2: ( ( 'required' ) )
            // InternalOCCI.g:11276:3: ( 'required' )
            {
             before(grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_2_0()); 
            // InternalOCCI.g:11277:3: ( 'required' )
            // InternalOCCI.g:11278:4: 'required'
            {
             before(grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_2_0()); 

            }

             after(grammarAccess.getRecordFieldAccess().getRequiredRequiredKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__RequiredAssignment_2"


    // $ANTLR start "rule__RecordField__NameAssignment_3"
    // InternalOCCI.g:11289:1: rule__RecordField__NameAssignment_3 : ( ruleQualifiedID ) ;
    public final void rule__RecordField__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11293:1: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:11294:2: ( ruleQualifiedID )
            {
            // InternalOCCI.g:11294:2: ( ruleQualifiedID )
            // InternalOCCI.g:11295:3: ruleQualifiedID
            {
             before(grammarAccess.getRecordFieldAccess().getNameQualifiedIDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getRecordFieldAccess().getNameQualifiedIDParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__NameAssignment_3"


    // $ANTLR start "rule__RecordField__TypeAssignment_5_1"
    // InternalOCCI.g:11304:1: rule__RecordField__TypeAssignment_5_1 : ( ( ruleQualifiedID ) ) ;
    public final void rule__RecordField__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11308:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:11309:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:11309:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:11310:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getRecordFieldAccess().getTypeDataTypeCrossReference_5_1_0()); 
            // InternalOCCI.g:11311:3: ( ruleQualifiedID )
            // InternalOCCI.g:11312:4: ruleQualifiedID
            {
             before(grammarAccess.getRecordFieldAccess().getTypeDataTypeQualifiedIDParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedID();

            state._fsp--;

             after(grammarAccess.getRecordFieldAccess().getTypeDataTypeQualifiedIDParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getRecordFieldAccess().getTypeDataTypeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__TypeAssignment_5_1"


    // $ANTLR start "rule__RecordField__DefaultAssignment_6_1"
    // InternalOCCI.g:11323:1: rule__RecordField__DefaultAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__RecordField__DefaultAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11327:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:11328:2: ( RULE_STRING )
            {
            // InternalOCCI.g:11328:2: ( RULE_STRING )
            // InternalOCCI.g:11329:3: RULE_STRING
            {
             before(grammarAccess.getRecordFieldAccess().getDefaultSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getDefaultSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__DefaultAssignment_6_1"


    // $ANTLR start "rule__RecordField__DescriptionAssignment_7_1_1"
    // InternalOCCI.g:11338:1: rule__RecordField__DescriptionAssignment_7_1_1 : ( RULE_STRING ) ;
    public final void rule__RecordField__DescriptionAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11342:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:11343:2: ( RULE_STRING )
            {
            // InternalOCCI.g:11343:2: ( RULE_STRING )
            // InternalOCCI.g:11344:3: RULE_STRING
            {
             before(grammarAccess.getRecordFieldAccess().getDescriptionSTRINGTerminalRuleCall_7_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecordFieldAccess().getDescriptionSTRINGTerminalRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__DescriptionAssignment_7_1_1"


    // $ANTLR start "rule__RecordField__AnnotationsAssignment_8_2"
    // InternalOCCI.g:11353:1: rule__RecordField__AnnotationsAssignment_8_2 : ( ruleAnnotation ) ;
    public final void rule__RecordField__AnnotationsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11357:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:11358:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:11358:2: ( ruleAnnotation )
            // InternalOCCI.g:11359:3: ruleAnnotation
            {
             before(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__AnnotationsAssignment_8_2"


    // $ANTLR start "rule__RecordField__AnnotationsAssignment_8_3_1"
    // InternalOCCI.g:11368:1: rule__RecordField__AnnotationsAssignment_8_3_1 : ( ruleAnnotation ) ;
    public final void rule__RecordField__AnnotationsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11372:1: ( ( ruleAnnotation ) )
            // InternalOCCI.g:11373:2: ( ruleAnnotation )
            {
            // InternalOCCI.g:11373:2: ( ruleAnnotation )
            // InternalOCCI.g:11374:3: ruleAnnotation
            {
             before(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getRecordFieldAccess().getAnnotationsAnnotationParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordField__AnnotationsAssignment_8_3_1"


    // $ANTLR start "rule__ArrayType__NameAssignment_1"
    // InternalOCCI.g:11383:1: rule__ArrayType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArrayType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11387:1: ( ( RULE_ID ) )
            // InternalOCCI.g:11388:2: ( RULE_ID )
            {
            // InternalOCCI.g:11388:2: ( RULE_ID )
            // InternalOCCI.g:11389:3: RULE_ID
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
    // InternalOCCI.g:11398:1: rule__ArrayType__TypeAssignment_3 : ( ( ruleQualifiedID ) ) ;
    public final void rule__ArrayType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11402:1: ( ( ( ruleQualifiedID ) ) )
            // InternalOCCI.g:11403:2: ( ( ruleQualifiedID ) )
            {
            // InternalOCCI.g:11403:2: ( ( ruleQualifiedID ) )
            // InternalOCCI.g:11404:3: ( ruleQualifiedID )
            {
             before(grammarAccess.getArrayTypeAccess().getTypeDataTypeCrossReference_3_0()); 
            // InternalOCCI.g:11405:3: ( ruleQualifiedID )
            // InternalOCCI.g:11406:4: ruleQualifiedID
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


    // $ANTLR start "rule__ArrayType__DocumentationAssignment_4_2"
    // InternalOCCI.g:11417:1: rule__ArrayType__DocumentationAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__ArrayType__DocumentationAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOCCI.g:11421:1: ( ( RULE_STRING ) )
            // InternalOCCI.g:11422:2: ( RULE_STRING )
            {
            // InternalOCCI.g:11422:2: ( RULE_STRING )
            // InternalOCCI.g:11423:3: RULE_STRING
            {
             before(grammarAccess.getArrayTypeAccess().getDocumentationSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getDocumentationSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__DocumentationAssignment_4_2"

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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003C0000L,0x0000000000000008L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000C40000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C40000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFFFFFFFFFFFFE030L,0x0000000000000001L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006200000L,0x0000000000000008L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C40400000L,0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000048L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000019000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000007C000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000104000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x07F0000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000F804000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000004000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000001012L});

}