package oct_27_vehicle_VEHICLE_INSURANCE_SYSTEM;

/*QUESTION 2: VEHICLE INSURANCE SYSTEM
---------------------------------------------------
The insurance company needs to calculate the total insurance premium for different types of vehicles.

---------------------------------------------------
Class Details
---------------------------------------------------
Class Vehicle
Fields:
vehicleId : int
vehicleName : String
basePrice : double
insuranceRate : double

Method:
calculatePremium() -> basePrice * (insuranceRate / 100)

Class Car (extends Vehicle)
Fields:
noOfAirbags : int
safetyRating : double

Method:
calculatePremium() -> basePrice * (insuranceRate / 100) + (noOfAirbags * 500) + (safetyRating * 1000)

Class Bike (extends Vehicle)
Fields:
engineCapacity : int
hasABS : boolean

Method:
calculatePremium() -> basePrice * (insuranceRate / 100) + (engineCapacity * 0.2) + (hasABS ? 1000 : 0)

Class Truck (extends Vehicle)
Fields:
loadCapacity : double
driverExperience : int

Method:
calculatePremium() -> basePrice * (insuranceRate / 100) + (loadCapacity * 800) - (driverExperience * 100)

Class InsuranceUtil
Methods:
Overloaded calculateDiscount() for each type
Logic:
If premium > 50000 → discount = 10%
Else → discount = 5%

Class InsuranceCalculation (main)
Create and test all vehicle objects.

---------------------------------------------------
TEST CASES
---------------------------------------------------
| Type  | Input Parameters                                             | Expected Premium | Expected Discount |
|--------|--------------------------------------------------------------|------------------|-------------------|
| Vehicle | (1, "Generic", 500000, 3.0)                                | 15000.0          | 750.0             |
| Car     | (2, "Sedan", 800000, 4.0, 6, 4.5)                          | 38000.0          | 1900.0            |
| Bike    | (3, "Yamaha", 120000, 2.5, 200, true)                      | 7000.0           | 350.0             |
| Truck   | (4, "Volvo", 1000000, 5.0, 15*/
