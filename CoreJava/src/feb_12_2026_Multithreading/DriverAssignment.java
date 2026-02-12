package feb_12_2026_Multithreading;

/*b) run() method implementation for DriverAssignment class
   It should wait for 3 seconds and then print a message "Driver found and assigned!"*/

public class DriverAssignment extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Driver found and assigned!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
