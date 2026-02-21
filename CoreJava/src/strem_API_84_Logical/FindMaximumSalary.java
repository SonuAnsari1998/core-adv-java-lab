package strem_API_84_Logical;

import java.util.List;

/*	6. Find Maximum Salary:
  	   Find the employee with the highest salary.*/
public class FindMaximumSalary {
		public static void main(String[] args) {
			List<Employee> list = EmployeeAdder.addDetails();
			
			double maxSalary = list.stream()
				.mapToDouble(Employee::getSalary)
					.max()
						.orElseThrow();
			
			System.out.println(maxSalary);
		}
}
