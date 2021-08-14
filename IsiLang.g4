grammar IsiLang;

@header{
	import DataStructures.IsiSymbol;
	import DataStructures.IsiVariable;
	import DataStructures.IsiSymbolTable;
	import ast.*;
	import Exceptions.IsiSemanticException;
	import Exceptions.IsiWarning;
	import java.util.ArrayList;
	import java.util.Stack;
	
}

@members{
	private int _tipo;
	private String _varName;
	private String _varValue; 
	private boolean _used;
	protected IsiSymbolTable symbolTable = new IsiSymbolTable();
	private IsiSymbol symbol;
	private int hashMapSize;
	private IsiProgram program = new IsiProgram();
	private ArrayList<AbstractCommand> curThread;
	private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
	
	private String _readID;
	private String _writeID;
	private String _exprID;
	private String _exprContent;
	private String _exprDecision;
	private ArrayList<AbstractCommand> listaTrue;
	private ArrayList<AbstractCommand> listaFalse;
	private ArrayList<AbstractCommand> loopContent;
	
	public void verificaID(String id){
		if(!symbolTable.exists(id)){
			throw new IsiSemanticException("Symbol "+id+" not declared");
		}					
		else{
			
			IsiSymbol symbol = symbolTable.get(id);
			symbol.setUsed(true);

		}
	}
	
	public void exibeComandos(){
		for(AbstractCommand c : program.getComandos()){
			System.out.println(c);
		}
	}
	
	public void generateCode(){
		program.generateTarget();
	}
	
	public void symbolNotUsed(){
		hashMapSize = symbolTable.getSize();
		String[] notUsedSymbols = new String[hashMapSize];
		for(int j = 0; j < hashMapSize; j++){
			notUsedSymbols[j] = null;
		}
		int i = 0;
		
		for(String id : symbolTable.keySet()) {
			if(!symbolTable.get(id).isUsed()){
				notUsedSymbols[i] = symbolTable.get(id).getName();
				i++;
			}
		}
	
	 	if(notUsedSymbols[0] != null){
	 		String notUsedSymbolsToString = "";
	 		for(int j=0; j<hashMapSize; j++){
	 			if(notUsedSymbols[j] == null) break;
	 			notUsedSymbolsToString += notUsedSymbols[j]+"; " ;
	 		}
	 		System.out.println(); 
			System.out.println ("WARNING: Variables not used: " + notUsedSymbolsToString);
		}
	}
} 


prog        : 'programa'
			decl  
			bloco   
			'fimprog'
			
			{
				program.setVarTable(symbolTable);
				program.setComandos (stack.pop());

				
				
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
	    
bloco       :{curThread = new ArrayList<AbstractCommand>();
				stack.push(curThread);
			}   
			(cmd)+
            ;

cmd         : cmdleitura	
	   		 | cmdescrita 	
	   		 | cmdatrib		
	   		 | cmdIF		
	   		 | cmdWhile 	
            ;
			
			
			
cmdleitura  : 'leia' 
			AP
			ID 	{ 
				verificaID(_input.LT(-1).getText());	
				_readID = _input.LT(-1).getText();	
			}
			FP 
			SC
			{
				IsiVariable var = (IsiVariable)symbolTable.get(_readID);
				CommandLeitura cmd = new CommandLeitura(_readID, var);
				stack.peek().add(cmd);
			}
            ;
	    
cmdescrita  : 'escreva' 
			AP 
			ID { 
				verificaID(_input.LT(-1).getText());
				_writeID =_input.LT(-1).getText();
			}
			FP 
			SC
			{
				CommandEscrita cmd = new CommandEscrita(_writeID);
				stack.peek().add(cmd);
			}
            ;
	    
cmdIF	    : 'se'
			AP 
			termo			{_exprDecision = _input.LT(-1).getText();} 
			OPREL 		{_exprDecision += _input.LT(-1).getText();}
			termo	{_exprDecision += _input.LT(-1).getText();}
			FP 
			'entao'
			AC 
			{	curThread = new ArrayList<AbstractCommand>();
				stack.push(curThread);
			}
			(cmd)+
			FC
			{
				listaTrue = stack.pop();
			}
	      	('senao' 
	      	AC 
	      	{
	      		curThread = new ArrayList<AbstractCommand>();
	      		stack.push(curThread);
	      	}
	      	(cmd)+ 
	      	FC
	      	{
	      		listaFalse = stack.pop();
	      		CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
	      		stack.peek().add(cmd);
	      	}
	      	)?
	   		;
	    
 
cmdWhile    : 'enquanto'
			AP 
			expr {_exprDecision = _input.LT(-1).getText();}
			OPREL {_exprDecision += _input.LT(-1).getText();}
			expr {_exprDecision += _input.LT(-1).getText();}
			FP 
			AC {
				curThread = new ArrayList<AbstractCommand>();
				stack.push(curThread);
			}
	       	(cmd)+
	        FC
	        {
	        	loopContent = stack.pop();
	        	CommandWhile cmd = new CommandWhile(_exprDecision, loopContent);
	        	stack.peek().add(cmd);
	        }
	    ;
	    
cmdatrib    : ID {
				 verificaID(_input.LT(-1).getText());
				 _exprID = _input.LT(-1).getText();
			}
			ATTR { _exprContent = ""; }
			expr 
			SC
			{
				CommandAtribuicao cmd = new CommandAtribuicao (_exprID, _exprContent);
				stack.peek().add(cmd);
			}
            ;
	    
expr        : termo ( 
			OP {_exprContent += _input.LT(-1).getText();}
			termo
			)*
            ;
	    
termo       : ID { 
				verificaID(_input.LT(-1).getText());	
				_exprContent += _input.LT(-1).getText();		
			}
	    	| NUMBER{
	    		_exprContent += _input.LT(-1).getText();
	    	}
	    	
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
