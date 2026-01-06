package jan_01_2026_Collection_Practice_Only;
/*QUESTION 3: Iterator – Print Numbers
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
Output: 1 2 3 4 5*/
import module java.base;
public class Iterator1 {
	void main() {
		ArrayList<Integer> list=new ArrayList();
		for(int i=0; i<=5; i++) {
			list.add(i);
		}
		Iterator<Integer> e=list.iterator();
		while(e.hasNext()) {
			IO.print(e.next()+" ");
		}
	}
}
