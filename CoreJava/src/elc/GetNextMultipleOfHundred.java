package elc;

import java.util.Scanner;

import blc.NextMultipleOfHundred;

public class GetNextMultipleOfHundred {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Result is : "+NextMultipleOfHundred.getNextMultipleOfHundred(n));

	}

}
