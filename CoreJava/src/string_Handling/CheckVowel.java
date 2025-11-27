package string_Handling;

import java.util.Scanner;
public class CheckVowel {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a Number");
//		String str=sc.nextLine();
//		boolean isAvailable=false;
//		char arr[]=str.toLowerCase().toCharArray();
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]=='a' ||arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u' ) {
//				isAvailable=true;
//				break;
//			}
//		}
//		if(isAvailable) {
//			System.out.println(str+" is Containg Vowel");
//		}
		int arr[]= {1,2,3,4,5};
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
