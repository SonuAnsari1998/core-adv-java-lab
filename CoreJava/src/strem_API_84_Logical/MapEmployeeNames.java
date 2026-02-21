package strem_API_84_Logical;

import java.util.List;

/*4. Map Employee Names:
	 Create a list of employee names (Strings).*/
public class MapEmployeeNames {
	public static void main(String[] args) {
		List<Employee> list = EmployeeAdder.addDetails();
		list.stream()
			.map(employee -> employee.getName())
					.forEach(IO::println);
	}
}
