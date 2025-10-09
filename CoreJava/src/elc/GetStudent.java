package elc;
import java.util.Scanner;

import blc.Student;

public class GetStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Marks");
		double marks=Double.parseDouble(sc.nextLine());
		System.out.println("Student Grade is : "+Student.calculateGrade(marks));
	}
}
