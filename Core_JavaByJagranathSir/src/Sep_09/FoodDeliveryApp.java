package Sep_09;
/*Question 1: Food Delivery App (with explicit validations)

You are designing a system for a food delivery app where users can browse and
update food items. Each food item has a name, price, and category (e.g., "Starter",
"Main Course", "Dessert").

Task:

Create a class FoodItem with private fields:
String itemName — stores the name of the food item.
double price — stores the price of the item.
String category — stores the category of the item.

Implement setter methods using the this keyword with validations:
itemName cannot be null or empty. If invalid, print an error message.
category cannot be null or empty. If invalid, print an error message.
price cannot be negative. If invalid, print an error message.
Implement getter methods to retrieve the values of these fields.
Write a main class to:
Create 3 FoodItem objects.
Use setter methods to set their details.
Display the details using getter methods.
Update the price of one food item and print the updated details.*/
import java.util.Scanner;
public class FoodDeliveryApp {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		FoodItem c1=new FoodItem();
		System.out.println("Enter Food Item Name");
		c1.setItemName(sc.nextLine());
		System.out.println("Enter Food Price");
		c1.setPrice(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter Food Category");
		c1.setCategory(sc.nextLine());
		//---------------
		FoodItem c2=new FoodItem();
		System.out.println("Enter Food Item Name");
		c2.setItemName(sc.nextLine());
		System.out.println("Enter Food Price");
		c2.setPrice(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter Food Category");
		c2.setCategory(sc.nextLine());
		//--------------------
		FoodItem c3=new FoodItem();
		System.out.println("Enter Food Item Name");
		c3.setItemName(sc.nextLine());
		System.out.println("Enter Food Price");
		c3.setPrice(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter Food Category");
		c3.setCategory(sc.nextLine());
		System.out.println("---------------------");
		System.out.println(c1.displayDetails());
		System.out.println("---------------------");
		System.out.println(c2.displayDetails());
		System.out.println("---------------------");
		System.out.println(c3.displayDetails());
	}
}
class FoodItem{
	private String itemName;
	private double price;
	private String category;
	public void setItemName(String itemName) {
		this.itemName=itemName;
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price=price;
		}else {
			System.err.println("Plese Enter valid price");
			System.exit(0);
		}
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public String getItemName() {
		return itemName;
	}
	public double getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
	public String displayDetails() {
		return "Item Name: "+itemName+
				"\nItem Price: "+price+
				"\nItem Category: "+category;
	}	
}








