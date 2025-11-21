package logical_question_on_first_mockTest;
/*3. Armstrong number
[An Armstrong number (also known as a narcissistic number) is a number that is equal to the 
sum of its own digits each raised to the power of the number of digits.

Examples:
153: (Number of digits = 3) 1^3 + 5^3 +3^3 = 1+125+27=153
9474: (Number of digits = 4) 9^4 + 4^4 + 7^4 + 4^4  = 6561+256+2401+256=9474
=====================================================================================*/
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();//153 =>count 
		int temp=n;
		int count=0;
		while(n!=0) {
			count++;
			n/=10;
		}
		n=temp;
		int sum=0;
		while(temp!=0) {//153
			int last=temp%10;
//			int pow=(int)Math.pow(last,count);
			int sqr=1;//
			for(int i=1; i<=count; i++)
			{
				sqr=sqr*last;
			}
			sum=sum+sqr;//1^3+5^3+3^3
//			sum=sum+pow;
			
		temp/=10;
		}
		if(sum==n)
		{
			System.out.print("ArmStrong");
		}
		else {
			System.out.print("Not ArmStrong");
		}
		
		
		System.out.println(count);
		
		
	}
}
