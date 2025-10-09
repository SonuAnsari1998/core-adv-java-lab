package Sep_24;
/*Assignment 02
--------------
Program to find sum of the number from Command Line Argument.

java SumOfNumbers 10 20 30 40

Output : 100*/
public class SummOfNo {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		int sumOfNo=a+b+c+d;
		System.out.println("Sum of Number: "+sumOfNo);
	}
}
