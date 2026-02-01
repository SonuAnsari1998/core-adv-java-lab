package stream_API_Logical_Program;

import java.util.Arrays;

//WAP to filter all even numbers from a given integer array using Stream API and store them 
//into another array.

public class FilterEvenNumbers {
	void main() {
		int arr[] = {2,3,4,5,6,7,8,9,4,1,5,5,4,8,5,8,5,8,9,5};
		
		int evenNo[]=Arrays.stream(arr).filter(num-> num%2==0).toArray();
		for(int s:evenNo) {
			System.out.print(s+" ");
		}
	}
}
