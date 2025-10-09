package elc;

import java.util.Scanner;

import blc.RoundedSum;

public class GetRoundedSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int num1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Second number");
		int num2=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Third number");
		int num3=Integer.parseInt(sc.nextLine());
		System.out.println("Result is : "+RoundedSum.sumOfRoundedValues(num1,num2,num3));
	}

}
