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
user choice is - no*/
public class Student {
	 private String name;
	 private int age;
	 private String grade;
	 private Student(String name, int age, String grade) {
		 this.name=name;
		 this.age=age;
		 this.grade=grade;
	 }
	 public static Student createStudentObject(String name, int age, String grade) {
		 return new Student(name,age, grade);
	 }

	 public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	 }
	 
}























