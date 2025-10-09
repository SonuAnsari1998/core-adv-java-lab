package Aug_28;

import java.util.Scanner;

class BusTicketBooking {
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        RedBus rb1 = new RedBus();
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        rb1.lastPassengerName = name;
        rb1.bookTicket(name);
        
        //--------------------
        RedBus rb2 = new RedBus();
        System.out.println("Enter your name : ");
        String name2 = sc.nextLine();
        rb2.lastPassengerName = rb1.lastPassengerName;
        rb1.bookTicket(name2);
      //--------------------
        RedBus rb3 = new RedBus();
        System.out.println("Enter your name : ");
        String name3 = sc.nextLine();
        rb3.lastPassengerName = name2;
        rb3.bookTicket(name3);
    }
}
