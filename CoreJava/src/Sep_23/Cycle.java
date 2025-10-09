package Sep_23;
/*Program-2
----------
Rohan purchased an old cycle for Rs. 1200 and spend Rs. 250 on repairs, 
Rs. 350 in coloring and added new accessories worth Rs. 500. 
Rohan wants to make a profit of Rs. 1500 on selling the cycle. 
Find the selling price of the cycle. Write a java program to store all values and calculate and 
display the selling price.*/

public class Cycle {
	public static void main(String []args) {
		double purchasedCycle=Double.parseDouble(args[0]);
		double spend=250;
		double repairs=350;
		double coloringaCcessories=500;
		double profit=1500;
		double totalpurchasedCycle=purchasedCycle+spend+repairs+coloringaCcessories+profit;
		double withoutProfit=purchasedCycle+spend+repairs+coloringaCcessories;
	
		System.out.println("Selling Price: "+totalpurchasedCycle);
		System.out.println("Profit "+(totalpurchasedCycle-withoutProfit));
		
	}
}
