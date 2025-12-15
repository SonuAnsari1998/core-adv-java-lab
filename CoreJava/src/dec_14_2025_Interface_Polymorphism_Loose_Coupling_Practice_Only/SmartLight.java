package dec_14_2025_Interface_Polymorphism_Loose_Coupling_Practice_Only;

public class SmartLight implements SmartDevice{
	@Override
	public void turnOn() {
		IO.println("Smart Light Turned ON");
	}
	@Override
	public void turnOff() {
		IO.println("Smart Light Turned OFF");
	}
}
