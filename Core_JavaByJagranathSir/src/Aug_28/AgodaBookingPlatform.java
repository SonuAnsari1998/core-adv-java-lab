package Aug_28;
import java.util.Scanner;
class AgodaBookingPlatform {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		AgodaHotel customer1=new AgodaHotel();
		
		System.out.println("Enter Customer Name: ");
		String customerName=sc.nextLine();
		
		System.out.println("Enter Nights: ");
		int nights=sc.nextInt();
		
		customer1.bookRoom(customerName,nights);
		
	}

}
