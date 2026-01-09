package jan_08_2026_Collection_ArrayList_Scenario_online_cab_booking_system;

import module java.base;

public class CustomerService {
	ArrayList<Customer> customers;

	public CustomerService() {
		customers = new ArrayList<Customer>();
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	private boolean isFirstCustomer(Customer customer) {
		int count = 0;
		for (Customer c : customers) {
			if (c.phone().equals(customer.phone())) {
				count++;
			}
		}
		return count == 1;
	}

	public double calculateBill(Customer customer) {
		double bill = 0.0;
		if (isFirstCustomer(customer)) {
			bill = 0;
		}
		for (Customer c : customers) {
			if (c.distance() <= 4) {
				bill = 80;
			}
			if (c.distance() > 4) {
				bill = 80 + 2 * 6;
			}
		}
		return bill;
	}

	public void printBill(Customer customer) {
		double bill = calculateBill(customer);
		System.out.println(customer.customerName() + " Please pay your bill of Rs." + bill);
	}

}
