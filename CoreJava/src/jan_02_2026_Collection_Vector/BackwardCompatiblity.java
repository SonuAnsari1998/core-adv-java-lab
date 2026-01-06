package jan_02_2026_Collection_Vector;

import module java.base;

public class BackwardCompatiblity {
	public static void main(String[] args) {
		Vector<Product> listOfProduct = new Vector<>();
		listOfProduct.add(new Product(111, "Laptop"));
		listOfProduct.add(new Product(222, "Mobile"));
		listOfProduct.add(new Product(333, "Camera"));
		listOfProduct.add(new Product(444, "Bag"));
		listOfProduct.add(new Product(555, "Watch"));
		listOfProduct.addElement(new Product(666, "Phone"));
		System.out.println("Element at 0 index: " + listOfProduct.elementAt(0));
		// Backward Compatibility
		Enumeration<Product> element = listOfProduct.elements();
		Iterator<Product> itr = element.asIterator();
		itr.forEachRemaining(System.out::println);
	}
}
