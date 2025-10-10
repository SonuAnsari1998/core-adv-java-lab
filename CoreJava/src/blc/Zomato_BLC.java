package blc;

import java.lang.annotation.Documented;

public class Zomato_BLC {
	int orderId;
	String customerName;
	String itemName;
	double itemPrice;
	public void setOrderDetails(int id, String name, String iName, double iPrice) {
		orderId=id;
		customerName=name;
		itemName=iName;
		itemPrice=iPrice;
	}
	public void orderDetails() {
		System.out.println("------Order Details-------");
		System.out.println("Costomer Order id: "+orderId);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Item name: "+itemName);
		System.out.println("Item Price: "+itemPrice);
	}
	
	

}
