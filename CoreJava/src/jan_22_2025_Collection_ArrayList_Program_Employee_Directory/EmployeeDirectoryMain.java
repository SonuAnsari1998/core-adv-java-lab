package jan_22_2025_Collection_ArrayList_Program_Employee_Directory;

public class EmployeeDirectoryMain {
	void main() {
		Directory dir = new Directory();
		
		IO.println("----------Employee Directory-----------");
		while(true) {
			IO.println("1. Add Employee Details..");
			IO.println("2. Update Employee Details.");
			IO.println("3. Delete Employee Details..");
			IO.println("4. View Employee Details..");
			IO.println("5. Exit..");
			int choice = Integer.parseInt(IO.readln("Enter Your Choice!!"));
			switch(choice) {
			case 1->{
				IO.println("Add Employee Details..");
				int size=Integer.parseInt(IO.readln("How many employee want to add.."));
				for(int i=1; i<=size; i++) {
					String empName=IO.readln("Enter Employee Name");
					String position=IO.readln("Enter Employee Position");
					double salary = Double.parseDouble(IO.readln("Enter Salary."));
					dir.addEmployee(new Employee(empName, position, salary));
				}
				IO.println("Employee Data Added sucessfully.........\n");
			}
			case 2->{
				IO.println("Update Employee Details.");
				String position = IO.readln("Enter new Position");
				double salary = Double.parseDouble(IO.readln("Enter new Salary"));
				int index = Integer.parseInt(IO.readln("Enter index no."));
				dir.updateEmployee(position, salary, index);
			}
			case 3->{
				IO.println("Delete Employee Details..");
				int index1 = Integer.parseInt(IO.readln("Enter index no. want to delete"));
				dir.deleteEmployee(index1);
				dir.displayAllEmployees();
			}
			case 4->{
				IO.println("\nEmployee Details..\n");
				dir.displayAllEmployees();
				
			}
			case 5->{
				IO.println("Thank You for visiting....");
				System.exit(0);
			}
			
			default -> System.out.println("Invalid choice...Please Enter valid choice");
			};
			
		}
		
		
		
		
		
	}
}
