package feb_19_2026_Multithreading;

public class Restaurant {
	private String name;
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
	}
	/*In this method chef will prepare the food.It will take some time 
       based on food. After food preparation, It will notify to the waiter
       so waiter can server the food.*/
	public synchronized void prepareOrder() {
		
	}
	public String getRestaurantName() {
		return name;
	}
	
	

}
