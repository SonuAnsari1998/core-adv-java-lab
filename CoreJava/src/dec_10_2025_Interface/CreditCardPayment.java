package dec_10_2025_Interface;

public final class CreditCardPayment implements Payment {
	private String cardHolderName;

	public CreditCardPayment(String cardHolderName) {
		if(cardHolderName.isEmpty() || cardHolderName.isBlank()) {
			System.err.println("Card Holder Name can't be blank/Empty");
			System.exit(0);
		}
		this.cardHolderName = cardHolderName;
	}

	@Override
	public void makePayment(double amount) {
		IO.println("Paid RS :" + amount + " using Credit Card Holder : " + cardHolderName);
	}

	@Override
	public void makeRefund(double amount) {
		IO.println("Refunded RS : " + amount + " to Credit Card Holder : " + cardHolderName);
	}
}
