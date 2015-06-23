tree grammar symbolEmitter;

options {
  tokenVocab   = symbol;
  output       = template;
  ASTLabelType = CommonTree;
}

puzzle
  :
  ^(RIDDLE constraints+=constraint*)
  -> sums(sums={$constraints})
  ;

constraint
@after {
	Constraint constraint = new Constraint();
	constraint.numbers.add($n1.number);
	constraint.numbers.add($n2.number);
	constraint.numbers.add($n3.number);
	constraint.prepare();
}
  :
  ^(
    EQ_SIGN
    ^(PLUS_SIGN n1=number n2=number)
    n3=number
   )
   -> sum(number1={$n1.number}, number2={$n2.number}, number3={$n3.number})
  ;

number returns [Number number]
@after {
	$number = new Number();
	$number.setDigits($syms);
}
  :
  ^(CHAR_BLOCK syms+=CHAR+)
  ;