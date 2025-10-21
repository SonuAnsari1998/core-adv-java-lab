package oct_21;

/*Take a InventoryMain class (ELC Class) which is having  main method to  Create Object for inventory class and print complete details by using the method calculateTotalValue().

IF WE HAVE ANY NEW UPDATION IN STOCK LIKE ITEM PRICE OR ITEM QUANTITY THEN
CALL SETTER METHOD TO UPDATE THE NEW PRICE OR NEW QUANTITY.[See the Test
cases for more details]

If any update in stock is there then take the new price OR new quantity from user otherwise shutdown JVM using System.exit(0).

Test Cases for Output
-------------------
Test Case 01 :
--------------
Enter Item Name: Laptop
Enter Price Per Unit: 80000
Enter Quantity In Stock: 10

Inventory Item Details:
Item Name: Laptop
Price Per Unit: 80000.0
Quantity in Stock: 10
Total Inventory Value: 800000.00
Any updation in Stock Price OR Quantity :NO

Test Case 02 :
--------------
Enter Item Name: Laptop
Enter Price Per Unit: 80000
Enter Quantity In Stock: 10

Inventory Item Details:
Item Name: Laptop
Price Per Unit: 80000.0
Quantity in Stock: 10
Total Inventory Value: 800000.00
Any updation in Stock Price OR Quantity :Yes
Enter New Price Per Unit :90000
Enter New Quantity In Stock: 5

Updated Inventory Item Details:
Item Name: Laptop
Price Per Unit: 90000.0
Quantity in Stock: 5
Total Inventory Value: 450000.00*/
import java.util.Scanner;

public class InventoryItemMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Price Per Unit: ");
		double price = Double.parseDouble(sc.nextLine());
		System.out.println("Enter Quantity In Stock: ");
		int qty = Integer.parseInt(sc.nextLine());
		InventoryItem item=new InventoryItem(name,price,qty);

		System.out.println();
		System.out.println("----------Inventory Item Details:-----------");
		System.out.println("Item Name: " + item.getItemName());
		System.out.println("Price Per Unit: " + item.getPricePerUnit());
		System.out.println("Quantity in Stock: " + item.getQuantityInStock());
		System.out.println("Total Inventory Value: " + item.calculateTotalValue());

		System.out.println("Any updation in Stock Price OR Quantity : YES/NO");

		String update=sc.nextLine();

		if(update.equalsIgnoreCase("YeS"))
		{
		System.out.println("Enter Price Per Unit for Updation : ");
		double uprice = Double.parseDouble(sc.nextLine());
		System.out.println("Enter Quantity In Stock for Updation : ");
		int uqty = Integer.parseInt(sc.nextLine());
		item.setPricePerUnit(uprice);
		item.setQuantityInStock(uqty);

		System.out.println("Updated Inventory Item Details:");
		System.out.println("Item Name: " + item.getItemName());
		System.out.println("Price Per Unit: " + item.getPricePerUnit());
		System.out.println("Quantity in Stock: " + item.getQuantityInStock());
		System.out.println("Total Inventory Value: " + item.calculateTotalValue());

	}
}
}