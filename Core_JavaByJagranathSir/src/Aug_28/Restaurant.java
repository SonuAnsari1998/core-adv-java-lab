package Aug_28;
import java.util.Scanner;
/*
 * 1. Zomato (Food Delivery App)

Scenario: Zomato wants to track how many total orders are placed across the entire 
app. Each restaurant can only record its last order (since we aren’t using arrays).
Create a class Restaurant with:
An instance variable restaurantName.
An instance variable lastOrderedItem.
A static variable totalOrders.
A method placeOrder(String itemName, int quantity) that sets lastOrderedItem and 
increases totalOrders.
Question: Show how ordering food from different restaurants updates totalOrders.
*/
class Restaurant {
String restaurantName;
String lastOrderedItem;
static int totalOrders;

public void placeOrder(String itemName, int quantity) {
	lastOrderedItem=itemName;
	totalOrders=totalOrders+quantity;	
}
}

