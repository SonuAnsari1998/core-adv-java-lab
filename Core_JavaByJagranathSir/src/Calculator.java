
import java.util.Scanner;
class Employee{
    String name;
    double salary;
    double percent;
    double finalSalary;
    public void raiseSalary(String name, double salary, double percent){
        this.name=name;
        this.salary=salary;
        this.percent=percent;
        double finalSalary=(percent*salary)/100;
    }
    public void displayDetails(){
        System.out.println("Updated Employee Details:");
        System.out.println("Employee Name: "+name);
        System.out.println("Salary: "+(finalSalary+salary));
    }
}
class Calculator{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        Employee emp1=new Employee();
        Employee emp2=new Employee();

        System.out.println("Enter name of Employee: ");
        String name=sc.nextLine();

        System.out.println("Enter salary of Employee: ");
        double salary=sc.nextDouble();
        
        System.out.println("Enter salary raise percentage for Employee :");
        double percent=sc.nextDouble();

        emp1.raiseSalary(name,salary,percent);
        emp1.displayDetails();
        
    }
}
