package ast;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import DataStructures.IsiSymbol;
import DataStructures.IsiSymbolTable;

public class IsiProgram {
	private IsiSymbolTable varTable;
	private ArrayList<AbstractCommand> comandos;
	
	

	public IsiSymbolTable getVarTable() {
		return varTable;
	}

	public void setVarTable(IsiSymbolTable varTable) {
		this.varTable = varTable;
	}

	public ArrayList<AbstractCommand> getComandos() {
		return comandos;
	}

	public void setComandos(ArrayList<AbstractCommand> comandos) {
		this.comandos = comandos;
	}

	
	public void generateTarget() {
		StringBuilder str = new StringBuilder();
		str.append("import java.util.Scanner;\n");
		str.append("public class MainClass{\n");
		str.append("public static void main(String args[]){\n");
		str.append("Scanner _key = new Scanner(System.in);\n ");
		for(IsiSymbol symbol : varTable.getAll()) {
			str.append(symbol.generateJavaCode() + "\n");
		}
		for(AbstractCommand command : comandos) {
			str.append(command.generateJavaCode()+"\n");
		}
		str.append("	}");
		str.append("}");
		
		try {
			FileWriter fr = new FileWriter(new File("MainGenerated.java"));
			fr.write(str.toString());
			fr.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
