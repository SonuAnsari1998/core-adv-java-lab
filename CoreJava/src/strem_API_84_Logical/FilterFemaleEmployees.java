package strem_API_84_Logical;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterFemaleEmployees {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		List<Employee> list = EmployeeAdder.addDetails();
		Set<Integer> set = new HashSet<>();
		Set<String> set2 = new HashSet<>();

		list.stream()
			.filter(n -> n.getGender().equalsIgnoreCase("female"))
				.forEach(IO::println);

	}
}
