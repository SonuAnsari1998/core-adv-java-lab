package Aug_25;

class Sample {
	String name="Sonu Ansari";
	int age=25;
	
	public static void displayData() {
		Sample t1= new Sample();
		System.out.println("Name is: "+t1.name);
		System.out.println("Age is: "+t1.age);
	}
	public static void main(String[]args) {
		displayData();
	}
}
