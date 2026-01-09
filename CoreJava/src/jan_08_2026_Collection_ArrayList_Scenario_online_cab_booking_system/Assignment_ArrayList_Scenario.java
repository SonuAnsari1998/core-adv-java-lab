package jan_08_2026_Collection_ArrayList_Scenario_online_cab_booking_system;


/*Assignment 01 :
----------------
Develop a scenario based program by using ArrayList class for online cab booking system.

Coding Requirements :
-----------------------
Create one record called Customer.

Add the following components in the record.
             int custId,
             String customerName,
             String pickupLocation,
             String dropLocation,
             int distance,
             String phone

Perform the Validation of each component by using compact constructor, throw IllegalArgumentException for each wrong Input.

Take another BLC class called CustomerService.

Non static field [Must be private]
customers  ArrayList<Customer>;

Take one no argument constructor to initialize the non static field using composition.

Write the following non static methods 

1) Method Name     : addCustomer()
Parameter          : 1 parameter of type Customer [Customer customer]
Return Type        : void
Access modifier    : public
In this method add the Customer object to ArrayList object.


2) Method Name     : isFirstCustomer()
Parameter          : 1 parameter of type Customer [Customer customer]
Return Type        : boolean
Access modifier    : private
In this helper method based on the Customer phone number verify whether the customer is a new customer OR pre-existing customer.


3) Method Name     : calculateBill()
Parameter          : 1 parameter of type Customer [Customer customer]
Return Type        : double
Access modifier    : public
In this method calculate the bill of the customer based on the following criteria :

       1) if the customer is new customer return 0. [Free Ride for first time]

       2) if the customer's travel distance is below or equal    
          to 4 kms then return 80 RS [Fixed bill]

       3) if the customer travel distance is above 4 kms calculate bill 80 + 6 RS per km.
		 Example: 
		     Any distance for new customer return 0;
		     distance 4KM return 80
                     distance 6KM return 80 + 2 * 6;
printBill() which should return the bill of the customer object parameter in the following format:

            output : JOHN Please pay your bill of Rs.0.0
	             SMITH Please pay your bill of Rs.180.0

	Note : 
	   Assume one customer books only one cab at a time.
	   No charge for customer booking the cab for the first time.
	   Customer's phone number is primary key to test whether a customer is new customer or old customer.
	   Distance should be treated as kilometers 				 

Create an ELC class called CabCustomerServiceTester with main method
to pass the following Test Cases.

Test Cases for Output :
------------------------
Test Case 1 :
-------------
JOHN Please pay your bill of Rs.0.0

Test Case 2 :
-------------
SMITH Please pay your bill of Rs.0.0

Test Case 3 :
-------------
JOHN Please pay your bill of Rs.140.0

Test Cases for Input Validation :
---------------------------------
Test Cases 1:
-------------
Validation Error: Customer ID must be positive.   
  
Test Cases 2:
-------------
Validation Error: Customer name cannot be null or blank.

Test Cases 3:
-------------
Validation Error: Pickup location cannot be null or blank.

Test Cases 4:
-------------
Validation Error: Drop location cannot be null or blank.

Test Cases 5:
-------------
Validation Error: Distance cannot be negative.

Test Cases 6:
-------------
Validation Error: Phone number must be 10 digits only.*/
