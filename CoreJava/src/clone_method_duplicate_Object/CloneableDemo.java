package clone_method_duplicate_Object;

public class CloneableDemo {
	void main() {
		try {
			Product p1 = new Product(111, "Camera");
			Product p2 = (Product) p1.clone();
			IO.println("Before Change :");
			IO.println(p1 + " : " + p2);
			IO.println("After change :");
			p1.setId(222);
			p1.setName("Laptop");
			IO.println(p1 + " : " + p2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}