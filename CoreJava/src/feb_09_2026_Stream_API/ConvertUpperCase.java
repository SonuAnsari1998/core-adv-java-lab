package feb_09_2026_Stream_API;

import java.util.ArrayList;
import java.util.List;

/*2. Write a program to convert all the strings in a list to uppercase and print the result using the Stream API. */
public class ConvertUpperCase {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sonu");
		list.add("Arshad");
		list.add("junai");
		list.add("Raj");
		list.add("Scott");
		list.add("Allen");
		list.stream().map(a -> a.toUpperCase()).forEach(IO::println);
	}
}
