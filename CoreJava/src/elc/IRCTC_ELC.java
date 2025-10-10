package elc;
import java.util.Scanner;

import blc.IRCTC_BLC;

public class IRCTC_ELC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IRCTC_BLC passanger= new IRCTC_BLC();
		System.out.print("Enter Passanger Name: ");
		String name=sc.nextLine();
		System.out.print("From : ");
		String fDestination=sc.nextLine();
		System.out.print("To : ");
		String tDestination=sc.nextLine();
		System.out.print("Enter Ticket Number: ");
		int Tnumber=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Ticket Price: ");
		double tPrice=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Discount");
		double tDiscount=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Total Price");
		double totalPrice=Double.parseDouble(sc.nextLine());
		passanger.setPassangerTicketDetails(name,fDestination,tDestination,Tnumber,tPrice,tDiscount,totalPrice);
		passanger.getPassangerTicketDetails();

	}

}












