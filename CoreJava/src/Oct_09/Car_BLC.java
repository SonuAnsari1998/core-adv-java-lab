package Oct_09;
/*Assignment 03
--------------
Write a Program on OOPs to define Car class properties and behaviour.

properties/Field/Attribute :

name    : String
model   : int
color	: String


behaviour:

getCarInformation()  : public void
             drive() : public void */
public class Car_BLC {
	String name;
	int model;
	String color;
	public void getCarInformation() {
		System.out.println("---------Car Information ----------");
		System.out.println("Car Name : "+name);
		System.out.println("Car Model : "+model);
		System.out.println("Car Color : "+color);
	}
	public void drive() {
		System.out.println("Drive Information");
		System.out.println("Today "+name+" car driveing "+" Model Name is "+model+" "
				+ "and car color is "+color);
	}
}
