package blc;
/*Assignment - 04
================
Shopping Discount Program :

Name of the BLC class : Discount

       Name of method : calculateDiscount()
      Access Modifier : public, static
            Parameter : one parameters of type double (double billAmount)
          Return type : double value (return final bill amount after discount) 

After calculation return the final bill amount after discount using following criteria :

	if billAmount >= 5000 -> 20% discount on billAmount
	if billAmount >= 3000 -> 15% discount on billAmount
	if billAmount >= 1000 -> 10% discount on billAmount
        else 5% discount 

Create an ELC class called ShoppingCart with main method to test the application. 
Here take Customer name and Customer bill as an input from the Scanner class.

Sample Output :
----------------
Enter Customer Name: Ravi
Enter Total Bill Amount: 3500

------ BILL SUMMARY ------
Customer Name: Ravi
Original Bill: 3500.0
Amount Payable after Discount: 2975.0
--------------------------------------
*/
public class Discount {
	public static double calculateDiscount(double billAmount) {
		if(billAmount >= 5000) {
			double discount= (20*billAmount)/100;
			return billAmount-discount;
		}else if(billAmount >= 3000 && billAmount < 5000) {
			double discount= (15*billAmount)/100;
			return billAmount-discount;
		}else if(billAmount >= 1000 && billAmount < 3000) {
			double discount= (10*billAmount)/100;
			return billAmount-discount;
		}else{
			double discount= (5*billAmount)/100;
			return billAmount-discount;
		}
	}
}
