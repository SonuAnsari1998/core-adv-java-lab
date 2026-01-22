package jan_22_2025_Collection_ArrayList_Program_Employee_Directory;

public class Employee {
	String name;
	String position;
	double salary;
	public Employee(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [" + (name != null ? "name=" + name + ", " : "")
				+ (position != null ? "position=" + position + ", " : "") + "salary=" + salary + "]";
	}
	
}
