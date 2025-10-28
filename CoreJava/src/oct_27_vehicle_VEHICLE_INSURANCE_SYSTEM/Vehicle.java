package oct_27_vehicle_VEHICLE_INSURANCE_SYSTEM;
/*Class Vehicle
Fields:
vehicleId : int
vehicleName : String
basePrice : double
insuranceRate : double

Method:
calculatePremium() -> basePrice * (insuranceRate / 100)*/
public class Vehicle {
	int vehicleId;
	String vehicleName;
	double basePrice;
	double insuranceRate;
	public Vehicle() {
		
	}
	public Vehicle(int vehicleId, String vehicleName, double basePrice, double insuranceRate) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.basePrice = basePrice;
		this.insuranceRate = insuranceRate;
	}
	public double calculatePremium() {
		return basePrice * (insuranceRate / 100);
	}
	
}
