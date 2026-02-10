package feb_10_2026_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Ques - 2
-----------------------
Grouping and Counting:
Given a list of strings, group them by their lengths and count the number of strings in each
 group. Print out the length and count for each group.
Input:
List<String> strings = ["apple", "banana", "orange", "grape", "pear"];
Expected Output:
Length -> Count:
5 -> 2
6 -> 2
7 -> 1*/
public class StringLengthCounter {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("apple", "banana", "orange", "grape", "pear");
		
		Map<Integer, Long> all = name.stream()
					.collect(Collectors.groupingBy(n-> n.length(), Collectors.counting()));
		
		all.forEach((l,c)-> IO.println(l+" -> "+c));
		
	}
}
