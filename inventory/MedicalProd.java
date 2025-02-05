package inventory;

public class MedicalProd extends Product {
	String type;
	public MedicalProd(int pid, String name, String type) {
		super(pid, name);
		this.type=type;
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "MedicalProd [type=" + type + ", pid=" + pid + ", name=" + name + "]";
	}
	
}
