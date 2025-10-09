package Aug_26;

class BankAccount{
String name;
double balance;
double depositeAmount;
double withdrawAmount;
public void setInput(String name, double balance, double depositeAmount, double withdrawAmount) {
	this.name=name;
	this.balance=balance;
	this.depositeAmount=depositeAmount;
	this.withdrawAmount=withdrawAmount;
}
	
	public void display() {
	System.out.println("Account Holder : "+name);
	System.out.println("Initial Balance: "+balance);
	System.out.println("Deposited Amount: "+depositeAmount);
	System.out.println("Withdrawn: "+withdrawAmount);
	System.out.println("Final Amount: "+((balance+depositeAmount)-withdrawAmount));
	}
	
}

