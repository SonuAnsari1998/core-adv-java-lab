package jan_25_2026_Collection_Map_Inteface;

import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

//Find Minimus Salary Employees 
public class FindMinimusSalaryEmployees {
	public static void main(String[] args) {

		Map<String, Integer> employeeList = new LinkedHashMap();
		employeeList.put("sonu", 152200);
		employeeList.put("Rahul", 182200);
		employeeList.put("Ravi", 692200);
		employeeList.put("Vijay", 142200);

		int min = Collections.min(employeeList.values());
		for (Map.Entry<String, Integer> entry : employeeList.entrySet()) {
			if (entry.getValue() == min) {
				System.out.println("Minimus Salary Employee: " + entry.getKey() + " " + entry.getValue());
			}
		}
	}
}
