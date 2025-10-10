package elc;
import java.util.Scanner;

import blc.Product_BLC;

public class Product_ELC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product_BLC p1=new Product_BLC();
		System.out.print("Enter Product Id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("EnterProduct Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Product Price: ");
		double price=Double.parseDouble(sc.nextLine());
		p1.setProductData(id,name,price);
		System.out.println("------Product Information------");
		p1.getProductInfo();
	}
}
