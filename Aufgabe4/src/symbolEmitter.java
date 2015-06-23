// $ANTLR 3.4 Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g 2015-06-10 12:47:02

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class symbolEmitter extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "CHAR_BLOCK", "EQ_SIGN", "MINUS_SIGN", "NEW_LINE", "PLUS_SIGN", "RIDDLE", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int CHAR=4;
    public static final int CHAR_BLOCK=5;
    public static final int EQ_SIGN=6;
    public static final int MINUS_SIGN=7;
    public static final int NEW_LINE=8;
    public static final int PLUS_SIGN=9;
    public static final int RIDDLE=10;
    public static final int WHITESPACE=11;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public symbolEmitter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public symbolEmitter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("symbolEmitterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return symbolEmitter.tokenNames; }
    public String getGrammarFileName() { return "Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g"; }


    public static class puzzle_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "puzzle"
    // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:9:1: puzzle : ^( RIDDLE (constraints+= constraint )* ) -> sums(sums=$constraints);
    public final symbolEmitter.puzzle_return puzzle() throws RecognitionException {
        symbolEmitter.puzzle_return retval = new symbolEmitter.puzzle_return();
        retval.start = input.LT(1);


        List list_constraints=null;
        RuleReturnScope constraints = null;
        try {
            // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:10:3: ( ^( RIDDLE (constraints+= constraint )* ) -> sums(sums=$constraints))
            // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:11:3: ^( RIDDLE (constraints+= constraint )* )
            {
            match(input,RIDDLE,FOLLOW_RIDDLE_in_puzzle57); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:11:23: (constraints+= constraint )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==EQ_SIGN) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:11:23: constraints+= constraint
                	    {
                	    pushFollow(FOLLOW_constraint_in_puzzle61);
                	    constraints=constraint();

                	    state._fsp--;

                	    if (list_constraints==null) list_constraints=new ArrayList();
                	    list_constraints.add(constraints.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 12:3: -> sums(sums=$constraints)
            {
                retval.st = templateLib.getInstanceOf("sums",new STAttrMap().put("sums", list_constraints));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "puzzle"


    public static class constraint_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constraint"
    // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:15:1: constraint : ^( EQ_SIGN ^( PLUS_SIGN n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number);
    public final symbolEmitter.constraint_return constraint() throws RecognitionException {
        symbolEmitter.constraint_return retval = new symbolEmitter.constraint_return();
        retval.start = input.LT(1);


        symbolEmitter.number_return n1 =null;

        symbolEmitter.number_return n2 =null;

        symbolEmitter.number_return n3 =null;


        try {
            // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:23:3: ( ^( EQ_SIGN ^( PLUS_SIGN n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number))
            // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:24:3: ^( EQ_SIGN ^( PLUS_SIGN n1= number n2= number ) n3= number )
            {
            match(input,EQ_SIGN,FOLLOW_EQ_SIGN_in_constraint100); 

            match(input, Token.DOWN, null); 
            match(input,PLUS_SIGN,FOLLOW_PLUS_SIGN_in_constraint107); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_number_in_constraint111);
            n1=number();

            state._fsp--;


            pushFollow(FOLLOW_number_in_constraint115);
            n2=number();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_number_in_constraint124);
            n3=number();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 29:4: -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("number1", (n1!=null?n1.number:null)).put("number2", (n2!=null?n2.number:null)).put("number3", (n3!=null?n3.number:null)));
            }



            }


            	Constraint constraint = new Constraint();
            	constraint.numbers.add((n1!=null?n1.number:null));
            	constraint.numbers.add((n2!=null?n2.number:null));
            	constraint.numbers.add((n3!=null?n3.number:null));
            	constraint.prepare();

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraint"


    public static class number_return extends TreeRuleReturnScope {
        public Number number;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "number"
    // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:32:1: number returns [Number number] : ^( CHAR_BLOCK (syms+= CHAR )+ ) ;
    public final symbolEmitter.number_return number() throws RecognitionException {
        symbolEmitter.number_return retval = new symbolEmitter.number_return();
        retval.start = input.LT(1);


        CommonTree syms=null;
        List list_syms=null;

        try {
            // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:37:3: ( ^( CHAR_BLOCK (syms+= CHAR )+ ) )
            // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:38:3: ^( CHAR_BLOCK (syms+= CHAR )+ )
            {
            match(input,CHAR_BLOCK,FOLLOW_CHAR_BLOCK_in_number176); 

            match(input, Token.DOWN, null); 
            // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:38:20: (syms+= CHAR )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CHAR) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Z:\\win7\\ci\\Aufgabe4\\symbolEmitter.g:38:20: syms+= CHAR
            	    {
            	    syms=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_number180); 
            	    if (list_syms==null) list_syms=new ArrayList();
            	    list_syms.add(syms);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); 


            }


            	retval.number = new Number();
            	retval.number.setDigits(list_syms);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_RIDDLE_in_puzzle57 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_puzzle61 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_EQ_SIGN_in_constraint100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_SIGN_in_constraint107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_constraint111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_number_in_constraint115 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_constraint124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHAR_BLOCK_in_number176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CHAR_in_number180 = new BitSet(new long[]{0x0000000000000018L});

}