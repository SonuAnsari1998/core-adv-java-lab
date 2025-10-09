package Encap_get_set_methods;

public class EncapClass {
	
	public static void main(String[] args) {
		Student s = new Student();
	
		s.setId(12);
		s.setName("Ravi");
		System.out.println(s.getId()+" "+s.getName());
	}
	
	

}
//Encapsution
class Student{
	private int id;
	private String name;
	//setters
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	//getters
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	
}