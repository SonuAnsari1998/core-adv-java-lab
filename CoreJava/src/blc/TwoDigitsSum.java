package blc;

/*Assignment - 01
================
Sum Of Digits program : 
 
Name of the BLC class : TwoDigitsSum [Inside blc package]
       Name of method : getSumOfDigits()
      Access Modifier : public, static
            Parameter : one parameter of type integer
          Return type : an integer value
For example :
If the given value is 34, return 7

Create an ELC class called SumOfTwoDigits with main method to test the application. 
Here take the digit input from the Scanner class.
---------------------------------------------------------------------------*/
public class TwoDigitsSum {
	public static void getSumOfDigits(int n) {
		int rem=0, sum=0;
		while(n!=0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println("Sum of Two Digit : "+sum);
	}
}
