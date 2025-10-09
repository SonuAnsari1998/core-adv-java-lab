package For_Extra_Practice;

import java.util.Scanner;

public class StudentCounterMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentCounter student1 = new StudentCounter();

		System.out.println("Enter Student Name: ");
		String studentName = sc.nextLine();

		student1.setName(studentName);
		// -----------------------------
		StudentCounter student2 = new StudentCounter();

		System.out.println("Enter Student Name: ");
		String studentName2 = sc.nextLine();

		student1.setName(studentName2);
		// -----------------------------
	}
}
