package dec_15_2025_Lambda_Expression;

/*Assignment 01 :
---------------
Write a Java program that defines a method testPredicate to test a given number against a 
provided predicate.
class name CalculationLogic(ELC) :

Method name : testPredicate
Access Modifier : public
Non-Access Modifier : static
return type : boolean
parameters : int, Predicate<Integer>
This method should return a boolean value indicating whether the given number satisfies the 
provided predicate.


In the main method:
Define three predicates:
isEven: Checks if a given number is even.
isGreaterThanTen: Checks if a given number is greater than 10.
isPrime: Verify the given number is prime or not.

Define a sample integer number (e.g., 18).
Test each predicate using the testPredicate method and print the result indicating whether 
the number satisfies each predicate.

Test Cases:

Test case 1 : Sample Number (18):
18 is even: true
18 is greater than 10: true
18 is prime: false

Test Case 2:

For number1 = 6:
6 is even: true
6 is greater than 10: false
6 is prime: false

Test Case 3:
For number2 = 17:
17 is even: false
17 is greater than 10: true
17 is prime: true

------------------------------------------------------------------------------------------
Assignment 02 :
--------------
Develop a scenario based program by using Functional interface to check whether a Car 
is eligible for sale or not.

Create one record called Car.
Components :
 brand : String
 price : Double
 mileage : Integer
 
 Take an ELC class CarSelling with main method. Using IO class data input, Create the 
 object for Car class.

 In the ELC class write a Predicate<T> to verify whether Car is eligible for sale or 
 not based on the following criteria.
  a) Car price should be less or equal to 5 lac.
  b) Car mileage must be greater or equal than 20.

Test Case 01 :
---------------
Enter the brand name of the Car :Naxon
Enter the price of the Car :450000
Enter the mileage of the Car :22
Naxon is eligible for sale

Test Case 02 :
---------------
Enter the brand name of the Car :BE6
Enter the price of the Car :1800000
Enter the mileage of the Car :25
BE6 is not eligible for sale

Test Case 03 :
--------------
Enter the brand name of the Car :Tata Punch
Enter the price of the Car :450000
Enter the mileage of the Car :18
Tata Punch is not eligible for sale
==========================================================================================
Assignment 03 :
-------------
Develop a scenario based program by using Functional interface to check whether a customer 
is eligible for loan or not.

Create one record called Customer.
Components :
 name : String
 salary : Double
 creditScore : Integer
 age : Integer

Method :

1) Method Name     : checkLoanEligibility()
parameter          : No parameter
Return Type        : boolean
Access modifier    : public

In this method by using Predicate<Customer> verify whether a customer is eligible for
loan or not by using following criteria :

a) Customer salary should be > 25000
b) Credit Score should be > 700
c) Age must be > 21

By using Logical AND operator verify all the criteria and return true/false.


Take an ELC class LoanEligibilityWithPredicate with main method, With the help of IO
class create the input data, create the object for Customer class and verify whether the 
customer is eligible for loan or not.


Test Case 1 :
--------------
Enter Customer Name: Ravishankar
Enter Salary: 30000
Enter Credit Score: 720
Enter Age: 18
Ravishankar is NOT Eligible for Loan...

Test Case 2 :
--------------
Enter Customer Name: Ravishankar
Enter Salary: 80000
Enter Credit Score: 600
Enter Age: 24
Ravishankar is NOT Eligible for Loan...


Test Case 3 :
--------------
Enter Customer Name: Ravishankar
Enter Salary: 15000
Enter Credit Score: 780
Enter Age: 24
Ravishankar is NOT Eligible for Loan...

Test Case 4 :
-------------
Enter Customer Name: Ravishankar
Enter Salary: 70500
Enter Credit Score: 720
Enter Age: 24
Ravishankar is Eligible for Loan...

=========================================================================================*/
