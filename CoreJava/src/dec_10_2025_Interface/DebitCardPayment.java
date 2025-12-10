package dec_10_2025_Interface;

public final class DebitCardPayment implements Payment {
	private String bankName;

	DebitCardPayment(String bankName) {
		if(bankName.isEmpty() || bankName.isBlank()) {
			System.err.println("Card Bank Name can't be blank/Empty");
			System.exit(0);
		}
		this.bankName = bankName;
	}

	@Override
	public void makePayment(double amount) {
		IO.println("Paid RS : " + amount + " using Debit Card Bank: " + bankName);
	}

	@Override
	public void makeRefund(double amount) {
		IO.println("Refunded RS : " + amount + " to Debit Card Bank: " + bankName);
	}
}
