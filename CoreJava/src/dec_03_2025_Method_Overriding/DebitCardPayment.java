package dec_03_2025_Method_Overriding;

public class DebitCardPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Processing Debit Card payment");
	}
}
