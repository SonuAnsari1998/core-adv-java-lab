package feb_12_2026_Multithreading;

/*c) run() method implementation for FareCalculation class
   It should print a message "Calculating estimated fare...", Here Thread
   should wait for 1.5 second and then it should print "Estimated fare: 135.75 RS."*/

public class FareCalculation extends Thread{
	@Override
	public void run() {
		try {
//			String from=IO.readln("From");
//			String to=IO.readln("To");
			Thread.sleep(1500);
			System.out.println("Calculating estimated fare...");
//			if()
			System.out.println("Estimated fare: 135.75 RS.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
