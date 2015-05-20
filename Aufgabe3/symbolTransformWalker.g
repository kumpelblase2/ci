tree grammar symbolTransformWalker;

options {
	output=AST;
	tokenVocab=symbol;
	ASTLabelType=CommonTree;
}

all	: ^(RIDDLE riddle riddle riddle riddle riddle riddle);

riddle	:	^(EQ_SIGN   ^(PLUS_SIGN char_block char_block) char_block)
        |   ^(EQ_SIGN   ^(MINUS_SIGN char1=char_block char2=char_block) char3=char_block) -> ^(EQ_SIGN["="] ^(PLUS_SIGN[null, "+"] $char2 $char3) $char1)
        ;

char_block
	:	^(CHAR_BLOCK CHAR*);
