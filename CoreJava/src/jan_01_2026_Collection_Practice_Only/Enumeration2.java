package dec_30_2025_Collection_Practice_Only;
import module java.base;
/*QUESTION 2: Enumeration – Filter Strings
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
Output: Python Spring*/
public class Enumeration2 {
	void main() {
		Vector<String> courseList=new Vector<>();
		courseList.add("Java");
		courseList.add("Python");
		courseList.add("C");
		courseList.add("Spring");
		Enumeration<String> ele=courseList.elements();
		while(ele.hasMoreElements()) {
			IO.print(ele.nextElement()+" ");
		}
	}
}
