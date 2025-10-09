package com.crushoncode;

public class Packages {
	private double packageWeight; 
	private int shippingDistance;
	public double getPackageWeight() {
		return packageWeight;
	}
	public void setPackageWeight(double packageWeight) {
		this.packageWeight = packageWeight;
	}
	public int getShippingDistance() {
		return shippingDistance;
	}
	public void setShippingDistance(int shippingDistance) {
		this.shippingDistance = shippingDistance;
	} 
	
	   public void displayPackageDetails(){
	        System.out.println("Package Weight: "+packageWeight);
	        System.out.println("Shipping Distance: "+shippingDistance);
	    }
	
	   
	   
	
	

}
