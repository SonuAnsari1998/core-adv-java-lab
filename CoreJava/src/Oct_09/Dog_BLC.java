package Oct_09;
/*Assignment 01
-------------
Write a Program on OOPs to define Dog class properties and behaviour.

properties/Field/Attribute :

name    : String
height  : double
age	: int

behaviour:

getDogInformation() : public void
             bark() : public void    
------------------------------------------------------------------------*/
public class Dog_BLC {
	String name;
	double height;
	int age;
	public void getDogInformation() {
		System.out.println("--------Dog Details------------------");
		System.out.println("Dog Name : "+name);
		System.out.println("Dog Height : "+height);
		System.out.println("Dog age : "+height);
	}
	public void bark() {
	System.out.println(name+" is barking having age is :"+age+" and height is :"+height);	
	}
}
