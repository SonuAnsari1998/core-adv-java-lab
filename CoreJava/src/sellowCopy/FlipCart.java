package sellowCopy;

public class FlipCart {
	public static void main(String[] args) {
		Customer c1=new Customer("sonu", 2500);
		Customer c2=c1;
		c2.setPrice(350);
	}
}
class Customer{
	private String itemName;
	private double price;
	public Customer(String itemName, double price) {
		this.itemName=itemName;
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}