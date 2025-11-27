package logical_question_on_first_mockTest;
import java.util.Scanner;
//FindDuplicateString
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any String");
		String str=sc.nextLine();
		for(int i= str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
