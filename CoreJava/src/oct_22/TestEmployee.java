package oct_22;
/*Create a ELC class TestEmployee
Main Method: In the main method, write code to:

Take an Infinite while loop, Prompt the user to enter values for name, id,department and salary through Scanner 
class. Call the createEmployeeObject() with specified value which will return Employee object. Print Employee 
data using toString() method and print the
calculateAnnualSalary() also.

Ask choice from the user, whether the user wants to continue to create and return more Employee object or not.
 By using equalsIgnoreCase() come out from the Infinite loop, If the user choice is - no

Test Case :
-------------
How many employees do you want to create? 2

--- Employee Details ---

Enter details for Employee 1:
Enter Employee ID: 111
Enter Employee Name: Scott
Enter Monthly Salary: 40000
Enter Department (Sales, Engineering, HR, Other): HR
ID: 111, Name: Scott, Department: HR, Monthly Salary: 40000.00, 
Annual Salary (with Bonus): 518400.00

Enter details for Employee 2:
Enter Employee ID: 222
Enter Employee Name: Smith
Enter Monthly Salary: 60000
Enter Department (Sales, Engineering, HR, Other): Sales
ID: 222, Name: Smith, Department: Sales, Monthly Salary: 60000.00, 
Annual Salary (with Bonus): 792000.00*/
import java.util.Scanner;
public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("Enter Employee ID: ");
			int id=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Employee Name: ");
			String name=sc.nextLine();
			System.out.print("Enter Monthly Salary:");
			double salary=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Department (Sales, Engineering, HR, Other):");
			String department=sc.nextLine();
			Employee emp=Employee.createEmployeeObject(name,id,department, salary);
			System.out.println(emp);
			System.out.println("Annual Salary (with Bonus): "+emp.calculateAnnualSalary());
			
			System.out.println("You want to create object (YES/No)");
			String update=sc.nextLine();
			if(update.equalsIgnoreCase("No")) {
				System.err.println("End");
				System.exit(0);
			}	
		}

	}

}
