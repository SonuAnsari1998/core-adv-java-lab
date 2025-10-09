package Aug_26;

import java.util.Scanner;

class BusTicketBookingSystem {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	Bus b1=new Bus();
	
	System.out.println("Passenger Name: ");
	String passengerName=sc.nextLine();
	
	System.out.println("Enter Source City: ");
	String sourceCity=sc.nextLine();
	
	System.out.println("Enter Destination:");
	String destinationCity=sc.nextLine();
	
	System.out.println("Enter No. of Tickets: ");
	int tickets=sc.nextInt();
	
	System.out.println("Cost of Single Tickets: ");
	float pricePerTicket=sc.nextFloat();
	
	b1.calculateFare(passengerName, sourceCity,destinationCity,tickets,pricePerTicket);
	b1.displayBookingDetails();
	
}
}
