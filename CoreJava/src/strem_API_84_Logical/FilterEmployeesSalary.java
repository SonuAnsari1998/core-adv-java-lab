package strem_API_84_Logical;

import java.util.List;

/*3. FilterEmployeesSalary:
	 Find employees with a salary greater than $50,000.
*/
public class FilterEmployeesSalary {
	public static void main(String[] args) {
		List<Employee> list = EmployeeAdder.addDetails();
		
		list.stream()
			.filter(n -> n.getSalary()>5000)
					.forEach(IO::println);
		
	}
}
