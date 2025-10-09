package Sep_08;
import java.util.Scanner;
public class BankingApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User name");
		String name=sc.nextLine();
		System.out.println("Enter Card Number");
		long  CardNumber=sc.nextLong();
		System.out.println("Enter Aadhar Number");
		long aadharNo=sc.nextLong();
		Bank.withdraw(name);
	}
}
class Bank {
	public static void withdraw(long cardNo) {
		System.out.println("Welcome to State Bank of India !");
		System.out.println("Money withdrawn using ! \nCard Number: "+cardNo);
		
		
	}
	public static void withdraw(String uName) {
		System.out.println("Hello !"+uName);
		System.out.println("Welcome to State Bank of India !");
		System.out.println("Money withdrawn using ! \nusername: "+uName);
	}
	public static void withdraw(String uName,long aadharNo) {
		System.out.println("Hello !"+uName);
		System.out.println("Welcome to State Bank of India !");
		System.out.println("Money withdrawn using ! \nusername: "+uName+"\nAdhaar card: "+aadharNo);
	}
}
