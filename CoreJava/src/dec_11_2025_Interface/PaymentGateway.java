package dec_11_2025_Interface;

public class PaymentGateway {
	public Payment initiatePayment(String paymentType) {
		
		if (paymentType.equalsIgnoreCase("creditcard")) {
			return new CreditCardPayment();
		} else if (paymentType.equalsIgnoreCase("UPI")) {
			return new UPIPayment();
		}else {
			
			System.err.println("Invalid payment type selected! ");
			System.exit(0);
			
		}
		return null;

	}
}
