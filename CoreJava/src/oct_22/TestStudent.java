package oct_22;
import java.awt.font.TextLayout.CaretPolicy;
/*Create a ELC class TestStudent
Main Method: In the main method, write code to:

Take an Infinite while loop, Prompt the user to enter values for name, age, and grade through Scanner class. 
Call the createStudentObject() with specified value which will 
return Student object. Print student data using toString() method.

Ask choice from the user, whether the user wants to continue to create and return more Student object or not. 
By using equalsIgnoreCase() come out from the Infinite loop, If the 
user choice is - no*/
import java.util.Scanner;
public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("Enter Student Name: ");
			String name=sc.nextLine();
			System.out.print("Enter Student Age: ");
			int age=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Student Grade: ");
			String grade=sc.nextLine();
			Student s1=Student.createStudentObject(name, age, grade);
			System.out.println(s1);
			
			System.out.println("You want to create new Object (YES/NO)");
			String createObj=sc.nextLine();
			if(createObj.equalsIgnoreCase("no")) {
				System.err.println("End");
				System.exit(0);
			}
		}

	}

}
