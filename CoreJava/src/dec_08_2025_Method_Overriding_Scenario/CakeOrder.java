package dec_08_2025_Method_Overriding_Scenario;
/*Create an ELC class CakeOrder to display cake details with price and message.

Test Cases for Output :
------------------------
A Round Vanila Cake Of 1 KG is Ready @ Rs.400.0
A Round Chocolate Cake Of 4 KG is Ready @ Rs.1600.0
A Square Pineapple Cake Of 3KG is Ready with Happy Birthday message @ Rs.1200.0*/
public class CakeOrder {
	void main() {
			OrderedCake orderedCake1=new OrderedCake();
			OrderedCake orderedCake2=new OrderedCake("Round","Chocolate",4);
			OrderedCake orderedCake3=new OrderedCake("Round","Pineapple",3,"message");
			System.out.println(orderedCake1);
			System.out.println(orderedCake2);
			System.out.println(orderedCake3);
	}
}
