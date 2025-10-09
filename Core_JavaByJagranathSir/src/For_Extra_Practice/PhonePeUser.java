package For_Extra_Practice;

/*
In the phonepe app, we can transfer money to other people's account.
Whenever money has to be transferred we need at least two different
accounts. Lets assume Account 'A' and Account 'B'.
Suppose Account 'A' has Rs. 500 and Account 'B' has Rs 2000.
We will transfer Rs.300 from Account 'A' to Account 'B'.
Note: Any transaction occurred will affect the remaining balance on
both the accounts.
*/
//In phone pe we require account
class Account {
	String upi;
	long mobileNo;
	long accNo;
	double balance;

	public void setAccountDetails(String upi, long mobileNo, long accNo, double balance) {
		this.upi = upi;
		this.mobileNo = mobileNo;
		this.accNo = accNo;
		this.balance = balance;
	} // acc = A this = B

	public void transfer(Account account, int amount) {
		if (this.balance >= amount) {
			this.balance = this.balance - amount;// B's balance deducted by amount
			account.balance = account.balance + amount;// A's balance incremented by + amount
			System.out.println("Transfer successful");
		} else {
			System.out.println("Insufficient Balance.");
		}
	}

	public void checkBalance() {
		System.out.println("Current Balance: " + this.balance);
	}
}

class PhonePeUser {
	public static void main(String[] args) {
		Account Ajay = new Account();
		Account Bhagyalaxmi = new Account();
		Ajay.setAccountDetails("9438123456@ybl", 9861234675L, 34256789110L, 500);
		Bhagyalaxmi.setAccountDetails("6812124430@ybl", 9090123467L, 76765789110L, 2000);
		Bhagyalaxmi.transfer(Ajay, 300);
		Ajay.checkBalance();
	}
}
