package jan_10_2026_Test_Questoin;

/*1. EmployeeListSorter

Problem Description
2) Write a java program to create an object of ArrayList<Emp> class, add five employees details(employee numbers, names & salaries)
& display employees details based on employees names in alphabetical order.
Note: Use Comparator interface or Comparable interface to sort employees names.

Examples
Example 1
Input:
101 Ravi 45000
102 Anu 30000
103 Kiran 38000
104 Bala 50000
105 Chitra 41000
Output:
Employees in Alphabetical Order of Names:
102  Anu  30000.0
104  Bala  50000.0
105  Chitra  41000.0
103  Kiran  38000.0
101  Ravi  45000.0

==================================================================
2. RemoveEvenNumbers

Problem Description
 Iterate and Remove Even Numbers from an ArrayList
Write a Java program that does the following:
•	Initializes an ArrayList<Integer> with the numbers 1 to 10.
•	Uses an Iterator to traverse the list and remove all even numbers.
•	After removal, prints the contents of the modified list.


Examples
Example 1
Input:
10
1
2
3
4
5
6
7
8
9
10
Output:
List after removing even numbers: [1, 3, 5, 7, 9]

============================================================================
3. LibraryManagement

Problem Description
Assignment :
----------------------
Develop a scenario based program by using Collections Framework for processing the Library Management System
using different available options like Display books in the Library, Issue a book, search a particular book in the library.

Create a record called Book.

Components :
 id : Integer
 title : String
 author : String



Create another BLC class Library which contains following non static 
methods :

1) Method Name     : displayAvailableBooks()
Argument           : 1 argument of type Vector<Book>
Return Type        : void
Access modifier    : public
In this method display all the available books in the Library.[See the Test cases for More Details]

2) Method Name     : issueBook()
Argument           : 2 arguments [Vector<Book>, Scanner sc]
Return Type        : void
Access modifier    : public
In this method issueBook from the Library based on the id of the Book, If Book is available (based on the id) then remove() the Book from the Library otherwise give an error message  "Book with ID 103 not Found"
[See Test cases for More details]


3) Method Name     : searchBook()
Argument           : 2 arguments [Vector<Book>, Scanner sc]
Return Type        : void
Access modifier    : public
In this method search a Book from the Library by using title OR author, If Book is available either by title OR Author then give a message "Book Found", If not available then give an error message "No matching books found."


Create an ELC class called LibraryManagement which contains main method.
Inside main method Create Vector class object to add books available in the library. [See the Test cases for Library Books] 

Inside main method display the following details as a Menu.
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :

Write Switch case with Scanner class to perform Various operation with
Library System.

Test Cases for Output :
------------------------
Test Case 1 :
-------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=102, title=Adv Java, author=Mr Robert]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :




Test Case 2 :
-------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :

Please Enter your Choice :
2

Enter keyword to search by title or author: Core Java
Found: Book[id=101, title=Core Java, author=Mr James]
Please Enter your Choice :



Test Case 3 :
-------------
3

 Enter Book id which for Book issue :102
 Issued: Book[id=102, title=Adv Java, author=Mr Robert]
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]


Test Cases 4 :
--------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :
4
Thank you for Visiting..


Test Cases for Input Validation :
---------------------------------
Test Cases 1:
-------------
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=102, title=Adv Java, author=Mr Robert]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :
2

Enter keyword to search by title or author: Python
No matching books found.
   

Test Cases 2:
-------------
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=102, title=Adv Java, author=Mr Robert]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :
3

 Enter Book id which for Book issue :109
 Please Enter your Choice :
 Book with ID 109 not found.

Note:- 
        // Add initial books
        bookList.add(new Book(101, "Core Java", "Mr James"));
        bookList.add(new Book(102, "Adv Java", "Mr Robert"));
        bookList.add(new Book(103, "Head First Java", "Miss Kathy Sierra"));
        bookList.add(new Book(104, "Programming in C ", "Mr Denis"));


Examples
Example 1
Input:
1
Output:
Available Books in the Library :
Book[id=101, title=Core Java, author=Mr James]
Book[id=102, title=Adv Java, author=Mr Robert]
Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
Book[id=104, title=Programming in C , author=Mr Denis]*/
