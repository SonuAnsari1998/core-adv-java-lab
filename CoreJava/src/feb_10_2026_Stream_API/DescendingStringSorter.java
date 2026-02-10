package feb_10_2026_Stream_API;

import java.util.Arrays;
import java.util.List;

/*Ques - 3
-------------------
Sorting:
Write a program to sort a list of strings in descending order using Java 8 streams.
Input:
List<String> strings = ["apple", "banana", "orange", "grape", "pear"];
Expected Output:
Sorted Strings in Descending Order:
pear
orange
grape
banana
apple*/
public class DescendingStringSorter {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("apple", "banana", "orange", "grape", "pear");
		
		names.stream().sorted((s1,s2) -> s2.compareTo(s1)).forEach(IO::println);
	}
}
