package strem_API_84_Logical;

import java.util.List;
import java.util.stream.Collectors;

/*7.Group Employees by Gender:
	Group employees by gender and return
	a map with gender as the key and a list of employees as the value.*/
public class GroupEmployeesGender {
	public static void main(String[] args) {
		List<Employee> list = EmployeeAdder.addDetails();
		
			list.stream()
				.collect(Collectors.groupingBy(Employee :: getGender))
				.forEach((key  , value)->System.out.println(key+"\t"+value));
			
	}
}
