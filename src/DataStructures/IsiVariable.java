package DataStructures;

public class IsiVariable extends IsiSymbol {

	public static final int NUMBER=0;
	public static final int TEXT=1;
	
	private int type;
	private String value;
	
	
	public IsiVariable(String name, int type, String value, boolean used) {
		super(name);
		this.type = type;
		this.value = value;
		this.used = used;
	}
	
	@Override
	public String toString() {
		return "IsiVariable [ name=" + name + ", type=" + type + ", value=" + value + "]";
	}

	@Override
	public String generateJavaCode() {
		String str;
		if(type == NUMBER) {
			str = "double ";
		}
		else {
			str = "String ";
		}
		return str + " " +super.name+";";
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	

}
