package Aug_28;

import java.util.Scanner;

class AirlineBookingSystem {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	
	IndigoAirline passenger1=new IndigoAirline();
	System.out.println("Enter your name : ");
    String passengerName = sc.nextLine();
    passenger1.lastPassengerName = passengerName;
    passenger1.bookSeat(passengerName);
    
    IndigoAirline passenger2=new IndigoAirline();
	System.out.println("Enter your name : ");
    String passengerName2 = sc.nextLine();
    passenger2.lastPassengerName = passenger2.lastPassengerName;
    passenger2.bookSeat(passengerName2);
}
}
