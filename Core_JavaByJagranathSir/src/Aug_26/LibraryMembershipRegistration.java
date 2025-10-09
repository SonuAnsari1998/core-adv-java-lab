package Aug_26;

import java.util.Scanner;

class LibraryMembershipRegistration {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	Library st1=new Library();
	
	System.out.println("Enter Your Full Name: ");
	String sName=sc.nextLine();
	
	System.out.println("Enter Your Roll Number: ");
	int rollNo=sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter Your Department Name: ");
	String dept=sc.nextLine();
	
	System.out.println("Enter Your Email Address: ");
	String email=sc.nextLine();
	
	System.out.println("Enter Your Mobile Number: ");
	Long mobileNo=sc.nextLong();
	
	st1.setInput(sName,rollNo,dept,email,mobileNo);
	st1.displayDetails();
}
}
