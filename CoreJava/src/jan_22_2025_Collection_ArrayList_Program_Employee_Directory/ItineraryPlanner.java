package jan_22_2025_Collection_ArrayList_Program_Employee_Directory;

import java.util.ArrayList;

public class ItineraryPlanner {
	ArrayList<Destination> destinations;

	public ItineraryPlanner() {
		this.destinations = new ArrayList<>();
	}

	public void addDistination(Destination destination) {
		destinations.add(destination);
	}

	public void viewDestination() {
		for (Destination det : destinations) {
			IO.println(det);
		}
	}

}
