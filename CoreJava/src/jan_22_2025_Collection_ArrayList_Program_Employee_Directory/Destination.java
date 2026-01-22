package jan_22_2025_Collection_ArrayList_Program_Employee_Directory;

import java.util.ArrayList;

public class Destination {
	ArrayList<Activity> activities;
	String destignationName;

	public Destination(String destignationName) {
		this.activities = new ArrayList<>();
		this.destignationName = destignationName;
	}
	public void addActivities(Activity activity) {
		activities.add(activity);
	}

	@Override
	public String toString() {
		return "Destination [" + (activities != null ? "activities=" + activities + ", " : "")
				+ (destignationName != null ? "destignationName=" + destignationName : "") + "]";
	}
	

}
