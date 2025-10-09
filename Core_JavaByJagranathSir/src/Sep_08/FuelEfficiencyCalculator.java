package Sep_08;
/*Question 1: Fuel Efficiency Calculator

Create a Car class (BLC Class)

Attributes:
fuelConsumed (in liters, private, double)
distanceTravelled (in kilometers, private, double)

Methods:
Setters:
public void setFuelConsumed(double fuelConsumed)
public void setDistanceTravelled(double distanceTravelled)

Getters:
public double getFuelConsumed()
public double getDistanceTravelled()

calculateMileage() Method:
Purpose: Calculate and return mileage (km per liter).
Formula: mileage = distanceTravelled / fuelConsumed
Return Type: double

calculateFuelEfficiency() Method:
Purpose: Calculate and return fuel efficiency in liters per 100km.
Formula: fuelEfficiency = (fuelConsumed / distanceTravelled) * 100
Return Type: double

Tester Class:
Test Case 1:
Input: fuelConsumed = 10, distanceTravelled = 150
Expected Output: Mileage = 15.0 km/l

Test Case 2:
Input: fuelConsumed = 10, distanceTravelled = 150
Expected Output: Fuel Efficiency = 6.67 L/100km*/

import java.util.Scanner;
public class FuelEfficiencyCalculator {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Car c1=new Car();
		System.out.println("Enter fuel consumed");
		double fuel=sc.nextDouble();
		c1.setFuelConsumed(fuel);
		System.out.println("Enter Distance Travelled");
		double dTravell;
		double dTravell1=sc.nextDouble();
		c1.setDistanceTravelled(dTravell1);
		System.out.println(c1.calculateMileage());
		System.out.println(c1.calculateFuelEfficiency()); 
		
	}
}
class Car{
	private double fuelConsumed;
	private double distanceTravelled;
	public void setFuelConsumed(double fuelConsumed) {
		this.fuelConsumed= fuelConsumed;

	}
	public double getFuelConsumed()
	{
		return fuelConsumed;
	}
	public double getDistanceTravelled()
	{
		return distanceTravelled;
	}
	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled=distanceTravelled;
	}
	public double calculateMileage() {
		double mileage = getDistanceTravelled() / getFuelConsumed();
		return mileage;
	}
	public double calculateFuelEfficiency() {
		double fuelEfficiency = (getFuelConsumed()/ getDistanceTravelled()) * 100;
		return fuelEfficiency;
	}
	
}































