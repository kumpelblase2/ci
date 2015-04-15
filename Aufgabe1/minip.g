grammar minip;

/*
	FRAGMENTS
*/
fragment
CHAR	:	('a'..'z'|'A'..'Z');

fragment
DIGIT	:	'0'..'9';

fragment
NEGATIVE:	'-';

fragment
PLUS	:	'+';

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

/*
	KEYWORDS
*/

PROGRAM_KEY	:	'program';

BEGIN_KEY	:	'begin';

END_KEY		:	'end';

PRINT_KEY	:	'print'('ln')?;

READ_KEY	:	'read';

IF_KEY		:	'if';

THEN_KEY	:	'then';

IF_END_KEY	:	'fi';

ELSE_KEY	:	'else';

WHILE_KEY	:	'while';

DO_KEY		:	'do';

DO_END_KEY	:	'od';

/*
	LEXER CONSTANTS
*/

BOOLEAN		:	('true' | 'false');

TYPE		:	'integer'|'real'|'string'|'boolean';

STRING
    :  '\'' (~('\\'|'\''))* '\''
    ;
    
BRACKET_OPEN
	:	'(';
	
BRACKET_CLOSE
	:	')';
	
MULT_OP	:	'*';

DIV_OP	:	'/';
	
COMPARE_OPERATOR
	:	'<>'
	|	'<'('=')?
	|	'>'('=')?
	|	'='
	;

DEFINE_OPERATOR
	:	':=';
	
STATEMENT_END
	:	';';

LIST_SEPARATOR
	:	',';

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

NL	:	('\n'|'\\r\n') {$channel=HIDDEN;};

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

/*
	LEXER RULES
*/

ID  :	CHAR (CHAR|DIGIT|'_')*;

INT :	NEGATIVE? DIGIT+;

FLOAT:   NEGATIVE? DIGIT+ '.' DIGIT+;

SIGN 	:	PLUS|NEGATIVE;
    
/*
	PARSER RULES
*/
    
idlist	:	(ID LIST_SEPARATOR)* ID;
    
declaration
	:	TYPE idlist STATEMENT_END NL?;

print	:	PRINT_KEY BRACKET_OPEN (STRING | arithm_variable) BRACKET_CLOSE;

read	:	READ_KEY BRACKET_OPEN ID BRACKET_CLOSE;

arithm_constant
	:	BOOLEAN | INT | FLOAT;

arithm_variable
	:	arithm_constant
	|	(NEGATIVE)? BRACKET_OPEN arithm_constant BRACKET_CLOSE
	;

expr	:	addition;
	
addition:	multi (SIGN multi)*
	;
	
multi	:	bracket_expr ((MULT_OP|DIV_OP) bracket_expr)*
	;
	
bracket_expr
	:	BRACKET_OPEN addition BRACKET_CLOSE
	|	(ID | arithm_constant);

comparison
	:	(ID | arithm_variable) COMPARE_OPERATOR (ID | arithm_variable)
	;
	
if_clause
	:	IF_KEY comparison THEN_KEY statement+ (ELSE_KEY statement+)? IF_END_KEY
	;
	
while_clause
	:	WHILE_KEY comparison DO_KEY statement+ DO_END_KEY
	;

definition
	:	ID DEFINE_OPERATOR ( STRING | expr | comparison );

function_call
	:	print | read;

statement
	:	(((function_call | definition) STATEMENT_END) | (if_clause | while_clause)) NL?;


// MAIN PROGRAM RULE
main	:	PROGRAM_KEY (declaration)* BEGIN_KEY (statement)+ END_KEY;