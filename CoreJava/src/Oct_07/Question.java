package Oct_07;
//chnange now
/*Instruction : BLC and ELC classes should be in two different package. Both classes BLC and ELC must be public.


Assignment - 01
================
Sum Of Digits program : 
 
Name of the BLC class : TwoDigitsSum [Inside blc package]
       Name of method : getSumOfDigits()
      Access Modifier : public, static
            Parameter : one parameter of type integer
          Return type : an integer value
For example :
If the given value is 34, return 7

Create an ELC class called SumOfTwoDigits with main method to test the application. Here take the digit input from the Scanner class.
---------------------------------------------------------------------------
Assignment - 02
================
Calculator Program :
 
Name of the BLC class : Calculator

       Name of method : add()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : an integer value 
After calculation return the addition of two numbers.

       Name of method : sub()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : an integer value 
After calculation return the subtraction of two numbers.

       Name of method : mul()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : an integer value 
After calculation return the multiplication of two numbers.

       Name of method : div()
      Access Modifier : public, static
            Parameter : two parameters of type integer
          Return type : a double value 
After calculation return the division of two numbers.

Create an ELC class called ArithmeticCalculator with main method to test the application. Here take two inputs from the Scanner class to perform add, sub, mul and div.
---------------------------------------------------------------------------
Assignment - 03
================
Student Grade System :

Name of the BLC class : Student

       Name of method : calculateGrade()
      Access Modifier : public, static
            Parameter : one parameters of type double (double marks)
          Return type : String value (return grade of the Student) 
After calculation return the student grade using following criteria :

	if marks >= 90 return A+
	if marks >= 75 return A
	if marks >= 60 return B
	if marks >= 40 return C
	else return "Fail";

Create an ELC class called GradeCalculator with main method to test the application. Here take student marks as an input from the Scanner class.
---------------------------------------------------------------------------
Assignment - 04
================
Shopping Discount Program :

Name of the BLC class : Discount

       Name of method : calculateDiscount()
      Access Modifier : public, static
            Parameter : one parameters of type double (double billAmount)
          Return type : double value (return final bill amount after discount) 

After calculation return the final bill amount after discount using following criteria :

	if billAmount >= 5000 -> 20% discount on billAmount
	if billAmount >= 3000 -> 15% discount on billAmount
	if billAmount >= 1000 -> 10% discount on billAmount
        else 5% discount 

Create an ELC class called ShoppingCart with main method to test the application. Here take Customer name and Customer bill as an input from the Scanner class.

Sample Output :
----------------
Enter Customer Name: Ravi
Enter Total Bill Amount: 3500

------ BILL SUMMARY ------
Customer Name: Ravi
Original Bill: 3500.0
Amount Payable after Discount: 2975.0
--------------------------------------
---------------------------------------------------------------------------
Assignment - 05
================
Hotel Booking System :

Name of the BLC class : Hotel

       Name of method : calculateTotalAmount()
      Access Modifier : public, static
            Parameter : two parameters (double roomRate, int days)
          Return type : double value (return final bill amount after discount) 

In this method calculate total room rent (roomRate * days)

Now write another method to get the discount based on number of days :
       Name of method : calculateDiscountedAmount()
      Access Modifier : public, static
            Parameter : two parameters (int days, double totalAmount)
          Return type : double value (return final hotel bill amount after discount) 
The discount on the bill depends upon number of days by using following 
criteria :
Days Stayed	Discount %
1–2		0%
3–4		5%
5–9		10%
10 or more	20%


Create an ELC class called HotelBookingApp with main method to test the application. Here take Customer name, Hotel name, Room rate per day, Number of days stayed from Scanner class.

Sample Output :
---------------
Enter Customer Name: Ravishankar
Enter Hotel Name: Hyderabad Palace
Enter Room Rate per Day: 2000
Enter Number of Days Stayed: 6

----- HOTEL BOOKING SUMMARY ----- 
Customer Name     : Ravishankar
Hotel Name        : Hyderabad Palace
Room Rate (per day): ₹2000.0
Days Stayed       : 6
Total Amount      : ₹12000.0
Amount after Discount: ₹10800.0
----------------------------------------*/
