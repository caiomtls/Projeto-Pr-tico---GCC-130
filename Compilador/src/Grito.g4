grammar Grito;

DECLARACOES: 'DECLARACOES';
ALGORITMO: 'ALGORITMO';

ATRIBUIR: '=';
OP_ARIT: '+' | '-' | '*' | '/' | '%';
OP_REL: '<' | '>' | '<=' | '>=' | '<>' | '==';
OP_LOG: 'e' | 'ou' | 'nao' | 'xou';

ABRE: '(';
FECHA:  ')';

TIPO: 'int' | 'real' | 'palavra';
NUM: DIGITO+ ('.' DIGITO+)?;

PALAVRA: '"'+ (LETRA+)* '"';
ENTRADA: 'LER';
SAIDA: 'IMPRIMIR';

CODICIONAL: 'se' | 'senao';
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