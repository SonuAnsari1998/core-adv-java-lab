package dec_04_2025_Method_Overriding_Scenario_Shopping_Mall_Application;

/* Create a Shopping Mall Application project by using Method Overriding Concept to display
   and accept different kinds of discount given to their customers like PrimeCustomer and 
   VIPCustomer (No discount for General Customer)
   
   Summary :
   
   [Super class : Customer
   Subclasses (GeneralCustomer, PrimeCustomer, VIPCustomer) 
   override the calculateBill method to implement different discount rules as well as override 
   printDetails() method for printing the data]
   
   Coding Requirements :
   -----------------------
   Create a BLC class Customer
   Fields : 
   name String Protected
   total double protected

   Use a parameterized constructor to initialize  the fields, In this constructor provide
   error message, if name is null or empty (see test cases for more details)

    Methods :
    
    1) Method Name 		: calculateBill()
       Parameter   		: One Parameter of type double var args [double... prices]
       Return Type 		: double
       Access modifier		: public

       In this method using var args receive item price, Give an error message and exit, 
       if Item price is negative, Calculate the total bill by adding all the item price
       received through var args.

    2) Method Name 		: printDetails()
       Parameter   		: No parameter
       Return Type 		: void
       Access modifier		: public
       In this method print customer name, total cost and no discount for general 
       customer.     
      

   Create another BLC class GeneralCustomer which is the sub class of Customer

   Fields : No fields 

   Take a parameterized constructor to initialize super class properties.
 
    Method :
     
    1) Method Name 		: calculateBill()
       Parameter   		: One Parameter of type double var args [double... prices]
       Return Type 		: double
       Access modifier		: public       
       In this overridden method, call the super class calculateBill() method to calculate
        the price and return the total amount.
       
    Create another BLC class PrimeCustomer which is the sub class of Customer

    Fields : 
    protected double discountRate = 10.0; 
    
    Take a parameterized constructor to initialize super class properties.

     1) Method Name 		: calculateBill()
       Parameter   		: One Parameter of type double var args [double... prices]
       Return Type 		: double
       Access modifier		: public       
       In this overridden method, call the super class calculateBill() method to calculate the 
       price and return the total amount.

      2) Method Name 		: printDetails()
       Parameter   		: No parameter
       Return Type 		: void
       Access modifier		: public
       In this method give 10% discount on total bill, calculate final bill after subtracting 
       the the discount amount from the final bill. Print name, total amount, discount amount 
       and final amount.[See the Test cases]

    
    Create another BLC class VIPCustomer which is the sub class of Customer

    Fields : 
    protected double discountRate = 15.0; 
    
    Take a parameterized constructor to initialize super class properties.

    1) Method Name 		: calculateBill()
       Parameter   		: One Parameter of type double var args [double... prices]
       Return Type 		: double
       Access modifier		: public       
       In this overridden method, call the super class calculateBill() method to calculate the 
       price and return the total amount.

      2) Method Name 		: printDetails()
       Parameter   		: No parameter
       Return Type 		: void
       Access modifier		: public
       In this method give 15% discount on total bill, calculate final bill after subtracting 
       the the discount amount from the final bill. Print name, total amount, discount amount 
       and final amount.[See the Test cases]


    Create an ELC class ShoppingMall with main method to test this application. 
    
    Method :
     1) Method Name 	: generateBill()
       Argument   	: Two arguments [Customer cust, double... prices]
       Return Type 	: void
       Access modifier	: public and static 
       
       This method will receive Customer object and item price using var args and call
       appropriate object overridden method of sub classes to generate the bill.
       
       For Item price, Take an array variable to store multiple item prices.       
    
    Write Switch case with Scanner class in the main method
    to Test the application as shown in the below Test Cases.

    Test Cases for Output :
    ------------------------
    Test Case 1 :
    -------------
    Please select the Customer Type to get additional Discount :
		 1) General Customer 
		 2) Prime Customer 
		 3) VIP Customer 
		 
		System.out.println("Please enter Customer type :");
		1
		Please Enter your Name :
		Mr Ravishankar
		Enter number of Items :
		2
		Please Enter the Item Name and Price :
		1)Item Name :T-Shirt
		  Item Price :2300
		2)Item Name :Jeans
		  Item Price :4500
		Welcome to Hyderabad Mall  :
		Customer: Mr Ravishankar
		Total cost RS : 6800.0
		Discount: No discount for general customers.

    Test Case 2 :
    -------------
    Please select the Customer Type to get additional Discount :
		 1) General Customer 
		 2) Prime Customer 
		 3) VIP Customer 
		
		System.out.println("Please enter Customer type :");
		2
		Please Enter your Name :
		Mr Scott
		Enter number of Items :
		3
		Please Enter the Item Name and Price :
		1)Item Name :Mobile
		  Item Price :12890
		2)Item Name :Laptop
		  Item Price :86000
		3)Item Name :Watch
		  Item Price :2300
		Welcome to Hyderabad Mall :
		Customer: Mr Scott
		Total cost RS :101190.0
		Discount RS :10119.0
		Final amount RS :91071.0

    Test Case 3 :
    -------------
    Please select the Customer Type to get additional Discount :
		 1) General Customer 
		 2) Prime Customer 
		 3) VIP Customer 
		Please enter Customer type :
		3
		Please Enter your Name :
		Mr Alen
		Enter number of Items :
		3
		Please Enter the Item Name and Price :
		1)Item Name :Washing Machine
		  Item Price :34000
		2)Item Name :Smart TV
		  Item Price :90000
		3)Item Name :Laptop
		  Item Price :95000
		Welcome to Hyderabad Mall :
		Customer: Mr Alen
		Total cost RS :219000.0
		Discount RS :32850.0
		Final amount RS :186150.0



    Test Cases for Input Validation :
    ---------------------------------
    Test Case 1:
    -------------
    Please select the Customer Type to get additional Discount :
		 1) General Customer 
		 2) Prime Customer 
		 3) VIP Customer 
	Please enter Customer type :
	1
	Please Enter your Name :
	
	Customer name cannot be empty.

    Test Case 2:
    -------------
    Please select the Customer Type to get additional Discount :
		 1) General Customer 
		 2) Prime Customer 
		 3) VIP Customer 
	Please enter Customer type :
	2
	Please Enter your Name :
	Mr Scott
	Enter number of Items :
	1
	Please Enter the Item Name and Price :
	1)Item Name :Laptop
	  Item Price :-90000
	Welcome to Hyderabad Mall :
	Item price cannot be negative.*/
