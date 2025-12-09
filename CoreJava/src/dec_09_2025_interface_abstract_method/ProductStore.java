package dec_09_2025_interface_abstract_method;
/*Test Case 3 :
-------------
Select Product Type:
1. Digital Product
2. Physical Product
2
Enter Physical Product Name :Mobile
Enter Product Price :50000
Enter Product Category :Electronics
Enter Product weight :1
Enter the discount % on final bill
12
Physical Product:
Product Name: Mobile
Category: Electronics
Price RS:50000.0
Shipping Weight: 1.0 kg
Discount applied :7500.0
New Price :42500.0
Tax RS :3400.0
Shipping Cost RS :5.0
*/
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
