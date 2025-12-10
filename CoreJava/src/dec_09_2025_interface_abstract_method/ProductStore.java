package dec_09_2025_interface_abstract_method;

public class ProductStore {
	void main() {
		IO.println("Select Product Type: \n  1. Digital Product \n  2. Physical Product");
		int choice=Integer.parseInt(IO.readln());
		switch(choice) {
		case 1->{
			String name=IO.readln("Enter Digital Product Name :");
			double productPrice=Double.parseDouble(IO.readln("Enter Product Price :"));
			String productCategory=IO.readln("Enter Product Category :");
			String linString=IO.readln("Enter Product License Key :");
			int discountPercent=Integer.parseInt(IO.readln("Enter the discount % on final bill :"));
			DigitalProduct digitalProduct=new DigitalProduct(name,productPrice,productCategory,linString);
			digitalProduct.applyDiscount(discountPercent);
			digitalProduct.calculateTax();
			IO.println();
			IO.println("------Digital Product Details--------");
			IO.println(digitalProduct);
		}
		case 2->{
			String name=IO.readln("Enter Digital Product Name :");
			double productPrice=Double.parseDouble(IO.readln("Enter Product Price :"));
			String productCategory=IO.readln("Enter Product Category :");
			double productWeight=Double.parseDouble(IO.readln("Enter Product weight :"));
			int discountPercent=Integer.parseInt(IO.readln("Enter the discount % on final bill :"));
			PhysicalProduct physicalProduct=new PhysicalProduct(name,productPrice,productCategory,productWeight);
			physicalProduct.applyDiscount(discountPercent);
			physicalProduct.calculateTax();
			physicalProduct.calculateShippingCost();
			IO.println();
			IO.println("------Physical Product Details--------");
			IO.println(physicalProduct);
		}
		default->IO.println("Invalid Choice");
		};
	}
}
