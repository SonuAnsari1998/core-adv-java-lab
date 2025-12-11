package dec_11_2025_Interface;

public class CreditCardPayment implements Payment {
	@Override
	public void processPayment() {
		IO.println("Initiating Credit Card payment");
		IO.println("Processing Credit Card payment...");
	}

	@Override
	public void applyDiscount() {
		IO.println("Applying 10% discount for Credit Card payment");
	}
}
