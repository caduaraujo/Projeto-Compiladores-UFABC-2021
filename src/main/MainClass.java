package main;



import parser.IsiLangLexer;
import parser.IsiLangParser;

import org.antlr.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import Exceptions.IsiSemanticException;
import Exceptions.IsiWarning;

/* 
 * esta � a classe que � responsavel por criar a intera��o com o usu�rio 
 * intanciando nosso parser e apontando para o arquivo fonte
 * 
 * Arquivo fonte: extens�o .isi
 * */

public class MainClass {
	
	public static void main(String[] args) {
		try {
			IsiLangLexer lexer;
			IsiLangParser parser;
			
			lexer = new IsiLangLexer(CharStreams.fromFileName("input.isi"));
			
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			parser = new IsiLangParser (tokenStream);
			
			parser.prog();
			
			System.out.println("Compilation Successful");
			
		}
		catch (IsiSemanticException ex) {
			System.out.println("Semantic error - " + ex.getMessage());
		}
		catch (IsiWarning exc) {
			System.out.println("WARNING :" + exc.getMessage());
		}
		catch (Exception e) {
			System.out.println("ERROR "+ e.getMessage() );
		}
		
	}	
}
