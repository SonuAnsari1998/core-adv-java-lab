package dec_10_2025_Interface;

public final class UPIPayment implements Payment {
	private String upiId;

	public UPIPayment(String upiId) {
		if(upiId.isEmpty() || upiId.isBlank()) {
			System.err.println("UPI ID can't be blank/Empty");
			System.exit(0);
		}
		this.upiId = upiId;
	}

	@Override
	public void makePayment(double amount) {
		IO.println("Paid RS " + amount + " using UPI ID : " + upiId);
	}

	@Override
	public void makeRefund(double amount) {
		IO.println("Refunded RS " + amount + " to UPI ID : " + upiId);
	}
}
