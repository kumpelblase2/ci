grammar pascaltest;


prog 	:	PROGRAM_T declaration* BEGIN_T statement+ END_T POINT_T;
 
statement
 	:	assignment | if_clause | while_clause | read | println;
 	
 read	:	READ OPEN_BRACE IDENTIFIER_T CLOSED_BRACE EOL_T;
 
 println:	PRINTLN OPEN_BRACE (IDENTIFIER_T | STRING_T) CLOSED_BRACE EOL_T;
 	
 if_clause
 	:	IF OPEN_BRACE (comparison | BOOLEAN | IDENTIFIER_T) CLOSED_BRACE THEN statement* (ELSE statement*)? FI;
 	
 while_clause
 	:	WHILE OPEN_BRACE (comparison | BOOLEAN | IDENTIFIER_T) CLOSED_BRACE DO statement* OD;

declaration
	:	TYPE_T IDENTIFIER_T (KOMMA_T IDENTIFIER_T)* EOL_T;

assignment
	:	IDENTIFIER_T ASSIGN_T (arithm_expr | STRING_T | comparison) EOL_T;
	
comparison
	:	(IDENTIFIER_T | arith_const) COMPARISON_OP_T (IDENTIFIER_T | arith_const);
	
arithm_expr
	:	arith (arithm_sign arith)*;

arith	:	(arith_identifier (arithm_sign arith_identifier)* | OPEN_BRACE arith CLOSED_BRACE) ;

arith_identifier
	:	arith_const | IDENTIFIER_T;

arith_const
	:	real | integer ;
	
integer	:	(PLUS_SIGN | MINUS_SIGN)* (UNSIGNED_INTEGER)+ ;

real	:	integer POINT_T UNSIGNED_INTEGER;

UNSIGNED_INTEGER
	:	DIGIT_WO_ZERO (DIGIT)*;
	


arithm_sign
	:	PLUS_SIGN | MINUS_SIGN | MULT_SIGN | DIV_SIGN;

PLUS_SIGN
	:	'+';

MINUS_SIGN
	:	'-';
	
MULT_SIGN
	:	'*';
	
DIV_SIGN:	'/';

fragment DIGIT_WO_ZERO
	:	'1'..'9';

fragment DIGIT	:	'0'..'9';


OPEN_BRACE
	:	'(';
	
CLOSED_BRACE
	:	')';


IF	:	'if';

THEN	:	'then';

FI	:	'fi';

ELSE	:	'else';

WHILE	:	'while';

DO	:	'do';

OD	:	'od';

BOOLEAN	:	('true' | 'false');

READ	:	'read';

PRINTLN	:	'println';

COMPARISON_OP_T
	:	('=' | '>' | '<' | '>=' | '<=' | '<>');

STRING_T:	'\'' .* '\'';

TYPE_T	:	('integer' | 'real' | 'string' | 'boolean');

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;

PROGRAM_T : 'PROGRAM';
		
BEGIN_T : 'BEGIN';
	
END_T : 'END';
	
POINT_T : '.';

KOMMA_T	:	',';
	
ASSIGN_T : ':=';
	
IDENTIFIER_T: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

EOL_T	:	';';

