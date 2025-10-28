package array;
/*5. Q: Calculate the average of array elements. 
   Input: [2, 4, 6, 8]
   Expected Output: Average = 5.0*/
import java.util.Scanner;
public class AverageOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size=Integer.parseInt(sc.nextLine());
		int arr[]=new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		int count=0;
		int sum=0;
		for(int j=0; j<size; j++) {
			count++;
			sum+=arr[j];
		}
		double avg=sum/count;
		System.out.println("Average of Array: "+avg);
		
	}
}
