package jan_08_2026_Collection_ArrayList_Scenario_online_cab_booking_system;

import module java.base;

public class CabCustomerServiceTester {
	void main() {
		CustomerService service=new CustomerService();
		try {
			Customer c1 = new Customer(1, "JOHN", "Ameerpet", "Madhapur", 2, "9876543210");
			service.addCustomer(c1);
			service.printBill(c1);
			Customer c2 = new Customer(1, "Smith", "S.R Nagar", "Ammerpt", 6, "9876543210");
			service.addCustomer(c2);
			service.printBill(c2);
			Customer c3 = new Customer(1, "Allen", "Charllapali", "Madhapur", 20, "9876543210");
			service.addCustomer(c3);
			service.printBill(c3);
			Customer c4 = new Customer(1, "Karan", "D mart", "ameerpet", 5, "9876543210");
			service.addCustomer(c4);
			service.printBill(c4);
			Customer c5 = new Customer(1, "John", "Ameerpet", "Madhapur", 9, "9876543210");
			service.addCustomer(c5);
			service.printBill(c5);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
