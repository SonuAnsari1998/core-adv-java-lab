package Aug_28;
import java.util.Scanner;

class RapidoBikeTaxiApp {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		Rapido customer1=new Rapido();
		
		System.out.println("Enter Distance in km.");
		int distance=sc.nextInt();
		
		System.out.println("Enter Rate Per Km: ");
		int ratePerKm=sc.nextInt();
		
		customer1.calculateFare(distance,ratePerKm);
	}

}
