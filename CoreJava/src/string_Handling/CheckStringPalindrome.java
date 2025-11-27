package string_Handling;

/*
 * 		
 * --------------------------------------------------------------------
 * 4. Check if a String is a Palindrome
Easy
100 points
• 120 min suggested
Problem Description
Write a program to check whether a given String is a palindrome or not.

Input Format

A single String s

 Output Format

Print "Palindrome" if string reads same forward & backward

Else print "Not Palindrome"

If input is empty → print "Invalid Input"

Examples
Example 1
Input:
1 ≤ length of string ≤ 1000

Case-sensitive comparison
Output:
madam*/
import java.util.Scanner;

public class CheckStringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int x = str.length() - 1;
		boolean isPalindrome = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(x)) {
				isPalindrome = false;
			}
			x--;
		}
		if (isPalindrome) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " is Not Palindrome");
		}
	}

}
