package Aug_28;

import java.util.Scanner;

class ZomatoFoodDelivery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Restaurant r1 = new Restaurant();
		System.out.println("Enter Restaurant Name: ");
		r1.restaurantName = sc.nextLine();

		System.out.println("Enter the food Name: ");
		String itemName = sc.nextLine();

		System.out.println("Enter the Food Quantity: ");
		int quantity = sc.nextInt();
		sc.nextLine();

		r1.placeOrder(itemName, quantity);

		System.out.println("Total Order: " + Restaurant.totalOrders);

//	--------------------------------------------------------------------------
		Restaurant r2 = new Restaurant();
		System.out.println("Enter Restaurant Name: ");
		r2.restaurantName = sc.nextLine();

		System.out.println("Enter the food Name: ");
		String itemName1 = sc.nextLine();

		System.out.println("Enter the Food Quantity: ");
		int quantity1 = sc.nextInt();
		sc.nextLine();

		r2.placeOrder(itemName1, quantity1);

		System.out.println("Total Order: " + Restaurant.totalOrders);

	}
}
