package oct_13;
import java.util.Scanner;
public class Employee_ELC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee_BLC emp=new Employee_BLC();
		System.out.print("Enter Employee First Name");
		String fName=sc.nextLine();
		System.out.print("Enter Employee Last Name");
		String lName=sc.nextLine();
		System.out.print("Enter Employee ID");
		int eId=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Employee Salary");
		double slry=Double.parseDouble(sc.nextLine());
		System.out.print("Enter No of Project");
		int noOProject=Integer.parseInt(sc.nextLine());
		

		emp.setEmployeeData(fName,lName,eId,slry,noOProject);
		emp.calculateSalary();
		emp.displayDetails();
	}
}
