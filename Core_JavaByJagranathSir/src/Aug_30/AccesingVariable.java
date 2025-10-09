package Aug_30;

import java.util.Scanner;

public class AccesingVariable {
	public static int a;
	public static int b;
	public static int c;

	public static void setInput(int a, int b, int c) {
		AccesingVariable.a = a;
		AccesingVariable.b = b;
		AccesingVariable.c = c;
	}

	public static void display1() {
		System.out.println("a value is: " + a);
	}
	public static void display2() {

		System.out.println("b value is: " + b);
		System.out.println("c value is: " + c);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AccesingVariable one = new AccesingVariable();

		System.out.println("Enter one value");
		int a = sc.nextInt();

		System.out.println("Enter Two value");
		int b = sc.nextInt();

		System.out.println("Enter Three value");
		int c = sc.nextInt();

		one.setInput(a, b, c);
		one.display1();
		one.display2();

	}
}
