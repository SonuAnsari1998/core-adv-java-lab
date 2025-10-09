package Oct_09;
/*Assignment 02
-------------
Write a Program on OOPs to define Fan class properties and behavior.

properties/Field/Attribute :

name    : String
coil    : String
wings	: int

behavior:

switchOn()  : public void
switchOff() : public void   
------------------------------------------------------------------------*/
public class Fan_BLC {
	String name;
	String coil;
	int wings;
	public void switchOn() {
		System.out.println("--------Fan Switch On---------");
		System.out.println(name+" Having spin "+wings+" coil is "+coil);
	}
	public void switchOff() {
		System.out.println("--------Fan Switch Off---------");
		System.out.println(name+" Having spin "+wings+" coil is "+coil);
	}
}
