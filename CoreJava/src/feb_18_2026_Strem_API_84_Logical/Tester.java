package feb_18_2026_Strem_API_84_Logical;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester {
	private static final String RED = "\033[1;31m"; // RED
	private static final String RESET = "\033[0m"; // Text Reset

	public static void main(String[] args) {
		List<Employee> list = EmployeeAdder.addDetails();
		Set<Integer> set = new HashSet<>();
		Set<String> set2 = new HashSet<>();
	}
}
