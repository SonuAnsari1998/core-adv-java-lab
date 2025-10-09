package Sep_12;
/*Q4 Airline Ticket Reservation (IndiGo/Air India-like)
Create a system for airline ticket booking.
Class: FlightTicket
Fields:
String passengerName
String flightNo
double ticketPrice
Tasks:
Use setters to assign ticket details.
Use getters to display ticket information.
Create three tickets in the test class and print them.*/

import java.util.Scanner;
public class FlightTicket {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Airline t1=new Airline();
		System.out.println("Enter Passenger Name");
		t1.setPassengerName(sc.nextLine());
		System.out.println("Enter Flight Number: ");
		t1.setFlightNo(sc.nextLine());
		System.out.println("Enter Ticket Price");
		t1.setTicketPrice(sc.nextDouble());
		sc.nextLine();
		//--------------------------------
		Airline t2=new Airline();
		System.out.println("Enter Passenger Name");
		t2.setPassengerName(sc.nextLine());
		System.out.println("Enter Flight Number: ");
		t2.setFlightNo(sc.nextLine());
		System.out.println("Enter Ticket Price");
		t2.setTicketPrice(sc.nextDouble());
		sc.nextLine();
		//----------------------------------
		Airline t3=new Airline();
		System.out.println("Enter Passenger Name");
		t3.setPassengerName(sc.nextLine());
		System.out.println("Enter Flight Number: ");
		t3.setFlightNo(sc.nextLine());
		System.out.println("Enter Ticket Price");
		t3.setTicketPrice(sc.nextDouble());
		
		//-----------------------------------
		System.out.println("------Ticket Details-----------");
		System.out.println("------Ticket-1------------");
		t1.ticketDetails();
		System.out.println("------Ticket-2------------");
		t2.ticketDetails();
		System.out.println("------Ticket-3------------");
		t3.ticketDetails();
	}
}
class Airline{
	private String passengerName;
	private String flightNo;
	private double ticketPrice;
	//setter
	public void setPassengerName(String passengerName) {
		this.passengerName=passengerName;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo=flightNo;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice=ticketPrice=ticketPrice;
	}
	//getter
	public String setPassengerName() {
		return passengerName;
	}
	public String setFlightNo() {
		return flightNo;
	}
	public double setTicketPrice() {
		return ticketPrice;
	}
	public void ticketDetails() {
		System.out.println("Passenger Name: "+passengerName);
		System.out.println("Flight Number: "+flightNo);
		System.out.println("Ticket Price: "+ticketPrice);
	}
}
