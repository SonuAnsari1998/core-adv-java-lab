package feb_09_2026_Stream_API;

import java.util.ArrayList;
import java.util.List;

/*5. Given a list of Employee objects with id and salary properties, write a program to filter the list of Employees by salary in who are having salary > 30000.*/
record Employee1(Integer id, Double salary) {

}

public class Employee1Main {
	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>();
		list.add(new Employee1(101, 75000D));
		list.add(new Employee1(102, 62000D));
		list.add(new Employee1(103, 75000D));
		list.add(new Employee1(104, 32000D));
		list.add(new Employee1(105, 22000D));
		list.add(new Employee1(106, 28000D));
		
		list.stream().filter(p -> p.salary()>30000).forEach(IO::println);
	}

}
