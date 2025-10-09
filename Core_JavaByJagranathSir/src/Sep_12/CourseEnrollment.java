package Sep_12;
/*Q3.  Online Course Enrollment (Udemy/Coursera-like)
Build a system to manage student course enrollments.
Class: CourseEnrollment
Fields:
String courseName
String studentName
double fees
Tasks:
Initialize using setters.
Retrieve details using getters.
Create three enrollments and display them*/
import java.util.Scanner;
public class CourseEnrollment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Udemy e1=new Udemy();
		System.out.println("Enter Course Name");
		e1.setCourseName(sc.nextLine());
		System.out.println("Enter Student Name");
		e1.setStudentName(sc.nextLine());
		System.out.println("Enter Fee");
		e1.setFee(sc.nextDouble());
		sc.nextLine();
		//-----------------
		Udemy e2=new Udemy();
		System.out.println("Enter Course Name");
		e2.setCourseName(sc.nextLine());
		System.out.println("Enter Student Name");
		e2.setStudentName(sc.nextLine());
		System.out.println("Enter Fee");
		e2.setFee(sc.nextDouble());
		sc.nextLine();
		//-------------------------------
		Udemy e3=new Udemy();
		System.out.println("Enter Course Name");
		e3.setCourseName(sc.nextLine());
		System.out.println("Enter Student Name");
		e3.setStudentName(sc.nextLine());
		System.out.println("Enter Fee");
		e3.setFee(sc.nextDouble());
		
		
		System.out.println("         Student Details          ");
		System.out.println("-------Student-1------------------");
		e1.displayEnrollmenent();
		System.out.println("-------Student-2------------------");
		e2.displayEnrollmenent();
		System.out.println("-------Student-3------------------");
		e3.displayEnrollmenent();
	}
}
class Udemy{
	private String courseName;
	private String studentName;
	private double fees;
	//setter
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setFee(double fees) {
		this.fees=fees;
	}
	//getter
	public String getCourseName() {
		return courseName;
	}
	public String getStudentName() {
		return studentName;
	}
	public double getFee() {
		return fees;
	}
	public void displayEnrollmenent() {
		System.out.println("Course Name: "+courseName);
		System.out.println("Student Name: "+studentName);
		System.out.println("Fees: Rs. "+fees);
	}
	
}
