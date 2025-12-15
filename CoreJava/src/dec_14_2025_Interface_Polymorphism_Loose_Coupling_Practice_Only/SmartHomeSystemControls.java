package dec_14_2025_Interface_Polymorphism_Loose_Coupling_Practice_Only;

public class SmartHomeSystemControls {
	SmartDevice smartDevice = null;

	void main() {
		controlDevice(smartDevice);
	}

	public static void controlDevice(SmartDevice device) {
		String smartDeviceInput = IO.readln("Enter a Smart Devicce (Fan/Light)");
		if (smartDeviceInput.equalsIgnoreCase("fan")) {
			device = new SmartFan();
			device.turnOn();
			device.turnOff();
		} else if (smartDeviceInput.equalsIgnoreCase("Light")) {
			device = new SmartLight();
			device.turnOn();
			device.turnOff();
		} else {
			System.err.println("Wrong Input");
		}
	}
}
