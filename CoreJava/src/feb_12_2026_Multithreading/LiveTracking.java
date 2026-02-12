package feb_12_2026_Multithreading;

/*d) run() method implementation for LiveTracking class
   Here you should write the logic to update the ride location in % [See the
   output Test cases for more details]
   After that it should print a message "Ride Completed".*/

public class LiveTracking extends Thread{
	@Override
	public void run() {
		try {
			int x=20;
			for(int i=1; i<=5; i++) {
				System.out.println("Updating ride location... "+x+"% completed");
				Thread.sleep(1000);
				x+=20;
				if(x==100) {
					System.out.println("Ride Completed");
					break;
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
