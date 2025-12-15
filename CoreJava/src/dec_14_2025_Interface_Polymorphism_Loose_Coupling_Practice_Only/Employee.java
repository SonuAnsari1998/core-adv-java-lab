package dec_14_2025_Interface_Polymorphism_Loose_Coupling_Practice_Only;
import java.util.function.*;
/*QUESTION 12: Functional Interface + Predicate + Stream
-----------------------------------------------------
Scenario:
An HR system filters high-salary employees.

Condition:
Salary > 50000

Task:
Create Employee class
Use Predicate<Employee> with Stream filter()

Input:
Rahul 60000
Aman 45000
Neha 75000

Expected Output:
Rahul
Neha*/

public class Employee {
	void main() {
		double salary=Double.parseDouble(IO.readln("Enter salry"));
		
		
		Predicate <Double> emp = e->salary>50000D;
	}
}
