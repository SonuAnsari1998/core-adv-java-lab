package Aug_28;
import java.util.Scanner;

class TrainTicketBookingSystem {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		IRCTC passenger1=new IRCTC();
		System.out.println("Enter Passenger Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Passenger Age:");
		int age=sc.nextInt();
		passenger1.bookTicket(name, age);
		
	}
}
