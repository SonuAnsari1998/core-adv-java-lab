package Sep_03;
import java.util.Scanner;
public class Restaurant {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	RestaurantBillingSystem c1=new RestaurantBillingSystem();
	System.out.println("Enter Restaurant Name:");
	c1.restaurantName=sc.nextLine();
	System.out.println("Enter Customer Name:");
	String cName=sc.nextLine();
	System.out.println("Enter Food item:");
	String fItem=sc.nextLine();
	System.out.println("Enter Quantity:");
	int qty=sc.nextInt();
	c1.setInput(cName,fItem,qty);
	c1.calculatePrice();
}

}
class RestaurantBillingSystem{
	static String restaurantName;
	String cName;
	String fItem;
	int qty;
	public void setInput(String cName,String fItem,int qty) {
		this.cName=cName;
		this.fItem=fItem;
		this.qty=qty;
	}
	public void calculatePrice() {
		double price=0;
		if(fItem.equals("Pizza")){
			price=200;
		}else if(fItem.equals("Burger")){
			price=150;
		}else if(fItem.equals("Pasta")){
			price=120;
		}else if(fItem.equals("Sandwich")){
			price=100;
		}
		double basePrice=price*qty;
		double gst=basePrice*0.05;
		double totalA=basePrice+gst;
		
		if(basePrice>500) {
			double discount=basePrice*0.10;
			System.out.println("Restaurant: "+restaurantName);
			System.out.println("Customer: "+cName);
			System.out.println("Quantity: "+qty);
			System.out.println("Base Amount: "+basePrice);
			System.out.println("GST (5%) "+gst);
			System.out.println("Discount (10%): "+discount);
			System.out.println("Final Bill: "+(basePrice-discount+gst));
		}else {
			System.out.println("Restaurant: "+restaurantName);
			System.out.println("Customer: "+cName);
			System.out.println("Quantity: "+qty);
			System.out.println("Base Amount: "+basePrice);
			System.out.println("GST (5%): "+gst);
			System.out.println("Discount (10%): 0.0");
			System.out.println("Final Bill: "+(basePrice+gst));
		}
	}	
}
