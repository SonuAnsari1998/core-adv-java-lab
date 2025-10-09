package elc;

import java.util.Scanner;

import blc.TwoDigitsSum;

public class GetTwoDigitsSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any nuber");
		int x=Integer.parseInt(sc.nextLine());
		TwoDigitsSum.getSumOfDigits(x);
	}
}
