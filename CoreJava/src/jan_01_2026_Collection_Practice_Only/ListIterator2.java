package dec_30_2025_Collection_Practice_Only;
/*QUESTION 7: ListIterator1 – Insert Element
-----------------------------------------
Goal:
Understand insertion during traversal.

Description:
- Create an ArrayList with values "A", "B", "C".
- Use ListIterator.
- Insert "X" immediately after "B".

What you will practice:
- add() method of ListIterator
- Position-based insertion

Test Case:
Input:  ["A", "B", "C"]
Output: ["A", "B", "X", "C"]*/
import module java.base;
public class ListIterator2 {
	void main() {
		ArrayList<String> list=new ArrayList<>();
		list.add("");
//		list.add("B");
//		list.add("C");
//		list.add("D");
		Spliterator<String> split = list.spliterator();
//		Spliterator<String> half = split.trySplit();
//		Spliterator<String> half1= split.trySplit();
		
//		half.forEachRemaining(System.out::println);
//		half1.forEachRemaining(System.out::println);
		
		boolean y = split.tryAdvance(System.out::println);
			
		System.out.println(y);
		
		
//		ListIterator<String> lit= list.listIterator();
//		while(lit.hasNext()) {
//			String value=lit.next();
//			if(value.equals("B")) {
//				lit.add("X");
//			}
//		}
//		while(lit.hasPrevious())
//		{
//			lit.previous();
////			System.out.println(lit.previous());
//		}
		
//		lit.forEachRemaining(System.out::println);
		
	}
}
