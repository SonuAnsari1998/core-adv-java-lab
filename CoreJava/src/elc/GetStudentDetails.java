package elc;

import java.util.Scanner;

import blc.StudentDetails;

public class GetStudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How mant object create");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter Student Roll Number");
			int rollNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name");
			String studentName=sc.nextLine();
			System.out.println("Enter Student Fees");
			double fees=sc.nextDouble();
			System.out.println(StudentDetails.getStudentDetails(rollNo, studentName, fees));
		}
		
		
	}

}
