package jan_01_2026_Collection_Practice_Only;
import module java.base;	
/*1) By using toString() method of respective class [JDK 1.0]
2) By using Ordinary for loop [JDK 1.0]
3) By using for-each loop [JDK 1.5]
4) By using Enumeration<E> interface [JDK 1.0]
5) By using Iterator<E> interface [JDK 1.2]
6) By using ListIterator<E> interface [JDK 1.2]
7) By using Splitertor<E> interface [JDK 1.8]
8) By using forEach(Consumer<T> cons) method [JDK 1.8]
9) By using Method Reference (::) [JDK 1.8]
10) By using stream() method of Collection interface [JDK 1.8]
11) By using parallelStream() of Collection interface [JDK 1.8]*/
public class FetchORetrieveTheCollectionObject {
	void main() {
		Vector<String> listofCity = new Vector<>();
		listofCity.add("Hyderabad");
		listofCity.add("Kolkata");
		listofCity.add("Pune");
		listofCity.add("Indore");
		listofCity.add("Mumbai");
		IO.println("===============1=====================");
		IO.println("By Using toString method");
		IO.println(listofCity);
		
		
		IO.println("================2====================");
		IO.println("By Using Ordinary for loop");
		for(int i=0; i<listofCity.size(); i++) {
			IO.println(listofCity.get(i));
		}
		
		
		IO.println("================3====================");
		IO.println("By Using for-each loop");
		for(String s:listofCity) {
			IO.println(s);
		}
		
		
		IO.println("================4====================");
		IO.println("By Using Enumeration<E> interface");
		Enumeration<String> elements =listofCity.elements();
		while(elements.hasMoreElements()) {
			IO.println(elements.nextElement());
		}
		

		IO.println("================5====================");
		IO.println("By Using Iterator<E> interface ");
		Iterator<String> iterator=listofCity.iterator();
		while(iterator.hasNext()) {
			IO.println(iterator.next());
		}
		
		
		IO.println("===============6=====================");
		IO.println("By Using ListIterator<E> interface");
		ListIterator<String> listiterator=listofCity.listIterator();
		while(listiterator.hasNext()) {
			IO.println(listiterator.next()); //5
		}
		
		
		
		
		IO.println("--------------Reverse Order-----------");
		while(listiterator.hasPrevious()) {
			IO.println(listiterator.previous());
		}
		

		IO.println("================7====================");
		IO.println("By Using Splitertor<E> interface");
		Spliterator<String> spliterator = listofCity.spliterator();
		spliterator.forEachRemaining(str-> System.out.println(str));
		
		
		IO.println("================8====================");
		IO.println("By Using forEach(Consumer<T> cons) method");
		listofCity.forEach(city -> IO.println(city));
		
		
		IO.println("================9====================");
		IO.println("By Using Method Reference (::)");
		IO.println("By Using Method Reference (::)");
		listofCity.forEach(System.out::println);
		
		
		IO.println("================10====================");
		IO.println("By Using stream() method of Collection interface");
		listofCity.stream().forEach(System.out::println);
		
		
		IO.println("================11====================");
		IO.println("By Using parallelStream() of Collection interface");
		listofCity.parallelStream().forEach(System.out::println);
	}
}
