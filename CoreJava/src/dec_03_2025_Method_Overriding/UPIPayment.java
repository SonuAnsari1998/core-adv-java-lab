package dec_03_2025_Method_Overriding;

public class UPIPayment extends Payment {
	@Override
	public void processPayment() {
		System.out.println("Processing UPI payment");
	}
}
