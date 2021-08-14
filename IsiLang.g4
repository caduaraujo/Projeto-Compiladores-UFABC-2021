grammar IsiLang;

@header{
	import DataStructures.IsiSymbol;
	import DataStructures.IsiVariable;
	import DataStructures.IsiSymbolTable;
	import Exceptions.IsiSemanticException;
	import Exceptions.IsiWarning;
	import java.util.ArrayList;
}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue; 
	private boolean _used;
	protected IsiSymbolTable symbolTable = new IsiSymbolTable();
	private IsiSymbol symbol;
	private int hashMapSize;
	
	public void verificaID(String id){
		if(!symbolTable.exists(id)){
			throw new IsiSemanticException("Symbol "+id+" not declared");
		}					
		else{
			
			IsiSymbol symbol = symbolTable.get(id);
			symbol.setUsed(true);
			System.out.println("Used = true " + id);
		}
	}
} 


prog        : 'programa'
			decl  
			bloco   
			'fimprog'
			
			{
				hashMapSize = symbolTable.getSize();
				String[] notUsedSymbols = new String[hashMapSize];
				for(int j = 0; j < hashMapSize; j++){
					notUsedSymbols[j] = null;
				}
				int i = 0;
				
				for(String id : symbolTable.keySet()) {
					if(!symbolTable.get(id).isUsed()){
						notUsedSymbols[i] = symbolTable.get(id).getName();
						//System.out.println(symbolTable.get(id).getName());
						i++;
					}
				}
			
			 	if(notUsedSymbols[0] != null){
			 		String notUsedSymbolsToString = "";
			 		for(int j=0; j<hashMapSize; j++){
			 			if(notUsedSymbols[j] == null) break;
			 			notUsedSymbolsToString += notUsedSymbols[j]+"; " ;
			 		}
			 	
					throw new IsiWarning ("Variables not used: " + notUsedSymbolsToString);
				}
				
			}
			
            ;
	    
decl	    : (declaravar)+
	   		;
	   	 
declaravar  : tipo ID 	{
						_varName = _input.LT(-1).getText();
						_varValue= null;
						_used = false;
						symbol = new IsiVariable(_varName, _tipo, _varValue, _used);
						
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
						_used = false;
						symbol = new IsiVariable(_varName, _tipo, _varValue, _used);
						
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
