package oct_13;
/*Assignment 02 :
---------------
Create a BLC class Employee class with properties 

String firstName
String lastName
int employeeId
double salary
int noOfProject


Create a setEmployeeData() method with 5 parameters variables to initialize all the instance variables.

Write public void calculateSalary() method that will add extra ammount in salary 
based on NoOfProject by using following criteria.

NoOfProject is more than 5 and less than 10 then add 5000 to the salary.
NoOfProject is more than 10 and less than 20 then add 10000 to the salary.
NoOfProject is more than 20 then add 15000 to the salary.

Take a method called public void displayDetails() to display the employee details with updated salary.

Take an ELC class Tester with main method to test your logic.*/
public class Employee_BLC {
	String firstName;
	String lastNamel;
	int employeeId;
	double salary;
	int noOfProject;
	public void setEmployeeData( String fName, String lName, int eId, double slry, int nOProject) {
		firstName=fName;
		lastNamel=lName;
		employeeId=eId;
		salary=slry;
		noOfProject=nOProject;
	}
	public void calculateSalary() {
		if(noOfProject>=5 && noOfProject<=10) {
			salary+=5000;
		}else if(noOfProject>=10 && noOfProject<=20) {
			salary+=10000;
		}else if(noOfProject>20) {
			salary+=15000;
		}
	}
	public void displayDetails() {
		System.out.println("----------Employee Details-----------");
		System.out.println("Employee First Name: "+firstName);
		System.out.println("Employee Last Name: "+lastNamel);
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Employee Salary: "+salary);
		System.out.println("No. of Project: "+noOfProject);
	}	
}
