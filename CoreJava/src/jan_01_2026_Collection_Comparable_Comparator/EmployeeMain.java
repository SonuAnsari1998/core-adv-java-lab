package jan_01_2026_Collection_Comparable_Comparator;

import module java.base;

public record EmployeeMain() {
	void main() {
		Employee[] employees = new Employee[5];
		employees[0] = (new Employee(103, "sonu", 15000D));
		employees[1] = (new Employee(102, "Amit", 1200D));
		employees[2] = (new Employee(101, "Ravi", 2500D));
		employees[3] = (new Employee(104, "Vijay", 6500D));
		employees[4] = (new Employee(105, "Raj", 8500D));
		
		
		
		//Comparable
		Arrays.sort(employees);
		for(Employee emp: employees) {
			IO.println(emp);
		}

	}
}
