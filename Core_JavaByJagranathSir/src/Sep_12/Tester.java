package Sep_12;

/*
Q2. Create an Employee class (BLC Class)
Attributes :
names        Return Type
--------        ---------------        
 firstName       :String  
 lastName          :String  
 employeeId     :int  
 salary          :double  
 NoOfProject     :int

Access Modifier : private (for all variables)  

Implement setter methods to initialize these properties.

implement calculateSalary() method that will add extra amount in salary based on
NoOfProject.

Return Type       : void
Access modifier :public

NoOfProject is more than 5 and less than or equals to 10 then add 5000
NoOfProject is more than 10 and less than or equals to  20 then add 10000
NoOfProject is more than 20 then add 15000

Take another class Tester (ELC Class) which is having main method and instantiate
the Employee object and execute the methods.

*/
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.println("Enter First Name");
		e1.setFirstName(sc.nextLine());
		System.out.println("Enter Last Name");
		e1.setLastName(sc.nextLine());
		System.out.println("Enter Employee Id");
		e1.setEmployeeId(sc.nextInt());
		System.out.println("Enter Employee Salary");
		e1.setSalary(sc.nextDouble());
		System.out.println("Enter No of Project");
		e1.setNoOfProject(sc.nextInt());
		System.out.println("----------Employee Details----------");
		e1.calculate();
//		e1.employeeDetails();

	}
}

class Employee {
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;

	// setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setNoOfProject(int noOfProject) {
		this.noOfProject = noOfProject;
	}

	public void calculate() {
		if (noOfProject > 5 && noOfProject <= 10) {
			salary = salary + 5000;
		} else if (noOfProject > 10 && noOfProject <= 20) {
			salary = salary + 10000;
		} else if (noOfProject > 20) {
			salary = salary + 15000;
		} else {
			salary = salary;
		}
		System.out.println("Salary Added based on number of Project: " + salary);

	}

	public void employeeDetails() {
//		System.out.println("Employee First Name: " + firstName);
//		System.out.println("Employee Last Name: " + lastName);
//		System.out.println("Employee Id: " + employeeId);
//		System.out.println("Salary Added based on number of Project: " + salary);
//		System.out.println("No of Project: " + noOfProject);
	}

}
