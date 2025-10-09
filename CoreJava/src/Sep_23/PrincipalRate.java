package Sep_23;
/*Program-3
----------
Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and Amount.*/

public class PrincipalRate {
	public static void main(String []args) {
		
		double principelAmount=Double.parseDouble(args[0]);
		double rate=Double.parseDouble(args[1]);
		double time=Double.parseDouble(args[2]);
		
		double simpleInterest=(principelAmount*rate*time)/100;
		
		System.out.println("Simple Interest : "+simpleInterest);
		System.out.println("Amount : "+(principelAmount+simpleInterest));
	}
}
