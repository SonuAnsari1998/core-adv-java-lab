package string_Handling;

import java.util.Scanner;

/*2. Count Uppercase & Lowercase Letters

Write a program to count and print number of uppercase and lowercase letters in a string.
Input Format :
----------------
One string input

Output Format :
------------------
OnUppercase : x
Lowercase : y

If no letters → print "No alphabets found"
If input empty → "Invalid Input"

Examples
Example 1
Input:
Hello World
Output:
Uppercase : 2
Lowercase : 8
---------------------------------------------------------------------------------------------------------*/
public class CountUppercaseLowercaseLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		if (str.isEmpty()) {
			System.err.println("Invalid Input");
			System.exit(0);
		}
		char arr[] = str.toCharArray();
		int upper = 0;
		int lower = 0;
		boolean isUpperCase = false;
		boolean isLowerCase = false;
		boolean noLetter = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'A' && arr[i] <= 'Z') {
				upper++;
				isUpperCase = true;
			} else if (arr[i] >= 'a' && arr[i] <= 'z') {
				lower++;
				isLowerCase = true;
			} else {
				noLetter = true;
			}
		}
		if (isUpperCase && isLowerCase) {
			System.out.println("Upper Case : " + upper);
			System.out.println("Lower Case : " + lower);
		} else if (noLetter) {
			System.out.println("No Alphabet Found");
		}
	}
}
