package jan_19_2025_Collection;

import java.util.LinkedList;

/*SCENARIO BASED QUESTION
TOPIC: JAVA LIST INTERFACE (REAL-TIME APPLICATION)

Scenario:
You are working as a Java developer for an Online Shopping Company.
The company wants to develop a Shopping Cart module that allows users
to manage products before placing an order.

The Shopping Cart should store multiple products and must:
- Maintain the order in which products are added
- Allow duplicate products
- Support dynamic resizing
- Allow traversal, update, and removal of products

Because of these requirements, the Java List interface is chosen.

--------------------------------------------------

Product Details:
Each product contains the following information:
1. Product ID (int)
2. Product Name (String)
3. Product Price (double)
4. Product Quantity (int)

--------------------------------------------------

Requirements:

1. Create a Product class to represent product details.

2. Create a ShoppingCart class that internally uses
   a List interface to store Product objects.

3. Implement the following operations in the ShoppingCart:

   a) Add a product to the cart  
      - If the same product is added again, it should be treated
        as a separate entry (duplicates allowed).

   b) Remove a product from the cart using Product ID  
      - If the product ID does not exist, display an appropriate message.

   c) Update the quantity of a product using Product ID.

   d) Display all products in the cart in a readable format showing:
      - Product ID
      - Name
      - Price
      - Quantity
      - Total price for that product (price × quantity)

   e) Calculate the total bill amount of the cart.

--------------------------------------------------

Constraints:

1. Use only the List interface and its methods.
2. Do not use arrays for storing products.
3. Use proper iteration techniques to traverse the List.
4. The program should be menu-driven.
5. Handle invalid inputs gracefully.

--------------------------------------------------

Test Scenarios to Consider:

1. Adding multiple products to the cart.
2. Adding duplicate products.
3. Updating quantity of an existing product.
4. Removing a product that exists.
5. Trying to remove a product that does not exist.
6. Displaying the cart when it is empty.
7. Calculating total bill with multiple products.

--------------------------------------------------

Objective:

This program tests your understanding of:
- Java List interface
- ArrayList behavior
- Object storage in collections
- Real-time business logic implementation
- Iteration and modification of List elements
- Clean and maintainable Java design

TEST CASES
TOPIC: JAVA LIST INTERFACE – SHOPPING CART SYSTEM

--------------------------------------------
Test Case 1: Add Single Product
Input:
Add Product
ID = 101
Name = Laptop
Price = 55000
Quantity = 1

Expected Output:
Product added successfully
Cart contains 1 product

--------------------------------------------
Test Case 2: Add Multiple Products
Input:
Add Product
ID = 102
Name = Mouse
Price = 500
Quantity = 2

Add Product
ID = 103
Name = Keyboard
Price = 1200
Quantity = 1

Expected Output:
Products added successfully
Cart contains 3 products

--------------------------------------------
Test Case 3: Add Duplicate Product
Input:
Add Product
ID = 102
N

*/
