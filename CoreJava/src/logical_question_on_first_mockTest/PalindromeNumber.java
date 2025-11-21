package logical_question_on_first_mockTest;
/*2. Palindrome number
[A palindrome number is a number that reads the same forwards and backward. In other words, its reverse is identical to the original number.
Examples: 121, 55, 1331, 7, 9009, 12321, etc.]
====================================================================================*/

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int rem=0,digit=0;
		while(n!=0) {
			rem=n%10;
			digit=digit*10+rem;
			n/=10;
		}
		if(digit==temp) {
			System.out.println("Palindrome Nummber");
		}else 
			System.out.println("Not Palindrome Nummber");
	}
}
