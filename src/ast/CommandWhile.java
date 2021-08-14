package ast;

import java.util.ArrayList;

public class CommandWhile extends AbstractCommand{
	private String condition;
	private ArrayList<AbstractCommand> commands;
	
	public CommandWhile(String condition, ArrayList<AbstractCommand> commands) {
		this.condition = condition;
		this.commands = commands;
	}
	
	
	
	@Override
	public String toString() {
		return "CommandWhile [condition=" + condition + ", commands=" + commands + "]";
	}



	@Override
	public String generateJavaCode() {
		StringBuilder str = new StringBuilder();
		str.append("while (" + condition + ") {\n");
		for(AbstractCommand cmd : commands) {
			str.append(cmd.generateJavaCode());
		}
		str.append("} \n");
		return str.toString();
	}

}
