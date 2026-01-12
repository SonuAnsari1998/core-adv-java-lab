package jan_12_2026_Collection_ArrayList_Scenario_Library_Management;

/*Create a Library Management project by using Collection Framework Concept to perform different types of Library Management System like add book, update quantity, delete book and search a book from library.

Coding Requirements :
---------------------

Create a BLC class called Book

Fields :[Access modifier should be private]

     title : String
     author : String
     isbn : long
     price : double
     quantity: int
     
Create a Parameterized constructor to initialize the non static fields.

Take getter and getter for all non static fields
     
Take a non static method public  String displayBook() which will print the Book details in the following format.

(title=Java, author=James, isbn=45345, price=1289.0, quantity=12)
     

Create a BLC class Library

Field : [Access modifier should be private]
books ArrayList<Book>

Take a no argument constructor to initialize current class properties.

Method :

1) Method Name     : addBook()
Parameter          : Book book
Return Type        : void
Access modifier    : public

In this addBook() method, add Book object, If it has different 
ISBN number, If ISBN number is same, It should print an error message Book with the same ISBN ..... already exists.")

Use private method to perform validation.

[ISBN stands for International Standard Book Number. It is a unique identifier for books just like roll for Student]


2) Method Name     : searchBookByISBN()
Parameter          : long isbn
Return Type        : Book
Access modifier    : private

In this private Helper Method check whether the given ISBN number and Book isbn number both are same OR not, based on the condition return Book object or null.

3) Method Name     : displayAllBooks()
Parameter          : No Parameter
Return Type        : void
Access modifier    : public

In this method, Display all the Books available in the Library. 


5) Method Name     : updateBookQuantityByISBN()
Parameter          : long isbn
Return Type        : void
Access modifier    : public
In this method update the quantity of the Book, In order to update the quantity, first verify ISBN number by using private Helper method and then update the quantity by using setter method.
If the updated quantity is 0 OR -ve . It should provide error message.


6) Method Name     : deleteBookByTitle()
Parameter          : String title
Return Type        : void
Access modifier    : public

In this method delete the Book object using title, If parameter 
variable is null OR blank, It should print error message "Book Title cannot be blank".


Create an ELC class BookLibrary with main method to test this application. Write Switch case with infinite while loop as well as Scanner class to Test the application as shown in the below Test Cases.

Test Cases for Output :
------------------------
Test Case 1 :
-------------
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 1
Enter Title: Core Java
Enter Author: James
Enter ISBN: 123456788765
Enter Price: 1289
Enter Quantity: 10
Book added successfully.
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option:    
   

Test Case 2 :
-------------
Choose an option: 2
(title=Core Java, author=James, isbn=123456788765, price=1289.0, quantity=10)
(title=Advanced Java, author=Scott, isbn=1234567812345, price=1678.0, quantity=20)
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option:


Test Case 3 :
-------------
Choose an option: 3
Enter ISBN: 123456788765
Updating quantity of book : 
Enter new Quantity: 25
Quantity updated successfully.new quantity = 25
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 

Test Case 4 :
-------------
Choose an option: 4
Enter Book Title :
Advanced Java
Advanced Java book has removed successfully...
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 

Test Case 5 :
--------------
Choose an option: 5
Exiting from the Application. Thank you!!!


Test Cases for Input Validation :
---------------------------------
Test Cases 1:
-------------
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 1
Enter Title: Core Java
Enter Author: James
Enter ISBN: 1234567123456
Enter Price: 1289
Enter Quantity: 10
Book added successfully.
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 1
Enter Title: Advanced Java
Enter Author: Scott
Enter ISBN: 1234567123456
Enter Price: 1367
Enter Quantity: 20
Book with the same ISBN 1234567123456 already exists.



Test Cases 2:
-------------
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 1
Enter Title: Core Java
Enter Author: James
Enter ISBN: 1234567123456
Enter Price: 1267
Enter Quantity: 10
Book added successfully.
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 3
Enter ISBN: 1234567
Book with ISBN 1234567 not found.



Test Cases 3:
-------------
Choose an option: 3
Enter ISBN: 1234567123456
Updating quantity of book : 
Enter new Quantity: -10
Invalid quantity.
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit.
Choose an option:   

Test Cases 4:
-------------
Choose an option: 4
Enter Book Title :
null
Book Title cannot be blank  

Test Cases 5 :
---------------
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 4
Enter Book Title :

Book Title cannot be blank
=========================================================================*/
