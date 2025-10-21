package shallowAndDeepCopy;

class Employee {
	private int empId;
	private String name;
	private double salary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class EmployeeDemo{
	public static void main(String []args) {
		Employee e1= new Employee();
		e1.setSalary(55000);
		Employee e2=e1;
		e2.setSalary(10000);
		System.out.println(e1.getSalary());
		System.out.println(e2.getSalary());
		
	}
}