package dec_29_2025_Array_Basic_Ref;

public class ProductArrayDemo {
	void main() {
		int noOfProduct = Integer.parseInt(IO.readln("Enter number of products:"));
		Product p[] = new Product[noOfProduct];
		Product product1 = null;
		for (int i = 0; i < noOfProduct; i++) {
			IO.println("Enter details for Product " + (i + 1) + " :");
			int id = Integer.parseInt(IO.readln("Enter Product ID:"));
			String productNam = IO.readln("Enter Product Name:");
			double productPrice = Double.parseDouble(IO.readln("Enter Product Price:"));
			product1 = new Product(id, productNam, productPrice);
			p[i] = product1;
		}
		int searchProduct = Integer.parseInt(IO.readln("Enter Product ID to search:"));
		int id = product1.getId();
		boolean isFound = false;
		for (Product p1 : p) {

			if (p1.getId() == searchProduct) {
				isFound = true;
				IO.println("Product Found" + p1.toString());
				break;
			}
		}
		if (!isFound)
			IO.println("Product with ID " + id + " not found.");
	}
}
