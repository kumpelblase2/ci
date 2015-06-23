// $ANTLR 3.4 Z:\\win7\\ci\\Aufgabe4\\symbol.g 2015-06-10 12:46:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class symbolParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public symbolParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public symbolParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return symbolParser.tokenNames; }
    public String getGrammarFileName() { return "Z:\\win7\\ci\\Aufgabe4\\symbol.g"; }


    public static class char_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "char_block"
    // Z:\\win7\\ci\\Aufgabe4\\symbol.g:25:1: char_block : ( CHAR )* -> ^( CHAR_BLOCK ( CHAR )* ) ;
    public final symbolParser.char_block_return char_block() throws RecognitionException {
        symbolParser.char_block_return retval = new symbolParser.char_block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CHAR1=null;

        CommonTree CHAR1_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");

        try {
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:26:2: ( ( CHAR )* -> ^( CHAR_BLOCK ( CHAR )* ) )
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:26:4: ( CHAR )*
            {
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:26:4: ( CHAR )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CHAR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Z:\\win7\\ci\\Aufgabe4\\symbol.g:26:4: CHAR
            	    {
            	    CHAR1=(Token)match(input,CHAR,FOLLOW_CHAR_in_char_block55);  
            	    stream_CHAR.add(CHAR1);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: CHAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 26:10: -> ^( CHAR_BLOCK ( CHAR )* )
            {
                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:26:13: ^( CHAR_BLOCK ( CHAR )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CHAR_BLOCK, "CHAR_BLOCK")
                , root_1);

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:26:26: ( CHAR )*
                while ( stream_CHAR.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_CHAR.nextNode()
                    );

                }
                stream_CHAR.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "char_block"


    public static class line_sign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line_sign"
    // Z:\\win7\\ci\\Aufgabe4\\symbol.g:28:1: line_sign : ( PLUS_SIGN | MINUS_SIGN );
    public final symbolParser.line_sign_return line_sign() throws RecognitionException {
        symbolParser.line_sign_return retval = new symbolParser.line_sign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set2=null;

        CommonTree set2_tree=null;

        try {
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:29:2: ( PLUS_SIGN | MINUS_SIGN )
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set2=(Token)input.LT(1);

            if ( input.LA(1)==MINUS_SIGN||input.LA(1)==PLUS_SIGN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set2)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "line_sign"


    public static class all_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "all"
    // Z:\\win7\\ci\\Aufgabe4\\symbol.g:31:1: all : char1= char_block sign1= line_sign char2= char_block EQ_SIGN char3= char_block NEW_LINE sign2= line_sign sign3= line_sign sign4= line_sign NEW_LINE char4= char_block sign5= line_sign char5= char_block EQ_SIGN char6= char_block NEW_LINE EQ_SIGN EQ_SIGN EQ_SIGN NEW_LINE char7= char_block sign6= line_sign char8= char_block EQ_SIGN char9= char_block NEW_LINE -> ^( RIDDLE ^( EQ_SIGN ^( $sign1 $char1 $char2) $char3) ^( EQ_SIGN ^( $sign5 $char4 $char5) $char6) ^( EQ_SIGN ^( $sign6 $char7 $char8) $char9) ^( EQ_SIGN ^( $sign2 $char1 $char4) $char7) ^( EQ_SIGN ^( $sign3 $char2 $char5) $char8) ^( EQ_SIGN ^( $sign4 $char3 $char6) $char9) ) ;
    public final symbolParser.all_return all() throws RecognitionException {
        symbolParser.all_return retval = new symbolParser.all_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ_SIGN3=null;
        Token NEW_LINE4=null;
        Token NEW_LINE5=null;
        Token EQ_SIGN6=null;
        Token NEW_LINE7=null;
        Token EQ_SIGN8=null;
        Token EQ_SIGN9=null;
        Token EQ_SIGN10=null;
        Token NEW_LINE11=null;
        Token EQ_SIGN12=null;
        Token NEW_LINE13=null;
        symbolParser.char_block_return char1 =null;

        symbolParser.line_sign_return sign1 =null;

        symbolParser.char_block_return char2 =null;

        symbolParser.char_block_return char3 =null;

        symbolParser.line_sign_return sign2 =null;

        symbolParser.line_sign_return sign3 =null;

        symbolParser.line_sign_return sign4 =null;

        symbolParser.char_block_return char4 =null;

        symbolParser.line_sign_return sign5 =null;

        symbolParser.char_block_return char5 =null;

        symbolParser.char_block_return char6 =null;

        symbolParser.char_block_return char7 =null;

        symbolParser.line_sign_return sign6 =null;

        symbolParser.char_block_return char8 =null;

        symbolParser.char_block_return char9 =null;


        CommonTree EQ_SIGN3_tree=null;
        CommonTree NEW_LINE4_tree=null;
        CommonTree NEW_LINE5_tree=null;
        CommonTree EQ_SIGN6_tree=null;
        CommonTree NEW_LINE7_tree=null;
        CommonTree EQ_SIGN8_tree=null;
        CommonTree EQ_SIGN9_tree=null;
        CommonTree EQ_SIGN10_tree=null;
        CommonTree NEW_LINE11_tree=null;
        CommonTree EQ_SIGN12_tree=null;
        CommonTree NEW_LINE13_tree=null;
        RewriteRuleTokenStream stream_EQ_SIGN=new RewriteRuleTokenStream(adaptor,"token EQ_SIGN");
        RewriteRuleTokenStream stream_NEW_LINE=new RewriteRuleTokenStream(adaptor,"token NEW_LINE");
        RewriteRuleSubtreeStream stream_char_block=new RewriteRuleSubtreeStream(adaptor,"rule char_block");
        RewriteRuleSubtreeStream stream_line_sign=new RewriteRuleSubtreeStream(adaptor,"rule line_sign");
        try {
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:31:5: (char1= char_block sign1= line_sign char2= char_block EQ_SIGN char3= char_block NEW_LINE sign2= line_sign sign3= line_sign sign4= line_sign NEW_LINE char4= char_block sign5= line_sign char5= char_block EQ_SIGN char6= char_block NEW_LINE EQ_SIGN EQ_SIGN EQ_SIGN NEW_LINE char7= char_block sign6= line_sign char8= char_block EQ_SIGN char9= char_block NEW_LINE -> ^( RIDDLE ^( EQ_SIGN ^( $sign1 $char1 $char2) $char3) ^( EQ_SIGN ^( $sign5 $char4 $char5) $char6) ^( EQ_SIGN ^( $sign6 $char7 $char8) $char9) ^( EQ_SIGN ^( $sign2 $char1 $char4) $char7) ^( EQ_SIGN ^( $sign3 $char2 $char5) $char8) ^( EQ_SIGN ^( $sign4 $char3 $char6) $char9) ) )
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:31:7: char1= char_block sign1= line_sign char2= char_block EQ_SIGN char3= char_block NEW_LINE sign2= line_sign sign3= line_sign sign4= line_sign NEW_LINE char4= char_block sign5= line_sign char5= char_block EQ_SIGN char6= char_block NEW_LINE EQ_SIGN EQ_SIGN EQ_SIGN NEW_LINE char7= char_block sign6= line_sign char8= char_block EQ_SIGN char9= char_block NEW_LINE
            {
            pushFollow(FOLLOW_char_block_in_all88);
            char1=char_block();

            state._fsp--;

            stream_char_block.add(char1.getTree());

            pushFollow(FOLLOW_line_sign_in_all92);
            sign1=line_sign();

            state._fsp--;

            stream_line_sign.add(sign1.getTree());

            pushFollow(FOLLOW_char_block_in_all96);
            char2=char_block();

            state._fsp--;

            stream_char_block.add(char2.getTree());

            EQ_SIGN3=(Token)match(input,EQ_SIGN,FOLLOW_EQ_SIGN_in_all98);  
            stream_EQ_SIGN.add(EQ_SIGN3);


            pushFollow(FOLLOW_char_block_in_all102);
            char3=char_block();

            state._fsp--;

            stream_char_block.add(char3.getTree());

            NEW_LINE4=(Token)match(input,NEW_LINE,FOLLOW_NEW_LINE_in_all104);  
            stream_NEW_LINE.add(NEW_LINE4);


            pushFollow(FOLLOW_line_sign_in_all110);
            sign2=line_sign();

            state._fsp--;

            stream_line_sign.add(sign2.getTree());

            pushFollow(FOLLOW_line_sign_in_all114);
            sign3=line_sign();

            state._fsp--;

            stream_line_sign.add(sign3.getTree());

            pushFollow(FOLLOW_line_sign_in_all118);
            sign4=line_sign();

            state._fsp--;

            stream_line_sign.add(sign4.getTree());

            NEW_LINE5=(Token)match(input,NEW_LINE,FOLLOW_NEW_LINE_in_all120);  
            stream_NEW_LINE.add(NEW_LINE5);


            pushFollow(FOLLOW_char_block_in_all126);
            char4=char_block();

            state._fsp--;

            stream_char_block.add(char4.getTree());

            pushFollow(FOLLOW_line_sign_in_all130);
            sign5=line_sign();

            state._fsp--;

            stream_line_sign.add(sign5.getTree());

            pushFollow(FOLLOW_char_block_in_all134);
            char5=char_block();

            state._fsp--;

            stream_char_block.add(char5.getTree());

            EQ_SIGN6=(Token)match(input,EQ_SIGN,FOLLOW_EQ_SIGN_in_all136);  
            stream_EQ_SIGN.add(EQ_SIGN6);


            pushFollow(FOLLOW_char_block_in_all140);
            char6=char_block();

            state._fsp--;

            stream_char_block.add(char6.getTree());

            NEW_LINE7=(Token)match(input,NEW_LINE,FOLLOW_NEW_LINE_in_all142);  
            stream_NEW_LINE.add(NEW_LINE7);


            EQ_SIGN8=(Token)match(input,EQ_SIGN,FOLLOW_EQ_SIGN_in_all146);  
            stream_EQ_SIGN.add(EQ_SIGN8);


            EQ_SIGN9=(Token)match(input,EQ_SIGN,FOLLOW_EQ_SIGN_in_all148);  
            stream_EQ_SIGN.add(EQ_SIGN9);


            EQ_SIGN10=(Token)match(input,EQ_SIGN,FOLLOW_EQ_SIGN_in_all150);  
            stream_EQ_SIGN.add(EQ_SIGN10);


            NEW_LINE11=(Token)match(input,NEW_LINE,FOLLOW_NEW_LINE_in_all152);  
            stream_NEW_LINE.add(NEW_LINE11);


            pushFollow(FOLLOW_char_block_in_all158);
            char7=char_block();

            state._fsp--;

            stream_char_block.add(char7.getTree());

            pushFollow(FOLLOW_line_sign_in_all162);
            sign6=line_sign();

            state._fsp--;

            stream_line_sign.add(sign6.getTree());

            pushFollow(FOLLOW_char_block_in_all166);
            char8=char_block();

            state._fsp--;

            stream_char_block.add(char8.getTree());

            EQ_SIGN12=(Token)match(input,EQ_SIGN,FOLLOW_EQ_SIGN_in_all168);  
            stream_EQ_SIGN.add(EQ_SIGN12);


            pushFollow(FOLLOW_char_block_in_all172);
            char9=char_block();

            state._fsp--;

            stream_char_block.add(char9.getTree());

            NEW_LINE13=(Token)match(input,NEW_LINE,FOLLOW_NEW_LINE_in_all174);  
            stream_NEW_LINE.add(NEW_LINE13);


            // AST REWRITE
            // elements: char8, sign2, sign3, char2, char8, EQ_SIGN, char9, sign5, char4, EQ_SIGN, sign6, sign4, char6, char1, char5, char1, char5, EQ_SIGN, char7, char9, char3, char4, char3, sign1, char2, char7, EQ_SIGN, char6, EQ_SIGN, EQ_SIGN
            // token labels: 
            // rule labels: char9, char8, char7, char6, retval, sign2, sign1, sign4, sign3, char1, sign6, char5, sign5, char4, char3, char2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_char9=new RewriteRuleSubtreeStream(adaptor,"rule char9",char9!=null?char9.tree:null);
            RewriteRuleSubtreeStream stream_char8=new RewriteRuleSubtreeStream(adaptor,"rule char8",char8!=null?char8.tree:null);
            RewriteRuleSubtreeStream stream_char7=new RewriteRuleSubtreeStream(adaptor,"rule char7",char7!=null?char7.tree:null);
            RewriteRuleSubtreeStream stream_char6=new RewriteRuleSubtreeStream(adaptor,"rule char6",char6!=null?char6.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_sign2=new RewriteRuleSubtreeStream(adaptor,"rule sign2",sign2!=null?sign2.tree:null);
            RewriteRuleSubtreeStream stream_sign1=new RewriteRuleSubtreeStream(adaptor,"rule sign1",sign1!=null?sign1.tree:null);
            RewriteRuleSubtreeStream stream_sign4=new RewriteRuleSubtreeStream(adaptor,"rule sign4",sign4!=null?sign4.tree:null);
            RewriteRuleSubtreeStream stream_sign3=new RewriteRuleSubtreeStream(adaptor,"rule sign3",sign3!=null?sign3.tree:null);
            RewriteRuleSubtreeStream stream_char1=new RewriteRuleSubtreeStream(adaptor,"rule char1",char1!=null?char1.tree:null);
            RewriteRuleSubtreeStream stream_sign6=new RewriteRuleSubtreeStream(adaptor,"rule sign6",sign6!=null?sign6.tree:null);
            RewriteRuleSubtreeStream stream_char5=new RewriteRuleSubtreeStream(adaptor,"rule char5",char5!=null?char5.tree:null);
            RewriteRuleSubtreeStream stream_sign5=new RewriteRuleSubtreeStream(adaptor,"rule sign5",sign5!=null?sign5.tree:null);
            RewriteRuleSubtreeStream stream_char4=new RewriteRuleSubtreeStream(adaptor,"rule char4",char4!=null?char4.tree:null);
            RewriteRuleSubtreeStream stream_char3=new RewriteRuleSubtreeStream(adaptor,"rule char3",char3!=null?char3.tree:null);
            RewriteRuleSubtreeStream stream_char2=new RewriteRuleSubtreeStream(adaptor,"rule char2",char2!=null?char2.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 36:3: -> ^( RIDDLE ^( EQ_SIGN ^( $sign1 $char1 $char2) $char3) ^( EQ_SIGN ^( $sign5 $char4 $char5) $char6) ^( EQ_SIGN ^( $sign6 $char7 $char8) $char9) ^( EQ_SIGN ^( $sign2 $char1 $char4) $char7) ^( EQ_SIGN ^( $sign3 $char2 $char5) $char8) ^( EQ_SIGN ^( $sign4 $char3 $char6) $char9) )
            {
                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:36:6: ^( RIDDLE ^( EQ_SIGN ^( $sign1 $char1 $char2) $char3) ^( EQ_SIGN ^( $sign5 $char4 $char5) $char6) ^( EQ_SIGN ^( $sign6 $char7 $char8) $char9) ^( EQ_SIGN ^( $sign2 $char1 $char4) $char7) ^( EQ_SIGN ^( $sign3 $char2 $char5) $char8) ^( EQ_SIGN ^( $sign4 $char3 $char6) $char9) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RIDDLE, "RIDDLE")
                , root_1);

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:37:3: ^( EQ_SIGN ^( $sign1 $char1 $char2) $char3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ_SIGN.nextNode()
                , root_2);

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:37:13: ^( $sign1 $char1 $char2)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_sign1.nextNode(), root_3);

                adaptor.addChild(root_3, stream_char1.nextTree());

                adaptor.addChild(root_3, stream_char2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_char3.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:38:3: ^( EQ_SIGN ^( $sign5 $char4 $char5) $char6)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ_SIGN.nextNode()
                , root_2);

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:38:13: ^( $sign5 $char4 $char5)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_sign5.nextNode(), root_3);

                adaptor.addChild(root_3, stream_char4.nextTree());

                adaptor.addChild(root_3, stream_char5.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_char6.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:39:3: ^( EQ_SIGN ^( $sign6 $char7 $char8) $char9)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ_SIGN.nextNode()
                , root_2);

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:39:13: ^( $sign6 $char7 $char8)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_sign6.nextNode(), root_3);

                adaptor.addChild(root_3, stream_char7.nextTree());

                adaptor.addChild(root_3, stream_char8.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_char9.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:40:3: ^( EQ_SIGN ^( $sign2 $char1 $char4) $char7)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ_SIGN.nextNode()
                , root_2);

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:40:13: ^( $sign2 $char1 $char4)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_sign2.nextNode(), root_3);

                adaptor.addChild(root_3, stream_char1.nextTree());

                adaptor.addChild(root_3, stream_char4.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_char7.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:41:3: ^( EQ_SIGN ^( $sign3 $char2 $char5) $char8)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ_SIGN.nextNode()
                , root_2);

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:41:13: ^( $sign3 $char2 $char5)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_sign3.nextNode(), root_3);

                adaptor.addChild(root_3, stream_char2.nextTree());

                adaptor.addChild(root_3, stream_char5.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_char8.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:42:3: ^( EQ_SIGN ^( $sign4 $char3 $char6) $char9)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_EQ_SIGN.nextNode()
                , root_2);

                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:42:13: ^( $sign4 $char3 $char6)
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(stream_sign4.nextNode(), root_3);

                adaptor.addChild(root_3, stream_char3.nextTree());

                adaptor.addChild(root_3, stream_char6.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_2, stream_char9.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "all"

    // Delegated rules


 

    public static final BitSet FOLLOW_CHAR_in_char_block55 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_char_block_in_all88 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_line_sign_in_all92 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_char_block_in_all96 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQ_SIGN_in_all98 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_char_block_in_all102 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEW_LINE_in_all104 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_line_sign_in_all110 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_line_sign_in_all114 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_line_sign_in_all118 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEW_LINE_in_all120 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_char_block_in_all126 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_line_sign_in_all130 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_char_block_in_all134 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQ_SIGN_in_all136 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_char_block_in_all140 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEW_LINE_in_all142 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQ_SIGN_in_all146 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQ_SIGN_in_all148 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQ_SIGN_in_all150 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEW_LINE_in_all152 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_char_block_in_all158 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_line_sign_in_all162 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_char_block_in_all166 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQ_SIGN_in_all168 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_char_block_in_all172 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEW_LINE_in_all174 = new BitSet(new long[]{0x0000000000000002L});

}