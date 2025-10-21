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
 
 Create a parameterized constructor to initialilize all the fields.If any of the given input (through Parameter Variables) is 0 OR -ve print an error message "Error" and terminate the program

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
--------------------------------------------------------------------------
Assignment 02 :
---------------
Design an inventory system for a retail store :
  
InventoryItem Class: [BLC Class]

Create an InventoryItem class with the following 
 
Instance Variables:(private for all the fields)
------------------------------------------------
Name			dataType
---------		-----------
itemName        	String 
pricePerUnit    	double 
quantityInStock 	int 

Implement a constructor that takes parameters to initialize the attributes of the InventoryItem object. [Validation is not reqd for this program]

Provide getter and setter methods for each attribute to ensure proper encapsulation.

 Method:
-------------
MethodName  	        :calculateTotalValue()
Return Type		:double
Access Modifier 	:public

This method should calculate and return the total value of the inventory item in stock, which is the product of the price per unit and the quantity in stock.

Take a InventoryMain class (ELC Class) which is having  main method to  Create Object for inventory class and print complete details by using the method calculateTotalValue().

IF WE HAVE ANY NEW UPDATION IN STOCK LIKE ITEM PRICE OR ITEM QUANTITY THEN
CALL SETTER METHOD TO UPDATE THE NEW PRICE OR NEW QUANTITY.[See the Test
cases for more details]

If any update in stock is there then take the new price OR new quantity from user otherwise shutdown JVM using System.exit(0).

Test Cases for Output
-------------------
Test Case 01 :
--------------
Enter Item Name: Laptop
Enter Price Per Unit: 80000
Enter Quantity In Stock: 10

Inventory Item Details:
Item Name: Laptop
Price Per Unit: 80000.0
Quantity in Stock: 10
Total Inventory Value: 800000.00
Any updation in Stock Price OR Quantity :NO

Test Case 02 :
--------------
Enter Item Name: Laptop
Enter Price Per Unit: 80000
Enter Quantity In Stock: 10

Inventory Item Details:
Item Name: Laptop
Price Per Unit: 80000.0
Quantity in Stock: 10
Total Inventory Value: 800000.00
Any updation in Stock Price OR Quantity :Yes
Enter New Price Per Unit :90000
Enter New Quantity In Stock: 5

Updated Inventory Item Details:
Item Name: Laptop
Price Per Unit: 90000.0
Quantity in Stock: 5
Total Inventory Value: 450000.00*/
