package jan_22_2025_Collection_ArrayList_Program_Employee_Directory;

public class Activity {
	String name;
	String schedule;
	public Activity(String name, String schedule) {
		super();
		this.name = name;
		this.schedule = schedule;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "Activity [" + (name != null ? "name=" + name + ", " : "")
				+ (schedule != null ? "schedule=" + schedule : "") + "]";
	}
	
}
