package nov_28_Method_Overloading_Senario;
/*1. Payment Processing Using Method Overloading
Easy
100 points
• 130 min suggested
Problem Description
Develop a scenario based program by using Method Overloading for processing the payment
using different available options like Cash Payment, Credit Card and Debit Card Payment.

Create one BLC class called Payment.

Write 3 overloaded methods makePayment()

1) Method Name     : makePayment()
Argument           : 1 argument of type double amount
Return Type        : void
Access modifier    : public
In this method validate the parameter variable by using one Helper method (private
method) validateAmount() to take only positive amount [Description is given below]

2) Method Name     : makePayment()
Argument           : 3 arguments [String cardHolderName, String creditCardNumber,double amount]
Return Type        : void
Access modifier    : public
In this method validate the parameter variable amount and creditCardNumber through
Helper methods, amount must be positive integer and creditCardNumber must be of
16 digits exactly.

3) Method Name     : makePayment()
Argument           : 2 arguments [String debitCardNumber, double amount]
Return Type        : void
Access modifier    : public
In this method validate the parameter variable amount and debitCardNumber though
Helper methods, amount must be positive integer and debitCardNumber must be of
16 digits exactly.

HELPER METHODS (Must be private so accessible from inside Payment class only)
[For more about helper method, read the notes, Access modifier topic, public access modifier]

1) Method Name    : validateAmount()
Argument          : 1 argument double amount
Return Type       : boolean
Access modifier   : private
In this method validate the amount, if amount is 0 or less than 0, print an error
message and return false otherwise return true.

2) Method Name  : validateCardNumber()
Argument        : 1 argument String cardNumber.
Return Type     : boolean
Access modifier : private
In this method validate the card number for its length, if length is exactly 16 digits
then return true otherwise return false.

3) Method Name  : maskCardNumber()
Argument        : 1 argument String cardNumber.
Return Type     : String
Access modifier : private
By using this method we should display only last 4 digit of card (Credit OR Debit both)
only.[See the Test cases for more details in the below of this question]

Create an ELC class called PaymentProcess.

Inside main method display the following details as a Menu.
System.out.println("Payment Menu");
System.out.println("Please select any one Payment Method from the Menu :");
System.out.println("\t\t 1) Payment by using Cash ");
System.out.println("\t\t 2) Payment by using Credit Card ");
System.out.println("\t\t 3) Payment by using Debit Card ");

Write Switch case with Scanner class to make the payment through different Options :

Sample Input Format
For Cash Payment
Choice: 1
Amount: <positive amount>

For Credit Card Payment

Choice: 2
Card Holder Name: <name>
Credit Card Number: <16-digit number>
Amount: <positive amount>

For Debit Card Payment
Choice: 3
Debit Card Number: <16-digit number>
Amount: <positive amount>

Processing payment via Credit Card...
Card Holder: <name>
Card Number: *-*-**-<last 4 digits>
Amount Paid RS :<amount>
Payment Successful!

Examples
Example 1
Input:
1
1200
Output:
Processing payment via Cash...
Amount Paid RS :12000.0
Payment Successful!*/

import java.util.Scanner;

public class PaymentProcessingUsingMethodOverloading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1 -> {
			double amount = sc.nextDouble();
			Payment p = new Payment();
			p.makePayment(amount);
		}
		case 2 -> {
			sc.nextLine();
			String cardHolderName = sc.nextLine();
			String creditCardNumber = sc.nextLine();
			double amount = sc.nextDouble();
			Payment p = new Payment();
			p.makePayment(cardHolderName, creditCardNumber, amount);
		}
		case 3 -> {
			sc.nextLine();
			String debitCardNumber = sc.nextLine();
			double amount = sc.nextDouble();
			Payment p = new Payment();
			p.makePayment(debitCardNumber, amount);
		}
		default -> {
			System.out.println("Invalid Choice");
		}
		}
		;
	}
}

class Payment {
	private boolean validateAmount(double amount) {
		if (amount > 0) {
			return true;
		} else {
			return false;
		}
	}

	private boolean validateCardNumber(String creditCardNumber) {
		if (creditCardNumber.length() == 16) {
			return true;
		} else {
			return false;
		}

	}

	private String maskCardNumber(String debitCardNumber) {
		return "****_****_****_" + debitCardNumber.substring(debitCardNumber.length() - 4);

	}

	// ------------------------------------------------------------------
	public void makePayment(double amount) {
		if (validateAmount(amount)) {
			System.out.println("Processing payment via Cash...");
			System.out.println("Amount Paid RS :" + amount);
			System.out.println("Payment Successful!");
		} else {
			System.out.println("Error: Amount must be greater than zero.");
		}
	}

	public void makePayment(String cardHolderName, String creditCardNumber, double amount) {
		if (validateCardNumber(creditCardNumber)) {
			System.out.println("Processing payment via Credit Card...");
			System.out.println("Card Holder: " + cardHolderName);
			System.out.println("Card Number: " + maskCardNumber(creditCardNumber));
			System.out.println("Amount Paid RS :" + amount);
			System.out.println("Payment Successful!");
		} else {
			System.out.println("Error: Invalid card number. It must be 16 digits.");
		}
	}

	public void makePayment(String debitCardNumber, double amount) {
		if (validateAmount(amount) && validateCardNumber(debitCardNumber)) {
			System.out.println("Processing payment via Debit Card...");
			System.out.println("Card Number: " + maskCardNumber(debitCardNumber));
			System.out.println("Amount Paid RS :" + amount);
			System.out.println("Payment Successful!");
		} else {
			System.out.println("Error: Invalid card number. It must be 16 digits.");
		}
	}
}
