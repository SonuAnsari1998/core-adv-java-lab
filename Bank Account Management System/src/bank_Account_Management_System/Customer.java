package bank_Account_Management_System;

public class Customer {
	private long accountNumber;
	private String accountHolder;
	private String accountType;
	private double balance;

	public Customer(long accountNumber, String accountHolder, String accountType, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountType = accountType;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [accountNumber=" + accountNumber + ", "
				+ (accountHolder != null ? "accountHolder=" + accountHolder + ", " : "")
				+ (accountType != null ? "accountType=" + accountType + ", " : "") + "balance=" + balance + "]";
	}

}
