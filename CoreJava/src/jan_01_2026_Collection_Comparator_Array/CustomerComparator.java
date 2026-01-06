package jan_01_2026_Collection_Comparator_Array;

/*Q1) Create a record called Customer, which accepts id, name and bill as a 
 * component.

Create an ELC class CustomerComparator with main method.

Create a Customer array with dynamic size and dynamic array initialization using 
Scanner class. 

Sort the Customer object based on following criteria :

  a) By using Customer id
  b) By using Customer name
  c) By using Customer bill*/
import module java.base;

public class CustomerComparator {
	void main() {
		Customer[] customer = new Customer[5];
		customer[0] = new Customer(101, "Sonu", 75000D);
		customer[1] = new Customer(102, "Ravi", 65000D);
		customer[2] = new Customer(103, "Pavan", 85000D);
		customer[3] = new Customer(104, "Raj", 35000D);
		customer[4] = new Customer(105, "Allen", 15000D);
		IO.println("a) By using Customer name");
		Comparator<Customer> cust1 = (c1, c2) -> c1.name().compareTo(c2.name());
		Arrays.sort(customer, cust1);
		for (Customer c : customer) {
			IO.println(c);
		}
		IO.println();
		IO.println("b) By using Customer id");
		Comparator<Customer> cust2 = (c1, c2) -> Integer.compare(c1.id(), c2.id());
		Arrays.sort(customer, cust2);
		for (Customer c : customer) {
			IO.println(c);
		}
		IO.println();
		IO.println("c) By using Customer bill");
		Comparator<Customer> cust3 = (c1, c2) -> c1.bill().compareTo(c2.bill());
		Arrays.sort(customer, cust3);
		for (Customer c : customer) {
			IO.println(c);
		}
	}

}
