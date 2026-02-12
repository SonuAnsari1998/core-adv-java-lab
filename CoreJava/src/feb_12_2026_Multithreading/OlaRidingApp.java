package feb_12_2026_Multithreading;
/* Create an ELC class called OlaRidingApp.
 
 Inside main method Create the object for all 6 six classes using Ordinary
 Or Anonymous inner class approach :
     
  Instruction :
  
  a) start RideRequest and FareCalculation thread together
  b) call join() method on RideRequest thread
  
  Note : In the same use start() and join() to get the following output : 
       
  
  Test Cases for Output :
  ------------------------
  User requested a ride...
	Calculating estimated fare...
	Estimated fare: 135.75 RS.
	Searching for nearby drivers...
	Driver found and assigned!
	Updating ride location... 20% completed
	Updating ride location... 40% completed
	Updating ride location... 60% completed
	Updating ride location... 80% completed
	Updating ride location... 100% completed
	Ride completed!
	Processing payment...
	Payment successful!
	Requesting user rating...
	User rated the ride: 5 star*/
public class OlaRidingApp {
	public static void main(String[] args) throws InterruptedException {
		RideRequest rs= new RideRequest();
		FareCalculation fc = new FareCalculation();
		DriverAssignment da = new DriverAssignment();
		LiveTracking lt = new LiveTracking();
		PaymentProcessing pp = new PaymentProcessing();
		RatingSystem r = new RatingSystem();
		rs.start();
		
		fc.start();
		fc.join();

		da.start();
		da.join();
		
		lt.start();
		lt.join();
		
		pp.start();
		pp.join();
		
		r.start();
		
	}
}
