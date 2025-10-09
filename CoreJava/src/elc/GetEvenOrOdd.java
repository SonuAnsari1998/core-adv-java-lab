package elc;

import java.util.Scanner;

import blc.EvenOrOdd;

public class GetEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Result is : "+EvenOrOdd.isEven(n));
	}

}
