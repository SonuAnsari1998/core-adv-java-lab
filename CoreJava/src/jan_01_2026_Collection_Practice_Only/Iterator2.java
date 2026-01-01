package dec_30_2025_Collection_Practice_Only;
/*QUESTION 4: Iterator2 – Remove Even Numbers
------------------------------------------
Goal:
Understand safe removal of elements using Iterator.

Description:
- Create an ArrayList with numbers 1 to 10.
- Use Iterator to remove all even numbers.
- Print the final list.

What you will practice:
- Iterator remove()
- Avoiding ConcurrentModificationException

Test Case:
Input:  [1, 2, 3, 4, 5, 6]
Output: [1, 3, 5]*/
import module java.base;
public class Iterator2 {
	void main() {
		ArrayList<Integer> list = new ArrayList();
		for(int i=0; i<=10; i++) {
			list.add(i);
		}		
		Iterator<Integer> etr=list.iterator();
		while(etr.hasNext()) {
			int x= etr.next();
			if(x%2==0) {
				etr.remove();
			}
		}
		IO.println(list);
	}
}
