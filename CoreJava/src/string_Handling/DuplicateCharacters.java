package string_Handling;
import java.util.*;
public class DuplicateCharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]);
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}