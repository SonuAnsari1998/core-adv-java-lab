package dec_10_2025_Interface;

/*Assignment 01 :
----------------
Develop a scenario based program by using interface for processing the payment 
using different available options like Credit Card and Debit Card and UPI Payment. Provide 
loose coupling through interface.
 
Create a sealed interface called Payment.
An end user can make a payment through CreditCard OR DebitCard OR UPI. No other payment mode is 
allowed.

Methods of Payment interface :
------------------------------
 void makePayment(double amount);
 void makeRefund(double amount);
 
Create a BLC class called CreditCardPayment which implements from Payment interface.

Fields :
cardHolderName : String private

Use a parameterized constructor to initialize the field.

Override all the abstract methods from Payment interface to write the business logic.



Create another BLC class called DebitCardPayment which implements from Payment interface.

Fields :
bankName : String private

Use a parameterized constructor to initialize the field.

Override all the abstract methods from Payment interface to write the business logic.



Create another BLC class called UPIPayment which implements from Payment interface.

Fields :
upiId : String private

Use a parameterized constructor to initialize the field.

Override all the abstract methods from Payment interface to write the business logic.



Create another BLC class ShoppingCart which provides loose coupling.

Fields :
totalAmount : double private [The total bill amount we need to pay]

Use parameterized constructor to initialize the field.

Methods :
---------    
    1) Method Name 		: checkout()
       Argument   		: One argument of type Payment
       Return Type 		: void
       Access modifier		: public
       In this method write a logic to make payment using dynamic polymorphism

   2) Method Name 		: cancelOrder()
       Argument   		: One argument of type Payment
       Return Type 		: void
       Access modifier		: public
       In this method write a logic to initiate the refund process using dynamic polymorphism



Create an ELC class Customer with main method to test this application. Write 
Switch case with Scanner class to test the working of this application as shown in the below 
Test Cases.
       
    Test Cases for Output :
    ------------------------
   
Test Case 1 :
-------------
Enter your total bill Amount :
7000
Choose Payment Method:
1. Credit Card
2. Debit Card
3. UPI
1
Starting checkout for amount RS :7000.0
Paid RS :7000.0 using Credit Card Holder : MR. Ravi

Order Canceled. Initiating Refund...
Cancelling order for amount RS :7000.0
Refunded RS :7000.0 to Credit Card Holder : MR. Ravi

Test Case 2 :
-------------
Enter your total bill Amount :
9000
Choose Payment Method:
1. Credit Card
2. Debit Card
3. UPI
2
Starting checkout for amount RS :9000.0
Paid RS :9000.0 using Debit Card Bank: State Bank of India

Order Canceled. Initiating Refund...
Cancelling order for amount RS :9000.0
Refunded RS :9000.0 to Debit Card Bank: State Bank of India


Test Case 3 :
-------------
Enter your total bill Amount :
12000
Choose Payment Method:
1. Credit Card
2. Debit Card
3. UPI
3
Starting checkout for amount RS :12000.0
Paid RS 12000.0 using UPI ID : reach_scott@upi

Order Canceled. Initiating Refund...
Cancelling order for amount RS :12000.0
Refunded RS 12000.0 to UPI ID : reach_scott@upi
*/
