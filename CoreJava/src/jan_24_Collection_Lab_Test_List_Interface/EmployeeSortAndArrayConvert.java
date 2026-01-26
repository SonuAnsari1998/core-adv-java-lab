package jan_24_Collection_Lab_Test_List_Interface;
/*3. EmployeeSortAndArrayConvert

Problem Description
You are required to create an Employee Management System in Java that performs the following 
operations:

Read employee details from user input (ID, Name, Salary)

Store employees in an ArrayList

Sort the employees in ascending order based on Employee ID(By using Comparable<Employee>)

Convert the sorted ArrayList to an Object Array

Display the original list, sorted list, and converted array

Examples
Example 1
Input:
Enter number of employees: 1

Enter details for Employee 1:
Enter ID: 999
Enter Name: Sarah
Enter Salary: 99999.99
Output:
=== Original Employee List ===
ID: 999, Name: Sarah, Salary: $99999.99

=== Sorted Employee List (by ID) ===
ID: 999, Name: Sarah, Salary: $99999.99

=== Converted Object Array ===
ID: 999, Name: Sarah, Salary: $99999.99*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

record Employee(Integer id, String name, Double salary) implements Comparable<Employee> {

	@Override
	public int compareTo(Employee emp) {
		return this.id().compareTo(emp.id);
	}

	@Override
	public String toString() {
		return "Employee [" + (id != null ? "id=" + id + ", " : "") + (name != null ? "name=" + name + ", " : "")
				+ (salary != null ? "salary=" + salary : "") + "]";
	}

}

public class EmployeeSortAndArrayConvert {
	void main() {
		List<Employee> employeeList = new ArrayList<Employee>();

		int noOfEmployee = Integer.parseInt(IO.readln("How many Employee would you like to add?"));
		for (int i = 1; i <= noOfEmployee; i++) {
			IO.println("\n--- Employee " + i + " ---");
			int id = Integer.parseInt(IO.readln("Enter Employee ID:"));
			String name = IO.readln("Enter Employee Name:");
			double salary = Double.parseDouble(IO.readln("Enter Salary: "));
			employeeList.add(new Employee(id, name, salary));
			IO.println("Employee " + i + " Added Sucessfully..........\n");
		}
		IO.print("\n=== Original Employee List ===");
		for (Employee e : employeeList) {
			IO.println(e);
		}

		Collections.sort(employeeList);
		IO.println("\n=== Sorted Employee List (by ID) ===");
		for (Employee e : employeeList) {
			IO.println(e);
		}

		IO.println("\n=== Converted Object Array ===");
		Object arr[] = employeeList.toArray();
		for (Object e : employeeList) {
			IO.println(e);
		}

	}
}
