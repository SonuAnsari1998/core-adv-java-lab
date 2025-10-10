package elc;

import java.util.Scanner;

import blc.Zomato_BLC;

public class Zomato_ELC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Zomato_BLC customer1=new Zomato_BLC();
		System.out.print("Enter Order Id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Customer Name");
		String name=sc.nextLine();
		System.out.print("Enter Food item Name");
		String iName=sc.nextLine();
		System.out.print("Enter Food item Price");
		double iPrice=Double.parseDouble(sc.nextLine());
		customer1.setOrderDetails(id,name,iName,iPrice);
		
		customer1.orderDetails();
		

	}

}
