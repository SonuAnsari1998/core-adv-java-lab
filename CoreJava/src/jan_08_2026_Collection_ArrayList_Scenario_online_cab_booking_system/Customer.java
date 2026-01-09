package jan_08_2026_Collection_ArrayList_Scenario_online_cab_booking_system;

public record Customer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
		String phone) {
	public Customer {
		if (custId < 0) {
			throw new IllegalArgumentException(" Customer ID must be positive.");
		}
		if (customerName == null || customerName.isBlank()) {
			throw new IllegalArgumentException("Customer name cannot be null or blank.");

		}
		if (pickupLocation == null || pickupLocation.isBlank()) {
			throw new IllegalArgumentException("Pickup location cannot be null or blank.");

		}
		if (dropLocation == null || dropLocation.isBlank()) {
			throw new IllegalArgumentException("Drop location cannot be null or blank.");

		}
		if (distance < 0) {
			throw new IllegalArgumentException("Distance cannot be negative.");

		}
		if (phone == null || !phone.matches("\\d{10}")) {

			throw new IllegalArgumentException("Phone number must be 10 digits only.");
		}
	}
}
