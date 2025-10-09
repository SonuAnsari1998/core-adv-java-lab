package Aug_26;

import java.util.Scanner;

class MovieTicketBookingSystem {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		Movi m1=new Movi();
		
		System.out.println("Enter Customer Name: ");
		String customerName=sc.nextLine();
		
		System.out.println("Enter Movi Name: ");
		String moviName=sc.nextLine();
		
		System.out.println("Enter Theatre Name: ");
		String theatreName=sc.nextLine();
		
		System.out.println("Enter No. of Tickets: ");
		int noOfTicket=sc.nextInt();
		
		System.out.println("Enter Price of One Ticket");
		float pricePerTicket=sc.nextFloat();
		
		
		m1.calculateTotal(customerName,moviName,theatreName,noOfTicket, pricePerTicket, pricePerTicket);
		m1.displayBooking();

	}
}
