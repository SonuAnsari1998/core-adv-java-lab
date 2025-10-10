package blc;

public class IRCTC_BLC {
	String passangerName;
	String fromDestination;
	String toDestination;
	int ticketNumber;
	double ticketPrice;
	double discount;
	double totalTicketPrice;
	public void setPassangerTicketDetails(String name,String fDestination,String tDestination,
			int Tnumber,double tPrice,double tDiscount,double totalPrice) {
		passangerName=name;
		fromDestination=fDestination;
		toDestination=tDestination;
		ticketNumber=Tnumber;
		ticketPrice=tPrice;
		discount=tDiscount;
		totalTicketPrice=totalPrice;
	}
	public void getPassangerTicketDetails() {
		System.out.println();
		System.out.println("------Ticket Details-------");
		System.out.println("Passanger Name: "+passangerName);
		System.out.println("From Destination: "+fromDestination);
		System.out.println("To Destination: "+toDestination);
		System.out.println("Ticket Number: "+ticketNumber);
		System.out.println("Ticket Price: "+ticketPrice);
		System.out.println("Discount: "+discount);
		System.out.println("Total Ticket Price: "+totalTicketPrice);
	}
	
	
}
