package blankFinalField;

public class Car {
	private String name;
	private int model;
	private final Engine engine;
	public Car(String name, int model) {
		this.name = name;
		this.model = model;
		this.engine = new Engine("Petrol",2500);
	}
	@Override
	public String toString() {
		return "Car [" + (name != null ? "name=" + name + ", " : "") + "model=" + model + ", "
				+ (engine != null ? "engine=" + engine : "") + "]";
	}	
}
