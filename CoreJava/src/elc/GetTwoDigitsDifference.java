package elc;

import java.util.Scanner;

import blc.TwoDigitsDifference;

public class GetTwoDigitsDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Result is : "+TwoDigitsDifference.getDiffOfDigits(n));

	}

}
