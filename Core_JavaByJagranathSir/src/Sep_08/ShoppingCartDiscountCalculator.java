package Sep_08;
/*Question 3: Shopping Cart Discount Calculator

Create a ShoppingCart class (BLC Class)
Attributes:
itemPrice (private, double)
quantity (private, int)
discountPercentage (private, double)

Methods:
Setters & Getters for all attributes.
calculateTotalPrice() Method:
Formula: total = itemPrice * quantity
Return Type: double

calculateDiscountedPrice() Method:
Formula: discountedPrice = total
(total * discountPercentage / 100)
Return Type: double

Tester Class:
Test Case 1:
Input: itemPrice = 500, quantity = 2, discount = 10%
Expected Output: Total Price = 1000

Test Case 2:
Input: same as above
Expected Output: Discounted Price = 900*/
import java.util.Scanner;
public class ShoppingCartDiscountCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShoppingCart c1=new ShoppingCart();
//		System.out.println("Enter Item Price");
		
		c1.setItemPrice(500);
		c1.setQuentity(2);
		c1.setDiscount(10);
		System.out.println(c1.calculateTotalPrice());
		System.out.println(c1.calculateDiscountedPrice());
		
	}
}

class ShoppingCart{
	private double itemPrice;
	private int quantity; 
	private double discountPercentage;
	
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice=itemPrice;
	}
	
	public double getQuentity() {
		return quantity;
	}
	public void setQuentity(int qty) {
		this.quantity=qty;
	}
	public double getDiscount() { 
		return discountPercentage;
	}
	public void setDiscount(double dis) {
		this.discountPercentage=dis;
	}
	public double calculateTotalPrice() {
		double total = itemPrice * quantity;
		return total;
	}
	public double calculateDiscountedPrice() {
		double  discountedPrice =calculateTotalPrice()-(calculateTotalPrice() * discountPercentage / 100);
		return discountedPrice;
	}
	
}

