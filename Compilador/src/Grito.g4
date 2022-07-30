grammar Grito;

DECLARACOES: 'DECLARACOES';
ALGORITMO: 'ALGORITMO';
RETORNA: 'RETORNA';

ATRIBUIR: '=';
OP_ARIT: '+' | '-' | '*' | '/' | '%';
OP_REL: '<' | '>' | '<=' | '>=' | '<>' | '==';
OP_LOG: 'e' | 'ou' | 'nao' | 'xou';

ABRE: '(';
FECHA:  ')';

TIPO: 'int' | 'real' | 'palavra' | 'funcao';
NUM: [-]? DIGITO+ ('.' DIGITO+)?;

CADEIA: '"'+ (LETRA+)* '"';
ENTRADA: 'LER';
SAIDA: 'IMPRIMIR';

CONDICIONAL: 'se' | 'senao';
COND: '?';
REPETICAO: 'enquanto' | 'para';
REP: '@';
FIM_LINHA: '!';
BLOCO: '#';

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

ID: LETRA (DIGITO | LETRA)*;

WS: [ \r\t\n]+ -> skip;

ErrorChar: . ;