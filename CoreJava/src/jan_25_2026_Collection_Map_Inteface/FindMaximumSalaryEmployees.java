
package jan_25_2026_Collection_Map_Inteface;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindMaximumSalaryEmployees {

	public static void main(String[] args) {

		Map<String, Integer> empList = new LinkedHashMap<>();
		empList.put("sonu", 152200);
		empList.put("Rahul", 182200);
		empList.put("Ravi", 692200);
		empList.put("Vijay", 142200);

		int max = Collections.max(empList.values());
		for (Map.Entry<String, Integer> entry : empList.entrySet()) {
			if (entry.getValue() == max) {
				System.out.println("Max Sal : " + entry.getValue());
			}
		}
	}
}
