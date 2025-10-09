package Aug_26;

class Bus {
String passengerName;
String sourceCity;
String destinationCity;
int tickets;
float pricePerTicket;

public void calculateFare(String passengerName, String sourceCity,String destinationCity,int tickets,float pricePerTicket) {
	this.passengerName=passengerName;
	this.sourceCity=sourceCity;
	this.destinationCity=destinationCity;
	this.tickets=tickets;
	this.pricePerTicket=pricePerTicket;	
}
public void displayBookingDetails(){
	System.out.println("Passenger: "+passengerName);
	System.out.println("From: "+sourceCity);
	System.out.println("To: "+destinationCity);
	System.out.println("Ticket: "+tickets);
	System.out.println("Price per Ticket: "+pricePerTicket);
	System.out.println("Total Fare: "+(tickets*pricePerTicket));
	
}
}
