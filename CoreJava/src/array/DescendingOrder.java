package array;
/*10. Q: Sort an array in descending order. 
    Input: [5, 2, 8, 1, 3]
    Expected Output: [8, 5, 3, 2, 1]*/
import java.util.Scanner;
public class DescendingOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element of array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
	}
}
