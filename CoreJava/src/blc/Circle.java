package blc;

import java.text.DecimalFormat;

public class Circle {
	public static void getAreaOfCircle(double radius) {
		double area = Math.PI * radius*radius;
		
		DecimalFormat df=new DecimalFormat("00.00");
		String areaOfCircle = df.format(area);
		System.out.println("Area of circle is : "+areaOfCircle);
	}
}
