package dec_10_2025_Interface;

public class ShoppingCart {
	private double totalAmount;
	ShoppingCart(double totalAmount){
		if(totalAmount<=0) {
			System.err.println("Amount must be possitive");
			System.exit(0);
		}
		this.totalAmount=totalAmount;
	}

	public void checkout(Payment payment) {
		IO.println("Starting checkout for amount RS :" + totalAmount);
		payment.makePayment(totalAmount);
	}

	public void cancelOrder(Payment payment) {
		IO.println("Order Canceled. Initiating Refund...");
		IO.println("Cancelling order for amount RS : "+totalAmount);
		payment.makeRefund(totalAmount);
	}
}
