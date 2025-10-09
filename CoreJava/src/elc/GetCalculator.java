package elc;

import java.util.Scanner;

import blc.Calculator;

public class GetCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Second number");
		int b=Integer.parseInt(sc.nextLine());
		Calculator.sub(a,b);
		Calculator.mul(a,b);
		Calculator.div(a,b);
		System.out.println("Sum of "+a+" and "+b+" is :"+Calculator.add(a,b));
		System.out.println("Substraction of "+a+" and "+b+" is :"+Calculator.sub(a,b));
		System.out.println("Multiplication of "+a+" and "+b+" is :"+Calculator.mul(a,b));
		System.out.println("Division of  of "+a+" and "+b+" is :"+Calculator.div(a,b));
	}
}
