package oct_21;
/*Assignment 01 :
---------------
Create a class Loan (Business Logic Class)
Instance Variables:(private for all the fields)
Name     	 Type
---------	 -------
 principal      : double
 interestRate 	: double
 durationMonths	: int
 
 Create a parameterized constructor to initialilize all the fields.If any of the given input 
 (through Parameter Variables) is 0 OR -ve print an error message "Error" and terminate the program

 Generate getter for all the fields.

 Create Another ELC class CheckLoanDeatils with main method. 
 By using Scanner class pass the value to parameter variables to initialize the non static field.

 In ELC class, Print complete detials of Loan as shown in the Test cases.

 Test Case for Output :
 -----------------------
Enter Loan Amount :15000
Enter Interest Rate :8.2
Enter number of months for Loan :120
Principal: 15000.0
Interest Rate (Yearly %): 8.2
Duration (months): 120
--------------------------------------------------------------------------*/
public class Loan{
    private double principal;
	private double interestRate;
	private int durationMonths;
	public Loan(double principal, double interestRate, int durationMonths) {
		super();
		if(principal<=0 ||interestRate<=0 || durationMonths<=0) {
			System.err.println("Error");
			System.exit(0);
		}
		this.principal = principal;
		this.interestRate = interestRate;
		this.durationMonths = durationMonths;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public int getDurationMonths() {
		return durationMonths;
	}
	public void setDurationMonths(int durationMonths) {
		this.durationMonths = durationMonths;
	}
	
	
}




































