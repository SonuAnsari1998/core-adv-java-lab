package dec_15_2025_Lambda_Expression;
/*Assignment 03 :
-------------
Develop a scenario based program by using Functional interface to check whether a customer 
is eligible for loan or not.

Create one record called Customer.
Components :
 name : String
 salary : Double
 creditScore : Integer
 age : Integer

Method :

1) Method Name     : checkLoanEligibility()
parameter          : No parameter
Return Type        : boolean
Access modifier    : public

In this method by using Predicate<Customer> verify whether a customer is eligible for
loan or not by using following criteria :

a) Customer salary should be > 25000
b) Credit Score should be > 700
c) Age must be > 21

By using Logical AND operator verify all the criteria and return true/false.


Take an ELC class LoanEligibilityWithPredicate with main method, With the help of IO
class create the input data, create the object for Customer class and verify whether the 
customer is eligible for loan or not.


Test Case 1 :
--------------
Enter Customer Name: Ravishankar
Enter Salary: 30000
Enter Credit Score: 720
Enter Age: 18
Ravishankar is NOT Eligible for Loan...

Test Case 2 :
--------------
Enter Customer Name: Ravishankar
Enter Salary: 80000
Enter Credit Score: 600
Enter Age: 24
Ravishankar is NOT Eligible for Loan...


Test Case 3 :
--------------
Enter Customer Name: Ravishankar
Enter Salary: 15000
Enter Credit Score: 780
Enter Age: 24
Ravishankar is NOT Eligible for Loan...

Test Case 4 :
-------------
Enter Customer Name: Ravishankar
Enter Salary: 70500
Enter Credit Score: 720
Enter Age: 24
Ravishankar is Eligible for Loan...*/
import java.util.function.*;

public class LoanEligibilityWithPredicate {
	void main() {
		String name = IO.readln("Enter Customer Name: ");

		System.out.print("Enter Salary: ");
		double salary = Double.parseDouble(IO.readln("Enter Salary:"));
		int creditScore = Integer.parseInt(IO.readln("Enter Credit Score: "));
		int age = Integer.parseInt(IO.readln("Enter Credit Score: "));
		Customer customer = new Customer(name, salary, creditScore, age);

		if (customer.checkLoanEligibility()) {
			System.out.println(customer.name() + " is Eligible for Loan...");
		} else {
			System.out.println(customer.name() + " is NOT Eligible for Loan...");
		}
	}
}
