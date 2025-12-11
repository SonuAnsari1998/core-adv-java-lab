package dec_11_2025_Interface;

public class UPIPayment implements Payment{
	@Override
	public void processPayment() {
		IO.println("Initiating UPI payment");
		IO.println("Processing UPI payment...");
	}

	@Override
	public void applyDiscount() {
		IO.println("Applying 5% discount for UPI payment");
	}
}
