package strem_API_84_Logical;

import java.util.List;
import java.util.OptionalDouble;

/*5. Calculate Average Salary:
	 Calculate the average salary of all employees.*/
public class CalculateAverageSalary {
	public static void main(String[] args) {
		List<Employee> list = EmployeeAdder.addDetails();
		
		double average = 
					list.stream()
		.mapToDouble(Employee::getSalary)
			.average()
				.orElseThrow();
			
		System.out.println(average);

	}
}
