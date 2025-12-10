package dec_09_2025_interface_abstract_method;

/*Assignment 01 : Test
---------------
Write a program to implement an interface Payable with method pay() using amount to pay.

Two classes Employee and Contractor implement it using anonymous inner class.

Assignment 02 :
---------------
Develop a scenario based program by using abstract class and abstract method for displaying 
different kinds of Products like Digital Product and 
Physical Product as well as discount and tax applicable on thses products

We need to develop one program on Hierarchical Inheritance, where Product is the super class and 
It has two sub classes DigitalProduct and PhysicalProduct.

Validate all the user inputs in constructor and where it is required.

Coding Requirements :
---------------------
Create one BLC class called Product.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------
name : String
price : double 
category : String

Take a parameterized constructor to initialize all the fields.

Methods :

a) Method Name     : applyDiscount()
Argument           : One argument of type double [double percentage]
Return Type        : void
Access modifier    : public and abstract


b) Method Name     : calculateTax()
Argument           : No Argument
Return Type        : double
Access modifier    : public and abstract


c) Setter and getter for price variable.

d) Generate toString() method to print Object properties. 


Create another class DigitalProduct which extends from Product class.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------------
licenseKey : String

Take a parameterized constructor to initialize all the fields.

Methods :
a) Override applyDiscount(double percentage) method
   In this method find out the discount based on the given percentage on the product price.
   Update the new price based on the given discount.
   Print both Discount and Updated Price.


b)Override calculateTax() method 
  In this method you should return 5% tax on the discounted price.

c) Generate toString() to print all the fields


Create another class PhysicalProduct which extends from Product class.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------------
shippingWeight : double

Take a parameterized constructor to initialize all the fields.

Methods :
a) Override applyDiscount(double percentage) method
   In this method find out the discount based on the given percentage on the product price.
   Update the new price based on the given discount.
   Print both Discount and Updated Price.


b)Override calculateTax() method 
  In this method you should return 8% tax on the discounted price.

c)
Method Name        : calculateShippingCost()
Argument           : No argument
Return Type        : double
Access modifier    : public 
 
In this method you need to calculate and return shipping cost of the Physical Product. The defined
 shipping cost is 5 RS per KG.

d) Generate toString() to print all the fields

Create an ELC class called ProductStore.

Inside main method display the following details as a Menu.
Select Product Type:
1. Digital Product
2. Physical Product

Write Switch case with Scanner class to select Digital OR Physical Product


Test Cases for Output :
------------------------
Test Case 1 :
-------------
Select Product Type:
1. Digital Product
2. Physical Product

Test Case 2 :
-------------
Select Product Type:
1. Digital Product
2. Physical Product
1
Enter Digital Product Name :Java E Book
Enter Product Price :1000
Enter Product Category :Electronics
Enter Product License Key :E_BOOK_001
Enter the discount % on final bill
10
Digital Product :
Product Name: Java E Book
Category: Electronics
Price RS:1000.0
License Key: E_BOOK_001
Discount applied :100.0
New Price :900.0
Tax RS : 45.0

Test Case 3 :
-------------
Select Product Type:
1. Digital Product
2. Physical Product
2
Enter Physical Product Name :Mobile
Enter Product Price :50000
Enter Product Category :Electronics
Enter Product weight :1
Enter the discount % on final bill
12
Physical Product:
Product Name: Mobile
Category: Electronics
Price RS:50000.0
Shipping Weight: 1.0 kg
Discount applied :7500.0
New Price :42500.0
Tax RS :3400.0
Shipping Cost RS :5.0

Test Cases for Input Validation :
---------------------------------
Test Case 1:
-------------
Select Product Type:
1. Digital Product
2. Physical Product
1
Enter Digital Product Name :null
Enter Product Price :12890
Enter Product Category :Electronics
Enter Product License Key :E_BUK_0001
Product name cannot be empty or null.

Test Case 2:
-------------
Select Product Type:
1. Digital Product
2. Physical Product
2
Enter Physical Product Name :Laptop
Enter Product Price :-10000
Enter Product Category :Electronics
Enter Product weight :2.9
Price cannot be negative.


Test Case 3:
-------------
Select Product Type:
1. Digital Product
2. Physical Product
1
Enter Digital Product Name :E_Java_Book
Enter Product Price :1567.90
Enter Product Category :null
Enter Product License Key :E_BUK_0001
Category cannot be empty or null.


*/