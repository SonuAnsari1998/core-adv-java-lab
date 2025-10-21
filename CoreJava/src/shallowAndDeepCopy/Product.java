package shallowAndDeepCopy;

public class Product {
	public static void main(String[] args) {
		Customer c1=new Customer("laptop", 55000);
		Customer c2=c1;
		c2.setProductPrice(5000);
		System.out.println(c2.getProductPrice());
	}
}

class Customer {
	private String productName;
	private double prodcutPrice;

	public Customer(String productName, double prodcutPrice) {
		this.productName = productName;
		this.prodcutPrice = prodcutPrice;
	}

	public void setProductPrice(double price) {
		this.prodcutPrice+= price;
	}
	public double getProductPrice() {
		return prodcutPrice;
	}
}