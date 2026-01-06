package jan_01_2026_Collection_Vector_practice_Question;
/*Question 3: Remove Elements Safely

Problem Statement:
A Vector<Integer> contains numbers.

Requirements:
Remove only odd numbers.
For removal:
Use Iterator (mandatory).
Write in comments:
What issue occurs if a normal for loop is used?

Hint: iterator.remove()*/
import module java.base;
public class RemoveElementsSafely {
	void main() {
		Vector <Integer> numbers= new Vector();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		Iterator<Integer> itr = numbers.iterator();
		while(itr.hasNext()) {
			int num=itr.next();
			
			if(num%2!=0) {
				itr.remove();
			}
		}
		//IO.print(numbers+" ");
	}
}
