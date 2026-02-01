package stream_API_Logical_Program;

import java.util.Arrays;

/*WAP to filter all odd numbers from a given integer array using Stream API.
*/
public class FilterOddNumbers {
	void main() {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,12};
		int oddNo[] = Arrays.stream(arr).filter(num -> num%2!=0).toArray();
		System.out.println(Arrays.toString(oddNo));
		
	}
}
