package oct_31_Array;

/*
1. SearchElement
 * Search for a given Element in an Array if present then print
"Element found at index : ", if not present print "Element not found"
    
Input as: 1 4 3 5 2 6 5
Enter searching element: 5
Output: Element found at index 3

Input as: 1 4 3 5 2 6
Enter searching element: 7
Output: Element not found


Enter number of elements: 7
Enter 7 elements:
1
4
3
5
2
6
5

Enter the element to search: 5
Element found at index: 3

Test Case 1:-
7  //-> Array Size
1
4
3
5
2
6
5
5  //->element to search: 5

Expected Output :-

Element found at index: 3

Input:
7
1
4
3
5
2
6
5
5
Output:
Element found at index: 3
=================================================================================================
2. SortArray
Write a java program to sort the given array in ascending and descending order.[use switch case].
Example  :

CHOICE 1 : ASCENDING ORDER
input    : [3,5,6,1,9]
output   : [1,3,5,6,9]

CHOICE 2 : DESCENDING ORDER
input    : [3,5,6,1,9]
output   : [9,6,5,3,1]

Testcase 1:-
Enter number of elements: 5
Enter 5 integers:
2
5
4
8
6
Enter your choice:
1. Ascending Order
2. Descending Order
1

Expected Output:-

Sorted in Ascending Order: [2, 4, 5, 6, 8]

------------
Testcase 2:-

Enter number of elements: Enter 5 integers:
2
5
4
8
6
Enter your choice:
1. Ascending Order
2. Descending Order
2

Expected Output:-
---------------
Sorted in Descending Order: [8, 6, 5, 4, 2]
--------------------------------------

Examples
Example 1
Input:
5
2
5
4
8
6
1
Output:
Sorted in Ascending Order: [2, 4, 5, 6, 8]
=================================================================================================
3. SortObjectsInAscending
Write a java program to sort Employee objects by empName in ascending order.
-> create Employee class
   - fields : id,name,salary
   - parameterized constructor
   - toString()
-> create main() method 
   - create 3 Employee object and store in Employee type array and sort using Arrays.sort() method and print.
-> NOTE: import packages properly.

Sample Output :
--------------
Employees sorted by name (ascending):
Employee [ID=101, Name=Amit, Salary=60000.0]
Employee [ID=102, Name=Kiran, Salary=55000.0]
Employee [ID=103, Name=Ravi, Salary=50000.0]

Examples
Example 1
Input:
Employee 1: ID = 103, Name = Ravi, Salary = 50000.0  
Employee 2: ID = 101, Name = Amit, Salary = 60000.0  
Employee 3: ID = 102, Name = Kiran, Salary = 55000.0
Output:
Employees sorted by name (ascending):
Employee [ID=101, Name=Amit, Salary=60000.0]
Employee [ID=102, Name=Kiran, Salary=55000.0]
Employee [ID=103, Name=Ravi, Salary=50000.0]
=================================================================================================
4. FindMaximumAndMinimumElement
Write a Java program to find and print the maximum and minimum elements from an integer array.
Example :
input   : [5,3,1,3,9,7,6]

output :
MIN = 1 
MAX = 9

Testcase 1:-
Enter number of elements: 5
Enter 5 integers:
1
2
3
4
5

Expected Output:-

MIN = 1
MAX = 5

Examples
Example 1
Input:
5
1
2
3
4
5
Output:
MIN = 1
MAX = 5
=================================================================================================
5. MergeTwoArrays
Write a Java program to merge two integer arrays into a single new array. 
The merged array should contain all elements of the first array followed by all elements of the second array.

Example1 :
input :  
[1,2,3,4,5]
[6,7,8,9,10]

output : 
[1,2,3,4,5,6,7,8,9,10]


Example2 :
input :  
[1,2]
[10,20,30]

output : 
[1,2,10,20,30]

Testcase 1:-

Enter number of elements in first array: 3
Enter 3 elements of first array:
1
2
3
Enter number of elements in second array: 4
Enter 4 elements of second array:
4
5
6
7


Expected output:-
-----------------
Merged Array: [1, 2, 3, 4, 5, 6, 7]

-----------------
Testcase 2:-

Enter number of elements in first array: 2
Enter 2 elements of first array:
4
5
Enter number of elements in second array: 3
Enter 3 elements of second array:
1
2
3

Expected output:-
----------------
Merged Array: [4, 5, 1, 2, 3]

Examples
Example 1
Input:
3
1
2
3
4
4
5
6
7
Output:
Merged Array: [1, 2, 3, 4, 5, 6, 7]
=================================================================================================
6. PrintElementPresentOnEvenIndex
Write a Java program to print all the elements of an array that are located at even index positions (i.e., index 0, 2, 4, ...).
Example :
input   : [1,2,3,4,5,6]
output :  1 3 5 

Testcase 1:-
Enter number of elements: 6
Enter 6 integers:
1
2
3
4
5
6

Expected Output :-

Elements at even index positions:
1 3 5 

Examples
Example 1
Input:
6
1
2
3
4
5
6
Output:
Elements at even index positions:
1 3 5
=================================================================================================
*/
