package dec_10_2025_Interface;

public class Customer {
	void main() {
		double amount = Double.parseDouble(IO.readln("Enter your total bill Amount :"));
		ShoppingCart shoppingCart = new ShoppingCart(amount);
		int choice = Integer.parseInt(IO.readln("Choose Payment Method: \n1. Credit Card \n2. Debit Card \n3. UPI \n"));
		switch (choice) {
		case 1 -> {
			String cardHolderName = IO.readln("Enter Card Holder Name");
			Payment creditCardPayment = new CreditCardPayment(cardHolderName);
			shoppingCart.checkout(creditCardPayment);
			IO.println();
			shoppingCart.cancelOrder(creditCardPayment);
		}
		case 2 -> {
			String bankName = IO.readln("Enter Card Bank Name");
			Payment debiPayment = new DebitCardPayment(bankName);
			shoppingCart.checkout(debiPayment);
			shoppingCart.cancelOrder(debiPayment);
		}
		case 3 -> {
			String upId = IO.readln("Enter UPI ID");
			Payment upPayment = new UPIPayment(upId);
			shoppingCart.checkout(upPayment);
			shoppingCart.cancelOrder(upPayment);
		}
		default -> System.err.println("Invalid Choice Please Enter Correct Choice");
		}
		;
	}
}
