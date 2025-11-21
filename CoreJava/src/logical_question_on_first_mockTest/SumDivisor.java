package logical_question_on_first_mockTest;

/*9. Sum of divisors
The sum of divisors of a positive integer n is the total of all its positive integers that divide n evenly (including 1 and n itself).

Examples:
Divisors of 6: 1, 2, 3, 6. Sum = 1+2+3+6=12
Divisors of 7: 1, 7. Sum = 1+7=8
Divisors of 10: 1, 2, 5, 10. Sum = 1+2+5+10=18
================================================================================*/

import java.util.Scanner;
public class SumDivisor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();//6
		int rem=0;
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum=i+i;
		}
		
		System.out.println("Divisor of Sum: "+sum);
	}
}
