package dec_11_2025_Interface;

public class PaymentGatewayUsingInterface {
	void main() {
		String paymentType=IO.readln("Enter Payment Type [CreditCard / UPI]: ");
		PaymentGateway payment = new PaymentGateway();
		Payment p=payment.initiatePayment(paymentType);
		p.processPayment();
		p.applyDiscount();
	}
}
