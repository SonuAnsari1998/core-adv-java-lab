package Aug_22;

import java.util.Scanner;

//Question 6: Count the Digits
//-----------------------------
//Write a Java program with the following requirements:
//- Class Name: DigitCounter
//- Create a static method: countDigits(int number) with return type void
//- Count the number of digits in the given number
//- Print the result
//
//Sample Input/Output:
//Enter number: 98765
//Number of digits = 5

class DigitCounter {
	public static void countDigits(int n) {
		int count=0, rev=0;
		while(n!=0) {
			rev=n%10;
			count++;
			n/=10;
		}
		System.out.println("Number of digits = "+count);
		
	}
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		countDigits(n);
	}

}
