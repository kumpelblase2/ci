// $ANTLR 3.4 /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g 2015-05-20 12:37:47

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class symbolTransformWalker extends TreeParser {
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


    public symbolTransformWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public symbolTransformWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return symbolTransformWalker.tokenNames; }
    public String getGrammarFileName() { return "/home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g"; }


    public static class all_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "all"
    // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:9:1: all : ^( RIDDLE riddle riddle riddle riddle riddle riddle ) ;
    public final symbolTransformWalker.all_return all() throws RecognitionException {
        symbolTransformWalker.all_return retval = new symbolTransformWalker.all_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RIDDLE1=null;
        symbolTransformWalker.riddle_return riddle2 =null;

        symbolTransformWalker.riddle_return riddle3 =null;

        symbolTransformWalker.riddle_return riddle4 =null;

        symbolTransformWalker.riddle_return riddle5 =null;

        symbolTransformWalker.riddle_return riddle6 =null;

        symbolTransformWalker.riddle_return riddle7 =null;


        CommonTree RIDDLE1_tree=null;

        try {
            // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:9:5: ( ^( RIDDLE riddle riddle riddle riddle riddle riddle ) )
            // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:9:7: ^( RIDDLE riddle riddle riddle riddle riddle riddle )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RIDDLE1=(CommonTree)match(input,RIDDLE,FOLLOW_RIDDLE_in_all36); 
            RIDDLE1_tree = (CommonTree)adaptor.dupNode(RIDDLE1);


            root_1 = (CommonTree)adaptor.becomeRoot(RIDDLE1_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_riddle_in_all38);
            riddle2=riddle();

            state._fsp--;

            adaptor.addChild(root_1, riddle2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_riddle_in_all40);
            riddle3=riddle();

            state._fsp--;

            adaptor.addChild(root_1, riddle3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_riddle_in_all42);
            riddle4=riddle();

            state._fsp--;

            adaptor.addChild(root_1, riddle4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_riddle_in_all44);
            riddle5=riddle();

            state._fsp--;

            adaptor.addChild(root_1, riddle5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_riddle_in_all46);
            riddle6=riddle();

            state._fsp--;

            adaptor.addChild(root_1, riddle6.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_riddle_in_all48);
            riddle7=riddle();

            state._fsp--;

            adaptor.addChild(root_1, riddle7.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "all"


    public static class riddle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "riddle"
    // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:11:1: riddle : ( ^( EQ_SIGN ^( PLUS_SIGN char_block char_block ) char_block ) | ^( EQ_SIGN ^( MINUS_SIGN char1= char_block char2= char_block ) char3= char_block ) -> ^( EQ_SIGN[\"=\"] ^( PLUS_SIGN[null, \"+\"] $char2 $char3) $char1) );
    public final symbolTransformWalker.riddle_return riddle() throws RecognitionException {
        symbolTransformWalker.riddle_return retval = new symbolTransformWalker.riddle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ_SIGN8=null;
        CommonTree PLUS_SIGN9=null;
        CommonTree EQ_SIGN13=null;
        CommonTree MINUS_SIGN14=null;
        symbolTransformWalker.char_block_return char1 =null;

        symbolTransformWalker.char_block_return char2 =null;

        symbolTransformWalker.char_block_return char3 =null;

        symbolTransformWalker.char_block_return char_block10 =null;

        symbolTransformWalker.char_block_return char_block11 =null;

        symbolTransformWalker.char_block_return char_block12 =null;


        CommonTree EQ_SIGN8_tree=null;
        CommonTree PLUS_SIGN9_tree=null;
        CommonTree EQ_SIGN13_tree=null;
        CommonTree MINUS_SIGN14_tree=null;
        RewriteRuleNodeStream stream_MINUS_SIGN=new RewriteRuleNodeStream(adaptor,"token MINUS_SIGN");
        RewriteRuleNodeStream stream_EQ_SIGN=new RewriteRuleNodeStream(adaptor,"token EQ_SIGN");
        RewriteRuleSubtreeStream stream_char_block=new RewriteRuleSubtreeStream(adaptor,"rule char_block");
        try {
            // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:11:8: ( ^( EQ_SIGN ^( PLUS_SIGN char_block char_block ) char_block ) | ^( EQ_SIGN ^( MINUS_SIGN char1= char_block char2= char_block ) char3= char_block ) -> ^( EQ_SIGN[\"=\"] ^( PLUS_SIGN[null, \"+\"] $char2 $char3) $char1) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQ_SIGN) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==PLUS_SIGN) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==MINUS_SIGN) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:11:10: ^( EQ_SIGN ^( PLUS_SIGN char_block char_block ) char_block )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQ_SIGN8=(CommonTree)match(input,EQ_SIGN,FOLLOW_EQ_SIGN_in_riddle58); 
                    EQ_SIGN8_tree = (CommonTree)adaptor.dupNode(EQ_SIGN8);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQ_SIGN8_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PLUS_SIGN9=(CommonTree)match(input,PLUS_SIGN,FOLLOW_PLUS_SIGN_in_riddle63); 
                    PLUS_SIGN9_tree = (CommonTree)adaptor.dupNode(PLUS_SIGN9);


                    root_2 = (CommonTree)adaptor.becomeRoot(PLUS_SIGN9_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_char_block_in_riddle65);
                    char_block10=char_block();

                    state._fsp--;

                    adaptor.addChild(root_2, char_block10.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_char_block_in_riddle67);
                    char_block11=char_block();

                    state._fsp--;

                    adaptor.addChild(root_2, char_block11.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_char_block_in_riddle70);
                    char_block12=char_block();

                    state._fsp--;

                    adaptor.addChild(root_1, char_block12.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:12:13: ^( EQ_SIGN ^( MINUS_SIGN char1= char_block char2= char_block ) char3= char_block )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQ_SIGN13=(CommonTree)match(input,EQ_SIGN,FOLLOW_EQ_SIGN_in_riddle86);  
                    stream_EQ_SIGN.add(EQ_SIGN13);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS_SIGN14=(CommonTree)match(input,MINUS_SIGN,FOLLOW_MINUS_SIGN_in_riddle91);  
                    stream_MINUS_SIGN.add(MINUS_SIGN14);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_char_block_in_riddle95);
                    char1=char_block();

                    state._fsp--;

                    stream_char_block.add(char1.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_char_block_in_riddle99);
                    char2=char_block();

                    state._fsp--;

                    stream_char_block.add(char2.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_char_block_in_riddle104);
                    char3=char_block();

                    state._fsp--;

                    stream_char_block.add(char3.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: EQ_SIGN, char2, char3, char1
                    // token labels: 
                    // rule labels: char1, char3, retval, char2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_char1=new RewriteRuleSubtreeStream(adaptor,"rule char1",char1!=null?char1.tree:null);
                    RewriteRuleSubtreeStream stream_char3=new RewriteRuleSubtreeStream(adaptor,"rule char3",char3!=null?char3.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_char2=new RewriteRuleSubtreeStream(adaptor,"rule char2",char2!=null?char2.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 12:91: -> ^( EQ_SIGN[\"=\"] ^( PLUS_SIGN[null, \"+\"] $char2 $char3) $char1)
                    {
                        // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:12:94: ^( EQ_SIGN[\"=\"] ^( PLUS_SIGN[null, \"+\"] $char2 $char3) $char1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EQ_SIGN, "=")
                        , root_1);

                        // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:12:109: ^( PLUS_SIGN[null, \"+\"] $char2 $char3)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PLUS_SIGN, null, "+")
                        , root_2);

                        adaptor.addChild(root_2, stream_char2.nextTree());

                        adaptor.addChild(root_2, stream_char3.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_char1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "riddle"


    public static class char_block_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "char_block"
    // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:15:1: char_block : ^( CHAR_BLOCK ( CHAR )* ) ;
    public final symbolTransformWalker.char_block_return char_block() throws RecognitionException {
        symbolTransformWalker.char_block_return retval = new symbolTransformWalker.char_block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CHAR_BLOCK15=null;
        CommonTree CHAR16=null;

        CommonTree CHAR_BLOCK15_tree=null;
        CommonTree CHAR16_tree=null;

        try {
            // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:16:2: ( ^( CHAR_BLOCK ( CHAR )* ) )
            // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:16:4: ^( CHAR_BLOCK ( CHAR )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CHAR_BLOCK15=(CommonTree)match(input,CHAR_BLOCK,FOLLOW_CHAR_BLOCK_in_char_block145); 
            CHAR_BLOCK15_tree = (CommonTree)adaptor.dupNode(CHAR_BLOCK15);


            root_1 = (CommonTree)adaptor.becomeRoot(CHAR_BLOCK15_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:16:17: ( CHAR )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==CHAR) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /home/tim/projects/ci/Aufgabe3/symbolTransformWalker.g:16:17: CHAR
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    CHAR16=(CommonTree)match(input,CHAR,FOLLOW_CHAR_in_char_block147); 
                	    CHAR16_tree = (CommonTree)adaptor.dupNode(CHAR16);


                	    adaptor.addChild(root_1, CHAR16_tree);


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
    // $ANTLR end "char_block"

    // Delegated rules


 

    public static final BitSet FOLLOW_RIDDLE_in_all36 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_riddle_in_all38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_riddle_in_all40 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_riddle_in_all42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_riddle_in_all44 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_riddle_in_all46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_riddle_in_all48 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_SIGN_in_riddle58 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_SIGN_in_riddle63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_char_block_in_riddle65 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_char_block_in_riddle67 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_char_block_in_riddle70 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_SIGN_in_riddle86 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_SIGN_in_riddle91 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_char_block_in_riddle95 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_char_block_in_riddle99 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_char_block_in_riddle104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHAR_BLOCK_in_char_block145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CHAR_in_char_block147 = new BitSet(new long[]{0x0000000000000018L});

}