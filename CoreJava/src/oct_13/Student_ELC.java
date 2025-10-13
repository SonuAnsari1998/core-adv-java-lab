package oct_13;

import java.util.Scanner;

public class Student_ELC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student_BLC st1=new Student_BLC();
		System.out.print("Enter Student ID");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Student Name");
		String name=sc.nextLine();
		System.out.print("Enter Student Marks");
		int marks=Integer.parseInt(sc.nextLine());
		st1.setStudentData(id, name, marks);
		st1.calculateGrade();
		System.out.println("Student Grade: "+st1.display());
	}
}



