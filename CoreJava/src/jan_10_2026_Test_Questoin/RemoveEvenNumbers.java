package jan_10_2026_Test_Questoin;

/*2. RemoveEvenNumbers

Problem Description
 Iterate and Remove Even Numbers from an ArrayList
Write a Java program that does the following:
•	Initializes an ArrayList<Integer> with the numbers 1 to 10.
•	Uses an Iterator to traverse the list and remove all even numbers.
•	After removal, prints the contents of the modified list.


Examples
Example 1
Input:
10
1
2
3
4
5
6
7
8
9
10
Output:
List after removing even numbers: [1, 3, 5, 7, 9]*/
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenNumbers {
	void main() {
		ArrayList list = new ArrayList();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		Iterator<Integer> lit = list.iterator();

		while (lit.hasNext()) {
			int n=lit.next();
			if(n%2==0) {
				lit.remove();
			}
		}
		IO.println(list);
	}

}
