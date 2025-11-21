package logical_question_on_first_mockTest;
/*11. PerfectNumber
A perfect number is a positive integer that is equal to the sum of its proper positive divisors 
(i.e., its positive divisors excluding the number itself).

Examples:
-> 6: The proper divisors of 6 are 1, 2, and 3. 1+2+3=6. So, 6 is a perfect number.
-> 28: The proper divisors of 28 are 1, 2, 4, 7, and 14. 1+2+4+7+14=28. So, 28 is a perfect number.
-> 496: The proper divisors of 496 are 1, 2, 4, 8, 16, 31, 62, 124, 248. 1+2+4+8+16+31+62+124+248=496.
 So, 496 is a perfect number.
==================================================================================*/
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		for(int i=1; i<=n/2; i++) {
			sum=i+i;
		}
		if(sum==temp) {
			System.out.println(sum+" is Perfect Number");
		}else
			System.out.println(sum+" is not Perfect Number");
	}
}
