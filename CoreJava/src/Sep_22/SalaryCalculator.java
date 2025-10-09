package Sep_22;

/*Program 04:
-----------
Write a program to input the basic salary of a person. He gets 15% of the basic as HRA, 15% of the basic as Conveyance allowance and 10% of the basic as Entertainment allowance. The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance. Calculate and print the total salary of person.
Take the Basic Salary from Command Line Argument*/

class SalaryCalculator{
public static void main(String []args){
double BasicSalary=Double.parseDouble(args[0]);

double hra=(15*BasicSalary)/100;
double ConveyanceAllowance=(15*BasicSalary)/100;
double EntertainmentAllowance=(10*BasicSalary)/100;
double totalSalary=(BasicSalary+hra+ConveyanceAllowance+EntertainmentAllowance);

System.out.println("------------Salary Calculator------------");
System.out.println("Basic Salary: "+BasicSalary);
System.out.println("HRA (15%): "+hra);
System.out.println("Conveyance allowance (15%): "+ConveyanceAllowance);
System.out.println("Entertainment allowance (10%) : "+EntertainmentAllowance);
System.out.println("Total Salary: "+totalSalary);

}
}
