package feb_09_2026_Stream_API;

import java.util.ArrayList;
import java.util.List;

/*3. Given a list of Employee objects with id and salary properties, write a program to sort the list of Employees by salary in descending order using the Stream API.*/
record Employee(Integer id, Double salary) {

}

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, 45888D));
		list.add(new Employee(102, 72888D));
		list.add(new Employee(103, 36888D));
		list.add(new Employee(104, 25888D));
		list.add(new Employee(105, 64888D));
		list.add(new Employee(106, 20888D));

		list.stream().sorted((p1, p2) -> p2.salary().compareTo(p1.salary())).forEach(IO::println);
	}
}
