package stream_API_Logical_Program;

import java.util.Arrays;

//WAP to find all numbers greater than 50 from an integer array using Stream API.
	
public class FilterNumbersGreaterThan50 {
	void main() {
		int arr[] = {52, 45, 75, 69, 36, 47, 56, 72, 69};
		int number[] = Arrays.stream(arr).filter(num -> num>50).toArray();
		System.out.println(Arrays.toString(number));
	}
}
