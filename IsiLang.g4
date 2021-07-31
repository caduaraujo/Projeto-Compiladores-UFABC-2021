grammar IsiLang;

prog        : 'programa'    bloco   'fimprog'
            ;

bloco       :   (cmd)+
            ;

cmd         : cmdleitura	 {System.out.println("Reconheci um comando de leitura");}
			| cmdescrita 	{System.out.println("Reconheci um comando de escrita");}
			| cmdatrib		{System.out.println("Reconheci um comando de atribuicao");}
			| cmdse			{System.out.println("Reconheci um comando se"); }
            ;

cmdleitura  : 'leia' 
						AP
						ID { System.out.println("ID=" + _input.LT(-1).getText());}
						FP 
						SC
            ;
cmdescrita  : 'escreva' AP ID FP SC
            ;
cmdatrib    : ID ATTR expr SC
            ;
            
cmdse		: 'se' AP expr OP_REL expr FP  '{' (cmd+) '}' ('senao' '{' (cmd+) '}' )?
			;
expr        : termo ( OP termo)*
            ;
termo       : ID | NUMBER
            ;
            
OP_REL		: '==' | '>' | '<' | '>=' | '<=' | '!=' 
			;            

AP          : '('
            ;
FP          : ')'
            ;
SC          : ';'
            ;
OP          : '+' | '-' | '*' | '/'
            ;
ATTR        : '='
            ;
ID          : [a-z] ([a-z] | [A-Z] | [0-0])*
            ;
NUMBER      : [0-9]+ ('.' [0-9]+)?
            ;
WS          : (' ' | '\n' | '\t' | '\r') -> skip
            ;
