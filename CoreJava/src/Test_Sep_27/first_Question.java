package Test_Sep_27;
/*Question 1: Command Line Arguments
Write a Java program that takes three integers as command line arguments and prints their sum and average.*/
public class first_Question {
	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[0]);
		int num3=Integer.parseInt(args[0]);
		
		int sum=num1+num2+num3;
		double avg=(sum/3);
		System.out.println("Sum of");
		System.out.println("Avg of Sum : "+avg);
	}
}
