package feb_12_2026_Multithreading;

/*e) run() method implementation for PaymentProcessing class :
   It should print a message "Processing payment..." Here Thread should 
   wait for 2 seconds then It should print "Payment successful!"*/

public class PaymentProcessing extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Processing payment...");
			Thread.sleep(2000);
			System.out.println("Payment successful!");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
