package factoryMethod;
import java.util.Scanner;
public class College {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Student Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Course: ");
		String course=sc.nextLine();
		System.out.print("Enter Fee: ");
		double fee=Double.parseDouble(sc.nextLine());
		Student s1=Student.getStudentData(id,name,course,fee);
		System.out.println();
		System.out.println(s1);
	}
}
class Student{
	private int studentId;
	private String studentName;
	private String course;
	private double fee;
	private Student(int studentId, String studentName, String course, double fee) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.course=course;
		this.fee=fee;
	}
	public String toString() {
		return "Student Id: "+this.studentId+
				"\nStudent Name: "+this.studentName+
				"\nCourse: "+this.course+
				"\nFee: "+this.fee;
	}
	public static Student getStudentData(int studentId, String studentName, String course, double fee) {
		return new Student(studentId,studentName,course,fee);
	}
}