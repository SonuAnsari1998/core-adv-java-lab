package logical_question_on_first_mockTest;

import java.util.Scanner;

/*7. Strong number
A strong number is a number whose sum of the factorials of its individual digits is equal 
to the original number.
Examples:
1: 1!=1
2: 2!=2
145: 1!+4!+5!=1+(4×3×2×1)+(5×4×3×2×1)=1+24+120=145
=====================================================================================*/

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=145;
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		if(sum==temp) {
			System.out.println("strong number");
		}else 
			System.out.println("Not strong number");
	}
}
