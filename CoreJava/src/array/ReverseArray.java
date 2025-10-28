package array;
/*7. Q: Reverse an array. 
   Input: [10, 20, 30, 40]
   Expected Output: [40, 30, 20, 10]*/
import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=Integer.parseInt(sc.nextLine());
		int arr[]=new int[size];
		System.out.println("Enter Element of array");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=size-1; j>=0; j--) {
			System.out.print(arr[j]+" ");
		}
	}
}
