package dec_17_2025_Exception_Handling_Basic_Practice;

/*QUESTION 1: Division Operation
A program takes two integers from the user and performs division. It should handle 
division by zero using try–catch.

Test Cases:
TC1: Input: 10 2 -> Output: Result displayed
TC2: Input: 12 0 -> Output: Error message displayed
TC3: Input: 20 5 -> Output: Result displayed*/
public class DivisionOperation {
	public static void main(String[] args) {
		try {
			int x = Integer.parseInt(IO.readln("Enter First Number"));
			int y = Integer.parseInt(IO.readln("Enter Second Number"));
			int result = x / y;
			IO.println("Result is : " + result);
		} catch (ArithmeticException e) {
			System.err.println("Error: Cannot divide by zero");
		}
	}
}
