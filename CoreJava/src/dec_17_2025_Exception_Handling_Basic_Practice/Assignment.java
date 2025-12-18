package dec_17_2025_Exception_Handling_Basic_Practice;

/*
QUESTION 1: Division Operation
A program takes two integers from the user and performs division. It should handle 
division by zero using try–catch.

Test Cases:
TC1: Input: 10 2 -> Output: Result displayed
TC2: Input: 12 0 -> Output: Error message displayed
TC3: Input: 20 5 -> Output: Result displayed

--------------------------------------------------

QUESTION 2: Array Index Access
A program has an integer array of size 5. The user enters an index to access an element. Invalid index access should be handled.

Test Cases:
TC1: Input: 0 -> Output: Element printed
TC2: Input: 4 -> Output: Element printed
TC3: Input: 7 -> Output: Error message displayed
--------------------------------------------------

QUESTION 3: String to Integer Conversion
A program converts a String input into an integer. If the input is not a valid number, the exception should be handled.

Test Cases:
TC1: Input: "123" -> Output: Number printed
TC2: Input: "50" -> Output: Number printed
TC3: Input: "abc" -> Output: Error message displayed

--------------------------------------------------

QUESTION 4: Finally Block Execution
A program uses try–catch–finally. The finally block should execute whether an exception occurs or not.

Test Cases:
TC1: Exception occurs: No -> Output: Finally block executed
TC2: Exception occurs: Yes -> Output: Finally block executed

--------------------------------------------------

QUESTION 5: Multiple Catch Blocks
A program may cause division by zero or array index out-of-bounds. Both exceptions should be handled separately.

Test Cases:
TC1: Division by zero -> Output: Exception handled
TC2: Invalid array index -> Output: Exception handled

--------------------------------------------------

QUESTION 6: Generic Exception Handling
A program may throw any runtime exception. Handle it using a generic exception handler.

Test Cases:
TC1: Arithmetic error -> Output: Error handled
TC2: Array error -> Output: Error handled

--------------------------------------------------

QUESTION 7: User Input Mismatch
A program takes integer input from the user. The user enters a non-integer value. Handle the exception.

Test Cases:
TC1: Input: 10 -> Output: Value accepted
TC2: Input: "abc" -> Output: Error message displayed

--------------------------------------------------

QUESTION 8: Null Value Access
A program tries to access a method of an object that may be null. Handle the exception.

Test Cases:
TC1: Object initialized -> Output: Method executed
TC2: Object is null -> Output: Error message displayed

--------------------------------------------------

QUESTION 9: File Handling
A program tries to open a file from the system. If the file does not exist, handle the exception.

Test Cases:
TC1: File exists -> Output: File opened
TC2: File not found -> Output: Error message displayed

--------------------------------------------------

QUESTION 10: No Exception Case
A program contains a try–catch block, but no exception occurs in the try block.

Test Cases:
TC1: No error -> Output: Normal execution
TC2: No error -> Output: Catch block not executed
*/
