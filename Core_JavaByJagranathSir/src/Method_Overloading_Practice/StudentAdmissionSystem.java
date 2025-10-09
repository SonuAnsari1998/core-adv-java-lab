package Method_Overloading_Practice;
/*Question 4: Student Admission System (with explicit validations)
You are developing a system for a college to manage student admissions.
Task:
Create a class Student with private fields:

String studentName — name of the student.
int rollNumber — roll number of the student.
double marks — marks scored by the student.

Implement setter methods using the this keyword with validations:
studentName cannot be null or empty. If invalid, print an error message.
rollNumber must be positive. If invalid, print an error message.
marks must be between 0 and 100. If invalid, print an error message.
Implement getter methods to retrieve field values.

Write a test class to:
Create details for three students.
Set the details using setter methods.
Retrieve and print student details using getter methods.
Update the marks of one student and print updated details.*/
import java.util.Scanner;
public class StudentAdmissionSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		System.out.println("Enter Student Name");
		s1.setStudentName(sc.nextLine());
		System.out.println("Enter Student Roll Number");
		s1.setRollNumber(sc.nextInt());
		System.out.println("Enter Student Marks");
		s1.setMarks(sc.nextDouble());
		sc.nextLine();
		System.out.println("---------------------------");
		
		//---------------------------------------
		Student s2=new Student();
		System.out.println("Enter Student Name");
		s2.setStudentName(sc.nextLine());
		System.out.println("Enter Student Roll Number");
		s2.setRollNumber(sc.nextInt());
		System.out.println("Enter Student Marks");
		s2.setMarks(sc.nextDouble());
		sc.nextLine();
		System.out.println("---------------------------");
		//---------------------------------------
		Student s3=new Student();
		System.out.println("Enter Student Name");
		s3.setStudentName(sc.nextLine());
		System.out.println("Enter Student Roll Number");
		s3.setRollNumber(sc.nextInt());
		System.out.println("Enter Student Marks");
		s3.setMarks(sc.nextDouble());
		sc.nextLine();
		
		//---------------------------------------------------
		System.out.println("--------------------------");
		System.out.println(s1.studentDetails());
		System.out.println(s2.studentDetails());
		System.out.println(s3.studentDetails());
		
	}
}
class Student{
	private String studentName;
	private int rollNumber;
	private double marks;
	//setter
	public void setStudentName(String studentName) {
		if(studentName != null && !studentName.trim().isEmpty()) {
			this.studentName=studentName;
		}else {
			System.err.println("Please Enter Valid Student Name");
			System.exit(0);
		}
	}
	public void setRollNumber(int rollNumber) {
		if(rollNumber>0) {
		this.rollNumber=rollNumber;
		}else {
			System.err.println("Please Enter Valid Roll Number");
			System.exit(0);
		}
	}
	public void setMarks(double marks) {
		if(marks>0 && marks<=100) {
			this.marks=marks;
		}else {
			System.err.println("Plese Enter Valid marks");
			System.exit(0);
		}
	}
	//getter
	public String getStudentName() {
		return studentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public double getMarks() {
		return marks;
	}
	//display
	public String studentDetails() {
		return "Student Name: "+studentName+
				"\nRoll Number: "+rollNumber+
				"\nMarks: "+marks;
	}
}




















