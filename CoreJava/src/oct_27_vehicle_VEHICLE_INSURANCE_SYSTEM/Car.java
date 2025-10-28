package oct_27_vehicle_VEHICLE_INSURANCE_SYSTEM;
/*Class Car (extends Vehicle)
Fields:
noOfAirbags : int
safetyRating : double

Method:
calculatePremium() -> basePrice * (insuranceRate / 100) + (noOfAirbags * 500) + (safetyRating * 1000)*/
public class Car {
	int noOfAirbags;
	double safetyRating;
	public Car(int noOfAirbags, double safetyRating) {
		
		this.noOfAirbags = noOfAirbags;
		this.safetyRating = safetyRating;
	}
	public double calculatePremium() {
		
		return Vehicle.baseprice * (super.getInsuranceRate() / 100) + (noOfAirbags * 500) + (safetyRating * 1000);
	}
}
