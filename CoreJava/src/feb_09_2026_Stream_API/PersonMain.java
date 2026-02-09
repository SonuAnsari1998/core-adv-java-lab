package feb_09_2026_Stream_API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*1. Given a list of Person objects with name and age properties, write a program to sort the list of persons by age in ascending order using the Stream API.	*/
record Person(String name, Integer age) {

}

public class PersonMain {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Sonu", 23));
		list.add(new Person("Amit", 27));
		list.add(new Person("Rahul", 26));
		list.add(new Person("Raj", 28));
		list.add(new Person("Ravi", 43));

		list.stream().sorted((p1, p2) -> p1.age().compareTo(p2.age())).forEach(IO::println);
	}
}
