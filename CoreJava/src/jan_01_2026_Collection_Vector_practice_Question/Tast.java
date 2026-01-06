package jan_01_2026_Collection_Vector_practice_Question;

/*



🔹 

🔹 

🔹 Question 5: Sorting & Reversing

Problem Statement:
Create a Vector<String> with random names.

Requirements:

Sort the vector in ascending order.

Print the sorted vector in descending order
(without modifying the original vector).

Hint: Collections.sort(), Collections.reverse()

🔹 Question 6: Thread Safety Experiment (Important)

Problem Statement:
Verify that Vector is thread-safe.

Requirements:

Create a shared Vector<Integer>.

Create two threads:

Thread-1 → adds elements

Thread-2 → reads elements

Run the program and observe:

Does ConcurrentModificationException occur or not?

Writing the observation is mandatory.

🔹 Question 7: Iterator vs ListIterator

Problem Statement:
Create a Vector<Integer>.

Requirements:

Using Iterator:

Perform only forward traversal.

Using ListIterator:

Perform both forward and backward traversal.

Write the difference in comments.

🔹 Question 8: Capacity vs Size (Tricky)

Problem Statement:
Create an empty Vector<Integer>.

Requirements:

Print the initial capacity.

Add 15 elements.

After every 5 elements, print:

size()

capacity()

Expected Learning:
Understand how Vector capacity grows.

🔹 Question 9: Fail-Fast vs Fail-Safe

Problem Statement:
Store elements in a Vector<Integer>.

Requirements:

While traversing using an Iterator:

Add a new element to the vector.

Print the exception name.

Explain in comments why it occurred.

🔹 Question 10: Mini Logical Challenge (Advanced)

Problem Statement:
A Vector<Integer> is given.

Requirements:

Store only those elements in a new Vector:

Which are prime numbers

And are present at an even index

Example Input:

[2, 3, 5, 8, 11, 14, 17]


Expected Output:

[2, 5, 11]*/
