package dec_14_2025_Interface_Polymorphism_Loose_Coupling_Practice_Only;
/*
 
ADVANCED JAVA SCENARIO-BASED PRACTICE QUESTIONS (LEVEL HIGH)
===========================================================

QUESTION 11: Multiple Interface + Polymorphism
----------------------------------------------
Scenario:
A smart home system controls different devices.

Task:
Create interface SmartDevice with methods:
turnOn(), turnOff()

Implement:
SmartLight
SmartFan

Create a static method controlDevice(SmartDevice device)

Input:
fan

Expected Output:
Smart Fan Turned ON
Smart Fan Turned OFF

------------------------------------------------

QUESTION 12: Functional Interface + Predicate + Stream
-----------------------------------------------------
Scenario:
An HR system filters high-salary employees.

Condition:
Salary > 50000

Task:
Create Employee class
Use Predicate<Employee> with Stream filter()

Input:
Rahul 60000
Aman 45000
Neha 75000

Expected Output:
Rahul
Neha

------------------------------------------------

QUESTION 13: Custom Exception Scenario
-------------------------------------
Scenario:
Online exam system validates marks.

Condition:
Marks must be between 0 and 100

Task:
Create InvalidMarksException

Input:
120

Expected Output:
InvalidMarksException: Marks must be between 0 and 100

------------------------------------------------

QUESTION 14: BiFunction Scenario
--------------------------------
Scenario:
A billing system calculates total cost.

Task:
Use BiFunction<Integer, Integer, Integer>
(price, quantity)

Input:
Price: 200
Quantity: 5

Expected Output:
Total Cost: 1000

------------------------------------------------

QUESTION 15: Optional Class Usage
---------------------------------
Scenario:
A login system checks username availability.

Task:
Use Optional<String> to avoid NullPointerException

Input:
null

Expected Output:
Username not provided

===========================================================
END OF ADVANCED PRACTICE QUESTIONS

===========================================================================================*/
/*
JAVA SCENARIO-BASED PRACTICE QUESTIONS (WITH TEST CASES)
======================================================

QUESTION 01: Interface & Polymorphism (Loose Coupling)
----------------------------------------------------
Scenario:
A company wants to send notifications using different channels without changing main logic.

Task:
Create an interface MessageService with methods:
sendMessage() and sendSummary()

Implement two classes:
WhatsAppService
PushNotificationService

Create a static polymorphic method processMessage(MessageService ref)

Input:
whatsapp

Expected Output:
WhatsApp Message Sent
WhatsApp Summary Generated

----------------------------------------------------

QUESTION 02: Abstract Class Scenario
-----------------------------------
Scenario:
A payment system supports multiple payment modes.

Task:
Create an abstract class Payment with abstract method makePayment()
Create subclasses: CardPayment and UpiPayment

Input:
upi

Expected Output:
UPI Payment Successful

----------------------------------------------------

QUESTION 03: Function Functional Interface
-----------------------------------------
Scenario:
An online store adds tax to product price.

Task:
Create Product class (id, name, price)
Use Function<Product, Double> to add 18% tax

Input:
101 Laptop 50000

Expected Output:
Final Price: 59000.0

----------------------------------------------------

QUESTION 04: Predicate and() Scenario
------------------------------------
Scenario:
Check if a user is eligible for premium access.

Conditions:
Age >= 18
Subscription amount > 1000

Input:
Age: 20
Amount: 1500

Expected Output:
Eligible for Premium: true

----------------------------------------------------

QUESTION 05: Consumer Interface
-------------------------------
Scenario:
A logging system prints user activity.

Task:
Create User class (id, name)
Use Consumer<User> to print user details

Input:
101 Aman

Expected Output:
User ID: 101
User Name: Aman

----------------------------------------------------

QUESTION 06: Supplier Interface
-------------------------------
Scenario:
Generate OTP for login system.

Task:
Use Supplier<Integer> to generate 6-digit OTP

Input:
(no input)

Expected Output:
Generated OTP: XXXXXX

----------------------------------------------------

QUESTION 07: Stream API filter()
-------------------------------
Scenario:
Filter even numbers from list.

Input:
10 15 20 25 30

Expected Output:
Even Numbers: 10 20 30

----------------------------------------------------

QUESTION 08: Stream API map()
-----------------------------
Scenario:
Convert employee names to uppercase.

Input:
rahul aman neha

Expected Output:
RAHUL AMAN NEHA

----------------------------------------------------

QUESTION 09: Exception Handling
------------------------------
Scenario:
ATM withdrawal system.

Condition:
Balance = 5000
Withdraw amount from user

Input:
6000

Expected Output:
Insufficient Balance Exception

----------------------------------------------------

QUESTION 10: Method Reference
-----------------------------
Scenario:
Calculate square of a number.

Task:
Use Function<Integer, Integer> with method reference

Input:
5

Expected Output:
Square: 25

======================================================
END OF PRACTICE TEST
*/
