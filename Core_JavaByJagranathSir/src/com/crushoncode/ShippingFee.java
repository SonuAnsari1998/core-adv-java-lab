package com.crushoncode;

public class ShippingFee {
	private static double feeAmount;

	public double getFeeAmount() {
		return feeAmount;
	}
	
	public static void calculateFee(Packages pkg)
	{
		if(pkg.getPackageWeight()<=0)
		{
			System.err.println("Invalid Input!");
			System.exit(0);
		}
	
		if(pkg.getPackageWeight()<=5)
		{
			if(pkg.getShippingDistance()<=100)
			{
				feeAmount=5;
			}
			else {
				feeAmount=10;
			}
		}
		else if(pkg.getPackageWeight()>5 && pkg.getPackageWeight()<=20) {
			if(pkg.getShippingDistance()<=100)
			{
				feeAmount=10;
			}
			else {
				feeAmount=20;
			}
		}
		else {
			if(pkg.getShippingDistance()<=100)
			{
				feeAmount=20;
			}
			else {
				feeAmount=40;
			}
		}
	}
	
}
