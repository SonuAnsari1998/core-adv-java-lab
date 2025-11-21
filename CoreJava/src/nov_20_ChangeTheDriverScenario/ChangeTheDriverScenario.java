package nov_20_ChangeTheDriverScenario;

import java.util.Scanner;

public class ChangeTheDriverScenario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1 -> {
			String brand = sc.nextLine();
			String model = sc.nextLine();
			int year = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			sc.nextLine();
			String newDName = sc.nextLine();
			int newDAge = sc.nextInt();
			
			
			Car car1 = new Car(brand, model, year, name, age);
			Car car2 = new Car(car1);
			car1.changeDriver(new Driver(newDName, newDAge));
			System.out.println("After Driver Update :");
			System.out.println("Car 1: " + car1);
			System.out.println("Car 2: " + car2);
		}
		case 2 -> {

			String brand = sc.nextLine();
			String model = sc.nextLine();
			int year = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int age = sc.nextInt();
			Car car = new Car(brand, model, year, name, age);
			System.out.println("No Driver Change :");
			System.out.println("Car 1: " + car);
			System.out.println("Car 2: " + car);
		}
		default -> {
			System.out.println("Invalid Choice");
		}
		}
		;
	}
}

class Driver {
	private String name;
	private int age;

	Driver(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String toString() {
		return "Driver: " + this.name + " (" + this.age + ")";
	}
}

class Car {
	private String brand;
	private String model;
	private int year;
	private Driver driver;

	Car(String brand, String model, int year, String name, int age) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = new Driver(name, age);
	}

	Car(Car c) {
		this.brand = c.brand;
		this.model = c.model;
		this.year = c.year;
		this.driver = c.driver;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return this.model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	public void changeDriver(Driver newDriver) {
		driver = newDriver;
	}

	public String toString() {
		return "" + this.brand + " " + this.model + " (" + this.year + ")" + ", " + driver;
	}
}