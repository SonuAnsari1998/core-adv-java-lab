package string_Handling;

import java.util.Scanner;

/*3. Check Whether a String Contains Any Vowel

Write a Java program to check whether the given String contains any vowel (a, e, i, o, u).


Input:
A single string
Output:
"Contains vowels" or "No vowels found"*/
public class CheckWhetherStringContainsAnyVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine().toLowerCase();
		char arr[]=str.toCharArray();
		boolean isVowel = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u') {
				isVowel=true;
			}
		}
		if(isVowel) System.out.println("Contains vowels");
		else System.out.println("No vowels found");
	}
}
