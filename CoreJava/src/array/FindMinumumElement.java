package array;
/*4. Q: Find the minimum element in an array.
   Input: [12, 3, 19, 5]
   Expected Output: Min = 3*/
import java.util.Scanner;
public class FindMinumumElement{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=Integer.parseInt(sc.nextLine());
		int arr[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0; i<size;i++) {
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		int min=arr[0];
		for(int j=0; j<min; j++) {
			if(arr[j]<min) {
			min=arr[j];
			}
		}
		System.out.println("Minimum Element in Array : "+min);
	}
}
