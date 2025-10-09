package Sep_05;

public class BankApplication {
	private int balance;

	public BankApplication(int balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankApplication [balance=" + balance + "]";
	}
	
	public static void main(String[] args) {
		BankApplication obj=new BankApplication(1000);
		System.out.println(obj);
		
		obj.balance=10000;
		System.out.println(obj);
	}

}
