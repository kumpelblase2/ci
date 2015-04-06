grammar symbol;


start	:	char_line 	NEW_LINE
		op_line 	NEW_LINE
		char_line 	NEW_LINE
		eq_line 	NEW_LINE
		char_line;

char_line
	:	char_block line_sign char_block EQ_SIGN char_block;
	
op_line	:	line_sign line_sign line_sign;

eq_line	:	EQ_SIGN EQ_SIGN EQ_SIGN;
	
char_block
	:	CHAR*;

line_sign
	:	PLUS_SIGN | MINUS_SIGN;
	
NEW_LINE:	('\r\n' | '\n');
	
EQ_SIGN	:	'=';

PLUS_SIGN
	:	'+';

MINUS_SIGN
	:	'-';
	

CHAR	:	('a'..'z'|'A'..'Z');

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;