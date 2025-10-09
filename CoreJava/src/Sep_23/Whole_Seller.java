package Sep_23;
/*Program-5
-----------
A whole-seller gives incentives in the form of discounts on the net bill. 
Write a program to input the net bill and calculate the discount as follows:

     Net Bill in Rupees			    Discount %
	<5000								5
	>=5000 and <10000					10
	>=10000								15

Display Discount %, Discount Amount and Amount Payable*/
public class Whole_Seller {
	public static void main(String[] args) {
		double NetBill = Double.parseDouble(args[0]);
		
		if(NetBill<5000) {
			double discount=(5*NetBill)/100;
			System.out.println("Net Bill : "+NetBill);
			System.out.println("Discount : "+discount);
			System.out.println("Payable Amount : "+(NetBill-discount));
		}else if(NetBill>=5000 && NetBill<10000) {
			double discount=(10*NetBill)/100;
			System.out.println("Net Bill : "+NetBill);
			System.out.println("Discount : "+discount);
			System.out.println("Payable Amount : "+(NetBill-discount));
		}else if(NetBill>=10000) {
			double discount=(15*NetBill)/100;
			System.out.println("Net Bill : "+NetBill);
			System.out.println("Discount : "+discount);
			System.out.println("Payable Amount : "+(NetBill-discount));
		}else {
			System.out.println("Enter Valid Net Bill");
		}
	}
}
