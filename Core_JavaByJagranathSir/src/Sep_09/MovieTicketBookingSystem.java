package Sep_09;
/*Question 3: Movie Ticket Booking System (with explicit validations)
You are developing a system for a movie multiplex to manage ticket bookings.

Task:
Create a class MovieTicket with private fields:
String movieName — name of the movie.
int seatNumber — seat number assigned to the ticket.
double ticketPrice — cost of the ticket.
Implement setter methods using the this keyword with validations:

movieName cannot be null or empty. If invalid, print an error message.
seatNumber must be positive. If invalid, print an error message.
ticketPrice cannot be negative. If invalid, print an error message.

Implement getter methods to retrieve field values.
Write a test class to:
Create tickets for three movies.
Set the details of each ticket using setter methods.
Retrieve and print ticket details using getter methods.
Update the ticket price of one movie and print updated details.*/
import java.util.Scanner;
public class MovieTicketBookingSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MovieTicket customer1=new MovieTicket();
		System.out.println("Enter Movi Name");
		customer1.setMovieName(sc.nextLine());
		System.out.println("Enter Seat Number");
		customer1.setSeatNumber(sc.nextInt());
		System.out.println("Enter Ticket Price");
		customer1.setTicketPrice(sc.nextDouble());
		System.out.println("-------------------------------------------");
		System.out.println("Welcome to PVR Cinema !");
		System.out.println(customer1.ticketDetails());	
	}
}
class MovieTicket{
	private String movieName;
	private int seatNumber;
	private double ticketPrice;
	//setter
	public void setMovieName(String movieName) {
		if(movieName != null && !movieName.trim().isEmpty()) {
		this.movieName=movieName.trim();
	}else {
		System.err.println("Enter Valid Movi Name");
		System.exit(0);
	}
		
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
	public String ticketDetails() {
		return "Movi Name: "+movieName+
				"\nSeat Number: "+seatNumber+
				"\nTicket Price: "+ticketPrice;
	}
}






















