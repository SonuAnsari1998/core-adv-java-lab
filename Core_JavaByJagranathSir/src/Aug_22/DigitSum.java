package Aug_22;
//Question 7: Sum of the Digits
//------------------------------
//Write a Java program with the following requirements:
//- Class Name: DigitSum
//- Create a static method: sumDigits(int number) with return type void
//- Calculate and print the sum of digits of the given number
//
//Sample Input/Output:
//Enter number: 12345
//Sum of digits = 15

class DigitSum {
	public static void sumDigits(int n) {
		int sum=0, rev=0; 
		while(n!=0) {
			rev=n%10;
			sum+=rev;
			n/=10;
		}
		System.out.println(sum);
		
	}
	public static void main(String[]args) {
		sumDigits(12345);
	}
	

}
