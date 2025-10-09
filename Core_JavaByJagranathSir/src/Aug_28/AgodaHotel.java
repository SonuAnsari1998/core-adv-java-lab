package Aug_28;

class AgodaHotel {
String hotelName;
static int roomsAvailable=500;
String lastCustomerName;
static int totalBookingsAcrossAgoda=0;

public void bookRoom(String customerName, int nights) {
	hotelName="Bahar Hotel Hydrabad";
	roomsAvailable--;
	lastCustomerName="Kunwar Vijay Saw";
	totalBookingsAcrossAgoda++;
	
	System.out.println("Welcome to "+hotelName);
	System.out.println("Room Available in Hotel: "+roomsAvailable);
	System.out.println("Last Customer Name: "+lastCustomerName);
	System.out.println("Total Booking Across : "+totalBookingsAcrossAgoda);

}
}
