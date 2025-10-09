package elc;

import java.util.Scanner;

import blc.Discount;

public class GetDiscount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String name=sc.nextLine();
		System.out.println("Enter Total Bill Amount");
		double billAmount = Double.parseDouble(sc.nextLine());
		System.out.println("------ BILL SUMMARY ------");
		System.out.println("Customer Name: "+name);
		System.out.println("Original Bill: "+billAmount);
		System.out.println("Amount Payable after Discount:"+Discount.calculateDiscount(billAmount));
	}
}
