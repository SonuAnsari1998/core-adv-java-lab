package Aug_26;

import java.util.Scanner;

class Bank {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		BankAccount b1 = new BankAccount();
		
		System.out.println("Enter Account Holder Name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter Initial Balance : ");
		double balance = sc.nextDouble();
		
		System.out.println("Enter Deposite Amount: ");
		double depositeAmount = sc.nextDouble();
		
		System.out.println("Enter WithdrawAmount");
		double withdrawAmount = sc.nextDouble();
		
		b1.setInput(name, balance, depositeAmount, withdrawAmount);
		b1.display();
	}
}
