package array;
import java.util.Arrays;
/*9. Q: Sort an array in ascending order. 
   Input: [5, 2, 8, 1, 3]
   Expected Output: [1, 2, 3, 5, 8]*/
import java.util.Scanner;
public class AscendingOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Short Array: "+Arrays.toString(arr));
		
	}
}
