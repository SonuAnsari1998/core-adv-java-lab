package Sep_13_Test_Question;
/*Calculator
1. Write a Java program to demonstrate parameterized and non-parameterized methods by implementing a simple calculator. 
Create a class Calculator. Implement a non-parameterized method showMessage() that prints "Welcome to Calculator!". 
Implement parameterized methods for: addNumbers(int a, int b) → returns sum subtractNumbers(int a, int b) 
→ returns difference multiplyNumbers(int a, int b) → returns product divideNumbers(int a, int b) 
→ returns quotient (handle divide-by-zero case). In the main method, create an object of Calculator, 
call the methods with test cases, and display the results.

Sample Input
10 5
Sample Output
Addition (10 + 5): 15*/
import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator s1=new Calculator();
//		System.out.println("Enter a value");
		s1.a=sc.nextInt();
//		System.out.println("Enter a value");
		s1.b=sc.nextInt();
		
		System.out.println(s1.sumNumbers());
		System.out.println(s1.subtractNumbers());
	}
}
class Calculator{
	int a;
	int b;
	public String sumNumbers() {
		return "Additioin ("+a+"+"+b+"): "+(a+b);
	}
	public String subtractNumbers() {
		return "Additioin ("+a+"-"+b+"): "+(a-b);
	}
}
