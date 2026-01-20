package jan_19_2025_Collection;

import java.util.InputMismatchException;

public class ProductMain {
	void main() {
		
		ShoppingCart shoping = new ShoppingCart();

		while (true) {
			IO.println("\n1) Add Product");
			IO.println("2) Remove Product usig (Product id)");
			IO.println("3) Update Quantity using (Product id)");
			IO.println("4) View Poduct Details");
			IO.println("5) Exit");
			try {

				int choice = Integer.parseInt(IO.readln("Enter Your choice....\n"));
				switch (choice) {
				case 1 -> {
					int noOfProduct = Integer.parseInt(IO.readln("Enter No. of Product"));
					for (int i = 1; i <= noOfProduct; i++) {
						int id = Integer.parseInt(IO.readln("Enter Poduct Id (" + i + ")"));
						String productName = IO.readln("Enter Product Name");
						double price = Double.parseDouble(IO.readln("Enter Product Price"));
						int qty = Integer.parseInt(IO.readln("Enter Product Quantity"));
						shoping.addProduct(new Product(id, productName, price, qty));
					}
				}
				case 2 -> {
					int id = Integer.parseInt(IO.readln("Enter Poduct Id "));
					shoping.removeProduct(id);
				}
				case 3 -> {
					int id = Integer.parseInt(IO.readln("Enter Poduct Id "));
					int Updateqty = Integer.parseInt(IO.readln("Enter Update Quantity.."));
					shoping.updateQuantity(id, Updateqty);

				}
				case 4 -> {
					shoping.showData();
				}
				case 5 -> {
					IO.println("Thank you Visit Again..........");
					System.exit(0);
				}
				default -> System.err.println("Invalid Choice. Please Enter valid choice");
				}
			} catch (Exception e) {
				if (e instanceof NumberFormatException) {
					IO.println("Please Enter Valid Input.......");
				}
			}
		}
	}
}
