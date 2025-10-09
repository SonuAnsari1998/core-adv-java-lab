package Aug_22;

import java.util.Scanner;

//Question 8: Find the Digits
//----------------------------
//Write a Java program with the following requirements:
//- Class Name: DigitFinder
//- Create a static method: findDigits(int number) with return type void
//- Print all digits of the number separately
//
//Sample Input/Output:
//Enter number: 1234
//Digits are: 1 2 3 4

class DigitFinder {
	public static void findDigits(int n) {
		int rev=0,rev1=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		
		System.out.print("Digits are: ");
		while(rev!=0) {
			int rem1=rev%10;
			System.out.print(rem1+" ");
			rev=rev/10;
		}
		
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		findDigits(n);
	}
}
