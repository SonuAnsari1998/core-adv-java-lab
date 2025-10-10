package blc;
/*Program 02:
-----------
Write a Program on OOPs to define Employee class properties and behaviour.

properties/Field/Attribute :

employeeId : int
employeeName : String
employeeSalary : double

Initialize these properties with the help of method using parameter variable.

behavior/Method:
setEmployeeData(int id, String name, double salary) : public void
getEmployeeData() : public void*/
public class Employee_BLC {
	int employeeId;
	String employeeName;
	double employeeSalary;
	public void setEmployeeData(int id, String name, double salary){
		employeeId=id;
		employeeName=name;
		employeeSalary=salary;
	}
	public void getEmployeeData() {
		System.out.println("Emoloyee id is: "+employeeId);
		System.out.println("Employee Name is: "+employeeName);
		System.out.println("Employee Salary is: "+employeeSalary);
	}
}
