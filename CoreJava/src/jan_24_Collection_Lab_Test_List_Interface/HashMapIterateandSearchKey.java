package jan_24_Collection_Lab_Test_List_Interface;

import java.util.HashMap;
import java.util.Map;

/*1. HashMapIterateandSearchKey

Problem Description
1) Write a program to iterate keys & values of HashMap and also check given key exist or
 not? if exist then display the value of given key.


Input:
Enter key to search:
102

Output:
HashMap Elements:
Key: 101, Value: Java
Key: 102, Value: Python
Key: 103, Value: C++

Key found!
Value of key 102 is: Python*/
public class HashMapIterateandSearchKey {
	void main() {
		Map<Integer, String> list = new HashMap<>();
		list.put(101, "Java");
		list.put(102, "Pythod");
		list.put(103, "C++");

		int id = Integer.parseInt(IO.readln("Enter key to search"));
		boolean isFound = true;

		for (Map.Entry<Integer, String> entry : list.entrySet()) {
			if (entry.getKey().equals(id)) {
				IO.println("Key found!");
				IO.println("Value of key " + entry.getKey() + " is: " + entry.getValue());
				isFound = false;
			}
		}
		if (isFound) {
			IO.println("Key not found!");
		}
	}
}
