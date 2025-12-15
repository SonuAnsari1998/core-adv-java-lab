package dec_15_2025_Lambda_Expression;
/*Assignment 02 :
--------------
Develop a scenario based program by using Functional interface to check whether a Car 
is eligible for sale or not.

Create one record called Car.
Components :
 brand : String
 price : Double
 mileage : Integer
 
 Take an ELC class CarSelling with main method. Using IO class data input, Create the 
 object for Car class.

 In the ELC class write a Predicate<T> to verify whether Car is eligible for sale or 
 not based on the following criteria.
  a) Car price should be less or equal to 5 lac.
  b) Car mileage must be greater or equal than 20.

Test Case 01 :
---------------
Enter the brand name of the Car :Naxon
Enter the price of the Car :450000
Enter the mileage of the Car :22
Naxon is eligible for sale

Test Case 02 :
---------------
Enter the brand name of the Car :BE6
Enter the price of the Car :1800000
Enter the mileage of the Car :25
BE6 is not eligible for sale

Test Case 03 :
--------------
Enter the brand name of the Car :Tata Punch
Enter the price of the Car :450000
Enter the mileage of the Car :18
Tata Punch is not eligible for sale*/
import java.util.function.Predicate;

public class CarSelling {
	void main() {
		String carName = IO.readln("Enter the brand name of the Car");
		double price = Double.parseDouble(IO.readln("Enter the price of the Car :"));
		int mileage1 = Integer.parseInt(IO.readln("Enter the mileage of the Car :"));
		Car car = new Car(carName, price, mileage1);
		Predicate<Car> carPrice = x -> car.price() <= 50000;
		Predicate<Car> mileage = y -> car.mileage() >= 20;
		if (car.price() <= 500000 && car.mileage() >= 20) {
			IO.println(carName+" is eligible for sale");
		} else {
			IO.println(carName+" is not eligible for sale");
		}
	}
}
