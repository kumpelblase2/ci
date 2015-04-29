grammar minip;

options {  
  output=AST; 
  ASTLabelType=CommonTree;
}

tokens {
	STATEMENTS;
	DECLARATIONS;
	DEFINITION;
	TEST;
	FUNCTION;
	DECLARATION;
}

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
idDeclaration[Token type]
	:	ID -> ^(DECLARATION {type} ID);
    
declaration
	:	t=TYPE decs+=idDeclaration[$t] (LIST_SEPARATOR decs+=idDeclaration[$t])* STATEMENT_END NL? -> $decs*;
	
declarations
	:	(declaration)* -> ^(DECLARATIONS declaration*);
	

print	:	PRINT_KEY BRACKET_OPEN (
			STRING -> ^(FUNCTION ^(PRINT_KEY STRING))
			| arithm_variable -> ^(FUNCTION ^(PRINT_KEY arithm_variable))
			) BRACKET_CLOSE;

read	:	READ_KEY BRACKET_OPEN ID BRACKET_CLOSE -> ^(FUNCTION ^(READ_KEY ID));

arithm_constant
	:	BOOLEAN | INT | FLOAT;

arithm_variable
	:	arithm_constant
	|	(NEGATIVE)? BRACKET_OPEN arithm_constant BRACKET_CLOSE -> ^(NEGATIVE arithm_constant)
	;

expr	:	addition;
	
addition:	multi (SIGN^ multi)*
	;
	
multi	:	bracket_expr ((MULT_OP|DIV_OP)^ bracket_expr)*
	;
	
bracket_expr
	:	BRACKET_OPEN addition BRACKET_CLOSE
	|	(ID | arithm_constant);

comparison
	:	(ID | arithm_variable) COMPARE_OPERATOR^ (ID | arithm_variable)
	;
	
if_clause
	:	IF_KEY comparison THEN_KEY statements (ELSE_KEY statements)? IF_END_KEY -> ^(IF_KEY ^(TEST comparison) statements statements?)
	;
	
while_clause
	:	WHILE_KEY comparison DO_KEY statements DO_END_KEY -> ^(WHILE_KEY ^(TEST comparison) statements)
	;

definition
	:	ID DEFINE_OPERATOR (
			STRING -> ^(DEFINITION ID STRING)
			| expr -> ^(DEFINITION ID expr)
			| comparison -> ^(DEFINITION ID comparison));

function_call
	:	print | read;

statement
	:	(((function_call | definition) STATEMENT_END!) | (if_clause | while_clause)) NL?;

statements
	:	(statement)+ -> ^(STATEMENTS statement+);

// MAIN PROGRAM RULE
main	:	PROGRAM_KEY declarations BEGIN_KEY statements END_KEY -> ^(PROGRAM_KEY declarations statements);