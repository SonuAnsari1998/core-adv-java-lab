package stream_API_Logical_Program;

import java.util.Arrays;

//WAP to count how many elements are present in a String array using Stream API.

public class CountStringElements {
	void main() {
		int arr[] = { 45, 75, 75, 96, 63, 75, 42, 78 };
		long count = Arrays.stream(arr).count();
		System.out.println(count);

	}
}
