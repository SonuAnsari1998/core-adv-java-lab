package Oct_09;

import java.util.Scanner;

public class Car_ELC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Car_BLC c1=new Car_BLC();
		System.out.print("Enter Car name");
		c1.name=sc.nextLine();
		System.out.print("Enter Car model");
		c1.model=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Car Color");
		c1.color=sc.nextLine();
		c1. getCarInformation();
		c1.drive();
		sc.close();
	}
}
