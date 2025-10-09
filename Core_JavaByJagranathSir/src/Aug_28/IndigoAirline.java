package Aug_28;

class IndigoAirline {
String flightNumber;
String lastPassengerName;
int seatsAvailable;
public static int totalFlightsBooked;

public void bookSeat(String passengerName) {
	flightNumber="IXR-14528";
	lastPassengerName=lastPassengerName;
	seatsAvailable=150;
	this.seatsAvailable--;
	totalFlightsBooked++;
	
	System.out.println("Hello ! "+passengerName);
	System.out.println("Welcome to Indigo Airline");
	System.out.println("Flight Number is "+flightNumber);
	System.out.println("Total Seat Available is "+seatsAvailable);
	System.out.println("Last Passenger Name is:  "+lastPassengerName);
	System.out.println("Total Seat Booked is "+totalFlightsBooked);
	
}
}
