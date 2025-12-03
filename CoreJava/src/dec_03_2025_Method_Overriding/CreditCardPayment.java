package dec_03_2025_Method_Overriding;

public class CreditCardPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment");
	}
}
