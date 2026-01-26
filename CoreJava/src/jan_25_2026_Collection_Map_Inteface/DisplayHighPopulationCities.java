package jan_25_2026_Collection_Map_Inteface;

import jan_01_2026_Collection_Comparable_Comparator.Main;
import java.util.LinkedHashMap;
import java.util.Map;

public class DisplayHighPopulationCities {
	public static void main(String[] args) {
		Map<String, Integer> cityList = new LinkedHashMap<>();
		cityList.put("Ranchi", 18045210);
		cityList.put("Hydrabad", 45210);
		cityList.put("Mumbai", 38045210);
		cityList.put("Delhee", 45210);
		cityList.put("Pune", 28045210);

		IO.println("Cities with population greater than 10 lakh:");
		for (Map.Entry<String, Integer> entry : cityList.entrySet()) {
			if (entry.getValue() >= 1000000) {
				IO.println(entry.getKey() + " : " + entry.getValue());
			}
		}

	}
}
