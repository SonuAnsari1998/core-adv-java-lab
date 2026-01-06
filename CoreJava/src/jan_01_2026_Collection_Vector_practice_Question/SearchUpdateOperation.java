package jan_01_2026_Collection_Vector_practice_Question;
/*01. Question 1: Basic Vector Creation & Traversal

Problem Statement:
Create a Vector<Integer>. Add user-defined values (hardcoded).

Requirements:
At least 6 integers must be added.
Traverse the Vector using 3 different methods:
for loop (index-based)
Iterator
Enumeration

Expected Output Example:
Using for loop: 10 20 30 40 50 60
Using Iterator: 10 20 30 40 50 60
Using Enumeration: 10 20 30 40 50 60*/
import module java.base;
public class SearchUpdateOperation {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		IO.println("Using for loop");
		for(Integer l:list) {
			IO.print(l+" ");
		}
		IO.println();
		IO.println("\nUsing Iterator");
		Iterator <Integer> e= list.iterator();

		while(e.hasNext()) {
			IO.print(e.next()+" ");
		}
		IO.println();
		IO.println("\nUsing Enumeration:");
		Enumeration <Integer> enu= list.elements();
		while(enu.hasMoreElements()) {
			IO.print(enu.nextElement()+" ");
		}
		
		
	}
}
