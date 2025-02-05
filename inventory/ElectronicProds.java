package inventory;

public class ElectronicProds extends Product{
	String type;
	String brand;
	public ElectronicProds(int pid, String name, String type, String brand) {
		super(pid, name);
		this.type=type;
		this.brand=brand;
		// TODO Auto-generated constructor stub
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "ElectronicProds [pid=" + pid + ", name=" + name + ", type=" + type + ", brand=" + brand + ",]";
	}
	
	
	

}
