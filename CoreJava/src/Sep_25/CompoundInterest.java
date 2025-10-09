package Sep_25;
/*3) Write a Java program to calculate compound interest for 3 years? 
Formula = amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));*/
import java.util.Scanner;
public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount");
		double principle=sc.nextDouble();
		System.out.println("Enter rate");
		int rate=sc.nextInt();
		
		double amount=principle*((1+rate/100.0)*(1+rate/100.0)*(1+rate/100.0));
		
	
		System.out.println("Compound interest for 3 years : "+amount);
		
	}	
}
