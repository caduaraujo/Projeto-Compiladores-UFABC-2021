grammar IsiLang;

prog        : 'programa'    bloco   'fimprog'
            ;
	    
decl	    : (declaravar)+
	    ;
	    
declaravar  : tipo ID (VIR ID)* SC
	    ;

tipo	    : 'numero'		{System.out.println("Reconheci um tipo número");}
	    | 'texto'		{System.out.println("Reconheci um tipo texto");}
	    ;
	    
bloco       :   (cmd)+
            ;

cmd         : cmdleitura	{System.out.println("Reconheci um comando de leitura");}
	   		 | cmdescrita 	{System.out.println("Reconheci um comando de escrita");}
	   		 | cmdatrib		{System.out.println("Reconheci um comando de atribuicao");}
	   		 | cmdIF		{System.out.println("Reconheci um comando if");}
	   		 | cmdWhile 	{System.out.println("Reconheci um comando while");}
            ;

cmdleitura  : 'leia' 
			AP
			ID 	{System.out.println("ID=" + _input.LT(-1).getText());}
			FP 
			SC
            ;
	    
cmdescrita  : 'escreva' AP ID FP SC
            ;
	    
cmdIF	    : 'se' AP expr OPREL expr FP 'entao'
			 AC 
			 bloco 
			 FC
	      	('senao' AC bloco FC)?
	   		;
	    
// precisa olhar esse exemplo de while: https://stackoverflow.com/questions/23098415/visitor-listener-code-for-a-while-loop-in-antlr-4
cmdWhile    : 'enquanto' AP expr OPREL expr FP AC
	       bloco 
	       FC
	    ;
	    
cmdatrib    : ID ATTR expr SC
            ;
	    
expr        : termo ( OP termo)*
            ;
	    
termo       : ID 
	    | NUMBER
            ;
	    
AP          : '('
            ;
FP          : ')'
            ;
AC	    : '{'
	    ;
FC	    : '}'
	    ;
SC          : ';'
            ;
VIR         : ','
	    ;
OP          : '+' 
	    | '-' 
	    | '*' 
	    | '/'
            ;
OPREL		: '=='
			| '>'
			| '<'
			| '>='
			| '<='
			| '!='
			;  
ATTR        : '='
            ;
ID          : [a-z] ([a-z] | [A-Z] | [0-0])*
            ;
NUMBER      : [0-9]+ ('.' [0-9]+)?
            ;
WS          : (' ' | '\n' | '\t' | '\r') -> skip
            ;
