package switch_Java;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		double a=Double.parseDouble(sc.nextLine());
		System.out.println("Enter Second Number");
		double b=Double.parseDouble(sc.nextLine());
		System.out.println("Enter Operation (+,-,*,/,%)");
		char ch=sc.next().charAt(0);
		
		double result = switch(ch) {
		case '+' ->{
			System.out.println("Addition of "+a+" and "+b);
			yield a+b;
		}
		case '-' ->{
			System.out.println("Addition of "+a+" and "+b);
			yield a-b;
		}
		case '*' ->{
			System.out.println("Addition of "+a+" and "+b);
			yield a*b;
		}
		case '/' ->{
			System.out.println("Addition of "+a+" and "+b);
			yield a/b;
		}
		case '%' ->{
			System.out.println("Addition of "+a+" and "+b);
			yield a%b;
		}
		
		default ->0.0;
		};
		System.out.println("-----Calculator------");
		System.out.println(result);
	}
}
