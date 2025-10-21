package factoryMethod;
import java.util.Scanner;
public class Resturent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Order ID");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Customer Name");
		String name=sc.nextLine();
		System.out.println("Enter Food Name");
		String item=sc.nextLine();
		System.out.println("Enter Food Price");
		double price=Double.parseDouble(sc.nextLine());
		Customer c1=Customer.getCustomerDetails(id,name,item,price);
		System.out.println(c1);
	}
}
class Customer{
	private int orderId;
	private String customerName;
	private String foodItem;
	private double price;
	private Customer(int orderId, String customerName, String foodItem, double price) {
		this.orderId=orderId;
		this.customerName=customerName;
		this.foodItem=foodItem;
		this.price=price;
	}
	public String toString() {
		return "Order Id: "+orderId+
				"\nCustomer Name: "+customerName+
				"\nFood item Name: "+foodItem+
				"\nPrice: "+price;
	}
	public static Customer getCustomerDetails(int orderId, String customerName, String foodItem, double price) {
		return new Customer(orderId,customerName,foodItem,price);
	}
	
	
}