package array;
import java.util.Arrays;
/*8. Q: Copy all elements of one array into another. 
   Input: [1, 2, 3]
   Expected Output: Copied array = [1, 2, 3]*/
import java.util.Scanner;
public class CopyAllElementOneArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=Integer.parseInt(sc.nextLine());
		int arr[]=new int[size];
		System.out.println("Enter Array of Element");
		for(int i=0; i<size; i++) {
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		int arr2[]=new int[arr.length];
		
		for(int j=0; j<size;j++) {
			arr2[j]=arr[j];
		}
		System.out.println(Arrays.toString(arr2));
	}
}
