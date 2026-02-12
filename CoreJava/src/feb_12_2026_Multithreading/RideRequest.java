package feb_12_2026_Multithreading;
/*a) run() method implementation for RideRequest class :
   It should print a message "User requested a ride...". User should wait
   for 2 seconds, after that, It should print a message "Searching for nearby 
   drivers..."*/

public class RideRequest extends Thread{
	@Override
	public void run() {
		try {
				System.out.println("User requested a ride...");
				Thread.sleep(2000);
				System.out.println("Searching for nearby drivers...");	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
