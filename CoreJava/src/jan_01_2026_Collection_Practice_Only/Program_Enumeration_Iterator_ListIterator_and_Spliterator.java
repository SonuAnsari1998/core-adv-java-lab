package jan_01_2026_Collection_Practice_Only;

/*
JAVA ITERATORS PRACTICE QUESTIONS (EASY TO HARD)
=============================================

This file contains 10 programming practice questions based on:
Enumeration, Iterator, ListIterator, and Spliterator.
Each question is explained in detail so that by practicing,
you can remember the interfaces and their methods naturally.

------------------------------------------------------------

QUESTION 1: Enumeration – Print Elements
----------------------------------------
Goal:
Learn how to traverse a legacy collection using Enumeration.

Description:
- Create a Vector of Integer type.
- Add 5 integer values to the Vector.
- Use Enumeration to traverse and print all elements.

What you will practice:
- Vector class
- elements()
- hasMoreElements()
- nextElement()

Test Case:
Input:  [10, 20, 30, 40, 50]
Output: 10 20 30 40 50

------------------------------------------------------------

QUESTION 2: Enumeration – Filter Strings
----------------------------------------
Goal:
Understand how to apply conditions while using Enumeration.

Description:
- Create a Vector of String type.
- Add multiple strings to it.
- Using Enumeration, print only those strings
  whose length is greater than 4.

What you will practice:
- Enumeration traversal
- if condition with nextElement()

Test Case:
Input:  ["Java", "Python", "C", "Spring"]
Output: Python Spring

------------------------------------------------------------

QUESTION 3: Iterator – Print Numbers
------------------------------------
Goal:
Learn basic usage of Iterator.

Description:
- Create an ArrayList of Integer.
- Add numbers from 1 to 5.
- Use Iterator to print all elements.

What you will practice:
- iterator()
- hasNext()
- next()

Test Case:
Input:  [1, 2, 3, 4, 5]
Output: 1 2 3 4 5

------------------------------------------------------------

QUESTION 4: Iterator2 – Remove Even Numbers
------------------------------------------
Goal:
Understand safe removal of elements using Iterator.

Description:
- Create an ArrayList with numbers 1 to 10.
- Use Iterator to remove all even numbers.
- Print the final list.

What you will practice:
- Iterator remove()
- Avoiding ConcurrentModificationException

Test Case:
Input:  [1, 2, 3, 4, 5, 6]
Output: [1, 3, 5]

------------------------------------------------------------

QUESTION 5: Iterator – Concurrent Modification
-----------------------------------------------
Goal:
Learn what happens when collection is modified incorrectly.

Description:
- Create an ArrayList with some elements.
- Create an Iterator.
- Modify the list directly (add/remove element).
- Call next() on Iterator.

What you will practice:
- Fail-fast behavior
- ConcurrentModificationException

Test Case:
Input List: [10, 20, 30]
Operation: list.add(40)
Output: ConcurrentModificationException

------------------------------------------------------------

QUESTION 6: ListIterator – Forward and Backward Traversal
---------------------------------------------------------
Goal:
Learn bidirectional traversal.

Description:
- Create an ArrayList with values 10, 20, 30.
- Use ListIterator to print elements forward.
- Then print elements backward.

What you will practice:
- listIterator()
- hasPrevious()
- previous()

Test Case:
Forward Output:  10 20 30
Backward Output: 30 20 10

------------------------------------------------------------

QUESTION 7: ListIterator1 – Insert Element
-----------------------------------------
Goal:
Understand insertion during traversal.

Description:
- Create an ArrayList with values "A", "B", "C".
- Use ListIterator.
- Insert "X" immediately after "B".

What you will practice:
- add() method of ListIterator
- Position-based insertion

Test Case:
Input:  ["A", "B", "C"]
Output: ["A", "B", "X", "C"]

------------------------------------------------------------

QUESTION 8: ListIterator – Replace Element
------------------------------------------
Goal:
Learn how to update elements during iteration.

Description:
- Create an ArrayList with values 5, 10, 15.
- Use ListIterator.
- Replace 10 with 100.

What you will practice:
- set() method
- Conditional replacement

Test Case:
Input:  [5, 10, 15]
Output: [5, 100, 15]

------------------------------------------------------------

QUESTION 9: Spliterator – Print Elements
----------------------------------------
Goal:
Learn basic Spliterator usage.

Description:
- Create an ArrayList with values 1 to 6.
- Obtain a Spliterator.
- Print all elements.

What you will practice:
- spliterator()
- tryAdvance() or forEachRemaining()

Test Case:
Input:  [1, 2, 3, 4, 5, 6]
Output: 1 2 3 4 5 6

------------------------------------------------------------

QUESTION 10: Spliterator – trySplit
-----------------------------------
Goal:
Understand splitting for parallel processing.

Description:
- Create an ArrayList with values 1 to 8.
- Get a Spliterator.
- Split it using trySplit().
- Print elements from both Spliterators.

What you will practice:
- trySplit()
- Understanding work division

Test Case:
Spliterator 1 Output: 1 2 3 4
Spliterator 2 Output: 5 6 7 8

*/
