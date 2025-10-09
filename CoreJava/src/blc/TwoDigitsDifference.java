package blc;
/*Assignment 01 :
---------------
Define a method which returns the difference of digits of the given two digit number.
Write the method with the following specifications: 
Name of the BLC class:TwoDigitsDifference
Name of method: getDiffOfDigits()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 83, 8 - 3 return 5.  If x = 38, 3 - 8 return -5.

Create an ELC class Main to test the application
------------------------------------------------------------------------*/
public class TwoDigitsDifference {
	public static int getDiffOfDigits(int n) {
		int sub=0 ;
		int rem=0;
		while(n>9) {
			rem=n%10; //38
			n/=10;
		}
		return n-rem;
	}
}
