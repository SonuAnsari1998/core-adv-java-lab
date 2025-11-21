package logical_question_on_first_mockTest;



/*8. Count the digits of a given number
Counting the digits of a number means determining how many individual numerals make up the number.

Examples:
Digits in 12345: 5
Digits in 7: 1
Digits in 900: 3
==============================================================================*/
import java.util.Scanner;
public class CountDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		int count=0;
		while(n!=0) {
			count++;
			n/=10;
		}
		System.out.println("Digit: "+count);
	}
}
