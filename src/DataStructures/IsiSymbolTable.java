package DataStructures;

import java.util.HashMap;
import java.util.Set;

public class IsiSymbolTable {
	
	private HashMap<String, IsiSymbol> map;
	
	public IsiSymbolTable() {
		map = new HashMap<String, IsiSymbol>();
	}
	
	public void add(IsiSymbol symbol) {
		map.put(symbol.getName(), symbol);
	}
	
	public boolean exists(String symbolName) {
		return map.get(symbolName) != null;
	}
	
	public IsiSymbol get(String symbolName) {
		return map.get(symbolName);
	}
	
	public int getSize() {
		return map.size();
	}
	
	public Set<String> keySet(){
		return map.keySet();
	}
	
	
	
}
