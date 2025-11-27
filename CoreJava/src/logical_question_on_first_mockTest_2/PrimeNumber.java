package logical_question_on_first_mockTest_2;
/*1. Prime number
[ A prime number is a natural number greater than 1 that has no positive divisors other 
than 1 and itself.
Examples: 2, 3, 5, 7, 11, 13, 17, 19, 23]
=====================================================================================*/
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime");
		}else
			System.out.println("Not Prime");
	}
}
