package feb_10_2026_Stream_API;

/*Ques - 1
-----------------------
Filtering and Mapping:
Write a Java 8 stream pipeline that takes a list of integers and filters out the even numbers, then squares each remaining number, and finally prints the result.

Input:
List<Integer> numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
Output:
1
9
25
49
81

Ques - 2
-----------------------
Grouping and Counting:
Given a list of strings, group them by their lengths and count the number of strings in each group. Print out the length and count for each group.
Input:
List<String> strings = ["apple", "banana", "orange", "grape", "pear"];
Expected Output:
Length -> Count:
5 -> 2
6 -> 2
7 -> 1

Ques - 3
-------------------
Sorting:
Write a program to sort a list of strings in descending order using Java 8 streams.
Input:
List<String> strings = ["apple", "banana", "orange", "grape", "pear"];
Expected Output:
Sorted Strings in Descending Order:
pear
orange
grape
banana
apple

Ques - 4
----------------
Person Class(BLC): Represents a Person with name, age, and gender properties.
Create a ELC class Tester :
List of Persons: An ArrayList of Person objects is created with different genders(Male/Female).
Group all the Male and Female separately into a Map where Gender is the key .
Use forEach over the entries in the Map and prints each gender group along with the list of persons belonging to that gender.

Male:
Person{name= Bob, age=30, gender=Male}
Person{name= Charlie , age=20, gender=Male}
Person{name=David, age=35, gender=Male}
Person{name=Frank, age=22, gender='Male}

Female:
Person{name=Alice, age=25, gender=Female}
Person{name=Eve, age=28, gender=Female}
Person{name=Grace, age=26, gender=Female}

Ques - 5
---------------
Flattening Lists:
Given a list of lists of integers, flatten it into a single list and then remove duplicates using Java 8 streams.

Input:
List<List<Integer>> = [[1,2,3],[2,3,4,5],[4,5,6]]
Expected Output:
Flattened List without Duplicates:
1
2
3
4
5
6*/
