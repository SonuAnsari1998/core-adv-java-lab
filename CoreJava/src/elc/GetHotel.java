package elc;

import java.util.Scanner;
import blc.Hotel;

public class GetHotel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String name=sc.nextLine();
		System.out.println("Enter Hotel Name");
		String hotelName=sc.nextLine();
		System.out.println("Enter Number of Days Stayed");
		int day=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Room Rate per Day");
		double roomRate=Double.parseDouble(sc.nextLine());
		
		System.out.println("----- HOTEL BOOKING SUMMARY ----- ");
		System.out.println("Customer Name : "+name);
		System.out.println("Hotel Name : "+hotelName);
		System.out.println("Room Rate (per day): "+roomRate);
		System.out.println("Days Stayed : "+day);
		System.out.println("Total Amount: "+(roomRate*day));
		System.out.println("Amount after Discount: "+Hotel.calculateTotalAmount(roomRate,day));

	}

}
