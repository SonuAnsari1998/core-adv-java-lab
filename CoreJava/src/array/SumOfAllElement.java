package array;
/*2. Q: Find the sum of all elements in an array.
   Input: [10, 20, 30, 40]
   Expected Output: Sum = 100*/
import java.util.Scanner;
public class SumOfAllElement {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the Array");
		int size=Integer.parseInt(sc.nextLine());
		int arr[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0; i<size;i++) {
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		int sum=0;
		for(int j=0; j<size;j++) {
			sum+=arr[j];
		}
		System.out.println("Sum of Array: "+sum);
	}
}
