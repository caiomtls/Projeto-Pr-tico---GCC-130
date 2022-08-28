grammar Grito;

//<PROGRAMA> ::= DECLARACOES <DECLARACOES>  ALGORITMO <COMANDOS>;
programa: DECLARACOES declaracoes ALGORITMO comandos;

//<DECLARACOES> ::= <DECLARACAO><DECLARACOES> | î ;
declaracoes: declaracao declaracoes |;

//<COMANDOS> ::= <COMANDO><COMANDOS> | î; 
comandos: comando comandos |;

//<DECLARACAO> ::= TIPO ID <INICIALIZACAO> FL | <FUNCAO>;
declaracao: TIPO ID inicializacao FL | funcao;

//<INICIALIZACAO> ::= ATRIBUIR <INFORMACAO>| î;
inicializacao: ATRIBUIR informacao |;

//<COMANDO> ::= <ATRIBUICAO> | <IO> | <REPETICAO> | <CONDICAO>;
comando: atribuicao | io | repeticao | condicao;

//<ATRIBUICAO> ::= ID ATRIBUIR <COMPUTACAO>FL;
atribuicao: ID ATRIBUIR computacao FL;

//<COMPUTACOES> ::= <COMPUTACAO><COMPUTACOES> | î;
computacoes: computacao computacoes |;

//<COMPUTACAO> ::= <TERMO> <OPERADOR> <TERMO>;
computacao: termo operador termo;

//<FUNCAO> ::= FUNC ID AP <ARGUMENTOS> FP BLOCO <COMANDOS> RETORNA <conjunturaS> FL BLOCO;
funcao:
	FUNC ID AP argumentos FP BLOCO comandos RETORNA conjunturas FL BLOCO;

//<ARGUMENTOS> ::= <ARGUMENTO><ARGUMENTOS> | î;
argumentos: argumento argumentos |;

//<ARGUMENTO> ::= TIPO ID | VIRGULA TIPO ID;
argumento: TIPO ID | VIRGULA TIPO ID;

//<INFORMACAO> ::= CADEIA | NUM;
informacao: CADEIA | NUM;

//<OPERADOR> ::= OP_ARIT | OP_LOG | OP_REL;
operador: OP_ARIT | OP_LOG | OP_REL;

//<TERMO> ::= ID | <INFORMACAO>;
termo: ID | informacao;

//<IO> ::= ENTRADA AP ID FP FL | SAIDA AP <TERMO> FP FL;
io: ENTRADA AP ID FP FL | SAIDA AP termo FP FL;

//<REPETICAO>  ::= REP REPETICAO <conjunturaS>  BLOCO  <COMANDOS> BLOCO;
repeticao: REP REPETICAO conjunturas BLOCO comandos BLOCO;

//<CONDICAO> ::= COND CONDICIONAL <conjunturaS>  BLOCO <COMANDOS> BLOCO;
condicao: COND CONDICIONAL conjunturas BLOCO comandos BLOCO;

//<conjunturaS> ::= <conjuntura><conjunturaS>| î;
conjunturas: conjuntura conjunturas |;

//<conjuntura> ::= <OPERADOR><TERMO> | <TERMO>;
conjuntura: operador termo | termo;

DECLARACOES: 'DECLARACOES';
ALGORITMO: 'ALGORITMO';
RETORNA: 'RETORNA';

ATRIBUIR: '=';
OP_ARIT: '+' | '-' | '*' | '/' | '%';
OP_REL: '<' | '>' | '<=' | '>=' | '<>' | '==';
OP_LOG: 'e' | 'ou' | 'nao' | 'xou';

TIPO: 'int' | 'real' | 'palavra';
FUNC: 'funcao';
NUM: [-]? DIGITO+ ('.' DIGITO+)?;

AP: '(';
FP: ')';

CADEIA: '"' (LETRA | DIGITO | ' ')* '"';
ENTRADA: 'LER';
SAIDA: 'IMPRIMIR';

CONDICIONAL: 'se' | 'senao';
COND: '?';
REPETICAO: 'enquanto';
REP: '@';
FL: '!';
BLOCO: '#';
VIRGULA: ',';

ID: LETRA (LETRA | DIGITO)*;

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

WS: [ \r\t\n]+ -> skip;

ErrorChar: .;

COMENTARIO: '//' ~[\r\n]* -> skip;