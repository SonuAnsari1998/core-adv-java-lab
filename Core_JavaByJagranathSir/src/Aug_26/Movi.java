package Aug_26;

class Movi {
	String customerName;
	String moviName;
	String theatreName;
	int noOfTicket;
	float pricePerTicket;
	float totalAmount;

	public void calculateTotal(String customerName,String moviName,String theatreName,int noOfTicket,float pricePerTicket,float totalAmount) {
		this.customerName = customerName;
		this.moviName = moviName;
		this.theatreName = theatreName;
		this.noOfTicket = noOfTicket;
		this.pricePerTicket = pricePerTicket;
		this.totalAmount = totalAmount;
	}

	public void displayBooking() {
		System.out.println("");
		System.out.println("                  Welcome to " + theatreName);
		System.out.println("-----------------------------------------");
		System.out.println("Movie Ticket Booking Successefully !");
		System.out.println("");
		System.out.println("Customer Name: " + customerName);
		System.out.println("Movo Name: " + moviName);
		System.out.println("No. of Tickets: " + noOfTicket);
		System.out.println("Price of One Ticket" + pricePerTicket);
		System.out.println("Total Amount: Rs. " +(noOfTicket * pricePerTicket));
		System.out.println("------------------------------------------------");
		System.out.println("            Thank you !");

	}
}
