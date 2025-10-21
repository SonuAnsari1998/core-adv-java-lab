package factoryMethod;

import java.util.Scanner;
public class ProductDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter Product Name");
			String productName=sc.nextLine();
			System.out.println("Enter Product Id");
			int productId=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Product Price");
			double productPrice=Double.parseDouble(sc.nextLine());
			Product b1=Product.getProductObject(productName, productId, productPrice);
			System.out.println(b1);
			System.out.println();
			System.out.println("Do you want to add product (Yes/No)");
			String choice=sc.nextLine();
			if(choice.equalsIgnoreCase("No")) {
				break;
			}
		}
	}
}
class Product{
	private String productName;
	private int prodcutId;
	private double productPrice;
	private Product(String productName, int prodcutId, double productPrice) {
		this.productName=productName;
		this.prodcutId=prodcutId;
		this.productPrice=productPrice;
	}
	public String toString() {
		return "Product Name: "+productName+
				"\nProduct Id: "+prodcutId+
				"\nProduct Price: "+productPrice;
	}
	public static Product getProductObject(String productName, int productId, double productPrice) {
		return new Product(productName,productId, productPrice);
	}
}
