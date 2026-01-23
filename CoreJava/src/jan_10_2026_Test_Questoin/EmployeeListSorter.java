package jan_10_2026_Test_Questoin;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeListSorter {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Sonu", 452200));
		list.add(new Employee(103, "Raj", 56000));
		list.add(new Employee(102, "Ravi", 12500));
		list.add(new Employee(104, "Allen", 96000));

		System.out.println("shorting Based on the name ");

		Collections.sort(list, (a, b) -> a.name.compareTo(b.name));
		for (Employee emp : list) {
			System.out.println(emp);
		}

		System.out.println("shorting Based on the id ");
		Collections.sort(list, (a, b) -> a.id - b.id);
		for (Employee emp : list) {
			System.out.println(emp);
		}

	}
}
