package oct_27_payroll_system;
import java.util.Scanner;
public class TaxCalculation {
	public static Object [] inputHandler(Scanner sc)
	{
		Object []obj=new Object[5];
		
		System.out.print("Enter Employee Id");
		obj[0]=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Employee Name");
		obj[1]=sc.nextLine();
		System.out.print("Enter Employee Basic Salary");
		obj[2]=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Employee HRAPer");
		obj[3]=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Employee DAPer");
		obj[4]=Double.parseDouble(sc.nextLine());
		return obj;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. For Employee");
		System.out.println("2. For Manager");
		System.out.println("3. For Trainer");
		System.out.println("4. For Sourcing");
		System.out.println("Enter your choice: ");
		int choice=Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1->
		{	
			Object[] va = inputHandler(sc);
			Employee emp = new Employee ((int)va[0],(String)va[1],(double)va[2],(double)va[3],(double)va[4]);
			TaxUtil t1=new TaxUtil();
			System.out.println();
			System.out.println("---------Salary Details---------------");
			System.out.println("Tax : "+t1.calculateTax(emp));
			System.out.println("Gross Salary :: "+emp.calculateGrossSalary());
			System.out.println("Final Salary : "+(emp.calculateGrossSalary()-t1.calculateTax(emp)));
			
		}
		case 2->
		{
			System.out.print("Enter Manager Project Allowance");
			double projectAllowance=Double.parseDouble(sc.nextLine());
			System.out.print("Enter Manager Basic Salary");
			double basicSalary=Double.parseDouble(sc.nextLine());
			
			Object[] va = inputHandler(sc);
			Manager manager = new Manager((int)va[0], (String)va[1], (double)va[2], (double)va[3], projectAllowance,basicSalary);
			TaxUtil t1=new TaxUtil();
			System.out.println("Final salary: "+t1.calculateTax(manager));
			
		}
		case 3->
		{
			System.out.print("Enter Trainer Batch Count");
			int batchCount=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Trainer Perk Per Batch");
			double perkPerBatch=Double.parseDouble(sc.nextLine());
			
			Object[] va = inputHandler(sc);
			Trainer trainer = new Trainer((int)va[0], (String)va[1], (double)va[2], (double)va[3], (double)va[4],batchCount, perkPerBatch);
			TaxUtil t1=new TaxUtil();
			System.out.println("Final salary: "+t1.calculateTax(trainer));
			
		}
		case 4->
		{
			System.out.print("Enter Sourcing  Batch Count");
			int enrollmentTarget=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Sourcing Enrollment Reached");
			int enrollmentReached=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Sourcing Per Enrollmenent");
			double perkPerEnrollment=Double.parseDouble(sc.nextLine());
			
			Object[] va = inputHandler(sc);
			Sourcing sourcing = new Sourcing((int)va[0], (String)va[1], (double)va[2], (double)va[3], (double)va[4],enrollmentTarget, enrollmentReached,perkPerEnrollment);
			TaxUtil t1=new TaxUtil();
			System.out.println("Final salary: "+t1.calculateTax(sourcing));	
		}
		}
	}
}
