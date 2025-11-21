package logical_question_on_first_mockTest;
/*4. Factorial of a number
The factorial of a non-negative integer n, denoted by n!, is the product of all positive 
integers less than or equal to n.
By definition, 0! = 1.

Examples:

0! = 1
1! = 1
2! = 2 * 1 = 2
3! = 3 * 2 * 1 = 6
5! = 5 * 4 * 3 * 2 * 1 = 120
=====================================================================================*/
import java.util.Scanner;
public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int f=1;
		for(int i=1; i<=n; i++) {
			f=f*i;
		}
		System.out.println("Factorial of " + n + " is = " + f);
		
	}
}
