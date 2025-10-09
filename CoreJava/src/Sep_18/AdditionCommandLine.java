package Sep_18;

/*
Write a program that accepts two integers as command line arguments and prints their sum.

Input Format

Two integers passed as command line arguments.

Output Format

A single line showing the sum in the format:
Sample Input
java AdditionCommandLine 15 25
Sample Output
Sum = 40
*/

public class AdditionCommandLine{
	public static void main(String []args){
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	int sum=x+y;
	System.out.println("Sum of "+x+" And "+y+" = "+sum);
	}
      }
