package feb_19_2026_Multithreading_ITC;

import factoryMethod.Resturent;

/*Output Format :
----------------
Welcome to KFC Restaurant!!!
Waiter: Placed order for fried chicken
Chef: Preparing fried chicken
Chef: fried chicken is ready!
Waiter: Serving the fried chicken*/
public class RestaurantSystem {
	public static void main(String[] args) {
		System.out.println("Welcome to KFC Restaurant!!!");
		Restaurant rest = new Restaurant("KFC Resturant");
		Waiter waiter = new Waiter(rest);
		Chef ch = new Chef(rest);

		ch.start();
		waiter.start();
	}
}
