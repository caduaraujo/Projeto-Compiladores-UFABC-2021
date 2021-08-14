package DataStructures;

public abstract class IsiSymbol {
	
	protected String name;
	public boolean used;
	
	public IsiSymbol(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "isiSymbol [name=" + name + "]";
	}
	
	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}
	
	
}
