package gym_membership_application_method_overriding;

/*GYM MEMBERSHIP APPLICATION – FULL PROJECT QUESTION
GYM MEMBERSHIP_APPLICATION_Method_Overriding
gym_membership_application_method_overriding
Create a Gym Membership Application project using Method Overriding to
apply different discounts based on membership types such as ProMember
and EliteMember (No discount for BasicMember).

Summary :

Super class : Member Subclasses : BasicMember, ProMember, EliteMember
Override the calculateBill() method to apply different discount rules
and also override printDetails() to print member billing details.


  ---------------------
  Coding Requirements
  ---------------------

Create a BLC class Member

Fields : - name : String (protected) - total : double (protected)

Constructor : - Parameterized constructor to initialize fields. - If
name is null or empty → Print: “Member name cannot be empty.”

Methods :

1)  Method Name : calculateBill() Parameter : double var-args [double…
    services] Return Type : double Access : public

    -   Receive service charges using var-args
    -   If any price is negative → print “Service price cannot be
        negative.”
    -   Add all service prices and store in total
    -   Return total

2)  Method Name : printDetails() Parameter : none Return Type : void
    Access : public

    -   Print member name, total amount
    -   Print “No discount for basic members.”

  ----------------------------------------
  BasicMember Class (Subclass of Member)
  ----------------------------------------

Fields : None

Constructor : Call super(name)

Methods :

1)  calculateBill()
    -   Override this method
    -   Call super.calculateBill()
    -   Return total

  --------------------------------------
  ProMember Class (Subclass of Member)
  --------------------------------------

Fields : protected double discountRate = 10.0;

Constructor : Call super(name)

Methods :

1)  calculateBill()
    -   Override
    -   Call super.calculateBill()
2)  printDetails()
    -   Override
    -   Apply 10% discount
    -   Print name, total amount, discount amount, final amount

  ----------------------------------------
  EliteMember Class (Subclass of Member)
  ----------------------------------------

Fields : protected double discountRate = 20.0;

Constructor : Call super(name)

Methods :

1)  calculateBill()
    -   Override
    -   Call super.calculateBill()
2)  printDetails()
    -   Override
    -   Apply 20% discount
    -   Print name, total amount, discount amount, final amount

  ---------------------------
  ELC Class : GymManagement
  ---------------------------

Method : 1) generateBill() Arguments : Member m, double… services Return
type : void Access : public static

-   Receive Member object and service prices
-   Call overridden calculateBill()
-   Then call printDetails()

Main Method : - Use Scanner to take input - Use switch-case for
selecting membership type: 1) Basic Member 2) Pro Member 3) Elite Member

-   Ask for member name
-   Ask number of services
-   Ask service name and price
-   Store prices in array
-   Call generateBill()

  -----------------------
  TEST CASES FOR OUTPUT
  -----------------------

Test Case 1 : Basic Member (No Discount)

Select Membership : 1 Name : Rahul

Services: 1) Cardio → 800 2) Weight Training → 1200

Output : Member: Rahul Total Amount: 2000.0 No discount for basic
members.

------------------------------------------------------------------------

Test Case 2 : Pro Member (10% Discount)

Select Membership : 2 Name : John

Services: 1) Personal Trainer → 2000 2) Zumba → 1500 3) Sauna → 1200

Output : Member: John Total Amount: 4700.0 Discount: 470.0 Final Amount:
4230.0

------------------------------------------------------------------------

Test Case 3 : Elite Member (20% Discount)

Select Membership : 3 Name : Michael

Services: 1) Yoga → 2000 2) Swimming → 4000 3) CrossFit → 6000

Output : Member: Michael Total Amount: 12000.0 Discount: 2400.0 Final
Amount: 9600.0

  ---------------------------------
  TEST CASES FOR INPUT VALIDATION
  ---------------------------------

Test Case 1 : Empty Name

Select Membership : 1 Enter Name :

Output : Member name cannot be empty.

------------------------------------------------------------------------

Test Case 2 : Negative Service Price

Select Membership : 2 Name : John

Service Price : -500

Output : Service price cannot be negative.
*/

