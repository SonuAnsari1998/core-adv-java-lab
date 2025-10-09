package Method_Overloading_Practice;

import java.util.Scanner;

/*Practice Question: Bank Account Management System (with validations & updates)
You are developing a system for a bank to manage customer accounts.
Class: BankAccount

Private fields:
String accountHolderName — name of the account holder
String accountNumber — unique account number
double balance — account balance

Requirements:
Implement setter methods with this keyword and validations:
accountHolderName cannot be null or empty → print error message if invalid.
accountNumber must be exactly 10 digits (only numbers) → print error if invalid.
balance cannot be negative → print error message if invalid.
Implement getter methods to retrieve field values.

Add the following methods:
deposit(double amount) → add money to balance (amount must be positive).
withdraw(double amount) → deduct money from balance (amount must be positive and ≤ current balance).
Add a displayAccountDetails() method to print account info.

Test Class
Create three bank accounts.
Set details for each account using setters.
Print all account details.
Perform a deposit and a withdrawal on one account and print updated details.
Try giving invalid values (like negative balance, short account number, overdrawing) to test validations.*/
public class BankAccountManagementSystem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	BankAccount c1=new BankAccount();
	System.out.println("Enter Account Holder Name");
	c1.setAccountHolderName(sc.nextLine());
	System.out.println("Enter Account Number");
	c1.setAccountNumber(sc.nextLine());
	System.out.println("Enter Balance");
	c1.setBalance(sc.nextDouble());
	//----------------------------------
	System.out.println(c1.displayDetails());
}
}
class BankAccount{
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	public void setAccountHolderName(String accountHolderName) {
		if(accountHolderName !=null && !accountHolderName.trim().isEmpty()) {
		this.accountHolderName=accountHolderName.trim();
		}else {
			System.err.println("Plase Enter Correct Account Holder Name");
			System.exit(0);
		}
	}
	public void setAccountNumber(String accountNumber) {
		if(accountNumber.length()<=10 || accountNumber.matches("\\d{10}")) {
			this.accountNumber=accountNumber;
		}else {
			System.err.println("Please Enter valid account Number");
			System.exit(0);
		}
		
	}
	public void setBalance(double balance) {
		if(balance>0) {
			this.balance=balance;
		}else {
			System.err.println("Please Enter Valid Balance");
			System.exit(0);
		}	
	}
	public String displayDetails() {
		return "Account Holder Name: "+accountHolderName+
				"\nAccount Number: "+accountNumber+
				"\nBalance: "+balance;
				
	}
}
