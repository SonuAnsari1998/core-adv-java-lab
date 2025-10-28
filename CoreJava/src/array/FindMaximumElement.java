package array;
/*Q 3: Find the maximum element in an array. 
   Input: [5, 9, 2, 8, 1]
   Expected Output: Max = 9*/
import java.util.Scanner;
public class FindMaximumElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=Integer.parseInt(sc.nextLine());
		int arr[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0; i<size;i++) {
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		int max=arr[0];
		int min=arr[0];
		for(int j=0; j<size;j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
		}
		for(int j=0; j<size;j++) {
			if(arr[j]<min) {
				min=arr[j];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
