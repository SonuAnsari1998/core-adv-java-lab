package blc;
/*
 Assignment - 02
================
Calculator Program :
 
Name of the BLC class : Calculator

       Name of method : add()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : an integer value 
After calculation return the addition of two numbers.

       Name of method : sub()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : an integer value 
After calculation return the subtraction of two numbers.

       Name of method : mul()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : an integer value 
After calculation return the multiplication of two numbers.

       Name of method : div()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : a double value 
After calculation return the division of two numbers.

Create an ELC class called ArithmeticCalculator with main method to test the application.
 Here take two inputs from the Scanner class to perform add, sub, mul and div.
 */
public class Calculator {
	public static int add(int x, int y) {
		return x+y;
	}
	public static int sub(int x, int y) {
		return x-y;
	}
	public static int mul(int x, int y) {
		return x*y;
	}
	public static int div(int x, int y) {
		return x/y;
	}

}













