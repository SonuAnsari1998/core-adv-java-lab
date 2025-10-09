package Aug_26;

import java.util.Scanner;

public class CourseFeedback {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	Feedback f1=new Feedback();
	
	System.out.println("Enter Student Name: ");
	String studentName=sc.nextLine();
	
	System.out.println("Ente Course: ");
	String courseName=sc.nextLine();
	
	System.out.println("Enter Rating:" );
	float rating=sc.nextFloat();
	sc.nextLine();
	
	System.out.println("Enter Feedback: ");
	String feedback=sc.nextLine();
	
	f1.collectFeedback(studentName,courseName,rating,feedback);
	f1.displayFeedback();
}
}

