package Practice_Only;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First number");
		int x=sc.nextInt();
		System.out.println("Enter a Second number");
		int y=sc.nextInt();
		System.out.println("Enter a operation");
		char op=sc.next().charAt(0);
		
		int result = switch(op) {
		case '+' -> x + y;
		case '-' -> x-y;
		case '*' -> x*y;
		case '/' -> x/y;
		case '%' -> {
			System.out.println("Modulus of x and y");
			yield x%y;
		}
		default ->  throw new IllegalArgumentException("Unexpected value: " + op);
		};
		System.out.println(result);
	}

}
