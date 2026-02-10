package feb_10_2026_Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Ques - 1
-----------------------
Filtering and Mapping:
Write a Java 8 stream pipeline that takes a list of integers and filters out the even 
numbers, then squares each remaining number, and finally prints the result.

Input:
List<Integer> numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
Output:
1
9
25
49
81*/
public class OddSquarePrinter {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		number.stream().filter(n -> n % 2 != 0).map(n -> n * n).forEach(IO::println);

	}
}
