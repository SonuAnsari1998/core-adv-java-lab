package string_Handling;

import java.util.Scanner;

/*1. Check Whether String Contains Digit

Write a program to check whether the given String contains any digit.

 Input Format

A single String input

 Output Format

"Contains Digit" if digit found

"No Digit" if digit not found

"Invalid Input" if empty string

Examples

Input:
Hello123
Output:
Contains Digit
------------------------------------------------------------------------------------------------*/
public class CheckWhetherStringContainsDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		if(str.isEmpty()) {
			System.out.println("Empty String");
			System.exit(0);
		}
		boolean isDigit=false;
		char arr[]=str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>='0' && arr[i]<='9') {
				isDigit=true;
			}
		}
		if(isDigit) System.out.println("Contain Digit");
		else System.out.println("Not Contain Digit");
		
	}
}
