package Sep_13_Test_Question;
/*3.Static_Vs_Instance_Varibles
 (Static vs Instance Variables)
Write a Java program to demonstrate the difference between static and instance variables.
•	Create a class Student with an instance variable name and a static variable schoolName.
•	Assign different names to two student objects, but keep the school name common for both.
•	Print the values to show how the instance and static variables behave differently.
Sample Input
Alice
Bob
ABC Public School
Sample Output
Student 1 Name: Alice
Student 1 School: ABC Public School

Student 2 Name: Bob
Student 2 School: ABC Public School*/
import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		School s1=new School();
		System.out.println("Enter Student Name");
		s1.name=sc.nextLine();
		//----------------------------
		School s2=new School();
		System.out.println("Enter Student Name");
		s2.name=sc.nextLine();
		//----------------------------------
		School s3=new School();
		System.out.println("Enter Student Name");
		s3.name=sc.nextLine();
		
		//----------------------
		System.out.println("-------Students Details--------");
		s1.studentDetails();
		System.out.println("-------------------------");
		s2.studentDetails();
		System.out.println("-------------------------");
		s3.studentDetails();
	}

}
class School{
	public static String schoolName= "DPS PUBLIC SCHOOL";
	String name;
	public void studentDetails() {
		System.out.println("School Name: "+schoolName);
		System.out.println("Student Name: "+name);
	}
}
