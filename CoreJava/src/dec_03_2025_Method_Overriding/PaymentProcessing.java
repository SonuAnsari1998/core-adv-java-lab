package dec_03_2025_Method_Overriding;

import java.util.Scanner;

public class PaymentProcessing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Payment payments = new Payment();
		CreditCardPayment credit = new CreditCardPayment();
		DebitCardPayment debit = new DebitCardPayment();
		UPIPayment upi = new UPIPayment();
		paymentGateway(payments, credit, upi);
	}

	public static void paymentGateway(Payment... payments) {
		for (Payment p : payments) {
			p.processPayment();
		}
	}
}
