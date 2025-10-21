package oct_16;

/*Assignment 01
--------------
Create a program to understand the use of Constructor in java program.

Create a BLC class called Car

Attributes/Properties :[private access modifier for all the fields]

names		 Type
--------	---------------		
 model   	:String   
 year   	:int  
 price  	:double  
 
Implement a parameterized constructors to initialize these properties with parameter variable.

Generate toString() method to print Object properties.

Take another class ConstructorDemo (ELC Class) which is having main method and instantiate the Car object to get the desired output

Test Cases for Output :
------------------------
Enter Car Model :Toyota
Enter Car Manufacturing year :2025
Enter Car Price :1500000
Car [model=Toyota, year=2025, price=1500000.0]


Test Case for Input Validation :
--------------------------------
Test Case 1 :

Enter Car Model :Toyota
Enter Car Manufacturing year :2010
Enter Car Price :120000
year must be greater than 2010

Test Case 2 :

Enter Car Model :BMW
Enter Car Manufacturing year :2024
Enter Car Price :-1000000
Price must be positive integer

========================================================================
Assignment 02
--------------
Create an Employee class (BLC Class)

Attributes/Properties :[private access modifier for all the fields]

names		 Type
--------	---------------		
 firstName   	:String   
 lastName      	:String  
 employeeId 	:int  
 salary  	:double  
 NoOfProject 	:int 

Implement parameterized constructors to initialize these properties.

Generate toString() method to print Object Properties.

implement calculateSalary() method that will add extra ammount in salary based on NoOfProject.

Return Type     : void
Access modifier :public

NoOfProject is more than 5 and less than 10 then add 5000
NoOfProject is more than 10 and less that 20 then add 10000
NoOfProject is more than 20 then add 15000

Take another class Tester (ELC Class) which is having main method and instantiate the Employee object and execute the methods.


Test Case 1: 
----------------
Valid Input with Projects Between 6 and 10
Input:

firstName: John
lastName: Doe
employeeId: 101
salary: 50000.00
NoOfProject: 7

Expected Output:

After executing calculateSalary(), the salary should be updated to 55000.00.
Print output showing the updated salary: 55000.00.

Test Case 2:
---------------
 Invalid Number of Projects (Negative Value)
Sample Input:

firstName: Michael
lastName: Johnson
employeeId: 105
salary: 45000.00
NoOfProject: -5

Expected Output:

Print an error message indicating invalid number of projects (e.g., "Number of projects cannot be negative").
Salary remains 45000.00.

------------------------------------------------------------------------
Assignment 03 :
---------------
Design a Book printing System

Create a class  Book (BLC Class)

Attributes/Properties :[private access modifier for all the fields]

Name		     data type 
-------		      -----------
title                 :String
author       	      :String
price 		      :double

Implement a parameterized constructor to initialize all the fields

Methods :
Genearte toString() method to print object properties.

Method Name		:applyDiscount(double discountPercentage)
Return type		:void
Acess modifier	        :public


Take Main class (ELC Class) which having in main method  and execute the main method


Test Cases :
--------------

Test Case 1:
 Applying Invalid Discount (Negative)

Error: Invalid discount percentage.
Title: 1984
Author: George Orwell
Price: 14.391

Test Case 2: Creating Book with Negative Price
Error : Book Price cannot be negative.
Title: Negative Price Book
Author: No Author
Price: -5.0*/
