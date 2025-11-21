package logical_question_on_first_mockTest;
/*5. Fibonacci series
The Fibonacci series (or sequence) is a sequence of numbers where each number is the sum of 
the two preceding ones, usually starting with 0 and 1.

Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

How to generate:
Start with the first two numbers (0 and 1).
The next number is the sum of the previous two.
====================================================================================*/
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		int a=0, b=1, temp=0;
		System.out.print("Fibonacci series of: "+a+" "+b);
		for(int i=1; i<=n; i++) {
			temp=a+b;
			System.out.print(" "+temp+" ");
			a=b;
			b=temp;
		}
	}
}
