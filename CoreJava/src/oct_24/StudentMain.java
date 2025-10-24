package oct_24;
import java.util.Scanner;
public class StudentMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Student Marks: ");
		int marks=Integer.parseInt(sc.nextLine());
		Student s1=new Student(name,marks);
		StudentGrade calculateGrade = CalculateStudentGrade.calculateGrade(s1);
		
		System.out.println(calculateGrade);
	}
}

//output
//The Student Raj has 'A' Grade