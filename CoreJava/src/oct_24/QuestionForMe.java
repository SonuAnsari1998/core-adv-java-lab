package oct_24;

/*Assignment 01 :
---------------
Create a program to find out the Student Grade based on Student Marks :

Create a BLC class Student

Instance Variables :
name : String : private 
marks : int : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
student from this method.

Create another BLC class StudentGrade.

Instance Variables :
student : Student : private 
studentGrade : char : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[The Student Raj has 'A' Grade]

Create another class CalculateStudentGrade which does not contain any field (Variable)

Methods :
Name of the Method : calculateGrade()  [Factory Method]
return type : StudentGrade 
Access Modifier : public, static
Argument : Student 

In calculateGrade() method, task is to find the Student grade based on the Student marks and create and return the StudentGrade
object on the following criteria :

Student Marks                 Grade
> 90                            A
>= 75                           B
>= 60                           C
< 60                            D

Create an ELC class StudentGradeCalculator which contains main method to test the application.


--------------------------------------------------------------------------------
Assignment 02 :
---------------
Create a program to find out the Employee Performance based on Salary :

Create a BLC class Employee

Instance Variables :
name : String : private 
salary : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
employee from this method.

Create another BLC class EmployeePerformance.

Instance Variables :
employee : Employee : private 
performance : String : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[Employee John has "Excellent" Performance]

Create another class EvaluateEmployeePerformance which does not contain any field (Variable)

Methods :
Name of the Method : evaluatePerformance()  [Factory Method]
return type : EmployeePerformance 
Access Modifier : public, static
Argument : Employee 

In evaluatePerformance() method, task is to find the Employee performance based on the salary and create and return the EmployeePerformance
object on the following criteria :

Employee Salary            Performance
> 100000                    Excellent
>= 75000                    Good
>= 50000                    Average
< 50000                     Below Average

Create an ELC class EmployeePerformanceCalculator which contains main method to test the application.


--------------------------------------------------------------------------------
Assignment 03 :
---------------
Create a program to classify Vehicle Efficiency based on Mileage :

Create a BLC class Vehicle

Instance Variables :
model : String : private 
mileage : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the model name of the 
vehicle from this method.

Create another BLC class VehicleEfficiency.

Instance Variables :
vehicle : Vehicle : private 
efficiency : String : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[Vehicle Honda City is "Highly Efficient"]

Create another class CalculateVehicleEfficiency which does not contain any field (Variable)

Methods :
Name of the Method : calculateEfficiency()  [Factory Method]
return type : VehicleEfficiency 
Access Modifier : public, static
Argument : Vehicle 

In calculateEfficiency() method, task is to find the Vehicle efficiency based on mileage and create and return the VehicleEfficiency
object on the following criteria :

Mileage (km/l)              Efficiency
> 25                        Highly Efficient
>= 18                       Efficient
>= 12                       Moderate
< 12                        Poor

Create an ELC class VehicleEfficiencyCalculator which contains main method to test the application.


--------------------------------------------------------------------------------
Assignment 04 :
---------------
Create a program to categorize Movies based on IMDB Rating :

Create a BLC class Movie

Instance Variables :
title : String : private 
imdbRating : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the title of the movie from this method.

Create another BLC class MovieCategory.

Instance Variables :
movie : Movie : private 
category : String : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[Movie "Inception" is categorized as "Blockbuster"]

Create another class ClassifyMovieCategory which does not contain any field (Variable)

Methods :
Name of the Method : classifyCategory()  [Factory Method]
return type : MovieCategory 
Access Modifier : public, static
Argument : Movie 

In classifyCategory() method, task is to find the Movie category based on the IMDB rating and create and return the MovieCategory
object on the following criteria :

IMDB Rating                 Category
>= 8.5                       Blockbuster
>= 7.0                       Hit
>= 5.0                       Average
< 5.0                        Flop

Create an ELC class MovieCategoryCalculator which contains main method to test the application.


--------------------------------------------------------------------------------
Assignment 05 :
---------------
Create a program to determine Product Rating based on Customer Review Score :

Create a BLC class Product

Instance Variables :
name : String : private 
rating : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
product from this method.

Create another BLC class ProductRating.

Instance Variables :
product : Product : private 
ratingCategory : String : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[Product "iPhone" has "Excellent" Rating]

Create another class CalculateProductRating which does not contain any field (Variable)

Methods :
Name of the Method : calculateRating()  [Factory Method]
return type : ProductRating 
Access Modifier : public, static
Argument : Product 

In calculateRating() method, task is to find the Product rating based on customer rating and create and return the ProductRating
object on the following criteria :

Customer Rating             Rating Category
> 4.5                        Excellent
>= 4.0                       Good
>= 3.0                       Average
< 3.0                        Poor

Create an ELC class ProductRatingCalculator which contains main method to test the application.

=============================================================================================
Create a program to determine Employee Performance Rating based on Employee Score :

Create a BLC class Employee

Instance Variables :
name : String : private 
score : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
employee from this method.

Create another BLC class EmployeePerformance.

Instance Variables :
employee : Employee : private 
performanceCategory : String : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details :

[Employee "John" has "Outstanding" Performance]

Create another class EvaluateEmployeePerformance which does not contain any field (Variable)

Methods :
Name of the Method : evaluatePerformance()  [Factory Method]
return type : EmployeePerformance 
Access Modifier : public, static
Argument : Employee 

In evaluatePerformance() method, task is to find the Employee Performance based on employee score and create and return the EmployeePerformance
object on the following criteria :

Employee Score             Performance Category
> 9.0                        Outstanding
>= 8.0                       Excellent
>= 6.0                       Good
>= 4.0                       Average
< 4.0                        Needs Improvement

Create an ELC class PerformanceCalculator which contains main method to test the application.


-----------------------------------------------
EXPECTED OUTPUT EXAMPLE
-----------------------------------------------

Input:
Employee Name : John
Employee Score : 9.5

Output:
[Employee "John" has "Outstanding" Performance]

Input:
Employee Name : Maria
Employee Score : 7.2

Output:
[Employee "Maria" has "Good" Performance]

Input:
Employee Name : Raj
Employee Score : 3.5

Output:
[Employee "Raj" has "Needs Improvement" Performance]

===============================================================================================
Scenario: Patient Health Condition Evaluation System

Create a program to determine a Patient’s Health Condition Category based on their Health Index Score.

BLC Class: Patient

Instance Variables:
patientName : String : private
healthIndex : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the patient from this method.

Create another BLC class PatientCondition.

Instance Variables:
patient : Patient : private
conditionCategory : String : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details:

[Patient "Ravi Kumar" is in "Excellent" Health Condition]

Create another class CalculatePatientCondition which does not contain any field (Variable)

Methods:
Name of the Method : evaluateCondition()  [Factory Method]
return type : PatientCondition
Access Modifier : public, static
Argument : Patient

In evaluateCondition() method, task is to find the Patient Condition based on health index and create and return the PatientCondition
object on the following criteria:

Health Index             Condition Category
> 9.0                        Excellent
>= 8.0                       Very Good
>= 6.0                       Good
>= 4.0                       Fair
< 4.0                        Poor

Create an ELC class HealthConditionCalculator which contains main method to test the application.


-----------------------------------------------
EXPECTED OUTPUT EXAMPLE
-----------------------------------------------

Input:
Patient Name : Ravi Kumar
Health Index : 9.4

Output:
[Patient "Ravi Kumar" is in "Excellent" Health Condition]

Input:
Patient Name : Sneha Gupta
Health Index : 6.8

Output:
[Patient "Sneha Gupta" is in "Good" Health Condition]

Input:
Patient Name : Arif Sheikh
Health Index : 3.5

Output:
[Patient "Arif Sheikh" is in "Poor" Health Condition]

*/
