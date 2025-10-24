package oct_22;

/*Assignment : 01
---------------
Create a BLC class Student. 

Field/Attribute/Properties [Access modifier : private]

name : String
age : int
grade : String

Take a private parameterized constructor to initialize the field so, We can call the Constructor from BLC class only.

Methods :
----------
1)
Name of the Method : createStudentObject()
         Parameter : three parameter name, age and grade 
       return type : Student [Factory Method]
   Access modifier : public
   Non access modifier : static
In this method return the Student object.


Generate toString() method.

Create a ELC class TestStudent
Main Method: In the main method, write code to:

Take an Infinite while loop, Prompt the user to enter values for name, age, and grade through Scanner class. Call the createStudentObject() with specified value which will 
return Student object. Print student data using toString() method.

Ask choice from the user, whether the user wants to continue to create and return more Student object or not. By using equalsIgnoreCase() come out from the Infinite loop, If the 
user choice is - no



Assignment : 2
---------------
Create a BLC class Employee. 

Field/Attribute/Properties [Access modifier : private]

name : String
id : int
department : String
salary : double

Take a private parameterized constructor to initialize the field so, We can call the Constructor from BLC class only.

Methods :
----------
1)
Name of the Method : createEmployeeObject()
         Parameter : 4 parameters name, id, department and salary 
       return type : Employee
   Access modifier : public
   Non access modifier : static
In this method return the Employee Object.


2) Generate toString() method. Call calculateAnnualSalary() method from
   this method to display deatils.

3)
Name of the Method : calculateAnnualSalary()
         Parameter : No Parameter 
       return type : double
   Access modifier : public
  
In this method with the help of switch case calculates and returns the annual salary of the employee based on their salary (monthly salary).
Adds a bonus based on the department:
Sales: 10% bonus of annual salary.
Engineering: 15% bonus of annual salary.
HR: 8% bonus of annual salary.
Other: 5% bonus of annual salary.

Create a ELC class TestEmployee
Main Method: In the main method, write code to:

Take an Infinite while loop, Prompt the user to enter values for name, id,department and salary through Scanner class. Call the createEmployeeObject() with specified value which will return Employee object. Print Employee data using toString() method and print the
calculateAnnualSalary() also.

Ask choice from the user, whether the user wants to continue to create and return more Employee object or not. By using equalsIgnoreCase() come out from the Infinite loop, If the user choice is - no

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
