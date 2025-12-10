package dec_10_2025_Interface;

public sealed interface Payment permits CreditCardPayment,DebitCardPayment,UPIPayment{
	 void makePayment(double amount);
	 void makeRefund(double amount);
}
