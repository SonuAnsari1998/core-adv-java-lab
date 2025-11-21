package logical_question_on_first_mockTest;
/*6. Reverse a number
Reversing a number means creating a new number by writing its digits in reverse order.

Examples:
Reverse of 123 is 321
Reverse of 500 is 5
Reverse of 9876 is 6789
====================================================================================*/
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int rem=0, digit=0;
		while(n!=0) {
			rem=n%10;
			digit=digit*10+rem;
			n/=10;
		}
		System.out.println(digit);
	}
}
