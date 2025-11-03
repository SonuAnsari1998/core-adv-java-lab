package com.crushoncode;
class Employee
{
	int empID;

	public Employee(int empID) {
		if(empID==20)
		{
			this.empID=44;
		}
		super();
		this.empID=empID;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + "]";
	}
	
	
	
}
public class Tester {
	
	void main() {
		IO.print("Hello JDK 25");
		new Employee(23);
	}

}
