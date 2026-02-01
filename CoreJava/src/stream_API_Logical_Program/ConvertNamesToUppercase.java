package stream_API_Logical_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//WAP to convert all names from a String array into uppercase using Stream API and collect 
//them into an array.

public class ConvertNamesToUppercase {
	void main() {
		String arr[] = {"sonu", "raj", "rahul", "amit", "allen"};
		
		String []name = Arrays.stream(arr)
				.map(String::toUpperCase)
				.toArray(String[]::new);
		System.out.println(Arrays.toString(name));
	}
}
