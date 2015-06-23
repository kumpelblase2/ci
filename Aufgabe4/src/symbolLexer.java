// $ANTLR 3.4 Z:\\win7\\ci\\Aufgabe4\\symbol.g 2015-06-10 12:46:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class symbolLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public symbolLexer() {} 
    public symbolLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public symbolLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Z:\\win7\\ci\\Aufgabe4\\symbol.g"; }

    // $ANTLR start "NEW_LINE"
    public final void mNEW_LINE() throws RecognitionException {
        try {
            int _type = NEW_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:46:9: ( ( '\\r\\n' | '\\n' ) )
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:46:11: ( '\\r\\n' | '\\n' )
            {
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:46:11: ( '\\r\\n' | '\\n' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            else if ( (LA1_0=='\n') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Z:\\win7\\ci\\Aufgabe4\\symbol.g:46:12: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Z:\\win7\\ci\\Aufgabe4\\symbol.g:46:21: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW_LINE"

    // $ANTLR start "EQ_SIGN"
    public final void mEQ_SIGN() throws RecognitionException {
        try {
            int _type = EQ_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:48:9: ( '=' )
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:48:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ_SIGN"

    // $ANTLR start "PLUS_SIGN"
    public final void mPLUS_SIGN() throws RecognitionException {
        try {
            int _type = PLUS_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:51:2: ( '+' )
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:51:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS_SIGN"

    // $ANTLR start "MINUS_SIGN"
    public final void mMINUS_SIGN() throws RecognitionException {
        try {
            int _type = MINUS_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:54:2: ( '-' )
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:54:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS_SIGN"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:57:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:59:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:59:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // Z:\\win7\\ci\\Aufgabe4\\symbol.g:59:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Z:\\win7\\ci\\Aufgabe4\\symbol.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // Z:\\win7\\ci\\Aufgabe4\\symbol.g:1:8: ( NEW_LINE | EQ_SIGN | PLUS_SIGN | MINUS_SIGN | CHAR | WHITESPACE )
        int alt3=6;
        switch ( input.LA(1) ) {
        case '\r':
            {
            int LA3_1 = input.LA(2);

            if ( (LA3_1=='\n') ) {
                int LA3_8 = input.LA(3);

                if ( ((LA3_8 >= '\t' && LA3_8 <= '\n')||(LA3_8 >= '\f' && LA3_8 <= '\r')||LA3_8==' ') ) {
                    alt3=6;
                }
                else {
                    alt3=1;
                }
            }
            else {
                alt3=6;
            }
            }
            break;
        case '\n':
            {
            int LA3_2 = input.LA(2);

            if ( ((LA3_2 >= '\t' && LA3_2 <= '\n')||(LA3_2 >= '\f' && LA3_2 <= '\r')||LA3_2==' ') ) {
                alt3=6;
            }
            else {
                alt3=1;
            }
            }
            break;
        case '=':
            {
            alt3=2;
            }
            break;
        case '+':
            {
            alt3=3;
            }
            break;
        case '-':
            {
            alt3=4;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=5;
            }
            break;
        case '\t':
        case '\f':
        case ' ':
            {
            alt3=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;

        }

        switch (alt3) {
            case 1 :
                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:1:10: NEW_LINE
                {
                mNEW_LINE(); 


                }
                break;
            case 2 :
                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:1:19: EQ_SIGN
                {
                mEQ_SIGN(); 


                }
                break;
            case 3 :
                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:1:27: PLUS_SIGN
                {
                mPLUS_SIGN(); 


                }
                break;
            case 4 :
                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:1:37: MINUS_SIGN
                {
                mMINUS_SIGN(); 


                }
                break;
            case 5 :
                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:1:48: CHAR
                {
                mCHAR(); 


                }
                break;
            case 6 :
                // Z:\\win7\\ci\\Aufgabe4\\symbol.g:1:53: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


 

}