package feb_09_2026_Stream_API;

import java.util.ArrayList;
import java.util.List;

/*6. Write a program to convert all the lower case strings in a list to first letter Uppercase and print the result using the Stream API.

ex -> 	
input -> "abcd" , "efgh" , "jklm" , "xyz"
output -> Abcd , Efgh , Jklm , Xyz
*/
public class FirstLetterUppercase {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("abcd");
		list.add("efgh");
		list.add("jklm");
		list.add("xyz");

		list.stream().map(p1 -> p1.substring(0, 1).toUpperCase() + p1.substring(1)).forEach(IO::println);

	}
}
