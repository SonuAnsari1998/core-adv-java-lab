package Sep_22;

/*Program 01:
-----------
Write a  program in Java that will generate and print the bill at Dominos for four chicken rolls 
(@ Rs 60 per chicken rolls) and
 three vegetable puffs (@ Rs 25 per vegetable puffs). 
There is a special discount of Rs 50 on the final bill amount. 
Calculate and print final bill as well as all item bill.*/

public class Dominos{
public static void main(String []args){
double perChicketRoll=60;
double perVegetablePuffs=25;

double totalBillChickenRoll=perChicketRoll*4;
double totalBillVegetablePuffs=perVegetablePuffs*3;

double discount=50;

System.out.println("----------Dominos Bill-----------");
System.out.println("Item Name: Chicken Roll");
System.out.println("Item Quentity: 4");
System.out.println("Per Chicken Roll Price"+perChicketRoll);
System.out.println("Total Bill: "+totalBillChickenRoll);
System.out.println("Discount: "+discount);
System.out.println("After Discount Final Bill is "+(totalBillChickenRoll-discount));
System.out.println("------------------------------------------------------------------");
System.out.println();
System.out.println("Item Name: Vegetable Puffs");
System.out.println("Item Quentity: 3");
System.out.println("Per Vegetable Puffs Price"+perVegetablePuffs);
System.out.println("Total Bill: "+totalBillVegetablePuffs);
System.out.println("Discount: "+discount);
System.out.println("After Discount Final Bill is "+(totalBillVegetablePuffs-discount));
System.out.println("----------Thank you--------");
}
}