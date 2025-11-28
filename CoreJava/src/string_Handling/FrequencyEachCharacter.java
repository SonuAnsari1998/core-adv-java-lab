package string_Handling;

import java.util.Scanner;

/*3. Frequency of Each Character
Easy
100 points
• 120 min suggested
Problem Description
Write a program to count the frequency of each character in a String.

 Input Format

One String input

Output Format

Print each character and its frequency in separate lines

If input empty → print "Invalid Input"

Examples
Example 1
Input:
hello world
Output:
h : 1
e : 1
l : 3
o : 2
  : 1
w : 1
r : 1
d : 1
-------------------------------------------------------------------------------------------------------------------*/
public class FrequencyEachCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ::");
		String str=sc.nextLine();
		StringBuffer ste=new StringBuffer("Hello");
		
			char[] st1 = str.toCharArray();

			//			more than 1 occurance
			char[] st2 = new char[st1.length];
			
		for(int i=0; i<st1.length; i++)
		{
			if(st2[i]==1)
			{
				continue;
			}
			int c=1;
			for(int j=i+1; j<st1.length; j++)
			{
				if(st1[i]==st1[j])
				{
					c++;
					st2[j]=1;
				}
			}
			System.out.println(st1[i]+" : "+c);
		}
	}
}
