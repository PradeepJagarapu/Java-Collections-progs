package inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Product> products;
	private List<ElectronicProds> elecprods;
	private List<MedicalProd> mediprods;


	public Inventory() {
		products=new ArrayList<Product>();
		elecprods=new ArrayList<ElectronicProds>();
		mediprods=new ArrayList<MedicalProd>();
	}
	
	public void addProduct(int pid,String name) {
		products.add(new Product(pid,name));
	}
	
	public void addElecProduct(ElectronicProds e) {
		elecprods.add(e);
	}
	public void addMEdiProduct(MedicalProd m) {
		mediprods.add(m);
	}
	
	public void removeProduct(int id) {
		for(Product p:products) {
			if(p.pid==id) {
				products.remove(p);
			}
		}
	}
	
	public void checkLowInventory() {
		if(products.size()<10) {
			System.out.println("Low inventory");
		}
	}

	public List<Product> getProducts() {
		return products;
	}

	public List<ElectronicProds> getElecprods() {
		return elecprods;
	}

	public List<MedicalProd> getMediprods() {
		return mediprods;
	}
}
