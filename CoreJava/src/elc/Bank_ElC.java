package elc;
import java.util.Scanner;
import blc.Bank_BLC;
public class Bank_ElC {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Bank_BLC customer1=new Bank_BLC();
		System.out.print("Enter Customer id: ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Customer Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Customer Mobile Number: ");
		long mobileNo=Long.parseLong(sc.nextLine());
		System.out.print("Enter Customer Deposit Amount: ");
		double dAmount=Double.parseDouble(sc.nextLine());
		System.out.print("Enter Total Amount: ");
		double totalDAmount=Double.parseDouble(sc.nextLine());
		customer1.setCustomerDetails(id,name,mobileNo,dAmount,totalDAmount);
		customer1.getCustomerDetails();
	}
}
