package Test_Sep_27;
/*Question 2: Identifiers and Literals IdentifiersLiterals
Write a Java program that declares variables using valid identifiers and different types of literals (integer, 
float, character, string, and boolean). Print all the values.
Integer: 100
Float: 99.99
Character: A
String: Hello Java
Boolean: true
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class IdentifiersLiterals {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter any number");
		String name = sc.nextLine();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name");
		String n = br.readLine();
		
		
		


		float f=99.9f;
		char ch='A';
		String str="Hello World";
		boolean b=true;
		System.out.println("Integer: "+n);
		System.out.println("Float: "+f);
		System.out.println("Character: "+ch);
		System.out.println("String: "+str);
		System.out.println("Boolean: "+b);
		sc.close();
}
}
