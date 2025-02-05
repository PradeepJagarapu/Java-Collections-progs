package inventory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inventory=new Inventory();
		
		ElectronicProds e1=new ElectronicProds(1, "s24","mobile", "samsung");
		ElectronicProds e2=new ElectronicProds(2, "s25","mobile", "samsung");
		ElectronicProds e3=new ElectronicProds(3, "s24 ultra","mobile", "samsung");
		ElectronicProds e4=new ElectronicProds(4, "s24 ultra","mobile", "samsung");
		
		inventory.addElecProduct(e1);
		inventory.addElecProduct(e2);
		inventory.addElecProduct(e3);
		inventory.addElecProduct(e4);

		MedicalProd m1=new MedicalProd(11, "abc", "xyz");
		MedicalProd m2=new MedicalProd(12, "gfet", "ejhfj");
		MedicalProd m3=new MedicalProd(13, "edv", "egvrfv");
		MedicalProd m4=new MedicalProd(14, "ev", "ergrg");
		MedicalProd m5=new MedicalProd(15, "efg", "efvgrf");
		
		inventory.addMEdiProduct(m1);
		inventory.addMEdiProduct(m2);
		inventory.addMEdiProduct(m3);
		inventory.addMEdiProduct(m4);
		inventory.addMEdiProduct(m5);

		inventory.getProducts().addAll(inventory.getElecprods());
		inventory.getProducts().addAll(inventory.getMediprods());
		
		System.out.println(inventory.getProducts());


	}

}
