package dec_14_2025_Interface_Polymorphism_Loose_Coupling_Practice_Only;
/*QUESTION 11: Multiple Interface + Polymorphism
----------------------------------------------
Scenario:
A smart home system controls different devices.

Task:
Create interface SmartDevice with methods:
turnOn(), turnOff()

Implement:
SmartLight
SmartFan

Create a static method controlDevice(SmartDevice device)

Input:
fan

Expected Output:
Smart Fan Turned ON
Smart Fan Turned OFF

------------------------------------------------*/
public interface SmartDevice {
	void turnOn();
	void turnOff();
}
