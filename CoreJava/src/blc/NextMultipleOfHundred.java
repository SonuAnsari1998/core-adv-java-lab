package blc;
/*Assignment 02 :
---------------
Define a method which returns the next multiple of 100 for the given number.
Write the method with the following specifications: 
Name of the BLC class:NextMultipleOfHundred
Name of method: getNextMultipleOfHundred()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 123, return 200.

Create an ELC class Main to test the application
------------------------------------------------------------------------*/
public class NextMultipleOfHundred {
	public static int getNextMultipleOfHundred(int n) {
//		int digit=0;
//		while(n!=0) {
//			digit=n%10;
//			n/=10;
//		}
//		int temp=digit+1;
//		int result=temp*100; // this is also correct 
		return (n/100+1)*100;
	}
}
