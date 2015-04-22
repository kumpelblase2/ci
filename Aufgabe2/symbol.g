grammar symbol;

options {  
  output=AST; 
}
tokens {
	CHAR_BLOCK;
	RIDDLE;
}

start	:	char_line 	NEW_LINE!
		op_line! 	NEW_LINE!
		char_line 	NEW_LINE!
		eq_line 	NEW_LINE!
		char_line;

char_line
	:	a=char_block line_sign char_block EQ_SIGN char_block -> ^(EQ_SIGN ^(line_sign char_block char_block) char_block) ;
	
op_line	:	line_sign line_sign line_sign;

eq_line	:	EQ_SIGN EQ_SIGN EQ_SIGN;
	
char_block
	:	CHAR* -> ^(CHAR_BLOCK CHAR*);

line_sign
	:	PLUS_SIGN | MINUS_SIGN;
	
all	:	char1=char_block sign1=line_sign char2=char_block EQ_SIGN char3=char_block NEW_LINE
		sign2=line_sign sign3=line_sign sign4=line_sign NEW_LINE
		char4=char_block sign5=line_sign char5=char_block EQ_SIGN char6=char_block NEW_LINE
		EQ_SIGN EQ_SIGN EQ_SIGN NEW_LINE
		char7=char_block sign6=line_sign char8=char_block EQ_SIGN char9=char_block NEW_LINE
		-> ^(RIDDLE ^(EQ_SIGN ^($sign1 $char1 $char2) $char3) ^(EQ_SIGN ^($sign5 $char4 $char5) $char6) ^(EQ_SIGN ^($sign6 $char7 $char8) $char9)
		^(EQ_SIGN ^($sign2 $char1 $char4) $char7) ^(EQ_SIGN ^($sign3 $char2 $char5) $char8) ^(EQ_SIGN ^($sign4 $char3 $char6) $char9)
		)
		;
	
NEW_LINE:	('\r\n' | '\n');
	
EQ_SIGN	:	'=';

PLUS_SIGN
	:	'+';

MINUS_SIGN
	:	'-';
	

CHAR	:	('a'..'z'|'A'..'Z');

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;