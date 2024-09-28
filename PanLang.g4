grammar PanLang;

prog       : 'programa' decl bloco 'fimprog;'
           ;

decl       : (declaravar)+
           ;

declaravar : tipo ID ( VIR ID )* SC
           ;

tipo       : 'numero'
           ;

bloco      : (cmd)+
           ;

cmd        : cmdleitura 
           | cmdescrita 
           | cmdattrib 
           ;

cmdleitura : 'leia' AP ID FP SC
           ;

cmdescrita : 'escreva' AP ID FP SC
           ;

cmdattrib  : ID ATTR expr SC
           ; 

expr       : expr OP_P expr
           | expr OP_S expr
           | AP expr FP
           | ID
           | NUMBER
           ;

AP  : '('
    ;

FP  : ')'
    ;

SC  : ';'
    ;

OP_S  : '+' | '-' 
      ;

OP_P  : '*' | '/'
      ;

ATTR : '='
     ;

VIR  : ','
     ;

ID   : ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9])*
     ;

NUMBER : [0-9]+ ('.' [0-9]+)?
       ;

WS     : (' ' | '\t' | '\n' | '\r' ) -> skip
       ;
