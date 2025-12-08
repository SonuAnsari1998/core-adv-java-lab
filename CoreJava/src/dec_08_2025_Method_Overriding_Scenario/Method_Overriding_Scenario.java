package dec_08_2025_Method_Overriding_Scenario;

/*Assignment 01:
--------------
Create a program on abstract class to display Cake details with message and without
event message.

Coding Requirements :
--------------------
Create a BLC class called Cake with following attributes :

Attributes/Properties/Fields: [Access modifier is private for all the fields]

Attribute Name : shape String
Attribute Name :flavor String
Attribute Name :quantity int
public static double price = 400;

Create a Parameterized Constructor to initialize only shape, flavor and quantity.
[Don't initialize price through Constructor, Manual Initialization]

Methods :
  1) Define setters and getters for all non static fields
  2) Name of the method : toString()
     Return Type : String
     Modifier : public.
     Task : It must return the data as per below format/example.
     "A Round Chocolate Cake Of 4 KG is Ready @ Rs.1600.0"
     
Create an inherited class "OrderedCake". Inherit this from "Cake"
Define the following Attributes
Attributes: [private for all the fields]
Attribute name : message String

Constructors:(3 only)
   1) No argument Constructor : Ensure shape is Round, flavour is Vanilla,
      qty is 1 kg and price is 400. [see the output test cases]
   2) Parameterized public Constructor : For shape,flavor,quantity
   3) Parameterized public Constructor : For shape,flavor,quantity and message.
   Price is to be dynamically changed @400 per Kg.
Methods :
Name of the method : toString()
     Return Type : String
     Modifier : public.
     Task :Print the following if message is not null 
    "A Square Pineapple Cake of 3KG is Ready with Happy Birthday message @ Rs.1200.0".
      Otherwise display the message from superclass.
      
      
Create an ELC class CakeOrder to display cake details with price and message.

Test Cases for Output :
------------------------
A Round Vanila Cake Of 1 KG is Ready @ Rs.400.0
A Round Chocolate Cake Of 4 KG is Ready @ Rs.1600.0
A Square Pineapple Cake Of 3KG is Ready with Happy Birthday message @ Rs.1200.0

==========================================================================================*/
