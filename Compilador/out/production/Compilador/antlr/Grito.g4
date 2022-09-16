grammar Grito;

@header{
    package antlr;
}

//<PROGRAMA> ::= DECLARACOES <DECLARACOES>  ALGORITMO <COMANDOS>;
programa: DECLARACOES declaracoes ALGORITMO comandos EOF #BlocoPrograma;

//<DECLARACOES> ::= <DECLARACAO><DECLARACOES> | î ;
declaracoes: ((declaracao | funcao) declaracoes)* #BlocoDeclaracoes;

//<COMANDOS> ::= <COMANDO><COMANDOS> | î; 
comandos: (comando comandos)* #NComandos;

//<DECLARACAO> ::= TIPO ID <INICIALIZACAO> FL | <FUNCAO>;
declaracao: TIPO ID inicializacao FL #NDeclaracao;

//<INICIALIZACAO> ::= ATRIBUIR <INFORMACAO>| î;
inicializacao: (ATRIBUIR informacao)* #NInicializacao;

//<COMANDO> ::= <ATRIBUICAO> | <IO> | <REPETICAO> | <CONDICAO>;
comando: (atribuicao | io | repeticao | condicao) #NComando;

//<ATRIBUICAO> ::= ID ATRIBUIR <COMPUTACAO>FL;
atribuicao: ID ATRIBUIR (computacao | informacao)* FL #NAtribuicao;

//<COMPUTACOES> ::= <COMPUTACAO><COMPUTACOES> | î;
computacoes: (computacao computacoes)* #NComputacoes;

//<COMPUTACAO> ::= <TERMO> <OPERADOR> <TERMO>;
computacao: termo (operador)? #NComputacao;

//<FUNCAO> ::= FUNC ID AP <ARGUMENTOS> FP BLOCO <COMANDOS> RETORNA <conjunturaS> FL BLOCO;
funcao:
	FUNC ID AP argumentos FP BLOCO comandos RETORNA conjunturas FL BLOCO #NFuncao;

//<ARGUMENTOS> ::= <ARGUMENTO><ARGUMENTOS> | î;
argumentos: (argumento argumentos)* #NArgumentos;

//<ARGUMENTO> ::= TIPO ID | VIRGULA TIPO ID;
argumento: ((VIRGULA)? TIPO ID) #NArgumento;

//<INFORMACAO> ::= CADEIA | NUM;
informacao: CADEIA | NUM #NInformacao;

//<OPERADOR> ::= OP_ARIT | OP_LOG | OP_REL;
operador: OP_ARIT | OP_LOG | OP_REL #NOperador;

//<TERMO> ::= ID | <INFORMACAO>;
termo: (ID | informacao) #NTermo;

//<IO> ::= ENTRADA AP ID FP FL | SAIDA AP <TERMO> FP FL;
io:( ENTRADA AP ID FP FL | SAIDA AP ID FP FL) #NIo | SAIDA AP informacao FP FL #NIoStatic;

//<REPETICAO>  ::= REP REPETICAO <conjunturaS>  BLOCO  <COMANDOS> BLOCO;
repeticao: REP REPETICAO conjunturas BLOCO comandos BLOCO #BlocoRepticao;

//<CONDICAO> ::= COND CONDICIONAL <conjunturaS>  BLOCO <COMANDOS> BLOCO;
condicao: COND CONDICIONAL conjunturas BLOCO comandos BLOCO #BlocoCondicao;

//<conjunturaS> ::= <conjuntura><conjunturaS>| î;
conjunturas: (conjuntura conjunturas)* #NConjunturas;

//<conjuntura> ::= <OPERADOR><TERMO> | <TERMO>;
conjuntura: (operador)? ID #NConjuntura | (operador)? informacao #NConjuturaStatic;

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