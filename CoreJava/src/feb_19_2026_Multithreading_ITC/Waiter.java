package feb_19_2026_Multithreading_ITC;

public class Waiter extends Thread{
	 private Restaurant restaurant;
	 
	 public Waiter(Restaurant restaurant) {
		 this.restaurant=restaurant;
	 }
	 
	 /* 
       In this method take the order from the customer and initialize non static variable.
	  */
	 public void acceptOrder(String order) {
	 }
	 
	 /*
   2) Override the run method, inside this run method place the customer oder
      in the Restaurant for preparation.*/
	 @Override
	 public void run() {
		 restaurant.placeOrder(restaurant.name);
	 }
	 
} 
