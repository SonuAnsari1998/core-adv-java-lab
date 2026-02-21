package strem_API_84_Logical;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*2. Filter Employees by Age:
	 Get a list of employees older than 30 years.*/
public class FilterEmployeesAge {
	public static void main(String[] args) {
		List<Employee> list = EmployeeAdder.addDetails();		
		list.stream()
			.filter(n -> n.getAge()>30)
				.forEach(IO::println);
	}
}
