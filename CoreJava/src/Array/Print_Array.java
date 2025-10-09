package Array;
//new add for github
import java.util.Scanner;
public class Print_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.print("Enter Array size");
		int size=sc.nextInt();
		
		int number[]=new int [size];
		
		for(int i=0; i<size; i++) {
			number[i]=sc.nextInt();
		}
		System.out.println("Enter find data");
		int x=sc.nextInt();
		
		for(int j=0; j<number.length; j++) {
			if(number[j]== x) {
			System.out.print("Index : "+j);
			}
		}
		*/
		
		//-----------------------------------------------
		System.out.println("Enter Array size");
		int size=sc.nextInt();
		int numbers[]=new int[size];
		
		for(int i=0; i<size; i++) {
			numbers[i]=sc.nextInt();
		}
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(i);
		}
		
	}
}
