package Aug_28;
import java.util.Scanner;

class RedBus {
	String busNumber;
    String lastPassengerName;
    int seatsAvailable=60;
    static int totalTicketsBooked=0;

    public void bookTicket(String passengerName){
        busNumber = "JH 11 AH 7609";
        
        this.seatsAvailable--;
        totalTicketsBooked++;

        System.out.println("Welcome to Red Bus");
        System.out.println("Hello "+passengerName);
        System.out.println("Total Seat Available : "+seatsAvailable+" in bus number -> "+busNumber);
        System.out.println("Total Seat Booked : "+totalTicketsBooked);
        System.out.println("Last person booked seat : "+this.lastPassengerName);
    }
}
