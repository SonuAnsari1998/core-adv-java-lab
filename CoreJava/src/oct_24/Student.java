package oct_24;

public class Student {

	private String name; 
	private int marks;
	public Student(String name, int marks) {
		this.name=name;
		this.marks=marks;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return this.marks;
	}
	@Override
	public String toString() {
		return "The Student " + name;
	}
	
}
