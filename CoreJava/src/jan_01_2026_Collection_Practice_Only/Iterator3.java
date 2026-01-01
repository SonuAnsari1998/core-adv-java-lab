package dec_30_2025_Collection_Practice_Only;
/*QUESTION 5: Iterator – Concurrent Modification
-----------------------------------------------
Goal:
Learn what happens when collection is modified incorrectly.

Description:
- Create an ArrayList with some elements.
- Create an Iterator.
- Modify the list directly (add/remove element).
- Call next() on Iterator.

What you will practice:
- Fail-fast behavior
- ConcurrentModificationException

Test Case:
Input List: [10, 20, 30]
Operation: list.add(40)
Output: ConcurrentModificationException*/
import module java.base;
public class Iterator3 {
	void main() {
		Vector<Integer> vl  = new Vector<>();
		
		vl.add(10);
		vl.add(20);
		vl.add(30);
		vl.add(40);
		vl.add(50);
		
		System.out.println(vl);
		vl.remove(20);
		
		Iterator<Integer> itr = vl.iterator();
		while(itr.hasNext()) {
			int num = itr.next();
			if(num==30) {
			}
			System.out.println(num);
		}
	}
}
