package jan_10_2026_Test_Questoin;

import java.util.*;


public class RemoveEvenNumbers {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		ListIterator<Integer> ltr = list.listIterator();
		while(ltr.hasNext()) {
			int num=ltr.next();
			if(num%2==0) {
				ltr.remove();
			}
		}
		IO.println("List after removing even numbers: "+list);
		
	}
}		

