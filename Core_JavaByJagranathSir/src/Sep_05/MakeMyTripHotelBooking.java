package Sep_05;
/*Q2. MakeMyTrip – Hotel Booking 
Question:
Create a HotelBooking business logic class with the following requirements:
Static variable: serviceFeeRate = 0.1.
Instance variables: hotelName, nights, pricePerNight.

Methods:
- A parameterized method calculateTotalCost(double discountPercent) that calculates the
           cost including service fee. (Use a local variable for total before discount.)
- A non-parameterized method showRecommendedDestination() that prints a fixed destination like
“Bali”.
- A static method applyServiceFee(double amount) that adds service fee to any given amount.
- A non-static method printBookingReceipt() that prints booking details.

Then, create an execution logic class MakeMyTripApp that:
Creates a hotel booking object.
Calculates cost with discount.
Calls all other methods and displays results.*/
import java.util.Scanner;
public class MakeMyTripHotelBooking {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		MakeMyTrip c1=new MakeMyTrip();
		
		System.out.println("Enter Hotel Name");
		c1.hotelName=sc.nextLine();
		System.out.println("Enter Nights");
		c1.nights=sc.nextInt();
		System.out.println("Enter Price Per Night");
		c1.pricePerNight=sc.nextDouble();
		c1.showRecommendedDestination();
		c1.printBookingReceipt();
		c1.applyServiceFee(200);
		c1.calculateTotalCost(10);
		
	}
}
class MakeMyTrip{
	static double serviceFeeRate = 0.1;
	String hotelName;
	int nights;
	double pricePerNight;
	void calculateTotalCost(double discountPercent) {
		
		double Amount=(pricePerNight*nights);
		System.out.println("Amount :"+Amount);

		double service=Amount*serviceFeeRate;
		System.out.println("Service Charge"+service);
		double  totalAmount=Amount+service;
		System.out.println("Total Amount"+totalAmount);
		double discount=totalAmount*(discountPercent/100);
		System.out.println("Discount"+discount);
		
		
		
		double finalAmount=totalAmount-discount;
		
//		System.out.println("Discount"+discountPercent+"%: "+discount);
		System.out.println("Final amount : "+finalAmount);
	}
	static void applyServiceFee(double amount) {
		
	}
	void showRecommendedDestination() {
		System.out.println("Destination: Ranchi");
		
	}
	void printBookingReceipt() {
		System.out.println("Hotel Name: "+hotelName);
		System.out.println("Night: "+nights);
		System.out.println("Price per Night: "+pricePerNight);	}
}




