package Sep_05;
/*Q1. Indigo Airlines – Flight Reservation System
Question:
Design a FlightBooking business logic class for Indigo Airlines with the following requirements:
Static variable: gstRate = 0.12 (same for all bookings).
Instance variables: passengerName, flightNumber, baseFare.

Methods:
 - A parameterized method calculateFare(int seats) that calculates the total fare including
                        GST (use a local variable for intermediate calculation).
- A non-parameterized method showFlightStatus() that prints flight status.
- A static method convertINRtoUSD(double amountInINR) that converts INR to USD.
- A non-static method displayPassengerDetails() that prints passenger details.

Then, create an execution logic class IndigoApp with main() method to:
- Create at least one booking object.
- Call all four methods and print results.*/
import java.util.Scanner;
public class FlightReservationSystem {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		IndigoAirlines p1=new IndigoAirlines();
		System.out.println("Enter Passenger Name");
		p1.passengerName=sc.nextLine();
		System.out.println("Enter Flight Number");
		p1.flightNumber=sc.nextLine();
		System.out.println("Enter Base Fare: ");
		p1.baseFare=sc.nextDouble();
		p1.displayPassengerDetails();
		p1.calculateFare(4);
	}
}
class IndigoAirlines{
	String passengerName;
	String flightNumber;
	double baseFare;
	static double gstRate=0.12;
	public void calculateFare(int seats) {
		double totalFare = (seats*baseFare);
		double finalAmount=totalFare+(totalFare*gstRate);
		System.out.println("Total Fare in INR: "+finalAmount);
		convertINRtoUSD(finalAmount);
	}
	public void gstRate() {
		System.out.println("Seat Available");
	}
	public static void convertINRtoUSD(double amountInINR) {
		double inrtousd=amountInINR/84.00;
		System.out.println("Total Fare in USD: "+inrtousd);
	}
	public void displayPassengerDetails() {
		System.out.println("Welcome to IndigoAir Lines!");
		System.out.println("Passenger Name: "+passengerName);
		System.out.println("Flight Number: "+flightNumber);
		System.out.println("Base Fare: "+baseFare);
		System.out.println("Include GST 12%: "+gstRate);	
	}	
}





