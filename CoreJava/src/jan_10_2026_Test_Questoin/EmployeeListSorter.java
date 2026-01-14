package jan_10_2026_Test_Questoin;

import java.util.ArrayList;

/*1. EmployeeListSorter

Problem Description
2) Write a java program to create an object of ArrayList<Emp> class,
 add five employees details(employee numbers, names & salaries)
& display employees details based on employees names in alphabetical order.
Note: Use Comparator interface or Comparable interface to sort employees names.

Examples
Example 1
Input:
101 Ravi 45000
102 Anu 30000
103 Kiran 38000
104 Bala 50000
105 Chitra 41000
Output:
Employees in Alphabetical Order of Names:
102  Anu  30000.0
104  Bala  50000.0
105  Chitra  41000.0
103  Kiran  38000.0
101  Ravi  45000.0*/
import module java.base;

public class EmployeeListSorter {
	void main() {
		ArrayList<Emp> empList = new ArrayList<>();
		empList.add(new Emp(101, "Ravi", 45000D));
		empList.add(new Emp(102, "Anu", 30000D));
		empList.add(new Emp(103, "Kiran", 38000D));
		empList.add(new Emp(104, "Bala", 50000D));
		empList.add(new Emp(105, "Chitra", 410000D));

		Collections.sort(empList, new Comparator<Emp>() {

			@Override
			public int compare(Emp e1, Emp e2) {
				return e1.name().compareTo(e2.name());
			}
		});
		for (Emp emp : empList) {
			IO.println(emp.eid() + "\t" + emp.name() + "\t" + emp.salary());
		}
	}
}
