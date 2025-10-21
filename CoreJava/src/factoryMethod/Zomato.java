package factoryMethod;
import java.util.Scanner;
public class Zomato {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CustomerDemo c1=CustomerDemo.getCustomerData(010, "Pizza", 2, 250);
		System.out.println(c1);	
	}
}
class CustomerDemo{
	private int OrderId;
	private String itemName;
	private int quentity;
	private double price;
	private CustomerDemo(int orderId, String itemName, int quentity, double price) {
		this.OrderId=orderId;
		this.itemName=itemName;
		this.quentity=quentity;
		this.price=price;
	}
	@Override
	public  String toString() {
		return "Customer [OrderId=" + OrderId + ", itemName=" + itemName + ", quentity=" + quentity + ", price=" + price
				+ "]";
	}
	public static CustomerDemo getCustomerData(int orderId, String itemName, int quentity, double price ) {
		return new CustomerDemo(orderId,itemName,quentity,price);
	}
}

