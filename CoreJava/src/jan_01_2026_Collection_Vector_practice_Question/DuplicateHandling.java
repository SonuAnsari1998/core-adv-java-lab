package jan_01_2026_Collection_Vector_practice_Question;
/*Question 4: Duplicate Handling

Problem Statement:
A Vector<Integer> contains duplicate elements.

Requirements:
Remove duplicates while maintaining the original order.
Print the final vector.

Example Input:
[10, 20, 10, 30, 20, 40]

Expected Output:
[10, 20, 30, 40]*/
import module java.base;
public class DuplicateHandling {
	void main() {
		Vector <Integer> numbers= new Vector();
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);
		
		for(int i=0; i<numbers.size(); i++) {
			for(int j=i+1; j<numbers.size(); j++) {
				
			}
		}
	}
}
