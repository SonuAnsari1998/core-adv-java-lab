package Sep_24;
/*Assignment 01
--------------
Write a java program to covert string to double using parseDouble() and multiply two decimal Numbers and 
display the result by taking input from the command line argument?

java MultiplyDecimals 12.5 3.2

Output : Multiplication Result: 40.0
-----------------------------------------------------------------------*/
public class StringToDouble {
	public static void main(String[] args) {
		double x=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double multiply=x*y;
		System.out.println("Result: "+multiply);
	}
}
