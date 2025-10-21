package oct_16;

import java.util.Scanner;

public class Car_ELC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Car Model :");
		String model=sc.nextLine();
		System.out.print("Enter Car Manufacturing year :");
		int year=Integer.parseInt(sc.next()); 
		System.out.print("Enter Car Price :");
		double price=Double.parseDouble(sc.next());
		Car_BLC c1=new Car_BLC(model,year,price);
		System.out.println(c1);
	}
}
