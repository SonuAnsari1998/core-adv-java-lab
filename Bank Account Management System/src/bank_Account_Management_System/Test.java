package bank_Account_Management_System;

import java.util.HashMap;
import java.util.Map;

public class Test {
	void main() {
		Map<String,String> map = new HashMap<>();
		map.put("Ravi","Ampt");
		map.put(new String("Ravi"),"Hyd");

		System.out.println(map);
	}
}
