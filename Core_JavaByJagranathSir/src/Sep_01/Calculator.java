package Sep_01;

import java.util.Scanner;
public class Calculator{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        Employee emp1=new Employee();

        System.out.println("Enter name of Employee: ");
        String name=sc.next();

        System.out.println("Enter salary of Employee: ");
        double salary=sc.nextDouble();
        
        System.out.println("Enter salary raise percentage for Employee :");
        double percent=sc.nextDouble();

        emp1.setInput(name,salary);
        emp1.raiseSalary(percent);
        emp1.displayDetails();  
        //---------------------------------
        Employee emp2=new Employee();

        System.out.println("Enter name of Employee: ");
        String name2=sc.next();

        System.out.println("Enter salary of Employee: ");
        double salary2=sc.nextDouble();
        
        System.out.println("Enter salary raise percentage for Employee :");
        double percent2=sc.nextDouble();

        emp2.setInput(name2,salary2);
        emp2.raiseSalary(percent2);
        emp2.displayDetails();       
    }
}
class Employee{
    String name;
    double salary;
    public void setInput(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void raiseSalary(double percent){
        salary=salary+(percent*salary)/100;
    }
    public void displayDetails(){
        System.out.println("Updated Employee Details:");
        System.out.println("Employee Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
