package feb_19_2026_Multithreading;

public class Restaurant {
	public String name;
	private String order;
	private boolean isOrderReady = false;

	public Restaurant(String name) {
		this.name = name;
	}
	/*In this method initialize the order through parameter variable. After
       placing the order, Waiter will Wait until chef notifies that food is ready. 
       Once waiter will get notification from chef, Waiter can serve*/
	public synchronized void placeOrder(String order) {
		this.order=order;
		if(!isOrderReady) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Waiter: Placed order for fried chicken");
		try {
			Thread.sleep(1000);
			System.out.println("Waiter: Serving the fried chicken");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	/*In this method chef will prepare the food.It will take some time 
       based on food. After food preparation, It will notify to the waiter
       so waiter can server the food.*/
	public synchronized void prepareOrder() {
		
		System.out.println("Chef: Preparing fried chicken");
		try {
			Thread.sleep(1000);
			isOrderReady=true;
			System.out.println("Chef: fried chicken is ready!");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		notify();
		
	}
	public String getRestaurantName() {
		return name;
	}
	
	

}
