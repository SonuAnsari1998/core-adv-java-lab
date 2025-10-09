package blc;
/*Assignment - 05
================
Hotel Booking System :

Name of the BLC class : Hotel

       Name of method : calculateTotalAmount()
      Access Modifier : public, static
            Parameter : two parameters (double roomRate, int days)
          Return type : double value (return final bill amount after discount) 

In this method calculate total room rent (roomRate * days)

Now write another method to get the discount based on number of days :
       Name of method : calculateDiscountedAmount()
      Access Modifier : public, static
            Parameter : two parameters (int days, double totalAmount)
          Return type : double value (return final hotel bill amount after discount) 
The discount on the bill depends upon number of days by using following 
criteria :
Days Stayed	Discount %
1–2		0%
3–4		5%
5–9		10%
10 or more	20%


Create an ELC class called HotelBookingApp with main method to test the application.
 Here take Customer name, Hotel name, Room rate per day, Number of days stayed from Scanner class.

Sample Output :
---------------
Enter Customer Name: Ravishankar
Enter Hotel Name: Hyderabad Palace
Enter Room Rate per Day: 2000
Enter Number of Days Stayed: 6

----- HOTEL BOOKING SUMMARY ----- 
Customer Name     : Ravishankar
Hotel Name        : Hyderabad Palace
Room Rate (per day): ₹2000.0
Days Stayed       : 6
Total Amount      : ₹12000.0
Amount after Discount: ₹10800.0*/
public class Hotel {
	public static double calculateTotalAmount(double roomRate, int days) {
		if(days>=3 && days<=4) {
			double bill=roomRate*days;
			double discount=(5*bill)/100;
			return bill-discount;
		}else if(days>=5 && days<=9) {
			double bill=roomRate*days;
			double discount=(10*bill)/100;
			return bill-discount;
		}else if(days>20) {
			double bill=roomRate*days;
			double discount=(20*bill)/100;
			return bill-discount;
		}else {
			double bill=roomRate*days;
			return bill;
		}
	}
}
