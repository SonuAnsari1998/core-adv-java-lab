package jan_22_2025_Collection_ArrayList_Program_Employee_Directory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Directory {

	ArrayList<Employee> empList;

	public Directory() {
		super();
		this.empList = new ArrayList<>();
	}

	public void addEmployee(Employee emp) {
		empList.add(emp);
	}

	public void displayAllEmployees() {
		for (Employee emp : empList) {
			IO.println(emp);
		}
	}

	public void updateEmployee(String position, double salary, int index) {
		Employee employee = empList.get(index);
		employee.setPosition(position);
		employee.setSalary(salary);
		IO.println("Employee Details Updated Sucessfully.........");
	}

	public void deleteEmployee(int index) {
		empList.remove(index);
		IO.println("Employee details Deleted  Sucessfully.........");
	}

}
