package feb_12_2026_Multithreading;

/*f) run() method implementation for RatingSystem class :  
   It should print a message "Requesting user rating...". Here Thread should
   wait for 1 second and It should print "User rated the ride: 5 star"*/

public class RatingSystem extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Requesting user rating...");
			Thread.sleep(1000);
			System.out.println("User rated the ride: 5 star");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
