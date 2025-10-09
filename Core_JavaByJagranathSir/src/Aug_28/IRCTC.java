package Aug_28;

class IRCTC {
String trainName;
String lastPassengerName;
int lastPassengerAge;
static int totalSeatAvailable=250;
static int totalBookings;

public void bookTicket(String name, int age){
	trainName="Vande Bharat";
	lastPassengerName="Kunwar Vijay Saw";
	lastPassengerAge=25;
	totalSeatAvailable--;
	totalBookings++;
	
	System.out.println("Welcome to Vande Bharat Train !");
	System.out.println("Hello "+name+" !");
	System.out.println("Last Passenger Name is: "+lastPassengerName);
	System.out.println("Last Passenger Age: "+lastPassengerAge);
	System.out.println("Total Booking Ticket is : "+totalBookings);
	System.out.println("Total Seat Available is: "+totalSeatAvailable);
	
	
	
}
}
