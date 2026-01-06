package jan_01_2026_Collection_Practice_Only;

/*QUESTION 1: Enumeration – Print Elements
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
Output: 10 20 30 40 50*/
import module java.base;
public class Enumeration1 {
	void main() {
		Vector<Integer> list=new Vector<>();
		for(int i=0; i<=5; i++) {
			list.add(i);
		}
		Enumeration<Integer> enumeration=list.elements();
		while(enumeration.hasMoreElements()) {
			IO.print(enumeration.nextElement()+" ");
		}
		
	}
}

