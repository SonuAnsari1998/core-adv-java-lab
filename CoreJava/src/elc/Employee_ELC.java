package elc;
import java.util.Scanner;
import blc.Employee_BLC;
public class Employee_ELC {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Employee_BLC emp1=new Employee_BLC();
		System.out.print("Enter Employee Id");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Employee Name");
		String name=sc.nextLine();
		System.out.print("Enter Employee Salary");
		double salary=Double.parseDouble(sc.nextLine());
		
		emp1.setEmployeeData(id,name,salary);
		System.out.println("-----Employee Data-------");
		emp1.getEmployeeData();
	}
}
