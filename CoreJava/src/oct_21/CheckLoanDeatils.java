package oct_21;
/*Create Another ELC class CheckLoanDeatils with main method. 
 By using Scanner class pass the value to parameter variables to initialize the non static field.

 In ELC class, Print complete detials of Loan as shown in the Test cases.

 Test Case for Output :
 -----------------------
Enter Loan Amount :15000
Enter Interest Rate :8.2
Enter number of months for Loan :120

Principal: 15000.0
Interest Rate (Yearly %): 8.2
Duration (months): 120*/

import java.util.Scanner;

public class CheckLoanDeatils {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Loan Amount: ");
		double principal=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Interest Rate: ");
		double interestRate=Double.parseDouble(sc.nextLine());
		System.out.print("Enter number of months for Loan: ");
		int durationMonths=Integer.parseInt(sc.nextLine());
		Loan l1=new Loan(principal,interestRate,durationMonths);
		System.out.println();
		System.out.println("--------Loan Details-----------");
		System.out.println("Principal: "+l1.getPrincipal());
		System.out.println("Interest Rate (Yearly %): "+l1.getInterestRate());
		System.out.println("Duration (months): "+l1.getDurationMonths());
	}
}
