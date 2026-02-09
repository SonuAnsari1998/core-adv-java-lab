package feb_09_2026_Stream_API;

import java.util.ArrayList;
import java.util.List;

/*4. Write a program to convert all the strings in a list to lowercase and print the result using the Stream API.*/
public class ConvertLowerCase {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("SONU");
		list.add("ARSHAD");
		list.add("JUNAID");
		list.add("PAWAN");
		list.add("ALLEN");

		list.stream().map(a -> a.toLowerCase()).forEach(IO::println);
	}
}
