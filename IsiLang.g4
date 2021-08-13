grammar IsiLang;

@header{
	import DataStructures.IsiSymbol;
	import DataStructures.IsiVariable;
	import DataStructures.IsiSymbolTable;
	import Exceptions.IsiSemanticException;
	import java.util.ArrayList;
}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue; 
	private IsiSymbolTable symbolTable = new IsiSymbolTable();
	private IsiSymbol symbol;
	
	public void verificaID(String id){
	
		if(!symbolTable.exists(id)){
			throw new IsiSemanticException("Symbol "+_varName+" not declared");
		}			
			
	}
} 


prog        : 'programa'  decl  bloco   'fimprog'
            ;
	    
decl	    : (declaravar)+
	   		;
	   	 
declaravar  : tipo ID 	{
						_varName = _input.LT(-1).getText();
						_varValue= null;
						symbol = new IsiVariable(_varName, _tipo, _varValue);
						
							if(!symbolTable.exists(_varName)){
								System.out.println("Simbolo adicionado " + symbol);
								symbolTable.add(symbol);
							}
							else{
								throw new IsiSemanticException ("Symbol "+ _varName +" already declared");
							}
						}
			(	VIR
			ID			{
						_varName = _input.LT(-1).getText();
						_varValue= null;
						symbol = new IsiVariable(_varName, _tipo, _varValue);
						
						if(!symbolTable.exists(_varName)){
								System.out.println("Simbolo adicionado " + symbol);
								symbolTable.add(symbol);
							}
							else{
								throw new IsiSemanticException ("Symbol "+ _varName +" already declared");
							}
						symbolTable.add(symbol);
						}
			)* 
			SC
	    	;

tipo	    : 'numero'		{_tipo = IsiVariable.NUMBER;}
	    	| 'texto'		{_tipo = IsiVariable.TEXT;}
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
			ID 	{ 
				verificaID(_input.LT(-1).getText());		
			}
			FP 
			SC
            ;
	    
cmdescrita  : 'escreva' 
			AP 
			ID { 
				verificaID(_input.LT(-1).getText());			
			}
			
			FP 
			SC
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
	    
cmdatrib    : ID { verificaID(_input.LT(-1).getText());		
			}
			ATTR expr SC
            ;
	    
expr        : termo ( OP termo)*
            ;
	    
termo       : ID { 
				verificaID(_input.LT(-1).getText());			
			}
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
