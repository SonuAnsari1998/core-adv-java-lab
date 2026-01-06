package jan_01_2026_Collection_Practice_Only;
/*QUESTION 6: ListIterator – Forward and Backward Traversal
---------------------------------------------------------
Goal:
Learn bidirectional traversal.

Description:
- Create an ArrayList with values 10, 20, 30.
- Use ListIterator to print elements forward.
- Then print elements backward.

What you will practice:
- listIterator()
- hasPrevious()
- previous()

Test Case:
Forward Output:  10 20 30
Backward Output: 30 20 10*/
import module java.base;
public class ListIterator1 {
	void main() {
		ArrayList<Integer> list=new ArrayList();
		for(int i=1; i<=5; i++) {
			list.add(i);
		}
		ListIterator<Integer> le =list.listIterator();
		IO.print("Forward Output: ");
		while(le.hasNext()){
			IO.print(le.next()+" ");
		}
		IO.println();
		IO.print("Forward Output: ");
		while(le.hasPrevious()) {
			IO.print(le.previous()+" ");
		}
	}
}
