grammar aufgabe1;

inputrow:	CELL OP CELL EQ CELL;
oprow	:	OP OP OP;
eqrow	:	EQ EQ EQ;

whole 	:	inputrow oprow inputrow eqrow inputrow;

CELL	:	('A'..'Z')+;
NEWLINE   : ('\r' '\n' | '\n' | '\r');
OP	: ('+'|'-');
EQ	: '=';


IGNOREDSIGNES : ('\n' | '\r' | ' ') {skip(); $channel=HIDDEN;};