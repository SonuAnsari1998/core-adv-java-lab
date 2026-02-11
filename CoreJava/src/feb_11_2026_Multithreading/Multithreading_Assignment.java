package feb_11_2026_Multithreading;
/*Coding Question :
------------------
Assignment 01 :
---------------
WAP in java to print odd and even numbers from 1-100 by using extends Thread class approach :
  a) Main thread should print all the even numbers
  b) Thread-0 (Child Thread) should print all the odd numbers

  Note : First It should print all the odd numbers then only even numbers
 
Output :
---------
1 by Thread-0	3 by Thread-0	5 by Thread-0	
7 by Thread-0	9 by Thread-0	11 by Thread-0	13 by Thread-0	15 by Thread-0	
17 by Thread-0	19 by Thread-0	21 by Thread-0	23 by Thread-0	25 by Thread-0	
27 by Thread-0	29 by Thread-0	31 by Thread-0	33 by Thread-0	35 by Thread-0	
37 by Thread-0	39 by Thread-0	41 by Thread-0	43 by Thread-0	45 by Thread-0	
47 by Thread-0	49 by Thread-0	51 by Thread-0	53 by Thread-0	55 by Thread-0	
57 by Thread-0	59 by Thread-0	61 by Thread-0	63 by Thread-0	65 by Thread-0	
67 by Thread-0	69 by Thread-0	71 by Thread-0	73 by Thread-0	75 by Thread-0	
77 by Thread-0	79 by Thread-0	81 by Thread-0	83 by Thread-0	85 by Thread-0	
87 by Thread-0	89 by Thread-0	91 by Thread-0	93 by Thread-0	95 by Thread-0	
97 by Thread-0	99 by Thread-0	

=================================

2 by main	4 by main	6 by main	8 by main	10 by main	
12 by main	14 by main	16 by main	18 by main	20 by main	
22 by main	24 by main	26 by main	28 by main	30 by main	
32 by main	34 by main	36 by main	38 by main	40 by main	
42 by main	44 by main	46 by main	48 by main	50 by main	
52 by main	54 by main	56 by main	58 by main	60 by main	
62 by main	64 by main	66 by main	68 by main	70 by main	
72 by main	74 by main	76 by main	78 by main	80 by main	
82 by main	84 by main	86 by main	88 by main	90 by main	
92 by main	94 by main	96 by main	98 by main	100 by main	

Assignment 02 :
---------------
Re-Write the above program where even and odd numbers printing should be done by two 
different child threads (class name is EvenThread and OddThread, both are extending from 
Thread class). Here first of all even number should be printed then only odd numbers.
*/

