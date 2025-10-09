package Sep_12;
/*Q1. Movie Ticket Booking System
Develop a system for a movie multiplex to manage movie ticket bookings. Each ticket
includes details about the movie, seat number, and ticket price.

Task:
Create a class MovieTicket with private fields:
String movieName — stores the name of the movie.
int seatNumber — stores the seat number assigned to the ticket.
double ticketPrice — stores the cost of the ticket.

Implement the following:
Setter Methods: Use the this keyword to resolve name conflicts.
Getter Methods: Allow other classes to access private field values.
Write a test class to:
Create tickets for three movies (MovieTicket objects).
Set the details of each ticket using setter methods.
Retrieve and print ticket details using getter methods.
Update the ticket price of one movie and print the updated ticket details.*/
import java.util.Scanner;
public class MovieTicketBookingSystem {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		MovieTicket m1=new MovieTicket();
		MovieTicket m2=new MovieTicket();
		MovieTicket m3=new MovieTicket();
		
		System.out.println("Enter movi Name");
		m1.setMovieName(sc.nextLine());
		System.out.println("Enter Seat Number");
		m1.setSeatNumber(sc.nextInt());
		System.out.println("Enter Ticket Price");
		m1.setTicketPrice(sc.nextDouble());
		
		//---------------------------
		System.out.println("Enter movi Name");
		m2.setMovieName(sc.nextLine());
		sc.nextLine();
		System.out.println("Enter Seat Number");
		m2.setSeatNumber(sc.nextInt());
		System.out.println("Enter Ticket Price");
		m2.setTicketPrice(sc.nextDouble());
		
		//----------------------------
		System.out.println("Enter movi Name");
		m3.setMovieName(sc.nextLine());
		sc.nextLine();
		System.out.println("Enter Seat Number");
		m3.setSeatNumber(sc.nextInt());
		System.out.println("Enter Ticket Price");
		m3.setTicketPrice(sc.nextDouble());
		//----------------------------------
		System.out.println("----------------------------------");
		System.out.println(m1.getDetails());
		System.out.println("----------------------------------");
		System.out.println(m2.getDetails());
		System.out.println("----------------------------------");
		System.out.println(m3.getDetails());
		System.out.println("--------------------------------");
		
		System.out.println("Enter Updated Ticket Price");
		m1.setTicketPrice(sc.nextDouble());
		
		System.out.println("-----------update ticket price---------------");
		System.out.println("--------------Udate ticket details----------------");
		System.out.println(m1.getDetails());
	}
}
class MovieTicket{
	private String movieName;
	private int seatNumber;
	private double ticketPrice;
	//setter
	public void setMovieName(String movieName) {
		this.movieName=movieName;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber=seatNumber;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice=ticketPrice;
	}
	//getter
	public String getMovieName() {
		return movieName;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public String getDetails() {
		return "Movo Name: "+movieName+
				"\nSeat Number: "+seatNumber+
				"\nTicket Price: "+ticketPrice;
	}
}




















