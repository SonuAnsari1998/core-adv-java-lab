package Sep_23;
/*Program -6
-----------
WAP to calculate the Electricity bill on the following criteria :

For 100 unit fixed charged is = 160
For 101 - 250, 1 RS per unit
For 251 - unlimited , 1.2 RS per unit.*/

public class ElectricityBill {
	 public static void main(String[] args) {
		int unit=Integer.parseInt(args[0]);
		
		if(unit>0 && unit<=100) {
			System.out.println("Electricity Bill : 160");
		}else if(unit>100 && unit <=250) {
			double bill=unit*1;
			System.out.println("Electricity Bill : "+bill);
		}else if(unit>250) {
			double bill=unit*1.2;
			System.out.println("Electricity Bill : "+bill);
		}else {
			System.err.println("Please valid unit");	
		}
	}
}
