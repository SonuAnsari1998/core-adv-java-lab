package Sep_08;

/*Question 2: Employee Salary Calculator
Create an Employee class (BLC Class)
Attributes:
basicSalary (private, double)
hra (private, double)
da (private, double)
taxPercentage (private, double)

Methods:
Setters & Getters for all attributes.
calculateGrossSalary() Method:
Formula: grossSalary = basicSalary + hra + da
Return Type: double

calculateNetSalary() Method:
Formula: netSalary = grossSalary
(grossSalary * taxPercentage / 100)
Return Type: double
Tester Class:
Test Case 1:
Input: basic = 20000, hra = 5000, da = 3000, tax = 10%
Expected Output: Gross Salary = 28000

Test Case 2:
Input: same as above
Expected Output: Net Salary = 25200
*/
import java.util.Scanner;

public class EmployeeSalaryCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.println("Enter Basic Salary");
		double basicSalary = sc.nextDouble();
		System.out.println("Enter HRA");
		double hra = sc.nextDouble();
		System.out.println("Enter DA");
		double da = sc.nextDouble();
		System.out.println("Enter TAX Percentage");
		double taxPercentage = sc.nextDouble();
		e1.setbasicSalary(basicSalary);
		e1.setHra(hra);
		e1.setda(da);
		e1.setTaxpercentage(taxPercentage);

		System.out.println("Gross Salary: "+e1.getCalculateGrossSalary());
		System.out.println("Net Salary: "+e1.getCalculateNetSalary());
	}
}
class Employee {
	private double basicSalary;
	private double hra;
	private double da;
	private double taxPercentage;

	public double getBasicSalary() {
		return basicSalary;
	}
	public void setbasicSalary(double sal)
	{
		this.basicSalary=sal;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra=hra;
	}

	public double getDa() {
		return da;
	}
	public void setda(double hra) {
		this.da=hra;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxpercentage( double tex) {
		this.taxPercentage=tex;
	}

	public double getCalculateGrossSalary() {
		double grossSalary = basicSalary + hra + da;
		return grossSalary;
	}

	public double getCalculateNetSalary() {
		double netSalary = getCalculateGrossSalary()-(this.getCalculateGrossSalary() * (taxPercentage / 100.0));
		return netSalary;
	}
}
