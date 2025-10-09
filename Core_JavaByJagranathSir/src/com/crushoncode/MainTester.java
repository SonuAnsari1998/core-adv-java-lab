package com.crushoncode;

public class MainTester {

	public static void main(String[] args) {
		
		double weight=-5;
		int dist=50;
		
		Packages pck=new Packages();
		pck.setPackageWeight(weight);
		pck.setShippingDistance(dist);
		ShippingFee sfee=new ShippingFee();
		ShippingFee.calculateFee(pck);		
		System.out.println("Shipping Fee:"+sfee.getFeeAmount());
	}
}
