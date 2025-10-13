package bank_Application;

public class Customer {
	private static double balance = 10000;

	public void deposite(double amount) {
		
		if (amount <= 0) {
			System.err.println("Invalid Balance Please Enter Valid balance");
			System.exit(0);
		}
		balance = balance + amount;
		System.out.println("Diposite Amount is : "+amount);
		System.out.println("After Deposite Balance is: "+balance);
	}

	public void withdraw(double amount) {
		if(amount>balance) {
			System.err.println("Insufficient Balance");
			System.exit(0);
		}
		balance = balance - amount;
	}
	public double checkBalance() {
		return balance;
	}
}
